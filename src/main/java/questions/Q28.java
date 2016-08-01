package questions;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DAN on 01.08.2016.
 */
public class Q28 {

    String host = "http://jsonplaceholder.typicode.com/";
    Gson gson = new Gson();

    @Test
    public void GETcall() throws IOException {
        HttpResponse httpResponse = Request.Get(host+"posts").execute().returnResponse();
        HttpEntity entity = httpResponse.getEntity();
        String respJSON = EntityUtils.toString(entity);

        System.out.println(respJSON);

        List<Post> postList = gson.fromJson(respJSON, new TypeToken<ArrayList<Post>>(){}.getType());
        postList.forEach(System.out::println);
    }
}
