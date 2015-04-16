package com.linedata.ekip.pos.gui.crma.server.crma.block;

// Generated 27/03/2015 18:23:03 by Ekip Framework Released beta

import com.linedata.ekip.commons.shared.context.ActionContext;
import com.linedata.ekip.core.server.screenservices.ScreenService;
import com.linedata.ekip.core.shared.context.screencontext.ScreenContext;
import com.linedata.ekip.core.shared.data.Data;
import com.linedata.ekip.core.shared.data.ScreenServiceResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * @author Copyright © Linedata, 2015.
 */
@Component
public class ChiffrageFunctionService extends ScreenService
{

   private final static String BEANID = "ChiffrageFunctionService";
   private static final Log    logger = LogFactory.getLog(ChiffrageFunctionService.class);

   // @Resource(name = "EntitiesMapper")
   // private DozerBeanMapper mapper;
   // @Resource(name = "ChiffrageService")
   // private ChiffrageService chiffrageService;

   @Override
   public final void manageActionMappings()
   {
      getActionMappings().put("create", "create");
   }

   /**
    * @param actionContext the actionContext
    * @param functionId the functionId
    * @param screenContext the screenContext
    * @param inParameters the inParameters
    * @return screenServiceResponse
    */
   public ScreenServiceResponse create(ActionContext actionContext, String functionId, ScreenContext screenContext,

   Data inParameters)
   {

      ScreenServiceResponse screenServiceResponce = initScreenServiceResponse(screenContext);
      Data informationChiffrage = inParameters.get("Information");
      String produit = informationChiffrage.get("sujet").toString();
      logger.info(produit.toString());

      return screenServiceResponce;
   }

   @Override
   public final String getBeanId()
   {
      return BEANID;
   }

}
