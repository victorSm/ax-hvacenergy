package com.vitek.tridium.ax;
/**
 * Author: Victor Smolinski
 * Date: 8/8/2016
 * 
 * Object used to control lead lag operation in a redundant or modular way with options for manual or fully
 * automated control.
 * 
 * */
import javax.baja.sys.*;
import javax.baja.util.IFuture;
import javax.baja.util.Invocation;

import com.vitek.tridium.ax.Enums.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class BLeadLagControl
    extends BComponent
{
  /*-
   class BLeadLagControl
   {
     properties
     {
      AsyncHandler : BDemoWorker
        default{[new BDemoWorker()]}
        flags{hidden}
             
        Debug:BBoolean
          default{[BBoolean.make(false)]}
          flags{summary}
          
        Enabled: BBoolean
          default{[BBoolean.make(false)]}
          flags{summary, readonly}
          
        NofStages:BDouble
          default{[BDouble.make(0)]}
          flags{summary}
          
        CsvTags:BString
          default{[BString.make("")]}
          flags{summary}
          
        IsModular:BBoolean
          default{[BBoolean.make(false)]}
          flags{summary}
          
        SwapRuntime:BRelTime
          default{[BRelTime.makeHours(48)]}
          flags{summary}
        
        SwapDate:BAbsTime
          default{[BAbsTime.make()]}
          flags{summary}
        
        StageFailDelay:BRelTime
          default{[BRelTime.makeSeconds(60)]}
          flags{summary}
          
        InterstageDelay: BRelTime
          default{[BRelTime.makeSeconds(10)]}
          flags{summary}
       
        ExecutionRate:BRelTime
          default{[BRelTime.makeSeconds(10)]}
          flags{summary}
        
        RotationControl:BLeadLagRotationControl
          default{[BLeadLagRotationControl.Datetime]}
          flags{summary}
        
        ActiveLeadStage:BString
          default{[BString.make("")]}
          flags{summary, readonly}
        
        ActiveRunningStages:BDouble
          default{[BDouble.make(0)]}
          flags{summary, readonly}
          
        RuntimeStatus:BString
          default{[BString.make("")]}
          flags{summary, readonly}
     }
     actions
     {
       Run()
         flags{hidden, async}
       CheckFailState(propName:BString)
         default{[BString.make("")]}
         flags{hidden}
       Enable()  
       ManualRotate()
       ManualStageOn()
       ManualStageOff()
       AllResetRuntime()  
     }
     topics
     {
       Alarm:BString
         flags{summary}         
     }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.vitek.tridium.ax.BLeadLagControl(2440049658)1.0$ @*/
/* Generated Sun Aug 07 15:29:05 CDT 2016 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "AsyncHandler"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>AsyncHandler</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getAsyncHandler
   * @see com.vitek.tridium.ax.BLeadLagControl#setAsyncHandler
   */
  public static final Property AsyncHandler = newProperty(Flags.HIDDEN, new BDemoWorker(),null);
  
  /**
   * Get the <code>AsyncHandler</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#AsyncHandler
   */
  public BDemoWorker getAsyncHandler() { return (BDemoWorker)get(AsyncHandler); }
  
  /**
   * Set the <code>AsyncHandler</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#AsyncHandler
   */
  public void setAsyncHandler(BDemoWorker v) { set(AsyncHandler,v,null); }

////////////////////////////////////////////////////////////////
// Property "Debug"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Debug</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getDebug
   * @see com.vitek.tridium.ax.BLeadLagControl#setDebug
   */
  public static final Property Debug = newProperty(Flags.SUMMARY, ((BBoolean)(BBoolean.make(false))).getBoolean(),null);
  
  /**
   * Get the <code>Debug</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#Debug
   */
  public boolean getDebug() { return getBoolean(Debug); }
  
  /**
   * Set the <code>Debug</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#Debug
   */
  public void setDebug(boolean v) { setBoolean(Debug,v,null); }

////////////////////////////////////////////////////////////////
// Property "Enabled"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Enabled</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getEnabled
   * @see com.vitek.tridium.ax.BLeadLagControl#setEnabled
   */
  public static final Property Enabled = newProperty(Flags.SUMMARY|Flags.READONLY, ((BBoolean)(BBoolean.make(false))).getBoolean(),null);
  
  /**
   * Get the <code>Enabled</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#Enabled
   */
  public boolean getEnabled() { return getBoolean(Enabled); }
  
  /**
   * Set the <code>Enabled</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#Enabled
   */
  public void setEnabled(boolean v) { setBoolean(Enabled,v,null); }

////////////////////////////////////////////////////////////////
// Property "NofStages"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>NofStages</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getNofStages
   * @see com.vitek.tridium.ax.BLeadLagControl#setNofStages
   */
  public static final Property NofStages = newProperty(Flags.SUMMARY, ((BDouble)(BDouble.make(0))).getDouble(),null);
  
  /**
   * Get the <code>NofStages</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#NofStages
   */
  public double getNofStages() { return getDouble(NofStages); }
  
  /**
   * Set the <code>NofStages</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#NofStages
   */
  public void setNofStages(double v) { setDouble(NofStages,v,null); }

////////////////////////////////////////////////////////////////
// Property "CsvTags"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>CsvTags</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getCsvTags
   * @see com.vitek.tridium.ax.BLeadLagControl#setCsvTags
   */
  public static final Property CsvTags = newProperty(Flags.SUMMARY, ((BString)(BString.make(""))).getString(),null);
  
  /**
   * Get the <code>CsvTags</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#CsvTags
   */
  public String getCsvTags() { return getString(CsvTags); }
  
  /**
   * Set the <code>CsvTags</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#CsvTags
   */
  public void setCsvTags(String v) { setString(CsvTags,v,null); }

////////////////////////////////////////////////////////////////
// Property "IsModular"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>IsModular</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getIsModular
   * @see com.vitek.tridium.ax.BLeadLagControl#setIsModular
   */
  public static final Property IsModular = newProperty(Flags.SUMMARY, ((BBoolean)(BBoolean.make(false))).getBoolean(),null);
  
  /**
   * Get the <code>IsModular</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#IsModular
   */
  public boolean getIsModular() { return getBoolean(IsModular); }
  
  /**
   * Set the <code>IsModular</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#IsModular
   */
  public void setIsModular(boolean v) { setBoolean(IsModular,v,null); }

////////////////////////////////////////////////////////////////
// Property "SwapRuntime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SwapRuntime</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getSwapRuntime
   * @see com.vitek.tridium.ax.BLeadLagControl#setSwapRuntime
   */
  public static final Property SwapRuntime = newProperty(Flags.SUMMARY, BRelTime.makeHours(48),null);
  
  /**
   * Get the <code>SwapRuntime</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#SwapRuntime
   */
  public BRelTime getSwapRuntime() { return (BRelTime)get(SwapRuntime); }
  
  /**
   * Set the <code>SwapRuntime</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#SwapRuntime
   */
  public void setSwapRuntime(BRelTime v) { set(SwapRuntime,v,null); }

////////////////////////////////////////////////////////////////
// Property "SwapDate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SwapDate</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getSwapDate
   * @see com.vitek.tridium.ax.BLeadLagControl#setSwapDate
   */
  public static final Property SwapDate = newProperty(Flags.SUMMARY, BAbsTime.make(),null);
  
  /**
   * Get the <code>SwapDate</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#SwapDate
   */
  public BAbsTime getSwapDate() { return (BAbsTime)get(SwapDate); }
  
  /**
   * Set the <code>SwapDate</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#SwapDate
   */
  public void setSwapDate(BAbsTime v) { set(SwapDate,v,null); }

////////////////////////////////////////////////////////////////
// Property "StageFailDelay"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>StageFailDelay</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getStageFailDelay
   * @see com.vitek.tridium.ax.BLeadLagControl#setStageFailDelay
   */
  public static final Property StageFailDelay = newProperty(Flags.SUMMARY, BRelTime.makeSeconds(60),null);
  
  /**
   * Get the <code>StageFailDelay</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#StageFailDelay
   */
  public BRelTime getStageFailDelay() { return (BRelTime)get(StageFailDelay); }
  
  /**
   * Set the <code>StageFailDelay</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#StageFailDelay
   */
  public void setStageFailDelay(BRelTime v) { set(StageFailDelay,v,null); }

////////////////////////////////////////////////////////////////
// Property "InterstageDelay"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>InterstageDelay</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getInterstageDelay
   * @see com.vitek.tridium.ax.BLeadLagControl#setInterstageDelay
   */
  public static final Property InterstageDelay = newProperty(Flags.SUMMARY, BRelTime.makeSeconds(10),null);
  
  /**
   * Get the <code>InterstageDelay</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#InterstageDelay
   */
  public BRelTime getInterstageDelay() { return (BRelTime)get(InterstageDelay); }
  
  /**
   * Set the <code>InterstageDelay</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#InterstageDelay
   */
  public void setInterstageDelay(BRelTime v) { set(InterstageDelay,v,null); }

////////////////////////////////////////////////////////////////
// Property "ExecutionRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ExecutionRate</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getExecutionRate
   * @see com.vitek.tridium.ax.BLeadLagControl#setExecutionRate
   */
  public static final Property ExecutionRate = newProperty(Flags.SUMMARY, BRelTime.makeSeconds(10),null);
  
  /**
   * Get the <code>ExecutionRate</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#ExecutionRate
   */
  public BRelTime getExecutionRate() { return (BRelTime)get(ExecutionRate); }
  
  /**
   * Set the <code>ExecutionRate</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#ExecutionRate
   */
  public void setExecutionRate(BRelTime v) { set(ExecutionRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "RotationControl"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>RotationControl</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getRotationControl
   * @see com.vitek.tridium.ax.BLeadLagControl#setRotationControl
   */
  public static final Property RotationControl = newProperty(Flags.SUMMARY, BLeadLagRotationControl.Datetime,null);
  
  /**
   * Get the <code>RotationControl</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#RotationControl
   */
  public BLeadLagRotationControl getRotationControl() { return (BLeadLagRotationControl)get(RotationControl); }
  
  /**
   * Set the <code>RotationControl</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#RotationControl
   */
  public void setRotationControl(BLeadLagRotationControl v) { set(RotationControl,v,null); }

////////////////////////////////////////////////////////////////
// Property "ActiveLeadStage"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ActiveLeadStage</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getActiveLeadStage
   * @see com.vitek.tridium.ax.BLeadLagControl#setActiveLeadStage
   */
  public static final Property ActiveLeadStage = newProperty(Flags.SUMMARY|Flags.READONLY, ((BString)(BString.make(""))).getString(),null);
  
  /**
   * Get the <code>ActiveLeadStage</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#ActiveLeadStage
   */
  public String getActiveLeadStage() { return getString(ActiveLeadStage); }
  
  /**
   * Set the <code>ActiveLeadStage</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#ActiveLeadStage
   */
  public void setActiveLeadStage(String v) { setString(ActiveLeadStage,v,null); }

////////////////////////////////////////////////////////////////
// Property "ActiveRunningStages"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ActiveRunningStages</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getActiveRunningStages
   * @see com.vitek.tridium.ax.BLeadLagControl#setActiveRunningStages
   */
  public static final Property ActiveRunningStages = newProperty(Flags.SUMMARY|Flags.READONLY, ((BDouble)(BDouble.make(0))).getDouble(),null);
  
  /**
   * Get the <code>ActiveRunningStages</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#ActiveRunningStages
   */
  public double getActiveRunningStages() { return getDouble(ActiveRunningStages); }
  
  /**
   * Set the <code>ActiveRunningStages</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#ActiveRunningStages
   */
  public void setActiveRunningStages(double v) { setDouble(ActiveRunningStages,v,null); }

////////////////////////////////////////////////////////////////
// Property "RuntimeStatus"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>RuntimeStatus</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#getRuntimeStatus
   * @see com.vitek.tridium.ax.BLeadLagControl#setRuntimeStatus
   */
  public static final Property RuntimeStatus = newProperty(Flags.SUMMARY|Flags.READONLY, ((BString)(BString.make(""))).getString(),null);
  
  /**
   * Get the <code>RuntimeStatus</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#RuntimeStatus
   */
  public String getRuntimeStatus() { return getString(RuntimeStatus); }
  
  /**
   * Set the <code>RuntimeStatus</code> property.
   * @see com.vitek.tridium.ax.BLeadLagControl#RuntimeStatus
   */
  public void setRuntimeStatus(String v) { setString(RuntimeStatus,v,null); }

////////////////////////////////////////////////////////////////
// Action "Run"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Run</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#Run()
   */
  public static final Action Run = newAction(Flags.HIDDEN|Flags.ASYNC,null);
  
  /**
   * Invoke the <code>Run</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#Run
   */
  public void Run() { invoke(Run,null,null); }

////////////////////////////////////////////////////////////////
// Action "CheckFailState"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>CheckFailState</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#CheckFailState()
   */
  public static final Action CheckFailState = newAction(Flags.HIDDEN,BString.make(""),null);
  
  /**
   * Invoke the <code>CheckFailState</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#CheckFailState
   */
  public void CheckFailState(BString propName) { invoke(CheckFailState,propName,null); }

////////////////////////////////////////////////////////////////
// Action "Enable"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Enable</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#Enable()
   */
  public static final Action Enable = newAction(0,null);
  
  /**
   * Invoke the <code>Enable</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#Enable
   */
  public void Enable() { invoke(Enable,null,null); }

////////////////////////////////////////////////////////////////
// Action "ManualRotate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ManualRotate</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#ManualRotate()
   */
  public static final Action ManualRotate = newAction(0,null);
  
  /**
   * Invoke the <code>ManualRotate</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#ManualRotate
   */
  public void ManualRotate() { invoke(ManualRotate,null,null); }

////////////////////////////////////////////////////////////////
// Action "ManualStageOn"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ManualStageOn</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#ManualStageOn()
   */
  public static final Action ManualStageOn = newAction(0,null);
  
  /**
   * Invoke the <code>ManualStageOn</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#ManualStageOn
   */
  public void ManualStageOn() { invoke(ManualStageOn,null,null); }

////////////////////////////////////////////////////////////////
// Action "ManualStageOff"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ManualStageOff</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#ManualStageOff()
   */
  public static final Action ManualStageOff = newAction(0,null);
  
  /**
   * Invoke the <code>ManualStageOff</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#ManualStageOff
   */
  public void ManualStageOff() { invoke(ManualStageOff,null,null); }

////////////////////////////////////////////////////////////////
// Action "AllResetRuntime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>AllResetRuntime</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#AllResetRuntime()
   */
  public static final Action AllResetRuntime = newAction(0,null);
  
  /**
   * Invoke the <code>AllResetRuntime</code> action.
   * @see com.vitek.tridium.ax.BLeadLagControl#AllResetRuntime
   */
  public void AllResetRuntime() { invoke(AllResetRuntime,null,null); }

////////////////////////////////////////////////////////////////
// Topic "Alarm"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Alarm</code> topic.
   * @see com.vitek.tridium.ax.BLeadLagControl#fireAlarm
   */
  public static final Topic Alarm = newTopic(Flags.SUMMARY,null);
  
  /**
   * Fire an event for the <code>Alarm</code> topic.
   * @see com.vitek.tridium.ax.BLeadLagControl#Alarm
   */
  public void fireAlarm(BString event) { fire(Alarm, event, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLeadLagControl.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  ///FIELDS////////////////////////////////////////////////////////
  
  Clock.Ticket executionTicket = null;
  
  private ArrayList CommandOutputs = new ArrayList(20);
  private ArrayList RuntimeOutputs = new ArrayList(20);
  private ArrayList StatusInputs = new ArrayList(20);
  
  private BEnumRange Range = null;
  private BDynamicEnum StagesEnum = null;
  private boolean isLeadOn = false;
  private BRelTime leadRuntime = BRelTime.makeSeconds(0);
  private long lastSwapDate = 0;
  
  public void setLastSwapDate(long paramSwapDate){
    lastSwapDate = paramSwapDate;
  }
  public long getLastSwapDate(){
    return lastSwapDate;
  }
  
  public void setLeadRuntime(BRelTime paramLeadRuntime){
    leadRuntime = paramLeadRuntime;
  }
  public BRelTime getLeadRuntime(){
    return leadRuntime;
  }
  
  ///CALLBACKS/////////////////////////////////////////////////////
  
  public void atSteadyState()throws Exception{
    super.atSteadyState();
    executionTicket = Clock.schedulePeriodically(this.asComponent(), getExecutionRate(), Run, null);
  }
  
  public void added(Property prop, Context cx){
    super.added(prop, cx);
    if(!this.isRunning() || !Sys.atSteadyState())return;
    
    
  }
  
  public void removed(Property prop, BValue val,  Context cx)throws ConcurrentModificationException{
    super.removed(prop, val, cx);
    if(!this.isRunning() || !Sys.atSteadyState())return;
    
    
    
  }
  
  public void changed(Property prop, Context cx){
    super.changed(prop, cx);
    if(!this.isRunning() || !Sys.atSteadyState())return;
    
    if(prop.getName().endsWith("_Cmd") || prop.getName().endsWith("_Status")){
      debug("IN CHANGED()...Command or Status Property has changed..."+ prop.getName());
      startFailTimer(prop.getName());
    }
  }
  
  ///ACTIONS/////////////////////////////////////////////////////
  
  public void doRun(){
    
    postRuntime();
    Rotation();
    if(getIsModular()){
      Staging();
    }
  }
  
  public void doCheckFailState(BString name){
    if(name.getString().endsWith("_Status")){
      for(ListIterator it = CommandOutputs.listIterator(); it.hasNext();){
        Property cmdprop = this.getProperty((String)it.next());
        if(cmdprop.getName().startsWith(name.getString().substring(0, name.getString().indexOf("_")))){
          try{
            Property prop = getProperty(name.getString()); 
            
            debug("Command: "+cmdprop.getName());
            debug("Status: "+name.getString());
            
            if(getBoolean(prop) && !getBoolean(cmdprop)){
              debug("BROKEN STATUS SWITCH---"+name.getString()+"IS STILL ON, BUT COMMAND OUTUPUT "+cmdprop.getName()+" HAS TURNED OFF...");
              this.fireAlarm(BString.make("BROKEN STATUS SWITCH---"+name.getString()+"IS STILL ON, BUT COMMAND OUTUPUT "+cmdprop.getName()+" HAS TURNED OFF..."));              
            }
            else if(!getBoolean(prop) && getBoolean(cmdprop)){
              debug("FAULT STATE---COMMAND OUTUPUT "+cmdprop.getName()+" IS STILL ON, BUT STATUS SWITCH "+name.getString()+" HAS TURNED OFF...");
              this.fireAlarm(BString.make("FAULT STATE---COMMAND OUTUPUT "+cmdprop.getName()+" IS STILL ON, BUT STATUS SWITCH "+name.getString()+" HAS TURNED OFF..."));
              if(!getIsModular()){ this.invoke(ManualRotate, null); }

              else{}//TODO IF IT'S MODULAR....//////////////////////---------------..........

            } 
            else if(getBoolean(prop) && getBoolean(cmdprop)){
              debug("status and cmd transitioned to the ON state properly in CheckFailState..."+prop.getName()+": "+getBoolean(prop)+"..."+cmdprop.getName()+": "+getBoolean(cmdprop));
            }
            else if(!getBoolean(prop) && !getBoolean(cmdprop)){
              debug("status and cmd transitioned to the OFF state properly in CheckFailState..."+prop.getName()+": "+getBoolean(prop)+"..."+cmdprop.getName()+": "+getBoolean(cmdprop));
            }
            else{ debug("Invalid status-cmd comparison in CheckFailState..."+prop.getName()+": "+getBoolean(prop)+"..."+cmdprop.getName()+": "+getBoolean(cmdprop)); }
          }catch(NullPointerException npe){debug("NullPointerException in CheckFailState....");}          
        }
      }
    }else if(name.getString().endsWith("_Cmd")){
      if(name.getString().endsWith("_Cmd")){
        for(ListIterator it = StatusInputs.listIterator(); it.hasNext();){
          
          Property stprop = this.getProperty((String)it.next());
          if(stprop.getName().startsWith(name.getString().substring(0, name.getString().indexOf("_")))){
            try{
              Property prop = getProperty(name.getString());
              
              debug("Status: "+stprop.getName());
              debug("Command: "+name.getString());
              
              if(getBoolean(prop) && !getBoolean(stprop)){
                debug("FAULT STATE---COMMAND OUTUPUT "+stprop.getName()+" IS STILL ON, BUT STATUS SWITCH "+name.getString()+" HAS TURNED OFF...");
                this.fireAlarm(BString.make("FAULT STATE---COMMAND OUTUPUT "+stprop.getName()+" IS STILL ON, BUT STATUS SWITCH "+name.getString()+" HAS TURNED OFF..."));
                if(!getIsModular()){ this.invoke(ManualRotate, null); }

                else{}//TODO IF IT'S MODULAR....////////////////////////////////////----------...........
                
              }
              else if(!getBoolean(prop) && getBoolean(stprop)){
                debug("BROKEN STATUS SWITCH---"+name.getString()+"IS STILL ON, BUT COMMAND OUTUPUT "+stprop.getName()+" HAS TURNED OFF...");
                this.fireAlarm(BString.make("BROKEN STATUS SWITCH---"+name.getString()+"IS STILL ON, BUT COMMAND OUTUPUT "+stprop.getName()+" HAS TURNED OFF..."));
              } 
              else if(getBoolean(prop) && getBoolean(stprop)){
                debug("status and cmd transitioned to the ON state properly in CheckFailState..."+prop.getName()+": "+getBoolean(prop)+"..."+stprop.getName()+": "+getBoolean(stprop));
              }
              else if(!getBoolean(prop) && !getBoolean(stprop)){
                debug("status and cmd transitioned to the OFF state properly in CheckFailState..."+prop.getName()+": "+getBoolean(prop)+"..."+stprop.getName()+": "+getBoolean(stprop));
              }
              else{
                debug("Invalid status-cmd comparison in CheckFailState..."+prop.getName()+": "+getBoolean(prop)+"..."+stprop.getName()+": "+getBoolean(stprop));
              }
            }catch(NullPointerException npe){debug("NullPointerException in CheckFailState....");} 
          }
        }
      }
    }else{ debug("Invalid Input Status or Output Cmd....in CheckFailState(propName)"); }
  }
  
  public void doEnable(){
    if(getEnabled()){
      setEnabled(false);
      setRuntimeStatus("DISABLED");
      
      for(ListIterator it = CommandOutputs.listIterator(); it.hasNext();){
        Property prop = this.getProperty((String)it.next());
        setBoolean(prop, false);
      }
      executionTicket.cancel();
    }
    else{
      try{
        if(getProperty("Stages").isDynamic()){ debug("Dynamic Enum and other dynamic props are already loaded, re-enabled object..."); }
      }catch(NullPointerException npe){
        debug("Generated dynamic enum, and derived command outputs, and status inputs...");
        generateProps();
      }  
      setEnabled(true);
      executionTicket = Clock.schedulePeriodically(this.asComponent(), getExecutionRate(), Run, null);
    }
  }
  
  public void doManualRotate(){ 
    int maxKey = (int)(getNofStages()-1);
    
    if(getKey() < maxKey){ 
      this.set(getProperty("Stages"), getEnumVal(getKey()+1));
      debug("In ManualRotate()..."+getKey()+" is less than "+maxKey+" EnumVal: "+getEnumVal(getKey()+1).toDataValue().toString());
    }
    else{ 
      this.set(getProperty("Stages"), getEnumVal(0));
      this.setActiveLeadStage(getEnumVal(0).toDataValue().toString());
      debug("In ManualRotate()..."+getKey()+" is NOT less than "+maxKey+" EnumVal: "+getEnumVal(0).toDataValue().toString());
    }
    this.setActiveLeadStage(getStages().toString());
    
    if(getIsModular()){
      ////////IF IS MODULAR..................TODO..........////////////////////-------------.............
    }
    else{
      for(ListIterator it = CommandOutputs.listIterator(); it.hasNext();){
        Property prop = this.getProperty((String)it.next());
        debug("In ManualRotate()...cmd "+prop.getName()+"is "+getBoolean(prop));
        
        if(getBoolean(prop)){
          isLeadOn = true;
          this.set(prop, BBoolean.make(false));
          Clock.schedule(this.asComponent(), getInterstageDelay(), ManualStageOn, null);
        }
      }
      if(isLeadOn != true){
        debug("isLeadOn is "+isLeadOn);
        isLeadOn = true;
        Clock.schedule(this.asComponent(), getInterstageDelay(), ManualStageOn, null);
      } 
    }
  }
  
  public void doManualStageOn(){    
    try{      
      for(ListIterator it = CommandOutputs.listIterator(); it.hasNext();){
        Property prop = this.getProperty((String)it.next());
        String activeTag = getVal()+"_Cmd";
        
        debug("ActiveTag: "+activeTag+"\n"+"Prop: "+prop.getName());
        
        if(prop.getName().equalsIgnoreCase(activeTag)){
          this.setBoolean(prop, true);
        }
      }     
    }
    catch(NullPointerException npe){debug("NullPointerException...in ManualStageOn()...");}  
  }
   
  public void doManualStageOff(){
    try{      
      for(ListIterator it = CommandOutputs.listIterator(); it.hasNext();){
        Property prop = this.getProperty((String)it.next());
        String activeTag = getVal()+"_Cmd";
        
        debug("ActiveTag: "+activeTag+"\n"+"Prop: "+prop.getName());
        
        if(prop.getName().equalsIgnoreCase(activeTag)){
          this.setBoolean(prop, false);
        }
      }     
    }
    catch(NullPointerException npe){debug("NullPointerException...in ManualStageOff()...");}
  }
  
  public void doAllResetRuntime(){
    for(ListIterator it = RuntimeOutputs.listIterator(); it.hasNext();){
      Property prop = getProperty((String)it.next());
      this.set(prop, BRelTime.makeSeconds(0));
    }
  }
  
  ///METHODS/////////////////////////////////////////////////////
  
  public void debug(String debugOutput){
    if(this.getDebug()){ System.out.println(debugOutput); }    
  }
  
  public void generateProps(){
    if(!getCsvTags().equalsIgnoreCase("")){
      
      int stageCount = (int)getNofStages();
      boolean isEmpty = false;
      String[] TagsArray = Csv2Array(getCsvTags(),",");
      
      debug("TagsArray size: "+TagsArray.length);

      for(int s = 0; s < TagsArray.length; s++ ){      
        if(TagsArray[s].equalsIgnoreCase("")){
          isEmpty = true;
        }
      }
      if(isEmpty != true){        
        Range = BEnumRange.make(TagsArray);
        StagesEnum = BDynamicEnum.make(stageCount, Range);
        this.add("Stages", StagesEnum, Flags.SUMMARY);
        
        for(int i = 0; i < TagsArray.length; i++){
          String statName = Range.getTag(i)+"_Status";
          String cmdName = Range.getTag(i)+"_Cmd";
          String rtimeName = Range.getTag(i)+"_Runtime";
          this.add(statName, BBoolean.make(false), Flags.SUMMARY);
          this.add(cmdName, BBoolean.make(false), Flags.SUMMARY);
          this.add(rtimeName, BRelTime.makeSeconds(0), Flags.SUMMARY);
          StatusInputs.add(statName);
          CommandOutputs.add(cmdName);
          RuntimeOutputs.add(rtimeName);
          debug("tag: "+Range.getTag(i));
        }
      }
    }
    else{
      setRuntimeStatus("ENTER ENUM TAGS IN CSV FORMAT IN THE 'CsvTags' SLOT");
      debug("ENTER ENUM TAGS IN CSV FORMAT IN THE 'CsvTags' SLOT");
    } 
  }
  
  public void Rotation(){
    //debug("Rotation Control Tag: "+getRotationControl().getTag()+" Ordinal: "+getRotationControl().getOrdinal());
    
    switch(getRotationControl().getOrdinal()){
      
      case 0:
        //runtime
        setRuntimeStatus("RUNTIME CONTROL MODE");
        debug("In Rotation(), RUNTIME CONTROL MODE is processed...");
        debug("Current Lead stage's running time: "+ getLeadRuntime().getSeconds());
        debug("Swap Time in seconds: "+getSwapRuntime().getSeconds());

        if( getSwapRuntime().getSeconds() < getLeadRuntime().getSeconds() +10 && getSwapRuntime().getSeconds() > getLeadRuntime().getSeconds() -10 ){
          this.invoke(ManualRotate, null);
          BRelTime param =BRelTime.makeSeconds(0);
          setLeadRuntime(param);
          debug("if statement tests TRUE... and was processed...");
        }
        else{ 
          debug("if statement tests FALSE... and was NOT processed..."); 
          BRelTime param = BRelTime.makeSeconds(getLeadRuntime().getSeconds() + getExecutionRate().getSeconds()); 
          setLeadRuntime(param);
          }
        break;
        
      case 1:
        //datetime  
        BAbsTime Now = BAbsTime.now();
        long dateMilis = getSwapDate().getMillis();
        long nowMilis = Now.getMillis();
        
        setRuntimeStatus("DATETIME CONTROL MODE");
        
        debug("In Rotation(), DATIME CONTROL MODE is processed...");
        debug("Last Swap Date: "+BAbsTime.make(getLastSwapDate()));
        debug("SwapDate: "+getSwapDate());
        debug("Time Now: "+Now);
        debug("Last Swap Date in Milis: "+getLastSwapDate());        
        debug("SwapDate in Milis: "+dateMilis);
        debug("Time Now in Milis: "+ nowMilis);
        
        if(getSwapDate().getMillis() > getLastSwapDate()+60000 ){
          if(nowMilis <= dateMilis + 10000 && nowMilis >= dateMilis -10000){
            this.invoke(ManualRotate, null);
            debug("if statement tests TRUE...and was processed...");
            setLastSwapDate(getSwapDate().getMillis());
          }
          else{ debug("if statement tests FALSE...and is NOT processed..."); }
        }
        else{ debug("LeadLag Swap Schedule Off-Event date..."); }
        break;
        
      case 2:
        //manual
        setRuntimeStatus("MANUAL CONTROL MODE");
        break;
      default:
        setRuntimeStatus("INVALID CONTROL MODE");
        debug("INVALID LEAD ROTATION CONTROL TYPE..."+this.getSlotPath());
        break;
    }
  }
  
  public void Staging(){
    //...............TODO...................///////////////////////-----------------------...............
  }
  
  public void startFailTimer(String propName){
    Clock.schedule(this.asComponent(), getStageFailDelay(), CheckFailState, BString.make(propName));
  }
  
  public String[] Csv2Array(String csv, String delim){
    
    StringTokenizer tk = new StringTokenizer(csv, delim);
    ArrayList tkList = new ArrayList(tk.countTokens());    
    
    debug("init token count: "+tk.countTokens());
    debug("CsvString: "+csv);
    
    while(tk.hasMoreTokens()){  
      String next = tk.nextToken();
      tkList.add(next);
      debug("count: "+tk.countTokens());
    }
    
    String[] Output = new String[tkList.size()];    
    tkList.toArray(Output);
    return Output;
  }
  
  public String getVal(){
    String val = null;
    try{
      val = ( (BDynamicEnum)((BObject)get(getProperty("Stages")))).getTag();
      debug("getVal..."+val);
    }
    catch(NullPointerException npe){debug("NullPointerException...tag");}    
    return val;
  }
  
  public int getKey(){
    int val = -1;
    try{
      val = ((BDynamicEnum)((BObject)get(getProperty("Stages")))).getOrdinal();
    }
    catch(NullPointerException npe){debug("NullPointerException...getting the DynamicEnum's ordinal..."+val);}   
    return val;
  }
  
  public BDynamicEnum getStages(){
    BDynamicEnum Stages = null;
    try{
      Stages = ((BDynamicEnum)((BObject)get(getProperty("Stages"))));
    }
    catch(NullPointerException npe){debug("NullPointerException...getting the DynamicEnum Stages..."+Stages );}   
    return Stages;
  }
  
  public BValue getEnumVal(int i){
    BValue val = null;
    val = getStages().getRange().get(i).asValue();
    return val;
  }
  
  public BRelTime getOutputRuntime(Property RuntimeProp){
    BRelTime cRuntime = null;
    BRelTime newRuntime = null;
    try{     
      cRuntime = ((BRelTime)((BObject)get(RuntimeProp)));  
      
      debug("Current Runtime in Seconds: "+ cRuntime.getSeconds());
      
      int accRuntime = cRuntime.getSeconds() + this.getExecutionRate().getSeconds();     
      newRuntime = BRelTime.makeSeconds(accRuntime);

      debug("Current Runtime in Seconds: "+cRuntime.getSeconds());
      debug("Accumulated Runtime in Seconds: "+accRuntime);
      debug("New Runtime in Seconds: "+newRuntime);
      
    }catch(NullPointerException npe){debug("NullPointerException...getting the current RuntimeOutput Property..."+cRuntime );}     
    return newRuntime;
  }
  
  public BRelTime postRuntime(){
    
    BRelTime currentLead_AccRuntime = BRelTime.makeSeconds(0);
    try{    
      for(ListIterator it = StatusInputs.listIterator(); it.hasNext();){
        Property prop = this.getProperty((String)it.next());
        Property runtimeProp = getProperty(prop.getName().substring(0, prop.getName().indexOf("_"))+"_Runtime");
        Property cmdProp = getProperty(prop.getName().substring(0, prop.getName().indexOf("_"))+"_Cmd");
        
        if(getBoolean(prop) && getBoolean(cmdProp)){
          set(runtimeProp, getOutputRuntime(runtimeProp));
          debug("Runtime: "+runtimeProp.getName());
          currentLead_AccRuntime = getOutputRuntime(runtimeProp);
        }
      }
    }catch(NullPointerException npe){ System.out.println("Post Runtime null pointer Exception thrown..."+npe.getMessage()); }
    
    return currentLead_AccRuntime;
  }
  
  public IFuture post(Action action, BValue argument, Context cx)
  {
    Invocation work = new Invocation(this,action,argument,cx);
    this.getAsyncHandler().postWork( work );
    return null;
  }
}
