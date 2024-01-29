//SELECT t_left.*
//        ,t_right.*
//        FROM (
//        SELECT t1.fund_back_id
//        ,t1.fund_back_amt_cur
//        ,t1.fund_back_amt
//        ,get_json_object(t1.extend_info ,'$.IS_MANUAL_HANDLED') AS is_manual_handled
//        FROM dana_dw.ods_aqc_fund_back t1
//        WHERE t1.status = 'SUCCESS'
//        AND t1.reason = 'ORDER_IS_CANCELLED'
//        AND t1.type = 'ORDER_CANCEL'
//        AND t1.dt = '{yyyymmdd-1}'
//        AND TO_CHAR(t1.fund_back_time ,'yyyyMMdd') = '{yyyymmdd-1}'
//        )t_left
//        FULL OUTER JOIN (
//        SELECT ct1.biz_order_id
//        ,ct1.pay_money_amount
//        ,ct1.pay_money_currency
//        FROM dana_dw.ods_idt_biz_order_delta ct1
//        WHERE ct1.sub_biz_order_type = 'CANCEL'
//        AND ct1.sub_order_status = 'SUCCESS'
//        AND ct1.dt = '{yyyymmdd-1}'
//        AND TO_CHAR(ct1.order_completed_time ,'yyyyMMdd') = '{yyyymmdd-1}'
//        )t_right
//        ON t_left.fund_back_id = t_right.biz_order_id
//        AND t_left.fund_back_amt_cur = t_right.pay_money_currency
//        AND t_left.fund_back_amt = t_right.pay_money_amount
//        WHERE (t_left.fund_back_id IS NULL
//        OR t_right.biz_order_id IS NULL
//        )
//        AND (t_left.is_manual_handled IS NULL
//        OR t_left.is_manual_handled <> 'true'
//        )
//        ;
