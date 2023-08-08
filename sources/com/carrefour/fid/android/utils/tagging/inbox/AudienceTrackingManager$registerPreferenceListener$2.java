package com.carrefour.fid.android.utils.tagging.inbox;

import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utils.tagging.inbox.AudienceTrackingManager$registerPreferenceListener$2", mo22502f = "AudienceTrackingManager.kt", mo22503i = {}, mo22504l = {38, 38}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AudienceTrackingManager$registerPreferenceListener$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ AudienceTrackingManager this$0;

    /* renamed from: com.carrefour.fid.android.utils.tagging.inbox.AudienceTrackingManager$registerPreferenceListener$2$a */
    public static final class C22723a implements C11908f<C38162k> {

        /* renamed from: a */
        public final /* synthetic */ AudienceTrackingManager f58227a;

        public C22723a(AudienceTrackingManager audienceTrackingManager) {
            this.f58227a = audienceTrackingManager;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C38162k kVar, @C12579k C11045c<? super C11079d2> cVar) {
            this.f58227a.mo67136g(kVar);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudienceTrackingManager$registerPreferenceListener$2(AudienceTrackingManager audienceTrackingManager, C11045c<? super AudienceTrackingManager$registerPreferenceListener$2> cVar) {
        super(2, cVar);
        this.this$0 = audienceTrackingManager;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AudienceTrackingManager$registerPreferenceListener$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37835r d = this.this$0.f58224c;
            this.label = 1;
            obj = d.invoke(this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11907e t0 = C11909g.m47492t0((C11907e) obj);
        C22723a aVar = new C22723a(this.this$0);
        this.label = 2;
        if (t0.collect(aVar, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AudienceTrackingManager$registerPreferenceListener$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
