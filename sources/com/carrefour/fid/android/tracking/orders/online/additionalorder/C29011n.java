package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28522c;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.n */
public final class C29011n implements C29010m {

    /* renamed from: b */
    public static final int f71105b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f71106a;

    @Inject
    public C29011n(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71106a = aVar;
    }

    /* renamed from: T */
    public void mo77788T() {
        C13783a.m58668o(this.f71106a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28522c.f68761m), C11078d1.m42659a(C28526d.f68937k, C28522c.f68765q), C11078d1.m42659a("panier_type", "complement")), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f71106a, "complement-commande", "paiement", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: y */
    public void mo77794y() {
        C13783a.m58668o(this.f71106a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "validation-paiement")), false, 2, (Object) null);
    }
}
