#!/bin/bash
set -e
echo "====land.archetype build successfully"
mvn clean archetype:create-from-project -Darchetype.properties=archetype.properties -Darchetype.filteredExtentions=* -DpackageName=com.land.template
echo "====land.archetype build successfully"
mvn install javadoc:jar source:jar -f target/generated-sources/archetype/pom.xml
echo "====land.archetype install successfully"
