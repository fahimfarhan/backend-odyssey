/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package redis.cluster.java;

import redis.cluster.java.jedisforces.B918;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        new B918();
    }
}

// redis-cli --cluster create 127.0.0.1:8000 127.0.0.1:8001 \
//        127.0.0.1:8002 127.0.0.1:8003 127.0.0.1:8004 127.0.0.1:8005 \
//        --cluster-replicas 1