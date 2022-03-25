# Zelda-OoT-Item-Tracker
<b>Quick Guide</b>:

Item tracking:
Track your current recieved item with left clicking on the specific icon to the item.

Tracking originial position:
To track the original position of vanilla item, use right click.

Example:    When you get Goron Tunic at the location of Kokiri sword, right click on Kokiri Sword to give yourself an overview which item you have already checked.

Note:       If keysanity is activated, due to lack of enough space within the application, tracking the origin spot of dungeon keys is currently not possible.

Song storage:
You also can store your chosen scarescrow song (the same as Horror Kid minigame) by typing your combination in the given text field.

Grotto tracker:
You can track your progress with visiting grottos by clicking the specific checkbox within the grotto panel.

Triforce Hunt:
In case you activated the Trifoce hunt in the randomizer settings, you can set your chosen value for the number of Triforce pieces you want to find.
Click 'add' to add your value to the tracker.


During the next days / weeks  I will add more detailed information like pictures to the readme file, or I will reorganize the information structure within this repository.

Also I will change the readability of the information files.



<b>Installation Guide</b>:

Supported OS:
Mac OS X, Windows 11, Windows 10, windows 7, Windows 8, Windows Vista, Windows XP
Linux (not tested yet)

Due to the fact that Java is a multiplatform programming languague, which means that after creating the final .jar file, it should be possible to run the application on Windows, Linux and Mac.




<b>Devlog</b>:

_2022-03-08:_<br>
- Migrating to GitGHub <br>
- Redoing GUI due to XML Code Problems <br>
- Adding items
- changing file structure to following basics: <br>
            - separate controller classes in frontend and backend controller and focus on fewer dependencies in between those two classes as possible

_2022-03-09:_ <br>
- finishing with adding child, adult and mixed items
- no fixing necessary, all functions work as intended  

_2022-03-10:_ <br>
- adding dungeon panel with dungeon specific items

_2022-03-12:_<br>
- fixing a problem where the order of appearance of main panels didn't show up in the planned order
- cleaning up code for better overview
- adding forest, fire, water and shadow temple related items

_2022-03-13:_
- adding shadow, sprit, light related items, spiritual stone, mics. songs
- experimenting with layout structure to show number of keys

_2022-03-14:_
- adding placeholder for collectible items and name all elements
- rearrange gui pattern, because of key count issue

_2022-03-15:_
- slightly rearranging patterns to save a little width
- small spacer between dungeon items
- scarecrow and horror kid mini game moved to core items
- adding scroll pane to grotto panel with information about location of grotto
- adding icons and functions of biggoron sword and mask trade sequence

_2022-03-18:_
- adding scare crow and horror kid minigame icons
- check and adjust panel names with given name convention
- collect first ideas how to implement key counting function

_2022-03-21:_
- fixing a problem where IDE graphical output of GUI designer showed artifacts
- adding grotto scroll panel

_2022-03-25:_
- adding heartpiece panel and skulltula panel in GUI and set the functionality
- added quick guide, supported OS information in plain text

