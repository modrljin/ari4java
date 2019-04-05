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
 * Details of an Asterisk log channel
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class LogChannel_impl_ari_1_10_0 implements LogChannel, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The log channel path  */
  private String channel;
 public String getChannel() {
   return channel;
 }

 @JsonDeserialize( as=String.class )
 public void setChannel(String val ) {
   channel = val;
 }

  /**  The various log levels  */
  private String configuration;
 public String getConfiguration() {
   return configuration;
 }

 @JsonDeserialize( as=String.class )
 public void setConfiguration(String val ) {
   configuration = val;
 }

  /**  Whether or not a log type is enabled  */
  private String status;
 public String getStatus() {
   return status;
 }

 @JsonDeserialize( as=String.class )
 public void setStatus(String val ) {
   status = val;
 }

  /**  Types of logs for the log channel  */
  private String type;
 public String getType() {
   return type;
 }

 @JsonDeserialize( as=String.class )
 public void setType(String val ) {
   type = val;
 }

/** No missing signatures from interface */
}

