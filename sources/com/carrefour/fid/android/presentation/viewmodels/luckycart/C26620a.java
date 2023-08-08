package com.carrefour.fid.android.presentation.viewmodels.luckycart;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28623z0;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.a */
public final class C26620a {

    /* renamed from: b */
    public static final int f65026b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f65027a;

    @Inject
    public C26620a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f65027a = aVar;
    }

    /* renamed from: a */
    public final void mo77368a() {
        C13783a.m58668o(this.f65027a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, C28623z0.f70140b), C11078d1.m42659a(C28526d.f68933j, "affichage")), false, 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo77369b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "promoName");
        C13783a.m58668o(this.f65027a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68929i, C28623z0.f70140b), C11078d1.m42659a(C28526d.f68933j, "select-content"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo77370c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "promoName");
        C13783a.m58668o(this.f65027a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "accueil"), C11078d1.m42659a(C28526d.f68906d, "home"), C11078d1.m42659a(C28526d.f68929i, C28623z0.f70140b), C11078d1.m42659a(C28526d.f68933j, "view-promotion"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: d */
    public final void mo77371d() {
        C13783a.m58668o(this.f65027a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "order-confirmation"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, C28623z0.f70140b), C11078d1.m42659a(C28526d.f68933j, C28623z0.f70142d)), false, 2, (Object) null);
    }
}
