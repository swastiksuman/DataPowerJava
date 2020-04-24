# Docker App

## Docker App
docker run -it   -v $PWD/config_myConfig:/drouter/config   -v $PWD/local_mylocal:/drouter/local   -e DATAPOWER_ACCEPT_LICENSE=true   -e DATAPOWER_INTERACTIVE=true   -e DATAPOWER_WORKER_THREADS=4   -p 9090:9090   mydatapower

## Enable Web Management
configure terminal
web-mgmt
admin-state "enabled"
local-address "eth0_ipv4_1" "9090"
idle 0
exit


## Create Application Domain

## User Account

## File Management
cert - Directory to upload public certificate and private keys


## Front Side Handler



