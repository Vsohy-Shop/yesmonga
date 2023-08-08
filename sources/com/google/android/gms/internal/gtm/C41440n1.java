package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.gtm.n1 */
public final class C41440n1 extends C41535r0 {

    /* renamed from: c */
    public volatile String f104808c;

    /* renamed from: d */
    public Future<String> f104809d;

    public C41440n1(C41607u0 u0Var) {
        super(u0Var);
    }

    /* renamed from: W */
    public final void mo133294W() {
    }

    /* renamed from: Z */
    public final String mo135656Z() {
        String str;
        mo135794T();
        synchronized (this) {
            if (this.f104808c == null) {
                this.f104809d = mo135736J().mo133261g(new C41392l1(this));
            }
            Future<String> future = this.f104809d;
            if (future != null) {
                try {
                    this.f104808c = future.get();
                } catch (InterruptedException e) {
                    mo135763z("ClientId loading or generation was interrupted", e);
                    this.f104808c = "0";
                } catch (ExecutionException e2) {
                    mo135755r("Failed to load or generate client id", e2);
                    this.f104808c = "0";
                }
                if (this.f104808c == null) {
                    this.f104808c = "0";
                }
                mo135760w("Loaded clientId", this.f104808c);
                this.f104809d = null;
            }
            str = this.f104808c;
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[SYNTHETIC, Splitter:B:32:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076 A[SYNTHETIC, Splitter:B:37:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082 A[SYNTHETIC, Splitter:B:46:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091 A[RETURN] */
    @com.google.android.gms.common.util.C40974d0
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo135657a0() {
        /*
            r9 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            com.google.android.gms.analytics.a0 r2 = r9.mo135736J()
            android.content.Context r2 = r2.mo133258a()
            java.lang.String r3 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.C40843u.m166201k(r3)
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x0062, all -> 0x0060 }
            r5 = 36
            byte[] r6 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r7 = 0
            int r5 = r4.read(r6, r7, r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            int r8 = r4.available()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            if (r8 <= 0) goto L_0x0034
            java.lang.String r5 = "clientId file seems corrupted, deleting it."
            r9.mo135762y(r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r2.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r4.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008a
        L_0x0034:
            r8 = 14
            if (r5 >= r8) goto L_0x0047
            java.lang.String r5 = "clientId file is empty, deleting it."
            r9.mo135762y(r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r2.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r4.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008a
        L_0x0047:
            r4.close()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            java.lang.String r8 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r8.<init>(r6, r7, r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            java.lang.String r5 = "Read client id from disk"
            r9.mo135760w(r5, r8)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x005e }
            r4.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r0 = move-exception
            r9.mo135755r(r1, r0)
        L_0x005c:
            r3 = r8
            goto L_0x008a
        L_0x005e:
            r5 = move-exception
            goto L_0x0064
        L_0x0060:
            r0 = move-exception
            goto L_0x0074
        L_0x0062:
            r5 = move-exception
            r4 = r3
        L_0x0064:
            java.lang.String r6 = "Error reading client id file, deleting it"
            r9.mo135755r(r6, r5)     // Catch:{ all -> 0x0072 }
            r2.deleteFile(r0)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x008a
            r4.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008a
        L_0x0072:
            r0 = move-exception
            r3 = r4
        L_0x0074:
            if (r3 == 0) goto L_0x007e
            r3.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r2 = move-exception
            r9.mo135755r(r1, r2)
        L_0x007e:
            throw r0
        L_0x007f:
            r4 = r3
        L_0x0080:
            if (r4 == 0) goto L_0x008a
            r4.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            r9.mo135755r(r1, r0)
        L_0x008a:
            if (r3 != 0) goto L_0x0091
            java.lang.String r0 = r9.mo135659c0()
            return r0
        L_0x0091:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41440n1.mo135657a0():java.lang.String");
    }

    /* renamed from: b0 */
    public final String mo135658b0() {
        synchronized (this) {
            this.f104808c = null;
            this.f104809d = mo135736J().mo133261g(new C41416m1(this));
        }
        return mo135656Z();
    }

    @C40974d0
    /* renamed from: c0 */
    public final String mo135659c0() {
        FileOutputStream fileOutputStream;
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context a = mo135736J().mo133258a();
            C40843u.m166198h(lowerCase);
            C40843u.m166201k("ClientId should be saved from worker thread");
            fileOutputStream = null;
            try {
                mo135760w("Storing clientId", lowerCase);
                fileOutputStream = a.openFileOutput("gaClientId", 0);
                fileOutputStream.write(lowerCase.getBytes());
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    mo135755r("Failed to close clientId writing stream", e);
                }
                return lowerCase;
                mo135755r("Failed to close clientId writing stream", e);
                return "0";
            } catch (FileNotFoundException e2) {
                mo135755r("Error creating clientId file", e2);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                return "0";
            } catch (IOException e4) {
                mo135755r("Error writing to clientId file", e4);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                    }
                }
                return "0";
            }
        } catch (Exception e6) {
            mo135755r("Error saving clientId file", e6);
            return "0";
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e7) {
                    mo135755r("Failed to close clientId writing stream", e7);
                }
            }
            throw th;
        }
    }
}
