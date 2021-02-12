mvn package
docker build -t alazarevepam/cloud-in-action:latest .
docker-compose up --force-recreate -d