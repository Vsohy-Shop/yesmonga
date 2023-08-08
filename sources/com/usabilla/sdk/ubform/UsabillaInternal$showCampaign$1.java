package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.eventengine.EventResult;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "recorder", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$showCampaign$1 extends Lambda implements C11300l<C10110e, C11079d2> {
    final /* synthetic */ EventResult $eventResult;
    final /* synthetic */ UsabillaInternal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$showCampaign$1(EventResult eventResult, UsabillaInternal usabillaInternal) {
        super(1);
        this.$eventResult = eventResult;
        this.this$0 = usabillaInternal;
    }

    @C12580l
    /* renamed from: a */
    public final C11079d2 invoke(@C12579k C10110e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "recorder");
        eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27779D, this.$eventResult.mo20176e()));
        CampaignManager Z = this.this$0.mo19844Z();
        if (Z == null) {
            return null;
        }
        Z.mo20740e(this.$eventResult.mo20178f(), this.$eventResult.mo20176e(), this.this$0.mo19853f());
        return C11079d2.f28267a;
    }
}
