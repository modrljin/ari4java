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
 * Notification that a channel has been created.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelCreated_impl_ari_2_0_0 extends Event_impl_ari_2_0_0 implements ChannelCreated, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_2_0_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

