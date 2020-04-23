# Docker App

## Docker App
docker run -it   -v $PWD/config_myConfig:/drouter/config   -v $PWD/local_mylocal:/drouter/local   -e DATAPOWER_ACCEPT_LICENSE=true   -e DATAPOWER_INTERACTIVE=true   -e DATAPOWER_WORKER_THREADS=4   -p 9090:9090   mydatapower
