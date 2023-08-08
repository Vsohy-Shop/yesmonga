package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.analytics.C40372a0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import kotlin.text.C11626x;

/* renamed from: com.google.android.gms.internal.gtm.g4 */
public final class C41274g4 extends C41535r0 {

    /* renamed from: e */
    public static final byte[] f104609e = "\n".getBytes();

    /* renamed from: c */
    public final String f104610c = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", C41559s0.f104933a, Build.VERSION.RELEASE, C41611u4.m168468d(Locale.getDefault()), Build.MODEL, Build.ID});

    /* renamed from: d */
    public final C41515q4 f104611d;

    public C41274g4(C41607u0 u0Var) {
        super(u0Var);
        this.f104611d = new C41515q4(u0Var.mo135907r());
    }

    /* renamed from: p0 */
    public static final void m167519p0(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append(C11626x.f28913d);
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* renamed from: W */
    public final void mo133294W() {
        mo135760w("Network initialized. User agent", this.f104610c);
    }

    @C40974d0
    /* renamed from: X */
    public final String mo135394X(C41706y3 y3Var, boolean z) {
        String str;
        C40843u.m166202l(y3Var);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : y3Var.mo136096g().entrySet()) {
                String str2 = (String) next.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2) && !"z".equals(str2) && !"_gmsv".equals(str2)) {
                    m167519p0(sb, str2, (String) next.getValue());
                }
            }
            m167519p0(sb, "ht", String.valueOf(y3Var.mo136094d()));
            m167519p0(sb, "qt", String.valueOf(mo135748j().mo134768a() - y3Var.mo136094d()));
            mo135742P();
            if (z) {
                long c = y3Var.mo136093c();
                if (c != 0) {
                    str = String.valueOf(c);
                } else {
                    str = String.valueOf(y3Var.mo136092b());
                }
                m167519p0(sb, "z", str);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            mo135755r("Failed to encode name or value", e);
            return null;
        }
    }

    @C40974d0
    /* renamed from: Z */
    public final HttpURLConnection mo135395Z(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            mo135742P();
            httpURLConnection.setConnectTimeout(C41634v3.f105101F.mo135909b().intValue());
            mo135742P();
            httpURLConnection.setReadTimeout(C41634v3.f105102G.mo135909b().intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.f104610c);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0322 A[EDGE_INSN: B:157:0x0322->B:153:0x0322 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01be A[SYNTHETIC, Splitter:B:77:0x01be] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d8 A[SYNTHETIC, Splitter:B:87:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ff  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Long> mo135396a0(java.util.List<com.google.android.gms.internal.gtm.C41706y3> r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "Error closing http compressed post connection output stream"
            com.google.android.gms.analytics.C40372a0.m164215h()
            r19.mo135794T()
            com.google.android.gms.common.internal.C40843u.m166202l(r20)
            com.google.android.gms.internal.gtm.s1 r0 = r19.mo135742P()
            java.util.Set r0 = r0.mo135815a()
            boolean r0 = r0.isEmpty()
            r4 = 1
            if (r0 != 0) goto L_0x0088
            com.google.android.gms.internal.gtm.q4 r0 = r1.f104611d
            r19.mo135742P()
            com.google.android.gms.internal.gtm.u3<java.lang.Integer> r5 = com.google.android.gms.internal.gtm.C41634v3.f105099D
            java.lang.Object r5 = r5.mo135909b()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r5 = (long) r5
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            boolean r0 = r0.mo135771c(r5)
            if (r0 != 0) goto L_0x0038
            goto L_0x0088
        L_0x0038:
            r19.mo135742P()
            com.google.android.gms.internal.gtm.u3<java.lang.String> r0 = com.google.android.gms.internal.gtm.C41634v3.f105137w
            java.lang.Object r0 = r0.mo135909b()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = "BATCH_BY_SESSION"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x004d
        L_0x004b:
            r0 = r4
            goto L_0x0072
        L_0x004d:
            java.lang.String r5 = "BATCH_BY_TIME"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x0056
            goto L_0x004b
        L_0x0056:
            java.lang.String r5 = "BATCH_BY_BRUTE_FORCE"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x005f
            goto L_0x004b
        L_0x005f:
            java.lang.String r5 = "BATCH_BY_COUNT"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x0068
            goto L_0x004b
        L_0x0068:
            java.lang.String r5 = "BATCH_BY_SIZE"
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0071
            goto L_0x004b
        L_0x0071:
            r0 = 0
        L_0x0072:
            r19.mo135742P()
            com.google.android.gms.internal.gtm.u3<java.lang.String> r5 = com.google.android.gms.internal.gtm.C41634v3.f105138x
            java.lang.Object r5 = r5.mo135909b()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "GZIP"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r4 == r5) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            r5 = r4
            goto L_0x008a
        L_0x0088:
            r0 = 0
        L_0x0089:
            r5 = 0
        L_0x008a:
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L_0x0225
            boolean r0 = r20.isEmpty()
            r0 = r0 ^ r4
            com.google.android.gms.common.internal.C40843u.m166191a(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            int r8 = r20.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Uploading batched hits. compression, count"
            r1.mo135761x(r9, r0, r8)
            com.google.android.gms.internal.gtm.f4 r8 = new com.google.android.gms.internal.gtm.f4
            r8.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r20.iterator()
        L_0x00b5:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x00d4
            java.lang.Object r10 = r0.next()
            com.google.android.gms.internal.gtm.y3 r10 = (com.google.android.gms.internal.gtm.C41706y3) r10
            boolean r11 = r8.mo135358b(r10)
            if (r11 != 0) goto L_0x00c8
            goto L_0x00d4
        L_0x00c8:
            long r10 = r10.mo136092b()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.add(r10)
            goto L_0x00b5
        L_0x00d4:
            int r0 = r8.mo135357a()
            if (r0 != 0) goto L_0x00dc
            goto L_0x0224
        L_0x00dc:
            java.net.URL r0 = r19.mo135399e0()
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "Failed to build batching endpoint url"
            r1.mo135754q(r0)
            java.util.List r9 = java.util.Collections.emptyList()
            goto L_0x0224
        L_0x00ed:
            if (r5 == 0) goto L_0x01e7
            byte[] r5 = r8.mo135359c()
            com.google.android.gms.common.internal.C40843u.m166202l(r0)
            com.google.android.gms.common.internal.C40843u.m166202l(r5)
            android.content.Context r10 = r19.mo135734G()     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r10.getPackageName()     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r10.<init>()     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            java.util.zip.GZIPOutputStream r11 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r11.<init>(r10)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r11.write(r5)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r11.close()     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r10.close()     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            byte[] r10 = r10.toByteArray()     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            java.lang.String r11 = "POST compressed size, ratio %, url"
            int r12 = r10.length     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            long r14 = (long) r12     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r16 = 100
            long r14 = r14 * r16
            int r7 = r5.length     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            long r3 = (long) r7     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            long r14 = r14 / r3
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r1.mo135753p(r11, r13, r3, r0)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            if (r12 <= r7) goto L_0x0138
            java.lang.String r3 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r1.mo135731B(r3, r13, r4)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
        L_0x0138:
            boolean r3 = com.google.android.gms.internal.gtm.C41511q0.m168200D()     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            if (r3 == 0) goto L_0x015b
            java.lang.String r3 = "Post payload"
            java.lang.String r4 = "\n"
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r7.<init>(r5)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            int r5 = r7.length()     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            if (r5 == 0) goto L_0x0152
            java.lang.String r4 = r4.concat(r7)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            goto L_0x0158
        L_0x0152:
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r5.<init>(r4)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r4 = r5
        L_0x0158:
            r1.mo135760w(r3, r4)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
        L_0x015b:
            java.net.HttpURLConnection r3 = r1.mo135395Z(r0)     // Catch:{ IOException -> 0x01b3, all -> 0x01ad }
            r0 = 1
            r3.setDoOutput(r0)     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r3.addRequestProperty(r0, r4)     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            r3.setFixedLengthStreamingMode(r12)     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            r3.connect()     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            r4.write(r10)     // Catch:{ IOException -> 0x019f, all -> 0x019a }
            r4.close()     // Catch:{ IOException -> 0x019f, all -> 0x019a }
            r1.mo135402n0(r3)     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            if (r0 != r6) goto L_0x018b
            com.google.android.gms.internal.gtm.p0 r0 = r19.mo135738L()     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            r0.mo135696f0()     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            r0 = r6
        L_0x018b:
            java.lang.String r4 = "POST status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            r1.mo135751n(r4, r5)     // Catch:{ IOException -> 0x01aa, all -> 0x01a4 }
            r3.disconnect()
            r3 = r0
            goto L_0x01ef
        L_0x019a:
            r0 = move-exception
            r16 = r3
            r7 = r4
            goto L_0x01a8
        L_0x019f:
            r0 = move-exception
            r7 = r3
            r16 = r4
            goto L_0x01b7
        L_0x01a4:
            r0 = move-exception
            r16 = r3
            r7 = 0
        L_0x01a8:
            r3 = r0
            goto L_0x01d6
        L_0x01aa:
            r0 = move-exception
            r7 = r3
            goto L_0x01b5
        L_0x01ad:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r16 = 0
            goto L_0x01d6
        L_0x01b3:
            r0 = move-exception
            r7 = 0
        L_0x01b5:
            r16 = 0
        L_0x01b7:
            java.lang.String r3 = "Network compressed POST connection error"
            r1.mo135763z(r3, r0)     // Catch:{ all -> 0x01ce }
            if (r16 == 0) goto L_0x01c7
            r16.close()     // Catch:{ IOException -> 0x01c2 }
            goto L_0x01c7
        L_0x01c2:
            r0 = move-exception
            r3 = r0
            r1.mo135755r(r2, r3)
        L_0x01c7:
            if (r7 == 0) goto L_0x01cc
            r7.disconnect()
        L_0x01cc:
            r3 = 0
            goto L_0x01ef
        L_0x01ce:
            r0 = move-exception
            r3 = r0
            r18 = r16
            r16 = r7
            r7 = r18
        L_0x01d6:
            if (r7 == 0) goto L_0x01e1
            r7.close()     // Catch:{ IOException -> 0x01dc }
            goto L_0x01e1
        L_0x01dc:
            r0 = move-exception
            r4 = r0
            r1.mo135755r(r2, r4)
        L_0x01e1:
            if (r16 == 0) goto L_0x01e6
            r16.disconnect()
        L_0x01e6:
            throw r3
        L_0x01e7:
            byte[] r2 = r8.mo135359c()
            int r3 = r1.mo135398d0(r0, r2)
        L_0x01ef:
            if (r3 != r6) goto L_0x01ff
            int r0 = r8.mo135357a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "Batched upload completed. Hits batched"
            r1.mo135760w(r2, r0)
            goto L_0x0224
        L_0x01ff:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = "Network error uploading hits. status code"
            r1.mo135760w(r2, r0)
            com.google.android.gms.internal.gtm.s1 r2 = r19.mo135742P()
            java.util.Set r2 = r2.mo135815a()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0220
            java.lang.String r0 = "Server instructed the client to stop batching"
            r1.mo135762y(r0)
            com.google.android.gms.internal.gtm.q4 r0 = r1.f104611d
            r0.mo135770b()
        L_0x0220:
            java.util.List r9 = java.util.Collections.emptyList()
        L_0x0224:
            return r9
        L_0x0225:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r20.size()
            r2.<init>(r0)
            java.util.Iterator r0 = r20.iterator()
        L_0x0232:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0322
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.gtm.y3 r3 = (com.google.android.gms.internal.gtm.C41706y3) r3
            com.google.android.gms.common.internal.C40843u.m166202l(r3)
            boolean r4 = r3.mo136097h()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.String r4 = r1.mo135394X(r3, r4)
            if (r4 != 0) goto L_0x0259
            com.google.android.gms.internal.gtm.d4 r4 = r19.mo135745S()
            java.lang.String r7 = "Error formatting hit for upload"
            r4.mo135211Z(r3, r7)
        L_0x0256:
            r4 = 0
            goto L_0x030a
        L_0x0259:
            int r7 = r4.length()
            r19.mo135742P()
            com.google.android.gms.internal.gtm.u3<java.lang.Integer> r8 = com.google.android.gms.internal.gtm.C41634v3.f105136v
            java.lang.Object r8 = r8.mo135909b()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r7 > r8) goto L_0x02c7
            java.net.URL r4 = r1.mo135401g0(r3, r4)
            if (r4 != 0) goto L_0x027b
            java.lang.String r0 = "Failed to build collect GET endpoint url"
            r1.mo135754q(r0)
            goto L_0x0322
        L_0x027b:
            com.google.android.gms.common.internal.C40843u.m166202l(r4)
            java.lang.String r7 = "GET request"
            r1.mo135751n(r7, r4)
            java.net.HttpURLConnection r4 = r1.mo135395Z(r4)     // Catch:{ IOException -> 0x02b3, all -> 0x02b0 }
            r4.connect()     // Catch:{ IOException -> 0x02ad, all -> 0x02aa }
            r1.mo135402n0(r4)     // Catch:{ IOException -> 0x02ad, all -> 0x02aa }
            int r7 = r4.getResponseCode()     // Catch:{ IOException -> 0x02ad, all -> 0x02aa }
            if (r7 != r6) goto L_0x029b
            com.google.android.gms.internal.gtm.p0 r7 = r19.mo135738L()     // Catch:{ IOException -> 0x02ad, all -> 0x02aa }
            r7.mo135696f0()     // Catch:{ IOException -> 0x02ad, all -> 0x02aa }
            r7 = r6
        L_0x029b:
            java.lang.String r8 = "GET status"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x02ad, all -> 0x02aa }
            r1.mo135751n(r8, r9)     // Catch:{ IOException -> 0x02ad, all -> 0x02aa }
            r4.disconnect()
            if (r7 != r6) goto L_0x0322
            goto L_0x0256
        L_0x02aa:
            r0 = move-exception
            r7 = r4
            goto L_0x02c1
        L_0x02ad:
            r0 = move-exception
            r7 = r4
            goto L_0x02b5
        L_0x02b0:
            r0 = move-exception
            r7 = 0
            goto L_0x02c1
        L_0x02b3:
            r0 = move-exception
            r7 = 0
        L_0x02b5:
            java.lang.String r3 = "Network GET connection error"
            r1.mo135763z(r3, r0)     // Catch:{ all -> 0x02c0 }
            if (r7 == 0) goto L_0x0322
            r7.disconnect()
            goto L_0x0322
        L_0x02c0:
            r0 = move-exception
        L_0x02c1:
            if (r7 == 0) goto L_0x02c6
            r7.disconnect()
        L_0x02c6:
            throw r0
        L_0x02c7:
            r4 = 0
            java.lang.String r7 = r1.mo135394X(r3, r4)
            if (r7 != 0) goto L_0x02d8
            com.google.android.gms.internal.gtm.d4 r7 = r19.mo135745S()
            java.lang.String r8 = "Error formatting hit for POST upload"
            r7.mo135211Z(r3, r8)
            goto L_0x030a
        L_0x02d8:
            byte[] r7 = r7.getBytes()
            int r8 = r7.length
            r19.mo135742P()
            com.google.android.gms.internal.gtm.u3<java.lang.Integer> r9 = com.google.android.gms.internal.gtm.C41634v3.f105096A
            java.lang.Object r9 = r9.mo135909b()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r8 <= r9) goto L_0x02f8
            com.google.android.gms.internal.gtm.d4 r7 = r19.mo135745S()
            java.lang.String r8 = "Hit payload exceeds size limit"
            r7.mo135211Z(r3, r8)
            goto L_0x030a
        L_0x02f8:
            java.net.URL r8 = r1.mo135400f0(r3)
            if (r8 != 0) goto L_0x0304
            java.lang.String r0 = "Failed to build collect POST endpoint url"
            r1.mo135754q(r0)
            goto L_0x0322
        L_0x0304:
            int r7 = r1.mo135398d0(r8, r7)
            if (r7 != r6) goto L_0x0322
        L_0x030a:
            long r7 = r3.mo136092b()
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r2.add(r3)
            int r3 = r2.size()
            r19.mo135742P()
            int r7 = com.google.android.gms.internal.gtm.C41560s1.m168321h()
            if (r3 < r7) goto L_0x0232
        L_0x0322:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41274g4.mo135396a0(java.util.List):java.util.List");
    }

    /* renamed from: b0 */
    public final boolean mo135397b0() {
        NetworkInfo networkInfo;
        C40372a0.m164215h();
        mo135794T();
        try {
            networkInfo = ((ConnectivityManager) mo135734G().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        mo135759v("No network connectivity");
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c A[SYNTHETIC, Splitter:B:29:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[SYNTHETIC, Splitter:B:38:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo135398d0(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            com.google.android.gms.common.internal.C40843u.m166202l(r6)
            com.google.android.gms.common.internal.C40843u.m166202l(r7)
            int r1 = r7.length
            java.lang.String r2 = "POST bytes, url"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5.mo135752o(r2, r3, r6)
            boolean r2 = com.google.android.gms.internal.gtm.C41511q0.m168200D()
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            java.lang.String r3 = "Post payload\n"
            r5.mo135760w(r3, r2)
        L_0x0022:
            r2 = 0
            android.content.Context r3 = r5.mo135734G()     // Catch:{ IOException -> 0x0072, all -> 0x006e }
            r3.getPackageName()     // Catch:{ IOException -> 0x0072, all -> 0x006e }
            java.net.HttpURLConnection r6 = r5.mo135395Z(r6)     // Catch:{ IOException -> 0x0072, all -> 0x006e }
            r3 = 1
            r6.setDoOutput(r3)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r6.setFixedLengthStreamingMode(r1)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r6.connect()     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r2.write(r7)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r5.mo135402n0(r6)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            int r7 = r6.getResponseCode()     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L_0x0052
            com.google.android.gms.internal.gtm.p0 r7 = r5.mo135738L()     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r7.mo135696f0()     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r7 = r1
        L_0x0052:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r5.mo135751n(r1, r3)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r2.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r1 = move-exception
            r5.mo135755r(r0, r1)
        L_0x0063:
            r6.disconnect()
            return r7
        L_0x0067:
            r7 = move-exception
            goto L_0x008f
        L_0x0069:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L_0x0075
        L_0x006e:
            r6 = move-exception
            r7 = r6
            r6 = r2
            goto L_0x008f
        L_0x0072:
            r6 = move-exception
            r7 = r6
            r6 = r2
        L_0x0075:
            java.lang.String r1 = "Network POST connection error"
            r5.mo135763z(r1, r7)     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0084
            r6.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r6 = move-exception
            r5.mo135755r(r0, r6)
        L_0x0084:
            if (r2 == 0) goto L_0x0089
            r2.disconnect()
        L_0x0089:
            r6 = 0
            return r6
        L_0x008b:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L_0x008f:
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r1 = move-exception
            r5.mo135755r(r0, r1)
        L_0x0099:
            if (r6 == 0) goto L_0x009e
            r6.disconnect()
        L_0x009e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41274g4.mo135398d0(java.net.URL, byte[]):int");
    }

    /* renamed from: e0 */
    public final URL mo135399e0() {
        String str;
        mo135742P();
        String i = C41560s1.m168322i();
        mo135742P();
        String b = C41634v3.f105135u.mo135909b();
        if (b.length() != 0) {
            str = i.concat(b);
        } else {
            str = new String(i);
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            mo135755r("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: f0 */
    public final URL mo135400f0(C41706y3 y3Var) {
        String str;
        String str2;
        if (y3Var.mo136097h()) {
            mo135742P();
            String i = C41560s1.m168322i();
            mo135742P();
            String j = C41560s1.m168323j();
            if (j.length() != 0) {
                str = i.concat(j);
                return new URL(str);
            }
            str2 = new String(i);
        } else {
            mo135742P();
            String k = C41560s1.m168324k();
            mo135742P();
            String j2 = C41560s1.m168323j();
            if (j2.length() != 0) {
                str = k.concat(j2);
                return new URL(str);
            }
            str2 = new String(k);
        }
        str = str2;
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            mo135755r("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* renamed from: g0 */
    public final URL mo135401g0(C41706y3 y3Var, String str) {
        String str2;
        if (y3Var.mo136097h()) {
            mo135742P();
            String i = C41560s1.m168322i();
            mo135742P();
            String j = C41560s1.m168323j();
            int length = i.length();
            StringBuilder sb = new StringBuilder(length + 1 + j.length() + str.length());
            sb.append(i);
            sb.append(j);
            sb.append("?");
            sb.append(str);
            str2 = sb.toString();
        } else {
            mo135742P();
            String k = C41560s1.m168324k();
            mo135742P();
            String j2 = C41560s1.m168323j();
            int length2 = k.length();
            StringBuilder sb2 = new StringBuilder(length2 + 1 + j2.length() + str.length());
            sb2.append(k);
            sb2.append(j2);
            sb2.append("?");
            sb2.append(str);
            str2 = sb2.toString();
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            mo135755r("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x001f A[SYNTHETIC, Splitter:B:18:0x001f] */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135402n0(java.net.HttpURLConnection r4) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ all -> 0x001b }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0019 }
        L_0x000a:
            int r2 = r4.read(r1)     // Catch:{ all -> 0x0019 }
            if (r2 > 0) goto L_0x000a
            r4.close()     // Catch:{ IOException -> 0x0014 }
            return
        L_0x0014:
            r4 = move-exception
            r3.mo135755r(r0, r4)
            return
        L_0x0019:
            r1 = move-exception
            goto L_0x001d
        L_0x001b:
            r1 = move-exception
            r4 = 0
        L_0x001d:
            if (r4 == 0) goto L_0x0027
            r4.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r4 = move-exception
            r3.mo135755r(r0, r4)
        L_0x0027:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41274g4.mo135402n0(java.net.HttpURLConnection):void");
    }
}
