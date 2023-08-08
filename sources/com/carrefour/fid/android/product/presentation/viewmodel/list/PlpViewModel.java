package com.carrefour.fid.android.product.presentation.viewmodel.list;

import android.net.Uri;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.core.paging.C36334b;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.product.C37750b;
import com.carrefour.fid.android.domain.interactors.product.C37802t;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.extension.C37972a;
import com.carrefour.fid.android.domain.models.criteo.C38000b;
import com.carrefour.fid.android.domain.models.criteo.C38002d;
import com.carrefour.fid.android.domain.models.criteo.C38003e;
import com.carrefour.fid.android.domain.models.criteo.C38004f;
import com.carrefour.fid.android.domain.models.criteo.C38005g;
import com.carrefour.fid.android.domain.models.criteo.C38007i;
import com.carrefour.fid.android.domain.models.criteo.C38009k;
import com.carrefour.fid.android.domain.models.luckycart.C38047a;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.constant.C28547h2;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.C10930d1;
import kotlin.collections.C10933e1;
import kotlin.collections.C10977s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11636e;
import kotlin.time.C11639g;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003IMQBA\b\u0007\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`¢\u0006\u0004\br\u0010sJ7\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001b\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0012H\u0002J)\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\rJ)\u0010 \u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@ø\u0001\u0000¢\u0006\u0004\b \u0010\rJ)\u0010!\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@ø\u0001\u0000¢\u0006\u0004\b!\u0010\rJ#\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J&\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\n0\t*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\tH\u0002J1\u00103\u001a\u00020,*\u00020\u000b2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0.2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002ø\u0001\u0000J\u0014\u00105\u001a\u00020\u00102\n\u00104\u001a\u0006\u0012\u0002\b\u00030\nH\u0002J\u0010\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u000206H\u0002J\u0016\u0010<\u001a\u00020;*\u0002092\b\b\u0002\u0010:\u001a\u00020\u0010H\u0002J\u0018\u0010@\u001a\u00020\u00122\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u000eH\u0002J\u0012\u0010C\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010AH\u0002J\u001a\u0010E\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020$H\u0002J\u001b\u0010F\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010bR&\u0010g\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0.0d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR#\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000d8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bh\u0010fR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001d\u0010q\u001a\u00020n8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bo\u0010p\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$b;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$c;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "source", "Lkotlinx/coroutines/flow/i;", "Lcom/carrefour/fid/android/core/paging/b;", "eventFlow", "Lkotlinx/coroutines/flow/e;", "Lcom/carrefour/fid/android/core/paging/a;", "Lcom/carrefour/fid/android/domain/models/v;", "t0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "offerIdentifier", "", "isNotFood", "Lkotlin/d2;", "F0", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$c$i;", "intent", "z0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$c$i;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$c$a;", "y0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$c$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$c$g;", "H0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$c$g;Lkotlin/coroutines/c;)Ljava/lang/Object;", "B0", "C0", "E0", "x0", "Lcom/carrefour/fid/android/domain/models/criteo/g;", "product", "", "position", "A0", "(Lcom/carrefour/fid/android/domain/models/criteo/g;ILkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "plpItemData", "D0", "(Lcom/carrefour/fid/android/domain/models/product/plp/b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/product/presentation/models/g;", "N0", "", "criteoPositions", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "mixingProductOverlays", "M0", "pagingData", "v0", "", "throwable", "w0", "Lcom/carrefour/fid/android/domain/models/product/plp/PlpOffer;", "isOfferRemoved", "Lcom/carrefour/fid/android/domain/interactors/basket/n0$a;", "K0", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "id", "u0", "", "trackingUrl", "J0", "quantity", "I0", "G0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpFlowProvider;", "a", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpFlowProvider;", "productListFlowProvider", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;", "b", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;", "addProductToShoppingListUseCase", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;", "c", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;", "removeProductFromShoppingListUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "d", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "updateBasketContentUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/b;", "e", "Lcom/carrefour/fid/android/domain/interactors/product/b;", "clearFacetUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/t;", "f", "Lcom/carrefour/fid/android/domain/interactors/product/t;", "shouldClearSponsoredItemsCacheUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "g", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "criteoTrackingUseCase", "Lkotlinx/coroutines/flow/j;", "h", "Lkotlinx/coroutines/flow/j;", "criteoPositionsFlow", "i", "displayedMixingOverlaysFlow", "Lkotlinx/coroutines/c2;", "j", "Lkotlinx/coroutines/c2;", "subscriptionJob", "Lkotlin/time/e;", "k", "J", "MIXING_OVERlAY_SHOW_DURATION", "<init>", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpFlowProvider;Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;Lcom/carrefour/fid/android/domain/interactors/basket/n0;Lcom/carrefour/fid/android/domain/interactors/product/b;Lcom/carrefour/fid/android/domain/interactors/product/t;Lcom/carrefour/fid/android/domain/interactors/criteo/j;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPlpViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PlpViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel\n*L\n396#1:422,2\n*E\n"})
public final class PlpViewModel extends BaseMVIViewModel<C28174b, C28181c> {
    @C12579k

    /* renamed from: a */
    public final PlpFlowProvider f68225a;
    @C12579k

    /* renamed from: b */
    public final C37680a f68226b;
    @C12579k

    /* renamed from: c */
    public final C37684e f68227c;
    @C12579k

    /* renamed from: d */
    public final C37588n0 f68228d;
    @C12579k

    /* renamed from: e */
    public final C37750b f68229e;
    @C12579k

    /* renamed from: f */
    public final C37802t f68230f;
    @C12579k

    /* renamed from: g */
    public final C37672j f68231g;
    @C12579k

    /* renamed from: h */
    public final C11940j<Map<Integer, Integer>> f68232h = C11953v.m47628a(C10977s0.m41492z());
    @C12579k

    /* renamed from: i */
    public final C11940j<Set<Gtin>> f68233i = C11953v.m47628a(C10930d1.m40892k());
    @C12580l

    /* renamed from: j */
    public C11723c2 f68234j;

    /* renamed from: k */
    public final long f68235k;

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$b */
    public interface C28174b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$b$a */
        public static final class C28175a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m117973a(@C12579k C28174b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$b$b */
        public static final class C28176b implements C28174b {
            @C12579k

            /* renamed from: b */
            public static final C28176b f68247b = new C28176b();

            /* renamed from: c */
            public static final int f68248c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28175a.m117973a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$b$c */
        public static final class C28177c implements C28174b {

            /* renamed from: c */
            public static final int f68249c = 8;
            @C12579k

            /* renamed from: b */
            public final Throwable f68250b;

            public C28177c(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "error");
                this.f68250b = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C28177c m117974g(C28177c cVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = cVar.f68250b;
                }
                return cVar.mo81960f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo81958e() {
                return this.f68250b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28177c) && Intrinsics.areEqual((Object) this.f68250b, (Object) ((C28177c) obj).f68250b);
            }

            @C12579k
            /* renamed from: f */
            public final C28177c mo81960f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "error");
                return new C28177c(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo81961h() {
                return this.f68250b;
            }

            public int hashCode() {
                return this.f68250b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28175a.m117973a(this);
            }

            @C12579k
            public String toString() {
                Throwable th = this.f68250b;
                return "Error(error=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$b$d */
        public static final class C28178d implements C28174b {
            @C12579k

            /* renamed from: b */
            public static final C28178d f68251b = new C28178d();

            /* renamed from: c */
            public static final int f68252c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28175a.m117973a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$b$e */
        public static final class C28179e implements C28174b {
            @C12579k

            /* renamed from: b */
            public static final C28179e f68253b = new C28179e();

            /* renamed from: c */
            public static final int f68254c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28175a.m117973a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$b$f */
        public static final class C28180f implements C28174b {

            /* renamed from: f */
            public static final int f68255f = 8;
            @C12579k

            /* renamed from: b */
            public final List<C27670g> f68256b;

            /* renamed from: c */
            public final boolean f68257c;

            /* renamed from: d */
            public final int f68258d;

            /* renamed from: e */
            public final int f68259e;

            public C28180f(@C12579k List<? extends C27670g> list, boolean z, int i, int i2) {
                Intrinsics.checkNotNullParameter(list, "products");
                this.f68256b = list;
                this.f68257c = z;
                this.f68258d = i;
                this.f68259e = i2;
            }

            /* renamed from: j */
            public static /* synthetic */ C28180f m117978j(C28180f fVar, List<C27670g> list, boolean z, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    list = fVar.f68256b;
                }
                if ((i3 & 2) != 0) {
                    z = fVar.f68257c;
                }
                if ((i3 & 4) != 0) {
                    i = fVar.f68258d;
                }
                if ((i3 & 8) != 0) {
                    i2 = fVar.f68259e;
                }
                return fVar.mo81970i(list, z, i, i2);
            }

            @C12579k
            /* renamed from: e */
            public final List<C27670g> mo81964e() {
                return this.f68256b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28180f)) {
                    return false;
                }
                C28180f fVar = (C28180f) obj;
                return Intrinsics.areEqual((Object) this.f68256b, (Object) fVar.f68256b) && this.f68257c == fVar.f68257c && this.f68258d == fVar.f68258d && this.f68259e == fVar.f68259e;
            }

            /* renamed from: f */
            public final boolean mo81966f() {
                return this.f68257c;
            }

            /* renamed from: g */
            public final int mo81967g() {
                return this.f68258d;
            }

            /* renamed from: h */
            public final int mo81968h() {
                return this.f68259e;
            }

            public int hashCode() {
                int hashCode = this.f68256b.hashCode() * 31;
                boolean z = this.f68257c;
                if (z) {
                    z = true;
                }
                return ((((hashCode + (z ? 1 : 0)) * 31) + Integer.hashCode(this.f68258d)) * 31) + Integer.hashCode(this.f68259e);
            }

            @C12579k
            /* renamed from: i */
            public final C28180f mo81970i(@C12579k List<? extends C27670g> list, boolean z, int i, int i2) {
                Intrinsics.checkNotNullParameter(list, "products");
                return new C28180f(list, z, i, i2);
            }

            @C12579k
            /* renamed from: k */
            public final List<C27670g> mo81971k() {
                return this.f68256b;
            }

            /* renamed from: l */
            public final boolean mo81972l() {
                return this.f68257c;
            }

            /* renamed from: m */
            public final int mo81973m() {
                return this.f68258d;
            }

            /* renamed from: n */
            public final int mo81974n() {
                return this.f68259e;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28175a.m117973a(this);
            }

            @C12579k
            public String toString() {
                List<C27670g> list = this.f68256b;
                boolean z = this.f68257c;
                int i = this.f68258d;
                int i2 = this.f68259e;
                return "ProductList(products=" + list + ", showLoaderInList=" + z + ", totalCount=" + i + ", totalFilters=" + i2 + ")";
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public PlpViewModel(@C12579k PlpFlowProvider plpFlowProvider, @C12579k C37680a aVar, @C12579k C37684e eVar, @C12579k C37588n0 n0Var, @C12579k C37750b bVar, @C12579k C37802t tVar, @C12579k C37672j jVar) {
        super(C28174b.C28178d.f68251b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(plpFlowProvider, "productListFlowProvider");
        Intrinsics.checkNotNullParameter(aVar, "addProductToShoppingListUseCase");
        Intrinsics.checkNotNullParameter(eVar, "removeProductFromShoppingListUseCase");
        Intrinsics.checkNotNullParameter(n0Var, "updateBasketContentUseCase");
        Intrinsics.checkNotNullParameter(bVar, "clearFacetUseCase");
        Intrinsics.checkNotNullParameter(tVar, "shouldClearSponsoredItemsCacheUseCase");
        Intrinsics.checkNotNullParameter(jVar, "criteoTrackingUseCase");
        this.f68225a = plpFlowProvider;
        this.f68226b = aVar;
        this.f68227c = eVar;
        this.f68228d = n0Var;
        this.f68229e = bVar;
        this.f68230f = tVar;
        this.f68231g = jVar;
        C11636e.C11637a aVar2 = C11636e.f28954b;
        this.f68235k = C11639g.m45638m0(7, DurationUnit.SECONDS);
    }

    /* renamed from: L0 */
    public static /* synthetic */ C37588n0.C37589a m117914L0(PlpViewModel plpViewModel, PlpOffer plpOffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return plpViewModel.mo81920K0(plpOffer, z);
    }

    /* renamed from: A0 */
    public final Object mo81910A0(C38005g gVar, int i, C11045c<? super C11079d2> cVar) {
        Map J0 = C10977s0.m41442J0(this.f68232h.getValue());
        J0.put(C11064a.m42620f(gVar.mo117466e()), C11064a.m42620f(i));
        Object emit = this.f68232h.emit(J0, cVar);
        if (emit == C11063b.m42612h()) {
            return emit;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: B0 */
    public final void mo81911B0() {
        this.f68229e.invoke();
        this.f68230f.clear();
    }

    /* renamed from: C0 */
    public final Object mo81912C0(ProductListSource productListSource, C11911i<C36334b> iVar, C11045c<? super C11079d2> cVar) {
        Object x0 = mo81927x0(productListSource, iVar, cVar);
        return x0 == C11063b.m42612h() ? x0 : C11079d2.f28267a;
    }

    /* renamed from: D0 */
    public final Object mo81913D0(C38114b bVar, C11045c<? super C11079d2> cVar) {
        C11940j<Set<Gtin>> jVar = this.f68233i;
        Object emit = jVar.emit(C10933e1.m40917y(jVar.getValue(), Gtin.m157307a(bVar.mo118842j().mo118850A())), cVar);
        return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
    }

    /* renamed from: E0 */
    public final Object mo81914E0(ProductListSource productListSource, C11911i<C36334b> iVar, C11045c<? super C11079d2> cVar) {
        Object x0 = mo81927x0(productListSource, iVar, cVar);
        return x0 == C11063b.m42612h() ? x0 : C11079d2.f28267a;
    }

    /* renamed from: F0 */
    public final void mo81915F0(OfferIdentifier offerIdentifier, boolean z) {
        emitEvent(new C28170a.C28172b(offerIdentifier, z));
    }

    @C12580l
    /* renamed from: G0 */
    public Object processIntent(@C12579k C28181c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C28181c.C28182a) {
            Object y0 = mo81928y0((C28181c.C28182a) cVar, cVar2);
            if (y0 == C11063b.m42612h()) {
                return y0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C28181c.C28188g) {
            Object H0 = mo81917H0((C28181c.C28188g) cVar, cVar2);
            if (H0 == C11063b.m42612h()) {
                return H0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C28181c.C28190i) {
            Object z0 = mo81929z0((C28181c.C28190i) cVar, cVar2);
            if (z0 == C11063b.m42612h()) {
                return z0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C28181c.C28184c) {
            C28181c.C28184c cVar3 = (C28181c.C28184c) cVar;
            Object C0 = mo81912C0(cVar3.mo82001f(), cVar3.mo81999e(), cVar2);
            if (C0 == C11063b.m42612h()) {
                return C0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C28181c.C28187f) {
            C28181c.C28187f fVar = (C28181c.C28187f) cVar;
            Object E0 = mo81914E0(fVar.mo82015f(), fVar.mo82013e(), cVar2);
            if (E0 == C11063b.m42612h()) {
                return E0;
            }
            return C11079d2.f28267a;
        } else {
            if (Intrinsics.areEqual((Object) cVar, (Object) C28181c.C28186e.f68273a)) {
                mo81911B0();
            } else if (cVar instanceof C28181c.C28183b) {
                C28181c.C28183b bVar = (C28181c.C28183b) cVar;
                Object A0 = mo81910A0(bVar.mo81993f(), bVar.mo81991e(), cVar2);
                if (A0 == C11063b.m42612h()) {
                    return A0;
                }
                return C11079d2.f28267a;
            } else if (cVar instanceof C28181c.C28185d) {
                Object D0 = mo81913D0(((C28181c.C28185d) cVar).mo82006d(), cVar2);
                if (D0 == C11063b.m42612h()) {
                    return D0;
                }
                return C11079d2.f28267a;
            } else if (cVar instanceof C28181c.C28191j) {
                C28181c.C28191j jVar = (C28181c.C28191j) cVar;
                mo81915F0(jVar.mo82045e(), jVar.mo82047f());
            } else if (cVar instanceof C28181c.C28189h) {
                mo81919J0(((C28181c.C28189h) cVar).mo82028d());
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81917H0(com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.C28181c.C28188g r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$removeFromCart$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$removeFromCart$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$removeFromCart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$removeFromCart$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$removeFromCart$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel r5 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.basket.n0 r6 = r4.f68228d
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r5 = r5.mo82021e()
            com.carrefour.fid.android.domain.interactors.basket.n0$a r5 = r4.mo81920K0(r5, r3)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r5, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r5 = r4
        L_0x0054:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r6)
            if (r6 == 0) goto L_0x005d
            r5.mo81926w0(r6)
        L_0x005d:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.mo81917H0(com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$g, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: I0 */
    public final void mo81918I0(String str, int i) {
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("quantity", String.valueOf(i)).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "parse(trackingUrl)\n     …)\n            .toString()");
        mo81919J0(uri);
    }

    /* renamed from: J0 */
    public final void mo81919J0(String str) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PlpViewModel$sendCriteoTracking$1(str, this, (C11045c<? super PlpViewModel$sendCriteoTracking$1>) null), 3, (Object) null);
    }

    /* renamed from: K0 */
    public final C37588n0.C37589a mo81920K0(PlpOffer plpOffer, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = plpOffer.mo118791B();
        }
        return new C37588n0.C37589a(plpOffer.mo118819v(), i, true);
    }

    /* renamed from: M0 */
    public final C27670g mo81921M0(C38184v vVar, Map<Integer, Integer> map, Set<Gtin> set) {
        boolean z;
        if (vVar instanceof C38114b) {
            C38114b bVar = (C38114b) vVar;
            return new C27670g.C27676f(bVar, set.contains(Gtin.m157307a(bVar.mo118842j().mo118850A())));
        }
        int i = 0;
        if (vVar instanceof C38003e) {
            C38003e eVar = (C38003e) vVar;
            Integer num = map.get(Integer.valueOf(eVar.mo117466e()));
            if (num != null) {
                i = num.intValue();
            }
            return new C27670g.C27671a(eVar, i);
        } else if (vVar instanceof C38004f) {
            C38004f fVar = (C38004f) vVar;
            Integer num2 = map.get(Integer.valueOf(fVar.mo117466e()));
            if (num2 != null) {
                i = num2.intValue();
            }
            return new C27670g.C27672b(fVar, i);
        } else if (vVar instanceof C38047a) {
            int hashCode = vVar.hashCode();
            C38047a aVar = (C38047a) vVar;
            return new C27670g.C27673c(hashCode, aVar.mo117895g(), aVar.mo117896h(), aVar.mo117898i());
        } else if (vVar instanceof C38007i) {
            throw new IllegalStateException("Only consolidated class CriteoItemDataButterfly should be used here");
        } else if (!(vVar instanceof C38009k)) {
            boolean z2 = true;
            if (vVar instanceof Offer) {
                z = true;
            } else {
                z = vVar instanceof C38000b;
            }
            if (!z) {
                z2 = vVar instanceof C38002d;
            }
            if (z2) {
                throw new IllegalStateException(C11342l0.m43547d(vVar.getClass()).mo22848s() + " should not be used here");
            }
            throw new IllegalStateException("Unknown class: " + C11342l0.m43547d(vVar.getClass()).mo22848s());
        } else {
            throw new IllegalStateException("Only consolidated class CriteoItemDataFlagship should be used here");
        }
    }

    /* renamed from: N0 */
    public final C11907e<C36328a<C27670g>> mo81922N0(C11907e<? extends C36328a<? extends C38184v>> eVar) {
        return C11909g.m47360E(eVar, this.f68232h, this.f68233i, new PlpViewModel$toPresentationModel$1(this, (C11045c<? super PlpViewModel$toPresentationModel$1>) null));
    }

    /* renamed from: t0 */
    public final Object mo81923t0(ProductListSource productListSource, C11911i<C36334b> iVar, C11045c<? super C11907e<? extends C36328a<? extends C38184v>>> cVar) {
        return this.f68225a.mo81908e(productListSource, iVar, cVar);
    }

    /* renamed from: u0 */
    public final void mo81924u0(Basket basket, OfferIdentifier offerIdentifier) {
        List<Throwable> b = C37972a.m156171b(basket, offerIdentifier, 1);
        if (b != null) {
            for (Throwable aVar : b) {
                emitEvent(new C28170a.C28171a(aVar));
            }
        }
    }

    /* renamed from: v0 */
    public final boolean mo81925v0(C36328a<?> aVar) {
        if ((aVar.mo108397i() instanceof C36328a.C36330b.C36332b) && aVar.mo108395h().isEmpty()) {
            publishState(C28174b.C28179e.f68253b);
            return true;
        } else if ((aVar.mo108397i() instanceof C36328a.C36330b.C36333c) && aVar.mo108395h().isEmpty()) {
            publishState(C28174b.C28176b.f68247b);
            return true;
        } else if (!(aVar.mo108397i() instanceof C36328a.C36330b.C36331a) || !aVar.mo108395h().isEmpty()) {
            if (aVar.mo108397i() instanceof C36328a.C36330b.C36331a) {
                C36328a.C36330b i = aVar.mo108397i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type com.carrefour.fid.android.core.paging.PagingData.LoadState.Error");
                emitEvent(new C28170a.C28171a(((C36328a.C36330b.C36331a) i).mo108403a()));
            }
            return false;
        } else {
            C36328a.C36330b i2 = aVar.mo108397i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type com.carrefour.fid.android.core.paging.PagingData.LoadState.Error");
            publishState(new C28174b.C28177c(((C36328a.C36330b.C36331a) i2).mo108403a()));
            return true;
        }
    }

    /* renamed from: w0 */
    public final void mo81926w0(Throwable th) {
        emitEvent(new C28170a.C28171a(th));
    }

    /* renamed from: x0 */
    public final Object mo81927x0(ProductListSource productListSource, C11911i<C36334b> iVar, C11045c<? super C11079d2> cVar) {
        C11723c2 c2Var = this.f68234j;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f68234j = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PlpViewModel$launchGetProductFlow$2(this, productListSource, iVar, (C11045c<? super PlpViewModel$launchGetProductFlow$2>) null), 3, (Object) null);
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81928y0(com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.C28181c.C28182a r13, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToCart$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToCart$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToCart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToCart$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToCart$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r13 = r0.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$a r13 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.C28181c.C28182a) r13
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel r0 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00dc
        L_0x0036:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003e:
            java.lang.Object r13 = r0.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$a r13 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.C28181c.C28182a) r13
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel r2 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0093
        L_0x0050:
            kotlin.C11661u0.m45747n(r14)
            int r14 = r13.mo81986j()
            if (r14 <= 0) goto L_0x007a
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$a$c r14 = new com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$a$c
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r7 = r13.mo81983h()
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider r0 = r12.f68225a
            com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource r8 = r0.mo81907d()
            int r9 = r13.mo81985i()
            int r10 = r13.mo81986j()
            java.lang.String r11 = r13.mo81982g()
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r12.emitEvent(r14)
            goto L_0x00f5
        L_0x007a:
            com.carrefour.fid.android.domain.interactors.basket.n0 r14 = r12.f68228d
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r2 = r13.mo81983h()
            r6 = 0
            com.carrefour.fid.android.domain.interactors.basket.n0$a r2 = m117914L0(r12, r2, r6, r5, r3)
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r5
            java.lang.Object r14 = r14.m172966invokegIAlus(r2, r0)
            if (r14 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r2 = r12
        L_0x0093:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r14)
            if (r6 == 0) goto L_0x009c
            r2.mo81926w0(r6)
        L_0x009c:
            boolean r6 = kotlin.Result.m38710j(r14)
            if (r6 == 0) goto L_0x00f5
            r6 = r14
            com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r7 = r13.mo81983h()
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r7 = r7.mo118819v()
            r2.mo81924u0(r6, r7)
            kotlinx.coroutines.flow.j<java.util.Set<com.carrefour.fid.android.domain.models.product.Gtin>> r6 = r2.f68233i
            java.lang.Object r7 = r6.getValue()
            java.util.Set r7 = (java.util.Set) r7
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r8 = r13.mo81983h()
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r8 = r8.mo118819v()
            java.lang.String r8 = r8.mo118136f()
            com.carrefour.fid.android.domain.models.product.Gtin r8 = com.carrefour.fid.android.domain.models.product.Gtin.m157307a(r8)
            java.util.Set r7 = kotlin.collections.C10933e1.m40912D(r7, r8)
            r0.L$0 = r2
            r0.L$1 = r13
            r0.L$2 = r14
            r0.label = r4
            java.lang.Object r14 = r6.emit(r7, r0)
            if (r14 != r1) goto L_0x00db
            return r1
        L_0x00db:
            r0 = r2
        L_0x00dc:
            kotlinx.coroutines.o0 r6 = androidx.lifecycle.C19500w0.m90846a(r0)
            r7 = 0
            r8 = 0
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToCart$3$1 r9 = new com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToCart$3$1
            r9.<init>(r0, r13, r3)
            r10 = 3
            r11 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = r13.mo81982g()
            if (r13 == 0) goto L_0x00f5
            r0.mo81918I0(r13, r5)
        L_0x00f5:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.mo81928y0(com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81929z0(com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.C28181c.C28190i r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToFavorites$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToFavorites$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToFavorites$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToFavorites$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$onAddToFavorites$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$i r6 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.C28181c.C28190i) r6
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel r0 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0091
        L_0x003a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0042:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel r6 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x006f
        L_0x0050:
            kotlin.C11661u0.m45747n(r7)
            boolean r7 = r6.mo82039h()
            if (r7 == 0) goto L_0x0079
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.e r7 = r5.f68227c
            com.carrefour.fid.android.domain.models.product.plp.c r6 = r6.mo82038g()
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r6 = com.carrefour.fid.android.domain.models.favorites.shoppinglist.extensions.C38036a.m156828b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.m172966invokegIAlus(r6, r0)
            if (r7 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r6 = r5
        L_0x006f:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x00a9
            r6.mo81926w0(r7)
            goto L_0x00a9
        L_0x0079:
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.a r7 = r5.f68226b
            com.carrefour.fid.android.domain.models.product.plp.c r2 = r6.mo82038g()
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r2 = com.carrefour.fid.android.domain.models.favorites.shoppinglist.extensions.C38036a.m156828b(r2)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172966invokegIAlus(r2, r0)
            if (r7 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r0 = r5
        L_0x0091:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r7)
            if (r1 == 0) goto L_0x009a
            r0.mo81926w0(r1)
        L_0x009a:
            boolean r1 = kotlin.Result.m38710j(r7)
            if (r1 == 0) goto L_0x00a9
            kotlin.d2 r7 = (kotlin.C11079d2) r7
            java.lang.String r6 = r6.mo82037f()
            r0.mo81919J0(r6)
        L_0x00a9:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel.mo81929z0(com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$i, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c */
    public interface C28181c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$b */
        public static final class C28183b implements C28181c {

            /* renamed from: c */
            public static final int f68265c = 8;
            @C12579k

            /* renamed from: a */
            public final C38005g f68266a;

            /* renamed from: b */
            public final int f68267b;

            public C28183b(@C12579k C38005g gVar, int i) {
                Intrinsics.checkNotNullParameter(gVar, "product");
                this.f68266a = gVar;
                this.f68267b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C28183b m117998d(C28183b bVar, C38005g gVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    gVar = bVar.f68266a;
                }
                if ((i2 & 2) != 0) {
                    i = bVar.f68267b;
                }
                return bVar.mo81990c(gVar, i);
            }

            @C12579k
            /* renamed from: a */
            public final C38005g mo81988a() {
                return this.f68266a;
            }

            /* renamed from: b */
            public final int mo81989b() {
                return this.f68267b;
            }

            @C12579k
            /* renamed from: c */
            public final C28183b mo81990c(@C12579k C38005g gVar, int i) {
                Intrinsics.checkNotNullParameter(gVar, "product");
                return new C28183b(gVar, i);
            }

            /* renamed from: e */
            public final int mo81991e() {
                return this.f68267b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28183b)) {
                    return false;
                }
                C28183b bVar = (C28183b) obj;
                return Intrinsics.areEqual((Object) this.f68266a, (Object) bVar.f68266a) && this.f68267b == bVar.f68267b;
            }

            @C12579k
            /* renamed from: f */
            public final C38005g mo81993f() {
                return this.f68266a;
            }

            public int hashCode() {
                return (this.f68266a.hashCode() * 31) + Integer.hashCode(this.f68267b);
            }

            @C12579k
            public String toString() {
                C38005g gVar = this.f68266a;
                int i = this.f68267b;
                return "ButterFlySelected(product=" + gVar + ", position=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$c */
        public static final class C28184c implements C28181c {

            /* renamed from: c */
            public static final int f68268c = 8;
            @C12579k

            /* renamed from: a */
            public final ProductListSource f68269a;
            @C12579k

            /* renamed from: b */
            public final C11911i<C36334b> f68270b;

            public C28184c(@C12579k ProductListSource productListSource, @C12579k C11911i<C36334b> iVar) {
                Intrinsics.checkNotNullParameter(productListSource, "source");
                Intrinsics.checkNotNullParameter(iVar, "pagingEvents");
                this.f68269a = productListSource;
                this.f68270b = iVar;
            }

            /* renamed from: d */
            public static /* synthetic */ C28184c m118004d(C28184c cVar, ProductListSource productListSource, C11911i<C36334b> iVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    productListSource = cVar.f68269a;
                }
                if ((i & 2) != 0) {
                    iVar = cVar.f68270b;
                }
                return cVar.mo81998c(productListSource, iVar);
            }

            @C12579k
            /* renamed from: a */
            public final ProductListSource mo81996a() {
                return this.f68269a;
            }

            @C12579k
            /* renamed from: b */
            public final C11911i<C36334b> mo81997b() {
                return this.f68270b;
            }

            @C12579k
            /* renamed from: c */
            public final C28184c mo81998c(@C12579k ProductListSource productListSource, @C12579k C11911i<C36334b> iVar) {
                Intrinsics.checkNotNullParameter(productListSource, "source");
                Intrinsics.checkNotNullParameter(iVar, "pagingEvents");
                return new C28184c(productListSource, iVar);
            }

            @C12579k
            /* renamed from: e */
            public final C11911i<C36334b> mo81999e() {
                return this.f68270b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28184c)) {
                    return false;
                }
                C28184c cVar = (C28184c) obj;
                return Intrinsics.areEqual((Object) this.f68269a, (Object) cVar.f68269a) && Intrinsics.areEqual((Object) this.f68270b, (Object) cVar.f68270b);
            }

            @C12579k
            /* renamed from: f */
            public final ProductListSource mo82001f() {
                return this.f68269a;
            }

            public int hashCode() {
                return (this.f68269a.hashCode() * 31) + this.f68270b.hashCode();
            }

            @C12579k
            public String toString() {
                ProductListSource productListSource = this.f68269a;
                C11911i<C36334b> iVar = this.f68270b;
                return "Fetch(source=" + productListSource + ", pagingEvents=" + iVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$d */
        public static final class C28185d implements C28181c {

            /* renamed from: b */
            public static final int f68271b = 8;
            @C12579k

            /* renamed from: a */
            public final C38114b f68272a;

            public C28185d(@C12579k C38114b bVar) {
                Intrinsics.checkNotNullParameter(bVar, "plpItemData");
                this.f68272a = bVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C28185d m118010c(C28185d dVar, C38114b bVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    bVar = dVar.f68272a;
                }
                return dVar.mo82005b(bVar);
            }

            @C12579k
            /* renamed from: a */
            public final C38114b mo82004a() {
                return this.f68272a;
            }

            @C12579k
            /* renamed from: b */
            public final C28185d mo82005b(@C12579k C38114b bVar) {
                Intrinsics.checkNotNullParameter(bVar, "plpItemData");
                return new C28185d(bVar);
            }

            @C12579k
            /* renamed from: d */
            public final C38114b mo82006d() {
                return this.f68272a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28185d) && Intrinsics.areEqual((Object) this.f68272a, (Object) ((C28185d) obj).f68272a);
            }

            public int hashCode() {
                return this.f68272a.hashCode();
            }

            @C12579k
            public String toString() {
                C38114b bVar = this.f68272a;
                return "MixingOverlayDismissed(plpItemData=" + bVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$e */
        public static final class C28186e implements C28181c {
            @C12579k

            /* renamed from: a */
            public static final C28186e f68273a = new C28186e();

            /* renamed from: b */
            public static final int f68274b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$f */
        public static final class C28187f implements C28181c {

            /* renamed from: c */
            public static final int f68275c = 8;
            @C12579k

            /* renamed from: a */
            public final ProductListSource f68276a;
            @C12579k

            /* renamed from: b */
            public final C11911i<C36334b> f68277b;

            public C28187f(@C12579k ProductListSource productListSource, @C12579k C11911i<C36334b> iVar) {
                Intrinsics.checkNotNullParameter(productListSource, "source");
                Intrinsics.checkNotNullParameter(iVar, "pagingEvents");
                this.f68276a = productListSource;
                this.f68277b = iVar;
            }

            /* renamed from: d */
            public static /* synthetic */ C28187f m118014d(C28187f fVar, ProductListSource productListSource, C11911i<C36334b> iVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    productListSource = fVar.f68276a;
                }
                if ((i & 2) != 0) {
                    iVar = fVar.f68277b;
                }
                return fVar.mo82012c(productListSource, iVar);
            }

            @C12579k
            /* renamed from: a */
            public final ProductListSource mo82010a() {
                return this.f68276a;
            }

            @C12579k
            /* renamed from: b */
            public final C11911i<C36334b> mo82011b() {
                return this.f68277b;
            }

            @C12579k
            /* renamed from: c */
            public final C28187f mo82012c(@C12579k ProductListSource productListSource, @C12579k C11911i<C36334b> iVar) {
                Intrinsics.checkNotNullParameter(productListSource, "source");
                Intrinsics.checkNotNullParameter(iVar, "pagingEvents");
                return new C28187f(productListSource, iVar);
            }

            @C12579k
            /* renamed from: e */
            public final C11911i<C36334b> mo82013e() {
                return this.f68277b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28187f)) {
                    return false;
                }
                C28187f fVar = (C28187f) obj;
                return Intrinsics.areEqual((Object) this.f68276a, (Object) fVar.f68276a) && Intrinsics.areEqual((Object) this.f68277b, (Object) fVar.f68277b);
            }

            @C12579k
            /* renamed from: f */
            public final ProductListSource mo82015f() {
                return this.f68276a;
            }

            public int hashCode() {
                return (this.f68276a.hashCode() * 31) + this.f68277b.hashCode();
            }

            @C12579k
            public String toString() {
                ProductListSource productListSource = this.f68276a;
                C11911i<C36334b> iVar = this.f68277b;
                return "Refresh(source=" + productListSource + ", pagingEvents=" + iVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$g */
        public static final class C28188g implements C28181c {

            /* renamed from: c */
            public static final int f68278c = 8;
            @C12579k

            /* renamed from: a */
            public final PlpOffer f68279a;

            /* renamed from: b */
            public final int f68280b;

            public C28188g(@C12579k PlpOffer plpOffer, int i) {
                Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
                this.f68279a = plpOffer;
                this.f68280b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C28188g m118020d(C28188g gVar, PlpOffer plpOffer, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    plpOffer = gVar.f68279a;
                }
                if ((i2 & 2) != 0) {
                    i = gVar.f68280b;
                }
                return gVar.mo82020c(plpOffer, i);
            }

            @C12579k
            /* renamed from: a */
            public final PlpOffer mo82018a() {
                return this.f68279a;
            }

            /* renamed from: b */
            public final int mo82019b() {
                return this.f68280b;
            }

            @C12579k
            /* renamed from: c */
            public final C28188g mo82020c(@C12579k PlpOffer plpOffer, int i) {
                Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
                return new C28188g(plpOffer, i);
            }

            @C12579k
            /* renamed from: e */
            public final PlpOffer mo82021e() {
                return this.f68279a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28188g)) {
                    return false;
                }
                C28188g gVar = (C28188g) obj;
                return Intrinsics.areEqual((Object) this.f68279a, (Object) gVar.f68279a) && this.f68280b == gVar.f68280b;
            }

            /* renamed from: f */
            public final int mo82023f() {
                return this.f68280b;
            }

            public int hashCode() {
                return (this.f68279a.hashCode() * 31) + Integer.hashCode(this.f68280b);
            }

            @C12579k
            public String toString() {
                PlpOffer plpOffer = this.f68279a;
                int i = this.f68280b;
                return "RemoveFromCartPressed(offer=" + plpOffer + ", position=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$h */
        public static final class C28189h implements C28181c {

            /* renamed from: b */
            public static final int f68281b = 0;
            @C12580l

            /* renamed from: a */
            public final String f68282a;

            public C28189h(@C12580l String str) {
                this.f68282a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C28189h m118026c(C28189h hVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = hVar.f68282a;
                }
                return hVar.mo82027b(str);
            }

            @C12580l
            /* renamed from: a */
            public final String mo82026a() {
                return this.f68282a;
            }

            @C12579k
            /* renamed from: b */
            public final C28189h mo82027b(@C12580l String str) {
                return new C28189h(str);
            }

            @C12580l
            /* renamed from: d */
            public final String mo82028d() {
                return this.f68282a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28189h) && Intrinsics.areEqual((Object) this.f68282a, (Object) ((C28189h) obj).f68282a);
            }

            public int hashCode() {
                String str = this.f68282a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f68282a;
                return "SendCriteoTracking(trackingUrl=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$j */
        public static final class C28191j implements C28181c {

            /* renamed from: c */
            public static final int f68287c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferIdentifier f68288a;

            /* renamed from: b */
            public final boolean f68289b;

            public C28191j(@C12579k OfferIdentifier offerIdentifier, boolean z) {
                Intrinsics.checkNotNullParameter(offerIdentifier, "offerIdentifier");
                this.f68288a = offerIdentifier;
                this.f68289b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C28191j m118038d(C28191j jVar, OfferIdentifier offerIdentifier, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerIdentifier = jVar.f68288a;
                }
                if ((i & 2) != 0) {
                    z = jVar.f68289b;
                }
                return jVar.mo82044c(offerIdentifier, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferIdentifier mo82042a() {
                return this.f68288a;
            }

            /* renamed from: b */
            public final boolean mo82043b() {
                return this.f68289b;
            }

            @C12579k
            /* renamed from: c */
            public final C28191j mo82044c(@C12579k OfferIdentifier offerIdentifier, boolean z) {
                Intrinsics.checkNotNullParameter(offerIdentifier, "offerIdentifier");
                return new C28191j(offerIdentifier, z);
            }

            @C12579k
            /* renamed from: e */
            public final OfferIdentifier mo82045e() {
                return this.f68288a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28191j)) {
                    return false;
                }
                C28191j jVar = (C28191j) obj;
                return Intrinsics.areEqual((Object) this.f68288a, (Object) jVar.f68288a) && this.f68289b == jVar.f68289b;
            }

            /* renamed from: f */
            public final boolean mo82047f() {
                return this.f68289b;
            }

            public int hashCode() {
                int hashCode = this.f68288a.hashCode() * 31;
                boolean z = this.f68289b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferIdentifier offerIdentifier = this.f68288a;
                boolean z = this.f68289b;
                return "ShowProductDetails(offerIdentifier=" + offerIdentifier + ", isNotFood=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$i */
        public static final class C28190i implements C28181c {

            /* renamed from: d */
            public static final int f68283d = 8;
            @C12579k

            /* renamed from: a */
            public final C38115c f68284a;

            /* renamed from: b */
            public final boolean f68285b;
            @C12580l

            /* renamed from: c */
            public final String f68286c;

            public C28190i(@C12579k C38115c cVar, boolean z, @C12580l String str) {
                Intrinsics.checkNotNullParameter(cVar, "product");
                this.f68284a = cVar;
                this.f68285b = z;
                this.f68286c = str;
            }

            /* renamed from: e */
            public static /* synthetic */ C28190i m118030e(C28190i iVar, C38115c cVar, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = iVar.f68284a;
                }
                if ((i & 2) != 0) {
                    z = iVar.f68285b;
                }
                if ((i & 4) != 0) {
                    str = iVar.f68286c;
                }
                return iVar.mo82035d(cVar, z, str);
            }

            @C12579k
            /* renamed from: a */
            public final C38115c mo82032a() {
                return this.f68284a;
            }

            /* renamed from: b */
            public final boolean mo82033b() {
                return this.f68285b;
            }

            @C12580l
            /* renamed from: c */
            public final String mo82034c() {
                return this.f68286c;
            }

            @C12579k
            /* renamed from: d */
            public final C28190i mo82035d(@C12579k C38115c cVar, boolean z, @C12580l String str) {
                Intrinsics.checkNotNullParameter(cVar, "product");
                return new C28190i(cVar, z, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28190i)) {
                    return false;
                }
                C28190i iVar = (C28190i) obj;
                return Intrinsics.areEqual((Object) this.f68284a, (Object) iVar.f68284a) && this.f68285b == iVar.f68285b && Intrinsics.areEqual((Object) this.f68286c, (Object) iVar.f68286c);
            }

            @C12580l
            /* renamed from: f */
            public final String mo82037f() {
                return this.f68286c;
            }

            @C12579k
            /* renamed from: g */
            public final C38115c mo82038g() {
                return this.f68284a;
            }

            /* renamed from: h */
            public final boolean mo82039h() {
                return this.f68285b;
            }

            public int hashCode() {
                int hashCode = this.f68284a.hashCode() * 31;
                boolean z = this.f68285b;
                if (z) {
                    z = true;
                }
                int i = (hashCode + (z ? 1 : 0)) * 31;
                String str = this.f68286c;
                return i + (str == null ? 0 : str.hashCode());
            }

            @C12579k
            public String toString() {
                C38115c cVar = this.f68284a;
                boolean z = this.f68285b;
                String str = this.f68286c;
                return "ShoppingListButtonPressed(product=" + cVar + ", isInShoppingList=" + z + ", criteoTrackingUrl=" + str + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C28190i(C38115c cVar, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(cVar, z, (i & 4) != 0 ? null : str);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$c$a */
        public static final class C28182a implements C28181c {

            /* renamed from: e */
            public static final int f68260e = 8;
            @C12579k

            /* renamed from: a */
            public final PlpOffer f68261a;

            /* renamed from: b */
            public final int f68262b;

            /* renamed from: c */
            public final int f68263c;
            @C12580l

            /* renamed from: d */
            public final String f68264d;

            public C28182a(@C12579k PlpOffer plpOffer, int i, int i2, @C12580l String str) {
                Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
                this.f68261a = plpOffer;
                this.f68262b = i;
                this.f68263c = i2;
                this.f68264d = str;
            }

            /* renamed from: f */
            public static /* synthetic */ C28182a m117988f(C28182a aVar, PlpOffer plpOffer, int i, int i2, String str, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    plpOffer = aVar.f68261a;
                }
                if ((i3 & 2) != 0) {
                    i = aVar.f68262b;
                }
                if ((i3 & 4) != 0) {
                    i2 = aVar.f68263c;
                }
                if ((i3 & 8) != 0) {
                    str = aVar.f68264d;
                }
                return aVar.mo81980e(plpOffer, i, i2, str);
            }

            @C12579k
            /* renamed from: a */
            public final PlpOffer mo81976a() {
                return this.f68261a;
            }

            /* renamed from: b */
            public final int mo81977b() {
                return this.f68262b;
            }

            /* renamed from: c */
            public final int mo81978c() {
                return this.f68263c;
            }

            @C12580l
            /* renamed from: d */
            public final String mo81979d() {
                return this.f68264d;
            }

            @C12579k
            /* renamed from: e */
            public final C28182a mo81980e(@C12579k PlpOffer plpOffer, int i, int i2, @C12580l String str) {
                Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
                return new C28182a(plpOffer, i, i2, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28182a)) {
                    return false;
                }
                C28182a aVar = (C28182a) obj;
                return Intrinsics.areEqual((Object) this.f68261a, (Object) aVar.f68261a) && this.f68262b == aVar.f68262b && this.f68263c == aVar.f68263c && Intrinsics.areEqual((Object) this.f68264d, (Object) aVar.f68264d);
            }

            @C12580l
            /* renamed from: g */
            public final String mo81982g() {
                return this.f68264d;
            }

            @C12579k
            /* renamed from: h */
            public final PlpOffer mo81983h() {
                return this.f68261a;
            }

            public int hashCode() {
                int hashCode = ((((this.f68261a.hashCode() * 31) + Integer.hashCode(this.f68262b)) * 31) + Integer.hashCode(this.f68263c)) * 31;
                String str = this.f68264d;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            /* renamed from: i */
            public final int mo81985i() {
                return this.f68263c;
            }

            /* renamed from: j */
            public final int mo81986j() {
                return this.f68262b;
            }

            @C12579k
            public String toString() {
                PlpOffer plpOffer = this.f68261a;
                int i = this.f68262b;
                int i2 = this.f68263c;
                String str = this.f68264d;
                return "AddToCartPressed(offer=" + plpOffer + ", quantity=" + i + ", position=" + i2 + ", criteoOnBasketChangeBeacon=" + str + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C28182a(PlpOffer plpOffer, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(plpOffer, i, i2, (i3 & 8) != 0 ? null : str);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$a */
    public interface C28170a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$a$a */
        public static final class C28171a implements C28170a {

            /* renamed from: b */
            public static final int f68236b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f68237a;

            public C28171a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f68237a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C28171a m117951c(C28171a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f68237a;
                }
                return aVar.mo81931b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo81930a() {
                return this.f68237a;
            }

            @C12579k
            /* renamed from: b */
            public final C28171a mo81931b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C28171a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo81932d() {
                return this.f68237a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28171a) && Intrinsics.areEqual((Object) this.f68237a, (Object) ((C28171a) obj).f68237a);
            }

            public int hashCode() {
                return this.f68237a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f68237a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$a$b */
        public static final class C28172b implements C28170a {

            /* renamed from: c */
            public static final int f68238c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferIdentifier f68239a;

            /* renamed from: b */
            public final boolean f68240b;

            public C28172b(@C12579k OfferIdentifier offerIdentifier, boolean z) {
                Intrinsics.checkNotNullParameter(offerIdentifier, "offerIdentifier");
                this.f68239a = offerIdentifier;
                this.f68240b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C28172b m117955d(C28172b bVar, OfferIdentifier offerIdentifier, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerIdentifier = bVar.f68239a;
                }
                if ((i & 2) != 0) {
                    z = bVar.f68240b;
                }
                return bVar.mo81938c(offerIdentifier, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferIdentifier mo81936a() {
                return this.f68239a;
            }

            /* renamed from: b */
            public final boolean mo81937b() {
                return this.f68240b;
            }

            @C12579k
            /* renamed from: c */
            public final C28172b mo81938c(@C12579k OfferIdentifier offerIdentifier, boolean z) {
                Intrinsics.checkNotNullParameter(offerIdentifier, "offerIdentifier");
                return new C28172b(offerIdentifier, z);
            }

            /* renamed from: e */
            public final boolean mo81939e() {
                return this.f68240b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28172b)) {
                    return false;
                }
                C28172b bVar = (C28172b) obj;
                return Intrinsics.areEqual((Object) this.f68239a, (Object) bVar.f68239a) && this.f68240b == bVar.f68240b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferIdentifier mo81941f() {
                return this.f68239a;
            }

            public int hashCode() {
                int hashCode = this.f68239a.hashCode() * 31;
                boolean z = this.f68240b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferIdentifier offerIdentifier = this.f68239a;
                boolean z = this.f68240b;
                return "NavigateToPdp(offerIdentifier=" + offerIdentifier + ", navigateToNonFoodPdp=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel$a$c */
        public static final class C28173c implements C28170a {

            /* renamed from: f */
            public static final int f68241f = 8;
            @C12579k

            /* renamed from: a */
            public final PlpOffer f68242a;
            @C12579k

            /* renamed from: b */
            public final ProductListSource f68243b;

            /* renamed from: c */
            public final int f68244c;

            /* renamed from: d */
            public final int f68245d;
            @C12580l

            /* renamed from: e */
            public final String f68246e;

            public C28173c(@C12579k PlpOffer plpOffer, @C12579k ProductListSource productListSource, int i, int i2, @C12580l String str) {
                Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
                Intrinsics.checkNotNullParameter(productListSource, "productListParam");
                this.f68242a = plpOffer;
                this.f68243b = productListSource;
                this.f68244c = i;
                this.f68245d = i2;
                this.f68246e = str;
            }

            /* renamed from: g */
            public static /* synthetic */ C28173c m117961g(C28173c cVar, PlpOffer plpOffer, ProductListSource productListSource, int i, int i2, String str, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    plpOffer = cVar.f68242a;
                }
                if ((i3 & 2) != 0) {
                    productListSource = cVar.f68243b;
                }
                ProductListSource productListSource2 = productListSource;
                if ((i3 & 4) != 0) {
                    i = cVar.f68244c;
                }
                int i4 = i;
                if ((i3 & 8) != 0) {
                    i2 = cVar.f68245d;
                }
                int i5 = i2;
                if ((i3 & 16) != 0) {
                    str = cVar.f68246e;
                }
                return cVar.mo81950f(plpOffer, productListSource2, i4, i5, str);
            }

            @C12579k
            /* renamed from: a */
            public final PlpOffer mo81944a() {
                return this.f68242a;
            }

            @C12579k
            /* renamed from: b */
            public final ProductListSource mo81945b() {
                return this.f68243b;
            }

            /* renamed from: c */
            public final int mo81946c() {
                return this.f68244c;
            }

            /* renamed from: d */
            public final int mo81947d() {
                return this.f68245d;
            }

            @C12580l
            /* renamed from: e */
            public final String mo81948e() {
                return this.f68246e;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28173c)) {
                    return false;
                }
                C28173c cVar = (C28173c) obj;
                return Intrinsics.areEqual((Object) this.f68242a, (Object) cVar.f68242a) && Intrinsics.areEqual((Object) this.f68243b, (Object) cVar.f68243b) && this.f68244c == cVar.f68244c && this.f68245d == cVar.f68245d && Intrinsics.areEqual((Object) this.f68246e, (Object) cVar.f68246e);
            }

            @C12579k
            /* renamed from: f */
            public final C28173c mo81950f(@C12579k PlpOffer plpOffer, @C12579k ProductListSource productListSource, int i, int i2, @C12580l String str) {
                Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
                Intrinsics.checkNotNullParameter(productListSource, "productListParam");
                return new C28173c(plpOffer, productListSource, i, i2, str);
            }

            @C12580l
            /* renamed from: h */
            public final String mo81951h() {
                return this.f68246e;
            }

            public int hashCode() {
                int hashCode = ((((((this.f68242a.hashCode() * 31) + this.f68243b.hashCode()) * 31) + Integer.hashCode(this.f68244c)) * 31) + Integer.hashCode(this.f68245d)) * 31;
                String str = this.f68246e;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            /* renamed from: i */
            public final int mo81953i() {
                return this.f68245d;
            }

            @C12579k
            /* renamed from: j */
            public final PlpOffer mo81954j() {
                return this.f68242a;
            }

            /* renamed from: k */
            public final int mo81955k() {
                return this.f68244c;
            }

            @C12579k
            /* renamed from: l */
            public final ProductListSource mo81956l() {
                return this.f68243b;
            }

            @C12579k
            public String toString() {
                PlpOffer plpOffer = this.f68242a;
                ProductListSource productListSource = this.f68243b;
                int i = this.f68244c;
                int i2 = this.f68245d;
                String str = this.f68246e;
                return "ShowQuantityBackDrop(offer=" + plpOffer + ", productListParam=" + productListSource + ", position=" + i + ", currentQuantity=" + i2 + ", criteoBasketChangeBeacon=" + str + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C28173c(PlpOffer plpOffer, ProductListSource productListSource, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(plpOffer, productListSource, i, i2, (i3 & 16) != 0 ? null : str);
            }
        }
    }
}
