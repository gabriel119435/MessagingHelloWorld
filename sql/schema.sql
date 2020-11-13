create table some_table(some_text text, some_number integer);
alter table some_table add column some_bool boolean default false;
alter table some_table add primary key (some_number);