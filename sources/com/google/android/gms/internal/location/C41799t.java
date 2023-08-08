package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.location.C30358l;

/* renamed from: com.google.android.gms.internal.location.t */
public final class C41799t implements C40592n.C40594b<C30358l> {

    /* renamed from: a */
    public final /* synthetic */ Location f105919a;

    public C41799t(C41801u uVar, Location location) {
        this.f105919a = location;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo133900a(Object obj) {
        ((C30358l) obj).onLocationChanged(this.f105919a);
    }

    /* renamed from: b */
    public final void mo133901b() {
    }
}
