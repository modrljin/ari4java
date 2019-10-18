package ch.loway.oss.ari4java.generated.ari_3_0_0.models;

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
 * Event showing the continuation of a media playback operation from one media URI to the next in the list.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class PlaybackContinuing_impl_ari_3_0_0 extends Event_impl_ari_3_0_0 implements PlaybackContinuing, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Playback control object  */
  private Playback playback;
 public Playback getPlayback() {
   return playback;
 }

 @JsonDeserialize( as=Playback_impl_ari_3_0_0.class )
 public void setPlayback(Playback val ) {
   playback = val;
 }

/** No missing signatures from interface */
}

