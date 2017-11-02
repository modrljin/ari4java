package ch.loway.oss.ari4java.generated.ari_3_0_0.models;

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
 * A channel initiated a media hold.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelHold_impl_ari_3_0_0 extends Event_impl_ari_3_0_0 implements ChannelHold, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel that initiated the hold event.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_3_0_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

  /**  The music on hold class that the initiator requested.  */
  private String musicclass;
 public String getMusicclass() {
   return musicclass;
 }

 @JsonDeserialize( as=String.class )
 public void setMusicclass(String val ) {
   musicclass = val;
 }

/** No missing signatures from interface */
}

