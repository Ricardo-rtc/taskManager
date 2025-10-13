INSERT INTO USUARIO (NOME, EMAIL) VALUES
('Alice', 'alice@email.com'),
('Bob', 'bob@email.com');

INSERT INTO PROJETO (NOME, DESCRICAO) VALUES
('Projeto A', 'Descrição do Projeto A'),
('Projeto B', 'Descrição do Projeto B');

INSERT INTO CATEGORIA (NOME) VALUES
('Desenvolvimento'),
('Teste'),
('Documentação');

INSERT INTO TAREFA (
    TITULO, DESCRICAO, CRIACAO, PRAZO, PRIORIDADE, STATUS, ID_CATEGORIA, ID_PROJETO, ID_RESPONSAVEL
) VALUES
(
    'Tarefa 1', 'Descrição Tarefa 1', CURRENT_DATE, DATEADD('DAY', 7, CURRENT_DATE),
    'ALTA', 'PENDENTE', 1, 1, 1
),
(
    'Tarefa 2', 'Descrição Tarefa 2', CURRENT_DATE, DATEADD('DAY', 10, CURRENT_DATE),
    'MEDIA', 'EM_ANDAMENTO', 2, 1, 2
);


