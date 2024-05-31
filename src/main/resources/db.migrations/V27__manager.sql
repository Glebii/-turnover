CREATE TABLE manager
(
    id           BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name         VARCHAR(255),
    surname      VARCHAR(255),
    patronymic   VARCHAR(255),
    phone_number VARCHAR(255),
    CONSTRAINT pk_manager PRIMARY KEY (id)
);