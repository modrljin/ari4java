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


public interface ChannelTalkingFinished extends Event  {

// void setDuration int
/**********************************************************
 * The length of time, in milliseconds, that talking was detected on the channel
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDuration(int val );



// Channel getChannel
/**********************************************************
 * The channel on which talking completed.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getChannel();



// void setChannel Channel
/**********************************************************
 * The channel on which talking completed.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setChannel(Channel val );



// int getDuration
/**********************************************************
 * The length of time, in milliseconds, that talking was detected on the channel
 * 
 * @since ari_1_5_0
 *********************************************************/
 public int getDuration();


}
;
