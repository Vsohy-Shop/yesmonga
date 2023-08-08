package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C30315b;

/* renamed from: com.google.android.gms.internal.location.u0 */
public final class C41802u0 implements C30315b {
    /* renamed from: a */
    public final C40663m<Status> mo85642a(C40507i iVar, PendingIntent pendingIntent) {
        return iVar.mo133753m(new C41798s0(this, iVar, pendingIntent));
    }

    /* renamed from: b */
    public final C40663m<Status> mo85643b(C40507i iVar, long j, PendingIntent pendingIntent) {
        return iVar.mo133753m(new C41796r0(this, iVar, j, pendingIntent));
    }
}
