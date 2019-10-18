package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

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
 * Notification that a channel has been destroyed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelDestroyed_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements ChannelDestroyed, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Integer representation of the cause of the hangup  */
  private int cause;
 public int getCause() {
   return cause;
 }

 @JsonDeserialize( as=int.class )
 public void setCause(int val ) {
   cause = val;
 }

  /**  Text representation of the cause of the hangup  */
  private String cause_txt;
 public String getCause_txt() {
   return cause_txt;
 }

 @JsonDeserialize( as=String.class )
 public void setCause_txt(String val ) {
   cause_txt = val;
 }

  /**    */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_0_0_1.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

