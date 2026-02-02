
--1. Display employee names in **uppercase**.
SELECT LOWER(ENAME) FROM EMP1;
--2. Display employee names in **lowercase**.
SELECT UPPER(ENAME) FROM EMP1;
--3. Display employee names with **first letter capital**.
SELECT INITCAP(ENAME) FROM EMP1;
--4. Display employee details whose name is **‘smith’**, case-insensitive.
SELECT * FROM EMP1 WHERE UPPER(ENAME) = 'SMITH';
--5. Display employees whose name is **‘allen’** ignoring case.
SELECT * FROM EMP1 WHERE LOWER(ENAME) = 'allen';

--6. Display employee name and its **length**.
SELECT LENGTH(ENAME) FROM EMP1;
--7. Display employees whose name contains **exactly 5 characters**.
SELECT * FROM EMP1 WHERE LENGTH(ENAME) = 5;
--8. Display employees whose name length is **greater than salary digit count**.
SELECT * FROM EMP1 WHERE LENGTH(ENAME) = LENGTH(SAL);
SELECT * FROM EMP1;
--9. Arrange employees based on **length of name (descending)**.
SELECT * FROM EMP1 ORDER BY LENGTH(ENAME) ASC;
--10. Display employees whose name length is **even number**.
SELECT * FROM EMP1 WHERE MOD(LENGTH(ENAME),2) = 0;


--### 🔹 C. SUBSTR

--11. Display **first 3 characters** of employee name.
SELECT SUBSTR(ENAME,1,3) FROM EMP1;
--12. Display **last 2 characters** of employee name.
SELECT SUBSTR(ENAME,-2) FROM EMP1;
--13. Display employees whose name **starts with ‘A’** using `SUBSTR`.
SELECT * FROM EMP1 WHERE SUBSTR(ENAME,1,1) = 'A';
--14. Display employees whose name **ends with ‘N’** using `SUBSTR`.
SELECT * FROM EMP1 WHERE SUBSTR(ENAME,-1,1) = 'N';

--15. Display employees whose **first and last character are same**.
SELECT * FROM EMP1  WHERE SUBSTR(ENAME,1,1) = SUBSTR(ENAME,-1,1);
--16. Generate email id as  `first 2 chars of name + empno + @oracle.com`
SELECT  SUBSTR(ENAME,1,2) || EMPNO || '@oracle.com' AS EMAIL FROM EMP1;
--17. Display middle character of employee name (hint: LENGTH & SUBSTR).
SELECT ENAME , SUBSTR(ENAME,CEIL(LENGTH(ENAME)/2),1) FROM EMP1;

---

--### 🔹 D. INSTR

--18. Display employees whose name contains **‘L’** without using `LIKE`.
    SELECT * FROM EMP1 WHERE INSTR(ENAME,'L')>0;
--19. Display employees whose name contains **‘E’ more than once**.
    SELECT * FROM EMP1 WHERE INSTR(ENAME,'E',1,2) > 0;
--20. Display position of **second occurrence of ‘A’** in employee name.
    SELECT * FROM EMP1 WHERE INSTR(ENAME,'A',1,2) > 0;
--21. Display employees whose name contains **space**.
    SELECT * FROM EMP1 WHERE INSTR(ENAME, ' ',1) > 0;
--22. Split `FULLNAME` column into **FIRSTNAME and LASTNAME**.
    SELECT SUBSTR(ENAME,1,INSTR(ENAME,' ')-1) AS FIRSTNAME, SUBSTR(ENAME,INSTR(ENAME,' ')+1) AS LASTNAME FROM EMP1;


--### 🔹 E. SUBSTR + INSTR (Scenarios)
CREATE TABLE PERSON (
    PID NUMBER,
    FULLNAME VARCHAR2(40)
);

INSERT INTO PERSON VALUES (1, 'SACHIN TENDULKAR');
INSERT INTO PERSON VALUES (2, 'VIRAT KOHLI');
INSERT INTO PERSON VALUES (3, 'MAHENDRA SINGH DHONI');
INSERT INTO PERSON VALUES (4, 'ROHIT SHARMA');
INSERT INTO PERSON VALUES (5, 'RAVI KUMAR');
INSERT INTO PERSON VALUES (6, 'ANIL');
COMMIT;

--23. From `cname = 'rahul dravid'`, extract **first name**.

SELECT SUBSTR(FULLNAME,1,INSTR(FULLNAME,' ')-1) AS FIRSTNAME FROM PERSON;

--24. From `cname = 'rahul krishna dravid'`, extract   **fname, mname, lname**.
SELECT SUBSTR(FULLNAME,1,INSTR(FULLNAME,' ')-1) AS FIRSTNAME ,

       SUBSTR(FULLNAME,INSTR(FULLNAME,' ')+1 , INSTR(FULLNAME,' ',1,2) - INSTR(FULLNAME,' ')-1)  AS MIDDLENAME ,
       
       SUBSTR(FULLNAME,INSTR(FULLNAME,' ',1,2)+1) AS LASTNAME
       FROM PERSON;
--25. Display only **surname** from customer name.
SELECT * FROM EMP1;
--26. Display customers whose **middle name exists**.
SELECT * FROM PERSON WHERE INSTR(FULLNAME,' ',1,2) > 0;

--### 🔹 F. LPAD / RPAD

--27. Mask salary as `*****` based on number of digits.
SELECT E.*,RPAD('*',LENGTH(SAL),'*') AS MASKED_SALARY FROM EMP1 E;
--28. Display account number as `XXXX5678`.
CREATE TABLE ACCOUNT (
    ACCNO VARCHAR2(20)
);
INSERT INTO ACCOUNT VALUES ('123456789234');
INSERT INTO ACCOUNT VALUES ('987654321098');
COMMIT;

--29. Display card number as `12XXXX789`.
SELECT ACCNO, SUBSTR(ACCNO,1,2) || RPAD('X',LENGTH(ACCNO),'X') || SUBSTR(ACCNO,-3) AS MASKED_CARD FROM ACCOUNT;

--30. Left pad employee name with `#` to make total length **15**.
--31. Right pad department name with `*` to length **20**.


--### 🔹 G. LTRIM / RTRIM / TRIM

--32. Remove leading spaces from employee name.
--33. Remove trailing spaces from `CHAR` datatype name.
--34. Remove `#` from both sides of `'###HELLO###'`.
--35. Display students whose name ends with **‘n’** (CHAR datatype).
--36. Compare two names ignoring extra spaces.

---

--### 🔹 H. Mixed / Tricky (Very Important)

--37. Display employees whose name **starts and ends with vowel**.
--38. Display employees whose name **does not contain ‘A’**.
--39. Replace spaces in name with `_` (use TRIM + SUBSTR logic).
--40. Display employees whose name length is **same as job length**.

---
