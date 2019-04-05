package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Apr 04 11:36:30 CEST 2019
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;
import ch.loway.oss.ari4java.generated.Module;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface Module {

// void setStatus String
/**********************************************************
 * The running status of this module
 * 
 * @since ari_1_8_0
 *********************************************************/
 public void setStatus(String val );



// void setName String
/**********************************************************
 * The name of this module
 * 
 * @since ari_1_8_0
 *********************************************************/
 public void setName(String val );



// void setDescription String
/**********************************************************
 * The description of this module
 * 
 * @since ari_1_8_0
 *********************************************************/
 public void setDescription(String val );



// String getStatus
/**********************************************************
 * The running status of this module
 * 
 * @since ari_1_8_0
 *********************************************************/
 public String getStatus();



// String getDescription
/**********************************************************
 * The description of this module
 * 
 * @since ari_1_8_0
 *********************************************************/
 public String getDescription();



// void setUse_count int
/**********************************************************
 * The number of times this module is being used
 * 
 * @since ari_1_8_0
 *********************************************************/
 public void setUse_count(int val );



// void setSupport_level String
/**********************************************************
 * The support state of this module
 * 
 * @since ari_1_8_0
 *********************************************************/
 public void setSupport_level(String val );



// String getName
/**********************************************************
 * The name of this module
 * 
 * @since ari_1_8_0
 *********************************************************/
 public String getName();



// String getSupport_level
/**********************************************************
 * The support state of this module
 * 
 * @since ari_1_8_0
 *********************************************************/
 public String getSupport_level();



// int getUse_count
/**********************************************************
 * The number of times this module is being used
 * 
 * @since ari_1_8_0
 *********************************************************/
 public int getUse_count();


}
;
