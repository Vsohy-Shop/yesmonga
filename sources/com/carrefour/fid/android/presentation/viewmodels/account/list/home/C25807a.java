package com.carrefour.fid.android.presentation.viewmodels.account.list.home;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.home.a */
public final class C25807a {

    /* renamed from: b */
    public static final int f63213b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f63214a;

    @Inject
    public C25807a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f63214a = aVar;
    }

    /* renamed from: a */
    public final void mo74912a() {
        C13783a.m58667i(this.f63214a, "listes", "mes-listes", (Map) null, false, false, false, 60, (Object) null);
    }
}
