package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.k */
public final class C29008k implements C29007j {

    /* renamed from: b */
    public static final int f71102b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f71103a;

    @Inject
    public C29008k(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71103a = aVar;
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f71103a, "complement-commande", "order-confirmation-error", (Map) null, false, false, false, 60, (Object) null);
    }
}
