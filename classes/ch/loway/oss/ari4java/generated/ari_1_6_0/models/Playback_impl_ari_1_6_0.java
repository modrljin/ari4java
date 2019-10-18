package ch.loway.oss.ari4java.generated.ari_1_6_0.models;

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
 * Object representing the playback of media to a channel
 * 
 * Defined in file: playbacks.json
 * Generated by: Model
 *********************************************************/

public class Playback_impl_ari_1_6_0 implements Playback, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  ID for this playback operation  */
  private String id;
 public String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(String val ) {
   id = val;
 }

  /**  For media types that support multiple languages, the language requested for playback.  */
  private String language;
 public String getLanguage() {
   return language;
 }

 @JsonDeserialize( as=String.class )
 public void setLanguage(String val ) {
   language = val;
 }

  /**  URI for the media to play back.  */
  private String media_uri;
 public String getMedia_uri() {
   return media_uri;
 }

 @JsonDeserialize( as=String.class )
 public void setMedia_uri(String val ) {
   media_uri = val;
 }

  /**  Current state of the playback operation.  */
  private String state;
 public String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(String val ) {
   state = val;
 }

  /**  URI for the channel or bridge to play the media on  */
  private String target_uri;
 public String getTarget_uri() {
   return target_uri;
 }

 @JsonDeserialize( as=String.class )
 public void setTarget_uri(String val ) {
   target_uri = val;
 }

/**********************************************************
 * If a list of URIs is being played, the next media URI to be played back.
 * 
 * @since ari_2_0_0
 *********************************************************/
 public void setNext_media_uri(String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * If a list of URIs is being played, the next media URI to be played back.
 * 
 * @since ari_2_0_0
 *********************************************************/
 public String getNext_media_uri(){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

