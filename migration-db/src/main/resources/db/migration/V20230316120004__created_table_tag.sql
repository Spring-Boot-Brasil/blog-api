CREATE TABLE tag
(
    id         uuid        NOT NULL,
    title      VARCHAR(45) NOT NULL,
    created_at timestamp,
    updated_at timestamp,
    PRIMARY KEY (id)
);