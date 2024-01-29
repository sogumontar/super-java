//SELECT  t_left.*
//        ,t_right.*
//        FROM    (
//        SELECT  t1.fund_back_id
//        ,t1.fund_back_amt_cur
//        ,t1.fund_back_amt
//        ,get_json_object(t1.extend_info ,'$.IS_MANUAL_HANDLED') AS is_manual_handled
//        FROM    dana_cloud_dwh.ods_aqc_fund_back t1
//        WHERE   t1.status = 'SUCCESS'
//        AND     t1.reason = 'ORDER_IS_CANCELLED'
//        AND     t1.type = 'ORDER_CANCEL'
//        AND     t1.dt='{yyyymmdd-1}'
//
//        AND     SUBSTR(REPLACE(t1.fund_back_time ,'-',''),1,8) = '{yyyymmdd-1}'
//        ) t_left
//        FULL OUTER JOIN (
//        SELECT  ct1.biz_order_id
//        ,ct1.order_detail_money_amount
//        ,ct1.order_detail_money_currency
//        FROM    dana_cloud_dwh.ods_idt_biz_order_detail ct1
//        WHERE   ct1.biz_order_detail_type = 'CANCEL'
//        AND     ct1.detail_order_status = 'SUCCESS'
//        AND     ct1.month = SUBSTR('{yyyymmdd-1}',1,6)
//
//        AND     SUBSTR(REPLACE(ct1.order_detail_created_time ,'-',''),1,8) = '{yyyymmdd-1}'
//        ) t_right
//        ON      t_left.fund_back_id = t_right.biz_order_id
//        AND     t_left.fund_back_amt_cur = t_right.order_detail_money_currency
//        AND     t_left.fund_back_amt = t_right.order_detail_money_amount
//        WHERE   (t_left.fund_back_id IS NULL  OR t_right.biz_order_id IS NULL )
//        and     (t_left.is_manual_handled IS NULL  OR t_left.is_manual_handled <> 'true' )
//        ;
//        ;