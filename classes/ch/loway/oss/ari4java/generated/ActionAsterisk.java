package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Jan 08 13:25:07 CET 2019
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


public interface ActionAsterisk {

// void deleteObject String String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void deleteObject(String configClass, String objectType, String id, AriCallback<Void> callback);



// List<ConfigTuple> updateObject String String String Map<String,String>
/**********************************************************
 * Create or update a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public List<ConfigTuple> updateObject(String configClass, String objectType, String id, Map<String,String> fields) throws RestException;



// void reloadModule String
/**********************************************************
 * Reload an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void reloadModule(String moduleName) throws RestException;



// void addLog String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void addLog(String logChannelName, String configuration, AriCallback<Void> callback);



// void reloadModule String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void reloadModule(String moduleName, AriCallback<Void> callback);



// List<Module> listModules
/**********************************************************
 * List Asterisk modules.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public List<Module> listModules() throws RestException;



// void unloadModule String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void unloadModule(String moduleName, AriCallback<Void> callback);



// List<LogChannel> listLogChannels
/**********************************************************
 * Gets Asterisk log channel information.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public List<LogChannel> listLogChannels() throws RestException;



// Module getModule String
/**********************************************************
 * Get Asterisk module information.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public Module getModule(String moduleName) throws RestException;



// Variable getGlobalVar String
/**********************************************************
 * Get the value of a global variable.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Variable getGlobalVar(String variable) throws RestException;



// void rotateLog String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void rotateLog(String logChannelName, AriCallback<Void> callback);



// void setGlobalVar String String
/**********************************************************
 * Set the value of a global variable.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void setGlobalVar(String variable, String value) throws RestException;



// List<ConfigTuple> getObject String String String
/**********************************************************
 * Retrieve a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public List<ConfigTuple> getObject(String configClass, String objectType, String id) throws RestException;



// void loadModule String
/**********************************************************
 * Load an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void loadModule(String moduleName) throws RestException;



// void unloadModule String
/**********************************************************
 * Unload an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void unloadModule(String moduleName) throws RestException;



// void getModule String AriCallback<Module> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void getModule(String moduleName, AriCallback<Module> callback);



// void updateObject String String String Map<String,String> AriCallback<List<ConfigTuple>> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void updateObject(String configClass, String objectType, String id, Map<String,String> fields, AriCallback<List<ConfigTuple>> callback);



// AsteriskInfo getInfo String
/**********************************************************
 * Gets Asterisk system information.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public AsteriskInfo getInfo(String only) throws RestException;



// void getInfo String AriCallback<AsteriskInfo> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getInfo(String only, AriCallback<AsteriskInfo> callback);



// void deleteObject String String String
/**********************************************************
 * Delete a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void deleteObject(String configClass, String objectType, String id) throws RestException;



// void rotateLog String
/**********************************************************
 * Rotates a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void rotateLog(String logChannelName) throws RestException;



// void listLogChannels AriCallback<List<LogChannel>> callback
/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void listLogChannels(AriCallback<List<LogChannel>> callback);



// void addLog String String
/**********************************************************
 * Adds a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void addLog(String logChannelName, String configuration) throws RestException;



// void listModules AriCallback<List<Module>> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void listModules(AriCallback<List<Module>> callback);



// void getGlobalVar String AriCallback<Variable> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getGlobalVar(String variable, AriCallback<Variable> callback);



// void setGlobalVar String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void setGlobalVar(String variable, String value, AriCallback<Void> callback);



// void deleteLog String
/**********************************************************
 * Deletes a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void deleteLog(String logChannelName) throws RestException;



// void deleteLog String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void deleteLog(String logChannelName, AriCallback<Void> callback);



// void loadModule String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void loadModule(String moduleName, AriCallback<Void> callback);



// void getObject String String String AriCallback<List<ConfigTuple>> callback
/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void getObject(String configClass, String objectType, String id, AriCallback<List<ConfigTuple>> callback);


}
;
