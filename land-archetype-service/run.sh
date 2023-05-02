#!/bin/bash
set -e
mvn clean -T 1C install -f ../pom.xml -Dmaven.test.skip=true -U
if [ $JREBEL_HOME ]; then
    export JAVA_OPTS="$JAVA_OPTS -noverify -agentpath:$JREBEL_HOME/lib/libjrebel64.dylib"
    echo "SETTING JREBEL=$JREBEL_HOME/lib/libjrebel64.dylib"
fi
$JAVA_8_HOME/bin/java $JAVA_OPTS \
-Xms1024m -Xmx1024m \
-Dspring.application.name=land-archetype \
-Dspring.cloud.nacos.config.file-extension=yml \
-Duser.timezone=GMT+08 \
-Dspring.cloud.nacos.discovery.server-addr=tencent.local:8848 \
-Dspring.cloud.nacos.discovery.namespace=land-dev \
-Dspring.cloud.nacos.discovery.username=nacos \
-Dspring.cloud.nacos.discovery.password=bTzs0FN8WdDvspJvdO3g \
-Dspring.cloud.nacos.config.server-addr=tencent.local:8848 \
-Dspring.cloud.nacos.config.namespace=land-dev \
-Dspring.cloud.nacos.config.username=nacos \
-Dspring.cloud.nacos.config.password=bTzs0FN8WdDvspJvdO3g \
-Dspring.config.import=nacos:land-archetype \
-jar ./target/land-archetype-service-0.0.1-SNAPSHOT.jar
