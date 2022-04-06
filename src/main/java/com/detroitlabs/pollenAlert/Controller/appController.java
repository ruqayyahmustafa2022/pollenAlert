package com.detroitlabs.pollenAlert.Controller;
import com.detroitlabs.pollenAlert.Data.Cities;
import com.detroitlabs.pollenAlert.Data.PollenData;
import com.detroitlabs.pollenAlert.Data.WeatherData;
import com.detroitlabs.pollenAlert.Service.apiAccess;
import org.apache.tomcat.jni.Poll;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class appController {
    /*
    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }//end method helloWorld

     */

    @RequestMapping("/")
    @ResponseBody
    public String getDateInfo(){
        apiAccess pollenAPI = new apiAccess(); // Step 1. get the api by creating a new api object
        PollenData test = pollenAPI.accessPollenData(); //Step 2. access the json data within that api and objects within that builds the data object
        String dateToday = test.getData().get(0).getTypes().getGrass().getIndex().getCategory();
        return "Today's Date is " + dateToday;
    }//end method helloWorld





}//end class appController
