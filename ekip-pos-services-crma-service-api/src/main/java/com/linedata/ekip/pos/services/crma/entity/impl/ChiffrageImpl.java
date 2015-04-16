package com.linedata.ekip.pos.services.crma.entity.impl;

// Generated 27/03/2015 18:23:01 by Ekip Framework Released beta


import javax.xml.bind.annotation.XmlType;

import com.linedata.ekip.pos.services.crma.entity.Chiffrage;
import com.linedata.ekip.pos.services.entity.crma.impl.ChiffrageReferenceImpl;

@XmlType(name = "Chiffrage")
public class ChiffrageImpl extends ChiffrageReferenceImpl implements Chiffrage
{

   
   
   /**
    * Label
    */
   private String label;
   
   
   
   /**
    * Product
    */
   private String produit;
   
   


   /**
    * Returns label : Label
    * 
    * @return label
    */
   public String getLabel()
   {
      return this.label;
   }

   /**
    * Sets label : Label
    * 
    * @param label
    */
   public void setLabel(String label)
   {
      this.label      = label;
   } 
      

   /**
    * Returns produit : Product
    * 
    * @return produit
    */
   public String getProduit()
   {
      return this.produit;
   }

   /**
    * Sets produit : Product
    * 
    * @param produit
    */
   public void setProduit(String produit)
   {
      this.produit      = produit;
   } 
      
   
}
