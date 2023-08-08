package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.eventengine.EventResult;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11076d0;
import kotlin.collections.C10975r0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "recorder", "Lkotlinx/coroutines/flow/e;", "Lcom/usabilla/sdk/ubform/eventengine/EventResult;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$sendEvent$1 extends Lambda implements C11300l<C10110e, C11907e<? extends EventResult>> {
    final /* synthetic */ String $event;
    final /* synthetic */ UsabillaInternal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$sendEvent$1(String str, UsabillaInternal usabillaInternal) {
        super(1);
        this.$event = str;
        this.this$0 = usabillaInternal;
    }

    @C12579k
    /* renamed from: a */
    public final C11907e<EventResult> invoke(@C12579k C10110e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "recorder");
        eVar.mo21540b(new C10096b.C10101b.C10105d("event", this.$event));
        CampaignManager Z = this.this$0.mo19844Z();
        if (Z == null) {
            Logger.f26647a.logError("sendEvent not called due to initialisation with invalid AppId");
            eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27809l, "sendEvent not called due to initialisation with invalid AppId"));
            eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27808k, C10108c.f27797V));
            eVar.stop();
            UsabillaInternal usabillaInternal = this.this$0;
            usabillaInternal.mo19868m0(usabillaInternal.mo19843Y().mo19774t());
            return C11909g.m47385M0(null);
        }
        String str = this.$event;
        UsabillaInternal usabillaInternal2 = this.this$0;
        boolean w = usabillaInternal2.mo19879w();
        ConcurrentMap<String, Object> F = usabillaInternal2.mo19841F();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(F.size()));
        for (Map.Entry entry : F.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return new UsabillaInternal$sendEvent$1$invoke$lambda2$$inlined$map$1(Z.mo20744j(str, w, new ConcurrentHashMap(linkedHashMap), usabillaInternal2.mo19874s()), eVar, usabillaInternal2);
    }
}
