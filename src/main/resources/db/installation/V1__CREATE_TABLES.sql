create TABLE IF NOT EXISTS price
(
    id uuid                        not null,
    amount        numeric                     not null,
    currency     numeric                     not null
    );
create sequence if not exists price_seq
  start with 1
  increment by 1
  no minvalue
  no maxvalue
  cache 1;