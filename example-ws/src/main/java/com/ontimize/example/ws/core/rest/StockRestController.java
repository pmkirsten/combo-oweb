package com.ontimize.example.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.example.api.core.service.IStockService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/stock")
public class StockRestController extends ORestController<IStockService> {

	@Autowired
	private IStockService stockService;

	@Override
	public IStockService getService() {
		return this.stockService;
	}

}
