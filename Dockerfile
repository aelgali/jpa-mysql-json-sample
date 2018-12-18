FROM java:8-alpine

ENV SRC_HOME /src/app

RUN mkdir -p $SRC_HOME

WORKDIR $SRC_HOME
ADD ["gradle", "$SRC_HOME/gradle/"]
ADD ["build.gradle", "gradlew", "$SRC_HOME/"]
RUN ["./gradlew", "downloadDeps"]

ADD . $SRC_HOME

RUN ["./gradlew", "clean", "build"]

ENTRYPOINT ["./gradlew", "bootRun"]