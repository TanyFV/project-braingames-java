.DEFAULT_GOAL := build-run

compile: clean
	mkdir -p ./target/classes
	javac -d ./target/classes ./src/main/java/games/BrainGames.java

run:
	java -jar  /home/haruka/project-braingames-java/target/project-braingames-java-1.0-SNAPSHOT-jar-with-dependencies.jar

clean:
	rm -rf ./target

build-run: build run

build: code-lint
	./mvnw clean package

update:
	./mvnw versions:update-properties
	./mvnw versions:display-plugin-updates

code-lint:
	./mvnw checkstyle:checkstyle