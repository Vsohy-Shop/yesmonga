package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40737c;
import com.google.android.gms.internal.location.C41770h;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.f0 */
public final class C30335f0 extends C41770h {

    /* renamed from: n */
    public final /* synthetic */ C31049l f72793n;

    public C30335f0(C30327e eVar, C31049l lVar) {
        this.f72793n = lVar;
    }

    /* renamed from: d */
    public final void mo85698d() {
    }

    /* renamed from: m8 */
    public final void mo85699m8(zzaa zzaa) throws RemoteException {
        Status status = zzaa.getStatus();
        if (status == null) {
            this.f72793n.mo87744d(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.mo133648W() == 0) {
            this.f72793n.mo87743c(Boolean.TRUE);
        } else {
            this.f72793n.mo87744d(C40737c.m165762a(status));
        }
    }
}
