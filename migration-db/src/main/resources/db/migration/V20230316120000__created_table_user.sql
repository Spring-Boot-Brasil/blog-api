create table "user"
(
    id         UUID         NOT NULL,
    username   varchar(50)  not null unique,
    image      text,
    name       varchar(45)  not null,
    email      varchar(100) not null unique,
    password   varchar(250) not null,
    profile    varchar(45)  not null,
    created_at timestamp,
    updated_at timestamp,
    PRIMARY KEY (id)
);


comment on column "user".profile is 'ADMINISTRADOR
EDITOR
COMUM';
