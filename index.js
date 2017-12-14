
import { NativeEventEmitter, NativeModules } from 'react-native';

const { RNMessages } = NativeModules;
const RNMessagesEmitter = new NativeEventEmitter(RNMessages);

const postEvent = function(name, data) {
    RNMessages.postEvent(name, data);
}

RNMessagesEmitter.postEvent = postEvent;

export default RNMessagesEmitter;


