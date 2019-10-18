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


public interface RTPstat {

// int getRxoctetcount
/**********************************************************
 * Number of octets received.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public int getRxoctetcount();



// void setTxploss int
/**********************************************************
 * Number of transmitted packets lost.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setTxploss(int val );



// void setLocal_stdevrxploss double
/**********************************************************
 * Standard deviation packets lost on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_stdevrxploss(double val );



// void setRemote_maxjitter double
/**********************************************************
 * Maximum jitter on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_maxjitter(double val );



// void setRxploss int
/**********************************************************
 * Number of received packets lost.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRxploss(int val );



// double getLocal_maxrxploss
/**********************************************************
 * Maximum number of packets lost on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getLocal_maxrxploss();



// void setRemote_stdevrxploss double
/**********************************************************
 * Standard deviation packets lost on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_stdevrxploss(double val );



// double getRemote_normdevjitter
/**********************************************************
 * Average jitter on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRemote_normdevjitter();



// void setLocal_normdevrxploss double
/**********************************************************
 * Average number of packets lost on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_normdevrxploss(double val );



// double getRemote_maxjitter
/**********************************************************
 * Maximum jitter on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRemote_maxjitter();



// String getChannel_uniqueid
/**********************************************************
 * The Asterisk channel's unique ID that owns this instance.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public String getChannel_uniqueid();



// double getTxjitter
/**********************************************************
 * Jitter on transmitted packets.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getTxjitter();



// double getLocal_minjitter
/**********************************************************
 * Minimum jitter on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getLocal_minjitter();



// void setLocal_stdevjitter double
/**********************************************************
 * Standard deviation jitter on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_stdevjitter(double val );



// void setTxoctetcount int
/**********************************************************
 * Number of octets transmitted.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setTxoctetcount(int val );



// double getRxjitter
/**********************************************************
 * Jitter on received packets.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRxjitter();



// void setRemote_normdevjitter double
/**********************************************************
 * Average jitter on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_normdevjitter(double val );



// double getLocal_maxjitter
/**********************************************************
 * Maximum jitter on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getLocal_maxjitter();



// void setRxcount int
/**********************************************************
 * Number of packets received.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRxcount(int val );



// void setRemote_minrxploss double
/**********************************************************
 * Minimum number of packets lost on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_minrxploss(double val );



// void setNormdevrtt double
/**********************************************************
 * Average round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setNormdevrtt(double val );



// void setLocal_maxjitter double
/**********************************************************
 * Maximum jitter on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_maxjitter(double val );



// double getLocal_normdevrxploss
/**********************************************************
 * Average number of packets lost on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getLocal_normdevrxploss();



// double getLocal_normdevjitter
/**********************************************************
 * Average jitter on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getLocal_normdevjitter();



// void setLocal_minrxploss double
/**********************************************************
 * Minimum number of packets lost on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_minrxploss(double val );



// double getRemote_stdevjitter
/**********************************************************
 * Standard deviation jitter on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRemote_stdevjitter();



// void setRemote_maxrxploss double
/**********************************************************
 * Maximum number of packets lost on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_maxrxploss(double val );



// double getRemote_stdevrxploss
/**********************************************************
 * Standard deviation packets lost on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRemote_stdevrxploss();



// double getRemote_minrxploss
/**********************************************************
 * Minimum number of packets lost on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRemote_minrxploss();



// void setStdevrtt double
/**********************************************************
 * Standard deviation round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setStdevrtt(double val );



// void setLocal_minjitter double
/**********************************************************
 * Minimum jitter on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_minjitter(double val );



// double getRemote_maxrxploss
/**********************************************************
 * Maximum number of packets lost on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRemote_maxrxploss();



// void setRemote_minjitter double
/**********************************************************
 * Minimum jitter on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_minjitter(double val );



// int getTxoctetcount
/**********************************************************
 * Number of octets transmitted.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public int getTxoctetcount();



// void setRtt double
/**********************************************************
 * Total round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRtt(double val );



// void setLocal_maxrxploss double
/**********************************************************
 * Maximum number of packets lost on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_maxrxploss(double val );



// int getLocal_ssrc
/**********************************************************
 * Our SSRC.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public int getLocal_ssrc();



// void setRxjitter double
/**********************************************************
 * Jitter on received packets.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRxjitter(double val );



// int getRxcount
/**********************************************************
 * Number of packets received.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public int getRxcount();



// void setRemote_normdevrxploss double
/**********************************************************
 * Average number of packets lost on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_normdevrxploss(double val );



// void setChannel_uniqueid String
/**********************************************************
 * The Asterisk channel's unique ID that owns this instance.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setChannel_uniqueid(String val );



// double getRemote_normdevrxploss
/**********************************************************
 * Average number of packets lost on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRemote_normdevrxploss();



// void setLocal_ssrc int
/**********************************************************
 * Our SSRC.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_ssrc(int val );



// void setRemote_ssrc int
/**********************************************************
 * Their SSRC.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_ssrc(int val );



// void setMinrtt double
/**********************************************************
 * Minimum round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setMinrtt(double val );



// double getLocal_stdevrxploss
/**********************************************************
 * Standard deviation packets lost on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getLocal_stdevrxploss();



// double getRtt
/**********************************************************
 * Total round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRtt();



// double getStdevrtt
/**********************************************************
 * Standard deviation round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getStdevrtt();



// void setTxjitter double
/**********************************************************
 * Jitter on transmitted packets.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setTxjitter(double val );



// double getLocal_minrxploss
/**********************************************************
 * Minimum number of packets lost on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getLocal_minrxploss();



// void setLocal_normdevjitter double
/**********************************************************
 * Average jitter on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setLocal_normdevjitter(double val );



// double getMinrtt
/**********************************************************
 * Minimum round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getMinrtt();



// double getLocal_stdevjitter
/**********************************************************
 * Standard deviation jitter on local side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getLocal_stdevjitter();



// void setMaxrtt double
/**********************************************************
 * Maximum round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setMaxrtt(double val );



// int getRemote_ssrc
/**********************************************************
 * Their SSRC.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public int getRemote_ssrc();



// void setRxoctetcount int
/**********************************************************
 * Number of octets received.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRxoctetcount(int val );



// int getTxploss
/**********************************************************
 * Number of transmitted packets lost.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public int getTxploss();



// double getMaxrtt
/**********************************************************
 * Maximum round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getMaxrtt();



// int getRxploss
/**********************************************************
 * Number of received packets lost.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public int getRxploss();



// int getTxcount
/**********************************************************
 * Number of packets transmitted.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public int getTxcount();



// double getRemote_minjitter
/**********************************************************
 * Minimum jitter on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getRemote_minjitter();



// double getNormdevrtt
/**********************************************************
 * Average round trip time.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public double getNormdevrtt();



// void setTxcount int
/**********************************************************
 * Number of packets transmitted.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setTxcount(int val );



// void setRemote_stdevjitter double
/**********************************************************
 * Standard deviation jitter on remote side.
 * 
 * @since ari_4_0_0
 *********************************************************/
 public void setRemote_stdevjitter(double val );


}
;
