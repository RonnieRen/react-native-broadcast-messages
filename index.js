
import { NativeEventEmitter, NativeModules } from 'react-native';

const { RNEvents } = NativeModules;
const RNEventsEmitter = new NativeEventEmitter(RNEvents);

const postEvent = function(name, data) {
    RNEvents.postEvent(name, data);
}

RNEventsEmitter.postEvent = postEvent;

export default RNEventsEmitter;


