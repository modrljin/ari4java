package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Fri Oct 04 11:51:52 CEST 2019
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


public interface ChannelUnhold extends Event  {

// Channel getChannel
/**********************************************************
 * The channel that initiated the unhold event.
 * 
 * @since ari_1_8_0
 *********************************************************/
 public Channel getChannel();



// void setChannel Channel
/**********************************************************
 * The channel that initiated the unhold event.
 * 
 * @since ari_1_8_0
 *********************************************************/
 public void setChannel(Channel val );


}
;
