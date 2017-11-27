CREATE SEQUENCE account_id_seq START 1;
CREATE TABLE account (
    account_id BIGSERIAL NOT NULL,
    email varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    deleted character(1) NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,
    create_by bigint,
    update_by bigint,

    PRIMARY KEY (account_id),
    UNIQUE(email)
);