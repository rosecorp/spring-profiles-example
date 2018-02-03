# spring-profiles-example

Spring profile example for spring boot

### Run app
To run an app and override `application.yml`

run jar as following: `java -jar {jar_name}.jar --spring.config.location=app.yml`
where `spring.config.location` is a location for property file


### Elastic search logs

1) docker image - https://github.com/spujadas/elk-docker

2) change `02-beats-input.conf` to input like: 
```
input {
  tcp {
    port => 5044
    codec => json_lines
  }
}
```

