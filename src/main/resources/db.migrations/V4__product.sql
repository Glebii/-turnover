CREATE TABLE product
(
    id                  BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    created_by          VARCHAR(255),
    created_date        TIMESTAMP WITHOUT TIME ZONE,
    last_modified_by    VARCHAR(255),
    last_modified_date  TIMESTAMP WITHOUT TIME ZONE,
    deleted_date        TIMESTAMP WITHOUT TIME ZONE,
    deleted_by          VARCHAR(255),
    deleted             BOOLEAN                                 NOT NULL,
    name                VARCHAR(255),
    price               DOUBLE PRECISION,
    description         VARCHAR(255),
    status_id           BIGINT,
    product_category_id BIGINT,
    image_id            BIGINT,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_IMAGE FOREIGN KEY (image_id) REFERENCES image (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_PRODUCT_CATEGORY FOREIGN KEY (product_category_id) REFERENCES product_category (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_STATUS FOREIGN KEY (status_id) REFERENCES status (id);