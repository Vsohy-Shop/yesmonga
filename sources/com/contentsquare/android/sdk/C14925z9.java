package com.contentsquare.android.sdk;

import android.net.Uri;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.z9 */
public class C14925z9 {

    /* renamed from: a */
    public final C14453jf f36999a = new C14453jf("HttpConnection");

    /* renamed from: com.contentsquare.android.sdk.z9$a */
    public static class C14926a {

        /* renamed from: a */
        public int f37000a = -1;

        /* renamed from: b */
        public String f37001b = null;

        /* renamed from: c */
        public Throwable f37002c = null;

        /* renamed from: d */
        public long f37003d = 0;

        /* renamed from: e */
        public long f37004e = 0;

        /* renamed from: a */
        public long mo36962a() {
            return this.f37004e;
        }

        /* renamed from: b */
        public void mo36963b(int i) {
            this.f37004e = (long) i;
        }

        /* renamed from: c */
        public void mo36964c(long j) {
            this.f37003d = j;
        }

        /* renamed from: d */
        public void mo36965d(String str) {
            this.f37001b = str;
        }

        /* renamed from: e */
        public void mo36966e(Throwable th) {
            this.f37002c = th;
        }

        /* renamed from: f */
        public Throwable mo36967f() {
            return this.f37002c;
        }

        /* renamed from: g */
        public void mo36968g(int i) {
            this.f37000a = i;
        }

        /* renamed from: h */
        public int mo36969h() {
            return this.f37000a;
        }

        /* renamed from: i */
        public String mo36970i() {
            return this.f37001b;
        }

        /* renamed from: j */
        public long mo36971j() {
            return this.f37003d;
        }

        /* renamed from: k */
        public boolean mo36972k() {
            return mo36969h() == 200 || mo36969h() == 201;
        }
    }

    /* renamed from: a */
    public final C14926a mo36950a(Exception exc) {
        C14926a aVar = new C14926a();
        aVar.mo36968g(500);
        aVar.mo36966e(exc);
        return aVar;
    }

    /* renamed from: b */
    public C14926a mo36951b(String str, JSONArray jSONArray) {
        this.f36999a.mo35674c("Performing post on %s with %s ", str, jSONArray);
        String jSONArray2 = jSONArray.toString();
        return mo36954e(str, jSONArray2 == null ? null : jSONArray2.trim().getBytes(Charset.forName("UTF-8")));
    }

    /* renamed from: c */
    public C14926a mo36952c(String str, JSONObject jSONObject) {
        return mo36953d(str, jSONObject, Collections.emptyMap());
    }

    /* renamed from: d */
    public C14926a mo36953d(String str, JSONObject jSONObject, Map<String, String> map) {
        this.f36999a.mo35674c("Performing post on %s with %s and %s", str, jSONObject, map);
        String jSONObject2 = jSONObject.toString();
        return mo36955f(str, jSONObject2 == null ? null : jSONObject2.trim().getBytes(Charset.forName("UTF-8")), map);
    }

    /* renamed from: e */
    public C14926a mo36954e(String str, byte[] bArr) {
        return mo36955f(str, bArr, Collections.emptyMap());
    }

    /* renamed from: f */
    public C14926a mo36955f(String str, byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            return mo36950a(new NullPointerException("[toString] : return null"));
        }
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection j = mo36959j("POST", str);
            if (!map.isEmpty()) {
                for (String next : map.keySet()) {
                    j.setRequestProperty(next, map.get(next));
                }
            }
            C14926a g = mo36956g(j, str, bArr);
            if (j != null) {
                j.disconnect();
            }
            return g;
        } catch (IOException | NullPointerException e) {
            this.f36999a.mo35678g(e, "Exception while processing HttpPOST Request on %s \n  for json: %s", str, bArr);
            mo36960k(str, e);
            C14926a a = mo36950a(e);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return a;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: g */
    public C14926a mo36956g(HttpURLConnection httpURLConnection, String str, byte[] bArr) {
        C14926a aVar = new C14926a();
        long currentTimeMillis = System.currentTimeMillis();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.flush();
        outputStream.close();
        long currentTimeMillis2 = System.currentTimeMillis();
        aVar.mo36968g(httpURLConnection.getResponseCode());
        aVar.mo36963b(bArr.length);
        aVar.mo36964c(currentTimeMillis2 - currentTimeMillis);
        this.f36999a.mo35674c("POST: Connection open, status %s, url : %s", String.valueOf(aVar.mo36969h()), str);
        if (aVar.mo36969h() == 200 || aVar.mo36969h() == 201) {
            aVar.mo36965d(mo36957h(httpURLConnection.getInputStream()));
        } else {
            aVar.mo36966e(new UnsupportedOperationException("Server error status : " + aVar.mo36969h()));
        }
        this.f36999a.mo35674c("Received response : %s", aVar.mo36970i());
        return aVar;
    }

    /* renamed from: h */
    public String mo36957h(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append(10);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    /* renamed from: i */
    public String mo36958i(String str, List<Pair> list) {
        if (list == null) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Pair next : list) {
            buildUpon.appendQueryParameter(next.first.toString(), next.second.toString());
        }
        String uri = buildUpon.build().toString();
        this.f36999a.mo35674c("Get URL transformed to %s", str, "");
        return uri;
    }

    /* renamed from: j */
    public HttpURLConnection mo36959j(String str, String str2) {
        String str3;
        String str4;
        this.f36999a.mo35674c("opening a %s connection to %s", str, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str2).openConnection()));
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setRequestProperty("Charset", "UTF-8");
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setReadTimeout(10000);
        str.hashCode();
        if (str.equals("GET")) {
            str3 = "Content-length";
            str4 = "0";
        } else if (str.equals("POST")) {
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            str3 = "Content-Type";
            str4 = "application/json; charset=UTF-8";
        } else {
            throw new RuntimeException("HTTP Methods other than POST and GET are not implemented.");
        }
        httpURLConnection.setRequestProperty(str3, str4);
        return httpURLConnection;
    }

    /* renamed from: k */
    public final void mo36960k(String str, Exception exc) {
        try {
            URI uri = new URI(str);
            if (C14520m5.m62604b(uri)) {
                C14453jf.m62246k("Could not dispatch events: [FAILED TO REQUEST: %s://%s | DESCRIPTION: %s]", uri.getScheme(), uri.getHost(), exc.getLocalizedMessage());
            }
        } catch (URISyntaxException e) {
            this.f36999a.mo35675d(e, "Cannot parse url: %s", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if (r3 == null) goto L_0x0066;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.contentsquare.android.sdk.C14925z9.C14926a mo36961l(java.lang.String r9, java.util.List<android.util.Pair> r10) {
        /*
            r8 = this;
            com.contentsquare.android.sdk.z9$a r0 = new com.contentsquare.android.sdk.z9$a
            r0.<init>()
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r10 = r8.mo36958i(r9, r10)     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            java.lang.String r4 = "GET"
            java.net.HttpURLConnection r3 = r8.mo36959j(r4, r10)     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            r3.connect()     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            int r4 = r3.getResponseCode()     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            r0.mo36968g(r4)     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            com.contentsquare.android.sdk.jf r4 = r8.f36999a     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            java.lang.String r5 = "GET: Connection open, status %d, url : %s "
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            int r7 = r0.mo36969h()     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            r6[r1] = r7     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            r6[r2] = r10     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            r4.mo35674c(r5, r6)     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            int r10 = r0.mo36969h()     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r10 != r4) goto L_0x0063
            java.io.InputStream r10 = r3.getInputStream()     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            java.lang.String r10 = r8.mo36957h(r10)     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            r0.mo36965d(r10)     // Catch:{ IOException -> 0x004a, NullPointerException -> 0x0048 }
            goto L_0x0063
        L_0x0046:
            r9 = move-exception
            goto L_0x0067
        L_0x0048:
            r10 = move-exception
            goto L_0x004b
        L_0x004a:
            r10 = move-exception
        L_0x004b:
            com.contentsquare.android.sdk.jf r4 = r8.f36999a     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "Exception while processing HttpGet Request on %s "
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0046 }
            r2[r1] = r9     // Catch:{ all -> 0x0046 }
            r4.mo35678g(r10, r5, r2)     // Catch:{ all -> 0x0046 }
            r8.mo36960k(r9, r10)     // Catch:{ all -> 0x0046 }
            r9 = 500(0x1f4, float:7.0E-43)
            r0.mo36968g(r9)     // Catch:{ all -> 0x0046 }
            r0.mo36966e(r10)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0066
        L_0x0063:
            r3.disconnect()
        L_0x0066:
            return r0
        L_0x0067:
            if (r3 == 0) goto L_0x006c
            r3.disconnect()
        L_0x006c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14925z9.mo36961l(java.lang.String, java.util.List):com.contentsquare.android.sdk.z9$a");
    }
}
