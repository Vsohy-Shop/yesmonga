package com.carrefour.fid.android.product.presentation.p039ui.list;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.result.C0302g;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.domain.models.category.CategoryType;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.product.C27453b;
import com.carrefour.fid.android.product.C27455c;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27484e;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.p039ui.list.other.C28069f;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.RecyclerViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006D"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/list/ProductListDepartmentFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/product/databinding/e;", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onDestroyView", "initHeader", "initListener", "", "totalCount", "filtersCount", "Y0", "b1", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "f", "Lcom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate;", "delegate", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "g", "Lcom/carrefour/fid/android/product/presentation/viewmodel/list/ProductListSource;", "source", "Lcom/carrefour/fid/android/product/c;", "v", "Landroidx/navigation/m;", "V0", "()Lcom/carrefour/fid/android/product/c;", "navArgs", "Lcom/carrefour/fid/android/shared/navigation/c;", "w", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "x", "Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "W0", "()Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;", "a1", "(Lcom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics;)V", "plpProductAnalytics", "Lcom/carrefour/fid/android/shared/util/j;", "y", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Landroidx/activity/result/g;", "", "z", "Landroidx/activity/result/g;", "requestPermission", "<init>", "()V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListDepartmentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListDepartmentFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/list/ProductListDepartmentFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,185:1\n42#2,3:186\n766#3:189\n857#3,2:190\n262#4,2:192\n262#4,2:194\n262#4,2:196\n*S KotlinDebug\n*F\n+ 1 ProductListDepartmentFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/list/ProductListDepartmentFragment\n*L\n44#1:186,3\n143#1:189\n143#1:190,2\n163#1:192,2\n167#1:194,2\n154#1:196,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.ProductListDepartmentFragment */
public final class ProductListDepartmentFragment extends C28041a<C27484e> {

    /* renamed from: X */
    public static final int f67889X = 8;

    /* renamed from: f */
    public PlpDelegate f67890f;

    /* renamed from: g */
    public ProductListSource f67891g;
    @C12579k

    /* renamed from: v */
    public final C19766m f67892v = new C19766m(C11342l0.m43547d(C27455c.class), new ProductListDepartmentFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: w */
    public C28796c f67893w;
    @Inject

    /* renamed from: x */
    public PlpProductAnalytics f67894x;
    @Inject

    /* renamed from: y */
    public C28936j f67895y;
    @C12579k

    /* renamed from: z */
    public final C0302g<String> f67896z = FragmentKt.m118833u(this, new ProductListDepartmentFragment$requestPermission$1(this), new ProductListDepartmentFragment$requestPermission$2(this));

    public ProductListDepartmentFragment() {
        super(C280211.f67897a);
    }

    /* renamed from: X0 */
    public static final void m117491X0(ProductListDepartmentFragment productListDepartmentFragment, View view) {
        Intrinsics.checkNotNullParameter(productListDepartmentFragment, "this$0");
        NavController a = C19736g.m91827a(productListDepartmentFragment);
        int i = C27609f.C27619j.product_facet_graph;
        ProductListSource productListSource = productListDepartmentFragment.f67891g;
        if (productListSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
            productListSource = null;
        }
        a.mo58130W(i, new C27453b(productListSource).mo79796f());
    }

    /* renamed from: Z0 */
    public static final void m117492Z0(ProductListDepartmentFragment productListDepartmentFragment, RecyclerView recyclerView) {
        int i;
        Intrinsics.checkNotNullParameter(productListDepartmentFragment, "this$0");
        Intrinsics.checkNotNullParameter(recyclerView, "$this_apply");
        ImageButton imageButton = ((C27484e) productListDepartmentFragment.getBinding()).f66651j.f66640f;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.subHeader.taglineScrollButton");
        if (RecyclerViewKt.m118873l(recyclerView)) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
    }

    /* renamed from: V0 */
    public final C27455c mo81537V0() {
        return (C27455c) this.f67892v.getValue();
    }

    @C12579k
    /* renamed from: W0 */
    public final PlpProductAnalytics mo81538W0() {
        PlpProductAnalytics plpProductAnalytics = this.f67894x;
        if (plpProductAnalytics != null) {
            return plpProductAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("plpProductAnalytics");
        return null;
    }

    /* renamed from: Y0 */
    public final void mo81539Y0(int i, int i2) {
        boolean z;
        ProductCategory g = mo81537V0().mo79807g();
        String f = mo81537V0().mo79806f();
        ((C27484e) getBinding()).f66651j.f66641g.setText(g.mo117297q() + C36306e.f89637a + i + ")");
        if (!Intrinsics.areEqual((Object) g.mo117297q(), (Object) f)) {
            ((C27484e) getBinding()).f66651j.f66638d.setText(f);
        }
        if (!g.mo117293m().isEmpty()) {
            RecyclerView recyclerView = ((C27484e) getBinding()).f66651j.f66639e;
            recyclerView.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            for (Object next : g.mo117293m()) {
                if (((ProductCategory) next).mo117300t() != CategoryType.OTHERS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            recyclerView.setAdapter(new C28069f(arrayList, new ProductListDepartmentFragment$linkSubHeader$1$2(g, this)));
            recyclerView.post(new C28051h(this, recyclerView));
        } else {
            ((C27484e) getBinding()).f66651j.f66639e.setVisibility(8);
            ((C27484e) getBinding()).f66651j.f66640f.setVisibility(8);
        }
        if (i2 > 0) {
            TextView textView = ((C27484e) getBinding()).f66651j.f66637c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.subHeader.filterCount");
            textView.setVisibility(0);
            ((C27484e) getBinding()).f66651j.f66637c.setText(String.valueOf(i2));
            return;
        }
        ((C27484e) getBinding()).f66651j.f66637c.setText("");
        TextView textView2 = ((C27484e) getBinding()).f66651j.f66637c;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.subHeader.filterCount");
        textView2.setVisibility(8);
    }

    /* renamed from: a1 */
    public final void mo81540a1(@C12579k PlpProductAnalytics plpProductAnalytics) {
        Intrinsics.checkNotNullParameter(plpProductAnalytics, "<set-?>");
        this.f67894x = plpProductAnalytics;
    }

    /* renamed from: b1 */
    public final void mo81541b1() {
        String string = getString(C27609f.C27627r.scan_bar_dialog_title);
        String string2 = getString(C27609f.C27627r.scan_bar_dialog_message);
        Drawable h = FragmentKt.m118820h(this, C27609f.C27617h.background_search_bar, (Integer) null, 2, (Object) null);
        String string3 = getString(C27609f.C27627r.general_refuse);
        String string4 = getString(C27609f.C27627r.ok_uppercase);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.scan_bar_dialog_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.scan_bar_dialog_message)");
        FragmentKt.m118838z(this, string, string2, string3, ProductListDepartmentFragment$showPermissionExplanationDialog$1.f67898f, string4, false, new ProductListDepartmentFragment$showPermissionExplanationDialog$2(this), (String) null, (C11289a) null, (C11289a) null, h, 0, 2976, (Object) null);
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
        C28936j jVar = this.f67895y;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f67893w;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void initHeader() {
        ((C27484e) getBinding()).f66648g.setContent(C8553b.m31049c(-799494240, true, new ProductListDepartmentFragment$initHeader$1(this)));
    }

    public final void initListener() {
        ((C27484e) getBinding()).f66651j.f66636b.setOnClickListener(new C28052i(this));
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C27484e) getBinding()).f66650i;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.productListLoading");
        return shimmerFrameLayout;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        this.f67891g = new ProductListSource.Department(mo81537V0().mo79807g());
        ProductListSource productListSource = this.f67891g;
        if (productListSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
            productListSource = null;
        }
        PlpDelegate plpDelegate = new PlpDelegate(this, productListSource, getNavigator(), mo81538W0(), new ProductListDepartmentFragment$onCreate$1(this), getFragmentUtil());
        this.f67890f = plpDelegate;
        plpDelegate.mo81517x();
    }

    public void onDestroyView() {
        PlpDelegate plpDelegate = this.f67890f;
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
        PlpDelegate plpDelegate = this.f67890f;
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
        this.f67895y = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f67893w = cVar;
    }
}
