CREATE TABLE newsletter
(
    id         uuid         NOT NULL,
    user_id    uuid         NULL,
    email      VARCHAR(100) NOT NULL,
    active     boolean      NOT NULL DEFAULT true,
    created_at timestamp,
    updated_at timestamp,
    PRIMARY KEY (id)
);

ALTER TABLE newsletter
    ADD CONSTRAINT fk_newsletter_user FOREIGN KEY (user_id) REFERENCES "user";
