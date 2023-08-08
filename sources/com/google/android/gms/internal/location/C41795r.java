package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.C30386t0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.r */
public final class C41795r extends C30386t0 {

    /* renamed from: n */
    public final C40592n<C30354k> f105915n;

    public C41795r(C40592n<C30354k> nVar) {
        this.f105915n = nVar;
    }

    /* renamed from: d */
    public final synchronized void mo136225d() {
        this.f105915n.mo133986a();
    }

    /* renamed from: j2 */
    public final void mo85754j2(LocationAvailability locationAvailability) {
        this.f105915n.mo133989d(new C41793q(this, locationAvailability));
    }

    /* renamed from: y5 */
    public final void mo85755y5(LocationResult locationResult) {
        this.f105915n.mo133989d(new C41791p(this, locationResult));
    }
}
