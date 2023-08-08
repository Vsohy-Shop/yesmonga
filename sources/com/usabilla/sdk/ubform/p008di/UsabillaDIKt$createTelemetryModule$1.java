package com.usabilla.sdk.ubform.p008di;

import com.usabilla.sdk.ubform.sdk.telemetry.C10091a;
import com.usabilla.sdk.ubform.sdk.telemetry.TelemetryService;
import com.usabilla.sdk.ubform.telemetry.C10094a;
import com.usabilla.sdk.ubform.telemetry.C10109d;
import com.usabilla.sdk.ubform.utils.C10118d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/di/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.di.UsabillaDIKt$createTelemetryModule$1 */
public final class UsabillaDIKt$createTelemetryModule$1 extends Lambda implements C11300l<C9822e, C11079d2> {
    final /* synthetic */ C10118d $dispatchers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaDIKt$createTelemetryModule$1(C10118d dVar) {
        super(1);
        this.$dispatchers = dVar;
    }

    /* renamed from: a */
    public final void mo20102a(@C12579k C9822e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$module");
        C98131 r0 = C98131.f26868f;
        eVar.mo20153b().put(C10109d.class, new C9824g(r0));
        final C10118d dVar = this.$dispatchers;
        C98142 r02 = new C11300l<C9818a, C12074o0>() {
            @C12579k
            /* renamed from: a */
            public final C12074o0 invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                return C12079p0.m48260a(dVar.mo21564d());
            }
        };
        eVar.mo20153b().put(C12074o0.class, new C9824g(r02));
        C98153 r03 = C98153.f26869f;
        eVar.mo20153b().put(C10094a.class, new C9824g(r03));
        C98164 r04 = C98164.f26870f;
        eVar.mo20153b().put(TelemetryService.class, new C9824g(r04));
        C98175 r05 = C98175.f26871f;
        eVar.mo20153b().put(C10091a.class, new C9824g(r05));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20102a((C9822e) obj);
        return C11079d2.f28267a;
    }
}
