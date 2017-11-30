CREATE SEQUENCE account_id_seq START 1;
CREATE TABLE account (
    account_id BIGSERIAL NOT NULL,
    password varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    role varchar(50) NOT NULL,
    object_id bigint,
    deleted character(1) NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,

    PRIMARY KEY (account_id),
    UNIQUE(email)
);

INSERT INTO account (account_id,password,email,role,object_id,deleted,create_at,update_at)
VALUES (1,'$2a$10$X2iPidMFZT5r3hDSQUz39OsZih.UPsMCr4O0F5WtEYnW0Ukigo.gS','gedehermawan2606@gmail.com','EVENT_ORGANIZER',1,'0','2017-11-29 15:13:23.544+00','2017-11-29 15:13:23.544+00');

alter sequence account_id_seq restart with 2;