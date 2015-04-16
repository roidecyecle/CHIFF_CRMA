package com.linedata.ekip.pos.gui.crma.block.service;

import com.linedata.ekip.commons.shared.context.ActionContext;
import com.linedata.ekip.commons.shared.lov.LovOpenFunctionMode;
import com.linedata.ekip.core.server.screenservices.FormService;
import com.linedata.ekip.core.shared.context.functionalcontext.FunctionalContext;
import com.linedata.ekip.core.shared.context.screencontext.ScreenContext;
import com.linedata.ekip.core.shared.data.Data;
import com.linedata.ekip.core.shared.lov.LovEvent;






public class InformationChiffrageBlockService implements FormService{
	
	
	
	public static final String BEANID = "InformationChiffrageBlockService";

	@Override
	public String getBeanId() {
		return BEANID;
	}

	@Override
	public Data provideData(ActionContext actionContext, LovEvent event,
			LovOpenFunctionMode openFunctionMode, ScreenContext screenContext,
			Data inParameters, FunctionalContext functionalContext) {
		
		return new Data();
	}

}
