package utils;

import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import pojo.XyzDBPojo;
import pojo.XyzResponsePojo;

public class ConvertedJava {

    private Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

    public Boolean doWork() {

        String s = "      {\n" +
                "        \"data\": {\n" +
                "          \"attributes\": {\n" +
                "            \"node\": [\n" +
                "            {\n" +
                "              \"name\": \"Sanket\",\n" +
                "              \"type\": \"Group\",\n" +
                "              \"node\": [{\n" +
                "                \"name\": \"Sarode\",\n" +
                "                \"type\": \"Chain\",\n" +
                "                \"node\": [{\n" +
                "                  \"name\": \"Rahul\",\n" +
                "                  \"type\": \"Outlet\"\n" +
                "                }]\n" +
                "              }]\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket1\",\n" +
                "              \"type\": \"Group\",\n" +
                "              \"node\": [{\n" +
                "                \"name\": \"Sarode1\",\n" +
                "                \"type\": \"Chain\",\n" +
                "                \"node\": [{\n" +
                "                  \"name\": \"Rahul1\",\n" +
                "                  \"type\": \"Outlet\"\n" +
                "                }]\n" +
                "              }]\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket2\",\n" +
                "              \"type\": \"Chain\",\n" +
                "              \"node\": [{\n" +
                "                \"name\": \"Sarode2\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "              }]\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket3\",\n" +
                "              \"type\": \"Outlet\",\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket6\",\n" +
                "              \"type\": \"Group\",\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket7\",\n" +
                "              \"type\": \"Chain\",\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket8\",\n" +
                "              \"type\": \"Group\",\n" +
                "              \"node\": [{\n" +
                "                \"name\": \"Sarode8\",\n" +
                "                \"type\": \"Chain\",\n" +
                "              }]\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket9\",\n" +
                "              \"type\": \"Group\",\n" +
                "              \"node\": [{\n" +
                "                \"name\": \"Sarode9\",\n" +
                "                \"type\": \"Outlet\",\n" +
                "              }]\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket4\",\n" +
                "              \"type\": \"Group\",\n" +
                "              \"node\": [" +
                "                {\n" +
                "                   \"name\": \"Sarode4\",\n" +
                "                   \"type\": \"Chain\",\n" +
                "                   \"node\": [{\n" +
                "                       \"name\": \"Rahul4\",\n" +
                "                       \"type\": \"Outlet\"\n" +
                "                   }]\n" +
                "                }," +
                "                {\n" +
                "                   \"name\": \"Vishal4\",\n" +
                "                   \"type\": \"Chain\",\n" +
                "                   \"node\": [{\n" +
                "                       \"name\": \"Vineet4\",\n" +
                "                       \"type\": \"Outlet\"\n" +
                "                   }]\n" +
                "                }," +
                "                {\n" +
                "                   \"name\": \"Umesh4\",\n" +
                "                   \"type\": \"Chain\",\n" +
                "                   \"node\": [{\n" +
                "                       \"name\": \"Ashish4\",\n" +
                "                       \"type\": \"Outlet\"\n" +
                "                   }]\n" +
                "                }" +
                "              ]\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"Sanket5\",\n" +
                "              \"type\": \"Group\",\n" +
                "              \"node\": [{\n" +
                "                \"name\": \"Sarode5\",\n" +
                "                \"type\": \"Chain\",\n" +
                "                \"node\": [" +
                "                   {\n" +
                "                       \"name\": \"Rahul5\",\n" +
                "                       \"type\": \"Outlet\"\n" +
                "                   }," +
                "                   {\n" +
                "                       \"name\": \"Manoj5\",\n" +
                "                       \"type\": \"Outlet\"\n" +
                "                   }," +
                "                   {\n" +
                "                       \"name\": \"Seth5\",\n" +
                "                       \"type\": \"Outlet\"\n" +
                "                   }" +
                "                ]\n" +
                "              }]\n" +
                "            }\n" +
                "            ]\n" +
                "          }\n" +
                "        }\n" +
                "      }\n";

        String xyz = "[\n" +
                "            {\n" +
                "              \t\"name\": \"Sanket\",\n" +
                "              \t\"type\": \"Group\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sarode\",\n" +
                "                \"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Rahul\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sarode1\",\n" +
                "                \"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Rahul1\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sanket2\",\n" +
                "              \t\"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sarode2\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sanket1\",\n" +
                "              \t\"type\": \"Group\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sanket3\",\n" +
                "              \t\"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "              \t\"name\": \"Sanket6\",\n" +
                "              \t\"type\": \"Group\"\n" +
                "            },\n" +
                "            {\n" +
                "              \t\"name\": \"Sanket7\",\n" +
                "              \t\"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\n" +
                "              \t\"name\": \"Sanket8\",\n" +
                "              \t\"type\": \"Group\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sarode8\",\n" +
                "                \"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\n" +
                "              \t\"name\": \"Sanket9\",\n" +
                "              \t\"type\": \"Group\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sarode9\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sanket4\",\n" +
                "              \t\"type\": \"Group\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Rahul4\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Vishal4\",\n" +
                "                \"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\t\n" +
                "            \t\"name\": \"Sarode4\",\n" +
                "                \"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Vineet4\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Umesh4\",\n" +
                "                \"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Ashish4\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },  \n" +
                "            {\n" +
                "            \t\"name\": \"Sanket5\",\n" +
                "              \t\"type\": \"Group\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Sarode5\",\n" +
                "                \"type\": \"Chain\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Rahul5\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Manoj5\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            },\n" +
                "            {\n" +
                "            \t\"name\": \"Seth5\",\n" +
                "                \"type\": \"Outlet\"\n" +
                "            }\n" +
                "]";


        XyzDBPojo[] xyzDB = gson.fromJson(xyz, XyzDBPojo[].class);
        System.out.println("XYZDB length = " + xyzDB.length);
        XyzResponsePojo[] xyzResponse = new XyzResponsePojo[xyzDB.length];
        int len = 0, count = 0;

        try {
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(s);

            JSONObject data = (JSONObject) json.get("data");
            JSONObject attributes = (JSONObject) data.get("attributes");
            JSONArray node = (JSONArray) attributes.get("node");

            for (int i = 0; i < node.size(); i++) {
                JSONObject innerNode1 = (JSONObject) node.get(i);
                JSONArray n1 = (JSONArray) innerNode1.get("node");

                System.out.println("Inner Node 1 Name: " + innerNode1.get("name"));
                System.out.println("Inner Node 1 Type: " + innerNode1.get("type"));

                xyzResponse[len] = new XyzResponsePojo(innerNode1.get("name").toString(), innerNode1.get("type").toString());
                len++;

                if (innerNode1.get("type").toString().equalsIgnoreCase("group") && n1 != null)
                    for (int j = 0; j < n1.size(); j++) {
                        JSONObject innerNode2 = (JSONObject) n1.get(j);
                        JSONArray n2 = (JSONArray) innerNode2.get("node");

                        System.out.println("Inner Node 2 Name: " + innerNode2.get("name"));
                        System.out.println("Inner Node 2 Type: " + innerNode2.get("type"));

                        xyzResponse[len] = new XyzResponsePojo(innerNode2.get("name").toString(), innerNode2.get("type").toString());
                        len++;

                        if (innerNode2.get("type").toString().equalsIgnoreCase("chain") && n2 != null)
                            for (int k = 0; k < n2.size(); k++) {
                                JSONObject innerNode3 = (JSONObject) n2.get(k);

                                System.out.println("Inner Node 3 Name: " + innerNode3.get("name"));
                                System.out.println("Inner Node 3 Type: " + innerNode3.get("type"));

                                xyzResponse[len] = new XyzResponsePojo(innerNode3.get("name").toString(), innerNode3.get("type").toString());
                                len++;
                            }
                    }
                else if (innerNode1.get("type").toString().equalsIgnoreCase("chain") && n1 != null)
                    for (int l = 0; l < n1.size(); l++) {
                        JSONObject innerNode4 = (JSONObject) n1.get(l);

                        System.out.println("Inner Node 4 Name: " + innerNode4.get("name"));
                        System.out.println("Inner Node 4 Type: " + innerNode4.get("type"));

                        xyzResponse[len] = new XyzResponsePojo(innerNode4.get("name").toString(), innerNode4.get("type").toString());
                        len++;
                    }
            }

            System.out.println("Count of len: " + len);

            System.out.println("From XYZDB Class: ");
            for (XyzDBPojo d : xyzDB) {
                System.out.println("Name: " + d.getName());
                System.out.println("Type: " + d.getType());
            }

            System.out.println("From XYZResponse Class: ");
            for (XyzResponsePojo res : xyzResponse) {
                System.out.println("Name: " + res.getName());
                System.out.println("Type: " + res.getType());
            }

            System.out.println("Now you can write your validation code in here...");

            for (int x = 0; x < len; x++) {
                for (int y = 0; y < len; y++) {
                    if (xyzDB[x].getName().equalsIgnoreCase(xyzResponse[y].getName()))
                        if (xyzDB[x].getType().equalsIgnoreCase(xyzResponse[y].getType())) {
                            count++;
                            break;
                        }
                }
            }
            System.out.println("After Validation Count Value = " + count);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        if (count == len)
            return true;
        else
            return false;
    }
}