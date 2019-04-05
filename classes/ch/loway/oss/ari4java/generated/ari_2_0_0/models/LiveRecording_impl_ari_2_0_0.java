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
 * A recording that is in progress
 * 
 * Defined in file: recordings.json
 * Generated by: Model
 *********************************************************/

public class LiveRecording_impl_ari_2_0_0 implements LiveRecording, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Cause for recording failure if failed  */
  private String cause;
 public String getCause() {
   return cause;
 }

 @JsonDeserialize( as=String.class )
 public void setCause(String val ) {
   cause = val;
 }

  /**  Duration in seconds of the recording  */
  private int duration;
 public int getDuration() {
   return duration;
 }

 @JsonDeserialize( as=int.class )
 public void setDuration(int val ) {
   duration = val;
 }

  /**  Recording format (wav, gsm, etc.)  */
  private String format;
 public String getFormat() {
   return format;
 }

 @JsonDeserialize( as=String.class )
 public void setFormat(String val ) {
   format = val;
 }

  /**  Base name for the recording  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**  Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.  */
  private int silence_duration;
 public int getSilence_duration() {
   return silence_duration;
 }

 @JsonDeserialize( as=int.class )
 public void setSilence_duration(int val ) {
   silence_duration = val;
 }

  /**    */
  private String state;
 public String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(String val ) {
   state = val;
 }

  /**  Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.  */
  private int talking_duration;
 public int getTalking_duration() {
   return talking_duration;
 }

 @JsonDeserialize( as=int.class )
 public void setTalking_duration(int val ) {
   talking_duration = val;
 }

  /**  URI for the channel or bridge being recorded  */
  private String target_uri;
 public String getTarget_uri() {
   return target_uri;
 }

 @JsonDeserialize( as=String.class )
 public void setTarget_uri(String val ) {
   target_uri = val;
 }

/** No missing signatures from interface */
}

