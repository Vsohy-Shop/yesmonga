package com.carrefour.fid.android.core.p056di.module.domain;

import com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase;
import com.carrefour.fid.android.domain.events.checkout.C37494a;
import com.carrefour.fid.android.domain.events.checkout.C37497c;
import com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserInfoWithCardTypeUseCase;
import com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserUuidUseCase;
import com.carrefour.fid.android.domain.interactors.accountmenu.C37536a;
import com.carrefour.fid.android.domain.interactors.accountmenu.C37539c;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37541b;
import com.carrefour.fid.android.domain.interactors.delivery.AppGetDeliveryOptionsUseCase;
import com.carrefour.fid.android.domain.interactors.delivery.C37676b;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37683d;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.feedback.C37688c;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl;
import com.carrefour.fid.android.domain.interactors.order.AppSetAdditionalOrderContextUseCase;
import com.carrefour.fid.android.domain.interactors.order.C37725a;
import com.carrefour.fid.android.domain.interactors.order.C37738n;
import com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase;
import com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase;
import com.carrefour.fid.android.domain.interactors.product.C37764l;
import com.carrefour.fid.android.domain.interactors.product.C37774n;
import com.carrefour.fid.android.domain.interactors.product.GetFavoriteProductsFlowUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppAddProductToShoppingListUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppObserveShoppingListUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.C37852g;
import com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase;
import com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase;
import com.carrefour.fid.android.domain.interactors.user.C37874b;
import com.carrefour.fid.android.domain.interactors.user.C37883f;
import com.carrefour.fid.android.domain.interactors.user.C37885h;
import com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase;
import com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckUsabillaConsentUseCase;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.core.di.module.domain.j */
public interface C36259j {
    @C10147a
    @C12579k
    /* renamed from: a */
    C37883f mo108230a(@C12579k AccountGetUserInfoWithCardTypeUseCase accountGetUserInfoWithCardTypeUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37541b mo108231b(@C12579k AppSetAdditionalOrderContextUseCase appSetAdditionalOrderContextUseCase);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37688c mo108232c(@C12579k ThirdPartyCheckUsabillaConsentUseCase thirdPartyCheckUsabillaConsentUseCase);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37539c mo108233d(@C12579k C37536a aVar);

    @C10147a
    @C12579k
    /* renamed from: e */
    GetDeliveryRateUseCase mo108234e(@C12579k CmsGetDeliveryRateUseCase cmsGetDeliveryRateUseCase);

    @C10147a
    @C12579k
    /* renamed from: f */
    GetFavoriteProductsFlowUseCase mo108235f(@C12579k C37852g gVar);

    @C10147a
    @C12579k
    /* renamed from: g */
    C37683d mo108236g(@C12579k AppRemoveProductFromShoppingListByGtinUseCase appRemoveProductFromShoppingListByGtinUseCase);

    @C10147a
    @C12579k
    /* renamed from: h */
    C37676b mo108237h(@C12579k AppGetDeliveryOptionsUseCase appGetDeliveryOptionsUseCase);

    @C10147a
    @C12579k
    /* renamed from: i */
    C37764l mo108238i(@C12579k OrderGetCustomerStatusUseCase orderGetCustomerStatusUseCase);

    @C10147a
    @C12579k
    /* renamed from: j */
    C37540a mo108239j(@C12579k C37725a aVar);

    @C10147a
    @C12579k
    /* renamed from: k */
    C37682c mo108240k(@C12579k AppObserveShoppingListUseCase appObserveShoppingListUseCase);

    @C10147a
    @C12579k
    /* renamed from: l */
    C37680a mo108241l(@C12579k AppAddProductToShoppingListUseCase appAddProductToShoppingListUseCase);

    @C10147a
    @C12579k
    /* renamed from: m */
    C37885h mo108242m(@C12579k AccountGetUserUuidUseCase accountGetUserUuidUseCase);

    @C10147a
    @C12579k
    /* renamed from: n */
    C37774n mo108243n(@C12579k ProductGetFavoriteFlowUseCase productGetFavoriteFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: o */
    C37874b mo108244o(@C12579k AppClearUserDataUseCase appClearUserDataUseCase);

    @C10147a
    @C12579k
    /* renamed from: p */
    C37497c mo108245p(@C12579k C37494a aVar);

    @C10147a
    @C12579k
    /* renamed from: q */
    C37738n mo108246q(@C12579k UpdateOrderOnlineUseCase updateOrderOnlineUseCase);

    @C10147a
    @C12579k
    /* renamed from: r */
    C37716b mo108247r(@C12579k OfferListAndBasketControllerImpl offerListAndBasketControllerImpl);

    @C10147a
    @C12579k
    /* renamed from: s */
    C37684e mo108248s(@C12579k AppRemoveProductFromShoppingListUseCase appRemoveProductFromShoppingListUseCase);

    @C10147a
    @C12579k
    /* renamed from: t */
    C37681b mo108249t(@C12579k AppGetShoppingListUseCase appGetShoppingListUseCase);
}
