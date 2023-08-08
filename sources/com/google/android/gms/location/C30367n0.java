package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40520b0;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.n0 */
public final class C30367n0 implements C40538e.C40540b<Status> {

    /* renamed from: a */
    public final C31049l<Void> f72834a;

    public C30367n0(C31049l<Void> lVar) {
        this.f72834a = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85669a(Object obj) {
        C40520b0.m164937b((Status) obj, null, this.f72834a);
    }

    /* renamed from: b */
    public final void mo85730b(Status status) {
        this.f72834a.mo87742b(new ApiException(status));
    }
}
