package com.linedata.ekip.pos.services.crma.service;

// Generated 27/03/2015 18:23:02 by Ekip Framework Released beta

import java.util.List;
import javax.jws.WebService;
import com.linedata.ekip.commons.shared.context.ActionContext;
import com.linedata.ekip.std.services.core.exception.EkipServiceException;
import com.linedata.ekip.std.services.core.service.Service;
import com.linedata.ekip.pos.services.crma.entity.Chiffrage;
import com.linedata.ekip.pos.services.entity.crma.ChiffrageReference;
/**
 * <p>
 * <b>The interface ChiffrageService which extends Service</b>
 * </p>
 * <br>
 * <br>
 * <p>
 * <ul>
 * <li><b>saveChiffrage: </b>Save Chiffrage</li><br>
 * </ul>
 * </p>
 * 
 * @see Service
 * @author 
 */
@WebService
public interface ChiffrageService extends Service
{
   String BEANID = "ChiffrageService";


	
    /**
    * this method is used to add a Chiffrage
    * 
    * @param actionContext
    * @param Chiffrage
    * @return Chiffrage
    */
   Chiffrage create(ActionContext actionContext, Chiffrage chiffrage) throws EkipServiceException;
   void ajout ();


}
