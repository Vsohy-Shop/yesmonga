package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.analytics.b */
public final class C24980b implements C24979a {

    /* renamed from: b */
    public static final int f61786b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f61787a;

    @Inject
    public C24980b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f61787a = aVar;
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f61787a, "checkout", "basket", C10975r0.m41401k(C11078d1.m42659a("panier_type", "complement")), false, false, false, 56, (Object) null);
    }
}
