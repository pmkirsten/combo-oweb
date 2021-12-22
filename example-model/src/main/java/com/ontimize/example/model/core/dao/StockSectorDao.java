package com.ontimize.example.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "StockSectoraDao")
@ConfigurationFile(configurationFile = "dao/StockSectorDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")

public class StockSectorDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_ID = "ID";
	public static final String ATTR_STOCK_SECTOR = "STOCK_SECTOR";


}
