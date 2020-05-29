# Docker App

## Docker App
### docker build -t mydatapower - < idg_dk2018411.lts.tar
### docker run -it   -v $PWD/config_myConfig:/drouter/config   -v $PWD/local_mylocal:/drouter/local   -e DATAPOWER_ACCEPT_LICENSE=true   -e DATAPOWER_INTERACTIVE=true   -e DATAPOWER_WORKER_THREADS=4   -p 9090:9090 -p 8080:8080 -p 7050:7050  mydatapower

## Enable Web Management
###configure terminal
###web-mgmt
###admin-state "enabled"
###local-address "eth0_ipv4_1" "9090"
###idle 0
###exit


## Create Application Domain

## User Account

## File Management
cert - Directory to upload public certificate and private keys
config - domaing_name.cfg file
checkpoint - copy of configurations and domains
local - xsd, xslt goes here
logstore, logtemp - logging purpose
pubcert - default certs used internally
sharedcert - default domain
temporary 

### Crypto
PUB CERT -> Crypto Certificate 
PUB KEY -> Crypto Key
Crypto Tools to create Key

sscert -> Self Signed
CA -> Certificate Authorities (VERISIGN, GEO TRUST, GLOBAL TRUST)
CSR -> Certificate Signing Request

###

Datapower acts as server, the direction of ssl is reverse. Crypto Identification Credentials. Datapower needs to share it's cert to client.
Datapower acts as client, backend will share pub cert to DP





## Front Side Handler
FSH -> Using front side handler, we receive request of datapower
HTTP -> HTTP FSH
HTTPS -> HTTPS FSH


