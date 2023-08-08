package com.google.android.gms.common;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.errorprone.annotations.C32489b;
import com.google.errorprone.annotations.RestrictedInheritance;

@C40858y
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@C40473a
@C32489b
/* renamed from: com.google.android.gms.common.n */
public class C40915n {
    @C0363p0

    /* renamed from: b */
    public static C40472a0 f104085b;

    /* renamed from: a */
    public volatile C41011z f104086a;

    /* renamed from: c */
    public static C40472a0 m166357c() {
        C40472a0 a0Var;
        synchronized (C40472a0.class) {
            if (f104085b == null) {
                f104085b = new C40472a0();
            }
            a0Var = f104085b;
        }
        return a0Var;
    }

    @C40473a
    @C40858y
    @C0359n0
    /* renamed from: a */
    public C40917o mo134605a(@C0359n0 Context context, @C0359n0 String str) {
        String str2;
        boolean k = C40864j.m166237k(context);
        m166357c();
        if (C40916n0.m166365f()) {
            if (true != k) {
                str2 = "-0";
            } else {
                str2 = "-1";
            }
            String concat = String.valueOf(str).concat(str2);
            if (this.f104086a != null && this.f104086a.f104275a.equals(concat)) {
                return this.f104086a.f104276b;
            }
            m166357c();
            C40962u0 c = C40916n0.m166362c(str, k, false, false);
            if (c.f104205a) {
                this.f104086a = new C41011z(concat, C40917o.m166371d(str, c.f104208d));
                return this.f104086a.f104276b;
            }
            C40843u.m166202l(c.f104206b);
            return C40917o.m166370a(str, c.f104206b, c.f104207c);
        }
        throw new zzae();
    }

    @C40473a
    @C40858y
    @C0359n0
    /* renamed from: b */
    public C40917o mo134606b(@C0359n0 Context context, @C0359n0 String str) {
        try {
            C40917o a = mo134605a(context, str);
            a.mo134607b();
            return a;
        } catch (SecurityException unused) {
            C40917o a2 = mo134605a(context, str);
            if (a2.mo134608c()) {
            }
            return a2;
        }
    }
}
