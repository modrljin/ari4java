package ch.loway.oss.ari4java.generated.ari_2_0_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Fri Oct 04 11:51:52 CEST 2019
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.Module;
import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_2_0_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionBridges_impl_ari_2_0_0 extends BaseAriAction  implements ActionBridges {
/**********************************************************
 * Active bridges
 * 
 * List all active bridges in Asterisk.
 *********************************************************/
private void buildList() {
reset();
url = "/bridges";
method = "GET";
}

@Override
public List<Bridge> list() throws RestException {
buildList();
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<Bridge_impl_ari_2_0_0>>() {} ); 
}

@Override
public void list(AriCallback<List<Bridge>> callback) {
buildList();
httpActionAsync(callback, new TypeReference<List<Bridge_impl_ari_2_0_0>>() {});
}

/**********************************************************
 * Active bridges
 * 
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 *********************************************************/
private void buildCreate(String type, String bridgeId, String name) {
reset();
url = "/bridges";
method = "POST";
lParamQuery.add( HttpParam.build( "type", type) );
lParamQuery.add( HttpParam.build( "bridgeId", bridgeId) );
lParamQuery.add( HttpParam.build( "name", name) );
}

@Override
public Bridge create(String type, String bridgeId, String name) throws RestException {
buildCreate(type, bridgeId, name);
String json = httpActionSync();
return deserializeJson( json, Bridge_impl_ari_2_0_0.class ); 
}

@Override
public void create(String type, String bridgeId, String name, AriCallback<Bridge> callback) {
buildCreate(type, bridgeId, name);
httpActionAsync(callback, Bridge_impl_ari_2_0_0.class);
}

/**********************************************************
 * Individual bridge
 * 
 * Create a new bridge or updates an existing one.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 *********************************************************/
private void buildCreateWithId(String type, String bridgeId, String name) {
reset();
url = "/bridges/" + bridgeId + "";
method = "POST";
lParamQuery.add( HttpParam.build( "type", type) );
lParamQuery.add( HttpParam.build( "name", name) );
}

@Override
public Bridge createWithId(String type, String bridgeId, String name) throws RestException {
buildCreateWithId(type, bridgeId, name);
String json = httpActionSync();
return deserializeJson( json, Bridge_impl_ari_2_0_0.class ); 
}

@Override
public void createWithId(String type, String bridgeId, String name, AriCallback<Bridge> callback) {
buildCreateWithId(type, bridgeId, name);
httpActionAsync(callback, Bridge_impl_ari_2_0_0.class);
}

/**********************************************************
 * Individual bridge
 * 
 * Get bridge details.
 *********************************************************/
private void buildGet(String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Bridge not found") );
}

@Override
public Bridge get(String bridgeId) throws RestException {
buildGet(bridgeId);
String json = httpActionSync();
return deserializeJson( json, Bridge_impl_ari_2_0_0.class ); 
}

@Override
public void get(String bridgeId, AriCallback<Bridge> callback) {
buildGet(bridgeId);
httpActionAsync(callback, Bridge_impl_ari_2_0_0.class);
}

/**********************************************************
 * Individual bridge
 * 
 * Shut down a bridge.
 * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
 *********************************************************/
private void buildDestroy(String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Bridge not found") );
}

@Override
public void destroy(String bridgeId) throws RestException {
buildDestroy(bridgeId);
String json = httpActionSync();
}

@Override
public void destroy(String bridgeId, AriCallback<Void> callback) {
buildDestroy(bridgeId);
httpActionAsync(callback);
}

/**********************************************************
 * Add a channel to a bridge
 * 
 * Add a channel to a bridge.
 *********************************************************/
private void buildAddChannel(String bridgeId, String channel, String role) {
reset();
url = "/bridges/" + bridgeId + "/addChannel";
method = "POST";
lParamQuery.add( HttpParam.build( "channel", channel) );
lParamQuery.add( HttpParam.build( "role", role) );
lE.add( HttpResponse.build( 400, "Channel not found") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application; Channel currently recording") );
lE.add( HttpResponse.build( 422, "Channel not in Stasis application") );
}

@Override
public void addChannel(String bridgeId, String channel, String role) throws RestException {
buildAddChannel(bridgeId, channel, role);
String json = httpActionSync();
}

@Override
public void addChannel(String bridgeId, String channel, String role, AriCallback<Void> callback) {
buildAddChannel(bridgeId, channel, role);
httpActionAsync(callback);
}

/**********************************************************
 * Play music on hold to a bridge
 * 
 * Play music on hold to a bridge or change the MOH class that is playing.
 *********************************************************/
private void buildStartMoh(String bridgeId, String mohClass) {
reset();
url = "/bridges/" + bridgeId + "/moh";
method = "POST";
lParamQuery.add( HttpParam.build( "mohClass", mohClass) );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
}

@Override
public void startMoh(String bridgeId, String mohClass) throws RestException {
buildStartMoh(bridgeId, mohClass);
String json = httpActionSync();
}

@Override
public void startMoh(String bridgeId, String mohClass, AriCallback<Void> callback) {
buildStartMoh(bridgeId, mohClass);
httpActionAsync(callback);
}

/**********************************************************
 * Play music on hold to a bridge
 * 
 * Stop playing music on hold to a bridge.
 * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
 *********************************************************/
private void buildStopMoh(String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "/moh";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
}

@Override
public void stopMoh(String bridgeId) throws RestException {
buildStopMoh(bridgeId);
String json = httpActionSync();
}

@Override
public void stopMoh(String bridgeId, AriCallback<Void> callback) {
buildStopMoh(bridgeId);
httpActionAsync(callback);
}

/**********************************************************
 * Play media to the participants of a bridge
 * 
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 *********************************************************/
private void buildPlay(String bridgeId, String media, String lang, int offsetms, int skipms, String playbackId) {
reset();
url = "/bridges/" + bridgeId + "/play";
method = "POST";
lParamQuery.add( HttpParam.build( "media", media) );
lParamQuery.add( HttpParam.build( "lang", lang) );
lParamQuery.add( HttpParam.build( "offsetms", offsetms) );
lParamQuery.add( HttpParam.build( "skipms", skipms) );
lParamQuery.add( HttpParam.build( "playbackId", playbackId) );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in a Stasis application") );
}

@Override
public Playback play(String bridgeId, String media, String lang, int offsetms, int skipms, String playbackId) throws RestException {
buildPlay(bridgeId, media, lang, offsetms, skipms, playbackId);
String json = httpActionSync();
return deserializeJson( json, Playback_impl_ari_2_0_0.class ); 
}

@Override
public void play(String bridgeId, String media, String lang, int offsetms, int skipms, String playbackId, AriCallback<Playback> callback) {
buildPlay(bridgeId, media, lang, offsetms, skipms, playbackId);
httpActionAsync(callback, Playback_impl_ari_2_0_0.class);
}

/**********************************************************
 * Play media to a bridge
 * 
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 *********************************************************/
private void buildPlayWithId(String bridgeId, String playbackId, String media, String lang, int offsetms, int skipms) {
reset();
url = "/bridges/" + bridgeId + "/play/" + playbackId + "";
method = "POST";
lParamQuery.add( HttpParam.build( "media", media) );
lParamQuery.add( HttpParam.build( "lang", lang) );
lParamQuery.add( HttpParam.build( "offsetms", offsetms) );
lParamQuery.add( HttpParam.build( "skipms", skipms) );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in a Stasis application") );
}

@Override
public Playback playWithId(String bridgeId, String playbackId, String media, String lang, int offsetms, int skipms) throws RestException {
buildPlayWithId(bridgeId, playbackId, media, lang, offsetms, skipms);
String json = httpActionSync();
return deserializeJson( json, Playback_impl_ari_2_0_0.class ); 
}

@Override
public void playWithId(String bridgeId, String playbackId, String media, String lang, int offsetms, int skipms, AriCallback<Playback> callback) {
buildPlayWithId(bridgeId, playbackId, media, lang, offsetms, skipms);
httpActionAsync(callback, Playback_impl_ari_2_0_0.class);
}

/**********************************************************
 * Record audio on a bridge
 * 
 * Start a recording.
 * This records the mixed audio from all channels participating in this bridge.
 *********************************************************/
private void buildRecord(String bridgeId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn) {
reset();
url = "/bridges/" + bridgeId + "/record";
method = "POST";
lParamQuery.add( HttpParam.build( "name", name) );
lParamQuery.add( HttpParam.build( "format", format) );
lParamQuery.add( HttpParam.build( "maxDurationSeconds", maxDurationSeconds) );
lParamQuery.add( HttpParam.build( "maxSilenceSeconds", maxSilenceSeconds) );
lParamQuery.add( HttpParam.build( "ifExists", ifExists) );
lParamQuery.add( HttpParam.build( "beep", beep) );
lParamQuery.add( HttpParam.build( "terminateOn", terminateOn) );
lE.add( HttpResponse.build( 400, "Invalid parameters") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge is not in a Stasis application; A recording with the same name already exists on the system and can not be overwritten because it is in progress or ifExists=fail") );
lE.add( HttpResponse.build( 422, "The format specified is unknown on this system") );
}

@Override
public LiveRecording record(String bridgeId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn) throws RestException {
buildRecord(bridgeId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);
String json = httpActionSync();
return deserializeJson( json, LiveRecording_impl_ari_2_0_0.class ); 
}

@Override
public void record(String bridgeId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn, AriCallback<LiveRecording> callback) {
buildRecord(bridgeId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);
httpActionAsync(callback, LiveRecording_impl_ari_2_0_0.class);
}

/**********************************************************
 * Remove a channel from a bridge
 * 
 * Remove a channel from a bridge.
 *********************************************************/
private void buildRemoveChannel(String bridgeId, String channel) {
reset();
url = "/bridges/" + bridgeId + "/removeChannel";
method = "POST";
lParamQuery.add( HttpParam.build( "channel", channel) );
lE.add( HttpResponse.build( 400, "Channel not found") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
lE.add( HttpResponse.build( 422, "Channel not in this bridge") );
}

@Override
public void removeChannel(String bridgeId, String channel) throws RestException {
buildRemoveChannel(bridgeId, channel);
String json = httpActionSync();
}

@Override
public void removeChannel(String bridgeId, String channel, AriCallback<Void> callback) {
buildRemoveChannel(bridgeId, channel);
httpActionAsync(callback);
}

/**********************************************************
 * Removes any explicit video source
 * 
 * Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk detection will be used to determine the active video stream.
 *********************************************************/
private void buildClearVideoSource(String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "/videoSource";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Bridge not found") );
}

@Override
public void clearVideoSource(String bridgeId) throws RestException {
buildClearVideoSource(bridgeId);
String json = httpActionSync();
}

@Override
public void clearVideoSource(String bridgeId, AriCallback<Void> callback) {
buildClearVideoSource(bridgeId);
httpActionAsync(callback);
}

/**********************************************************
 * Set a channel as the video source in a multi-party bridge
 * 
 * Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
 *********************************************************/
private void buildSetVideoSource(String bridgeId, String channelId) {
reset();
url = "/bridges/" + bridgeId + "/videoSource/" + channelId + "";
method = "POST";
lE.add( HttpResponse.build( 404, "Bridge or Channel not found") );
lE.add( HttpResponse.build( 409, "Channel not in Stasis application") );
lE.add( HttpResponse.build( 422, "Channel not in this Bridge") );
}

@Override
public void setVideoSource(String bridgeId, String channelId) throws RestException {
buildSetVideoSource(bridgeId, channelId);
String json = httpActionSync();
}

@Override
public void setVideoSource(String bridgeId, String channelId, AriCallback<Void> callback) {
buildSetVideoSource(bridgeId, channelId);
httpActionAsync(callback);
}

/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void create(String type, AriCallback<Bridge> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Add a channel to a bridge.
 * 
 * 
 * @since ari_4_0_0
 *********************************************************/
public void addChannel(String bridgeId, String channel, String role, boolean absorbDTMF, boolean mute) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_1_0_0
 *********************************************************/
public Bridge create(String type, String name) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_0_0_1
 *********************************************************/
public Bridge create(String type) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void play(String bridgeId, String media, String lang, int offsetms, int skipms, AriCallback<Playback> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
public Playback play(String bridgeId, String media, String lang, int offsetms, int skipms) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_0_0
 *********************************************************/
public void create(String type, String name, AriCallback<Bridge> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_4_0_0
 *********************************************************/
public void addChannel(String bridgeId, String channel, String role, boolean absorbDTMF, boolean mute, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void create_or_update_with_id(String type, String bridgeId, String name, AriCallback<Bridge> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge or updates an existing one.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Bridge create_or_update_with_id(String type, String bridgeId, String name) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

};

