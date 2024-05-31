CREATE TABLE field
(
    id                   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name                 VARCHAR(255),
    length               VARCHAR(255),
    fire_resistant       BOOLEAN,
    width                VARCHAR(255),
    thickness            VARCHAR(255),
    manufacturer_article VARCHAR(255),
    code                 INTEGER,
    vid_kromki           VARCHAR(255),
    object_primeneniya   VARCHAR(255),
    type_primeneniya     VARCHAR(255),
    category_id          BIGINT,
    CONSTRAINT pk_field PRIMARY KEY (id)
);

ALTER TABLE field
    ADD CONSTRAINT FK_FIELD_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES product_category (id);


CREATE TABLE product_field
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    product_id UUID,
    field_id   BIGINT,
    value      VARCHAR(255),
    CONSTRAINT pk_productfield PRIMARY KEY (id)
);

ALTER TABLE product_field
    ADD CONSTRAINT FK_PRODUCTFIELD_ON_FIELD FOREIGN KEY (field_id) REFERENCES field (id);

ALTER TABLE product_field
    ADD CONSTRAINT FK_PRODUCTFIELD_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);