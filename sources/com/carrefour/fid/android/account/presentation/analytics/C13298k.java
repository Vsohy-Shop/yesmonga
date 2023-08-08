package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.analytics.k */
public final class C13298k implements C13297j {
    @C12579k

    /* renamed from: a */
    public final C13783a f32690a;

    @Inject
    public C13298k(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f32690a = aVar;
    }

    /* renamed from: R */
    public void mo31599R(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "valueEventLabel");
        C13783a.m58668o(this.f32690a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "connexion"), C11078d1.m42659a("screen_name", "demande-reinitialiser-mdp"), C11078d1.m42659a(C28526d.f68929i, "demande-reinitialiser-mdp"), C11078d1.m42659a(C28526d.f68933j, "ko"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f32690a, "connexion", "demande-reinitialiser-mdp", (Map) null, false, false, false, 60, (Object) null);
    }
}
