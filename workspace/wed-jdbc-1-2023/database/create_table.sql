use testDB
go
create table role
(
	id bigint not null IDENTITY(1,1000) primary key,
	name varchar(255) not null,
	code varchar(255) not null,
	createddate TIMESTAMP null,
	createdby varchar(255) null,
	modifiedby varchar(255) null
)

create table users
(
	id bigint not null IDENTITY(1,1000) primary key,
	username varchar(255) not null,
	password varchar(255) not null,
	fullname varchar(150) null,
	status int not null,
	roleid bigint not null,
	createddate TIMESTAMP null,
	createdby varchar(255) null,
	modifiedby varchar(255) null
)

alter table users add constraint fk_users_role foreign key (roleid) references role(id)

go 
create table news
(
	id bigint not null IDENTITY(1,1000) primary key,
	title varchar(255) not null,
	thumbnail varchar(255) not null,
	shortdescription text null,
	content text null,
	categoryid bigint not null,
	createddate TIMESTAMP null,
	createdby varchar(255) null,
	modifiedby varchar(255) null
);
go
create table category
(
	id bigint not null IDENTITY(1,1000) primary key,
	name varchar(255) not null,
	code varchar(255) not null,
	createddate TIMESTAMP null,
	createdby varchar(255) null,
	modifiedby varchar(255) null
);

alter table news add constraint fk_news_categoryid foreign key (categoryid) references category(id)
go

create table comment
(
	id bigint not null IDENTITY(1,1000) primary key,
	content text not null,
	users_id bigint not null,
	new_id bigint not null,
	createddate TIMESTAMP null,
	createdby varchar(255) null,
	modifiedby varchar(255) null
);

alter table comment add constraint fk_comment_user foreign key (users_id) references users(id);
alter table comment add constraint fk_comment_news foreign key (new_id) references news(id)