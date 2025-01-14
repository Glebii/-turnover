CREATE TABLE wish_list_item
(
    id           BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    product_id   UUID,
    wish_list_id BIGINT,
    quantity     INTEGER,
    CONSTRAINT pk_wishlistitem PRIMARY KEY (id)
);

ALTER TABLE wish_list_item
    ADD CONSTRAINT FK_WISHLISTITEM_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);

ALTER TABLE wish_list_item
    ADD CONSTRAINT FK_WISHLISTITEM_ON_WISHLIST FOREIGN KEY (wish_list_id) REFERENCES wish_list (id);