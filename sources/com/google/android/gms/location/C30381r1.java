package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.C40635v;
import com.google.android.gms.internal.location.C41785m;
import com.google.android.gms.internal.location.C41811z;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.r1 */
public final /* synthetic */ class C30381r1 implements C40635v {

    /* renamed from: a */
    public final C30319c f72847a;

    /* renamed from: b */
    public final PendingIntent f72848b;

    /* renamed from: c */
    public final SleepSegmentRequest f72849c;

    public C30381r1(C30319c cVar, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.f72847a = cVar;
        this.f72848b = pendingIntent;
        this.f72849c = sleepSegmentRequest;
    }

    /* renamed from: a */
    public final void mo85637a(Object obj, Object obj2) {
        C30319c cVar = this.f72847a;
        ((C41785m) ((C41811z) obj).mo134340M()).mo136212w8(this.f72848b, this.f72849c, new C30396w1(cVar, (C31049l) obj2));
    }
}
