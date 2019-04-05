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


public interface ChannelDestroyed extends Event  {

// void setCause_txt String
/**********************************************************
 * Text representation of the cause of the hangup
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setCause_txt(String val );



// void setCause int
/**********************************************************
 * Integer representation of the cause of the hangup
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setCause(int val );



// int getCause
/**********************************************************
 * Integer representation of the cause of the hangup
 * 
 * @since ari_0_0_1
 *********************************************************/
 public int getCause();



// Channel getChannel
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Channel getChannel();



// String getCause_txt
/**********************************************************
 * Text representation of the cause of the hangup
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getCause_txt();



// void setChannel Channel
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(Channel val );


}
;
