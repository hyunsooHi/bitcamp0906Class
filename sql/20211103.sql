--2021.11.03
--ddl : 데이터 정의어, 객체생성 수정 삭제 명령어

--테이블객체 생성 : create table
--테이블 수정 : alter table
--테이블  삭제 : drop table

--create table 테이블명 (
-- 컬럼이름 데이터_타입 (size) 제약조건정의(컬럼레벨정의),
-- ....,
-- 제약조건 정의 (테이블레벨 정의)
-- ) ;

--부서테이블과 유사한 테이블을 정의해봅시다
create table dept_test (
    deptno number(2),
    dname varchar2(20),
    loc varchar2(20)

);

--테이블 삭제
drop table dept_test;

desc emp;

--emp01생성 사원번호 사원이름 급여 3개컬럼
--EMPNO    NOT NULL NUMBER(4)    
--ENAME             VARCHAR2(10) 
--SAL               NUMBER(7,2) 

create table emp_01 (
empno number(4),
ename varchar(10),
sal number(7,2)


)
;
--서브쿼리를 이용해서 기존테이블구조 복사
--하고 튜플을 복사
--컬럼의 정의만 복사하고 제약조건은 복사하지않는다
create table emp02
as select * from emp
;
desc emp02;

--원하는 컬럼만 복사
create table emp03
as select empno, ename from emp
;
desc emp03;

--원하는 데이터만 복사
create table emp04
as select * from emp where deptno=10
;

desc emp04;
select * from emp04;

--구조만 복사
select * from emp where 1=0;
create table emp05
as
select * from emp where 1=0
;
desc emp05;
select * from emp05;

--테이블 구조 변경
--emp01테이블에 문자타입의 job칼럼 추가

alter table emp01
add(job varchar2(9)
)
;
--컬럼의 변경 : alter table 테이블이름 modify 컬럼정의;
alter table emp02
modify ( 
job varchar2(30)

)
;

-- 컬럼의 삭제 : alter table 테이블이름 drop column 컬럼이름
alter table emp02
drop column job;

--테이블의 모든 튜플(데이터)을 삭제 : table truncate
--삭제와 동시에 commit : 바로 물리적인 저장

--emp02 테이블의 모든 데이터를삭제
select * from emp02;
truncate table emp02;

--테이블 이름 변경 : rename old_name to new_name
-- emp 02 테이블의 이름을 test로 변경
desc emp02;
rename emp02 to test;
desc test;
drop table test;



---------------------------------------
--제약조건확인
desc dept;
insert into dept (deptno,dname,loc) 
values (10,'test','seoul');
--deptno는10 dname은 테스트 loc는 서울로 입력했는데
--deptno는 바꿀수없는값이라서 오류 프리마리키라서

--제약사항의 정의 : 컬럼레벨과 테이블 레벨에서 정의
--컬럼 레벨 : 컬럼 정의 바로 뒤에 제약사항을 정의
--사원번호 사원명 직급 부서번호 구성된 emp02테이블 생성
--empno와 ename칼럼에 not null 제약조건
--테이블 삭제
drop table emp02;
create table emp02 (
empno number (4) not null ,
ename varchar(20) not null,
job varchar(9),
deptno number (2) 

);




















