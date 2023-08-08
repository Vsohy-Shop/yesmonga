package com.carrefour.fid.android.presentation.viewmodels.privacy;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.rgpd.airship.AirshipSettings;
import com.carrefour.fid.android.shared.privacy.C28876b;
import com.carrefour.fid.android.various.core.C22752a;
import com.urbanairship.job.C9313k;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.privacy.a */
public final class C27169a {

    /* renamed from: e */
    public static final int f66056e = 8;
    @C12579k

    /* renamed from: a */
    public final C22752a f66057a;
    @C12579k

    /* renamed from: b */
    public final FirebaseAnalyticsDispatcher f66058b;
    @C12579k

    /* renamed from: c */
    public final C13814a f66059c;
    @C12579k

    /* renamed from: d */
    public final AirshipSettings f66060d;

    @Inject
    public C27169a(@C12579k C22752a aVar, @C12579k FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher, @C12579k C13814a aVar2, @C12579k AirshipSettings airshipSettings) {
        Intrinsics.checkNotNullParameter(aVar, "contentSquare");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsDispatcher, "firebaseAnalytics");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyer");
        Intrinsics.checkNotNullParameter(airshipSettings, C9313k.f25414b);
        this.f66057a = aVar;
        this.f66058b = firebaseAnalyticsDispatcher;
        this.f66059c = aVar2;
        this.f66060d = airshipSettings;
    }

    @C12579k
    /* renamed from: a */
    public final List<C28876b> mo78988a() {
        return CollectionsKt__CollectionsKt.m40448L(this.f66060d, this.f66059c, this.f66057a, this.f66058b);
    }
}
