package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "recorder", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$resetCampaignData$1 extends Lambda implements C11300l<C10110e, C11079d2> {
    final /* synthetic */ C9848g $callback;
    final /* synthetic */ UsabillaInternal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$resetCampaignData$1(C9848g gVar, UsabillaInternal usabillaInternal) {
        super(1);
        this.$callback = gVar;
        this.this$0 = usabillaInternal;
    }

    /* renamed from: a */
    public final void mo19906a(@C12579k C10110e eVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(eVar, "recorder");
        if (this.$callback != null) {
            z = true;
        } else {
            z = false;
        }
        eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27778C, Boolean.valueOf(z)));
        CampaignManager Z = this.this$0.mo19844Z();
        if (Z == null) {
            Logger.f26647a.logError("resetCampaignData not called due to initialisation with invalid AppId");
            eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27809l, "resetCampaignData not called due to initialisation with invalid AppId"));
            eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27808k, C10108c.f27797V));
            eVar.stop();
            return;
        }
        UsabillaInternal usabillaInternal = this.this$0;
        C9848g gVar = this.$callback;
        C11723c2 unused = C12038j.m48061f(usabillaInternal.mo19856g0(), (CoroutineContext) null, (CoroutineStart) null, new UsabillaInternal$resetCampaignData$1$1$1(Z, eVar, usabillaInternal, gVar, (C11045c<? super UsabillaInternal$resetCampaignData$1$1$1>) null), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo19906a((C10110e) obj);
        return C11079d2.f28267a;
    }
}
