package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 980512
 * @create 2022-07-25 23:19
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }
}
