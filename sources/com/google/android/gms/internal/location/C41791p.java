package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.p */
public final class C41791p implements C40592n.C40594b<C30354k> {

    /* renamed from: a */
    public final /* synthetic */ LocationResult f105912a;

    public C41791p(C41795r rVar, LocationResult locationResult) {
        this.f105912a = locationResult;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo133900a(Object obj) {
        ((C30354k) obj).onLocationResult(this.f105912a);
    }

    /* renamed from: b */
    public final void mo133901b() {
    }
}
