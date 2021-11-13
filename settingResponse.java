/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResourceAgent;

import java.io.FileWriter;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.HashMap;
import org.json.simple.JSONObject;

/**
 *
 * @author hamoo
 */
public class settingResponse {
    
    public static String TestVoltoPres ;
    public static String PrestoFil ;
    public static String PrestoStab ;
    public static String FilStabtoMeas ;
    public static String TimetoVentOffDelay ;
    public static String TimetoIsol;
    public static String TimetoAlarmLeak;
    public static String TimetoVentingTime;
    public static String TimetoOffComp;
    public static String TimetoDiffPPa;
    public static String TimetoAlaramDiffP;
    public static String TimetoLeakRate;
    public static String Endpoint;
    public static String Volume;
    public static String put2;
    public static String put1;
    private static final HashMap<String, String> storeEndpoint = new HashMap<String, String>();
    
    
    
    
    
    //setting up those settings that are not changed
    public static String Initdelay = "100";
    public static String DosingGrossLeakP ="0";
    public static String FixtureOutputStart = "0";
    public static String FixtureDelayTime = "0";
    public static String CheckInputs  = "0";
    public static String EnableCheck = "0";
    public static String FixtureOutputsEnd = "0";
    public static String NextTestonPass ="0";
    public static String NextTestonFail = "0";
    public static String InhibitResult = "0";
    public static String InterTestDelay = "0";
    public static String PressureEqualTimes = "0";
    public static String UseTestPressureforLeak = "0";
    public static String spareint10 = "0";
    public static String spareint11 = "0";
    public static String spareint12 = "0";
    public static String spareint13 = "0";
    public static String spareflag10 = "0";
    public static String spareflag11 = "0";
    public static String spareflag12 = "0";
    public static String spareflag13 = "0";
    public static String FixtureStage1Enable = "0";
    public static String FixtureStage1Time= "0";
    public static String FixtureStage1Feedback= "0";
    public static String FixtureStage2Enable= "0";
    public static String FixtureStage2Time= "0";
    public static String FixtureStage2Feedback= "0";
    public static String FixtureStage3Enable= "0";
    public static String FixtureStage3Time= "0";
    public static String FixtureStage3Feedback= "0";
    public static String PassMarkEnable= "0";
    public static String PassMarkTime= "0";
    public static String FailAcknowledgeEnable= "0";
    public static String FilltoTestPressureEnable= "0";
    public static String FilltoTestPressureTime= "0";
    public static String spareint20= "0";
    public static String spareint21= "0";
    public static String spareflag20= "0";
    public static String spareflag21= "0";
    public static String spareflag22= "0";
    public static String spareflag23= "0";
    public static String sparestring20= "0";
    public static String Remoteportforresults= "9000";
    public static String LogLevel= "1";
    public static String LogDestination= "20";
    public static String Abortdiffpressure= "7500";
    public static String Refvealarmpressure= "-200";
    public static String StartEnable= "0";
    public static String Option1 = "0";
    public static String Option2= "0";
    public static String Option3= "0";
    public static String Option4= "0";
    public static String ModuleADiffPresValueMax= "5530";
    public static String ModuleADiffPresCountMax= "40290";
    public static String ModuleADiffPresValueMIn= "0";
    public static String ModuleADiffPresCountMin = "33031";
    public static String ModuleADiffPresGradient= "1";
    public static String ModuleADiffPresOffset= "0";
    public static String ModuleBDiffPresValueMax= "30000";
    public static String ModuleBDiffPreCountMax = "14000";
    public static String ModuleBDiffPresValueMIn= "0";
    public static String ModuleBDiffPresCountMin = "6500";
    public static String ModuleBDiffPresGradient= "1";
    public static String ModuleBDiffPresOffset= "0";
    public static String ModuleATestPresValueMax= "9970";
    public static String ModuleATestPresCountMax = "17743";
    public static String ModuleATestPresValueMin= "0";
    public static String ModuleATestPresCountMin = "12677";
    public static String ModuleATestPresGradient= "1";
    public static String ModuleATestPresOffset= "0";
    public static String ModuleBTestPresValueMax= "30000";
    public static String ModuleBTestPresCountMax = "14000";
    public static String ModuleBTestPresValueMin= "0";
    public static String ModuleBTestPresCountMin = "6500";
    public static String ModuleBTestPresGradient= "1";
    public static String ModuleBTestPresOffset= "0";
    
    
    
    public static String TestVoltoPres(String Endpoint, String Volume) throws ProtocolException, IOException{
        String input = "{\"features\":["+Volume+"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
    }
    
    public static String PrestoFil(String Endpoint, String Pressure ) throws IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Pressure + ","+ Des_Result+"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
    }
    
    
     public static String PrestoStab(String Endpoint, String Pressure ) throws IOException{
        
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Pressure + ","+ Des_Result+"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
    }
     
    public static String FilStabtoMeas(String Endpoint,String Fil, String Stab) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
    
    public static String TimetoVentOfffDelay(String Endpoint,String Fil, String Stab, String Meas) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +","+ Meas +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
    
    
    public static String TimetoIsolDelay(String Endpoint,String Fil, String Stab, String Meas) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +","+ Meas +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
    
    
     public static String TimetoAlarmLeak(String Endpoint,String Fil, String Stab, String Meas) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +","+ Meas +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
    
     
     public static String TimetoVentingTime(String Endpoint,String Fil, String Stab, String Meas) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +","+ Meas +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
     
     public static String TimetoOffComp(String Endpoint,String Fil, String Stab, String Meas) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +","+ Meas +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
     
     public static String TimetoDiffPPa(String Endpoint,String Fil, String Stab, String Meas) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +","+ Meas +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
     
      public static String TimetoAlaramDiffP(String Endpoint,String Fil, String Stab, String Meas) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +","+ Meas +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
      
      public static String TimetoLeakRate(String Endpoint,String Fil, String Stab, String Meas) throws ProtocolException, IOException{
        String Des_Result = "1";
        String input = "{\"features\":["+Volume+ "," +Des_Result+ "," + Fil + "," + Stab +","+ Meas +"]}";
        System.out.println(input);
        String Ml = HTTPpost.MLResponseValue(Endpoint, input);
        System.out.println("The reponse is:" + Ml);
        return Ml;
        
    }
      
     
     public static String setVolume (String Volume){
         settingResponse.Volume = Volume;
         return Volume;
     }
     public static void setHashMap (String put1,String put2) {
		storeEndpoint.put(put1, put2);
	}
     public static String setEndpoint(String Endpoint){
         settingResponse.Endpoint = Endpoint;
         return Endpoint;
         
     }
     
     public static String setput1(String put1){
         settingResponse.put1= put1;
         return put1;
         
     }
     public static String setput2(String put2){
         settingResponse.put2= put2;
         return put2;
         
     }
    
    public static JSONObject Configuration (String Volume) throws IOException {
       
       String Set_Vol =Volume;
       
       setVolume(Set_Vol);
       String putEndpoint1= "https://us-central1-endpoints-331108.cloudfunctions.net/TestVoltoPres";
       String putEndpoint2 = "https://us-central1-endpoints-331108.cloudfunctions.net/PrestoFil";
       String putEndpoint3= "https://us-central1-endpoints-331108.cloudfunctions.net/PrestoStab";
       String putEndpoint4 = "https://us-central1-endpoints-331108.cloudfunctions.net/FilStabtoMeas";
       String putEndpoint5 = "https://us-central1-endpoints-331108.cloudfunctions.net/TimetoVentDelay";
       String putEndpoint6 = "https://us-central1-endpoints-331108.cloudfunctions.net/TimetoIsol";
       String putEndpoint7 = "https://us-central1-endpoints-331108.cloudfunctions.net/TimetoAlarmLeak";
       String putEndpoint8 = "https://us-central1-endpoints-331108.cloudfunctions.net/TimetoVenting";
       String putEndpoint9 = "https://us-central1-endpoints-331108.cloudfunctions.net/TimetoOffComp";
       String putEndpoint10= "https://us-central1-endpoints-331108.cloudfunctions.net/TimetoDiffPPa";
       String putEndpoint11 = "https://us-central1-endpoints-331108.cloudfunctions.net/TimetoAlaramDiffP";
       String putEndpoint12 = "https://us-central1-endpoints-331108.cloudfunctions.net/TimetoLeakRate";
       
       setHashMap(TestVoltoPres, putEndpoint1);
       String Pressure = TestVoltoPres(storeEndpoint.get(TestVoltoPres),Volume);
       
       setHashMap(PrestoFil, putEndpoint2);
       String Fil= PrestoFil(storeEndpoint.get(PrestoFil),Pressure);
       
       setHashMap(PrestoStab, putEndpoint3);
       String Stab =PrestoStab(storeEndpoint.get(PrestoStab),Pressure);
       
       setHashMap(FilStabtoMeas, putEndpoint4);
       String Meas = FilStabtoMeas(storeEndpoint.get(FilStabtoMeas), Fil, Stab);
       
       setHashMap(TimetoVentOffDelay, putEndpoint5);
       String VentOffDelay =TimetoVentOfffDelay(storeEndpoint.get(TimetoVentOffDelay), Fil, Stab, Meas);
       
       setHashMap(TimetoIsol, putEndpoint6);
       String IsolationDelay= TimetoIsolDelay(storeEndpoint.get(TimetoIsol), Fil, Stab, Meas);
      
       setHashMap(TimetoAlarmLeak, putEndpoint7);
       String AlarmLeakRate=TimetoAlarmLeak(storeEndpoint.get(TimetoAlarmLeak), Fil, Stab, Meas);
       
       setHashMap(TimetoVentingTime, putEndpoint8);
       String VentingTime=TimetoVentingTime(storeEndpoint.get(TimetoVentingTime), Fil, Stab, Meas);
       
       setHashMap(TimetoOffComp, putEndpoint9);
       String OffseCompensation=TimetoOffComp(storeEndpoint.get(TimetoOffComp), Fil, Stab, Meas);
     
        setHashMap(TimetoDiffPPa, putEndpoint10);
        String DiffPa= TimetoDiffPPa(storeEndpoint.get(TimetoDiffPPa), Fil, Stab, Meas);
        
        setHashMap(TimetoAlaramDiffP, putEndpoint11);
        String AlaramDiffP= TimetoAlaramDiffP(storeEndpoint.get(TimetoAlaramDiffP), Fil, Stab, Meas);
        
        setHashMap(TimetoLeakRate, putEndpoint12);
        String LeakRate = TimetoLeakRate(storeEndpoint.get(TimetoLeakRate), Fil, Stab, Meas);
        
        //print the complete configuration 
        JSONObject configuration=new JSONObject(); 
        configuration.put("Volume", Set_Vol);
        configuration.put("Pressure", Pressure);
        configuration.put("Fill", Fil);
        configuration.put("StabilisationTime", Stab);
        configuration.put("MeasureTime", Meas);
        configuration.put("VentOffDelay", VentOffDelay);
        configuration.put("IsolationDelay", IsolationDelay);
        configuration.put("AlarmLeakRate", AlarmLeakRate);
        configuration.put("VentingTime",VentingTime);
        configuration.put("OffsetCompensation",OffseCompensation);
        configuration.put("LeakRate", LeakRate);
        configuration.put("AlarmDiffPressure", AlaramDiffP);
        configuration.put("Diffferential Pressure", DiffPa);
        
        configuration.put("Initdelay", "100");
        configuration.put("DosingGrossLeakP", "0");
        configuration.put("FixtureOutputStart", "0");
        configuration.put("CheckInputs" , "0");
        configuration.put("EnableCheck" , "0");
        configuration.put("FixtureOutputsEnd"  , "0");
        configuration.put("NextTestonPass"  , "0");
        configuration.put("NextTestonFail"  , "0");
        configuration.put("InhibitResult " , "0");
        configuration.put("InterTestDelay " , "0");
        configuration.put("PressureEqualTimes " , "0");
        configuration.put("UseTestPressureforLeak"  , "0");
        configuration.put("spareint10"  , "0");
        configuration.put("spareint11"  , "0");
        configuration.put("spareint13 " , "0");
        configuration.put("spareflag10"  , "0");
        configuration.put("spareflag11"  , "0");
        configuration.put("spareflag12 " , "0");
        configuration.put("spareflag13  ", "0");
        configuration.put("FixtureStage1Enable"  , "0");
        configuration.put("FixtureStage1Time ", "0");
        configuration.put("FixtureStage1Feedback ", "0");
        configuration.put("FixtureStage2Enable" , "0");
        configuration.put("FixtureStage2Time" , "0");
        configuration.put("FixtureStage2Feedback" , "0");
        configuration.put("FixtureStage3Enable" , "0");
        configuration.put("FixtureStage3Time" , "0");
        configuration.put("FixtureStage3Feedback" , "0");
        configuration.put("PassMarkEnable", "0");
        configuration.put("PassMarkTime" , "0");
        configuration.put("FailAcknowledgeEnable" , "0");
        configuration.put("FilltoTestPressureEnable" , "0");
        configuration.put("FilltoTestPressureTime ", "0");
        configuration.put("spareint20" , "0");
        configuration.put("spareint21 ", "0");
        configuration.put("spareflag20 ", "0");
        configuration.put("spareflag21 ", "0");
        configuration.put("spareflag22 ", "0");
        configuration.put("spareflag23" , "0");
        configuration.put("sparestring20" , "0");
        configuration.put("Remoteportforresults" , "9000");
        configuration.put("LogLevel" , "1");
        configuration.put("LogDestination ", "20");
        configuration.put("Abortdiffpressure" , "7500");
        configuration.put("Refvealarmpressure" , "-200");
        configuration.put("Option1"  , "0");
        configuration.put("Option2 ", "0");
        configuration.put("Option3 ", "0");
        configuration.put("Option4 ", "0");
        configuration.put("ModuleADiffPresValueMax" , "5530");
        configuration.put("ModuleADiffPresCountMax ", "40290");
        configuration.put("ModuleADiffPresValueMIn ", "0");
        configuration.put("ModuleADiffPresCountMin " , "33031");
        configuration.put("ModuleADiffPresGradient ", "1");
        configuration.put("ModuleADiffPresOffset ", "0");
        configuration.put("ModuleBDiffPresValueMax" , "30000");
        configuration.put("ModuleBDiffPreCountMax ", "14000");
        configuration.put("ModuleBDiffPresValueMIn ", "0");
        configuration.put("ModuleBDiffPresCountMin  ", "6500");
        configuration.put("ModuleBDiffPresGradient" , "1");
        configuration.put("ModuleBDiffPresOffset" , "0");
        configuration.put("ModuleATestPresValueMax" , "9970");
        configuration.put("ModuleATestPresCountMax" , "17743");
        configuration.put("ModuleATestPresValueMin" , "0");
        configuration.put("ModuleATestPresCountMin"  , "12677");
        configuration.put("ModuleATestPresGradient" , "1");
        configuration.put("ModuleATestPresOffset" , "0");
        configuration.put("ModuleBTestPresValueMax" , "30000");
        configuration.put("ModuleBTestPresCountMax" , "14000");
        configuration.put("ModuleBTestPresValueMin ", "0");
        configuration.put("ModuleBTestPresCountMin ", "6500");
        configuration.put("ModuleBTestPresGradient ", "1");
        configuration.put("ModuleBTestPresOffset" , "0");
        
        try {
         FileWriter file = new FileWriter("output.json");
         file.write(configuration.toJSONString());
         file.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      System.out.println("JSON file created: "+configuration);
      return configuration;
        
          
                
    }
}
