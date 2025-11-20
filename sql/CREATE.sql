
CREATE TABLE Pessoas (
  ups_codigo INT IDENTITY(1,1) PRIMARY KEY,
  ups_nome NVARCHAR(150) NOT NULL,
  ups_cpf CHAR(11) NULL,
  ups_telefone NVARCHAR(20) NULL,
  ups_cliente BIT DEFAULT 0,
  ups_fornecedor BIT DEFAULT 0
);

CREATE TABLE Usuarios (
  usu_codigo INT IDENTITY(1,1) PRIMARY KEY,
  usu_login NVARCHAR(50) UNIQUE NOT NULL,
  usu_senha NVARCHAR(255) NOT NULL,
  usu_nome NVARCHAR(150)
);

CREATE TABLE Produto (
  upr_codigo INT IDENTITY(1,1) PRIMARY KEY,
  upr_nome NVARCHAR(150) NOT NULL,
  upr_complemento NVARCHAR(255),
  upr_und NVARCHAR(20) NOT NULL,
  upr_preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE Documento (
  docto_codigo INT IDENTITY(1,1) PRIMARY KEY,
  docto_tipo NVARCHAR(20) NOT NULL,
  docto_data DATETIME NOT NULL DEFAULT GETDATE(),
  docto_valor DECIMAL(10,2) NULL,
  docto_ups_codigo INT NOT NULL,
  docto_usu_codigo INT NOT NULL,
  CONSTRAINT FK_Documento_Pessoa FOREIGN KEY (docto_ups_codigo) REFERENCES Pessoas(ups_codigo),
  CONSTRAINT FK_Documento_Usuario FOREIGN KEY (docto_usu_codigo) REFERENCES Usuarios(usu_codigo)
);

CREATE TABLE ItensDocumento (
  itemdocto_codigo INT IDENTITY(1,1) PRIMARY KEY,
  itemdocto_docto_codigo INT NOT NULL,
  itemdocto_upr_codigo INT NOT NULL,
  itemdocto_qtd DECIMAL(10,2) NOT NULL,
  itemdocto_valor DECIMAL(10,2) NOT NULL,
  CONSTRAINT FK_ItensDocumento_Documento FOREIGN KEY (itemdocto_docto_codigo) REFERENCES Documento(docto_codigo),
  CONSTRAINT FK_ItensDocumento_Produto FOREIGN KEY (itemdocto_upr_codigo) REFERENCES Produto(upr_codigo)
);

CREATE TABLE Estoque (
  est_upr_codigo INT PRIMARY KEY,
  est_qtd DECIMAL(10,2) NOT NULL DEFAULT 0,
  est_valor DECIMAL(10,2) DEFAULT 0,
  CONSTRAINT FK_Estoque_Produto FOREIGN KEY (est_upr_codigo) REFERENCES Produto(upr_codigo)
);
