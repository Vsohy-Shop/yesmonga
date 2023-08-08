package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28572o;
import com.urbanairship.analytics.C35517a;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.analytics.m */
public final class C13300m {
    @C12579k

    /* renamed from: a */
    public final C13783a f32692a;

    @Inject
    public C13300m(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticGlobalDispatcher");
        this.f32692a = aVar;
    }

    /* renamed from: a */
    public final void mo31602a() {
        C13783a.m58668o(this.f32692a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "connexion"), C11078d1.m42659a(C28526d.f68906d, "connexion"), C11078d1.m42659a(C28526d.f68933j, "creer-un-compte"), C11078d1.m42659a(C28526d.f68929i, "connexion")), false, 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo31603b() {
        C13783a.m58668o(this.f32692a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "modal-connexion"), C11078d1.m42659a(C28526d.f68906d, "connexion"), C11078d1.m42659a(C28526d.f68929i, C35517a.f87583g), C11078d1.m42659a(C28526d.f68933j, C28572o.f69647f), C11078d1.m42659a(C28526d.f68937k, "automatique")), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo31604c() {
    }

    /* renamed from: d */
    public final void mo31605d() {
        C13783a.m58666g(this.f32692a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68929i, C35517a.f87583g), C11078d1.m42659a(C28526d.f68933j, C28572o.f69647f), C11078d1.m42659a(C28526d.f68937k, "manuel")), false, 2, (Object) null);
    }
}
