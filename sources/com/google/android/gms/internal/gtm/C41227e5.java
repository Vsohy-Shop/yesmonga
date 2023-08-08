package com.google.android.gms.internal.gtm;

import com.google.android.gms.ads.identifier.C40365a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.gtm.e5 */
public final class C41227e5 implements C41275g5 {

    /* renamed from: a */
    public final /* synthetic */ C41299h5 f104564a;

    public C41227e5(C41299h5 h5Var) {
        this.f104564a = h5Var;
    }

    public final C40365a.C40366a zza() {
        try {
            return C40365a.m164196a(this.f104564a.f104647h);
        } catch (IllegalStateException e) {
            C41493p6.m168154f("IllegalStateException getting Advertising Id Info", e);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            C41493p6.m168154f("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
            return null;
        } catch (IOException e3) {
            C41493p6.m168154f("IOException getting Ad Id Info", e3);
            return null;
        } catch (GooglePlayServicesNotAvailableException e4) {
            this.f104564a.f104642c = false;
            C41493p6.m168154f("GooglePlayServicesNotAvailableException getting Advertising Id Info", e4);
            return null;
        } catch (Exception e5) {
            C41493p6.m168154f("Unknown exception. Could not get the Advertising Id Info.", e5);
            return null;
        }
    }
}
