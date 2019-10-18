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


public interface ChannelUserevent extends Event  {

// void setEventname String
/**********************************************************
 * The name of the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setEventname(String val );



// void setUserevent String
/**********************************************************
 * Custom Userevent data
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setUserevent(String val );



// String getEventname
/**********************************************************
 * The name of the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getEventname();



// void setEndpoint Endpoint
/**********************************************************
 * A endpoint that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setEndpoint(Endpoint val );



// void setBridge Bridge
/**********************************************************
 * A bridge that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setBridge(Bridge val );



// Channel getChannel
/**********************************************************
 * The channel that signaled the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Channel getChannel();



// Endpoint getEndpoint
/**********************************************************
 * A endpoint that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Endpoint getEndpoint();



// String getUserevent
/**********************************************************
 * Custom Userevent data
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getUserevent();



// Bridge getBridge
/**********************************************************
 * A bridge that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Bridge getBridge();



// void setChannel Channel
/**********************************************************
 * The channel that signaled the user event.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(Channel val );


}
;
