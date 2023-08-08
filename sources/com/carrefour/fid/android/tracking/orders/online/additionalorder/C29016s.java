package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28522c;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.CheckoutStepTwoTracking;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.s */
public final class C29016s implements CheckoutStepTwoTracking {

    /* renamed from: b */
    public static final int f71111b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f71112a;

    @Inject
    public C29016s(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71112a = aVar;
    }

    /* renamed from: h */
    public void mo77870h(@C12579k CheckoutStepTwoTracking.LoyaltyStatus loyaltyStatus) {
        Intrinsics.checkNotNullParameter(loyaltyStatus, "status");
        C13783a.m58668o(this.f71112a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement-fidelite"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28522c.f68762n), C11078d1.m42659a(C28526d.f68937k, loyaltyStatus.mo84433q()), C11078d1.m42659a("panier_type", "complement")), false, 2, (Object) null);
    }

    /* renamed from: m */
    public void mo77871m() {
        C13783a.m58668o(this.f71112a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement-fidelite"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28522c.f68761m), C11078d1.m42659a(C28526d.f68937k, C28522c.f68764p), C11078d1.m42659a("panier_type", "complement")), false, 2, (Object) null);
    }

    /* renamed from: s */
    public void mo77872s() {
        C13783a.m58667i(this.f71112a, "complement-commande", "paiement-fidelite", (Map) null, false, false, false, 60, (Object) null);
    }
}
