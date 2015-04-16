package com.linedata.ekip.pos.services.entity.crma.impl;

// Generated 27/03/2015 18:23:02 by Ekip Framework Released beta
import javax.xml.bind.annotation.XmlType;

import com.linedata.ekip.pos.services.entity.crma.ChiffrageReference;
import com.linedata.ekip.std.services.core.entity.impl.EntityReferenceImpl;


@XmlType(name = "ChiffrageReference")
public class ChiffrageReferenceImpl extends EntityReferenceImpl implements ChiffrageReference
{

   
   
   /**
    * Id
    */
   private Integer id;
   
   


   /**
    * Returns id : Id
    * 
    * @return id
    */
   public Integer getId()
   {
      return this.id;
   }

   /**
    * Sets id : Id
    * 
    * @param id
    */
   public void setId(Integer id)
   {
      this.id      = id;
   } 
      
   
   @Override
   public String getExternalId()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public String getFactoryBeanId()
   {
      return "ChiffrageReferenceFactory";
   }

   @Override
   public String getInternalId()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public String getWorkflowEntityCodification()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public boolean isValid()
   {
      return false;
   }
}
