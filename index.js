
import { NativeEventEmitter, NativeModules } from 'react-native';

const { RNMessages } = NativeModules;
const RNMessagesEmitter = new NativeEventEmitter(RNMessages);

const postMessage = function(name, data) {
    RNMessages.postMessage(name, data);
}

RNMessagesEmitter.postMessage = postMessage;

export default RNMessagesEmitter;


