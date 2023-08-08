package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.internal.C40513a0;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.common.api.internal.b3 */
public final class C40523b3 extends C40513a0 {

    /* renamed from: d */
    public final /* synthetic */ C40513a0.C40514a f103323d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40523b3(C40513a0.C40514a aVar, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f103323d = aVar;
    }

    /* renamed from: b */
    public final void mo133810b(C40477a.C40479b bVar, C31049l lVar) throws RemoteException {
        this.f103323d.f103295a.mo85637a(bVar, lVar);
    }
}
