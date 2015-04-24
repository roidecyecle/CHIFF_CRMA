package com.linedata.ekip.pos.services.crma.entity;

// Generated 27/03/2015 18:23:01 by Ekip Framework Released beta
import com.linedata.ekip.std.xml.bind.AnyTypeAdapter;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.linedata.ekip.std.services.core.entity.Entity;
import com.linedata.ekip.pos.services.entity.crma.ChiffrageReference;
import com.linedata.ekip.pos.services.crma.entity.impl.ChiffrageImpl;


@XmlSeeAlso(ChiffrageImpl.class)
@XmlJavaTypeAdapter(AnyTypeAdapter.class)
public interface Chiffrage extends Entity, ChiffrageReference
{
   String BEANID = "Chiffrage";
         

   /**
    * 

 label : Label
    * 
    * @return label
    */
   String getLabel();

   /**
    * Sets label : Label
    * 
    * @param label
    */
   void setLabel(String label);
      

   /**
    * Return produit : Product
    * 
    * @return produit
    */
   String getProduit();

   /**
    * Sets produit : Product
    * 
    * @param produit
    */
   void setProduit(String produit);
      
}
