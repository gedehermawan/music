CREATE TABLE city (
    city_id bigint NOT NULL,
    city_name varchar(100) NOT NULL,
    province_id bigint NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,

    PRIMARY KEY (city_id),
    FOREIGN KEY (province_id) REFERENCES province(province_id)
);