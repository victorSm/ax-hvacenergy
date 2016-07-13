package com.vitek.tridium.ax;

import java.util.ArrayList;
import java.util.ListIterator;

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
      active_responseRate: BStatusNumeric
        default{[ new BStatusNumeric() ]}
        flags { summary, readonly } 
        slotfacets {[ BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}

      minStaticPressure_Stp: BStatusNumeric
         default{[new BStatusNumeric() ]}
         flags{ summary }
         slotfacets{[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}
      
      maxStaticPressure_Stp: BStatusNumeric
         default{[ new BStatusNumeric() ]}
         flags{ summary }
         slotfacets{[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}   
         
      minResponseRate: BStatusNumeric
         default {[new BStatusNumeric() ]}
         flags { summary }
         slotfacets {[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}
         
      maxResponseRate: BStatusNumeric
        default {[new BStatusNumeric()]}
        flags{summary}
        slotfacets{[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}   
         
      trimRate: BStatusNumeric
         default {[ new BStatusNumeric() ]}
         flags {summary}
         slotfacets{[BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4)]}
       
       enable: BStatusBoolean
         default {[new BStatusBoolean()]}
         slotfacets {[BFacets.makeBoolean("true", "false")]}
       
       fanProof: BStatusBoolean
         default {[new BStatusBoolean()]}
         flags{summary}
         slotfacets {[BFacets.makeBoolean("true", "false")]}
       
       zoneRequest: BStatusNumeric
         default{[new BStatusNumeric()]}
         flags {summary}
 
         asyncHandler : BDemoWorker
           default{[new BDemoWorker()]}
           
       out:BStatusNumeric
         default{[new BStatusNumeric()]}
         flags { summary }  
         slotfacets {[ BFacets.makeNumeric( BUnit.getUnit("inches of water"), 4)]}                 
     
     }
     actions
     {
      addZone()
        flags{ async }
        
      removeZone(name:BString)
        default{[BString.make("zoneName")]}
        flags{ async}
      
      loopEnable()
        flags{ async }
       
      countRequest() : BStatusNumeric
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
     }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.vitek.BFanPressureReset(2825860417)1.0$ @*/
/* Generated Wed Nov 04 11:36:07 CST 2015 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "active_responseRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>active_responseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getActive_responseRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setActive_responseRate
   */
  public static final Property active_responseRate = newProperty(Flags.SUMMARY|Flags.READONLY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>active_responseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#active_responseRate
   */
  public BStatusNumeric getActive_responseRate() { return (BStatusNumeric)get(active_responseRate); }
  
  /**
   * Set the <code>active_responseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#active_responseRate
   */
  public void setActive_responseRate(BStatusNumeric v) { set(active_responseRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "minStaticPressure_Stp"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>minStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getMinStaticPressure_Stp
   * @see com.vitek.tridium.ax.BFanPressureReset#setMinStaticPressure_Stp
   */
  public static final Property minStaticPressure_Stp = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>minStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#minStaticPressure_Stp
   */
  public BStatusNumeric getMinStaticPressure_Stp() { return (BStatusNumeric)get(minStaticPressure_Stp); }
  
  /**
   * Set the <code>minStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#minStaticPressure_Stp
   */
  public void setMinStaticPressure_Stp(BStatusNumeric v) { set(minStaticPressure_Stp,v,null); }

////////////////////////////////////////////////////////////////
// Property "maxStaticPressure_Stp"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>maxStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getMaxStaticPressure_Stp
   * @see com.vitek.tridium.ax.BFanPressureReset#setMaxStaticPressure_Stp
   */
  public static final Property maxStaticPressure_Stp = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>maxStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#maxStaticPressure_Stp
   */
  public BStatusNumeric getMaxStaticPressure_Stp() { return (BStatusNumeric)get(maxStaticPressure_Stp); }
  
  /**
   * Set the <code>maxStaticPressure_Stp</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#maxStaticPressure_Stp
   */
  public void setMaxStaticPressure_Stp(BStatusNumeric v) { set(maxStaticPressure_Stp,v,null); }

////////////////////////////////////////////////////////////////
// Property "minResponseRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>minResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getMinResponseRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setMinResponseRate
   */
  public static final Property minResponseRate = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>minResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#minResponseRate
   */
  public BStatusNumeric getMinResponseRate() { return (BStatusNumeric)get(minResponseRate); }
  
  /**
   * Set the <code>minResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#minResponseRate
   */
  public void setMinResponseRate(BStatusNumeric v) { set(minResponseRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "maxResponseRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>maxResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getMaxResponseRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setMaxResponseRate
   */
  public static final Property maxResponseRate = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>maxResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#maxResponseRate
   */
  public BStatusNumeric getMaxResponseRate() { return (BStatusNumeric)get(maxResponseRate); }
  
  /**
   * Set the <code>maxResponseRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#maxResponseRate
   */
  public void setMaxResponseRate(BStatusNumeric v) { set(maxResponseRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "trimRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>trimRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getTrimRate
   * @see com.vitek.tridium.ax.BFanPressureReset#setTrimRate
   */
  public static final Property trimRate = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric(BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>trimRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#trimRate
   */
  public BStatusNumeric getTrimRate() { return (BStatusNumeric)get(trimRate); }
  
  /**
   * Set the <code>trimRate</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#trimRate
   */
  public void setTrimRate(BStatusNumeric v) { set(trimRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "enable"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>enable</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getEnable
   * @see com.vitek.tridium.ax.BFanPressureReset#setEnable
   */
  public static final Property enable = newProperty(0, new BStatusBoolean(),BFacets.makeBoolean("true", "false"));
  
  /**
   * Get the <code>enable</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#enable
   */
  public BStatusBoolean getEnable() { return (BStatusBoolean)get(enable); }
  
  /**
   * Set the <code>enable</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#enable
   */
  public void setEnable(BStatusBoolean v) { set(enable,v,null); }

////////////////////////////////////////////////////////////////
// Property "fanProof"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>fanProof</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getFanProof
   * @see com.vitek.tridium.ax.BFanPressureReset#setFanProof
   */
  public static final Property fanProof = newProperty(Flags.SUMMARY, new BStatusBoolean(),BFacets.makeBoolean("true", "false"));
  
  /**
   * Get the <code>fanProof</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#fanProof
   */
  public BStatusBoolean getFanProof() { return (BStatusBoolean)get(fanProof); }
  
  /**
   * Set the <code>fanProof</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#fanProof
   */
  public void setFanProof(BStatusBoolean v) { set(fanProof,v,null); }

////////////////////////////////////////////////////////////////
// Property "zoneRequest"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>zoneRequest</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getZoneRequest
   * @see com.vitek.tridium.ax.BFanPressureReset#setZoneRequest
   */
  public static final Property zoneRequest = newProperty(Flags.SUMMARY, new BStatusNumeric(),null);
  
  /**
   * Get the <code>zoneRequest</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#zoneRequest
   */
  public BStatusNumeric getZoneRequest() { return (BStatusNumeric)get(zoneRequest); }
  
  /**
   * Set the <code>zoneRequest</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#zoneRequest
   */
  public void setZoneRequest(BStatusNumeric v) { set(zoneRequest,v,null); }

////////////////////////////////////////////////////////////////
// Property "asyncHandler"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>asyncHandler</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getAsyncHandler
   * @see com.vitek.tridium.ax.BFanPressureReset#setAsyncHandler
   */
  public static final Property asyncHandler = newProperty(0, new BDemoWorker(),null);
  
  /**
   * Get the <code>asyncHandler</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#asyncHandler
   */
  public BDemoWorker getAsyncHandler() { return (BDemoWorker)get(asyncHandler); }
  
  /**
   * Set the <code>asyncHandler</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#asyncHandler
   */
  public void setAsyncHandler(BDemoWorker v) { set(asyncHandler,v,null); }

////////////////////////////////////////////////////////////////
// Property "out"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>out</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#getOut
   * @see com.vitek.tridium.ax.BFanPressureReset#setOut
   */
  public static final Property out = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric( BUnit.getUnit("inches of water"), 4));
  
  /**
   * Get the <code>out</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#out
   */
  public BStatusNumeric getOut() { return (BStatusNumeric)get(out); }
  
  /**
   * Set the <code>out</code> property.
   * @see com.vitek.tridium.ax.BFanPressureReset#out
   */
  public void setOut(BStatusNumeric v) { set(out,v,null); }

////////////////////////////////////////////////////////////////
// Action "addZone"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>addZone</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#addZone()
   */
  public static final Action addZone = newAction(Flags.ASYNC,null);
  
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
  public static final Action removeZone = newAction(Flags.ASYNC,BString.make("zoneName"),null);
  
  /**
   * Invoke the <code>removeZone</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#removeZone
   */
  public void removeZone(BString name) { invoke(removeZone,name,null); }

////////////////////////////////////////////////////////////////
// Action "loopEnable"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>loopEnable</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#loopEnable()
   */
  public static final Action loopEnable = newAction(Flags.ASYNC,null);
  
  /**
   * Invoke the <code>loopEnable</code> action.
   * @see com.vitek.tridium.ax.BFanPressureReset#loopEnable
   */
  public void loopEnable() { invoke(loopEnable,null,null); }

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
  public BStatusNumeric countRequest() { return (BStatusNumeric)invoke(countRequest,null,null); }

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
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BFanPressureReset.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  
//FIELDS
private ArrayList list = new ArrayList(100);
private String baseName = "zoneDamperPos_";
//private BString removeString = BString.make(baseName + (list.size()-1));
private Ticket ticket = null;

//SYSTEM CALLBACKS
public void atSteadyState()throws Exception
{
  super.atSteadyState();
  
  ticket = Clock.schedulePeriodically(this.asComponent(), BRelTime.MINUTE, this.getAction("run"), null);
  
  
  getOut().setValue(getMinStaticPressure_Stp().getValue());
  
  this.doInvoke(getAction("makeList"), null, null);
  this.doInvoke(getAction("countRequest"), null, null);
  
  if(!this.isRunning())
  {
    ticket.cancel();
  }

}


//PROPERTY CALLBACKS
public void changed(Property prop, Context cx)
{
  super.changed(prop, cx);
  //Fire updateArray and CountRequest if a zone damper position property changes

  boolean isZone = false;
  Property[] dyProps = this.getDynamicPropertiesArray();
  
  if(!this.isRunning()) return;
  if(!Sys.atSteadyState()) return;
  for(int i = 0; i < dyProps.length; i++)
  {
    Slot s = (Slot)dyProps[i];
    if(s.getName().startsWith(baseName))
    {
      if(prop == (Property)s)
      {
        this.doInvoke(makeList, null, null);
        this.doInvoke(this.getAction("countRequest"), null, null);
        scaleRespRate();
        System.out.print("In .changed(), call method scaleRespRate()");
      }
    }
  }
  if(isZone == true)
  {
    System.out.println("In .changed(), isOfInterest is "+ isZone);
  }  
}

public void added(Property prop, Context cx)
{
  super.added(prop, cx);
  //Fire doCountRequest if a zone damper slot is created, and push it into the zones array 

  if(!this.isRunning()) return;
  if(!Sys.atSteadyState()) return;
  
  boolean isZone = false;
  
    if(prop.getName().startsWith(baseName))
    {
      this.doInvoke(makeList, null, null);
      this.doInvoke(this.getAction("countRequest"), null, null);
      isZone = true;
    }
  if(isZone == true)
  {
    System.out.println("In .changed(), isOfInterest is "+ isZone);
  }
}

public void removed(Property prop, BValue val, Context cx)
{
  super.removed( prop, val, cx);
  //Fire doCountRequest if a zone damper slot is removed, then remove the slot object by making a remove call to the running instance of such object, also 
  //remove the corresponding element of the list of zones. Finally, call the class utility methods

  boolean isZone = false;
  
  if(!this.isRunning()) return;
  if(!Sys.atSteadyState()) return;
  
      if(prop.getName().startsWith(baseName))
      {
        this.doInvoke(makeList, null, null);
        this.doInvoke(this.getAction("countRequest"), null, null);
      }
  if(isZone == true)
  {
    System.out.println("In .removed(), isOfInterest is "+ isZone);
  }    
}


//ACTION CALLBACKS
  public void doAddZone()
  {
    //Add a dynamic slot zone damper position property

    BString nameString = BString.make( baseName + list.size());
    BFacets unitFacets = BFacets.makeNumeric(BUnit.getUnit("percent"),2);

    System.out.println("In.doAddZone, list.size  "+ list.size());
  
    this.add(nameString.getString(), BDouble.make(0.0), Flags.SUMMARY, unitFacets);
    //Create method var of type BString to name the new slot; to do so, concatenate the string in instance var "baseName" with the current size of the "list" instance var
  }

  public void doRemoveZone(BString removeString)
  {
    String name = removeString.getString();
    this.remove(name);
    //Pass a BString as an argument to this method which will be the name of the dynamic slot to be removed.
  }
  
  public void doLoopEnable()
  {
    
    if(getEnable().getValue() == true)
    {
      getEnable().setValue(false);
      getOut().setValue(0.0);
    }
    else
    {
      getEnable().setValue(true); 
    }       
    //Sets the "enable" property on and off    
   } 
   
  public void doMakeList()
  { 
    Property[] dyProps = this.getDynamicPropertiesArray();
    //Assign an array of all dynamic properties to the method var "dyProps"
  
    System.out.println("In.doMakeList(), Dynamic Props   "+ dyProps.length);
    System.out.println("In.doMakeList(), List.size  "+ list.size());

    for(int i = 0; i < dyProps.length; i++)
    {
      Slot s = (Slot)dyProps[i];
      //Cast every dynamic property in dyProps to Slot type, then assign it to the loop var "s" of type Slot
      System.out.println("In.doMakeList(), in ForLoop, just before if Statement. dyProp element has just been casted to Slot type and assigned to s var  "+ s.getName());
      System.out.println("In .doMakeList(), in ForLoop, just befor if Statement. list.size  "+ list.size());
      
      if(s.getName().startsWith(baseName) && !list.contains(s)){
        list.add((Property)s);
        System.out.println("In .doMakeList(), in ForLoop just after the list.add(Property s) Statement.   list.size  "+ list.size());
        //if the name of s starts with the instance var "baseName" of type String AND IS NOT an Object already CONTAINED in the list; then add it to
        //the List instance var "list".
        System.out.println("In .doMakeList(), in FoorLoop, after the list.add(Property s) Statement.  Found zone damper dynamic slot s  "+s);
      } 
      else
      {
        System.out.println("In .doMakeList(), in ForLoop, in else Statement; this dynamic property is not a zone damper slot. List.size is  "+ list.size());
        
      }
     }
   }

  public BStatusNumeric doCountRequest()
  {
 
    double zprCount = 0;  
    BStatusNumeric zprOut = new BStatusNumeric((double)zprCount);
    
    System.out.println("List size: "+ list.size());
  
    ListIterator it = list.listIterator(list.size());
    BDouble constant = BDouble.make(90.0);
    
    while(it.hasPrevious()){
      BDouble zdp = (BDouble)((BObject)get((Property)it.previous()));
      if(zdp.getDouble() >= constant.getDouble()){
        zprCount = zprCount + 1;
      }
      System.out.println("zdp name:  " + zdp.toString());
     }
    zprOut.setValue(zprCount);
    setZoneRequest(zprOut);
    
    //Make a BDouble, and a List Iterator for "list"; while the iterator can obtain a list item; make a BDouble loop var named "zdp".
    //cast the current item in the iterator's queue to a Property type, pass it to the .get() method of the current instance of this class.
    //The value returned by the afore mentioned .get() method is then upcasted to a BObject and then downcasted to a BDouble; it is then assigned to loop var "zdp"
    //if zdp's double value is currently higher or equal to then constant double value, then add one to the zprCount var's value.
    //In the end set the property object zoneRequest with the value of zprCount, and return zprCount in case I want to use a copy of it's value for something later on.
    
    System.out.println("Zone Pressure Request Count:"+ zprCount);  
     System.out.println("zpr count method output: "+ zprOut.toString());
     return zprOut; 
  }
  
  public void doTrim()
  {
    double out = getOut().getValue(); 
    BStatusNumeric trimRate = (BStatusNumeric)(BObject)get(this.getProperty("trimRate"));
    BStatusNumeric minStp = (BStatusNumeric)(BObject)get(this.getProperty("minStaticPressure_Stp"));
    
    System.out.println("In .doTrim(), minStp = "+minStp.getValue());
    System.out.println("In .doTrim(), trimRate = "+trimRate);
    System.out.println("In .doTrim(), out = "+ out);
    
    if(out > minStp.getValue())
    {  
      out = out - trimRate.getValue();
      getOut().setValue(out);
      System.out.println("In .doTrim, final output: "+ out);
    }
    else
    {
      getOut().setValue(minStp.getValue());
    }
  }
  
  public void doRespond()
  {   
    double out = getOut().getValue();
    BStatusNumeric respRate = (BStatusNumeric)(BObject)get(this.getProperty("active_responseRate"));
    BStatusNumeric maxStp = (BStatusNumeric)(BObject)get(this.getProperty("maxStaticPressure_Stp"));
    
    System.out.println("In .doRespond(), maxStp = "+maxStp);
    System.out.println("In .doRespond(), respRate = "+respRate);
    System.out.println("In .doRespond(), out = "+ out);
    
    if(out < maxStp.getValue())
    {
      out = out + respRate.getValue();
      getOut().setValue(out);
      System.out.println("In .doRespond, final method output: "+ out);
    }
    else
    {
      getOut().setValue(maxStp.getValue());
    }
  }
  
  public void doRun()
  {
    if(this.getEnable().getValue() == true && this.getFanProof().getValue()== true)
    {
      if(this.getZoneRequest().getValue() > 0)
      {
        this.doInvoke(getAction("respond"), null, null);
        System.out.println("In .doRun, call the respond action, there is  "+ getZoneRequest().getValue()+ " zone pressure requests");
        System.out.println("In .doRun, getOut().getValue()"+ getOut().getValue());
      }
      else
      {
        this.doInvoke(getAction("trim"),null,null);
        System.out.println("In .doRun, call the trim action, there is  "+ getZoneRequest().getValue()+ " zone pressure requests");  
        System.out.println("In .doRun, getOut().getValue()"+ getOut().getValue());
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
    BStatusNumeric minRate = (BStatusNumeric)(BObject)get(this.getProperty("minResponseRate"));
    BStatusNumeric maxRate = (BStatusNumeric)(BObject)get(this.getProperty("maxResponseRate"));
    double maxZpr = (double)list.size();
    double minZpr = 1.0;
    double zprCount = this.getZoneRequest().getValue();

    
    System.out.println("maxZpr: "+ maxZpr);
    System.out.println("maxRate: "+ maxRate.getValue());
    System.out.println("minRate: "+ minRate.getValue());
    
    outputResponse = ((maxRate.getValue()-minRate.getValue())*(zprCount - minRate.getValue()))/ ((maxZpr - minZpr)+ minRate.getValue());
    System.out.println("In scaleRespRate, outputResponse of type double holds the result of a mathematical expression;  "+ outputResponse);
    
    output.setValue(outputResponse);
    System.out.println("In scaledRespRate(), output var of type BStatusNumeric is set to the value held in var output;  " + outputResponse);
    setActive_responseRate(output);
    return outputResponse;
    
  }
  
  ///CLASS DECLARATION END
  
}
