
create table family_members(
	id varchar(32) not null,
	name varchar(200) not null,
	age int2,
    sex int2 not null,
	birthday date,
	family_status varchar(20) not null,
	personal_profile text,
	create_time timestamp,
	creator varchar(200),
	update_time timestamp,
	updater varchar(200),
	comments varchar(400),
	constraint pk_family_members_id primary key (id)
);

comment on table family_members is '家庭成员';
comment on column family_members.id is '主键';
