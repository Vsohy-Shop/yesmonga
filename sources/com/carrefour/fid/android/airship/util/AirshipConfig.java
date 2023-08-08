package com.carrefour.fid.android.airship.util;

import android.annotation.SuppressLint;
import android.content.Context;
import com.carrefour.fid.android.airship.C13719b;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.UAirship;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.job.C9313k;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/airship/util/AirshipConfig;", "Lcom/urbanairship/Autopilot;", "Lcom/urbanairship/UAirship;", "airship", "Lkotlin/d2;", "a", "Landroid/content/Context;", "context", "Lcom/urbanairship/AirshipConfigOptions;", "f", "<init>", "()V", "e", "airship_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class AirshipConfig extends Autopilot {
    @C12579k

    /* renamed from: e */
    public static final C13756a f33395e = new C13756a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final String f33396f = "rTkiMpsRSFufnCMDcWeDpg";
    @C12579k

    /* renamed from: g */
    public static final String f33397g = "qQoZeWbDRLqYI1XqaDrV9g";
    @C12579k

    /* renamed from: h */
    public static final String f33398h = "bl5YK2UPQE2TsHvXV8suqw";
    @C12579k

    /* renamed from: i */
    public static final String f33399i = "MK2PwL7pRnuYf6RA8XMVfg";

    /* renamed from: com.carrefour.fid.android.airship.util.AirshipConfig$a */
    public static final class C13756a {
        public /* synthetic */ C13756a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13756a() {
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo19438a(@C12579k UAirship uAirship) {
        Intrinsics.checkNotNullParameter(uAirship, C9313k.f25414b);
        super.mo19438a(uAirship);
        C28935i iVar = C28935i.f70940a;
        String Z = uAirship.mo106223n().mo17793Z();
        C28935i.m119704b(iVar, "channel id : " + Z, (Throwable) null, 0, 6, (Object) null);
    }

    @C12579k
    /* renamed from: f */
    public AirshipConfigOptions mo32685f(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        AirshipConfigOptions R = new AirshipConfigOptions.C35437b().mo106176i0(f33396f).mo106177j0(f33397g).mo106191x0(f33398h).mo106192y0(f33399i).mo106183p0(true).mo106144C0(AirshipConfigOptions.f87118f0).mo106189v0(C13719b.C13727h.ic_logo_carrefour).mo106146E0(context.getResources().getStringArray(C13719b.C13722c.airship_url_allow_list)).mo106180m0(0).mo106159R();
        Intrinsics.checkNotNullExpressionValue(R, "Builder()\n            .s…ONE)\n            .build()");
        return R;
    }
}
