package com.urbanairship.http;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.config.C9061a;
import com.urbanairship.json.C9333e;
import com.urbanairship.util.C9651g0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.http.a */
public class C9113a {

    /* renamed from: k */
    public static final int f24631k = 60000;

    /* renamed from: l */
    public static final C9119d<Void> f24632l = new C9114a();

    /* renamed from: m */
    public static final String f24633m = "(UrbanAirshipLib-%s/%s; %s)";
    @C0363p0

    /* renamed from: a */
    public Uri f24634a;
    @C0363p0

    /* renamed from: b */
    public String f24635b;
    @C0363p0

    /* renamed from: c */
    public String f24636c;
    @C0363p0

    /* renamed from: d */
    public String f24637d;
    @C0363p0

    /* renamed from: e */
    public String f24638e;
    @C0363p0

    /* renamed from: f */
    public String f24639f;

    /* renamed from: g */
    public long f24640g;

    /* renamed from: h */
    public boolean f24641h;

    /* renamed from: i */
    public boolean f24642i;
    @C0359n0

    /* renamed from: j */
    public final Map<String, String> f24643j;

    /* renamed from: com.urbanairship.http.a$a */
    public class C9114a implements C9119d<Void> {
        /* renamed from: b */
        public Void mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) {
            return null;
        }
    }

    public C9113a(@C0363p0 String str, @C0363p0 Uri uri) {
        this();
        this.f24637d = str;
        this.f24634a = uri;
    }

    @C0359n0
    /* renamed from: a */
    public C9113a mo18123a(@C0359n0 Map<String, String> map) {
        this.f24643j.putAll(map);
        return this;
    }

    /* renamed from: b */
    public C9116c<Void> mo18124b() throws RequestException {
        return mo18125c(f24632l);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r6 = mo18126d(r5.getErrorStream());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x011f */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0164  */
    @androidx.annotation.C0359n0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.urbanairship.http.C9116c<T> mo18125c(@androidx.annotation.C0359n0 com.urbanairship.http.C9119d<T> r11) throws com.urbanairship.http.RequestException {
        /*
            r10 = this;
            android.net.Uri r0 = r10.f24634a
            if (r0 == 0) goto L_0x0179
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0170 }
            android.net.Uri r1 = r10.f24634a     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x0170 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = r10.f24637d
            if (r1 == 0) goto L_0x0168
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            android.content.Context r5 = com.urbanairship.UAirship.m146200l()     // Catch:{ Exception -> 0x014b }
            java.net.URLConnection r5 = com.urbanairship.util.C9663m.m36193b(r5, r0)     // Catch:{ Exception -> 0x014b }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x014b }
            java.lang.String r4 = r10.f24637d     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.setRequestMethod(r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r5.setConnectTimeout(r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r4 = r10.f24638e     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            if (r4 == 0) goto L_0x003a
            r5.setDoOutput(r2)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r6 = r10.f24639f     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.setRequestProperty(r4, r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
        L_0x003a:
            r5.setDoInput(r2)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.setUseCaches(r3)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.setAllowUserInteraction(r3)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            boolean r4 = r10.f24642i     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.setInstanceFollowRedirects(r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            long r6 = r10.f24640g     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0053
            r5.setIfModifiedSince(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
        L_0x0053:
            java.util.Map<java.lang.String, java.lang.String> r4 = r10.f24643j     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.util.Set r4 = r4.keySet()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
        L_0x005d:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            if (r6 == 0) goto L_0x0075
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.util.Map<java.lang.String, java.lang.String> r7 = r10.f24643j     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.setRequestProperty(r6, r7)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            goto L_0x005d
        L_0x0075:
            java.lang.String r4 = r10.f24635b     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            boolean r4 = com.urbanairship.util.C9669o0.m36224e(r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            if (r4 != 0) goto L_0x00bb
            java.lang.String r4 = r10.f24636c     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            boolean r4 = com.urbanairship.util.C9669o0.m36224e(r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            if (r4 != 0) goto L_0x00bb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r4.<init>()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = r10.f24635b     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r4.append(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = ":"
            r4.append(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = r10.f24636c     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r4.append(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = "Authorization"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r7.<init>()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r8 = "Basic "
            r7.append(r8)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r1)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r7.append(r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r4 = r7.toString()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.setRequestProperty(r6, r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
        L_0x00bb:
            java.lang.String r4 = r10.f24638e     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            if (r4 == 0) goto L_0x00fd
            boolean r4 = r10.f24641h     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = "UTF-8"
            if (r4 == 0) goto L_0x00e9
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r5.setRequestProperty(r4, r7)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.io.OutputStream r4 = r5.getOutputStream()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r8.<init>(r7, r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = r10.f24638e     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r8.write(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r8.close()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r7.close()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r4.close()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            goto L_0x00fd
        L_0x00e9:
            java.io.OutputStream r4 = r5.getOutputStream()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r7.<init>(r4, r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = r10.f24638e     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r7.write(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r7.close()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r4.close()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
        L_0x00fd:
            com.urbanairship.http.c$b r4 = new com.urbanairship.http.c$b     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            int r6 = r5.getResponseCode()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.util.Map r6 = r5.getHeaderFields()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            com.urbanairship.http.c$b r4 = r4.mo18156i(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            long r6 = r5.getLastModified()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            com.urbanairship.http.c$b r4 = r4.mo18154g(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.io.InputStream r6 = r5.getInputStream()     // Catch:{ IOException -> 0x011f }
            java.lang.String r6 = r10.mo18126d(r6)     // Catch:{ IOException -> 0x011f }
            goto L_0x0127
        L_0x011f:
            java.io.InputStream r6 = r5.getErrorStream()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = r10.mo18126d(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
        L_0x0127:
            int r7 = r5.getResponseCode()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.util.Map r8 = r5.getHeaderFields()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.Object r11 = r11.mo17322a(r7, r8, r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            com.urbanairship.http.c$b r11 = r4.mo18157j(r11)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            com.urbanairship.http.c$b r11 = r11.mo18155h(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            com.urbanairship.http.c r11 = r11.mo18153f()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.disconnect()
            return r11
        L_0x0143:
            r11 = move-exception
            r4 = r5
            goto L_0x0162
        L_0x0146:
            r11 = move-exception
            r4 = r5
            goto L_0x014c
        L_0x0149:
            r11 = move-exception
            goto L_0x0162
        L_0x014b:
            r11 = move-exception
        L_0x014c:
            com.urbanairship.http.RequestException r5 = new com.urbanairship.http.RequestException     // Catch:{ all -> 0x0149 }
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = "Request failed URL: %s method: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0149 }
            r1[r3] = r0     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r10.f24637d     // Catch:{ all -> 0x0149 }
            r1[r2] = r0     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = java.lang.String.format(r6, r7, r1)     // Catch:{ all -> 0x0149 }
            r5.<init>(r0, r11)     // Catch:{ all -> 0x0149 }
            throw r5     // Catch:{ all -> 0x0149 }
        L_0x0162:
            if (r4 == 0) goto L_0x0167
            r4.disconnect()
        L_0x0167:
            throw r11
        L_0x0168:
            com.urbanairship.http.RequestException r11 = new com.urbanairship.http.RequestException
            java.lang.String r0 = "Unable to perform request: missing request method"
            r11.<init>(r0)
            throw r11
        L_0x0170:
            r11 = move-exception
            com.urbanairship.http.RequestException r0 = new com.urbanairship.http.RequestException
            java.lang.String r1 = "Failed to build URL"
            r0.<init>(r1, r11)
            throw r0
        L_0x0179:
            com.urbanairship.http.RequestException r11 = new com.urbanairship.http.RequestException
            java.lang.String r0 = "Unable to perform request: missing URL"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.http.C9113a.mo18125c(com.urbanairship.http.d):com.urbanairship.http.c");
    }

    @C0363p0
    /* renamed from: d */
    public final String mo18126d(@C0363p0 InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            } finally {
                try {
                    inputStream.close();
                    bufferedReader.close();
                } catch (Exception e) {
                    C36059m.m148411g(e, "Failed to close streams", new Object[0]);
                }
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @C0359n0
    /* renamed from: e */
    public C9113a mo18127e() {
        return mo18131i("Accept", "application/vnd.urbanairship+json; version=3;");
    }

    /* renamed from: f */
    public C9113a mo18128f(@C0359n0 C9061a aVar) {
        String a = C9651g0.m36156a(aVar.mo17959b());
        String format = String.format(Locale.ROOT, f24633m, new Object[]{a, UAirship.m146181I(), aVar.mo17958a().f87128a});
        this.f24643j.put("X-UA-App-Key", aVar.mo17958a().f87128a);
        this.f24643j.put("User-Agent", format);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C9113a mo18129g(boolean z) {
        this.f24641h = z;
        return this;
    }

    @C0359n0
    /* renamed from: h */
    public C9113a mo18130h(@C0363p0 String str, @C0363p0 String str2) {
        this.f24635b = str;
        this.f24636c = str2;
        return this;
    }

    @C0359n0
    /* renamed from: i */
    public C9113a mo18131i(@C0359n0 String str, @C0363p0 String str2) {
        if (str2 == null) {
            this.f24643j.remove(str);
        } else {
            this.f24643j.put(str, str2);
        }
        return this;
    }

    @C0359n0
    /* renamed from: j */
    public C9113a mo18132j(long j) {
        this.f24640g = j;
        return this;
    }

    @C0359n0
    /* renamed from: k */
    public C9113a mo18133k(boolean z) {
        this.f24642i = z;
        return this;
    }

    /* renamed from: l */
    public C9113a mo18134l(@C0363p0 String str, @C0363p0 Uri uri) {
        this.f24637d = str;
        this.f24634a = uri;
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public C9113a mo18135m(@C0359n0 C9333e eVar) {
        return mo18136n(eVar.mo17264q().toString(), "application/json");
    }

    @C0359n0
    /* renamed from: n */
    public C9113a mo18136n(@C0363p0 String str, @C0363p0 String str2) {
        this.f24638e = str;
        this.f24639f = str2;
        return this;
    }

    public C9113a() {
        this.f24640g = 0;
        this.f24641h = false;
        this.f24642i = true;
        this.f24643j = new HashMap();
    }
}
