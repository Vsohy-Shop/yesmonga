package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.wrappers.C41007c;
import com.google.android.gms.common.wrappers.C41008d;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
public final class C30816n4 {

    /* renamed from: a */
    public final C30731g5 f73765a;

    public C30816n4(C30822na naVar) {
        this.f73765a = naVar.mo87365c0();
    }

    @C40974d0
    /* renamed from: a */
    public final boolean mo87296a() {
        try {
            C41007c a = C41008d.m166715a(this.f73765a.mo86902c());
            if (a == null) {
                this.f73765a.mo86903d().mo87493v().mo87463a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo134784f("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f73765a.mo86903d().mo87493v().mo87464b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
