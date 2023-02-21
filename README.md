# Public documentation of Pääsuke

General introduction: https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke

## Specification draft

### X-Road services offered to Pääsuke

Systems that keep mandates on their side and open API to Pääsuke to query and change them

X-road services spec draft:
* Latest version is [0.7.3](spec/Pääsuke-xroad-services-spec-v0.7.3.pdf) - 21 February 2023

OpenAPI definitions: 
* https://app.swaggerhub.com/apis/aasaru/x-road-services-consumed-by-paasuke/

* Description of an example mock service built according to version 0.6.0 of that spec: [sample_client_mock.v0.2](description-of-EMTA-mock-for-paasuke-v0.2.pdf)

### X-Road services offered by Pääsuke

This is for systems that keep mandates in Pääsuke and load them from there using X-Road queries.
Spec is currently work-in-progress.

OpenAPI definitions: https://app.swaggerhub.com/apis/aasaru/x-road-services-provided-by-paasuke/

## Prototype

* Prototype is available here: https://paasuke.github.io/proto/

Browse around (mandates defined by law (Äriregistrist), global mandates (katusrollid), regular mandates)
and try adding a mandate, try to remove a mandate, try to sub-delegate a mandate.

Prototype shows that editing a mandate is possible but currently that is not in scope.

## Mock service

Ver 0.5.2 is available via x-road:
https://security-server/r1/ee-dev/GOV/70006317/volitused-mock/volitused-estat/v1/

And the code serving the mock is available in directory: ph-xroad-api-mock