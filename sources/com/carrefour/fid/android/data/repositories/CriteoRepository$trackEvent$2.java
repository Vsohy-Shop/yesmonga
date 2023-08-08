package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.service.C36627f;
import com.carrefour.fid.android.shared.constant.C28607x;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.CriteoRepository$trackEvent$2", mo22502f = "CriteoRepository.kt", mo22503i = {}, mo22504l = {79}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CriteoRepository$trackEvent$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C11079d2>>, Object> {
    final /* synthetic */ boolean $isFromBff;
    final /* synthetic */ String $trackingUrl;
    int label;
    final /* synthetic */ CriteoRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoRepository$trackEvent$2(CriteoRepository criteoRepository, boolean z, String str, C11045c<? super CriteoRepository$trackEvent$2> cVar) {
        super(1, cVar);
        this.this$0 = criteoRepository;
        this.$isFromBff = z;
        this.$trackingUrl = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CriteoRepository$trackEvent$2(this.this$0, this.$isFromBff, this.$trackingUrl, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        String str;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36627f h2 = this.this$0.f90368a;
            HashMap<String, String> a = this.this$0.f90370c.mo111429a();
            if (this.$isFromBff) {
                str = this.$trackingUrl;
            } else {
                str = C28607x.f70006z + this.$trackingUrl;
            }
            this.label = 1;
            obj = h2.mo111640b(a, str, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(C11079d2.f28267a);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error tracking event")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C11079d2>> cVar) {
        return ((CriteoRepository$trackEvent$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
