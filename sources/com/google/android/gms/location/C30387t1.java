package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.C40635v;
import com.google.android.gms.internal.location.C41811z;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.t1 */
public final /* synthetic */ class C30387t1 implements C40635v {

    /* renamed from: a */
    public final ActivityTransitionRequest f72852a;

    /* renamed from: b */
    public final PendingIntent f72853b;

    public C30387t1(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.f72852a = activityTransitionRequest;
        this.f72853b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo85637a(Object obj, Object obj2) {
        ((C41811z) obj).mo136256I0(this.f72852a, this.f72853b, new C30399x1((C31049l) obj2));
    }
}
