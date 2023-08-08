package com.carrefour.fid.android.product.presentation.p039ui.list;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.activity.result.C0302g;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.product.C27453b;
import com.carrefour.fid.android.product.C27457d;
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
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/list/ProductListQueryFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/product/databinding/e;", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onDestroyView", "initHeader", "initListener", "", "totalCount", "filtersCount", "X0", "Z0", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "f", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "delegate", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "g", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "source", "Lcom/carrefour/fid/android/product/d;", "v", "Landroidx/navigation/m;", "U0", "()Lcom/carrefour/fid/android/product/d;", "navArgs", "Lcom/carrefour/fid/android/shared/navigation/c;", "w", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "x", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "V0", "()Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "Y0", "(Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;)V", "plpProductAnalytics", "Lcom/carrefour/fid/android/shared/util/j;", "y", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Landroidx/activity/result/g;", "", "z", "Landroidx/activity/result/g;", "requestPermission", "<init>", "()V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListQueryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListQueryFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/list/ProductListQueryFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,176:1\n42#2,3:177\n1#3:180\n262#4,2:181\n262#4,2:183\n*S KotlinDebug\n*F\n+ 1 ProductListQueryFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/list/ProductListQueryFragment\n*L\n41#1:177,3\n154#1:181,2\n158#1:183,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.ProductListQueryFragment */
public final class ProductListQueryFragment extends C28043c<C27484e> {

    /* renamed from: X */
    public static final int f67908X = 8;

    /* renamed from: f */
    public PlpDelegate f67909f;

    /* renamed from: g */
    public ProductListSource f67910g;
    @C12579k

    /* renamed from: v */
    public final C19766m f67911v = new C19766m(C11342l0.m43547d(C27457d.class), new ProductListQueryFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: w */
    public C28796c f67912w;
    @Inject

    /* renamed from: x */
    public PlpProductAnalytics f67913x;
    @Inject

    /* renamed from: y */
    public C28936j f67914y;
    @C12579k

    /* renamed from: z */
    public final C0302g<String> f67915z = FragmentKt.m118833u(this, new ProductListQueryFragment$requestPermission$1(this), new ProductListQueryFragment$requestPermission$2(this));

    public ProductListQueryFragment() {
        super(C280311.f67916a);
    }

    /* renamed from: W0 */
    public static final void m117516W0(ProductListQueryFragment productListQueryFragment, View view) {
        Intrinsics.checkNotNullParameter(productListQueryFragment, "this$0");
        NavController a = C19736g.m91827a(productListQueryFragment);
        int i = C27609f.C27619j.product_facet_graph;
        ProductListSource productListSource = productListQueryFragment.f67910g;
        if (productListSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
            productListSource = null;
        }
        a.mo58130W(i, new C27453b(productListSource).mo79796f());
    }

    /* renamed from: U0 */
    public final C27457d mo81567U0() {
        return (C27457d) this.f67911v.getValue();
    }

    @C12579k
    /* renamed from: V0 */
    public final PlpProductAnalytics mo81568V0() {
        PlpProductAnalytics plpProductAnalytics = this.f67913x;
        if (plpProductAnalytics != null) {
            return plpProductAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("plpProductAnalytics");
        return null;
    }

    /* renamed from: X0 */
    public final void mo81569X0(int i, int i2) {
        boolean z;
        Resources resources;
        Resources resources2;
        String str = null;
        if (C11622t.isBlank(mo81567U0().mo79818f())) {
            TextView textView = ((C27484e) getBinding()).f66651j.f66641g;
            Context context = getContext();
            if (!(context == null || (resources2 = context.getResources()) == null)) {
                str = resources2.getQuantityString(C27609f.C27625p.search_result, i, new Object[]{Integer.valueOf(i)});
            }
            textView.setText(str);
        } else {
            TextView textView2 = ((C27484e) getBinding()).f66651j.f66641g;
            String f = mo81567U0().mo79818f();
            if (f.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                char upperCase = Character.toUpperCase(f.charAt(0));
                String substring = f.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                f = upperCase + substring;
            }
            textView2.setText(f);
            TextView textView3 = ((C27484e) getBinding()).f66651j.f66638d;
            Context context2 = getContext();
            if (!(context2 == null || (resources = context2.getResources()) == null)) {
                str = resources.getQuantityString(C27609f.C27625p.search_result, i, new Object[]{Integer.valueOf(i)});
            }
            textView3.setText(str);
        }
        ((C27484e) getBinding()).f66651j.f66639e.setVisibility(8);
        ((C27484e) getBinding()).f66651j.f66640f.setVisibility(8);
        if (i2 > 0) {
            TextView textView4 = ((C27484e) getBinding()).f66651j.f66637c;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.subHeader.filterCount");
            textView4.setVisibility(0);
            ((C27484e) getBinding()).f66651j.f66637c.setText(String.valueOf(i2));
            return;
        }
        ((C27484e) getBinding()).f66651j.f66637c.setText("");
        TextView textView5 = ((C27484e) getBinding()).f66651j.f66637c;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.subHeader.filterCount");
        textView5.setVisibility(8);
    }

    /* renamed from: Y0 */
    public final void mo81570Y0(@C12579k PlpProductAnalytics plpProductAnalytics) {
        Intrinsics.checkNotNullParameter(plpProductAnalytics, "<set-?>");
        this.f67913x = plpProductAnalytics;
    }

    /* renamed from: Z0 */
    public final void mo81571Z0() {
        String string = getString(C27609f.C27627r.scan_bar_dialog_title);
        String string2 = getString(C27609f.C27627r.scan_bar_dialog_message);
        Drawable h = FragmentKt.m118820h(this, C27609f.C27617h.background_search_bar, (Integer) null, 2, (Object) null);
        String string3 = getString(C27609f.C27627r.general_refuse);
        String string4 = getString(C27609f.C27627r.ok_uppercase);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.scan_bar_dialog_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.scan_bar_dialog_message)");
        FragmentKt.m118838z(this, string, string2, string3, ProductListQueryFragment$showPermissionExplanationDialog$1.f67917f, string4, false, new ProductListQueryFragment$showPermissionExplanationDialog$2(this), (String) null, (C11289a) null, (C11289a) null, h, 0, 2976, (Object) null);
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
        C28936j jVar = this.f67914y;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f67912w;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void initHeader() {
        ((C27484e) getBinding()).f66648g.setContent(C8553b.m31049c(-1831968480, true, new ProductListQueryFragment$initHeader$1(this)));
    }

    public final void initListener() {
        ((C27484e) getBinding()).f66651j.f66636b.setOnClickListener(new C28076q(this));
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C27484e) getBinding()).f66650i;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.productListLoading");
        return shimmerFrameLayout;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        String g = mo81567U0().mo79819g();
        if (!C11622t.isBlank(g)) {
            this.f67910g = new ProductListSource.Query(g);
            ProductListSource productListSource = this.f67910g;
            if (productListSource == null) {
                Intrinsics.throwUninitializedPropertyAccessException("source");
                productListSource = null;
            }
            PlpDelegate plpDelegate = new PlpDelegate(this, productListSource, getNavigator(), mo81568V0(), new ProductListQueryFragment$onCreate$1(this), getFragmentUtil());
            this.f67909f = plpDelegate;
            plpDelegate.mo81517x();
            return;
        }
        String s = C11342l0.m43547d(ProductListQueryFragment.class).mo22848s();
        throw new IllegalStateException("Query must be provided for " + s);
    }

    public void onDestroyView() {
        PlpDelegate plpDelegate = this.f67909f;
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
        PlpDelegate plpDelegate = this.f67909f;
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
        this.f67914y = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f67912w = cVar;
    }
}
