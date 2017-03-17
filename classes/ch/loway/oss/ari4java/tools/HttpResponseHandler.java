package ch.loway.oss.ari4java.tools;

/**
 * Interface to implementation that can handle HTTP responses
 *
 * @author mwalton
 */
public interface HttpResponseHandler {

    /**
     * Client started sending response.
     */
    void onChReadyToWrite();

    /**
     * Server finished sending response
     */
    void onResponseReceived();

    /**
     * WebSocket connected
     */
    void onConnect();
    
    /**
     * WebSocket disconnected
     */
    void onDisconnect();
    
    /**
     * WebSocket reconnect stopped
     */
    void onReconnectStopped();

    /**
     * All went well.
     *
     * @param response
     */
    void onSuccess(String response);

    /**
     * Something bad happened.
     *
     * @param e
     */
    void onFailure(Throwable e);

    /**
     * The last time in epoch since last response
     *
     * @return epoch
     */
    long getLastResponseTime();
}
