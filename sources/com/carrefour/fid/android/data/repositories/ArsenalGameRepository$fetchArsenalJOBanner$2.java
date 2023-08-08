package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.ArsenalJOContentResponse;
import com.carrefour.fid.android.data.service.C36624d;
import com.carrefour.fid.android.shared.p046io.ArsenalGameThrowable;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.ArsenalGameRepository$fetchArsenalJOBanner$2", mo22502f = "ArsenalGameRepository.kt", mo22503i = {}, mo22504l = {56}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/data/entities/ArsenalJOContentResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ArsenalGameRepository$fetchArsenalJOBanner$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends ArsenalJOContentResponse>>, Object> {
    final /* synthetic */ String $fidCardNumber;
    int label;
    final /* synthetic */ ArsenalGameRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArsenalGameRepository$fetchArsenalJOBanner$2(ArsenalGameRepository arsenalGameRepository, String str, C11045c<? super ArsenalGameRepository$fetchArsenalJOBanner$2> cVar) {
        super(1, cVar);
        this.this$0 = arsenalGameRepository;
        this.$fidCardNumber = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new ArsenalGameRepository$fetchArsenalJOBanner$2(this.this$0, this.$fidCardNumber, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36624d e = this.this$0.f90363c;
            String str = this.$fidCardNumber;
            this.label = 1;
            obj = e.mo111636a(str, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        ArsenalJOContentResponse arsenalJOContentResponse = (ArsenalJOContentResponse) wVar.mo30572a();
        if (wVar.mo30576g() && arsenalJOContentResponse != null) {
            if (arsenalJOContentResponse.getBanner().getGameUrl().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Result.C10852a aVar = Result.f28060a;
                obj2 = Result.m38702b(arsenalJOContentResponse);
                return Result.m38701a(obj2);
            }
        }
        Result.C10852a aVar2 = Result.f28060a;
        obj2 = Result.m38702b(C11661u0.m45734a(new ArsenalGameThrowable((String) null, 1, (DefaultConstructorMarker) null)));
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<ArsenalJOContentResponse>> cVar) {
        return ((ArsenalGameRepository$fetchArsenalJOBanner$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
