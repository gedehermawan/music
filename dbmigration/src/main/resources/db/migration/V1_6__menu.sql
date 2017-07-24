CREATE TABLE menu (
    menu_id bigint NOT NULL,
    menu_name varchar(150) NOT NULL,
    description varchar(255),
    restaurant_id bigint NOT NULL,
    price numeric(16,2) NOT NULL,
    deleted character(1) NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,
    create_by bigint NOT NULL,
    update_by bigint NOT NULL,

    PRIMARY KEY (menu_id),
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(restaurant_id),
    FOREIGN KEY (create_by) REFERENCES account(account_id),
    FOREIGN KEY (update_by) REFERENCES account(account_id)
);