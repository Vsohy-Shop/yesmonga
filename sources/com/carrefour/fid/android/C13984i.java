package com.carrefour.fid.android;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.core.app.C17180n4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import com.CritizrSDK.C21424c;
import com.appsflyer.AppsFlyerLib;
import com.carrefour.fid.android.C14006j0;
import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource;
import com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource;
import com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource;
import com.carrefour.fid.android.account.data.headers.C13196a;
import com.carrefour.fid.android.account.data.headers.C13198c;
import com.carrefour.fid.android.account.data.headers.C13200e;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.C13204a;
import com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.account.data.service.C13209a;
import com.carrefour.fid.android.account.data.service.C13210b;
import com.carrefour.fid.android.account.data.service.C13212c;
import com.carrefour.fid.android.account.domain.events.C13239a;
import com.carrefour.fid.android.account.domain.interactors.account.C13246a;
import com.carrefour.fid.android.account.domain.interactors.account.C13248c;
import com.carrefour.fid.android.account.domain.interactors.address.AccountUpdateUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.AccountGetAddressGeolocationUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase;
import com.carrefour.fid.android.account.domain.interactors.login.AccountRefreshTokenUseCase;
import com.carrefour.fid.android.account.domain.interactors.login.AccountRevokeTokenUseCase;
import com.carrefour.fid.android.account.domain.interactors.login.C13262a;
import com.carrefour.fid.android.account.domain.interactors.login.C13264c;
import com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoStoreUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserPhoneUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.C13277f;
import com.carrefour.fid.android.account.domain.interactors.user.C13279h;
import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase;
import com.carrefour.fid.android.account.p016di.C13235b;
import com.carrefour.fid.android.account.p016di.C13236c;
import com.carrefour.fid.android.account.p016di.C13237d;
import com.carrefour.fid.android.account.p016di.C13238e;
import com.carrefour.fid.android.account.presentation.analytics.C13286a0;
import com.carrefour.fid.android.account.presentation.analytics.C13287b;
import com.carrefour.fid.android.account.presentation.analytics.C13291e;
import com.carrefour.fid.android.account.presentation.analytics.C13294h;
import com.carrefour.fid.android.account.presentation.analytics.C13298k;
import com.carrefour.fid.android.account.presentation.analytics.C13300m;
import com.carrefour.fid.android.account.presentation.analytics.C13305r;
import com.carrefour.fid.android.account.presentation.analytics.C13308u;
import com.carrefour.fid.android.account.presentation.analytics.C13311x;
import com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate;
import com.carrefour.fid.android.account.presentation.p018ui.AccountActivity;
import com.carrefour.fid.android.account.presentation.p018ui.account.AccountInfoFragment;
import com.carrefour.fid.android.account.presentation.p018ui.account.C13388h;
import com.carrefour.fid.android.account.presentation.p018ui.account.C13398p;
import com.carrefour.fid.android.account.presentation.p018ui.account.C13403u;
import com.carrefour.fid.android.account.presentation.p018ui.account.C13406x;
import com.carrefour.fid.android.account.presentation.p018ui.account.UpdateEmailFragment;
import com.carrefour.fid.android.account.presentation.p018ui.account.UpdateUserInfoFragment;
import com.carrefour.fid.android.account.presentation.p018ui.account.UpdateUserPasswordFragment;
import com.carrefour.fid.android.account.presentation.p018ui.address.C13467i;
import com.carrefour.fid.android.account.presentation.p018ui.address.C13472m;
import com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment;
import com.carrefour.fid.android.account.presentation.p018ui.address.VerifyUserAddressFragment;
import com.carrefour.fid.android.account.presentation.p018ui.create.C13495d;
import com.carrefour.fid.android.account.presentation.p018ui.create.CreateAccountFragment;
import com.carrefour.fid.android.account.presentation.p018ui.forgot.C13522c;
import com.carrefour.fid.android.account.presentation.p018ui.forgot.ForgotPasswordFragment;
import com.carrefour.fid.android.account.presentation.p018ui.signin.C13549d;
import com.carrefour.fid.android.account.presentation.p018ui.signin.SignInFragment;
import com.carrefour.fid.android.account.presentation.p018ui.success.AccountUpdateSuccessFragment;
import com.carrefour.fid.android.account.presentation.p018ui.success.C13560d;
import com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.account.C13576c;
import com.carrefour.fid.android.account.presentation.viewmodels.account.C13582f;
import com.carrefour.fid.android.account.presentation.viewmodels.account.C13588i;
import com.carrefour.fid.android.account.presentation.viewmodels.account.C13594l;
import com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.address.C13637c;
import com.carrefour.fid.android.account.presentation.viewmodels.address.C13643f;
import com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.forgot.C13691c;
import com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.signin.C13704c;
import com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel;
import com.carrefour.fid.android.airship.data.datasource.C13742a;
import com.carrefour.fid.android.airship.data.datasource.C13744c;
import com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl;
import com.carrefour.fid.android.airship.domain.interactor.AirshipGetAirshipInboxUseCase;
import com.carrefour.fid.android.airship.domain.interactor.AirshipGetGaidUseCase;
import com.carrefour.fid.android.airship.domain.interactor.C13750a;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.analytics.p020di.C13819a;
import com.carrefour.fid.android.analytics.p020di.C13820b;
import com.carrefour.fid.android.app.p021ui.C13834a;
import com.carrefour.fid.android.basket.data.api.datasources.BasketApiDataSource;
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
import com.carrefour.fid.android.basket.domain.interactors.BasketInitBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketItemDeleteUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketItemQuantityUpdateUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketByReferenceUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketItemQuantityToSellUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketsItemCountUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketRemovePromoCodeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketSetDeliveryTypeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketSwitchBasketTypeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketSwitchFacilityServiceInBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketSynchronizeCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketUpdateYieldFeesForCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.BasketsListUseCase;
import com.carrefour.fid.android.basket.domain.interactors.C13908d0;
import com.carrefour.fid.android.basket.domain.interactors.C13913g;
import com.carrefour.fid.android.basket.domain.interactors.C13914g0;
import com.carrefour.fid.android.basket.domain.interactors.C13936k0;
import com.carrefour.fid.android.basket.domain.interactors.C13939m;
import com.carrefour.fid.android.basket.domain.interactors.C13945p;
import com.carrefour.fid.android.basket.domain.interactors.C13951s;
import com.carrefour.fid.android.basket.domain.interactors.C13960u;
import com.carrefour.fid.android.basket.domain.interactors.C13968z;
import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderDeleteCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderRetrieveBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderSynchronizeCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase;
import com.carrefour.fid.android.basket.domain.interactors.additionalorder.CheckAdditionalOrderPermissionUseCase;
import com.carrefour.fid.android.basket.domain.interactors.home.BasketAddOneMoreItemHomeDeliveryNalBasket;
import com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.C13924e;
import com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.DeleteBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.FetchBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExpiredFacilityStoreUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.InitializeNonFoodBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketTypeUseCase;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdBasketDeleteCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.basket.p023di.C13884b;
import com.carrefour.fid.android.basket.p023di.C13885c;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffMidFidApiService;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi;
import com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage;
import com.carrefour.fid.android.catalogs.data.api.datasources.remote.CatalogsRemoteDataSource;
import com.carrefour.fid.android.catalogs.data.api.services.C39401a;
import com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource;
import com.carrefour.fid.android.catalogs.data.repositories.CatalogRepository;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsAddCatalogFavoriteProductUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogActionUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogDetailsUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogFavoriteProductsUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogListUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsGetCatalogsListByStoreIdUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteListUseCase;
import com.carrefour.fid.android.catalogs.domain.interactors.CatalogsRemoveCatalogFavoriteProductUseCase;
import com.carrefour.fid.android.catalogs.p064di.C39431a;
import com.carrefour.fid.android.catalogs.p064di.C39432b;
import com.carrefour.fid.android.catalogs.p064di.domain.C39433a;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39438b;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39441d;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39443f;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39446h;
import com.carrefour.fid.android.catalogs.presentation.p065ui.C39541e;
import com.carrefour.fid.android.catalogs.presentation.p065ui.CatalogBuilderFragment;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.C39496e;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.CatalogDetailsFragment;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.CatalogProductListFragment;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.C39537b;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.CatalogPagerFragment;
import com.carrefour.fid.android.catalogs.presentation.p065ui.favoriteproducts.CatalogsFavoriteProductListFragment;
import com.carrefour.fid.android.catalogs.presentation.p065ui.productdetails.C39583e;
import com.carrefour.fid.android.catalogs.presentation.p065ui.productdetails.CatalogProductDetailsFragment;
import com.carrefour.fid.android.catalogs.presentation.p065ui.storecatalog.C39608g;
import com.carrefour.fid.android.catalogs.presentation.p065ui.storecatalog.StoreCatalogListFragment;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.C39614c;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.C39620f;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.C39626i;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.C39632l;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.C39706o;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel;
import com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource;
import com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl;
import com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase;
import com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase;
import com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository;
import com.carrefour.fid.android.categories.p066di.C39743b;
import com.carrefour.fid.android.categories.p066di.C39744c;
import com.carrefour.fid.android.categories.presentation.analytics.C39752a;
import com.carrefour.fid.android.categories.presentation.p067ui.department.C39782e;
import com.carrefour.fid.android.categories.presentation.p067ui.department.C39790i;
import com.carrefour.fid.android.categories.presentation.p067ui.department.DepartmentDetailsFragment;
import com.carrefour.fid.android.categories.presentation.p067ui.department.DepartmentFragment;
import com.carrefour.fid.android.categories.presentation.viewmodel.department.C39802d;
import com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel;
import com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource;
import com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource;
import com.carrefour.fid.android.checkout.data.api.services.C39837a;
import com.carrefour.fid.android.checkout.data.api.services.C39838b;
import com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutClearSlotUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotExpressUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotListUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotStoreUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotsUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.CheckoutUpdateSlotLocalStorageUseCase;
import com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase;
import com.carrefour.fid.android.checkout.domain.repositories.SlotRepository;
import com.carrefour.fid.android.checkout.p070di.C39848a;
import com.carrefour.fid.android.checkout.p070di.C39849b;
import com.carrefour.fid.android.checkout.p070di.C39850c;
import com.carrefour.fid.android.checkout.p070di.domain.C39851a;
import com.carrefour.fid.android.checkout.presentation.analytics.C39866a;
import com.carrefour.fid.android.checkout.presentation.p071ui.C39883c;
import com.carrefour.fid.android.checkout.presentation.p071ui.PaymentMethodFragment;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39929g;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.C39934k;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.ServiceSlotFragment;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.ServiceSlotOmrFragment;
import com.carrefour.fid.android.checkout.presentation.viewmodels.C39949c;
import com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.C39955c;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.C39961f;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel;
import com.carrefour.fid.android.cms.data.cache.StorePetrolCache;
import com.carrefour.fid.android.cms.data.headers.C40020a;
import com.carrefour.fid.android.cms.data.services.C40023a;
import com.carrefour.fid.android.cms.domain.interactors.GetCheckoutCgvUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsCarouselsUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsOffersUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidListUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetLoyaltyBonusListUseCase;
import com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase;
import com.carrefour.fid.android.cms.domain.repositories.CmsRepository;
import com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository;
import com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage;
import com.carrefour.fid.android.consent.domain.interactors.ClearConsentUserCase;
import com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase;
import com.carrefour.fid.android.consent.domain.interactors.ConsentGetRefusedAndMissingConsentsUseCase;
import com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase;
import com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase;
import com.carrefour.fid.android.consent.domain.interactors.ShouldDisplayUserConsentsBackdropUseCase;
import com.carrefour.fid.android.consent.domain.repositories.ConsentRepository;
import com.carrefour.fid.android.consent.p054di.HiltWrapper_ConsentModule;
import com.carrefour.fid.android.consent.presentation.p055ui.ConfigureConsentOptinsFragment;
import com.carrefour.fid.android.consent.presentation.p055ui.ConfigureConsentOptinsFragment_MembersInjector;
import com.carrefour.fid.android.consent.presentation.p055ui.ConsentBackDropFragment;
import com.carrefour.fid.android.consent.presentation.p055ui.ConsentBackDropFragment_MembersInjector;
import com.carrefour.fid.android.consent.presentation.viewmodels.C36144x9a6c1668;
import com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel;
import com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel;
import com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.core.auth.C36146b;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.auth.TokenRefresherImpl;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.core.network.RetrofitFactory;
import com.carrefour.fid.android.core.network.headers.C36320a;
import com.carrefour.fid.android.core.network.headers.C36322c;
import com.carrefour.fid.android.core.network.headers.C36324e;
import com.carrefour.fid.android.core.network.headers.C36326g;
import com.carrefour.fid.android.core.p056di.module.C36245c;
import com.carrefour.fid.android.core.p056di.module.C36246d;
import com.carrefour.fid.android.core.p056di.module.C36260e;
import com.carrefour.fid.android.core.p056di.module.C36261f;
import com.carrefour.fid.android.core.p056di.module.C36262g;
import com.carrefour.fid.android.core.p056di.module.C36263h;
import com.carrefour.fid.android.core.p056di.module.C36264i;
import com.carrefour.fid.android.core.p056di.module.C36265j;
import com.carrefour.fid.android.core.p056di.module.C36266k;
import com.carrefour.fid.android.core.p056di.module.C36267l;
import com.carrefour.fid.android.core.p056di.module.C36268m;
import com.carrefour.fid.android.core.p056di.module.C36269n;
import com.carrefour.fid.android.core.p056di.module.C36283o;
import com.carrefour.fid.android.core.p056di.module.C36284p;
import com.carrefour.fid.android.core.p056di.module.C36285q;
import com.carrefour.fid.android.core.p056di.module.C36286r;
import com.carrefour.fid.android.core.p056di.module.C36287s;
import com.carrefour.fid.android.core.p056di.module.C36288t;
import com.carrefour.fid.android.core.p056di.module.C36289u;
import com.carrefour.fid.android.core.p056di.module.apis.C36198a;
import com.carrefour.fid.android.core.p056di.module.apis.C36199a0;
import com.carrefour.fid.android.core.p056di.module.apis.C36200b;
import com.carrefour.fid.android.core.p056di.module.apis.C36201b0;
import com.carrefour.fid.android.core.p056di.module.apis.C36202c;
import com.carrefour.fid.android.core.p056di.module.apis.C36203c0;
import com.carrefour.fid.android.core.p056di.module.apis.C36204d;
import com.carrefour.fid.android.core.p056di.module.apis.C36205d0;
import com.carrefour.fid.android.core.p056di.module.apis.C36206e;
import com.carrefour.fid.android.core.p056di.module.apis.C36207e0;
import com.carrefour.fid.android.core.p056di.module.apis.C36208f;
import com.carrefour.fid.android.core.p056di.module.apis.C36209f0;
import com.carrefour.fid.android.core.p056di.module.apis.C36210g;
import com.carrefour.fid.android.core.p056di.module.apis.C36211g0;
import com.carrefour.fid.android.core.p056di.module.apis.C36212h;
import com.carrefour.fid.android.core.p056di.module.apis.C36213h0;
import com.carrefour.fid.android.core.p056di.module.apis.C36214i;
import com.carrefour.fid.android.core.p056di.module.apis.C36215i0;
import com.carrefour.fid.android.core.p056di.module.apis.C36216j;
import com.carrefour.fid.android.core.p056di.module.apis.C36217j0;
import com.carrefour.fid.android.core.p056di.module.apis.C36218k;
import com.carrefour.fid.android.core.p056di.module.apis.C36219k0;
import com.carrefour.fid.android.core.p056di.module.apis.C36220l;
import com.carrefour.fid.android.core.p056di.module.apis.C36221l0;
import com.carrefour.fid.android.core.p056di.module.apis.C36222m;
import com.carrefour.fid.android.core.p056di.module.apis.C36223m0;
import com.carrefour.fid.android.core.p056di.module.apis.C36224n;
import com.carrefour.fid.android.core.p056di.module.apis.C36225n0;
import com.carrefour.fid.android.core.p056di.module.apis.C36226o;
import com.carrefour.fid.android.core.p056di.module.apis.C36227o0;
import com.carrefour.fid.android.core.p056di.module.apis.C36229p0;
import com.carrefour.fid.android.core.p056di.module.apis.C36230q;
import com.carrefour.fid.android.core.p056di.module.apis.C36231q0;
import com.carrefour.fid.android.core.p056di.module.apis.C36232r;
import com.carrefour.fid.android.core.p056di.module.apis.C36233r0;
import com.carrefour.fid.android.core.p056di.module.apis.C36234s;
import com.carrefour.fid.android.core.p056di.module.apis.C36235s0;
import com.carrefour.fid.android.core.p056di.module.apis.C36236t;
import com.carrefour.fid.android.core.p056di.module.apis.C36237t0;
import com.carrefour.fid.android.core.p056di.module.apis.C36238u;
import com.carrefour.fid.android.core.p056di.module.apis.C36239v;
import com.carrefour.fid.android.core.p056di.module.apis.C36240w;
import com.carrefour.fid.android.core.p056di.module.apis.C36241x;
import com.carrefour.fid.android.core.p056di.module.apis.C36242y;
import com.carrefour.fid.android.core.p056di.module.apis.C36243z;
import com.carrefour.fid.android.core.p056di.module.data.C36248b;
import com.carrefour.fid.android.core.p056di.module.domain.C36251c;
import com.carrefour.fid.android.core.p056di.module.domain.C36252d;
import com.carrefour.fid.android.core.p056di.module.domain.C36253e;
import com.carrefour.fid.android.core.p056di.module.domain.C36254f;
import com.carrefour.fid.android.core.p056di.module.domain.C36255g;
import com.carrefour.fid.android.core.p056di.module.network.C36270a;
import com.carrefour.fid.android.core.p056di.module.network.C36271b;
import com.carrefour.fid.android.core.p056di.module.network.C36273d;
import com.carrefour.fid.android.core.p056di.module.network.C36274e;
import com.carrefour.fid.android.core.p056di.module.network.C36275f;
import com.carrefour.fid.android.core.p056di.module.network.C36276g;
import com.carrefour.fid.android.core.p056di.module.network.C36277h;
import com.carrefour.fid.android.core.p056di.module.network.C36278i;
import com.carrefour.fid.android.core.p056di.module.network.C36279j;
import com.carrefour.fid.android.core.p056di.module.network.C36280k;
import com.carrefour.fid.android.core.p056di.module.network.C36281l;
import com.carrefour.fid.android.core.p056di.module.network.C36282m;
import com.carrefour.fid.android.data.datasource.C36388a;
import com.carrefour.fid.android.data.datasource.CriteoTrackingGateway;
import com.carrefour.fid.android.data.datasource.DlvDataSource;
import com.carrefour.fid.android.data.datasource.LuckyCartGateway;
import com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway;
import com.carrefour.fid.android.data.datasource.PaymentGateway;
import com.carrefour.fid.android.data.datasource.ShoppingListDataSource;
import com.carrefour.fid.android.data.entities.mapper.C36457a;
import com.carrefour.fid.android.data.entities.mapper.C36459a1;
import com.carrefour.fid.android.data.entities.mapper.C36465b0;
import com.carrefour.fid.android.data.entities.mapper.C36474d0;
import com.carrefour.fid.android.data.entities.mapper.C36487g;
import com.carrefour.fid.android.data.entities.mapper.C36488g0;
import com.carrefour.fid.android.data.entities.mapper.C36494i;
import com.carrefour.fid.android.data.entities.mapper.C36496i0;
import com.carrefour.fid.android.data.entities.mapper.C36501k;
import com.carrefour.fid.android.data.entities.mapper.C36507m;
import com.carrefour.fid.android.data.entities.mapper.C36508m0;
import com.carrefour.fid.android.data.entities.mapper.C36512o;
import com.carrefour.fid.android.data.entities.mapper.C36513o0;
import com.carrefour.fid.android.data.entities.mapper.C36518q;
import com.carrefour.fid.android.data.entities.mapper.C36522r0;
import com.carrefour.fid.android.data.entities.mapper.C36523s;
import com.carrefour.fid.android.data.entities.mapper.C36529u;
import com.carrefour.fid.android.data.entities.mapper.C36531u0;
import com.carrefour.fid.android.data.entities.mapper.C36537w;
import com.carrefour.fid.android.data.entities.mapper.C36540w0;
import com.carrefour.fid.android.data.entities.mapper.C36544y;
import com.carrefour.fid.android.data.entities.mapper.C36546y0;
import com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper;
import com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper;
import com.carrefour.fid.android.data.managers.C36555b;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.data.provider.headers.C36558a;
import com.carrefour.fid.android.data.provider.headers.C36560c;
import com.carrefour.fid.android.data.provider.headers.C36562e;
import com.carrefour.fid.android.data.provider.headers.C36569k;
import com.carrefour.fid.android.data.provider.headers.C36571m;
import com.carrefour.fid.android.data.provider.headers.C36573o;
import com.carrefour.fid.android.data.provider.headers.C36575q;
import com.carrefour.fid.android.data.provider.headers.C36577s;
import com.carrefour.fid.android.data.provider.headers.C36579u;
import com.carrefour.fid.android.data.provider.headers.C36581w;
import com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider;
import com.carrefour.fid.android.data.repositories.APIMProductDetailsRepository;
import com.carrefour.fid.android.data.repositories.APIMProductsRepository;
import com.carrefour.fid.android.data.repositories.ArsenalGameRepository;
import com.carrefour.fid.android.data.repositories.C36590c;
import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.data.repositories.GazStationRepository;
import com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository;
import com.carrefour.fid.android.data.repositories.LuckyCartRepository;
import com.carrefour.fid.android.data.repositories.MemoRepository;
import com.carrefour.fid.android.data.repositories.OneTrustRepository;
import com.carrefour.fid.android.data.repositories.OrderFeedbackRepository;
import com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository;
import com.carrefour.fid.android.data.repositories.OrderOfflineRepository;
import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.data.repositories.PaymentRepository;
import com.carrefour.fid.android.data.repositories.RatingRepository;
import com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository;
import com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository;
import com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository;
import com.carrefour.fid.android.data.repositories.StickersRepository;
import com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource;
import com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource;
import com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource;
import com.carrefour.fid.android.data.service.C36620a;
import com.carrefour.fid.android.data.service.C36621b;
import com.carrefour.fid.android.data.service.C36623c;
import com.carrefour.fid.android.data.service.C36624d;
import com.carrefour.fid.android.data.service.C36625e;
import com.carrefour.fid.android.data.service.C36627f;
import com.carrefour.fid.android.data.service.C36629h;
import com.carrefour.fid.android.data.service.C36630i;
import com.carrefour.fid.android.data.service.C36631j;
import com.carrefour.fid.android.data.service.C36632k;
import com.carrefour.fid.android.data.service.C36633l;
import com.carrefour.fid.android.data.service.C36634m;
import com.carrefour.fid.android.data.service.C36635n;
import com.carrefour.fid.android.data.service.C36636o;
import com.carrefour.fid.android.data.service.C36637p;
import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.events.checkout.C37494a;
import com.carrefour.fid.android.domain.events.checkout.C37497c;
import com.carrefour.fid.android.domain.interactors.C37607c;
import com.carrefour.fid.android.domain.interactors.account.C37521g;
import com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase;
import com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.DeleteMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserInfoWithCardTypeUseCase;
import com.carrefour.fid.android.domain.interactors.account.user.AccountGetUserUuidUseCase;
import com.carrefour.fid.android.domain.interactors.accountmenu.C37536a;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalBannersUseCase;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalTopBannersUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.MixingProductsRemoteConfigUseCase;
import com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase;
import com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase;
import com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase;
import com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase;
import com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.C37653k;
import com.carrefour.fid.android.domain.interactors.coupons.CouponsIsScanProductOnBoardingUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.CouponsSetScanProductViewedUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCatalogCriteoBannerUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoTrackingCriteoUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoTrackingSyncUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase;
import com.carrefour.fid.android.domain.interactors.delivery.AppGetDeliveryOptionsUseCase;
import com.carrefour.fid.android.domain.interactors.feedback.C37686a;
import com.carrefour.fid.android.domain.interactors.feedback.OrderFeedbackUseCase;
import com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase;
import com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase;
import com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase;
import com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase;
import com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase;
import com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase;
import com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase;
import com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl;
import com.carrefour.fid.android.domain.interactors.order.AppSetAdditionalOrderContextUseCase;
import com.carrefour.fid.android.domain.interactors.order.C37725a;
import com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase;
import com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase;
import com.carrefour.fid.android.domain.interactors.order.IsEligibleToOnSitePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase;
import com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase;
import com.carrefour.fid.android.domain.interactors.order.UpdateOrderOnlineUseCase;
import com.carrefour.fid.android.domain.interactors.privacy.PrivacyUseCase;
import com.carrefour.fid.android.domain.interactors.product.C37786s;
import com.carrefour.fid.android.domain.interactors.product.C37802t;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase;
import com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase;
import com.carrefour.fid.android.domain.interactors.product.recommended.RecommendedProductUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.AddSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.ClearSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.rating.GetRatingUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37830b;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37833d;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppAddProductToShoppingListUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppObserveShoppingListUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase;
import com.carrefour.fid.android.domain.interactors.shoppinglist.C37852g;
import com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase;
import com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase;
import com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase;
import com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase;
import com.carrefour.fid.android.domain.interactors.store.GetDeliveryStoreUseCase;
import com.carrefour.fid.android.domain.interactors.user.AppClearUserDataUseCase;
import com.carrefour.fid.android.domain.repositories.C38198g;
import com.carrefour.fid.android.domain.repositories.DlvRepository;
import com.carrefour.fid.android.domain.repositories.ShoppingListRepository;
import com.carrefour.fid.android.ecommerce.checkout.manager.C38208a;
import com.carrefour.fid.android.ecosystem.p058ui.fragment.EcosystemFragment;
import com.carrefour.fid.android.legalnotice.p059ui.fragments.C38241d;
import com.carrefour.fid.android.legalnotice.p059ui.fragments.LegalNoticeFragment;
import com.carrefour.fid.android.logm.C38243b;
import com.carrefour.fid.android.logm.data.datasource.LogMDataSource;
import com.carrefour.fid.android.logm.data.repositories.LoggerRepository;
import com.carrefour.fid.android.logm.data.service.C38276a;
import com.carrefour.fid.android.logm.domain.interactors.LogMLogToLogMUseCase;
import com.carrefour.fid.android.logm.domain.interactors.LogMSendAllRemoteLogsUseCase;
import com.carrefour.fid.android.logm.p060di.C38277a;
import com.carrefour.fid.android.logm.p060di.C38280c;
import com.carrefour.fid.android.logm.p060di.C38281d;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.core.interceptors.MidFidErrorInterceptor;
import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyAuthRepository;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository;
import com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository;
import com.carrefour.fid.android.loyalty.data.services.ApiMemberCardService;
import com.carrefour.fid.android.loyalty.data.services.IamAuthLoyaltyApiService;
import com.carrefour.fid.android.loyalty.data.services.LinkLoyaltyCardApiService;
import com.carrefour.fid.android.loyalty.data.services.MidFidApiService;
import com.carrefour.fid.android.loyalty.domain.interactors.ActivateLoyaltyCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.ClearLoyaltyUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyCardNumberFromPreferencesUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyChannelsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetOtpUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetUserTransactionsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.IsFirstVisitPrimesFidelityUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.SetFirstVisitPrimesFidelityUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.ValidateOtpUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.hasValidFidCardUseCaseImpl;
import com.carrefour.fid.android.loyalty.p062di.HiltWrapper_LoyaltyModule;
import com.carrefour.fid.android.loyalty.presentation.analytics.AcceptLoyaltyCguAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.AttachCardAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.BlockedCardAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.CreateCardAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.InitSecretCodeAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAmountHistoryAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAnalyticsInterfaceDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyBonusAnalyticsInterfaceDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyDetailAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.SuccessCreateCardAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.analytics.ValidateOtpAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.CreateOrAttachCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.CreateOrAttachCardViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.history.C38298xb9044ccf;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.navigation.C38321d;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.performance.p063di.C38329a;
import com.carrefour.fid.android.performance.p063di.C38330b;
import com.carrefour.fid.android.performance.p063di.C38331c;
import com.carrefour.fid.android.performance.p063di.C38332d;
import com.carrefour.fid.android.presentation.analytics.C38360b;
import com.carrefour.fid.android.presentation.analytics.C38364e;
import com.carrefour.fid.android.presentation.models.mapper.C38507h;
import com.carrefour.fid.android.presentation.models.mapper.C38514l;
import com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper;
import com.carrefour.fid.android.presentation.p035ui.account.BaseAccountFragment;
import com.carrefour.fid.android.presentation.p035ui.account.anonymous.AccountAnonymousFragment;
import com.carrefour.fid.android.presentation.p035ui.account.anonymous.C22885f;
import com.carrefour.fid.android.presentation.p035ui.account.consent.AccountConsentDataTabFragment;
import com.carrefour.fid.android.presentation.p035ui.account.consent.AccountConsentOptinsTabFragment;
import com.carrefour.fid.android.presentation.p035ui.account.consent.AccountConsentParameterFragment;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22927f;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22929h;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.home.AccountListHomeFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.home.C22964b;
import com.carrefour.fid.android.presentation.p035ui.account.list.memo.C22984d;
import com.carrefour.fid.android.presentation.p035ui.account.list.memo.MemoListFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.order.AccountListOrderFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.order.C23006c;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.AccountListShoppingFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23061b;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23080h;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.ShoppingListFragment;
import com.carrefour.fid.android.presentation.p035ui.account.menu.AccountMenuFragment;
import com.carrefour.fid.android.presentation.p035ui.account.menu.C23107c;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderDepartmentFragment;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFragment;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFrequentPurchasesFragment;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderMyListsFragment;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderSignInBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.C23212c;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.C23221h;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.C23223j;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.C23225l;
import com.carrefour.fid.android.presentation.p035ui.challengeFid.ChallengeFidDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23473f;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.CheckoutBasketsListFragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23457b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23555g;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.NonFoodCheckoutStep1Fragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics.C23517b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23668f;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23615b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map.C23697g;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map.PickupPointsMapFragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23358d;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23362g;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23368j;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23375n;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23377p;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23435v;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutFragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1FooterFragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1Fragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep2Fragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep3CgvFragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep3Fragment;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep4Fragment;
import com.carrefour.fid.android.presentation.p035ui.confirmation.C23760k;
import com.carrefour.fid.android.presentation.p035ui.confirmation.C23768r;
import com.carrefour.fid.android.presentation.p035ui.confirmation.C23775y;
import com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutPaymentErrorFragment;
import com.carrefour.fid.android.presentation.p035ui.confirmation.LuckyCartBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.coupons.C23793d;
import com.carrefour.fid.android.presentation.p035ui.coupons.CouponBarcodeFragment;
import com.carrefour.fid.android.presentation.p035ui.coupons.CouponsScanBarcodeFragment;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23788b;
import com.carrefour.fid.android.presentation.p035ui.coupons.filter.CouponsFilterFragment;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23885h;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListFragment;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.C23914c;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23950e;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics.C23944b;
import com.carrefour.fid.android.presentation.p035ui.environment.AppEnvironmentSelectionFragment;
import com.carrefour.fid.android.presentation.p035ui.environment.C23990c;
import com.carrefour.fid.android.presentation.p035ui.gazStation.BaseServiceStationsFragment;
import com.carrefour.fid.android.presentation.p035ui.gazStation.C24036m;
import com.carrefour.fid.android.presentation.p035ui.gazStation.C24049v;
import com.carrefour.fid.android.presentation.p035ui.gazStation.C24054z;
import com.carrefour.fid.android.presentation.p035ui.gazStation.ServiceStationsCameraFragment;
import com.carrefour.fid.android.presentation.p035ui.gazStation.ServiceStationsLandingPageFragment;
import com.carrefour.fid.android.presentation.p035ui.gazStation.ServiceStationsResultFragment;
import com.carrefour.fid.android.presentation.p035ui.home.C24161i;
import com.carrefour.fid.android.presentation.p035ui.home.HomePageFragment;
import com.carrefour.fid.android.presentation.p035ui.home.carousels.C24127e;
import com.carrefour.fid.android.presentation.p035ui.home.carousels.C24130g;
import com.carrefour.fid.android.presentation.p035ui.home.shop.C24209f;
import com.carrefour.fid.android.presentation.p035ui.home.shop.C24213j;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineShopBasketDetailsFragment;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.BaseLoyaltyFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.attach.AttachCardFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.attach.C24282r;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.attach.InfoCardsFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.LoyaltyBonusListFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.PrimeFidFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.AcceptLoyaltyCguFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.C24416j;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateOrAttachCardFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateSecretCodeFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.SuccessCreateCardFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details.C24493o;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details.LoyaltyDetailViewFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details.LoyaltyMyCardFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details.LoyaltyNotLoggedFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.history.LoyaltyAmountHistoryFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.BlockedCardFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.C24610d;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.C24617h;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.C24629p;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.C24636t;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.ChannelsFidFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.SecretCodeFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.ValidateOtpFragment;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24604b;
import com.carrefour.fid.android.presentation.p035ui.notification.C24652d;
import com.carrefour.fid.android.presentation.p035ui.notification.SubscribeToNewsNotificationFragment;
import com.carrefour.fid.android.presentation.p035ui.onboarding.C24659c;
import com.carrefour.fid.android.presentation.p035ui.onboarding.SplashOnBoardingActivity;
import com.carrefour.fid.android.presentation.p035ui.orders.C24704m;
import com.carrefour.fid.android.presentation.p035ui.orders.OrdersFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.OrdersSuccessHandleFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.legacy.WithdrawalOrderDriveFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.C24775h;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.C24779l;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.OrderLoyaltyCardsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.OrdersOfflineDetailsFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.OrdersOfflineFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper.C24782a;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper.C24784c;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper.C24787e;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper.C24790g;
import com.carrefour.fid.android.presentation.p035ui.orders.online.C25213k;
import com.carrefour.fid.android.presentation.p035ui.orders.online.C25215m;
import com.carrefour.fid.android.presentation.p035ui.orders.online.ListProductsOrderedFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.OrdersOnlineDetailsFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.OrdersOnlineFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.BasketAdditionalOrderFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.C25165d;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.C25174h;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.C25182l;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.ExitAdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.analytics.C24980b;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.C25124h;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.C25139l0;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.C25147p;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.CheckoutPaymentFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.CheckoutStepOneBottomSheetFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.CheckoutStepTwoCgvDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25222e;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.C25404d;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreFragment;
import com.carrefour.fid.android.presentation.p035ui.product.filter.C25444g;
import com.carrefour.fid.android.presentation.p035ui.product.filter.C25449l;
import com.carrefour.fid.android.presentation.p035ui.product.filter.ProductListFiltersDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.filter.ProductListFiltersSortAndFacetFragment;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.C25489d;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.p035ui.product.search.AdditionalOrderProductSearchFragment;
import com.carrefour.fid.android.presentation.p035ui.product.search.C25569f;
import com.carrefour.fid.android.presentation.p035ui.product.search.C25582p;
import com.carrefour.fid.android.presentation.p035ui.product.search.C25689v;
import com.carrefour.fid.android.presentation.p035ui.product.search.ProductSearchFragment;
import com.carrefour.fid.android.presentation.p035ui.product.search.ProductSearchWithListFragment;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.AdditionalOrderSearchResultFragment;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.C25669f;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.C25676m;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.C25680q;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.ProductSearchWithListAllResultsFragment;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.ProductSearchWithListRecommendationResultsFragment;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.ProductSearchWithListResultFragment;
import com.carrefour.fid.android.presentation.p035ui.scan.BarcodeScannerFragment;
import com.carrefour.fid.android.presentation.p035ui.scan.C25715e;
import com.carrefour.fid.android.presentation.p035ui.scan.ScanOnBoardingFragment;
import com.carrefour.fid.android.presentation.p035ui.splash.C25746d;
import com.carrefour.fid.android.presentation.p035ui.splash.SplashActivity;
import com.carrefour.fid.android.presentation.p035ui.store.BaseStoreFragment;
import com.carrefour.fid.android.presentation.trackers.account.C38531a;
import com.carrefour.fid.android.presentation.viewmodels.account.BaseAccountViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.C25760c;
import com.carrefour.fid.android.presentation.viewmodels.account.anonymous.C25755a;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.C25784d;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.C25786e;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.C25794i;
import com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25803f;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25805g;
import com.carrefour.fid.android.presentation.viewmodels.account.list.home.AccountListHomeViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.home.C25807a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.home.C25813e;
import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.C25835a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.C25841e;
import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.order.AccountListOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.order.C25858a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.order.C25865e;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.AccountListShoppingViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25889e;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25896i;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderDepartmentViewModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderMyListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderRecommendedProductsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25948a;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25954e;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25956f;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25962j;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25964k;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25970o;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25972p;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25978t;
import com.carrefour.fid.android.presentation.viewmodels.challengeFid.C25985c;
import com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.C26139c;
import com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26149e;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.C26174d;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.C26188g;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26005c;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26007d;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26014h;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26016i;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26022m;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutCgvViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep4ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.C26097c;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.CheckoutStep2ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.analytics.C26092a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.C26120c;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.analytics.C26115a;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26198c;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26202e;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26204f;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel;
import com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel;
import com.carrefour.fid.android.presentation.viewmodels.coupons.C26219c;
import com.carrefour.fid.android.presentation.viewmodels.coupons.C26234g;
import com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.coupons.filter.C26232c;
import com.carrefour.fid.android.presentation.viewmodels.coupons.filter.CouponsFilterViewModel;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.C26311c;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.C26314e;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.C26320i;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.C26328c;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel;
import com.carrefour.fid.android.presentation.viewmodels.criteo.C26335c;
import com.carrefour.fid.android.presentation.viewmodels.criteo.CriteoBannerViewModel;
import com.carrefour.fid.android.presentation.viewmodels.criteo.CriteoTrackingViewModel;
import com.carrefour.fid.android.presentation.viewmodels.environment.AppEnvironmentSelectionViewModel;
import com.carrefour.fid.android.presentation.viewmodels.environment.C26342c;
import com.carrefour.fid.android.presentation.viewmodels.feesback.C26348c;
import com.carrefour.fid.android.presentation.viewmodels.feesback.FeedbackViewModel;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26350a;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26356e;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26362h;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.C26368k;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.C26380a;
import com.carrefour.fid.android.presentation.viewmodels.home.C26393g;
import com.carrefour.fid.android.presentation.viewmodels.home.C26400k;
import com.carrefour.fid.android.presentation.viewmodels.home.C26479n;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeOnlineShopDetailsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.C26542c;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.C26520c;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.create.C26548c;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.C26560c;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel;
import com.carrefour.fid.android.presentation.viewmodels.luckycart.C26620a;
import com.carrefour.fid.android.presentation.viewmodels.luckycart.C26626e;
import com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel;
import com.carrefour.fid.android.presentation.viewmodels.notification.C26628a;
import com.carrefour.fid.android.presentation.viewmodels.order.C26647c;
import com.carrefour.fid.android.presentation.viewmodels.order.OrdersViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.C26681a;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.C26687e;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.C26689f;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.C26695j;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.C26994c;
import com.carrefour.fid.android.presentation.viewmodels.order.online.C26996d;
import com.carrefour.fid.android.presentation.viewmodels.order.online.C27002h;
import com.carrefour.fid.android.presentation.viewmodels.order.online.C27004i;
import com.carrefour.fid.android.presentation.viewmodels.order.online.C27010m;
import com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderSearchViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26738c;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26821f;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26827i;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26833l;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26983o;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.C26989r;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26785c;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26791f;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26797i;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26803l;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26809o;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.C26815r;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoCgvViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27053c;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment.C27070c;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment.OrderOnlineFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper.C27073c;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.C27099d;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27132h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27150f;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.presentation.viewmodels.privacy.C27169a;
import com.carrefour.fid.android.presentation.viewmodels.privacy.C27175e;
import com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.filter.C27177a;
import com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.list.C27180a;
import com.carrefour.fid.android.presentation.viewmodels.product.mixing.C27224a;
import com.carrefour.fid.android.presentation.viewmodels.product.mixing.C27231e;
import com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.quantity.C27244c;
import com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27270e;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27272f;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27278j;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27280k;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27363o;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27369r;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27375u;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListAllResultsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListRecommendationResultsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.rating.C27391d;
import com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel;
import com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel;
import com.carrefour.fid.android.presentation.viewmodels.scan.C27398c;
import com.carrefour.fid.android.presentation.viewmodels.scan.C27400d;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27443f;
import com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel;
import com.carrefour.fid.android.presentation.viewmodels.store.C27450c;
import com.carrefour.fid.android.presentation.viewmodels.store.StoreViewModel;
import com.carrefour.fid.android.product.data.api.datasource.FacetProductCountDataSource;
import com.carrefour.fid.android.product.data.api.datasource.NonFoodProductDetailDataSource;
import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import com.carrefour.fid.android.product.data.api.datasource.ProductsDataSource;
import com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase;
import com.carrefour.fid.android.product.domain.interactors.C27550a0;
import com.carrefour.fid.android.product.domain.interactors.C27551b;
import com.carrefour.fid.android.product.domain.interactors.C27565j;
import com.carrefour.fid.android.product.domain.interactors.C27567l;
import com.carrefour.fid.android.product.domain.interactors.C27580y;
import com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedProductFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase;
import com.carrefour.fid.android.product.domain.repositories.AlternativeProductsRepository;
import com.carrefour.fid.android.product.domain.repositories.C27600f;
import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import com.carrefour.fid.android.product.domain.repositories.PlpProductRepository;
import com.carrefour.fid.android.product.domain.repositories.ProductDetailRepository;
import com.carrefour.fid.android.product.domain.repositories.ProductRepository;
import com.carrefour.fid.android.product.domain.repositories.ProductsManagementRepository;
import com.carrefour.fid.android.product.p038di.C27514a;
import com.carrefour.fid.android.product.p038di.C27517c;
import com.carrefour.fid.android.product.p038di.C27518d;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.product.presentation.analytics.C27637g;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.AlternativeProductsBottomSheetFragment;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27738e;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27745k;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.MixingProductsBottomSheetFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.C27816m;
import com.carrefour.fid.android.product.presentation.p039ui.details.C27915r;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsImageFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27898n;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.DeliveryChoiceInfoFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.NonFoodProductDetailsFragment;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.ReinsuranceFragment;
import com.carrefour.fid.android.product.presentation.p039ui.facet.C27954c;
import com.carrefour.fid.android.product.presentation.p039ui.facet.FacetFragment;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27951b;
import com.carrefour.fid.android.product.presentation.p039ui.list.C28056l;
import com.carrefour.fid.android.product.presentation.p039ui.list.C28075p;
import com.carrefour.fid.android.product.presentation.p039ui.list.C28080t;
import com.carrefour.fid.android.product.presentation.p039ui.list.C28085x;
import com.carrefour.fid.android.product.presentation.p039ui.list.ProductListDepartmentFragment;
import com.carrefour.fid.android.product.presentation.p039ui.list.ProductListPromoFragment;
import com.carrefour.fid.android.product.presentation.p039ui.list.ProductListQueryFragment;
import com.carrefour.fid.android.product.presentation.p039ui.list.ProductListSearchFragment;
import com.carrefour.fid.android.product.presentation.p039ui.quantity.C28101d;
import com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel;
import com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.C28108c;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28118d;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28129k;
import com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel;
import com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.C28165d;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import com.carrefour.fid.android.product.presentation.viewmodel.list.C28204d;
import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider;
import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import com.carrefour.fid.android.product.presentation.viewmodel.quantity.C28226c;
import com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel;
import com.carrefour.fid.android.rgpd.airship.AirshipSettings;
import com.carrefour.fid.android.rgpd.cookies.p040ui.C28230b;
import com.carrefour.fid.android.rgpd.cookies.p040ui.CookiesTracersPolicyFragment;
import com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage;
import com.carrefour.fid.android.scan.core.p041di.C28262a;
import com.carrefour.fid.android.scan.core.p041di.C28265c;
import com.carrefour.fid.android.scan.data.repositories.C28267a;
import com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl;
import com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase;
import com.carrefour.fid.android.scan.domain.interactors.GetScanTutorialHasBeenShownUseCase;
import com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase;
import com.carrefour.fid.android.scan.presentation.p042ui.CouponsBarcodeScannerFragment;
import com.carrefour.fid.android.scan.presentation.p042ui.ScannerFragment;
import com.carrefour.fid.android.scan.presentation.viewmodels.C28316c;
import com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel;
import com.carrefour.fid.android.service.data.api.datasource.FacilityDataSource;
import com.carrefour.fid.android.service.data.api.datasource.StoreFacilityDataSource;
import com.carrefour.fid.android.service.data.api.service.FacilityService;
import com.carrefour.fid.android.service.data.api.service.StoreFacilityService;
import com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore;
import com.carrefour.fid.android.service.data.datastore.ServiceDataStore;
import com.carrefour.fid.android.service.domain.interactors.ApplyPendingServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase;
import com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase;
import com.carrefour.fid.android.service.domain.interactors.GetPendingServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceClearServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceFetchDeliveryStoresUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceFetchPhysicalStoresUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceFetchStoreServicesPictosUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetFavoritePhysicalStoreUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetMirrorDriveServiceUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetPromiseUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetSelectedServiceUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreRefUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreServiceTypeSelectedUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceIsPreviousSelectedServiceDifferentUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceIsSelectedServiceDeliveryUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceOpenUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceIsServiceSelectedUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceObserveServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceSetFavoritePhysicalStoreUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceSetServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase;
import com.carrefour.fid.android.service.domain.interactors.ServiceUpdateStoreServiceUseCase;
import com.carrefour.fid.android.service.domain.interactors.SetPendingServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.repositories.PhysicalStoreRepository;
import com.carrefour.fid.android.service.domain.repositories.ServiceSelectionRepository;
import com.carrefour.fid.android.service.domain.repositories.StoreFacilityRepository;
import com.carrefour.fid.android.service.p043di.HiltWrapper_ServiceModule;
import com.carrefour.fid.android.service.p043di.ServiceModule_Companion_ProvideFacilityServiceFactory;
import com.carrefour.fid.android.service.p043di.ServiceModule_Companion_ProvideFacilityServiceRepositoryFactory;
import com.carrefour.fid.android.service.p043di.ServiceModule_Companion_ProvideStoreFacilityDataSourceFactory;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliveryServiceSelectionAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.analytics.drive.DriveMapAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.analytics.drive.DriveSummaryAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.analytics.selection.ServiceSelectionBackdropAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryServiceSelectionFragment;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryServiceSelectionFragment_MembersInjector;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryFragment;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryFragment_MembersInjector;
import com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment;
import com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment_MembersInjector;
import com.carrefour.fid.android.service.presentation.p044ui.drive.summary.DriveSummaryFragment;
import com.carrefour.fid.android.service.presentation.p044ui.selection.ServiceSelectionBackDropFragment;
import com.carrefour.fid.android.service.presentation.p044ui.selection.ServiceSelectionBackDropFragment_MembersInjector;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.C28434x1a007004;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.carrefour.fid.android.services.C28441a;
import com.carrefour.fid.android.services.OneAppFCMService;
import com.carrefour.fid.android.shared.app.C28443a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.network.C28802c;
import com.carrefour.fid.android.shared.network.C28812h;
import com.carrefour.fid.android.shared.network.interceptors.C28818d;
import com.carrefour.fid.android.shared.network.interceptors.C28826i;
import com.carrefour.fid.android.shared.network.interceptors.C28833m;
import com.carrefour.fid.android.shared.p045di.C28656a;
import com.carrefour.fid.android.shared.p045di.C28675b;
import com.carrefour.fid.android.shared.p045di.C28677d;
import com.carrefour.fid.android.shared.p045di.C28679f;
import com.carrefour.fid.android.shared.p045di.C28680g;
import com.carrefour.fid.android.shared.presentation.p047ui.webview.C28873g;
import com.carrefour.fid.android.shared.presentation.p047ui.webview.CatalogWebViewActivity;
import com.carrefour.fid.android.shared.presentation.p047ui.webview.WebViewActivity;
import com.carrefour.fid.android.shared.util.C28903a;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.carrefour.fid.android.storelocator.p048ui.fragments.C28991j;
import com.carrefour.fid.android.storelocator.p048ui.fragments.StoreFacilitiesBottomSheetFragment;
import com.carrefour.fid.android.tracking.C28994a;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C28997b;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29001e;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29005h;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29008k;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29011n;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29014q;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29016s;
import com.carrefour.fid.android.tracking.physicalstore.C29019b;
import com.carrefour.fid.android.tracking.product.C29021a;
import com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource;
import com.carrefour.fid.android.utilities.domain.interactors.C22687d;
import com.carrefour.fid.android.utilities.domain.interactors.C22690f;
import com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetPickupPointsUseCase;
import com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSecureTokenUseCase;
import com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase;
import com.carrefour.fid.android.utilities.domain.interactors.UtilitiesSuggestionsUseCase;
import com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository;
import com.carrefour.fid.android.utilities.p032di.C22679a;
import com.carrefour.fid.android.utilities.p032di.C22682c;
import com.carrefour.fid.android.utils.DeviceSecurityHelper;
import com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener;
import com.carrefour.fid.android.utils.initializer.AnalyticsInitializer;
import com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer;
import com.carrefour.fid.android.utils.initializer.C22708a;
import com.carrefour.fid.android.utils.initializer.C22709b;
import com.carrefour.fid.android.utils.initializer.C22710c;
import com.carrefour.fid.android.utils.initializer.FirebaseAppInitializer;
import com.carrefour.fid.android.utils.tagging.inbox.AudienceTrackingManager;
import com.carrefour.fid.android.utils.tagging.inbox.C22725b;
import com.carrefour.fid.android.various.core.C22752a;
import com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource;
import com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore;
import com.carrefour.fid.android.various.data.repository.FirebaseRemoteConfigImpl;
import com.carrefour.fid.android.various.data.repository.RemoteConfigRepositoryImpl;
import com.carrefour.fid.android.various.domain.interactor.GetAppMessageUseCase;
import com.carrefour.fid.android.various.domain.interactor.MarkAppMessageAsReadUseCase;
import com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckAppMessageUseCase;
import com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckRemoteConfigUseCase;
import com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckUsabillaConsentUseCase;
import com.carrefour.fid.android.various.domain.interactor.ThirdPartyFetchRemoteConfigUseCase;
import com.carrefour.fid.android.various.domain.repository.AppMessageRepository;
import com.carrefour.fid.android.various.p033di.C22777b;
import com.carrefour.fid.android.various.p033di.C22778c;
import com.carrefour.fid.android.various.presentation.analytics.notification.C22799a;
import com.carrefour.fid.android.various.presentation.p034ui.notification.AppMessageFragment;
import com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel;
import com.carrefour.fid.android.various.presentation.viewmodels.notification.C22820c;
import com.carrefour.fid.android.various.tracking.ThirdPartyUsabillaEventDispatcher;
import com.google.android.play.core.review.C32121c;
import com.google.errorprone.annotations.C32488a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.C33314e;
import com.google.firebase.remoteconfig.C33563l;
import com.google.gson.C33614e;
import dagger.hilt.android.C10162a;
import dagger.hilt.android.C10182h;
import dagger.hilt.android.flags.C10180b;
import dagger.hilt.android.internal.builders.C10186a;
import dagger.hilt.android.internal.builders.C10187b;
import dagger.hilt.android.internal.builders.C10188c;
import dagger.hilt.android.internal.builders.C10189d;
import dagger.hilt.android.internal.builders.C10190e;
import dagger.hilt.android.internal.builders.C10191f;
import dagger.hilt.android.internal.builders.C10192g;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.lifecycle.C10200b;
import dagger.hilt.android.internal.managers.C10224c;
import dagger.hilt.android.internal.modules.C10240c;
import dagger.hilt.android.internal.modules.C10241d;
import dagger.hilt.android.internal.modules.C10242e;
import dagger.internal.C10321e;
import dagger.internal.C10323g;
import dagger.internal.C10328l;
import dagger.internal.C10335o;
import dagger.internal.C10339s;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import retrofit2.C13092x;

@C10321e
/* renamed from: com.carrefour.fid.android.i */
public final class C13984i {

    /* renamed from: com.carrefour.fid.android.i$a */
    public static final class C13985a implements C14006j0.C14007a.C14008a {

        /* renamed from: a */
        public final C13995j f34114a;

        /* renamed from: b */
        public final C13988d f34115b;

        /* renamed from: c */
        public Activity f34116c;

        /* renamed from: b */
        public C13985a mo21619a(Activity activity) {
            this.f34116c = (Activity) C10335o.m38550b(activity);
            return this;
        }

        /* renamed from: c */
        public C14006j0.C14007a mo21620g() {
            C10335o.m38549a(this.f34116c, Activity.class);
            return new C13986b(this.f34114a, this.f34115b, this.f34116c);
        }

        public C13985a(C13995j jVar, C13988d dVar) {
            this.f34114a = jVar;
            this.f34115b = dVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$b */
    public static final class C13986b extends C14006j0.C14007a {

        /* renamed from: c */
        public final Activity f34117c;

        /* renamed from: d */
        public final C13995j f34118d;

        /* renamed from: e */
        public final C13988d f34119e;

        /* renamed from: f */
        public final C13986b f34120f;

        /* renamed from: a */
        public C10195a.C10199d mo21635a() {
            return C10200b.m38428c(mo21647d(), new C13999m(this.f34118d, this.f34119e));
        }

        /* renamed from: b */
        public void mo33414b(BottomNavActivity bottomNavActivity) {
            mo33425s(bottomNavActivity);
        }

        /* renamed from: c */
        public void mo33415c(WebViewActivity webViewActivity) {
            mo33428v(webViewActivity);
        }

        /* renamed from: d */
        public Set<String> mo21647d() {
            return C10339s.m38557d(118).mo21740a(C26548c.m113047c()).mo21740a(C13637c.m58359c()).mo21740a(C25784d.m110589c()).mo21740a(C25794i.m110611c()).mo21740a(C13576c.m58197c()).mo21740a(C25813e.m110695c()).mo21740a(C25865e.m110855c()).mo21740a(C25889e.m110946c()).mo21740a(C25803f.m110673c()).mo21740a(C26738c.m113549c()).mo21740a(C26821f.m113818c()).mo21740a(C26827i.m113827c()).mo21740a(C26833l.m113836c()).mo21740a(C26983o.m114179c()).mo21740a(C28108c.m117678c()).mo21740a(C26342c.m112427c()).mo21740a(C22820c.m103085c()).mo21740a(AttachCardViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C27398c.m115411c()).mo21740a(C26219c.m112092c()).mo21740a(C25760c.m110528c()).mo21740a(C26542c.m113035c()).mo21740a(C26989r.m114188c()).mo21740a(C25954e.m111122c()).mo21740a(C25962j.m111144c()).mo21740a(C25970o.m111157c()).mo21740a(C25978t.m111171c()).mo21740a(BlockedCardViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C39614c.m162015c()).mo21740a(C39620f.m162024c()).mo21740a(C39626i.m162033c()).mo21740a(C39632l.m162042c()).mo21740a(C25985c.m111186c()).mo21740a(ChannelsFidViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C26139c.m111730c()).mo21740a(C26005c.m111310c()).mo21740a(C26202e.m112027c()).mo21740a(C26785c.m113764c()).mo21740a(C26791f.m113773c()).mo21740a(C26797i.m113782c()).mo21740a(C26014h.m111348c()).mo21740a(C26097c.m111584c()).mo21740a(C26120c.m111681c()).mo21740a(C26022m.m111363c()).mo21740a(C26803l.m113791c()).mo21740a(C26809o.m113800c()).mo21740a(C26815r.m113809c()).mo21740a(C36144x9a6c1668.provide()).mo21740a(ConsentBackDropViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C26232c.m112125c()).mo21740a(C26234g.m112129c()).mo21740a(CreateOrAttachCardViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C26335c.m112408c()).mo21740a(C28434x1a007004.provide()).mo21740a(DeliverySummaryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C39802d.m162380c()).mo21740a(DriveMapViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(DriveSummaryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C28165d.m117900c()).mo21740a(C26348c.m112448c()).mo21740a(C13691c.m58528c()).mo21740a(C26393g.m112747c()).mo21740a(C26400k.m112756c()).mo21740a(C26479n.m112881c()).mo21740a(InitLoyaltyCardViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C26994c.m114194c()).mo21740a(C38298xb9044ccf.provide()).mo21740a(C26560c.m113109c()).mo21740a(LoyaltyMyCardViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C26626e.m113207c()).mo21740a(C25841e.m110791c()).mo21740a(C27231e.m114959c()).mo21740a(C26149e.m111778c()).mo21740a(C26174d.m111883c()).mo21740a(C28118d.m117744c()).mo21740a(C26687e.m113381c()).mo21740a(C26695j.m113395c()).mo21740a(C27002h.m114222c()).mo21740a(C27010m.m114242c()).mo21740a(C27099d.m114587c()).mo21740a(C26647c.m113252c()).mo21740a(C26311c.m112342c()).mo21740a(C26320i.m112367c()).mo21740a(C39949c.m162759c()).mo21740a(C27150f.m114721c()).mo21740a(C27132h.m114668c()).mo21740a(C26188g.m111918c()).mo21740a(C28204d.m118082c()).mo21740a(C26520c.m112984c()).mo21740a(C27175e.m114768c()).mo21740a(C28129k.m117761c()).mo21740a(C27270e.m115076c()).mo21740a(C27278j.m115095c()).mo21740a(C27363o.m115349c()).mo21740a(C27369r.m115358c()).mo21740a(C27375u.m115367c()).mo21740a(C28226c.m118150c()).mo21740a(C27244c.m114983c()).mo21740a(C27391d.m115393c()).mo21740a(C26328c.m112384c()).mo21740a(C28316c.m118287c()).mo21740a(SecretCodeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C39955c.m162855c()).mo21740a(C39961f.m162864c()).mo21740a(C26356e.m112503c()).mo21740a(C26362h.m112512c()).mo21740a(C26368k.m112521c()).mo21740a(C25896i.m110959c()).mo21740a(C13704c.m58560c()).mo21740a(C27443f.m115506c()).mo21740a(C39706o.m162157c()).mo21740a(C27450c.m115520c()).mo21740a(SuccessCreateCardViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C13582f.m58206c()).mo21740a(C13588i.m58215c()).mo21740a(C13594l.m58224c()).mo21740a(ValidateOtpViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo21740a(C13643f.m58368c()).mo21742c();
        }

        /* renamed from: e */
        public void mo33416e(SplashOnBoardingActivity splashOnBoardingActivity) {
            mo33427u(splashOnBoardingActivity);
        }

        /* renamed from: f */
        public C10190e mo21662f() {
            return new C13997k(this.f34118d, this.f34119e, this.f34120f);
        }

        /* renamed from: g */
        public void mo33417g(CatalogWebViewActivity catalogWebViewActivity) {
        }

        /* renamed from: h */
        public void mo32022h(AccountActivity accountActivity) {
        }

        /* renamed from: i */
        public void mo33418i(SplashActivity splashActivity) {
            mo33426t(splashActivity);
        }

        /* renamed from: j */
        public C10191f mo21648j() {
            return new C13999m(this.f34118d, this.f34119e);
        }

        /* renamed from: k */
        public C10188c mo21677k() {
            return new C13991f(this.f34118d, this.f34119e, this.f34120f);
        }

        /* renamed from: m */
        public final C26380a mo33419m() {
            return new C26380a((C13783a) this.f34118d.f34193M.get());
        }

        /* renamed from: n */
        public final CriteoTrackingSyncUseCase mo33420n() {
            return new CriteoTrackingSyncUseCase((CriteoTrackingGateway) this.f34118d.f34226f0.get());
        }

        /* renamed from: o */
        public final CriteoTrackingViewModel mo33421o() {
            return new CriteoTrackingViewModel(mo33420n());
        }

        /* renamed from: p */
        public final DeviceSecurityHelper mo33422p() {
            return new DeviceSecurityHelper(this.f34117c, this.f34118d.mo33941a5());
        }

        /* renamed from: q */
        public final ForegroundBackgroundApplicationListener mo33423q() {
            return new ForegroundBackgroundApplicationListener(this.f34118d.mo33940a(), this.f34118d.mo33951b8(), this.f34118d.mo33913V7(), this.f34118d.mo33941a5(), this.f34118d.mo33903T9());
        }

        /* renamed from: r */
        public final HomeAnalyticsViewModel mo33424r() {
            return new HomeAnalyticsViewModel(this.f34118d.mo34014l(), new C13744c(), (C13814a) this.f34118d.f34230h0.get(), (C13783a) this.f34118d.f34193M.get(), (AppEnvironment) this.f34118d.f34199P.get(), C10242e.m38491c(this.f34118d.f34219c));
        }

        @C32488a
        /* renamed from: s */
        public final BottomNavActivity mo33425s(BottomNavActivity bottomNavActivity) {
            C13834a.m58815b(bottomNavActivity, this.f34118d.mo34002j5());
            C13834a.m58816c(bottomNavActivity, mo33422p());
            C38321d.m158773h(bottomNavActivity, this.f34118d.mo34014l());
            C38321d.m158770e(bottomNavActivity, mo33421o());
            C38321d.m158774i(bottomNavActivity, this.f34118d.mo33951b8());
            C38321d.m158772g(bottomNavActivity, mo33424r());
            C38321d.m158769d(bottomNavActivity, mo33419m());
            C38321d.m158767b(bottomNavActivity, (C13783a) this.f34118d.f34193M.get());
            C38321d.m158771f(bottomNavActivity, mo33423q());
            C38321d.m158776l(bottomNavActivity, (C32121c) this.f34118d.f34234j0.get());
            C38321d.m158768c(bottomNavActivity, (C13814a) this.f34118d.f34230h0.get());
            C38321d.m158775k(bottomNavActivity, (C28796c) this.f34118d.f34236k0.get());
            return bottomNavActivity;
        }

        @C32488a
        /* renamed from: t */
        public final SplashActivity mo33426t(SplashActivity splashActivity) {
            C25746d.m110495c(splashActivity, mo33429w());
            return splashActivity;
        }

        @C32488a
        /* renamed from: u */
        public final SplashOnBoardingActivity mo33427u(SplashOnBoardingActivity splashOnBoardingActivity) {
            C24659c.m107714c(splashOnBoardingActivity, mo33429w());
            return splashOnBoardingActivity;
        }

        @C32488a
        /* renamed from: v */
        public final WebViewActivity mo33428v(WebViewActivity webViewActivity) {
            C28873g.m119424b(webViewActivity, (C28903a) this.f34118d.f34238l0.get());
            C28873g.m119426e(webViewActivity, this.f34118d.mo33907U7());
            C28873g.m119425c(webViewActivity, (AppEnvironment) this.f34118d.f34199P.get());
            return webViewActivity;
        }

        /* renamed from: w */
        public final C27420a mo33429w() {
            return new C27420a((C13783a) this.f34118d.f34193M.get(), new C13744c());
        }

        public C13986b(C13995j jVar, C13988d dVar, Activity activity) {
            this.f34120f = this;
            this.f34118d = jVar;
            this.f34119e = dVar;
            this.f34117c = activity;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$c */
    public static final class C13987c implements C14006j0.C14010c.C14011a {

        /* renamed from: a */
        public final C13995j f34121a;

        /* renamed from: a */
        public C14006j0.C14010c mo21621g() {
            return new C13988d(this.f34121a);
        }

        public C13987c(C13995j jVar) {
            this.f34121a = jVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$d */
    public static final class C13988d extends C14006j0.C14010c {

        /* renamed from: c */
        public final C13995j f34122c;

        /* renamed from: d */
        public final C13988d f34123d;

        /* renamed from: e */
        public Provider<C10162a> f34124e;

        /* renamed from: com.carrefour.fid.android.i$d$a */
        public static final class C13989a<T> implements Provider<T> {

            /* renamed from: a */
            public final C13995j f34125a;

            /* renamed from: b */
            public final C13988d f34126b;

            /* renamed from: c */
            public final int f34127c;

            public C13989a(C13995j jVar, C13988d dVar, int i) {
                this.f34125a = jVar;
                this.f34126b = dVar;
                this.f34127c = i;
            }

            public T get() {
                if (this.f34127c == 0) {
                    return C10224c.m38465c();
                }
                throw new AssertionError(this.f34127c);
            }
        }

        /* renamed from: a */
        public C10186a mo21665a() {
            return new C13985a(this.f34122c, this.f34123d);
        }

        /* renamed from: b */
        public C10162a mo21672b() {
            return this.f34124e.get();
        }

        /* renamed from: c */
        public final void mo33431c() {
            this.f34124e = C10323g.m38525b(new C13989a(this.f34122c, this.f34123d, 0));
        }

        public C13988d(C13995j jVar) {
            this.f34123d = this;
            this.f34122c = jVar;
            mo33431c();
        }
    }

    /* renamed from: com.carrefour.fid.android.i$e */
    public static final class C13990e {

        /* renamed from: A */
        public C36225n0 f34128A;

        /* renamed from: B */
        public C36231q0 f34129B;

        /* renamed from: C */
        public C36235s0 f34130C;

        /* renamed from: a */
        public C36198a f34131a;

        /* renamed from: b */
        public C13819a f34132b;

        /* renamed from: c */
        public C10240c f34133c;

        /* renamed from: d */
        public C36202c f34134d;

        /* renamed from: e */
        public C36245c f34135e;

        /* renamed from: f */
        public C36210g f34136f;

        /* renamed from: g */
        public C39431a f34137g;

        /* renamed from: h */
        public C39848a f34138h;

        /* renamed from: i */
        public C36214i f34139i;

        /* renamed from: j */
        public C28656a f34140j;

        /* renamed from: k */
        public C36218k f34141k;

        /* renamed from: l */
        public C36222m f34142l;

        /* renamed from: m */
        public C13236c f34143m;

        /* renamed from: n */
        public C36230q f34144n;

        /* renamed from: o */
        public C36234s f34145o;

        /* renamed from: p */
        public C36238u f34146p;

        /* renamed from: q */
        public C36240w f34147q;

        /* renamed from: r */
        public C36242y f34148r;

        /* renamed from: s */
        public C36201b0 f34149s;

        /* renamed from: t */
        public C36205d0 f34150t;

        /* renamed from: u */
        public C36270a f34151u;

        /* renamed from: v */
        public C36265j f34152v;

        /* renamed from: w */
        public C36209f0 f34153w;

        /* renamed from: x */
        public C36215i0 f34154x;

        /* renamed from: y */
        public C38329a f34155y;

        /* renamed from: z */
        public C36221l0 f34156z;

        @Deprecated
        /* renamed from: A */
        public C13990e mo33432A(C10180b bVar) {
            C10335o.m38550b(bVar);
            return this;
        }

        @Deprecated
        /* renamed from: B */
        public C13990e mo33433B(C38277a aVar) {
            C10335o.m38550b(aVar);
            return this;
        }

        @Deprecated
        /* renamed from: C */
        public C13990e mo33434C(HiltWrapper_LoyaltyModule hiltWrapper_LoyaltyModule) {
            C10335o.m38550b(hiltWrapper_LoyaltyModule);
            return this;
        }

        @Deprecated
        /* renamed from: D */
        public C13990e mo33435D(C36253e eVar) {
            C10335o.m38550b(eVar);
            return this;
        }

        @Deprecated
        /* renamed from: E */
        public C13990e mo33436E(C36264i iVar) {
            C10335o.m38550b(iVar);
            return this;
        }

        @Deprecated
        /* renamed from: F */
        public C13990e mo33437F(C27514a aVar) {
            C10335o.m38550b(aVar);
            return this;
        }

        @Deprecated
        /* renamed from: G */
        public C13990e mo33438G(C36254f fVar) {
            C10335o.m38550b(fVar);
            return this;
        }

        @Deprecated
        /* renamed from: H */
        public C13990e mo33439H(C28262a aVar) {
            C10335o.m38550b(aVar);
            return this;
        }

        @Deprecated
        /* renamed from: I */
        public C13990e mo33440I(HiltWrapper_ServiceModule hiltWrapper_ServiceModule) {
            C10335o.m38550b(hiltWrapper_ServiceModule);
            return this;
        }

        @Deprecated
        /* renamed from: J */
        public C13990e mo33441J(C39433a aVar) {
            C10335o.m38550b(aVar);
            return this;
        }

        @Deprecated
        /* renamed from: K */
        public C13990e mo33442K(C39851a aVar) {
            C10335o.m38550b(aVar);
            return this;
        }

        @Deprecated
        /* renamed from: L */
        public C13990e mo33443L(C36255g gVar) {
            C10335o.m38550b(gVar);
            return this;
        }

        @Deprecated
        /* renamed from: M */
        public C13990e mo33444M(C22679a aVar) {
            C10335o.m38550b(aVar);
            return this;
        }

        /* renamed from: N */
        public C13990e mo33445N(C36234s sVar) {
            this.f34145o = (C36234s) C10335o.m38550b(sVar);
            return this;
        }

        /* renamed from: O */
        public C13990e mo33446O(C36238u uVar) {
            this.f34146p = (C36238u) C10335o.m38550b(uVar);
            return this;
        }

        /* renamed from: P */
        public C13990e mo33447P(C36240w wVar) {
            this.f34147q = (C36240w) C10335o.m38550b(wVar);
            return this;
        }

        /* renamed from: Q */
        public C13990e mo33448Q(C36242y yVar) {
            this.f34148r = (C36242y) C10335o.m38550b(yVar);
            return this;
        }

        /* renamed from: R */
        public C13990e mo33449R(C36201b0 b0Var) {
            this.f34149s = (C36201b0) C10335o.m38550b(b0Var);
            return this;
        }

        /* renamed from: S */
        public C13990e mo33450S(C36205d0 d0Var) {
            this.f34150t = (C36205d0) C10335o.m38550b(d0Var);
            return this;
        }

        /* renamed from: T */
        public C13990e mo33451T(C36270a aVar) {
            this.f34151u = (C36270a) C10335o.m38550b(aVar);
            return this;
        }

        /* renamed from: U */
        public C13990e mo33452U(C36265j jVar) {
            this.f34152v = (C36265j) C10335o.m38550b(jVar);
            return this;
        }

        /* renamed from: V */
        public C13990e mo33453V(C36209f0 f0Var) {
            this.f34153w = (C36209f0) C10335o.m38550b(f0Var);
            return this;
        }

        /* renamed from: W */
        public C13990e mo33454W(C36215i0 i0Var) {
            this.f34154x = (C36215i0) C10335o.m38550b(i0Var);
            return this;
        }

        /* renamed from: X */
        public C13990e mo33455X(C38329a aVar) {
            this.f34155y = (C38329a) C10335o.m38550b(aVar);
            return this;
        }

        /* renamed from: Y */
        public C13990e mo33456Y(C36221l0 l0Var) {
            this.f34156z = (C36221l0) C10335o.m38550b(l0Var);
            return this;
        }

        /* renamed from: Z */
        public C13990e mo33457Z(C36225n0 n0Var) {
            this.f34128A = (C36225n0) C10335o.m38550b(n0Var);
            return this;
        }

        /* renamed from: a */
        public C13990e mo33458a(C36198a aVar) {
            this.f34131a = (C36198a) C10335o.m38550b(aVar);
            return this;
        }

        /* renamed from: a0 */
        public C13990e mo33459a0(C36231q0 q0Var) {
            this.f34129B = (C36231q0) C10335o.m38550b(q0Var);
            return this;
        }

        /* renamed from: b */
        public C13990e mo33460b(C13819a aVar) {
            this.f34132b = (C13819a) C10335o.m38550b(aVar);
            return this;
        }

        /* renamed from: b0 */
        public C13990e mo33461b0(C36235s0 s0Var) {
            this.f34130C = (C36235s0) C10335o.m38550b(s0Var);
            return this;
        }

        /* renamed from: c */
        public C13990e mo33462c(C10240c cVar) {
            this.f34133c = (C10240c) C10335o.m38550b(cVar);
            return this;
        }

        /* renamed from: d */
        public C13990e mo33463d(C36202c cVar) {
            this.f34134d = (C36202c) C10335o.m38550b(cVar);
            return this;
        }

        /* renamed from: e */
        public C13990e mo33464e(C36245c cVar) {
            this.f34135e = (C36245c) C10335o.m38550b(cVar);
            return this;
        }

        /* renamed from: f */
        public C13990e mo33465f(C36210g gVar) {
            this.f34136f = (C36210g) C10335o.m38550b(gVar);
            return this;
        }

        /* renamed from: g */
        public C14006j0.C14019i mo33466g() {
            if (this.f34131a == null) {
                this.f34131a = new C36198a();
            }
            if (this.f34132b == null) {
                this.f34132b = new C13819a();
            }
            C10335o.m38549a(this.f34133c, C10240c.class);
            if (this.f34134d == null) {
                this.f34134d = new C36202c();
            }
            if (this.f34135e == null) {
                this.f34135e = new C36245c();
            }
            if (this.f34136f == null) {
                this.f34136f = new C36210g();
            }
            if (this.f34137g == null) {
                this.f34137g = new C39431a();
            }
            if (this.f34138h == null) {
                this.f34138h = new C39848a();
            }
            if (this.f34139i == null) {
                this.f34139i = new C36214i();
            }
            if (this.f34140j == null) {
                this.f34140j = new C28656a();
            }
            if (this.f34141k == null) {
                this.f34141k = new C36218k();
            }
            if (this.f34142l == null) {
                this.f34142l = new C36222m();
            }
            if (this.f34143m == null) {
                this.f34143m = new C13236c();
            }
            if (this.f34144n == null) {
                this.f34144n = new C36230q();
            }
            if (this.f34145o == null) {
                this.f34145o = new C36234s();
            }
            if (this.f34146p == null) {
                this.f34146p = new C36238u();
            }
            if (this.f34147q == null) {
                this.f34147q = new C36240w();
            }
            if (this.f34148r == null) {
                this.f34148r = new C36242y();
            }
            if (this.f34149s == null) {
                this.f34149s = new C36201b0();
            }
            if (this.f34150t == null) {
                this.f34150t = new C36205d0();
            }
            if (this.f34151u == null) {
                this.f34151u = new C36270a();
            }
            if (this.f34152v == null) {
                this.f34152v = new C36265j();
            }
            if (this.f34153w == null) {
                this.f34153w = new C36209f0();
            }
            if (this.f34154x == null) {
                this.f34154x = new C36215i0();
            }
            if (this.f34155y == null) {
                this.f34155y = new C38329a();
            }
            if (this.f34156z == null) {
                this.f34156z = new C36221l0();
            }
            if (this.f34128A == null) {
                this.f34128A = new C36225n0();
            }
            if (this.f34129B == null) {
                this.f34129B = new C36231q0();
            }
            if (this.f34130C == null) {
                this.f34130C = new C36235s0();
            }
            C13995j jVar = r2;
            C13995j jVar2 = new C13995j(this.f34131a, this.f34132b, this.f34133c, this.f34134d, this.f34135e, this.f34136f, this.f34137g, this.f34138h, this.f34139i, this.f34140j, this.f34141k, this.f34142l, this.f34143m, this.f34144n, this.f34145o, this.f34146p, this.f34147q, this.f34148r, this.f34149s, this.f34150t, this.f34151u, this.f34152v, this.f34153w, this.f34154x, this.f34155y, this.f34156z, this.f34128A, this.f34129B, this.f34130C);
            return jVar;
        }

        /* renamed from: h */
        public C13990e mo33467h(C39431a aVar) {
            this.f34137g = (C39431a) C10335o.m38550b(aVar);
            return this;
        }

        /* renamed from: i */
        public C13990e mo33468i(C39848a aVar) {
            this.f34138h = (C39848a) C10335o.m38550b(aVar);
            return this;
        }

        /* renamed from: j */
        public C13990e mo33469j(C36214i iVar) {
            this.f34139i = (C36214i) C10335o.m38550b(iVar);
            return this;
        }

        /* renamed from: k */
        public C13990e mo33470k(C28656a aVar) {
            this.f34140j = (C28656a) C10335o.m38550b(aVar);
            return this;
        }

        /* renamed from: l */
        public C13990e mo33471l(C36218k kVar) {
            this.f34141k = (C36218k) C10335o.m38550b(kVar);
            return this;
        }

        /* renamed from: m */
        public C13990e mo33472m(C36222m mVar) {
            this.f34142l = (C36222m) C10335o.m38550b(mVar);
            return this;
        }

        /* renamed from: n */
        public C13990e mo33473n(C13236c cVar) {
            this.f34143m = (C13236c) C10335o.m38550b(cVar);
            return this;
        }

        @Deprecated
        /* renamed from: o */
        public C13990e mo33474o(C36226o oVar) {
            C10335o.m38550b(oVar);
            return this;
        }

        /* renamed from: p */
        public C13990e mo33475p(C36230q qVar) {
            this.f34144n = (C36230q) C10335o.m38550b(qVar);
            return this;
        }

        @Deprecated
        /* renamed from: q */
        public C13990e mo33476q(C13238e eVar) {
            C10335o.m38550b(eVar);
            return this;
        }

        @Deprecated
        /* renamed from: r */
        public C13990e mo33477r(C36262g gVar) {
            C10335o.m38550b(gVar);
            return this;
        }

        @Deprecated
        /* renamed from: s */
        public C13990e mo33478s(C36263h hVar) {
            C10335o.m38550b(hVar);
            return this;
        }

        @Deprecated
        /* renamed from: t */
        public C13990e mo33479t(C13885c cVar) {
            C10335o.m38550b(cVar);
            return this;
        }

        @Deprecated
        /* renamed from: u */
        public C13990e mo33480u(C39744c cVar) {
            C10335o.m38550b(cVar);
            return this;
        }

        @Deprecated
        /* renamed from: v */
        public C13990e mo33481v(HiltWrapper_ConsentModule hiltWrapper_ConsentModule) {
            C10335o.m38550b(hiltWrapper_ConsentModule);
            return this;
        }

        @Deprecated
        /* renamed from: w */
        public C13990e mo33482w(C36251c cVar) {
            C10335o.m38550b(cVar);
            return this;
        }

        @Deprecated
        /* renamed from: x */
        public C13990e mo33483x(C36248b bVar) {
            C10335o.m38550b(bVar);
            return this;
        }

        @Deprecated
        /* renamed from: y */
        public C13990e mo33484y(C36252d dVar) {
            C10335o.m38550b(dVar);
            return this;
        }

        @Deprecated
        /* renamed from: z */
        public C13990e mo33485z(C22778c cVar) {
            C10335o.m38550b(cVar);
            return this;
        }

        public C13990e() {
        }
    }

    /* renamed from: com.carrefour.fid.android.i$f */
    public static final class C13991f implements C14006j0.C14013e.C14014a {

        /* renamed from: a */
        public final C13995j f34157a;

        /* renamed from: b */
        public final C13988d f34158b;

        /* renamed from: c */
        public final C13986b f34159c;

        /* renamed from: d */
        public Fragment f34160d;

        /* renamed from: b */
        public C14006j0.C14013e mo21623g() {
            C10335o.m38549a(this.f34160d, Fragment.class);
            return new C13992g(this.f34157a, this.f34158b, this.f34159c, this.f34160d);
        }

        /* renamed from: c */
        public C13991f mo21622a(Fragment fragment) {
            this.f34160d = (Fragment) C10335o.m38550b(fragment);
            return this;
        }

        public C13991f(C13995j jVar, C13988d dVar, C13986b bVar) {
            this.f34157a = jVar;
            this.f34158b = dVar;
            this.f34159c = bVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$g */
    public static final class C13992g extends C14006j0.C14013e {

        /* renamed from: c */
        public final C13995j f34161c;

        /* renamed from: d */
        public final C13988d f34162d;

        /* renamed from: e */
        public final C13986b f34163e;

        /* renamed from: f */
        public final C13992g f34164f;

        /* renamed from: A */
        public void mo33488A(LoyaltyAmountHistoryFragment loyaltyAmountHistoryFragment) {
        }

        /* renamed from: A0 */
        public void mo33489A0(AccountListHomeFragment accountListHomeFragment) {
            mo33732r2(accountListHomeFragment);
        }

        /* renamed from: A1 */
        public void mo33490A1(ProductSearchWithListFragment productSearchWithListFragment) {
            mo33615X3(productSearchWithListFragment);
        }

        @C32488a
        /* renamed from: A2 */
        public final AlternativeProductsBottomSheetFragment mo33491A2(AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment) {
            C27738e.m116566d(alternativeProductsBottomSheetFragment, (C28796c) this.f34161c.f34236k0.get());
            C27738e.m116565b(alternativeProductsBottomSheetFragment, mo33633b2());
            return alternativeProductsBottomSheetFragment;
        }

        @C32488a
        /* renamed from: A3 */
        public final NonFoodCheckoutStep2Fragment mo33492A3(NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment) {
            C23668f.m105126d(nonFoodCheckoutStep2Fragment, (C28796c) this.f34161c.f34236k0.get());
            C23668f.m105125b(nonFoodCheckoutStep2Fragment, this.f34161c.mo34054q8());
            C23668f.m105127e(nonFoodCheckoutStep2Fragment, this.f34161c.mo33788A8());
            return nonFoodCheckoutStep2Fragment;
        }

        /* renamed from: A4 */
        public final C27004i mo33493A4() {
            return new C27004i((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: B */
        public void mo33494B(AccountListOrderFragment accountListOrderFragment) {
            mo33738s2(accountListOrderFragment);
        }

        /* renamed from: B0 */
        public void mo33495B0(CheckoutStepOneAdditionalOrderFragment checkoutStepOneAdditionalOrderFragment) {
        }

        /* renamed from: B1 */
        public void mo33496B1(SecretCodeFragment secretCodeFragment) {
            mo33629a4(secretCodeFragment);
        }

        @C32488a
        /* renamed from: B2 */
        public final AppEnvironmentSelectionFragment mo33497B2(AppEnvironmentSelectionFragment appEnvironmentSelectionFragment) {
            C23990c.m105924b(appEnvironmentSelectionFragment, (AppEnvironment) this.f34161c.f34199P.get());
            return appEnvironmentSelectionFragment;
        }

        @C32488a
        /* renamed from: B3 */
        public final NonFoodProductDetailsFragment mo33498B3(NonFoodProductDetailsFragment nonFoodProductDetailsFragment) {
            C27898n.m117049b(nonFoodProductDetailsFragment, mo33510D4());
            C27898n.m117051e(nonFoodProductDetailsFragment, (C28796c) this.f34161c.f34236k0.get());
            C27898n.m117050c(nonFoodProductDetailsFragment, (C28936j) this.f34161c.f34240m0.get());
            return nonFoodProductDetailsFragment;
        }

        /* renamed from: B4 */
        public final C26314e mo33499B4() {
            return new C26314e((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: C */
        public void mo33500C(ProductListPromoFragment productListPromoFragment) {
            mo33590S3(productListPromoFragment);
        }

        /* renamed from: C0 */
        public void mo33501C0(StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment) {
            mo33695k4(storeFacilitiesBottomSheetFragment);
        }

        /* renamed from: C1 */
        public void mo33502C1(CatalogsFavoriteProductListFragment catalogsFavoriteProductListFragment) {
        }

        @C32488a
        /* renamed from: C2 */
        public final BarcodeScannerFragment mo33503C2(BarcodeScannerFragment barcodeScannerFragment) {
            C25715e.m110415d(barcodeScannerFragment, (C28796c) this.f34161c.f34236k0.get());
            C25715e.m110416e(barcodeScannerFragment, mo33527G4());
            C25715e.m110417f(barcodeScannerFragment, mo33545J4());
            C25715e.m110414b(barcodeScannerFragment, this.f34161c.mo33941a5());
            return barcodeScannerFragment;
        }

        @C32488a
        /* renamed from: C3 */
        public final OnlineShopBasketDetailsFragment mo33504C3(OnlineShopBasketDetailsFragment onlineShopBasketDetailsFragment) {
            C24209f.m106576b(onlineShopBasketDetailsFragment, this.f34163e.mo33424r());
            return onlineShopBasketDetailsFragment;
        }

        /* renamed from: C4 */
        public final PlpProductAnalytics mo33505C4() {
            return new PlpProductAnalytics(C10242e.m38491c(this.f34161c.f34219c), (C13783a) this.f34161c.f34193M.get(), (C13814a) this.f34161c.f34230h0.get());
        }

        /* renamed from: D */
        public void mo32151D(SignInFragment signInFragment) {
            mo33676i4(signInFragment);
        }

        /* renamed from: D0 */
        public void mo33506D0(QuantityBackDropFragment quantityBackDropFragment) {
        }

        /* renamed from: D1 */
        public void mo33507D1(CatalogPagerFragment catalogPagerFragment) {
            mo33555L2(catalogPagerFragment);
        }

        @C32488a
        /* renamed from: D2 */
        public final BasketAdditionalOrderFragment mo33508D2(BasketAdditionalOrderFragment basketAdditionalOrderFragment) {
            C25182l.m108857b(basketAdditionalOrderFragment, this.f34161c.mo34051q5());
            return basketAdditionalOrderFragment;
        }

        @C32488a
        /* renamed from: D3 */
        public final OnlineStoreShopFragment mo33509D3(OnlineStoreShopFragment onlineStoreShopFragment) {
            C24213j.m106580b(onlineStoreShopFragment, this.f34163e.mo33424r());
            return onlineStoreShopFragment;
        }

        /* renamed from: D4 */
        public final C28123g mo33510D4() {
            return new C28123g((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: E */
        public void mo33511E(DepartmentDetailsFragment departmentDetailsFragment) {
            mo33700l3(departmentDetailsFragment);
        }

        /* renamed from: E0 */
        public void mo33512E0(AccountMenuFragment accountMenuFragment) {
            mo33749u2(accountMenuFragment);
        }

        /* renamed from: E1 */
        public void mo33513E1(WithdrawalOrderDriveFragment withdrawalOrderDriveFragment) {
        }

        @C32488a
        /* renamed from: E2 */
        public final BasketBuilderDepartmentFragment mo33514E2(BasketBuilderDepartmentFragment basketBuilderDepartmentFragment) {
            C23212c.m103862d(basketBuilderDepartmentFragment, (C28796c) this.f34161c.f34236k0.get());
            C23212c.m103861b(basketBuilderDepartmentFragment, mo33639c2());
            return basketBuilderDepartmentFragment;
        }

        @C32488a
        /* renamed from: E3 */
        public final OrderOnlineFragment mo33515E3(OrderOnlineFragment orderOnlineFragment) {
            C27070c.m114410b(orderOnlineFragment, this.f34161c.mo34090w8());
            C27070c.m114411d(orderOnlineFragment, (C28796c) this.f34161c.f34236k0.get());
            return orderOnlineFragment;
        }

        /* renamed from: E4 */
        public final C27180a mo33516E4() {
            return new C27180a(C10242e.m38491c(this.f34161c.f34219c), (C13783a) this.f34161c.f34193M.get(), (C13814a) this.f34161c.f34230h0.get());
        }

        /* renamed from: F */
        public void mo33517F(StoreCatalogListFragment storeCatalogListFragment) {
            mo33689j4(storeCatalogListFragment);
        }

        /* renamed from: F0 */
        public void mo33518F0(ReinsuranceFragment reinsuranceFragment) {
        }

        /* renamed from: F1 */
        public void mo33519F1(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            mo33580Q2(checkoutConfirmationFragment);
        }

        @C32488a
        /* renamed from: F2 */
        public final BasketBuilderFrequentPurchasesFragment mo33520F2(BasketBuilderFrequentPurchasesFragment basketBuilderFrequentPurchasesFragment) {
            C23221h.m103889d(basketBuilderFrequentPurchasesFragment, (C28796c) this.f34161c.f34236k0.get());
            C23221h.m103888b(basketBuilderFrequentPurchasesFragment, mo33645d2());
            return basketBuilderFrequentPurchasesFragment;
        }

        @C32488a
        /* renamed from: F3 */
        public final OrdersOfflineDetailsFragment mo33521F3(OrdersOfflineDetailsFragment ordersOfflineDetailsFragment) {
            C24775h.m107974c(ordersOfflineDetailsFragment, mo33769x4());
            return ordersOfflineDetailsFragment;
        }

        /* renamed from: F4 */
        public final C27177a mo33522F4() {
            return new C27177a(C10242e.m38491c(this.f34161c.f34219c), (C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: G */
        public void mo33523G(InfoCardsFragment infoCardsFragment) {
            mo33739s3(infoCardsFragment);
        }

        /* renamed from: G0 */
        public void mo31758G0(AccountInfoFragment accountInfoFragment) {
            mo33726q2(accountInfoFragment);
        }

        /* renamed from: G1 */
        public void mo33524G1(AttachCardFragment attachCardFragment) {
        }

        @C32488a
        /* renamed from: G2 */
        public final BasketBuilderMyListsFragment mo33525G2(BasketBuilderMyListsFragment basketBuilderMyListsFragment) {
            C23223j.m103893b(basketBuilderMyListsFragment, mo33651e2());
            return basketBuilderMyListsFragment;
        }

        @C32488a
        /* renamed from: G3 */
        public final OrdersOfflineFragment mo33526G3(OrdersOfflineFragment ordersOfflineFragment) {
            C24779l.m107979c(ordersOfflineFragment, mo33775y4());
            return ordersOfflineFragment;
        }

        /* renamed from: G4 */
        public final C27264a mo33527G4() {
            return new C27264a(C10242e.m38491c(this.f34161c.f34219c), (C13783a) this.f34161c.f34193M.get(), (C13814a) this.f34161c.f34230h0.get());
        }

        /* renamed from: H */
        public void mo33528H(BarcodeScannerFragment barcodeScannerFragment) {
            mo33503C2(barcodeScannerFragment);
        }

        /* renamed from: H0 */
        public void mo33529H0(BaseLoyaltyFragment baseLoyaltyFragment) {
        }

        /* renamed from: H1 */
        public void mo33530H1(OrderOnlineFragment orderOnlineFragment) {
            mo33515E3(orderOnlineFragment);
        }

        @C32488a
        /* renamed from: H2 */
        public final BasketBuilderSignInBottomSheetFragment mo33531H2(BasketBuilderSignInBottomSheetFragment basketBuilderSignInBottomSheetFragment) {
            C23225l.m103897b(basketBuilderSignInBottomSheetFragment, mo33657f2());
            return basketBuilderSignInBottomSheetFragment;
        }

        @C32488a
        /* renamed from: H3 */
        public final OrdersOnlineDetailsFragment mo33532H3(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment) {
            C25213k.m108963b(ordersOnlineDetailsFragment, (AppEnvironment) this.f34161c.f34199P.get());
            C25213k.m108966f(ordersOnlineDetailsFragment, mo33781z4());
            C25213k.m108964c(ordersOnlineDetailsFragment, this.f34161c.mo34027m9());
            C25213k.m108965d(ordersOnlineDetailsFragment, this.f34161c.mo34034n9());
            return ordersOnlineDetailsFragment;
        }

        /* renamed from: H4 */
        public final C27272f mo33533H4() {
            return new C27272f((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: I */
        public void mo33534I(MixingProductsBottomSheetDialogFragment mixingProductsBottomSheetDialogFragment) {
            mo33768x3(mixingProductsBottomSheetDialogFragment);
        }

        /* renamed from: I0 */
        public void mo33535I0(CouponsFilterFragment couponsFilterFragment) {
        }

        /* renamed from: I1 */
        public void mo33536I1(ShoppingListFragment shoppingListFragment) {
            mo33671h4(shoppingListFragment);
        }

        @C32488a
        /* renamed from: I2 */
        public final BlockedCardFragment mo33537I2(BlockedCardFragment blockedCardFragment) {
            C24610d.m107597b(blockedCardFragment, (ClearAppManager) this.f34161c.f34242n0.get());
            return blockedCardFragment;
        }

        @C32488a
        /* renamed from: I3 */
        public final OrdersOnlineFragment mo33538I3(OrdersOnlineFragment ordersOnlineFragment) {
            C25215m.m108970b(ordersOnlineFragment, (AppEnvironment) this.f34161c.f34199P.get());
            C25215m.m108971d(ordersOnlineFragment, mo33493A4());
            return ordersOnlineFragment;
        }

        /* renamed from: I4 */
        public final C27280k mo33539I4() {
            return new C27280k((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: J */
        public void mo33540J(CreateLoyaltyCardStepOneFragment createLoyaltyCardStepOneFragment) {
        }

        /* renamed from: J0 */
        public void mo33541J0(OrdersFragment ordersFragment) {
        }

        /* renamed from: J1 */
        public void mo33542J1(CheckoutFragment checkoutFragment) {
            mo33585R2(checkoutFragment);
        }

        @C32488a
        /* renamed from: J2 */
        public final CatalogBuilderFragment mo33543J2(CatalogBuilderFragment catalogBuilderFragment) {
            C39541e.m161856d(catalogBuilderFragment, (C28796c) this.f34161c.f34236k0.get());
            C39541e.m161855b(catalogBuilderFragment, (C28936j) this.f34161c.f34240m0.get());
            return catalogBuilderFragment;
        }

        @C32488a
        /* renamed from: J3 */
        public final OrdersSuccessHandleFragment mo33544J3(OrdersSuccessHandleFragment ordersSuccessHandleFragment) {
            C24704m.m107843c(ordersSuccessHandleFragment, (C28796c) this.f34161c.f34236k0.get());
            return ordersSuccessHandleFragment;
        }

        /* renamed from: J4 */
        public final C27400d mo33545J4() {
            return new C27400d(C10242e.m38491c(this.f34161c.f34219c), (C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: K */
        public void mo33546K(NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment) {
            mo33780z3(nonFoodCheckoutStep1Fragment);
        }

        /* renamed from: K0 */
        public void mo33547K0(BasketBuilderFragment basketBuilderFragment) {
        }

        /* renamed from: K1 */
        public void mo33548K1(CreateOrAttachCardFragment createOrAttachCardFragment) {
        }

        @C32488a
        /* renamed from: K2 */
        public final CatalogDetailsFragment mo33549K2(CatalogDetailsFragment catalogDetailsFragment) {
            C39496e.m161779b(catalogDetailsFragment, (C28936j) this.f34161c.f34240m0.get());
            return catalogDetailsFragment;
        }

        @C32488a
        /* renamed from: K3 */
        public final PaymentMethodFragment mo33550K3(PaymentMethodFragment paymentMethodFragment) {
            C39883c.m162563b(paymentMethodFragment, (AppEnvironment) this.f34161c.f34199P.get());
            C39883c.m162564c(paymentMethodFragment, (C28936j) this.f34161c.f34240m0.get());
            return paymentMethodFragment;
        }

        /* renamed from: K4 */
        public final ServiceSelectionBackdropAnalyticsReporter mo33551K4() {
            return new ServiceSelectionBackdropAnalyticsReporter((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: L */
        public void mo33552L(ProductListDepartmentFragment productListDepartmentFragment) {
            mo33576P3(productListDepartmentFragment);
        }

        /* renamed from: L0 */
        public void mo33553L0(LoyaltyNotLoggedFragment loyaltyNotLoggedFragment) {
            mo33750u3(loyaltyNotLoggedFragment);
        }

        /* renamed from: L1 */
        public void mo33554L1(NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment) {
            mo33492A3(nonFoodCheckoutStep2Fragment);
        }

        @C32488a
        /* renamed from: L2 */
        public final CatalogPagerFragment mo33555L2(CatalogPagerFragment catalogPagerFragment) {
            C39537b.m161851b(catalogPagerFragment, (AppEnvironment) this.f34161c.f34199P.get());
            return catalogPagerFragment;
        }

        @C32488a
        /* renamed from: L3 */
        public final PhysicalStoreFragment mo33556L3(PhysicalStoreFragment physicalStoreFragment) {
            C25404d.m109672b(physicalStoreFragment, this.f34161c.mo33806D8());
            C25404d.m109673c(physicalStoreFragment, (C28936j) this.f34161c.f34240m0.get());
            C25404d.m109674e(physicalStoreFragment, (C28796c) this.f34161c.f34236k0.get());
            return physicalStoreFragment;
        }

        /* renamed from: L4 */
        public final C39866a mo33557L4() {
            return new C39866a((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: M */
        public void mo33558M(ProductListQueryFragment productListQueryFragment) {
            mo33595T3(productListQueryFragment);
        }

        /* renamed from: M0 */
        public void mo33559M0(CouponDetailsOverlayBottomSheetFragment couponDetailsOverlayBottomSheetFragment) {
            mo33646d3(couponDetailsOverlayBottomSheetFragment);
        }

        /* renamed from: M1 */
        public void mo33560M1(CookiesTracersPolicyFragment cookiesTracersPolicyFragment) {
            mo33640c3(cookiesTracersPolicyFragment);
        }

        @C32488a
        /* renamed from: M2 */
        public final CatalogProductDetailsFragment mo33561M2(CatalogProductDetailsFragment catalogProductDetailsFragment) {
            C39583e.m161921b(catalogProductDetailsFragment, (C28936j) this.f34161c.f34240m0.get());
            return catalogProductDetailsFragment;
        }

        @C32488a
        /* renamed from: M3 */
        public final PickupPointsMapFragment mo33562M3(PickupPointsMapFragment pickupPointsMapFragment) {
            C23697g.m105205b(pickupPointsMapFragment, C10241d.m38488c(this.f34161c.f34219c));
            C23697g.m105206d(pickupPointsMapFragment, this.f34161c.mo34054q8());
            return pickupPointsMapFragment;
        }

        /* renamed from: M4 */
        public final C26350a mo33563M4() {
            return new C26350a((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: N */
        public void mo33564N(PickupPointsMapFragment pickupPointsMapFragment) {
            mo33562M3(pickupPointsMapFragment);
        }

        /* renamed from: N0 */
        public void mo32186N0(AccountUpdateSuccessFragment accountUpdateSuccessFragment) {
            mo33755v2(accountUpdateSuccessFragment);
        }

        /* renamed from: N1 */
        public void mo31943N1(UpdateUserAddressFragment updateUserAddressFragment) {
            mo33713n4(updateUserAddressFragment);
        }

        @C32488a
        /* renamed from: N2 */
        public final ChannelsFidFragment mo33565N2(ChannelsFidFragment channelsFidFragment) {
            C24617h.m107620d(channelsFidFragment, this.f34161c.mo33788A8());
            C24617h.m107619b(channelsFidFragment, (ClearAppManager) this.f34161c.f34242n0.get());
            return channelsFidFragment;
        }

        @C32488a
        /* renamed from: N3 */
        public final ProductDetailsFragment mo33566N3(ProductDetailsFragment productDetailsFragment) {
            C27816m.m116796c(productDetailsFragment, (C28796c) this.f34161c.f34236k0.get());
            return productDetailsFragment;
        }

        /* renamed from: O */
        public void mo33567O(ProductSearchWithListRecommendationResultsFragment productSearchWithListRecommendationResultsFragment) {
            mo33619Y3(productSearchWithListRecommendationResultsFragment);
        }

        /* renamed from: O0 */
        public void mo33568O0(CheckoutPaymentFragment checkoutPaymentFragment) {
            mo33594T2(checkoutPaymentFragment);
        }

        /* renamed from: O1 */
        public void mo33569O1(CreateSecretCodeFragment createSecretCodeFragment) {
        }

        @C32488a
        /* renamed from: O2 */
        public final CheckoutBasketsListFragment mo33570O2(CheckoutBasketsListFragment checkoutBasketsListFragment) {
            C23473f.m104581d(checkoutBasketsListFragment, (C28796c) this.f34161c.f34236k0.get());
            C23473f.m104580b(checkoutBasketsListFragment, this.f34161c.mo33833I5());
            return checkoutBasketsListFragment;
        }

        @C32488a
        /* renamed from: O3 */
        public final ProductDetailsImageFragment mo33571O3(ProductDetailsImageFragment productDetailsImageFragment) {
            C27915r.m117103b(productDetailsImageFragment, (C28936j) this.f34161c.f34240m0.get());
            return productDetailsImageFragment;
        }

        /* renamed from: P */
        public void mo33572P(AccountConsentDataTabFragment accountConsentDataTabFragment) {
            mo33717o2(accountConsentDataTabFragment);
        }

        /* renamed from: P0 */
        public void mo33573P0(BaseStoreFragment baseStoreFragment) {
        }

        /* renamed from: P1 */
        public void mo33574P1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment) {
        }

        @C32488a
        /* renamed from: P2 */
        public final com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment mo33575P2(com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment checkoutConfirmationFragment) {
            C23760k.m105378b(checkoutConfirmationFragment, mo33663g2());
            C23760k.m105379c(checkoutConfirmationFragment, (C21424c) this.f34161c.f34246p0.get());
            C23760k.m105380e(checkoutConfirmationFragment, (C32121c) this.f34161c.f34234j0.get());
            return checkoutConfirmationFragment;
        }

        @C32488a
        /* renamed from: P3 */
        public final ProductListDepartmentFragment mo33576P3(ProductListDepartmentFragment productListDepartmentFragment) {
            C28056l.m117558d(productListDepartmentFragment, (C28796c) this.f34161c.f34236k0.get());
            C28056l.m117559e(productListDepartmentFragment, mo33505C4());
            C28056l.m117557b(productListDepartmentFragment, (C28936j) this.f34161c.f34240m0.get());
            return productListDepartmentFragment;
        }

        /* renamed from: Q */
        public void mo33577Q(CheckoutBasketsListFragment checkoutBasketsListFragment) {
            mo33570O2(checkoutBasketsListFragment);
        }

        /* renamed from: Q0 */
        public void mo33578Q0(ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment) {
            mo33610W3(productSearchWithListAllResultsFragment);
        }

        /* renamed from: Q1 */
        public void mo33579Q1(ProductListFiltersDialogFragment productListFiltersDialogFragment) {
            mo33581Q3(productListFiltersDialogFragment);
        }

        @C32488a
        /* renamed from: Q2 */
        public final CheckoutConfirmationFragment mo33580Q2(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            C25124h.m108719b(checkoutConfirmationFragment, (C21424c) this.f34161c.f34246p0.get());
            return checkoutConfirmationFragment;
        }

        @C32488a
        /* renamed from: Q3 */
        public final ProductListFiltersDialogFragment mo33581Q3(ProductListFiltersDialogFragment productListFiltersDialogFragment) {
            C25444g.m109792d(productListFiltersDialogFragment, (ProductListFiltersViewModel) this.f34161c.f34252s0.get());
            C25444g.m109791c(productListFiltersDialogFragment, mo33522F4());
            return productListFiltersDialogFragment;
        }

        /* renamed from: R */
        public void mo33582R(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment) {
            mo33773y2(additionalOrderProductSearchFragment);
        }

        /* renamed from: R0 */
        public void mo33583R0(AdditionalOrderFragment additionalOrderFragment) {
            mo33767x2(additionalOrderFragment);
        }

        /* renamed from: R1 */
        public void mo33584R1(PhysicalStoreFragment physicalStoreFragment) {
            mo33556L3(physicalStoreFragment);
        }

        @C32488a
        /* renamed from: R2 */
        public final CheckoutFragment mo33585R2(CheckoutFragment checkoutFragment) {
            C23358d.m104229b(checkoutFragment, (ClearAppManager) this.f34161c.f34242n0.get());
            return checkoutFragment;
        }

        @C32488a
        /* renamed from: R3 */
        public final ProductListFiltersSortAndFacetFragment mo33586R3(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment) {
            C25449l.m109796c(productListFiltersSortAndFacetFragment, (ProductListFiltersViewModel) this.f34161c.f34252s0.get());
            return productListFiltersSortAndFacetFragment;
        }

        /* renamed from: S */
        public void mo33587S(CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment) {
            mo33652e3(couponProductsOverlayBottomSheetFragment);
        }

        /* renamed from: S0 */
        public void mo31796S0(UpdateUserPasswordFragment updateUserPasswordFragment) {
            mo33723p4(updateUserPasswordFragment);
        }

        /* renamed from: S1 */
        public final C25755a mo33588S1() {
            return new C25755a((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: S2 */
        public final CheckoutPaymentErrorFragment mo33589S2(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment) {
            C23768r.m105397b(checkoutPaymentErrorFragment, mo33663g2());
            return checkoutPaymentErrorFragment;
        }

        @C32488a
        /* renamed from: S3 */
        public final ProductListPromoFragment mo33590S3(ProductListPromoFragment productListPromoFragment) {
            C28075p.m117608d(productListPromoFragment, (C28796c) this.f34161c.f34236k0.get());
            C28075p.m117609e(productListPromoFragment, mo33505C4());
            C28075p.m117607b(productListPromoFragment, (C28936j) this.f34161c.f34240m0.get());
            return productListPromoFragment;
        }

        /* renamed from: T */
        public void mo33591T(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment) {
            mo33779z2(additionalOrderSearchResultFragment);
        }

        /* renamed from: T0 */
        public void mo33592T0(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment) {
            mo33675i3(createLoyaltyCardStepTwoFragment);
        }

        /* renamed from: T1 */
        public final C25786e mo33593T1() {
            return new C25786e(new C13744c(), (C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: T2 */
        public final CheckoutPaymentFragment mo33594T2(CheckoutPaymentFragment checkoutPaymentFragment) {
            C25147p.m108780b(checkoutPaymentFragment, (AppEnvironment) this.f34161c.f34199P.get());
            return checkoutPaymentFragment;
        }

        @C32488a
        /* renamed from: T3 */
        public final ProductListQueryFragment mo33595T3(ProductListQueryFragment productListQueryFragment) {
            C28080t.m117615d(productListQueryFragment, (C28796c) this.f34161c.f34236k0.get());
            C28080t.m117616e(productListQueryFragment, mo33505C4());
            C28080t.m117614b(productListQueryFragment, (C28936j) this.f34161c.f34240m0.get());
            return productListQueryFragment;
        }

        /* renamed from: U */
        public void mo33596U(OnlineShopBasketDetailsFragment onlineShopBasketDetailsFragment) {
            mo33504C3(onlineShopBasketDetailsFragment);
        }

        /* renamed from: U0 */
        public void mo33597U0(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment) {
            mo33659f4(serviceStationsLandingPageFragment);
        }

        /* renamed from: U1 */
        public final C38531a mo33598U1() {
            return new C38531a((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: U2 */
        public final CheckoutStep1FooterFragment mo33599U2(CheckoutStep1FooterFragment checkoutStep1FooterFragment) {
            C23362g.m104233b(checkoutStep1FooterFragment, mo33669h2());
            return checkoutStep1FooterFragment;
        }

        @C32488a
        /* renamed from: U3 */
        public final ProductListSearchFragment mo33600U3(ProductListSearchFragment productListSearchFragment) {
            C28085x.m117622d(productListSearchFragment, (C28796c) this.f34161c.f34236k0.get());
            C28085x.m117623e(productListSearchFragment, mo33505C4());
            C28085x.m117621b(productListSearchFragment, (C28936j) this.f34161c.f34240m0.get());
            return productListSearchFragment;
        }

        /* renamed from: V */
        public void mo33601V(AppMessageFragment appMessageFragment) {
        }

        /* renamed from: V0 */
        public void mo33602V0(ProductListSearchFragment productListSearchFragment) {
            mo33600U3(productListSearchFragment);
        }

        /* renamed from: V1 */
        public final C25807a mo33603V1() {
            return new C25807a((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: V2 */
        public final CheckoutStep1Fragment mo33604V2(CheckoutStep1Fragment checkoutStep1Fragment) {
            C23368j.m104260d(checkoutStep1Fragment, (C28796c) this.f34161c.f34236k0.get());
            C23368j.m104259b(checkoutStep1Fragment, mo33669h2());
            return checkoutStep1Fragment;
        }

        @C32488a
        /* renamed from: V3 */
        public final ProductSearchFragment mo33605V3(ProductSearchFragment productSearchFragment) {
            C25582p.m110173d(productSearchFragment, mo33527G4());
            C25582p.m110172b(productSearchFragment, this.f34161c.mo33941a5());
            return productSearchFragment;
        }

        /* renamed from: W */
        public void mo33606W(ExitAdditionalOrderBottomSheetFragment exitAdditionalOrderBottomSheetFragment) {
        }

        /* renamed from: W0 */
        public void mo33607W0(CatalogProductListFragment catalogProductListFragment) {
        }

        /* renamed from: W1 */
        public final C25858a mo33608W1() {
            return new C25858a((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: W2 */
        public final CheckoutStep2Fragment mo33609W2(CheckoutStep2Fragment checkoutStep2Fragment) {
            C23375n.m104291b(checkoutStep2Fragment, (C28936j) this.f34161c.f34240m0.get());
            return checkoutStep2Fragment;
        }

        @C32488a
        /* renamed from: W3 */
        public final ProductSearchWithListAllResultsFragment mo33610W3(ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment) {
            C25676m.m110331d(productSearchWithListAllResultsFragment, (C28796c) this.f34161c.f34236k0.get());
            C25676m.m110330b(productSearchWithListAllResultsFragment, mo33533H4());
            return productSearchWithListAllResultsFragment;
        }

        /* renamed from: X */
        public void mo33611X(BasketBuilderMyListsFragment basketBuilderMyListsFragment) {
            mo33525G2(basketBuilderMyListsFragment);
        }

        /* renamed from: X0 */
        public void mo33612X0(CatalogDetailsFragment catalogDetailsFragment) {
            mo33549K2(catalogDetailsFragment);
        }

        /* renamed from: X1 */
        public final C25882a mo33613X1() {
            return new C25882a((C13783a) this.f34161c.f34193M.get(), (C13814a) this.f34161c.f34230h0.get(), new C13744c());
        }

        @C32488a
        /* renamed from: X2 */
        public final CheckoutStep3CgvFragment mo33614X2(CheckoutStep3CgvFragment checkoutStep3CgvFragment) {
            C23377p.m104295b(checkoutStep3CgvFragment, (C28936j) this.f34161c.f34240m0.get());
            return checkoutStep3CgvFragment;
        }

        @C32488a
        /* renamed from: X3 */
        public final ProductSearchWithListFragment mo33615X3(ProductSearchWithListFragment productSearchWithListFragment) {
            C25689v.m110360c(productSearchWithListFragment, mo33527G4());
            return productSearchWithListFragment;
        }

        /* renamed from: Y */
        public C10192g mo21663Y() {
            return new C14002o(this.f34161c, this.f34162d, this.f34163e, this.f34164f);
        }

        /* renamed from: Y0 */
        public void mo33616Y0(OrdersSuccessHandleFragment ordersSuccessHandleFragment) {
            mo33544J3(ordersSuccessHandleFragment);
        }

        /* renamed from: Y1 */
        public final C25835a mo33617Y1() {
            return new C25835a((C13783a) this.f34161c.f34193M.get(), new C13744c());
        }

        @C32488a
        /* renamed from: Y2 */
        public final CheckoutStep4Fragment mo33618Y2(CheckoutStep4Fragment checkoutStep4Fragment) {
            C23435v.m104492b(checkoutStep4Fragment, (AppEnvironment) this.f34161c.f34199P.get());
            C23435v.m104494d(checkoutStep4Fragment, mo33674i2());
            C23435v.m104493c(checkoutStep4Fragment, mo33663g2());
            C23435v.m104495f(checkoutStep4Fragment, this.f34161c.mo33907U7());
            return checkoutStep4Fragment;
        }

        @C32488a
        /* renamed from: Y3 */
        public final ProductSearchWithListRecommendationResultsFragment mo33619Y3(ProductSearchWithListRecommendationResultsFragment productSearchWithListRecommendationResultsFragment) {
            C25680q.m110336d(productSearchWithListRecommendationResultsFragment, (C28796c) this.f34161c.f34236k0.get());
            C25680q.m110335b(productSearchWithListRecommendationResultsFragment, mo33539I4());
            return productSearchWithListRecommendationResultsFragment;
        }

        /* renamed from: Z */
        public void mo33620Z(ScannerFragment scannerFragment) {
        }

        /* renamed from: Z0 */
        public void mo33621Z0(CouponsBarcodeScannerFragment couponsBarcodeScannerFragment) {
        }

        /* renamed from: Z1 */
        public final C25796a mo33622Z1() {
            return new C25796a((C13783a) this.f34161c.f34193M.get(), new C13744c(), this.f34161c.mo33927X9());
        }

        @C32488a
        /* renamed from: Z2 */
        public final CheckoutStepTwoCgvDialogFragment mo33623Z2(CheckoutStepTwoCgvDialogFragment checkoutStepTwoCgvDialogFragment) {
            C25139l0.m108764b(checkoutStepTwoCgvDialogFragment, (C28936j) this.f34161c.f34240m0.get());
            return checkoutStepTwoCgvDialogFragment;
        }

        @C32488a
        /* renamed from: Z3 */
        public final com.carrefour.fid.android.product.presentation.p039ui.quantity.QuantityBackDropFragment mo33624Z3(com.carrefour.fid.android.product.presentation.p039ui.quantity.QuantityBackDropFragment quantityBackDropFragment) {
            C28101d.m117654d(quantityBackDropFragment, (C28796c) this.f34161c.f34236k0.get());
            C28101d.m117653b(quantityBackDropFragment, mo33633b2());
            return quantityBackDropFragment;
        }

        /* renamed from: a */
        public C10195a.C10199d mo21637a() {
            return this.f34163e.mo21635a();
        }

        /* renamed from: a0 */
        public void mo33625a0(CheckoutStep1Fragment checkoutStep1Fragment) {
            mo33604V2(checkoutStep1Fragment);
        }

        /* renamed from: a1 */
        public void mo33626a1(ServiceStationsCameraFragment serviceStationsCameraFragment) {
            mo33653e4(serviceStationsCameraFragment);
        }

        /* renamed from: a2 */
        public final C13294h mo33627a2() {
            return new C13294h((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: a3 */
        public final ConfigureConsentOptinsFragment mo33628a3(ConfigureConsentOptinsFragment configureConsentOptinsFragment) {
            ConfigureConsentOptinsFragment_MembersInjector.injectFragmentUtil(configureConsentOptinsFragment, (C28936j) this.f34161c.f34240m0.get());
            return configureConsentOptinsFragment;
        }

        @C32488a
        /* renamed from: a4 */
        public final SecretCodeFragment mo33629a4(SecretCodeFragment secretCodeFragment) {
            C24629p.m107653d(secretCodeFragment, this.f34161c.mo33788A8());
            C24629p.m107652b(secretCodeFragment, (ClearAppManager) this.f34161c.f34242n0.get());
            return secretCodeFragment;
        }

        /* renamed from: b */
        public void mo33630b(AdditionalOrderBottomSheetFragment additionalOrderBottomSheetFragment) {
        }

        /* renamed from: b0 */
        public void mo33631b0(CheckoutStep1FooterFragment checkoutStep1FooterFragment) {
            mo33599U2(checkoutStep1FooterFragment);
        }

        /* renamed from: b1 */
        public void mo33632b1(BaseAccountFragment baseAccountFragment) {
        }

        /* renamed from: b2 */
        public final C27631a mo33633b2() {
            return new C27631a((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: b3 */
        public final ConsentBackDropFragment mo33634b3(ConsentBackDropFragment consentBackDropFragment) {
            ConsentBackDropFragment_MembersInjector.injectNavigator(consentBackDropFragment, (C28796c) this.f34161c.f34236k0.get());
            return consentBackDropFragment;
        }

        @C32488a
        /* renamed from: b4 */
        public final ServiceSelectionBackDropFragment mo33635b4(ServiceSelectionBackDropFragment serviceSelectionBackDropFragment) {
            ServiceSelectionBackDropFragment_MembersInjector.injectNavigator(serviceSelectionBackDropFragment, (C28796c) this.f34161c.f34236k0.get());
            ServiceSelectionBackDropFragment_MembersInjector.injectAnalytics(serviceSelectionBackDropFragment, mo33551K4());
            return serviceSelectionBackDropFragment;
        }

        /* renamed from: c */
        public void mo33636c(LegalNoticeFragment legalNoticeFragment) {
            mo33744t3(legalNoticeFragment);
        }

        /* renamed from: c0 */
        public void mo33637c0(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment) {
            mo33589S2(checkoutPaymentErrorFragment);
        }

        /* renamed from: c1 */
        public void mo33638c1(LuckyCartBottomSheetDialogFragment luckyCartBottomSheetDialogFragment) {
            mo33756v3(luckyCartBottomSheetDialogFragment);
        }

        /* renamed from: c2 */
        public final C25948a mo33639c2() {
            return new C25948a((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: c3 */
        public final CookiesTracersPolicyFragment mo33640c3(CookiesTracersPolicyFragment cookiesTracersPolicyFragment) {
            C28230b.m118170c(cookiesTracersPolicyFragment, mo33687j2());
            return cookiesTracersPolicyFragment;
        }

        @C32488a
        /* renamed from: c4 */
        public final ServiceSlotFragment mo33641c4(ServiceSlotFragment serviceSlotFragment) {
            C39929g.m162696e(serviceSlotFragment, (C28796c) this.f34161c.f34236k0.get());
            C39929g.m162695c(serviceSlotFragment, (C28936j) this.f34161c.f34240m0.get());
            C39929g.m162694b(serviceSlotFragment, mo33557L4());
            return serviceSlotFragment;
        }

        /* renamed from: d */
        public void mo33642d(OnlineStoreShopFragment onlineStoreShopFragment) {
            mo33509D3(onlineStoreShopFragment);
        }

        /* renamed from: d0 */
        public void mo33643d0(AccountListFragment accountListFragment) {
        }

        /* renamed from: d1 */
        public void mo33644d1(ProductDetailsImageFragment productDetailsImageFragment) {
            mo33571O3(productDetailsImageFragment);
        }

        /* renamed from: d2 */
        public final C25956f mo33645d2() {
            return new C25956f((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: d3 */
        public final CouponDetailsOverlayBottomSheetFragment mo33646d3(CouponDetailsOverlayBottomSheetFragment couponDetailsOverlayBottomSheetFragment) {
            C23950e.m105828b(couponDetailsOverlayBottomSheetFragment, this.f34161c.mo33912V6());
            return couponDetailsOverlayBottomSheetFragment;
        }

        @C32488a
        /* renamed from: d4 */
        public final ServiceSlotOmrFragment mo33647d4(ServiceSlotOmrFragment serviceSlotOmrFragment) {
            C39934k.m162722d(serviceSlotOmrFragment, (C28796c) this.f34161c.f34236k0.get());
            C39934k.m162721b(serviceSlotOmrFragment, (C28936j) this.f34161c.f34240m0.get());
            return serviceSlotOmrFragment;
        }

        /* renamed from: e */
        public void mo33648e(com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment checkoutConfirmationFragment) {
            mo33575P2(checkoutConfirmationFragment);
        }

        /* renamed from: e0 */
        public void mo33649e0(PaymentMethodFragment paymentMethodFragment) {
            mo33550K3(paymentMethodFragment);
        }

        /* renamed from: e1 */
        public void mo33650e1(BasketAdditionalOrderFragment basketAdditionalOrderFragment) {
            mo33508D2(basketAdditionalOrderFragment);
        }

        /* renamed from: e2 */
        public final C25964k mo33651e2() {
            return new C25964k((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: e3 */
        public final CouponProductsOverlayBottomSheetFragment mo33652e3(CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment) {
            C23914c.m105774d(couponProductsOverlayBottomSheetFragment, (C28796c) this.f34161c.f34236k0.get());
            C23914c.m105773b(couponProductsOverlayBottomSheetFragment, mo33499B4());
            return couponProductsOverlayBottomSheetFragment;
        }

        @C32488a
        /* renamed from: e4 */
        public final ServiceStationsCameraFragment mo33653e4(ServiceStationsCameraFragment serviceStationsCameraFragment) {
            C24036m.m106076c(serviceStationsCameraFragment, mo33563M4());
            return serviceStationsCameraFragment;
        }

        /* renamed from: f */
        public void mo33654f(BlockedCardFragment blockedCardFragment) {
            mo33537I2(blockedCardFragment);
        }

        /* renamed from: f0 */
        public void mo33655f0(OrderLoyaltyCardsBottomSheetDialogFragment orderLoyaltyCardsBottomSheetDialogFragment) {
        }

        /* renamed from: f1 */
        public void mo33656f1(CheckoutStepTwoCgvDialogFragment checkoutStepTwoCgvDialogFragment) {
            mo33623Z2(checkoutStepTwoCgvDialogFragment);
        }

        /* renamed from: f2 */
        public final C25972p mo33657f2() {
            return new C25972p((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: f3 */
        public final CouponsListFragment mo33658f3(CouponsListFragment couponsListFragment) {
            C23885h.m105701b(couponsListFragment, this.f34161c.mo33918W6());
            C23885h.m105702d(couponsListFragment, (C38326b) this.f34161c.f34244o0.get());
            return couponsListFragment;
        }

        @C32488a
        /* renamed from: f4 */
        public final ServiceStationsLandingPageFragment mo33659f4(ServiceStationsLandingPageFragment serviceStationsLandingPageFragment) {
            C24049v.m106104c(serviceStationsLandingPageFragment, mo33563M4());
            return serviceStationsLandingPageFragment;
        }

        /* renamed from: g */
        public void mo33660g(AcceptLoyaltyCguFragment acceptLoyaltyCguFragment) {
        }

        /* renamed from: g0 */
        public void mo33661g0(AccountConsentOptinsTabFragment accountConsentOptinsTabFragment) {
            mo33721p2(accountConsentOptinsTabFragment);
        }

        /* renamed from: g1 */
        public void mo33662g1(BaseServiceStationsFragment baseServiceStationsFragment) {
        }

        /* renamed from: g2 */
        public final C26196a mo33663g2() {
            return new C26196a(C10242e.m38491c(this.f34161c.f34219c), (C13783a) this.f34161c.f34193M.get(), (C13814a) this.f34161c.f34230h0.get(), new C13744c());
        }

        @C32488a
        /* renamed from: g3 */
        public final CouponsScanBarcodeFragment mo33664g3(CouponsScanBarcodeFragment couponsScanBarcodeFragment) {
            C23793d.m105473b(couponsScanBarcodeFragment, mo33693k2());
            return couponsScanBarcodeFragment;
        }

        @C32488a
        /* renamed from: g4 */
        public final ServiceStationsResultFragment mo33665g4(ServiceStationsResultFragment serviceStationsResultFragment) {
            C24054z.m106117b(serviceStationsResultFragment, mo33563M4());
            return serviceStationsResultFragment;
        }

        /* renamed from: h */
        public void mo33666h(CatalogBuilderFragment catalogBuilderFragment) {
            mo33543J2(catalogBuilderFragment);
        }

        /* renamed from: h0 */
        public void mo33667h0(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment) {
            mo33586R3(productListFiltersSortAndFacetFragment);
        }

        /* renamed from: h1 */
        public void mo33668h1(CouponBarcodeFragment couponBarcodeFragment) {
        }

        /* renamed from: h2 */
        public final C26007d mo33669h2() {
            return new C26007d(C10242e.m38491c(this.f34161c.f34219c), (C13783a) this.f34161c.f34193M.get(), (C13814a) this.f34161c.f34230h0.get());
        }

        @C32488a
        /* renamed from: h3 */
        public final CreateAccountFragment mo33670h3(CreateAccountFragment createAccountFragment) {
            C13495d.m58010c(createAccountFragment, (AppEnvironment) this.f34161c.f34199P.get());
            C13495d.m58009b(createAccountFragment, mo33740s4());
            C13495d.m58011d(createAccountFragment, this.f34161c.mo33982g5());
            C13495d.m58012e(createAccountFragment, (C28936j) this.f34161c.f34240m0.get());
            return createAccountFragment;
        }

        @C32488a
        /* renamed from: h4 */
        public final ShoppingListFragment mo33671h4(ShoppingListFragment shoppingListFragment) {
            C23080h.m103619d(shoppingListFragment, (C28796c) this.f34161c.f34236k0.get());
            C23080h.m103618b(shoppingListFragment, mo33613X1());
            return shoppingListFragment;
        }

        /* renamed from: i */
        public void mo32101i(ForgotPasswordFragment forgotPasswordFragment) {
            mo33722p3(forgotPasswordFragment);
        }

        /* renamed from: i0 */
        public void mo33672i0(OrdersOfflineFragment ordersOfflineFragment) {
            mo33526G3(ordersOfflineFragment);
        }

        /* renamed from: i1 */
        public void mo33673i1(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment) {
            mo33532H3(ordersOnlineDetailsFragment);
        }

        /* renamed from: i2 */
        public final C26016i mo33674i2() {
            return new C26016i((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: i3 */
        public final CreateLoyaltyCardStepTwoFragment mo33675i3(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment) {
            C24416j.m107166c(createLoyaltyCardStepTwoFragment, (C28796c) this.f34161c.f34236k0.get());
            return createLoyaltyCardStepTwoFragment;
        }

        @C32488a
        /* renamed from: i4 */
        public final SignInFragment mo33676i4(SignInFragment signInFragment) {
            C13549d.m58093c(signInFragment, (C28796c) this.f34161c.f34236k0.get());
            return signInFragment;
        }

        public void injectConfigureConsentOptinsFragment(ConfigureConsentOptinsFragment configureConsentOptinsFragment) {
            mo33628a3(configureConsentOptinsFragment);
        }

        public void injectConsentBackDropFragment(ConsentBackDropFragment consentBackDropFragment) {
            mo33634b3(consentBackDropFragment);
        }

        public void injectDeliveryServiceSelectionFragment(DeliveryServiceSelectionFragment deliveryServiceSelectionFragment) {
            mo33688j3(deliveryServiceSelectionFragment);
        }

        public void injectDeliverySummaryFragment(DeliverySummaryFragment deliverySummaryFragment) {
            mo33694k3(deliverySummaryFragment);
        }

        public void injectDriveMapFragment(DriveMapFragment driveMapFragment) {
            mo33712n3(driveMapFragment);
        }

        public void injectDriveSummaryFragment(DriveSummaryFragment driveSummaryFragment) {
        }

        public void injectServiceSelectionBackDropFragment(ServiceSelectionBackDropFragment serviceSelectionBackDropFragment) {
            mo33635b4(serviceSelectionBackDropFragment);
        }

        /* renamed from: j */
        public void mo33684j(FacetFragment facetFragment) {
            mo33718o3(facetFragment);
        }

        /* renamed from: j0 */
        public void mo33685j0(OrdersOfflineDetailsFragment ordersOfflineDetailsFragment) {
            mo33521F3(ordersOfflineDetailsFragment);
        }

        /* renamed from: j1 */
        public void mo33686j1(CheckoutStepOneBottomSheetFragment checkoutStepOneBottomSheetFragment) {
        }

        /* renamed from: j2 */
        public final C25805g mo33687j2() {
            return new C25805g((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: j3 */
        public final DeliveryServiceSelectionFragment mo33688j3(DeliveryServiceSelectionFragment deliveryServiceSelectionFragment) {
            DeliveryServiceSelectionFragment_MembersInjector.injectNavigator(deliveryServiceSelectionFragment, (C28796c) this.f34161c.f34236k0.get());
            DeliveryServiceSelectionFragment_MembersInjector.injectFragmentUtil(deliveryServiceSelectionFragment, (C28936j) this.f34161c.f34240m0.get());
            return deliveryServiceSelectionFragment;
        }

        @C32488a
        /* renamed from: j4 */
        public final StoreCatalogListFragment mo33689j4(StoreCatalogListFragment storeCatalogListFragment) {
            C39608g.m161962b(storeCatalogListFragment, (AppEnvironment) this.f34161c.f34199P.get());
            return storeCatalogListFragment;
        }

        /* renamed from: k */
        public void mo33690k(ProductSearchWithListResultFragment productSearchWithListResultFragment) {
        }

        /* renamed from: k0 */
        public void mo33691k0(CouponsListFragment couponsListFragment) {
            mo33658f3(couponsListFragment);
        }

        /* renamed from: k1 */
        public void mo33692k1(AccountListShoppingFragment accountListShoppingFragment) {
            mo33743t2(accountListShoppingFragment);
        }

        /* renamed from: k2 */
        public final C38364e mo33693k2() {
            return new C38364e((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: k3 */
        public final DeliverySummaryFragment mo33694k3(DeliverySummaryFragment deliverySummaryFragment) {
            DeliverySummaryFragment_MembersInjector.injectNavigator(deliverySummaryFragment, (C28796c) this.f34161c.f34236k0.get());
            DeliverySummaryFragment_MembersInjector.injectAnalytics(deliverySummaryFragment, mo33699l2());
            return deliverySummaryFragment;
        }

        @C32488a
        /* renamed from: k4 */
        public final StoreFacilitiesBottomSheetFragment mo33695k4(StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment) {
            C28991j.m119946b(storeFacilitiesBottomSheetFragment, this.f34161c.mo34002j5());
            return storeFacilitiesBottomSheetFragment;
        }

        /* renamed from: l */
        public void mo33696l(EcosystemFragment ecosystemFragment) {
        }

        /* renamed from: l0 */
        public void mo33697l0(AdditionalOrderDepartmentFragment additionalOrderDepartmentFragment) {
            mo33761w2(additionalOrderDepartmentFragment);
        }

        /* renamed from: l1 */
        public void mo33698l1(CatalogProductDetailsFragment catalogProductDetailsFragment) {
            mo33561M2(catalogProductDetailsFragment);
        }

        /* renamed from: l2 */
        public final DeliverySummaryAnalyticsReporter mo33699l2() {
            return new DeliverySummaryAnalyticsReporter((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: l3 */
        public final DepartmentDetailsFragment mo33700l3(DepartmentDetailsFragment departmentDetailsFragment) {
            C39782e.m162320e(departmentDetailsFragment, (C28796c) this.f34161c.f34236k0.get());
            C39782e.m162318b(departmentDetailsFragment, mo33705m2());
            C39782e.m162319c(departmentDetailsFragment, (C28936j) this.f34161c.f34240m0.get());
            return departmentDetailsFragment;
        }

        @C32488a
        /* renamed from: l4 */
        public final SubscribeToNewsNotificationFragment mo33701l4(SubscribeToNewsNotificationFragment subscribeToNewsNotificationFragment) {
            C24652d.m107702b(subscribeToNewsNotificationFragment, mo33763w4());
            return subscribeToNewsNotificationFragment;
        }

        /* renamed from: m */
        public void mo33702m(MixingProductsBottomSheetFragment mixingProductsBottomSheetFragment) {
            mo33774y3(mixingProductsBottomSheetFragment);
        }

        /* renamed from: m0 */
        public void mo33703m0(LoyaltyMyCardFragment loyaltyMyCardFragment) {
        }

        /* renamed from: m1 */
        public void mo33704m1(ServiceSlotFragment serviceSlotFragment) {
            mo33641c4(serviceSlotFragment);
        }

        /* renamed from: m2 */
        public final C39752a mo33705m2() {
            return new C39752a((C13783a) this.f34161c.f34193M.get());
        }

        @C32488a
        /* renamed from: m3 */
        public final DepartmentFragment mo33706m3(DepartmentFragment departmentFragment) {
            C39790i.m162352c(departmentFragment, (C28936j) this.f34161c.f34240m0.get());
            C39790i.m162353e(departmentFragment, (C28796c) this.f34161c.f34236k0.get());
            C39790i.m162351b(departmentFragment, mo33705m2());
            return departmentFragment;
        }

        @C32488a
        /* renamed from: m4 */
        public final UpdateEmailFragment mo33707m4(UpdateEmailFragment updateEmailFragment) {
            C13398p.m57772b(updateEmailFragment, (C28936j) this.f34161c.f34240m0.get());
            return updateEmailFragment;
        }

        /* renamed from: n */
        public void mo33708n(com.carrefour.fid.android.product.presentation.p039ui.quantity.QuantityBackDropFragment quantityBackDropFragment) {
            mo33624Z3(quantityBackDropFragment);
        }

        /* renamed from: n0 */
        public void mo33709n0(SuccessCreateCardFragment successCreateCardFragment) {
        }

        /* renamed from: n1 */
        public void mo33710n1(LoyaltyBonusListFragment loyaltyBonusListFragment) {
        }

        @C32488a
        /* renamed from: n2 */
        public final AccountAnonymousFragment mo33711n2(AccountAnonymousFragment accountAnonymousFragment) {
            C22885f.m103189b(accountAnonymousFragment, mo33588S1());
            C22885f.m103190c(accountAnonymousFragment, this.f34161c.mo33982g5());
            C22885f.m103191d(accountAnonymousFragment, this.f34161c.mo34023m5());
            return accountAnonymousFragment;
        }

        @C32488a
        /* renamed from: n3 */
        public final DriveMapFragment mo33712n3(DriveMapFragment driveMapFragment) {
            DriveMapFragment_MembersInjector.injectApplication(driveMapFragment, C10241d.m38488c(this.f34161c.f34219c));
            DriveMapFragment_MembersInjector.injectNavigator(driveMapFragment, (C28796c) this.f34161c.f34236k0.get());
            return driveMapFragment;
        }

        @C32488a
        /* renamed from: n4 */
        public final UpdateUserAddressFragment mo33713n4(UpdateUserAddressFragment updateUserAddressFragment) {
            C13467i.m57922b(updateUserAddressFragment, (C28936j) this.f34161c.f34240m0.get());
            return updateUserAddressFragment;
        }

        /* renamed from: o */
        public void mo33714o(AlternativeProductsBottomSheetFragment alternativeProductsBottomSheetFragment) {
            mo33491A2(alternativeProductsBottomSheetFragment);
        }

        /* renamed from: o0 */
        public void mo33715o0(DeliveryChoiceInfoFragment deliveryChoiceInfoFragment) {
        }

        /* renamed from: o1 */
        public void mo33716o1(AccountConsentParameterFragment accountConsentParameterFragment) {
        }

        @C32488a
        /* renamed from: o2 */
        public final AccountConsentDataTabFragment mo33717o2(AccountConsentDataTabFragment accountConsentDataTabFragment) {
            C22927f.m103274b(accountConsentDataTabFragment, (AppEnvironment) this.f34161c.f34199P.get());
            C22927f.m103275d(accountConsentDataTabFragment, mo33598U1());
            return accountConsentDataTabFragment;
        }

        @C32488a
        /* renamed from: o3 */
        public final FacetFragment mo33718o3(FacetFragment facetFragment) {
            C27954c.m117334b(facetFragment, this.f34161c.mo34039o7());
            C27954c.m117335d(facetFragment, (C38326b) this.f34161c.f34244o0.get());
            return facetFragment;
        }

        @C32488a
        /* renamed from: o4 */
        public final UpdateUserInfoFragment mo33719o4(UpdateUserInfoFragment updateUserInfoFragment) {
            C13403u.m57776b(updateUserInfoFragment, (C28936j) this.f34161c.f34240m0.get());
            return updateUserInfoFragment;
        }

        /* renamed from: p */
        public void mo31793p(UpdateUserInfoFragment updateUserInfoFragment) {
            mo33719o4(updateUserInfoFragment);
        }

        /* renamed from: p0 */
        public void mo33720p0(PrimeFidFragment primeFidFragment) {
        }

        /* renamed from: p1 */
        public void mo31788p1(UpdateEmailFragment updateEmailFragment) {
            mo33707m4(updateEmailFragment);
        }

        @C32488a
        /* renamed from: p2 */
        public final AccountConsentOptinsTabFragment mo33721p2(AccountConsentOptinsTabFragment accountConsentOptinsTabFragment) {
            C22929h.m103280c(accountConsentOptinsTabFragment, (AppEnvironment) this.f34161c.f34199P.get());
            C22929h.m103279b(accountConsentOptinsTabFragment, mo33593T1());
            return accountConsentOptinsTabFragment;
        }

        @C32488a
        /* renamed from: p3 */
        public final ForgotPasswordFragment mo33722p3(ForgotPasswordFragment forgotPasswordFragment) {
            C13522c.m58049b(forgotPasswordFragment, (C28936j) this.f34161c.f34240m0.get());
            return forgotPasswordFragment;
        }

        @C32488a
        /* renamed from: p4 */
        public final UpdateUserPasswordFragment mo33723p4(UpdateUserPasswordFragment updateUserPasswordFragment) {
            C13406x.m57780b(updateUserPasswordFragment, (C28936j) this.f34161c.f34240m0.get());
            return updateUserPasswordFragment;
        }

        /* renamed from: q */
        public void mo32057q(CreateAccountFragment createAccountFragment) {
            mo33670h3(createAccountFragment);
        }

        /* renamed from: q0 */
        public void mo33724q0(MemoListFragment memoListFragment) {
            mo33762w3(memoListFragment);
        }

        /* renamed from: q1 */
        public void mo33725q1(HomePageFragment homePageFragment) {
            mo33733r3(homePageFragment);
        }

        @C32488a
        /* renamed from: q2 */
        public final AccountInfoFragment mo33726q2(AccountInfoFragment accountInfoFragment) {
            C13388h.m57758b(accountInfoFragment, (C28936j) this.f34161c.f34240m0.get());
            return accountInfoFragment;
        }

        @C32488a
        /* renamed from: q3 */
        public final C24127e mo33727q3(C24127e eVar) {
            C24130g.m106260b(eVar, this.f34163e.mo33424r());
            return eVar;
        }

        @C32488a
        /* renamed from: q4 */
        public final ValidateOtpFragment mo33728q4(ValidateOtpFragment validateOtpFragment) {
            C24636t.m107679d(validateOtpFragment, this.f34161c.mo33788A8());
            C24636t.m107678b(validateOtpFragment, (ClearAppManager) this.f34161c.f34242n0.get());
            return validateOtpFragment;
        }

        /* renamed from: r */
        public void mo33729r(CheckoutStep4Fragment checkoutStep4Fragment) {
            mo33618Y2(checkoutStep4Fragment);
        }

        /* renamed from: r0 */
        public void mo33730r0(ScanOnBoardingFragment scanOnBoardingFragment) {
        }

        /* renamed from: r1 */
        public void mo33731r1(BasketBuilderFrequentPurchasesFragment basketBuilderFrequentPurchasesFragment) {
            mo33520F2(basketBuilderFrequentPurchasesFragment);
        }

        @C32488a
        /* renamed from: r2 */
        public final AccountListHomeFragment mo33732r2(AccountListHomeFragment accountListHomeFragment) {
            C22964b.m103371b(accountListHomeFragment, mo33603V1());
            return accountListHomeFragment;
        }

        @C32488a
        /* renamed from: r3 */
        public final HomePageFragment mo33733r3(HomePageFragment homePageFragment) {
            C24161i.m106401b(homePageFragment, (AppEnvironment) this.f34161c.f34199P.get());
            C24161i.m106402d(homePageFragment, (C28796c) this.f34161c.f34236k0.get());
            return homePageFragment;
        }

        @C32488a
        /* renamed from: r4 */
        public final VerifyUserAddressFragment mo33734r4(VerifyUserAddressFragment verifyUserAddressFragment) {
            C13472m.m57941b(verifyUserAddressFragment, (C28936j) this.f34161c.f34240m0.get());
            return verifyUserAddressFragment;
        }

        /* renamed from: s */
        public void mo33735s(com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout.CheckoutPaymentErrorFragment checkoutPaymentErrorFragment) {
        }

        /* renamed from: s0 */
        public void mo33736s0(AccountAnonymousFragment accountAnonymousFragment) {
            mo33711n2(accountAnonymousFragment);
        }

        /* renamed from: s1 */
        public void mo33737s1(ServiceStationsResultFragment serviceStationsResultFragment) {
            mo33665g4(serviceStationsResultFragment);
        }

        @C32488a
        /* renamed from: s2 */
        public final AccountListOrderFragment mo33738s2(AccountListOrderFragment accountListOrderFragment) {
            C23006c.m103461d(accountListOrderFragment, (C28796c) this.f34161c.f34236k0.get());
            C23006c.m103460b(accountListOrderFragment, mo33608W1());
            return accountListOrderFragment;
        }

        @C32488a
        /* renamed from: s3 */
        public final InfoCardsFragment mo33739s3(InfoCardsFragment infoCardsFragment) {
            C24282r.m106781b(infoCardsFragment, mo33745t4());
            return infoCardsFragment;
        }

        /* renamed from: s4 */
        public final C13300m mo33740s4() {
            return new C13300m((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: t */
        public void mo33741t(C24127e eVar) {
            mo33727q3(eVar);
        }

        /* renamed from: t0 */
        public void mo31962t0(VerifyUserAddressFragment verifyUserAddressFragment) {
            mo33734r4(verifyUserAddressFragment);
        }

        /* renamed from: t1 */
        public void mo33742t1(ServiceSlotOmrFragment serviceSlotOmrFragment) {
            mo33647d4(serviceSlotOmrFragment);
        }

        @C32488a
        /* renamed from: t2 */
        public final AccountListShoppingFragment mo33743t2(AccountListShoppingFragment accountListShoppingFragment) {
            C23061b.m103555d(accountListShoppingFragment, (C28796c) this.f34161c.f34236k0.get());
            C23061b.m103554b(accountListShoppingFragment, mo33613X1());
            return accountListShoppingFragment;
        }

        @C32488a
        /* renamed from: t3 */
        public final LegalNoticeFragment mo33744t3(LegalNoticeFragment legalNoticeFragment) {
            C38241d.m158534b(legalNoticeFragment, (AppEnvironment) this.f34161c.f34199P.get());
            C38241d.m158535c(legalNoticeFragment, this.f34161c.mo34014l());
            return legalNoticeFragment;
        }

        /* renamed from: t4 */
        public final LoyaltyAnalyticsInterfaceDelegate mo33745t4() {
            return new LoyaltyAnalyticsInterfaceDelegate((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: u */
        public void mo33746u(CheckoutStep3Fragment checkoutStep3Fragment) {
        }

        /* renamed from: u0 */
        public void mo33747u0(DepartmentFragment departmentFragment) {
            mo33706m3(departmentFragment);
        }

        /* renamed from: u1 */
        public void mo33748u1(BasketBuilderSignInBottomSheetFragment basketBuilderSignInBottomSheetFragment) {
            mo33531H2(basketBuilderSignInBottomSheetFragment);
        }

        @C32488a
        /* renamed from: u2 */
        public final AccountMenuFragment mo33749u2(AccountMenuFragment accountMenuFragment) {
            C23107c.m103663b(accountMenuFragment, mo33622Z1());
            C23107c.m103665d(accountMenuFragment, this.f34161c.mo33982g5());
            C23107c.m103664c(accountMenuFragment, this.f34161c.mo33941a5());
            return accountMenuFragment;
        }

        @C32488a
        /* renamed from: u3 */
        public final LoyaltyNotLoggedFragment mo33750u3(LoyaltyNotLoggedFragment loyaltyNotLoggedFragment) {
            C24493o.m107345b(loyaltyNotLoggedFragment, mo33745t4());
            return loyaltyNotLoggedFragment;
        }

        /* renamed from: u4 */
        public final C26620a mo33751u4() {
            return new C26620a((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: v */
        public void mo33752v(SubscribeToNewsNotificationFragment subscribeToNewsNotificationFragment) {
            mo33701l4(subscribeToNewsNotificationFragment);
        }

        /* renamed from: v0 */
        public void mo33753v0(OrdersOnlineFragment ordersOnlineFragment) {
            mo33538I3(ordersOnlineFragment);
        }

        /* renamed from: v1 */
        public void mo33754v1(ValidateOtpFragment validateOtpFragment) {
            mo33728q4(validateOtpFragment);
        }

        @C32488a
        /* renamed from: v2 */
        public final AccountUpdateSuccessFragment mo33755v2(AccountUpdateSuccessFragment accountUpdateSuccessFragment) {
            C13560d.m58130b(accountUpdateSuccessFragment, mo33627a2());
            C13560d.m58131c(accountUpdateSuccessFragment, new C13744c());
            C13560d.m58132e(accountUpdateSuccessFragment, (C28796c) this.f34161c.f34236k0.get());
            return accountUpdateSuccessFragment;
        }

        @C32488a
        /* renamed from: v3 */
        public final LuckyCartBottomSheetDialogFragment mo33756v3(LuckyCartBottomSheetDialogFragment luckyCartBottomSheetDialogFragment) {
            C23775y.m105401b(luckyCartBottomSheetDialogFragment, mo33751u4());
            return luckyCartBottomSheetDialogFragment;
        }

        /* renamed from: v4 */
        public final C27224a mo33757v4() {
            return new C27224a((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: w */
        public void mo33758w(CheckoutStep3CgvFragment checkoutStep3CgvFragment) {
            mo33614X2(checkoutStep3CgvFragment);
        }

        /* renamed from: w0 */
        public void mo33759w0(ProductDetailsFragment productDetailsFragment) {
            mo33566N3(productDetailsFragment);
        }

        /* renamed from: w1 */
        public void mo33760w1(ChallengeFidDialogFragment challengeFidDialogFragment) {
        }

        @C32488a
        /* renamed from: w2 */
        public final AdditionalOrderDepartmentFragment mo33761w2(AdditionalOrderDepartmentFragment additionalOrderDepartmentFragment) {
            C25165d.m108799c(additionalOrderDepartmentFragment, (C28796c) this.f34161c.f34236k0.get());
            return additionalOrderDepartmentFragment;
        }

        @C32488a
        /* renamed from: w3 */
        public final MemoListFragment mo33762w3(MemoListFragment memoListFragment) {
            C22984d.m103404b(memoListFragment, mo33617Y1());
            C22984d.m103405d(memoListFragment, mo33539I4());
            return memoListFragment;
        }

        /* renamed from: w4 */
        public final C26628a mo33763w4() {
            return new C26628a((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: x */
        public void mo33764x(CheckoutStep2Fragment checkoutStep2Fragment) {
            mo33609W2(checkoutStep2Fragment);
        }

        /* renamed from: x0 */
        public void mo33765x0(BasketBuilderDepartmentFragment basketBuilderDepartmentFragment) {
            mo33514E2(basketBuilderDepartmentFragment);
        }

        /* renamed from: x1 */
        public void mo33766x1(ProductSearchFragment productSearchFragment) {
            mo33605V3(productSearchFragment);
        }

        @C32488a
        /* renamed from: x2 */
        public final AdditionalOrderFragment mo33767x2(AdditionalOrderFragment additionalOrderFragment) {
            C25174h.m108830c(additionalOrderFragment, (C28796c) this.f34161c.f34236k0.get());
            return additionalOrderFragment;
        }

        @C32488a
        /* renamed from: x3 */
        public final MixingProductsBottomSheetDialogFragment mo33768x3(MixingProductsBottomSheetDialogFragment mixingProductsBottomSheetDialogFragment) {
            C25489d.m109983b(mixingProductsBottomSheetDialogFragment, mo33757v4());
            return mixingProductsBottomSheetDialogFragment;
        }

        /* renamed from: x4 */
        public final C26681a mo33769x4() {
            return new C26681a((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: y */
        public void mo33770y(ListProductsOrderedFragment listProductsOrderedFragment) {
        }

        /* renamed from: y0 */
        public void mo33771y0(AppEnvironmentSelectionFragment appEnvironmentSelectionFragment) {
            mo33497B2(appEnvironmentSelectionFragment);
        }

        /* renamed from: y1 */
        public void mo33772y1(CouponsScanBarcodeFragment couponsScanBarcodeFragment) {
            mo33664g3(couponsScanBarcodeFragment);
        }

        @C32488a
        /* renamed from: y2 */
        public final AdditionalOrderProductSearchFragment mo33773y2(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment) {
            C25569f.m110148c(additionalOrderProductSearchFragment, mo33527G4());
            return additionalOrderProductSearchFragment;
        }

        @C32488a
        /* renamed from: y3 */
        public final MixingProductsBottomSheetFragment mo33774y3(MixingProductsBottomSheetFragment mixingProductsBottomSheetFragment) {
            C27745k.m116575d(mixingProductsBottomSheetFragment, (C28796c) this.f34161c.f34236k0.get());
            C27745k.m116576e(mixingProductsBottomSheetFragment, mo33505C4());
            C27745k.m116574b(mixingProductsBottomSheetFragment, (C28936j) this.f34161c.f34240m0.get());
            return mixingProductsBottomSheetFragment;
        }

        /* renamed from: y4 */
        public final C26689f mo33775y4() {
            return new C26689f((C13783a) this.f34161c.f34193M.get());
        }

        /* renamed from: z */
        public void mo33776z(NonFoodProductDetailsFragment nonFoodProductDetailsFragment) {
            mo33498B3(nonFoodProductDetailsFragment);
        }

        /* renamed from: z0 */
        public void mo33777z0(ChannelsFidFragment channelsFidFragment) {
            mo33565N2(channelsFidFragment);
        }

        /* renamed from: z1 */
        public void mo33778z1(LoyaltyDetailViewFragment loyaltyDetailViewFragment) {
        }

        @C32488a
        /* renamed from: z2 */
        public final AdditionalOrderSearchResultFragment mo33779z2(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment) {
            C25669f.m110326f(additionalOrderSearchResultFragment, mo33516E4());
            C25669f.m110324d(additionalOrderSearchResultFragment, (C28796c) this.f34161c.f34236k0.get());
            C25669f.m110323b(additionalOrderSearchResultFragment, (C28936j) this.f34161c.f34240m0.get());
            C25669f.m110325e(additionalOrderSearchResultFragment, mo33505C4());
            return additionalOrderSearchResultFragment;
        }

        @C32488a
        /* renamed from: z3 */
        public final NonFoodCheckoutStep1Fragment mo33780z3(NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment) {
            C23555g.m104810d(nonFoodCheckoutStep1Fragment, (C28796c) this.f34161c.f34236k0.get());
            C23555g.m104809b(nonFoodCheckoutStep1Fragment, this.f34161c.mo34047p8());
            C23555g.m104811e(nonFoodCheckoutStep1Fragment, (C38326b) this.f34161c.f34244o0.get());
            return nonFoodCheckoutStep1Fragment;
        }

        /* renamed from: z4 */
        public final C26996d mo33781z4() {
            return new C26996d((C13783a) this.f34161c.f34193M.get());
        }

        public C13992g(C13995j jVar, C13988d dVar, C13986b bVar, Fragment fragment) {
            this.f34164f = this;
            this.f34161c = jVar;
            this.f34162d = dVar;
            this.f34163e = bVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$h */
    public static final class C13993h implements C14006j0.C14016g.C14017a {

        /* renamed from: a */
        public final C13995j f34165a;

        /* renamed from: b */
        public Service f34166b;

        /* renamed from: b */
        public C14006j0.C14016g mo21625g() {
            C10335o.m38549a(this.f34166b, Service.class);
            return new C13994i(this.f34165a, this.f34166b);
        }

        /* renamed from: c */
        public C13993h mo21624a(Service service) {
            this.f34166b = (Service) C10335o.m38550b(service);
            return this;
        }

        public C13993h(C13995j jVar) {
            this.f34165a = jVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$i */
    public static final class C13994i extends C14006j0.C14016g {

        /* renamed from: c */
        public final C13995j f34167c;

        /* renamed from: d */
        public final C13994i f34168d;

        public C13994i(C13995j jVar, Service service) {
            this.f34168d = this;
            this.f34167c = jVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$j */
    public static final class C13995j extends C14006j0.C14019i {

        /* renamed from: A */
        public final C36231q0 f34169A;

        /* renamed from: A0 */
        public Provider<AlternativeProductsRepository> f34170A0;

        /* renamed from: B */
        public final C36242y f34171B;

        /* renamed from: B0 */
        public Provider<FacetRepository> f34172B0;

        /* renamed from: C */
        public final C36202c f34173C;

        /* renamed from: C0 */
        public Provider<MemberCardRepository> f34174C0;

        /* renamed from: D */
        public final C36230q f34175D;

        /* renamed from: D0 */
        public Provider<ScanPreferencesRepositoryImpl> f34176D0;

        /* renamed from: E */
        public final C36238u f34177E;

        /* renamed from: E0 */
        public Provider<MidFidErrorInterceptor> f34178E0;

        /* renamed from: F */
        public final C13995j f34179F;

        /* renamed from: F0 */
        public Provider<C38208a> f34180F0;

        /* renamed from: G */
        public Provider<C33614e> f34181G;

        /* renamed from: G0 */
        public Provider<PaymentRepository> f34182G0;

        /* renamed from: H */
        public Provider<LocalLoginDataSource> f34183H;

        /* renamed from: H0 */
        public Provider<PaymentGateway> f34184H0;

        /* renamed from: I */
        public Provider<C36555b> f34185I;

        /* renamed from: I0 */
        public Provider<CategoriesRepository> f34186I0;

        /* renamed from: J */
        public Provider<FirebaseAnalytics> f34187J;

        /* renamed from: J0 */
        public Provider<LuckyCartGateway> f34188J0;

        /* renamed from: K */
        public Provider<C33314e> f34189K;

        /* renamed from: K0 */
        public Provider<RecommendedNeedsRepository> f34190K0;

        /* renamed from: L */
        public Provider<ServiceSelectionRepository> f34191L;

        /* renamed from: L0 */
        public Provider<DlvRepository> f34192L0;

        /* renamed from: M */
        public Provider<C13783a> f34193M;

        /* renamed from: M0 */
        public Provider<C37494a> f34194M0;

        /* renamed from: N */
        public Provider<PhysicalStoreRepository> f34195N;

        /* renamed from: N0 */
        public Provider<NonFoodPaymentGateway> f34196N0;

        /* renamed from: O */
        public Provider<C28443a> f34197O;

        /* renamed from: O0 */
        public Provider<C27600f> f34198O0;

        /* renamed from: P */
        public Provider<AppEnvironment> f34199P;

        /* renamed from: P0 */
        public Provider<ProductDetailRepository> f34200P0;

        /* renamed from: Q */
        public Provider<C17180n4> f34201Q;

        /* renamed from: Q0 */
        public Provider<C27550a0> f34202Q0;

        /* renamed from: R */
        public Provider<LoggerRepository> f34203R;

        /* renamed from: R0 */
        public Provider<OneTrustRepository> f34204R0;

        /* renamed from: S */
        public Provider<C38243b> f34205S;

        /* renamed from: S0 */
        public Provider<AirshipSettings> f34206S0;

        /* renamed from: T */
        public Provider<C28802c> f34207T;

        /* renamed from: T0 */
        public Provider<ProductRepository> f34208T0;

        /* renamed from: U */
        public Provider<TokenRefresherImpl> f34209U;

        /* renamed from: U0 */
        public Provider<SearchWithListHistoryPreferencesRepository> f34210U0;

        /* renamed from: V */
        public Provider<C36146b> f34211V;

        /* renamed from: V0 */
        public Provider<LinkLoyaltyCardRepository> f34212V0;

        /* renamed from: W */
        public Provider<Interceptor> f34213W;

        /* renamed from: X */
        public Provider<Authenticator> f34214X;

        /* renamed from: Y */
        public Provider<C28812h> f34215Y;

        /* renamed from: Z */
        public Provider<SlotRepository> f34216Z;

        /* renamed from: a0 */
        public Provider<BasketRepository> f34217a0;

        /* renamed from: b0 */
        public Provider<StoreFacilityRepository> f34218b0;

        /* renamed from: c */
        public final C10240c f34219c;

        /* renamed from: c0 */
        public Provider<CriteoRepository> f34220c0;

        /* renamed from: d */
        public final C36265j f34221d;

        /* renamed from: d0 */
        public Provider<C33563l> f34222d0;

        /* renamed from: e */
        public final C38329a f34223e;

        /* renamed from: e0 */
        public Provider<RemoteConfigDataSource> f34224e0;

        /* renamed from: f */
        public final C28656a f34225f;

        /* renamed from: f0 */
        public Provider<CriteoTrackingGateway> f34226f0;

        /* renamed from: g */
        public final C36240w f34227g;

        /* renamed from: g0 */
        public Provider<AppsFlyerLib> f34228g0;

        /* renamed from: h */
        public final C36198a f34229h;

        /* renamed from: h0 */
        public Provider<C13814a> f34230h0;

        /* renamed from: i */
        public final C36245c f34231i;

        /* renamed from: i0 */
        public Provider<AppMessageDataStore> f34232i0;

        /* renamed from: j */
        public final C13236c f34233j;

        /* renamed from: j0 */
        public Provider<C32121c> f34234j0;

        /* renamed from: k */
        public final C36270a f34235k;

        /* renamed from: k0 */
        public Provider<C28796c> f34236k0;

        /* renamed from: l */
        public final C39848a f34237l;

        /* renamed from: l0 */
        public Provider<C28903a> f34238l0;

        /* renamed from: m */
        public final C36222m f34239m;

        /* renamed from: m0 */
        public Provider<C28936j> f34240m0;

        /* renamed from: n */
        public final C13819a f34241n;

        /* renamed from: n0 */
        public Provider<ClearAppManager> f34242n0;

        /* renamed from: o */
        public final C36225n0 f34243o;

        /* renamed from: o0 */
        public Provider<C38326b> f34244o0;

        /* renamed from: p */
        public final C36235s0 f34245p;

        /* renamed from: p0 */
        public Provider<C21424c> f34246p0;

        /* renamed from: q */
        public final C36214i f34247q;

        /* renamed from: q0 */
        public Provider<ShoppingListRepository> f34248q0;

        /* renamed from: r */
        public final C36221l0 f34249r;

        /* renamed from: r0 */
        public Provider<C36590c> f34250r0;

        /* renamed from: s */
        public final C36209f0 f34251s;

        /* renamed from: s0 */
        public Provider<ProductListFiltersViewModel> f34252s0;

        /* renamed from: t */
        public final C36201b0 f34253t;

        /* renamed from: t0 */
        public Provider<C13239a> f34254t0;

        /* renamed from: u */
        public final C36218k f34255u;

        /* renamed from: u0 */
        public Provider<C38328d> f34256u0;

        /* renamed from: v */
        public final C36205d0 f34257v;

        /* renamed from: v0 */
        public Provider<OrderOnlineRepository> f34258v0;

        /* renamed from: w */
        public final C36210g f34259w;

        /* renamed from: w0 */
        public Provider<C27580y> f34260w0;

        /* renamed from: x */
        public final C39431a f34261x;

        /* renamed from: x0 */
        public Provider<UtilitiesRepository> f34262x0;

        /* renamed from: y */
        public final C36215i0 f34263y;

        /* renamed from: y0 */
        public Provider<SearchHistoryPreferencesRepository> f34264y0;

        /* renamed from: z */
        public final C36234s f34265z;

        /* renamed from: z0 */
        public Provider<ProductsManagementRepository> f34266z0;

        /* renamed from: com.carrefour.fid.android.i$j$a */
        public static final class C13996a<T> implements Provider<T> {

            /* renamed from: a */
            public final C13995j f34267a;

            /* renamed from: b */
            public final int f34268b;

            public C13996a(C13995j jVar, int i) {
                this.f34267a = jVar;
                this.f34268b = i;
            }

            public T get() {
                switch (this.f34268b) {
                    case 0:
                        return new C36555b((LocalLoginDataSource) this.f34267a.f34183H.get(), this.f34267a.mo34014l());
                    case 1:
                        return new LocalLoginDataSource(C10242e.m38491c(this.f34267a.f34219c), (C33614e) this.f34267a.f34181G.get());
                    case 2:
                        return C36285q.m148894c(this.f34267a.f34221d);
                    case 3:
                        return new C13783a(this.f34267a.mo34083v7(), this.f34267a.mo33927X9());
                    case 4:
                        return C36269n.m148837c(this.f34267a.f34221d);
                    case 5:
                        return C38330b.m158794c(this.f34267a.f34223e);
                    case 6:
                        return new ServiceSelectionRepository(this.f34267a.mo34006j9());
                    case 7:
                        return new PhysicalStoreRepository(this.f34267a.mo33812E8());
                    case 8:
                        return new AppEnvironment(C10242e.m38491c(this.f34267a.f34219c), (C28443a) this.f34267a.f34197O.get());
                    case 9:
                        return C36267l.m148831c(this.f34267a.f34221d);
                    case 10:
                        return C36288t.m148903c(this.f34267a.f34221d, C10242e.m38491c(this.f34267a.f34219c));
                    case 11:
                        return C38281d.m158593c(this.f34267a.mo33895S7(), this.f34267a.mo33982g5());
                    case 12:
                        return C36286r.m148897c(this.f34267a.f34221d, C10242e.m38491c(this.f34267a.f34219c));
                    case 13:
                        return new C28802c(C10242e.m38491c(this.f34267a.f34219c));
                    case 14:
                        return C36260e.m148811c(this.f34267a.f34231i, (TokenRefresherImpl) this.f34267a.f34209U.get(), (C36146b) this.f34267a.f34211V.get());
                    case 15:
                        return new TokenRefresherImpl(this.f34267a.mo34014l(), C28677d.m118657c(this.f34267a.f34225f), this.f34267a.mo33907U7(), this.f34267a.mo34023m5());
                    case 16:
                        return new C36146b();
                    case 17:
                        return C36246d.m148770c(this.f34267a.f34231i, (TokenRefresherImpl) this.f34267a.f34209U.get(), (C36146b) this.f34267a.f34211V.get());
                    case 18:
                        return C36261f.m148814c(this.f34267a.f34231i, (TokenRefresherImpl) this.f34267a.f34209U.get());
                    case 19:
                        return new BasketRepository(this.f34267a.mo34057r5(), this.f34267a.mo33931Y7(), this.f34267a.mo33834I6());
                    case 20:
                        return new SlotRepository(this.f34267a.mo33843J9(), this.f34267a.mo33849K9());
                    case 21:
                        return ServiceModule_Companion_ProvideFacilityServiceRepositoryFactory.provideFacilityServiceRepository(this.f34267a.mo33891R9(), this.f34267a.mo34053q7(), C28675b.m118651c(this.f34267a.f34225f));
                    case 22:
                        return new CriteoTrackingGateway(C10242e.m38491c(this.f34267a.f34219c), (CriteoRepository) this.f34267a.f34220c0.get(), this.f34267a.mo33909U9());
                    case 23:
                        return new CriteoRepository(this.f34267a.mo33943a7(), new C36474d0(), new C36562e(), this.f34267a.mo33963d7(), C10242e.m38491c(this.f34267a.f34219c));
                    case 24:
                        return new RemoteConfigDataSource(this.f34267a.mo34089w7());
                    case 25:
                        return C36283o.m148888c(this.f34267a.f34221d);
                    case 26:
                        return new C13814a(C28675b.m118651c(this.f34267a.f34225f), (AppsFlyerLib) this.f34267a.f34228g0.get(), (C13783a) this.f34267a.f34193M.get(), this.f34267a.mo33790B4(), C10242e.m38491c(this.f34267a.f34219c));
                    case 27:
                        return C13820b.m58741c(this.f34267a.f34241n);
                    case 28:
                        return C22777b.m102997c(C10242e.m38491c(this.f34267a.f34219c));
                    case 29:
                        return C36289u.m148906c(this.f34267a.f34221d, C10242e.m38491c(this.f34267a.f34219c));
                    case 30:
                        return C36287s.m148900c(this.f34267a.f34221d);
                    case 31:
                        return C36266k.m148828c(this.f34267a.f34221d);
                    case 32:
                        return C36284p.m148891c(this.f34267a.f34221d);
                    case 33:
                        return new ClearAppManager(this.f34267a.mo33940a(), (C36555b) this.f34267a.f34185I.get(), (C13783a) this.f34267a.f34193M.get());
                    case 34:
                        return C38331c.m158797c(this.f34267a.f34223e, (C33314e) this.f34267a.f34189K.get());
                    case 35:
                        return C36268m.m148834c(this.f34267a.f34221d);
                    case 36:
                        return new ProductListFiltersViewModel(this.f34267a.mo33951b8(), this.f34267a.mo33799C7());
                    case 37:
                        return new ShoppingListRepository(this.f34267a.mo33825G9(), this.f34267a.mo34014l(), this.f34267a.mo33818F8(), C28680g.m118666c(this.f34267a.f34225f));
                    case 38:
                        return new C36590c();
                    case 39:
                        return new C13239a();
                    case 40:
                        return C38332d.m158800c(this.f34267a.f34223e, (C33314e) this.f34267a.f34189K.get());
                    case 41:
                        return new OrderOnlineRepository(this.f34267a.mo34096x8(), this.f34267a.mo34072t8(), this.f34267a.mo34066s8(), this.f34267a.mo34108z8(), this.f34267a.mo34102y8());
                    case 42:
                        return new C27580y();
                    case 43:
                        return new UtilitiesRepository(this.f34267a.mo33980fa());
                    case 44:
                        return new SearchHistoryPreferencesRepository(this.f34267a.mo33941a5());
                    case 45:
                        return new ProductsManagementRepository(this.f34267a.mo33938Z8(), this.f34267a.mo33990h6(), new C28646a());
                    case 46:
                        return new AlternativeProductsRepository(this.f34267a.mo33818F8());
                    case 47:
                        return new FacetRepository(this.f34267a.mo34046p7());
                    case 48:
                        return new MemberCardRepository(this.f34267a.mo33892S4(), this.f34267a.mo33944a8());
                    case 49:
                        return new ScanPreferencesRepositoryImpl(this.f34267a.mo33986g9());
                    case 50:
                        return new MidFidErrorInterceptor();
                    case 51:
                        return new C38208a();
                    case 52:
                        return new PaymentGateway((PaymentRepository) this.f34267a.f34182G0.get(), new C36531u0(), this.f34267a.mo33881Q5(), this.f34267a.mo34067s9(), this.f34267a.mo34034n9());
                    case 53:
                        return C36217j0.m148707c(this.f34267a.f34263y, this.f34267a.mo33794B8(), this.f34267a.mo33870O6(), this.f34267a.mo34102y8(), this.f34267a.mo33982g5());
                    case 54:
                        return new CategoriesRepository(this.f34267a.mo33804D6());
                    case 55:
                        return new LuckyCartGateway(this.f34267a.mo33978f8());
                    case 56:
                        return new RecommendedNeedsRepository(this.f34267a.mo33819F9(), this.f34267a.mo33945a9());
                    case 57:
                        return new DlvRepository(this.f34267a.mo34018l7());
                    case 58:
                        return new C37494a();
                    case 59:
                        return new NonFoodPaymentGateway((PaymentRepository) this.f34267a.f34182G0.get(), this.f34267a.mo34067s9());
                    case 60:
                        return new ProductDetailRepository(this.f34267a.mo34060r8(), (C27600f) this.f34267a.f34198O0.get());
                    case 61:
                        return new C27600f();
                    case 62:
                        return new C27550a0();
                    case 63:
                        return new OneTrustRepository(C10242e.m38491c(this.f34267a.f34219c));
                    case 64:
                        return new AirshipSettings(this.f34267a.mo34014l(), new C13744c(), this.f34267a.mo33951b8());
                    case 65:
                        return new ProductRepository(this.f34267a.mo33938Z8());
                    case 66:
                        return new SearchWithListHistoryPreferencesRepository(this.f34267a.mo33941a5());
                    case 67:
                        return new LinkLoyaltyCardRepository(this.f34267a.mo33877P7(), this.f34267a.mo33883Q7(), this.f34267a.mo33808E4(), this.f34267a.mo33951b8());
                    default:
                        throw new AssertionError(this.f34268b);
                }
            }
        }

        /* renamed from: A4 */
        public final AccountGetUserPhoneUseCase mo33784A4() {
            return new AccountGetUserPhoneUseCase(mo34098y4());
        }

        /* renamed from: A5 */
        public final C13939m mo33785A5() {
            return new C13939m(this.f34217a0.get());
        }

        /* renamed from: A6 */
        public final CatalogsRemoteDataSource mo33786A6() {
            return new CatalogsRemoteDataSource(mo34058r6());
        }

        /* renamed from: A7 */
        public final GetLoyaltyCardNumberFromPreferencesUseCase mo33787A7() {
            return new GetLoyaltyCardNumberFromPreferencesUseCase(mo33951b8());
        }

        /* renamed from: A8 */
        public final C24604b mo33788A8() {
            return new C24604b(this.f34193M.get());
        }

        /* renamed from: A9 */
        public final ServiceSetFavoritePhysicalStoreUseCase mo33789A9() {
            return new ServiceSetFavoritePhysicalStoreUseCase(this.f34195N.get());
        }

        /* renamed from: B4 */
        public final C13277f mo33790B4() {
            return new C13277f(mo34014l());
        }

        /* renamed from: B5 */
        public final BasketGetBasketNumberUseCase mo33791B5() {
            return new BasketGetBasketNumberUseCase(this.f34217a0.get(), mo34067s9());
        }

        /* renamed from: B6 */
        public final CatalogsRemoveCatalogFavoriteListUseCase mo33792B6() {
            return new CatalogsRemoveCatalogFavoriteListUseCase(mo34064s6());
        }

        /* renamed from: B7 */
        public final GetOfferProductListUseCase mo33793B7() {
            return new GetOfferProductListUseCase(mo34022m4());
        }

        /* renamed from: B8 */
        public final C36634m mo33794B8() {
            return C36219k0.m148711c(this.f34263y, mo34016l5());
        }

        /* renamed from: B9 */
        public final ServiceSetServiceSelectionUseCase mo33795B9() {
            return new ServiceSetServiceSelectionUseCase(this.f34191L.get());
        }

        /* renamed from: C4 */
        public final C13262a mo33796C4() {
            return new C13262a(mo34014l());
        }

        /* renamed from: C5 */
        public final C13945p mo33797C5() {
            return new C13945p(this.f34217a0.get());
        }

        /* renamed from: C6 */
        public final CatalogsRemoveCatalogFavoriteProductUseCase mo33798C6() {
            return new CatalogsRemoveCatalogFavoriteProductUseCase(mo34064s6());
        }

        /* renamed from: C7 */
        public final GetProductListUseCase mo33799C7() {
            return new GetProductListUseCase(mo34043p4(), new C38514l(), mo33922X4(), mo33917W5(), mo33881Q5(), mo34014l(), mo33926X8(), mo34067s9());
        }

        /* renamed from: C8 */
        public final C39837a mo33800C8() {
            return C39849b.m162460c(this.f34237l, mo33968e5());
        }

        /* renamed from: C9 */
        public final C36635n mo33801C9() {
            return C36233r0.m148742c(this.f34169A, mo34040o8());
        }

        /* renamed from: D4 */
        public final AccountGetUserUuidUseCase mo33802D4() {
            return new AccountGetUserUuidUseCase(mo34023m5());
        }

        /* renamed from: D5 */
        public final C13951s mo33803D5() {
            return new C13951s(this.f34217a0.get());
        }

        /* renamed from: D6 */
        public final CategoriesDataSource mo33804D6() {
            return new CategoriesDataSource(mo34017l6(), new C28646a());
        }

        /* renamed from: D7 */
        public final GoogleAdsImpl mo33805D7() {
            return new GoogleAdsImpl(mo33874P4(), C28677d.m118657c(this.f34225f));
        }

        /* renamed from: D8 */
        public final C29019b mo33806D8() {
            return new C29019b(this.f34193M.get());
        }

        /* renamed from: D9 */
        public final ServiceSwitchToStandardPromiseUseCase mo33807D9() {
            return new ServiceSwitchToStandardPromiseUseCase(mo34067s9(), mo34080v4(), mo34013k9(), mo34055q9(), mo33816F6(), mo34048p9(), mo33795B9(), mo33813E9(), mo33815F5(), mo33999i9());
        }

        /* renamed from: E4 */
        public final C13196a mo33808E4() {
            return new C13196a(mo34009k5());
        }

        /* renamed from: E5 */
        public final C13879a mo33809E5() {
            return new C13879a(mo34009k5());
        }

        /* renamed from: E6 */
        public final CategoriesGetCategoriesUseCase mo33810E6() {
            return new CategoriesGetCategoriesUseCase(this.f34186I0.get(), mo34067s9(), this.f34256u0.get());
        }

        /* renamed from: E7 */
        public final HandleBasketExceptionUseCase mo33811E7() {
            return new HandleBasketExceptionUseCase(mo33817F7());
        }

        /* renamed from: E8 */
        public final PhysicalStoreDataStore mo33812E8() {
            return new PhysicalStoreDataStore(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: E9 */
        public final ServiceUpdateStoreServiceUseCase mo33813E9() {
            return new ServiceUpdateStoreServiceUseCase(this.f34191L.get());
        }

        /* renamed from: F4 */
        public final C13279h mo33814F4() {
            return new C13279h(mo34014l());
        }

        /* renamed from: F5 */
        public final BasketInitBasketUseCase mo33815F5() {
            return new BasketInitBasketUseCase(this.f34217a0.get(), mo33811E7());
        }

        /* renamed from: F6 */
        public final CategoriesGetDriveOmrPromiseUseCase mo33816F6() {
            return new CategoriesGetDriveOmrPromiseUseCase(mo34067s9(), mo34032n7());
        }

        /* renamed from: F7 */
        public final HandleBasketExpiredFacilityStoreUseCase mo33817F7() {
            return new HandleBasketExpiredFacilityStoreUseCase(mo34034n9(), mo34067s9(), mo33813E9(), mo33911V5());
        }

        /* renamed from: F8 */
        public final PlpProductListDataSource mo33818F8() {
            return new PlpProductListDataSource(mo34003j6(), new C28646a(), this.f34215Y.get());
        }

        /* renamed from: F9 */
        public final C36636o mo33819F9() {
            return C36237t0.m148750c(this.f34245p, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33939Z9(), mo33933Y9(), new C28826i(), mo33901T7(), mo34033n8(), new C28818d());
        }

        /* renamed from: G4 */
        public final C13264c mo33820G4() {
            return new C13264c(mo34014l());
        }

        /* renamed from: G5 */
        public final BasketItemDeleteUseCase mo33821G5() {
            return new BasketItemDeleteUseCase(this.f34217a0.get());
        }

        /* renamed from: G6 */
        public final CheckAdditionalOrderPermissionUseCase mo33822G6() {
            return new CheckAdditionalOrderPermissionUseCase(mo33910V4());
        }

        /* renamed from: G7 */
        public final IamAuthLoyaltyApiService mo33823G7() {
            return C36236t.m148747c(this.f34265z, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33939Z9(), mo33933Y9(), new C28826i(), mo33901T7(), this.f34178E0.get(), mo34033n8());
        }

        /* renamed from: G8 */
        public final PlpProductRepository mo33824G8() {
            return new PlpProductRepository(mo33818F8(), this.f34172B0.get(), C28680g.m118666c(this.f34225f));
        }

        /* renamed from: G9 */
        public final ShoppingListDataSource mo33825G9() {
            return new ShoppingListDataSource(mo33819F9(), mo33831H9());
        }

        /* renamed from: H4 */
        public final AccountRefreshTokenUseCase mo33826H4() {
            return new AccountRefreshTokenUseCase(mo34014l());
        }

        /* renamed from: H5 */
        public final BasketItemQuantityUpdateUseCase mo33827H5() {
            return new BasketItemQuantityUpdateUseCase(this.f34217a0.get());
        }

        /* renamed from: H6 */
        public final CheckSelectedServiceTypeUseCase mo33828H6() {
            return new CheckSelectedServiceTypeUseCase(mo34095x7(), mo33881Q5(), this.f34217a0.get(), mo34067s9(), mo34081v5());
        }

        /* renamed from: H7 */
        public final void mo33829H7(C36198a aVar, C13819a aVar2, C10240c cVar, C36202c cVar2, C36245c cVar3, C36210g gVar, C39431a aVar3, C39848a aVar4, C36214i iVar, C28656a aVar5, C36218k kVar, C36222m mVar, C13236c cVar4, C36230q qVar, C36234s sVar, C36238u uVar, C36240w wVar, C36242y yVar, C36201b0 b0Var, C36205d0 d0Var, C36270a aVar6, C36265j jVar, C36209f0 f0Var, C36215i0 i0Var, C38329a aVar7, C36221l0 l0Var, C36225n0 n0Var, C36231q0 q0Var, C36235s0 s0Var) {
            this.f34181G = C10323g.m38525b(new C13996a(this.f34179F, 2));
            this.f34183H = C10323g.m38525b(new C13996a(this.f34179F, 1));
            this.f34185I = C10323g.m38525b(new C13996a(this.f34179F, 0));
            this.f34187J = C10323g.m38525b(new C13996a(this.f34179F, 4));
            this.f34189K = C10323g.m38525b(new C13996a(this.f34179F, 5));
            this.f34191L = C10323g.m38525b(new C13996a(this.f34179F, 6));
            this.f34193M = C10323g.m38525b(new C13996a(this.f34179F, 3));
            this.f34195N = C10323g.m38525b(new C13996a(this.f34179F, 7));
            this.f34197O = C10323g.m38525b(new C13996a(this.f34179F, 9));
            this.f34199P = C10323g.m38525b(new C13996a(this.f34179F, 8));
            this.f34201Q = C10323g.m38525b(new C13996a(this.f34179F, 10));
            this.f34203R = C10323g.m38525b(new C13996a(this.f34179F, 11));
            this.f34205S = C10323g.m38525b(new C13996a(this.f34179F, 12));
            this.f34207T = C10323g.m38525b(new C13996a(this.f34179F, 13));
            this.f34209U = C10323g.m38525b(new C13996a(this.f34179F, 15));
            this.f34211V = C10323g.m38525b(new C13996a(this.f34179F, 16));
            this.f34213W = C10323g.m38525b(new C13996a(this.f34179F, 14));
            this.f34214X = C10323g.m38525b(new C13996a(this.f34179F, 17));
            this.f34215Y = C10323g.m38525b(new C13996a(this.f34179F, 18));
            this.f34216Z = C10323g.m38525b(new C13996a(this.f34179F, 20));
            this.f34217a0 = C10323g.m38525b(new C13996a(this.f34179F, 19));
            this.f34218b0 = C10323g.m38525b(new C13996a(this.f34179F, 21));
            this.f34220c0 = C10323g.m38525b(new C13996a(this.f34179F, 23));
            this.f34222d0 = C10323g.m38525b(new C13996a(this.f34179F, 25));
            this.f34224e0 = C10323g.m38525b(new C13996a(this.f34179F, 24));
            this.f34226f0 = C10323g.m38525b(new C13996a(this.f34179F, 22));
            this.f34228g0 = C10323g.m38525b(new C13996a(this.f34179F, 27));
            this.f34230h0 = C10323g.m38525b(new C13996a(this.f34179F, 26));
            this.f34232i0 = C10323g.m38525b(new C13996a(this.f34179F, 28));
            this.f34234j0 = C10323g.m38525b(new C13996a(this.f34179F, 29));
            this.f34236k0 = C10323g.m38525b(new C13996a(this.f34179F, 30));
            this.f34238l0 = C10323g.m38525b(new C13996a(this.f34179F, 31));
            this.f34240m0 = C10323g.m38525b(new C13996a(this.f34179F, 32));
            this.f34242n0 = C10323g.m38525b(new C13996a(this.f34179F, 33));
            this.f34244o0 = C10323g.m38525b(new C13996a(this.f34179F, 34));
            this.f34246p0 = C10323g.m38525b(new C13996a(this.f34179F, 35));
            this.f34248q0 = C10323g.m38525b(new C13996a(this.f34179F, 37));
            this.f34250r0 = C10323g.m38525b(new C13996a(this.f34179F, 38));
            this.f34252s0 = C10323g.m38525b(new C13996a(this.f34179F, 36));
            this.f34254t0 = C10323g.m38525b(new C13996a(this.f34179F, 39));
            this.f34256u0 = C10323g.m38525b(new C13996a(this.f34179F, 40));
            this.f34258v0 = C10323g.m38525b(new C13996a(this.f34179F, 41));
            this.f34260w0 = C10323g.m38525b(new C13996a(this.f34179F, 42));
            this.f34262x0 = C10323g.m38525b(new C13996a(this.f34179F, 43));
            this.f34264y0 = C10323g.m38525b(new C13996a(this.f34179F, 44));
            this.f34266z0 = C10323g.m38525b(new C13996a(this.f34179F, 45));
            this.f34170A0 = C10323g.m38525b(new C13996a(this.f34179F, 46));
            this.f34172B0 = C10323g.m38525b(new C13996a(this.f34179F, 47));
            this.f34174C0 = C10323g.m38525b(new C13996a(this.f34179F, 48));
            this.f34176D0 = C10323g.m38525b(new C13996a(this.f34179F, 49));
            this.f34178E0 = C10323g.m38525b(new C13996a(this.f34179F, 50));
            this.f34180F0 = C10323g.m38525b(new C13996a(this.f34179F, 51));
            this.f34182G0 = C10323g.m38525b(new C13996a(this.f34179F, 53));
            this.f34184H0 = C10323g.m38525b(new C13996a(this.f34179F, 52));
            this.f34186I0 = C10323g.m38525b(new C13996a(this.f34179F, 54));
            this.f34188J0 = C10323g.m38525b(new C13996a(this.f34179F, 55));
            this.f34190K0 = C10323g.m38525b(new C13996a(this.f34179F, 56));
            this.f34192L0 = C10323g.m38525b(new C13996a(this.f34179F, 57));
            this.f34194M0 = C10323g.m38525b(new C13996a(this.f34179F, 58));
            this.f34196N0 = C10323g.m38525b(new C13996a(this.f34179F, 59));
            this.f34198O0 = C10323g.m38525b(new C13996a(this.f34179F, 61));
            this.f34200P0 = C10323g.m38525b(new C13996a(this.f34179F, 60));
            this.f34202Q0 = C10323g.m38525b(new C13996a(this.f34179F, 62));
            this.f34204R0 = C10323g.m38525b(new C13996a(this.f34179F, 63));
            this.f34206S0 = C10323g.m38525b(new C13996a(this.f34179F, 64));
            this.f34208T0 = C10323g.m38525b(new C13996a(this.f34179F, 65));
            this.f34210U0 = C10323g.m38525b(new C13996a(this.f34179F, 66));
            this.f34212V0 = C10323g.m38525b(new C13996a(this.f34179F, 67));
        }

        /* renamed from: H8 */
        public final C27551b mo33830H8() {
            return new C27551b(this.f34172B0.get());
        }

        /* renamed from: H9 */
        public final C36581w mo33831H9() {
            return new C36581w(mo34009k5());
        }

        /* renamed from: I4 */
        public final AccountRevokeTokenUseCase mo33832I4() {
            return new AccountRevokeTokenUseCase(mo34014l());
        }

        /* renamed from: I5 */
        public final C23457b mo33833I5() {
            return new C23457b(this.f34193M.get());
        }

        /* renamed from: I6 */
        public final CheckoutClearSlotUseCase mo33834I6() {
            return new CheckoutClearSlotUseCase(this.f34216Z.get());
        }

        /* renamed from: I7 */
        public final InitializeBasketUseCase mo33835I7() {
            return new InitializeBasketUseCase(this.f34217a0.get(), mo34067s9(), mo33811E7());
        }

        /* renamed from: I8 */
        public final ProductGetAntiInflationProductsFlowUseCase mo33836I8() {
            return new ProductGetAntiInflationProductsFlowUseCase(mo33848K8(), mo33866N8(), mo34067s9());
        }

        /* renamed from: I9 */
        public final C39838b mo33837I9() {
            return C39850c.m162463c(this.f34237l, mo33968e5());
        }

        /* renamed from: J4 */
        public final AccountUpdateUserAddressUseCase mo33838J4() {
            return new AccountUpdateUserAddressUseCase(mo33940a());
        }

        /* renamed from: J5 */
        public final C13968z mo33839J5() {
            return new C13968z(this.f34217a0.get());
        }

        /* renamed from: J6 */
        public final CheckoutGetSlotExpressUseCase mo33840J6() {
            return new CheckoutGetSlotExpressUseCase(this.f34216Z.get());
        }

        /* renamed from: J7 */
        public final InitializeNonFoodBasketUseCase mo33841J7() {
            return new InitializeNonFoodBasketUseCase(this.f34217a0.get(), mo33811E7());
        }

        /* renamed from: J8 */
        public final ProductGetComplementaryProductsUseCase mo33842J8() {
            return new ProductGetComplementaryProductsUseCase(this.f34266z0.get(), mo34067s9(), mo33857M5());
        }

        /* renamed from: J9 */
        public final SlotDataSource mo33843J9() {
            return new SlotDataSource(mo33837I9());
        }

        /* renamed from: K4 */
        public final AddMarketingElementsToPlpUseCase mo33844K4() {
            return new AddMarketingElementsToPlpUseCase(mo34000ia(), this.f34202Q0.get(), mo33977f7());
        }

        /* renamed from: K5 */
        public final BasketObserveBasketByReferenceUseCase mo33845K5() {
            return new BasketObserveBasketByReferenceUseCase(this.f34217a0.get());
        }

        /* renamed from: K6 */
        public final CheckoutGetSlotListUseCase mo33846K6() {
            return new CheckoutGetSlotListUseCase(mo33881Q5(), this.f34216Z.get());
        }

        @C32488a
        /* renamed from: K7 */
        public final AnalyticsInitializer mo33847K7(AnalyticsInitializer analyticsInitializer) {
            C22708a.m102861e(analyticsInitializer, C28675b.m118651c(this.f34225f));
            C22708a.m102859c(analyticsInitializer, this.f34193M.get());
            C22708a.m102862f(analyticsInitializer, mo34041o9());
            C22708a.m102858b(analyticsInitializer, mo33940a());
            C22708a.m102863g(analyticsInitializer, mo34014l());
            C22708a.m102860d(analyticsInitializer, this.f34199P.get());
            C22708a.m102864i(analyticsInitializer, this.f34201Q.get());
            return analyticsInitializer;
        }

        /* renamed from: K8 */
        public final ProductGetConsolidatedAlternativeProductsFlowUseCase mo33848K8() {
            return new ProductGetConsolidatedAlternativeProductsFlowUseCase(this.f34170A0.get(), mo33934Z4(), mo33857M5(), mo33869O5());
        }

        /* renamed from: K9 */
        public final SlotDataStoreSource mo33849K9() {
            return new SlotDataStoreSource(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: L4 */
        public final AdditionalOrderDeleteCurrentBasketUseCase mo33850L4() {
            return new AdditionalOrderDeleteCurrentBasketUseCase(mo34004j7());
        }

        /* renamed from: L5 */
        public final BasketObserveBasketItemQuantityToSellUseCase mo33851L5() {
            return new BasketObserveBasketItemQuantityToSellUseCase(this.f34217a0.get());
        }

        /* renamed from: L6 */
        public final CheckoutGetSlotStoreUseCase mo33852L6() {
            return new CheckoutGetSlotStoreUseCase(this.f34216Z.get());
        }

        @C32488a
        /* renamed from: L7 */
        public final AudienceTrackingInitializer mo33853L7(AudienceTrackingInitializer audienceTrackingInitializer) {
            C22709b.m102869d(audienceTrackingInitializer, mo34002j5());
            C22709b.m102868c(audienceTrackingInitializer, new C13744c());
            C22709b.m102871f(audienceTrackingInitializer, mo34041o9());
            C22709b.m102872g(audienceTrackingInitializer, mo34014l());
            C22709b.m102867b(audienceTrackingInitializer, mo33940a());
            C22709b.m102873h(audienceTrackingInitializer, mo33951b8());
            C22709b.m102870e(audienceTrackingInitializer, C28675b.m118651c(this.f34225f));
            return audienceTrackingInitializer;
        }

        /* renamed from: L8 */
        public final ProductGetConsolidatedCriteoProductsFlowUseCase mo33854L8() {
            return new ProductGetConsolidatedCriteoProductsFlowUseCase(mo34000ia(), mo34067s9(), mo33934Z4(), mo33857M5(), mo33869O5(), this.f34256u0.get());
        }

        /* renamed from: L9 */
        public final StdBasketDeleteCurrentBasketUseCase mo33855L9() {
            return new StdBasketDeleteCurrentBasketUseCase(mo33861M9(), mo34004j7());
        }

        /* renamed from: M4 */
        public final AdditionalOrderRetrieveBasketUseCase mo33856M4() {
            return new AdditionalOrderRetrieveBasketUseCase(mo33822G6(), mo34065s7());
        }

        /* renamed from: M5 */
        public final C13908d0 mo33857M5() {
            return new C13908d0(this.f34217a0.get());
        }

        /* renamed from: M6 */
        public final CheckoutGetSlotYieldListUseCase mo33858M6() {
            return new CheckoutGetSlotYieldListUseCase(this.f34216Z.get());
        }

        @C32488a
        /* renamed from: M7 */
        public final FirebaseAppInitializer mo33859M7(FirebaseAppInitializer firebaseAppInitializer) {
            C22710c.m102876b(firebaseAppInitializer, mo34023m5());
            return firebaseAppInitializer;
        }

        /* renamed from: M8 */
        public final ProductGetConsolidatedPlpFlowUseCase mo33860M8() {
            return new ProductGetConsolidatedPlpFlowUseCase(mo33896S8(), mo33844K4(), mo33934Z4(), mo33857M5(), mo33869O5(), mo33909U9());
        }

        /* renamed from: M9 */
        public final StdCheckBasketPermissionsUseCase mo33861M9() {
            return new StdCheckBasketPermissionsUseCase(mo34075u5(), mo33814F4());
        }

        /* renamed from: N4 */
        public final AdditionalOrderSynchronizeCurrentBasketUseCase mo33862N4() {
            return new AdditionalOrderSynchronizeCurrentBasketUseCase(mo33822G6(), this.f34217a0.get());
        }

        /* renamed from: N5 */
        public final BasketObserveBasketsItemCountUseCase mo33863N5() {
            return new BasketObserveBasketsItemCountUseCase(this.f34217a0.get(), mo33973ea(), mo34109z9());
        }

        /* renamed from: N6 */
        public final CheckoutGetSlotsUseCase mo33864N6() {
            return new CheckoutGetSlotsUseCase(mo33846K6(), mo33858M6(), mo34092x4(), mo33881Q5(), mo33814F4(), mo34067s9());
        }

        @C32488a
        /* renamed from: N7 */
        public final OneAppApplication mo33865N7(OneAppApplication oneAppApplication) {
            C14030k0.m60579f(oneAppApplication, this.f34185I.get());
            C14030k0.m60577d(oneAppApplication, mo33941a5());
            C14030k0.m60575b(oneAppApplication, mo33940a());
            C14030k0.m60580g(oneAppApplication, mo33951b8());
            C14030k0.m60576c(oneAppApplication, this.f34193M.get());
            C14030k0.m60578e(oneAppApplication, mo34002j5());
            return oneAppApplication;
        }

        /* renamed from: N8 */
        public final ProductGetConsolidatedProductFlowUseCase mo33866N8() {
            return new ProductGetConsolidatedProductFlowUseCase(mo33920W8(), mo33934Z4(), mo33857M5(), mo33869O5());
        }

        /* renamed from: N9 */
        public final StdRetrieveBasketUseCase mo33867N9() {
            return new StdRetrieveBasketUseCase(mo34065s7(), mo33835I7(), mo34067s9(), mo33953ba());
        }

        /* renamed from: O4 */
        public final AdditionalOrderUpdateBasketContentUseCase mo33868O4() {
            return new AdditionalOrderUpdateBasketContentUseCase(mo33822G6(), this.f34217a0.get(), mo33972e9());
        }

        /* renamed from: O5 */
        public final C13914g0 mo33869O5() {
            return new C13914g0(this.f34217a0.get());
        }

        /* renamed from: O6 */
        public final C36558a mo33870O6() {
            return new C36558a(mo34009k5());
        }

        @C32488a
        /* renamed from: O7 */
        public final OneAppFCMService mo33871O7(OneAppFCMService oneAppFCMService) {
            C28441a.m118318b(oneAppFCMService, mo34002j5());
            return oneAppFCMService;
        }

        /* renamed from: O8 */
        public final ProductGetFavoriteFlowUseCase mo33872O8() {
            return new ProductGetFavoriteFlowUseCase(mo33878P8(), mo33934Z4(), mo33857M5(), mo33869O5(), mo34067s9());
        }

        /* renamed from: O9 */
        public final StdSynchronizeCurrentBasketUseCase mo33873O9() {
            return new StdSynchronizeCurrentBasketUseCase(mo33861M9(), mo33811E7(), this.f34217a0.get());
        }

        /* renamed from: P4 */
        public final C13742a mo33874P4() {
            return new C13742a(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: P5 */
        public final BasketRemovePromoCodeUseCase mo33875P5() {
            return new BasketRemovePromoCodeUseCase(this.f34217a0.get());
        }

        /* renamed from: P6 */
        public final CheckoutUpdateSlotLocalStorageUseCase mo33876P6() {
            return new CheckoutUpdateSlotLocalStorageUseCase(this.f34216Z.get());
        }

        /* renamed from: P7 */
        public final LinkLoyaltyCardApiService mo33877P7() {
            return C36239v.m148754c(this.f34177E, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33939Z9(), mo33933Y9(), new C28826i(), mo33901T7(), mo34033n8());
        }

        /* renamed from: P8 */
        public final C37852g mo33878P8() {
            return new C37852g(this.f34248q0.get());
        }

        /* renamed from: P9 */
        public final StdUpdateBasketContentUseCase mo33879P9() {
            return new StdUpdateBasketContentUseCase(mo33861M9(), mo33972e9(), mo33946aa());
        }

        /* renamed from: Q4 */
        public final AirshipGetAirshipInboxUseCase mo33880Q4() {
            return new AirshipGetAirshipInboxUseCase(new C13750a());
        }

        /* renamed from: Q5 */
        public final C13936k0 mo33881Q5() {
            return new C13936k0(this.f34217a0.get());
        }

        /* renamed from: Q6 */
        public final C40023a mo33882Q6() {
            return C36216j.m148704c(this.f34247q, mo34040o8());
        }

        /* renamed from: Q7 */
        public final LocalAccountDataSource mo33883Q7() {
            return new LocalAccountDataSource(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: Q8 */
        public final ProductGetFrequentlyPurchasedProductsUseCase mo33884Q8() {
            return new ProductGetFrequentlyPurchasedProductsUseCase(this.f34266z0.get(), mo34067s9());
        }

        /* renamed from: Q9 */
        public final C36637p mo33885Q9() {
            return C36208f.m148686c(this.f34173C, C10242e.m38491c(this.f34219c), this.f34199P.get(), new C28826i(), mo33901T7(), mo34033n8());
        }

        /* renamed from: R4 */
        public final AirshipGetGaidUseCase mo33886R4() {
            return new AirshipGetGaidUseCase(mo33805D7());
        }

        /* renamed from: R5 */
        public final BasketRetrieveBasketUseCase mo33887R5() {
            return new BasketRetrieveBasketUseCase(mo33856M4(), mo34095x7(), mo33867N9());
        }

        /* renamed from: R6 */
        public final ConsentGetConsentsUseCase mo33888R6() {
            return new ConsentGetConsentsUseCase(mo33900T6(), mo34098y4(), mo33931Y7());
        }

        /* renamed from: R7 */
        public final C38276a mo33889R7() {
            return C38280c.m158590c(C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33982g5());
        }

        /* renamed from: R8 */
        public final ProductGetOldProductFlowUseCase mo33890R8() {
            return new ProductGetOldProductFlowUseCase(this.f34208T0.get(), mo33926X8(), mo33934Z4(), mo33857M5(), mo33869O5(), mo33922X4(), this.f34256u0.get());
        }

        /* renamed from: R9 */
        public final StoreFacilityDataSource mo33891R9() {
            return new StoreFacilityDataSource(this.f34199P.get(), mo33897S9());
        }

        /* renamed from: S4 */
        public final ApiMemberCardService mo33892S4() {
            return C36203c0.m148673c(this.f34253t, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33939Z9(), mo33933Y9(), new C28826i(), mo33901T7(), mo34033n8(), new C28818d());
        }

        /* renamed from: S5 */
        public final C13881a mo33893S5() {
            return C13884b.m58941c(mo34016l5());
        }

        /* renamed from: S6 */
        public final ConsentGetRefusedAndMissingConsentsUseCase mo33894S6() {
            return new ConsentGetRefusedAndMissingConsentsUseCase(mo33888R6(), mo34098y4());
        }

        /* renamed from: S7 */
        public final LogMDataSource mo33895S7() {
            return new LogMDataSource(mo33889R7(), this.f34197O.get());
        }

        /* renamed from: S8 */
        public final ProductGetPlpFlowUseCase mo33896S8() {
            return new ProductGetPlpFlowUseCase(mo33824G8(), mo33926X8(), this.f34260w0.get(), this.f34256u0.get());
        }

        /* renamed from: S9 */
        public final StoreFacilityService mo33897S9() {
            return ServiceModule_Companion_ProvideStoreFacilityDataSourceFactory.provideStoreFacilityDataSource(mo33968e5());
        }

        /* renamed from: T4 */
        public final AppAddProductToShoppingListUseCase mo33898T4() {
            return new AppAddProductToShoppingListUseCase(this.f34248q0.get(), mo33814F4());
        }

        /* renamed from: T5 */
        public final BasketSetDeliveryTypeUseCase mo33899T5() {
            return new BasketSetDeliveryTypeUseCase(this.f34217a0.get());
        }

        /* renamed from: T6 */
        public final ConsentRepository mo33900T6() {
            return new ConsentRepository(mo33962d6(), this.f34215Y.get());
        }

        /* renamed from: T7 */
        public final LogMInterceptor mo33901T7() {
            return new LogMInterceptor(mo33907U7(), mo34023m5(), mo33982g5());
        }

        /* renamed from: T8 */
        public final ProductGetProductChannelTypesUseCase mo33902T8() {
            return new ProductGetProductChannelTypesUseCase(this.f34266z0.get(), mo34067s9());
        }

        /* renamed from: T9 */
        public final ThirdPartyCheckAppMessageUseCase mo33903T9() {
            return new ThirdPartyCheckAppMessageUseCase(mo33921W9(), mo33928Y4());
        }

        /* renamed from: U4 */
        public final AppClearUserDataUseCase mo33904U4() {
            return new AppClearUserDataUseCase(mo33940a(), this.f34183H.get());
        }

        /* renamed from: U5 */
        public final BasketSwitchBasketTypeUseCase mo33905U5() {
            return new BasketSwitchBasketTypeUseCase(mo33961d5(), mo33814F4(), mo33953ba());
        }

        /* renamed from: U6 */
        public final ConsentUpdateConsentsUseCase mo33906U6() {
            return new ConsentUpdateConsentsUseCase(mo33900T6(), mo34098y4(), mo33790B4(), mo33931Y7());
        }

        /* renamed from: U7 */
        public final LogMLogToLogMUseCase mo33907U7() {
            return new LogMLogToLogMUseCase(this.f34203R.get(), this.f34205S.get());
        }

        /* renamed from: U8 */
        public final ProductGetProductDetailUseCase mo33908U8() {
            return new ProductGetProductDetailUseCase(this.f34200P0.get(), mo33926X8());
        }

        /* renamed from: U9 */
        public final ThirdPartyCheckRemoteConfigUseCase mo33909U9() {
            return new ThirdPartyCheckRemoteConfigUseCase(mo33959c9());
        }

        /* renamed from: V4 */
        public final C37725a mo33910V4() {
            return new C37725a(this.f34250r0.get());
        }

        /* renamed from: V5 */
        public final BasketSwitchFacilityServiceInBasketUseCase mo33911V5() {
            return new BasketSwitchFacilityServiceInBasketUseCase(mo34075u5(), this.f34217a0.get());
        }

        /* renamed from: V6 */
        public final C23944b mo33912V6() {
            return new C23944b(this.f34193M.get());
        }

        /* renamed from: V7 */
        public final LogMSendAllRemoteLogsUseCase mo33913V7() {
            return new LogMSendAllRemoteLogsUseCase(this.f34203R.get());
        }

        /* renamed from: V8 */
        public final ProductGetProductDetailsNalUseCase mo33914V8() {
            return new ProductGetProductDetailsNalUseCase(mo33908U8(), mo34067s9(), this.f34256u0.get());
        }

        /* renamed from: V9 */
        public final ThirdPartyCheckUsabillaConsentUseCase mo33915V9() {
            return new ThirdPartyCheckUsabillaConsentUseCase(C10242e.m38491c(this.f34219c), mo34023m5());
        }

        /* renamed from: W4 */
        public final AppGetDeliveryOptionsUseCase mo33916W4() {
            return new AppGetDeliveryOptionsUseCase(this.f34192L0.get());
        }

        /* renamed from: W5 */
        public final BasketSynchronizeCurrentBasketUseCase mo33917W5() {
            return new BasketSynchronizeCurrentBasketUseCase(mo33862N4(), mo34095x7(), mo33873O9());
        }

        /* renamed from: W6 */
        public final C23788b mo33918W6() {
            return new C23788b(this.f34193M.get());
        }

        /* renamed from: W7 */
        public final C13212c mo33919W7() {
            return C36241x.m148758c(this.f34227g, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33901T7(), new C28826i(), mo34033n8());
        }

        /* renamed from: W8 */
        public final ProductGetProductFlowUseCase mo33920W8() {
            return new ProductGetProductFlowUseCase(mo33824G8(), mo33926X8());
        }

        /* renamed from: W9 */
        public final ThirdPartyFetchRemoteConfigUseCase mo33921W9() {
            return new ThirdPartyFetchRemoteConfigUseCase(mo33959c9(), mo33907U7());
        }

        /* renamed from: X4 */
        public final AppGetShoppingListUseCase mo33922X4() {
            return new AppGetShoppingListUseCase(this.f34248q0.get());
        }

        /* renamed from: X5 */
        public final BasketUpdateBasketContentUseCase mo33923X5() {
            return new BasketUpdateBasketContentUseCase(mo34095x7(), mo33868O4(), mo33879P9());
        }

        /* renamed from: X6 */
        public final C36625e mo33924X6() {
            return C36220l.m148714c(this.f34255u, mo34016l5());
        }

        /* renamed from: X7 */
        public final C13200e mo33925X7() {
            return new C13200e(mo34023m5(), this.f34199P.get(), mo33982g5());
        }

        /* renamed from: X8 */
        public final ProductGetSlotSliceUseCase mo33926X8() {
            return new ProductGetSlotSliceUseCase(mo33852L6(), mo33881Q5());
        }

        /* renamed from: X9 */
        public final ThirdPartyUsabillaEventDispatcher mo33927X9() {
            return new ThirdPartyUsabillaEventDispatcher(C10242e.m38491c(this.f34219c), mo34023m5());
        }

        /* renamed from: Y4 */
        public final AppMessageRepository mo33928Y4() {
            return new AppMessageRepository(this.f34222d0.get(), this.f34232i0.get());
        }

        /* renamed from: Y5 */
        public final BasketUpdateBasketUseCase mo33929Y5() {
            return new BasketUpdateBasketUseCase(mo33923X5(), new C13960u(), mo34030n5(), mo33835I7(), mo33841J7(), this.f34217a0.get());
        }

        /* renamed from: Y6 */
        public final CouponsIsScanProductOnBoardingUseCase mo33930Y6() {
            return new CouponsIsScanProductOnBoardingUseCase(mo33941a5());
        }

        /* renamed from: Y7 */
        public final LoyaltyGetLoyaltyCardNumberUseCase mo33931Y7() {
            return new LoyaltyGetLoyaltyCardNumberUseCase(mo33787A7(), mo34098y4());
        }

        /* renamed from: Y8 */
        public final C36573o mo33932Y8() {
            return new C36573o(mo34009k5());
        }

        /* renamed from: Y9 */
        public final TokenAuthenticator mo33933Y9() {
            return new TokenAuthenticator(C28675b.m118651c(this.f34225f), this.f34214X.get(), mo33907U7(), mo33982g5(), mo34023m5());
        }

        /* renamed from: Z4 */
        public final AppObserveShoppingListUseCase mo33934Z4() {
            return new AppObserveShoppingListUseCase(this.f34248q0.get());
        }

        /* renamed from: Z5 */
        public final BasketUpdateYieldFeesForCurrentBasketUseCase mo33935Z5() {
            return new BasketUpdateYieldFeesForCurrentBasketUseCase(mo34067s9(), this.f34217a0.get(), mo33861M9());
        }

        /* renamed from: Z6 */
        public final CouponsSetScanProductViewedUseCase mo33936Z6() {
            return new CouponsSetScanProductViewedUseCase(mo33941a5());
        }

        /* renamed from: Z7 */
        public final LoyaltyGetLoyaltyCardsUseCase mo33937Z7() {
            return new LoyaltyGetLoyaltyCardsUseCase(this.f34174C0.get());
        }

        /* renamed from: Z8 */
        public final ProductsDataSource mo33938Z8() {
            return new ProductsDataSource(mo34003j6(), new C28646a(), mo34067s9(), mo34062s4(), this.f34215Y.get());
        }

        /* renamed from: Z9 */
        public final C36151f mo33939Z9() {
            return new C36151f(this.f34213W.get());
        }

        /* renamed from: a */
        public AccountRepository mo33940a() {
            return new AccountRepository(mo33883Q7(), mo33952b9());
        }

        /* renamed from: a5 */
        public final AppPreferencesStorage mo33941a5() {
            return new AppPreferencesStorage(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: a6 */
        public final BasketsListUseCase mo33942a6() {
            return new BasketsListUseCase(this.f34217a0.get(), mo33973ea(), mo34067s9(), mo34075u5(), this.f34256u0.get());
        }

        /* renamed from: a7 */
        public final C36627f mo33943a7() {
            return C36224n.m148722c(this.f34239m, C10242e.m38491c(this.f34219c), this.f34199P.get(), new C28826i(), mo33901T7(), mo34033n8());
        }

        /* renamed from: a8 */
        public final LoyaltyHeaders mo33944a8() {
            return new LoyaltyHeaders(mo34009k5());
        }

        /* renamed from: a9 */
        public final C36575q mo33945a9() {
            return new C36575q(mo34009k5());
        }

        /* renamed from: aa */
        public final UpdateBasketOfferQuantityUseCase mo33946aa() {
            return new UpdateBasketOfferQuantityUseCase(mo34067s9(), mo33811E7(), mo33835I7(), this.f34217a0.get(), mo33911V5());
        }

        /* renamed from: b */
        public C37816e mo33947b() {
            return mo34034n9();
        }

        /* renamed from: b5 */
        public final AppRemoveProductFromShoppingListByGtinUseCase mo33948b5() {
            return new AppRemoveProductFromShoppingListByGtinUseCase(this.f34248q0.get());
        }

        /* renamed from: b6 */
        public final C36322c mo33949b6() {
            return new C36322c(mo34009k5());
        }

        /* renamed from: b7 */
        public final CriteoGetCatalogCriteoBannerUseCase mo33950b7() {
            return new CriteoGetCatalogCriteoBannerUseCase(mo34101y7());
        }

        /* renamed from: b8 */
        public final LoyaltyPreferencesStorage mo33951b8() {
            return new LoyaltyPreferencesStorage(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: b9 */
        public final RemoteAccountDataSource mo33952b9() {
            return new RemoteAccountDataSource(mo34056r4(), mo33808E4(), mo33962d6(), this.f34215Y.get());
        }

        /* renamed from: ba */
        public final UpdateBasketTypeUseCase mo33953ba() {
            return new UpdateBasketTypeUseCase(this.f34217a0.get());
        }

        /* renamed from: c */
        public void mo33954c(OneAppApplication oneAppApplication) {
            mo33865N7(oneAppApplication);
        }

        /* renamed from: c5 */
        public final AppRemoveProductFromShoppingListUseCase mo33955c5() {
            return new AppRemoveProductFromShoppingListUseCase(this.f34248q0.get(), mo33814F4());
        }

        /* renamed from: c6 */
        public final C36324e mo33956c6() {
            return new C36324e(mo34009k5());
        }

        /* renamed from: c7 */
        public final CriteoGetCriteoProductsUseCase mo33957c7() {
            return new CriteoGetCriteoProductsUseCase(this.f34220c0.get(), mo34022m4(), mo33909U9(), mo33922X4(), mo33887R5());
        }

        /* renamed from: c8 */
        public final LoyaltyRepository mo33958c8() {
            return new LoyaltyRepository(mo34019l8(), mo33983g6(), mo33944a8(), mo33951b8(), this.f34215Y.get());
        }

        /* renamed from: c9 */
        public final RemoteConfigRepositoryImpl mo33959c9() {
            return new RemoteConfigRepositoryImpl(this.f34224e0.get());
        }

        /* renamed from: ca */
        public final UpdateOfferListUseCase mo33960ca() {
            return new UpdateOfferListUseCase(mo33922X4(), mo33881Q5());
        }

        /* renamed from: d */
        public C10189d mo21679d() {
            return new C13993h(this.f34179F);
        }

        /* renamed from: d5 */
        public final AppSetAdditionalOrderContextUseCase mo33961d5() {
            return new AppSetAdditionalOrderContextUseCase(this.f34250r0.get());
        }

        /* renamed from: d6 */
        public final BffCustomersManagementApi mo33962d6() {
            return C13237d.m57363c(this.f34233j, mo33969e6());
        }

        /* renamed from: d7 */
        public final CriteoParametersProvider mo33963d7() {
            return new CriteoParametersProvider(C10242e.m38491c(this.f34219c), this.f34199P.get(), mo34014l(), mo33940a(), mo34073t9());
        }

        /* renamed from: d8 */
        public final C36630i mo33964d8() {
            return C36243z.m148763c(this.f34171B, C10242e.m38491c(this.f34219c), this.f34199P.get(), new C28826i(), mo33901T7(), mo34033n8());
        }

        /* renamed from: d9 */
        public final RemoteLoginDataSource mo33965d9() {
            return new RemoteLoginDataSource(mo33919W7(), mo33925X7());
        }

        /* renamed from: da */
        public final UpdateOrderOnlineUseCase mo33966da() {
            return new UpdateOrderOnlineUseCase(mo33814F4(), this.f34258v0.get());
        }

        /* renamed from: e */
        public void mo33967e(AnalyticsInitializer analyticsInitializer) {
            mo33847K7(analyticsInitializer);
        }

        /* renamed from: e5 */
        public final C13092x mo33968e5() {
            return C36281l.m148882c(this.f34235k, mo33979f9(), mo33975f5(), this.f34199P.get());
        }

        /* renamed from: e6 */
        public final C13092x mo33969e6() {
            return C36271b.m148852c(this.f34235k, mo33979f9(), mo33956c6(), this.f34199P.get());
        }

        /* renamed from: e7 */
        public final CriteoSendCriteoEventUseCase mo33970e7() {
            return new CriteoSendCriteoEventUseCase(this.f34220c0.get(), mo33909U9());
        }

        /* renamed from: e8 */
        public final C36631j mo33971e8() {
            return C36199a0.m148663c(this.f34171B, C10242e.m38491c(this.f34219c), this.f34199P.get(), new C28826i(), mo33901T7(), mo34033n8());
        }

        /* renamed from: e9 */
        public final RemoveOfferFromBasketUseCase mo33972e9() {
            return new RemoveOfferFromBasketUseCase(mo34065s7(), mo33811E7(), this.f34217a0.get());
        }

        /* renamed from: ea */
        public final C13248c mo33973ea() {
            return new C13248c(mo34014l());
        }

        /* renamed from: f */
        public void mo33974f(FirebaseAppInitializer firebaseAppInitializer) {
            mo33859M7(firebaseAppInitializer);
        }

        /* renamed from: f5 */
        public final C36320a mo33975f5() {
            return new C36320a(mo34009k5());
        }

        /* renamed from: f6 */
        public final C13092x mo33976f6() {
            return C36279j.m148876c(this.f34235k, mo33979f9(), mo33944a8(), this.f34199P.get());
        }

        /* renamed from: f7 */
        public final CriteoTrackingCriteoUseCase mo33977f7() {
            return new CriteoTrackingCriteoUseCase(this.f34226f0.get());
        }

        /* renamed from: f8 */
        public final LuckyCartBannerRepository mo33978f8() {
            return new LuckyCartBannerRepository(C10242e.m38491c(this.f34219c), mo33971e8(), mo34014l(), this.f34199P.get());
        }

        /* renamed from: f9 */
        public final RetrofitFactory mo33979f9() {
            return new RetrofitFactory(C10242e.m38491c(this.f34219c), mo33939Z9(), mo33933Y9(), new C28826i(), mo33901T7(), mo34033n8(), new C28818d());
        }

        /* renamed from: fa */
        public final UtilitiesDataSource mo33980fa() {
            return new UtilitiesDataSource(mo34031n6(), new C28646a(), mo33963d7(), mo34062s4());
        }

        /* renamed from: g */
        public C37566e0 mo33981g() {
            return mo33881Q5();
        }

        /* renamed from: g5 */
        public final C28909d mo33982g5() {
            return new C28909d(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: g6 */
        public final BffMidFidApiService mo33983g6() {
            return C36212h.m148695c(this.f34259w, mo33976f6());
        }

        /* renamed from: g7 */
        public final C13198c mo33984g7() {
            return new C13198c(mo34009k5());
        }

        /* renamed from: g8 */
        public final LuckyCartRepository mo33985g8() {
            return new LuckyCartRepository(C10242e.m38491c(this.f34219c), mo33964d8(), mo34014l(), this.f34199P.get());
        }

        /* renamed from: g9 */
        public final ScanPreferencesStorage mo33986g9() {
            return new ScanPreferencesStorage(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: ga */
        public final UtilitiesGetPickupPointsUseCase mo33987ga() {
            return new UtilitiesGetPickupPointsUseCase(mo34031n6());
        }

        /* renamed from: h */
        public C28994a mo33988h() {
            return new C13744c();
        }

        /* renamed from: h5 */
        public final C36623c mo33989h5() {
            return C36204d.m148676c(this.f34173C, C10242e.m38491c(this.f34219c), this.f34199P.get(), new C28826i(), mo33901T7(), mo34033n8());
        }

        /* renamed from: h6 */
        public final BffProductsManagementApi mo33990h6() {
            return C27517c.m115799c(mo33996i6());
        }

        /* renamed from: h7 */
        public final C13210b mo33991h7() {
            return C13235b.m57359c(mo34016l5());
        }

        /* renamed from: h8 */
        public final MemoDataStoreSource mo33992h8() {
            return new MemoDataStoreSource(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: h9 */
        public final C36577s mo33993h9() {
            return new C36577s(mo34009k5());
        }

        /* renamed from: ha */
        public final UtilitiesGetSecureTokenUseCase mo33994ha() {
            return new UtilitiesGetSecureTokenUseCase(mo34031n6());
        }

        /* renamed from: i */
        public Set<Boolean> mo21617i() {
            return Collections.emptySet();
        }

        /* renamed from: i5 */
        public final C36624d mo33995i5() {
            return C36206e.m148680c(this.f34173C, C10242e.m38491c(this.f34219c), this.f34199P.get(), new C28826i(), mo33901T7(), mo34033n8());
        }

        /* renamed from: i6 */
        public final C13092x mo33996i6() {
            return C36275f.m148864c(this.f34235k, mo33979f9(), mo33949b6(), this.f34199P.get());
        }

        /* renamed from: i7 */
        public final DQEAddressesRepository mo33997i7() {
            return new DQEAddressesRepository(mo33991h7(), mo33984g7());
        }

        /* renamed from: i8 */
        public final MemoLocalDatasource mo33998i8() {
            return new MemoLocalDatasource(mo33941a5());
        }

        /* renamed from: i9 */
        public final ServiceClearServiceSelectionUseCase mo33999i9() {
            return new ServiceClearServiceSelectionUseCase(this.f34191L.get());
        }

        /* renamed from: ia */
        public final UtilitiesGetSponsoredItemsUseCase mo34000ia() {
            return new UtilitiesGetSponsoredItemsUseCase(C10242e.m38491c(this.f34219c), this.f34262x0.get(), mo33909U9(), new C22687d(), new C22690f(), mo33790B4(), mo33926X8(), this.f34256u0.get());
        }

        /* renamed from: j */
        public void mo34001j(AudienceTrackingInitializer audienceTrackingInitializer) {
            mo33853L7(audienceTrackingInitializer);
        }

        /* renamed from: j5 */
        public final AudienceTrackingManager mo34002j5() {
            return new AudienceTrackingManager(C28675b.m118651c(this.f34225f), mo33940a(), mo34109z9(), new C13744c());
        }

        /* renamed from: j6 */
        public final BffProductsManagementApi mo34003j6() {
            return C27518d.m115802c(mo34010k6());
        }

        /* renamed from: j7 */
        public final DeleteBasketUseCase mo34004j7() {
            return new DeleteBasketUseCase(this.f34217a0.get());
        }

        /* renamed from: j8 */
        public final MemoRemoteDatasource mo34005j8() {
            return new MemoRemoteDatasource(mo33819F9(), mo33831H9());
        }

        /* renamed from: j9 */
        public final ServiceDataStore mo34006j9() {
            return new ServiceDataStore(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: ja */
        public final UtilitiesSuggestionsUseCase mo34007ja() {
            return new UtilitiesSuggestionsUseCase(this.f34262x0.get());
        }

        /* renamed from: k */
        public C12074o0 mo34008k() {
            return C28675b.m118651c(this.f34225f);
        }

        /* renamed from: k5 */
        public final C28640a mo34009k5() {
            return new C28640a(mo34023m5(), this.f34199P.get(), mo33982g5(), mo34062s4());
        }

        /* renamed from: k6 */
        public final C13092x mo34010k6() {
            return C36274e.m148861c(this.f34235k, mo33979f9(), mo33949b6(), this.f34199P.get());
        }

        /* renamed from: k7 */
        public final C13092x mo34011k7() {
            return C36278i.m148873c(this.f34235k, mo33979f9(), mo33975f5(), this.f34199P.get());
        }

        /* renamed from: k8 */
        public final MemoRepository mo34012k8() {
            return new MemoRepository(mo34005j8(), mo33998i8(), mo33992h8());
        }

        /* renamed from: k9 */
        public final ServiceFetchDeliveryStoresUseCase mo34013k9() {
            return new ServiceFetchDeliveryStoresUseCase(this.f34218b0.get());
        }

        /* renamed from: l */
        public LoginRepository mo34014l() {
            return new LoginRepository(mo33965d9(), this.f34183H.get());
        }

        /* renamed from: l4 */
        public final C36501k mo34015l4() {
            return new C36501k(new C36457a(), new C36494i());
        }

        /* renamed from: l5 */
        public final C13092x mo34016l5() {
            return C36273d.m148858c(this.f34235k, mo33979f9(), this.f34199P.get());
        }

        /* renamed from: l6 */
        public final BffStoresManagementApi mo34017l6() {
            return C39743b.m162188c(mo34024m6());
        }

        /* renamed from: l7 */
        public final DlvDataSource mo34018l7() {
            return new DlvDataSource(mo34025m7());
        }

        /* renamed from: l8 */
        public final MidFidApiService mo34019l8() {
            return C36207e0.m148683c(this.f34257v, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33939Z9(), mo33933Y9(), new C28826i(), mo33901T7(), this.f34178E0.get(), mo34033n8(), new C28818d());
        }

        /* renamed from: l9 */
        public final ServiceFetchPhysicalStoresUseCase mo34020l9() {
            return new ServiceFetchPhysicalStoresUseCase(this.f34218b0.get());
        }

        /* renamed from: m */
        public C37521g mo34021m() {
            return mo33826H4();
        }

        /* renamed from: m4 */
        public final APIMProductDetailsRepository mo34022m4() {
            return new APIMProductDetailsRepository(mo34067s9(), mo34029n4(), mo34015l4(), mo33932Y8(), mo33907U7(), mo33926X8());
        }

        /* renamed from: m5 */
        public final BaseAppPreferencesStorage mo34023m5() {
            return new BaseAppPreferencesStorage(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: m6 */
        public final C13092x mo34024m6() {
            return C36276g.m148867c(this.f34235k, mo33979f9(), mo33949b6(), this.f34199P.get());
        }

        /* renamed from: m7 */
        public final C36629h mo34025m7() {
            return C36232r.m148739c(this.f34175D, mo34011k7());
        }

        /* renamed from: m8 */
        public final MixingProductsRemoteConfigUseCase mo34026m8() {
            return new MixingProductsRemoteConfigUseCase(mo33909U9());
        }

        /* renamed from: m9 */
        public final ServiceFetchStoreServicesPictosUseCase mo34027m9() {
            return new ServiceFetchStoreServicesPictosUseCase(this.f34218b0.get());
        }

        /* renamed from: n */
        public C37830b mo34028n() {
            return mo34020l9();
        }

        /* renamed from: n4 */
        public final C36620a mo34029n4() {
            return C36223m0.m148719c(this.f34249r, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33939Z9(), mo33933Y9(), new C28826i(), mo33901T7(), mo34033n8(), new C28818d());
        }

        /* renamed from: n5 */
        public final BasketAddOneMoreItemHomeDeliveryNalBasket mo34030n5() {
            return new BasketAddOneMoreItemHomeDeliveryNalBasket(this.f34217a0.get(), mo33814F4());
        }

        /* renamed from: n6 */
        public final BffUtilitiesManagementApi mo34031n6() {
            return C22682c.m102710c(mo34038o6());
        }

        /* renamed from: n7 */
        public final DriveOmrAvailabilityApiImpl mo34032n7() {
            return new DriveOmrAvailabilityApiImpl(mo34017l6());
        }

        /* renamed from: n8 */
        public final C28833m mo34033n8() {
            return new C28833m(this.f34207T.get());
        }

        /* renamed from: n9 */
        public final ServiceGetFacilityDetailsByAnabelKeyUseCase mo34034n9() {
            return new ServiceGetFacilityDetailsByAnabelKeyUseCase(this.f34218b0.get());
        }

        /* renamed from: o */
        public C37833d mo34035o() {
            return mo33789A9();
        }

        /* renamed from: o4 */
        public final C36537w mo34036o4() {
            return new C36537w(new C36487g(), new C36494i(), new C36529u());
        }

        /* renamed from: o5 */
        public final BasketAddPromoCodeUseCase mo34037o5() {
            return new BasketAddPromoCodeUseCase(this.f34217a0.get());
        }

        /* renamed from: o6 */
        public final C13092x mo34038o6() {
            return C36282m.m148885c(this.f34235k, mo33979f9(), mo33949b6(), this.f34199P.get());
        }

        /* renamed from: o7 */
        public final C27951b mo34039o7() {
            return new C27951b(this.f34193M.get());
        }

        /* renamed from: o8 */
        public final C13092x mo34040o8() {
            return C36280k.m148879c(this.f34235k, mo33979f9(), this.f34199P.get());
        }

        /* renamed from: o9 */
        public final ServiceGetFavoritePhysicalStoreUseCase mo34041o9() {
            return new ServiceGetFavoritePhysicalStoreUseCase(this.f34195N.get());
        }

        /* renamed from: p */
        public C37823k mo34042p() {
            return mo34067s9();
        }

        /* renamed from: p4 */
        public final APIMProductsRepository mo34043p4() {
            return new APIMProductsRepository(mo34050q4(), new C36544y(), mo34036o4(), C36229p0.m148734c(this.f34243o), mo33993h9(), mo33907U7());
        }

        /* renamed from: p5 */
        public final BasketAddPromotionToCurrentBasketUseCase mo34044p5() {
            return new BasketAddPromotionToCurrentBasketUseCase(this.f34217a0.get());
        }

        /* renamed from: p6 */
        public final C13092x mo34045p6() {
            return C36277h.m148870c(this.f34235k, mo33979f9(), this.f34199P.get(), mo34052q6());
        }

        /* renamed from: p7 */
        public final FacetProductCountDataSource mo34046p7() {
            return new FacetProductCountDataSource(mo33990h6(), mo34062s4());
        }

        /* renamed from: p8 */
        public final C23517b mo34047p8() {
            return new C23517b(this.f34193M.get());
        }

        /* renamed from: p9 */
        public final ServiceGetMirrorDriveServiceUseCase mo34048p9() {
            return new ServiceGetMirrorDriveServiceUseCase(this.f34218b0.get());
        }

        /* renamed from: q */
        public void mo34049q(OneAppFCMService oneAppFCMService) {
            mo33871O7(oneAppFCMService);
        }

        /* renamed from: q4 */
        public final C36621b mo34050q4() {
            return C36227o0.m148728c(this.f34243o, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33939Z9(), mo33933Y9(), mo33901T7(), mo34033n8(), new C28818d());
        }

        /* renamed from: q5 */
        public final C24980b mo34051q5() {
            return new C24980b(this.f34193M.get());
        }

        /* renamed from: q6 */
        public final C36326g mo34052q6() {
            return new C36326g(mo34009k5());
        }

        /* renamed from: q7 */
        public final FacilityDataSource mo34053q7() {
            return new FacilityDataSource(mo34059r7());
        }

        /* renamed from: q8 */
        public final C23615b mo34054q8() {
            return new C23615b(this.f34193M.get());
        }

        /* renamed from: q9 */
        public final ServiceGetPromiseUseCase mo34055q9() {
            return new ServiceGetPromiseUseCase(mo33909U9());
        }

        /* renamed from: r */
        public C10187b mo21669r() {
            return new C13987c(this.f34179F);
        }

        /* renamed from: r4 */
        public final C13209a mo34056r4() {
            return C36200b.m148666c(this.f34229h, C10242e.m38491c(this.f34219c), this.f34199P.get(), mo33939Z9(), mo33933Y9(), new C28826i(), mo33901T7(), mo34033n8());
        }

        /* renamed from: r5 */
        public final BasketApiDataSource mo34057r5() {
            return new BasketApiDataSource(mo33893S5(), mo33809E5());
        }

        /* renamed from: r6 */
        public final C39401a mo34058r6() {
            return C39432b.m161615c(this.f34261x, mo34045p6());
        }

        /* renamed from: r7 */
        public final FacilityService mo34059r7() {
            return ServiceModule_Companion_ProvideFacilityServiceFactory.provideFacilityService(mo33968e5());
        }

        /* renamed from: r8 */
        public final NonFoodProductDetailDataSource mo34060r8() {
            return new NonFoodProductDetailDataSource(mo33990h6(), new C28646a());
        }

        /* renamed from: r9 */
        public final ServiceGetSelectedServiceUseCase mo34061r9() {
            return new ServiceGetSelectedServiceUseCase(mo34067s9());
        }

        /* renamed from: s4 */
        public final C13204a mo34062s4() {
            return new C13204a(mo34014l());
        }

        /* renamed from: s5 */
        public final BasketBookSlotForCurrentBasketUseCase mo34063s5() {
            return new BasketBookSlotForCurrentBasketUseCase(this.f34217a0.get());
        }

        /* renamed from: s6 */
        public final CatalogRepository mo34064s6() {
            return new CatalogRepository(mo33786A6(), mo34106z6());
        }

        /* renamed from: s7 */
        public final FetchBasketUseCase mo34065s7() {
            return new FetchBasketUseCase(this.f34217a0.get());
        }

        /* renamed from: s8 */
        public final OHMOrdersOnlineDetailsEntityDataMapper mo34066s8() {
            return new OHMOrdersOnlineDetailsEntityDataMapper(new C36522r0(), new C36513o0(), new C36508m0(), mo33909U9(), C28677d.m118657c(this.f34225f));
        }

        /* renamed from: s9 */
        public final ServiceGetServiceSelectionUseCase mo34067s9() {
            return new ServiceGetServiceSelectionUseCase(this.f34191L.get());
        }

        /* renamed from: t4 */
        public final AccountClearCachedUserInfoUseCase mo34068t4() {
            return new AccountClearCachedUserInfoUseCase(mo34014l(), mo33940a(), C28677d.m118657c(this.f34225f));
        }

        /* renamed from: t5 */
        public final BasketCheckNalBasketValidationUseCase mo34069t5() {
            return new BasketCheckNalBasketValidationUseCase(this.f34217a0.get());
        }

        /* renamed from: t6 */
        public final CatalogsAddCatalogFavoriteProductUseCase mo34070t6() {
            return new CatalogsAddCatalogFavoriteProductUseCase(mo34064s6());
        }

        /* renamed from: t7 */
        public final FidelityGetCardFidAndBalanceNonFoodUseCase mo34071t7() {
            return new FidelityGetCardFidAndBalanceNonFoodUseCase(mo34077u7(), mo33787A7(), mo34107z7(), mo34034n9());
        }

        /* renamed from: t8 */
        public final OHMOrdersOnlineEntityDataMapper mo34072t8() {
            return new OHMOrdersOnlineEntityDataMapper(mo33909U9(), C28677d.m118657c(this.f34225f));
        }

        /* renamed from: t9 */
        public final ServiceGetStoreRefUseCase mo34073t9() {
            return new ServiceGetStoreRefUseCase(this.f34191L.get());
        }

        /* renamed from: u4 */
        public final AccountGetAddressGeolocationUseCase mo34074u4() {
            return new AccountGetAddressGeolocationUseCase(mo33997i7());
        }

        /* renamed from: u5 */
        public final BasketCheckSelectedServiceAndBasketSynchronicityUseCase mo34075u5() {
            return new BasketCheckSelectedServiceAndBasketSynchronicityUseCase(mo34067s9(), mo33953ba(), mo33828H6());
        }

        /* renamed from: u6 */
        public final CatalogsGetCatalogActionUseCase mo34076u6() {
            return new CatalogsGetCatalogActionUseCase(C10242e.m38491c(this.f34219c), mo34041o9(), mo33909U9(), this.f34199P.get(), mo33814F4(), new C22687d(), mo33790B4(), mo34098y4(), this.f34256u0.get());
        }

        /* renamed from: u7 */
        public final FidelityHasCardFidUseCase mo34077u7() {
            return new FidelityHasCardFidUseCase(mo33951b8());
        }

        /* renamed from: u8 */
        public final OfferListAndBasketControllerImpl mo34078u8() {
            return new OfferListAndBasketControllerImpl(mo33793B7(), mo33960ca(), new OfferListModelDataMapper(), mo33898T4(), mo33948b5(), mo33917W5(), mo33881Q5(), mo33923X5(), mo34093x5(), mo34014l(), mo33951b8(), this.f34207T.get(), mo34026m8(), C28679f.m118663c(this.f34225f), this.f34256u0.get());
        }

        /* renamed from: u9 */
        public final ServiceGetStoreServiceTypeSelectedUseCase mo34079u9() {
            return new ServiceGetStoreServiceTypeSelectedUseCase(this.f34191L.get());
        }

        /* renamed from: v4 */
        public final C13246a mo34080v4() {
            return new C13246a(mo33940a());
        }

        /* renamed from: v5 */
        public final C13913g mo34081v5() {
            return new C13913g(this.f34217a0.get());
        }

        /* renamed from: v6 */
        public final CatalogsGetCatalogDetailsUseCase mo34082v6() {
            return new CatalogsGetCatalogDetailsUseCase(mo34064s6());
        }

        /* renamed from: v7 */
        public final FirebaseAnalyticsDispatcher mo34083v7() {
            return new FirebaseAnalyticsDispatcher(this.f34187J.get(), this.f34189K.get(), mo33820G4(), mo34067s9(), C10242e.m38491c(this.f34219c));
        }

        /* renamed from: v8 */
        public final C36632k mo34084v8() {
            return C36211g0.m148692c(this.f34251s, mo34016l5());
        }

        /* renamed from: v9 */
        public final ServiceIsPreviousSelectedServiceDifferentUseCase mo34085v9() {
            return new ServiceIsPreviousSelectedServiceDifferentUseCase(this.f34191L.get());
        }

        /* renamed from: w4 */
        public final AccountGetUserAddressUseCase mo34086w4() {
            return new AccountGetUserAddressUseCase(mo34098y4());
        }

        /* renamed from: w5 */
        public final BasketClearByReferenceUseCase mo34087w5() {
            return new BasketClearByReferenceUseCase(this.f34217a0.get());
        }

        /* renamed from: w6 */
        public final CatalogsGetCatalogFavoriteProductsUseCase mo34088w6() {
            return new CatalogsGetCatalogFavoriteProductsUseCase(mo34064s6());
        }

        /* renamed from: w7 */
        public final FirebaseRemoteConfigImpl mo34089w7() {
            return new FirebaseRemoteConfigImpl(this.f34222d0.get());
        }

        /* renamed from: w8 */
        public final C27053c mo34090w8() {
            return new C27053c(this.f34193M.get());
        }

        /* renamed from: w9 */
        public final ServiceIsSelectedServiceDeliveryUseCase mo34091w9() {
            return new ServiceIsSelectedServiceDeliveryUseCase(this.f34191L.get());
        }

        /* renamed from: x4 */
        public final AccountGetUserInfoStoreUseCase mo34092x4() {
            return new AccountGetUserInfoStoreUseCase(mo33883Q7());
        }

        /* renamed from: x5 */
        public final BasketDeleteCurrentBasketUseCase mo34093x5() {
            return new BasketDeleteCurrentBasketUseCase(mo33855L9(), mo33850L4(), mo34095x7());
        }

        /* renamed from: x6 */
        public final CatalogsGetCatalogListUseCase mo34094x6() {
            return new CatalogsGetCatalogListUseCase(mo34064s6());
        }

        /* renamed from: x7 */
        public final C13924e mo34095x7() {
            return new C13924e(this.f34217a0.get());
        }

        /* renamed from: x8 */
        public final C36633l mo34096x8() {
            return C36213h0.m148698c(this.f34251s, mo34016l5());
        }

        /* renamed from: x9 */
        public final ServiceIsServiceOpenUseCase mo34097x9() {
            return new ServiceIsServiceOpenUseCase(this.f34191L.get(), this.f34218b0.get());
        }

        /* renamed from: y4 */
        public final AccountGetUserInfoUseCase mo34098y4() {
            return new AccountGetUserInfoUseCase(mo33940a());
        }

        /* renamed from: y5 */
        public final BasketDeleteYieldFeesForCurrentBasketUseCase mo34099y5() {
            return new BasketDeleteYieldFeesForCurrentBasketUseCase(mo34067s9(), this.f34217a0.get(), mo33861M9());
        }

        /* renamed from: y6 */
        public final CatalogsGetCatalogsListByStoreIdUseCase mo34100y6() {
            return new CatalogsGetCatalogsListByStoreIdUseCase(mo34064s6());
        }

        /* renamed from: y7 */
        public final GetCriteoBannerUseCase mo34101y7() {
            return new GetCriteoBannerUseCase(this.f34220c0.get(), mo33909U9());
        }

        /* renamed from: y8 */
        public final C36569k mo34102y8() {
            return new C36569k(mo34009k5());
        }

        /* renamed from: y9 */
        public final ServiceIsServiceSelectedUseCase mo34103y9() {
            return new ServiceIsServiceSelectedUseCase(this.f34191L.get());
        }

        /* renamed from: z4 */
        public final AccountGetUserInfoWithCardTypeUseCase mo34104z4() {
            return new AccountGetUserInfoWithCardTypeUseCase(mo34098y4());
        }

        /* renamed from: z5 */
        public final BasketDetailsUseCase mo34105z5() {
            return new BasketDetailsUseCase(this.f34217a0.get());
        }

        /* renamed from: z6 */
        public final CatalogsLocalDataSource mo34106z6() {
            return new CatalogsLocalDataSource(C10242e.m38491c(this.f34219c));
        }

        /* renamed from: z7 */
        public final GetLoyaltyBalanceUseCase mo34107z7() {
            return new GetLoyaltyBalanceUseCase(mo33958c8());
        }

        /* renamed from: z8 */
        public final C36571m mo34108z8() {
            return new C36571m(mo34009k5());
        }

        /* renamed from: z9 */
        public final ServiceObserveServiceSelectionUseCase mo34109z9() {
            return new ServiceObserveServiceSelectionUseCase(this.f34191L.get());
        }

        public C13995j(C36198a aVar, C13819a aVar2, C10240c cVar, C36202c cVar2, C36245c cVar3, C36210g gVar, C39431a aVar3, C39848a aVar4, C36214i iVar, C28656a aVar5, C36218k kVar, C36222m mVar, C13236c cVar4, C36230q qVar, C36234s sVar, C36238u uVar, C36240w wVar, C36242y yVar, C36201b0 b0Var, C36205d0 d0Var, C36270a aVar6, C36265j jVar, C36209f0 f0Var, C36215i0 i0Var, C38329a aVar7, C36221l0 l0Var, C36225n0 n0Var, C36231q0 q0Var, C36235s0 s0Var) {
            this.f34179F = this;
            this.f34219c = cVar;
            this.f34221d = jVar;
            this.f34223e = aVar7;
            this.f34225f = aVar5;
            this.f34227g = wVar;
            this.f34229h = aVar;
            this.f34231i = cVar3;
            this.f34233j = cVar4;
            this.f34235k = aVar6;
            this.f34237l = aVar4;
            this.f34239m = mVar;
            this.f34241n = aVar2;
            this.f34243o = n0Var;
            this.f34245p = s0Var;
            this.f34247q = iVar;
            this.f34249r = l0Var;
            this.f34251s = f0Var;
            this.f34253t = b0Var;
            this.f34255u = kVar;
            this.f34257v = d0Var;
            this.f34259w = gVar;
            this.f34261x = aVar3;
            this.f34263y = i0Var;
            this.f34265z = sVar;
            this.f34169A = q0Var;
            this.f34171B = yVar;
            this.f34173C = cVar2;
            this.f34175D = qVar;
            this.f34177E = uVar;
            mo33829H7(aVar, aVar2, cVar, cVar2, cVar3, gVar, aVar3, aVar4, iVar, aVar5, kVar, mVar, cVar4, qVar, sVar, uVar, wVar, yVar, b0Var, d0Var, aVar6, jVar, f0Var, i0Var, aVar7, l0Var, n0Var, q0Var, s0Var);
        }
    }

    /* renamed from: com.carrefour.fid.android.i$k */
    public static final class C13997k implements C14006j0.C14020j.C14021a {

        /* renamed from: a */
        public final C13995j f34269a;

        /* renamed from: b */
        public final C13988d f34270b;

        /* renamed from: c */
        public final C13986b f34271c;

        /* renamed from: d */
        public View f34272d;

        /* renamed from: b */
        public C14006j0.C14020j mo21627g() {
            C10335o.m38549a(this.f34272d, View.class);
            return new C13998l(this.f34269a, this.f34270b, this.f34271c, this.f34272d);
        }

        /* renamed from: c */
        public C13997k mo21626a(View view) {
            this.f34272d = (View) C10335o.m38550b(view);
            return this;
        }

        public C13997k(C13995j jVar, C13988d dVar, C13986b bVar) {
            this.f34269a = jVar;
            this.f34270b = dVar;
            this.f34271c = bVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$l */
    public static final class C13998l extends C14006j0.C14020j {

        /* renamed from: c */
        public final C13995j f34273c;

        /* renamed from: d */
        public final C13988d f34274d;

        /* renamed from: e */
        public final C13986b f34275e;

        /* renamed from: f */
        public final C13998l f34276f;

        public C13998l(C13995j jVar, C13988d dVar, C13986b bVar, View view) {
            this.f34276f = this;
            this.f34273c = jVar;
            this.f34274d = dVar;
            this.f34275e = bVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$m */
    public static final class C13999m implements C14006j0.C14023l.C14024a {

        /* renamed from: a */
        public final C13995j f34277a;

        /* renamed from: b */
        public final C13988d f34278b;

        /* renamed from: c */
        public C19456p0 f34279c;

        /* renamed from: d */
        public C10182h f34280d;

        /* renamed from: c */
        public C14006j0.C14023l mo21630g() {
            C10335o.m38549a(this.f34279c, C19456p0.class);
            C10335o.m38549a(this.f34280d, C10182h.class);
            return new C14000n(this.f34277a, this.f34278b, this.f34279c, this.f34280d);
        }

        /* renamed from: d */
        public C13999m mo21628a(C19456p0 p0Var) {
            this.f34279c = (C19456p0) C10335o.m38550b(p0Var);
            return this;
        }

        /* renamed from: e */
        public C13999m mo21629b(C10182h hVar) {
            this.f34280d = (C10182h) C10335o.m38550b(hVar);
            return this;
        }

        public C13999m(C13995j jVar, C13988d dVar) {
            this.f34277a = jVar;
            this.f34278b = dVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$n */
    public static final class C14000n extends C14006j0.C14023l {

        /* renamed from: A */
        public Provider<BaseAccountViewModel> f34281A;

        /* renamed from: A0 */
        public Provider<NonFoodCheckout1ViewModel> f34282A0;

        /* renamed from: B */
        public Provider<BaseLoyaltyViewModel> f34283B;

        /* renamed from: B0 */
        public Provider<NonFoodCheckoutStep2ViewModel> f34284B0;

        /* renamed from: C */
        public Provider<BasketAdditionalOrderViewModel> f34285C;

        /* renamed from: C0 */
        public Provider<NonFoodProductDetailsViewModel> f34286C0;

        /* renamed from: D */
        public Provider<BasketBuilderDepartmentViewModel> f34287D;

        /* renamed from: D0 */
        public Provider<OrderOfflineDetailViewModel> f34288D0;

        /* renamed from: E */
        public Provider<BasketBuilderMyListViewModel> f34289E;

        /* renamed from: E0 */
        public Provider<OrderOfflineListViewModel> f34290E0;

        /* renamed from: F */
        public Provider<BasketBuilderRecommendedProductsViewModel> f34291F;

        /* renamed from: F0 */
        public Provider<OrderOnlineDetailViewModel> f34292F0;

        /* renamed from: G */
        public Provider<BasketBuilderViewModel> f34293G;

        /* renamed from: G0 */
        public Provider<OrderOnlineListViewModel> f34294G0;

        /* renamed from: H */
        public Provider<BlockedCardViewModel> f34295H;

        /* renamed from: H0 */
        public Provider<OrderOnlineViewModel> f34296H0;

        /* renamed from: I */
        public Provider<CatalogDetailsViewModel> f34297I;

        /* renamed from: I0 */
        public Provider<OrdersViewModel> f34298I0;

        /* renamed from: J */
        public Provider<CatalogFavoriteProductsViewModel> f34299J;

        /* renamed from: J0 */
        public Provider<OverlayCouponDetailsBottomSheetViewModel> f34300J0;

        /* renamed from: K */
        public Provider<CatalogProductDetailsViewModel> f34301K;

        /* renamed from: K0 */
        public Provider<OverlayProductsBottomSheetViewModel> f34302K0;

        /* renamed from: L */
        public Provider<CatalogsBuilderViewModel> f34303L;

        /* renamed from: L0 */
        public Provider<PaymentMethodViewModel> f34304L0;

        /* renamed from: M */
        public Provider<ChallengeFidViewModel> f34305M;

        /* renamed from: M0 */
        public Provider<PhysicalStoreInfoViewModel> f34306M0;

        /* renamed from: N */
        public Provider<ChannelsFidViewModel> f34307N;

        /* renamed from: N0 */
        public Provider<PhysicalStoreViewModel> f34308N0;

        /* renamed from: O */
        public Provider<CheckoutBasketsListViewModel> f34309O;

        /* renamed from: O0 */
        public Provider<PickupPointsMapViewModel> f34310O0;

        /* renamed from: P */
        public Provider<CheckoutCgvViewModel> f34311P;

        /* renamed from: P0 */
        public Provider<PlpViewModel> f34312P0;

        /* renamed from: Q */
        public Provider<CheckoutConfirmationViewModel> f34313Q;

        /* renamed from: Q0 */
        public Provider<PrimeFidListViewModel> f34314Q0;

        /* renamed from: R */
        public Provider<com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel> f34315R;

        /* renamed from: R0 */
        public Provider<PrivacyViewModel> f34316R0;

        /* renamed from: S */
        public Provider<CheckoutPaymentErrorViewModel> f34317S;

        /* renamed from: S0 */
        public Provider<ProductDetailsViewModel> f34318S0;

        /* renamed from: T */
        public Provider<CheckoutPaymentViewModel> f34319T;

        /* renamed from: T0 */
        public Provider<ProductSearchViewModel> f34320T0;

        /* renamed from: U */
        public Provider<CheckoutStep1MVIViewModel> f34321U;

        /* renamed from: U0 */
        public Provider<ProductSearchWithListAllResultsViewModel> f34322U0;

        /* renamed from: V */
        public Provider<CheckoutStep2ViewModel> f34323V;

        /* renamed from: V0 */
        public Provider<ProductSearchWithListRecommendationResultsViewModel> f34324V0;

        /* renamed from: W */
        public Provider<CheckoutStep3ViewModel> f34325W;

        /* renamed from: W0 */
        public Provider<ProductSearchWithListResultViewModel> f34326W0;

        /* renamed from: X */
        public Provider<CheckoutStep4ViewModel> f34327X;

        /* renamed from: X0 */
        public Provider<ProductSearchWithListViewModel> f34328X0;

        /* renamed from: Y */
        public Provider<CheckoutStepOneAdditionalOrderViewModel> f34329Y;

        /* renamed from: Y0 */
        public Provider<QuantityBackDropViewModel> f34330Y0;

        /* renamed from: Z */
        public Provider<CheckoutStepTwoAdditionalOderViewModel> f34331Z;

        /* renamed from: Z0 */
        public Provider<QuantityBottomSheetViewModel> f34332Z0;

        /* renamed from: a0 */
        public Provider<CheckoutStepTwoCgvViewModel> f34333a0;

        /* renamed from: a1 */
        public Provider<RatingViewModel> f34334a1;

        /* renamed from: b0 */
        public Provider<ConfigureConsentOptinsViewModel> f34335b0;

        /* renamed from: b1 */
        public Provider<ScanBarcodeViewModel> f34336b1;

        /* renamed from: c */
        public final C19456p0 f34337c;

        /* renamed from: c0 */
        public Provider<ConsentBackDropViewModel> f34338c0;

        /* renamed from: c1 */
        public Provider<ScannerViewModel> f34339c1;

        /* renamed from: d */
        public final C13995j f34340d;

        /* renamed from: d0 */
        public Provider<CouponsFilterViewModel> f34341d0;

        /* renamed from: d1 */
        public Provider<SecretCodeViewModel> f34342d1;

        /* renamed from: e */
        public final C13988d f34343e;

        /* renamed from: e0 */
        public Provider<CouponsListViewModel> f34344e0;

        /* renamed from: e1 */
        public Provider<ServiceSlotOmrViewModel> f34345e1;

        /* renamed from: f */
        public final C14000n f34346f;

        /* renamed from: f0 */
        public Provider<CreateOrAttachCardViewModel> f34347f0;

        /* renamed from: f1 */
        public Provider<ServiceSlotViewModel> f34348f1;

        /* renamed from: g */
        public Provider<AcceptLoyaltyCguViewModel> f34349g;

        /* renamed from: g0 */
        public Provider<CriteoBannerViewModel> f34350g0;

        /* renamed from: g1 */
        public Provider<ServiceStationsLandingPageViewModel> f34351g1;

        /* renamed from: h */
        public Provider<AccountAddressViewModel> f34352h;

        /* renamed from: h0 */
        public Provider<DeliveryServiceSelectionViewModel> f34353h0;

        /* renamed from: h1 */
        public Provider<ServiceStationsResultViewModel> f34354h1;

        /* renamed from: i */
        public Provider<AccountConsentOptinsTabViewModel> f34355i;

        /* renamed from: i0 */
        public Provider<DeliverySummaryViewModel> f34356i0;

        /* renamed from: i1 */
        public Provider<ServiceStationsViewModel> f34357i1;

        /* renamed from: j */
        public Provider<AccountDataViewModel> f34358j;

        /* renamed from: j0 */
        public Provider<DepartmentsViewModel> f34359j0;

        /* renamed from: j1 */
        public Provider<ShoppingListViewModel> f34360j1;

        /* renamed from: k */
        public Provider<AccountInfoViewModel> f34361k;

        /* renamed from: k0 */
        public Provider<DriveMapViewModel> f34362k0;

        /* renamed from: k1 */
        public Provider<SignInViewModel> f34363k1;

        /* renamed from: l */
        public Provider<AccountListHomeViewModel> f34364l;

        /* renamed from: l0 */
        public Provider<DriveSummaryViewModel> f34365l0;

        /* renamed from: l1 */
        public Provider<SplashViewModel> f34366l1;

        /* renamed from: m */
        public Provider<AccountListOrderViewModel> f34367m;

        /* renamed from: m0 */
        public Provider<FacetViewModel> f34368m0;

        /* renamed from: m1 */
        public Provider<StoreCatalogListViewModel> f34369m1;

        /* renamed from: n */
        public Provider<AccountListShoppingViewModel> f34370n;

        /* renamed from: n0 */
        public Provider<FeedbackViewModel> f34371n0;

        /* renamed from: n1 */
        public Provider<StoreViewModel> f34372n1;

        /* renamed from: o */
        public Provider<AccountMenuViewModel> f34373o;

        /* renamed from: o0 */
        public Provider<ForgotPasswordViewModel> f34374o0;

        /* renamed from: o1 */
        public Provider<SuccessCreateCardViewModel> f34375o1;

        /* renamed from: p */
        public Provider<AdditionalOrderBottomSheetViewModel> f34376p;

        /* renamed from: p0 */
        public Provider<HomeOnlineShopDetailsViewModel> f34377p0;

        /* renamed from: p1 */
        public Provider<UpdateUserEmailViewModel> f34378p1;

        /* renamed from: q */
        public Provider<AdditionalOrderDepartmentViewModel> f34379q;

        /* renamed from: q0 */
        public Provider<HomePageViewModel> f34380q0;

        /* renamed from: q1 */
        public Provider<UpdateUserInfoViewModel> f34381q1;

        /* renamed from: r */
        public Provider<AdditionalOrderProductSearchViewModel> f34382r;

        /* renamed from: r0 */
        public Provider<HomeViewModel> f34383r0;

        /* renamed from: r1 */
        public Provider<UpdateUserPasswordViewModel> f34384r1;

        /* renamed from: s */
        public Provider<AdditionalOrderSearchViewModel> f34385s;

        /* renamed from: s0 */
        public Provider<InitLoyaltyCardViewModel> f34386s0;

        /* renamed from: s1 */
        public Provider<ValidateOtpViewModel> f34387s1;

        /* renamed from: t */
        public Provider<AdditionalOrderViewModel> f34388t;

        /* renamed from: t0 */
        public Provider<ListProductsOrderedViewModel> f34389t0;

        /* renamed from: t1 */
        public Provider<VerifyUserAddressViewModel> f34390t1;

        /* renamed from: u */
        public Provider<AlternativeProductsBottomSheetViewModel> f34391u;

        /* renamed from: u0 */
        public Provider<LoyaltyAmountHistoryViewModel> f34392u0;

        /* renamed from: v */
        public Provider<AppEnvironmentSelectionViewModel> f34393v;

        /* renamed from: v0 */
        public Provider<LoyaltyDetailViewModel> f34394v0;

        /* renamed from: w */
        public Provider<AppMessageViewModel> f34395w;

        /* renamed from: w0 */
        public Provider<LoyaltyMyCardViewModel> f34396w0;

        /* renamed from: x */
        public Provider<AttachCardViewModel> f34397x;

        /* renamed from: x0 */
        public Provider<LuckyCartViewModel> f34398x0;

        /* renamed from: y */
        public Provider<BarcodeScannerViewModel> f34399y;

        /* renamed from: y0 */
        public Provider<MemoListViewModel> f34400y0;

        /* renamed from: z */
        public Provider<BarcodeViewModel> f34401z;

        /* renamed from: z0 */
        public Provider<MixingProductsBottomSheetViewModel> f34402z0;

        /* renamed from: com.carrefour.fid.android.i$n$a */
        public static final class C14001a<T> implements Provider<T> {

            /* renamed from: a */
            public final C13995j f34403a;

            /* renamed from: b */
            public final C13988d f34404b;

            /* renamed from: c */
            public final C14000n f34405c;

            /* renamed from: d */
            public final int f34406d;

            public C14001a(C13995j jVar, C13988d dVar, C14000n nVar, int i) {
                this.f34403a = jVar;
                this.f34404b = dVar;
                this.f34405c = nVar;
                this.f34406d = i;
            }

            /* renamed from: a */
            public final T mo34303a() {
                switch (this.f34406d) {
                    case 0:
                        return new AcceptLoyaltyCguViewModel(this.f34405c.mo34284v3(), this.f34405c.mo34219f2());
                    case 1:
                        return new AccountAddressViewModel(this.f34405c.mo34288w3(), this.f34405c.mo34213d4(), this.f34405c.mo34270r5(), this.f34403a.mo33999i9(), (C13239a) this.f34403a.f34254t0.get(), this.f34405c.mo34223g2(), C28679f.m118663c(this.f34403a.f34225f));
                    case 2:
                        return new AccountConsentOptinsTabViewModel(this.f34403a.mo33888R6(), this.f34403a.mo33906U6(), this.f34403a.mo34098y4(), this.f34405c.mo34228h3(), C28675b.m118651c(this.f34403a.f34225f), this.f34405c.mo34227h2());
                    case 3:
                        return new AccountDataViewModel();
                    case 4:
                        return new AccountInfoViewModel(this.f34403a.mo34098y4(), this.f34405c.mo34231i2());
                    case 5:
                        return new AccountListHomeViewModel(this.f34403a.mo33909U9());
                    case 6:
                        return new AccountListOrderViewModel(this.f34403a.mo34078u8(), this.f34405c.mo34116A3(), this.f34405c.mo34162M3(), this.f34403a.mo33909U9(), this.f34403a.mo34014l(), (ClearAppManager) this.f34403a.f34242n0.get());
                    case 7:
                        return new AccountListShoppingViewModel(this.f34403a.mo34078u8(), this.f34403a.mo33922X4(), this.f34403a.mo33909U9(), this.f34403a.mo34014l(), (ClearAppManager) this.f34403a.f34242n0.get());
                    case 8:
                        return new AccountMenuViewModel(this.f34403a.mo34014l(), this.f34403a.mo33940a(), this.f34403a.mo33951b8(), this.f34403a.mo33834I6(), this.f34403a.mo33832I4(), this.f34403a.mo34104z4(), this.f34403a.mo33999i9(), this.f34403a.mo33915V9(), this.f34403a.mo33880Q4(), this.f34403a.mo34081v5(), this.f34405c.mo34155K2(), new C37536a(), this.f34403a.mo33802D4(), (C37786s) this.f34403a.f34260w0.get());
                    case 9:
                        return new AdditionalOrderBottomSheetViewModel(this.f34405c.mo34171P3(), this.f34403a.mo33961d5(), this.f34405c.mo34163M4(), C28679f.m118663c(this.f34403a.f34225f));
                    case 10:
                        return new AdditionalOrderDepartmentViewModel(this.f34403a.mo34078u8(), this.f34405c.mo34184T4(), this.f34405c.mo34251n2(), this.f34403a.mo33909U9(), C28679f.m118663c(this.f34403a.f34225f));
                    case 11:
                        return new AdditionalOrderProductSearchViewModel(this.f34405c.mo34183T3(), this.f34405c.mo34243l2(), this.f34405c.mo34164N2(), this.f34405c.mo34195X3(), C10242e.m38491c(this.f34403a.f34219c), C28679f.m118663c(this.f34403a.f34225f));
                    case 12:
                        return new AdditionalOrderSearchViewModel(this.f34403a.mo33857M5());
                    case 13:
                        return new AdditionalOrderViewModel(this.f34405c.mo34249m4(), this.f34403a.mo34078u8(), this.f34403a.mo33905U5(), this.f34405c.mo34162M3(), this.f34403a.mo33910V4(), this.f34403a.mo33881Q5(), this.f34403a.mo33951b8(), this.f34403a.mo33909U9(), this.f34405c.mo34184T4(), this.f34405c.mo34247m2());
                    case 14:
                        return new AlternativeProductsBottomSheetViewModel(this.f34403a.mo33836I8(), this.f34403a.mo33898T4(), this.f34403a.mo33955c5(), this.f34403a.mo33923X5());
                    case 15:
                        return new AppEnvironmentSelectionViewModel(this.f34405c.mo34274s5(), this.f34403a.mo33999i9(), (ClearAppManager) this.f34403a.f34242n0.get());
                    case 16:
                        return new AppMessageViewModel(this.f34405c.mo34202Z4(), this.f34405c.mo34244l3(), this.f34405c.mo34293x4());
                    case 17:
                        return new AttachCardViewModel(this.f34405c.mo34148I3(), this.f34403a.mo34098y4(), this.f34405c.mo34263q2());
                    case 18:
                        return new BarcodeScannerViewModel(this.f34403a.mo33793B7(), this.f34403a.mo33951b8(), this.f34405c.mo34298y5(), this.f34405c.mo34192W3(), this.f34403a.mo33910V4(), this.f34403a.mo33909U9());
                    case 19:
                        return new BarcodeViewModel(this.f34405c.mo34220f3(), this.f34403a.mo33951b8(), (C13783a) this.f34403a.f34193M.get());
                    case 20:
                        return new BaseAccountViewModel(this.f34403a.mo34014l());
                    case 21:
                        return new BaseLoyaltyViewModel(this.f34403a.mo33951b8(), this.f34403a.mo34014l());
                    case 22:
                        return new BasketAdditionalOrderViewModel(this.f34403a.mo33905U5());
                    case 23:
                        return new BasketBuilderDepartmentViewModel(this.f34403a.mo34078u8(), this.f34403a.mo33909U9());
                    case 24:
                        return new BasketBuilderMyListViewModel(this.f34403a.mo34014l());
                    case 25:
                        return new BasketBuilderRecommendedProductsViewModel(this.f34405c.mo34249m4(), this.f34403a.mo34078u8(), this.f34403a.mo33951b8());
                    case 26:
                        return new BasketBuilderViewModel(this.f34403a.mo34014l(), (ClearAppManager) this.f34403a.f34242n0.get(), this.f34405c.f34337c);
                    case 27:
                        return new BlockedCardViewModel(this.f34405c.mo34207b4(), this.f34405c.mo34267r2());
                    case 28:
                        return new CatalogDetailsViewModel(this.f34403a.mo34082v6(), this.f34403a.mo34088w6(), this.f34403a.mo34070t6(), this.f34403a.mo33798C6(), this.f34403a.mo33950b7(), this.f34405c.mo34279u2(), this.f34403a.mo33927X9(), this.f34405c.mo34287w2());
                    case 29:
                        return new CatalogFavoriteProductsViewModel(this.f34403a.mo34088w6(), this.f34403a.mo33798C6(), this.f34403a.mo33792B6(), this.f34405c.mo34283v2());
                    case 30:
                        return new CatalogProductDetailsViewModel(this.f34403a.mo34088w6(), this.f34403a.mo34070t6(), this.f34403a.mo33798C6(), this.f34405c.mo34291x2());
                    case 31:
                        return new CatalogsBuilderViewModel(this.f34403a.mo34041o9(), this.f34403a.mo34100y6(), this.f34403a.mo34094x6(), this.f34403a.mo33950b7(), this.f34405c.mo34275t2(), this.f34403a.mo33927X9(), new C13744c(), this.f34403a.mo33977f7());
                    case 32:
                        return new ChallengeFidViewModel(this.f34403a.mo33951b8(), this.f34405c.mo34295y2());
                    case 33:
                        return new ChannelsFidViewModel(this.f34405c.mo34207b4(), this.f34405c.mo34177R3());
                    case 34:
                        return new CheckoutBasketsListViewModel(this.f34403a.mo33942a6(), this.f34403a.mo33803D5(), this.f34403a.mo34079u9());
                    case 35:
                        return new CheckoutCgvViewModel(this.f34405c.mo34264q3());
                    case 36:
                        return this.f34405c.mo34233i4(C26198c.m112022c(this.f34403a.mo33887R5(), this.f34403a.mo34087w5(), this.f34403a.mo33807D9(), this.f34403a.mo33970e7(), (C38208a) this.f34403a.f34180F0.get(), this.f34403a.mo33793B7(), this.f34403a.mo34067s9(), this.f34403a.mo33940a(), this.f34403a.mo33951b8(), this.f34405c.mo34121B4(), new C36496i0(), new C13744c(), this.f34403a.mo33803D5(), C28679f.m118663c(this.f34403a.f34225f)));
                    case 37:
                        return new com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel(this.f34403a.mo33887R5(), this.f34403a.mo33905U5(), this.f34403a.mo33970e7(), (C38208a) this.f34403a.f34180F0.get(), this.f34403a.mo33793B7(), this.f34403a.mo33940a(), this.f34403a.mo33951b8(), this.f34405c.mo34121B4(), this.f34405c.mo34299z2(), new C36496i0(), new C13744c(), this.f34405c.mo34162M3(), this.f34405c.mo34292x3(), this.f34405c.mo34127D2());
                    case 38:
                        return new CheckoutPaymentErrorViewModel(this.f34403a.mo33940a(), this.f34403a.mo34067s9(), this.f34405c.mo34131E2());
                    case 39:
                        return new CheckoutPaymentViewModel(this.f34405c.mo34173Q2(), new C36540w0(), this.f34405c.mo34135F2());
                    case 40:
                        AccountRepository a = this.f34403a.mo33940a();
                        CriteoSendCriteoEventUseCase o2 = this.f34403a.mo33970e7();
                        CriteoTrackingCriteoUseCase p2 = this.f34403a.mo33977f7();
                        CriteoGetCriteoProductsUseCase m2 = this.f34403a.mo33957c7();
                        GetLoyaltyClubsUseCase q0 = this.f34405c.mo34136F3();
                        GetOfferProductListUseCase B2 = this.f34403a.mo33793B7();
                        GetCmsPrimeFidListUseCase f0 = this.f34405c.mo34280u3();
                        CheckoutGetSlotExpressUseCase X1 = this.f34403a.mo33840J6();
                        C13968z s1 = this.f34403a.mo33839J5();
                        LoginRepository l = this.f34403a.mo34014l();
                        LoyaltyPreferencesStorage M2 = this.f34403a.mo33951b8();
                        OfferListAndBasketControllerImpl W2 = this.f34403a.mo34078u8();
                        BasketSynchronizeCurrentBasketUseCase D1 = this.f34403a.mo33917W5();
                        OfferListModelDataMapper offerListModelDataMapper = r2;
                        OfferListModelDataMapper offerListModelDataMapper2 = new OfferListModelDataMapper();
                        C13744c cVar = r2;
                        C13744c cVar2 = new C13744c();
                        return new CheckoutStep1MVIViewModel(a, o2, p2, m2, q0, B2, f0, X1, s1, l, M2, W2, D1, offerListModelDataMapper, this.f34403a.mo34103y9(), this.f34403a.mo33999i9(), this.f34405c.mo34199Y4(), this.f34403a.mo33904U4(), this.f34403a.mo33960ca(), this.f34403a.mo34099y5(), this.f34403a.mo34067s9(), (C37493a) this.f34403a.f34254t0.get(), cVar, this.f34403a.mo33791B5(), this.f34403a.mo33909U9(), this.f34405c.mo34119B2(), this.f34405c.mo34246l5());
                    case 41:
                        return new CheckoutStep2ViewModel(this.f34403a.mo33940a(), this.f34403a.mo33857M5(), this.f34403a.mo33797C5(), this.f34405c.mo34159L3(), this.f34403a.mo33917W5(), this.f34403a.mo33935Z5(), this.f34405c.mo34246l5(), this.f34403a.mo34067s9(), this.f34403a.mo34091w9(), this.f34403a.mo33909U9(), this.f34403a.mo34044p5(), this.f34403a.mo33875P5(), this.f34405c.mo34139G2(), this.f34405c.f34337c);
                    case 42:
                        return new CheckoutStep3ViewModel(this.f34405c.mo34237j4(), this.f34403a.mo33887R5(), this.f34403a.mo33857M5(), this.f34403a.mo33917W5(), this.f34405c.mo34124C3(), this.f34403a.mo33931Y7(), this.f34405c.mo34265q4(), this.f34405c.mo34150I5(), this.f34403a.mo34067s9(), this.f34403a.mo33876P6(), this.f34403a.mo34067s9(), this.f34403a.mo34044p5(), this.f34403a.mo33875P5(), this.f34405c.mo34143H2(), this.f34403a.mo33788A8(), this.f34405c.f34337c);
                    case 43:
                        return new CheckoutStep4ViewModel(this.f34405c.mo34173Q2(), new C36540w0(), this.f34403a.mo33887R5());
                    case 44:
                        return new CheckoutStepOneAdditionalOrderViewModel(this.f34403a.mo33793B7(), this.f34403a.mo34078u8(), this.f34403a.mo33960ca(), this.f34403a.mo33951b8(), new OfferListModelDataMapper(), this.f34405c.mo34280u3(), this.f34405c.mo34136F3(), this.f34403a.mo33910V4(), this.f34405c.mo34246l5(), this.f34405c.mo34184T4(), this.f34405c.mo34147I2());
                    case 45:
                        return new CheckoutStepTwoAdditionalOderViewModel(this.f34403a.mo34098y4(), this.f34403a.mo33951b8(), this.f34403a.mo33887R5(), this.f34405c.mo34124C3(), this.f34403a.mo33931Y7(), this.f34405c.mo34265q4(), this.f34403a.mo34034n9(), this.f34405c.mo34150I5(), this.f34405c.f34337c, this.f34405c.mo34151J2());
                    case 46:
                        return new CheckoutStepTwoCgvViewModel(this.f34405c.mo34264q3(), C28679f.m118663c(this.f34403a.f34225f));
                    case 47:
                        return new ConfigureConsentOptinsViewModel(this.f34403a.mo33894S6(), this.f34403a.mo33906U6(), (C13783a) this.f34403a.f34193M.get());
                    case 48:
                        return new ConsentBackDropViewModel(this.f34403a.mo33894S6(), this.f34403a.mo33906U6(), (C13783a) this.f34403a.f34193M.get());
                    case 49:
                        return new CouponsFilterViewModel();
                    case 50:
                        return new CouponsListViewModel(this.f34405c.mo34260p3(), this.f34405c.mo34286v5(), new C37653k(), this.f34405c.mo34166N4(), this.f34405c.f34337c);
                    case 51:
                        return new CreateOrAttachCardViewModel(this.f34405c.mo34188V2());
                    case 52:
                        return new CriteoBannerViewModel(this.f34403a.mo34101y7(), this.f34403a.mo33977f7());
                    case 53:
                        return new DeliveryServiceSelectionViewModel(this.f34403a.mo34098y4(), this.f34405c.mo34230h5(), this.f34405c.mo34203a3(), (C37493a) this.f34403a.f34254t0.get(), this.f34403a.mo34013k9());
                    case 54:
                        return new DeliverySummaryViewModel(this.f34405c.mo34180S3(), this.f34403a.mo34086w4(), this.f34403a.mo33784A4(), this.f34403a.mo33911V5(), this.f34405c.mo34255o2(), this.f34403a.mo33838J4(), this.f34405c.mo34156K3(), this.f34405c.f34337c);
                    case 55:
                        return new DepartmentsViewModel(this.f34403a.mo33810E6(), this.f34403a.mo34067s9(), this.f34403a.mo34077u7());
                    case 56:
                        return new DriveMapViewModel(this.f34405c.mo34224g3(), this.f34403a.mo34098y4(), (C37493a) this.f34403a.f34254t0.get(), this.f34403a.mo34034n9(), this.f34403a.mo33795B9(), this.f34403a.mo33911V5(), this.f34405c.mo34209c3());
                    case 57:
                        return new DriveSummaryViewModel(this.f34403a.mo34034n9(), this.f34403a.mo33795B9(), this.f34403a.mo33911V5(), this.f34405c.mo34212d3(), this.f34405c.f34337c);
                    case 58:
                        return new FacetViewModel(this.f34405c.mo34193W4(), this.f34405c.mo34190V4(), this.f34403a.mo33830H8(), this.f34405c.mo34178R4(), this.f34405c.mo34187U4(), this.f34405c.f34337c);
                    case 59:
                        return new FeedbackViewModel(this.f34405c.mo34299z2(), C28679f.m118663c(this.f34403a.f34225f));
                    case 60:
                        return new ForgotPasswordViewModel(this.f34405c.mo34236j3(), this.f34405c.mo34232i3());
                    case 61:
                        return new HomeOnlineShopDetailsViewModel(this.f34403a.mo34078u8());
                    case 62:
                        GetOfferProductListUseCase B22 = this.f34403a.mo33793B7();
                        OfferListModelDataMapper offerListModelDataMapper3 = r2;
                        OfferListModelDataMapper offerListModelDataMapper4 = new OfferListModelDataMapper();
                        GetOrderOnlineListUseCase B0 = this.f34405c.mo34174Q3();
                        GetOrderOnlineDetailUseCase A0 = this.f34405c.mo34171P3();
                        C25222e eVar = r2;
                        C25222e eVar2 = new C25222e();
                        C25216a aVar = r2;
                        C25216a aVar2 = new C25216a();
                        BasketRetrieveBasketUseCase z1 = this.f34403a.mo33887R5();
                        ThirdPartyCheckRemoteConfigUseCase b4 = this.f34403a.mo33909U9();
                        GetCmsCarouselsUseCase c0 = this.f34405c.mo34268r3();
                        GetCmsOffersUseCase e0 = this.f34405c.mo34276t3();
                        GetGazStationsCampaignUseCase k0 = this.f34405c.mo34300z3();
                        AccountGetUserInfoUseCase w0 = this.f34403a.mo34098y4();
                        FetchCouponsUseCase R = this.f34405c.mo34220f3();
                        GetLoyaltyBalanceUseCase n0 = this.f34405c.mo34124C3();
                        LoginRepository l2 = this.f34403a.mo34014l();
                        C22725b bVar = r2;
                        C22725b bVar2 = new C22725b();
                        return new HomePageViewModel(B22, offerListModelDataMapper3, B0, A0, eVar, aVar, z1, b4, c0, e0, k0, w0, R, n0, l2, bVar, this.f34403a.mo33940a(), this.f34403a.mo34073t9(), this.f34403a.mo34109z9(), this.f34403a.mo34097x9(), this.f34403a.mo33999i9(), this.f34403a.mo34085v9(), this.f34403a.mo33951b8(), this.f34403a.mo34041o9(), this.f34403a.mo34034n9(), this.f34403a.mo33789A9(), this.f34403a.mo33904U4(), this.f34403a.mo33941a5(), this.f34403a.mo33986g9(), this.f34405c.mo34217e4(), this.f34405c.mo34285v4(), this.f34405c.mo34248m3(), this.f34405c.mo34256o3(), this.f34405c.mo34140G3(), this.f34405c.mo34201Z3(), this.f34405c.mo34281u4(), this.f34403a.mo34101y7(), this.f34403a.mo33881Q5(), this.f34403a.mo33810E6(), this.f34403a.mo34067s9(), this.f34405c.mo34242k5(), this.f34403a.mo33894S6(), this.f34405c.mo34205a5(), this.f34403a.mo33977f7(), this.f34405c.mo34249m4(), this.f34403a.mo33994ha(), this.f34405c.mo34272s3(), this.f34403a.mo33907U7(), this.f34403a.mo34076u6(), this.f34405c.mo34252n3());
                    case 63:
                        return new HomeViewModel(this.f34403a.mo33915V9(), this.f34403a.mo34098y4(), this.f34403a.mo33951b8(), this.f34403a.mo34082v6(), new C13744c(), this.f34403a.mo33881Q5(), this.f34403a.mo33863N5(), this.f34403a.mo33810E6(), this.f34403a.mo34076u6(), this.f34403a.mo33902T8(), C28677d.m118657c(this.f34403a.f34225f));
                    case 64:
                        return new InitLoyaltyCardViewModel(this.f34405c.mo34191W2(), this.f34403a.mo34098y4(), this.f34403a.mo33826H4(), this.f34405c.mo34235j2(), new C13744c(), this.f34403a.mo33951b8(), this.f34405c.mo34288w3(), this.f34405c.mo34213d4(), (C13239a) this.f34403a.f34254t0.get(), this.f34405c.mo34221f4());
                    case 65:
                        return new ListProductsOrderedViewModel((OrderOnlineRepository) this.f34403a.f34258v0.get(), this.f34405c.mo34171P3(), new C25216a());
                    case 66:
                        return new LoyaltyAmountHistoryViewModel(this.f34405c.mo34296y3(), this.f34405c.mo34210c4(), this.f34405c.mo34257o4());
                    case 67:
                        return new LoyaltyDetailViewModel(this.f34405c.mo34300z3(), this.f34405c.mo34124C3(), this.f34405c.mo34136F3(), this.f34405c.mo34128D3(), this.f34405c.mo34228h3(), this.f34405c.mo34208b5(), this.f34405c.mo34158L2(), this.f34405c.mo34132E3(), this.f34403a.mo34098y4(), this.f34405c.mo34220f3(), this.f34403a.mo34014l(), this.f34403a.mo34068t4(), this.f34403a.mo34067s9(), this.f34403a.mo34091w9(), this.f34403a.mo33994ha(), this.f34403a.mo33907U7(), this.f34405c.mo34252n3(), this.f34405c.mo34273s4());
                    case 68:
                        return new LoyaltyMyCardViewModel(this.f34403a.mo33787A7());
                    case 69:
                        return new LuckyCartViewModel(this.f34405c.mo34144H3());
                    case 70:
                        return new MemoListViewModel(this.f34405c.mo34239k2(), this.f34405c.mo34161M2(), this.f34405c.mo34200Z2(), this.f34405c.mo34152J3(), this.f34405c.mo34290w5(), this.f34405c.mo34214d5(), (ClearAppManager) this.f34403a.f34242n0.get());
                    case 71:
                        return new MixingProductsBottomSheetViewModel(this.f34403a.mo34078u8(), this.f34403a.mo33793B7(), this.f34403a.mo33951b8(), this.f34403a.mo33910V4());
                    case 72:
                        return new NonFoodCheckout1ViewModel(this.f34405c.mo34278t5(), this.f34405c.mo34301z4(), this.f34403a.mo33827H5(), this.f34403a.mo34087w5(), this.f34403a.mo33821G5(), this.f34403a.mo34069t5(), this.f34403a.mo33803D5(), this.f34403a.mo34079u9(), this.f34405c.mo34246l5(), this.f34405c.f34337c);
                    case 73:
                        return new NonFoodCheckoutStep2ViewModel(this.f34403a.mo33916W4(), this.f34403a.mo33899T5(), (C37497c) this.f34403a.f34194M0.get(), this.f34403a.mo34086w4(), this.f34403a.mo33784A4(), this.f34403a.mo34105z5(), (C37493a) this.f34403a.f34254t0.get(), this.f34405c.mo34297y4(), this.f34403a.mo33803D5(), this.f34403a.mo33785A5(), this.f34403a.mo34071t7(), this.f34403a.mo34037o5(), this.f34403a.mo33875P5(), this.f34405c.mo34265q4(), this.f34405c.mo34159L3(), this.f34403a.mo34054q8(), this.f34405c.f34337c);
                    case 74:
                        return new NonFoodProductDetailsViewModel(this.f34403a.mo33914V8(), this.f34403a.mo34109z9(), this.f34403a.mo33851L5(), this.f34403a.mo33929Y5(), this.f34405c.f34337c);
                    case 75:
                        return new OrderOfflineDetailViewModel(this.f34405c.mo34165N3(), this.f34403a.mo33909U9(), this.f34405c.mo34206b3(), this.f34405c.mo34137F4());
                    case 76:
                        return new OrderOfflineListViewModel(this.f34403a.mo33937Z7(), this.f34405c.mo34168O3(), this.f34405c.mo34141G4(), this.f34403a.mo33951b8(), this.f34403a.mo33940a(), C28679f.m118663c(this.f34403a.f34225f));
                    case 77:
                        return new OrderOnlineDetailViewModel(this.f34405c.mo34171P3(), this.f34405c.mo34271s2(), new C25216a(), this.f34405c.mo34238j5(), this.f34403a.mo34014l());
                    case 78:
                        return new OrderOnlineListViewModel(this.f34405c.mo34174Q3(), new C25222e(), C28679f.m118663c(this.f34403a.f34225f));
                    case 79:
                        return new OrderOnlineViewModel(this.f34405c.mo34174Q3(), new C27073c(), this.f34405c.mo34271s2());
                    case 80:
                        return new OrdersViewModel((ClearAppManager) this.f34403a.f34242n0.get());
                    case 81:
                        return new OverlayCouponDetailsBottomSheetViewModel(this.f34405c.mo34282u5(), this.f34405c.f34337c);
                    case 82:
                        return new OverlayProductsBottomSheetViewModel(this.f34403a.mo34078u8(), this.f34403a.mo33793B7(), this.f34403a.mo33951b8(), this.f34403a.mo33909U9(), this.f34403a.mo33942a6());
                    case 83:
                        return new PaymentMethodViewModel(this.f34405c.mo34186U3());
                    case 84:
                        return new PhysicalStoreInfoViewModel(this.f34403a.mo34041o9(), this.f34403a.mo34027m9(), this.f34405c.mo34204a4(), (C21424c) this.f34403a.f34246p0.get());
                    case 85:
                        return new PhysicalStoreViewModel(this.f34403a.mo34041o9(), this.f34403a.mo34034n9(), this.f34403a.mo33789A9(), this.f34403a.mo34098y4(), this.f34403a.mo33951b8(), this.f34405c.mo34124C3(), this.f34405c.mo34220f3(), this.f34403a.mo34067s9(), this.f34405c.mo34201Z3(), this.f34403a.mo33994ha(), this.f34403a.mo34014l(), this.f34403a.mo34076u6());
                    case 86:
                        return new PickupPointsMapViewModel(this.f34403a.mo33987ga(), (C37494a) this.f34403a.f34194M0.get());
                    case 87:
                        return new PlpViewModel(this.f34405c.mo34157K4(), this.f34403a.mo33898T4(), this.f34403a.mo33955c5(), this.f34403a.mo33923X5(), this.f34403a.mo33830H8(), (C37802t) this.f34403a.f34202Q0.get(), this.f34403a.mo33977f7());
                    case 88:
                        return new PrimeFidListViewModel(this.f34405c.mo34294x5(), this.f34405c.mo34280u3(), this.f34405c.mo34136F3(), this.f34403a.mo33906U6(), this.f34403a.mo34014l(), this.f34405c.mo34228h3(), this.f34405c.mo34208b5(), this.f34403a.mo34098y4(), this.f34405c.mo34241k4(), this.f34405c.mo34226g5(), this.f34405c.mo34269r4());
                    case 89:
                        return new PrivacyViewModel(this.f34405c.mo34172P4(), new C38507h(), this.f34405c.mo34169O4(), C10242e.m38491c(this.f34403a.f34219c), C28679f.m118663c(this.f34403a.f34225f));
                    case 90:
                        return new ProductDetailsViewModel(this.f34403a.mo34067s9(), this.f34403a.mo33890R8(), this.f34403a.mo33896S8(), this.f34403a.mo33854L8(), this.f34403a.mo33977f7(), this.f34403a.mo33970e7(), this.f34403a.mo33923X5(), this.f34403a.mo33898T4(), this.f34403a.mo33955c5(), this.f34405c.mo34175Q4());
                    case 91:
                        return new ProductSearchViewModel(this.f34405c.mo34183T3(), this.f34405c.mo34243l2(), this.f34405c.mo34164N2(), this.f34405c.mo34195X3(), this.f34405c.mo34211c5(), this.f34403a.mo34014l(), this.f34403a.mo33986g9());
                    case 92:
                        return new ProductSearchWithListAllResultsViewModel(this.f34403a.mo34078u8(), this.f34403a.mo33951b8(), this.f34405c.mo34253n4(), this.f34403a.mo33909U9());
                    case 93:
                        return new ProductSearchWithListRecommendationResultsViewModel(this.f34403a.mo34078u8(), this.f34403a.mo33793B7(), this.f34403a.mo33951b8());
                    case 94:
                        return new ProductSearchWithListResultViewModel(this.f34405c.mo34211c5());
                    case 95:
                        return new ProductSearchWithListViewModel(this.f34405c.mo34198Y3(), this.f34405c.mo34234i5(), this.f34405c.mo34214d5());
                    case 96:
                        return new QuantityBackDropViewModel(this.f34403a.mo34067s9(), this.f34403a.mo33866N8(), this.f34403a.mo33923X5(), this.f34403a.mo33977f7());
                    case 97:
                        return new QuantityBottomSheetViewModel(this.f34403a.mo34078u8());
                    case 98:
                        return new RatingViewModel(this.f34405c.mo34189V3(), this.f34403a.mo33941a5(), this.f34405c.mo34287w2());
                    case 99:
                        return new ScanBarcodeViewModel(this.f34403a.mo33930Y6(), this.f34403a.mo33936Z6());
                    default:
                        throw new AssertionError(this.f34406d);
                }
            }

            /* renamed from: b */
            public final T mo34304b() {
                switch (this.f34406d) {
                    case 100:
                        return new ScannerViewModel(this.f34405c.mo34216e3());
                    case 101:
                        return new SecretCodeViewModel(this.f34405c.mo34302z5(), this.f34405c.mo34265q4(), this.f34405c.mo34245l4(), this.f34403a.mo33826H4(), new C13744c(), this.f34405c.mo34221f4());
                    case 102:
                        return new ServiceSlotOmrViewModel(this.f34403a.mo33864N6(), this.f34403a.mo34067s9(), this.f34403a.mo33887R5(), this.f34403a.mo34013k9(), this.f34403a.mo34055q9(), this.f34403a.mo33816F6(), this.f34403a.mo34048p9(), this.f34403a.mo33795B9(), this.f34403a.mo33813E9(), this.f34403a.mo34063s5(), this.f34403a.mo33966da(), this.f34405c.mo34218e5(), this.f34405c.f34337c);
                    case 103:
                        return new ServiceSlotViewModel(this.f34403a.mo33864N6(), this.f34403a.mo34067s9(), this.f34403a.mo33887R5(), this.f34403a.mo33881Q5(), this.f34403a.mo33917W5(), this.f34403a.mo34063s5(), this.f34403a.mo33966da(), this.f34403a.mo34013k9(), this.f34403a.mo34055q9(), this.f34403a.mo33816F6(), this.f34403a.mo34048p9(), this.f34403a.mo33795B9(), this.f34403a.mo33813E9(), this.f34403a.mo33999i9(), this.f34403a.mo33909U9(), this.f34405c.mo34218e5(), this.f34405c.f34337c);
                    case 104:
                        return new ServiceStationsLandingPageViewModel(this.f34403a.mo33906U6(), this.f34403a.mo34014l(), this.f34403a.mo33951b8());
                    case 105:
                        return new ServiceStationsResultViewModel(this.f34405c.mo34160L4(), this.f34403a.mo34014l(), this.f34403a.mo33951b8(), this.f34403a.mo33941a5());
                    case 106:
                        return new ServiceStationsViewModel(this.f34403a.mo33941a5());
                    case 107:
                        return new ShoppingListViewModel(this.f34403a.mo33922X4(), this.f34403a.mo33955c5(), this.f34403a.mo33923X5(), this.f34403a.mo33872O8(), this.f34403a.mo33814F4());
                    case 108:
                        return new SignInViewModel(this.f34405c.mo34120B3(), this.f34403a.mo34098y4(), this.f34403a.mo33888R6(), this.f34403a.mo33942a6(), this.f34405c.mo34250m5(), new C13744c(), new hasValidFidCardUseCaseImpl());
                    case 109:
                        return new SplashViewModel((AppEnvironment) this.f34403a.f34199P.get(), this.f34403a.mo33951b8(), this.f34403a.mo33921W9(), this.f34403a.mo34014l(), this.f34403a.mo34098y4(), this.f34403a.mo33941a5(), this.f34403a.mo33982g5(), this.f34405c.mo34289w4(), this.f34403a.mo33886R4());
                    case 110:
                        return new StoreCatalogListViewModel(this.f34403a.mo34100y6(), (C13783a) this.f34403a.f34193M.get());
                    case 111:
                        return new StoreViewModel();
                    case 112:
                        return new SuccessCreateCardViewModel(this.f34403a.mo34098y4(), this.f34405c.mo34266q5());
                    case 113:
                        return new UpdateUserEmailViewModel(this.f34405c.mo34122B5(), this.f34405c.mo34118A5());
                    case 114:
                        return new UpdateUserInfoViewModel(this.f34403a.mo34098y4(), this.f34405c.mo34130D5(), this.f34405c.mo34126C5());
                    case 115:
                        return new UpdateUserPasswordViewModel(this.f34405c.mo34138F5(), this.f34405c.mo34134E5());
                    case 116:
                        return new ValidateOtpViewModel(this.f34405c.mo34146H5(), this.f34405c.mo34142G5());
                    case 117:
                        return new VerifyUserAddressViewModel(this.f34403a.mo34098y4(), this.f34405c.mo34288w3(), this.f34405c.mo34213d4(), this.f34405c.mo34270r5(), this.f34405c.mo34154J5(), (C13239a) this.f34403a.f34254t0.get());
                    default:
                        throw new AssertionError(this.f34406d);
                }
            }

            public T get() {
                int i = this.f34406d / 100;
                if (i == 0) {
                    return mo34303a();
                }
                if (i == 1) {
                    return mo34304b();
                }
                throw new AssertionError(this.f34406d);
            }
        }

        /* renamed from: A2 */
        public final CheckStoreEligibilityUseCase mo34115A2() {
            return new CheckStoreEligibilityUseCase(this.f34340d.mo34017l6(), this.f34340d.mo33940a(), this.f34340d.mo34067s9());
        }

        /* renamed from: A3 */
        public final GetLastOnlineOrderUseCase mo34116A3() {
            return new GetLastOnlineOrderUseCase((OrderOnlineRepository) this.f34340d.f34258v0.get());
        }

        /* renamed from: A4 */
        public final OrderFeedbackRepository mo34117A4() {
            return new OrderFeedbackRepository(this.f34340d.mo34014l(), this.f34340d.mo33940a(), mo34125C4(), new C36488g0(), new C36388a());
        }

        /* renamed from: A5 */
        public final C13305r mo34118A5() {
            return new C13305r((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: B2 */
        public final CheckoutCheckDeliveryEligibilityUseCase mo34119B2() {
            return new CheckoutCheckDeliveryEligibilityUseCase(mo34115A2(), this.f34340d.mo33813E9(), this.f34340d.mo34034n9(), this.f34340d.mo33795B9(), this.f34340d.mo33911V5());
        }

        /* renamed from: B3 */
        public final GetLoginUseCase mo34120B3() {
            return new GetLoginUseCase(this.f34340d.mo34014l(), (C38328d) this.f34340d.f34256u0.get());
        }

        /* renamed from: B4 */
        public final OrderFeedbackUseCase mo34121B4() {
            return new OrderFeedbackUseCase(mo34117A4(), this.f34340d.mo34067s9());
        }

        /* renamed from: B5 */
        public final UpdateUserEmailUseCase mo34122B5() {
            return new UpdateUserEmailUseCase(this.f34340d.mo34014l(), this.f34340d.mo33940a());
        }

        /* renamed from: C2 */
        public final C26196a mo34123C2() {
            return new C26196a(C10242e.m38491c(this.f34340d.f34219c), (C13783a) this.f34340d.f34193M.get(), (C13814a) this.f34340d.f34230h0.get(), new C13744c());
        }

        /* renamed from: C3 */
        public final GetLoyaltyBalanceUseCase mo34124C3() {
            return new GetLoyaltyBalanceUseCase(mo34277t4());
        }

        /* renamed from: C4 */
        public final OrderGetCustomerStatusUseCase mo34125C4() {
            return new OrderGetCustomerStatusUseCase(mo34174Q3(), new C25222e());
        }

        /* renamed from: C5 */
        public final C13308u mo34126C5() {
            return new C13308u((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: D2 */
        public final C29005h mo34127D2() {
            return new C29005h((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: D3 */
        public final GetLoyaltyBonusListUseCase mo34128D3() {
            return new GetLoyaltyBonusListUseCase(mo34170P2());
        }

        /* renamed from: D4 */
        public final OrderOfflineDownloadRepository mo34129D4() {
            return new OrderOfflineDownloadRepository(this.f34340d.mo34084v8(), this.f34340d.mo34108z8(), C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: D5 */
        public final UpdateUserInfoUseCase mo34130D5() {
            return new UpdateUserInfoUseCase(this.f34340d.mo33940a());
        }

        /* renamed from: E2 */
        public final C29008k mo34131E2() {
            return new C29008k((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: E3 */
        public final GetLoyaltyChannelsUseCase mo34132E3() {
            return new GetLoyaltyChannelsUseCase(mo34277t4());
        }

        /* renamed from: E4 */
        public final OrderOfflineRepository mo34133E4() {
            return new OrderOfflineRepository(mo34215e2(), new C36523s(), this.f34340d.mo34084v8(), this.f34340d.mo34108z8());
        }

        /* renamed from: E5 */
        public final C13311x mo34134E5() {
            return new C13311x((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: F2 */
        public final C29011n mo34135F2() {
            return new C29011n((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: F3 */
        public final GetLoyaltyClubsUseCase mo34136F3() {
            return new GetLoyaltyClubsUseCase(mo34277t4());
        }

        /* renamed from: F4 */
        public final C24782a mo34137F4() {
            return new C24782a(new C24787e(), new C24784c());
        }

        /* renamed from: F5 */
        public final UpdateUserPasswordUseCase mo34138F5() {
            return new UpdateUserPasswordUseCase(this.f34340d.mo34014l(), this.f34340d.mo33940a());
        }

        /* renamed from: G2 */
        public final C26092a mo34139G2() {
            return new C26092a((C13783a) this.f34340d.f34193M.get(), new C13744c());
        }

        /* renamed from: G3 */
        public final GetLuckyCartGameBannerUseCase mo34140G3() {
            return new GetLuckyCartGameBannerUseCase(C10242e.m38491c(this.f34340d.f34219c), this.f34340d.mo33909U9(), this.f34340d.mo33978f8(), this.f34340d.mo34014l(), (AppEnvironment) this.f34340d.f34199P.get());
        }

        /* renamed from: G4 */
        public final C24790g mo34141G4() {
            return new C24790g(C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: G5 */
        public final ValidateOtpAnalyticsDelegate mo34142G5() {
            return new ValidateOtpAnalyticsDelegate((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: H2 */
        public final C26115a mo34143H2() {
            return new C26115a((C13783a) this.f34340d.f34193M.get(), new C13744c());
        }

        /* renamed from: H3 */
        public final GetLuckyCartTicketUseCase mo34144H3() {
            return new GetLuckyCartTicketUseCase(this.f34340d.mo33985g8(), this.f34340d.mo33909U9(), (C38328d) this.f34340d.f34256u0.get());
        }

        /* renamed from: H4 */
        public final C36459a1 mo34145H4() {
            return new C36459a1(new C36531u0(), new C36540w0(), new C36546y0(), new C36465b0());
        }

        /* renamed from: H5 */
        public final ValidateOtpUseCase mo34146H5() {
            return new ValidateOtpUseCase(mo34277t4());
        }

        /* renamed from: I2 */
        public final C29014q mo34147I2() {
            return new C29014q((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: I3 */
        public final GetMemberCardUseCase mo34148I3() {
            return new GetMemberCardUseCase((MemberCardRepository) this.f34340d.f34174C0.get());
        }

        /* renamed from: I4 */
        public final PaymentDataSource mo34149I4() {
            return new PaymentDataSource(this.f34340d.mo33800C8());
        }

        /* renamed from: I5 */
        public final ValidatePaymentUseCase mo34150I5() {
            return new ValidatePaymentUseCase((PaymentGateway) this.f34340d.f34184H0.get(), mo34145H4());
        }

        /* renamed from: J2 */
        public final C29016s mo34151J2() {
            return new C29016s((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: J3 */
        public final GetMemoListUseCase mo34152J3() {
            return new GetMemoListUseCase(this.f34340d.mo34014l(), this.f34340d.mo34012k8());
        }

        /* renamed from: J4 */
        public final com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository mo34153J4() {
            return new com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository(mo34149I4());
        }

        /* renamed from: J5 */
        public final C13286a0 mo34154J5() {
            return new C13286a0((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: K2 */
        public final ClearConsentUserCase mo34155K2() {
            return new ClearConsentUserCase(mo34176R2());
        }

        /* renamed from: K3 */
        public final GetMinimumOrderAmountUseCase mo34156K3() {
            return new GetMinimumOrderAmountUseCase((StoreFacilityRepository) this.f34340d.f34218b0.get());
        }

        /* renamed from: K4 */
        public final PlpFlowProvider mo34157K4() {
            return new PlpFlowProvider(this.f34340d.mo34067s9(), this.f34340d.mo33860M8(), mo34181S4());
        }

        /* renamed from: L2 */
        public final ClearLoyaltyUseCase mo34158L2() {
            return new ClearLoyaltyUseCase(this.f34340d.mo33951b8());
        }

        /* renamed from: L3 */
        public final GetOfferDetailsInBasketUseCase mo34159L3() {
            return new GetOfferDetailsInBasketUseCase(this.f34340d.mo34022m4());
        }

        /* renamed from: L4 */
        public final PostTicketCardUseCase mo34160L4() {
            return new PostTicketCardUseCase(mo34240k3());
        }

        /* renamed from: M2 */
        public final ClearMemoListUseCase mo34161M2() {
            return new ClearMemoListUseCase(this.f34340d.mo34012k8());
        }

        /* renamed from: M3 */
        public final GetOnlineOrderByIdUseCase mo34162M3() {
            return new GetOnlineOrderByIdUseCase((OrderOnlineRepository) this.f34340d.f34258v0.get());
        }

        /* renamed from: M4 */
        public final PrepareAdditionalOrderBasketUseCase mo34163M4() {
            return new PrepareAdditionalOrderBasketUseCase(this.f34340d.mo34093x5(), this.f34340d.mo33905U5(), this.f34340d.mo33887R5());
        }

        /* renamed from: N2 */
        public final ClearSearchHistoryUseCase mo34164N2() {
            return new ClearSearchHistoryUseCase((SearchHistoryPreferencesRepository) this.f34340d.f34264y0.get());
        }

        /* renamed from: N3 */
        public final GetOrderOfflineDetailUseCase mo34165N3() {
            return new GetOrderOfflineDetailUseCase(mo34133E4());
        }

        /* renamed from: N4 */
        public final PrintCouponsUseCase mo34166N4() {
            return new PrintCouponsUseCase(this.f34340d.mo34098y4(), mo34185U2());
        }

        /* renamed from: O2 */
        public final C40020a mo34167O2() {
            return new C40020a(this.f34340d.mo34009k5());
        }

        /* renamed from: O3 */
        public final GetOrderOfflineListUseCase mo34168O3() {
            return new GetOrderOfflineListUseCase(this.f34340d.mo34034n9(), mo34133E4(), this.f34340d.mo33909U9(), (C38328d) this.f34340d.f34256u0.get());
        }

        /* renamed from: O4 */
        public final C27169a mo34169O4() {
            return new C27169a(mo34179S2(), this.f34340d.mo34083v7(), (C13814a) this.f34340d.f34230h0.get(), (AirshipSettings) this.f34340d.f34206S0.get());
        }

        /* renamed from: P2 */
        public final CmsRepository mo34170P2() {
            return new CmsRepository(this.f34340d.mo33882Q6(), mo34167O2(), C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: P3 */
        public final GetOrderOnlineDetailUseCase mo34171P3() {
            return new GetOrderOnlineDetailUseCase(this.f34340d.mo34034n9(), (OrderOnlineRepository) this.f34340d.f34258v0.get());
        }

        /* renamed from: P4 */
        public final PrivacyUseCase mo34172P4() {
            return new PrivacyUseCase((C38198g) this.f34340d.f34204R0.get());
        }

        /* renamed from: Q2 */
        public final ConfirmPaymentUseCase mo34173Q2() {
            return new ConfirmPaymentUseCase((PaymentGateway) this.f34340d.f34184H0.get());
        }

        /* renamed from: Q3 */
        public final GetOrderOnlineListUseCase mo34174Q3() {
            return new GetOrderOnlineListUseCase((OrderOnlineRepository) this.f34340d.f34258v0.get(), this.f34340d.mo33909U9(), (C38328d) this.f34340d.f34256u0.get());
        }

        /* renamed from: Q4 */
        public final C27637g mo34175Q4() {
            return new C27637g((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: R2 */
        public final ConsentPreferencesStorage mo34176R2() {
            return new ConsentPreferencesStorage(C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: R3 */
        public final GetOtpUseCase mo34177R3() {
            return new GetOtpUseCase(mo34277t4());
        }

        /* renamed from: R4 */
        public final C27565j mo34178R4() {
            return new C27565j((FacetRepository) this.f34340d.f34172B0.get());
        }

        /* renamed from: S2 */
        public final C22752a mo34179S2() {
            return new C22752a(C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: S3 */
        public final GetPendingServiceSelectionUseCase mo34180S3() {
            return new GetPendingServiceSelectionUseCase((ServiceSelectionRepository) this.f34340d.f34191L.get());
        }

        /* renamed from: S4 */
        public final C27567l mo34181S4() {
            return new C27567l((FacetRepository) this.f34340d.f34172B0.get());
        }

        /* renamed from: T2 */
        public final C36560c mo34182T2() {
            return new C36560c(this.f34340d.mo34009k5());
        }

        /* renamed from: T3 */
        public final GetProductSearchSuggestionsUseCase mo34183T3() {
            return new GetProductSearchSuggestionsUseCase(this.f34340d.mo34007ja(), this.f34340d.mo34067s9());
        }

        /* renamed from: T4 */
        public final C29021a mo34184T4() {
            return new C29021a((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: U2 */
        public final CouponsRepository mo34185U2() {
            return new CouponsRepository(this.f34340d.mo33924X6(), mo34182T2());
        }

        /* renamed from: U3 */
        public final GetPspTokenUseCase mo34186U3() {
            return new GetPspTokenUseCase(mo34153J4(), this.f34340d.mo34098y4(), this.f34340d.mo33796C4());
        }

        /* renamed from: U4 */
        public final ProductUpdateFacetUseCase mo34187U4() {
            return new ProductUpdateFacetUseCase(this.f34340d.mo34067s9(), this.f34340d.mo33926X8(), (FacetRepository) this.f34340d.f34172B0.get(), mo34181S4(), (C38328d) this.f34340d.f34256u0.get());
        }

        /* renamed from: V2 */
        public final CreateCardAnalyticsDelegate mo34188V2() {
            return new CreateCardAnalyticsDelegate((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: V3 */
        public final GetRatingUseCase mo34189V3() {
            return new GetRatingUseCase(mo34196X4());
        }

        /* renamed from: V4 */
        public final ProductUpdateFilterUseCase mo34190V4() {
            return new ProductUpdateFilterUseCase(mo34187U4());
        }

        /* renamed from: W2 */
        public final CreateLoyaltyCardFidUseCase mo34191W2() {
            return new CreateLoyaltyCardFidUseCase(mo34277t4());
        }

        /* renamed from: W3 */
        public final GetScanTutorialHasBeenShownUseCase mo34192W3() {
            return new GetScanTutorialHasBeenShownUseCase((C28267a) this.f34340d.f34176D0.get());
        }

        /* renamed from: W4 */
        public final ProductUpdateSortUseCase mo34193W4() {
            return new ProductUpdateSortUseCase(mo34187U4());
        }

        /* renamed from: X2 */
        public final C13198c mo34194X2() {
            return new C13198c(this.f34340d.mo34009k5());
        }

        /* renamed from: X3 */
        public final GetSearchHistoryUseCase mo34195X3() {
            return new GetSearchHistoryUseCase((SearchHistoryPreferencesRepository) this.f34340d.f34264y0.get());
        }

        /* renamed from: X4 */
        public final RatingRepository mo34196X4() {
            return new RatingRepository((C32121c) this.f34340d.f34234j0.get());
        }

        /* renamed from: Y2 */
        public final DQEAddressesRepository mo34197Y2() {
            return new DQEAddressesRepository(this.f34340d.mo33991h7(), mo34194X2());
        }

        /* renamed from: Y3 */
        public final GetSearchWithListHistoryUseCase mo34198Y3() {
            return new GetSearchWithListHistoryUseCase((SearchWithListHistoryPreferencesRepository) this.f34340d.f34210U0.get());
        }

        /* renamed from: Y4 */
        public final RecommendedProductUseCase mo34199Y4() {
            return new RecommendedProductUseCase(this.f34340d.mo33842J8(), (C38328d) this.f34340d.f34256u0.get());
        }

        /* renamed from: Z2 */
        public final DeleteMemoListUseCase mo34200Z2() {
            return new DeleteMemoListUseCase(this.f34340d.mo34012k8());
        }

        /* renamed from: Z3 */
        public final GetStickersContentUseCase mo34201Z3() {
            return new GetStickersContentUseCase(this.f34340d.mo33909U9(), mo34254n5(), this.f34340d.mo34014l());
        }

        /* renamed from: Z4 */
        public final C22799a mo34202Z4() {
            return new C22799a((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: a */
        public Map<String, Provider<C19476v0>> mo21649a() {
            return C10328l.m38530b(118).mo21727c("com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel", this.f34349g).mo21727c("com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel", this.f34352h).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel", this.f34355i).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountDataViewModel", this.f34358j).mo21727c("com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel", this.f34361k).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.list.home.AccountListHomeViewModel", this.f34364l).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.list.order.AccountListOrderViewModel", this.f34367m).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.AccountListShoppingViewModel", this.f34370n).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel", this.f34373o).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel", this.f34376p).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderDepartmentViewModel", this.f34379q).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel", this.f34382r).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderSearchViewModel", this.f34385s).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderViewModel", this.f34388t).mo21727c("com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel", this.f34391u).mo21727c("com.carrefour.fid.android.presentation.viewmodels.environment.AppEnvironmentSelectionViewModel", this.f34393v).mo21727c("com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel", this.f34395w).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel", this.f34397x).mo21727c("com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel", this.f34399y).mo21727c("com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel", this.f34401z).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.BaseAccountViewModel", this.f34281A).mo21727c("com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel", this.f34283B).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel", this.f34285C).mo21727c("com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderDepartmentViewModel", this.f34287D).mo21727c("com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderMyListViewModel", this.f34289E).mo21727c("com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderRecommendedProductsViewModel", this.f34291F).mo21727c("com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel", this.f34293G).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel", this.f34295H).mo21727c("com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel", this.f34297I).mo21727c("com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel", this.f34299J).mo21727c("com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel", this.f34301K).mo21727c("com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel", this.f34303L).mo21727c("com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel", this.f34305M).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel", this.f34307N).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel", this.f34309O).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutCgvViewModel", this.f34311P).mo21727c("com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel", this.f34313Q).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel", this.f34315R).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentErrorViewModel", this.f34317S).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel", this.f34319T).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel", this.f34321U).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.CheckoutStep2ViewModel", this.f34323V).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel", this.f34325W).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep4ViewModel", this.f34327X).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel", this.f34329Y).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel", this.f34331Z).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoCgvViewModel", this.f34333a0).mo21727c("com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel", this.f34335b0).mo21727c("com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel", this.f34338c0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.coupons.filter.CouponsFilterViewModel", this.f34341d0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel", this.f34344e0).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.create.CreateOrAttachCardViewModel", this.f34347f0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.criteo.CriteoBannerViewModel", this.f34350g0).mo21727c("com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel", this.f34353h0).mo21727c("com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel", this.f34356i0).mo21727c("com.carrefour.fid.android.categories.presentation.viewmodel.department.DepartmentsViewModel", this.f34359j0).mo21727c("com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel", this.f34362k0).mo21727c("com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveSummaryViewModel", this.f34365l0).mo21727c("com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel", this.f34368m0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.feesback.FeedbackViewModel", this.f34371n0).mo21727c("com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel", this.f34374o0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.home.HomeOnlineShopDetailsViewModel", this.f34377p0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel", this.f34380q0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel", this.f34383r0).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel", this.f34386s0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel", this.f34389t0).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel", this.f34392u0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel", this.f34394v0).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel", this.f34396w0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel", this.f34398x0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel", this.f34400y0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.product.mixing.MixingProductsBottomSheetViewModel", this.f34402z0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel", this.f34282A0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel", this.f34284B0).mo21727c("com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel", this.f34286C0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel", this.f34288D0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel", this.f34290E0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel", this.f34292F0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel", this.f34294G0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel", this.f34296H0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.order.OrdersViewModel", this.f34298I0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel", this.f34300J0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel", this.f34302K0).mo21727c("com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel", this.f34304L0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel", this.f34306M0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel", this.f34308N0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.PickupPointsMapViewModel", this.f34310O0).mo21727c("com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel", this.f34312P0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel", this.f34314Q0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel", this.f34316R0).mo21727c("com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel", this.f34318S0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchViewModel", this.f34320T0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListAllResultsViewModel", this.f34322U0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListRecommendationResultsViewModel", this.f34324V0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel", this.f34326W0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel", this.f34328X0).mo21727c("com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel", this.f34330Y0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel", this.f34332Z0).mo21727c("com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel", this.f34334a1).mo21727c("com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel", this.f34336b1).mo21727c("com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel", this.f34339c1).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel", this.f34342d1).mo21727c("com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel", this.f34345e1).mo21727c("com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel", this.f34348f1).mo21727c("com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsLandingPageViewModel", this.f34351g1).mo21727c("com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel", this.f34354h1).mo21727c("com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsViewModel", this.f34357i1).mo21727c("com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel", this.f34360j1).mo21727c("com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel", this.f34363k1).mo21727c("com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel", this.f34366l1).mo21727c("com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel", this.f34369m1).mo21727c("com.carrefour.fid.android.presentation.viewmodels.store.StoreViewModel", this.f34372n1).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel", this.f34375o1).mo21727c("com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel", this.f34378p1).mo21727c("com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel", this.f34381q1).mo21727c("com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel", this.f34384r1).mo21727c("com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel", this.f34387s1).mo21727c("com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel", this.f34390t1).mo21726a();
        }

        /* renamed from: a3 */
        public final DeliveryServiceSelectionAnalyticsReporter mo34203a3() {
            return new DeliveryServiceSelectionAnalyticsReporter((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: a4 */
        public final GetStorePetrolInfoUseCase mo34204a4() {
            return new GetStorePetrolInfoUseCase(mo34262p5());
        }

        /* renamed from: a5 */
        public final SaveConsentCurrentDateUseCase mo34205a5() {
            return new SaveConsentCurrentDateUseCase(mo34176R2());
        }

        /* renamed from: b3 */
        public final DownloadOrderBillAndBankReceiptOfflineUseCase mo34206b3() {
            return new DownloadOrderBillAndBankReceiptOfflineUseCase(mo34129D4(), C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: b4 */
        public final GetUserChannelsUseCase mo34207b4() {
            return new GetUserChannelsUseCase(mo34277t4());
        }

        /* renamed from: b5 */
        public final SaveHasPrimeFidUseCase mo34208b5() {
            return new SaveHasPrimeFidUseCase(this.f34340d.mo33951b8());
        }

        /* renamed from: c3 */
        public final DriveMapAnalyticsReporter mo34209c3() {
            return new DriveMapAnalyticsReporter((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: c4 */
        public final GetUserTransactionsUseCase mo34210c4() {
            return new GetUserTransactionsUseCase(mo34277t4());
        }

        /* renamed from: c5 */
        public final SearchWithListRemoteConfigUseCase mo34211c5() {
            return new SearchWithListRemoteConfigUseCase(this.f34340d.mo33909U9());
        }

        /* renamed from: d3 */
        public final DriveSummaryAnalyticsReporter mo34212d3() {
            return new DriveSummaryAnalyticsReporter((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: d4 */
        public final GetVerificationDQEAddressUseCase mo34213d4() {
            return new GetVerificationDQEAddressUseCase(mo34197Y2());
        }

        /* renamed from: d5 */
        public final SearchWithListUseCase mo34214d5() {
            return new SearchWithListUseCase((RecommendedNeedsRepository) this.f34340d.f34190K0.get(), this.f34340d.mo34073t9(), this.f34340d.mo34014l(), this.f34340d.mo33951b8(), this.f34340d.mo33940a());
        }

        /* renamed from: e2 */
        public final C36507m mo34215e2() {
            return new C36507m(new C36518q(), new C36512o());
        }

        /* renamed from: e3 */
        public final ExtractScannedDataUseCase mo34216e3() {
            return new ExtractScannedDataUseCase(C28265c.m118188a(), C28677d.m118657c(this.f34340d.f34225f));
        }

        /* renamed from: e4 */
        public final HomeAnalyticsViewModel mo34217e4() {
            return new HomeAnalyticsViewModel(this.f34340d.mo34014l(), new C13744c(), (C13814a) this.f34340d.f34230h0.get(), (C13783a) this.f34340d.f34193M.get(), (AppEnvironment) this.f34340d.f34199P.get(), C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: e5 */
        public final C39866a mo34218e5() {
            return new C39866a((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: f2 */
        public final AcceptLoyaltyCguAnalyticsDelegate mo34219f2() {
            return new AcceptLoyaltyCguAnalyticsDelegate((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: f3 */
        public final FetchCouponsUseCase mo34220f3() {
            return new FetchCouponsUseCase(mo34185U2());
        }

        /* renamed from: f4 */
        public final InitSecretCodeAnalyticsDelegate mo34221f4() {
            return new InitSecretCodeAnalyticsDelegate((C13783a) this.f34340d.f34193M.get(), new C13744c());
        }

        /* renamed from: f5 */
        public final C36579u mo34222f5() {
            return new C36579u(this.f34340d.mo34009k5());
        }

        /* renamed from: g2 */
        public final C13287b mo34223g2() {
            return new C13287b((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: g3 */
        public final FetchDriveUseCase mo34224g3() {
            return new FetchDriveUseCase((StoreFacilityRepository) this.f34340d.f34218b0.get());
        }

        /* renamed from: g4 */
        public final void mo34225g4(C19456p0 p0Var, C10182h hVar) {
            this.f34349g = new C14001a(this.f34340d, this.f34343e, this.f34346f, 0);
            this.f34352h = new C14001a(this.f34340d, this.f34343e, this.f34346f, 1);
            this.f34355i = new C14001a(this.f34340d, this.f34343e, this.f34346f, 2);
            this.f34358j = new C14001a(this.f34340d, this.f34343e, this.f34346f, 3);
            this.f34361k = new C14001a(this.f34340d, this.f34343e, this.f34346f, 4);
            this.f34364l = new C14001a(this.f34340d, this.f34343e, this.f34346f, 5);
            this.f34367m = new C14001a(this.f34340d, this.f34343e, this.f34346f, 6);
            this.f34370n = new C14001a(this.f34340d, this.f34343e, this.f34346f, 7);
            this.f34373o = new C14001a(this.f34340d, this.f34343e, this.f34346f, 8);
            this.f34376p = new C14001a(this.f34340d, this.f34343e, this.f34346f, 9);
            this.f34379q = new C14001a(this.f34340d, this.f34343e, this.f34346f, 10);
            this.f34382r = new C14001a(this.f34340d, this.f34343e, this.f34346f, 11);
            this.f34385s = new C14001a(this.f34340d, this.f34343e, this.f34346f, 12);
            this.f34388t = new C14001a(this.f34340d, this.f34343e, this.f34346f, 13);
            this.f34391u = new C14001a(this.f34340d, this.f34343e, this.f34346f, 14);
            this.f34393v = new C14001a(this.f34340d, this.f34343e, this.f34346f, 15);
            this.f34395w = new C14001a(this.f34340d, this.f34343e, this.f34346f, 16);
            this.f34397x = new C14001a(this.f34340d, this.f34343e, this.f34346f, 17);
            this.f34399y = new C14001a(this.f34340d, this.f34343e, this.f34346f, 18);
            this.f34401z = new C14001a(this.f34340d, this.f34343e, this.f34346f, 19);
            this.f34281A = new C14001a(this.f34340d, this.f34343e, this.f34346f, 20);
            this.f34283B = new C14001a(this.f34340d, this.f34343e, this.f34346f, 21);
            this.f34285C = new C14001a(this.f34340d, this.f34343e, this.f34346f, 22);
            this.f34287D = new C14001a(this.f34340d, this.f34343e, this.f34346f, 23);
            this.f34289E = new C14001a(this.f34340d, this.f34343e, this.f34346f, 24);
            this.f34291F = new C14001a(this.f34340d, this.f34343e, this.f34346f, 25);
            this.f34293G = new C14001a(this.f34340d, this.f34343e, this.f34346f, 26);
            this.f34295H = new C14001a(this.f34340d, this.f34343e, this.f34346f, 27);
            this.f34297I = new C14001a(this.f34340d, this.f34343e, this.f34346f, 28);
            this.f34299J = new C14001a(this.f34340d, this.f34343e, this.f34346f, 29);
            this.f34301K = new C14001a(this.f34340d, this.f34343e, this.f34346f, 30);
            this.f34303L = new C14001a(this.f34340d, this.f34343e, this.f34346f, 31);
            this.f34305M = new C14001a(this.f34340d, this.f34343e, this.f34346f, 32);
            this.f34307N = new C14001a(this.f34340d, this.f34343e, this.f34346f, 33);
            this.f34309O = new C14001a(this.f34340d, this.f34343e, this.f34346f, 34);
            this.f34311P = new C14001a(this.f34340d, this.f34343e, this.f34346f, 35);
            this.f34313Q = new C14001a(this.f34340d, this.f34343e, this.f34346f, 36);
            this.f34315R = new C14001a(this.f34340d, this.f34343e, this.f34346f, 37);
            this.f34317S = new C14001a(this.f34340d, this.f34343e, this.f34346f, 38);
            this.f34319T = new C14001a(this.f34340d, this.f34343e, this.f34346f, 39);
            this.f34321U = new C14001a(this.f34340d, this.f34343e, this.f34346f, 40);
            this.f34323V = new C14001a(this.f34340d, this.f34343e, this.f34346f, 41);
            this.f34325W = new C14001a(this.f34340d, this.f34343e, this.f34346f, 42);
            this.f34327X = new C14001a(this.f34340d, this.f34343e, this.f34346f, 43);
            this.f34329Y = new C14001a(this.f34340d, this.f34343e, this.f34346f, 44);
            this.f34331Z = new C14001a(this.f34340d, this.f34343e, this.f34346f, 45);
            this.f34333a0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 46);
            this.f34335b0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 47);
            this.f34338c0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 48);
            this.f34341d0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 49);
            this.f34344e0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 50);
            this.f34347f0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 51);
            this.f34350g0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 52);
            this.f34353h0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 53);
            this.f34356i0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 54);
            this.f34359j0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 55);
            this.f34362k0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 56);
            this.f34365l0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 57);
            this.f34368m0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 58);
            this.f34371n0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 59);
            this.f34374o0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 60);
            this.f34377p0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 61);
            this.f34380q0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 62);
            this.f34383r0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 63);
            this.f34386s0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 64);
            this.f34389t0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 65);
            this.f34392u0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 66);
            this.f34394v0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 67);
            this.f34396w0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 68);
            this.f34398x0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 69);
            this.f34400y0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 70);
            this.f34402z0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 71);
            this.f34282A0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 72);
            this.f34284B0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 73);
            this.f34286C0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 74);
            this.f34288D0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 75);
            this.f34290E0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 76);
            this.f34292F0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 77);
            this.f34294G0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 78);
            this.f34296H0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 79);
            this.f34298I0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 80);
            this.f34300J0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 81);
            this.f34302K0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 82);
            this.f34304L0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 83);
            this.f34306M0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 84);
            this.f34308N0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 85);
            this.f34310O0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 86);
            this.f34312P0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 87);
            this.f34314Q0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 88);
            this.f34316R0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 89);
            this.f34318S0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 90);
            this.f34320T0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 91);
            this.f34322U0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 92);
            this.f34324V0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 93);
            this.f34326W0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 94);
            this.f34328X0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 95);
            this.f34330Y0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 96);
            this.f34332Z0 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 97);
            this.f34334a1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 98);
            this.f34336b1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 99);
        }

        /* renamed from: g5 */
        public final SetFirstVisitPrimesFidelityUseCase mo34226g5() {
            return new SetFirstVisitPrimesFidelityUseCase(this.f34340d.mo33951b8());
        }

        /* renamed from: h2 */
        public final C25786e mo34227h2() {
            return new C25786e(new C13744c(), (C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: h3 */
        public final FidelityHasCardFidUseCase mo34228h3() {
            return new FidelityHasCardFidUseCase(this.f34340d.mo33951b8());
        }

        /* renamed from: h4 */
        public final void mo34229h4(C19456p0 p0Var, C10182h hVar) {
            this.f34339c1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 100);
            this.f34342d1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 101);
            this.f34345e1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 102);
            this.f34348f1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 103);
            this.f34351g1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 104);
            this.f34354h1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 105);
            this.f34357i1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 106);
            this.f34360j1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 107);
            this.f34363k1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 108);
            this.f34366l1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 109);
            this.f34369m1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 110);
            this.f34372n1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 111);
            this.f34375o1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 112);
            this.f34378p1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 113);
            this.f34381q1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 114);
            this.f34384r1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 115);
            this.f34387s1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 116);
            this.f34390t1 = new C14001a(this.f34340d, this.f34343e, this.f34346f, 117);
        }

        /* renamed from: h5 */
        public final SetPendingServiceSelectionUseCase mo34230h5() {
            return new SetPendingServiceSelectionUseCase((ServiceSelectionRepository) this.f34340d.f34191L.get());
        }

        /* renamed from: i2 */
        public final C13291e mo34231i2() {
            return new C13291e((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: i3 */
        public final C13298k mo34232i3() {
            return new C13298k((C13783a) this.f34340d.f34193M.get());
        }

        @C32488a
        /* renamed from: i4 */
        public final CheckoutConfirmationViewModel mo34233i4(CheckoutConfirmationViewModel checkoutConfirmationViewModel) {
            C26204f.m112031b(checkoutConfirmationViewModel, mo34123C2());
            return checkoutConfirmationViewModel;
        }

        /* renamed from: i5 */
        public final SetSearchWithListHistoryUseCase mo34234i5() {
            return new SetSearchWithListHistoryUseCase((SearchWithListHistoryPreferencesRepository) this.f34340d.f34210U0.get());
        }

        /* renamed from: j2 */
        public final ActivateLoyaltyCardFidUseCase mo34235j2() {
            return new ActivateLoyaltyCardFidUseCase(mo34277t4());
        }

        /* renamed from: j3 */
        public final ForgotPasswordUseCase mo34236j3() {
            return new ForgotPasswordUseCase(this.f34340d.mo33940a());
        }

        /* renamed from: j4 */
        public final IsEligibleToOnSitePaymentUseCase mo34237j4() {
            return new IsEligibleToOnSitePaymentUseCase(this.f34340d.mo33909U9());
        }

        /* renamed from: j5 */
        public final ShiftSlotRemoteConfigUseCase mo34238j5() {
            return new ShiftSlotRemoteConfigUseCase(this.f34340d.mo33909U9());
        }

        /* renamed from: k2 */
        public final AddMemoListUseCase mo34239k2() {
            return new AddMemoListUseCase(this.f34340d.mo34012k8());
        }

        /* renamed from: k3 */
        public final GazStationRepository mo34240k3() {
            return new GazStationRepository(mo34222f5(), this.f34340d.mo33801C9());
        }

        /* renamed from: k4 */
        public final IsFirstVisitPrimesFidelityUseCase mo34241k4() {
            return new IsFirstVisitPrimesFidelityUseCase(this.f34340d.mo33951b8());
        }

        /* renamed from: k5 */
        public final ShouldDisplayUserConsentsBackdropUseCase mo34242k5() {
            return new ShouldDisplayUserConsentsBackdropUseCase(mo34176R2());
        }

        /* renamed from: l2 */
        public final AddSearchHistoryUseCase mo34243l2() {
            return new AddSearchHistoryUseCase((SearchHistoryPreferencesRepository) this.f34340d.f34264y0.get());
        }

        /* renamed from: l3 */
        public final GetAppMessageUseCase mo34244l3() {
            return new GetAppMessageUseCase(this.f34340d.mo33928Y4());
        }

        /* renamed from: l4 */
        public final LinkLoyaltyCardUseCase mo34245l4() {
            return new LinkLoyaltyCardUseCase((LinkLoyaltyCardRepository) this.f34340d.f34212V0.get());
        }

        /* renamed from: l5 */
        public final ShowPreparationFeesUseCase mo34246l5() {
            return new ShowPreparationFeesUseCase(this.f34340d.mo34067s9());
        }

        /* renamed from: m2 */
        public final C28997b mo34247m2() {
            return new C28997b((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: m3 */
        public final GetArsenalBannersUseCase mo34248m3() {
            return new GetArsenalBannersUseCase(this.f34340d.mo33909U9(), mo34259p2(), this.f34340d.mo34014l());
        }

        /* renamed from: m4 */
        public final LoadBasketBuilderUseCase mo34249m4() {
            return new LoadBasketBuilderUseCase(this.f34340d.mo33922X4(), this.f34340d.mo33910V4(), this.f34340d.mo33884Q8(), this.f34340d.mo34022m4(), this.f34340d.mo34014l(), this.f34340d.mo33881Q5());
        }

        /* renamed from: m5 */
        public final SignInAnalyticsInterfaceDelegate mo34250m5() {
            return new SignInAnalyticsInterfaceDelegate(C10242e.m38491c(this.f34340d.f34219c), new C13744c(), (C13814a) this.f34340d.f34230h0.get(), (C13783a) this.f34340d.f34193M.get(), this.f34340d.mo34014l(), this.f34340d.mo33940a());
        }

        /* renamed from: n2 */
        public final C29001e mo34251n2() {
            return new C29001e((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: n3 */
        public final GetArsenalJOBannerUseCase mo34252n3() {
            return new GetArsenalJOBannerUseCase(this.f34340d.mo33909U9(), mo34259p2(), this.f34340d.mo34014l());
        }

        /* renamed from: n4 */
        public final LoadSearchWithListAllResultsUseCase mo34253n4() {
            return new LoadSearchWithListAllResultsUseCase(this.f34340d.mo34022m4(), this.f34340d.mo34014l(), this.f34340d.mo33922X4(), this.f34340d.mo33917W5());
        }

        /* renamed from: n5 */
        public final StickersRepository mo34254n5() {
            return new StickersRepository(C10242e.m38491c(this.f34340d.f34219c), this.f34340d.mo33885Q9());
        }

        /* renamed from: o2 */
        public final ApplyPendingServiceSelectionUseCase mo34255o2() {
            return new ApplyPendingServiceSelectionUseCase((ServiceSelectionRepository) this.f34340d.f34191L.get());
        }

        /* renamed from: o3 */
        public final GetArsenalTopBannersUseCase mo34256o3() {
            return new GetArsenalTopBannersUseCase(this.f34340d.mo33909U9(), mo34259p2());
        }

        /* renamed from: o4 */
        public final LoyaltyAmountHistoryAnalyticsDelegate mo34257o4() {
            return new LoyaltyAmountHistoryAnalyticsDelegate((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: o5 */
        public final StorePetrolCache mo34258o5() {
            return new StorePetrolCache(C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: p2 */
        public final ArsenalGameRepository mo34259p2() {
            return new ArsenalGameRepository(C10242e.m38491c(this.f34340d.f34219c), this.f34340d.mo33989h5(), this.f34340d.mo33995i5());
        }

        /* renamed from: p3 */
        public final GetAvailableCouponsUseCase mo34260p3() {
            return new GetAvailableCouponsUseCase(this.f34340d.mo34098y4(), mo34185U2(), this.f34340d.mo34034n9(), this.f34340d.mo34061r9(), (C38328d) this.f34340d.f34256u0.get());
        }

        /* renamed from: p4 */
        public final LoyaltyAuthRepository mo34261p4() {
            return new LoyaltyAuthRepository(this.f34340d.mo33823G7(), this.f34340d.mo33944a8());
        }

        /* renamed from: p5 */
        public final StorePetrolRepository mo34262p5() {
            return new StorePetrolRepository(mo34258o5(), this.f34340d.mo33882Q6(), mo34167O2());
        }

        /* renamed from: q2 */
        public final AttachCardAnalyticsDelegate mo34263q2() {
            return new AttachCardAnalyticsDelegate((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: q3 */
        public final GetCheckoutCgvUseCase mo34264q3() {
            return new GetCheckoutCgvUseCase(mo34170P2());
        }

        /* renamed from: q4 */
        public final LoyaltyAuthenticationUseCase mo34265q4() {
            return new LoyaltyAuthenticationUseCase(mo34261p4());
        }

        /* renamed from: q5 */
        public final SuccessCreateCardAnalyticsDelegate mo34266q5() {
            return new SuccessCreateCardAnalyticsDelegate(C10242e.m38491c(this.f34340d.f34219c), (C13783a) this.f34340d.f34193M.get(), (C13814a) this.f34340d.f34230h0.get());
        }

        /* renamed from: r2 */
        public final BlockedCardAnalyticsDelegate mo34267r2() {
            return new BlockedCardAnalyticsDelegate((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: r3 */
        public final GetCmsCarouselsUseCase mo34268r3() {
            return new GetCmsCarouselsUseCase(mo34170P2());
        }

        /* renamed from: r4 */
        public final LoyaltyBonusAnalyticsInterfaceDelegate mo34269r4() {
            return new LoyaltyBonusAnalyticsInterfaceDelegate((C13783a) this.f34340d.f34193M.get(), (C13814a) this.f34340d.f34230h0.get(), new C13744c(), C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: r5 */
        public final UpdateAndCheckUserAddressUseCase mo34270r5() {
            return new UpdateAndCheckUserAddressUseCase(this.f34340d.mo33940a());
        }

        /* renamed from: s2 */
        public final CancelOrderOnlineUseCase mo34271s2() {
            return new CancelOrderOnlineUseCase((OrderOnlineRepository) this.f34340d.f34258v0.get());
        }

        /* renamed from: s3 */
        public final GetCmsMiniHubBlocksUseCase mo34272s3() {
            return new GetCmsMiniHubBlocksUseCase(this.f34340d.mo33909U9(), mo34170P2());
        }

        /* renamed from: s4 */
        public final LoyaltyDetailAnalyticsDelegate mo34273s4() {
            return new LoyaltyDetailAnalyticsDelegate((C13783a) this.f34340d.f34193M.get(), new C13744c());
        }

        /* renamed from: s5 */
        public final C37607c mo34274s5() {
            return new C37607c((AppEnvironment) this.f34340d.f34199P.get());
        }

        /* renamed from: t2 */
        public final C39438b mo34275t2() {
            return new C39438b((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: t3 */
        public final GetCmsOffersUseCase mo34276t3() {
            return new GetCmsOffersUseCase(mo34170P2());
        }

        /* renamed from: t4 */
        public final LoyaltyRepository mo34277t4() {
            return new LoyaltyRepository(this.f34340d.mo34019l8(), this.f34340d.mo33983g6(), this.f34340d.mo33944a8(), this.f34340d.mo33951b8(), (C28812h) this.f34340d.f34215Y.get());
        }

        /* renamed from: t5 */
        public final UpdateBasketUseCase mo34278t5() {
            return new UpdateBasketUseCase(this.f34340d.mo34105z5(), this.f34340d.mo34075u5());
        }

        /* renamed from: u2 */
        public final C39441d mo34279u2() {
            return new C39441d((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: u3 */
        public final GetCmsPrimeFidListUseCase mo34280u3() {
            return new GetCmsPrimeFidListUseCase(mo34170P2());
        }

        /* renamed from: u4 */
        public final C26620a mo34281u4() {
            return new C26620a((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: u5 */
        public final UpdateCouponDetailsUseCase mo34282u5() {
            return new UpdateCouponDetailsUseCase(mo34185U2(), this.f34340d.mo34098y4());
        }

        /* renamed from: v2 */
        public final C39443f mo34283v2() {
            return new C39443f((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: v3 */
        public final GetCmsPrimeFidUseCase mo34284v3() {
            return new GetCmsPrimeFidUseCase(mo34170P2());
        }

        /* renamed from: v4 */
        public final LuckyCartGetLuckyCartBannerDetailsUseCase mo34285v4() {
            return new LuckyCartGetLuckyCartBannerDetailsUseCase(this.f34340d.mo33978f8(), (LuckyCartGateway) this.f34340d.f34188J0.get(), this.f34340d.mo33909U9());
        }

        /* renamed from: v5 */
        public final UpdateCouponsUseCase mo34286v5() {
            return new UpdateCouponsUseCase(this.f34340d.mo34098y4(), mo34185U2());
        }

        /* renamed from: w2 */
        public final CatalogPreferencesStorage mo34287w2() {
            return new CatalogPreferencesStorage(C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: w3 */
        public final GetDQEAddressSuggestionsUseCase mo34288w3() {
            return new GetDQEAddressSuggestionsUseCase(mo34197Y2());
        }

        /* renamed from: w4 */
        public final LuckyCartGetLuckyCartBannersUseCase mo34289w4() {
            return new LuckyCartGetLuckyCartBannersUseCase((LuckyCartGateway) this.f34340d.f34188J0.get(), this.f34340d.mo33909U9(), this.f34340d.mo34067s9());
        }

        /* renamed from: w5 */
        public final UpdateMemoListUseCase mo34290w5() {
            return new UpdateMemoListUseCase(this.f34340d.mo34012k8());
        }

        /* renamed from: x2 */
        public final C39446h mo34291x2() {
            return new C39446h((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: x3 */
        public final GetDeliveryStoreUseCase mo34292x3() {
            return new GetDeliveryStoreUseCase(this.f34340d.mo34074u4(), this.f34340d.mo34013k9());
        }

        /* renamed from: x4 */
        public final MarkAppMessageAsReadUseCase mo34293x4() {
            return new MarkAppMessageAsReadUseCase(this.f34340d.mo33928Y4());
        }

        /* renamed from: x5 */
        public final UpdateMidFidClubUseCase mo34294x5() {
            return new UpdateMidFidClubUseCase(mo34277t4());
        }

        /* renamed from: y2 */
        public final C38360b mo34295y2() {
            return new C38360b((C13783a) this.f34340d.f34193M.get());
        }

        /* renamed from: y3 */
        public final GetFidHistoryUseCase mo34296y3() {
            return new GetFidHistoryUseCase(mo34277t4());
        }

        /* renamed from: y4 */
        public final NonFoodValidatePaymentUseCase mo34297y4() {
            return new NonFoodValidatePaymentUseCase((NonFoodPaymentGateway) this.f34340d.f34196N0.get(), mo34145H4());
        }

        /* renamed from: y5 */
        public final UpdateScanTutorialHasBeenShownUseCase mo34298y5() {
            return new UpdateScanTutorialHasBeenShownUseCase((C28267a) this.f34340d.f34176D0.get());
        }

        /* renamed from: z2 */
        public final C37686a mo34299z2() {
            return new C37686a(C10242e.m38491c(this.f34340d.f34219c));
        }

        /* renamed from: z3 */
        public final GetGazStationsCampaignUseCase mo34300z3() {
            return new GetGazStationsCampaignUseCase(mo34240k3(), this.f34340d.mo33909U9());
        }

        /* renamed from: z4 */
        public final ObserveBasketAndOffersUseCase mo34301z4() {
            return new ObserveBasketAndOffersUseCase(this.f34340d.mo33845K5(), this.f34340d.mo34022m4(), this.f34340d.mo33791B5());
        }

        /* renamed from: z5 */
        public final UpdateSecretCodeUseCase mo34302z5() {
            return new UpdateSecretCodeUseCase(mo34277t4());
        }

        public C14000n(C13995j jVar, C13988d dVar, C19456p0 p0Var, C10182h hVar) {
            this.f34346f = this;
            this.f34340d = jVar;
            this.f34343e = dVar;
            this.f34337c = p0Var;
            mo34225g4(p0Var, hVar);
            mo34229h4(p0Var, hVar);
        }
    }

    /* renamed from: com.carrefour.fid.android.i$o */
    public static final class C14002o implements C14006j0.C14026n.C14027a {

        /* renamed from: a */
        public final C13995j f34407a;

        /* renamed from: b */
        public final C13988d f34408b;

        /* renamed from: c */
        public final C13986b f34409c;

        /* renamed from: d */
        public final C13992g f34410d;

        /* renamed from: e */
        public View f34411e;

        /* renamed from: b */
        public C14006j0.C14026n mo21632g() {
            C10335o.m38549a(this.f34411e, View.class);
            return new C14003p(this.f34407a, this.f34408b, this.f34409c, this.f34410d, this.f34411e);
        }

        /* renamed from: c */
        public C14002o mo21631a(View view) {
            this.f34411e = (View) C10335o.m38550b(view);
            return this;
        }

        public C14002o(C13995j jVar, C13988d dVar, C13986b bVar, C13992g gVar) {
            this.f34407a = jVar;
            this.f34408b = dVar;
            this.f34409c = bVar;
            this.f34410d = gVar;
        }
    }

    /* renamed from: com.carrefour.fid.android.i$p */
    public static final class C14003p extends C14006j0.C14026n {

        /* renamed from: c */
        public final C13995j f34412c;

        /* renamed from: d */
        public final C13988d f34413d;

        /* renamed from: e */
        public final C13986b f34414e;

        /* renamed from: f */
        public final C13992g f34415f;

        /* renamed from: g */
        public final C14003p f34416g;

        public C14003p(C13995j jVar, C13988d dVar, C13986b bVar, C13992g gVar, View view) {
            this.f34416g = this;
            this.f34412c = jVar;
            this.f34413d = dVar;
            this.f34414e = bVar;
            this.f34415f = gVar;
        }
    }

    /* renamed from: a */
    public static C13990e m59226a() {
        return new C13990e();
    }
}
