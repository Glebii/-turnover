CREATE TABLE supply_item
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    supply_id  BIGINT,
    product_id UUID,
    quantity   INTEGER                                 NOT NULL,
    CONSTRAINT pk_supplyitem PRIMARY KEY (id)
);

ALTER TABLE supply_item
    ADD CONSTRAINT FK_SUPPLYITEM_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);

ALTER TABLE supply_item
    ADD CONSTRAINT FK_SUPPLYITEM_ON_SUPPLY FOREIGN KEY (supply_id) REFERENCES supply (id);