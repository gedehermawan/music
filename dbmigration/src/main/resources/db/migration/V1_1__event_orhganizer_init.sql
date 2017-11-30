CREATE SEQUENCE event_organizer_id_seq START 1;
CREATE TABLE event_organizer (
    event_organizer_id BIGSERIAL NOT NULL,
    name varchar(100) NOT NULL,
    phone varchar(100) NOT NULL,
    deleted character(1) NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    update_at TIMESTAMP WITH TIME ZONE NOT NULL,

    PRIMARY KEY (event_organizer_id)
);

INSERT INTO event_organizer (event_organizer_id,name,phone,deleted,create_at,update_at)
VALUES (1,'Gede Organizer','0212222222','0','2017-11-29 15:13:23.544+00','2017-11-29 15:13:23.544+00');

alter sequence event_organizer_id_seq restart with 2;