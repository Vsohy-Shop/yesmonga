package com.carrefour.fid.android.various.tracking;

import com.carrefour.fid.android.domain.models.usabilla.UsabillaEventType;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.data.datastore.pref.C28631e;
import com.carrefour.fid.android.various.core.utils.C22755a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.various.tracking.ThirdPartyUsabillaEventDispatcher$sendEvent$1", mo22502f = "ThirdPartyUsabillaEventDispatcher.kt", mo22503i = {}, mo22504l = {40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ThirdPartyUsabillaEventDispatcher$sendEvent$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ UsabillaEventType $event;
    Object L$0;
    int label;
    final /* synthetic */ ThirdPartyUsabillaEventDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdPartyUsabillaEventDispatcher$sendEvent$1(ThirdPartyUsabillaEventDispatcher thirdPartyUsabillaEventDispatcher, UsabillaEventType usabillaEventType, C11045c<? super ThirdPartyUsabillaEventDispatcher$sendEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = thirdPartyUsabillaEventDispatcher;
        this.$event = usabillaEventType;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ThirdPartyUsabillaEventDispatcher$sendEvent$1(this.this$0, this.$event, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C22755a aVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ThirdPartyUsabillaEventDispatcher thirdPartyUsabillaEventDispatcher = this.this$0;
            if (thirdPartyUsabillaEventDispatcher.mo32689f(thirdPartyUsabillaEventDispatcher.f58400a)) {
                C22755a aVar2 = C22755a.f58271a;
                BaseAppPreferencesStorage g = this.this$0.f58401b;
                this.L$0 = aVar2;
                this.label = 1;
                Object c = g.mo83495c(this);
                if (c == h) {
                    return h;
                }
                aVar = aVar2;
                obj = c;
            }
            return C11079d2.f28267a;
        } else if (i == 1) {
            aVar = (C22755a) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar.mo67151d(((C28631e) obj).mo83520d());
        C22755a.f58271a.mo67150c(this.this$0.f58400a, this.$event);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ThirdPartyUsabillaEventDispatcher$sendEvent$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
