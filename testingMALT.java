/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResourceAgent;

import java.io.IOException;
import settings.Param;

/**
 *
 * @author hamoo
 */
public class testingMALT {
    public static void main(String[] args) throws IOException {
        //1- only configuration
        String Volume = "4";
        settingResponse.Configuration(Volume);
        
        //2- implementation on MALT
        String IP = "192.168.115.205";
        Integer Port = 5000;
        selfConfiguration.connectMalt(IP, Port);
        selfConfiguration.setVolume("2");
        selfConfiguration.changeconfiguration( selfConfiguration.Volume, "0");
        selfConfiguration.runtestMalt();
        selfConfiguration.experiment(0, 2, Param.testpressure, "t*200","Pressure");//t is var to be provided as argument for expression
          //Leszek-can you help in providing whole expression in argument so that MALT can use it to drive experiments.
          
          
    }
}
