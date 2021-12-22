package com.ontimize.example.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "StockNameDao")
@ConfigurationFile(configurationFile = "dao/StockNameDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")

public class StockNameDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_ID = "ID";
	public static final String ATTR_ID_STOCK_SECTOR = "ID_STOCK_SECTOR";
    public static final String ATTR_STOCK_NAME = "STOCK_NAME";

}
