package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.C0380x0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.internal.C40513a0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.tasks.C31047k;

/* renamed from: com.google.android.gms.location.c */
public class C30319c extends C40504h<C40477a.C40481d.C40485d> {

    /* renamed from: k */
    public static final /* synthetic */ int f72770k = 0;

    public C30319c(@RecentlyNonNull Activity activity) {
        super(activity, C30362m.f72826a, C40477a.C40481d.f103198G, C40504h.C40505a.f103245c);
    }

    @RecentlyNonNull
    @C0380x0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: G */
    public C31047k<Void> mo85647G(@RecentlyNonNull PendingIntent pendingIntent) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30390u1(pendingIntent)).mo133819f(2406).mo133814a());
    }

    @RecentlyNonNull
    @C0380x0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: H */
    public C31047k<Void> mo85648H(@RecentlyNonNull PendingIntent pendingIntent) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30384s1(pendingIntent)).mo133819f(2402).mo133814a());
    }

    @RecentlyNonNull
    /* renamed from: I */
    public C31047k<Void> mo85649I(@RecentlyNonNull PendingIntent pendingIntent) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30393v1(pendingIntent)).mo133819f(2411).mo133814a());
    }

    @RecentlyNonNull
    @C0380x0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: J */
    public C31047k<Void> mo85650J(@RecentlyNonNull ActivityTransitionRequest activityTransitionRequest, @RecentlyNonNull PendingIntent pendingIntent) {
        activityTransitionRequest.mo85542Q(mo133730x());
        return mo133727u(C40513a0.m164879a().mo133816c(new C30387t1(activityTransitionRequest, pendingIntent)).mo133819f(2405).mo133814a());
    }

    @RecentlyNonNull
    @C0380x0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: K */
    public C31047k<Void> mo85651K(long j, @RecentlyNonNull PendingIntent pendingIntent) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30378q1(j, pendingIntent)).mo133819f(2401).mo133814a());
    }

    @RecentlyNonNull
    @C0380x0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: L */
    public C31047k<Void> mo85652L(@RecentlyNonNull PendingIntent pendingIntent, @RecentlyNonNull SleepSegmentRequest sleepSegmentRequest) {
        C40843u.m166203m(pendingIntent, "PendingIntent must be specified.");
        return mo133721o(C40513a0.m164879a().mo133816c(new C30381r1(this, pendingIntent, sleepSegmentRequest)).mo133818e(C30345h2.f72801b).mo133819f(2410).mo133814a());
    }

    public C30319c(@RecentlyNonNull Context context) {
        super(context, C30362m.f72826a, C40477a.C40481d.f103198G, C40504h.C40505a.f103245c);
    }
}
