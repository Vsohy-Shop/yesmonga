package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.loyalty.core.p061io.ActiveFidError;
import com.carrefour.fid.android.loyalty.core.p061io.InactivePassCardError;
import com.carrefour.fid.android.loyalty.core.p061io.InvalidCardError;
import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardGetMemberResponse;
import com.carrefour.fid.android.loyalty.data.models.extension.LoyaltyErrorResponseKt;
import com.carrefour.fid.android.loyalty.data.services.ApiMemberCardService;
import com.carrefour.fid.android.loyalty.domain.extension.LoyaltyMemberCardDomainKt;
import com.carrefour.fid.android.loyalty.domain.models.CardDomain;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository$getMemberCard$2", mo22502f = "MemberCardRepository.kt", mo22503i = {}, mo22504l = {31}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyMemberCardDomain;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMemberCardRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberCardRepository.kt\ncom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository$getMemberCard$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n288#2,2:88\n*S KotlinDebug\n*F\n+ 1 MemberCardRepository.kt\ncom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository$getMemberCard$2\n*L\n50#1:88,2\n*E\n"})
public final class MemberCardRepository$getMemberCard$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends LoyaltyMemberCardDomain>>, Object> {
    final /* synthetic */ String $cardNumber;
    int label;
    final /* synthetic */ MemberCardRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberCardRepository$getMemberCard$2(MemberCardRepository memberCardRepository, String str, C11045c<? super MemberCardRepository$getMemberCard$2> cVar) {
        super(1, cVar);
        this.this$0 = memberCardRepository;
        this.$cardNumber = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new MemberCardRepository$getMemberCard$2(this.this$0, this.$cardNumber, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ApiMemberCardService access$getService$p = this.this$0.service;
            HashMap defaultHeaders$default = LoyaltyHeaders.getDefaultHeaders$default(this.this$0.loyaltyHeaders, this.$cardNumber, (String) null, false, false, true, (String) null, 46, (Object) null);
            this.label = 1;
            obj = access$getService$p.getMemberCard(defaultHeaders$default, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        ResponseBody e = wVar.mo30574e();
        if (e != null) {
            if (LoyaltyErrorResponseKt.isActiveFidError(LoyaltyErrorResponseKt.transform(e))) {
                Result.C10852a aVar = Result.f28060a;
                obj4 = Result.m38702b(C11661u0.m45734a(new ActiveFidError("Error active fid")));
            } else {
                Result.C10852a aVar2 = Result.f28060a;
                obj4 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error to get member card")));
            }
            return Result.m38701a(obj4);
        }
        LoyaltyCardGetMemberResponse loyaltyCardGetMemberResponse = (LoyaltyCardGetMemberResponse) wVar.mo30572a();
        if (loyaltyCardGetMemberResponse != null) {
            String str = this.$cardNumber;
            LoyaltyMemberCardDomain domain = LoyaltyMemberCardDomainKt.toDomain(loyaltyCardGetMemberResponse);
            Iterator it = domain.getCards().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual((Object) str, (Object) ((CardDomain) obj2).getCardNumber())) {
                    break;
                }
            }
            CardDomain cardDomain = (CardDomain) obj2;
            if (cardDomain == null) {
                Result.C10852a aVar3 = Result.f28060a;
                obj3 = Result.m38702b(C11661u0.m45734a(new InvalidCardError("Invalid Card}")));
            } else if (LoyaltyMemberCardDomainKt.isTemporaryStatusAccount(domain, cardDomain)) {
                obj3 = LoyaltyMemberCardDomainKt.activeFidOrTerminalError(domain, cardDomain);
            } else if (LoyaltyMemberCardDomainKt.isValidCard(domain, cardDomain)) {
                Result.C10852a aVar4 = Result.f28060a;
                obj3 = Result.m38702b(domain);
            } else if (LoyaltyMemberCardDomainKt.isPassCardInactive(cardDomain)) {
                Result.C10852a aVar5 = Result.f28060a;
                obj3 = Result.m38702b(C11661u0.m45734a(new InactivePassCardError("Inactive Card")));
            } else {
                Result.C10852a aVar6 = Result.f28060a;
                obj3 = Result.m38702b(C11661u0.m45734a(new InvalidCardError("Invalid Card}")));
            }
            return Result.m38701a(obj3);
        }
        Result.C10852a aVar7 = Result.f28060a;
        return Result.m38701a(Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error to get member card"))));
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<LoyaltyMemberCardDomain>> cVar) {
        return ((MemberCardRepository$getMemberCard$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
