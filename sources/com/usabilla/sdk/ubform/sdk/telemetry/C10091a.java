package com.usabilla.sdk.ubform.sdk.telemetry;

import android.util.Base64;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import kotlin.text.C11622t;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.telemetry.a */
public final class C10091a {
    @C12579k

    /* renamed from: a */
    public final TelemetryService f27744a;

    public C10091a(@C12579k TelemetryService telemetryService) {
        Intrinsics.checkNotNullParameter(telemetryService, "telemetryService");
        this.f27744a = telemetryService;
    }

    @C12579k
    /* renamed from: a */
    public final C11907e<C11079d2> mo21520a(@C12580l String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str2, "telemetryData");
        byte[] bytes = str2.getBytes(C11602d.f28868b);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(telemetryData.toByteArray(), Base64.DEFAULT)");
        String replace$default = C11622t.replace$default(encodeToString, "\n", "", false, 4, (Object) null);
        TelemetryService telemetryService = this.f27744a;
        if (str == null) {
            str = "noAppId";
        }
        return telemetryService.mo21517a(str, replace$default);
    }
}
