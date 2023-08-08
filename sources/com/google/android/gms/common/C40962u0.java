package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.C0359n0;
import com.google.errorprone.annotations.C32489b;
import javax.annotation.Nullable;

@C32489b
/* renamed from: com.google.android.gms.common.u0 */
public class C40962u0 {

    /* renamed from: e */
    public static final C40962u0 f104204e = new C40962u0(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a */
    public final boolean f104205a;
    @Nullable

    /* renamed from: b */
    public final String f104206b;
    @Nullable

    /* renamed from: c */
    public final Throwable f104207c;

    /* renamed from: d */
    public final int f104208d;

    public C40962u0(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.f104205a = z;
        this.f104208d = i;
        this.f104206b = str;
        this.f104207c = th;
    }

    @Deprecated
    /* renamed from: b */
    public static C40962u0 m166565b() {
        return f104204e;
    }

    /* renamed from: c */
    public static C40962u0 m166566c(@C0359n0 String str) {
        return new C40962u0(false, 1, 5, str, (Throwable) null);
    }

    /* renamed from: d */
    public static C40962u0 m166567d(@C0359n0 String str, @C0359n0 Throwable th) {
        return new C40962u0(false, 1, 5, str, th);
    }

    /* renamed from: f */
    public static C40962u0 m166568f(int i) {
        return new C40962u0(true, i, 1, (String) null, (Throwable) null);
    }

    /* renamed from: g */
    public static C40962u0 m166569g(int i, int i2, @C0359n0 String str, @Nullable Throwable th) {
        return new C40962u0(false, i, i2, str, th);
    }

    @Nullable
    /* renamed from: a */
    public String mo134616a() {
        return this.f104206b;
    }

    /* renamed from: e */
    public final void mo134763e() {
        if (!this.f104205a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f104207c != null) {
                mo134616a();
            } else {
                mo134616a();
            }
        }
    }

    public /* synthetic */ C40962u0(boolean z, int i, int i2, String str, Throwable th, C40960t0 t0Var) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }
}
