
-- Inserts for Tabela: clientes
INSERT INTO clientes (id, nome, cpf, telefone, endereco) VALUES
(1,'João Silva','11111111111','11999990001','Rua A, 100'),
(2,'Maria Oliveira','22222222222','11999990002','Rua B, 200'),
(3,'Carlos Pereira','33333333333','11999990003','Rua C, 300'),
(4,'Ana Souza','44444444444','11999990004','Rua D, 400'),
(5,'Paulo Lima','55555555555','11999990005','Rua E, 500'),
(6,'Beatriz Santos','66666666666','11999990006','Rua F, 600'),
(7,'Ricardo Alves','77777777777','11999990007','Rua G, 700'),
(8,'Fernanda Costa','88888888888','11999990008','Rua H, 800'),
(9,'Rodrigo Nunes','99999999999','11999990009','Rua I, 900'),
(10,'Juliana Martins','10101010101','11999990010','Rua J, 1000');

-- Inserts for Tabela: produtos
INSERT INTO produtos (id, nome, descricao, preco, unidade) VALUES
(1,'Teclado','Teclado mecânico',150,'UN'),
(2,'Mouse','Mouse óptico',80,'UN'),
(3,'Monitor','Monitor 24"',900,'UN'),
(4,'Cadeira Gamer','Cadeira ergonômica',1200,'UN'),
(5,'Gabinete','Gabinete de aço',300,'UN'),
(6,'Fonte 500W','Fonte certificada',250,'UN'),
(7,'CPU Ryzen 5','Processador 3.6Ghz',1100,'UN'),
(8,'SSD 480GB','SSD SATA',200,'UN'),
(9,'HD 1TB','HD SATA',250,'UN'),
(10,'Headset','Headset com microfone',180,'UN');

-- Inserts for Tabela: estoque
INSERT INTO estoque (id, produto_id, quantidade, localizacao) VALUES
(1,1,50,'A1'),
(2,2,80,'A2'),
(3,3,30,'B1'),
(4,4,20,'B2'),
(5,5,40,'C1'),
(6,6,35,'C2'),
(7,7,25,'D1'),
(8,8,60,'D2'),
(9,9,45,'E1'),
(10,10,55,'E2');

-- Inserts for Tabela: entradas
INSERT INTO entradas (id, fornecedor, data_entrada, numero_documento) VALUES
(1,'Fornecedor A','2025-01-01','NF001'),
(2,'Fornecedor B','2025-01-02','NF002'),
(3,'Fornecedor C','2025-01-03','NF003'),
(4,'Fornecedor D','2025-01-04','NF004'),
(5,'Fornecedor E','2025-01-05','NF005'),
(6,'Fornecedor F','2025-01-06','NF006'),
(7,'Fornecedor G','2025-01-07','NF007'),
(8,'Fornecedor H','2025-01-08','NF008'),
(9,'Fornecedor I','2025-01-09','NF009'),
(10,'Fornecedor J','2025-01-10','NF010');

-- Inserts for Tabela: saidas
INSERT INTO saidas (id, cliente_id, data_saida, numero_documento) VALUES
(1,1,'2025-02-01','SC001'),
(2,2,'2025-02-02','SC002'),
(3,3,'2025-02-03','SC003'),
(4,4,'2025-02-04','SC004'),
(5,5,'2025-02-05','SC005'),
(6,6,'2025-02-06','SC006'),
(7,7,'2025-02-07','SC007'),
(8,8,'2025-02-08','SC008'),
(9,9,'2025-02-09','SC009'),
(10,10,'2025-02-10','SC010');

-- Inserts for Tabela: entrada_itens
INSERT INTO entrada_itens (id, entrada_id, produto_id, quantidade, valor_unitario) VALUES
(1,1,1,10,140),
(2,2,2,20,70),
(3,3,3,15,850),
(4,4,4,8,1100),
(5,5,5,12,280),
(6,6,6,10,230),
(7,7,7,7,1000),
(8,8,8,20,180),
(9,9,9,18,230),
(10,10,10,14,160);

-- Inserts for Tabela: saida_itens
INSERT INTO saida_itens (id, saida_id, produto_id, quantidade, valor_unitario) VALUES
(1,1,1,2,150),
(2,2,2,3,80),
(3,3,3,1,900),
(4,4,4,1,1200),
(5,5,5,2,300),
(6,6,6,1,250),
(7,7,7,1,1100),
(8,8,8,4,200),
(9,9,9,3,250),
(10,10,10,2,180);
