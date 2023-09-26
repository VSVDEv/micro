# Read Me First


http://localhost:8080/greeting

http://localhost:8080/greeting?name=vsvdev

git clone https://github.com/svoronkovdevops/ELK.git

cd ELK

docker-compose up -d

cd ..

cd micro

mvn package

java -jar micro-1.jar

localhost:9200/_cat/indices

localhost:5601/app/home#

localhost:5601/app/dev_tools#/console

GET /micro-rest-service

localhost:5601/app/management/kibana/indexPatterns/create
here use micro-*

localhost:5601/app/kibana#/discover

http://localhost:8080/greeting?name=vsvdev

http://localhost:8080/greeting?name=vsv

http://localhost:8080/greeting?name=admin

http://localhost:8080/greeting?name=john

localhost:5601/app/kibana#/discover

filter `level : ERROR` on calendar select `today`

`mvn test` run unit test

`mvn package -DskipUT=true` skip unit test

`mvn verify -DskipUT=true` - skip integration tests and unit test

`mvn verify` - run integration tests and unit test

`mvn verify -Dmaven.test.skip=true` - skip integration tests and unit test


jenkins

mvn clean

mvn compile

mvn test -Dmaven.main.skip=true

mvn package -Dmaven.main.skip=true -DskipUT=true

mvn install -Dmaven.main.skip=true -DskipUT=true -Dpmd.skip=true -DskipCS=true -Dspotbugs.skip=true

`mvn install -Dmaven.main.skip=true -Dpmd.skip=true -DskipCS=true -Dspotbugs.skip=true -Dmaven.test.skip=true`

mvn install -Dmaven.main.skip=true -DskipUT=true -Dspring-boot.repackage.skip=true

mvn install -Dmaven.main.skip=true -DskipUT=true -Dspring-boot.repackage.skip=true -Dmaven.install.skip=true

mvn verify -Dmaven.test.skip=true