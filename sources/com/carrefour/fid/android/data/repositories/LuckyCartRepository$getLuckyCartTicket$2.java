package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBody;
import com.carrefour.fid.android.data.entities.luckycart.LuckyCartTicketEntity;
import com.carrefour.fid.android.data.entities.mapper.C36506l0;
import com.carrefour.fid.android.data.service.C36630i;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.shared.p046io.LuckyCartOptOutThrowable;
import com.carrefour.fid.android.shared.p046io.LuckyCartThrowable;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.LuckyCartRepository$getLuckyCartTicket$2", mo22502f = "LuckyCartRepository.kt", mo22503i = {}, mo22504l = {40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/LuckyCartTicketDomain;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LuckyCartRepository$getLuckyCartTicket$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends LuckyCartTicketDomain>>, Object> {
    final /* synthetic */ HashMap<String, CategoryModel> $categoryListByGtin;
    final /* synthetic */ OrderConfirmationModel $orderConfirmationModel;
    int label;
    final /* synthetic */ LuckyCartRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyCartRepository$getLuckyCartTicket$2(LuckyCartRepository luckyCartRepository, OrderConfirmationModel orderConfirmationModel, HashMap<String, CategoryModel> hashMap, C11045c<? super LuckyCartRepository$getLuckyCartTicket$2> cVar) {
        super(1, cVar);
        this.this$0 = luckyCartRepository;
        this.$orderConfirmationModel = orderConfirmationModel;
        this.$categoryListByGtin = hashMap;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new LuckyCartRepository$getLuckyCartTicket$2(this.this$0, this.$orderConfirmationModel, this.$categoryListByGtin, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        boolean z;
        LuckyCartBody luckyCartBody;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            LuckyCartRepository luckyCartRepository = this.this$0;
            if (luckyCartRepository.mo32689f(luckyCartRepository.mo111512h())) {
                C36630i d = this.this$0.f90389b;
                OrderConfirmationModel orderConfirmationModel = this.$orderConfirmationModel;
                if (orderConfirmationModel != null) {
                    luckyCartBody = this.this$0.mo111513i(orderConfirmationModel, this.$categoryListByGtin);
                } else {
                    luckyCartBody = null;
                }
                this.label = 1;
                obj = d.mo111644a(luckyCartBody, this);
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
        LuckyCartTicketEntity luckyCartTicketEntity = (LuckyCartTicketEntity) wVar.mo30572a();
        if (wVar.mo30576g() && luckyCartTicketEntity != null) {
            String imageUrl = luckyCartTicketEntity.getImageUrl();
            boolean z2 = false;
            if (imageUrl == null || imageUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String redirectionUrl = luckyCartTicketEntity.getRedirectionUrl();
                if (redirectionUrl == null || redirectionUrl.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    Result.C10852a aVar2 = Result.f28060a;
                    obj2 = Result.m38702b(C36506l0.m149709a(luckyCartTicketEntity));
                    return Result.m38701a(obj2);
                }
            }
        }
        Result.C10852a aVar3 = Result.f28060a;
        obj2 = Result.m38702b(C11661u0.m45734a(new LuckyCartThrowable((String) null, 1, (DefaultConstructorMarker) null)));
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<LuckyCartTicketDomain>> cVar) {
        return ((LuckyCartRepository$getLuckyCartTicket$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
