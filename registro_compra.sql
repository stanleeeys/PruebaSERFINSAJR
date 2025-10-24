
-- MYSQL

create database registro_compra;
use registro_compra;

create table comercio(
id bigint auto_increment primary key,
nombre varchar(255),
direccion varchar(255),
telefono bigint,
rubro varchar(255),
fecha_registro datetime
);
create table compradores(
id bigint auto_increment primary key,
nombre varchar(255),
DUI varchar(255),
email varchar(255),
telefono bigint,
direccion varchar(255),
fecha_registro datetime
);
create table medio_pago(
id bigint auto_increment primary key,
descripcion varchar(255)
);
create table compras(
id bigint auto_increment primary key,
    id_comercio bigint not null,
    id_comprador bigint not null,
    id_medio_pago bigint not null,
    descripcion varchar(255),
    monto_total decimal(10,2) not null,
    fecha_compra datetime,

    constraint fk_compras_comercio foreign key (id_comercio) references comercio(id),
    constraint fk_compras_compradores foreign key (id_comprador) references compradores(id),
    constraint fk_compras_medio_pago foreign key (id_medio_pago) references medio_pago(id)
);
