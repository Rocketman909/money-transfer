create database money_transfer;

create table money_transfer
(
    uuid                uuid,
    from_account_number text,
    to_account_number   text,
    amount              double precision,
    comment             text,
    create_date_time    timestamp with time zone
);

