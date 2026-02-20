FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN javac banking.java

CMD ["java", "banking"]