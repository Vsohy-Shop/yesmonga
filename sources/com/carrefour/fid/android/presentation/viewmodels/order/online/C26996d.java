package com.carrefour.fid.android.presentation.viewmodels.order.online;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28554j1;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.d */
public final class C26996d {

    /* renamed from: b */
    public static final int f65681b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f65682a;

    @Inject
    public C26996d(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "mAnalyticManager");
        this.f65682a = aVar;
    }

    /* renamed from: a */
    public final String mo78398a(OrderType orderType) {
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Clcv.f70280e)) {
            return "clcv";
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.Drive.f70282e)) {
            return "drive";
        }
        if (Intrinsics.areEqual((Object) orderType, (Object) OrderType.H1h3.f70286e)) {
            return "lex";
        }
        return C28526d.f68944l2;
    }

    /* renamed from: b */
    public final void mo78399b() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "navigation-clic"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69458y)), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo78400c() {
        C13783a.m58667i(this.f65682a, "mon-compte", "details-commande", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: d */
    public final void mo78401d() {
        C13783a.m58667i(this.f65682a, "mon-compte", "mes-commandes-error", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: e */
    public final void mo78402e() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69457x)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo78403f() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "navigation-clic"), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69426E)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo78404g() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68964q2)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo78405h(@C12580l OrderType orderType) {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "confirmer-annuler-commande"), C11078d1.m42659a(C28526d.f68937k, mo78398a(orderType))), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo78406i() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69444k)), false, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo78407j() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69443j)), false, 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo78408k() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69444k)), false, 2, (Object) null);
    }

    /* renamed from: l */
    public final void mo78409l() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_class", "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "navigation-clic"), C11078d1.m42659a(C28526d.f68933j, "sortie-site")), false, 2, (Object) null);
    }

    /* renamed from: m */
    public final void mo78410m() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68936j2), C11078d1.m42659a(C28526d.f68937k, "")), false, 2, (Object) null);
    }

    /* renamed from: n */
    public final void mo78411n() {
        C13783a.m58668o(this.f65682a, C10977s0.m41446M(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28554j1.f69422A), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69422A)), false, 2, (Object) null);
    }

    /* renamed from: o */
    public final void mo78412o() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "commander-a-nouveau")), false, 2, (Object) null);
    }

    /* renamed from: p */
    public final void mo78413p() {
        C13783a.m58668o(this.f65682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_class", "mon-compte"), C11078d1.m42659a("screen_name", "details-commande"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68940k2)), false, 2, (Object) null);
    }
}
