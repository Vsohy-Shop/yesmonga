package com.android.volley.cronet;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.android.volley.AuthFailureError;
import com.android.volley.C21759i;
import com.android.volley.C21770o;
import com.android.volley.C21776s;
import com.android.volley.Request;
import com.android.volley.toolbox.C21786c;
import com.android.volley.toolbox.C21790c0;
import com.android.volley.toolbox.C21801h;
import com.android.volley.toolbox.C21813n;
import com.android.volley.toolbox.C21836y;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jsoup.helper.C12741a;

/* renamed from: com.android.volley.cronet.a */
public class C21739a extends C21786c {

    /* renamed from: c */
    public final CronetEngine f56220c;

    /* renamed from: d */
    public final C21801h f56221d;

    /* renamed from: e */
    public final C21790c0 f56222e;

    /* renamed from: f */
    public final C21748f f56223f;

    /* renamed from: g */
    public final boolean f56224g;

    /* renamed from: h */
    public final C21746d f56225h;

    /* renamed from: i */
    public final boolean f56226i;

    /* renamed from: com.android.volley.cronet.a$a */
    public class C21740a extends UrlRequest.Callback {

        /* renamed from: a */
        public C21836y f56227a = null;

        /* renamed from: b */
        public WritableByteChannel f56228b = null;

        /* renamed from: c */
        public final /* synthetic */ C21786c.C21788b f56229c;

        public C21740a(C21786c.C21788b bVar) {
            this.f56229c = bVar;
        }

        /* renamed from: a */
        public void mo64889a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            this.f56229c.mo64991b(cronetException);
        }

        /* renamed from: b */
        public void mo64890b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            byteBuffer.flip();
            try {
                this.f56228b.write(byteBuffer);
                byteBuffer.clear();
                urlRequest.read(byteBuffer);
            } catch (IOException e) {
                urlRequest.cancel();
                this.f56229c.mo64991b(e);
            }
        }

        /* renamed from: c */
        public void mo64891c(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            urlRequest.followRedirect();
        }

        /* renamed from: d */
        public void mo64892d(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            C21836y yVar = new C21836y(C21739a.this.f56221d, C21739a.this.mo64884u(urlResponseInfo));
            this.f56227a = yVar;
            this.f56228b = Channels.newChannel(yVar);
            urlRequest.read(ByteBuffer.allocateDirect(1024));
        }

        /* renamed from: e */
        public void mo64893e(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            this.f56229c.mo64990a(new C21813n(urlResponseInfo.getHttpStatusCode(), C21739a.m99999v(urlResponseInfo.getAllHeadersAsList()), this.f56227a.toByteArray()));
        }
    }

    /* renamed from: com.android.volley.cronet.a$b */
    public static /* synthetic */ class C21741b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56231a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.android.volley.Request$Priority[] r0 = com.android.volley.Request.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56231a = r0
                com.android.volley.Request$Priority r1 = com.android.volley.Request.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56231a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.android.volley.Request$Priority r1 = com.android.volley.Request.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56231a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.android.volley.Request$Priority r1 = com.android.volley.Request.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f56231a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.android.volley.Request$Priority r1 = com.android.volley.Request.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.volley.cronet.C21739a.C21741b.<clinit>():void");
        }
    }

    /* renamed from: com.android.volley.cronet.a$c */
    public static class C21742c {

        /* renamed from: i */
        public static final int f56232i = 4096;

        /* renamed from: a */
        public CronetEngine f56233a;

        /* renamed from: b */
        public final Context f56234b;

        /* renamed from: c */
        public C21801h f56235c;

        /* renamed from: d */
        public C21790c0 f56236d;

        /* renamed from: e */
        public C21748f f56237e;

        /* renamed from: f */
        public boolean f56238f;

        /* renamed from: g */
        public C21746d f56239g;

        /* renamed from: h */
        public boolean f56240h;

        /* renamed from: com.android.volley.cronet.a$c$a */
        public class C21743a implements C21790c0 {
            public C21743a() {
            }

            /* renamed from: a */
            public String mo64902a(String str) {
                return str;
            }
        }

        /* renamed from: com.android.volley.cronet.a$c$b */
        public class C21744b extends C21748f {
            public C21744b() {
            }
        }

        /* renamed from: com.android.volley.cronet.a$c$c */
        public class C21745c implements C21746d {
            public C21745c() {
            }

            /* renamed from: a */
            public void mo64903a(String str) {
                C21776s.m100102f(str, new Object[0]);
            }
        }

        public C21742c(Context context) {
            this.f56234b = context;
        }

        /* renamed from: a */
        public C21739a mo64894a() {
            if (this.f56233a == null) {
                this.f56233a = new CronetEngine.Builder(this.f56234b).build();
            }
            if (this.f56236d == null) {
                this.f56236d = new C21743a();
            }
            if (this.f56237e == null) {
                this.f56237e = new C21744b();
            }
            if (this.f56235c == null) {
                this.f56235c = new C21801h(4096);
            }
            if (this.f56239g == null) {
                this.f56239g = new C21745c();
            }
            return new C21739a(this.f56233a, this.f56235c, this.f56236d, this.f56237e, this.f56238f, this.f56239g, this.f56240h, (C21740a) null);
        }

        /* renamed from: b */
        public C21742c mo64895b(CronetEngine cronetEngine) {
            this.f56233a = cronetEngine;
            return this;
        }

        /* renamed from: c */
        public C21742c mo64896c(C21746d dVar) {
            this.f56239g = dVar;
            return this;
        }

        /* renamed from: d */
        public C21742c mo64897d(boolean z) {
            this.f56238f = z;
            return this;
        }

        /* renamed from: e */
        public C21742c mo64898e(boolean z) {
            this.f56240h = z;
            return this;
        }

        /* renamed from: f */
        public C21742c mo64899f(C21801h hVar) {
            this.f56235c = hVar;
            return this;
        }

        /* renamed from: g */
        public C21742c mo64900g(C21748f fVar) {
            this.f56237e = fVar;
            return this;
        }

        /* renamed from: h */
        public C21742c mo64901h(C21790c0 c0Var) {
            this.f56236d = c0Var;
            return this;
        }
    }

    /* renamed from: com.android.volley.cronet.a$d */
    public interface C21746d {
        /* renamed from: a */
        void mo64903a(String str);
    }

    /* renamed from: com.android.volley.cronet.a$f */
    public static abstract class C21748f {

        /* renamed from: a */
        public C21739a f56247a;

        /* renamed from: a */
        public Executor mo64911a() {
            return this.f56247a.mo64986d();
        }

        /* renamed from: b */
        public Executor mo64912b() {
            return this.f56247a.mo64987e();
        }

        /* renamed from: c */
        public void mo64913c(C21739a aVar) {
            this.f56247a = aVar;
        }

        /* renamed from: d */
        public void mo64914d(Request<?> request, UrlRequest.Builder builder) {
        }
    }

    /* renamed from: com.android.volley.cronet.a$g */
    public class C21749g<T> extends C21770o<T> {

        /* renamed from: b */
        public UrlRequest.Builder f56248b;

        /* renamed from: c */
        public String f56249c;

        /* renamed from: d */
        public Map<String, String> f56250d;

        /* renamed from: e */
        public C21786c.C21788b f56251e;

        /* renamed from: f */
        public Request<T> f56252f;

        public C21749g(Request<T> request, String str, UrlRequest.Builder builder, Map<String, String> map, C21786c.C21788b bVar) {
            super(request);
            this.f56249c = str;
            this.f56248b = builder;
            this.f56250d = map;
            this.f56251e = bVar;
            this.f56252f = request;
        }

        public void run() {
            try {
                C21739a.this.f56223f.mo64914d(this.f56252f, this.f56248b);
                C21747e eVar = new C21747e((C21740a) null);
                C21739a.this.mo64887y(eVar, this.f56252f);
                C21739a.this.mo64888z(eVar, this.f56252f, this.f56250d);
                eVar.mo64904a(this.f56248b, C21739a.this.mo64987e());
                UrlRequest build = this.f56248b.build();
                if (C21739a.this.f56224g) {
                    C21739a.this.f56225h.mo64903a(C21739a.this.mo64883t(this.f56249c, eVar));
                }
                build.start();
            } catch (AuthFailureError e) {
                this.f56251e.mo64992c(e);
            }
        }
    }

    public /* synthetic */ C21739a(CronetEngine cronetEngine, C21801h hVar, C21790c0 c0Var, C21748f fVar, boolean z, C21746d dVar, boolean z2, C21740a aVar) {
        this(cronetEngine, hVar, c0Var, fVar, z, dVar, z2);
    }

    @C0344h1
    /* renamed from: v */
    public static List<C21759i> m99999v(List<Map.Entry<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : list) {
            arrayList.add(new C21759i((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo64881c(Request<?> request, Map<String, String> map, C21786c.C21788b bVar) {
        if (mo64986d() == null || mo64987e() == null) {
            throw new IllegalStateException("Must set blocking and non-blocking executors");
        }
        C21740a aVar = new C21740a(bVar);
        String L0 = request.mo64788L0();
        String a = this.f56222e.mo64902a(L0);
        if (a == null) {
            bVar.mo64991b(new IOException("URL blocked by rewriter: " + L0));
            return;
        }
        mo64986d().execute(new C21749g(request, a, this.f56220c.newUrlRequestBuilder(a, aVar, mo64987e()).allowDirectExecutor().disableCache().setPriority(mo64885w(request)), map, bVar));
    }

    /* renamed from: s */
    public final void mo64882s(C21747e eVar, String str, @C0363p0 byte[] bArr) {
        eVar.mo64909f(str, bArr);
    }

    /* renamed from: t */
    public final String mo64883t(String str, C21747e eVar) {
        StringBuilder sb = new StringBuilder("curl ");
        sb.append("-X ");
        sb.append(eVar.mo64907d());
        sb.append(" ");
        for (Map.Entry next : eVar.mo64906c().entrySet()) {
            sb.append("--header \"");
            sb.append((String) next.getKey());
            sb.append(": ");
            if (this.f56226i || (!C28534f.f69113B.equals(next.getKey()) && !C12741a.f31458c.equals(next.getKey()))) {
                sb.append((String) next.getValue());
            } else {
                sb.append("[REDACTED]");
            }
            sb.append("\" ");
        }
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        if (eVar.mo64905b() != null) {
            if (eVar.mo64905b().length >= 1024) {
                sb.append(" [REQUEST BODY TOO LARGE TO INCLUDE]");
            } else if (mo64886x(eVar)) {
                String encodeToString = Base64.encodeToString(eVar.mo64905b(), 2);
                sb.insert(0, "echo '" + encodeToString + "' | base64 -d > /tmp/$$.bin; ").append(" --data-binary @/tmp/$$.bin");
            } else {
                try {
                    sb.append(" --data-ascii \"");
                    sb.append(new String(eVar.mo64905b(), "UTF-8"));
                    sb.append("\"");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Could not encode to UTF-8", e);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final int mo64884u(UrlResponseInfo urlResponseInfo) {
        List list = (List) urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null) {
            return 1024;
        }
        return Integer.parseInt((String) list.get(0));
    }

    /* renamed from: w */
    public final int mo64885w(Request<?> request) {
        int i = C21741b.f56231a[request.mo64816u0().ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 4 : 3;
        }
        return 2;
    }

    /* renamed from: x */
    public final boolean mo64886x(C21747e eVar) {
        String str = eVar.mo64906c().get("Content-Encoding");
        if (str != null) {
            for (String trim : TextUtils.split(str, ",")) {
                if ("gzip".equals(trim.trim())) {
                    return true;
                }
            }
        }
        String str2 = eVar.mo64906c().get("Content-Type");
        if (str2 == null) {
            return true;
        }
        if (str2.startsWith("text/") || str2.startsWith("application/xml") || str2.startsWith("application/json")) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final void mo64887y(C21747e eVar, Request<?> request) throws AuthFailureError {
        switch (request.mo64802i0()) {
            case -1:
                byte[] n0 = request.mo64807n0();
                if (n0 != null) {
                    eVar.mo64910g("POST");
                    mo64882s(eVar, request.mo64809o0(), n0);
                    return;
                }
                eVar.mo64910g("GET");
                return;
            case 0:
                eVar.mo64910g("GET");
                return;
            case 1:
                eVar.mo64910g("POST");
                mo64882s(eVar, request.mo64795X(), request.mo20315W());
                return;
            case 2:
                eVar.mo64910g("PUT");
                mo64882s(eVar, request.mo64795X(), request.mo20315W());
                return;
            case 3:
                eVar.mo64910g("DELETE");
                return;
            case 4:
                eVar.mo64910g("HEAD");
                return;
            case 5:
                eVar.mo64910g("OPTIONS");
                return;
            case 6:
                eVar.mo64910g("TRACE");
                return;
            case 7:
                eVar.mo64910g("PATCH");
                mo64882s(eVar, request.mo64795X(), request.mo20315W());
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: z */
    public final void mo64888z(C21747e eVar, Request<?> request, Map<String, String> map) throws AuthFailureError {
        eVar.mo64908e(map);
        eVar.mo64908e(request.mo20316h0());
    }

    /* renamed from: com.android.volley.cronet.a$e */
    public static class C21747e {

        /* renamed from: a */
        public final TreeMap<String, String> f56244a;

        /* renamed from: b */
        public String f56245b;
        @C0363p0

        /* renamed from: c */
        public byte[] f56246c;

        public C21747e() {
            this.f56244a = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        }

        /* renamed from: a */
        public void mo64904a(UrlRequest.Builder builder, ExecutorService executorService) {
            for (Map.Entry next : this.f56244a.entrySet()) {
                builder.addHeader((String) next.getKey(), (String) next.getValue());
            }
            builder.setHttpMethod(this.f56245b);
            byte[] bArr = this.f56246c;
            if (bArr != null) {
                builder.setUploadDataProvider(UploadDataProviders.create(bArr), executorService);
            }
        }

        @C0363p0
        /* renamed from: b */
        public byte[] mo64905b() {
            return this.f56246c;
        }

        /* renamed from: c */
        public TreeMap<String, String> mo64906c() {
            return this.f56244a;
        }

        /* renamed from: d */
        public String mo64907d() {
            return this.f56245b;
        }

        /* renamed from: e */
        public void mo64908e(Map<String, String> map) {
            this.f56244a.putAll(map);
        }

        /* renamed from: f */
        public void mo64909f(String str, @C0363p0 byte[] bArr) {
            this.f56246c = bArr;
            if (bArr != null && !this.f56244a.containsKey("Content-Type")) {
                this.f56244a.put("Content-Type", str);
            }
        }

        /* renamed from: g */
        public void mo64910g(String str) {
            this.f56245b = str;
        }

        public /* synthetic */ C21747e(C21740a aVar) {
            this();
        }
    }

    public C21739a(CronetEngine cronetEngine, C21801h hVar, C21790c0 c0Var, C21748f fVar, boolean z, C21746d dVar, boolean z2) {
        this.f56220c = cronetEngine;
        this.f56221d = hVar;
        this.f56222e = c0Var;
        this.f56223f = fVar;
        this.f56224g = z;
        this.f56225h = dVar;
        this.f56226i = z2;
        fVar.mo64913c(this);
    }
}
