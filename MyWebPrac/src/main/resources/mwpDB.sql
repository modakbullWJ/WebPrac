CREATE TABLE mwp_members(
m_emailID VARCHAR(30) PRIMARY KEY,
m_pw VARCHAR(20) not null,
m_phoneNO VARCHAR(11) not null,
m_birthD VARCHAR(8) not null
);


select * from mwp_members;

insert p_members values('ruffy15@gmail.com','asdf','19860228');