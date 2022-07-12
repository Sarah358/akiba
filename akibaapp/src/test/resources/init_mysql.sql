create table transactions (
    id bigint not null,
    account_number integer,
    amount double precision,
    currency varchar(255),
    date datetime,
    merchant_logo varchar(255),
    merchant_name varchar(255),
    type varchar(255),
    primary key (id)
) engine=InnoDB;

INSERT INTO transactions (id, type, date, account_number, currency, amount, merchant_name, merchant_logo)
VALUES (1, 'debit', now(), '35867408', 'KES', 1000, 'Pizza inn', '');

INSERT INTO transactions (id, type, date, account_number, currency, amount, merchant_name, merchant_logo)
VALUES (2, 'debit', now(), '23456743', 'KES', 500, 'Java', '');