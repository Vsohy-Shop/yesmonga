package com.google.android.gms.common.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.C40668q;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;

@C40473a
/* renamed from: com.google.android.gms.common.internal.t */
public class C40839t {

    /* renamed from: a */
    public static final C40862z0 f103946a = new C40847v0();

    @C40473a
    /* renamed from: com.google.android.gms.common.internal.t$a */
    public interface C40840a<R extends C40669r, T> {
        @C0363p0
        @C40473a
        /* renamed from: a */
        T mo134504a(@C0359n0 R r);
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static <R extends C40669r, T extends C40668q<R>> C31047k<T> m166184a(@C0359n0 C40663m<R> mVar, @C0359n0 T t) {
        return m166185b(mVar, new C40856x0(t));
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static <R extends C40669r, T> C31047k<T> m166185b(@C0359n0 C40663m<R> mVar, @C0359n0 C40840a<R, T> aVar) {
        C40862z0 z0Var = f103946a;
        C31049l lVar = new C31049l();
        mVar.mo133783c(new C40850w0(mVar, lVar, aVar, z0Var));
        return lVar.mo87741a();
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public static <R extends C40669r> C31047k<Void> m166186c(@C0359n0 C40663m<R> mVar) {
        return m166185b(mVar, new C40859y0());
    }
}
