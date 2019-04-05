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


public interface LogChannel {

// void setStatus String
/**********************************************************
 * Whether or not a log type is enabled
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setStatus(String val );



// void setType String
/**********************************************************
 * Types of logs for the log channel
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setType(String val );



// void setChannel String
/**********************************************************
 * The log channel path
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setChannel(String val );



// String getChannel
/**********************************************************
 * The log channel path
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getChannel();



// String getStatus
/**********************************************************
 * Whether or not a log type is enabled
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getStatus();



// String getConfiguration
/**********************************************************
 * The various log levels
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getConfiguration();



// String getType
/**********************************************************
 * Types of logs for the log channel
 * 
 * @since ari_1_9_0
 *********************************************************/
 public String getType();



// void setConfiguration String
/**********************************************************
 * The various log levels
 * 
 * @since ari_1_9_0
 *********************************************************/
 public void setConfiguration(String val );


}
;
