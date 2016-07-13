package com.vitek.tridium.ax;

import javax.baja.util.*;
import javax.baja.sys.*;

public class BDemoWorker
    extends BWorker
{
  /*-
   class BDemoWorker
   {
     properties
     {
     }
     actions
     {
     }
     topics
     {
     }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.examples.BDemoWorker(1992583770)1.0$ @*/
/* Generated Tue Oct 30 16:08:19 EDT 2012 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BDemoWorker.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


  public Worker getWorker()
  {
    //if we do not already have a worker instance, create one
    if( null == worker )
    {
      //init our queue with max size of 1000 Runnable tasks. This 
      //queue will be used by the Worker to hold all tasks to be 
      //processed.
      queue = new CoalesceQueue(1000);
      worker = new Worker(queue);
    }
    
    return worker;
  }
  
  /**
   * This method is used to post work to our Worker thread. The task
   * must be a {@link Runnable}.
   * 
   * @param r - {@link Runnable} to execute on background thread.
   */
  public void postWork(Runnable r)
  {
    //check to see that our BComponent is mounted in a station and
    //that the queue is non null. If either of these conditions are
    //not meant, throw an exception
    if( null == queue || !isRunning())
      throw new NotRunningException();
    
    //Enqueue our Runnable task on our Worker queue
    queue.enqueue(r);
  }
  
////////////////////////////////////////////////////////////////
//  Attributes
////////////////////////////////////////////////////////////////  

  private Worker worker;
  private CoalesceQueue queue;
}
