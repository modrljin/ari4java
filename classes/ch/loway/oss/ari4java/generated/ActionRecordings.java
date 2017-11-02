package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Oct 31 10:30:41 CET 2017
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ActionRecordings {

// void mute String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void mute(String recordingName, AriCallback<Void> callback);



// StoredRecording getStored String
/**********************************************************
 * Get a stored recording's details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public StoredRecording getStored(String recordingName) throws RestException;



// LiveRecording getLive String
/**********************************************************
 * List live recordings.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public LiveRecording getLive(String recordingName) throws RestException;



// void unpause String
/**********************************************************
 * Unpause a live recording.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unpause(String recordingName) throws RestException;



// void pause String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void pause(String recordingName, AriCallback<Void> callback);



// void listStored AriCallback<List<StoredRecording>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void listStored(AriCallback<List<StoredRecording>> callback);



// void deleteStored String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void deleteStored(String recordingName, AriCallback<Void> callback);



// void cancel String
/**********************************************************
 * Stop a live recording and discard it.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void cancel(String recordingName) throws RestException;



// void cancel String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void cancel(String recordingName, AriCallback<Void> callback);



// void unmute String
/**********************************************************
 * Unmute a live recording.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unmute(String recordingName) throws RestException;



// List<StoredRecording> listStored
/**********************************************************
 * List recordings that are complete.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<StoredRecording> listStored() throws RestException;



// void deleteStored String
/**********************************************************
 * Delete a stored recording.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void deleteStored(String recordingName) throws RestException;



// void unpause String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unpause(String recordingName, AriCallback<Void> callback);



// void pause String
/**********************************************************
 * Pause a live recording.
 * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
 * 
 * @since ari_0_0_1
 *********************************************************/
public void pause(String recordingName) throws RestException;



// byte[] getStoredFile String
/**********************************************************
 * Get the file associated with the stored recording.
 * 
 * 
 * @since ari_2_0_0
 *********************************************************/
public byte[] getStoredFile(String recordingName) throws RestException;



// StoredRecording copyStored String String
/**********************************************************
 * Copy a stored recording.
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public StoredRecording copyStored(String recordingName, String destinationRecordingName) throws RestException;



// void getStoredFile String AriCallback<byte[]> callback
/**********************************************************
 * 
 * 
 * @since ari_2_0_0
 *********************************************************/
public void getStoredFile(String recordingName, AriCallback<byte[]> callback);



// void getLive String AriCallback<LiveRecording> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getLive(String recordingName, AriCallback<LiveRecording> callback);



// void mute String
/**********************************************************
 * Mute a live recording.
 * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
 * 
 * @since ari_0_0_1
 *********************************************************/
public void mute(String recordingName) throws RestException;



// void copyStored String String AriCallback<StoredRecording> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void copyStored(String recordingName, String destinationRecordingName, AriCallback<StoredRecording> callback);



// void getStored String AriCallback<StoredRecording> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getStored(String recordingName, AriCallback<StoredRecording> callback);



// void stop String
/**********************************************************
 * Stop a live recording and store it.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stop(String recordingName) throws RestException;



// void unmute String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unmute(String recordingName, AriCallback<Void> callback);



// void stop String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stop(String recordingName, AriCallback<Void> callback);


}
;
