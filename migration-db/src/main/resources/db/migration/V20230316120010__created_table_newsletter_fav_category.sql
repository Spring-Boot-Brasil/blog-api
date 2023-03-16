CREATE TABLE IF NOT EXISTS newsletter_fav_category
(
    id            uuid NOT NULL,
    newsletter_id uuid NOT NULL,
    category_id   uuid NOT NULL,
    created_at    timestamp,
    updated_at    timestamp,
    PRIMARY KEY (id)
);

ALTER TABLE newsletter_fav_category
    ADD CONSTRAINT fk_newsletter_fav_category_newsletter FOREIGN KEY (newsletter_id) REFERENCES "newsletter";

ALTER TABLE newsletter_fav_category
    ADD CONSTRAINT fk_newsletter_fav_category_category FOREIGN KEY (category_id) REFERENCES "category";