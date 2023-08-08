package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40737c;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.b0 */
public class C40520b0 {
    @C40473a
    /* renamed from: a */
    public static void m164936a(@C0359n0 Status status, @C0359n0 C31049l<Void> lVar) {
        m164937b(status, (Object) null, lVar);
    }

    @C40473a
    /* renamed from: b */
    public static <ResultT> void m164937b(@C0359n0 Status status, @C0363p0 ResultT resultt, @C0359n0 C31049l<ResultT> lVar) {
        if (status.mo133655p0()) {
            lVar.mo87743c(resultt);
        } else {
            lVar.mo87742b(C40737c.m165762a(status));
        }
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: c */
    public static C31047k<Void> m164938c(@C0359n0 C31047k<Boolean> kVar) {
        return kVar.mo87729m(new C40536d3());
    }

    @C40473a
    /* renamed from: d */
    public static <ResultT> boolean m164939d(@C0359n0 Status status, @C0363p0 ResultT resultt, @C0359n0 C31049l<ResultT> lVar) {
        if (status.mo133655p0()) {
            return lVar.mo87745e(resultt);
        }
        return lVar.mo87744d(C40737c.m165762a(status));
    }
}
