CREATE SEQUENCE talent_id_seq START 1;
CREATE TABLE talent (
    talent_id BIGSERIAL NOT NULL,
    name varchar(100) NOT NULL,
    price1 numeric(16,2),
    price2 numeric(16,2),
    location varchar(255),
    phone varchar(100) NOT NULL,
    video_link varchar(100),
    genre varchar(100),
    deleted character(1) NOT NULL,


    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,

    PRIMARY KEY (talent_id)
);