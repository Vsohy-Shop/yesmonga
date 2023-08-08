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
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.h */
public final class C29005h implements C29003g {

    /* renamed from: b */
    public static final int f71099b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f71100a;

    @Inject
    public C29005h(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71100a = aVar;
    }

    /* renamed from: A */
    public void mo77696A() {
        C13783a.m58668o(this.f71100a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a(C28526d.f68933j, "ajouter-agenda"), C11078d1.m42659a(C28526d.f68929i, "ecommerce")), false, 2, (Object) null);
    }

    /* renamed from: F */
    public void mo77697F(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        Map j0 = C10977s0.m41469j0(C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "transaction_panier_" + str));
        if (!z) {
            j0.put(C28526d.f68937k, "");
        }
        C13783a aVar = this.f71100a;
        C13783a.m58669q(aVar, j0, false, "transaction_panier_" + str, 2, (Object) null);
    }

    /* renamed from: O */
    public void mo77698O() {
        C13783a.m58668o(this.f71100a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a(C28526d.f68933j, "evaluer-mon-experience"), C11078d1.m42659a(C28526d.f68929i, "ecommerce")), false, 2, (Object) null);
    }

    /* renamed from: Q */
    public void mo77699Q() {
        C13783a.m58668o(this.f71100a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a(C28526d.f68933j, "besoin-aide"), C11078d1.m42659a(C28526d.f68929i, "ecommerce")), false, 2, (Object) null);
    }

    /* renamed from: X */
    public void mo77700X() {
        C13783a.m58667i(this.f71100a, "complement-commande", "order-confirmation", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: c */
    public void mo77701c() {
        C13783a.m58667i(this.f71100a, "complement-commande", "order-confirmation-error", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: v */
    public void mo77712v() {
        C13783a.m58668o(this.f71100a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28522c.f68761m), C11078d1.m42659a(C28526d.f68937k, C28522c.f68766r), C11078d1.m42659a("panier_type", "complement")), false, 2, (Object) null);
    }
}
