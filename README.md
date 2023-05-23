# Public documentation of Pääsuke

General introduction: https://www.ria.ee/riigi-infosusteem/kesksed-platvormid-avalike-e-teenuste-pakkumiseks/paasuke

## Specification draft

### X-Road services offered to Pääsuke

Systems that keep mandates on their side and open API to Pääsuke to query and change them

X-road services spec draft:
* The latest version is [0.9.0](spec/Pääsuke-xroad-services-spec-v0.9.0.pdf) - 23 May 2023

OpenAPI definitions: 
* https://app.swaggerhub.com/apis/aasaru/x-road-services-consumed-by-paasuke/

* Description of an example mock service built according to version 0.7.5 of that spec: [sample_client_mock](mock-documentation/description-of-PRIA-mock-for-paasuke-v0.1.pdf)

### X-Road services offered by Pääsuke

The following specification is for systems that keep mandates in Pääsuke and load them from there using X-Road queries.
Spec is currently work-in-progress.

OpenAPI definitions: https://app.swaggerhub.com/apis/aasaru/x-road-services-provided-by-paasuke/

## Prototype

* Prototype is available here: https://paasuke.github.io/proto/

Browse around (mandates defined by law (Äriregistrist), global mandates (katusrollid), regular mandates)
and try adding a mandate, try to remove a mandate, try to sub-delegate a mandate.

The Prototype shows that editing a mandate is possible but currently that is not in scope.

## Mock service

Ver 0.7.4 is available via x-road:
https://security-server/r1/ee-dev/GOV/70006317/volitused-mock/volitused/v1/

Example query to x-road security server:

```
curl 
 --insecure 
 --cert /path/to/trusted.crt
 --key /path/to/trusted.key 
 -H "accept: application/json" 
 -H "X-Road-Client: ee-dev/GOV/70006317/volitused" 
 -H "X-Road-User-Id: EE39301020304" 
 -H "X-Road-Id: PRIA" 
 "https://your.xroad.security.server.host/r1/ee-dev/GOV/70006317/volitused-mock/volitused/v1/roles"
```

The code serving the mock is available in directory: ph-xroad-api-mock
