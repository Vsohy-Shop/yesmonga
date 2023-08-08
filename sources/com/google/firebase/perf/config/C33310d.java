package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.firebase.C33033f;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.util.C33436e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@C0344h1(otherwise = 3)
/* renamed from: com.google.firebase.perf.config.d */
public class C33310d {

    /* renamed from: c */
    public static final C33363a f80972c = C33363a.m134449e();

    /* renamed from: d */
    public static final String f80973d = "FirebasePerfSharedPrefs";

    /* renamed from: e */
    public static C33310d f80974e;

    /* renamed from: a */
    public volatile SharedPreferences f80975a;

    /* renamed from: b */
    public final ExecutorService f80976b;

    @C0344h1
    public C33310d(ExecutorService executorService) {
        this.f80976b = executorService;
    }

    @C0344h1
    /* renamed from: c */
    public static void m134379c() {
        f80974e = null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: h */
    public static synchronized C33310d m134380h() {
        C33310d dVar;
        synchronized (C33310d.class) {
            if (f80974e == null) {
                f80974e = new C33310d(Executors.newSingleThreadExecutor());
            }
            dVar = f80974e;
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m134381k(Context context) {
        if (this.f80975a == null && context != null) {
            this.f80975a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    /* renamed from: b */
    public void mo96386b(String str) {
        if (str == null) {
            f80972c.mo96429a("Key is null. Cannot clear nullable key");
        } else {
            this.f80975a.edit().remove(str).apply();
        }
    }

    /* renamed from: d */
    public boolean mo96387d(String str) {
        return (this.f80975a == null || str == null || !this.f80975a.contains(str)) ? false : true;
    }

    /* renamed from: e */
    public C33436e<Boolean> mo96388e(String str) {
        if (str == null) {
            f80972c.mo96429a("Key is null when getting boolean value on device cache.");
            return C33436e.m134825a();
        }
        if (this.f80975a == null) {
            mo96393l(mo96389f());
            if (this.f80975a == null) {
                return C33436e.m134825a();
            }
        }
        if (!this.f80975a.contains(str)) {
            return C33436e.m134825a();
        }
        try {
            return C33436e.m134827e(Boolean.valueOf(this.f80975a.getBoolean(str, false)));
        } catch (ClassCastException e) {
            f80972c.mo96430b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return C33436e.m134825a();
        }
    }

    @C0363p0
    /* renamed from: f */
    public final Context mo96389f() {
        try {
            C33033f.m133333p();
            return C33033f.m133333p().mo95721n();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public C33436e<Float> mo96390g(String str) {
        if (str == null) {
            f80972c.mo96429a("Key is null when getting float value on device cache.");
            return C33436e.m134825a();
        }
        if (this.f80975a == null) {
            mo96393l(mo96389f());
            if (this.f80975a == null) {
                return C33436e.m134825a();
            }
        }
        if (!this.f80975a.contains(str)) {
            return C33436e.m134825a();
        }
        try {
            return C33436e.m134827e(Float.valueOf(this.f80975a.getFloat(str, 0.0f)));
        } catch (ClassCastException e) {
            f80972c.mo96430b("Key %s from sharedPreferences has type other than float: %s", str, e.getMessage());
            return C33436e.m134825a();
        }
    }

    /* renamed from: i */
    public C33436e<Long> mo96391i(String str) {
        if (str == null) {
            f80972c.mo96429a("Key is null when getting long value on device cache.");
            return C33436e.m134825a();
        }
        if (this.f80975a == null) {
            mo96393l(mo96389f());
            if (this.f80975a == null) {
                return C33436e.m134825a();
            }
        }
        if (!this.f80975a.contains(str)) {
            return C33436e.m134825a();
        }
        try {
            return C33436e.m134827e(Long.valueOf(this.f80975a.getLong(str, 0)));
        } catch (ClassCastException e) {
            f80972c.mo96430b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return C33436e.m134825a();
        }
    }

    /* renamed from: j */
    public C33436e<String> mo96392j(String str) {
        if (str == null) {
            f80972c.mo96429a("Key is null when getting String value on device cache.");
            return C33436e.m134825a();
        }
        if (this.f80975a == null) {
            mo96393l(mo96389f());
            if (this.f80975a == null) {
                return C33436e.m134825a();
            }
        }
        if (!this.f80975a.contains(str)) {
            return C33436e.m134825a();
        }
        try {
            return C33436e.m134827e(this.f80975a.getString(str, ""));
        } catch (ClassCastException e) {
            f80972c.mo96430b("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            return C33436e.m134825a();
        }
    }

    /* renamed from: l */
    public synchronized void mo96393l(Context context) {
        if (this.f80975a == null && context != null) {
            this.f80976b.execute(new C33309c(this, context));
        }
    }

    /* renamed from: m */
    public boolean mo96394m(String str, float f) {
        if (str == null) {
            f80972c.mo96429a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.f80975a == null) {
            mo96393l(mo96389f());
            if (this.f80975a == null) {
                return false;
            }
        }
        this.f80975a.edit().putFloat(str, f).apply();
        return true;
    }

    /* renamed from: n */
    public boolean mo96395n(String str, long j) {
        if (str == null) {
            f80972c.mo96429a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f80975a == null) {
            mo96393l(mo96389f());
            if (this.f80975a == null) {
                return false;
            }
        }
        this.f80975a.edit().putLong(str, j).apply();
        return true;
    }

    /* renamed from: o */
    public boolean mo96396o(String str, String str2) {
        if (str == null) {
            f80972c.mo96429a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f80975a == null) {
            mo96393l(mo96389f());
            if (this.f80975a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f80975a.edit().remove(str).apply();
            return true;
        }
        this.f80975a.edit().putString(str, str2).apply();
        return true;
    }

    /* renamed from: p */
    public boolean mo96397p(String str, boolean z) {
        if (str == null) {
            f80972c.mo96429a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f80975a == null) {
            mo96393l(mo96389f());
            if (this.f80975a == null) {
                return false;
            }
        }
        this.f80975a.edit().putBoolean(str, z).apply();
        return true;
    }
}
