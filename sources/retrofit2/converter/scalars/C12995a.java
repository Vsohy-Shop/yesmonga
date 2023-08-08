package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.C13015f;

/* renamed from: retrofit2.converter.scalars.a */
public final class C12995a<T> implements C13015f<T, RequestBody> {

    /* renamed from: a */
    public static final C12995a<Object> f31999a = new C12995a<>();

    /* renamed from: b */
    public static final MediaType f32000b = MediaType.get("text/plain; charset=UTF-8");

    /* renamed from: a */
    public RequestBody convert(T t) throws IOException {
        return RequestBody.create(f32000b, String.valueOf(t));
    }
}
