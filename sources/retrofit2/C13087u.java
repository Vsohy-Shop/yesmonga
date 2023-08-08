package retrofit2;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.firebase.installations.local.C33093b;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.C12500m;
import okio.C12505n;
import org.joda.time.DateTimeFieldType;

/* renamed from: retrofit2.u */
public final class C13087u {

    /* renamed from: l */
    public static final char[] f32108l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', C15369g.f37994t, 'B', C15369g.f37986l, 'D', 'E', 'F'};

    /* renamed from: m */
    public static final String f32109m = " \"<>^`{}|\\?#";

    /* renamed from: n */
    public static final Pattern f32110n = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f32111a;

    /* renamed from: b */
    public final HttpUrl f32112b;
    @Nullable

    /* renamed from: c */
    public String f32113c;
    @Nullable

    /* renamed from: d */
    public HttpUrl.Builder f32114d;

    /* renamed from: e */
    public final Request.Builder f32115e = new Request.Builder();

    /* renamed from: f */
    public final Headers.Builder f32116f;
    @Nullable

    /* renamed from: g */
    public MediaType f32117g;

    /* renamed from: h */
    public final boolean f32118h;
    @Nullable

    /* renamed from: i */
    public MultipartBody.Builder f32119i;
    @Nullable

    /* renamed from: j */
    public FormBody.Builder f32120j;
    @Nullable

    /* renamed from: k */
    public RequestBody f32121k;

    /* renamed from: retrofit2.u$a */
    public static class C13088a extends RequestBody {

        /* renamed from: a */
        public final RequestBody f32122a;

        /* renamed from: b */
        public final MediaType f32123b;

        public C13088a(RequestBody requestBody, MediaType mediaType) {
            this.f32122a = requestBody;
            this.f32123b = mediaType;
        }

        public long contentLength() throws IOException {
            return this.f32122a.contentLength();
        }

        public MediaType contentType() {
            return this.f32123b;
        }

        public void writeTo(C12505n nVar) throws IOException {
            this.f32122a.writeTo(nVar);
        }
    }

    public C13087u(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f32111a = str;
        this.f32112b = httpUrl;
        this.f32113c = str2;
        this.f32117g = mediaType;
        this.f32118h = z;
        if (headers != null) {
            this.f32116f = headers.newBuilder();
        } else {
            this.f32116f = new Headers.Builder();
        }
        if (z2) {
            this.f32120j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f32119i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: i */
    public static String m56419i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || f32109m.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C12500m mVar = new C12500m();
                mVar.mo27242v1(str, 0, i);
                m56420j(mVar, str, i, length, z);
                return mVar.mo27268B3();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: j */
    public static void m56420j(C12500m mVar, String str, int i, int i2, boolean z) {
        C12500m mVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || f32109m.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (mVar2 == null) {
                        mVar2 = new C12500m();
                    }
                    mVar2.mo27243w0(codePointAt);
                    while (!mVar2.mo27275J2()) {
                        byte readByte = mVar2.readByte() & 255;
                        mVar.mo27225K2(37);
                        char[] cArr = f32108l;
                        mVar.mo27225K2(cArr[(readByte >> 4) & 15]);
                        mVar.mo27225K2(cArr[readByte & DateTimeFieldType.f30626Z]);
                    }
                } else {
                    mVar.mo27243w0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    public void mo30552a(String str, String str2, boolean z) {
        if (z) {
            this.f32120j.addEncoded(str, str2);
        } else {
            this.f32120j.add(str, str2);
        }
    }

    /* renamed from: b */
    public void mo30553b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f32117g = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else {
            this.f32116f.add(str, str2);
        }
    }

    /* renamed from: c */
    public void mo30554c(Headers headers) {
        this.f32116f.addAll(headers);
    }

    /* renamed from: d */
    public void mo30555d(Headers headers, RequestBody requestBody) {
        this.f32119i.addPart(headers, requestBody);
    }

    /* renamed from: e */
    public void mo30556e(MultipartBody.Part part) {
        this.f32119i.addPart(part);
    }

    /* renamed from: f */
    public void mo30557f(String str, String str2, boolean z) {
        if (this.f32113c != null) {
            String i = m56419i(str2, z);
            String str3 = this.f32113c;
            String replace = str3.replace(C33093b.f80281i + str + "}", i);
            if (!f32110n.matcher(replace).matches()) {
                this.f32113c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    public void mo30558g(String str, @Nullable String str2, boolean z) {
        String str3 = this.f32113c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f32112b.newBuilder(str3);
            this.f32114d = newBuilder;
            if (newBuilder != null) {
                this.f32113c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f32112b + ", Relative: " + this.f32113c);
            }
        }
        if (z) {
            this.f32114d.addEncodedQueryParameter(str, str2);
        } else {
            this.f32114d.addQueryParameter(str, str2);
        }
    }

    /* renamed from: h */
    public <T> void mo30559h(Class<T> cls, @Nullable T t) {
        this.f32115e.tag(cls, t);
    }

    /* renamed from: k */
    public Request.Builder mo30560k() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.f32114d;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.f32112b.resolve(this.f32113c);
            if (httpUrl == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f32112b + ", Relative: " + this.f32113c);
            }
        }
        C13088a aVar = this.f32121k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f32120j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f32119i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f32118h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f32117g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new C13088a(aVar, mediaType);
            } else {
                this.f32116f.add("Content-Type", mediaType.toString());
            }
        }
        return this.f32115e.url(httpUrl).headers(this.f32116f.build()).method(this.f32111a, aVar);
    }

    /* renamed from: l */
    public void mo30561l(RequestBody requestBody) {
        this.f32121k = requestBody;
    }

    /* renamed from: m */
    public void mo30562m(Object obj) {
        this.f32113c = obj.toString();
    }
}
