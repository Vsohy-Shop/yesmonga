package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40477a.C40479b;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40973d;
import com.google.android.gms.tasks.C31049l;
import com.google.errorprone.annotations.C32488a;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.a0 */
public abstract class C40513a0<A extends C40477a.C40479b, ResultT> {
    @C0363p0

    /* renamed from: a */
    public final Feature[] f103292a;

    /* renamed from: b */
    public final boolean f103293b;

    /* renamed from: c */
    public final int f103294c;

    @C40473a
    /* renamed from: com.google.android.gms.common.api.internal.a0$a */
    public static class C40514a<A extends C40477a.C40479b, ResultT> {

        /* renamed from: a */
        public C40635v f103295a;

        /* renamed from: b */
        public boolean f103296b = true;

        /* renamed from: c */
        public Feature[] f103297c;

        /* renamed from: d */
        public int f103298d = 0;

        public C40514a() {
        }

        @C40473a
        @C0359n0
        /* renamed from: a */
        public C40513a0<A, ResultT> mo133814a() {
            C40843u.m166192b(this.f103295a != null, "execute parameter required");
            return new C40523b3(this, this.f103297c, this.f103296b, this.f103298d);
        }

        @C40473a
        @C0359n0
        @C32488a
        @Deprecated
        /* renamed from: b */
        public C40514a<A, ResultT> mo133815b(@C0359n0 C40973d<A, C31049l<ResultT>> dVar) {
            this.f103295a = new C40517a3(dVar);
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: c */
        public C40514a<A, ResultT> mo133816c(@C0359n0 C40635v<A, C31049l<ResultT>> vVar) {
            this.f103295a = vVar;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: d */
        public C40514a<A, ResultT> mo133817d(boolean z) {
            this.f103296b = z;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: e */
        public C40514a<A, ResultT> mo133818e(@C0359n0 Feature... featureArr) {
            this.f103297c = featureArr;
            return this;
        }

        @C40473a
        @C0359n0
        @C32488a
        /* renamed from: f */
        public C40514a<A, ResultT> mo133819f(int i) {
            this.f103298d = i;
            return this;
        }

        public /* synthetic */ C40514a(C40529c3 c3Var) {
        }
    }

    @C40473a
    @Deprecated
    public C40513a0() {
        this.f103292a = null;
        this.f103293b = false;
        this.f103294c = 0;
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static <A extends C40477a.C40479b, ResultT> C40514a<A, ResultT> m164879a() {
        return new C40514a<>((C40529c3) null);
    }

    @C40473a
    /* renamed from: b */
    public abstract void mo133810b(@C0359n0 A a, @C0359n0 C31049l<ResultT> lVar) throws RemoteException;

    @C40473a
    /* renamed from: c */
    public boolean mo133811c() {
        return this.f103293b;
    }

    /* renamed from: d */
    public final int mo133812d() {
        return this.f103294c;
    }

    @C0363p0
    /* renamed from: e */
    public final Feature[] mo133813e() {
        return this.f103292a;
    }

    @C40473a
    public C40513a0(@C0363p0 Feature[] featureArr, boolean z, int i) {
        this.f103292a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f103293b = z2;
        this.f103294c = i;
    }
}
