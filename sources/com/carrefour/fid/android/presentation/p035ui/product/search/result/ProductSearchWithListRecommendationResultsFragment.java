package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.databinding.C36762m3;
import com.carrefour.fid.android.design.components.extension.ButtonKt;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListTitle;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38512k;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27280k;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListRecommendationResultsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28935i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001VB\u0007¢\u0006\u0004\bS\u0010TJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\"\u0010\u0010\u001a\u00020\u00032\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bH\u0002J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010 \u001a\u00020\u0003H\u0002J\b\u0010!\u001a\u00020\u0003H\u0002J\b\u0010\"\u001a\u00020\u0003H\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J\b\u0010&\u001a\u00020\u0003H\u0002J\u0016\u0010(\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\rH\u0002J\b\u0010)\u001a\u00020\u0003H\u0002J\u001a\u0010.\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J\b\u0010/\u001a\u00020\u0003H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u000200H\u0016J\b\u00104\u001a\u000203H\u0016J\b\u00105\u001a\u00020\u0003H\u0014R\u001b\u0010;\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006W"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListRecommendationResultsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/m3;", "Lkotlin/d2;", "l1", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/d$k;", "state", "n1", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/d$j;", "event", "g1", "", "", "", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "productsByCategories", "h1", "offer", "", "productPosition", "o0", "D", "", "isLoading", "q1", "t1", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/d$h;", "error", "e1", "", "exception", "f1", "s1", "a1", "d1", "r1", "i1", "w1", "k1", "keywords", "u1", "j1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "o1", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListRecommendationResultsViewModel;", "f", "Lkotlin/z;", "c1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListRecommendationResultsViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/k;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/k;", "b1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/k;", "p1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/k;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "w", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "x", "Z", "isServiceSelectionBackDropShown", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductSearchWithListRecommendationResultsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSearchWithListRecommendationResultsFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListRecommendationResultsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,423:1\n106#2,15:424\n168#3,7:439\n183#3,6:446\n1864#4,3:452\n1360#4:455\n1446#4,2:456\n1559#4:458\n1590#4,4:459\n1448#4,3:463\n262#5,2:466\n262#5,2:468\n262#5,2:470\n262#5,2:472\n262#5,2:474\n262#5,2:476\n*S KotlinDebug\n*F\n+ 1 ProductSearchWithListRecommendationResultsFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListRecommendationResultsFragment\n*L\n74#1:424,15\n88#1:439,7\n89#1:446,6\n127#1:452,3\n157#1:455\n157#1:456,2\n166#1:458\n166#1:459,4\n157#1:463,3\n378#1:466,2\n382#1:468,2\n386#1:470,2\n390#1:472,2\n411#1:474,2\n420#1:476,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListRecommendationResultsFragment */
public final class ProductSearchWithListRecommendationResultsFragment extends C25672i<C36762m3> {
    @C12580l

    /* renamed from: X */
    public static final String f62896X = C11342l0.m43547d(ProductSearchWithListRecommendationResultsFragment.class).mo22848s();
    @C12579k

    /* renamed from: y */
    public static final C25621a f62897y = new C25621a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f62898z = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f62899f;
    @Inject

    /* renamed from: g */
    public C28796c f62900g;
    @Inject

    /* renamed from: v */
    public C27280k f62901v;
    @C12580l

    /* renamed from: w */
    public C37370b f62902w;

    /* renamed from: x */
    public boolean f62903x;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListRecommendationResultsFragment$a */
    public static final class C25621a {
        public /* synthetic */ C25621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ ProductSearchWithListRecommendationResultsFragment m110279c(C25621a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo74547b(bundle);
        }

        @C12580l
        /* renamed from: a */
        public final String mo74546a() {
            return ProductSearchWithListRecommendationResultsFragment.f62896X;
        }

        @C12579k
        /* renamed from: b */
        public final ProductSearchWithListRecommendationResultsFragment mo74547b(@C12580l Bundle bundle) {
            ProductSearchWithListRecommendationResultsFragment productSearchWithListRecommendationResultsFragment = new ProductSearchWithListRecommendationResultsFragment();
            productSearchWithListRecommendationResultsFragment.setArguments(bundle);
            return productSearchWithListRecommendationResultsFragment;
        }

        public C25621a() {
        }
    }

    public ProductSearchWithListRecommendationResultsFragment() {
        super(C256201.f62904a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25633x6a1dbe3a(new C25632x6a1dbe39(this)));
        this.f62899f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ProductSearchWithListRecommendationResultsViewModel.class), new C25634x6a1dbe3b(b), new C25635x6a1dbe3c((C11289a) null, b), new C25636x6a1dbe3d(this, b));
    }

    /* renamed from: m1 */
    public static final void m110253m1(ProductSearchWithListRecommendationResultsFragment productSearchWithListRecommendationResultsFragment, View view) {
        Intrinsics.checkNotNullParameter(productSearchWithListRecommendationResultsFragment, "this$0");
        productSearchWithListRecommendationResultsFragment.mo74521a1();
    }

    /* renamed from: v1 */
    public static final void m110254v1(ProductSearchWithListRecommendationResultsFragment productSearchWithListRecommendationResultsFragment, View view) {
        Intrinsics.checkNotNullParameter(productSearchWithListRecommendationResultsFragment, "this$0");
        productSearchWithListRecommendationResultsFragment.requireActivity().onBackPressed();
    }

    /* renamed from: D */
    public final void mo74520D(OfferProductModel offerProductModel, int i) {
        mo74522b1().mo79323i(offerProductModel, i);
        mo74523c1().sendIntent(new C27336d.C27351l.C27358g(offerProductModel));
    }

    /* renamed from: a1 */
    public final void mo74521a1() {
        mo74538q1(true);
        mo74523c1().sendIntent(C27336d.C27351l.C27352a.f66412b);
    }

    @C12579k
    /* renamed from: b1 */
    public final C27280k mo74522b1() {
        C27280k kVar = this.f62901v;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: c1 */
    public final ProductSearchWithListRecommendationResultsViewModel mo74523c1() {
        return (ProductSearchWithListRecommendationResultsViewModel) this.f62899f.getValue();
    }

    /* renamed from: d1 */
    public final void mo74524d1() {
        mo74530i1();
        hideLoading();
        hideErrorView();
        Drawable i = C17318d.m79726i(requireContext(), R.drawable.ds_il_catalog_without_result);
        String string = getString(R.string.search_with_list_result_empty_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.searc…_list_result_empty_title)");
        C28500r.C28501a.m118420b(this, new MessageComponent.C37154a(i, string, getString(R.string.search_with_list_result_empty_description), getString(R.string.search_with_list_result_empty_retry), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), new C25638x3cfeeda7(this), (C11289a) null, (C11289a) null, 12, (Object) null);
        showEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74525e1(com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27344h r16) {
        /*
            r15 = this;
            r14 = r15
            r0 = r16
            boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27343g
            if (r1 == 0) goto L_0x0021
            androidx.fragment.app.h r2 = r15.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 2130772018(0x7f010032, float:1.7147143E38)
            r5 = 2130772012(0x7f01002c, float:1.714713E38)
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            com.carrefour.fid.android.app.extensions.C13825a.m58795x(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x016b
        L_0x0021:
            boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27342f
            r2 = 1
            if (r1 == 0) goto L_0x0039
            boolean r0 = r14.f62903x
            if (r0 != 0) goto L_0x016b
            r14.f62903x = r2
            com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListRecommendationResultsFragment$handleErrorEvent$1 r0 = new com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListRecommendationResultsFragment$handleErrorEvent$1
            r0.<init>(r15)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r15, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r15)
            goto L_0x016b
        L_0x0039:
            boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27339c
            if (r1 == 0) goto L_0x0072
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$c r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27339c) r0
            java.lang.Throwable r0 = r0.mo79565d()
            java.lang.String r4 = r0.getMessage()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r3, r4, r5, r6, r7, r8)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r15
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x016b
        L_0x0072:
            boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27341e
            if (r1 == 0) goto L_0x009d
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$e r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27341e) r0
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r0 = r0.mo79577d()
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
            goto L_0x016b
        L_0x009d:
            boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27338b
            if (r1 == 0) goto L_0x00c8
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$b r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27338b) r0
            com.carrefour.fid.android.core.type.BasketErrorType r0 = r0.mo79559d()
            int r0 = r0.mo108470q()
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(error.errorType.resourceId)"
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
            goto L_0x016b
        L_0x00c8:
            boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27340d
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x010a
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$d r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27340d) r0
            java.lang.Throwable r0 = r0.mo79571d()
            boolean r5 = r0 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r5 == 0) goto L_0x00df
            r3 = r0
            com.carrefour.fid.android.shared.io.ResponseThrowable r3 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r3
        L_0x00df:
            if (r3 == 0) goto L_0x00e6
            int r0 = r3.mo83810a()
            goto L_0x00e7
        L_0x00e6:
            r0 = r4
        L_0x00e7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r4] = r0
            r0 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r2 = r15.getString(r0, r2)
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
            goto L_0x016b
        L_0x010a:
            boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27345i
            if (r1 == 0) goto L_0x015d
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            kotlin.jvm.internal.t0 r5 = kotlin.jvm.internal.C11368t0.f28504a
            java.util.Locale r5 = java.util.Locale.getDefault()
            r6 = 2131952767(0x7f13047f, float:1.9541986E38)
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r7 = "getString(R.string.frequ…ales_default_error_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$i r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27345i) r0
            java.lang.Throwable r0 = r0.mo79583d()
            boolean r8 = r0 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r8 == 0) goto L_0x0131
            r3 = r0
            com.carrefour.fid.android.shared.io.ResponseThrowable r3 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r3
        L_0x0131:
            if (r3 == 0) goto L_0x0138
            int r0 = r3.mo83810a()
            goto L_0x0139
        L_0x0138:
            r0 = r4
        L_0x0139:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r4] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r2)
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
            goto L_0x016b
        L_0x015d:
            com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$a r1 = com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27336d.C27337a.f66383a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x016b
            r15.mo74538q1(r4)
            r15.mo74540s1()
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.search.result.ProductSearchWithListRecommendationResultsFragment.mo74525e1(com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$h):void");
    }

    @C12579k
    public ViewStub emptyMessageLayout() {
        ViewStub viewStub = ((C36762m3) getBinding()).f91276f;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubSearchWithLi…ecommendationResultsEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36762m3) getBinding()).f91277g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubSearchWithLi…ecommendationResultsError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo74526f1(Throwable th) {
        String str;
        C28935i iVar = C28935i.f70940a;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C28935i.m119705e(iVar, str, th, 0, 4, (Object) null);
        mo74522b1().mo79319d();
        hideLoading();
        hideEmpty();
        Drawable i = C17318d.m79726i(requireContext(), R.drawable.ds_il_deleted_product_list);
        String string = getString(R.string.search_with_list_result_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.searc…_list_result_error_title)");
        C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string, getString(R.string.search_with_list_result_error_description), getString(R.string.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), new C25640xb2c27b0(this), (C11289a) null, (C11289a) null, 12, (Object) null);
        C28500r.C28501a.m118423e(this, false, 1, (Object) null);
    }

    /* renamed from: g1 */
    public final void mo74527g1(C27336d.C27346j jVar) {
        int i = 0;
        if (jVar instanceof C27336d.C27346j.C27347a) {
            mo74538q1(false);
            for (Object next : ((C27336d.C27346j.C27347a) jVar).mo79589d()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                OfferProductModel offerProductModel = (OfferProductModel) next;
                mo74522b1().mo79321f(offerProductModel, true, offerProductModel.mo121519p0(), i2);
                i = i2;
            }
        } else if (jVar instanceof C27336d.C27346j.C27349c) {
            C27336d.C27346j.C27349c cVar = (C27336d.C27346j.C27349c) jVar;
            getNavigator().mo83838n(C19736g.m91827a(this), OfferProductModelKt.m159574W(cVar.mo79604f()), cVar.mo79602e());
        } else if (jVar instanceof C27336d.C27346j.C27348b) {
            mo74538q1(false);
            mo74525e1(((C27336d.C27346j.C27348b) jVar).mo79595d());
        }
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f62900g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo74529h1(Map<String, ? extends List<? extends OfferProductModel>> map) {
        if (map.isEmpty()) {
            mo74524d1();
            return;
        }
        hideLoading();
        hideEmpty();
        hideErrorView();
        mo74544w1();
        mo74539r1();
        C37370b bVar = this.f62902w;
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                List i = C10976s.m41417i();
                Object key = entry.getKey();
                int size = ((List) entry.getValue()).size();
                i.add(new ProductCardListTitle.C37368a(key + C36306e.f89637a + size + ")"));
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
                int i2 = 0;
                for (Object next : iterable) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    OfferProductModel offerProductModel = (OfferProductModel) next;
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "resources");
                    arrayList2.add(C38512k.m159778b(offerProductModel, resources, new C25641x264c7ca7(this, offerProductModel, i2), C25642x264c7ca8.f62913f, new C25643x264c7ca9(this, offerProductModel, i2), (C11289a) null, (C11289a) null, 48, (Object) null));
                    i2 = i3;
                }
                i.addAll(arrayList2);
                C10994x.m42360n0(arrayList, C10976s.m41409a(i));
            }
            bVar.setList(arrayList);
        }
        mo74522b1().mo79317b(C10978t.m41497a0(map.values()));
    }

    /* renamed from: i1 */
    public final void mo74530i1() {
        MaterialButton materialButton = ((C36762m3) getBinding()).f91272b;
        Intrinsics.checkNotNullExpressionValue(materialButton, "binding.searchWithListRe…dationResultsAddAllButton");
        materialButton.setVisibility(8);
    }

    /* renamed from: j1 */
    public final void mo74531j1() {
        NotificationComponent notificationComponent = ((C36762m3) getBinding()).f91273c;
        Intrinsics.checkNotNullExpressionValue(notificationComponent, "binding.searchWithListRe…nResultsErrorNotification");
        notificationComponent.setVisibility(8);
    }

    /* renamed from: k1 */
    public final void mo74532k1() {
        RecyclerView recyclerView = ((C36762m3) getBinding()).f91274d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.searchWithListRecommendationResultsList");
        recyclerView.setVisibility(8);
    }

    /* renamed from: l1 */
    public final void mo74533l1() {
        RecyclerView recyclerView = ((C36762m3) getBinding()).f91274d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.searchWithListRecommendationResultsList");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f62902w = C37373c.m153544b(recyclerView, requireContext, (C37390r) null, 2, (Object) null);
        ((C36762m3) getBinding()).f91272b.setOnClickListener(new C25678o(this));
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36762m3) getBinding()).f91275e;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.searchWithListRecommendationResultsShimmer");
        return shimmerFrameLayout;
    }

    /* renamed from: n1 */
    public final void mo74534n1(C27336d.C27350k kVar) {
        boolean z;
        if (kVar.isLoading()) {
            mo74542t1();
        }
        Map<String, List<OfferProductModel>> m = kVar.mo79617m();
        if (m != null) {
            Collection l = kVar.mo79616l();
            if (l == null || l.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                mo74543u1(kVar.mo79616l());
            } else {
                mo74531j1();
            }
            mo74529h1(m);
        }
        Throwable k = kVar.mo79615k();
        if (k != null) {
            mo74526f1(k);
        }
    }

    /* renamed from: o0 */
    public final void mo74535o0(OfferProductModel offerProductModel, int i) {
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo74523c1().sendIntent(new C27336d.C27351l.C27353b(offerProductModel));
            C27280k.m115098g(mo74522b1(), offerProductModel, false, 1, i, 2, (Object) null);
            return;
        }
        FragmentExtensionKt.m58759j(this, new C25637x890a0979(this, offerProductModel, p0, i));
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, offerProductModel, offerProductModel.mo121519p0(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: o1 */
    public void mo74536o1() {
        mo74523c1().sendIntent(new C27336d.C27351l.C27355d(getArguments()));
    }

    public void onResume() {
        super.onResume();
        mo74523c1().sendIntent(new C27336d.C27351l.C27355d(getArguments()));
        mo74522b1().mo79318c();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo74533l1();
        ProductSearchWithListRecommendationResultsViewModel c1 = mo74523c1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25627xaa7130fa(this, c1, (C11045c) null, this), 3, (Object) null);
        ProductSearchWithListRecommendationResultsViewModel c12 = mo74523c1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C25622xc97980c3(this, c12, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: p1 */
    public final void mo74537p1(@C12579k C27280k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f62901v = kVar;
    }

    /* renamed from: q1 */
    public final void mo74538q1(boolean z) {
        if (z) {
            MaterialButton materialButton = ((C36762m3) getBinding()).f91272b;
            Intrinsics.checkNotNullExpressionValue(materialButton, "binding.searchWithListRe…dationResultsAddAllButton");
            ButtonKt.m152103e(materialButton, true, (Drawable) null, (String) null, (Integer) null, (Integer) null, 30, (Object) null);
            return;
        }
        MaterialButton materialButton2 = ((C36762m3) getBinding()).f91272b;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "binding.searchWithListRe…dationResultsAddAllButton");
        ButtonKt.m152103e(materialButton2, false, (Drawable) null, getString(R.string.basket_add_all), (Integer) null, (Integer) null, 24, (Object) null);
    }

    /* renamed from: r1 */
    public final void mo74539r1() {
        MaterialButton materialButton = ((C36762m3) getBinding()).f91272b;
        Intrinsics.checkNotNullExpressionValue(materialButton, "binding.searchWithListRe…dationResultsAddAllButton");
        materialButton.setVisibility(0);
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo74536o1();
        return C11079d2.f28267a;
    }

    /* renamed from: s1 */
    public final void mo74540s1() {
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = getString(R.string.basket_add_all_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.basket_add_all_error)");
        FragmentKt.m118811B(this, variant, string, (String) null, getString(R.string.product_mixing_error_retry_action), new C25644xee692cca(this), false, false, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) getResources().getDimension(R.dimen.width_150dp)), C28539g.f69235K, (Object) null);
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f62900g = cVar;
    }

    /* renamed from: t1 */
    public final void mo74542t1() {
        mo74532k1();
        hideEmpty();
        hideErrorView();
        showLoading();
    }

    /* renamed from: u1 */
    public final void mo74543u1(List<String> list) {
        String str;
        NotificationComponent notificationComponent = ((C36762m3) getBinding()).f91273c;
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
        notificationComponent.setOnActionClickListener(new C25677n(this));
        Intrinsics.checkNotNullExpressionValue(notificationComponent, "showErrorNotification$lambda$9");
        notificationComponent.setVisibility(0);
    }

    /* renamed from: w1 */
    public final void mo74544w1() {
        RecyclerView recyclerView = ((C36762m3) getBinding()).f91274d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.searchWithListRecommendationResultsList");
        recyclerView.setVisibility(0);
    }
}
