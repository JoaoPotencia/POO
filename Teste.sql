CREATE DATABASE lojaIFPR;

use lojaIFPR;

create table Fornecedor(
codFornec int auto_increment primary key,
nome varchar(50) not null,
endereco varchar(100) not null
);

create table Produto(
codPdto int auto_increment primary key,
codFornec int,
descricao varchar(80) unique not null,
preco float not null,
foreign key (codFornec) references Fornecedor(codFornec)
);

create table Cliente(
codCli int auto_increment primary key,
nome varchar(50) not null,
fone varchar(10)
);

create table Fisica(
codCli int,
cpf varchar(11) unique not null,
foreign key (codCli) references Cliente(codCli)
);

create table Juridica(
codCli int,
cnpj varchar(14) unique not null,
foreign key (codCli) references Cliente(codCli)
);

create table Compra(
codPdto int,
codCli int,
qtd int not null,
dataCompra date not null,
foreign key (codPdto) references Produto(codPdto),
foreign key (codCli) references Cliente(codCli)
);

insert into Cliente (nome, fone) values ('João Vitor Santos Raimondi', '9829559812');

select * from Cliente;

update Cliente set fone = '9234-2312' where codCli = 1;



