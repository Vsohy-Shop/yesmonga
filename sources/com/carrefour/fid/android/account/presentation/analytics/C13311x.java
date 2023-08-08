package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.analytics.x */
public final class C13311x implements C13310w {
    @C12579k

    /* renamed from: a */
    public final C13783a f32704a;

    @Inject
    public C13311x(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f32704a = aVar;
    }

    /* renamed from: a */
    public void mo31614a() {
        C13783a.m58668o(this.f32704a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-identifiants-mdp-modification"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "mes-identifiants-mdp-modification")), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f32704a, "mon-compte", "mes-identifiants-mdp-modification", (Map) null, false, false, false, 60, (Object) null);
    }
}
