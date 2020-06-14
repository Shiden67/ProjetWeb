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
  user_id_user                  bigint,
  constraint pk_produit primary key (id)
);

create table user (
  id_user                       bigint auto_increment not null,
  prenom                        varchar(255),
  nom                           varchar(255),
  age                           timestamp,
  email                         varchar(255),
  mdp                           varchar(255),
  constraint pk_user primary key (id_user)
);

create index ix_produit_user_id_user on produit (user_id_user);
alter table produit add constraint fk_produit_user_id_user foreign key (user_id_user) references user (id_user) on delete restrict on update restrict;


# --- !Downs

alter table produit drop constraint if exists fk_produit_user_id_user;
drop index if exists ix_produit_user_id_user;

drop table if exists produit;

drop table if exists user;

