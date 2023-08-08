package com.carrefour.fid.android.presentation.viewmodels.notification;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.notification.a */
public final class C26628a {

    /* renamed from: b */
    public static final int f65031b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f65032a;

    @Inject
    public C26628a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f65032a = aVar;
    }

    /* renamed from: a */
    public final void mo77376a() {
        C13783a.m58667i(this.f65032a, "actu", "notifications", (Map) null, false, false, false, 60, (Object) null);
    }
}
