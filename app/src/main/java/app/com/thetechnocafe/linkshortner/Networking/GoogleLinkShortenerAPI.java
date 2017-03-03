package app.com.thetechnocafe.linkshortner.Networking;

import app.com.thetechnocafe.linkshortner.Models.LongLinkPOSTModel;
import app.com.thetechnocafe.linkshortner.Models.ShortenedLinkModel;
import app.com.thetechnocafe.linkshortner.Models.UrlListModels.ShortenedLinks;
import app.com.thetechnocafe.linkshortner.Utilities.Constants;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by gurleensethi on 25/02/17.
 */

public interface GoogleLinkShortenerAPI {
    @POST("url?key=AIzaSyCc1i6J2DwNqinDnJlr2AXnKlNJrLrgqkY")
    Observable<ShortenedLinkModel> getShortenedLink(@Body LongLinkPOSTModel longUrl);

    @GET("url/history")
    Observable<ShortenedLinks> getListOfShortenedLinks(@Header(Constants.AUTHORIZATION) String authKey);
}
