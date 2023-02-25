package com.bahzinga.bsecure.backend.auth;

import org.bukkit.entity.Player;

public class BSecure {

    private String password;
    private String email;
    private String ipAddress;
    private String prevIpAddress;


    public BSecure(Player player){

        this.password = "";
        this.email = "";
        this.ipAddress = player.getAddress().getHostName();
        this.prevIpAddress = "";

    }


}
