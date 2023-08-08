package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.UsabillaInternal$resetCampaignData$1$1$1", mo22502f = "UsabillaInternal.kt", mo22503i = {}, mo22504l = {602}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$resetCampaignData$1$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C9848g $callback;
    final /* synthetic */ CampaignManager $campaignManager;
    final /* synthetic */ C10110e $recorder;
    int label;
    final /* synthetic */ UsabillaInternal this$0;

    /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$resetCampaignData$1$1$1$a */
    public static final class C9741a implements C11908f<List<? extends C9831a>> {

        /* renamed from: a */
        public final /* synthetic */ C10110e f26707a;

        /* renamed from: b */
        public final /* synthetic */ UsabillaInternal f26708b;

        /* renamed from: c */
        public final /* synthetic */ C9848g f26709c;

        public C9741a(C10110e eVar, UsabillaInternal usabillaInternal, C9848g gVar) {
            this.f26707a = eVar;
            this.f26708b = usabillaInternal;
            this.f26709c = gVar;
        }

        @C12580l
        public Object emit(Object obj, @C12579k C11045c cVar) {
            this.f26707a.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27790O, C11064a.m42620f(((List) obj).size())));
            this.f26707a.stop();
            Object h = C11965h.m47673h(this.f26708b.f26663b.mo21561a(), new UsabillaInternal$resetCampaignData$1$1$1$1$1(this.f26709c, (C11045c<? super UsabillaInternal$resetCampaignData$1$1$1$1$1>) null), cVar);
            if (h == C11063b.m42612h()) {
                return h;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$resetCampaignData$1$1$1(CampaignManager campaignManager, C10110e eVar, UsabillaInternal usabillaInternal, C9848g gVar, C11045c<? super UsabillaInternal$resetCampaignData$1$1$1> cVar) {
        super(2, cVar);
        this.$campaignManager = campaignManager;
        this.$recorder = eVar;
        this.this$0 = usabillaInternal;
        this.$callback = gVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new UsabillaInternal$resetCampaignData$1$1$1(this.$campaignManager, this.$recorder, this.this$0, this.$callback, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<List<C9831a>> i2 = this.$campaignManager.mo20743i();
            C9741a aVar = new C9741a(this.$recorder, this.this$0, this.$callback);
            this.label = 1;
            if (i2.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((UsabillaInternal$resetCampaignData$1$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
