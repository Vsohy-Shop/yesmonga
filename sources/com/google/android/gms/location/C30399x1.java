package com.google.android.gms.location;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40520b0;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.x1 */
public final class C30399x1 implements C40538e.C40540b<Status> {

    /* renamed from: a */
    public final C31049l<Void> f72863a;

    public C30399x1(C31049l<Void> lVar) {
        C40843u.m166202l(lVar);
        this.f72863a = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85669a(Object obj) {
        C40520b0.m164937b((Status) obj, null, this.f72863a);
    }

    /* renamed from: b */
    public final void mo85730b(@C0363p0 Status status) {
        if (status != null) {
            this.f72863a.mo87742b(new ApiException(status));
        }
    }
}
