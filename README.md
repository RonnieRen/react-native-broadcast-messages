
# react-native-broadcast-messages

## Getting started

`$ npm install react-native-broadcast-messages --save`

### Mostly automatic installation

`$ react-native link react-native-broadcast-messages`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-broadcast-messages` and add `RNMessages.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNMessages.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNMessagesPackage;` to the imports at the top of the file
  - Add `new RNMessagesPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-broadcast-messages'
  	project(':react-native-broadcast-messages').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-broadcast-messages/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-broadcast-messages')
  	```

#### Windows
    TODO


## Usage
```javascript
import RNMessages from 'react-native-broadcast-messages';

// post a event to native side
RNMessages.postMessage({message: "hello"});
let data = {
    greeting: "hello",
    name: "kitty"
}
RNMessages.postMessage({message: data});

// subscribe the message
RNMessages.addListener((data: any) => {
    console.log(data);
});


```
