package com.carrefour.fid.android.presentation.p035ui.product.filter;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.databinding.C36682e3;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.p035ui.product.filter.adapter.C25434d;
import com.carrefour.fid.android.shared.util.FragmentViewBindingDelegate;
import com.carrefour.fid.android.shared.util.FragmentViewBindingDelegateKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersFacetTermsFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/databinding/e3;", "a", "Lcom/carrefour/fid/android/shared/util/FragmentViewBindingDelegate;", "K0", "()Lcom/carrefour/fid/android/databinding/e3;", "binding", "Lcom/carrefour/fid/android/presentation/models/FacetModel;", "L0", "()Lcom/carrefour/fid/android/presentation/models/FacetModel;", "facet", "<init>", "()V", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListFiltersFacetTermsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersFacetTermsFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersFacetTermsFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,85:1\n262#2,2:86\n*S KotlinDebug\n*F\n+ 1 ProductListFiltersFacetTermsFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersFacetTermsFragment\n*L\n69#1:86,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersFacetTermsFragment */
public final class ProductListFiltersFacetTermsFragment extends Fragment {
    @C12579k

    /* renamed from: b */
    public static final C25420a f62544b = new C25420a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final /* synthetic */ C11510n<Object>[] f62545c = {C11342l0.m43564u(new PropertyReference1Impl(ProductListFiltersFacetTermsFragment.class, "binding", "getBinding()Lcom/carrefour/fid/android/databinding/FragmentProductListFiltersFacetTermsBinding;", 0))};

    /* renamed from: d */
    public static final int f62546d = FragmentViewBindingDelegate.f70788d;
    @C12579k

    /* renamed from: e */
    public static final String f62547e = "ProductListFiltersFacetTermsFragment";
    @C12579k

    /* renamed from: f */
    public static final String f62548f = "facet";
    @C12579k

    /* renamed from: a */
    public final FragmentViewBindingDelegate f62549a = FragmentViewBindingDelegateKt.m119491b(this, ProductListFiltersFacetTermsFragment$binding$2.f62550a);

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersFacetTermsFragment$a */
    public static final class C25420a {
        public /* synthetic */ C25420a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ProductListFiltersFacetTermsFragment mo74089a(@C12580l Bundle bundle) {
            ProductListFiltersFacetTermsFragment productListFiltersFacetTermsFragment = new ProductListFiltersFacetTermsFragment();
            productListFiltersFacetTermsFragment.setArguments(bundle);
            return productListFiltersFacetTermsFragment;
        }

        public C25420a() {
        }
    }

    /* renamed from: M0 */
    public static final void m109733M0(ProductListFiltersFacetTermsFragment productListFiltersFacetTermsFragment, View view) {
        C25434d dVar;
        Intrinsics.checkNotNullParameter(productListFiltersFacetTermsFragment, "this$0");
        RecyclerView.Adapter adapter = productListFiltersFacetTermsFragment.mo74087K0().f90762d.getAdapter();
        if (adapter instanceof C25434d) {
            dVar = (C25434d) adapter;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.mo74125l();
        }
        ProductListFiltersDialogFragment productListFiltersDialogFragment = (ProductListFiltersDialogFragment) FragmentKt.m148916b(productListFiltersFacetTermsFragment, ProductListFiltersDialogFragment.class);
        if (productListFiltersDialogFragment != null) {
            productListFiltersDialogFragment.mo74066S0(true);
        }
    }

    /* renamed from: N0 */
    public static final void m109734N0(ProductListFiltersFacetTermsFragment productListFiltersFacetTermsFragment, View view) {
        Intrinsics.checkNotNullParameter(productListFiltersFacetTermsFragment, "this$0");
        String string = productListFiltersFacetTermsFragment.getString(R.string.general_information);
        String string2 = productListFiltersFacetTermsFragment.getString(R.string.customer_dialog_text);
        String string3 = productListFiltersFacetTermsFragment.getString(R.string.general_see);
        String string4 = productListFiltersFacetTermsFragment.getString(R.string.general_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.customer_dialog_text)");
        com.carrefour.fid.android.shared.extension.FragmentKt.m118838z(productListFiltersFacetTermsFragment, string, string2, string3, new ProductListFiltersFacetTermsFragment$onViewCreated$3$1$1(productListFiltersFacetTermsFragment), string4, false, (C11289a) null, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4064, (Object) null);
    }

    /* renamed from: K0 */
    public final C36682e3 mo74087K0() {
        return (C36682e3) this.f62549a.mo22938a(this, f62545c[0]);
    }

    /* renamed from: L0 */
    public final FacetModel mo74088L0() {
        Bundle arguments = getArguments();
        FacetModel facetModel = arguments != null ? (FacetModel) arguments.getParcelable(f62548f) : null;
        if (facetModel != null) {
            return facetModel;
        }
        throw new Throwable("no facet");
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        LinearLayout b = mo74087K0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        int i;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
        RecyclerView recyclerView = mo74087K0().f90762d;
        recyclerView.setAdapter(new C25434d(mo74088L0().mo121578e0()));
        recyclerView.setItemAnimator((RecyclerView.C20069l) null);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        mo74087K0().f90761c.setOnClickListener(new C25445h(this));
        ConstraintLayout b = mo74087K0().f90760b.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "onViewCreated$lambda$3");
        if (Intrinsics.areEqual((Object) mo74088L0().mo121582h0(), (Object) "allergobox")) {
            i = 0;
        } else {
            i = 8;
        }
        b.setVisibility(i);
        b.setOnClickListener(new C25446i(this));
    }
}
