package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Apr 04 11:36:31 CEST 2019
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import ch.loway.oss.ari4java.generated.Module;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * A text message.
 * 
 * Defined in file: endpoints.json
 * Generated by: Model
 *********************************************************/

public class TextMessage_impl_ari_2_0_0 implements TextMessage, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The text of the message.  */
  private String body;
 public String getBody() {
   return body;
 }

 @JsonDeserialize( as=String.class )
 public void setBody(String val ) {
   body = val;
 }

  /**  A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message.  */
  private String from;
 public String getFrom() {
   return from;
 }

 @JsonDeserialize( as=String.class )
 public void setFrom(String val ) {
   from = val;
 }

  /**  A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.  */
  private String to;
 public String getTo() {
   return to;
 }

 @JsonDeserialize( as=String.class )
 public void setTo(String val ) {
   to = val;
 }

  /**  Technology specific key/value pairs associated with the message.  */
  private List<TextMessageVariable> variables;
 public List<TextMessageVariable> getVariables() {
   return variables;
 }

 @JsonDeserialize( contentAs=TextMessageVariable_impl_ari_2_0_0.class )
 public void setVariables(List<TextMessageVariable> val ) {
   variables = val;
 }

/** No missing signatures from interface */
}
