CREATE TABLE filial_item
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    filial_id  BIGINT,
    product_id UUID,
    quantity   INTEGER                                 NOT NULL,
    CONSTRAINT pk_filialitem PRIMARY KEY (id)
);

ALTER TABLE filial_item
    ADD CONSTRAINT FK_FILIALITEM_ON_FILIAL FOREIGN KEY (filial_id) REFERENCES filial (id);

ALTER TABLE filial_item
    ADD CONSTRAINT FK_FILIALITEM_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);