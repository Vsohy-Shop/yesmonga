package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.C36454f;
import com.carrefour.fid.android.data.entities.coupons.C36423a;
import com.carrefour.fid.android.data.entities.coupons.C36424b;
import com.carrefour.fid.android.data.entities.coupons.C36425c;
import com.carrefour.fid.android.data.entities.coupons.CouponAction;
import com.carrefour.fid.android.data.service.C36625e;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.CouponsRepository$updateCouponsStatus$2", mo22502f = "CouponsRepository.kt", mo22503i = {}, mo22504l = {82}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/data/entities/f;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCouponsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsRepository.kt\ncom/carrefour/fid/android/data/repositories/CouponsRepository$updateCouponsStatus$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1549#2:115\n1620#2,3:116\n*S KotlinDebug\n*F\n+ 1 CouponsRepository.kt\ncom/carrefour/fid/android/data/repositories/CouponsRepository$updateCouponsStatus$2\n*L\n85#1:115\n85#1:116,3\n*E\n"})
public final class CouponsRepository$updateCouponsStatus$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends C36454f>>>, Object> {
    final /* synthetic */ CouponAction $action;
    final /* synthetic */ List<String> $eanList;
    final /* synthetic */ String $loyaltyCardId;
    int label;
    final /* synthetic */ CouponsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsRepository$updateCouponsStatus$2(CouponsRepository couponsRepository, CouponAction couponAction, List<String> list, String str, C11045c<? super CouponsRepository$updateCouponsStatus$2> cVar) {
        super(1, cVar);
        this.this$0 = couponsRepository;
        this.$action = couponAction;
        this.$eanList = list;
        this.$loyaltyCardId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CouponsRepository$updateCouponsStatus$2(this.this$0, this.$action, this.$eanList, this.$loyaltyCardId, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36625e b = this.this$0.f90365a;
            String type = this.$action.getType();
            Iterable<String> iterable = this.$eanList;
            String str = this.$loyaltyCardId;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (String bVar : iterable) {
                C36423a aVar = r6;
                C36423a aVar2 = new C36423a((String) null, str, C28932h.f70914a.mo84241k(new Date().getTime()), 1, (DefaultConstructorMarker) null);
                arrayList.add(new C36424b(bVar, aVar));
            }
            C36425c cVar = new C36425c(type, arrayList);
            HashMap<String, String> a = this.this$0.f90366b.mo111427a(this.$loyaltyCardId, true, true);
            this.label = 1;
            obj2 = b.mo111638b(cVar, a, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = this.$loyaltyCardId;
        C13091w wVar = (C13091w) obj2;
        if (wVar.mo30576g()) {
            Result.C10852a aVar3 = Result.f28060a;
            List list = (List) wVar.mo30572a();
            if (list == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            } else {
                Intrinsics.checkNotNullExpressionValue(list, "response.body() ?: emptyList()");
            }
            obj3 = Result.m38702b(list);
        } else {
            Result.C10852a aVar4 = Result.f28060a;
            obj3 = Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error update coupons status for id-card : '" + str2 + "'")));
        }
        return Result.m38701a(obj3);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<C36454f>>> cVar) {
        return ((CouponsRepository$updateCouponsStatus$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
