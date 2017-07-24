CREATE TABLE province (
    province_id bigint NOT NULL,
    province_name varchar(100) NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,

    PRIMARY KEY (province_id)
);