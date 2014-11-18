html-5-game-android-template
============================

A simple template to package HTML5 Games within an android app

#####Step One: Adding your URL
To begin making changes to support your game first look to [GameActivity.java](https://github.com/matthewcmckenna/html5-game-android-template/blob/master/app/src/main/java/example/com/html5gametemplate/GameActivity.java) and change these variables: 
```
private final boolean FULL_SCREEN = true;
private final String GAME_URL = "http://www.example.com"; 
```

#####Step Two: Renaming Things
* Next look in [strings.xml](https://github.com/matthewcmckenna/html5-game-android-template/blob/master/app/src/main/res/values/strings.xml) and make changes to`<string name="app_name">HTML5 Game Template</string>` if you have chosen to not be full screen.
* ***IF YOU PLAN ON PUBLISHING TO THE STORE YOU MUST HAVE A UNIQUE PACKAGE NAME***
  * The apps in Google Play are recognized by their package name (i.e. `com.example.mygame`) therefore each needs to be unique. The convention of using the reverse of a domain name that the publisher owns ensures that each will be unique. To publish using this template you will have to refactor the package name to make it unique by either adding to it or altering it to be your own entirely.
  *  [Here is a stackoverflow resource on renaming the package](http://stackoverflow.com/questions/16804093/android-studio-rename-package)


#####Step Three: Running your app
* Running on a `Real Device`
  * [Check out Google's guide on how to run apps on a real device](http://developer.android.com/training/basics/firstapp/running-app.html#RealDevice)
* Running on an `Emulator`
  * [Check out Google's guide on how to run apps on an emulator](http://developer.android.com/training/basics/firstapp/running-app.html#Emulator)
