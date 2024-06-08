/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.sdk.proveapi;

import com.prove.sdk.proveapi.utils.Hook.SdkInitData;
import com.prove.sdk.proveapi.utils.HTTPClient;
import com.prove.sdk.proveapi.utils.RetryConfig;
import com.prove.sdk.proveapi.models.components.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
      public String serverUrl;
      public String server;
    public String language = "java";
    public String openapiDocVersion = "1.0.0";
    public String sdkVersion = "0.3.4";
    public String genVersion = "2.339.1";
    public String userAgent = "speakeasy-sdk/java 0.3.4 2.339.1 1.0.0 com.prove.sdk.proveapi";

    private com.prove.sdk.proveapi.utils.Hooks _hooks = new com.prove.sdk.proveapi.utils.Hooks();

    public com.prove.sdk.proveapi.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(com.prove.sdk.proveapi.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        com.prove.sdk.proveapi.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
