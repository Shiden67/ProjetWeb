# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table produit (
  id                            bigint auto_increment not null,
  nom_produit                   varchar(255),
  famille_produit               varchar(255),
  type_produit                  varchar(255),
  nmb_produit                   integer not null,
  date_peremption               timestamp,
  constraint pk_produit primary key (id)
);


# --- !Downs

drop table if exists produit;

