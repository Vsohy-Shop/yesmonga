package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;

/* renamed from: com.google.android.gms.internal.measurement.y2 */
public final class C42272y2 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ Bundle f106550e;

    /* renamed from: f */
    public final /* synthetic */ Activity f106551f;

    /* renamed from: g */
    public final /* synthetic */ C41961g3 f106552g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42272y2(C41961g3 g3Var, Bundle bundle, Activity activity) {
        super(g3Var.f106147a, true);
        this.f106552g = g3Var;
        this.f106550e = bundle;
        this.f106551f = activity;
    }

    /* renamed from: a */
    public final void mo136500a() throws RemoteException {
        Bundle bundle;
        if (this.f106550e != null) {
            bundle = new Bundle();
            if (this.f106550e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f106550e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((C41923e1) C40843u.m166202l(this.f106552g.f106147a.f106174i)).onActivityCreated(C41019f.m166811T6(this.f106551f), bundle, this.f106459b);
    }
}
