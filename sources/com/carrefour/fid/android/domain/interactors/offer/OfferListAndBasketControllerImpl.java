package com.carrefour.fid.android.domain.interactors.offer;

import android.os.Parcelable;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.core.p057io.BasketClosedStoreThrowable;
import com.carrefour.fid.android.core.p057io.BasketExpiredFacilityStoreIdThrowable;
import com.carrefour.fid.android.core.p057io.BasketSlotOutdatedThrowable;
import com.carrefour.fid.android.core.p057io.BasketThrowable;
import com.carrefour.fid.android.core.p057io.BasketUpdateThrowable;
import com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable;
import com.carrefour.fid.android.core.type.BasketErrorType;
import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable;
import com.carrefour.fid.android.domain.extension.C37498a;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37575i;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.basket.MixingProductsRemoteConfigUseCase;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37683d;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase;
import com.carrefour.fid.android.domain.models.CategoryLimitDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferMessage;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.performance.C38334f;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.OfferUnavailableModel;
import com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper;
import com.carrefour.fid.android.shared.network.C28802c;
import com.carrefour.fid.android.shared.p045di.annotation.C28672p;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.utils.C22719n;
import com.carrefour.fid.android.utils.StateEventKt;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11944n;
import kotlinx.coroutines.flow.C11945o;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOfferListAndBasketControllerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferListAndBasketControllerImpl.kt\ncom/carrefour/fid/android/domain/interactors/offer/OfferListAndBasketControllerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,649:1\n1#2:650\n1855#3,2:651\n*S KotlinDebug\n*F\n+ 1 OfferListAndBasketControllerImpl.kt\ncom/carrefour/fid/android/domain/interactors/offer/OfferListAndBasketControllerImpl\n*L\n573#1:651,2\n*E\n"})
public final class OfferListAndBasketControllerImpl implements C37716b, C12074o0 {
    @C12579k

    /* renamed from: E0 */
    public final C11940j<C22719n<List<OfferModel>>> f94605E0;
    @C12579k

    /* renamed from: F0 */
    public final C11952u<C22719n<List<OfferModel>>> f94606F0;
    @C12579k

    /* renamed from: G0 */
    public final C11940j<Boolean> f94607G0;
    @C12579k

    /* renamed from: H0 */
    public final C11940j<C22719n<Basket>> f94608H0;
    @C12579k

    /* renamed from: I0 */
    public final C11952u<C22719n<Basket>> f94609I0;
    @C12579k

    /* renamed from: J0 */
    public final C11911i<OfferModel> f94610J0;
    @C12579k

    /* renamed from: K0 */
    public final C11944n<OfferModel> f94611K0;
    @C12579k

    /* renamed from: L0 */
    public final C11911i<Throwable> f94612L0;
    @C12579k

    /* renamed from: M0 */
    public final C11944n<Throwable> f94613M0;
    @C12579k

    /* renamed from: N0 */
    public final C11940j<Boolean> f94614N0;
    @C12580l

    /* renamed from: O0 */
    public Boolean f94615O0;
    @C12579k

    /* renamed from: X */
    public final MixingProductsRemoteConfigUseCase f94616X;
    @C12579k

    /* renamed from: Y */
    public final CoroutineDispatcher f94617Y;
    @C12579k

    /* renamed from: Z */
    public final C38328d f94618Z;
    @C12579k

    /* renamed from: a */
    public final GetOfferProductListUseCase f94619a;
    @C12579k

    /* renamed from: b */
    public final UpdateOfferListUseCase f94620b;
    @C12579k

    /* renamed from: c */
    public final OfferListModelDataMapper f94621c;
    @C12579k

    /* renamed from: d */
    public final C37680a f94622d;
    @C12579k

    /* renamed from: e */
    public final C37683d f94623e;
    @C12579k

    /* renamed from: f */
    public final C37584l0 f94624f;
    @C12579k

    /* renamed from: g */
    public final C37566e0 f94625g;
    @C12579k

    /* renamed from: v */
    public final C37588n0 f94626v;
    @C12579k

    /* renamed from: w */
    public final C37575i f94627w;
    @C12579k

    /* renamed from: x */
    public final LoginRepository f94628x;
    @C12579k

    /* renamed from: y */
    public final LoyaltyPreferencesStorage f94629y;
    @C12579k

    /* renamed from: z */
    public final C28802c f94630z;

    @Inject
    public OfferListAndBasketControllerImpl(@C12579k GetOfferProductListUseCase getOfferProductListUseCase, @C12579k UpdateOfferListUseCase updateOfferListUseCase, @C12579k OfferListModelDataMapper offerListModelDataMapper, @C12579k C37680a aVar, @C12579k C37683d dVar, @C12579k C37584l0 l0Var, @C12579k C37566e0 e0Var, @C12579k C37588n0 n0Var, @C12579k C37575i iVar, @C12579k LoginRepository loginRepository, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C28802c cVar, @C12579k MixingProductsRemoteConfigUseCase mixingProductsRemoteConfigUseCase, @C28672p @C12579k CoroutineDispatcher coroutineDispatcher, @C12579k C38328d dVar2) {
        GetOfferProductListUseCase getOfferProductListUseCase2 = getOfferProductListUseCase;
        UpdateOfferListUseCase updateOfferListUseCase2 = updateOfferListUseCase;
        OfferListModelDataMapper offerListModelDataMapper2 = offerListModelDataMapper;
        C37680a aVar2 = aVar;
        C37683d dVar3 = dVar;
        C37584l0 l0Var2 = l0Var;
        C37566e0 e0Var2 = e0Var;
        C37588n0 n0Var2 = n0Var;
        C37575i iVar2 = iVar;
        LoginRepository loginRepository2 = loginRepository;
        LoyaltyPreferencesStorage loyaltyPreferencesStorage2 = loyaltyPreferencesStorage;
        C28802c cVar2 = cVar;
        MixingProductsRemoteConfigUseCase mixingProductsRemoteConfigUseCase2 = mixingProductsRemoteConfigUseCase;
        CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
        C38328d dVar4 = dVar2;
        Intrinsics.checkNotNullParameter(getOfferProductListUseCase2, "getOfferProductListUseCase");
        Intrinsics.checkNotNullParameter(updateOfferListUseCase2, "updateOfferListUseCase");
        Intrinsics.checkNotNullParameter(offerListModelDataMapper2, "offerListModelDataMapper");
        Intrinsics.checkNotNullParameter(aVar2, "addProductToShoppingListUseCase");
        Intrinsics.checkNotNullParameter(dVar3, "removeProductFromShoppingListUseCase");
        Intrinsics.checkNotNullParameter(l0Var2, "synchronizeCurrentBasketUseCase");
        Intrinsics.checkNotNullParameter(e0Var2, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(n0Var2, "updateBasketUseCase");
        Intrinsics.checkNotNullParameter(iVar2, "deleteBasketUseCase");
        Intrinsics.checkNotNullParameter(loginRepository2, "loginRepository");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage2, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(cVar2, "connectionManager");
        Intrinsics.checkNotNullParameter(mixingProductsRemoteConfigUseCase2, "mixingProductsRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "dispatcher");
        Intrinsics.checkNotNullParameter(dVar4, "performance");
        this.f94619a = getOfferProductListUseCase2;
        this.f94620b = updateOfferListUseCase2;
        this.f94621c = offerListModelDataMapper2;
        this.f94622d = aVar2;
        this.f94623e = dVar3;
        this.f94624f = l0Var2;
        this.f94625g = e0Var2;
        this.f94626v = n0Var2;
        this.f94627w = iVar2;
        this.f94628x = loginRepository2;
        this.f94629y = loyaltyPreferencesStorage2;
        this.f94630z = cVar2;
        this.f94616X = mixingProductsRemoteConfigUseCase2;
        this.f94617Y = coroutineDispatcher2;
        this.f94618Z = dVar4;
        C11940j<C22719n<List<OfferModel>>> c = StateEventKt.m102782c(null);
        this.f94605E0 = c;
        this.f94606F0 = StateEventKt.m102784e(c);
        Boolean bool = Boolean.FALSE;
        this.f94607G0 = C11953v.m47628a(bool);
        C11940j<C22719n<Basket>> c2 = StateEventKt.m102782c(null);
        this.f94608H0 = c2;
        this.f94609I0 = StateEventKt.m102784e(c2);
        C11911i<OfferModel> b = C11945o.m47610b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f94610J0 = b;
        this.f94611K0 = C11909g.m47467l(b);
        C11911i<Throwable> b2 = C11945o.m47610b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f94612L0 = b2;
        this.f94613M0 = C11909g.m47467l(b2);
        this.f94614N0 = C11953v.m47628a(bool);
    }

    /* renamed from: A */
    public final void mo114782A() {
        this.f94607G0.setValue(Boolean.FALSE);
    }

    /* renamed from: B */
    public final OfferProductModel mo114783B(OfferProductModel offerProductModel) {
        OfferModel offerModel;
        OfferUnavailableModel offerUnavailableModel;
        Parcelable parcelable;
        Iterable e;
        Object obj;
        boolean z;
        Parcelable parcelable2;
        Object obj2;
        boolean z2;
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            Iterable iterable = (List) this.f94605E0.getValue().mo67135c();
            if (iterable != null) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((OfferModel) obj2).mo121471id() == offerProductModel.mo121471id()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                parcelable2 = (OfferModel) obj2;
            } else {
                parcelable2 = null;
            }
            if (parcelable2 instanceof OfferProductModel) {
                return (OfferProductModel) parcelable2;
            }
            return null;
        }
        List list = (List) this.f94605E0.getValue().mo67135c();
        if (list != null) {
            offerModel = (OfferModel) CollectionsKt___CollectionsKt.m40479B2(list);
        } else {
            offerModel = null;
        }
        if (offerModel instanceof OfferUnavailableModel) {
            offerUnavailableModel = (OfferUnavailableModel) offerModel;
        } else {
            offerUnavailableModel = null;
        }
        if (offerUnavailableModel == null || (e = offerUnavailableModel.mo121760e()) == null) {
            parcelable = null;
        } else {
            Iterator it2 = e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((OfferModel) obj).mo121471id() == offerProductModel.mo121471id()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            parcelable = (OfferModel) obj;
        }
        if (parcelable instanceof OfferProductModel) {
            return (OfferProductModel) parcelable;
        }
        return null;
    }

    /* renamed from: C */
    public final Object mo114784C(OfferModel offerModel, C11045c<? super C11079d2> cVar) {
        Object emit = this.f94610J0.emit(offerModel, cVar);
        return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
    }

    /* renamed from: D */
    public final Object mo114785D(Basket basket, C11045c<? super C11079d2> cVar) {
        mo114782A();
        Object h = StateEventKt.m102787h(this.f94608H0, basket, cVar);
        if (h == C11063b.m42612h()) {
            return h;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: E */
    public final Object mo114786E(Basket basket, OfferProductModel offerProductModel, C11045c<? super C11079d2> cVar) {
        List<Offer> B;
        CategoryLimitDomain categoryLimitDomain;
        Object obj;
        List<OfferMessage> N;
        Object obj2;
        CategoryLimit E;
        String str;
        String str2;
        if (!(basket == null || (B = basket.mo116817B()) == null)) {
            Iterator it = B.iterator();
            while (true) {
                categoryLimitDomain = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String f = ((Offer) obj).mo118001J().mo118136f();
                OfferIdentifierDomain W = offerProductModel.mo121502W();
                if (W != null) {
                    str2 = W.mo115986f();
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual((Object) f, (Object) str2)) {
                    break;
                }
            }
            Offer offer = (Offer) obj;
            if (!(offer == null || (N = offer.mo118005N()) == null)) {
                for (OfferMessage e : N) {
                    String e2 = e.mo118148e();
                    switch (e2.hashCode()) {
                        case -1688620010:
                            if (e2.equals("QUANTITY_REQUESTED_HIGHER_THAN_AVAILABLE")) {
                                break;
                            } else {
                                continue;
                            }
                        case -1015848577:
                            if (e2.equals("QUANTITY_REQUESTED_HIGHER_THAN_MAX_POSSIBLE")) {
                                break;
                            } else {
                                continue;
                            }
                        case 140722205:
                            if (!e2.equals("NOT_AVAILABLE")) {
                                continue;
                            } else {
                                Object emit = this.f94612L0.emit(new BasketThrowable(BasketErrorType.ProductNotAvailable), cVar);
                                if (emit == C11063b.m42612h()) {
                                    return emit;
                                }
                                return C11079d2.f28267a;
                            }
                        case 935189964:
                            if (e2.equals("QUANTITY_REQUESTED_RELATED_TO_PRODUCT_CATEGORY_HAS_EXCEEDED_THE_LIMIT")) {
                                break;
                            } else {
                                continue;
                            }
                        case 1018325076:
                            if (!e2.equals("NOT_ADDED")) {
                                continue;
                            } else {
                                Object emit2 = this.f94612L0.emit(new BasketThrowable(BasketErrorType.BasketNotAdded), cVar);
                                if (emit2 == C11063b.m42612h()) {
                                    return emit2;
                                }
                                return C11079d2.f28267a;
                            }
                    }
                    C11911i<Throwable> iVar = this.f94612L0;
                    Iterator it2 = basket.mo116817B().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            String f2 = ((Offer) obj2).mo118001J().mo118136f();
                            OfferIdentifierDomain W2 = offerProductModel.mo121502W();
                            if (W2 != null) {
                                str = W2.mo115986f();
                            } else {
                                str = null;
                            }
                            if (Intrinsics.areEqual((Object) f2, (Object) str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Offer offer2 = (Offer) obj2;
                    if (!(offer2 == null || (E = offer2.mo117996E()) == null)) {
                        categoryLimitDomain = C37498a.m153934d(E);
                    }
                    Object emit3 = iVar.emit(new CategoryLimitationExceededThrowable(categoryLimitDomain), cVar);
                    if (emit3 == C11063b.m42612h()) {
                        return emit3;
                    }
                    return C11079d2.f28267a;
                }
            }
        }
        return C11079d2.f28267a;
    }

    /* renamed from: F */
    public final Throwable mo114787F(Throwable th) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (th instanceof BasketExpiredFacilityStoreIdThrowable) {
            z = true;
        } else {
            z = th instanceof BasketClosedStoreThrowable;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = th instanceof BasketSlotOutdatedThrowable;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = th instanceof RequireServiceSelectionThrowable;
        }
        if (!z3) {
            z4 = th instanceof NetworkException;
        }
        if (z4) {
            return th;
        }
        return new BasketUpdateThrowable("Cannot updating product in basket", th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114788G(kotlin.coroutines.C11045c<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$isProductMixingFeatureEnabled$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$isProductMixingFeatureEnabled$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$isProductMixingFeatureEnabled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$isProductMixingFeatureEnabled$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$isProductMixingFeatureEnabled$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0059
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003b:
            kotlin.C11661u0.m45747n(r9)
            java.lang.Boolean r9 = r8.f94615O0
            if (r9 == 0) goto L_0x004b
            boolean r9 = r9.booleanValue()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r9)
            return r9
        L_0x004b:
            com.carrefour.fid.android.domain.interactors.basket.MixingProductsRemoteConfigUseCase r9 = r8.f94616X
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.m172942invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r0 = r8
        L_0x0059:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r9)
            r7 = 0
            if (r3 != 0) goto L_0x0077
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r9)
            r0.f94615O0 = r9
            if (r9 == 0) goto L_0x0072
            boolean r7 = r9.booleanValue()
        L_0x0072:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            goto L_0x0085
        L_0x0077:
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r2 = "Error getting mixingProductsRemoteConfigUseCase"
            r4 = 0
            r5 = 4
            r6 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
        L_0x0085:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114788G(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: H */
    public final void mo114789H() {
        this.f94607G0.setValue(Boolean.TRUE);
    }

    /* renamed from: I */
    public final void mo114790I() {
        this.f94614N0.setValue(Boolean.TRUE);
    }

    /* renamed from: J */
    public final void mo114791J() {
        this.f94614N0.setValue(Boolean.FALSE);
    }

    /* renamed from: K */
    public final void mo114792K(List<? extends OfferModel> list, RequestType requestType) {
        this.f94618Z.mo121195d(C38334f.f97101p);
        C11723c2 unused = C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new OfferListAndBasketControllerImpl$updateOfferList$1(this, list, requestType, (C11045c<? super OfferListAndBasketControllerImpl$updateOfferList$1>) null), 3, (Object) null);
    }

    @C12580l
    /* renamed from: a */
    public Object mo114793a(@C12579k List<? extends OfferModel> list, @C12579k C11045c<? super C11079d2> cVar) {
        Object h = StateEventKt.m102787h(this.f94605E0, list, cVar);
        return h == C11063b.m42612h() ? h : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114794b(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$synchronizeBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$synchronizeBasket$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$synchronizeBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$synchronizeBasket$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$synchronizeBasket$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x005e
            if (r2 == r7) goto L_0x0056
            if (r2 == r6) goto L_0x0048
            if (r2 == r5) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00d0
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0040:
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00b5
        L_0x0048:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r2 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x00a1
        L_0x0056:
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0086
        L_0x005e:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.performance.d r9 = r8.f94618Z
            java.lang.String r2 = "synchronize_single_basket"
            r9.mo121195d(r2)
            com.carrefour.fid.android.shared.network.c r9 = r8.f94630z
            boolean r9 = r9.mo83873b()
            if (r9 != 0) goto L_0x0090
            kotlinx.coroutines.flow.i<java.lang.Throwable> r9 = r8.f94612L0
            com.carrefour.fid.android.shared.io.NetworkException r2 = new com.carrefour.fid.android.shared.io.NetworkException
            java.lang.String r4 = "Network exception"
            r5 = 0
            r2.<init>(r4, r5, r6, r5)
            r0.L$0 = r8
            r0.label = r7
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r0 = r8
        L_0x0086:
            com.carrefour.fid.android.performance.d r9 = r0.f94618Z
            r9.mo121196e()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r9
        L_0x0090:
            r8.mo114789H()
            com.carrefour.fid.android.domain.interactors.basket.l0 r9 = r8.f94624f
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r2 = r8
        L_0x00a1:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r9)
            if (r6 != 0) goto L_0x00bf
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r9 = r2.mo114785D(r9, r0)
            if (r9 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            r0 = r2
        L_0x00b5:
            com.carrefour.fid.android.performance.d r9 = r0.f94618Z
            r9.mo121196e()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            goto L_0x00d9
        L_0x00bf:
            r2.mo114782A()
            kotlinx.coroutines.flow.i<java.lang.Throwable> r9 = r2.f94612L0
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.emit(r6, r0)
            if (r9 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            r0 = r2
        L_0x00d0:
            com.carrefour.fid.android.performance.d r9 = r0.f94618Z
            r9.mo121196e()
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
        L_0x00d9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114794b(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114795c(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$repostOffers$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$repostOffers$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$repostOffers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$repostOffers$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$repostOffers$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.utils.n<java.util.List<com.carrefour.fid.android.presentation.models.OfferModel>>> r5 = r4.f94605E0
            java.lang.Object r5 = r5.getValue()
            com.carrefour.fid.android.utils.n r5 = (com.carrefour.fid.android.utils.C22719n) r5
            java.lang.Object r5 = r5.mo67135c()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0053
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = r4.mo114793a(r5, r0)
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x0053:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114795c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fd, code lost:
        if (r11.f94630z.mo83873b() != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ff, code lost:
        if (r5 != null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0102, code lost:
        r5.mo121730I1(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0105, code lost:
        r1 = r11.f94612L0;
        r2 = new com.carrefour.fid.android.shared.p046io.NetworkException("Network exception", (java.lang.Throwable) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r3.L$0 = null;
        r3.L$1 = null;
        r3.L$2 = null;
        r3.L$3 = null;
        r3.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011d, code lost:
        if (r1.emit(r2, r3) != r4) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0120, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
        r10 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
        if (r10.mo121519p0() >= 0) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012c, code lost:
        if (r2 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (r5 != null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0131, code lost:
        r5.mo121730I1(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0135, code lost:
        r12 = r10.mo121502W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        if (r12 != null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013f, code lost:
        return kotlin.coroutines.jvm.internal.C11064a.m42615a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0140, code lost:
        r13 = r11.f94626v;
        r15 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier(com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r12.mo115986f()), com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r12.mo115984e()), (kotlin.jvm.internal.DefaultConstructorMarker) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
        if (r2 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015b, code lost:
        r2 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0160, code lost:
        r2 = r10.mo121519p0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0164, code lost:
        r14 = new com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a(r15, r2, true);
        r3.L$0 = r11;
        r3.L$1 = r1;
        r3.L$2 = r5;
        r3.L$3 = null;
        r3.label = 3;
        r2 = r13.m172966invokegIAlus(r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0175, code lost:
        if (r2 != r4) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0177, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        r10 = r11;
        r17 = r5;
        r5 = r1;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017e, code lost:
        r8 = kotlin.Result.m38705e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0182, code lost:
        if (r8 != null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0184, code lost:
        r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0186, code lost:
        if (r1 != null) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0189, code lost:
        r1.mo121730I1(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018d, code lost:
        r3.L$0 = r10;
        r3.L$1 = r5;
        r3.L$2 = r2;
        r3.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019a, code lost:
        if (r10.mo114785D(r2, r3) != r4) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019d, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019e, code lost:
        r3.L$0 = r1;
        r3.L$1 = null;
        r3.L$2 = null;
        r3.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ad, code lost:
        if (r1.mo114786E(r2, (com.carrefour.fid.android.presentation.models.OfferProductModel) r5, r3) != r4) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01af, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b0, code lost:
        com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r1, (com.carrefour.fid.android.core.types.RequestType) null, (com.carrefour.fid.android.core.types.RequestType) null, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b4, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b5, code lost:
        if (r1 != null) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b8, code lost:
        r1.mo121730I1(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bb, code lost:
        r1 = r10.f94612L0;
        r5 = r10.mo114787F(r8);
        r3.L$0 = r10;
        r3.L$1 = null;
        r3.L$2 = null;
        r3.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ce, code lost:
        if (r1.emit(r5, r3) != r4) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d2, code lost:
        com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r1, (com.carrefour.fid.android.core.types.RequestType) null, (com.carrefour.fid.android.core.types.RequestType) null, 3, (java.lang.Object) null);
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01da, code lost:
        return kotlin.coroutines.jvm.internal.C11064a.m42615a(r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114796d(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferModel r19, @org.jetbrains.annotations.C12580l java.lang.Integer r20, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromBasket$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromBasket$1 r3 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromBasket$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromBasket$1 r3 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromBasket$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r3.label
            r6 = 3
            r7 = 1
            r8 = 0
            r9 = 0
            switch(r5) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0077;
                case 2: goto L_0x0072;
                case 3: goto L_0x005b;
                case 4: goto L_0x0048;
                case 5: goto L_0x003f;
                case 6: goto L_0x0035;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            java.lang.Object r1 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r1 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r1
            kotlin.C11661u0.m45747n(r2)
            r2 = r8
            goto L_0x01d2
        L_0x003f:
            java.lang.Object r1 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r1 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r1
            kotlin.C11661u0.m45747n(r2)
            goto L_0x01b0
        L_0x0048:
            java.lang.Object r1 = r3.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            java.lang.Object r5 = r3.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r5 = (com.carrefour.fid.android.presentation.models.OfferModel) r5
            java.lang.Object r8 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r8 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r8
            kotlin.C11661u0.m45747n(r2)
            r2 = r1
            r1 = r8
            goto L_0x019e
        L_0x005b:
            java.lang.Object r1 = r3.L$2
            com.carrefour.fid.android.presentation.models.OfferProductModel r1 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r1
            java.lang.Object r5 = r3.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r5 = (com.carrefour.fid.android.presentation.models.OfferModel) r5
            java.lang.Object r10 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r10 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r10
            kotlin.C11661u0.m45747n(r2)
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x017e
        L_0x0072:
            kotlin.C11661u0.m45747n(r2)
            goto L_0x0120
        L_0x0077:
            java.lang.Object r1 = r3.L$3
            com.carrefour.fid.android.presentation.models.OfferProductModel r1 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r1
            java.lang.Object r5 = r3.L$2
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r10 = r3.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r10 = (com.carrefour.fid.android.presentation.models.OfferModel) r10
            java.lang.Object r11 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r11 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r11
            kotlin.C11661u0.m45747n(r2)
            r2 = r5
            r5 = r1
            r1 = r10
            goto L_0x00f7
        L_0x008f:
            kotlin.C11661u0.m45747n(r2)
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r2 != 0) goto L_0x009b
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            return r1
        L_0x009b:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.utils.n<java.util.List<com.carrefour.fid.android.presentation.models.OfferModel>>> r2 = r0.f94605E0
            java.lang.Object r2 = r2.getValue()
            com.carrefour.fid.android.utils.n r2 = (com.carrefour.fid.android.utils.C22719n) r2
            java.lang.Object r2 = r2.mo67135c()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00d4
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00b1:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00d0
            java.lang.Object r5 = r2.next()
            r10 = r5
            com.carrefour.fid.android.presentation.models.OfferModel r10 = (com.carrefour.fid.android.presentation.models.OfferModel) r10
            long r10 = r10.mo121471id()
            long r12 = r19.mo121471id()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00cc
            r10 = r7
            goto L_0x00cd
        L_0x00cc:
            r10 = r8
        L_0x00cd:
            if (r10 == 0) goto L_0x00b1
            goto L_0x00d1
        L_0x00d0:
            r5 = r9
        L_0x00d1:
            com.carrefour.fid.android.presentation.models.OfferModel r5 = (com.carrefour.fid.android.presentation.models.OfferModel) r5
            goto L_0x00d5
        L_0x00d4:
            r5 = r9
        L_0x00d5:
            boolean r2 = r5 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r2 == 0) goto L_0x00dc
            com.carrefour.fid.android.presentation.models.OfferProductModel r5 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r5
            goto L_0x00dd
        L_0x00dc:
            r5 = r9
        L_0x00dd:
            if (r5 != 0) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r5.mo121730I1(r7)
        L_0x00e3:
            r3.L$0 = r0
            r3.L$1 = r1
            r2 = r20
            r3.L$2 = r2
            r3.L$3 = r5
            r3.label = r7
            java.lang.Object r10 = r0.mo114795c(r3)
            if (r10 != r4) goto L_0x00f6
            return r4
        L_0x00f6:
            r11 = r0
        L_0x00f7:
            com.carrefour.fid.android.shared.network.c r10 = r11.f94630z
            boolean r10 = r10.mo83873b()
            if (r10 != 0) goto L_0x0123
            if (r5 != 0) goto L_0x0102
            goto L_0x0105
        L_0x0102:
            r5.mo121730I1(r8)
        L_0x0105:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r1 = r11.f94612L0
            com.carrefour.fid.android.shared.io.NetworkException r2 = new com.carrefour.fid.android.shared.io.NetworkException
            java.lang.String r5 = "Network exception"
            r6 = 2
            r2.<init>(r5, r9, r6, r9)
            r3.L$0 = r9
            r3.L$1 = r9
            r3.L$2 = r9
            r3.L$3 = r9
            r3.label = r6
            java.lang.Object r1 = r1.emit(r2, r3)
            if (r1 != r4) goto L_0x0120
            return r4
        L_0x0120:
            r7 = r8
            goto L_0x01d6
        L_0x0123:
            r10 = r1
            com.carrefour.fid.android.presentation.models.OfferProductModel r10 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r10
            int r12 = r10.mo121519p0()
            if (r12 >= 0) goto L_0x0135
            if (r2 != 0) goto L_0x0135
            if (r5 != 0) goto L_0x0131
            goto L_0x0120
        L_0x0131:
            r5.mo121730I1(r8)
            goto L_0x0120
        L_0x0135:
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r12 = r10.mo121502W()
            if (r12 != 0) goto L_0x0140
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            return r1
        L_0x0140:
            com.carrefour.fid.android.domain.interactors.basket.n0 r13 = r11.f94626v
            com.carrefour.fid.android.domain.interactors.basket.n0$a r14 = new com.carrefour.fid.android.domain.interactors.basket.n0$a
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r15 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            java.lang.String r16 = r12.mo115986f()
            java.lang.String r8 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r16)
            java.lang.String r12 = r12.mo115984e()
            java.lang.String r12 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r12)
            r15.<init>(r8, r12, r9)
            if (r2 == 0) goto L_0x0160
            int r2 = r2.intValue()
            goto L_0x0164
        L_0x0160:
            int r2 = r10.mo121519p0()
        L_0x0164:
            r14.<init>(r15, r2, r7)
            r3.L$0 = r11
            r3.L$1 = r1
            r3.L$2 = r5
            r3.L$3 = r9
            r3.label = r6
            java.lang.Object r2 = r13.m172966invokegIAlus(r14, r3)
            if (r2 != r4) goto L_0x0178
            return r4
        L_0x0178:
            r10 = r11
            r17 = r5
            r5 = r1
            r1 = r17
        L_0x017e:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r2)
            if (r8 != 0) goto L_0x01b4
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            if (r1 != 0) goto L_0x0189
            goto L_0x018d
        L_0x0189:
            r8 = 0
            r1.mo121730I1(r8)
        L_0x018d:
            r3.L$0 = r10
            r3.L$1 = r5
            r3.L$2 = r2
            r1 = 4
            r3.label = r1
            java.lang.Object r1 = r10.mo114785D(r2, r3)
            if (r1 != r4) goto L_0x019d
            return r4
        L_0x019d:
            r1 = r10
        L_0x019e:
            com.carrefour.fid.android.presentation.models.OfferProductModel r5 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r5
            r3.L$0 = r1
            r3.L$1 = r9
            r3.L$2 = r9
            r8 = 5
            r3.label = r8
            java.lang.Object r2 = r1.mo114786E(r2, r5, r3)
            if (r2 != r4) goto L_0x01b0
            return r4
        L_0x01b0:
            com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r1, r9, r9, r6, r9)
            goto L_0x01d6
        L_0x01b4:
            r2 = 0
            if (r1 != 0) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r1.mo121730I1(r2)
        L_0x01bb:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r1 = r10.f94612L0
            java.lang.Throwable r5 = r10.mo114787F(r8)
            r3.L$0 = r10
            r3.L$1 = r9
            r3.L$2 = r9
            r7 = 6
            r3.label = r7
            java.lang.Object r1 = r1.emit(r5, r3)
            if (r1 != r4) goto L_0x01d1
            return r4
        L_0x01d1:
            r1 = r10
        L_0x01d2:
            com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r1, r9, r9, r6, r9)
            r7 = r2
        L_0x01d6:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114796d(com.carrefour.fid.android.presentation.models.OfferModel, java.lang.Integer, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114797e(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferModel r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToShoppingList$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToShoppingList$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToShoppingList$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r2) {
                case 0: goto L_0x006d;
                case 1: goto L_0x005b;
                case 2: goto L_0x0057;
                case 3: goto L_0x0057;
                case 4: goto L_0x003d;
                case 5: goto L_0x002e;
                case 6: goto L_0x0057;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002e:
            java.lang.Object r11 = r0.L$2
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r2 = (com.carrefour.fid.android.presentation.models.OfferModel) r2
            java.lang.Object r3 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r3 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r3
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0128
        L_0x003d:
            java.lang.Object r11 = r0.L$2
            com.carrefour.fid.android.presentation.models.OfferProductModel r11 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r11
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r2 = (com.carrefour.fid.android.presentation.models.OfferModel) r2
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r6 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r6
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r9 = r12
            r12 = r11
        L_0x0054:
            r11 = r9
            goto L_0x010b
        L_0x0057:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00bb
        L_0x005b:
            java.lang.Object r11 = r0.L$2
            com.carrefour.fid.android.presentation.models.OfferProductModel r11 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r11
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r2 = (com.carrefour.fid.android.presentation.models.OfferModel) r2
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r6 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r6
            kotlin.C11661u0.m45747n(r12)
            r12 = r11
            r11 = r2
            goto L_0x0096
        L_0x006d:
            kotlin.C11661u0.m45747n(r12)
            boolean r12 = r11 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r12 != 0) goto L_0x0079
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            return r11
        L_0x0079:
            r12 = r11
            com.carrefour.fid.android.presentation.models.OfferProductModel r12 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r12
            com.carrefour.fid.android.presentation.models.OfferProductModel r12 = r10.mo114783B(r12)
            if (r12 != 0) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r12.mo121732M1(r3)
        L_0x0086:
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.label = r3
            java.lang.Object r2 = r10.mo114795c(r0)
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r6 = r10
        L_0x0096:
            com.carrefour.fid.android.account.data.repositories.LoginRepository r2 = r6.f94628x
            boolean r2 = com.carrefour.fid.android.account.data.extension.C13195a.m57178b(r2)
            if (r2 == 0) goto L_0x00be
            if (r12 != 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r12.mo121732M1(r4)
        L_0x00a4:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r11 = r6.f94612L0
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r12 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r12.<init>()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r2 = 2
            r0.label = r2
            java.lang.Object r11 = r11.emit(r12, r0)
            if (r11 != r1) goto L_0x00bb
            return r1
        L_0x00bb:
            r3 = r4
            goto L_0x0173
        L_0x00be:
            r2 = r11
            com.carrefour.fid.android.presentation.models.OfferProductModel r2 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r2
            com.carrefour.fid.android.presentation.models.ProductModel r7 = r2.mo121517o0()
            if (r7 != 0) goto L_0x00e6
            if (r12 != 0) goto L_0x00ca
            goto L_0x00cd
        L_0x00ca:
            r12.mo121732M1(r4)
        L_0x00cd:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r11 = r6.f94612L0
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r2 = "No product in offer!"
            r12.<init>(r2)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r2 = 3
            r0.label = r2
            java.lang.Object r11 = r11.emit(r12, r0)
            if (r11 != r1) goto L_0x00bb
            return r1
        L_0x00e6:
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.a r7 = r6.f94622d
            com.carrefour.fid.android.presentation.models.ProductModel r2 = r2.mo121517o0()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            com.carrefour.fid.android.domain.models.product.Product r2 = com.carrefour.fid.android.presentation.models.extension.C38478n.m159655a(r2)
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r2 = com.carrefour.fid.android.domain.models.favorites.shoppinglist.extensions.C38036a.m156827a(r2)
            r0.L$0 = r6
            r0.L$1 = r11
            r0.L$2 = r12
            r8 = 4
            r0.label = r8
            java.lang.Object r2 = r7.m172966invokegIAlus(r2, r0)
            if (r2 != r1) goto L_0x0107
            return r1
        L_0x0107:
            r9 = r2
            r2 = r11
            goto L_0x0054
        L_0x010b:
            if (r12 != 0) goto L_0x010e
            goto L_0x0111
        L_0x010e:
            r12.mo121732M1(r4)
        L_0x0111:
            boolean r12 = kotlin.Result.m38709i(r11)
            if (r12 == 0) goto L_0x016e
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r11
            r12 = 5
            r0.label = r12
            java.lang.Object r12 = r6.mo114795c(r0)
            if (r12 != r1) goto L_0x0127
            return r1
        L_0x0127:
            r3 = r6
        L_0x0128:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r12 = r3.f94612L0
            com.carrefour.fid.android.core.io.ShoppingListThrowable r3 = new com.carrefour.fid.android.core.io.ShoppingListThrowable
            com.carrefour.fid.android.presentation.models.OfferProductModel r2 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r2
            com.carrefour.fid.android.presentation.models.ProductModel r2 = r2.mo121517o0()
            if (r2 == 0) goto L_0x0139
            java.lang.String r2 = r2.mo121889s()
            goto L_0x013a
        L_0x0139:
            r2 = r5
        L_0x013a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Cannot add product "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " to shopping list."
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.Throwable r11 = kotlin.Result.m38705e(r11)
            if (r11 != 0) goto L_0x015b
            java.lang.Throwable r11 = new java.lang.Throwable
            r11.<init>()
        L_0x015b:
            r3.<init>(r2, r11)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r11 = 6
            r0.label = r11
            java.lang.Object r11 = r12.emit(r3, r0)
            if (r11 != r1) goto L_0x00bb
            return r1
        L_0x016e:
            com.carrefour.fid.android.core.types.RequestType r11 = com.carrefour.fid.android.core.types.RequestType.ONLINE
            com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r6, r5, r11, r3, r5)
        L_0x0173:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114797e(com.carrefour.fid.android.presentation.models.OfferModel, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: f */
    public C11944n<Throwable> mo114798f() {
        return this.f94613M0;
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return this.f94617Y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114799h(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$clearBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$clearBasket$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$clearBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$clearBasket$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$clearBasket$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00b3
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0038:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r4 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r4
            kotlin.C11661u0.m45747n(r9)
            goto L_0x009c
        L_0x0042:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r2 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            r7 = r2
            r2 = r9
            r9 = r7
            goto L_0x0079
        L_0x0053:
            kotlin.C11661u0.m45747n(r9)
            kotlinx.coroutines.flow.j<java.lang.Boolean> r9 = r8.f94607G0
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0067
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x0067:
            r8.mo114789H()
            com.carrefour.fid.android.domain.interactors.basket.i r9 = r8.f94627w
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r2 = r9
            r9 = r8
        L_0x0079:
            boolean r5 = kotlin.Result.m38710j(r2)
            if (r5 == 0) goto L_0x009d
            r5 = r2
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x009d
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.utils.n<java.util.List<com.carrefour.fid.android.presentation.models.OfferModel>>> r5 = r9.f94605E0
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r0.L$0 = r9
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r4 = com.carrefour.fid.android.utils.StateEventKt.m102787h(r5, r6, r0)
            if (r4 != r1) goto L_0x009b
            return r1
        L_0x009b:
            r4 = r9
        L_0x009c:
            r9 = r4
        L_0x009d:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r2)
            if (r4 == 0) goto L_0x00b3
            kotlinx.coroutines.flow.i<java.lang.Throwable> r9 = r9.f94612L0
            r0.L$0 = r2
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r9 = r9.emit(r4, r0)
            if (r9 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114799h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x002f;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114800i(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.core.types.RequestType r3, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.core.types.RequestType r4) {
        /*
            r2 = this;
            kotlinx.coroutines.flow.j<java.lang.Boolean> r3 = r2.f94614N0
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x000f
            return
        L_0x000f:
            r2.mo114790I()
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.utils.n<java.util.List<com.carrefour.fid.android.presentation.models.OfferModel>>> r3 = r2.f94605E0
            java.lang.Object r3 = r3.getValue()
            com.carrefour.fid.android.utils.n r3 = (com.carrefour.fid.android.utils.C22719n) r3
            java.lang.Object r3 = r3.mo67135c()
            r0 = r3
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x002e
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            r0 = 0
            if (r1 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = r0
        L_0x0034:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x003d
            r2.mo114792K(r3, r4)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
        L_0x003d:
            if (r0 != 0) goto L_0x0042
            r2.mo114791J()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114800i(com.carrefour.fid.android.core.types.RequestType, com.carrefour.fid.android.core.types.RequestType):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0260, code lost:
        com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r1, (com.carrefour.fid.android.core.types.RequestType) null, (com.carrefour.fid.android.core.types.RequestType) null, r2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0264, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0265, code lost:
        if (r6 != null) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0268, code lost:
        r6.mo121729G1(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026b, code lost:
        ((com.carrefour.fid.android.presentation.models.OfferProductModel) r11).mo121513j2(r1);
        r3.L$0 = r5;
        r3.L$1 = r8;
        r3.L$2 = null;
        r3.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027e, code lost:
        if (r5.mo114795c(r3) != r4) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0280, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0281, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0282, code lost:
        r6 = r5.f94612L0;
        r1 = r5.mo114787F(r1);
        r3.L$0 = null;
        r3.L$1 = null;
        r3.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0294, code lost:
        if (r6.emit(r1, r3) != r4) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0296, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0297, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x029c, code lost:
        return kotlin.coroutines.jvm.internal.C11064a.m42615a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0134, code lost:
        if (r13.f94630z.mo83873b() != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0136, code lost:
        if (r5 != null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        r5.mo121729G1(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013c, code lost:
        r1 = r13.f94612L0;
        r2 = new com.carrefour.fid.android.shared.p046io.NetworkException("Network exception", (java.lang.Throwable) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r3.L$0 = null;
        r3.L$1 = null;
        r3.L$2 = null;
        r3.L$3 = null;
        r3.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0154, code lost:
        if (r1.emit(r2, r3) != r4) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0156, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0157, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015a, code lost:
        r2 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0169, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159556E(r2), (java.lang.Object) kotlin.coroutines.jvm.internal.C11064a.m42615a(true)) == false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016b, code lost:
        if (r5 != null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016e, code lost:
        r5.mo121729G1(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0171, code lost:
        r1 = r13.f94612L0;
        r5 = new com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable(r2);
        r3.L$0 = null;
        r3.L$1 = null;
        r3.L$2 = null;
        r3.L$3 = null;
        r3.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0186, code lost:
        if (r1.emit(r5, r3) != r4) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0188, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0189, code lost:
        r14 = r2.mo121519p0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018d, code lost:
        if (r11 == null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018f, code lost:
        r2.mo121513j2(r11.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0197, code lost:
        if (r1 == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0199, code lost:
        r2.mo121513j2(com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159567P(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a0, code lost:
        r1 = r2.mo121502W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a4, code lost:
        if (r1 != null) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01aa, code lost:
        return kotlin.coroutines.jvm.internal.C11064a.m42615a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ab, code lost:
        r11 = r13.f94626v;
        r15 = new com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a(new com.carrefour.fid.android.domain.models.offer.OfferIdentifier(com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r1.mo115986f()), com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r1.mo115984e()), (kotlin.jvm.internal.DefaultConstructorMarker) null), r2.mo121519p0(), true);
        r3.L$0 = r13;
        r3.L$1 = r12;
        r3.L$2 = r5;
        r3.L$3 = null;
        r3.Z$0 = r10;
        r3.I$0 = r14;
        r3.label = 4;
        r2 = r11.m172966invokegIAlus(r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01de, code lost:
        if (r2 != r4) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e1, code lost:
        r6 = r5;
        r11 = r12;
        r5 = r13;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e5, code lost:
        r8 = kotlin.Result.m38705e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e9, code lost:
        if (r8 != null) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01eb, code lost:
        r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ed, code lost:
        if (r6 != null) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f0, code lost:
        r6.mo121729G1(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f4, code lost:
        r1 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fb, code lost:
        if (com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159555D(r1) == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fd, code lost:
        r1.mo121507c2(com.carrefour.fid.android.presentation.models.OfferNotificationType.f97448a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0202, code lost:
        r3.L$0 = r5;
        r3.L$1 = r11;
        r3.L$2 = r2;
        r3.Z$0 = r10;
        r3.label = 5;
        r1 = r5.mo114788G(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0211, code lost:
        if (r1 != r4) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0213, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0214, code lost:
        r17 = r5;
        r5 = r1;
        r1 = r10;
        r10 = r11;
        r11 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0221, code lost:
        if (((java.lang.Boolean) r5).booleanValue() == false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0223, code lost:
        r5 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022e, code lost:
        if (r5.mo121519p0() != com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159585g(r5)) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0230, code lost:
        if (r1 == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0232, code lost:
        r5.mo121745l2(kotlin.coroutines.jvm.internal.C11064a.m42615a(true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x023a, code lost:
        r5.mo121746m2(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x023e, code lost:
        r3.L$0 = r11;
        r3.L$1 = r2;
        r3.L$2 = null;
        r3.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024d, code lost:
        if (r11.mo114786E(r2, (com.carrefour.fid.android.presentation.models.OfferProductModel) r10, r3) != r4) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0250, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0251, code lost:
        r3.L$0 = r1;
        r3.L$1 = null;
        r3.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025c, code lost:
        if (r1.mo114785D(r2, r3) != r4) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025f, code lost:
        r2 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114801j(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferModel r19, boolean r20, @org.jetbrains.annotations.C12580l java.lang.Integer r21, boolean r22, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r23
            boolean r3 = r2 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToBasket$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToBasket$1 r3 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToBasket$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToBasket$1 r3 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$addProductToBasket$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r3.label
            r6 = 3
            r7 = 1
            r8 = 0
            r9 = 0
            switch(r5) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x009d;
                case 2: goto L_0x0098;
                case 3: goto L_0x0098;
                case 4: goto L_0x007a;
                case 5: goto L_0x0062;
                case 6: goto L_0x0053;
                case 7: goto L_0x0049;
                case 8: goto L_0x003b;
                case 9: goto L_0x0035;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            kotlin.C11661u0.m45747n(r2)
            r2 = r8
            goto L_0x0297
        L_0x003b:
            java.lang.Object r1 = r3.L$1
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r5 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r5 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r5
            kotlin.C11661u0.m45747n(r2)
            r2 = r8
            goto L_0x0282
        L_0x0049:
            java.lang.Object r1 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r1 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r1
            kotlin.C11661u0.m45747n(r2)
            r2 = r6
            goto L_0x0260
        L_0x0053:
            java.lang.Object r1 = r3.L$1
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            java.lang.Object r5 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r5 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r5
            kotlin.C11661u0.m45747n(r2)
            r2 = r1
            r1 = r5
            goto L_0x0251
        L_0x0062:
            boolean r1 = r3.Z$0
            java.lang.Object r5 = r3.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
            java.lang.Object r10 = r3.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r10 = (com.carrefour.fid.android.presentation.models.OfferModel) r10
            java.lang.Object r11 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r11 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r11
            kotlin.C11661u0.m45747n(r2)
            r17 = r5
            r5 = r2
            r2 = r17
            goto L_0x021b
        L_0x007a:
            int r1 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r10 = r3.L$2
            com.carrefour.fid.android.presentation.models.OfferProductModel r10 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r10
            java.lang.Object r11 = r3.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r11 = (com.carrefour.fid.android.presentation.models.OfferModel) r11
            java.lang.Object r12 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r12 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r12
            kotlin.C11661u0.m45747n(r2)
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            r6 = r10
            r10 = r5
            r5 = r12
            goto L_0x01e5
        L_0x0098:
            kotlin.C11661u0.m45747n(r2)
            goto L_0x0157
        L_0x009d:
            boolean r1 = r3.Z$1
            boolean r5 = r3.Z$0
            java.lang.Object r10 = r3.L$3
            com.carrefour.fid.android.presentation.models.OfferProductModel r10 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r10
            java.lang.Object r11 = r3.L$2
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r12 = r3.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r12 = (com.carrefour.fid.android.presentation.models.OfferModel) r12
            java.lang.Object r13 = r3.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r13 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r13
            kotlin.C11661u0.m45747n(r2)
            r17 = r10
            r10 = r5
            r5 = r17
            goto L_0x012e
        L_0x00bb:
            kotlin.C11661u0.m45747n(r2)
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r2 != 0) goto L_0x00c7
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            return r1
        L_0x00c7:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.utils.n<java.util.List<com.carrefour.fid.android.presentation.models.OfferModel>>> r2 = r0.f94605E0
            java.lang.Object r2 = r2.getValue()
            com.carrefour.fid.android.utils.n r2 = (com.carrefour.fid.android.utils.C22719n) r2
            java.lang.Object r2 = r2.mo67135c()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0100
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00dd:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00fc
            java.lang.Object r5 = r2.next()
            r10 = r5
            com.carrefour.fid.android.presentation.models.OfferModel r10 = (com.carrefour.fid.android.presentation.models.OfferModel) r10
            long r10 = r10.mo121471id()
            long r12 = r19.mo121471id()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00f8
            r10 = r7
            goto L_0x00f9
        L_0x00f8:
            r10 = r8
        L_0x00f9:
            if (r10 == 0) goto L_0x00dd
            goto L_0x00fd
        L_0x00fc:
            r5 = r9
        L_0x00fd:
            com.carrefour.fid.android.presentation.models.OfferModel r5 = (com.carrefour.fid.android.presentation.models.OfferModel) r5
            goto L_0x0101
        L_0x0100:
            r5 = r9
        L_0x0101:
            boolean r2 = r5 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r2 == 0) goto L_0x0108
            com.carrefour.fid.android.presentation.models.OfferProductModel r5 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r5
            goto L_0x0109
        L_0x0108:
            r5 = r9
        L_0x0109:
            if (r5 != 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r5.mo121729G1(r7)
        L_0x010f:
            r3.L$0 = r0
            r3.L$1 = r1
            r2 = r21
            r3.L$2 = r2
            r3.L$3 = r5
            r10 = r20
            r3.Z$0 = r10
            r11 = r22
            r3.Z$1 = r11
            r3.label = r7
            java.lang.Object r12 = r0.mo114795c(r3)
            if (r12 != r4) goto L_0x012a
            return r4
        L_0x012a:
            r13 = r0
            r12 = r1
            r1 = r11
            r11 = r2
        L_0x012e:
            com.carrefour.fid.android.shared.network.c r2 = r13.f94630z
            boolean r2 = r2.mo83873b()
            if (r2 != 0) goto L_0x015a
            if (r5 != 0) goto L_0x0139
            goto L_0x013c
        L_0x0139:
            r5.mo121729G1(r8)
        L_0x013c:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r1 = r13.f94612L0
            com.carrefour.fid.android.shared.io.NetworkException r2 = new com.carrefour.fid.android.shared.io.NetworkException
            java.lang.String r5 = "Network exception"
            r6 = 2
            r2.<init>(r5, r9, r6, r9)
            r3.L$0 = r9
            r3.L$1 = r9
            r3.L$2 = r9
            r3.L$3 = r9
            r3.label = r6
            java.lang.Object r1 = r1.emit(r2, r3)
            if (r1 != r4) goto L_0x0157
            return r4
        L_0x0157:
            r7 = r8
            goto L_0x0298
        L_0x015a:
            r2 = r12
            com.carrefour.fid.android.presentation.models.OfferProductModel r2 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r2
            java.lang.Boolean r14 = com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159556E(r2)
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            if (r14 == 0) goto L_0x0189
            if (r5 != 0) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            r5.mo121729G1(r8)
        L_0x0171:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r1 = r13.f94612L0
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r5 = new com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable
            r5.<init>(r2)
            r3.L$0 = r9
            r3.L$1 = r9
            r3.L$2 = r9
            r3.L$3 = r9
            r3.label = r6
            java.lang.Object r1 = r1.emit(r5, r3)
            if (r1 != r4) goto L_0x0157
            return r4
        L_0x0189:
            int r14 = r2.mo121519p0()
            if (r11 == 0) goto L_0x0197
            int r1 = r11.intValue()
            r2.mo121513j2(r1)
            goto L_0x01a0
        L_0x0197:
            if (r1 == 0) goto L_0x01a0
            int r1 = com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159567P(r2)
            r2.mo121513j2(r1)
        L_0x01a0:
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r1 = r2.mo121502W()
            if (r1 != 0) goto L_0x01ab
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            return r1
        L_0x01ab:
            com.carrefour.fid.android.domain.interactors.basket.n0 r11 = r13.f94626v
            com.carrefour.fid.android.domain.interactors.basket.n0$a r15 = new com.carrefour.fid.android.domain.interactors.basket.n0$a
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            java.lang.String r16 = r1.mo115986f()
            java.lang.String r8 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r16)
            java.lang.String r1 = r1.mo115984e()
            java.lang.String r1 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r1)
            r6.<init>(r8, r1, r9)
            int r1 = r2.mo121519p0()
            r15.<init>(r6, r1, r7)
            r3.L$0 = r13
            r3.L$1 = r12
            r3.L$2 = r5
            r3.L$3 = r9
            r3.Z$0 = r10
            r3.I$0 = r14
            r1 = 4
            r3.label = r1
            java.lang.Object r2 = r11.m172966invokegIAlus(r15, r3)
            if (r2 != r4) goto L_0x01e1
            return r4
        L_0x01e1:
            r6 = r5
            r11 = r12
            r5 = r13
            r1 = r14
        L_0x01e5:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r2)
            if (r8 != 0) goto L_0x0264
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2
            if (r6 != 0) goto L_0x01f0
            goto L_0x01f4
        L_0x01f0:
            r1 = 0
            r6.mo121729G1(r1)
        L_0x01f4:
            r1 = r11
            com.carrefour.fid.android.presentation.models.OfferProductModel r1 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r1
            boolean r6 = com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159555D(r1)
            if (r6 == 0) goto L_0x0202
            com.carrefour.fid.android.presentation.models.OfferNotificationType r6 = com.carrefour.fid.android.presentation.models.OfferNotificationType.PROMO_MIXED
            r1.mo121507c2(r6)
        L_0x0202:
            r3.L$0 = r5
            r3.L$1 = r11
            r3.L$2 = r2
            r3.Z$0 = r10
            r1 = 5
            r3.label = r1
            java.lang.Object r1 = r5.mo114788G(r3)
            if (r1 != r4) goto L_0x0214
            return r4
        L_0x0214:
            r17 = r5
            r5 = r1
            r1 = r10
            r10 = r11
            r11 = r17
        L_0x021b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x023e
            r5 = r10
            com.carrefour.fid.android.presentation.models.OfferProductModel r5 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r5
            int r6 = r5.mo121519p0()
            int r8 = com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt.m159585g(r5)
            if (r6 != r8) goto L_0x023e
            if (r1 == 0) goto L_0x023a
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            r5.mo121745l2(r1)
            goto L_0x023e
        L_0x023a:
            r1 = 0
            r5.mo121746m2(r1)
        L_0x023e:
            com.carrefour.fid.android.presentation.models.OfferProductModel r10 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r10
            r3.L$0 = r11
            r3.L$1 = r2
            r3.L$2 = r9
            r1 = 6
            r3.label = r1
            java.lang.Object r1 = r11.mo114786E(r2, r10, r3)
            if (r1 != r4) goto L_0x0250
            return r4
        L_0x0250:
            r1 = r11
        L_0x0251:
            r3.L$0 = r1
            r3.L$1 = r9
            r5 = 7
            r3.label = r5
            java.lang.Object r2 = r1.mo114785D(r2, r3)
            if (r2 != r4) goto L_0x025f
            return r4
        L_0x025f:
            r2 = 3
        L_0x0260:
            com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r1, r9, r9, r2, r9)
            goto L_0x0298
        L_0x0264:
            r2 = 0
            if (r6 != 0) goto L_0x0268
            goto L_0x026b
        L_0x0268:
            r6.mo121729G1(r2)
        L_0x026b:
            com.carrefour.fid.android.presentation.models.OfferProductModel r11 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r11
            r11.mo121513j2(r1)
            r3.L$0 = r5
            r3.L$1 = r8
            r3.L$2 = r9
            r1 = 8
            r3.label = r1
            java.lang.Object r1 = r5.mo114795c(r3)
            if (r1 != r4) goto L_0x0281
            return r4
        L_0x0281:
            r1 = r8
        L_0x0282:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r6 = r5.f94612L0
            java.lang.Throwable r1 = r5.mo114787F(r1)
            r3.L$0 = r9
            r3.L$1 = r9
            r5 = 9
            r3.label = r5
            java.lang.Object r1 = r6.emit(r1, r3)
            if (r1 != r4) goto L_0x0297
            return r4
        L_0x0297:
            r7 = r2
        L_0x0298:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114801j(com.carrefour.fid.android.presentation.models.OfferModel, boolean, java.lang.Integer, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114802k(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.OfferModel r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromShoppingList$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromShoppingList$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$removeProductFromShoppingList$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r2) {
                case 0: goto L_0x006d;
                case 1: goto L_0x005b;
                case 2: goto L_0x0057;
                case 3: goto L_0x0057;
                case 4: goto L_0x003d;
                case 5: goto L_0x002e;
                case 6: goto L_0x0057;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002e:
            java.lang.Object r11 = r0.L$2
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r2 = (com.carrefour.fid.android.presentation.models.OfferModel) r2
            java.lang.Object r3 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r3 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r3
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0139
        L_0x003d:
            java.lang.Object r11 = r0.L$2
            com.carrefour.fid.android.presentation.models.OfferProductModel r11 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r11
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r2 = (com.carrefour.fid.android.presentation.models.OfferModel) r2
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r6 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r6
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r9 = r12
            r12 = r11
        L_0x0054:
            r11 = r9
            goto L_0x011c
        L_0x0057:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00bb
        L_0x005b:
            java.lang.Object r11 = r0.L$2
            com.carrefour.fid.android.presentation.models.OfferProductModel r11 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r11
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r2 = (com.carrefour.fid.android.presentation.models.OfferModel) r2
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r6 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r6
            kotlin.C11661u0.m45747n(r12)
            r12 = r11
            r11 = r2
            goto L_0x0096
        L_0x006d:
            kotlin.C11661u0.m45747n(r12)
            boolean r12 = r11 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r12 != 0) goto L_0x0079
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            return r11
        L_0x0079:
            r12 = r11
            com.carrefour.fid.android.presentation.models.OfferProductModel r12 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r12
            com.carrefour.fid.android.presentation.models.OfferProductModel r12 = r10.mo114783B(r12)
            if (r12 != 0) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r12.mo121732M1(r3)
        L_0x0086:
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.label = r3
            java.lang.Object r2 = r10.mo114795c(r0)
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r6 = r10
        L_0x0096:
            com.carrefour.fid.android.account.data.repositories.LoginRepository r2 = r6.f94628x
            boolean r2 = com.carrefour.fid.android.account.data.extension.C13195a.m57178b(r2)
            if (r2 == 0) goto L_0x00be
            if (r12 != 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r12.mo121732M1(r4)
        L_0x00a4:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r11 = r6.f94612L0
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r12 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r12.<init>()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r2 = 2
            r0.label = r2
            java.lang.Object r11 = r11.emit(r12, r0)
            if (r11 != r1) goto L_0x00bb
            return r1
        L_0x00bb:
            r3 = r4
            goto L_0x017f
        L_0x00be:
            r2 = r11
            com.carrefour.fid.android.presentation.models.OfferProductModel r2 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r2
            com.carrefour.fid.android.presentation.models.ProductModel r7 = r2.mo121517o0()
            if (r7 == 0) goto L_0x00cc
            java.lang.String r7 = r7.mo121889s()
            goto L_0x00cd
        L_0x00cc:
            r7 = r5
        L_0x00cd:
            if (r7 != 0) goto L_0x00ee
            if (r12 != 0) goto L_0x00d2
            goto L_0x00d5
        L_0x00d2:
            r12.mo121732M1(r4)
        L_0x00d5:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r11 = r6.f94612L0
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r2 = "No product in offer!"
            r12.<init>(r2)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r2 = 3
            r0.label = r2
            java.lang.Object r11 = r11.emit(r12, r0)
            if (r11 != r1) goto L_0x00bb
            return r1
        L_0x00ee:
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.d r7 = r6.f94623e
            com.carrefour.fid.android.presentation.models.ProductModel r2 = r2.mo121517o0()
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = r2.mo121889s()
            goto L_0x00fc
        L_0x00fb:
            r2 = r5
        L_0x00fc:
            if (r2 != 0) goto L_0x0100
            java.lang.String r2 = ""
        L_0x0100:
            java.lang.String r2 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r2)
            com.carrefour.fid.android.domain.models.product.Gtin r2 = com.carrefour.fid.android.domain.models.product.Gtin.m157307a(r2)
            r0.L$0 = r6
            r0.L$1 = r11
            r0.L$2 = r12
            r8 = 4
            r0.label = r8
            java.lang.Object r2 = r7.m172966invokegIAlus(r2, r0)
            if (r2 != r1) goto L_0x0118
            return r1
        L_0x0118:
            r9 = r2
            r2 = r11
            goto L_0x0054
        L_0x011c:
            if (r12 != 0) goto L_0x011f
            goto L_0x0122
        L_0x011f:
            r12.mo121732M1(r4)
        L_0x0122:
            boolean r12 = kotlin.Result.m38709i(r11)
            if (r12 == 0) goto L_0x017a
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r11
            r12 = 5
            r0.label = r12
            java.lang.Object r12 = r6.mo114795c(r0)
            if (r12 != r1) goto L_0x0138
            return r1
        L_0x0138:
            r3 = r6
        L_0x0139:
            kotlinx.coroutines.flow.i<java.lang.Throwable> r12 = r3.f94612L0
            com.carrefour.fid.android.core.io.ShoppingListThrowable r3 = new com.carrefour.fid.android.core.io.ShoppingListThrowable
            com.carrefour.fid.android.presentation.models.OfferProductModel r2 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r2
            com.carrefour.fid.android.presentation.models.ProductModel r2 = r2.mo121517o0()
            if (r2 == 0) goto L_0x014a
            java.lang.String r2 = r2.mo121889s()
            goto L_0x014b
        L_0x014a:
            r2 = r5
        L_0x014b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failure for removeFromShoppingList "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.Throwable r11 = kotlin.Result.m38705e(r11)
            if (r11 != 0) goto L_0x0167
            java.lang.Throwable r11 = new java.lang.Throwable
            r11.<init>()
        L_0x0167:
            r3.<init>(r2, r11)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r11 = 6
            r0.label = r11
            java.lang.Object r11 = r12.emit(r3, r0)
            if (r11 != r1) goto L_0x00bb
            return r1
        L_0x017a:
            com.carrefour.fid.android.core.types.RequestType r11 = com.carrefour.fid.android.core.types.RequestType.ONLINE
            com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r6, r5, r11, r3, r5)
        L_0x017f:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114802k(com.carrefour.fid.android.presentation.models.OfferModel, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114803l(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r21, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.core.types.RequestType r22, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.offer.AvailableType r23, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.offer.UnavailableType r24, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r25
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$getOfferListDetail$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$getOfferListDetail$1 r2 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$getOfferListDetail$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$getOfferListDetail$1 r2 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$getOfferListDetail$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x00ad
            if (r4 == r9) goto L_0x00a5
            if (r4 == r8) goto L_0x007f
            if (r4 == r7) goto L_0x005e
            if (r4 == r6) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r2 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x01bc
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            java.lang.Object r4 = r2.L$4
            java.lang.Object r6 = r2.L$3
            com.carrefour.fid.android.domain.models.offer.UnavailableType r6 = (com.carrefour.fid.android.domain.models.offer.UnavailableType) r6
            java.lang.Object r7 = r2.L$2
            com.carrefour.fid.android.domain.models.offer.AvailableType r7 = (com.carrefour.fid.android.domain.models.offer.AvailableType) r7
            java.lang.Object r8 = r2.L$1
            com.carrefour.fid.android.core.types.RequestType r8 = (com.carrefour.fid.android.core.types.RequestType) r8
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r11 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r11
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0173
        L_0x005e:
            java.lang.Object r4 = r2.L$3
            com.carrefour.fid.android.domain.models.offer.UnavailableType r4 = (com.carrefour.fid.android.domain.models.offer.UnavailableType) r4
            java.lang.Object r7 = r2.L$2
            com.carrefour.fid.android.domain.models.offer.AvailableType r7 = (com.carrefour.fid.android.domain.models.offer.AvailableType) r7
            java.lang.Object r8 = r2.L$1
            com.carrefour.fid.android.core.types.RequestType r8 = (com.carrefour.fid.android.core.types.RequestType) r8
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r11 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r11
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r19 = r4
            r4 = r1
            r1 = r8
            r8 = r19
            goto L_0x014e
        L_0x007f:
            java.lang.Object r4 = r2.L$5
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r8 = r2.L$4
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r8 = (com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase) r8
            java.lang.Object r11 = r2.L$3
            com.carrefour.fid.android.domain.models.offer.UnavailableType r11 = (com.carrefour.fid.android.domain.models.offer.UnavailableType) r11
            java.lang.Object r12 = r2.L$2
            com.carrefour.fid.android.domain.models.offer.AvailableType r12 = (com.carrefour.fid.android.domain.models.offer.AvailableType) r12
            java.lang.Object r13 = r2.L$1
            com.carrefour.fid.android.core.types.RequestType r13 = (com.carrefour.fid.android.core.types.RequestType) r13
            java.lang.Object r14 = r2.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r14 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r14
            kotlin.C11661u0.m45747n(r1)
            r15 = r8
            r8 = r11
            r11 = r1
            r1 = r13
            r19 = r12
            r12 = r4
            r4 = r19
            goto L_0x0117
        L_0x00a5:
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r2 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x00e7
        L_0x00ad:
            kotlin.C11661u0.m45747n(r1)
            kotlinx.coroutines.flow.j<java.lang.Boolean> r1 = r0.f94614N0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c1
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00c1:
            com.carrefour.fid.android.performance.d r1 = r0.f94618Z
            java.lang.String r4 = "get_offer_list"
            r1.mo121195d(r4)
            r20.mo114790I()
            boolean r1 = r21.isEmpty()
            if (r1 == 0) goto L_0x00ef
            r20.mo114791J()
            kotlinx.coroutines.flow.i<java.lang.Throwable> r1 = r0.f94612L0
            com.carrefour.fid.android.shared.io.EmptyListThrowable r4 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r4.<init>()
            r2.L$0 = r0
            r2.label = r9
            java.lang.Object r1 = r1.emit(r4, r2)
            if (r1 != r3) goto L_0x00e6
            return r3
        L_0x00e6:
            r2 = r0
        L_0x00e7:
            com.carrefour.fid.android.performance.d r1 = r2.f94618Z
            r1.mo121196e()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00ef:
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase r1 = r0.f94619a
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r4 = r0.f94629y
            r2.L$0 = r0
            r11 = r22
            r2.L$1 = r11
            r12 = r23
            r2.L$2 = r12
            r13 = r24
            r2.L$3 = r13
            r2.L$4 = r1
            r14 = r21
            r2.L$5 = r14
            r2.label = r8
            java.lang.Object r4 = r4.hasLoyaltyCard(r2)
            if (r4 != r3) goto L_0x0110
            return r3
        L_0x0110:
            r15 = r1
            r1 = r11
            r8 = r13
            r11 = r4
            r4 = r12
            r12 = r14
            r14 = r0
        L_0x0117:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r13 = r11.booleanValue()
            r16 = 0
            r17 = 4
            r18 = 0
            com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a r11 = new com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase$a
            r21 = r11
            r11 = r21
            r9 = r14
            r14 = r16
            r5 = r15
            r15 = r17
            r16 = r18
            r11.<init>(r12, r13, r14, r15, r16)
            r2.L$0 = r9
            r2.L$1 = r1
            r2.L$2 = r4
            r2.L$3 = r8
            r2.L$4 = r10
            r2.L$5 = r10
            r2.label = r7
            r7 = r21
            java.lang.Object r5 = r5.m172988invokegIAlus(r7, r2)
            if (r5 != r3) goto L_0x014b
            return r3
        L_0x014b:
            r7 = r4
            r4 = r5
            r11 = r9
        L_0x014e:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r4)
            if (r5 == 0) goto L_0x0175
            r11.mo114791J()
            com.carrefour.fid.android.performance.d r9 = r11.f94618Z
            r9.mo121196e()
            kotlinx.coroutines.flow.i<java.lang.Throwable> r9 = r11.f94612L0
            r2.L$0 = r11
            r2.L$1 = r1
            r2.L$2 = r7
            r2.L$3 = r8
            r2.L$4 = r4
            r2.label = r6
            java.lang.Object r5 = r9.emit(r5, r2)
            if (r5 != r3) goto L_0x0171
            return r3
        L_0x0171:
            r6 = r8
            r8 = r1
        L_0x0173:
            r1 = r8
            r8 = r6
        L_0x0175:
            boolean r5 = kotlin.Result.m38710j(r4)
            if (r5 == 0) goto L_0x01c6
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper r6 = r11.f94621c
            com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper$AvailableType r7 = com.carrefour.fid.android.presentation.models.extension.C38475k.m159636a(r7)
            com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper$UnavailableType r8 = com.carrefour.fid.android.presentation.models.extension.C38475k.m159637b(r8)
            java.util.List r5 = r6.mo122117a(r5, r7, r8)
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x019a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0198
            goto L_0x019a
        L_0x0198:
            r9 = 0
            goto L_0x019b
        L_0x019a:
            r9 = 1
        L_0x019b:
            if (r9 == 0) goto L_0x01be
            r11.mo114791J()
            kotlinx.coroutines.flow.i<java.lang.Throwable> r1 = r11.f94612L0
            com.carrefour.fid.android.shared.io.EmptyListThrowable r5 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r5.<init>()
            r2.L$0 = r11
            r2.L$1 = r4
            r2.L$2 = r10
            r2.L$3 = r10
            r2.L$4 = r10
            r4 = 5
            r2.label = r4
            java.lang.Object r1 = r1.emit(r5, r2)
            if (r1 != r3) goto L_0x01bb
            return r3
        L_0x01bb:
            r2 = r11
        L_0x01bc:
            r11 = r2
            goto L_0x01c1
        L_0x01be:
            r11.mo114792K(r5, r1)
        L_0x01c1:
            com.carrefour.fid.android.performance.d r1 = r11.f94618Z
            r1.mo121196e()
        L_0x01c6:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114803l(java.util.List, com.carrefour.fid.android.core.types.RequestType, com.carrefour.fid.android.domain.models.offer.AvailableType, com.carrefour.fid.android.domain.models.offer.UnavailableType, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: m */
    public C11944n<OfferModel> mo114804m() {
        return this.f94611K0;
    }

    @C12580l
    /* renamed from: n */
    public Object mo114805n(@C12579k C11045c<? super C11079d2> cVar) {
        Object h = StateEventKt.m102787h(this.f94605E0, CollectionsKt__CollectionsKt.m40441E(), cVar);
        return h == C11063b.m42612h() ? h : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: o */
    public C11952u<C22719n<List<OfferModel>>> mo114806o() {
        return this.f94606F0;
    }

    /* renamed from: p */
    public void mo114807p(@C12579k OfferModel offerModel) {
        Intrinsics.checkNotNullParameter(offerModel, "product");
        if (offerModel instanceof OfferProductModel) {
            ((OfferProductModel) offerModel).mo121745l2(Boolean.FALSE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo114808q(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.presentation.models.OfferModel r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$refreshBasketFromCache$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$refreshBasketFromCache$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$refreshBasketFromCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$refreshBasketFromCache$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl$refreshBasketFromCache$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r6) goto L_0x0049
            if (r2 == r4) goto L_0x003d
            if (r2 == r5) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0038:
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00ed
        L_0x003d:
            java.lang.Object r14 = r0.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r14 = (com.carrefour.fid.android.presentation.models.OfferModel) r14
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r2 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r2
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0086
        L_0x0049:
            java.lang.Object r14 = r0.L$1
            com.carrefour.fid.android.presentation.models.OfferModel r14 = (com.carrefour.fid.android.presentation.models.OfferModel) r14
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl r2 = (com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl) r2
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x0071
        L_0x005b:
            kotlin.C11661u0.m45747n(r15)
            r13.mo114789H()
            com.carrefour.fid.android.domain.interactors.basket.e0 r15 = r13.f94625g
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r6
            java.lang.Object r15 = r15.m172965invokeIoAF18A(r0)
            if (r15 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r2 = r13
        L_0x0071:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r15)
            if (r8 != 0) goto L_0x00db
            com.carrefour.fid.android.domain.models.basket.Basket r15 = (com.carrefour.fid.android.domain.models.basket.Basket) r15
            r0.L$0 = r2
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r15 = r2.mo114785D(r15, r0)
            if (r15 != r1) goto L_0x0086
            return r1
        L_0x0086:
            com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154592d(r2, r7, r7, r5, r7)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.utils.n<java.util.List<com.carrefour.fid.android.presentation.models.OfferModel>>> r15 = r2.f94605E0
            java.lang.Object r15 = r15.getValue()
            com.carrefour.fid.android.utils.n r15 = (com.carrefour.fid.android.utils.C22719n) r15
            java.lang.Object r15 = r15.mo67135c()
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto L_0x00c3
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x009f:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x00bf
            java.lang.Object r3 = r15.next()
            r4 = r3
            com.carrefour.fid.android.presentation.models.OfferModel r4 = (com.carrefour.fid.android.presentation.models.OfferModel) r4
            r8 = 0
            if (r14 == 0) goto L_0x00bc
            long r9 = r4.mo121471id()
            long r11 = r14.mo121471id()
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x00bc
            r8 = r6
        L_0x00bc:
            if (r8 == 0) goto L_0x009f
            goto L_0x00c0
        L_0x00bf:
            r3 = r7
        L_0x00c0:
            com.carrefour.fid.android.presentation.models.OfferModel r3 = (com.carrefour.fid.android.presentation.models.OfferModel) r3
            goto L_0x00c4
        L_0x00c3:
            r3 = r7
        L_0x00c4:
            boolean r14 = r3 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r14 == 0) goto L_0x00cb
            com.carrefour.fid.android.presentation.models.OfferProductModel r3 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r3
            goto L_0x00cc
        L_0x00cb:
            r3 = r7
        L_0x00cc:
            if (r3 == 0) goto L_0x00ed
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r14 = r2.mo114784C(r3, r0)
            if (r14 != r1) goto L_0x00ed
            return r1
        L_0x00db:
            r2.mo114782A()
            kotlinx.coroutines.flow.i<java.lang.Throwable> r14 = r2.f94612L0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r14 = r14.emit(r8, r0)
            if (r14 != r1) goto L_0x00ed
            return r1
        L_0x00ed:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.OfferListAndBasketControllerImpl.mo114808q(com.carrefour.fid.android.presentation.models.OfferModel, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: r */
    public C11952u<C22719n<Basket>> mo114809r() {
        return this.f94609I0;
    }
}
