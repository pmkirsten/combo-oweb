package com.ontimize.example.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;


public interface IStockService {

	public EntityResult stockNameQuery(Map<String, Object> keyMap, List<String> attrList);
	public EntityResult stockNameInsert(Map<String, Object> attrMap);
	public EntityResult stockNameUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap);
	public EntityResult stockNameDelete(Map<String, Object> keyMap);

	public EntityResult stockSectorQuery(Map<String, Object> keyMap, List<String> attrList);
	public EntityResult stockSectorInsert(Map<String, Object> attrMap);
	public EntityResult stockSectorUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap);
	public EntityResult stockSectorDelete(Map<String, Object> keyMap);
}

