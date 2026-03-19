package utils.module;


import org.powermock.core.classloader.annotations.PowerMockIgnore;
import play.mvc.Http;
import play.test.Helpers;

@PowerMockIgnore({"jdk.internal.reflect.*"})
public abstract class BaseRequestHandlerTest {

    private static String xAuthenticatedUserToken =
            "";
    private static String AuthenticatedFor = xAuthenticatedUserToken;

    public Http.RequestBuilder getHttpRequestBuilder() {
        Http.RequestBuilder requestBuilder =
                Helpers.fakeRequest(
                        Helpers.GET,
                        "http://localhost:9000/v1/user/read/56c2d9a3-fae9-4341-9862-4eeeead2e9a1")
                        .header("x-authenticated-user-token", xAuthenticatedUserToken)
                        .header("x-authenticated-for", AuthenticatedFor);
        return requestBuilder;
    }

    public Http.RequestBuilder getHttpRequestBuilder2() {
        Http.RequestBuilder requestBuilder =
                Helpers.fakeRequest(
                        Helpers.POST,
                        "http://localhost:9000/v1/group/membership/update")
                        .header("x-authenticated-user-token", xAuthenticatedUserToken)
                        .header("x-authenticated-for", AuthenticatedFor);
        return requestBuilder;
    }
}