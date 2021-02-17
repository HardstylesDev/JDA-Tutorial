package me.tom.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class ExampleBot {
    public static void main(String[] args){
        try {
            JDA jda = JDABuilder.createDefault("ODExNjU0Mjc4NTY5NjU2Mzk5.YC1V8w.me8-yTPdVMJn40S32159By9JdJ4").build();
            jda.addEventListener(new Listener());
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
