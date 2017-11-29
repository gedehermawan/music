CREATE SEQUENCE event_organizer_id_seq START 1;
CREATE TABLE event_organizer (
    event_organizer_id BIGSERIAL NOT NULL,
    name varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    phone varchar(100) NOT NULL,
    deleted character(1) NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,
    create_by bigint,
    update_by bigint,

    PRIMARY KEY (event_organizer_id),
    UNIQUE(email)
);

INSERT INTO event_organizer (event_organizer_id,name,password,email,phone,deleted,create_at,update_at)
VALUES (1,'Gede Organizer','$2a$10$X2iPidMFZT5r3hDSQUz39OsZih.UPsMCr4O0F5WtEYnW0Ukigo.gS','gedehermawan2606@gmail.com','0212222222','0','2017-11-29 15:13:23.544+00','2017-11-29 15:13:23.544+00');

alter sequence event_organizer_id_seq restart with 2;