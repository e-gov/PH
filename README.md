# Pääsuke infosüsteemi avalik dokumentatsioon

* Tutvustus: https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke
* Rollide konfigureerimise kasutusjuhend:  [v1.0](spec/rollide_konfigureerimine_v010.pdf) - 27. jaanuar 2025

# Liidestumise inglisekeelne dokumentatsioon

* Querying representation rights defined in the Business Registry [1.0](spec/Querying_representation_rights_defined_in_the_Business_Registry.1.0.pdf) - 16 August 2024

# Specification draft

There are two ways to integrate with Pääsuke:
1) integrator keeps mandates on their side and Pääsuke queries X-Road services [offered to Pääsuke](#x-road-services-offered-to-p%C3%A4%C3%A4suke) by the integrator
2) integrator keeps mandates in Pääsuke and the integrator queries X-Road services [offered by Pääsuke](#x-road-services-offered-by-p%C3%A4%C3%A4suke).

## X-Road services offered to Pääsuke

Systems that keep mandates on their side and open API to Pääsuke to query and change them

X-road services spec:
* The latest version is [1.0.5](spec/Pääsuke-xroad-services-spec-v1.0.5.pdf) - 13 August 2024

OpenAPI definitions: 
* https://app.swaggerhub.com/apis/TUGI/x-road-services-consumed-by-paasuke/

### Sample provider application

* Sample provider application built in Python—https://github.com/e-gov/PH-sample-provider-python (based on 1.0.0)
* You can run it locally using Docker-compose
* The provider stores mandates and persons in a Postgres database
* The application keeps state—so if you add a mandate, then you can get it back

## X-Road services offered by Pääsuke

### Specification of the X-road services

The following specification is for systems that keep mandates in Pääsuke and load them from there using X-Road queries.

* The latest version is [0.5.3](spec/x-road_services_provided_by_paasuke.v0.5.3.pdf) - 26 February 2024

OpenAPI definitions: https://app.swaggerhub.com/apis/TUGI/paasuke-oraakliliides/


### X-road services in different X-road environments

The services are made available through x-road.

* ee-dev: https://x-tee.ee/catalogue/ee-dev/GOV/70006317/volitused/
  * oraakel
* ee-test: https://x-tee.ee/catalogue/ee-test/GOV/70006317/volitused/
  * oraakel
  * oraakel-stage (different database)
  * Government IP-s can request access the pre-live environment at https://stage.eesti.ee/volitused
* EE: https://x-tee.ee/catalogue/EE/GOV/70006317/volitused/
  * oraakel (production system)

You need to fill in an application to get access to the services.
The application formula can be found:
https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke
(chapter "Taotlused ja tingimused")

Please note that the endpoint is connected to the development environment which might be unstable.


