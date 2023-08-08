package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBannersEntity;
import com.carrefour.fid.android.data.entities.mapper.C36504k0;
import com.carrefour.fid.android.data.service.C36631j;
import com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners;
import com.carrefour.fid.android.shared.p046io.LuckyCartOptOutThrowable;
import com.carrefour.fid.android.shared.p046io.LuckyCartThrowable;
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

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannersList$2", mo22502f = "LuckyCartBannerRepository.kt", mo22503i = {}, mo22504l = {33}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/luckycart/LuckyCartBanners;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LuckyCartBannerRepository$getBannersList$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends LuckyCartBanners>>, Object> {
    final /* synthetic */ String $store;
    final /* synthetic */ String $storeType;
    int label;
    final /* synthetic */ LuckyCartBannerRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyCartBannerRepository$getBannersList$2(LuckyCartBannerRepository luckyCartBannerRepository, String str, String str2, C11045c<? super LuckyCartBannerRepository$getBannersList$2> cVar) {
        super(1, cVar);
        this.this$0 = luckyCartBannerRepository;
        this.$store = str;
        this.$storeType = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new LuckyCartBannerRepository$getBannersList$2(this.this$0, this.$store, this.$storeType, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            LuckyCartBannerRepository luckyCartBannerRepository = this.this$0;
            if (luckyCartBannerRepository.mo32689f(luckyCartBannerRepository.mo111507j())) {
                C36631j g = this.this$0.f90384b;
                String z = this.this$0.f90386d.mo84186z();
                String i2 = this.this$0.mo111508k();
                String str = this.$store;
                String str2 = this.$storeType;
                this.label = 1;
                obj = g.mo111645a(z, i2, str, str2, this);
                if (obj == h) {
                    return h;
                }
            } else {
                Result.C10852a aVar = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(new LuckyCartOptOutThrowable((String) null, 1, (DefaultConstructorMarker) null)));
                return Result.m38701a(obj2);
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        LuckyCartBannersEntity luckyCartBannersEntity = (LuckyCartBannersEntity) wVar.mo30572a();
        if (!wVar.mo30576g() || luckyCartBannersEntity == null) {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(new LuckyCartThrowable((String) null, 1, (DefaultConstructorMarker) null)));
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            obj2 = Result.m38702b(C36504k0.m149705b(luckyCartBannersEntity));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<LuckyCartBanners>> cVar) {
        return ((LuckyCartBannerRepository$getBannersList$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
