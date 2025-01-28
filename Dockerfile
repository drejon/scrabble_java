FROM gradle:7.3-jdk17 as base

RUN apt-get update && apt-get install -y entr

WORKDIR /opt/workdir

COPY build.gradle /opt/workdir/

COPY ./src /opt/workdir/src

RUN gradle build

CMD ["java", "-cp", "build/classes/java/main", "Game"]
