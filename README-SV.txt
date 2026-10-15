Scout Client - byggprojekt för Minecraft Fabric 1.21.11

VIKTIGT: Detta är källkod, inte en färdig JAR. Den gamla JAR-filen saknade kompilerade .class-filer.

Enklaste sättet utan att installera utvecklarprogram lokalt är att använda GitHub Actions:
1. Skapa ett konto på github.com om du inte redan har ett.
2. Skapa ett nytt repository och välj att det ska vara tomt.
3. Ladda upp ALLA filer och mappar från denna projektmapp (inklusive .github/workflows/build.yml).
4. Öppna fliken Actions i repositoryt.
5. Välj "Build Scout Client" och klicka "Run workflow" om det inte startar automatiskt efter uppladdningen.
6. Öppna körningen. Om den är grön, ladda ner artefakten "ScoutClient-JAR" längst ner.
7. Packa upp artefakten och lägg scoutclient-1.0.0.jar i Mods-mappen för en Fabric 1.21.11-profil.

Om Actions visar rött är bygget misslyckat. Öppna loggen och kopiera första felmeddelandet hit.

Nuvarande funktioner är begränsade: F6/F7 visar status för funktionsväxlar, F8 visar chunkkoordinater och Right Shift visar hjälptext. Freecam, chest markers, tracers och highlight-funktioner är platshållare och fungerar inte som riktiga visuella funktioner ännu.
