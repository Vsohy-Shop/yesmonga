package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40963a;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40988n;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.heartbeatinfo.C33050j;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.remoteconfig.C33585u;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.remote.c */
public class C33122c {

    /* renamed from: A */
    public static final String f80315A = "x-goog-api-key";

    /* renamed from: B */
    public static final int f80316B = 10000;

    /* renamed from: C */
    public static final Pattern f80317C = Pattern.compile("[0-9]+s");

    /* renamed from: D */
    public static final int f80318D = 1;

    /* renamed from: E */
    public static final Charset f80319E = Charset.forName("UTF-8");

    /* renamed from: F */
    public static final String f80320F = "a:";

    /* renamed from: G */
    public static final String f80321G = "Firebase-Installations";
    @C40974d0

    /* renamed from: H */
    public static final String f80322H = "Invalid Expiration Timestamp.";

    /* renamed from: e */
    public static final int f80323e = 32768;

    /* renamed from: f */
    public static final int f80324f = 32769;

    /* renamed from: g */
    public static final int f80325g = 32770;

    /* renamed from: h */
    public static final int f80326h = 32771;

    /* renamed from: i */
    public static final String f80327i = "firebaseinstallations.googleapis.com";

    /* renamed from: j */
    public static final String f80328j = "projects/%s/installations";

    /* renamed from: k */
    public static final String f80329k = "projects/%s/installations/%s/authTokens:generate";

    /* renamed from: l */
    public static final String f80330l = "projects/%s/installations/%s";

    /* renamed from: m */
    public static final String f80331m = "v1";

    /* renamed from: n */
    public static final String f80332n = "FIS_v2";

    /* renamed from: o */
    public static final String f80333o = "Content-Type";

    /* renamed from: p */
    public static final String f80334p = "Accept";

    /* renamed from: q */
    public static final String f80335q = "application/json";

    /* renamed from: r */
    public static final String f80336r = "Content-Encoding";

    /* renamed from: s */
    public static final String f80337s = "gzip";

    /* renamed from: t */
    public static final String f80338t = "Cache-Control";

    /* renamed from: u */
    public static final String f80339u = "no-cache";

    /* renamed from: v */
    public static final String f80340v = "fire-installations-id";

    /* renamed from: w */
    public static final String f80341w = "x-firebase-client";

    /* renamed from: x */
    public static final String f80342x = "X-Android-Package";

    /* renamed from: y */
    public static final String f80343y = "X-Android-Cert";

    /* renamed from: z */
    public static final String f80344z = "x-goog-fis-android-iid-migration-auth";

    /* renamed from: a */
    public boolean f80345a;

    /* renamed from: b */
    public final Context f80346b;

    /* renamed from: c */
    public final C33058b<C33050j> f80347c;

    /* renamed from: d */
    public final C33123d f80348d = new C33123d();

    public C33122c(@C0359n0 Context context, @C0359n0 C33058b<C33050j> bVar) {
        this.f80346b = context;
        this.f80347c = bVar;
    }

    /* renamed from: a */
    public static String m133591a(@C0363p0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    public static JSONObject m133592b(@C0363p0 String str, @C0359n0 String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", f80332n);
            jSONObject.put(C33585u.C33587b.f81741w3, "a:17.1.3");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static JSONObject m133593c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C33585u.C33587b.f81741w3, "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    public static byte[] m133594i(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: j */
    public static boolean m133595j(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: k */
    public static void m133596k() {
    }

    /* renamed from: l */
    public static void m133597l(HttpURLConnection httpURLConnection, @C0363p0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        if (!TextUtils.isEmpty(m133599p(httpURLConnection))) {
            m133591a(str, str2, str3);
        }
    }

    @C40974d0
    /* renamed from: n */
    public static long m133598n(String str) {
        C40843u.m166192b(f80317C.matcher(str).matches(), f80322H);
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    @androidx.annotation.C0363p0
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m133599p(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f80319E
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            int r5 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r6 = 0
            r4[r6] = r5     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.C33122c.m133599p(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: t */
    public static void m133600t(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    @C0359n0
    /* renamed from: d */
    public InstallationResponse mo95894d(@C0359n0 String str, @C0363p0 String str2, @C0359n0 String str3, @C0359n0 String str4, @C0363p0 String str5) throws FirebaseInstallationsException {
        InstallationResponse o;
        if (this.f80348d.mo95905b()) {
            int i = 0;
            URL h = mo95898h(String.format(f80328j, new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(f80324f);
                HttpURLConnection m = mo95899m(h, str);
                try {
                    m.setRequestMethod("POST");
                    m.setDoOutput(true);
                    if (str5 != null) {
                        m.addRequestProperty(f80344z, str5);
                    }
                    mo95902r(m, str2, str4);
                    int responseCode = m.getResponseCode();
                    this.f80348d.mo95907f(responseCode);
                    if (m133595j(responseCode)) {
                        o = mo95900o(m);
                    } else {
                        m133597l(m, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m133596k();
                            o = InstallationResponse.m133549a().mo95878e(InstallationResponse.ResponseCode.BAD_CONFIG).mo95874a();
                        } else {
                            m.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return o;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @C0359n0
    /* renamed from: e */
    public void mo95895e(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 String str4) throws FirebaseInstallationsException {
        int i = 0;
        URL h = mo95898h(String.format(f80330l, new Object[]{str3, str2}));
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(f80325g);
            HttpURLConnection m = mo95899m(h, str);
            try {
                m.setRequestMethod("DELETE");
                m.addRequestProperty(C28534f.f69113B, "FIS_v2 " + str4);
                int responseCode = m.getResponseCode();
                if (!(responseCode == 200 || responseCode == 401)) {
                    if (responseCode != 404) {
                        m133597l(m, (String) null, str, str3);
                        if (responseCode == 429) {
                            continue;
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m133596k();
                            throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                        }
                        i++;
                        m.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                m.disconnect();
                TrafficStats.clearThreadStatsTag();
                return;
            } catch (IOException unused) {
            } catch (Throwable th) {
                m.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @C0359n0
    /* renamed from: f */
    public TokenResult mo95896f(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 String str4) throws FirebaseInstallationsException {
        TokenResult q;
        if (this.f80348d.mo95905b()) {
            int i = 0;
            URL h = mo95898h(String.format(f80329k, new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(f80326h);
                HttpURLConnection m = mo95899m(h, str);
                try {
                    m.setRequestMethod("POST");
                    m.addRequestProperty(C28534f.f69113B, "FIS_v2 " + str4);
                    m.setDoOutput(true);
                    mo95903s(m);
                    int responseCode = m.getResponseCode();
                    this.f80348d.mo95907f(responseCode);
                    if (m133595j(responseCode)) {
                        q = mo95901q(m);
                    } else {
                        m133597l(m, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    m133596k();
                                    q = TokenResult.m133562a().mo95885b(TokenResult.ResponseCode.BAD_CONFIG).mo95884a();
                                } else {
                                    m.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        q = TokenResult.m133562a().mo95885b(TokenResult.ResponseCode.AUTH_ERROR).mo95884a();
                    }
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return q;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    /* renamed from: g */
    public final String mo95897g() {
        try {
            Context context = this.f80346b;
            byte[] a = C40963a.m166572a(context, context.getPackageName());
            if (a != null) {
                return C40988n.m166658c(a, false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get fingerprint hash for package: ");
            sb.append(this.f80346b.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.f80346b.getPackageName());
            return null;
        }
    }

    /* renamed from: h */
    public final URL mo95898h(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{f80327i, f80331m, str}));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    public final HttpURLConnection mo95899m(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty(f80338t, f80339u);
            httpURLConnection.addRequestProperty("X-Android-Package", this.f80346b.getPackageName());
            C33050j jVar = this.f80347c.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty(f80341w, (String) C31053n.m124519a(jVar.mo95747a()));
                } catch (ExecutionException unused) {
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", mo95897g());
            httpURLConnection.addRequestProperty(f80315A, str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: o */
    public final InstallationResponse mo95900o(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f80319E));
        TokenResult.C33115a a = TokenResult.m133562a();
        InstallationResponse.C33114a a2 = InstallationResponse.m133549a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo95879f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo95876c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo95877d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo95886c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo95887d(m133598n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo95875b(a.mo95884a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo95878e(InstallationResponse.ResponseCode.OK).mo95874a();
    }

    /* renamed from: q */
    public final TokenResult mo95901q(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f80319E));
        TokenResult.C33115a a = TokenResult.m133562a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo95886c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo95887d(m133598n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo95885b(TokenResult.ResponseCode.OK).mo95884a();
    }

    /* renamed from: r */
    public final void mo95902r(HttpURLConnection httpURLConnection, @C0363p0 String str, @C0359n0 String str2) throws IOException {
        m133600t(httpURLConnection, m133594i(m133592b(str, str2)));
    }

    /* renamed from: s */
    public final void mo95903s(HttpURLConnection httpURLConnection) throws IOException {
        m133600t(httpURLConnection, m133594i(m133593c()));
    }
}
