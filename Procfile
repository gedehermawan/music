release : java $JAVA_OPTS -jar dbmigration/build/libs/heroku-music-dbmigration-bin.jar --spring.config.location=dbmigration/src/main/resources/application.yml
web : java $JAVA_OPTS -Dserver.port=$PORT -jar web/build/libs/heroku-music.jar