package com.carrefour.fid.android.presentation.viewmodels.home;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.domain.interactors.basket.C37556a0;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.interactors.catalog.C37612d;
import com.carrefour.fid.android.domain.interactors.category.C37619a;
import com.carrefour.fid.android.domain.interactors.feedback.C37688c;
import com.carrefour.fid.android.domain.interactors.product.C37779q;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.p045di.annotation.C28670n;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28947q;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10975r0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001Bf\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A\u0012\b\b\u0001\u0010H\u001a\u00020Eø\u0001\u0000¢\u0006\u0004\bs\u0010tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0002J\u0013\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013J#\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00108\u001a\u0002058\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000b0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010KR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010KR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0I8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010KR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0W8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001f\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020b0W8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010ZR\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020b0\\8\u0006¢\u0006\f\n\u0004\be\u0010^\u001a\u0004\bf\u0010`R\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000b0h8@X\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020h8@X\u0004¢\u0006\u0006\u001a\u0004\bl\u0010jR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020h8@X\u0004¢\u0006\u0006\u001a\u0004\bn\u0010jR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020Q0h8@X\u0004¢\u0006\u0006\u001a\u0004\bo\u0010jR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020T0h8@X\u0004¢\u0006\u0006\u001a\u0004\bq\u0010j\u0002\u0004\n\u0002\b\u0019¨\u0006u"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Lkotlin/d2;", "sendAirshipEvent", "G0", "H0", "()V", "r0", "Lcom/carrefour/fid/android/domain/models/catalog/a;", "F0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "navigateToHome", "Lkotlinx/coroutines/c2;", "v0", "(Z)Lkotlinx/coroutines/c2;", "", "catalogId", "s0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "eanProduct", "t0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "ref", "u0", "ean", "", "Lcom/carrefour/fid/android/domain/models/product/detail/OfferDetail$ChannelType;", "D0", "Lcom/carrefour/fid/android/domain/interactors/feedback/c;", "d", "Lcom/carrefour/fid/android/domain/interactors/feedback/c;", "checkUsabillaUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "e", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "f", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/catalog/d;", "g", "Lcom/carrefour/fid/android/domain/interactors/catalog/d;", "getCatalogDetailsUseCase", "Lcom/carrefour/fid/android/tracking/a;", "h", "Lcom/carrefour/fid/android/tracking/a;", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/domain/interactors/basket/e0;", "i", "Lcom/carrefour/fid/android/domain/interactors/basket/e0;", "retrieveBasketFromCacheUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/a0;", "j", "Lcom/carrefour/fid/android/domain/interactors/basket/a0;", "observeBasketsItemCountUseCase", "Lcom/carrefour/fid/android/domain/interactors/category/a;", "k", "Lcom/carrefour/fid/android/domain/interactors/category/a;", "getCategoriesUseCase", "Lcom/carrefour/fid/android/domain/interactors/catalog/b;", "l", "Lcom/carrefour/fid/android/domain/interactors/catalog/b;", "getCatalogActionUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/q;", "m", "Lcom/carrefour/fid/android/domain/interactors/product/q;", "getProductChannelTypesUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "n", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/carrefour/fid/android/shared/util/q;", "o", "Lcom/carrefour/fid/android/shared/util/q;", "singleUsabillaResult", "p", "singleNavigateToAccountResult", "q", "singleNavigateToHome", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "r", "singleNavigateToCatalogResult", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "s", "singleNavigateToCatalogProductResult", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "t", "Lkotlinx/coroutines/flow/j;", "_navigationDepartmentResult", "Lkotlinx/coroutines/flow/u;", "u", "Lkotlinx/coroutines/flow/u;", "C0", "()Lkotlinx/coroutines/flow/u;", "navigationDepartmentResult", "", "v", "_basketCount", "w", "x0", "basketCount", "Landroidx/lifecycle/LiveData;", "E0", "()Landroidx/lifecycle/LiveData;", "usabillaResult", "y0", "navigateToAccountResult", "B0", "A0", "navigateToCatalogResult", "z0", "navigateToCatalogProductResult", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/feedback/c;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/catalog/d;Lcom/carrefour/fid/android/tracking/a;Lcom/carrefour/fid/android/domain/interactors/basket/e0;Lcom/carrefour/fid/android/domain/interactors/basket/a0;Lcom/carrefour/fid/android/domain/interactors/category/a;Lcom/carrefour/fid/android/domain/interactors/catalog/b;Lcom/carrefour/fid/android/domain/interactors/product/q;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n288#2,2:191\n1#3:193\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomeViewModel\n*L\n151#1:191,2\n*E\n"})
public final class HomeViewModel extends C28498p {

    /* renamed from: x */
    public static final int f64493x = 8;
    @C12579k

    /* renamed from: d */
    public final C37688c f64494d;
    @C12579k

    /* renamed from: e */
    public final C37878e f64495e;
    @C12579k

    /* renamed from: f */
    public final LoyaltyPreferencesStorage f64496f;
    @C12579k

    /* renamed from: g */
    public final C37612d f64497g;
    @C12579k

    /* renamed from: h */
    public final C28994a f64498h;
    @C12579k

    /* renamed from: i */
    public final C37566e0 f64499i;
    @C12579k

    /* renamed from: j */
    public final C37556a0 f64500j;
    @C12579k

    /* renamed from: k */
    public final C37619a f64501k;
    @C12579k

    /* renamed from: l */
    public final C37610b f64502l;
    @C12579k

    /* renamed from: m */
    public final C37779q f64503m;
    @C12579k

    /* renamed from: n */
    public final CoroutineDispatcher f64504n;
    @C12579k

    /* renamed from: o */
    public final C28947q<Boolean> f64505o = new C28947q<>();
    @C12579k

    /* renamed from: p */
    public final C28947q<C11079d2> f64506p = new C28947q<>();
    @C12579k

    /* renamed from: q */
    public final C28947q<C11079d2> f64507q = new C28947q<>();
    @C12579k

    /* renamed from: r */
    public final C28947q<Catalog> f64508r = new C28947q<>();
    @C12579k

    /* renamed from: s */
    public final C28947q<CatalogProduct> f64509s = new C28947q<>();
    @C12579k

    /* renamed from: t */
    public final C11940j<ProductCategory> f64510t;
    @C12579k

    /* renamed from: u */
    public final C11952u<ProductCategory> f64511u;
    @C12579k

    /* renamed from: v */
    public final C11940j<Integer> f64512v;
    @C12579k

    /* renamed from: w */
    public final C11952u<Integer> f64513w;

    @Inject
    public HomeViewModel(@C12579k C37688c cVar, @C12579k C37878e eVar, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C37612d dVar, @C12579k C28994a aVar, @C12579k C37566e0 e0Var, @C12579k C37556a0 a0Var, @C12579k C37619a aVar2, @C12579k C37610b bVar, @C12579k C37779q qVar, @C28670n @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(cVar, "checkUsabillaUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(dVar, "getCatalogDetailsUseCase");
        Intrinsics.checkNotNullParameter(aVar, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(a0Var, "observeBasketsItemCountUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "getCategoriesUseCase");
        Intrinsics.checkNotNullParameter(bVar, "getCatalogActionUseCase");
        Intrinsics.checkNotNullParameter(qVar, "getProductChannelTypesUseCase");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f64494d = cVar;
        this.f64495e = eVar;
        this.f64496f = loyaltyPreferencesStorage;
        this.f64497g = dVar;
        this.f64498h = aVar;
        this.f64499i = e0Var;
        this.f64500j = a0Var;
        this.f64501k = aVar2;
        this.f64502l = bVar;
        this.f64503m = qVar;
        this.f64504n = coroutineDispatcher;
        C11940j<ProductCategory> a = C11953v.m47628a(null);
        this.f64510t = a;
        this.f64511u = C11909g.m47470m(a);
        C11940j<Integer> a2 = C11953v.m47628a(0);
        this.f64512v = a2;
        this.f64513w = C11909g.m47470m(a2);
        mo76824G0();
    }

    /* renamed from: w0 */
    public static /* synthetic */ C11723c2 m112700w0(HomeViewModel homeViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return homeViewModel.mo76831v0(z);
    }

    @C12579k
    /* renamed from: A0 */
    public final LiveData<Catalog> mo76818A0() {
        return this.f64508r;
    }

    @C12579k
    /* renamed from: B0 */
    public final LiveData<C11079d2> mo76819B0() {
        return this.f64507q;
    }

    @C12579k
    /* renamed from: C0 */
    public final C11952u<ProductCategory> mo76820C0() {
        return this.f64511u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76821D0(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.List<? extends com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$getProductBasketTypes$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$getProductBasketTypes$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$getProductBasketTypes$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$getProductBasketTypes$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$getProductBasketTypes$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.product.q r6 = r4.f64503m
            java.lang.String r5 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r5)
            r0.label = r3
            java.lang.Object r5 = r6.mo79986a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            boolean r6 = kotlin.Result.m38709i(r5)
            if (r6 == 0) goto L_0x0050
            r5 = 0
        L_0x0050:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel.mo76821D0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: E0 */
    public final LiveData<Boolean> mo76822E0() {
        return this.f64505o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76823F0(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.catalog.C37976a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$handleCatalogDeeplinkBehavior$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$handleCatalogDeeplinkBehavior$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$handleCatalogDeeplinkBehavior$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$handleCatalogDeeplinkBehavior$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$handleCatalogDeeplinkBehavior$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.catalog.b r5 = r4.f64502l
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38710j(r5)
            if (r0 == 0) goto L_0x004e
            com.carrefour.fid.android.domain.models.catalog.a r5 = (com.carrefour.fid.android.domain.models.catalog.C37976a) r5
            return r5
        L_0x004e:
            com.carrefour.fid.android.domain.models.catalog.d r5 = new com.carrefour.fid.android.domain.models.catalog.d
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel.mo76823F0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: G0 */
    public final void mo76824G0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$observeBasketCount$1(this, (C11045c<? super HomeViewModel$observeBasketCount$1>) null), 3, (Object) null);
    }

    /* renamed from: H0 */
    public final void mo76825H0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$sendAirshipAppCloseBasketEvent$1(this, (C11045c<? super HomeViewModel$sendAirshipAppCloseBasketEvent$1>) null), 3, (Object) null);
    }

    /* renamed from: r0 */
    public final void mo76826r0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$checkUsabillaConsent$1(this, (C11045c<? super HomeViewModel$checkUsabillaConsent$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76827s0(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalog$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalog$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalog$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalog$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalog$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel) r5
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
            com.carrefour.fid.android.domain.interactors.catalog.d r6 = r4.f64497g
            java.lang.String r5 = com.carrefour.fid.android.domain.models.catalog.C37977b.m156218b(r5)
            com.carrefour.fid.android.domain.models.catalog.b r5 = com.carrefour.fid.android.domain.models.catalog.C37977b.m156217a(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r5, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r5 = r4
        L_0x0054:
            boolean r0 = kotlin.Result.m38710j(r6)
            if (r0 == 0) goto L_0x0069
            com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails r6 = (com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails) r6
            if (r6 == 0) goto L_0x0069
            com.carrefour.fid.android.domain.models.catalog.Catalog r6 = com.carrefour.fid.android.domain.models.catalog.details.extension.C37985a.m156312b(r6)
            if (r6 == 0) goto L_0x0069
            com.carrefour.fid.android.shared.util.q<com.carrefour.fid.android.domain.models.catalog.Catalog> r5 = r5.f64508r
            r5.mo57493o(r6)
        L_0x0069:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel.mo76827s0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public final void sendAirshipEvent() {
        this.f64498h.mo32669d(C13758b.f33457l0, C10975r0.m41401k(C11078d1.m42659a(C13758b.f33459m0, C28932h.f70914a.mo84245o())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a A[EDGE_INSN: B:34:0x008a->B:29:0x008a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76829t0(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalogProduct$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalogProduct$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalogProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalogProduct$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchCatalogProduct$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel) r5
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005b
        L_0x0038:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0040:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.catalog.d r7 = r4.f64497g
            java.lang.String r5 = com.carrefour.fid.android.domain.models.catalog.C37977b.m156218b(r5)
            com.carrefour.fid.android.domain.models.catalog.b r5 = com.carrefour.fid.android.domain.models.catalog.C37977b.m156217a(r5)
            r0.L$0 = r4
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172966invokegIAlus(r5, r0)
            if (r7 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r5 = r4
        L_0x005b:
            boolean r0 = kotlin.Result.m38710j(r7)
            if (r0 == 0) goto L_0x0093
            com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails r7 = (com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails) r7
            if (r7 == 0) goto L_0x0093
            java.util.List r7 = com.carrefour.fid.android.domain.models.catalog.details.extension.C37985a.m156311a(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x006f:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r7.next()
            r2 = r0
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r2 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r2
            if (r2 == 0) goto L_0x0083
            java.lang.String r1 = r2.mo117238v()
        L_0x0083:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r6)
            if (r1 == 0) goto L_0x006f
            r1 = r0
        L_0x008a:
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r1 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct) r1
            if (r1 == 0) goto L_0x0093
            com.carrefour.fid.android.shared.util.q<com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct> r5 = r5.f64509s
            r5.mo57493o(r1)
        L_0x0093:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel.mo76829t0(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: u0 */
    public final Object mo76830u0(@C12580l String str, @C12579k C11045c<? super C11079d2> cVar) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$fetchDepartments$2(this, str, (C11045c<? super HomeViewModel$fetchDepartments$2>) null), 3, (Object) null);
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: v0 */
    public final C11723c2 mo76831v0(boolean z) {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$fetchLoyaltyCard$1(this, z, (C11045c<? super HomeViewModel$fetchLoyaltyCard$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: x0 */
    public final C11952u<Integer> mo76832x0() {
        return this.f64513w;
    }

    @C12579k
    /* renamed from: y0 */
    public final LiveData<C11079d2> mo76833y0() {
        return this.f64506p;
    }

    @C12579k
    /* renamed from: z0 */
    public final LiveData<CatalogProduct> mo76834z0() {
        return this.f64509s;
    }
}
