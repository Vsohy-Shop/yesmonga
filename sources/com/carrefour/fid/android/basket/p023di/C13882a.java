package com.carrefour.fid.android.basket.p023di;

import com.carrefour.fid.android.basket.data.api.headers.C13879a;
import com.carrefour.fid.android.basket.data.api.services.C13881a;
import com.carrefour.fid.android.basket.domain.interactors.BasketAddPromoCodeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketAddPromotionToCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketBookSlotForCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketCheckNalBasketValidationUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketClearByReferenceUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketDeleteCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketDeleteYieldFeesForCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketDetailsUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketGetBasketNumberUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketGetOfferCountInBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketItemDeleteUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketItemQuantityUpdateUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketByReferenceUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketItemQuantityToSellUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketsItemCountUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromoCodeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromotionFromCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketSetDeliveryTypeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketSwitchFacilityServiceInBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketSynchronizeCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketUnBookSlotForCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase;
import com.carrefour.fid.android.basket.domain.interactors.C13907d;
import com.carrefour.fid.android.basket.domain.interactors.C13908d0;
import com.carrefour.fid.android.basket.domain.interactors.C13913g;
import com.carrefour.fid.android.basket.domain.interactors.C13914g0;
import com.carrefour.fid.android.basket.domain.interactors.C13936k0;
import com.carrefour.fid.android.basket.domain.interactors.C13939m;
import com.carrefour.fid.android.basket.domain.interactors.C13945p;
import com.carrefour.fid.android.basket.domain.interactors.C13951s;
import com.carrefour.fid.android.basket.domain.interactors.C13960u;
import com.carrefour.fid.android.basket.domain.interactors.C13968z;
import com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket;
import com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37554a;
import com.carrefour.fid.android.domain.interactors.basket.C37556a0;
import com.carrefour.fid.android.domain.interactors.basket.C37557b;
import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37560c;
import com.carrefour.fid.android.domain.interactors.basket.C37561c0;
import com.carrefour.fid.android.domain.interactors.basket.C37563d0;
import com.carrefour.fid.android.domain.interactors.basket.C37564e;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37567f;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37570g;
import com.carrefour.fid.android.domain.interactors.basket.C37571g0;
import com.carrefour.fid.android.domain.interactors.basket.C37573h;
import com.carrefour.fid.android.domain.interactors.basket.C37575i;
import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import com.carrefour.fid.android.domain.interactors.basket.C37577j;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.basket.C37579k;
import com.carrefour.fid.android.domain.interactors.basket.C37581k0;
import com.carrefour.fid.android.domain.interactors.basket.C37583l;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.basket.C37585m;
import com.carrefour.fid.android.domain.interactors.basket.C37586m0;
import com.carrefour.fid.android.domain.interactors.basket.C37587n;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.basket.C37591o0;
import com.carrefour.fid.android.domain.interactors.basket.C37593p;
import com.carrefour.fid.android.domain.interactors.basket.C37594p0;
import com.carrefour.fid.android.domain.interactors.basket.C37595q;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.interactors.basket.C37597s;
import com.carrefour.fid.android.domain.interactors.basket.C37599t;
import com.carrefour.fid.android.domain.interactors.basket.C37600u;
import com.carrefour.fid.android.domain.interactors.basket.C37603x;
import com.carrefour.fid.android.domain.interactors.basket.C37605y;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.product.C37748a;
import com.carrefour.fid.android.domain.interactors.product.C37751c;
import com.carrefour.fid.android.domain.interactors.product.C37803u;
import com.carrefour.fid.android.shared.network.C28801b;
import com.carrefour.fid.android.shared.p045di.annotation.C28660d;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.basket.di.a */
public interface C13882a {
    @C12579k

    /* renamed from: a */
    public static final C13883a f33842a = C13883a.f33843a;

    /* renamed from: com.carrefour.fid.android.basket.di.a$a */
    public static final class C13883a {

        /* renamed from: a */
        public static final /* synthetic */ C13883a f33843a = new C13883a();

        @C10315i
        @C12579k
        /* renamed from: a */
        public final C13881a mo33262a(@C28660d @C12579k C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "retrofit");
            Object g = xVar.mo30586g(C13881a.class);
            Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(BasketService::class.java)");
            return (C13881a) g;
        }
    }

    @C10147a
    @C12579k
    /* renamed from: A */
    C37751c mo33221A(@C12579k BasketItemDeleteUseCase basketItemDeleteUseCase);

    @C10147a
    @C12579k
    /* renamed from: B */
    C37748a mo33222B(@C12579k BasketClearByReferenceUseCase basketClearByReferenceUseCase);

    @C10147a
    @C12579k
    /* renamed from: C */
    C37597s mo33223C(@C12579k C13960u uVar);

    @C10147a
    @C12579k
    /* renamed from: D */
    C37583l mo33224D(@C12579k C13939m mVar);

    @C10147a
    @C12579k
    /* renamed from: E */
    C37575i mo33225E(@C12579k BasketDeleteCurrentBasketUseCase basketDeleteCurrentBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: F */
    C37560c mo33226F(@C12579k BasketAddPromotionToCurrentBasketUseCase basketAddPromotionToCurrentBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: G */
    C37603x mo33227G(@C12579k BasketObserveBasketByReferenceUseCase basketObserveBasketByReferenceUseCase);

    @C10147a
    @C12579k
    /* renamed from: H */
    C37570g mo33228H(@C12579k BasketCheckSelectedServiceAndBasketSynchronicityUseCase basketCheckSelectedServiceAndBasketSynchronicityUseCase);

    @C10147a
    @C12579k
    /* renamed from: I */
    C37557b mo33229I(@C12579k BasketAddPromoCodeUseCase basketAddPromoCodeUseCase);

    @C10147a
    @C12579k
    /* renamed from: J */
    C37581k0 mo33230J(@C12579k BasketDetailsUseCase basketDetailsUseCase);

    @C10147a
    @C12579k
    /* renamed from: K */
    C37567f mo33231K(@C12579k BasketCheckNalBasketValidationUseCase basketCheckNalBasketValidationUseCase);

    @C10147a
    @C12579k
    /* renamed from: L */
    C37591o0 mo33232L(@C12579k BasketUpdateBasketUseCase basketUpdateBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: M */
    C37595q mo33233M(@C12579k BasketGetOfferCountInBasketUseCase basketGetOfferCountInBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: N */
    C37594p0 mo33234N(@C12579k BasketUpdateYieldFeesForCurrentBasketUseCase basketUpdateYieldFeesForCurrentBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: O */
    C37566e0 mo33235O(@C12579k C13936k0 k0Var);

    @C10147a
    @C12579k
    /* renamed from: a */
    C37586m0 mo33236a(@C12579k BasketUnBookSlotForCurrentBasketUseCase basketUnBookSlotForCurrentBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37563d0 mo33237b(@C12579k BasketRemovePromotionFromCurrentBasketUseCase basketRemovePromotionFromCurrentBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37803u mo33238c(@C12579k BasketItemQuantityUpdateUseCase basketItemQuantityUpdateUseCase);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37588n0 mo33239d(@C12579k BasketUpdateBasketContentUseCase basketUpdateBasketContentUseCase);

    @C10147a
    @C12579k
    /* renamed from: e */
    C37573h mo33240e(@C12579k C13913g gVar);

    @C10147a
    @C12579k
    /* renamed from: f */
    C37571g0 mo33241f(@C12579k BasketSetDeliveryTypeUseCase basketSetDeliveryTypeUseCase);

    @C10147a
    @C12579k
    /* renamed from: g */
    C37569f0 mo33242g(@C12579k BasketRetrieveBasketUseCase basketRetrieveBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: h */
    C37587n mo33243h(@C12579k BasketsListUseCase basketsListUseCase);

    @C10147a
    @C12579k
    /* renamed from: i */
    C37559b0 mo33244i(@C12579k C13914g0 g0Var);

    @C10147a
    @C12579k
    /* renamed from: j */
    C37600u mo33245j(@C12579k C13968z zVar);

    @C10147a
    @C12579k
    /* renamed from: k */
    C37578j0 mo33246k(@C12579k BasketSwitchFacilityServiceInBasketUseCase basketSwitchFacilityServiceInBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: l */
    C37606z mo33247l(@C12579k C13908d0 d0Var);

    @C10147a
    @C12579k
    /* renamed from: m */
    C37584l0 mo33248m(@C12579k BasketSynchronizeCurrentBasketUseCase basketSynchronizeCurrentBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: n */
    C37576i0 mo33249n(@C12579k BasketSwitchBasketTypeUseCase basketSwitchBasketTypeUseCase);

    @C10147a
    @C12579k
    /* renamed from: o */
    C37579k mo33250o(@C12579k C13907d dVar);

    @C10147a
    @C12579k
    /* renamed from: p */
    C37561c0 mo33251p(@C12579k BasketRemovePromoCodeUseCase basketRemovePromoCodeUseCase);

    @C10147a
    @C12579k
    /* renamed from: q */
    C37564e mo33252q(@C12579k BasketBookSlotForCurrentBasketUseCase basketBookSlotForCurrentBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: r */
    C37554a mo33253r(@C12579k BasketAddOneMoreItemHomeDeliveryNalBasket basketAddOneMoreItemHomeDeliveryNalBasket);

    @C10147a
    @C12579k
    /* renamed from: s */
    C37605y mo33254s(@C12579k BasketObserveBasketItemQuantityToSellUseCase basketObserveBasketItemQuantityToSellUseCase);

    @C10147a
    @C12579k
    /* renamed from: t */
    C37585m mo33255t(@C12579k BasketGetBasketNumberUseCase basketGetBasketNumberUseCase);

    @C10147a
    @C12579k
    /* renamed from: u */
    C28801b mo33256u(@C12579k C13879a aVar);

    @C10147a
    @C12579k
    /* renamed from: v */
    C37577j mo33257v(@C12579k BasketDeleteYieldFeesForCurrentBasketUseCase basketDeleteYieldFeesForCurrentBasketUseCase);

    @C10147a
    @C12579k
    /* renamed from: w */
    C37556a0 mo33258w(@C12579k BasketObserveBasketsItemCountUseCase basketObserveBasketsItemCountUseCase);

    @C10147a
    @C12579k
    /* renamed from: x */
    C37596r mo33259x(@C12579k C13951s sVar);

    @C10147a
    @C12579k
    /* renamed from: y */
    C37593p mo33260y(@C12579k C13945p pVar);

    @C10147a
    @C12579k
    /* renamed from: z */
    C37599t mo33261z(@C12579k BasketInitBasketUseCase basketInitBasketUseCase);
}
