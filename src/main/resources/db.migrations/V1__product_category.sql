CREATE TABLE product_category
(
    id                 BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    created_by         VARCHAR(255),
    created_date       TIMESTAMP WITHOUT TIME ZONE,
    last_modified_by   VARCHAR(255),
    last_modified_date TIMESTAMP WITHOUT TIME ZONE,
    deleted_date       TIMESTAMP WITHOUT TIME ZONE,
    deleted_by         VARCHAR(255),
    deleted            BOOLEAN                                 NOT NULL,
    name               VARCHAR(255),
    parent_id          BIGINT,
    CONSTRAINT pk_productcategory PRIMARY KEY (id)
);

ALTER TABLE product_category
    ADD CONSTRAINT FK_PRODUCTCATEGORY_ON_PARENT FOREIGN KEY (parent_id) REFERENCES product_category (id);