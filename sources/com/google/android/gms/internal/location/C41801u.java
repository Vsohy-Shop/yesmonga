package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.location.C30358l;
import com.google.android.gms.location.C30398x0;

/* renamed from: com.google.android.gms.internal.location.u */
public final class C41801u extends C30398x0 {

    /* renamed from: n */
    public final C40592n<C30358l> f105920n;

    public C41801u(C40592n<C30358l> nVar) {
        this.f105920n = nVar;
    }

    /* renamed from: T */
    public final synchronized void mo85757T(Location location) {
        this.f105920n.mo133989d(new C41799t(this, location));
    }

    /* renamed from: d */
    public final synchronized void mo136226d() {
        this.f105920n.mo133986a();
    }
}
