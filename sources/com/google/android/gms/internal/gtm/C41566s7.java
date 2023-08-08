package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.util.C40974d0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.gtm.s7 */
public final class C41566s7 implements C41732z5 {

    /* renamed from: a */
    public final String f104946a;

    /* renamed from: b */
    public final Context f104947b;

    /* renamed from: c */
    public final C41542r7 f104948c;

    /* renamed from: d */
    public final C41518q7 f104949d = new C41518q7();

    @C40974d0
    public C41566s7(Context context, C41542r7 r7Var) {
        this.f104947b = context.getApplicationContext();
        this.f104948c = r7Var;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str2 = null;
        if (!(locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            str2 = sb.toString();
        }
        this.f104946a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleTagManager", "5.06", str, str2, Build.MODEL, Build.ID});
    }

    @C40974d0
    /* renamed from: b */
    public static final URL m168330b(C41180c6 c6Var) {
        try {
            return new URL(c6Var.mo135164e());
        } catch (MalformedURLException unused) {
            C41493p6.m168149a("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v46, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v47, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r12v8, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v17, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r8v19, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x018e A[Catch:{ all -> 0x0164, all -> 0x025a }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0204 A[Catch:{ all -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x023c A[SYNTHETIC, Splitter:B:125:0x023c] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0246 A[SYNTHETIC, Splitter:B:129:0x0246] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0256 A[SYNTHETIC, Splitter:B:137:0x0256] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0265 A[SYNTHETIC, Splitter:B:148:0x0265] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0259 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0268 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135823a(java.util.List<com.google.android.gms.internal.gtm.C41180c6> r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "GET"
            java.lang.String r3 = ": "
            int r0 = r18.size()
            r4 = 40
            int r4 = java.lang.Math.min(r0, r4)
            r5 = 1
            r6 = 0
            r8 = r5
            r7 = r6
        L_0x0014:
            if (r7 >= r4) goto L_0x02b4
            r9 = r18
            java.lang.Object r0 = r9.get(r7)
            r10 = r0
            com.google.android.gms.internal.gtm.c6 r10 = (com.google.android.gms.internal.gtm.C41180c6) r10
            java.net.URL r11 = m168330b(r10)
            java.lang.String r0 = r10.mo135163d()
            java.util.Map r12 = r10.mo135165f()
            java.lang.String r13 = r10.mo135162c()
            if (r11 != 0) goto L_0x003e
            java.lang.String r0 = "No destination: discarding hit."
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)
            com.google.android.gms.internal.gtm.r7 r0 = r1.f104948c
            r0.mo135800a(r10)
            r12 = r5
            goto L_0x02af
        L_0x003e:
            java.net.URLConnection r15 = r11.openConnection()     // Catch:{ IOException -> 0x026e }
            java.net.HttpURLConnection r15 = (java.net.HttpURLConnection) r15     // Catch:{ IOException -> 0x026e }
            r16 = 0
            if (r8 == 0) goto L_0x0053
            android.content.Context r8 = r1.f104947b     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.gtm.C41517q6.m168243a(r8)     // Catch:{ all -> 0x004e }
            goto L_0x0053
        L_0x004e:
            r0 = move-exception
            r8 = r5
            r12 = r8
            goto L_0x0263
        L_0x0053:
            java.lang.String r8 = "User-Agent"
            java.lang.String r14 = r1.f104946a     // Catch:{ all -> 0x0260 }
            r15.setRequestProperty(r8, r14)     // Catch:{ all -> 0x0260 }
            if (r12 == 0) goto L_0x0080
            java.util.Set r8 = r12.entrySet()     // Catch:{ all -> 0x0260 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0260 }
        L_0x0064:
            boolean r12 = r8.hasNext()     // Catch:{ all -> 0x0260 }
            if (r12 == 0) goto L_0x0080
            java.lang.Object r12 = r8.next()     // Catch:{ all -> 0x0260 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x0260 }
            java.lang.Object r14 = r12.getKey()     // Catch:{ all -> 0x0260 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0260 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0260 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0260 }
            r15.setRequestProperty(r14, r12)     // Catch:{ all -> 0x0260 }
            goto L_0x0064
        L_0x0080:
            if (r0 != 0) goto L_0x00a7
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0260 }
            long r12 = r10.mo135161b()     // Catch:{ all -> 0x0260 }
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0260 }
            r0[r6] = r8     // Catch:{ all -> 0x0260 }
            java.lang.String r8 = "Hit %d retrieved from the store has null HTTP method."
            java.lang.String r0 = java.lang.String.format(r8, r0)     // Catch:{ all -> 0x0260 }
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x0260 }
            com.google.android.gms.internal.gtm.r7 r0 = r1.f104948c     // Catch:{ all -> 0x0260 }
            r0.mo135800a(r10)     // Catch:{ all -> 0x0260 }
            r15.disconnect()     // Catch:{ IOException -> 0x00a3 }
            r12 = r5
        L_0x00a0:
            r8 = r6
            goto L_0x02af
        L_0x00a3:
            r0 = move-exception
            r12 = r5
            goto L_0x024f
        L_0x00a7:
            boolean r8 = r0.equals(r2)     // Catch:{ all -> 0x0260 }
            java.lang.String r12 = "POST"
            java.lang.String r14 = "PUT"
            java.lang.String r6 = "HEAD"
            if (r8 != 0) goto L_0x00ea
            boolean r8 = r0.equals(r6)     // Catch:{ all -> 0x025c }
            if (r8 != 0) goto L_0x00ea
            boolean r8 = r0.equals(r12)     // Catch:{ all -> 0x025c }
            if (r8 != 0) goto L_0x00ea
            boolean r8 = r0.equals(r14)     // Catch:{ all -> 0x025c }
            if (r8 != 0) goto L_0x00ea
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x025c }
            r8 = 0
            r6[r8] = r0     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "Unrecongnized HTTP method %s. Supported methods are GET, HEAD, PUT and/or POST"
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ all -> 0x025c }
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x025c }
            com.google.android.gms.internal.gtm.r7 r0 = r1.f104948c     // Catch:{ all -> 0x025c }
            r0.mo135800a(r10)     // Catch:{ all -> 0x025c }
            r15.disconnect()     // Catch:{ IOException -> 0x00e0 }
            r12 = r5
            r6 = 0
            r8 = 0
            goto L_0x02af
        L_0x00e0:
            r0 = move-exception
            r12 = r5
            r6 = 0
            goto L_0x024f
        L_0x00e5:
            r0 = move-exception
            r12 = r5
            r6 = r8
            goto L_0x0262
        L_0x00ea:
            int r8 = r0.hashCode()     // Catch:{ all -> 0x025c }
            r5 = 2
            switch(r8) {
                case 70454: goto L_0x010b;
                case 79599: goto L_0x0103;
                case 2213344: goto L_0x00fb;
                case 2461856: goto L_0x00f3;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            goto L_0x0113
        L_0x00f3:
            boolean r6 = r0.equals(r12)
            if (r6 == 0) goto L_0x0113
            r8 = r5
            goto L_0x0114
        L_0x00fb:
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x0113
            r8 = 1
            goto L_0x0114
        L_0x0103:
            boolean r6 = r0.equals(r14)
            if (r6 == 0) goto L_0x0113
            r8 = 3
            goto L_0x0114
        L_0x010b:
            boolean r6 = r0.equals(r2)
            if (r6 == 0) goto L_0x0113
            r8 = 0
            goto L_0x0114
        L_0x0113:
            r8 = -1
        L_0x0114:
            if (r8 == 0) goto L_0x0150
            r6 = 1
            if (r8 == r6) goto L_0x0150
            if (r8 == r5) goto L_0x0121
            r5 = 3
            if (r8 == r5) goto L_0x0121
        L_0x011e:
            r12 = r6
            r6 = 0
            goto L_0x0170
        L_0x0121:
            r15.setRequestMethod(r0)     // Catch:{ all -> 0x014c }
            if (r13 == 0) goto L_0x011e
            r15.setDoOutput(r6)     // Catch:{ all -> 0x014c }
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ all -> 0x0166 }
            byte[] r5 = r13.getBytes(r5)     // Catch:{ all -> 0x0166 }
            int r6 = r5.length     // Catch:{ all -> 0x0166 }
            r15.setFixedLengthStreamingMode(r6)     // Catch:{ all -> 0x0166 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0166 }
            java.io.OutputStream r8 = r15.getOutputStream()     // Catch:{ all -> 0x0166 }
            r6.<init>(r8)     // Catch:{ all -> 0x0166 }
            r6.write(r5)     // Catch:{ all -> 0x0166 }
            r6.flush()     // Catch:{ all -> 0x0166 }
            r6.close()     // Catch:{ all -> 0x0166 }
            r6 = 0
            r12 = 1
            goto L_0x0170
        L_0x014c:
            r0 = move-exception
            r12 = r6
            goto L_0x025e
        L_0x0150:
            if (r13 == 0) goto L_0x016b
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0166 }
            r6 = 0
            r5[r6] = r0     // Catch:{ all -> 0x0164 }
            r12 = 1
            r5[r12] = r13     // Catch:{ all -> 0x025a }
            java.lang.String r8 = "Body of %s hit is ignored: %s."
            java.lang.String r5 = java.lang.String.format(r8, r5)     // Catch:{ all -> 0x025a }
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r5)     // Catch:{ all -> 0x025a }
            goto L_0x016d
        L_0x0164:
            r0 = move-exception
            goto L_0x0168
        L_0x0166:
            r0 = move-exception
            r6 = 0
        L_0x0168:
            r12 = 1
            goto L_0x0262
        L_0x016b:
            r6 = 0
            r12 = 1
        L_0x016d:
            r15.setRequestMethod(r0)     // Catch:{ all -> 0x025a }
        L_0x0170:
            int r5 = r15.getResponseCode()     // Catch:{ all -> 0x025a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r13 = 27
            r8.<init>(r13)     // Catch:{ all -> 0x025a }
            java.lang.String r13 = "Response code = "
            r8.append(r13)     // Catch:{ all -> 0x025a }
            r8.append(r5)     // Catch:{ all -> 0x025a }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x025a }
            com.google.android.gms.internal.gtm.C41493p6.m168152d(r8)     // Catch:{ all -> 0x025a }
            r8 = 200(0xc8, float:2.8E-43)
            if (r5 < r8) goto L_0x01d5
            r8 = 300(0x12c, float:4.2E-43)
            if (r5 < r8) goto L_0x0193
            goto L_0x01d5
        L_0x0193:
            java.io.InputStream r16 = r15.getInputStream()     // Catch:{ all -> 0x025a }
            java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x025a }
            int r8 = r5.length()     // Catch:{ all -> 0x025a }
            int r8 = r8 + 23
            int r13 = r0.length()     // Catch:{ all -> 0x025a }
            int r8 = r8 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r13.<init>(r8)     // Catch:{ all -> 0x025a }
            java.lang.String r8 = "Hit sent to "
            r13.append(r8)     // Catch:{ all -> 0x025a }
            r13.append(r5)     // Catch:{ all -> 0x025a }
            java.lang.String r5 = "(method = "
            r13.append(r5)     // Catch:{ all -> 0x025a }
            r13.append(r0)     // Catch:{ all -> 0x025a }
            java.lang.String r0 = ")"
            r13.append(r0)     // Catch:{ all -> 0x025a }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x025a }
            com.google.android.gms.internal.gtm.C41493p6.m168152d(r0)     // Catch:{ all -> 0x025a }
            com.google.android.gms.internal.gtm.r7 r0 = r1.f104948c     // Catch:{ all -> 0x025a }
            com.google.android.gms.internal.gtm.r6 r0 = (com.google.android.gms.internal.gtm.C41541r6) r0     // Catch:{ all -> 0x025a }
            com.google.android.gms.internal.gtm.t6 r0 = r0.f104922a     // Catch:{ all -> 0x025a }
            long r13 = r10.mo135161b()     // Catch:{ all -> 0x025a }
            r0.mo135851n(r13)     // Catch:{ all -> 0x025a }
            goto L_0x0244
        L_0x01d5:
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x025a }
            int r8 = r0.length()     // Catch:{ all -> 0x025a }
            int r8 = r8 + 39
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r13.<init>(r8)     // Catch:{ all -> 0x025a }
            java.lang.String r8 = "Bad response received for "
            r13.append(r8)     // Catch:{ all -> 0x025a }
            r13.append(r0)     // Catch:{ all -> 0x025a }
            r13.append(r3)     // Catch:{ all -> 0x025a }
            r13.append(r5)     // Catch:{ all -> 0x025a }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x025a }
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x025a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r0.<init>()     // Catch:{ all -> 0x025a }
            java.io.InputStream r5 = r15.getErrorStream()     // Catch:{ all -> 0x0251 }
            if (r5 == 0) goto L_0x0238
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x0251 }
            java.io.InputStreamReader r13 = new java.io.InputStreamReader     // Catch:{ all -> 0x0251 }
            r13.<init>(r5)     // Catch:{ all -> 0x0251 }
            r8.<init>(r13)     // Catch:{ all -> 0x0251 }
        L_0x020e:
            java.lang.String r5 = r8.readLine()     // Catch:{ all -> 0x0236 }
            if (r5 == 0) goto L_0x0218
            r0.append(r5)     // Catch:{ all -> 0x0236 }
            goto L_0x020e
        L_0x0218:
            java.lang.String r5 = "Error Message: "
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0236 }
            int r13 = r0.length()     // Catch:{ all -> 0x0236 }
            if (r13 == 0) goto L_0x022d
            java.lang.String r0 = r5.concat(r0)     // Catch:{ all -> 0x0236 }
            goto L_0x0232
        L_0x022d:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0236 }
            r0.<init>(r5)     // Catch:{ all -> 0x0236 }
        L_0x0232:
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x0236 }
            goto L_0x023a
        L_0x0236:
            r0 = move-exception
            goto L_0x0254
        L_0x0238:
            r8 = r16
        L_0x023a:
            if (r8 == 0) goto L_0x023f
            r8.close()     // Catch:{ all -> 0x025a }
        L_0x023f:
            com.google.android.gms.internal.gtm.r7 r0 = r1.f104948c     // Catch:{ all -> 0x025a }
            r0.mo135801b(r10)     // Catch:{ all -> 0x025a }
        L_0x0244:
            if (r16 == 0) goto L_0x0249
            r16.close()     // Catch:{ IOException -> 0x024e }
        L_0x0249:
            r15.disconnect()     // Catch:{ IOException -> 0x024e }
            goto L_0x00a0
        L_0x024e:
            r0 = move-exception
        L_0x024f:
            r8 = r6
            goto L_0x0270
        L_0x0251:
            r0 = move-exception
            r8 = r16
        L_0x0254:
            if (r8 == 0) goto L_0x0259
            r8.close()     // Catch:{ all -> 0x025a }
        L_0x0259:
            throw r0     // Catch:{ all -> 0x025a }
        L_0x025a:
            r0 = move-exception
            goto L_0x0262
        L_0x025c:
            r0 = move-exception
            r12 = r5
        L_0x025e:
            r6 = 0
            goto L_0x0262
        L_0x0260:
            r0 = move-exception
            r12 = r5
        L_0x0262:
            r8 = r6
        L_0x0263:
            if (r16 == 0) goto L_0x0268
            r16.close()     // Catch:{ IOException -> 0x026c }
        L_0x0268:
            r15.disconnect()     // Catch:{ IOException -> 0x026c }
            throw r0     // Catch:{ IOException -> 0x026c }
        L_0x026c:
            r0 = move-exception
            goto L_0x0270
        L_0x026e:
            r0 = move-exception
            r12 = r5
        L_0x0270:
            java.lang.String r5 = java.lang.String.valueOf(r11)
            java.lang.Class r11 = r0.getClass()
            java.lang.String r11 = r11.getSimpleName()
            int r13 = r5.length()
            int r14 = r11.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r16 = 27
            int r13 = r13 + 27
            int r13 = r13 + r14
            r15.<init>(r13)
            java.lang.String r13 = "Exception sending hit to "
            r15.append(r13)
            r15.append(r5)
            r15.append(r3)
            r15.append(r11)
            java.lang.String r5 = r15.toString()
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r5)
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)
            com.google.android.gms.internal.gtm.r7 r0 = r1.f104948c
            r0.mo135801b(r10)
        L_0x02af:
            int r7 = r7 + 1
            r5 = r12
            goto L_0x0014
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41566s7.mo135823a(java.util.List):void");
    }

    public final boolean zzb() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f104947b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        C41493p6.m168152d("...no network connectivity");
        return false;
    }
}
