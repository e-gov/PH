# Public documentation of Pääsuke

* General introduction: https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke
* Technical introduction—version [1.0](spec/Introduction_to_Paasuke_and_configuring_roles.v1.0.pdf) - 28 March 2024
* How Pääsuke synchronizes representation rights from the Business Registry—version [0.6](spec/How_Paasuke_handles_representation_rights_from_the_Business_Registry.v0.6.pdf) - 30 January 2024
* Since 7 February 20204 Pääsuke is available in production: https://www.eesti.ee/volitused 

# Specification draft

There are two ways to integrate with Pääsuke:
1) integrator keeps mandates on their side and Pääsuke queries X-Road services [offered to Pääsuke](#x-road-services-offered-to-p%C3%A4%C3%A4suke) by the integrator
2) integrator keeps mandates in Pääsuke and the integrator queries X-Road services [offered by Pääsuke](#x-road-services-offered-by-p%C3%A4%C3%A4suke).

## X-Road services offered to Pääsuke

Systems that keep mandates on their side and open API to Pääsuke to query and change them

X-road services spec draft:
* The latest version is [1.0.1](spec/Pääsuke-xroad-services-spec-v1.0.1.pdf) - 21 March 2024

OpenAPI definitions: 
* https://app.swaggerhub.com/apis/aasaru/x-road-services-consumed-by-paasuke/

### Sample provider application

* Sample provider application built in Python—https://github.com/e-gov/PH-sample-provider-python (based on 1.0.0)
* You can run it locally using Docker-compose
* The provider stores mandates and persons in a Postgres database
* The application keeps state—so if you add a mandate, then you can get it back


## X-Road services offered by Pääsuke

The following specification is for systems that keep mandates in Pääsuke and load them from there using X-Road queries.

* The latest version is [0.5.3](spec/x-road_services_provided_by_paasuke.v0.5.3.pdf) - 26 February 2024

OpenAPI definitions: https://app.swaggerhub.com/apis/aasaru/paasuke-x-road-services-to-query-mandates/


### Actual X-road service in ee-dev environment

In ee-dev environment, the services are made available: https://x-tee.ee/catalogue/ee-dev/GOV/70006317/volitused/

You need to fill in an application to get access to the services.
The application formula can be found:
https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke
(chapter "Taotlused ja tingimused")

Please note that the endpoint is connected to the development environment which might be unstable.


# Mandates manager roles in Pääsuke

* The latest version is [0.1](spec/Mandates_manager_roles_in_Paasuke_v.0.1.pdf) - 11 December 2023