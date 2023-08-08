package com.carrefour.fid.android.presentation.p035ui.product.filter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36672d3;
import com.carrefour.fid.android.presentation.models.DepartmentHeaderModel;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.presentation.models.extension.FacetModelKt;
import com.carrefour.fid.android.presentation.p035ui.product.filter.ProductListFiltersFacetTermsFragment;
import com.carrefour.fid.android.presentation.viewmodels.product.filter.C27177a;
import com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel;
import com.carrefour.fid.android.shared.base.C28502s;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0006\u0010\u0010\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0018\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0017\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002R\u001b\u0010%\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersDialogFragment;", "Lcom/carrefour/fid/android/shared/base/j;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "", "L0", "onDestroyView", "R0", "apply", "S0", "Lcom/carrefour/fid/android/presentation/models/FacetModel;", "facet", "Y0", "", "exception", "Z0", "loading", "b1", "(Ljava/lang/Boolean;)V", "i1", "Lcom/carrefour/fid/android/presentation/models/ProductListSettingsModel;", "settings", "c1", "Lcom/carrefour/fid/android/databinding/d3;", "v", "Lkotlin/z;", "U0", "()Lcom/carrefour/fid/android/databinding/d3;", "binding", "Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel;", "w", "Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel;", "h1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel;)V", "productListFiltersViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/a;", "x", "Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/a;", "V0", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/a;", "g1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/a;)V", "productListFiltersAnalyticsViewModel", "X0", "()Lcom/carrefour/fid/android/presentation/models/ProductListSettingsModel;", "settingsFromProductList", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListFiltersDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersDialogFragment\n+ 2 FragmentViewBindingDelegate.kt\ncom/carrefour/fid/android/shared/util/FragmentViewBindingDelegateKt\n*L\n1#1,258:1\n120#2,3:259\n*S KotlinDebug\n*F\n+ 1 ProductListFiltersDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersDialogFragment\n*L\n49#1:259,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersDialogFragment */
public final class ProductListFiltersDialogFragment extends C25428a {
    @C12579k

    /* renamed from: E0 */
    public static final String f62534E0 = "FILTER_SETTINGS_KEY";
    @C12579k

    /* renamed from: X */
    public static final String f62535X = "ProductListFiltersDialogFragment";
    @C12579k

    /* renamed from: Y */
    public static final String f62536Y = "settings";
    @C12579k

    /* renamed from: Z */
    public static final String f62537Z = "FILTER_DIALOG_FRAGMENT_KEY";
    @C12579k

    /* renamed from: y */
    public static final C25418a f62538y = new C25418a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f62539z = 8;
    @C12579k

    /* renamed from: v */
    public final C11677z f62540v = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new ProductListFiltersDialogFragment$special$$inlined$viewBinding$1(this));
    @Inject

    /* renamed from: w */
    public ProductListFiltersViewModel f62541w;
    @Inject

    /* renamed from: x */
    public C27177a f62542x;

    @C11363r0({"SMAP\nProductListFiltersDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersDialogFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersDialogFragment$a */
    public static final class C25418a {
        public /* synthetic */ C25418a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74078a(@C12579k FragmentManager fragmentManager, @C12579k ProductListSettingsModel productListSettingsModel) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
            ProductListFiltersDialogFragment productListFiltersDialogFragment = new ProductListFiltersDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("settings", productListSettingsModel);
            productListFiltersDialogFragment.setArguments(bundle);
            productListFiltersDialogFragment.show(fragmentManager, ProductListFiltersDialogFragment.f62535X);
        }

        public C25418a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersDialogFragment$b */
    public /* synthetic */ class C25419b implements C19426h0, C11379z {
        public C25419b() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l ProductListSettingsModel productListSettingsModel) {
            ProductListFiltersDialogFragment.this.mo74074c1(productListSettingsModel);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductListFiltersDialogFragment.this, ProductListFiltersDialogFragment.class, "handleSettingsChanged", "handleSettingsChanged(Lcom/carrefour/fid/android/presentation/models/ProductListSettingsModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m109707T0(ProductListFiltersDialogFragment productListFiltersDialogFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        productListFiltersDialogFragment.mo74066S0(z);
    }

    /* renamed from: a1 */
    public static /* synthetic */ void m109708a1(ProductListFiltersDialogFragment productListFiltersDialogFragment, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        productListFiltersDialogFragment.mo74072Z0(th);
    }

    /* renamed from: d1 */
    public static final void m109709d1(ProductListFiltersDialogFragment productListFiltersDialogFragment, View view) {
        Intrinsics.checkNotNullParameter(productListFiltersDialogFragment, "this$0");
        productListFiltersDialogFragment.dismiss();
    }

    /* renamed from: e1 */
    public static final void m109710e1(ProductListFiltersDialogFragment productListFiltersDialogFragment, View view) {
        Intrinsics.checkNotNullParameter(productListFiltersDialogFragment, "this$0");
        productListFiltersDialogFragment.mo74066S0(true);
    }

    /* renamed from: f1 */
    public static final void m109711f1(ProductListFiltersDialogFragment productListFiltersDialogFragment, View view) {
        Intrinsics.checkNotNullParameter(productListFiltersDialogFragment, "this$0");
        view.setEnabled(false);
        ProductListFiltersViewModel W0 = productListFiltersDialogFragment.mo74069W0();
        ProductListSettingsModel f = W0.mo78994j0().mo4610f();
        if (f != null) {
            List<FacetModel> s = f.mo121853s();
            if (s != null) {
                FacetModelKt.m159549c(s);
            }
            f.mo121832H(SortModel.f97547c.mo121952a());
        }
        C19501x.m90847a(productListFiltersDialogFragment).mo57477c(new ProductListFiltersDialogFragment$onViewCreated$3$1$1$2(W0, (C11045c<? super ProductListFiltersDialogFragment$onViewCreated$3$1$1$2>) null));
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m109712j1(ProductListFiltersDialogFragment productListFiltersDialogFragment, FacetModel facetModel, int i, Object obj) {
        if ((i & 1) != 0) {
            facetModel = null;
        }
        productListFiltersDialogFragment.mo74077i1(facetModel);
    }

    /* renamed from: L0 */
    public boolean mo74064L0() {
        if (!mo74067U0().f90719c.f91452b.isShown()) {
            return super.mo74064L0();
        }
        mo74066S0(true);
        return true;
    }

    /* renamed from: R0 */
    public final void mo74065R0() {
        ProductListSettingsModel f = mo74069W0().mo78994j0().mo4610f();
        if (f != null) {
            C27177a V0 = mo74068V0();
            List<FacetModel> s = f.mo121853s();
            if (s != null && FacetModelKt.m159550d(s) > 0) {
                V0.mo79000a(s);
            }
            SortModel B = f.mo121826B();
            if (B == null) {
                B = SortModel.f97547c.mo121952a();
            }
            V0.mo79001b(B);
            requireActivity().mo57175g0().mo56857a(f62537Z, C17779d.m81164b(C11078d1.m42659a(f62534E0, f)));
            dismiss();
            return;
        }
        throw new Throwable("Can't get settings from filters dialog view model");
    }

    /* renamed from: S0 */
    public final void mo74066S0(boolean z) {
        getChildFragmentManager().mo56901r1();
        m109712j1(this, (FacetModel) null, 1, (Object) null);
        if (z) {
            C19501x.m90847a(this).mo57477c(new ProductListFiltersDialogFragment$backFromTerms$1(this, (C11045c<? super ProductListFiltersDialogFragment$backFromTerms$1>) null));
        }
    }

    /* renamed from: U0 */
    public final C36672d3 mo74067U0() {
        return (C36672d3) this.f62540v.getValue();
    }

    @C12579k
    /* renamed from: V0 */
    public final C27177a mo74068V0() {
        C27177a aVar = this.f62542x;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productListFiltersAnalyticsViewModel");
        return null;
    }

    @C12579k
    /* renamed from: W0 */
    public final ProductListFiltersViewModel mo74069W0() {
        ProductListFiltersViewModel productListFiltersViewModel = this.f62541w;
        if (productListFiltersViewModel != null) {
            return productListFiltersViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productListFiltersViewModel");
        return null;
    }

    /* renamed from: X0 */
    public final ProductListSettingsModel mo74070X0() {
        ProductListSettingsModel productListSettingsModel;
        Bundle arguments = getArguments();
        if (arguments != null) {
            productListSettingsModel = (ProductListSettingsModel) arguments.getParcelable("settings");
        } else {
            productListSettingsModel = null;
        }
        if (productListSettingsModel != null) {
            return productListSettingsModel;
        }
        throw new Throwable("No settings");
    }

    /* renamed from: Y0 */
    public final void mo74071Y0(@C12579k FacetModel facetModel) {
        Intrinsics.checkNotNullParameter(facetModel, ProductListFiltersFacetTermsFragment.f62548f);
        mo74077i1(facetModel);
        if (!Intrinsics.areEqual((Object) facetModel.mo121582h0(), (Object) "checkbox") || facetModel.mo121580f0() > 0) {
            mo74067U0().f90719c.f91452b.sendAccessibilityEvent(8);
            C19234h0 u = getChildFragmentManager().mo56909u();
            u.mo57212N(R.anim.slide_in_right, R.anim.pop_exit, R.anim.pop_enter, R.anim.slide_out_right);
            ProductListFiltersFacetTermsFragment.C25420a aVar = ProductListFiltersFacetTermsFragment.f62544b;
            Bundle bundle = new Bundle();
            bundle.putParcelable(ProductListFiltersFacetTermsFragment.f62548f, facetModel);
            C11079d2 d2Var = C11079d2.f28267a;
            u.mo57202D(R.id.layout_product_list_filter, aVar.mo74089a(bundle), ProductListFiltersFacetTermsFragment.f62547e);
            u.mo57225o(ProductListFiltersFacetTermsFragment.f62547e);
            u.mo57052q();
            return;
        }
        C19501x.m90847a(this).mo57477c(new ProductListFiltersDialogFragment$handleFacetTerm$1(this, (C11045c<? super ProductListFiltersDialogFragment$handleFacetTerm$1>) null));
    }

    /* renamed from: Z0 */
    public final void mo74072Z0(@C12580l Throwable th) {
        String str;
        C28935i iVar = C28935i.f70940a;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C28935i.m119705e(iVar, "handleProductListError: " + str, th, 0, 4, (Object) null);
        mo74067U0().f90719c.f91454d.setEnabled(true);
    }

    /* renamed from: b1 */
    public final void mo74073b1(@C12580l Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            mo74067U0().f90719c.f91453c.setEnabled(false);
            mo74067U0().f90719c.f91454d.setEnabled(false);
        } else if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            mo74067U0().f90719c.f91453c.setEnabled(true);
            mo74067U0().f90719c.f91454d.setEnabled(mo74069W0().mo78996l0());
        }
    }

    /* renamed from: c1 */
    public final void mo74074c1(ProductListSettingsModel productListSettingsModel) {
        if (productListSettingsModel != null) {
            C19234h0 u = getChildFragmentManager().mo56909u();
            u.mo57202D(R.id.layout_product_list_filter, ProductListFiltersSortAndFacetFragment.f62553w.mo74099a(productListSettingsModel.mo121853s()), ProductListFiltersSortAndFacetFragment.f62552Y);
            u.mo57225o(ProductListFiltersSortAndFacetFragment.f62552Y);
            u.mo57052q();
            C19501x.m90847a(this).mo57477c(new ProductListFiltersDialogFragment$handleSettingsChanged$2(this, (C11045c<? super ProductListFiltersDialogFragment$handleSettingsChanged$2>) null));
        }
    }

    /* renamed from: g1 */
    public final void mo74075g1(@C12579k C27177a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f62542x = aVar;
    }

    /* renamed from: h1 */
    public final void mo74076h1(@C12579k ProductListFiltersViewModel productListFiltersViewModel) {
        Intrinsics.checkNotNullParameter(productListFiltersViewModel, "<set-?>");
        this.f62541w = productListFiltersViewModel;
    }

    /* renamed from: i1 */
    public final void mo74077i1(@C12580l FacetModel facetModel) {
        if (facetModel == null) {
            mo74067U0().f90719c.f91452b.setVisibility(8);
            mo74067U0().f90719c.f91453c.setVisibility(0);
            mo74067U0().f90719c.f91454d.setVisibility(0);
            mo74067U0().f90719c.f91455e.setText(getString(R.string.title_filter));
            mo74067U0().f90719c.f91454d.setEnabled(mo74069W0().mo78996l0());
            return;
        }
        mo74067U0().f90719c.f91452b.setVisibility(0);
        mo74067U0().f90719c.f91453c.setVisibility(8);
        ImageButton imageButton = mo74067U0().f90719c.f91454d;
        imageButton.setEnabled(false);
        imageButton.setVisibility(4);
        mo74067U0().f90719c.f91455e.setText(facetModel.mo121573X());
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        LinearLayout b = mo74067U0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onDestroyView() {
        ProductListFiltersViewModel W0 = mo74069W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C28502s.C28503a.m118425a(W0, viewLifecycleOwner, (Boolean) null, 2, (Object) null);
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
        mo74068V0().mo79002c();
        mo74067U0().f90719c.f91455e.setText(getString(R.string.title_filter));
        mo74067U0().f90719c.f91453c.setOnClickListener(new C25440c(this));
        ImageButton imageButton = mo74067U0().f90719c.f91452b;
        imageButton.setVisibility(8);
        imageButton.setOnClickListener(new C25441d(this));
        ImageButton imageButton2 = mo74067U0().f90719c.f91454d;
        imageButton2.setEnabled(false);
        imageButton2.setOnClickListener(new C25442e(this));
        ProductListFiltersViewModel W0 = mo74069W0();
        W0.mo78994j0().mo57491k(getViewLifecycleOwner(), new C25419b());
        W0.mo78997m0(ProductListSettingsModel.m159380q(mo74070X0(), (DepartmentHeaderModel) null, (DepartmentHeaderModel) null, (DepartmentHeaderModel) null, (String) null, (String) null, false, (String) null, (String) null, false, false, (String) null, (SortModel) null, (List) null, 0, (String) null, 32767, (Object) null));
    }
}
