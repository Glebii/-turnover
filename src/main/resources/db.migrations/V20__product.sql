CREATE TABLE product
(
    id                   UUID    NOT NULL,
    created_by           VARCHAR(255),
    created_date         TIMESTAMP WITHOUT TIME ZONE,
    last_modified_by     VARCHAR(255),
    last_modified_date   TIMESTAMP WITHOUT TIME ZONE,
    deleted_date         TIMESTAMP WITHOUT TIME ZONE,
    deleted_by           VARCHAR(255),
    deleted              BOOLEAN NOT NULL,
    name                 VARCHAR(255),
    code                 VARCHAR(255),
    price                DECIMAL,
    description          VARCHAR(255),
    status_id            BIGINT,
    image_id             BIGINT,
    brand_id             BIGINT,
    producing_country_id BIGINT,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

CREATE TABLE product_category_mapping
(
    category_id BIGINT NOT NULL,
    product_id  UUID   NOT NULL
);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_BRAND FOREIGN KEY (brand_id) REFERENCES brand (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_IMAGE FOREIGN KEY (image_id) REFERENCES image (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_PRODUCINGCOUNTRY FOREIGN KEY (producing_country_id) REFERENCES producing_country (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_STATUS FOREIGN KEY (status_id) REFERENCES status (id);

ALTER TABLE product_category_mapping
    ADD CONSTRAINT fk_procatmap_on_product FOREIGN KEY (product_id) REFERENCES product (id);

ALTER TABLE product_category_mapping
    ADD CONSTRAINT fk_procatmap_on_product_category FOREIGN KEY (category_id) REFERENCES product_category (id);


CREATE TABLE product_photo_path
(
    id          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    product_id  UUID,
    photo_paths VARCHAR(255),
    CONSTRAINT pk_productphotopath PRIMARY KEY (id)
);

ALTER TABLE product_photo_path
    ADD CONSTRAINT FK_PRODUCTPHOTOPATH_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);
