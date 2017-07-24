CREATE TABLE district (
    district_id bigint NOT NULL,
    district_name varchar(100) NOT NULL,
    province_id bigint NOT NULL,
    city_id bigint NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,

    PRIMARY KEY (district_id),
    FOREIGN KEY (province_id) REFERENCES province(province_id),
    FOREIGN KEY (city_id) REFERENCES city(city_id)
);