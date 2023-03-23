DEBUG_PORT=$1
MAVEN_RELOAD=$2
mvn clean -T 1C install -f ../../pom.xml $MAVEN_RELOAD -Dmaven.test.skip=true -U
mvn clean -T 1C package -f ../pom.xml $MAVEN_RELOAD -Dmaven.test.skip=true -U
if [ -n $JREBEL_HOME ]; then
    export JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=$DEBUG_PORT"
    export JAVA_OPTS="$JAVA_OPTS -noverify -agentpath:$JREBEL_HOME/lib/libjrebel64.dylib"
    echo "SETTING JREBEL=$JREBEL_HOME/lib/libjrebel64.dylib"
fi
java $JAVA_OPTS \
-Xms1024m -Xmx1024m \
-Dspring.application.name=your_app_name \
-Dspring.cloud.nacos.config.file-extension=yml \
-Duser.timezone=GMT+08 \
-jar ./target/service-0.0.1-SNAPSHOT.jar
