package com.carrefour.fid.android.airship.data.datasource;

import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.tracking.C28994a;
import com.carrefour.fid.android.tracking.UserTag;
import com.google.firebase.crashlytics.C32648f;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.C35551h;
import com.urbanairship.channel.C9022g;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAirshipAudienceTrackingImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirshipAudienceTrackingImpl.kt\ncom/carrefour/fid/android/airship/data/datasource/AirshipAudienceTrackingImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,52:1\n215#2,2:53\n215#2,2:55\n*S KotlinDebug\n*F\n+ 1 AirshipAudienceTrackingImpl.kt\ncom/carrefour/fid/android/airship/data/datasource/AirshipAudienceTrackingImpl\n*L\n25#1:53,2\n33#1:55,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.airship.data.datasource.c */
public final class C13744c implements C28994a {
    @Inject
    public C13744c() {
        C9022g V = UAirship.m146188Y().mo106227r().mo18029V();
        V.mo17835i(C13758b.f33483y0, C13758b.f33438c);
        V.mo17828a();
    }

    /* renamed from: a */
    public void mo32666a(@C12579k UserTag userTag) {
        Intrinsics.checkNotNullParameter(userTag, "tag");
        UAirship.m146188Y().mo106227r().mo18031X().mo17951a(userTag.mo84431q(), userTag.mo84432r()).mo17953d();
    }

    /* renamed from: b */
    public void mo32667b(@C12579k UserTag userTag) {
        Intrinsics.checkNotNullParameter(userTag, "tag");
        UAirship.m146188Y().mo106227r().mo18031X().mo17954f(userTag.mo84431q(), userTag.mo84432r()).mo17953d();
    }

    /* renamed from: c */
    public void mo32668c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "userName");
        UAirship.m146188Y().mo106227r().mo18045l0(str);
    }

    /* renamed from: d */
    public void mo32669d(@C12579k String str, @C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(map, "properties");
        C35551h.C35553b u = C35551h.m146685u(str);
        Intrinsics.checkNotNullExpressionValue(u, "newBuilder(key)");
        for (Map.Entry next : map.entrySet()) {
            u.mo106502m((String) next.getKey(), (String) next.getValue());
        }
        u.mo106504o().mo106497v();
    }

    /* renamed from: e */
    public void mo32670e(@C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, C32648f.f79206e);
        C28935i iVar = C28935i.f70940a;
        C28935i.m119706i(iVar, "AirshipAudienceTrackingImpl set attributes : " + map, (Throwable) null, 0, 6, (Object) null);
        C9022g V = UAirship.m146188Y().mo106227r().mo18029V();
        for (Map.Entry next : map.entrySet()) {
            V.mo17835i((String) next.getKey(), (String) next.getValue());
        }
        V.mo17828a();
    }
}
