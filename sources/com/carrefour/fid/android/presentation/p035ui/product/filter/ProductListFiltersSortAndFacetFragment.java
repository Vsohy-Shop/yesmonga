package com.carrefour.fid.android.presentation.p035ui.product.filter;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.databinding.C36692f3;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.PageModel;
import com.carrefour.fid.android.presentation.models.ProductListResultModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.presentation.p035ui.product.filter.adapter.C25431b;
import com.carrefour.fid.android.presentation.p035ui.product.filter.adapter.ProductListFiltersSortAdapter;
import com.carrefour.fid.android.presentation.viewmodels.product.filter.ProductListFiltersViewModel;
import com.carrefour.fid.android.shared.presentation.components.decoration.C28852a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10998z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b*\u0001!\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b*\u0010+J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersSortAndFacetFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/f3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "", "exception", "Y0", "X0", "", "loading", "a1", "(Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/presentation/models/ProductListResultModel;", "result", "b1", "Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel;", "d1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/filter/ProductListFiltersViewModel;)V", "productListFiltersViewModel", "Lcom/carrefour/fid/android/presentation/ui/product/filter/adapter/b$a;", "g", "Lcom/carrefour/fid/android/presentation/ui/product/filter/adapter/b$a;", "facetAdapterCallback", "com/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersSortAndFacetFragment$f", "v", "Lcom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersSortAndFacetFragment$f;", "sortDispatcher", "", "Lcom/carrefour/fid/android/presentation/models/FacetModel;", "V0", "()Ljava/util/List;", "facets", "<init>", "()V", "w", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListFiltersSortAndFacetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersSortAndFacetFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersSortAndFacetFragment\n+ 2 Parcelable.kt\ncom/carrefour/fid/android/shared/extension/ParcelableKt\n*L\n1#1,181:1\n5#2:182\n*S KotlinDebug\n*F\n+ 1 ProductListFiltersSortAndFacetFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersSortAndFacetFragment\n*L\n53#1:182\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersSortAndFacetFragment */
public final class ProductListFiltersSortAndFacetFragment extends C25439b<C36692f3> {
    @C12579k

    /* renamed from: X */
    public static final String f62551X = "facet_list";
    @C12579k

    /* renamed from: Y */
    public static final String f62552Y = "ProductListFiltersSortAndCategoryFragment";
    @C12579k

    /* renamed from: w */
    public static final C25422a f62553w = new C25422a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f62554x = 8;

    /* renamed from: y */
    public static final float f62555y = 0.5f;

    /* renamed from: z */
    public static final float f62556z = 1.0f;
    @Inject

    /* renamed from: f */
    public ProductListFiltersViewModel f62557f;
    @C12579k

    /* renamed from: g */
    public final C25431b.C25432a f62558g = new C25423b(this);
    @C12579k

    /* renamed from: v */
    public final C25427f f62559v = new C25427f(this);

    @C11363r0({"SMAP\nProductListFiltersSortAndFacetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersSortAndFacetFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersSortAndFacetFragment$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n37#2,2:182\n*S KotlinDebug\n*F\n+ 1 ProductListFiltersSortAndFacetFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/ProductListFiltersSortAndFacetFragment$Companion\n*L\n43#1:182,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersSortAndFacetFragment$a */
    public static final class C25422a {
        public /* synthetic */ C25422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ProductListFiltersSortAndFacetFragment mo74099a(@C12580l List<FacetModel> list) {
            FacetModel[] facetModelArr;
            ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment = new ProductListFiltersSortAndFacetFragment();
            Bundle bundle = new Bundle();
            if (list != null) {
                facetModelArr = (FacetModel[]) list.toArray(new FacetModel[0]);
            } else {
                facetModelArr = null;
            }
            bundle.putParcelableArray(ProductListFiltersSortAndFacetFragment.f62551X, (Parcelable[]) facetModelArr);
            productListFiltersSortAndFacetFragment.setArguments(bundle);
            return productListFiltersSortAndFacetFragment;
        }

        public C25422a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersSortAndFacetFragment$b */
    public static final class C25423b implements C25431b.C25432a {

        /* renamed from: a */
        public final /* synthetic */ ProductListFiltersSortAndFacetFragment f62561a;

        public C25423b(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment) {
            this.f62561a = productListFiltersSortAndFacetFragment;
        }

        /* renamed from: a */
        public final void mo74100a(@C12579k FacetModel facetModel) {
            ProductListFiltersDialogFragment productListFiltersDialogFragment;
            Intrinsics.checkNotNullParameter(facetModel, ProductListFiltersFacetTermsFragment.f62548f);
            if (!ProductListFiltersSortAndFacetFragment.m109740R0(this.f62561a).f90804e.isShown() && (productListFiltersDialogFragment = (ProductListFiltersDialogFragment) FragmentKt.m148916b(this.f62561a, ProductListFiltersDialogFragment.class)) != null) {
                productListFiltersDialogFragment.mo74071Y0(facetModel);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersSortAndFacetFragment$c */
    public /* synthetic */ class C25424c implements C19426h0, C11379z {
        public C25424c() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Throwable th) {
            ProductListFiltersSortAndFacetFragment.this.mo74094Y0(th);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductListFiltersSortAndFacetFragment.this, ProductListFiltersSortAndFacetFragment.class, "handleProductListError", "handleProductListError(Ljava/lang/Throwable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersSortAndFacetFragment$d */
    public /* synthetic */ class C25425d implements C19426h0, C11379z {
        public C25425d() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Boolean bool) {
            ProductListFiltersSortAndFacetFragment.this.mo74095a1(bool);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductListFiltersSortAndFacetFragment.this, ProductListFiltersSortAndFacetFragment.class, "handleProductListLoading", "handleProductListLoading(Ljava/lang/Boolean;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersSortAndFacetFragment$e */
    public /* synthetic */ class C25426e implements C19426h0, C11379z {
        public C25426e() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l ProductListResultModel productListResultModel) {
            ProductListFiltersSortAndFacetFragment.this.mo74096b1(productListResultModel);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductListFiltersSortAndFacetFragment.this, ProductListFiltersSortAndFacetFragment.class, "handleProductListResult", "handleProductListResult(Lcom/carrefour/fid/android/presentation/models/ProductListResultModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.ProductListFiltersSortAndFacetFragment$f */
    public static final class C25427f implements ProductListFiltersSortAdapter.C25429a {

        /* renamed from: a */
        public final /* synthetic */ ProductListFiltersSortAndFacetFragment f62565a;

        public C25427f(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment) {
            this.f62565a = productListFiltersSortAndFacetFragment;
        }

        @C12579k
        /* renamed from: a */
        public SortModel mo74110a() {
            SortModel B;
            ProductListSettingsModel f = this.f62565a.mo74092W0().mo78994j0().mo4610f();
            if (f == null || (B = f.mo121826B()) == null) {
                return SortModel.f97547c.mo121952a();
            }
            return B;
        }

        /* renamed from: b */
        public void mo74111b(@C12579k SortModel sortModel) {
            Intrinsics.checkNotNullParameter(sortModel, "value");
            ProductListSettingsModel f = this.f62565a.mo74092W0().mo78994j0().mo4610f();
            if (f != null) {
                f.mo121832H(sortModel);
            }
            ProductListFiltersDialogFragment productListFiltersDialogFragment = (ProductListFiltersDialogFragment) FragmentKt.m148916b(this.f62565a, ProductListFiltersDialogFragment.class);
            if (productListFiltersDialogFragment != null) {
                ProductListFiltersDialogFragment.m109712j1(productListFiltersDialogFragment, (FacetModel) null, 1, (Object) null);
            }
        }
    }

    public ProductListFiltersSortAndFacetFragment() {
        super(C254211.f62560a);
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C36692f3 m109740R0(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment) {
        return (C36692f3) productListFiltersSortAndFacetFragment.getBinding();
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m109744Z0(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        productListFiltersSortAndFacetFragment.mo74094Y0(th);
    }

    /* renamed from: c1 */
    public static final void m109745c1(ProductListFiltersSortAndFacetFragment productListFiltersSortAndFacetFragment, View view) {
        Intrinsics.checkNotNullParameter(productListFiltersSortAndFacetFragment, "this$0");
        ProductListFiltersDialogFragment productListFiltersDialogFragment = (ProductListFiltersDialogFragment) FragmentKt.m148916b(productListFiltersSortAndFacetFragment, ProductListFiltersDialogFragment.class);
        if (productListFiltersDialogFragment != null) {
            productListFiltersDialogFragment.mo74065R0();
        }
    }

    /* renamed from: V0 */
    public final List<FacetModel> mo74091V0() {
        Parcelable[] parcelableArray;
        List<R> a1;
        List<FacetModel> l5;
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArray = arguments.getParcelableArray(f62551X)) == null || (a1 = C10998z.m42387a1(ArraysKt___ArraysKt.m39955kz(parcelableArray), FacetModel.class)) == null || (l5 = CollectionsKt___CollectionsKt.m40659l5(a1)) == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return l5;
    }

    @C12579k
    /* renamed from: W0 */
    public final ProductListFiltersViewModel mo74092W0() {
        ProductListFiltersViewModel productListFiltersViewModel = this.f62557f;
        if (productListFiltersViewModel != null) {
            return productListFiltersViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productListFiltersViewModel");
        return null;
    }

    /* renamed from: X0 */
    public final void mo74093X0() {
        Button button = ((C36692f3) getBinding()).f90801b;
        button.setText(getString(R.string.filter_no_product));
        button.setEnabled(false);
    }

    /* renamed from: Y0 */
    public final void mo74094Y0(Throwable th) {
        ProductListFiltersDialogFragment productListFiltersDialogFragment = (ProductListFiltersDialogFragment) FragmentKt.m148916b(this, ProductListFiltersDialogFragment.class);
        if (productListFiltersDialogFragment != null) {
            productListFiltersDialogFragment.mo74072Z0(th);
        }
        Button button = ((C36692f3) getBinding()).f90801b;
        button.setText(getString(R.string.filter_no_product));
        button.setEnabled(false);
    }

    /* renamed from: a1 */
    public final void mo74095a1(Boolean bool) {
        ProductListFiltersDialogFragment productListFiltersDialogFragment = (ProductListFiltersDialogFragment) FragmentKt.m148916b(this, ProductListFiltersDialogFragment.class);
        if (productListFiltersDialogFragment != null) {
            productListFiltersDialogFragment.mo74073b1(bool);
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            ProgressBar progressBar = ((C36692f3) getBinding()).f90804e;
            Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBarProductListFilters");
            ViewKt.m152123e(progressBar, (Integer) null, false, (C11289a) null, 7, (Object) null);
            ((C36692f3) getBinding()).f90801b.setEnabled(false);
            RecyclerView recyclerView = ((C36692f3) getBinding()).f90802c;
            recyclerView.setAlpha(0.5f);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "handleProductListLoading$lambda$7");
            com.carrefour.fid.android.shared.extension.ViewKt.m118996i(recyclerView, false);
            RecyclerView recyclerView2 = ((C36692f3) getBinding()).f90803d;
            recyclerView2.setAlpha(0.5f);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "handleProductListLoading$lambda$8");
            com.carrefour.fid.android.shared.extension.ViewKt.m118996i(recyclerView2, false);
        } else if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            ProgressBar progressBar2 = ((C36692f3) getBinding()).f90804e;
            Intrinsics.checkNotNullExpressionValue(progressBar2, "binding.progressBarProductListFilters");
            ViewKt.m152126h(progressBar2, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
            RecyclerView recyclerView3 = ((C36692f3) getBinding()).f90802c;
            recyclerView3.setAlpha(1.0f);
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "handleProductListLoading$lambda$9");
            com.carrefour.fid.android.shared.extension.ViewKt.m118996i(recyclerView3, true);
            RecyclerView recyclerView4 = ((C36692f3) getBinding()).f90803d;
            recyclerView4.setAlpha(1.0f);
            Intrinsics.checkNotNullExpressionValue(recyclerView4, "handleProductListLoading$lambda$10");
            com.carrefour.fid.android.shared.extension.ViewKt.m118996i(recyclerView4, true);
        }
    }

    /* renamed from: b1 */
    public final void mo74096b1(ProductListResultModel productListResultModel) {
        C25431b bVar;
        PageModel h;
        SortModel B;
        ProductListFiltersSortAdapter productListFiltersSortAdapter;
        RecyclerView.Adapter adapter = ((C36692f3) getBinding()).f90802c.getAdapter();
        Integer num = null;
        if (adapter instanceof C25431b) {
            bVar = (C25431b) adapter;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.mo74123o(CollectionsKt___CollectionsKt.m40659l5(mo74091V0()));
        }
        ProductListSettingsModel f = mo74092W0().mo78994j0().mo4610f();
        if (!(f == null || (B = f.mo121826B()) == null || !Intrinsics.areEqual((Object) SortModel.f97547c.mo121952a(), (Object) B))) {
            RecyclerView.Adapter adapter2 = ((C36692f3) getBinding()).f90803d.getAdapter();
            if (adapter2 instanceof ProductListFiltersSortAdapter) {
                productListFiltersSortAdapter = (ProductListFiltersSortAdapter) adapter2;
            } else {
                productListFiltersSortAdapter = null;
            }
            if (productListFiltersSortAdapter != null) {
                productListFiltersSortAdapter.notifyDataSetChanged();
            }
        }
        if (!(productListResultModel == null || (h = productListResultModel.mo121817h()) == null)) {
            num = Integer.valueOf(h.mo121777f());
        }
        if (num == null || num.intValue() <= 0) {
            mo74093X0();
            return;
        }
        Button button = ((C36692f3) getBinding()).f90801b;
        button.setClickable(true);
        button.setEnabled(true);
        button.setText(button.getResources().getQuantityString(R.plurals.filter_validate_button, num.intValue(), new Object[]{num}));
    }

    /* renamed from: d1 */
    public final void mo74097d1(@C12579k ProductListFiltersViewModel productListFiltersViewModel) {
        Intrinsics.checkNotNullParameter(productListFiltersViewModel, "<set-?>");
        this.f62557f = productListFiltersViewModel;
    }

    public void onDestroyView() {
        ProductListFiltersViewModel W0 = mo74092W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        W0.mo74786r(viewLifecycleOwner, Boolean.FALSE);
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = ((C36692f3) getBinding()).f90803d;
        recyclerView.setAdapter(new ProductListFiltersSortAdapter(this.f62559v));
        recyclerView.setItemAnimator((RecyclerView.C20069l) null);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        RecyclerView recyclerView2 = ((C36692f3) getBinding()).f90802c;
        recyclerView2.setAdapter(new C25431b(this.f62558g, (List) null, 2, (DefaultConstructorMarker) null));
        recyclerView2.setItemAnimator((RecyclerView.C20069l) null);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        recyclerView2.mo59589n(new C28852a(1, false, 0, 6, (DefaultConstructorMarker) null));
        ((C36692f3) getBinding()).f90801b.setOnClickListener(new C25447j(this));
        ProductListFiltersViewModel W0 = mo74092W0();
        W0.mo83418c0().mo57491k(getViewLifecycleOwner(), new C25424c());
        W0.mo83419d0().mo57491k(getViewLifecycleOwner(), new C25425d());
        W0.mo78993i0().mo57491k(getViewLifecycleOwner(), new C25426e());
    }
}
