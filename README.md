# Public documentation of Pääsuke

General introduction: https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke

## Specification draft

### X-Road services offered to Pääsuke

Systems that keep mandates on their side and open API to Pääsuke to query and change them

X-road services spec draft:
* Latest version is [0.6.0](Pääsuke-xroad-services-spec-v0.6.0.pdf) - 31 January 2023
  * Description of an example mock service built according to version 0.6.0 of that spec: [sample_client_mock.v0.2](description-of-EMTA-mock-for-paasuke-v0.2.pdf)

OpenAPI definitions: 
* https://app.swaggerhub.com/apis/aasaru/paasuhalduse-x-tee-teenused/0.6.0#/Offered%20to%20P%C3%A4%C3%A4suke
* https://app.swaggerhub.com/apis/aasaru/paasuhalduse-x-tee-teenused/0.6.0#/Offered%20to%20P%C3%A4%C3%A4suke%20(additional)

### X-Road services offered by Pääsuke

This is for systems that keep mandates in Pääsuke and load them from there using X-Road queries.
Spec is currently work-in-progress.

OpenAPI definitions: https://app.swaggerhub.com/apis/aasaru/paasuhalduse-x-tee-teenused/0.6.0#/Offered%20by%20P%C3%A4%C3%A4suke

## Prototype

* Prototype is available here: https://paasuke.github.io/proto/

Browse around (mandates defined by law (Äriregistrist), global mandates (katusrollid), regular mandates)
and try adding a mandate, try to remove a mandate, try to sub-delegate a mandate.

Prototype shows that editing a mandate is possible but currently that is not in scope.

## Mock service

Ver 0.5.2 is available via x-road:
https://security-server/r1/ee-dev/GOV/70006317/volitused-mock/volitused-estat/v1/

And the code serving the mock is available in directory: ph-xroad-api-mock