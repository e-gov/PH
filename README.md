# Pääsuke infosüsteemi avalik dokumentatsioon

* Tutvustus: https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke
* [Pääsukesega liidestumise äriline kirjeldus ja rollide konfigureerimise kasutusjuhend v1.0](spec/rollide_konfigureerimine_v010.pdf) - 27. jaanuar 2025

# Documentation for the developer implementing the integration with Pääsuke

## Main ways to integrate with Pääsuke:
1) The most common integration pattern is that integrator keeps authorisations (in payloads referred to as mandates) in Pääsuke and the integrator queries X-Road services [offered by Pääsuke](#specification-of-the-x-road-services-that-pääsuke-provides-to-other-parties).
2) It is also possible to keep authorisations in Pääsuke, but use GovSSO service to access the authorisations.
3) integrator keeps authorisations on their information system and Pääsuke queries X-Road services [offered to Pääsuke](#specification-of-the-x-road-services-that-pääsuke-queries-from-other-parties) by the integrator

## Specification of the X-road services that Pääsuke provides to other parties

The following specification is for systems that keep authorisations in Pääsuke and load them from there using X-Road queries.

* <a href="spec/x-road_services_provided_by_paasuke.v1.0.0.pdf" target="_blank" type="application/pdf">Description of X-Road services provided by Pääsuke (Oraakliliides) - v1.0.0</a>
* OpenAPI definitions: https://app.swaggerhub.com/apis/TUGI/paasuke-oraakliliides/

### X-road services in different X-road environments

The services are made available through x-road.

* ee-dev: https://x-tee.ee/catalogue/ee-dev/GOV/70006317/volitused/
  * oraakel - Please note that this endpoint is connected to the development environment which might be unstable.
* ee-test: https://x-tee.ee/catalogue/ee-test/GOV/70006317/volitused/
  * oraakel
  * oraakel-stage - connected with the pre-live environment at https://stage.eesti.ee/volitused that you can requst access (IP whitelisting)
* EE: https://x-tee.ee/catalogue/EE/GOV/70006317/volitused/
  * oraakel (production system)

You need to fill in an application to get access to the services.
The application formula can be found:
https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke
(chapter "Taotlused ja tingimused")


## Specification of the X-road services that Pääsuke queries from other parties

The following specification is for systems that keep authorisations on their own information system and open API to Pääsuke to query and change them

* [Description of X-Road services offered to Pääsuke - v1.0.5](spec/Pääsuke-xroad-services-spec-v1.0.5.pdf) - 13 August 2024
* OpenAPI definitions: https://app.swaggerhub.com/apis/TUGI/x-road-services-consumed-by-paasuke/

### Sample provider application 

There is a sample application that provides these X-road services. The application is built in Python and uses Postgres as a database.

* Sample provider application built in Python—https://github.com/e-gov/PH-sample-provider-python (based on 1.0.0)
* You can run it locally using Docker-compose
* The provider stores authorisations and persons in a Postgres database
* The application keeps state—so if you add an authorisation, then you can get it back





