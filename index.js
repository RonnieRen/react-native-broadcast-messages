
import { NativeEventEmitter, NativeModules } from 'react-native';

const { RNMessages } = NativeModules;
const RNMessagesEmitter = new NativeEventEmitter(RNMessages);

const postMessageName = "OnMessage";

const postMessage = function(data) {
    RNMessages.postMessage(postMessageName, data);
}

const addListener = function(callBack: (data) => void){
    RNMessagesEmitter.addListener(postMessageName, callBack);
}

export default {
    postMessage,
    addListener
};


