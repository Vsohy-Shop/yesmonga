package retrofit2.converter.gson;

import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.JsonIOException;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.C13015f;

/* renamed from: retrofit2.converter.gson.c */
public final class C12993c<T> implements C13015f<ResponseBody, T> {

    /* renamed from: a */
    public final C33614e f31997a;

    /* renamed from: b */
    public final C33708s<T> f31998b;

    public C12993c(C33614e eVar, C33708s<T> sVar) {
        this.f31997a = eVar;
        this.f31998b = sVar;
    }

    /* renamed from: a */
    public T convert(ResponseBody responseBody) throws IOException {
        C33710a v = this.f31997a.mo97487v(responseBody.charStream());
        try {
            T read = this.f31998b.read(v);
            if (v.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
