package ch.loway.oss.ari4java.generated.ari_4_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Fri Oct 04 11:51:52 CEST 2019
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import ch.loway.oss.ari4java.generated.Module;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * The state of a peer associated with an endpoint has changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class PeerStatusChange_impl_ari_4_0_0 extends Event_impl_ari_4_0_0 implements PeerStatusChange, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Endpoint endpoint;
 public Endpoint getEndpoint() {
   return endpoint;
 }

 @JsonDeserialize( as=Endpoint_impl_ari_4_0_0.class )
 public void setEndpoint(Endpoint val ) {
   endpoint = val;
 }

  /**    */
  private Peer peer;
 public Peer getPeer() {
   return peer;
 }

 @JsonDeserialize( as=Peer_impl_ari_4_0_0.class )
 public void setPeer(Peer val ) {
   peer = val;
 }

/** No missing signatures from interface */
}

