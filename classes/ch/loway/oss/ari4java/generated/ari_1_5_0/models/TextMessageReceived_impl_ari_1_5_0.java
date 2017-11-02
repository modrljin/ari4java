package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Oct 31 10:30:41 CET 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * A text message was received from an endpoint.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class TextMessageReceived_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements TextMessageReceived, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Endpoint endpoint;
 public Endpoint getEndpoint() {
   return endpoint;
 }

 @JsonDeserialize( as=Endpoint_impl_ari_1_5_0.class )
 public void setEndpoint(Endpoint val ) {
   endpoint = val;
 }

  /**    */
  private TextMessage message;
 public TextMessage getMessage() {
   return message;
 }

 @JsonDeserialize( as=TextMessage_impl_ari_1_5_0.class )
 public void setMessage(TextMessage val ) {
   message = val;
 }

/** No missing signatures from interface */
}

