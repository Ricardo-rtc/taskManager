CREATE TABLE usuario (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL
);

CREATE TABLE projeto (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    descricao TEXT
);

CREATE TABLE categoria (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TYPE prioridade_enum AS ENUM ('BAIXA', 'MEDIA', 'ALTA', 'URGENTE');
CREATE TYPE status_enum AS ENUM ('PENDENTE', 'EM_ANDAMENTO', 'CONCLUIDA');

CREATE TABLE tarefa (
    id BIGSERIAL PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    descricao TEXT,
    projeto_id BIGINT REFERENCES projeto(id) ON DELETE CASCADE,
    responsavel_id BIGINT REFERENCES usuario(id) ON DELETE SET NULL,
    categoria_id BIGINT REFERENCES categoria(id) ON DELETE SET NULL,
    prioridade prioridade_enum NOT NULL DEFAULT 'MEDIA',
    status status_enum NOT NULL DEFAULT 'PENDENTE',
    criacao DATE NOT NULL DEFAULT CURRENT_DATE,
    prazo DATE
);

CREATE INDEX idx_tarefa_projeto ON tarefa (projeto_id);
CREATE INDEX idx_tarefa_responsavel ON tarefa (responsavel_id);
CREATE INDEX idx_tarefa_categoria ON tarefa (categoria_id);
CREATE INDEX idx_tarefa_status ON tarefa (status);
CREATE INDEX idx_tarefa_prioridade ON tarefa (prioridade);


INSERT INTO usuario (nome, email) VALUES
('Alice', 'alice@email.com'),
('Bob', 'bob@email.com');

INSERT INTO projeto (nome, descricao) VALUES
('Projeto A', 'Descrição do Projeto A'),
('Projeto B', 'Descrição do Projeto B');

INSERT INTO categoria (nome) VALUES
('Desenvolvimento'),
('Teste'),
('Documentação');

INSERT INTO tarefa (
    titulo, descricao, criacao, prazo, prioridade, status, categoria_id, projeto_id, responsavel_id
) VALUES
(
    'Tarefa 1', 'Descrição Tarefa 1', CURRENT_DATE, CURRENT_DATE + INTERVAL '7 days',
    'ALTA', 'PENDENTE', 1, 1, 1
),
(
    'Tarefa 2', 'Descrição Tarefa 2', CURRENT_DATE, CURRENT_DATE + INTERVAL '10 days',
    'MEDIA', 'EM_ANDAMENTO', 2, 1, 2
);

