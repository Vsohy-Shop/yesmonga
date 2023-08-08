package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
public final class C41978h2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106162e;

    /* renamed from: f */
    public final /* synthetic */ Object f106163f;

    /* renamed from: g */
    public final /* synthetic */ C41979h3 f106164g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41978h2(C41979h3 h3Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(h3Var, false);
        this.f106164g = h3Var;
        this.f106162e = str;
        this.f106163f = obj;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        ((C41923e1) C40843u.m166202l(this.f106164g.f106174i)).logHealthData(5, this.f106162e, C41019f.m166811T6(this.f106163f), C41019f.m166811T6(null), C41019f.m166811T6(null));
    }
}
