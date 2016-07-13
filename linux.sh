#!/bin/bash

#'path' soll den derzeitigen Pfad auslesen und zur Verarbeitung ermöglichen, ausfälle durch Blanks sind einbezogen

path="$PWD"

java -jar "$path"/jar/kingfisher.jar #Startet Programm, Java wird vorausgesetzt
