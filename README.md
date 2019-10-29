# Project2
The sole purpose of this project is to read in mesostations from a text file, find the index of that station, the average of stations surrounding it, find the ceiling, floor and average of the ascii values of the letters in the stid passed in, find the letter average, and get the total number of stations that start with the letter average.
#### Motivation
The reason this project exists is to find the average of the stationIDs, the ascii values of the letters, and the stations that start with the same letter average.
#### Code
*Classes*
##### MesoInherit
This class extends MesoAbstract which holds the methods to calculate the ascii average and also the letter average. It also finds the ceiling and the floor of the ascii values.
##### PosAvg
This class reads in all the stations from mesonet.txt, stores the values, finds the index of the station in the text file, and find the average words surrounding the station in the text file.
##### LetterAvg
This class finds the number of station that starts with the letter average from MesoInherit and then gets the stations from the array that starts with the letter and then finally prints it off.
##### MesoStation
This class stores the stid passed into MesoInherit.
##### MesoAbstract
This class is abstract and has the methods the MesoInherit uses to find the ascii average and the letter average. Then, it finds the ceiling and the floor of the ascii values. 