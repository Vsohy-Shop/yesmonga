package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.Keep;
import androidx.core.content.p026pm.C17372c;
import com.google.android.gms.common.util.C40963a;
import com.google.android.gms.common.util.C40988n;
import com.google.firebase.remoteconfig.C33585u;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C33526f;
import com.google.firebase.remoteconfig.internal.C33533k;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p073j$.util.DesugarTimeZone;

public class ConfigFetchHttpClient {

    /* renamed from: h */
    public static final String f81524h = "X-Goog-Api-Key";

    /* renamed from: i */
    public static final String f81525i = "ETag";

    /* renamed from: j */
    public static final String f81526j = "If-None-Match";

    /* renamed from: k */
    public static final String f81527k = "X-Android-Package";

    /* renamed from: l */
    public static final String f81528l = "X-Android-Cert";

    /* renamed from: m */
    public static final String f81529m = "X-Google-GFE-Can-Retry";

    /* renamed from: n */
    public static final String f81530n = "X-Goog-Firebase-Installations-Auth";

    /* renamed from: o */
    public static final String f81531o = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* renamed from: p */
    public static final Pattern f81532p = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Context f81533a;

    /* renamed from: b */
    public final String f81534b;

    /* renamed from: c */
    public final String f81535c;

    /* renamed from: d */
    public final String f81536d;

    /* renamed from: e */
    public final String f81537e;

    /* renamed from: f */
    public final long f81538f;

    /* renamed from: g */
    public final long f81539g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f81533a = context;
        this.f81534b = str;
        this.f81535c = str2;
        this.f81536d = m135102f(str);
        this.f81537e = str3;
        this.f81538f = j;
        this.f81539g = j2;
    }

    /* renamed from: e */
    public static C33526f m135101e(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        try {
            C33526f.C33528b e = C33526f.m135137g().mo97312e(date);
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(C33585u.C33588c.f81747z3);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e = e.mo97310c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(C33585u.C33588c.f81744A3);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e = e.mo97311d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(C33585u.C33588c.f81745B3);
            } catch (JSONException unused3) {
            }
            if (jSONObject3 != null) {
                e = e.mo97313f(jSONObject3);
            }
            return e.mo97308a();
        } catch (JSONException e2) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
        }
    }

    /* renamed from: f */
    public static String m135102f(String str) {
        Matcher matcher = f81532p.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo97275a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public final String mo97276b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f81531o, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    /* renamed from: c */
    public final JSONObject mo97277c(String str, String str2, Map<String, String> map, Long l) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(C33585u.C33587b.f81731m3, str);
            hashMap.put(C33585u.C33587b.f81732n3, str2);
            hashMap.put("appId", this.f81534b);
            Locale locale = this.f81533a.getResources().getConfiguration().locale;
            hashMap.put(C33585u.C33587b.f81734p3, locale.getCountry());
            int i = Build.VERSION.SDK_INT;
            hashMap.put(C33585u.C33587b.f81735q3, locale.toLanguageTag());
            hashMap.put(C33585u.C33587b.f81736r3, Integer.toString(i));
            hashMap.put(C33585u.C33587b.f81737s3, TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f81533a.getPackageManager().getPackageInfo(this.f81533a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put(C33585u.C33587b.f81739u3, Long.toString(C17372c.m79910c(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put(C33585u.C33587b.f81740v3, this.f81533a.getPackageName());
            hashMap.put(C33585u.C33587b.f81741w3, "21.2.1");
            hashMap.put(C33585u.C33587b.f81742x3, new JSONObject(map));
            if (l != null) {
                hashMap.put(C33585u.C33587b.f81743y3, mo97276b(l.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: d */
    public HttpURLConnection mo97278d() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(mo97282i(this.f81536d, this.f81537e)).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    @Keep
    public C33533k.C33534a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws FirebaseRemoteConfigException {
        mo97288o(httpURLConnection, str3, str2, map2);
        try {
            mo97287n(httpURLConnection, mo97277c(str, str2, map, l).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField(f81525i);
                JSONObject h = mo97281h(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                if (!mo97275a(h)) {
                    return C33533k.C33534a.m135179a(date);
                }
                return C33533k.C33534a.m135180b(m135101e(h, date), headerField);
            }
            throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
        } catch (IOException | JSONException e) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    @C0344h1
    /* renamed from: g */
    public long mo97280g() {
        return this.f81538f;
    }

    /* renamed from: h */
    public final JSONObject mo97281h(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    /* renamed from: i */
    public final String mo97282i(String str, String str2) {
        return String.format(C33585u.f81728a, new Object[]{str, str2});
    }

    /* renamed from: j */
    public final String mo97283j() {
        try {
            Context context = this.f81533a;
            byte[] a = C40963a.m166572a(context, context.getPackageName());
            if (a != null) {
                return C40988n.m166658c(a, false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get fingerprint hash for package: ");
            sb.append(this.f81533a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.f81533a.getPackageName());
            return null;
        }
    }

    @C0344h1
    /* renamed from: k */
    public long mo97284k() {
        return this.f81539g;
    }

    /* renamed from: l */
    public final void mo97285l(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f81535c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f81533a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", mo97283j());
        httpURLConnection.setRequestProperty(f81529m, "yes");
        httpURLConnection.setRequestProperty(f81530n, str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: m */
    public final void mo97286m(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }

    /* renamed from: n */
    public final void mo97287n(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: o */
    public final void mo97288o(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f81538f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f81539g));
        httpURLConnection.setRequestProperty(f81526j, str);
        mo97285l(httpURLConnection, str2);
        mo97286m(httpURLConnection, map);
    }
}
