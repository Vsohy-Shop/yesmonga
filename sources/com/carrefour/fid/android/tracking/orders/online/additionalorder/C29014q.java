package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28522c;
import com.carrefour.fid.android.shared.constant.C28526d;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.q */
public final class C29014q implements C29013p {

    /* renamed from: b */
    public static final int f71108b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f71109a;

    @Inject
    public C29014q(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71109a = aVar;
    }

    /* renamed from: l */
    public void mo77841l() {
        C13783a.m58668o(this.f71109a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "basket"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "begin_checkout"), C11078d1.m42659a(C28526d.f68937k, C28522c.f68763o), C11078d1.m42659a("panier_type", "complement")), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f71109a, "complement-commande", "basket", C10975r0.m41401k(C11078d1.m42659a("panier_type", "complement")), false, false, false, 56, (Object) null);
    }

    /* renamed from: u */
    public void mo77843u(boolean z) {
        String str;
        C13783a aVar = this.f71109a;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "complement-commande");
        pairArr[2] = C11078d1.m42659a("screen_name", "basket");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        if (z) {
            str = C28526d.f68967r1;
        } else {
            str = C28526d.f68971s1;
        }
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: w */
    public void mo77845w() {
        C13783a.m58668o(this.f71109a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a("screen_name", "basket"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68963q1)), false, 2, (Object) null);
    }
}
