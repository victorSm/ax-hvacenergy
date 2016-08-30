package com.vitek.tridium.ax.Enums;

import javax.baja.sys.*;

public final class BLeadLagRotationControl
    extends BFrozenEnum
{
  /*-
   enum BLeadLagRotationControl
   {
     range
     {
       Runtime,
       Datetime,
       Manual,
     }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.vitek.tridium.ax.Enums.BLeadLagRotationControl(2660980945)1.0$ @*/
/* Generated Wed Aug 03 13:55:41 CDT 2016 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for Runtime. */
  public static final int RUNTIME = 0;
  /** Ordinal value for Datetime. */
  public static final int DATETIME = 1;
  /** Ordinal value for Manual. */
  public static final int MANUAL = 2;
  
  /** BLeadLagRotationControl constant for Runtime. */
  public static final BLeadLagRotationControl Runtime = new BLeadLagRotationControl(RUNTIME);
  /** BLeadLagRotationControl constant for Datetime. */
  public static final BLeadLagRotationControl Datetime = new BLeadLagRotationControl(DATETIME);
  /** BLeadLagRotationControl constant for Manual. */
  public static final BLeadLagRotationControl Manual = new BLeadLagRotationControl(MANUAL);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLeadLagRotationControl.class);
  
  /** Factory method with ordinal. */
  public static BLeadLagRotationControl make(int ordinal)
  {
    return (BLeadLagRotationControl)Runtime.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BLeadLagRotationControl make(String tag)
  {
    return (BLeadLagRotationControl)Runtime.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BLeadLagRotationControl(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BLeadLagRotationControl DEFAULT = BLeadLagRotationControl.Runtime;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


}
