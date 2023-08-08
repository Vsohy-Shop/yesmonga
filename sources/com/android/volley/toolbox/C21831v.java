package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.C0363p0;
import com.android.volley.AuthFailureError;
import com.android.volley.C21751e;
import com.android.volley.C21759i;
import com.android.volley.C21762l;
import com.android.volley.C21775r;
import com.android.volley.C21776s;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* renamed from: com.android.volley.toolbox.v */
public final class C21831v {

    /* renamed from: a */
    public static final int f56480a = 3000;

    /* renamed from: com.android.volley.toolbox.v$b */
    public static class C21833b {

        /* renamed from: a */
        public final String f56481a;

        /* renamed from: b */
        public final VolleyError f56482b;

        public C21833b(String str, VolleyError volleyError) {
            this.f56481a = str;
            this.f56482b = volleyError;
        }
    }

    /* renamed from: a */
    public static void m100291a(Request<?> request, C21833b bVar) throws VolleyError {
        C21775r A0 = request.mo64776A0();
        int H0 = request.mo64784H0();
        try {
            A0.mo64925b(bVar.f56482b);
            request.mo64801g(String.format("%s-retry [timeout=%s]", new Object[]{bVar.f56481a, Integer.valueOf(H0)}));
        } catch (VolleyError e) {
            request.mo64801g(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{bVar.f56481a, Integer.valueOf(H0)}));
            throw e;
        }
    }

    /* renamed from: b */
    public static C21762l m100292b(Request<?> request, long j, List<C21759i> list) {
        C21751e.C21752a Z = request.mo64796Z();
        if (Z == null) {
            return new C21762l(304, (byte[]) null, true, j, list);
        }
        return new C21762l(304, Z.f56260a, true, j, C21812m.m100211a(list, Z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[SYNTHETIC, Splitter:B:18:0x0033] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m100293c(java.io.InputStream r5, int r6, com.android.volley.toolbox.C21801h r7) throws java.io.IOException {
        /*
            java.lang.String r0 = "Error occurred when closing InputStream"
            com.android.volley.toolbox.y r1 = new com.android.volley.toolbox.y
            r1.<init>(r7, r6)
            r6 = 1024(0x400, float:1.435E-42)
            r2 = 0
            byte[] r6 = r7.mo65002a(r6)     // Catch:{ all -> 0x002f }
        L_0x000e:
            int r3 = r5.read(r6)     // Catch:{ all -> 0x002d }
            r4 = -1
            if (r3 == r4) goto L_0x0019
            r1.write(r6, r2, r3)     // Catch:{ all -> 0x002d }
            goto L_0x000e
        L_0x0019:
            byte[] r3 = r1.toByteArray()     // Catch:{ all -> 0x002d }
            r5.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0026
        L_0x0021:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.android.volley.C21776s.m100102f(r0, r5)
        L_0x0026:
            r7.mo65003b(r6)
            r1.close()
            return r3
        L_0x002d:
            r3 = move-exception
            goto L_0x0031
        L_0x002f:
            r3 = move-exception
            r6 = 0
        L_0x0031:
            if (r5 == 0) goto L_0x003c
            r5.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003c
        L_0x0037:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.android.volley.C21776s.m100102f(r0, r5)
        L_0x003c:
            r7.mo65003b(r6)
            r1.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C21831v.m100293c(java.io.InputStream, int, com.android.volley.toolbox.h):byte[]");
    }

    /* renamed from: d */
    public static void m100294d(long j, Request<?> request, byte[] bArr, int i) {
        Object obj;
        if (C21776s.f56329b || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "null";
            }
            objArr[2] = obj;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(request.mo64776A0().mo64924a());
            C21776s.m100098b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: e */
    public static C21833b m100295e(Request<?> request, IOException iOException, long j, @C0363p0 C21813n nVar, @C0363p0 byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new C21833b("socket", new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + request.mo64788L0(), iOException);
        } else if (nVar != null) {
            int e = nVar.mo65028e();
            C21776s.m100099c("Unexpected response code %d for %s", Integer.valueOf(e), request.mo64788L0());
            if (bArr == null) {
                return new C21833b("network", new NetworkError());
            }
            int i = e;
            byte[] bArr2 = bArr;
            C21762l lVar = new C21762l(i, bArr2, false, SystemClock.elapsedRealtime() - j, nVar.mo65027d());
            if (e == 401 || e == 403) {
                return new C21833b("auth", new AuthFailureError(lVar));
            }
            if (e >= 400 && e <= 499) {
                throw new ClientError(lVar);
            } else if (e >= 500 && e <= 599 && request.mo64789L1()) {
                return new C21833b("server", new ServerError(lVar));
            } else {
                throw new ServerError(lVar);
            }
        } else if (request.mo64786I1()) {
            return new C21833b("connection", new NoConnectionError());
        } else {
            throw new NoConnectionError(iOException);
        }
    }
}
