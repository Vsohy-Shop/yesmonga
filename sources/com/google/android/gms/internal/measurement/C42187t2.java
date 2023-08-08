package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.measurement.t2 */
public final class C42187t2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Long f106417e;

    /* renamed from: f */
    public final /* synthetic */ String f106418f;

    /* renamed from: g */
    public final /* synthetic */ String f106419g;

    /* renamed from: v */
    public final /* synthetic */ Bundle f106420v;

    /* renamed from: w */
    public final /* synthetic */ boolean f106421w;

    /* renamed from: x */
    public final /* synthetic */ boolean f106422x;

    /* renamed from: y */
    public final /* synthetic */ C41979h3 f106423y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42187t2(C41979h3 h3Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(h3Var, true);
        this.f106423y = h3Var;
        this.f106417e = l;
        this.f106418f = str;
        this.f106419g = str2;
        this.f106420v = bundle;
        this.f106421w = z;
        this.f106422x = z2;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        long j;
        Long l = this.f106417e;
        if (l == null) {
            j = this.f106458a;
        } else {
            j = l.longValue();
        }
        ((C41923e1) C40843u.m166202l(this.f106423y.f106174i)).logEvent(this.f106418f, this.f106419g, this.f106420v, this.f106421w, this.f106422x, j);
    }
}
