package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* renamed from: com.android.volley.toolbox.l */
public class C21810l implements C21814o {

    /* renamed from: b */
    public static final String f56425b = "Content-Type";

    /* renamed from: a */
    public final HttpClient f56426a;

    /* renamed from: com.android.volley.toolbox.l$a */
    public static final class C21811a extends HttpEntityEnclosingRequestBase {

        /* renamed from: a */
        public static final String f56427a = "PATCH";

        public C21811a() {
        }

        public String getMethod() {
            return "PATCH";
        }

        public C21811a(URI uri) {
            setURI(uri);
        }

        public C21811a(String str) {
            setURI(URI.create(str));
        }
    }

    public C21810l(HttpClient httpClient) {
        this.f56426a = httpClient;
    }

    /* renamed from: b */
    public static HttpUriRequest m100205b(Request<?> request, Map<String, String> map) throws AuthFailureError {
        switch (request.mo64802i0()) {
            case -1:
                byte[] n0 = request.mo64807n0();
                if (n0 == null) {
                    return new HttpGet(request.mo64788L0());
                }
                HttpPost httpPost = new HttpPost(request.mo64788L0());
                httpPost.addHeader("Content-Type", request.mo64809o0());
                httpPost.setEntity(new ByteArrayEntity(n0));
                return httpPost;
            case 0:
                return new HttpGet(request.mo64788L0());
            case 1:
                HttpPost httpPost2 = new HttpPost(request.mo64788L0());
                httpPost2.addHeader("Content-Type", request.mo64795X());
                m100207e(httpPost2, request);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(request.mo64788L0());
                httpPut.addHeader("Content-Type", request.mo64795X());
                m100207e(httpPut, request);
                return httpPut;
            case 3:
                return new HttpDelete(request.mo64788L0());
            case 4:
                return new HttpHead(request.mo64788L0());
            case 5:
                return new HttpOptions(request.mo64788L0());
            case 6:
                return new HttpTrace(request.mo64788L0());
            case 7:
                C21811a aVar = new C21811a(request.mo64788L0());
                aVar.addHeader("Content-Type", request.mo64795X());
                m100207e(aVar, request);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: c */
    public static List<NameValuePair> m100206c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String next : map.keySet()) {
            arrayList.add(new BasicNameValuePair(next, map.get(next)));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static void m100207e(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, Request<?> request) throws AuthFailureError {
        byte[] W = request.mo20315W();
        if (W != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(W));
        }
    }

    /* renamed from: f */
    public static void m100208f(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String next : map.keySet()) {
            httpUriRequest.setHeader(next, map.get(next));
        }
    }

    /* renamed from: a */
    public HttpResponse mo64994a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        HttpUriRequest b = m100205b(request, map);
        m100208f(b, map);
        m100208f(b, request.mo20316h0());
        mo65022d(b);
        HttpParams params = b.getParams();
        int H0 = request.mo64784H0();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, H0);
        return FirebasePerfHttpClient.execute(this.f56426a, b);
    }

    /* renamed from: d */
    public void mo65022d(HttpUriRequest httpUriRequest) throws IOException {
    }
}
