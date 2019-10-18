package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

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
 * The merging of media from one or more channels.
 * 
 * Everyone on the bridge receives the same audio.
 * 
 * Defined in file: bridges.json
 * Generated by: Model
 *********************************************************/

public class Bridge_impl_ari_2_0_0 implements Bridge, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Bridging class  */
  private String bridge_class;
 public String getBridge_class() {
   return bridge_class;
 }

 @JsonDeserialize( as=String.class )
 public void setBridge_class(String val ) {
   bridge_class = val;
 }

  /**  Type of bridge technology  */
  private String bridge_type;
 public String getBridge_type() {
   return bridge_type;
 }

 @JsonDeserialize( as=String.class )
 public void setBridge_type(String val ) {
   bridge_type = val;
 }

  /**  Ids of channels participating in this bridge  */
  private List<String> channels;
 public List<String> getChannels() {
   return channels;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setChannels(List<String> val ) {
   channels = val;
 }

  /**  Entity that created the bridge  */
  private String creator;
 public String getCreator() {
   return creator;
 }

 @JsonDeserialize( as=String.class )
 public void setCreator(String val ) {
   creator = val;
 }

  /**  Unique identifier for this bridge  */
  private String id;
 public String getId() {
   return id;
 }

 @JsonDeserialize( as=String.class )
 public void setId(String val ) {
   id = val;
 }

  /**  Name the creator gave the bridge  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**  Name of the current bridging technology  */
  private String technology;
 public String getTechnology() {
   return technology;
 }

 @JsonDeserialize( as=String.class )
 public void setTechnology(String val ) {
   technology = val;
 }

  /**  The video mode the bridge is using. One of 'none', 'talker', or 'single'.  */
  private String video_mode;
 public String getVideo_mode() {
   return video_mode;
 }

 @JsonDeserialize( as=String.class )
 public void setVideo_mode(String val ) {
   video_mode = val;
 }

  /**  The ID of the channel that is the source of video in this bridge, if one exists.  */
  private String video_source_id;
 public String getVideo_source_id() {
   return video_source_id;
 }

 @JsonDeserialize( as=String.class )
 public void setVideo_source_id(String val ) {
   video_source_id = val;
 }

/**********************************************************
 * Timestamp when bridge was created
 * 
 * @since ari_4_0_0
 *********************************************************/
 public Date getCreationtime(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Timestamp when bridge was created
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setCreationtime(Date val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

