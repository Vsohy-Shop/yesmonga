package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.C12451Response;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.C13054l;

/* renamed from: retrofit2.w */
public final class C13091w<T> {

    /* renamed from: a */
    public final C12451Response f32161a;
    @Nullable

    /* renamed from: b */
    public final T f32162b;
    @Nullable

    /* renamed from: c */
    public final ResponseBody f32163c;

    public C13091w(C12451Response response, @Nullable T t, @Nullable ResponseBody responseBody) {
        this.f32161a = response;
        this.f32162b = t;
        this.f32163c = responseBody;
    }

    /* renamed from: c */
    public static <T> C13091w<T> m56444c(int i, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i >= 400) {
            return m56445d(responseBody, new C12451Response.Builder().body(new C13054l.C13058c(responseBody.contentType(), responseBody.contentLength())).code(i).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    /* renamed from: d */
    public static <T> C13091w<T> m56445d(ResponseBody responseBody, C12451Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new C13091w<>(response, (Object) null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: j */
    public static <T> C13091w<T> m56446j(int i, @Nullable T t) {
        if (i >= 200 && i < 300) {
            return m56449m(t, new C12451Response.Builder().code(i).message("Response.success()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i);
    }

    /* renamed from: k */
    public static <T> C13091w<T> m56447k(@Nullable T t) {
        return m56449m(t, new C12451Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    /* renamed from: l */
    public static <T> C13091w<T> m56448l(@Nullable T t, Headers headers) {
        Objects.requireNonNull(headers, "headers == null");
        return m56449m(t, new C12451Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    /* renamed from: m */
    public static <T> C13091w<T> m56449m(@Nullable T t, C12451Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new C13091w<>(response, t, (ResponseBody) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    /* renamed from: a */
    public T mo30572a() {
        return this.f32162b;
    }

    /* renamed from: b */
    public int mo30573b() {
        return this.f32161a.code();
    }

    @Nullable
    /* renamed from: e */
    public ResponseBody mo30574e() {
        return this.f32163c;
    }

    /* renamed from: f */
    public Headers mo30575f() {
        return this.f32161a.headers();
    }

    /* renamed from: g */
    public boolean mo30576g() {
        return this.f32161a.isSuccessful();
    }

    /* renamed from: h */
    public String mo30577h() {
        return this.f32161a.message();
    }

    /* renamed from: i */
    public C12451Response mo30578i() {
        return this.f32161a;
    }

    public String toString() {
        return this.f32161a.toString();
    }
}
