package com.a03gmail.karumanchi.riya.mapsapp20;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Parser {

    public static String googleMapsParser( ){
        String testjson = "{\n" +
                "   \"geocoded_waypoints\" : [\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJ95zruCNGK4gR9VKp23uJCeA\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJ9bM1qttHK4gRNMeixkLcTGk\",\n" +
                "         \"types\" : [ \"establishment\", \"point_of_interest\", \"shopping_mall\" ]\n" +
                "      }\n" +
                "   ],\n" +
                "   \"routes\" : [\n" +
                "      {\n" +
                "         \"bounds\" : {\n" +
                "            \"northeast\" : {\n" +
                "               \"lat\" : 43.5939644,\n" +
                "               \"lng\" : -79.56633789999999\n" +
                "            },\n" +
                "            \"southwest\" : {\n" +
                "               \"lat\" : 43.5648771,\n" +
                "               \"lng\" : -79.5818687\n" +
                "            }\n" +
                "         },\n" +
                "         \"copyrights\" : \"Map data ©2017 Google\",\n" +
                "         \"legs\" : [\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"4.5 km\",\n" +
                "                  \"value\" : 4466\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"56 mins\",\n" +
                "                  \"value\" : 3355\n" +
                "               },\n" +
                "               \"end_address\" : \"1250 S Service Rd, Mississauga, ON L5E 1V4, Canada\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 43.59332240000001,\n" +
                "                  \"lng\" : -79.56854659999999\n" +
                "               },\n" +
                "               \"start_address\" : \"903 Beechwood Ave, Mississauga, ON L5G 4E3, Canada\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 43.5648771,\n" +
                "                  \"lng\" : -79.56766329999999\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0.2 km\",\n" +
                "                        \"value\" : 248\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"3 mins\",\n" +
                "                        \"value\" : 179\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 43.5664541,\n" +
                "                        \"lng\" : -79.5698318\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Head \\u003cb\\u003enorthwest\\u003c/b\\u003e on \\u003cb\\u003eBeechwood Ave\\u003c/b\\u003e toward \\u003cb\\u003eLakeshore Rd E\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ow{hGzpsdNsB~CeEpG\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 43.5648771,\n" +
                "                        \"lng\" : -79.56766329999999\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0.5 km\",\n" +
                "                        \"value\" : 464\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"6 mins\",\n" +
                "                        \"value\" : 347\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 43.5697668,\n" +
                "                        \"lng\" : -79.56633789999999\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eright\\u003c/b\\u003e onto \\u003cb\\u003eLakeshore Rd E\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ia|hGl~sdNq@s@a@c@SUMMUWc@e@}@aAQSWY}DiE{@}@a@c@k@m@w@u@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 43.5664541,\n" +
                "                        \"lng\" : -79.5698318\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"1.6 km\",\n" +
                "                        \"value\" : 1632\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"21 mins\",\n" +
                "                        \"value\" : 1256\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 43.5801466,\n" +
                "                        \"lng\" : -79.5806049\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eleft\\u003c/b\\u003e onto \\u003cb\\u003eCawthra Rd\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"av|hGrhsdNs@vAc@p@Y`@o@bAaA`By@pAu@nAGJaA|A}@xAwCpEg@t@{@jAwB`DyBdDoAlBOV]h@u@jAmBtCGJ]h@S\\\\}AnCiBhC{AfCKFMFyFjJ[d@SV]b@UVKJKLKJA@UPSPID\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 43.5697668,\n" +
                "                        \"lng\" : -79.56633789999999\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"82 m\",\n" +
                "                        \"value\" : 82\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 min\",\n" +
                "                        \"value\" : 67\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 43.5808103,\n" +
                "                        \"lng\" : -79.5810505\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Slight \\u003cb\\u003eright\\u003c/b\\u003e to stay on \\u003cb\\u003eCawthra Rd\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-slight-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"}v~hGvavdNWHA@iBlA\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 43.5801466,\n" +
                "                        \"lng\" : -79.5806049\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"1.8 km\",\n" +
                "                        \"value\" : 1789\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"22 mins\",\n" +
                "                        \"value\" : 1325\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 43.5939644,\n" +
                "                        \"lng\" : -79.571399\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eright\\u003c/b\\u003e onto \\u003cb\\u003eS Service Rd\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"a{~hGpdvdNUaAEIEIEGIEGACAG?I@K@GDaAh@E@iAl@iCpAeBz@MFODODQBK@K?M?MCKAGCMEOIQMo@k@mAiAe@c@oDcDiAeAEEaBiBcEqEgAkAqGmHWYEEoBsB}EsFaFoFoD{DOOuBaC\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 43.5808103,\n" +
                "                        \"lng\" : -79.5810505\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0.2 km\",\n" +
                "                        \"value\" : 241\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"3 mins\",\n" +
                "                        \"value\" : 173\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 43.593408,\n" +
                "                        \"lng\" : -79.56858310000001\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eright\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"gmaiGfhtdNJWHQFOBMFUBOFY?CNoAFe@Hi@D]?G?CLs@AWEk@?IHkA@GAG\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 43.5939644,\n" +
                "                        \"lng\" : -79.571399\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"10 m\",\n" +
                "                        \"value\" : 10\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 min\",\n" +
                "                        \"value\" : 8\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 43.59332240000001,\n" +
                "                        \"lng\" : -79.56854659999999\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Turn \\u003cb\\u003eright\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"yiaiGrvsdNPE\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 43.593408,\n" +
                "                        \"lng\" : -79.56858310000001\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            }\n" +
                "         ],\n" +
                "         \"overview_polyline\" : {\n" +
                "            \"points\" : \"ow{hGzpsdNyHpLsAwA{AaBeHyH}AaBcBcBwAhCiAdByDnG_CvD_EfGsDlFiErGqEbHwCbFiBhC{AfCYNuGpKq@z@y@|@u@j@YJiBlAUaAKSOMKCQ@SFgAj@gIbE_@J]DY?YEUIa@WsI}HoAkAeH{HwJyKmIgJqKkLeCqCTi@VcA^sCNgA?KLs@AWEu@JsAAGPE\"\n" +
                "         },\n" +
                "         \"summary\" : \"Cawthra Rd and S Service Rd\",\n" +
                "         \"warnings\" : [\n" +
                "            \"Walking directions are in beta.    Use caution – This route may be missing sidewalks or pedestrian paths.\"\n" +
                "         ],\n" +
                "         \"waypoint_order\" : []\n" +
                "      }\n" +
                "   ],\n" +
                "   \"status\" : \"OK\"\n" +
                "}";

        //now parse
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(testjson);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONObject jb = (JSONObject) obj;

        //now read
        JSONArray jsonObject1 = (JSONArray) jb.get("results");
        JSONObject jsonObject2 = (JSONObject)jsonObject1.get(0);
        JSONObject jsonObject3 = (JSONObject)jsonObject2.get("geometry");
        JSONObject location = (JSONObject) jsonObject3.get("location");

        System.out.println( "Lat = "+location.get("lat"));
        System.out.println( "Lng = "+location.get("lng"));

        return "placeholder";
    }

}
