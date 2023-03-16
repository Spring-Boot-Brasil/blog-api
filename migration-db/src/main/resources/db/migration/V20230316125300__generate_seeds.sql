insert into "user"
values ('c467fff0-db0d-4d92-85b3-a9524dddbe52',
        'daniel101',
        '',
        'Marcelo Daniel',
        'marcelo@gmail.com',
        '$2a$12$2rrlOTRQI58CobFd/VPjQ.iDZPAAegHKqflS/m3hRWyqYBlsmUevy',
        'ADMINISTRADOR',
        now(),
        now());

insert into category
values ('4e351b7c-54bb-40a6-aa7e-c3c25eb9be3a', null, 'JPA', now(), now()),
       ('4de3725b-1dc9-430d-af35-f357e558f10c', null, 'Security', now(), now());

insert into post
values ('810533e2-4188-464e-8b5d-49a46b44a258', 'c467fff0-db0d-4d92-85b3-a9524dddbe52', null, 'access-data-jpa-1',
        'Access Data with JPA',
        'access data with JPA', 'text here', '', false, 0, now(), now());

insert into post_category
values ('810533e2-4188-464e-8b5d-49a46b44a258', '4e351b7c-54bb-40a6-aa7e-c3c25eb9be3a');