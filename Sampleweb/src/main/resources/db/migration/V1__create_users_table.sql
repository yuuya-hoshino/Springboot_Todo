CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    user_id INT NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    family_name VARCHAR(16) NOT NULL,
    first_name VARCHAR(16) NOT NULL,
    katakana_family_name VARCHAR(16) NOT NULL,
    katakana_first_name VARCHAR(16) NOT NULL,
    joined_date DATE NOT NULL
);