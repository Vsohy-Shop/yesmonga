package com.android.volley.toolbox;

import androidx.annotation.C0344h1;
import com.android.volley.AuthFailureError;
import com.android.volley.C21759i;
import com.android.volley.Request;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.android.volley.toolbox.p */
public class C21815p extends C21794e {

    /* renamed from: c */
    public static final int f56437c = 100;

    /* renamed from: a */
    public final C21817b f56438a;

    /* renamed from: b */
    public final SSLSocketFactory f56439b;

    /* renamed from: com.android.volley.toolbox.p$a */
    public static class C21816a extends FilterInputStream {

        /* renamed from: a */
        public final HttpURLConnection f56440a;

        public C21816a(HttpURLConnection httpURLConnection) {
            super(C21815p.m100230k(httpURLConnection));
            this.f56440a = httpURLConnection;
        }

        public void close() throws IOException {
            super.close();
            this.f56440a.disconnect();
        }
    }

    /* renamed from: com.android.volley.toolbox.p$b */
    public interface C21817b extends C21790c0 {
    }

    public C21815p() {
        this((C21817b) null);
    }

    @C0344h1
    /* renamed from: f */
    public static List<C21759i> m100228f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String iVar : (List) next.getValue()) {
                    arrayList.add(new C21759i((String) next.getKey(), iVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static boolean m100229j(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* renamed from: k */
    public static InputStream m100230k(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: b */
    public C21813n mo64980b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String L0 = request.mo64788L0();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.mo20316h0());
        C21817b bVar = this.f56438a;
        if (bVar != null) {
            String a = bVar.mo64902a(L0);
            if (a != null) {
                L0 = a;
            } else {
                throw new IOException("URL blocked by rewriter: " + L0);
            }
        }
        HttpURLConnection l = mo65034l(new URL(L0), request);
        boolean z = false;
        try {
            for (String str : hashMap.keySet()) {
                l.setRequestProperty(str, (String) hashMap.get(str));
            }
            mo65035m(l, request);
            int responseCode = l.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            } else if (!m100229j(request.mo64802i0(), responseCode)) {
                C21813n nVar = new C21813n(responseCode, m100228f(l.getHeaderFields()));
                l.disconnect();
                return nVar;
            } else {
                z = true;
                return new C21813n(responseCode, m100228f(l.getHeaderFields()), l.getContentLength(), mo65032h(request, l));
            }
        } catch (Throwable th) {
            if (!z) {
                l.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo65029d(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.mo64795X());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(mo65033i(request, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* renamed from: e */
    public final void mo65030e(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] W = request.mo20315W();
        if (W != null) {
            mo65029d(httpURLConnection, request, W);
        }
    }

    /* renamed from: g */
    public HttpURLConnection mo65031g(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* renamed from: h */
    public InputStream mo65032h(Request<?> request, HttpURLConnection httpURLConnection) {
        return new C21816a(httpURLConnection);
    }

    /* renamed from: i */
    public OutputStream mo65033i(Request<?> request, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    /* renamed from: l */
    public final HttpURLConnection mo65034l(URL url, Request<?> request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection g = mo65031g(url);
        int H0 = request.mo64784H0();
        g.setConnectTimeout(H0);
        g.setReadTimeout(H0);
        g.setUseCaches(false);
        g.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f56439b) != null) {
            ((HttpsURLConnection) g).setSSLSocketFactory(sSLSocketFactory);
        }
        return g;
    }

    /* renamed from: m */
    public void mo65035m(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        switch (request.mo64802i0()) {
            case -1:
                byte[] n0 = request.mo64807n0();
                if (n0 != null) {
                    httpURLConnection.setRequestMethod("POST");
                    mo65029d(httpURLConnection, request, n0);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                mo65030e(httpURLConnection, request);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                mo65030e(httpURLConnection, request);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                mo65030e(httpURLConnection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public C21815p(C21817b bVar) {
        this(bVar, (SSLSocketFactory) null);
    }

    public C21815p(C21817b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f56438a = bVar;
        this.f56439b = sSLSocketFactory;
    }
}
