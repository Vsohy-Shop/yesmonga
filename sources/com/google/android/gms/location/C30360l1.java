package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.l1 */
public final class C30360l1 implements C40538e.C40540b<LocationSettingsResult> {

    /* renamed from: a */
    public final C31049l<C30366n> f72823a;

    public C30360l1(C31049l<C30366n> lVar) {
        this.f72823a = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85669a(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.getStatus();
        if (status.mo133655p0()) {
            this.f72823a.mo87743c(new C30366n(locationSettingsResult));
        } else if (status.mo133650e0()) {
            this.f72823a.mo87742b(new ResolvableApiException(status));
        } else {
            this.f72823a.mo87742b(new ApiException(status));
        }
    }

    /* renamed from: b */
    public final void mo85730b(Status status) {
        this.f72823a.mo87742b(new ApiException(status));
    }
}
