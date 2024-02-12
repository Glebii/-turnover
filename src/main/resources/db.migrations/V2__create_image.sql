CREATE TABLE image
(
    id    BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name  VARCHAR(255),
    type  VARCHAR(255),
    image BYTEA,
    CONSTRAINT pk_image PRIMARY KEY (id)
);