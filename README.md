# Sidenotes

Gute Infoquelle: http://alistapart.com/article/get-started-with-git


Folgende Kommandos sind wichtig: 


git clone https://github.com/sam4ritan/kingfisher.git //Erzeugt einen lokalen Ordner des Projekts


git add . //Fügt alle Änderungen dem aktuellen Commit hinzu

git add <Datei1.endung> <Datei2.endung> //Wenn nur bestimmte Dateien commited werden sollen

//git add ist auch nötig, um neue Dateien der Repo hinzuzufügen

git commit -m "Commit Kommentar (Flag)" //Der eigentliche Commit, ohne diesen wird nichts dauerhaft; Bitte immer sinnvoll Kommentieren, das ist ein Wiederherstellungspunkt falls etwas schief läuft


git commit -a -m "Commit Kommentar (Flag)" //Fasst die beiden Schritte (add und commit) zusammen

git push <repo> <branch> //Fügt die Commits der GitHub Repo hinzu; <repo> ist normalerweise 'origin'; <branch> kann benannt werden, sonnst wird nach einem Branch mit gleichem Namen wie lokal gesucht, sonst kommt es zur Fehlermeldung


git checkout -b <branch> //Erzeugt einen neuen lokalen Branch

git push --set-upstream <repo> <branch> //Erzeugt den neuen Branch in der GitHub Repo und pusht


git remote -v //Zeigt derzeitige Kürzel für remote Repos (aka. GitHub) an, nur um zu checken, ob alles richtig konfiguriert ist, wenn es zu problemen kommt

git log //Zeigt alle Commits auf aktuellem 

git branch //Zeigt die lokalen Branches an

git checkout //Wechselt lokalen Branch