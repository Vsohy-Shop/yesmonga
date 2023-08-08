package retrofit2.converter.gson;

import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.stream.C33713c;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.C12500m;
import retrofit2.C13015f;

/* renamed from: retrofit2.converter.gson.b */
public final class C12992b<T> implements C13015f<T, RequestBody> {

    /* renamed from: c */
    public static final MediaType f31993c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f31994d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C33614e f31995a;

    /* renamed from: b */
    public final C33708s<T> f31996b;

    public C12992b(C33614e eVar, C33708s<T> sVar) {
        this.f31995a = eVar;
        this.f31996b = sVar;
    }

    /* renamed from: a */
    public RequestBody convert(T t) throws IOException {
        C12500m mVar = new C12500m();
        C33713c w = this.f31995a.mo97488w(new OutputStreamWriter(mVar.mo27228W3(), f31994d));
        this.f31996b.write(w, t);
        w.close();
        return RequestBody.create(f31993c, mVar.mo27301n3());
    }
}
