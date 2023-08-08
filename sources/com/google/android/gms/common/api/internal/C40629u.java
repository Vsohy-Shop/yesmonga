package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40477a.C40479b;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.tasks.C31049l;
import com.google.errorprone.annotations.C32488a;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.u */
public class C40629u<A extends C40477a.C40479b, L> {
    @C40473a
    @C0359n0

    /* renamed from: a */
    public final C40624t<A, L> f103572a;
    @C0359n0

    /* renamed from: b */
    public final C40526c0 f103573b;
    @C0359n0

    /* renamed from: c */
    public final Runnable f103574c;

    @C40473a
    /* renamed from: com.google.android.gms.common.api.internal.u$a */
    public static class C40630a<A extends C40477a.C40479b, L> {

        /* renamed from: a */
        public C40635v f103575a;

        /* renamed from: b */
        public C40635v f103576b;

        /* renamed from: c */
        public Runnable f103577c = C40607p2.f103538a;

        /* renamed from: d */
        public C40592n f103578d;

        /* renamed from: e */
        public Feature[] f103579e;

        /* renamed from: f */
        public boolean f103580f = true;

        /* renamed from: g */
        public int f103581g;

        public C40630a() {
        }

        @C40473a
        @C0359n0
        /* renamed from: a */
        public C40629u<A, L> mo134033a() {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.f103575a != null) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166192b(z, "Must set register function");
            if (this.f103576b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C40843u.m166192b(z2, "Must set unregister function");
            if (this.f103578d == null) {
                z3 = false;
            }
            C40843u.m166192b(z3, "Must set holder");
            return new C40629u<>(new C40612q2(this, this.f103578d, this.f103579e, this.f103580f, this.f103581g), new C40617r2(this, (C40592n.C40593a) C40843u.m166203m(this.f103578d.mo133987b(), "Key must not be null")), this.f103577c, (C40627t2) null);
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: b */
        public C40630a<A, L> mo134034b(@C0359n0 Runnable runnable) {
            this.f103577c = runnable;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: c */
        public C40630a<A, L> mo134035c(@C0359n0 C40635v<A, C31049l<Void>> vVar) {
            this.f103575a = vVar;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: d */
        public C40630a<A, L> mo134036d(boolean z) {
            this.f103580f = z;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: e */
        public C40630a<A, L> mo134037e(@C0359n0 Feature... featureArr) {
            this.f103579e = featureArr;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: f */
        public C40630a<A, L> mo134038f(int i) {
            this.f103581g = i;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: g */
        public C40630a<A, L> mo134039g(@C0359n0 C40635v<A, C31049l<Boolean>> vVar) {
            this.f103576b = vVar;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: h */
        public C40630a<A, L> mo134040h(@C0359n0 C40592n<L> nVar) {
            this.f103578d = nVar;
            return this;
        }

        public /* synthetic */ C40630a(C40622s2 s2Var) {
        }
    }

    public /* synthetic */ C40629u(C40624t tVar, C40526c0 c0Var, Runnable runnable, C40627t2 t2Var) {
        this.f103572a = tVar;
        this.f103573b = c0Var;
        this.f103574c = runnable;
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static <A extends C40477a.C40479b, L> C40630a<A, L> m165390a() {
        return new C40630a<>((C40622s2) null);
    }
}
