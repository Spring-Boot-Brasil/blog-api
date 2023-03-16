CREATE TABLE post_likes
(
    id      uuid NOT NULL,
    user_id uuid NOT NULL,
    post_id uuid NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE post_likes
    ADD CONSTRAINT fk_like_user FOREIGN KEY (user_id) REFERENCES "user";

ALTER TABLE post_likes
    ADD CONSTRAINT fk_like_post FOREIGN KEY (post_id) REFERENCES "post";
