package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.internal.C40629u;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.common.api.internal.q2 */
public final class C40612q2 extends C40624t {

    /* renamed from: e */
    public final /* synthetic */ C40629u.C40630a f103546e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40612q2(C40629u.C40630a aVar, C40592n nVar, Feature[] featureArr, boolean z, int i) {
        super(nVar, featureArr, z, i);
        this.f103546e = aVar;
    }

    /* renamed from: d */
    public final void mo134013d(C40477a.C40479b bVar, C31049l<Void> lVar) throws RemoteException {
        this.f103546e.f103575a.mo85637a(bVar, lVar);
    }
}
