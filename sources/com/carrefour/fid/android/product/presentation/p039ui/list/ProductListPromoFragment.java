package com.carrefour.fid.android.product.presentation.p039ui.list;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.activity.result.C0302g;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.product.C27453b;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27484e;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/list/ProductListPromoFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/product/databinding/e;", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onDestroyView", "initHeader", "initListener", "", "totalCount", "filtersCount", "W0", "Y0", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "f", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "delegate", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "g", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "source", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "w", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "U0", "()Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "X0", "(Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;)V", "plpProductAnalytics", "Lcom/carrefour/fid/android/shared/util/j;", "x", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Landroidx/activity/result/g;", "", "y", "Landroidx/activity/result/g;", "requestPermission", "<init>", "()V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListPromoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListPromoFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/list/ProductListPromoFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,153:1\n262#2,2:154\n262#2,2:156\n*S KotlinDebug\n*F\n+ 1 ProductListPromoFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/list/ProductListPromoFragment\n*L\n131#1:154,2\n135#1:156,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.ProductListPromoFragment */
public final class ProductListPromoFragment extends C28042b<C27484e> {

    /* renamed from: z */
    public static final int f67899z = 8;

    /* renamed from: f */
    public PlpDelegate f67900f;

    /* renamed from: g */
    public ProductListSource f67901g;
    @Inject

    /* renamed from: v */
    public C28796c f67902v;
    @Inject

    /* renamed from: w */
    public PlpProductAnalytics f67903w;
    @Inject

    /* renamed from: x */
    public C28936j f67904x;
    @C12579k

    /* renamed from: y */
    public final C0302g<String> f67905y = FragmentKt.m118833u(this, new ProductListPromoFragment$requestPermission$1(this), new ProductListPromoFragment$requestPermission$2(this));

    public ProductListPromoFragment() {
        super(C280261.f67906a);
    }

    /* renamed from: V0 */
    public static final void m117505V0(ProductListPromoFragment productListPromoFragment, View view) {
        Intrinsics.checkNotNullParameter(productListPromoFragment, "this$0");
        NavController a = C19736g.m91827a(productListPromoFragment);
        int i = C27609f.C27619j.product_facet_graph;
        ProductListSource productListSource = productListPromoFragment.f67901g;
        if (productListSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
            productListSource = null;
        }
        a.mo58130W(i, new C27453b(productListSource).mo79796f());
    }

    @C12579k
    /* renamed from: U0 */
    public final PlpProductAnalytics mo81553U0() {
        PlpProductAnalytics plpProductAnalytics = this.f67903w;
        if (plpProductAnalytics != null) {
            return plpProductAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("plpProductAnalytics");
        return null;
    }

    /* renamed from: W0 */
    public final void mo81554W0(int i, int i2) {
        TextView textView = ((C27484e) getBinding()).f66651j.f66641g;
        String string = getString(C27609f.C27627r.promotions);
        textView.setText(string + C36306e.f89637a + i + ")");
        ((C27484e) getBinding()).f66651j.f66639e.setVisibility(8);
        ((C27484e) getBinding()).f66651j.f66640f.setVisibility(8);
        if (i2 > 0) {
            TextView textView2 = ((C27484e) getBinding()).f66651j.f66637c;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.subHeader.filterCount");
            textView2.setVisibility(0);
            ((C27484e) getBinding()).f66651j.f66637c.setText(String.valueOf(i2));
            return;
        }
        ((C27484e) getBinding()).f66651j.f66637c.setText("");
        TextView textView3 = ((C27484e) getBinding()).f66651j.f66637c;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.subHeader.filterCount");
        textView3.setVisibility(8);
    }

    /* renamed from: X0 */
    public final void mo81555X0(@C12579k PlpProductAnalytics plpProductAnalytics) {
        Intrinsics.checkNotNullParameter(plpProductAnalytics, "<set-?>");
        this.f67903w = plpProductAnalytics;
    }

    /* renamed from: Y0 */
    public final void mo81556Y0() {
        String string = getString(C27609f.C27627r.scan_bar_dialog_title);
        String string2 = getString(C27609f.C27627r.scan_bar_dialog_message);
        Drawable h = FragmentKt.m118820h(this, C27609f.C27617h.background_search_bar, (Integer) null, 2, (Object) null);
        String string3 = getString(C27609f.C27627r.general_refuse);
        String string4 = getString(C27609f.C27627r.ok_uppercase);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.scan_bar_dialog_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.scan_bar_dialog_message)");
        FragmentKt.m118838z(this, string, string2, string3, ProductListPromoFragment$showPermissionExplanationDialog$1.f67907f, string4, false, new ProductListPromoFragment$showPermissionExplanationDialog$2(this), (String) null, (C11289a) null, (C11289a) null, h, 0, 2976, (Object) null);
    }

    @C12579k
    public ViewStub emptyMessageLayout() {
        ViewStub viewStub = ((C27484e) getBinding()).f66646e;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.productListEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C27484e) getBinding()).f66647f;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.productListError");
        return viewStub;
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f67904x;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f67902v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void initHeader() {
        ((C27484e) getBinding()).f66648g.setContent(C8553b.m31049c(1053765440, true, new ProductListPromoFragment$initHeader$1(this)));
    }

    public final void initListener() {
        ((C27484e) getBinding()).f66651j.f66636b.setOnClickListener(new C28057m(this));
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C27484e) getBinding()).f66650i;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.productListLoading");
        return shimmerFrameLayout;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        this.f67901g = ProductListSource.Promo.f68295a;
        ProductListSource productListSource = this.f67901g;
        if (productListSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
            productListSource = null;
        }
        PlpDelegate plpDelegate = new PlpDelegate(this, productListSource, getNavigator(), mo81553U0(), new ProductListPromoFragment$onCreate$1(this), getFragmentUtil());
        this.f67900f = plpDelegate;
        plpDelegate.mo81517x();
    }

    public void onDestroyView() {
        PlpDelegate plpDelegate = this.f67900f;
        if (plpDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            plpDelegate = null;
        }
        plpDelegate.mo81518y();
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        getFragmentUtil().mo32776b(this);
        PlpDelegate plpDelegate = this.f67900f;
        if (plpDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
            plpDelegate = null;
        }
        RecyclerView recyclerView = ((C27484e) getBinding()).f66645d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.productList");
        plpDelegate.mo81519z(recyclerView);
        initHeader();
        initListener();
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f67904x = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f67902v = cVar;
    }
}
