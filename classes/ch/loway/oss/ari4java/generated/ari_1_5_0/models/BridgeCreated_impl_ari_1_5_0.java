package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Jan 08 13:25:07 CET 2019
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import ch.loway.oss.ari4java.generated.Module;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Notification that a bridge has been created.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeCreated_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements BridgeCreated, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Bridge bridge;
 public Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_5_0.class )
 public void setBridge(Bridge val ) {
   bridge = val;
 }

/** No missing signatures from interface */
}

