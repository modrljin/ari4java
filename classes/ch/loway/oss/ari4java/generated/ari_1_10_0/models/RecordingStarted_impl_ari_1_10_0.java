package ch.loway.oss.ari4java.generated.ari_1_10_0.models;

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
 * Event showing the start of a recording operation.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class RecordingStarted_impl_ari_1_10_0 extends Event_impl_ari_1_10_0 implements RecordingStarted, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Recording control object  */
  private LiveRecording recording;
 public LiveRecording getRecording() {
   return recording;
 }

 @JsonDeserialize( as=LiveRecording_impl_ari_1_10_0.class )
 public void setRecording(LiveRecording val ) {
   recording = val;
 }

/** No missing signatures from interface */
}

