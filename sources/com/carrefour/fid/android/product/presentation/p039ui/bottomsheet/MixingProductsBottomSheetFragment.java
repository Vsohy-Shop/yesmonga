package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27509v;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.p039ui.list.PlpDelegate;
import com.carrefour.fid.android.product.presentation.p039ui.list.ProductListDepartmentFragment;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b4\u00105J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J@\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00068"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/bottomsheet/MixingProductsBottomSheetFragment;", "Lcom/carrefour/fid/android/shared/base/e;", "Lcom/carrefour/fid/android/product/databinding/v;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onDestroyView", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Lcom/carrefour/fid/android/design/components/widgets/MessageComponent$a;", "messageViewModel", "Lkotlin/Function0;", "primaryListener", "secondaryListener", "thirdListener", "setupMessageErrorView", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "K0", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "productListDelegate", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "L0", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "source", "Lcom/carrefour/fid/android/shared/navigation/c;", "M0", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "N0", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "d1", "()Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "e1", "(Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;)V", "productListAnalytics", "Lcom/carrefour/fid/android/shared/util/j;", "O0", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "P0", "a", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.MixingProductsBottomSheetFragment */
public final class MixingProductsBottomSheetFragment extends C27742h<C27509v> {
    @C12579k

    /* renamed from: P0 */
    public static final C27727a f67233P0 = new C27727a((DefaultConstructorMarker) null);

    /* renamed from: Q0 */
    public static final int f67234Q0 = 8;
    @C12579k

    /* renamed from: R0 */
    public static final String f67235R0 = "offerGtins";
    @C12579k

    /* renamed from: S0 */
    public static final String f67236S0 = "title";

    /* renamed from: K0 */
    public PlpDelegate f67237K0;

    /* renamed from: L0 */
    public ProductListSource f67238L0;
    @Inject

    /* renamed from: M0 */
    public C28796c f67239M0;
    @Inject

    /* renamed from: N0 */
    public PlpProductAnalytics f67240N0;
    @Inject

    /* renamed from: O0 */
    public C28936j f67241O0;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.MixingProductsBottomSheetFragment$a */
    public static final class C27727a {
        public /* synthetic */ C27727a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final MixingProductsBottomSheetFragment mo80503a(@C12579k List<Gtin> list, @C12579k String str) {
            Intrinsics.checkNotNullParameter(list, "gtins");
            Intrinsics.checkNotNullParameter(str, "title");
            MixingProductsBottomSheetFragment mixingProductsBottomSheetFragment = new MixingProductsBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(MixingProductsBottomSheetFragment.f67235R0, new ArrayList(list));
            bundle.putString("title", str);
            mixingProductsBottomSheetFragment.setArguments(bundle);
            return mixingProductsBottomSheetFragment;
        }

        public C27727a() {
        }
    }

    public MixingProductsBottomSheetFragment() {
        super(C277251.f67242a, C277262.f67243a, false);
    }

    /* renamed from: f1 */
    public static final void m116532f1(MixingProductsBottomSheetFragment mixingProductsBottomSheetFragment, View view) {
        Intrinsics.checkNotNullParameter(mixingProductsBottomSheetFragment, "this$0");
        PlpDelegate plpDelegate = mixingProductsBottomSheetFragment.f67237K0;
        if (plpDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productListDelegate");
            plpDelegate = null;
        }
        plpDelegate.mo81501C();
    }

    @C12579k
    /* renamed from: d1 */
    public final PlpProductAnalytics mo80494d1() {
        PlpProductAnalytics plpProductAnalytics = this.f67240N0;
        if (plpProductAnalytics != null) {
            return plpProductAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productListAnalytics");
        return null;
    }

    /* renamed from: e1 */
    public final void mo80495e1(@C12579k PlpProductAnalytics plpProductAnalytics) {
        Intrinsics.checkNotNullParameter(plpProductAnalytics, "<set-?>");
        this.f67240N0 = plpProductAnalytics;
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f67241O0;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f67239M0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C27509v) getBinding()).f66751e;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.productListLoading");
        return shimmerFrameLayout;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(f67235R0);
        if (parcelableArrayList != null) {
            this.f67238L0 = new ProductListSource.MixingBottomSheet(parcelableArrayList);
            ProductListSource productListSource = this.f67238L0;
            if (productListSource == null) {
                Intrinsics.throwUninitializedPropertyAccessException("source");
                productListSource = null;
            }
            this.f67237K0 = new PlpDelegate(this, this, productListSource, getNavigator(), mo80494d1(), (C11304p) null, getFragmentUtil(), 32, (DefaultConstructorMarker) null);
            return;
        }
        String s = C11342l0.m43547d(ProductListDepartmentFragment.class).mo22848s();
        throw new IllegalStateException("Not Gtins passed " + s);
    }

    public void onDestroyView() {
        PlpDelegate plpDelegate = this.f67237K0;
        if (plpDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productListDelegate");
            plpDelegate = null;
        }
        plpDelegate.mo81518y();
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ((C27509v) getBinding()).f66750d.setText(requireArguments().getString("title"));
        PlpDelegate plpDelegate = this.f67237K0;
        if (plpDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productListDelegate");
            plpDelegate = null;
        }
        RecyclerView recyclerView = ((C27509v) getBinding()).f66748b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.mixingProductsListRecyclerview");
        plpDelegate.mo81519z(recyclerView);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f67241O0 = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f67239M0 = cVar;
    }

    public void setupMessageErrorView(@C12579k MessageComponent.C37154a aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4) {
        Intrinsics.checkNotNullParameter(aVar, "messageViewModel");
        ((C27509v) getBinding()).f66748b.setVisibility(8);
        ((C27509v) getBinding()).f66749c.setVisibility(0);
        String string = requireContext().getString(C27609f.C27627r.product_mixing_error);
        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…ing.product_mixing_error)");
        NotificationComponent.C37156a aVar5 = new NotificationComponent.C37156a(string, (String) null, requireContext().getString(C27609f.C27627r.product_mixing_error_retry_action), false);
        NotificationComponent notificationComponent = ((C27509v) getBinding()).f66749c;
        notificationComponent.mo112945y(NotificationComponent.Variant.ERROR);
        notificationComponent.mo112943w(aVar5);
        notificationComponent.setOnActionClickListener(new C27743i(this));
    }
}
