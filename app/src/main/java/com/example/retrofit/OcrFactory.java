import com.example.retrofit.Semester;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface OcrFactory {
    @GET("ocr/connect") // <=요기 안에 들어가는게 서버 path
    Call<String> connect(@Query("userEmail") String email);

    @GET("ocr/connecting") // <=요기 안에 들어가는게 서버 path
    Call<Semester> connecting(@QueryMap Map<String, String> success);

    @POST("ocr/semester") // <=요기 안에 들어가는게 서버 path
    Call<Res_semester> semester(@Body Req_semester user);
}