package com.bahzinga.bsecure.backend.db;

public class MongoConn {

    private MongoCollection auth;
    private MongoDatabase mongoDB;
    private MongoClient client;
    private String ip;
    private int port;

    public MongoConn(){

        MongoClient mongoClient = MongoClients.create("mongodb://" + this.ip + ":" + this.port + "/?directConnection=true")

    }


    public static MongoClient getClient(){
        return client;
    }

    public static MongoCollection getCollection(){
        return auth;
    }

    public static MongoDatabase getDB(){
        return mongoDB;
    }

}
