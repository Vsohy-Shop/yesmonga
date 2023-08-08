package com.usabilla.sdk.ubform.sdk.telemetry;

import com.usabilla.sdk.ubform.net.C9853d;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.net.http.C9872i;
import com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

public final class TelemetryService {
    @C12579k

    /* renamed from: a */
    public final C9870g f27741a;
    @C12579k

    /* renamed from: b */
    public final C9853d f27742b;

    public TelemetryService(@C12579k C9870g gVar, @C12579k C9853d dVar) {
        Intrinsics.checkNotNullParameter(gVar, "client");
        Intrinsics.checkNotNullParameter(dVar, "requestBuilder");
        this.f27741a = gVar;
        this.f27742b = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C11907e mo21517a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(str2, "base64TelemetryData");
        C9872i h = this.f27742b.mo20281h(str, str2);
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27741a, h), TelemetryService$submitTelemetryData$1.f27743f, new TelemetryService$submitTelemetryData$2(h));
    }
}
