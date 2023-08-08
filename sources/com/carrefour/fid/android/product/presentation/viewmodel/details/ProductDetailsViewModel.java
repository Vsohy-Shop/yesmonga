package com.carrefour.fid.android.product.presentation.viewmodel.details;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.exceptions.BasketItemMaxQuantityReachedThrowable;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.criteo.C37670i;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.product.C37758g;
import com.carrefour.fid.android.domain.interactors.product.C37778p;
import com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.criteo.C38005g;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.product.presentation.analytics.C27636f;
import com.carrefour.fid.android.product.presentation.analytics.C27637g;
import com.carrefour.fid.android.product.presentation.models.ProductImagesModel;
import com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.paging.C28850b;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11945o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\\\b\u0007\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010U\u001a\u00020S\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010`\u001a\u00020^\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010t\u001a\u00020sø\u0001\u0000¢\u0006\u0004\bu\u0010vJ#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010\"\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JI\u0010$\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0007H@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%JI\u0010&\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0007H@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010%J+\u0010*\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J-\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020\u001bH\u0002J\u001d\u00103\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b3\u00104J1\u00106\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u001bH@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0011\u0010=\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001J\u0011\u0010>\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001J\t\u0010?\u001a\u00020\tH\u0001J\t\u0010@\u001a\u00020\tH\u0001J\u0011\u0010A\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001J\u0011\u0010B\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001J\u0011\u0010C\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001J\u001b\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0017\u0010N\u001a\u00020K8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bL\u0010MR\u0017\u0010R\u001a\u00020O8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bP\u0010QR\u0017\u0010U\u001a\u00020S8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bB\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010k\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00140l8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020p0l8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010n\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006w"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/details/ProductDetailsViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/mvi/b$b;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/mvi/b$c;", "Lcom/carrefour/fid/android/product/presentation/analytics/f;", "Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "id", "", "shouldUpdateOffer", "Lkotlin/d2;", "y0", "(Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "", "storeService", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "gtins", "isSyncingInBasket", "w0", "(Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/offer/Offer;", "offer", "x0", "(Lcom/carrefour/fid/android/domain/models/offer/Offer;Lkotlin/coroutines/c;)Ljava/lang/Object;", "gtin", "Lcom/carrefour/fid/android/domain/models/product/ProductReference;", "ref", "", "oldQuantity", "newQuantity", "", "displayablePrice", "isMaxQuantityReached", "isCriteoProduct", "u0", "(Ljava/lang/String;Ljava/lang/String;IIDZZLkotlin/coroutines/c;)Ljava/lang/Object;", "C0", "(Ljava/lang/String;Ljava/lang/String;IIDZLkotlin/coroutines/c;)Ljava/lang/Object;", "H0", "isInShoppingList", "Lcom/carrefour/fid/android/domain/models/favorites/shoppinglist/c;", "shoppingListParam", "v0", "(ZLcom/carrefour/fid/android/domain/models/favorites/shoppinglist/c;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "z0", "(Lcom/carrefour/fid/android/domain/models/basket/Basket;Ljava/lang/String;I)V", "imagePosition", "A0", "trackingUrl", "F0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "diffQuantity", "G0", "(Ljava/lang/String;DILkotlin/coroutines/c;)Ljava/lang/Object;", "E0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "quantity", "D0", "(ILkotlin/coroutines/c;)Ljava/lang/Object;", "W", "g", "U", "S", "B", "d", "j", "intent", "B0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/details/mvi/b$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "a", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/GetOldProductFlowUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/product/GetOldProductFlowUseCase;", "getOldProductFlowUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/p;", "c", "Lcom/carrefour/fid/android/domain/interactors/product/p;", "getPlpFlowUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/g;", "Lcom/carrefour/fid/android/domain/interactors/product/g;", "getConsolidatedCriteoProductsFlowUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "e", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "trackingCriteoUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/i;", "f", "Lcom/carrefour/fid/android/domain/interactors/criteo/i;", "sendCriteoEventUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "updateBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;", "h", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;", "addProductToShoppingListUseCase", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;", "i", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;", "removeProductFromShoppingListUseCase", "k", "Z", "isCriteoAlreadyTracked", "Lkotlinx/coroutines/flow/i;", "l", "Lkotlinx/coroutines/flow/i;", "_offerProductDetails", "Lcom/carrefour/fid/android/domain/models/criteo/g;", "m", "_criteoResult", "Lcom/carrefour/fid/android/product/presentation/analytics/g;", "tracking", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/product/GetOldProductFlowUseCase;Lcom/carrefour/fid/android/domain/interactors/product/p;Lcom/carrefour/fid/android/domain/interactors/product/g;Lcom/carrefour/fid/android/domain/interactors/criteo/j;Lcom/carrefour/fid/android/domain/interactors/criteo/i;Lcom/carrefour/fid/android/domain/interactors/basket/n0;Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;Lcom/carrefour/fid/android/product/presentation/analytics/g;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nProductDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailsViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/details/ProductDetailsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,428:1\n1#2:429\n1855#3,2:430\n1549#3:432\n1620#3,3:433\n*S KotlinDebug\n*F\n+ 1 ProductDetailsViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/details/ProductDetailsViewModel\n*L\n337#1:430,2\n367#1:432\n367#1:433,3\n*E\n"})
public final class ProductDetailsViewModel extends BaseMVIViewModel<C28135b.C28140b, C28135b.C28151c> implements C27636f {
    @C12579k

    /* renamed from: a */
    public final C37823k f68092a;
    @C12579k

    /* renamed from: b */
    public final GetOldProductFlowUseCase f68093b;
    @C12579k

    /* renamed from: c */
    public final C37778p f68094c;
    @C12579k

    /* renamed from: d */
    public final C37758g f68095d;
    @C12579k

    /* renamed from: e */
    public final C37672j f68096e;
    @C12579k

    /* renamed from: f */
    public final C37670i f68097f;
    @C12579k

    /* renamed from: g */
    public final C37588n0 f68098g;
    @C12579k

    /* renamed from: h */
    public final C37680a f68099h;
    @C12579k

    /* renamed from: i */
    public final C37684e f68100i;

    /* renamed from: j */
    public final /* synthetic */ C27637g f68101j;

    /* renamed from: k */
    public boolean f68102k;
    @C12579k

    /* renamed from: l */
    public final C11911i<Offer> f68103l;
    @C12579k

    /* renamed from: m */
    public final C11911i<C38005g> f68104m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ProductDetailsViewModel(@C12579k C37823k kVar, @C12579k GetOldProductFlowUseCase getOldProductFlowUseCase, @C12579k C37778p pVar, @C12579k C37758g gVar, @C12579k C37672j jVar, @C12579k C37670i iVar, @C12579k C37588n0 n0Var, @C12579k C37680a aVar, @C12579k C37684e eVar, @C12579k C27637g gVar2) {
        super(C28135b.C28140b.C28143c.f68148b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        C37823k kVar2 = kVar;
        GetOldProductFlowUseCase getOldProductFlowUseCase2 = getOldProductFlowUseCase;
        C37778p pVar2 = pVar;
        C37758g gVar3 = gVar;
        C37672j jVar2 = jVar;
        C37670i iVar2 = iVar;
        C37588n0 n0Var2 = n0Var;
        C37680a aVar2 = aVar;
        C37684e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(kVar2, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(getOldProductFlowUseCase2, "getOldProductFlowUseCase");
        Intrinsics.checkNotNullParameter(pVar2, "getPlpFlowUseCase");
        Intrinsics.checkNotNullParameter(gVar3, "getConsolidatedCriteoProductsFlowUseCase");
        Intrinsics.checkNotNullParameter(jVar2, "trackingCriteoUseCase");
        Intrinsics.checkNotNullParameter(iVar2, "sendCriteoEventUseCase");
        Intrinsics.checkNotNullParameter(n0Var2, "updateBasketUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "addProductToShoppingListUseCase");
        Intrinsics.checkNotNullParameter(eVar2, "removeProductFromShoppingListUseCase");
        Intrinsics.checkNotNullParameter(gVar2, "tracking");
        this.f68092a = kVar2;
        this.f68093b = getOldProductFlowUseCase2;
        this.f68094c = pVar2;
        this.f68095d = gVar3;
        this.f68096e = jVar2;
        this.f68097f = iVar2;
        this.f68098g = n0Var2;
        this.f68099h = aVar2;
        this.f68100i = eVar2;
        this.f68101j = gVar2;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.f68103l = C11945o.m47609a(1, 0, bufferOverflow);
        this.f68104m = C11945o.m47609a(1, 0, bufferOverflow);
    }

    /* renamed from: A0 */
    public final void mo81712A0(int i) {
        Iterable<ProductPicture> Q = ((Offer) CollectionsKt___CollectionsKt.m40706w2(this.f68103l.mo24203d())).mo118010S().mo118416Q();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(Q, 10));
        for (ProductPicture e : Q) {
            arrayList.add(e.mo118573e());
        }
        emitEvent(new C28135b.C28136a.C28138b(new ProductImagesModel(arrayList, i)));
    }

    /* renamed from: B */
    public void mo80277B(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        this.f68101j.mo80277B(offer);
    }

    @C12580l
    /* renamed from: B0 */
    public Object processIntent(@C12579k C28135b.C28151c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        Offer offer;
        Discount T;
        if (cVar instanceof C28135b.C28151c.C28155d) {
            C28135b.C28151c.C28155d dVar = (C28135b.C28151c.C28155d) cVar;
            Object y0 = mo81724y0(dVar.mo81847e(), dVar.mo81849f(), cVar2);
            if (y0 == C11063b.m42612h()) {
                return y0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C28135b.C28151c.C28154c) {
            Object x0 = mo81723x0(((C28135b.C28151c.C28154c) cVar).mo81840d(), cVar2);
            if (x0 == C11063b.m42612h()) {
                return x0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C28135b.C28151c.C28152a) {
            C28135b.C28151c.C28152a aVar = (C28135b.C28151c.C28152a) cVar;
            Object u0 = mo81720u0(aVar.mo81821k(), aVar.mo81824n(), aVar.mo81823m(), aVar.mo81822l(), aVar.mo81820j(), aVar.mo81826p(), aVar.mo81825o(), cVar2);
            if (u0 == C11063b.m42612h()) {
                return u0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C28135b.C28151c.C28158g) {
            C28135b.C28151c.C28158g gVar = (C28135b.C28151c.C28158g) cVar;
            Object C0 = mo81714C0(gVar.mo81868j(), gVar.mo81871m(), gVar.mo81870l(), gVar.mo81869k(), gVar.mo81867i(), gVar.mo81872n(), cVar2);
            if (C0 == C11063b.m42612h()) {
                return C0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C28135b.C28151c.C28153b) {
            C28135b.C28151c.C28153b bVar = (C28135b.C28151c.C28153b) cVar;
            Object v0 = mo81721v0(bVar.mo81835h(), bVar.mo81833f(), bVar.mo81834g(), cVar2);
            if (v0 == C11063b.m42612h()) {
                return v0;
            }
            return C11079d2.f28267a;
        } else {
            if (cVar instanceof C28135b.C28151c.C28157f) {
                mo81712A0(((C28135b.C28151c.C28157f) cVar).mo81854d());
            } else if (cVar instanceof C28135b.C28151c.C28159h) {
                Object F0 = mo81717F0(((C28135b.C28151c.C28159h) cVar).mo81876d(), cVar2);
                if (F0 == C11063b.m42612h()) {
                    return F0;
                }
                return C11079d2.f28267a;
            } else if (!(!Intrinsics.areEqual((Object) cVar, (Object) C28135b.C28151c.C28156e.f68181a) || (offer = (Offer) CollectionsKt___CollectionsKt.m40479B2(this.f68103l.mo24203d())) == null || (T = offer.mo118011T()) == null)) {
                List<Gtin> w = T.mo117984w();
                if (w == null) {
                    w = CollectionsKt__CollectionsKt.m40441E();
                }
                emitEvent(new C28135b.C28136a.C28139c(w, T.mo117986x()));
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: C0 */
    public final Object mo81714C0(String str, String str2, int i, int i2, double d, boolean z, C11045c<? super C11079d2> cVar) {
        if (i2 < 0) {
            return C11079d2.f28267a;
        }
        Object H0 = mo81719H0(str, str2, i, i2, d, z, cVar);
        if (H0 == C11063b.m42612h()) {
            return H0;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81715D0(int r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnBasketChange$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnBasketChange$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnBasketChange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnBasketChange$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnBasketChange$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.domain.models.criteo.g r6 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r6
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0082
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            kotlin.C11661u0.m45747n(r7)
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.domain.models.criteo.g> r7 = r5.f68104m
            java.util.List r7 = r7.mo24203d()
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r7)
            com.carrefour.fid.android.domain.models.criteo.g r7 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r7
            if (r7 == 0) goto L_0x0082
            java.util.List r2 = r7.mo117432a()
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r2)
            com.carrefour.fid.android.domain.models.criteo.n r2 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r2
            if (r2 == 0) goto L_0x0082
            java.lang.String r2 = r2.mo117554j()
            if (r2 == 0) goto L_0x0082
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r4 = "quantity"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            android.net.Uri$Builder r6 = r2.appendQueryParameter(r4, r6)
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "parse(it)\n              …              .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r5.mo81717F0(r6, r0)
            if (r6 != r1) goto L_0x0082
            return r1
        L_0x0082:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81715D0(int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81716E0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnWishlist$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnWishlist$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnWishlist$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnWishlist$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoProductOnWishlist$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.criteo.g r0 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0063
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.domain.models.criteo.g> r5 = r4.f68104m
            java.util.List r5 = r5.mo24203d()
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r5)
            com.carrefour.fid.android.domain.models.criteo.g r5 = (com.carrefour.fid.android.domain.models.criteo.C38005g) r5
            if (r5 == 0) goto L_0x0063
            java.util.List r2 = r5.mo117432a()
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r2)
            com.carrefour.fid.android.domain.models.criteo.n r2 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r2
            if (r2 == 0) goto L_0x0057
            java.lang.String r2 = r2.mo117558n()
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = r4.mo81717F0(r2, r0)
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81716E0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81717F0(java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoTracking$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoTracking$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoTracking$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoTracking$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendCriteoTracking$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            if (r5 == 0) goto L_0x004f
            com.carrefour.fid.android.domain.interactors.criteo.j r6 = r4.f68096e
            com.carrefour.fid.android.domain.interactors.criteo.j$a r2 = new com.carrefour.fid.android.domain.interactors.criteo.j$a
            r2.<init>(r5, r3)
            r0.label = r3
            java.lang.Object r5 = r6.m172966invokegIAlus(r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            kotlin.Result.m38701a(r5)
        L_0x004f:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81717F0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81718G0(java.lang.String r25, double r26, int r28, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r29) {
        /*
            r24 = this;
            r0 = r24
            r1 = r29
            boolean r2 = r1 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendUpdateBasketEvent$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendUpdateBasketEvent$1 r2 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendUpdateBasketEvent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendUpdateBasketEvent$1 r2 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$sendUpdateBasketEvent$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            goto L_0x0082
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.criteo.i r1 = r0.f68097f
            com.carrefour.fid.android.domain.interactors.criteo.i$a r4 = new com.carrefour.fid.android.domain.interactors.criteo.i$a
            com.carrefour.fid.android.domain.models.criteo.CriteoEventType r8 = com.carrefour.fid.android.domain.models.criteo.CriteoEventType.EVENT_TYPE_VIEW_ADD_CART
            com.carrefour.fid.android.domain.models.criteo.CriteoPageType r7 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_ADD_TO_CART
            java.util.List r10 = kotlin.collections.C10976s.m41419k(r25)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r26)
            java.util.List r12 = kotlin.collections.C10976s.m41419k(r6)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r28)
            java.util.List r14 = kotlin.collections.C10976s.m41419k(r6)
            com.carrefour.fid.android.domain.models.criteo.h r15 = new com.carrefour.fid.android.domain.models.criteo.h
            r6 = r15
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r5 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 32596(0x7f54, float:4.5677E-41)
            r23 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.<init>(r5)
            r5 = 1
            r2.label = r5
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0082
            return r3
        L_0x0082:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81718G0(java.lang.String, double, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81719H0(java.lang.String r16, java.lang.String r17, int r18, int r19, double r20, boolean r22, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r23) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r19
            r3 = r23
            boolean r4 = r3 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$updateBasket$1
            if (r4 == 0) goto L_0x001a
            r4 = r3
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$updateBasket$1 r4 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$updateBasket$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x001f
        L_0x001a:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$updateBasket$1 r4 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$updateBasket$1
            r4.<init>(r15, r3)
        L_0x001f:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r6 = r4.label
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            if (r6 == 0) goto L_0x006a
            if (r6 == r10) goto L_0x004f
            if (r6 == r8) goto L_0x0040
            if (r6 != r7) goto L_0x0038
            kotlin.C11661u0.m45747n(r3)
            goto L_0x00dc
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            boolean r1 = r4.Z$0
            int r2 = r4.I$1
            int r6 = r4.I$0
            java.lang.Object r8 = r4.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r8 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r8
            kotlin.C11661u0.m45747n(r3)
            goto L_0x00c6
        L_0x004f:
            boolean r1 = r4.Z$0
            double r10 = r4.D$0
            int r2 = r4.I$1
            int r6 = r4.I$0
            java.lang.Object r12 = r4.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r4.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r13 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r13
            kotlin.C11661u0.m45747n(r3)
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r3 = r3.mo21858l()
            r14 = r1
            goto L_0x009a
        L_0x006a:
            kotlin.C11661u0.m45747n(r3)
            com.carrefour.fid.android.domain.interactors.basket.n0 r3 = r0.f68098g
            com.carrefour.fid.android.domain.interactors.basket.n0$a r6 = new com.carrefour.fid.android.domain.interactors.basket.n0$a
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r11 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            r12 = r17
            r11.<init>(r1, r12, r9)
            r6.<init>(r11, r2, r10)
            r4.L$0 = r0
            r4.L$1 = r1
            r11 = r18
            r4.I$0 = r11
            r4.I$1 = r2
            r12 = r20
            r4.D$0 = r12
            r14 = r22
            r4.Z$0 = r14
            r4.label = r10
            java.lang.Object r3 = r3.m172966invokegIAlus(r6, r4)
            if (r3 != r5) goto L_0x0096
            return r5
        L_0x0096:
            r6 = r11
            r10 = r12
            r13 = r0
            r12 = r1
        L_0x009a:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r3)
            if (r1 != 0) goto L_0x00d4
            com.carrefour.fid.android.domain.models.basket.Basket r3 = (com.carrefour.fid.android.domain.models.basket.Basket) r3
            r13.mo81725z0(r3, r12, r2)
            int r1 = r2 - r6
            r4.L$0 = r13
            r4.L$1 = r9
            r4.I$0 = r6
            r4.I$1 = r2
            r4.Z$0 = r14
            r4.label = r8
            r16 = r13
            r17 = r12
            r18 = r10
            r20 = r1
            r21 = r4
            java.lang.Object r1 = r16.mo81718G0(r17, r18, r20, r21)
            if (r1 != r5) goto L_0x00c4
            return r5
        L_0x00c4:
            r8 = r13
            r1 = r14
        L_0x00c6:
            if (r1 == 0) goto L_0x00dc
            int r2 = r2 - r6
            r4.L$0 = r9
            r4.label = r7
            java.lang.Object r1 = r8.mo81715D0(r2, r4)
            if (r1 != r5) goto L_0x00dc
            return r5
        L_0x00d4:
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a r2 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a
            r2.<init>(r1)
            r13.emitEvent(r2)
        L_0x00dc:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81719H0(java.lang.String, java.lang.String, int, int, double, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: S */
    public void mo80278S() {
        this.f68101j.mo80278S();
    }

    /* renamed from: U */
    public void mo80279U() {
        this.f68101j.mo80279U();
    }

    /* renamed from: W */
    public void mo80280W(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        this.f68101j.mo80280W(offer);
    }

    /* renamed from: d */
    public void mo80281d(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        this.f68101j.mo80281d(offer);
    }

    /* renamed from: g */
    public void mo80282g(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        this.f68101j.mo80282g(offer);
    }

    /* renamed from: j */
    public void mo80283j(@C12579k Offer offer) {
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        this.f68101j.mo80283j(offer);
    }

    /* renamed from: u0 */
    public final Object mo81720u0(String str, String str2, int i, int i2, double d, boolean z, boolean z2, C11045c<? super C11079d2> cVar) {
        if (z) {
            emitEvent(new C28135b.C28136a.C28137a(BasketItemMaxQuantityReachedThrowable.f94235a));
            return C11079d2.f28267a;
        }
        Object H0 = mo81719H0(str, str2, i, i2, d, z2, cVar);
        if (H0 == C11063b.m42612h()) {
            return H0;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81721v0(boolean r6, com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c r7, boolean r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$editShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$editShoppingList$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$editShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$editShoppingList$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$editShoppingList$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00ab
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            boolean r8 = r0.Z$1
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r7 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r7
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0068
        L_0x0047:
            kotlin.C11661u0.m45747n(r9)
            if (r8 != 0) goto L_0x0051
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f$c r9 = com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b.C28140b.C28146f.C28149c.f68160c
            r5.publishState(r9)
        L_0x0051:
            if (r6 == 0) goto L_0x0056
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.e r9 = r5.f68100i
            goto L_0x0058
        L_0x0056:
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.a r9 = r5.f68099h
        L_0x0058:
            r0.L$0 = r5
            r0.Z$0 = r6
            r0.Z$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r7, r0)
            if (r9 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r7 = r5
        L_0x0068:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r9)
            if (r2 != 0) goto L_0x0094
            kotlin.d2 r9 = (kotlin.C11079d2) r9
            if (r8 == 0) goto L_0x0080
            if (r6 != 0) goto L_0x0080
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r7.mo81716E0(r0)
            if (r6 != r1) goto L_0x00ab
            return r1
        L_0x0080:
            if (r8 != 0) goto L_0x008a
            if (r6 == 0) goto L_0x008a
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f$a r6 = com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b.C28140b.C28146f.C28147a.f68156c
            r7.publishState(r6)
            goto L_0x00ab
        L_0x008a:
            if (r8 != 0) goto L_0x00ab
            if (r6 != 0) goto L_0x00ab
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f$b r6 = com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b.C28140b.C28146f.C28148b.f68158c
            r7.publishState(r6)
            goto L_0x00ab
        L_0x0094:
            if (r8 != 0) goto L_0x00a3
            if (r6 == 0) goto L_0x009e
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f$b r6 = com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b.C28140b.C28146f.C28148b.f68158c
            r7.publishState(r6)
            goto L_0x00a3
        L_0x009e:
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f$a r6 = com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b.C28140b.C28146f.C28147a.f68156c
            r7.publishState(r6)
        L_0x00a3:
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a r6 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a
            r6.<init>(r2)
            r7.emitEvent(r6)
        L_0x00ab:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81721v0(boolean, com.carrefour.fid.android.domain.models.favorites.shoppinglist.c, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: w0 */
    public final Object mo81722w0(String str, List<Gtin> list, boolean z, C11045c<? super C11079d2> cVar) {
        C28850b bVar = new C28850b();
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ProductDetailsViewModel$fetchMixing$2(this, str, list, bVar, z, (C11045c<? super ProductDetailsViewModel$fetchMixing$2>) null), 3, (Object) null);
        bVar.mo83962b(1);
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81723x0(com.carrefour.fid.android.domain.models.offer.Offer r27, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            boolean r2 = r1 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$1 r2 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$1 r2 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0042
            if (r4 == r6) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            kotlin.C11661u0.m45747n(r1)
            goto L_0x00c8
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r4 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            goto L_0x00b4
        L_0x0042:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.product.g r1 = r0.f68095d
            com.carrefour.fid.android.domain.interactors.product.g$a r4 = new com.carrefour.fid.android.domain.interactors.product.g$a
            com.carrefour.fid.android.domain.models.criteo.h r15 = new com.carrefour.fid.android.domain.models.criteo.h
            com.carrefour.fid.android.domain.models.criteo.CriteoPageType r8 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_ITEM
            com.carrefour.fid.android.domain.models.criteo.CriteoEventType r9 = com.carrefour.fid.android.domain.models.criteo.CriteoEventType.EVENT_TYPE_VIEW_ITEM
            r10 = 0
            com.carrefour.fid.android.domain.models.product.Product r7 = r27.mo118010S()
            java.lang.String r7 = r7.mo118415P()
            java.util.List r11 = kotlin.collections.C10976s.m41419k(r7)
            r12 = 0
            double r13 = com.carrefour.fid.android.product.presentation.models.extensions.C27659c.m116364b(r27)
            java.lang.Double r7 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r13)
            java.util.List r13 = kotlin.collections.C10976s.m41419k(r7)
            com.carrefour.fid.android.domain.models.offer.Prices r7 = r27.mo118009R()
            double r16 = r7.mo118172m()
            java.lang.Double r7 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r16)
            java.util.List r14 = kotlin.collections.C10976s.m41419k(r7)
            r16 = 0
            r17 = 0
            r25 = 0
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r7 = r27.mo117995D()
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r5 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            if (r7 != r5) goto L_0x0089
            r5 = r6
            goto L_0x008a
        L_0x0089:
            r5 = 0
        L_0x008a:
            java.lang.Boolean r18 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 31636(0x7b94, float:4.4331E-41)
            r24 = 0
            r7 = r15
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r25
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.<init>(r5, r6)
            r2.L$0 = r0
            r2.label = r6
            java.lang.Object r1 = r1.invoke(r4, r2)
            if (r1 != r3) goto L_0x00b3
            return r3
        L_0x00b3:
            r4 = r0
        L_0x00b4:
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C11907e) r1
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$2 r5 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getCriteoProducts$2
            r6 = 0
            r5.<init>(r4, r6)
            r2.L$0 = r6
            r4 = 2
            r2.label = r4
            java.lang.Object r1 = kotlinx.coroutines.flow.C11909g.m47348A(r1, r5, r2)
            if (r1 != r3) goto L_0x00c8
            return r3
        L_0x00c8:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81723x0(com.carrefour.fid.android.domain.models.offer.Offer, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81724y0(com.carrefour.fid.android.domain.models.offer.OfferIdentifier r10, boolean r11, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00ae
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            boolean r10 = r0.Z$0
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.k r11 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r11
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r2 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r2
            kotlin.C11661u0.m45747n(r12)
            goto L_0x009a
        L_0x0047:
            boolean r11 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r10 = (com.carrefour.fid.android.domain.models.offer.OfferIdentifier) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel r2 = (com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel) r2
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0070
        L_0x005b:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.domain.interactors.service.k r12 = r9.f68092a
            r0.L$0 = r9
            r0.L$1 = r10
            r0.Z$0 = r11
            r0.label = r5
            java.lang.Object r12 = r12.m172965invokeIoAF18A(r0)
            if (r12 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r2 = r9
        L_0x0070:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r12)
            if (r5 != 0) goto L_0x00b1
            com.carrefour.fid.android.domain.models.service.models.k r12 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r12
            com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase$Param r5 = new com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase$Param
            java.lang.String r7 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r12)
            java.lang.String r10 = r10.mo118136f()
            r5.<init>(r7, r10, r6)
            com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase r10 = r2.f68093b
            r0.L$0 = r2
            r0.L$1 = r12
            r0.Z$0 = r11
            r0.label = r4
            java.lang.Object r10 = r10.invoke(r5, r0)
            if (r10 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r8 = r12
            r12 = r10
            r10 = r11
            r11 = r8
        L_0x009a:
            kotlinx.coroutines.flow.e r12 = (kotlinx.coroutines.flow.C11907e) r12
            com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1 r4 = new com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel$getProductOffer$2$1
            r4.<init>(r2, r10, r11)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r10 = r12.collect(r4, r0)
            if (r10 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x00b1:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81724y0(com.carrefour.fid.android.domain.models.offer.OfferIdentifier, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if (r0.mo118004M() > r7) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        emitEvent(new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b.C28136a.C28137a(new com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable(r6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81725z0(com.carrefour.fid.android.domain.models.basket.Basket r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            java.util.List r5 = r5.mo116817B()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x000a:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.carrefour.fid.android.domain.models.offer.Offer r2 = (com.carrefour.fid.android.domain.models.offer.Offer) r2
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r2 = r2.mo118001J()
            java.lang.String r2 = r2.mo118136f()
            boolean r2 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r2, r6)
            if (r2 == 0) goto L_0x000a
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            com.carrefour.fid.android.domain.models.offer.Offer r0 = (com.carrefour.fid.android.domain.models.offer.Offer) r0
            if (r0 != 0) goto L_0x002d
            return
        L_0x002d:
            java.util.List r5 = r0.mo118005N()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0037:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00c2
            java.lang.Object r2 = r5.next()
            com.carrefour.fid.android.domain.models.offer.OfferMessage r2 = (com.carrefour.fid.android.domain.models.offer.OfferMessage) r2
            java.lang.String r2 = r2.mo118148e()
            int r3 = r2.hashCode()
            switch(r3) {
                case -1688620010: goto L_0x00a7;
                case -1015848577: goto L_0x009e;
                case 140722205: goto L_0x0085;
                case 935189964: goto L_0x0068;
                case 1018325076: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0037
        L_0x004f:
            java.lang.String r3 = "NOT_ADDED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0058
            goto L_0x0037
        L_0x0058:
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a r5 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a
            com.carrefour.fid.android.domain.exceptions.BasketThrowable r6 = new com.carrefour.fid.android.domain.exceptions.BasketThrowable
            com.carrefour.fid.android.domain.exceptions.BasketErrorType r7 = com.carrefour.fid.android.domain.exceptions.BasketErrorType.BasketNotAdded
            r6.<init>(r7)
            r5.<init>(r6)
            r4.emitEvent(r5)
            return
        L_0x0068:
            java.lang.String r3 = "QUANTITY_REQUESTED_RELATED_TO_PRODUCT_CATEGORY_HAS_EXCEEDED_THE_LIMIT"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0071
            goto L_0x0037
        L_0x0071:
            com.carrefour.fid.android.domain.models.offer.CategoryLimit r5 = r0.mo117996E()
            if (r5 == 0) goto L_0x0084
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a r6 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a
            com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable r7 = new com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable
            r7.<init>(r5)
            r6.<init>(r7)
            r4.emitEvent(r6)
        L_0x0084:
            return
        L_0x0085:
            java.lang.String r3 = "NOT_AVAILABLE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x008e
            goto L_0x0037
        L_0x008e:
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a r5 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a
            com.carrefour.fid.android.domain.exceptions.BasketThrowable r6 = new com.carrefour.fid.android.domain.exceptions.BasketThrowable
            com.carrefour.fid.android.domain.exceptions.BasketErrorType r7 = com.carrefour.fid.android.domain.exceptions.BasketErrorType.ProductNotAvailable
            r6.<init>(r7)
            r5.<init>(r6)
            r4.emitEvent(r5)
            return
        L_0x009e:
            java.lang.String r3 = "QUANTITY_REQUESTED_HIGHER_THAN_MAX_POSSIBLE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00af
            goto L_0x0037
        L_0x00a7:
            java.lang.String r3 = "QUANTITY_REQUESTED_HIGHER_THAN_AVAILABLE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0037
        L_0x00af:
            int r2 = r0.mo118004M()
            if (r2 > r7) goto L_0x0037
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a r5 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a
            com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable r7 = new com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable
            r7.<init>(r6, r1)
            r5.<init>(r7)
            r4.emitEvent(r5)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.ProductDetailsViewModel.mo81725z0(com.carrefour.fid.android.domain.models.basket.Basket, java.lang.String, int):void");
    }
}
