create table "post"
(
    id         UUID         NOT NULL,
    author_id  UUID,
    reviewer_id  UUID,
    short_url varchar(100) not null,
    title VARCHAR(100) NOT NULL,
    subtitle VARCHAR(100) NOT NULL,
    content text NOT NULL,
    banner_img VARCHAR(50) NOT NULL,
    reviewed boolean NOT NULL default false,
    views BIGINT NOT NULL DEFAULT 0,
    created_at timestamp,
    updated_at timestamp,
    PRIMARY KEY (id)
);

ALTER TABLE post
    ADD CONSTRAINT fk_post_user_author_id FOREIGN KEY (author_id) REFERENCES "user";

ALTER TABLE post
    ADD CONSTRAINT fk_post_user_reviewer_id FOREIGN KEY (reviewer_id) REFERENCES "user";