
# Adapter application (Python) 

This application is an adapter for Pääsuke.
This is used by a party who keeps mandates on their side but offers a standard service
for Pääsuke for it to query mandates.

The idea is that there is a Postgres database that keeps the data.
Into that Postgres database we create view and procedures that this app calls.


## How this application differs from mocks

There is an application that mimics the different parties:
https://github.com/e-gov/PH/tree/main/ph-xroad-api-mock
The mock does not keep state. This application does.

## Prerequisite

Use Docker-compose to start up a Postgres database.
This database has a few tables to sore information about mandates.


## How this app was made

1. Open https://app.swaggerhub.com/apis/aasaru/x-road-services-consumed-by-paasuke/0.8.0#/
2. Export server stub -> python flask


## Configuration
1. List of roles => view


