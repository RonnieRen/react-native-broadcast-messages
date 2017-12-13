
# react-native-events

## Getting started

`$ npm install react-native-events --save`

### Mostly automatic installation

`$ react-native link react-native-events`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-events` and add `RNEvents.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNEvents.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNEventsPackage;` to the imports at the top of the file
  - Add `new RNEventsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-events'
  	project(':react-native-events').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-events/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-events')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNEvents.sln` in `node_modules/react-native-events/windows/RNEvents.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Events.RNEvents;` to the usings at the top of the file
  - Add `new RNEventsPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNEvents from 'react-native-events';

// TODO: What to do with the module?
RNEvents;
```
  