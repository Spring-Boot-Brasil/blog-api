CREATE TABLE post_comment
(
    id         UUID  NOT NULL,
    post_id    UUID  NOT NULL,
    user_id    UUID  NOT NULL,
    content    VARCHAR(300) NOT NULL,
    created_at timestamp,
    updated_at timestamp,
    PRIMARY KEY (id)
);

ALTER TABLE post_comment
    ADD CONSTRAINT fk_post_post_comment FOREIGN KEY (post_id) REFERENCES "post";

ALTER TABLE post_comment
    ADD CONSTRAINT fk_post_user FOREIGN KEY (user_id) REFERENCES "user";
