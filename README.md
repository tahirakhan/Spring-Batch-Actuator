# Spring-Batch-Actuator

http://www.javabeat.net/spring-boot-actuator/

https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-monitoring.html#production-ready-health-access-restrictions


-Spring Boot Actuator is a sub-project / feature that is part of the spring boot framework. It is not a separate framework to be added to your applications.

-Main purpose of this feature is to provide various useful metrics about the applications. It is very helpful in the production environment to check the various metrics like health of your application, configurations, error page, version details, etc.

-Actuator is supported out of the box within spring boot applications. You just have to add the dependency to enable the actuator. The default configurations are enabled if you are not providing any application specific configurations.

-Actuator makes the metrics are accessed through different endpoints like /error, /metrics, /beans, /info, etc. End points are HTTP URLs that can be accessed through your browser.
