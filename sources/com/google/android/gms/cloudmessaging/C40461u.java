package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* renamed from: com.google.android.gms.cloudmessaging.u */
public final class C40461u extends C40460t<Bundle> {
    public C40461u(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* renamed from: a */
    public final void mo133574a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo133577d(bundle2);
    }

    /* renamed from: b */
    public final boolean mo133575b() {
        return false;
    }
}
