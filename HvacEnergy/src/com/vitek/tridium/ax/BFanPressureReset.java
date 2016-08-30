package com.vitek.tridium.ax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

import javax.baja.naming.BOrd;
import javax.baja.status.BStatusBoolean;
import javax.baja.status.BStatusNumeric;
import javax.baja.sys.*;
import javax.baja.sys.Clock.Ticket;
import javax.baja.units.BUnit;

import javax.baja.util.IFuture;
import javax.baja.util.Invocation;


public class BFanPressureReset
    extends BComponent
{
  /*-
   class BFanPressureReset
   {
     properties
     {
     
      Debug:BBoolean
        default{[BBoolean.make("false")]}
      
      RogueZoneDelay: BRelTime
        default{[BRelTime.makeHours(1)]}
        flags{}
      
      RoguePercentThreshold: BDouble
        default{[BDouble.make(100.0)]}
        flags{}
        slotfacets{[ BFacets.makeNumeric(BUnit.getUnit("percent"), 0)]}  
       
      ExecutionRate:BRelTime
        default{[BRelTime.makeSeconds(10)]}
        flags{summary}
             
      DefaultSetpoint: BStatusNumeric
        default{[new BStatusNumeric()]}
        flags{summary}
        slotfacets {[ BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}

      MinStaticPressure_Stp: BStatusNumeric
         default{[new BStatusNumeric() ]}
         flags{ summary }
         slotfacets{[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}
      
      MaxStaticPressure_Stp: BStatusNumeric
         default{[ new BStatusNumeric() ]}
         flags{ summary }
         slotfacets{[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}   
         
      MinResponseRate: BStatusNumeric
         default {[new BStatusNumeric() ]}
         flags { summary }
         slotfacets {[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}
         
      MaxResponseRate: BStatusNumeric
        default {[new BStatusNumeric()]}
        flags{summary}
        slotfacets{[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}   
         
      TrimRate: BStatusNumeric
         default {[ new BStatusNumeric() ]}
         flags {summary}
         slotfacets{[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}
      
      ResponseDamperPosition: BStatusNumeric
        default{[new BStatusNumeric()]}
        flags{summary}
        slotfacets{[BFacets.makeNumeric(BUnit.getUnit("percent"), 4)]} 
      
      TrimDamperPosition: BStatusNumeric
        default{[new BStatusNumeric()]}
        flags{summary}
        slotfacets{[BFacets.makeNumeric(BUnit.getUnit("percent"), 4)]}
        
      RequestsRequiredToRespond:BStatusNumeric
         default {[ new BStatusNumeric() ]}
         flags {summary}
        
      NoOfZones: BDouble
        default{[BDouble.make(0.0)]}
        flags{summary}
          
      Enable: BBoolean
        default{[BBoolean.make("false")]}
        flags{summary}
        slotfacets {[BFacets.makeBoolean("true", "false")]}

      UseTrimDeadband: BBoolean
        default{[BBoolean.make("false")]}
        flags{summary}
    
      FanProof: BStatusBoolean
        default {[new BStatusBoolean()]}
        flags{summary}
        slotfacets {[BFacets.makeBoolean("true", "false")]}
       
      ActiveZoneRequests: BStatusNumeric
        default{[new BStatusNumeric()]}
        flags {summary}
      
      ActiveTrimRequests:BDouble
        default{[BDouble.make(0)]}
      
      ActiveResponseRate: BStatusNumeric
        default{[ new BStatusNumeric() ]}
        flags { summary, readonly } 
        slotfacets {[ BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}
                      
      Out:BStatusNumeric
        default{[new BStatusNumeric()]}
        flags { summary }  
        slotfacets {[ BFacets.makeNumeric( BUnit.getUnit("inches of water"), 4)]}                 
      
      AsyncHandler : BDemoWorker
        default{[new BDemoWorker()]}
        flags{hidden}
     }
     actions
     {
      addZone()
        
      removeZone(name:BString)
        default{[BString.make("zoneName")]}
        
      batchZones()  
      
      enable()
       
      countRequest()
        flags{ async } 
         
      makeList()
        flags{async} 
        
      trim()
       flags{async}
       
      respond()
        flags{async} 
        
      run()
        flags{async, hidden}     
     }
     topics
     {
       RogueZoneEvent: BString
         flags{}
     }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.vitek.tridium.ax.BFanPressureReset(3793271926)1.0$ @*/
/* Generated Wed Aug 03 14:16:31 CDT 2016 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "Debug"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Debug</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getDebug
   * @see com.vitek.tridium.ax.BFanPressureReset#setDebug
   */
  public static final Property Debug = newProperty(0, ((BBoolean)(BBoolean.make("false"))).getBoolean(),null);
  
  /**
   * Get the <code>Debug</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#Debug
   */
  public boolean getDebug() { return getBoolean(Debug); }
  
  /**
   * Set the <code>Debug</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#Debug
   */
  public void setDebug(boolean v) { setBoolean(Debug,v,null); }

////////////////////////////////////////////////////////////////
// Property "RogueZoneDelay"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>RogueZoneDelay</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getRogueZoneDelay
   * @see com.vitek.tridium.ax.BFanPressureReset#setRogueZoneDelay
   */
  public static final Property RogueZoneDelay = newProperty(0, BRelTime.makeHours(1),null);
  
  /**
   * Get the <code>RogueZoneDelay</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#RogueZoneDelay
   */
  public BRelTime getRogueZoneDelay() { return (BRelTime)get(RogueZoneDelay); }
  
  /**
   * Set the <code>RogueZoneDelay</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#RogueZoneDelay
   */
  public void setRogueZoneDelay(BRelTime v) { set(RogueZoneDelay,v,null); }

////////////////////////////////////////////////////////////////
// Property "RoguePercentThreshold"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>RoguePercentThreshold</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getRoguePercentThreshold
   * @see com.vitek.tridium.ax.BFanPressureReset#setRoguePercentThreshold
   */
  public static final Property RoguePercentThreshold = newProperty(0, ((BDouble)(BDouble.make(100.0))).getDouble(),BFacets.makeNumeric(BUnit.getUnit("percent"), 0));
  
  /**
   * Get the <code>RoguePercentThreshold</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#RoguePercentThreshold
   */
  public double getRoguePercentThreshold() { return getDouble(RoguePercentThreshold); }
  
  /**
   * Set the <code>RoguePercentThreshold</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#RoguePercentThreshold
   */
  public void setRoguePercentThreshold(double v) { setDouble(RoguePercentThreshold,v,null); }

////////////////////////////////////////////////////////////////
// Property "ExecutionRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ExecutionRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getExecutionRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setExecutionRate
   */
  public static final Property ExecutionRate = newProperty(Flags.SUMMARY, BRelTime.makeSeconds(10),null);
  
  /**
   * Get the <code>ExecutionRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ExecutionRate
   */
  public BRelTime getExecutionRate() { return (BRelTime)get(ExecutionRate); }
  
  /**
   * Set the <code>ExecutionRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ExecutionRate
   */
  public void setExecutionRate(BRelTime v) { set(ExecutionRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "DefaultSetpoint"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>DefaultSetpoint</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getDefaultSetpoint
   * @see com.vitek.tridium.ax.BFanPressureReset#setDefaultSetpoint
   */
  public static final Property DefaultSetpoint = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>DefaultSetpoint</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#DefaultSetpoint
   */
  public BStatusNumeric getDefaultSetpoint() { return (BStatusNumeric)get(DefaultSetpoint); }
  
  /**
   * Set the <code>DefaultSetpoint</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#DefaultSetpoint
   */
  public void setDefaultSetpoint(BStatusNumeric v) { set(DefaultSetpoint,v,null); }

////////////////////////////////////////////////////////////////
// Property "MinStaticPressure_Stp"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>MinStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getMinStaticPressure_Stp
   * @see com.vitek.tridium.ax.BFanPressureReset#setMinStaticPressure_Stp
   */
  public static final Property MinStaticPressure_Stp = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>MinStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#MinStaticPressure_Stp
   */
  public BStatusNumeric getMinStaticPressure_Stp() { return (BStatusNumeric)get(MinStaticPressure_Stp); }
  
  /**
   * Set the <code>MinStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#MinStaticPressure_Stp
   */
  public void setMinStaticPressure_Stp(BStatusNumeric v) { set(MinStaticPressure_Stp,v,null); }

////////////////////////////////////////////////////////////////
// Property "MaxStaticPressure_Stp"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>MaxStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getMaxStaticPressure_Stp
   * @see com.vitek.tridium.ax.BFanPressureReset#setMaxStaticPressure_Stp
   */
  public static final Property MaxStaticPressure_Stp = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>MaxStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#MaxStaticPressure_Stp
   */
  public BStatusNumeric getMaxStaticPressure_Stp() { return (BStatusNumeric)get(MaxStaticPressure_Stp); }
  
  /**
   * Set the <code>MaxStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#MaxStaticPressure_Stp
   */
  public void setMaxStaticPressure_Stp(BStatusNumeric v) { set(MaxStaticPressure_Stp,v,null); }

////////////////////////////////////////////////////////////////
// Property "MinResponseRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>MinResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getMinResponseRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setMinResponseRate
   */
  public static final Property MinResponseRate = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>MinResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#MinResponseRate
   */
  public BStatusNumeric getMinResponseRate() { return (BStatusNumeric)get(MinResponseRate); }
  
  /**
   * Set the <code>MinResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#MinResponseRate
   */
  public void setMinResponseRate(BStatusNumeric v) { set(MinResponseRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "MaxResponseRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>MaxResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getMaxResponseRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setMaxResponseRate
   */
  public static final Property MaxResponseRate = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>MaxResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#MaxResponseRate
   */
  public BStatusNumeric getMaxResponseRate() { return (BStatusNumeric)get(MaxResponseRate); }
  
  /**
   * Set the <code>MaxResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#MaxResponseRate
   */
  public void setMaxResponseRate(BStatusNumeric v) { set(MaxResponseRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "TrimRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>TrimRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getTrimRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setTrimRate
   */
  public static final Property TrimRate = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>TrimRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#TrimRate
   */
  public BStatusNumeric getTrimRate() { return (BStatusNumeric)get(TrimRate); }
  
  /**
   * Set the <code>TrimRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#TrimRate
   */
  public void setTrimRate(BStatusNumeric v) { set(TrimRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "ResponseDamperPosition"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ResponseDamperPosition</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getResponseDamperPosition
   * @see com.vitek.tridium.ax.BFanPressureReset#setResponseDamperPosition
   */
  public static final Property ResponseDamperPosition = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("percent"), 4));
  
  /**
   * Get the <code>ResponseDamperPosition</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ResponseDamperPosition
   */
  public BStatusNumeric getResponseDamperPosition() { return (BStatusNumeric)get(ResponseDamperPosition); }
  
  /**
   * Set the <code>ResponseDamperPosition</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ResponseDamperPosition
   */
  public void setResponseDamperPosition(BStatusNumeric v) { set(ResponseDamperPosition,v,null); }

////////////////////////////////////////////////////////////////
// Property "TrimDamperPosition"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>TrimDamperPosition</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getTrimDamperPosition
   * @see com.vitek.tridium.ax.BFanPressureReset#setTrimDamperPosition
   */
  public static final Property TrimDamperPosition = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("percent"), 4));
  
  /**
   * Get the <code>TrimDamperPosition</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#TrimDamperPosition
   */
  public BStatusNumeric getTrimDamperPosition() { return (BStatusNumeric)get(TrimDamperPosition); }
  
  /**
   * Set the <code>TrimDamperPosition</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#TrimDamperPosition
   */
  public void setTrimDamperPosition(BStatusNumeric v) { set(TrimDamperPosition,v,null); }

////////////////////////////////////////////////////////////////
// Property "RequestsRequiredToRespond"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>RequestsRequiredToRespond</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getRequestsRequiredToRespond
   * @see com.vitek.tridium.ax.BFanPressureReset#setRequestsRequiredToRespond
   */
  public static final Property RequestsRequiredToRespond = newProperty(Flags.SUMMARY, new BStatusNumeric(),null);
  
  /**
   * Get the <code>RequestsRequiredToRespond</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#RequestsRequiredToRespond
   */
  public BStatusNumeric getRequestsRequiredToRespond() { return (BStatusNumeric)get(RequestsRequiredToRespond); }
  
  /**
   * Set the <code>RequestsRequiredToRespond</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#RequestsRequiredToRespond
   */
  public void setRequestsRequiredToRespond(BStatusNumeric v) { set(RequestsRequiredToRespond,v,null); }

////////////////////////////////////////////////////////////////
// Property "NoOfZones"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>NoOfZones</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getNoOfZones
   * @see com.vitek.tridium.ax.BFanPressureReset#setNoOfZones
   */
  public static final Property NoOfZones = newProperty(Flags.SUMMARY, ((BDouble)(BDouble.make(0.0))).getDouble(),null);
  
  /**
   * Get the <code>NoOfZones</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#NoOfZones
   */
  public double getNoOfZones() { return getDouble(NoOfZones); }
  
  /**
   * Set the <code>NoOfZones</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#NoOfZones
   */
  public void setNoOfZones(double v) { setDouble(NoOfZones,v,null); }

////////////////////////////////////////////////////////////////
// Property "Enable"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Enable</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getEnable
   * @see com.vitek.tridium.ax.BFanPressureReset#setEnable
   */
  public static final Property Enable = newProperty(Flags.SUMMARY, ((BBoolean)(BBoolean.make("false"))).getBoolean(),BFacets.makeBoolean("true", "false"));
  
  /**
   * Get the <code>Enable</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#Enable
   */
  public boolean getEnable() { return getBoolean(Enable); }
  
  /**
   * Set the <code>Enable</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#Enable
   */
  public void setEnable(boolean v) { setBoolean(Enable,v,null); }

////////////////////////////////////////////////////////////////
// Property "UseTrimDeadband"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>UseTrimDeadband</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getUseTrimDeadband
   * @see com.vitek.tridium.ax.BFanPressureReset#setUseTrimDeadband
   */
  public static final Property UseTrimDeadband = newProperty(Flags.SUMMARY, ((BBoolean)(BBoolean.make("false"))).getBoolean(),null);
  
  /**
   * Get the <code>UseTrimDeadband</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#UseTrimDeadband
   */
  public boolean getUseTrimDeadband() { return getBoolean(UseTrimDeadband); }
  
  /**
   * Set the <code>UseTrimDeadband</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#UseTrimDeadband
   */
  public void setUseTrimDeadband(boolean v) { setBoolean(UseTrimDeadband,v,null); }

////////////////////////////////////////////////////////////////
// Property "FanProof"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>FanProof</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getFanProof
   * @see com.vitek.tridium.ax.BFanPressureReset#setFanProof
   */
  public static final Property FanProof = newProperty(Flags.SUMMARY, new BStatusBoolean(),BFacets.makeBoolean("true", "false"));
  
  /**
   * Get the <code>FanProof</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#FanProof
   */
  public BStatusBoolean getFanProof() { return (BStatusBoolean)get(FanProof); }
  
  /**
   * Set the <code>FanProof</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#FanProof
   */
  public void setFanProof(BStatusBoolean v) { set(FanProof,v,null); }

////////////////////////////////////////////////////////////////
// Property "ActiveZoneRequests"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ActiveZoneRequests</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getActiveZoneRequests
   * @see com.vitek.tridium.ax.BFanPressureReset#setActiveZoneRequests
   */
  public static final Property ActiveZoneRequests = newProperty(Flags.SUMMARY, new BStatusNumeric(),null);
  
  /**
   * Get the <code>ActiveZoneRequests</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ActiveZoneRequests
   */
  public BStatusNumeric getActiveZoneRequests() { return (BStatusNumeric)get(ActiveZoneRequests); }
  
  /**
   * Set the <code>ActiveZoneRequests</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ActiveZoneRequests
   */
  public void setActiveZoneRequests(BStatusNumeric v) { set(ActiveZoneRequests,v,null); }

////////////////////////////////////////////////////////////////
// Property "ActiveTrimRequests"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ActiveTrimRequests</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getActiveTrimRequests
   * @see com.vitek.tridium.ax.BFanPressureReset#setActiveTrimRequests
   */
  public static final Property ActiveTrimRequests = newProperty(0, ((BDouble)(BDouble.make(0))).getDouble(),null);
  
  /**
   * Get the <code>ActiveTrimRequests</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ActiveTrimRequests
   */
  public double getActiveTrimRequests() { return getDouble(ActiveTrimRequests); }
  
  /**
   * Set the <code>ActiveTrimRequests</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ActiveTrimRequests
   */
  public void setActiveTrimRequests(double v) { setDouble(ActiveTrimRequests,v,null); }

////////////////////////////////////////////////////////////////
// Property "ActiveResponseRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ActiveResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getActiveResponseRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setActiveResponseRate
   */
  public static final Property ActiveResponseRate = newProperty(Flags.SUMMARY|Flags.READONLY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>ActiveResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ActiveResponseRate
   */
  public BStatusNumeric getActiveResponseRate() { return (BStatusNumeric)get(ActiveResponseRate); }
  
  /**
   * Set the <code>ActiveResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#ActiveResponseRate
   */
  public void setActiveResponseRate(BStatusNumeric v) { set(ActiveResponseRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "Out"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Out</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getOut
   * @see com.vitek.tridium.ax.BFanPressureReset#setOut
   */
  public static final Property Out = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric( BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>Out</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#Out
   */
  public BStatusNumeric getOut() { return (BStatusNumeric)get(Out); }
  
  /**
   * Set the <code>Out</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#Out
   */
  public void setOut(BStatusNumeric v) { set(Out,v,null); }

////////////////////////////////////////////////////////////////
// Property "AsyncHandler"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>AsyncHandler</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getAsyncHandler
   * @see com.vitek.tridium.ax.BFanPressureReset#setAsyncHandler
   */
  public static final Property AsyncHandler = newProperty(Flags.HIDDEN, new BDemoWorker(),null);
  
  /**
   * Get the <code>AsyncHandler</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#AsyncHandler
   */
  public BDemoWorker getAsyncHandler() { return (BDemoWorker)get(AsyncHandler); }
  
  /**
   * Set the <code>AsyncHandler</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#AsyncHandler
   */
  public void setAsyncHandler(BDemoWorker v) { set(AsyncHandler,v,null); }

////////////////////////////////////////////////////////////////
// Action "addZone"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>addZone</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#addZone()
   */
  public static final Action addZone = newAction(0,null);
  
  /**
   * Invoke the <code>addZone</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#addZone
   */
  public void addZone() { invoke(addZone,null,null); }

////////////////////////////////////////////////////////////////
// Action "removeZone"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>removeZone</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#removeZone()
   */
  public static final Action removeZone = newAction(0,BString.make("zoneName"),null);
  
  /**
   * Invoke the <code>removeZone</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#removeZone
   */
  public void removeZone(BString name) { invoke(removeZone,name,null); }

////////////////////////////////////////////////////////////////
// Action "batchZones"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>batchZones</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#batchZones()
   */
  public static final Action batchZones = newAction(0,null);
  
  /**
   * Invoke the <code>batchZones</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#batchZones
   */
  public void batchZones() { invoke(batchZones,null,null); }

////////////////////////////////////////////////////////////////
// Action "enable"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>enable</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#enable()
   */
  public static final Action enable = newAction(0,null);
  
  /**
   * Invoke the <code>enable</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#enable
   */
  public void enable() { invoke(enable,null,null); }

////////////////////////////////////////////////////////////////
// Action "countRequest"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>countRequest</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#countRequest()
   */
  public static final Action countRequest = newAction(Flags.ASYNC,null);
  
  /**
   * Invoke the <code>countRequest</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#countRequest
   */
  public void countRequest() { invoke(countRequest,null,null); }

////////////////////////////////////////////////////////////////
// Action "makeList"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>makeList</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#makeList()
   */
  public static final Action makeList = newAction(Flags.ASYNC,null);
  
  /**
   * Invoke the <code>makeList</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#makeList
   */
  public void makeList() { invoke(makeList,null,null); }

////////////////////////////////////////////////////////////////
// Action "trim"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>trim</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#trim()
   */
  public static final Action trim = newAction(Flags.ASYNC,null);
  
  /**
   * Invoke the <code>trim</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#trim
   */
  public void trim() { invoke(trim,null,null); }

////////////////////////////////////////////////////////////////
// Action "respond"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>respond</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#respond()
   */
  public static final Action respond = newAction(Flags.ASYNC,null);
  
  /**
   * Invoke the <code>respond</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#respond
   */
  public void respond() { invoke(respond,null,null); }

////////////////////////////////////////////////////////////////
// Action "run"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>run</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#run()
   */
  public static final Action run = newAction(Flags.ASYNC|Flags.HIDDEN,null);
  
  /**
   * Invoke the <code>run</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#run
   */
  public void run() { invoke(run,null,null); }

////////////////////////////////////////////////////////////////
// Topic "RogueZoneEvent"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>RogueZoneEvent</code> topic.
   * @see com.vitek.tridium.ax.BFanPressureReset#fireRogueZoneEvent
   */
  public static final Topic RogueZoneEvent = newTopic(0,null);
  
  /**
   * Fire an event for the <code>RogueZoneEvent</code> topic.
   * @see com.vitek.tridium.ax.BFanPressureReset#RogueZoneEvent
   */
  public void fireRogueZoneEvent(BString event) { fire(RogueZoneEvent, event, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BFanPressureReset.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  
//FIELDS
 private ArrayList list = new ArrayList(100);
 private String baseName = "zdp";
 private Ticket ticket = null;

//SYSTEM CALLBACKS
 public void atSteadyState()throws Exception
 {
   super.atSteadyState();

   getOut().setValue(getMinStaticPressure_Stp().getValue()); 
   this.doInvoke(getAction("makeList"), null, null);
   this.doInvoke(getAction("countRequest"), null, null);
   ticket = Clock.schedulePeriodically(this.asComponent(), getExecutionRate(), this.getAction("run"), null);   

 }


//PROPERTY CALLBACKS

 public void added(Property prop, Context cx)
 {
   super.added(prop, cx); 

   if(!this.isRunning()) return;
   if(!Sys.atSteadyState()) return;
   
   doDebug("New Dynamic Prop added...");
   
   if(prop.getName().startsWith(baseName))
   {
     this.doInvoke(makeList, null, null);
     this.doInvoke(this.getAction("countRequest"), null, null);
   }
  
   else
   {
     Property[] dyProps = this.getDynamicPropertiesArray();
    
     if(!this.isRunning()) return;
     if(!Sys.atSteadyState()) return;
     for(int i = 0; i < dyProps.length; i++)
     {
       Slot s = (Slot)dyProps[i];
       if(prop == (Property)s)
       {
         if(s.getName().startsWith("Link"))
         {
           
           String target = (((BLink) ((BObject)get((Property)prop))).getTargetSlotName()); 
           String source = (((BLink) ((BObject)get((Property)prop))).getSourceComponent().getNavParent().getNavParent().getNavName() + "_" + 
                             ((BLink) ((BObject)get((Property)prop))).getSourceComponent().getName());

           doDebug("ZONE TARGET: " + target);
           doDebug("ZONE SOURCE: " + source);
         }      
       }
     }
   }
 }

  public void removed(Property prop, BValue val, Context cx)throws ConcurrentModificationException
  {
   super.removed( prop, val, cx);

   if(!this.isRunning()) return;
   if(!Sys.atSteadyState()) return;
   
   if(prop.getName().startsWith(baseName))
     { 
       doDebug("Zone removed from array of zones");
     }  
   }


//ACTION METHOD CALLS
  public void doAddZone()
  {
    //Add a dynamic slot zone damper position property

    BString nameString = BString.make( baseName + list.size());
    BFacets unitFacets = BFacets.makeNumeric(BUnit.getUnit("percent"),1);

    doDebug("In.doAddZone, list.size  "+ list.size());
  
    this.add(nameString.getString(), BDouble.make(0.0), Flags.SUMMARY, unitFacets);
    //Create method var of type BString to name the new slot; to do so, concatenate the string in instance var "baseName" with the current size of the "list" instance var
  }

  public void doRemoveZone(BString removeString)
  {
    String name = removeString.getString();
    this.remove(name);
    
    for(ListIterator it = list.listIterator(); it.hasNext();)
    {
      String propName = ((Property)it.next()).getName();
      doDebug("it.Next: "+ propName);
      doDebug("it.NextIndex: "+it.nextIndex());
      doDebug("it.PreviousIndex: "+it.previousIndex());
      
      if(name.equalsIgnoreCase(propName))
      {
        list.remove(it.previousIndex());
        doDebug("Removed zone from array list: "+ propName +" at index "+it.previousIndex());
      }
    }
  }
 
  public void doEnable()
  {
    if(getEnable())
    {
      setEnable(false);
      ticket.cancel();
      getOut().setValue(getDefaultSetpoint().getValue());
    }
    else
    {
      setEnable(true);
      getOut().setValue(getDefaultSetpoint().getValue());
      this.doInvoke(makeList, null, null);
      this.doInvoke(countRequest, null, null);
      ticket = Clock.schedulePeriodically(this.asComponent(), getExecutionRate(), this.getAction("run"), null);
    }    
  }
  
  public void doMakeList()
  { 
    Property[] dyProps = this.getDynamicPropertiesArray();
    //Assign an array of all dynamic properties to the method var "dyProps"
  
    doDebug("In.doMakeList(), Dynamic Props   "+ dyProps.length);
    doDebug("In.doMakeList(), List.size  "+ list.size());

    for(int i = 0; i < dyProps.length; i++)
    {
      Slot s = (Slot)dyProps[i];
      //Cast every dynamic property in dyProps to Slot type, then assign it to the loop var "s" of type Slot
      doDebug("In.doMakeList(), in ForLoop, just before if Statement. dyProp element has just been casted to Slot type and assigned to s var  "+ s.getName());
      doDebug("In .doMakeList(), in ForLoop, just befor if Statement. list.size  "+ list.size());
      
      if(s.getName().startsWith(baseName) && !list.contains(s)){
        list.add((Property)s);
        doDebug("In .doMakeList(), in ForLoop just after the list.add(Property s) Statement.   list.size  "+ list.size());
        //if the name of s starts with the instance var "baseName" of type String AND IS NOT an Object already CONTAINED in the list; then add it to
        //the List instance var "list".
        doDebug("In .doMakeList(), in FoorLoop, after the list.add(Property s) Statement.  Found zone damper dynamic slot s  "+s);
      } 
      else
      {
        doDebug("In .doMakeList(), in ForLoop, in else Statement; this dynamic property is not a zone damper slot. List.size is  "+ list.size());
        
      }
     }
   }

  public void doCountRequest()
  {
 
    double zprCount = 0;  
    BStatusNumeric zprOut = new BStatusNumeric((double)zprCount);
    
    doDebug("List size: "+ list.size());
  
    ListIterator it = list.listIterator(list.size());
    
    while(it.hasPrevious()){
      BDouble zdp = (BDouble)((BObject)get((Property)it.previous()));
      if(zdp.getDouble() >= this.getResponseDamperPosition().getValue()){
        zprCount = zprCount + 1;
      }
      doDebug("zdp value:  " + zdp.toString());
     }
    zprOut.setValue(zprCount);
    setActiveZoneRequests(zprOut);
    
    if(this.getUseTrimDeadband()){ countTrimRequests(); }
    
    doDebug("Zone Pressure Request Count:"+ zprCount);  
    doDebug("zpr count method output: "+ zprOut.toString()); 
  }
  
  public void doTrim()
  {
    double out = getOut().getValue(); 
    BStatusNumeric TrimRate = (BStatusNumeric)(BObject)get(this.getProperty("TrimRate"));
    BStatusNumeric minStp = (BStatusNumeric)(BObject)get(this.getProperty("MinStaticPressure_Stp"));
    
    doDebug("In .doTrim(), minStp = "+minStp.getValue());
    doDebug("In .doTrim(), TrimRate = "+TrimRate);
    doDebug("In .doTrim(), out = "+ out);
    
    if(out > minStp.getValue())
    {  
      out = out - TrimRate.getValue();
      getOut().setValue(out);
      doDebug("In .doTrim, final output: "+ out);
    }
    else
    {
      getOut().setValue(minStp.getValue());
    }
  }
  
  public void doRespond()
  {   
    double out = getOut().getValue();
    BStatusNumeric respRate = (BStatusNumeric)(BObject)get(this.getProperty("ActiveResponseRate"));
    BStatusNumeric maxStp = (BStatusNumeric)(BObject)get(this.getProperty("MaxStaticPressure_Stp"));
    
    doDebug("In .doRespond(), maxStp = "+maxStp);
    doDebug("In .doRespond(), respRate = "+respRate);
    doDebug("In .doRespond(), out = "+ out);
    
    if(out < maxStp.getValue())
    {
      out = out + scaleRespRate();
      getOut().setValue(out);
      doDebug("In .doRespond, final method output: "+ out);
    }
    else
    {
      getOut().setValue(maxStp.getValue());
    }
  }
  
  public void doRun() throws IOException
  {
    if(this.getEnable() && this.getFanProof().getValue()== true)
    {
      this.doInvoke(makeList, null, null);
      this.doInvoke(countRequest, null, null);
      this.setNoOfZones((double)list.size());
      
      if(this.getActiveZoneRequests().getValue() >= this.getRequestsRequiredToRespond().getValue())
      {
        this.doInvoke(getAction("respond"), null, null);
        doDebug("In .doRun, call the respond action, there is  "+ getActiveZoneRequests().getValue()+ " zone pressure requests");
        doDebug("In .doRun, getOut().getValue()"+ getOut().getValue());
      }
      else
      {
        if(!this.getUseTrimDeadband())
        {
          this.doInvoke(getAction("trim"),null,null);
          doDebug("In .doRun, call the trim action, there is  "+ getActiveZoneRequests().getValue()+ " zone pressure requests");  
          doDebug("In .doRun, getOut().getValue()"+ getOut().getValue());          
        }
        else{}
      }
    }
  }
  
  
 //METHODS 
  public IFuture post(Action action, BValue argument, Context cx)
  {
    //Get our worker and add the action to our worker as an Invocation.
    //The Invocation object implements Runnable, and allows our action callback to be executed on our background thread.
    Invocation work = new Invocation(this,action,argument,cx);
    this.getAsyncHandler().postWork( work );
    return null;
  }
  
  public double scaleRespRate()
  {
    double outputResponse = 0.0;
    BStatusNumeric output = new BStatusNumeric((double)outputResponse);    
    BStatusNumeric minRate = (BStatusNumeric)(BObject)get(this.getProperty("MinResponseRate"));
    BStatusNumeric maxRate = (BStatusNumeric)(BObject)get(this.getProperty("MaxResponseRate"));
    double maxZpr = (double)list.size();
    double minZpr = 1.0;
    double zprCount = this.getActiveZoneRequests().getValue();

    doDebug("maxZpr: "+ maxZpr);
    doDebug("maxRate: "+ maxRate.getValue());
    doDebug("minRate: "+ minRate.getValue());
    
    if(maxRate.getValue() == minRate.getValue())
    {
      outputResponse = maxRate.getValue();
    }
    else
    {
      outputResponse = ((maxRate.getValue()-minRate.getValue())*(zprCount - minRate.getValue()))/ ((maxZpr - minZpr)+ minRate.getValue());      
    }    
    
    doDebug("In scaleRespRate, outputResponse of type double holds the result of a mathematical expression;  "+ outputResponse);
    
    output.setValue(outputResponse);
    doDebug("In scaledRespRate(), output var of type BStatusNumeric is set to the value held in var output;  " + outputResponse);
    this.setActiveResponseRate(output);
    return outputResponse;
    
  }
  
  public void countTrimRequests()
  {
    double ztrCount = 0;  
    
    doDebug("List size: "+ list.size());
  
    ListIterator it = list.listIterator(list.size());
    
    while(it.hasPrevious()){
      BDouble zdp = (BDouble)((BObject)get((Property)it.previous()));
      if(zdp.getDouble() <= this.getTrimDamperPosition().getValue()){
        ztrCount = ztrCount + 1;
      }
      doDebug(" In countTrimRequests()...zdp value:  " + zdp.toString());
     }
    
    if(ztrCount >= this.getRequestsRequiredToRespond().getValue() && this.getActiveZoneRequests().getValue() <= this.getRequestsRequiredToRespond().getValue())
    {
      this.doInvoke(trim, null, null);
    }
    
    this.setActiveTrimRequests(ztrCount);
    doDebug("Zone Pressure Request Count:"+ ztrCount);       
  }
  
  public void doDebug(String debugOutput)
  {
    if(this.getDebug()){ System.out.println(debugOutput); }    
  }
  
  public void doBatchZones()
  {
    int ZoneQty = (int)this.getNoOfZones();
    for(int i = 0; i < ZoneQty; i++)
    {
      this.invoke(addZone, null, null);
    }
  }
  
  ///CLASS DECLARATION END
  
}
