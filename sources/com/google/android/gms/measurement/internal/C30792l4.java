package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.internal.measurement.C42063lf;
import com.google.android.gms.internal.measurement.C42168s0;
import com.google.firebase.messaging.C33180f;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
public final class C30792l4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C42168s0 f73720a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnection f73721b;

    /* renamed from: c */
    public final /* synthetic */ C30804m4 f73722c;

    public C30792l4(C30804m4 m4Var, C42168s0 s0Var, ServiceConnection serviceConnection) {
        this.f73722c = m4Var;
        this.f73720a = s0Var;
        this.f73721b = serviceConnection;
    }

    public final void run() {
        Bundle bundle;
        C30804m4 m4Var = this.f73722c;
        C30816n4 n4Var = m4Var.f73743d;
        String a = m4Var.f73742c;
        C42168s0 s0Var = this.f73720a;
        ServiceConnection serviceConnection = this.f73721b;
        n4Var.f73765a.mo86904f().mo86866h();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", a);
        try {
            bundle = s0Var.mo137229F6(bundle2);
            if (bundle == null) {
                n4Var.f73765a.mo86903d().mo87489r().mo87463a("Install Referrer Service returned a null response");
                bundle = null;
            }
        } catch (Exception e) {
            n4Var.f73765a.mo86903d().mo87489r().mo87464b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        n4Var.f73765a.mo86904f().mo86866h();
        C30731g5.m123742t();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                n4Var.f73765a.mo86903d().mo87494w().mo87463a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    n4Var.f73765a.mo86903d().mo87489r().mo87463a("No referrer defined in Install Referrer response");
                } else {
                    n4Var.f73765a.mo86903d().mo87493v().mo87464b("InstallReferrer API result", string);
                    C30906ua N = n4Var.f73765a.mo87110N();
                    Uri parse = Uri.parse("?".concat(string));
                    C42063lf.m170504b();
                    Bundle v0 = N.mo87544v0(parse, n4Var.f73765a.mo87130z().mo87070B((String) null, C30742h3.f73570y0));
                    if (v0 == null) {
                        n4Var.f73765a.mo86903d().mo87489r().mo87463a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = v0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                n4Var.f73765a.mo86903d().mo87489r().mo87463a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                v0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == n4Var.f73765a.mo87103F().f73650f.mo87096a()) {
                            n4Var.f73765a.mo86903d().mo87493v().mo87463a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (n4Var.f73765a.mo87123o()) {
                            n4Var.f73765a.mo87103F().f73650f.mo87097b(j);
                            n4Var.f73765a.mo86903d().mo87493v().mo87464b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            v0.putString("_cis", "referrer API v2");
                            n4Var.f73765a.mo87105I().mo87333t("auto", C33180f.C33186f.f80639l, v0, a);
                        }
                    }
                }
            }
        }
        C40954b.m166547b().mo134752c(n4Var.f73765a.mo86902c(), serviceConnection);
    }
}
