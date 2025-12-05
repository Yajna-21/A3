package sqlmaven.sqlmaven;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class simple {
	

				public static void main(String[] args) throws IOException,ParseException{
					JSONParser jsonparser=new JSONParser();
					FileReader reader=new FileReader(".\\json\\simplee.JSON");
					Object obj=jsonparser.parse(reader);
					JSONObject studentobj=(JSONObject)obj;
					String fname=(String)studentobj.get("firstname");
					String Lname=(String)studentobj.get("lastname");
					System.out.println("firstname:"+fname);
					System.out.println("lastname:"+Lname);
				}

			}

