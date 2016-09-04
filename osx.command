#!/bin/bash

#'path' soll den derzeitigen Pfad auslesen und zur Verarbeitung ermöglichen, ausfälle durch Blanks sind einbezogen

#pathlin="$PWD"

cwd="$( cd "$( directoryname "${BASH_SOURCE[0]}" )" && pwd )"

java -jar "$cwd/jar/kingfisher_a0_0_3.jar" #Startet Programm, Java wird vorausgesetzt
