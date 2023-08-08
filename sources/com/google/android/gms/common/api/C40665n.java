package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.internal.C40614r;
import com.google.android.gms.common.api.internal.C40655z;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.common.api.n */
public final class C40665n {
    @C0359n0
    /* renamed from: a */
    public static C40663m<Status> m165517a() {
        C40655z zVar = new C40655z(Looper.getMainLooper());
        zVar.mo133687f();
        return zVar;
    }

    @C0359n0
    /* renamed from: b */
    public static <R extends C40669r> C40663m<R> m165518b(@C0359n0 R r) {
        boolean z;
        C40843u.m166203m(r, "Result must not be null");
        if (r.getStatus().mo133648W() == 16) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "Status code must be CommonStatusCodes.CANCELED");
        C40494b0 b0Var = new C40494b0(r);
        b0Var.mo133687f();
        return b0Var;
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public static <R extends C40669r> C40663m<R> m165519c(@C0359n0 R r, @C0359n0 C40507i iVar) {
        C40843u.m166203m(r, "Result must not be null");
        C40843u.m166192b(!r.getStatus().mo133655p0(), "Status code must not be SUCCESS");
        C40496c0 c0Var = new C40496c0(iVar, r);
        c0Var.mo133793o(r);
        return c0Var;
    }

    @C0359n0
    /* renamed from: d */
    public static <R extends C40669r> C40662l<R> m165520d(@C0359n0 R r) {
        C40843u.m166203m(r, "Result must not be null");
        C40498d0 d0Var = new C40498d0((C40507i) null);
        d0Var.mo133793o(r);
        return new C40614r(d0Var);
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public static <R extends C40669r> C40662l<R> m165521e(@C0359n0 R r, @C0359n0 C40507i iVar) {
        C40843u.m166203m(r, "Result must not be null");
        C40498d0 d0Var = new C40498d0(iVar);
        d0Var.mo133793o(r);
        return new C40614r(d0Var);
    }

    @C0359n0
    /* renamed from: f */
    public static C40663m<Status> m165522f(@C0359n0 Status status) {
        C40843u.m166203m(status, "Result must not be null");
        C40655z zVar = new C40655z(Looper.getMainLooper());
        zVar.mo133793o(status);
        return zVar;
    }

    @C40473a
    @C0359n0
    /* renamed from: g */
    public static C40663m<Status> m165523g(@C0359n0 Status status, @C0359n0 C40507i iVar) {
        C40843u.m166203m(status, "Result must not be null");
        C40655z zVar = new C40655z(iVar);
        zVar.mo133793o(status);
        return zVar;
    }
}
