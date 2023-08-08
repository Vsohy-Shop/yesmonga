package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.internal.C40513a0;
import com.google.android.gms.tasks.C31047k;

/* renamed from: com.google.android.gms.location.s */
public class C30382s extends C40504h<C40477a.C40481d.C40485d> {

    /* renamed from: k */
    public static final /* synthetic */ int f72850k = 0;

    public C30382s(@RecentlyNonNull Activity activity) {
        super(activity, C30362m.f72826a, C40477a.C40481d.f103198G, C40504h.C40505a.f103245c);
    }

    @RecentlyNonNull
    /* renamed from: G */
    public C31047k<C30366n> mo85753G(@RecentlyNonNull LocationSettingsRequest locationSettingsRequest) {
        return mo133721o(C40513a0.m164879a().mo133816c(new C30356k1(locationSettingsRequest)).mo133819f(2426).mo133814a());
    }

    public C30382s(@RecentlyNonNull Context context) {
        super(context, C30362m.f72826a, C40477a.C40481d.f103198G, C40504h.C40505a.f103245c);
    }
}
