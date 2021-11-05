--1105procedure

--데이터를받아서 데이터변경처리를 프로그램요소를 이용해서 실행

--create or replace  (프로시저이름 }(매개변수 )
--as 선언부
--begin 프로그램실행
--end;


--orders 테이블 이익금 계산 프로시저
create or replace procedure interest
as
    --변수선언
    myinterest numeric;
    price numeric;
    cursor interestcursor is select saleprice from orders;

begin
    myinterest := 0.0;
    open interestcursor;
    loop
        fetch interestcursor into price;
        exit when interestcursor%notfound;
        if price >= 30000 then
            myinterest := myinterest + price * 0.1;
        else
            myinterest := myinterest + price * 0.05;
        end if;
    end loop;
    close interestcursor;
    dbms_output.put_line('전체 이익 금액 = '|| myinterest);
end;    





