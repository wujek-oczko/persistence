package com.wujq.persistence.service.impl;

import com.wujq.persistence.dao.IFooDao;
import com.wujq.persistence.dao.common.IOperations;
import com.wujq.persistence.model.Foo;
import com.wujq.persistence.service.IFooService;
import com.wujq.persistence.service.common.AbstractHibernateService;
import com.wujq.persistence.service.common.AbstractJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooService extends AbstractHibernateService<Foo> implements IFooService {

    @Autowired
    @Qualifier("fooHibernateDao")
    private IFooDao dao;

    public FooService() {
        super();
    }

    // API

    @Override
    protected IOperations<Foo> getDao() {
        return dao;
    }

}
