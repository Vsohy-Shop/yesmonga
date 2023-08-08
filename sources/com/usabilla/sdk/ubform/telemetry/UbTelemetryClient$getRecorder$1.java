package com.usabilla.sdk.ubform.telemetry;

import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.p007db.telemetry.C9783a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "recorder", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbTelemetryClient$getRecorder$1 extends Lambda implements C11300l<C10110e, C11079d2> {
    final /* synthetic */ UbTelemetryClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbTelemetryClient$getRecorder$1(UbTelemetryClient ubTelemetryClient) {
        super(1);
        this.this$0 = ubTelemetryClient;
    }

    /* renamed from: a */
    public final void mo21537a(@C12579k C10110e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "recorder");
        AppInfo b = this.this$0.mo21524b();
        if (b != null) {
            eVar.mo21541c(b);
        }
        C9783a a = this.this$0.mo21523a();
        if (a == null) {
            this.this$0.mo21531l().add(eVar);
        } else {
            this.this$0.mo21535p(a, C10976s.m41419k(eVar.mo21543e()));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo21537a((C10110e) obj);
        return C11079d2.f28267a;
    }
}
