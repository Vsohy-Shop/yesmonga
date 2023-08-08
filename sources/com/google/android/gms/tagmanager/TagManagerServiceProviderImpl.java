package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.gtm.C41445n6;
import com.google.android.gms.internal.gtm.C41471o8;

@DynamiteApi
public class TagManagerServiceProviderImpl extends C31025y {

    /* renamed from: n */
    public static volatile C41471o8 f74274n;

    public C41445n6 getService(C41016d dVar, C31020t tVar, C31011k kVar) throws RemoteException {
        C41471o8 o8Var = f74274n;
        if (o8Var == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                o8Var = f74274n;
                if (o8Var == null) {
                    o8Var = new C41471o8((Context) C41019f.m166810O0(dVar), tVar, kVar);
                    f74274n = o8Var;
                }
            }
        }
        return o8Var;
    }
}
