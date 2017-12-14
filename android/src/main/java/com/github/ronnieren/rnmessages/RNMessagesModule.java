
package com.github.ronnieren.rnmessages;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.Arrays;


public class RNMessagesModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    static ArrayList<String> supportedEventNames = new ArrayList<>();
    static {
        supportedEventNames.add("OnMessage");
    }


    public RNMessagesModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNMessages";
    }

    static public String[] supportedEvents() {
        String [] eventNames = {};
        return supportedEventNames.toArray(eventNames);
    }


    @ReactMethod
    public void postMessage(String eventName, @Nullable ReadableMap params) {

        if(Arrays.asList(supportedEvents()).contains( eventName)) {
            WritableMap map = Arguments.createMap();
            map.merge(params);
            this.reactContext
                    .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                    .emit(eventName, map);
        }
    }
}