#!/bin/bash

#'cwd' soll den derzeitigen Pfad auslesen und zur Verarbeitung ermöglichen, ausfälle durch Blanks sind einbezogen

cwd="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

java -jar "$cwd/jar/kingfisher_a0_0_5.jar" #Startet Programm, Java wird vorausgesetzt
