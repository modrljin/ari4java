package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Apr 04 11:36:30 CEST 2019
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;
import ch.loway.oss.ari4java.generated.Module;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface TextMessage {

// void setFrom String
/**********************************************************
 * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setFrom(String val );



// String getBody
/**********************************************************
 * The text of the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getBody();



// void setTo String
/**********************************************************
 * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTo(String val );



// void setBody String
/**********************************************************
 * The text of the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setBody(String val );



// String getFrom
/**********************************************************
 * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getFrom();



// String getTo
/**********************************************************
 * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getTo();



// List<TextMessageVariable> getVariables
/**********************************************************
 * Technology specific key/value pairs associated with the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public List<TextMessageVariable> getVariables();



// void setVariables List<TextMessageVariable>
/**********************************************************
 * Technology specific key/value pairs associated with the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setVariables(List<TextMessageVariable> val );


}
;
