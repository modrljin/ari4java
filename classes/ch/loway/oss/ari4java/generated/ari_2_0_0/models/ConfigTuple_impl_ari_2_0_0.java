package ch.loway.oss.ari4java.generated.ari_2_0_0.models;

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
 * A key/value pair that makes up part of a configuration object.
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class ConfigTuple_impl_ari_2_0_0 implements ConfigTuple, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  A configuration object attribute.  */
  private String attribute;
 public String getAttribute() {
   return attribute;
 }

 @JsonDeserialize( as=String.class )
 public void setAttribute(String val ) {
   attribute = val;
 }

  /**  The value for the attribute.  */
  private String value;
 public String getValue() {
   return value;
 }

 @JsonDeserialize( as=String.class )
 public void setValue(String val ) {
   value = val;
 }

/** No missing signatures from interface */
}

