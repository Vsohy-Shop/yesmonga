package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.analytics.e */
public final class C13291e implements C13290d {
    @C12579k

    /* renamed from: a */
    public final C13783a f32686a;

    @Inject
    public C13291e(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f32686a = aVar;
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f32686a, "mon-compte", "mes-infos", (Map) null, false, false, false, 60, (Object) null);
    }
}
