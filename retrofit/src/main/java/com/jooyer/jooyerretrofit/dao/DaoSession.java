package com.jooyer.jooyerretrofit.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.jooyer.jooyerretrofit.http.CookieResult;

import com.jooyer.jooyerretrofit.dao.CookieResultDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cookieResultDaoConfig;

    private final CookieResultDao cookieResultDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cookieResultDaoConfig = daoConfigMap.get(CookieResultDao.class).clone();
        cookieResultDaoConfig.initIdentityScope(type);

        cookieResultDao = new CookieResultDao(cookieResultDaoConfig, this);

        registerDao(CookieResult.class, cookieResultDao);
    }
    
    public void clear() {
        cookieResultDaoConfig.clearIdentityScope();
    }

    public CookieResultDao getCookieResultDao() {
        return cookieResultDao;
    }

}
