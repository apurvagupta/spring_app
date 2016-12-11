package com;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {

    public static final String INDEX = "index.html";

    @RequestMapping(path = "/hellos/{id}", method = RequestMethod.GET)
    public ResponseEntity hello() {

        URL url;
        InputStream is = null;
        DataInputStream dis;
        String line;
        Map map = new HashMap();


        try {
            url = new URL("http://stackoverflow.com/");
            is = url.openStream();  // throws an IOException
            dis = new DataInputStream(new BufferedInputStream(is));


            int i=0;
            while ((line = dis.readLine()) != null) {
                map.put("key"+i,line);
                i++;
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException ioe) {
                // nothing to see here
            }
        }
        map.put("id", 1);
        JSONObject jsonObject = new JSONObject(map);
        return new ResponseEntity(jsonObject.toString(), HttpStatus.OK);
    }

//
//    @RequestMapping(value = "/first", method = RequestMethod.GET)
//    public String emberRoute1() {
//        return INDEX;
//    }

//    @RequestMapping(value = "/ember-route-2", method = RequestMethod.GET)
//    public String emberRoute2() {
//        return INDEX;
//    }
}
