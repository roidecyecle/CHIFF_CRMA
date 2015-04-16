package com.linedata.ekip.pos.services.entity.crma;

// Generated 27/03/2015 18:23:01 by Ekip Framework Released beta
import com.linedata.ekip.std.xml.bind.AnyTypeAdapter;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.linedata.ekip.std.services.core.entity.EntityReference;
import com.linedata.ekip.pos.services.entity.crma.impl.ChiffrageReferenceImpl;


@XmlSeeAlso(ChiffrageReferenceImpl.class)
@XmlJavaTypeAdapter(AnyTypeAdapter.class)
public interface ChiffrageReference extends EntityReference
{
   String BEANID = "ChiffrageReference";
      
   

   /**
    * Returns id : Id
    * 
    * @return id
    */
   Integer getId();

   /**
    * Sets id : Id
    * 
    * @param id
    */
   void setId(Integer id);
      
}
