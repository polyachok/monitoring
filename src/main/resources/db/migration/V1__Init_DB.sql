
create table ci_product (
    id bigint not null AUTO_INCREMENT,
    article varchar(14),
    name text,
    image text,
    brand varchar(32),
    offers_id bigint,
    primary key (id)
);

create table ci_offers (
    id bigint not null AUTO_INCREMENT,
    price varchar(10),
    availability varchar(10),
    price_valid_until varchar(24),
    primary key (id)
)