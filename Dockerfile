FROM openjdk:22-slim


RUN /bin/sh -c 'mkdir -p /app'

WORKDIR /app

COPY target/app.jar ./app.jar

EXPOSE 8080

# 定义容器启动时运行的命令
CMD ["java", "-jar", "app.jar"]



