package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.APIMSuggestionList;
import com.carrefour.fid.android.data.entities.mapper.C36458a0;
import com.carrefour.fid.android.data.service.C36621b;
import com.carrefour.fid.android.domain.models.C37941a0;
import com.carrefour.fid.android.shared.constant.C28534f;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.APIMProductsRepository$getSearchSuggestions$2", mo22502f = "APIMProductsRepository.kt", mo22503i = {}, mo22504l = {114}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/a0;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class APIMProductsRepository$getSearchSuggestions$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C37941a0>>, Object> {
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ Integer $productSize;
    final /* synthetic */ String $searchedText;
    int label;
    final /* synthetic */ APIMProductsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public APIMProductsRepository$getSearchSuggestions$2(APIMProductsRepository aPIMProductsRepository, String str, String str2, Integer num, C11045c<? super APIMProductsRepository$getSearchSuggestions$2> cVar) {
        super(1, cVar);
        this.this$0 = aPIMProductsRepository;
        this.$facilityServiceId = str;
        this.$searchedText = str2;
        this.$productSize = num;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new APIMProductsRepository$getSearchSuggestions$2(this.this$0, this.$facilityServiceId, this.$searchedText, this.$productSize, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        int i;
        Object h = C11063b.m42612h();
        int i2 = this.label;
        if (i2 == 0) {
            C11661u0.m45747n(obj);
            C36621b f = this.this$0.f90353a;
            HashMap<String, String> a = this.this$0.f90357e.mo111446a(this.$facilityServiceId);
            String str = this.$facilityServiceId;
            String str2 = this.$searchedText;
            Integer num = this.$productSize;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 20;
            }
            this.label = 1;
            obj = C36621b.C36622a.m150241a(f, a, str, C28534f.f69135T, str2, 0, i, this, 16, (Object) null);
            if (obj == h) {
                return h;
            }
        } else if (i2 == 1) {
            try {
                C11661u0.m45747n(obj);
            } catch (Exception e) {
                Result.C10852a aVar = Result.f28060a;
                return Result.m38701a(Result.m38702b(C11661u0.m45734a(e)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (!wVar.mo30576g()) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38701a(Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error searching products"))));
        }
        Result.C10852a aVar3 = Result.f28060a;
        C36458a0 j = this.this$0.f90356d;
        Object a2 = wVar.mo30572a();
        Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type com.carrefour.fid.android.data.entities.APIMSuggestionList");
        return Result.m38701a(Result.m38702b(j.mo72340a((APIMSuggestionList) a2)));
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C37941a0>> cVar) {
        return ((APIMProductsRepository$getSearchSuggestions$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
