CREATE TABLE post_tag
(
    tag_id  uuid NOT NULL,
    post_id uuid NOT NULL,
    PRIMARY KEY (tag_id, post_id)
);

ALTER TABLE post_tag
    ADD CONSTRAINT fk_tag_post_tag FOREIGN KEY (tag_id) REFERENCES "tag";

ALTER TABLE post_tag
    ADD CONSTRAINT fk_post_post_tag FOREIGN KEY (post_id) REFERENCES "post";