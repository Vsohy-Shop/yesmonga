package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.C0323b0;
import androidx.annotation.C0328d;
import androidx.annotation.C0344h1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@C0328d
/* renamed from: com.google.firebase.remoteconfig.internal.o */
public class C33540o {
    @C0323b0("ConfigStorageClient.class")

    /* renamed from: c */
    public static final Map<String, C33540o> f81640c = new HashMap();

    /* renamed from: d */
    public static final String f81641d = "UTF-8";

    /* renamed from: a */
    public final Context f81642a;

    /* renamed from: b */
    public final String f81643b;

    public C33540o(Context context, String str) {
        this.f81642a = context;
        this.f81643b = str;
    }

    @C0344h1
    /* renamed from: b */
    public static synchronized void m135223b() {
        synchronized (C33540o.class) {
            f81640c.clear();
        }
    }

    /* renamed from: d */
    public static synchronized C33540o m135224d(Context context, String str) {
        C33540o oVar;
        synchronized (C33540o.class) {
            Map<String, C33540o> map = f81640c;
            if (!map.containsKey(str)) {
                map.put(str, new C33540o(context, str));
            }
            oVar = map.get(str);
        }
        return oVar;
    }

    /* renamed from: a */
    public synchronized Void mo97365a() {
        this.f81642a.deleteFile(this.f81643b);
        return null;
    }

    /* renamed from: c */
    public String mo97366c() {
        return this.f81643b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[SYNTHETIC, Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }] */
    @javax.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.C33526f mo97367e() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.f81642a     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.lang.String r2 = r6.f81643b     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            com.google.firebase.remoteconfig.internal.f r0 = com.google.firebase.remoteconfig.internal.C33526f.m135136b(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x003c }
            monitor-exit(r6)
            return r0
        L_0x0029:
            r0 = move-exception
            goto L_0x002f
        L_0x002b:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x0034:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r1 = r0
        L_0x0036:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x003f:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C33540o.mo97367e():com.google.firebase.remoteconfig.internal.f");
    }

    /* renamed from: f */
    public synchronized Void mo97368f(C33526f fVar) throws IOException {
        FileOutputStream openFileOutput = this.f81642a.openFileOutput(this.f81643b, 0);
        try {
            openFileOutput.write(fVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
