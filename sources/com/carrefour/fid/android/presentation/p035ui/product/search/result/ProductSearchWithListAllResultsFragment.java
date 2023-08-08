package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.databinding.C36752l3;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListButton;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListTitle;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38512k;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27272f;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListAllResultsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27308b;
import com.carrefour.fid.android.product.C27607e;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28935i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.helper.C12741a;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SB\u0007¢\u0006\u0004\bP\u0010QJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J&\u0010\u0013\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0012\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0002J\u0016\u0010'\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\fH\u0002J\b\u0010(\u001a\u00020\u0005H\u0002J\b\u0010)\u001a\u00020\u0005H\u0014J\b\u0010*\u001a\u00020\u0005H\u0014J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020+H\u0016J\b\u0010/\u001a\u00020.H\u0016J\u001a\u00104\u001a\u00020\u00052\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000102H\u0016J\b\u00105\u001a\u00020\u0005H\u0016R\u001b\u0010;\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006T"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListAllResultsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/l3;", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/b$c;", "state", "Lkotlin/d2;", "p1", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/b$b;", "event", "j1", "g1", "l1", "", "Lcom/carrefour/fid/android/presentation/models/RecommendedProductsByDepartmentModel;", "departments", "e1", "", "departmentIndex", "productDepartmentIndex", "o1", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "productPosition", "o0", "D", "k1", "z", "Lcom/carrefour/fid/android/presentation/models/OfferDepartmentModel;", "department", "f1", "", "error", "i1", "exception", "h1", "", "keyword", "n1", "keywords", "s1", "m1", "b1", "q1", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListAllResultsViewModel;", "f", "Lkotlin/z;", "d1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListAllResultsViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/f;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/f;", "c1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/f;", "r1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/f;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "w", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductSearchWithListAllResultsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSearchWithListAllResultsFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListAllResultsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,438:1\n106#2,15:439\n168#3,7:454\n183#3,6:461\n1#4:467\n1559#5:468\n1590#5,4:469\n1360#5:473\n1446#5,5:474\n1789#5,3:479\n262#6,2:482\n262#6,2:484\n*S KotlinDebug\n*F\n+ 1 ProductSearchWithListAllResultsFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListAllResultsFragment\n*L\n79#1:439,15\n115#1:454,7\n116#1:461,6\n206#1:468\n206#1:469,4\n238#1:473\n238#1:474,5\n249#1:479,3\n430#1:482,2\n435#1:484,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment */
public final class ProductSearchWithListAllResultsFragment extends C25671h<C36752l3> {

    /* renamed from: X */
    public static final int f62878X = 4;
    @C12579k

    /* renamed from: x */
    public static final C25598a f62879x = new C25598a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f62880y = 8;
    @C12580l

    /* renamed from: z */
    public static final String f62881z = C11342l0.m43547d(ProductSearchWithListAllResultsFragment.class).mo22848s();
    @C12579k

    /* renamed from: f */
    public final C11677z f62882f;
    @Inject

    /* renamed from: g */
    public C28796c f62883g;
    @Inject

    /* renamed from: v */
    public C27272f f62884v;
    @C12580l

    /* renamed from: w */
    public C37370b f62885w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment$a */
    public static final class C25598a {
        public /* synthetic */ C25598a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ ProductSearchWithListAllResultsFragment m110234c(C25598a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo74509b(bundle);
        }

        @C12580l
        /* renamed from: a */
        public final String mo74508a() {
            return ProductSearchWithListAllResultsFragment.f62881z;
        }

        @C12579k
        /* renamed from: b */
        public final ProductSearchWithListAllResultsFragment mo74509b(@C12580l Bundle bundle) {
            ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment = new ProductSearchWithListAllResultsFragment();
            productSearchWithListAllResultsFragment.setArguments(bundle);
            return productSearchWithListAllResultsFragment;
        }

        public C25598a() {
        }
    }

    public ProductSearchWithListAllResultsFragment() {
        super(C255971.f62886a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25610x9552a068(new C25609x9552a067(this)));
        this.f62882f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ProductSearchWithListAllResultsViewModel.class), new C25611x9552a069(b), new C25612x9552a06a((C11289a) null, b), new C25613x9552a06b(this, b));
    }

    /* renamed from: t1 */
    public static final void m110211t1(ProductSearchWithListAllResultsFragment productSearchWithListAllResultsFragment, View view) {
        Intrinsics.checkNotNullParameter(productSearchWithListAllResultsFragment, "this$0");
        productSearchWithListAllResultsFragment.requireActivity().onBackPressed();
    }

    /* renamed from: D */
    public final void mo74484D(OfferProductModel offerProductModel, int i) {
        mo74486c1().mo79310f(offerProductModel, i);
        mo74487d1().sendIntent(new C27308b.C27315d.C27322g(offerProductModel));
    }

    /* renamed from: b1 */
    public void mo74485b1() {
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C13825a.m58787p(requireActivity, false, 0, 0, 7, (Object) null);
    }

    @C12579k
    /* renamed from: c1 */
    public final C27272f mo74486c1() {
        C27272f fVar = this.f62884v;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: d1 */
    public final ProductSearchWithListAllResultsViewModel mo74487d1() {
        return (ProductSearchWithListAllResultsViewModel) this.f62882f.getValue();
    }

    /* renamed from: e1 */
    public final void mo74488e1(List<RecommendedProductsByDepartmentModel> list) {
        if (list.isEmpty()) {
            mo74490g1();
            return;
        }
        hideLoading();
        hideEmpty();
        hideErrorView();
        C37370b bVar = this.f62885w;
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = (RecommendedProductsByDepartmentModel) next;
                List i3 = C10976s.m41417i();
                String Q = recommendedProductsByDepartmentModel.mo121907e().mo121689Q();
                int size = recommendedProductsByDepartmentModel.mo121909f().size();
                i3.add(new ProductCardListTitle.C37368a(Q + C36306e.f89637a + size + ")"));
                Iterable E5 = CollectionsKt___CollectionsKt.m40497E5(recommendedProductsByDepartmentModel.mo121909f(), 4);
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(E5, 10));
                int i4 = 0;
                for (Object next2 : E5) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    OfferProductModel offerProductModel = (OfferProductModel) next2;
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "resources");
                    OfferProductModel offerProductModel2 = offerProductModel;
                    Resources resources2 = resources;
                    List<RecommendedProductsByDepartmentModel> list2 = list;
                    OfferProductModel offerProductModel3 = offerProductModel;
                    int i6 = i;
                    ArrayList arrayList3 = arrayList2;
                    int i7 = i4;
                    C25614xb19c0950 productSearchWithListAllResultsFragment$handleDepartmentList$1$1$1$1 = new C25614xb19c0950(this, offerProductModel2, list2, i6, i7);
                    C25615xb19c0951 productSearchWithListAllResultsFragment$handleDepartmentList$1$1$1$2 = C25615xb19c0951.f62895f;
                    C25616xb19c0952 productSearchWithListAllResultsFragment$handleDepartmentList$1$1$1$3 = new C25616xb19c0952(this, offerProductModel3, list2, i6, i7);
                    OfferProductModel offerProductModel4 = offerProductModel3;
                    arrayList3.add(C38512k.m159777a(offerProductModel3, resources2, productSearchWithListAllResultsFragment$handleDepartmentList$1$1$1$1, productSearchWithListAllResultsFragment$handleDepartmentList$1$1$1$2, productSearchWithListAllResultsFragment$handleDepartmentList$1$1$1$3, new C25617xb19c0953(this, offerProductModel4), new C25618xb19c0954(this, offerProductModel4)));
                    arrayList2 = arrayList3;
                    i4 = i5;
                }
                i3.addAll(arrayList2);
                String string = getString(R.string.search_with_list_all_results_see_more);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.searc…ist_all_results_see_more)");
                i3.add(new ProductCardListButton.C37366a(string, Integer.valueOf(R.drawable.ds_ic_symbol_plus), new C25619x534c5984(this, recommendedProductsByDepartmentModel)));
                C10994x.m42360n0(arrayList, C10976s.m41409a(i3));
                i = i2;
            }
            bVar.setList(arrayList);
        }
        C27272f c1 = mo74486c1();
        ArrayList arrayList4 = new ArrayList();
        for (RecommendedProductsByDepartmentModel f : list) {
            C10994x.m42360n0(arrayList4, CollectionsKt___CollectionsKt.m40497E5(f.mo121909f(), 4));
        }
        c1.mo79306b(arrayList4);
        ((C36752l3) getBinding()).f91199c.setVisibility(0);
    }

    public /* bridge */ /* synthetic */ C11079d2 emptyFunction() {
        mo74485b1();
        return C11079d2.f28267a;
    }

    @C12579k
    public ViewStub emptyMessageLayout() {
        ViewStub viewStub = ((C36752l3) getBinding()).f91201e;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubSearchWithListAllResultsEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36752l3) getBinding()).f91202f;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubSearchWithListAllResultsError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo74489f1(OfferDepartmentModel offerDepartmentModel) {
        String Q = offerDepartmentModel.mo121689Q();
        if (Q == null) {
            Q = "";
        }
        mo74498n1(Q);
    }

    /* renamed from: g1 */
    public final void mo74490g1() {
        hideLoading();
        hideErrorView();
        mo74496l1();
        Drawable i = C17318d.m79726i(requireContext(), R.drawable.ds_il_catalog_without_result);
        String string = getString(R.string.search_with_list_result_empty_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.searc…_list_result_empty_title)");
        C28500r.C28501a.m118420b(this, new MessageComponent.C37154a(i, string, getString(R.string.search_with_list_result_empty_description), getString(R.string.search_with_list_result_empty_retry), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), new ProductSearchWithListAllResultsFragment$handleEmptyProductList$1(this), (C11289a) null, (C11289a) null, 12, (Object) null);
        showEmpty();
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f62883g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74492h1(java.lang.Throwable r16) {
        /*
            r15 = this;
            r14 = r15
            r0 = r16
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.p046io.RequireSignInThrowable
            if (r1 == 0) goto L_0x001a
            r1 = 0
            r2 = 2130772018(0x7f010032, float:1.7147143E38)
            r3 = 2130772012(0x7f01002c, float:1.714713E38)
            r4 = 994(0x3e2, float:1.393E-42)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r15
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58770u(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0189
        L_0x001a:
            boolean r1 = r0 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable
            if (r1 == 0) goto L_0x002b
            com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment$handleErrorEvent$1 r0 = new com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment$handleErrorEvent$1
            r0.<init>(r15)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r15, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r15)
            goto L_0x0189
        L_0x002b:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            if (r1 == 0) goto L_0x0062
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r0
            java.lang.String r3 = r0.getMessage()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r2, r3, r4, r5, r6, r7)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r15
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0189
        L_0x0062:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r1 == 0) goto L_0x008d
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r0 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r0
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r0 = r0.mo108325a()
            android.content.Context r2 = r15.requireContext()
            java.lang.String r3 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r0, r2)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r15
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0189
        L_0x008d:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r1 == 0) goto L_0x00b8
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            com.carrefour.fid.android.core.io.BasketThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r0
            com.carrefour.fid.android.core.type.BasketErrorType r0 = r0.mo108318a()
            int r0 = r0.mo108470q()
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(exception.error.resourceId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r15
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0189
        L_0x00b8:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x00fc
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.carrefour.fid.android.core.io.BasketUpdateThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketUpdateThrowable) r0
            java.lang.Throwable r0 = r0.getCause()
            boolean r5 = r0 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r5 == 0) goto L_0x00d0
            r2 = r0
            com.carrefour.fid.android.shared.io.ResponseThrowable r2 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r2
        L_0x00d0:
            if (r2 == 0) goto L_0x00d7
            int r0 = r2.mo83810a()
            goto L_0x00d8
        L_0x00d7:
            r0 = r4
        L_0x00d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            r0 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r2 = r15.getString(r0, r3)
            java.lang.String r0 = "getString(\n             …: 0\n                    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r15
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0189
        L_0x00fc:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r1 == 0) goto L_0x014f
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            kotlin.jvm.internal.t0 r5 = kotlin.jvm.internal.C11368t0.f28504a
            java.util.Locale r5 = java.util.Locale.getDefault()
            r6 = 2131952767(0x7f13047f, float:1.9541986E38)
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r7 = "getString(R.string.frequ…ales_default_error_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.carrefour.fid.android.core.io.ShoppingListThrowable r0 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r0
            java.lang.Throwable r0 = r0.getCause()
            boolean r8 = r0 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r8 == 0) goto L_0x0123
            r2 = r0
            com.carrefour.fid.android.shared.io.ResponseThrowable r2 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r2
        L_0x0123:
            if (r2 == 0) goto L_0x012a
            int r0 = r2.mo83810a()
            goto L_0x012b
        L_0x012a:
            r0 = r4
        L_0x012b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r4] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r3)
            java.lang.String r2 = java.lang.String.format(r5, r6, r0)
            java.lang.String r0 = "format(locale, format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r15
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0189
        L_0x014f:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketClosedStoreThrowable
            if (r1 == 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            boolean r3 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketExpiredFacilityStoreIdThrowable
        L_0x0156:
            if (r3 == 0) goto L_0x0182
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131951974(0x7f130166, float:1.9540378E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(R.string.basket_error_closed_store)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r15
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment$handleErrorEvent$2 r0 = new com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListAllResultsFragment$handleErrorEvent$2
            r0.<init>(r15)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r15, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r15)
            goto L_0x0189
        L_0x0182:
            boolean r0 = r0 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r0 == 0) goto L_0x0189
            r15.mo74490g1()
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.search.result.ProductSearchWithListAllResultsFragment.mo74492h1(java.lang.Throwable):void");
    }

    /* renamed from: i1 */
    public final void mo74493i1(Throwable th) {
        C28935i iVar = C28935i.f70940a;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C28935i.m119705e(iVar, message, th, 0, 4, (Object) null);
        hideLoading();
        hideEmpty();
        mo74496l1();
        Drawable i = C17318d.m79726i(requireContext(), R.drawable.ds_il_deleted_product_list);
        String string = getString(R.string.search_with_list_result_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.searc…_list_result_error_title)");
        C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string, getString(R.string.search_with_list_result_error_description), getString(R.string.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), new ProductSearchWithListAllResultsFragment$handleErrorPage$1(this), (C11289a) null, (C11289a) null, 12, (Object) null);
        C28500r.C28501a.m118423e(this, false, 1, (Object) null);
    }

    /* renamed from: j1 */
    public final void mo74494j1(C27308b.C27311b bVar) {
        if (bVar instanceof C27308b.C27311b.C27313b) {
            C27308b.C27311b.C27313b bVar2 = (C27308b.C27311b.C27313b) bVar;
            getNavigator().mo83838n(C19736g.m91827a(this), OfferProductModelKt.m159574W(bVar2.mo79458f()), bVar2.mo79456e());
        } else if (bVar instanceof C27308b.C27311b.C27312a) {
            mo74492h1(((C27308b.C27311b.C27312a) bVar).mo79449d());
        }
    }

    /* renamed from: k1 */
    public final void mo74495k1(OfferProductModel offerProductModel) {
        FragmentExtensionKt.m58756g(this, offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen.PRODUCTS, (ProductListSettingsModel) null, 4, (Object) null);
        FragmentExtensionKt.m58759j(this, new ProductSearchWithListAllResultsFragment$handleOnMixingPressed$1(this));
        mo74487d1().sendIntent(new C27308b.C27315d.C27318c(offerProductModel));
    }

    /* renamed from: l1 */
    public final void mo74496l1() {
        ((C36752l3) getBinding()).f91199c.setVisibility(8);
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36752l3) getBinding()).f91200d;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.searchWithListAllResultsShimmer");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo74497m1() {
        NotificationComponent notificationComponent = ((C36752l3) getBinding()).f91198b;
        Intrinsics.checkNotNullExpressionValue(notificationComponent, "binding.searchWithListAllResultsErrorNotification");
        notificationComponent.setVisibility(8);
    }

    /* renamed from: n1 */
    public final void mo74498n1(String str) {
        C19736g.m91827a(this).mo58130W(R.id.product_list_search_graph, new C27607e(str).mo80218f());
    }

    /* renamed from: o0 */
    public final void mo74499o0(OfferProductModel offerProductModel, int i) {
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo74487d1().sendIntent(new C27308b.C27315d.C27316a(offerProductModel));
            mo74486c1().mo79308d(offerProductModel, 1, i);
            return;
        }
        FragmentExtensionKt.m58759j(this, new ProductSearchWithListAllResultsFragment$handleAtcPressed$1(this, offerProductModel, p0, i));
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, offerProductModel, offerProductModel.mo121519p0(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: o1 */
    public final int mo74500o1(List<RecommendedProductsByDepartmentModel> list, int i, int i2) {
        int i3 = 0;
        for (RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel : CollectionsKt___CollectionsKt.m40497E5(list, i)) {
            int i4 = 4;
            if (recommendedProductsByDepartmentModel.mo121909f().size() <= 4) {
                i4 = recommendedProductsByDepartmentModel.mo121909f().size();
            }
            i3 += i4;
        }
        return i3 + i2 + 1;
    }

    public void onResume() {
        super.onResume();
        mo74487d1().sendIntent(new C27308b.C27315d.C27319d(getArguments()));
        mo74486c1().mo79311g();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = ((C36752l3) getBinding()).f91199c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.searchWithListAllResultsOfferList");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f62885w = C37373c.m153544b(recyclerView, requireContext, (C37390r) null, 2, (Object) null);
        ProductSearchWithListAllResultsViewModel d1 = mo74487d1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25604xd5a61328(this, d1, (C11045c) null, this), 3, (Object) null);
        ProductSearchWithListAllResultsViewModel d12 = mo74487d1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C25599xf4ae62f1(this, d12, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: p1 */
    public final void mo74501p1(C27308b.C27314c cVar) {
        C11079d2 d2Var;
        if (cVar.isLoading()) {
            showLoading();
        }
        List<RecommendedProductsByDepartmentModel> n = cVar.mo79472n();
        C11079d2 d2Var2 = null;
        if (n != null) {
            boolean z = true;
            if (!n.isEmpty()) {
                Collection p = cVar.mo79474p();
                if (p != null && !p.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    mo74504s1(cVar.mo79474p());
                } else {
                    mo74497m1();
                }
                mo74488e1(n);
            } else {
                mo74490g1();
            }
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            mo74496l1();
        }
        Throwable o = cVar.mo79473o();
        if (o != null) {
            mo74493i1(o);
            d2Var2 = C11079d2.f28267a;
        }
        if (d2Var2 == null) {
            hideErrorView();
        }
    }

    /* renamed from: q1 */
    public void mo74502q1() {
        mo74487d1().sendIntent(new C27308b.C27315d.C27319d(getArguments()));
    }

    /* renamed from: r1 */
    public final void mo74503r1(@C12579k C27272f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f62884v = fVar;
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo74502q1();
        return C11079d2.f28267a;
    }

    /* renamed from: s1 */
    public final void mo74504s1(List<String> list) {
        String str;
        NotificationComponent notificationComponent = ((C36752l3) getBinding()).f91198b;
        notificationComponent.mo112945y(NotificationComponent.Variant.WARNING);
        if (list.size() > 1) {
            str = getString(R.string.search_with_list_result_not_found_for_keywords, Integer.valueOf(list.size()));
        } else {
            str = getString(R.string.search_with_list_result_not_found_for_keyword);
        }
        Intrinsics.checkNotNullExpressionValue(str, "if (keywords.size > 1) {…rd)\n                    }");
        String lowerCase = CollectionsKt___CollectionsKt.m40639h3(list, C12741a.f31457b, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        notificationComponent.mo112943w(new NotificationComponent.C37156a(str, lowerCase, getString(R.string.search_with_list_result_empty_retry), false));
        notificationComponent.setOnActionClickListener(new C25674k(this));
        Intrinsics.checkNotNullExpressionValue(notificationComponent, "showErrorNotification$lambda$9");
        notificationComponent.setVisibility(0);
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f62883g = cVar;
    }

    /* renamed from: z */
    public final void mo74506z(OfferProductModel offerProductModel) {
        mo74487d1().sendIntent(new C27308b.C27315d.C27318c(offerProductModel));
    }
}
