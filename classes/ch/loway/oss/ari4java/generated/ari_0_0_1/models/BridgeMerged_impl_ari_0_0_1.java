package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Apr 04 11:36:30 CEST 2019
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import ch.loway.oss.ari4java.generated.Module;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Notification that one bridge has merged into another.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeMerged_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements BridgeMerged, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Bridge bridge;
 public Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_0_0_1.class )
 public void setBridge(Bridge val ) {
   bridge = val;
 }

  /**    */
  private Bridge bridge_from;
 public Bridge getBridge_from() {
   return bridge_from;
 }

 @JsonDeserialize( as=Bridge_impl_ari_0_0_1.class )
 public void setBridge_from(Bridge val ) {
   bridge_from = val;
 }

/** No missing signatures from interface */
}

