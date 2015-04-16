package com.linedata.ekip.pos.gui.crma.screen.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.linedata.ekip.commons.shared.context.ActionContext;
import com.linedata.ekip.core.server.screenservices.ScreenService;
import com.linedata.ekip.core.shared.context.screencontext.ScreenContext;
import com.linedata.ekip.core.shared.data.Data;
import com.linedata.ekip.core.shared.data.ScreenServiceResponse;


public class NouveauChiffrageScreenService extends ScreenService {

	public static final String BEANID = "NouveauChiffrageScreenService";

	private static final Log logger = LogFactory
			.getLog(NouveauChiffrageScreenService.class);

	Data d;

	@Override
	public String getBeanId() {
		return BEANID;
	}

	@Override
	public void manageActionMappings() {
		getActionMappings().put("create", "create");
	}

	public ScreenServiceResponse create(ActionContext actionContext,String functionId, ScreenContext screenContext, Data inParameters) {
		
		ScreenServiceResponse screenServiceResponce = initScreenServiceResponse(screenContext);
		
		Data informationChiffrage = inParameters.get("Information");
		
		String produit = informationChiffrage.get("produit").toString();
		
		logger.info(produit.toString());
	
		return screenServiceResponce;

	}
}
