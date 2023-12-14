FROM gcr.io/distroless/java17-debian12

COPY ./build/libs/book-shop-demo-1.0-SNAPSHOT.jar ./service.jar

EXPOSE 9090

ENTRYPOINT ["java","-jar","service.jar"]
