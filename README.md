# Sidenotes

Gute Infoquelle: http://alistapart.com/article/get-started-with-git


Folgende Kommandos sind wichtig: 


git clone https://github.com/sam4ritan/kingfisher.git //Erzeugt einen lokalen Ordner des Projekts


git add . //Fügt alle Änderungen dem aktuellen Commit hinzu

git add DATEI1.endung DATEI2.endung //Wenn nur bestimmte Dateien commited werden sollen

//git add ist auch nötig, um neue Dateien der Repo hinzuzufügen

git commit -m "Commit Kommentar (Flag)" //Der eigentliche Commit, ohne diesen wird nichts dauerhaft; Bitte immer sinnvoll Kommentieren, das ist ein Wiederherstellungspunkt falls etwas schief läuft


git commit -a -m "Commit Kommentar (Flag)" //Fasst die beiden Schritte (add und commit) zusammen

git push REPO BRANCH //Fügt die Commits der GitHub Repo hinzu; REPO ist normalerweise 'origin'; BRANCH kann benannt werden, sonnst wird nach einem Branch mit gleichem Namen wie lokal gesucht, sonst kommt es zur Fehlermeldung


git checkout -b BRANCH //Erzeugt einen neuen lokalen Branch

git push --set-upstream REPO BRANCH //Erzeugt den neuen Branch in der GitHub Repo und pusht


git fetch //lädt eventuelle Änderungen von der Repo herunter; --all führt den Befehl für alle lokalen Branches durchD

git reset REPO/BRANCH //Zeigt, ob es Änderungen gibt und fügt NEUE Dateien hinzu

git reset --hard REPO/BRANCH //Setzt den lokalen Branch auf das Niveau der Repo. ÜBERSCHREIBT ALLE DATEN! Evtl vorher einen neuen lokalen Branch als Backup erstellen



git remote -v //Zeigt derzeitige Kürzel für remote Repos (aka. GitHub) an, nur um zu checken, ob alles richtig konfiguriert ist, wenn es zu problemen kommt

git log //Zeigt alle Commits auf aktuellem 

git branch //Zeigt die lokalen Branches an

git checkout //Wechselt lokalen Branch

git rm DATEI1.endung //Entfernt die Datei

git rm --cached DATEI1.endung//Entfernt die Datei in der Repo, belässt die lokale Kopie


git push origin --delete BRANCH //Entfernt einen Branch im GitHub

git branch -D BRANCH //Entfernt einen Branch lokal


git pull //um nach commits zu aktualisieren, wenn die konsole es anbietet

#Best Practices

1. Für jedes neue Feature einen separaten Branch erstellen, gemerged wird später

2. Bei Commit-Konflikten einen neuen Branch erstellen
