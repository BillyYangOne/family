/*==============================================================*/
/* Table: sys_account                                           */
/*==============================================================*/
create table sys_account (
   id                   VARCHAR(32)          not null,
   account_name         VARCHAR(20)          not null,
   account_pwd          VARCHAR(100)         not null,
   name                 VARCHAR(100)         not null,
   telephone            VARCHAR(20)          not null,
   type                 INT2                 not null,
   status               INT2                 not null,
   create_time          timestamp            not null,
   creator              varchar(200)         not null,
   update_time          timestamp            null,
   updater              varchar(200)         null,
   comments             varchar(400)         null,
   constraint PK_SYS_ACCOUNT primary key (id)
);

comment on table sys_account is
'账户表';

comment on column sys_account.id is
'主键id';

comment on column sys_account.account_name is
'账户';

comment on column sys_account.account_pwd is
'密码';

comment on column sys_account.name is
'姓名';

comment on column sys_account.telephone is
'电话';

comment on column sys_account.type is
'类型（1:管理yuan,0:普通用户）';

comment on column sys_account.status is
'状态（1:启用，0：禁用）';

comment on column sys_account.create_time is
'创建时间';

comment on column sys_account.creator is
'创建者';

comment on column sys_account.update_time is
'更新时间';

comment on column sys_account.updater is
'更新者';

comment on column sys_account.comments is
'备注';
