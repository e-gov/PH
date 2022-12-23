# Public documentation of Pääsuke

General introduction: https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke

## Specification draft

X-road services spec draft:
* Latest version is [0.4.1](Pääsuke-xroad-services-spec-v0.4.1.pdf) - 23 December 2022

OpenAPI definitions: https://app.swaggerhub.com/apis/aasaru/paasuhalduse-x-tee-teenused/0.4.1#/

## Prototype

* The latest prototype is [0.4](proto/paasuke_proto_0.4.zip) - 23 December 2022

Unzip it and open index.html with browser.
Browse around (mandates defined by law (Äriregistrist), global mandates (katusrollid), regular mandates)
and try adding a mandate, try to remove a mandate, try to sub-delegate a mandate.


## Mock service

Available via x-road:
https://security-server/r1/ee-dev/GOV/70006317/volitused-mock/volitused-estat/v1/

And the code serving the mock is available in directory: ph-xroad-api-mock