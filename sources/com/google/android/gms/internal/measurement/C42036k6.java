package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import androidx.annotation.C0323b0;
import androidx.collection.C1866a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k6 */
public final class C42036k6 implements C42123p6 {
    @C0323b0("ConfigurationContentLoader.class")

    /* renamed from: h */
    public static final Map f106252h = new C1866a();

    /* renamed from: i */
    public static final String[] f106253i = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f106254a;

    /* renamed from: b */
    public final Uri f106255b;

    /* renamed from: c */
    public final Runnable f106256c;

    /* renamed from: d */
    public final ContentObserver f106257d;

    /* renamed from: e */
    public final Object f106258e = new Object();

    /* renamed from: f */
    public volatile Map f106259f;
    @C0323b0("this")

    /* renamed from: g */
    public final List f106260g = new ArrayList();

    public C42036k6(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C42018j6 j6Var = new C42018j6(this, (Handler) null);
        this.f106257d = j6Var;
        contentResolver.getClass();
        uri.getClass();
        this.f106254a = contentResolver;
        this.f106255b = uri;
        this.f106256c = runnable;
        contentResolver.registerContentObserver(uri, false, j6Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C42036k6 m170451b(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.k6> r0 = com.google.android.gms.internal.measurement.C42036k6.class
            monitor-enter(r0)
            java.util.Map r1 = f106252h     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.k6 r2 = (com.google.android.gms.internal.measurement.C42036k6) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.k6 r3 = new com.google.android.gms.internal.measurement.k6     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42036k6.m170451b(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.k6");
    }

    /* renamed from: e */
    public static synchronized void m170452e() {
        synchronized (C42036k6.class) {
            for (C42036k6 k6Var : f106252h.values()) {
                k6Var.f106254a.unregisterContentObserver(k6Var.f106257d);
            }
            f106252h.clear();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo137032a(String str) {
        return (String) mo137068c().get(str);
    }

    /* renamed from: c */
    public final Map mo137068c() {
        Map map;
        Map map2 = this.f106259f;
        if (map2 == null) {
            synchronized (this.f106258e) {
                map2 = this.f106259f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C42089n6.m170596a(new C42000i6(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    this.f106259f = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* renamed from: d */
    public final /* synthetic */ Map mo137069d() {
        Map map;
        Cursor query = this.f106254a.query(this.f106255b, f106253i, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C1866a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: f */
    public final void mo137070f() {
        synchronized (this.f106258e) {
            this.f106259f = null;
            this.f106256c.run();
        }
        synchronized (this) {
            for (C42054l6 zza : this.f106260g) {
                zza.zza();
            }
        }
    }
}
