--20111103_DML

--DML : 데이터 입력 수정 삭제

--데이터입력 : insert into 테이블명) (컬러명 , ... ) values(data,...);
--입력하고자하는 컬럼 데이터개수와 입력데이터개수는 일치해야함 3개 3개
--컬렘의 도멘인과 입력데이터의 타입이 일치해야한다
--컬럼의 제약중에 not null인 컬럼을 생략하면 안된다 deptno는 생략하면안됨 null되면안되니까
--테스트테이블생성
drop table dept01;
create table dept01
as
select * from dept where 1=0
;

insert into dept01 (deptno , dname , loc)
    values(10, 'DEV' , 'SEOUL');

































