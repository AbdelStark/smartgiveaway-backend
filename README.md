[![smartgiveaway-backend Actions Status](https://github.com/abdelhamidbakhta/smartgiveaway-backend/workflows/smartgiveaway-backend-ci/badge.svg)](https://github.com/abdelhamidbakhta/smartgiveaway-backend/actions)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/abdelhamidbakhta/smartgiveaway-backend/blob/master/LICENSE)
[![sonar-quality-gate][sonar-quality-gate]][sonar-url] [![sonar-coverage][sonar-coverage]][sonar-url] [![sonar-bugs][sonar-bugs]][sonar-url] [![sonar-vulnerabilities][sonar-vulnerabilities]][sonar-url]
# Tommy Gun Eth

## Description

Build large state Ethereum testnet using standalone HTTP service connected to an Ethereum client.

## Installation

### Install Prerequisites

* Java 11

### Build Instructions

```shell script
./gradlew assemble
```

## Usage

```shell script
java -jar java -jar build/libs/smartgiveaway-backend.jar
```

OR

```shell script
./gradlew bootRun
```

## Code Style

We use Google's Java coding conventions for the project. To reformat code, run: 

```shell script 
./gradlew spotlessApply
```

Code style is checked automatically during a build.

## API

### Open API v3

Go to http://localhost:8080 to see the API definition in a web browser.

API docs specification are available at http://localhost:8080/v3/api-docs

## Docker

### Build image

#### Using plain docker file
```shell script
docker build -t $IMAGE_NAME .
```

#### Using gradle task
```shell script
./gradlew bootBuildImage --imageName=$IMAGE_NAME
```

### Run container

```shell script
docker run -p 8080:8080 -t $IMAGE_NAME
```

### Use existing image

```shell script
docker run -p 8080:8080 abdelhamidbakhtaconsensys/smartgiveaway-backend:latest
```


[sonar-url]: https://sonarcloud.io/dashboard?id=abdelhamidbakhta_smartgiveaway-backend
[sonar-quality-gate]: https://sonarcloud.io/api/project_badges/measure?project=abdelhamidbakhta_smartgiveaway-backend&metric=alert_status
[sonar-coverage]: https://sonarcloud.io/api/project_badges/measure?project=abdelhamidbakhta_smartgiveaway-backend&metric=coverage
[sonar-bugs]: https://sonarcloud.io/api/project_badges/measure?project=abdelhamidbakhta_smartgiveaway-backend&metric=bugs
[sonar-vulnerabilities]: https://sonarcloud.io/api/project_badges/measure?project=abdelhamidbakhta_smartgiveaway-backend&metric=vulnerabilities