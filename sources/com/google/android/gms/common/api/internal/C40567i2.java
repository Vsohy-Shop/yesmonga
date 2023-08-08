package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.gms.common.api.internal.i2 */
public final class C40567i2 extends C40639v3 {

    /* renamed from: f */
    public C31049l f103422f = new C31049l();

    public C40567i2(C40587m mVar) {
        super(mVar, C40713g.m165640x());
        this.f103291a.mo133930o("GmsAvailabilityHelper", this);
    }

    /* renamed from: u */
    public static C40567i2 m165132u(@C0359n0 Activity activity) {
        C40587m c = LifecycleCallback.m164865c(activity);
        C40567i2 i2Var = (C40567i2) c.mo133938x("GmsAvailabilityHelper", C40567i2.class);
        if (i2Var == null) {
            return new C40567i2(c);
        }
        if (i2Var.f103422f.mo87741a().mo87737u()) {
            i2Var.f103422f = new C31049l();
        }
        return i2Var;
    }

    /* renamed from: h */
    public final void mo133805h() {
        super.mo133805h();
        this.f103422f.mo87744d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    /* renamed from: n */
    public final void mo133960n(ConnectionResult connectionResult, int i) {
        String Q = connectionResult.mo133592Q();
        if (Q == null) {
            Q = "Error connecting to Google Play services";
        }
        this.f103422f.mo87742b(new ApiException(new Status(connectionResult, Q, connectionResult.mo133591M())));
    }

    /* renamed from: o */
    public final void mo133961o() {
        Activity l0 = this.f103291a.mo133929l0();
        if (l0 == null) {
            this.f103422f.mo87744d(new ApiException(new Status(8)));
            return;
        }
        int j = this.f103606e.mo134208j(l0);
        if (j == 0) {
            this.f103422f.mo87745e(null);
        } else if (!this.f103422f.mo87741a().mo87737u()) {
            mo134078t(new ConnectionResult(j, (PendingIntent) null), 0);
        }
    }

    /* renamed from: v */
    public final C31047k mo133964v() {
        return this.f103422f.mo87741a();
    }
}
