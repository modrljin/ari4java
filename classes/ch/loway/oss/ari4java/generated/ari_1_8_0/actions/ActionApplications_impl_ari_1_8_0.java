package ch.loway.oss.ari4java.generated.ari_1_8_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Apr 04 11:36:31 CEST 2019
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
import ch.loway.oss.ari4java.generated.ari_1_8_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionApplications_impl_ari_1_8_0 extends BaseAriAction  implements ActionApplications {
/**********************************************************
 * Stasis applications
 * 
 * List all applications.
 *********************************************************/
private void buildList() {
reset();
url = "/applications";
method = "GET";
}

@Override
public List<Application> list() throws RestException {
buildList();
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<Application_impl_ari_1_8_0>>() {} ); 
}

@Override
public void list(AriCallback<List<Application>> callback) {
buildList();
httpActionAsync(callback, new TypeReference<List<Application_impl_ari_1_8_0>>() {});
}

/**********************************************************
 * Stasis application
 * 
 * Get details of an application.
 *********************************************************/
private void buildGet(String applicationName) {
reset();
url = "/applications/" + applicationName + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Application does not exist.") );
}

@Override
public Application get(String applicationName) throws RestException {
buildGet(applicationName);
String json = httpActionSync();
return deserializeJson( json, Application_impl_ari_1_8_0.class ); 
}

@Override
public void get(String applicationName, AriCallback<Application> callback) {
buildGet(applicationName);
httpActionAsync(callback, Application_impl_ari_1_8_0.class);
}

/**********************************************************
 * Stasis application
 * 
 * Subscribe an application to a event source.
 * Returns the state of the application after the subscriptions have changed
 *********************************************************/
private void buildSubscribe(String applicationName, String eventSource) {
reset();
url = "/applications/" + applicationName + "/subscription";
method = "POST";
lParamQuery.add( HttpParam.build( "eventSource", eventSource) );
lE.add( HttpResponse.build( 400, "Missing parameter.") );
lE.add( HttpResponse.build( 404, "Application does not exist.") );
lE.add( HttpResponse.build( 422, "Event source does not exist.") );
}

@Override
public Application subscribe(String applicationName, String eventSource) throws RestException {
buildSubscribe(applicationName, eventSource);
String json = httpActionSync();
return deserializeJson( json, Application_impl_ari_1_8_0.class ); 
}

@Override
public void subscribe(String applicationName, String eventSource, AriCallback<Application> callback) {
buildSubscribe(applicationName, eventSource);
httpActionAsync(callback, Application_impl_ari_1_8_0.class);
}

/**********************************************************
 * Stasis application
 * 
 * Unsubscribe an application from an event source.
 * Returns the state of the application after the subscriptions have changed
 *********************************************************/
private void buildUnsubscribe(String applicationName, String eventSource) {
reset();
url = "/applications/" + applicationName + "/subscription";
method = "DELETE";
lParamQuery.add( HttpParam.build( "eventSource", eventSource) );
lE.add( HttpResponse.build( 400, "Missing parameter; event source scheme not recognized.") );
lE.add( HttpResponse.build( 404, "Application does not exist.") );
lE.add( HttpResponse.build( 409, "Application not subscribed to event source.") );
lE.add( HttpResponse.build( 422, "Event source does not exist.") );
}

@Override
public Application unsubscribe(String applicationName, String eventSource) throws RestException {
buildUnsubscribe(applicationName, eventSource);
String json = httpActionSync();
return deserializeJson( json, Application_impl_ari_1_8_0.class ); 
}

@Override
public void unsubscribe(String applicationName, String eventSource, AriCallback<Application> callback) {
buildUnsubscribe(applicationName, eventSource);
httpActionAsync(callback, Application_impl_ari_1_8_0.class);
}

/** No missing signatures from interface */
};

