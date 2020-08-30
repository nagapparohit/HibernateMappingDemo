create database ecommerce;



CREATE TABLE public.eproduct (
    id integer NOT NULL,
    name character varying(100),
    price numeric(10,2),
    date_added timestamp without time zone DEFAULT now()
);

insert into eproduct (name,price) values ('java book',700);
insert into eproduct (name,price) values ('redmi phone',10700);
insert into eproduct (name,price) values ('hp laptop',57700);
insert into eproduct (name,price) values ('apple laptop',90700);
insert into eproduct (name,price) values ('dell laptop',4700);

pg_dump -t 'schema-name.table-name' --schema-only database-name

create table public.colors(
	id serial primary key,
	color_name character varying(40) default null,
	idx int default null;
	product_id real default null
);

begin work;
	lock table colors;
	insert into colors values (1,'Red',0,1),(2,'Silver',1,1),(3,'Gray',0,2),(4,'White',1,2),(5,'Maroon',0,3);
commit work;


create table public.finance(
	id serial primary key,
	ftype character varying(100) default null,
	name character varying(40) default null,
	product_id real default null
);

begin work;
	lock table finance;
	INSERT INTO finance VALUES (1,'CREDITCARD','EMI on Citibank Card',1),(3,'BANK','40% finance from SBI',2),(4,'BANK','60% finance from ICICI',3),(5,'BANK','20% finance from ICICI',1);
commit work;

create table public.os(
	id serial primary key,
	name character varying(40) default null,
	product_id real default null
);

begin work;
	lock table os;
	INSERT INTO os VALUES (1,'Windows 10',1),(2,'Windows 10',2),(3,'FreeDOS',2),(4,'RedHat Linux',2),(5,'Windows 10',3);
commit work;


create table public.screensizes(
	id serial primary key,
	size character varying(40) default null,
	product_id real default null
);

begin work;
	lock table screensizes;
	INSERT INTO screensizes VALUES (1,'12 in',1),(2,'14.5 in',2),(3,'14.9 in',2),(4,'15.5 in',3);
commit work;








