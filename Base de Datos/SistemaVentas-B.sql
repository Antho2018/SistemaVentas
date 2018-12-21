use master
drop database BodegaMadyson

create database BodegaMadyson

use BodegaMadyson

create table Cliente(
COD_CLIE int identity primary key not null,
NOMBRE varchar(100) not null,
DNI varchar(8),
CORREO varchar(60),
RUC_C varchar(11),
SEXO char(1),
ESTADO char(1),
)
select * from Empleado
drop table Empleado

create table Empleado(
COD_EMPL int identity primary key not null,
NOMBRE varchar(100) not null,
CARGO varchar(20) not null,
FECHA_INGRESO date not null,
DNI varchar(8),
USUARIO varchar(30),
CONTRASENIA varchar(30),
SEXO varchar(10)
)

create table Proveedor(
COD_PROV int identity primary key not null,
RUC_P varchar(11) not null,
NOMBRE varchar(50) not null,
TELEFONO int,
DIRECCION varchar(100),
ESTADO char(1),

)

create table Categoria(
COD_CATE int identity primary key not null,
NOMBRE varchar(30),
DESCRIPCION varchar(50),
)

create table Producto(
COD_PROD int identity primary key not null,
NOMBRE varchar(50),
PRECIO_V float,
STOCK int,
FECH_VENC date,
TOTAL_KG float,
ESTADO char(1),
COD_CATE1 int,
constraint fk_cca1 foreign key (COD_CATE1) references categoria (COD_CATE)
)
create table Venta(
COD_VENT int identity primary key not null,
FECH_EMIS date,
TOTAL float,
COD_EMPL1 int,
COD_CLIE1 int,

constraint fk_cc1 foreign key (COD_CLIE1) references cliente (COD_CLIE),
constraint fk_ce foreign key (COD_EMPL1) references empleado (COD_EMPL)
)

create table Detalle_Venta(
COD_VENT1 int,
COD_PROD1 int,
CANTIDAD int,
IMPORTE float,
constraint fk_cv1 foreign key (COD_VENT1) references venta (COD_VENT),
constraint fk_cp1 foreign key (COD_PROD1) references producto (COD_PROD)
)

create table Compra(
COD_COMP int identity primary key not null,
COD_PROD2 int,
COD_PROV1 int,
FECH_COM date,
PRECIO_COM float,
CANTIDAD int,
TOTAL float,

constraint fk_cp2 foreign key (COD_PROD2) references producto (COD_PROD),
constraint fk_ruc1 foreign key (COD_PROV1) references proveedor (COD_PROV)
)

select * from Categoria
select * from Cliente
select * from Compra
select * from Detalle_Venta
select * from Empleado
select * from Producto
select * from Proveedor
select * from Venta