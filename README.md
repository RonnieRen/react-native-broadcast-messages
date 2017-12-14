
# react-native-messages

## Getting started

`$ npm install react-native-messages --save`

### Mostly automatic installation

`$ react-native link react-native-messages`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-messages` and add `RNMessages.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNMessages.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNMessagesPackage;` to the imports at the top of the file
  - Add `new RNMessagesPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-messages'
  	project(':react-native-messages').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-messages/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-messages')
  	```

#### Windows
    TODO


## Usage
```javascript
import RNMessages from 'react-native-messages';

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
