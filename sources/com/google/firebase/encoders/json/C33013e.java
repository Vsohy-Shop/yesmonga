package com.google.firebase.encoders.json;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C32994a;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.encoders.C33007f;
import com.google.firebase.encoders.C33008g;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.config.C33003a;
import com.google.firebase.encoders.config.C33004b;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.google.firebase.encoders.json.e */
public final class C33013e implements C33004b<C33013e> {

    /* renamed from: e */
    public static final C33005d<Object> f80095e = new C33010b();

    /* renamed from: f */
    public static final C33007f<String> f80096f = new C33011c();

    /* renamed from: g */
    public static final C33007f<Boolean> f80097g = new C33012d();

    /* renamed from: h */
    public static final C33015b f80098h = new C33015b((C33014a) null);

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f80099a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f80100b = new HashMap();

    /* renamed from: c */
    public C33005d<Object> f80101c = f80095e;

    /* renamed from: d */
    public boolean f80102d = false;

    /* renamed from: com.google.firebase.encoders.json.e$a */
    public class C33014a implements C32994a {
        public C33014a() {
        }

        /* renamed from: a */
        public void mo95626a(@C0359n0 Object obj, @C0359n0 Writer writer) throws IOException {
            C33016f fVar = new C33016f(writer, C33013e.this.f80099a, C33013e.this.f80100b, C33013e.this.f80101c, C33013e.this.f80102d);
            fVar.mo95657t(obj, false);
            fVar.mo95648D();
        }

        /* renamed from: b */
        public String mo95627b(@C0359n0 Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo95626a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: com.google.firebase.encoders.json.e$b */
    public static final class C33015b implements C33007f<Date> {

        /* renamed from: a */
        public static final DateFormat f80104a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConfigFetchHttpClient.f81531o, Locale.US);
            f80104a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public C33015b() {
        }

        /* renamed from: b */
        public void mo85035a(@C0359n0 Date date, @C0359n0 C33008g gVar) throws IOException {
            gVar.mo85252O(f80104a.format(date));
        }

        public /* synthetic */ C33015b(C33014a aVar) {
            this();
        }
    }

    public C33013e() {
        mo85212a(String.class, f80096f);
        mo85212a(Boolean.class, f80097g);
        mo85212a(Date.class, f80098h);
    }

    /* renamed from: m */
    public static /* synthetic */ void m133199m(Object obj, C33006e eVar) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @C0359n0
    /* renamed from: j */
    public C32994a mo95638j() {
        return new C33014a();
    }

    @C0359n0
    /* renamed from: k */
    public C33013e mo95639k(@C0359n0 C33003a aVar) {
        aVar.mo85045a(this);
        return this;
    }

    @C0359n0
    /* renamed from: l */
    public C33013e mo95640l(boolean z) {
        this.f80102d = z;
        return this;
    }

    @C0359n0
    /* renamed from: p */
    public <T> C33013e mo85213b(@C0359n0 Class<T> cls, @C0359n0 C33005d<? super T> dVar) {
        this.f80099a.put(cls, dVar);
        this.f80100b.remove(cls);
        return this;
    }

    @C0359n0
    /* renamed from: q */
    public <T> C33013e mo85212a(@C0359n0 Class<T> cls, @C0359n0 C33007f<? super T> fVar) {
        this.f80100b.put(cls, fVar);
        this.f80099a.remove(cls);
        return this;
    }

    @C0359n0
    /* renamed from: r */
    public C33013e mo95643r(@C0359n0 C33005d<Object> dVar) {
        this.f80101c = dVar;
        return this;
    }
}
