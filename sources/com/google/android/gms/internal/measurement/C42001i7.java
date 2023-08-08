package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.C0323b0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.i7 */
public final class C42001i7 implements C42123p6 {
    @C0323b0("SharedPreferencesLoader.class")

    /* renamed from: c */
    public static final Map f106207c = new C1866a();

    /* renamed from: a */
    public final SharedPreferences f106208a;

    /* renamed from: b */
    public final SharedPreferences.OnSharedPreferenceChangeListener f106209b;

    @C0363p0
    /* renamed from: b */
    public static C42001i7 m170278b(Context context, String str, Runnable runnable) {
        C42001i7 i7Var;
        if (!C41964g6.m169997b()) {
            synchronized (C42001i7.class) {
                i7Var = (C42001i7) f106207c.get((Object) null);
                if (i7Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return i7Var;
        }
        throw null;
    }

    /* renamed from: c */
    public static synchronized void m170279c() {
        synchronized (C42001i7.class) {
            Map map = f106207c;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C42001i7) it.next()).f106208a;
                throw null;
            }
        }
    }

    @C0363p0
    /* renamed from: a */
    public final Object mo137032a(String str) {
        throw null;
    }
}
