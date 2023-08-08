package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.common.internal.d1 */
public final class C40745d1 extends RemoteCreator {

    /* renamed from: c */
    public static final C40745d1 f103802c = new C40745d1();

    public C40745d1() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: c */
    public static View m165785c(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        C40745d1 d1Var = f103802c;
        try {
            zax zax = new zax(1, i, i2, (Scope[]) null);
            return (View) C41019f.m166810O0(((C40841t0) d1Var.mo134795b(context)).mo134505E8(C41019f.m166811T6(context), zax));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo134329a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof C40841t0) {
            return (C40841t0) queryLocalInterface;
        }
        return new C40841t0(iBinder);
    }
}
