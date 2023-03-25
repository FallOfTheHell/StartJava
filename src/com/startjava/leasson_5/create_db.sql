DROP DATABASE Jaegers;

\! chcp 1251
set client_encoding='WIN866';
set client_encoding='win1251';

CREATE DATABASE Jaegers;

\c jaegers;

create table Jaegers (
    id SERIAL NOT NULL PRIMARY KEY,
    modelName VARCHAR(100),
    mark VARCHAR(100),
    height FLOAT,
    weight FLOAT,
    status VARCHAR(100),
    origin VARCHAR(100),
    launch VARCHAR(100),
    kaijuKill INTEGER
);

\ir init_db.sql
\ir queries.sql