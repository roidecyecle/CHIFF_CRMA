package com.linedata.ekip.pos.services.crma.service.impl;

// Generated 27/03/2015 18:23:02 by Ekip Framework Released beta

import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.commons.server.log.LogFactory;
import com.linedata.ekip.commons.server.log.Logger;
import com.linedata.ekip.commons.shared.context.ActionContext;
import com.linedata.ekip.pos.services.crma.entity.Chiffrage;
import com.linedata.ekip.pos.services.crma.service.ChiffrageService;
import com.linedata.ekip.pos.services.entity.crma.ChiffrageReference;
import com.linedata.ekip.std.dao.core.ExecutionContext;
import com.linedata.ekip.std.dao.core.ExecutionMode;
import com.linedata.ekip.std.services.core.exception.EkipServiceException;
import com.linedata.ekip.std.services.core.service.impl.ServiceImpl;




/**
 * <p>
 * <b>The class ChiffrageServiceImpl which extends ServiceImpl and implements 
 * ChiffrageService</b>
 * </p>
 * 
 * @see ServiceImpl
 * @author 
 */
@Transactional(readOnly = true)
public class ChiffrageServiceImpl extends ServiceImpl<ChiffrageReference, Chiffrage> implements ChiffrageService
{  
   
   // Logger declaration
   private static final Logger         LOG = LogFactory.getLog(ChiffrageServiceImpl.class);

  
    @Override
   public String getBeanId()
   {
      return BEANID;
   }
   
   
     
    @Override
   public Chiffrage create(ActionContext actionContext, Chiffrage chiffrage) throws EkipServiceException
 	{
      // get the execution context and setting the mode INS
      ExecutionContext executionContext = getExecutionContext(actionContext, ExecutionMode.INS);
      // calling the generic method
      return null;     
   }
  
  

 	
 
   
}
