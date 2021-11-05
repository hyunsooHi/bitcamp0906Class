--1105index

--index : 검색의 성능을 높이기 위해 사용하는 객체
--물리적인 저장공간을 가진다 -> 저장공간 확보 필요
--데이터 변경시에는 성능이 떨어질수있다
--인덱스는 필수가 아니라 선택이다

--검색이 오래 걸리는 환경
drop table emp01;
create table emp01
as
select * from emp;
select * from emp01;

--많은데이터 입력해서 성능을볼것
insert into emp01
select * from emp01;

insert into emp01 (empno,ename) values(1000,'teset9');
delete from emp01 where ename='SCOTT';
select * from emp01 where ename='teset1';
select * from emp01;
select count(*) from emp01;
commit;
--많은데이터입력
insert into emp01 select * from emp01 where ename = 'teset8';

create index index_name
on emp01 (ename)
;
--0.136초 -> 
















