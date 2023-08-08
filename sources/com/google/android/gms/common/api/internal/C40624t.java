package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40477a.C40479b;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.tasks.C31049l;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.t */
public abstract class C40624t<A extends C40477a.C40479b, L> {

    /* renamed from: a */
    public final C40592n f103563a;
    @C0363p0

    /* renamed from: b */
    public final Feature[] f103564b;

    /* renamed from: c */
    public final boolean f103565c;

    /* renamed from: d */
    public final int f103566d;

    @C40473a
    public C40624t(@C0359n0 C40592n<L> nVar, @C0363p0 Feature[] featureArr, boolean z, int i) {
        this.f103563a = nVar;
        this.f103564b = featureArr;
        this.f103565c = z;
        this.f103566d = i;
    }

    @C40473a
    /* renamed from: a */
    public void mo134027a() {
        this.f103563a.mo133986a();
    }

    @C0363p0
    @C40473a
    /* renamed from: b */
    public C40592n.C40593a<L> mo134028b() {
        return this.f103563a.mo133987b();
    }

    @C0363p0
    @C40473a
    /* renamed from: c */
    public Feature[] mo134029c() {
        return this.f103564b;
    }

    @C40473a
    /* renamed from: d */
    public abstract void mo134013d(@C0359n0 A a, @C0359n0 C31049l<Void> lVar) throws RemoteException;

    /* renamed from: e */
    public final int mo134030e() {
        return this.f103566d;
    }

    /* renamed from: f */
    public final boolean mo134031f() {
        return this.f103565c;
    }

    @C40473a
    public C40624t(@C0359n0 C40592n<L> nVar) {
        this(nVar, (Feature[]) null, false, 0);
    }

    @C40473a
    public C40624t(@C0359n0 C40592n<L> nVar, @C0359n0 Feature[] featureArr, boolean z) {
        this(nVar, featureArr, z, 0);
    }
}
