package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.C0380x0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.internal.C40513a0;
import com.google.android.gms.tasks.C31047k;
import java.util.List;

/* renamed from: com.google.android.gms.location.i */
public class C30346i extends C40504h<C40477a.C40481d.C40485d> {

    /* renamed from: k */
    public static final /* synthetic */ int f72806k = 0;

    public C30346i(@RecentlyNonNull Activity activity) {
        super(activity, C30362m.f72826a, C40477a.C40481d.f103198G, C40504h.C40505a.f103245c);
    }

    @RecentlyNonNull
    @C0380x0("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: G */
    public C31047k<Void> mo85715G(@RecentlyNonNull GeofencingRequest geofencingRequest, @RecentlyNonNull PendingIntent pendingIntent) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30355k0(geofencingRequest.mo85559W(mo133730x()), pendingIntent)).mo133819f(2424).mo133814a());
    }

    @RecentlyNonNull
    /* renamed from: H */
    public C31047k<Void> mo85716H(@RecentlyNonNull PendingIntent pendingIntent) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30359l0(pendingIntent)).mo133819f(2425).mo133814a());
    }

    @RecentlyNonNull
    /* renamed from: I */
    public C31047k<Void> mo85717I(@RecentlyNonNull List<String> list) {
        return mo133727u(C40513a0.m164879a().mo133816c(new C30363m0(list)).mo133819f(2425).mo133814a());
    }

    public C30346i(@RecentlyNonNull Context context) {
        super(context, C30362m.f72826a, C40477a.C40481d.f103198G, C40504h.C40505a.f103245c);
    }
}
