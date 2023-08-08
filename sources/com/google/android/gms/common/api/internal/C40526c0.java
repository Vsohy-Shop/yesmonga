package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40477a.C40479b;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.tasks.C31049l;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.c0 */
public abstract class C40526c0<A extends C40477a.C40479b, L> {

    /* renamed from: a */
    public final C40592n.C40593a f103329a;

    @C40473a
    public C40526c0(@C0359n0 C40592n.C40593a<L> aVar) {
        this.f103329a = aVar;
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public C40592n.C40593a<L> mo133844a() {
        return this.f103329a;
    }

    @C40473a
    /* renamed from: b */
    public abstract void mo133845b(@C0359n0 A a, @C0359n0 C31049l<Boolean> lVar) throws RemoteException;
}
