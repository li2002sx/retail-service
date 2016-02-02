package com.mtime.client.retail.dao;

import com.mtime.client.retail.dao.common.BaseDao;
import com.mtime.client.retail.dao.common.DatabaseName;
import com.mtime.client.retail.dao.common.MultipleDataSource;
import com.mtime.client.retail.model.Order;
import org.springframework.stereotype.Repository;

/**
 * @Title: OrderDao
 * @Package: com.mtime.client.retail.dao
 * @Description: (用一句话描述该文件做什么)
 * @author: jankie.li@Mtime.com
 * @date: 2016/2/1 19:06
 * @version: V1.0
 */
@Repository
public class OrderDao extends BaseDao {

    public Order getOrderById(int orderId) {
        MultipleDataSource.setDataSourceKey(DatabaseName.Retail);
        return sqlSessionTemplate.selectOne("order.selectByOrderId", orderId);
    }
}
