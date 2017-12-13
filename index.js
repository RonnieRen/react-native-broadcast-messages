
import { NativeEventEmitter, NativeModules } from 'react-native';

const { RNEvents } = NativeModules;
const RNEventsEmitter = new NativeEventEmitter(RNEvents);

RNEventsEmitter.postEvent = function(name, data) {
    RNEvents.postEvent(name, data);
}

export default RNEventsEmitter


