html-5-game-android-template
============================

A simple template to package HTML5 Games within an android app

#####Step One: Importing into Android Studio
After downloading [Android Studio](https://developer.android.com/sdk/installing/studio.html) and cloning or downloading this repo you will need to import the project to start editing.

1. In Android Studio, close any projects currently open. You should see the Welcome to Android Studio window.
Click Import Project.
2. Locate where you downloaded the repo and select the build.gradle file and click OK.
3. In the following dialog, leave Use gradle wrapper selected and click OK. (You do not need to specify the Gradle home.)
 
[Importing Source from Google](https://developer.android.com/sdk/installing/migrate.html#Export)

#####Step Two: Adding your URL
To begin making changes to support your game first look to [GameActivity.java](https://github.com/matthewcmckenna/html5-game-android-template/blob/master/app/src/main/java/example/com/html5gametemplate/GameActivity.java) and change these variables: 
```
private final boolean FULL_SCREEN = true;
private final String GAME_URL = "http://www.example.com"; 
```

#####Step Three: Renaming Things
* Next look in [strings.xml](https://github.com/matthewcmckenna/html5-game-android-template/blob/master/app/src/main/res/values/strings.xml) and make changes to`<string name="app_name">HTML5 Game Template</string>` if you have chosen to not be full screen.
* ***IF YOU PLAN ON PUBLISHING TO THE STORE YOU MUST HAVE A UNIQUE PACKAGE NAME***
  * The apps in Google Play are recognized by their package name (i.e. `com.example.mygame`) therefore each needs to be unique. The convention of using the reverse of a domain name that the publisher owns ensures that each will be unique. To publish using this template you will have to refactor the package name to make it unique by either adding to it or altering it to be your own entirely.
  *  [Here is a stackoverflow resource on renaming the package](http://stackoverflow.com/questions/16804093/android-studio-rename-package)


#####Step Four: Running your app
* Running on a `Real Device`
  * [Check out Google's guide on how to run apps on a real device](http://developer.android.com/training/basics/firstapp/running-app.html#RealDevice)
* Running on an `Emulator`
  * [Check out Google's guide on how to run apps on an emulator](http://developer.android.com/training/basics/firstapp/running-app.html#Emulator)


#####Step Five: Lift Off
A big part of every app/game is the launch icon. This is the first representation your app gets and can make or break the chance that a user will install your app/game. To change the launch icon there are four images you need to change located in the [drawable](https://github.com/matthewcmckenna/html5-game-android-template/tree/master/app/src/main/res) folders. The suffix of the drawable folders (mdpi,hdpi,xhdpi,xxhdpi) represents different screen resolutions/densities (listed in increasing order). To change your launch icon you must replace the `ic_launcher.png` in each of these folders retaining their respective size. Transparency and negative space are allowed.
