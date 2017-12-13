
package com.github.ronnieren.rnevents;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
mport com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class RNEventsModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNEventsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNEvents";
    }


    @ReactMethod
    public void postEvent(String eventName, @Nullable ReadableMap params) {
        WritableMap map = Arguments.createMap();
        map.merge(params);
        this.reactContext
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit(eventName, map);
    }
}