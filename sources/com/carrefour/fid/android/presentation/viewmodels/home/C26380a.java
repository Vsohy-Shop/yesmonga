package com.carrefour.fid.android.presentation.viewmodels.home;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.a */
public final class C26380a {

    /* renamed from: b */
    public static final int f64515b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f64516a;

    @Inject
    public C26380a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f64516a = aVar;
    }

    /* renamed from: a */
    public final void mo76841a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "from");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.C32532b.f78977z);
        C13783a.m58668o(this.f64516a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", C26381b.m112721c(str)), C11078d1.m42659a(C28526d.f68906d, C26381b.m112722d(str)), C11078d1.m42659a(C28526d.f68933j, str2), C11078d1.m42659a(C28526d.f68929i, C28526d.f68814G2)), false, 2, (Object) null);
    }
}
