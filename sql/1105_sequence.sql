--1105 sequence


--시퀀스 : 숫자 생성해주는 객체
--설정을 통해서 일련번호를 생성 -> 기본키가 대리키인 경우

--sequence의 생성
--create sequence (시퀀스 이름) 설정..

--시퀀스 생성
create sequence test_seq;

--부서 번호를 자동으로 생성
--시작값 10 증가값 10 10부터 99까지 넘버타임 두자리
desc dept;
select * from dept;



create sequence dept_deptno_seq start with 10 increment by 10 
maxvalue 90
;

--시퀀스 삭제 객체삭제할때 drop
drop sequence dept_deptno_seq;

--시작값이 1이고 1씩 증가하는 시퀀스
create sequence emp_seq
start with 1 
increment by 1
MINVALUE 1
MAXVALUE 9999
;
--시퀀스의 값을 확인
--현재값
select dept_deptno_seq.currval from dual;
select emp_seq.currval from dual;
--다음 새로운 값
--
select dept_deptno_seq.nextval from dual;
select emp_seq.nextval from dual;



































