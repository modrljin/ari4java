package ch.loway.oss.ari4java.generated.ari_1_7_0.models;

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
 * Info about how Asterisk was built
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class BuildInfo_impl_ari_1_7_0 implements BuildInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Date and time when Asterisk was built.  */
  private String date;
 public String getDate() {
   return date;
 }

 @JsonDeserialize( as=String.class )
 public void setDate(String val ) {
   date = val;
 }

  /**  Kernel version Asterisk was built on.  */
  private String kernel;
 public String getKernel() {
   return kernel;
 }

 @JsonDeserialize( as=String.class )
 public void setKernel(String val ) {
   kernel = val;
 }

  /**  Machine architecture (x86_64, i686, ppc, etc.)  */
  private String machine;
 public String getMachine() {
   return machine;
 }

 @JsonDeserialize( as=String.class )
 public void setMachine(String val ) {
   machine = val;
 }

  /**  Compile time options, or empty string if default.  */
  private String options;
 public String getOptions() {
   return options;
 }

 @JsonDeserialize( as=String.class )
 public void setOptions(String val ) {
   options = val;
 }

  /**  OS Asterisk was built on.  */
  private String os;
 public String getOs() {
   return os;
 }

 @JsonDeserialize( as=String.class )
 public void setOs(String val ) {
   os = val;
 }

  /**  Username that build Asterisk  */
  private String user;
 public String getUser() {
   return user;
 }

 @JsonDeserialize( as=String.class )
 public void setUser(String val ) {
   user = val;
 }

/** No missing signatures from interface */
}

