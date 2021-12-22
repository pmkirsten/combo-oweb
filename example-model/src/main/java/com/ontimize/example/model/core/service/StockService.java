package com.ontimize.example.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.example.api.core.service.IStockService;
import com.ontimize.example.model.core.dao.StockNameDao;
import com.ontimize.example.model.core.dao.StockSectorDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Lazy
@Service("StockService")
public class StockService implements IStockService{
	
	@Autowired private StockNameDao stockNameDao;
	@Autowired private StockSectorDao stockSectorDao;
	@Autowired private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult stockNameQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(this.stockNameDao, keyMap, attrList);
	}

	@Override
	public EntityResult stockNameInsert(Map<String, Object> attrMap) {
		return this.daoHelper.insert(this.stockNameDao, attrMap);
	}

	@Override
	public EntityResult stockNameUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) {
		return this.daoHelper.update(this.stockNameDao, attrMap, keyMap);
	}

	@Override
	public EntityResult stockNameDelete(Map<String, Object> keyMap) {
		return this.daoHelper.delete(this.stockNameDao, keyMap);
	}

	@Override
	public EntityResult stockSectorQuery(Map<String, Object> keyMap, List<String> attrList) {
		return this.daoHelper.query(this.stockSectorDao, keyMap, attrList);
	}

	@Override
	public EntityResult stockSectorInsert(Map<String, Object> attrMap) {
		return this.daoHelper.insert(this.stockSectorDao, attrMap);
	}

	@Override
	public EntityResult stockSectorUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) {
		return this.daoHelper.update(this.stockSectorDao, attrMap, keyMap);
	}

	@Override
	public EntityResult stockSectorDelete(Map<String, Object> keyMap) {
		return this.daoHelper.delete(this.stockSectorDao, keyMap);
	}

}
