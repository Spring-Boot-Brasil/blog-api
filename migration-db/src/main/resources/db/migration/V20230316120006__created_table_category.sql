CREATE TABLE category
(
    id          uuid        NOT NULL,
    category_id uuid        NULL,
    title       VARCHAR(45) NULL,
    created_at  timestamp,
    updated_at  timestamp,
    PRIMARY KEY (id)
);

ALTER TABLE category
    ADD CONSTRAINT fk_category_category FOREIGN KEY (category_id) REFERENCES "category";