package com.wujq.persistence.dao.impl;

import com.wujq.persistence.dao.IFooDao;
import com.wujq.persistence.dao.common.AbstractHibernateDao;
import com.wujq.persistence.model.Foo;
import org.springframework.stereotype.Repository;

@Repository
public class FooDao extends AbstractHibernateDao<Foo> implements IFooDao {

    public FooDao() {
        super();

        setClazz(Foo.class);
    }

}
