use homeworkdb;
CREATE TABLE tbl_book(
     book_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '책번호'
    ,book_name VARCHAR(100) COMMENT '책이름'
    ,publisher VARCHAR(50) COMMENT '출판사'
    ,price INT COMMENT '가격'
);
CREATE TABLE tbl_customer(
     cust_id INT AUTO_INCREMENT PRIMARY KEY COMMENT '고객번호'
    ,cust_name VARCHAR(20) COMMENT '고객명'
    ,cust_addr VARCHAR(50) COMMENT '주소'
    ,cust_tel VARCHAR(20) COMMENT '전화'
);

CREATE TABLE tbl_order(
     order_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '주문번호'
     ,cust_id INT COMMENT '고객번호'
     ,book_id INT COMMENT '책번호'
     ,amount INT COMMENT '판매수량'
     ,ordered_at DATE COMMENT '주문일'
    ,FOREIGN KEY(cust_id)
    REFERENCES tbl_customer(cust_id)
    ON DELETE SET NULL
    ,FOREIGN KEY(book_id)
    REFERENCES tbl_book(book_id)
    ON DELETE CASCADE

);
INSERT INTO tbl_book
VALUES 
     (1, '축구의 역사', '굿스포츠',7000)
    ,(2, '축구 아는 여자', '나이스북',13000)
    ,(3, '축구의 이해', '대한미디어',22000)
    ,(4, '골프 바이블', '대한미디어',35000)
    ,(5, '피겨 교본', '굿 스포츠',6000)
    ,(6, '역도 단계별 기술', '굿 스포츠',6000)
    ,(7, '야구의 추억', '이상미디어',20000)
    ,(8, '야구를 부탁해', '이상미디어',000)
    ,(9, '올림픽 이야기', '삼성당',7500)
    ,(10, '올림픽 챔피언', '나이스북',13000);

SELECT * FROM tbl_book;
INSERT INTO tbl_customer
VALUES
     (1000, '박지성','영국','000-0000-0000')
    ,(null, '김연아','대한민국','111-0000-0000')
    ,(null, '장미란','대한민국','222-0000-0000')
    ,(null, '추신수','미국','333-0000-0000')
    ,(null, '박세리','대한민국','444-0000-0000');
    
SELECT * FROM tbl_customer;

SELECT * FROM tbl_book;
INSERT INTO tbl_order
VALUES
      (1,1000,1,1,'2020-07-01')
     ,(null,1000,3,2,'2020-07-03')
     ,(null,1001,5,1,'2020-07-03')
     ,(null,1002,6,2,'2020-07-04')
     ,(null,1003,7,3,'2020-07-05')
     ,(null,1000,2,5,'2020-07-07')
     ,(null,1003,8,2,'2020-07-07')
     ,(null,1002,10,2,'2020-07-08')
     ,(null,1001,10,1,'2020-07-09')
     ,(null,1002,6,4,'2020-07-10');
DROP TABLE tbl_order;
SELECT * FROM tbl_order;

-- 7
SELECT *
FROM tbl_book
WHERE
    book_name LIKE '%올림픽%';
    
    -- 8
SELECT *
FROM tbl_book
WHERE price = (SELECT max(price) FROM tbl_book);

-- 9
SELECT 
     o.order_id
    ,o.book_id
    ,b.book_name
FROM tbl_order o
JOIN tbl_book b ON o.book_id = b.book_id
WHERE ordered_at BETWEEN '2020-07-05' AND '2020-07-09';

-- 10
SELECT
    cust_name
FROM
    tbl_customer c
    LEFT JOIN tbl_order o ON o.cust_id = c.cust_id
WHERE
    o.order_id IS NULL;

-- 11
SELECT 
order_id
    ,cust_name
    ,book_name
    ,(price*amount)
    ,ordered_at
FROM
    tbl_order o    
    JOIN tbl_customer c ON o.cust_id = c.cust_id
    JOIN tbl_book b ON o.book_id = b.book_id

WHERE o.ordered_at NOT BETWEEN '2020-07-04' AND '2020-07-07';

-- 12
SELECT
     cust_name
    ,book_name
    ,ordered_at
FROM 
    tbl_order
    JOIN tbl_customer USING(cust_id)
    JOIN tbl_book USING(book_id)
ORDER BY 
    ordered_at DESC
LIMIT 1;

-- 13
SELECT
    order_id
    ,b.book_id
    ,book_name
FROM
    tbl_book b
    LEFT JOIN tbl_order o ON b.book_id=o.book_id
WHERE order_id IS NULL;

-- 14
SELECT
    cust_name
  , book_name
  , price
FROM 
    tbl_customer c
        RIGHT JOIN tbl_order o ON o.cust_id = c.cust_id
        RIGHT JOIN tbl_book b ON b.book_id = o.book_id
ORDER BY 
price DESC
LIMIT 1;

-- 15
SELECT
    cust_name
    ,count(cust_name)
    FROM 
    tbl_customer c
    JOIN tbl_order o ON c.cust_id = o.cust_id
WHERE
    cust_name = '김연아';
-- 16
SELECT 
     b.publisher
     ,COUNT(o.book_id)
FROM tbl_book b
LEFT JOIN tbl_order o ON b.book_id = o.book_id
GROUP BY b.publisher;
-- 17
