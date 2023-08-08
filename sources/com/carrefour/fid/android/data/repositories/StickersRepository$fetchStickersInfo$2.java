package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.StickersResponse;
import com.carrefour.fid.android.data.service.C36637p;
import com.carrefour.fid.android.shared.p046io.StickersThrowable;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.StickersRepository$fetchStickersInfo$2", mo22502f = "StickersRepository.kt", mo22503i = {}, mo22504l = {17}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/data/entities/StickersResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StickersRepository$fetchStickersInfo$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends StickersResponse>>, Object> {
    int label;
    final /* synthetic */ StickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickersRepository$fetchStickersInfo$2(StickersRepository stickersRepository, C11045c<? super StickersRepository$fetchStickersInfo$2> cVar) {
        super(1, cVar);
        this.this$0 = stickersRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new StickersRepository$fetchStickersInfo$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36637p a = this.this$0.f90446b;
            this.label = 1;
            obj = a.mo111671a(this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        ArrayList arrayList = (ArrayList) wVar.mo30572a();
        if (wVar.mo30576g() && arrayList != null && (!arrayList.isEmpty())) {
            boolean z2 = false;
            if (((StickersResponse) CollectionsKt___CollectionsKt.m40706w2(arrayList)).getGameUrl().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((StickersResponse) CollectionsKt___CollectionsKt.m40706w2(arrayList)).getBannerUrl().length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    Result.C10852a aVar = Result.f28060a;
                    obj2 = Result.m38702b(CollectionsKt___CollectionsKt.m40706w2(arrayList));
                    return Result.m38701a(obj2);
                }
            }
        }
        Result.C10852a aVar2 = Result.f28060a;
        obj2 = Result.m38702b(C11661u0.m45734a(new StickersThrowable((String) null, 1, (DefaultConstructorMarker) null)));
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<StickersResponse>> cVar) {
        return ((StickersRepository$fetchStickersInfo$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
