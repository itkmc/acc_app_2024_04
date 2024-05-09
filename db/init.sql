# 테스트 DB 생성
DROP DATABASE IF EXISTS acc_app_2024_04__test;
CREATE DATABASE acc_app_2024_04__test;
USE acc_app_2024_04__test;

# 개발 DB 생성
DROP DATABASE IF EXISTS acc_app_2024_04__dev;
CREATE DATABASE acc_app_2024_04__dev;
USE acc_app_2024_04__dev;


-- SELECT order_item_id, pay_price, refund_price, wholesale_price, pg_fee,
--        CASE
--            WHEN pay_price = refund_price
--                THEN 0
--            ELSE wholesale_price - pg_fee
--            END AS rebate_price
-- FROM `rebate_order_item`;