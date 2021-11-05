--1105-function


create or replace function fnc_interest(

    price number) return int
    is
    myinterest number;
    
    begin
    
    if price >=30000 then myinterest := price * 0.1;
    else myinterest := price * 0.05;
    end if;
    return myinterest;
    end;