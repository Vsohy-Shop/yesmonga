package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.loyalty.core.p061io.EmptyLoyaltyCardsThrowable;
import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCard;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardHolder;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardsResponse;
import com.carrefour.fid.android.loyalty.data.services.ApiMemberCardService;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import java.util.ArrayList;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getLoyaltyCards$2", mo22502f = "MemberCardRepository.kt", mo22503i = {}, mo22504l = {65}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMemberCardRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberCardRepository.kt\ncom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository$getLoyaltyCards$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1603#2,9:88\n1855#2:97\n1856#2:99\n1612#2:100\n1603#2,9:101\n1855#2:110\n1856#2:112\n1612#2:113\n1#3:98\n1#3:111\n*S KotlinDebug\n*F\n+ 1 MemberCardRepository.kt\ncom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository$getLoyaltyCards$2\n*L\n73#1:88,9\n73#1:97\n73#1:99\n73#1:100\n74#1:101,9\n74#1:110\n74#1:112\n74#1:113\n73#1:98\n74#1:111\n*E\n"})
public final class MemberCardRepository$getLoyaltyCards$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends String>>>, Object> {
    final /* synthetic */ String $cardNumber;
    int label;
    final /* synthetic */ MemberCardRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberCardRepository$getLoyaltyCards$2(MemberCardRepository memberCardRepository, String str, C11045c<? super MemberCardRepository$getLoyaltyCards$2> cVar) {
        super(1, cVar);
        this.this$0 = memberCardRepository;
        this.$cardNumber = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new MemberCardRepository$getLoyaltyCards$2(this.this$0, this.$cardNumber, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        List<LoyaltyCardHolder> list;
        List<LoyaltyCard> list2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ApiMemberCardService access$getService$p = this.this$0.service;
            HashMap defaultHeaders$default = LoyaltyHeaders.getDefaultHeaders$default(this.this$0.loyaltyHeaders, this.$cardNumber, (String) null, false, false, false, C28534f.f69170o, 30, (Object) null);
            this.label = 1;
            obj = access$getService$p.getLoyaltyCards(defaultHeaders$default, this);
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
            LoyaltyCardsResponse loyaltyCardsResponse = (LoyaltyCardsResponse) wVar.mo30572a();
            List list3 = null;
            if (loyaltyCardsResponse != null) {
                list = loyaltyCardsResponse.getCardHolders();
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (LoyaltyCardHolder cards : list) {
                    List<LoyaltyCard> cards2 = cards.getCards();
                    if (cards2 != null) {
                        arrayList.add(cards2);
                    }
                }
                list2 = C10978t.m41497a0(arrayList);
            } else {
                list2 = null;
            }
            if (list2 != null) {
                list3 = new ArrayList();
                for (LoyaltyCard cardNumber : list2) {
                    String cardNumber2 = cardNumber.getCardNumber();
                    if (cardNumber2 != null) {
                        list3.add(cardNumber2);
                    }
                }
            }
            if (list3 == null) {
                list3 = CollectionsKt__CollectionsKt.m40441E();
            }
            if (!list3.isEmpty()) {
                Result.C10852a aVar = Result.f28060a;
                obj2 = Result.m38702b(list3);
            } else {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(new EmptyLoyaltyCardsThrowable()));
            }
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error getting cards")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<String>>> cVar) {
        return ((MemberCardRepository$getLoyaltyCards$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
