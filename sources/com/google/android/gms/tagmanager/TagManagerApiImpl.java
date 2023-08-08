package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.gtm.C41375k8;
import com.google.android.gms.internal.gtm.C41493p6;
import com.google.android.gms.internal.gtm.C41637v6;

@DynamiteApi
public class TagManagerApiImpl extends C31022v {

    /* renamed from: n */
    public C41375k8 f74273n;

    public void initialize(C41016d dVar, C31020t tVar, C31011k kVar) throws RemoteException {
        C41375k8 f = C41375k8.m167938f((Context) C41019f.m166810O0(dVar), tVar, kVar);
        this.f74273n = f;
        f.mo135577m((String[]) null);
    }

    @Deprecated
    public void preview(@RecentlyNonNull Intent intent, @RecentlyNonNull C41016d dVar) {
        C41493p6.m168153e("Deprecated. Please use previewIntent instead.");
    }

    public void previewIntent(Intent intent, C41016d dVar, C41016d dVar2, C31020t tVar, C31011k kVar) {
        Context context = (Context) C41019f.m166810O0(dVar);
        C41375k8 f = C41375k8.m167938f(context, tVar, kVar);
        this.f74273n = f;
        new C41637v6(intent, context, (Context) C41019f.m166810O0(dVar2), f).mo135973b();
    }
}
