package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import androidx.autofill.C0861a;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.cct.internal.C40051a;
import com.google.android.datatransport.cct.internal.C40077j;
import com.google.android.datatransport.cct.internal.C40078k;
import com.google.android.datatransport.cct.internal.C40080l;
import com.google.android.datatransport.cct.internal.C40082m;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.C40189i;
import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.C40108g;
import com.google.android.datatransport.runtime.backends.C40116m;
import com.google.android.datatransport.runtime.logging.C40195a;
import com.google.android.datatransport.runtime.retries.C40206b;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.firebase.encoders.C32994a;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.datatransport.cct.d */
public final class C40045d implements C40116m {

    /* renamed from: A */
    public static final String f102085A = "fingerprint";

    /* renamed from: B */
    public static final String f102086B = "locale";

    /* renamed from: C */
    public static final String f102087C = "country";

    /* renamed from: D */
    public static final String f102088D = "mcc_mnc";

    /* renamed from: E */
    public static final String f102089E = "tz-offset";

    /* renamed from: F */
    public static final String f102090F = "application_build";

    /* renamed from: h */
    public static final String f102091h = "CctTransportBackend";

    /* renamed from: i */
    public static final int f102092i = 30000;

    /* renamed from: j */
    public static final int f102093j = 130000;

    /* renamed from: k */
    public static final int f102094k = -1;

    /* renamed from: l */
    public static final String f102095l = "Accept-Encoding";

    /* renamed from: m */
    public static final String f102096m = "Content-Encoding";

    /* renamed from: n */
    public static final String f102097n = "gzip";

    /* renamed from: o */
    public static final String f102098o = "Content-Type";

    /* renamed from: p */
    public static final String f102099p = "X-Goog-Api-Key";

    /* renamed from: q */
    public static final String f102100q = "application/json";
    @C0344h1

    /* renamed from: r */
    public static final String f102101r = "net-type";
    @C0344h1

    /* renamed from: s */
    public static final String f102102s = "mobile-subtype";

    /* renamed from: t */
    public static final String f102103t = "sdk-version";

    /* renamed from: u */
    public static final String f102104u = "model";

    /* renamed from: v */
    public static final String f102105v = "hardware";

    /* renamed from: w */
    public static final String f102106w = "device";

    /* renamed from: x */
    public static final String f102107x = "product";

    /* renamed from: y */
    public static final String f102108y = "os-uild";

    /* renamed from: z */
    public static final String f102109z = "manufacturer";

    /* renamed from: a */
    public final C32994a f102110a;

    /* renamed from: b */
    public final ConnectivityManager f102111b;

    /* renamed from: c */
    public final Context f102112c;

    /* renamed from: d */
    public final URL f102113d;

    /* renamed from: e */
    public final C40309a f102114e;

    /* renamed from: f */
    public final C40309a f102115f;

    /* renamed from: g */
    public final int f102116g;

    /* renamed from: com.google.android.datatransport.cct.d$a */
    public static final class C40046a {

        /* renamed from: a */
        public final URL f102117a;

        /* renamed from: b */
        public final C40077j f102118b;
        @C0363p0

        /* renamed from: c */
        public final String f102119c;

        public C40046a(URL url, C40077j jVar, @C0363p0 String str) {
            this.f102117a = url;
            this.f102118b = jVar;
            this.f102119c = str;
        }

        /* renamed from: a */
        public C40046a mo132566a(URL url) {
            return new C40046a(url, this.f102118b, this.f102119c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.d$b */
    public static final class C40047b {

        /* renamed from: a */
        public final int f102120a;
        @C0363p0

        /* renamed from: b */
        public final URL f102121b;

        /* renamed from: c */
        public final long f102122c;

        public C40047b(int i, @C0363p0 URL url, long j) {
            this.f102120a = i;
            this.f102121b = url;
            this.f102122c = j;
        }
    }

    public C40045d(Context context, C40309a aVar, C40309a aVar2, int i) {
        this.f102110a = C40077j.m163198b();
        this.f102112c = context;
        this.f102111b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f102113d = m163067n(C40042a.f102074d);
        this.f102114e = aVar2;
        this.f102115f = aVar;
        this.f102116g = i;
    }

    /* renamed from: f */
    public static int m163060f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.mo132574g();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.mo132574g();
        }
        if (NetworkConnectionInfo.MobileSubtype.m163083b(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    public static int m163061g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.NetworkType.NONE.mo132575g();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    public static int m163062h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C40195a.m163495f(f102091h, "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m163063j(Context context) {
        return (TelephonyManager) context.getSystemService(C0861a.f2705e);
    }

    @C0344h1
    /* renamed from: k */
    public static long m163064k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* renamed from: l */
    public static /* synthetic */ C40046a m163065l(C40046a aVar, C40047b bVar) {
        URL url = bVar.f102121b;
        if (url == null) {
            return null;
        }
        C40195a.m163492c(f102091h, "Following redirect to: %s", url);
        return aVar.mo132566a(bVar.f102121b);
    }

    /* renamed from: m */
    public static InputStream m163066m(InputStream inputStream, String str) throws IOException {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    public static URL m163067n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public C40190j mo132562a(C40190j jVar) {
        NetworkInfo activeNetworkInfo = this.f102111b.getActiveNetworkInfo();
        return jVar.mo132840n().mo132841a(f102103t, Build.VERSION.SDK_INT).mo132843c(f102104u, Build.MODEL).mo132843c(f102105v, Build.HARDWARE).mo132843c("device", Build.DEVICE).mo132843c("product", Build.PRODUCT).mo132843c(f102108y, Build.ID).mo132843c("manufacturer", Build.MANUFACTURER).mo132843c(f102085A, Build.FINGERPRINT).mo132842b(f102089E, m163064k()).mo132841a(f102101r, m163061g(activeNetworkInfo)).mo132841a(f102102s, m163060f(activeNetworkInfo)).mo132843c("country", Locale.getDefault().getCountry()).mo132843c("locale", Locale.getDefault().getLanguage()).mo132843c(f102088D, m163063j(this.f102112c).getSimOperator()).mo132843c(f102090F, Integer.toString(m163062h(this.f102112c))).mo132686d();
    }

    /* renamed from: b */
    public BackendResponse mo132563b(C40108g gVar) {
        C40077j i = mo132565i(gVar);
        URL url = this.f102113d;
        String str = null;
        if (gVar.mo132698d() != null) {
            try {
                C40042a e = C40042a.m163052e(gVar.mo132698d());
                if (e.mo132556f() != null) {
                    str = e.mo132556f();
                }
                if (e.mo132557g() != null) {
                    url = m163067n(e.mo132557g());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.m163282a();
            }
        }
        try {
            C40047b bVar = (C40047b) C40206b.m163528a(5, new C40046a(url, i, str), new C40043b(this), new C40044c());
            int i2 = bVar.f102120a;
            if (i2 == 200) {
                return BackendResponse.m163284e(bVar.f102122c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    if (i2 == 400) {
                        return BackendResponse.m163283d();
                    }
                    return BackendResponse.m163282a();
                }
            }
            return BackendResponse.m163285f();
        } catch (IOException e2) {
            C40195a.m163495f(f102091h, "Could not make request to the backend", e2);
            return BackendResponse.m163285f();
        }
    }

    /* renamed from: e */
    public final C40047b mo132564e(C40046a aVar) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        InputStream m;
        C40195a.m163497h(f102091h, "Making request to: %s", aVar.f102117a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f102117a.openConnection();
        httpURLConnection.setConnectTimeout(f102092i);
        httpURLConnection.setReadTimeout(this.f102116g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.8"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(f102095l, "gzip");
        String str = aVar.f102119c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f102110a.mo95626a(aVar.f102118b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C40195a.m163497h(f102091h, "Status Code: %d", Integer.valueOf(responseCode));
                C40195a.m163492c(f102091h, "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                C40195a.m163492c(f102091h, "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C40047b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new C40047b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m = m163066m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C40047b bVar = new C40047b(responseCode, (URL) null, C40082m.m163237b(new BufferedReader(new InputStreamReader(m))).mo132657c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            C40195a.m163495f(f102091h, "Couldn't open connection, returning with 500", e);
            return new C40047b(500, (URL) null, 0);
        } catch (EncodingException | IOException e2) {
            C40195a.m163495f(f102091h, "Couldn't encode request, returning with 400", e2);
            return new C40047b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: i */
    public final C40077j mo132565i(C40108g gVar) {
        C40078k.C40079a aVar;
        HashMap hashMap = new HashMap();
        for (C40190j next : gVar.mo132697c()) {
            String l = next.mo132683l();
            if (!hashMap.containsKey(l)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(l, arrayList);
            } else {
                ((List) hashMap.get(l)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C40190j jVar = (C40190j) ((List) entry.getValue()).get(0);
            C40080l.C40081a b = C40080l.m163218a().mo132654f(QosTier.DEFAULT).mo132655g(this.f102115f.getTime()).mo132656h(this.f102114e.getTime()).mo132650b(ClientInfo.m163074a().mo132571c(ClientInfo.ClientType.ANDROID_FIREBASE).mo132570b(C40051a.m163091a().mo132604m(Integer.valueOf(jVar.mo132835g(f102103t))).mo132601j(jVar.mo132834b(f102104u)).mo132597f(jVar.mo132834b(f102105v)).mo132595d(jVar.mo132834b("device")).mo132603l(jVar.mo132834b("product")).mo132602k(jVar.mo132834b(f102108y)).mo132599h(jVar.mo132834b("manufacturer")).mo132596e(jVar.mo132834b(f102085A)).mo132594c(jVar.mo132834b("country")).mo132598g(jVar.mo132834b("locale")).mo132600i(jVar.mo132834b(f102088D)).mo132593b(jVar.mo132834b(f102090F)).mo132592a()).mo132569a());
            try {
                b.mo132664i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo132665j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C40190j jVar2 : (List) entry.getValue()) {
                C40189i e = jVar2.mo132679e();
                C40041c b2 = e.mo132830b();
                if (b2.equals(C40041c.m163048b("proto"))) {
                    aVar = C40078k.m163202j(e.mo132829a());
                } else if (b2.equals(C40041c.m163048b("json"))) {
                    aVar = C40078k.m163201i(new String(e.mo132829a(), Charset.forName("UTF-8")));
                } else {
                    C40195a.m163498i(f102091h, "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo132633c(jVar2.mo132681f()).mo132634d(jVar2.mo132684m()).mo132638h(jVar2.mo132836h(f102089E)).mo132635e(NetworkConnectionInfo.m163080a().mo132578c(NetworkConnectionInfo.NetworkType.m163085b(jVar2.mo132835g(f102101r))).mo132577b(NetworkConnectionInfo.MobileSubtype.m163083b(jVar2.mo132835g(f102102s))).mo132576a());
                if (jVar2.mo132678d() != null) {
                    aVar.mo132632b(jVar2.mo132678d());
                }
                arrayList3.add(aVar.mo132631a());
            }
            b.mo132651c(arrayList3);
            arrayList2.add(b.mo132649a());
        }
        return C40077j.m163197a(arrayList2);
    }

    public C40045d(Context context, C40309a aVar, C40309a aVar2) {
        this(context, aVar, aVar2, f102093j);
    }
}
