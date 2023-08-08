package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBannerActionEntity;
import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBannerDetailsEntity;
import com.carrefour.fid.android.data.entities.mapper.C36504k0;
import com.carrefour.fid.android.data.service.C36631j;
import com.carrefour.fid.android.domain.models.luckycart.C38047a;
import com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannerDetails$2", mo22502f = "LuckyCartBannerRepository.kt", mo22503i = {}, mo22504l = {58}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/luckycart/a;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LuckyCartBannerRepository$getBannerDetails$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C38047a>>, Object> {
    final /* synthetic */ String $bannerType;
    final /* synthetic */ LuckyCartPageType $pageName;
    final /* synthetic */ String $store;
    final /* synthetic */ String $storeType;
    int label;
    final /* synthetic */ LuckyCartBannerRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyCartBannerRepository$getBannerDetails$2(LuckyCartBannerRepository luckyCartBannerRepository, LuckyCartPageType luckyCartPageType, String str, String str2, String str3, C11045c<? super LuckyCartBannerRepository$getBannerDetails$2> cVar) {
        super(1, cVar);
        this.this$0 = luckyCartBannerRepository;
        this.$pageName = luckyCartPageType;
        this.$bannerType = str;
        this.$store = str2;
        this.$storeType = str3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new LuckyCartBannerRepository$getBannerDetails$2(this.this$0, this.$pageName, this.$bannerType, this.$store, this.$storeType, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        boolean z;
        String str;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            LuckyCartBannerRepository luckyCartBannerRepository = this.this$0;
            if (luckyCartBannerRepository.mo32689f(luckyCartBannerRepository.mo111507j())) {
                C36631j g = this.this$0.f90384b;
                String z2 = this.this$0.f90386d.mo84186z();
                String i2 = this.this$0.mo111508k();
                String q = this.$pageName.mo117888q();
                String str2 = this.$bannerType;
                String str3 = this.$store;
                String str4 = this.$storeType;
                this.label = 1;
                obj = g.mo111646b(z2, i2, q, str2, str3, str4, this);
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
        LuckyCartBannerDetailsEntity luckyCartBannerDetailsEntity = (LuckyCartBannerDetailsEntity) wVar.mo30572a();
        if (wVar.mo30576g() && luckyCartBannerDetailsEntity != null) {
            String imageUrl = luckyCartBannerDetailsEntity.getImageUrl();
            if (imageUrl == null || imageUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                LuckyCartBannerActionEntity action = luckyCartBannerDetailsEntity.getAction();
                if (action != null) {
                    str = action.getType();
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual((Object) str, (Object) "query")) {
                    Result.C10852a aVar2 = Result.f28060a;
                    obj2 = Result.m38702b(C36504k0.m149704a(luckyCartBannerDetailsEntity));
                    return Result.m38701a(obj2);
                }
            }
        }
        Result.C10852a aVar3 = Result.f28060a;
        obj2 = Result.m38702b(C11661u0.m45734a(new LuckyCartThrowable((String) null, 1, (DefaultConstructorMarker) null)));
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C38047a>> cVar) {
        return ((LuckyCartBannerRepository$getBannerDetails$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
