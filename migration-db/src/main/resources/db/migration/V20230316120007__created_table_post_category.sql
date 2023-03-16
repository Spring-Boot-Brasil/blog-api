CREATE TABLE post_category
(
    post_id     uuid NOT NULL,
    category_id uuid NOT NULL,
    PRIMARY KEY (post_id, category_id)
);


ALTER TABLE post_category
    ADD CONSTRAINT fk_post_category_post FOREIGN KEY (post_id) REFERENCES "post";

ALTER TABLE post_category
    ADD CONSTRAINT fk_post_category_category FOREIGN KEY (category_id) REFERENCES "category";