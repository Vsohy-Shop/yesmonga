package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;

/* renamed from: com.google.android.gms.internal.measurement.s1 */
public final class C42169s1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Activity f106394e;

    /* renamed from: f */
    public final /* synthetic */ String f106395f;

    /* renamed from: g */
    public final /* synthetic */ String f106396g;

    /* renamed from: v */
    public final /* synthetic */ C41979h3 f106397v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42169s1(C41979h3 h3Var, Activity activity, String str, String str2) {
        super(h3Var, true);
        this.f106397v = h3Var;
        this.f106394e = activity;
        this.f106395f = str;
        this.f106396g = str2;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106397v.f106174i)).setCurrentScreen(C41019f.m166811T6(this.f106394e), this.f106395f, this.f106396g, this.f106458a);
    }
}
