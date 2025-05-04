FROM payara/server-full:latest
COPY target/jakartaee_docker_tp-1.0-SNAPSHOT.war /opt/payara/deployments
