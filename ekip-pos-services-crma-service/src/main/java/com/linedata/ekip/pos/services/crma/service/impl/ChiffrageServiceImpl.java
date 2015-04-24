package com.linedata.ekip.pos.services.crma.service.impl;

// Generated 27/03/2015 18:23:02 by Ekip Framework Released beta

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.commons.server.log.LogFactory;
import com.linedata.ekip.commons.server.log.Logger;
import com.linedata.ekip.commons.shared.context.ActionContext;
import com.linedata.ekip.pos.crma.api.EstimationDao;
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
@Service
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
   
    @Resource
    EstimationDao estimation;
   
     
  


	public ChiffrageServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EstimationDao getEstimation() {
		return estimation;
	}


	public void setEstimation(EstimationDao estimation) {
		this.estimation = estimation;
	}


	@Override
	public void ajout() {
//		estimation.getEstimation(90);
		System.out.println("jhkjhkj");
	}
  
  
	 public ChiffrageServiceImpl(EstimationDao estimation) {
			super();
			this.estimation = estimation;
		}


	@Override
	public Chiffrage create(ActionContext actionContext, Chiffrage chiffrage)
			throws EkipServiceException {
		// TODO Auto-generated method stub
		return null;
	}

 	
 
   
}
