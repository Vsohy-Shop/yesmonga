package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28574o1;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.analytics.u */
public final class C13308u implements C13307t {
    @C12579k

    /* renamed from: a */
    public final C13783a f32702a;

    @Inject
    public C13308u(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f32702a = aVar;
    }

    /* renamed from: a */
    public void mo31611a() {
        C13783a.m58668o(this.f32702a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-infos-modification"), C11078d1.m42659a(C28526d.f68933j, C28574o1.f69662f), C11078d1.m42659a(C28526d.f68929i, "mon-compte")), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f32702a, "mon-compte", "mes-infos-modification", (Map) null, false, false, false, 60, (Object) null);
    }
}
