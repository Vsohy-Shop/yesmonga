package com.carrefour.fid.android.presentation.p035ui.product.search;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36712h3;
import com.carrefour.fid.android.design.components.extension.ButtonKt;
import com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent;
import com.carrefour.fid.android.presentation.p035ui.product.search.C25685t;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.ProductSearchWithListResultFragment;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27323c;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28795b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.C10164b;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010YJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J&\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0002J\b\u0010 \u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\u0003H\u0002J8\u0010+\u001a\u00020\u00032.\u0010*\u001a*\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0(0'j\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0(`)H\u0002J\b\u0010,\u001a\u00020\u0003H\u0016J\b\u0010-\u001a\u00020\u0003H\u0016J\u001a\u00102\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100H\u0016J\b\u00103\u001a\u00020\u0003H\u0016J\b\u00104\u001a\u00020\u0003H\u0016R\u0014\u00107\u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010NR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010\u00198BX\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Z"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/search/ProductSearchWithListFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/h3;", "Lkotlin/d2;", "initHeader", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/c$c;", "state", "B1", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/mvi/c$b;", "event", "p1", "", "", "savedSearchList", "s1", "hint", "text", "", "requestFocus", "d1", "g1", "f1", "", "offset", "t1", "Lcom/carrefour/fid/android/design/components/widgets/SearchWithListItemComponent;", "itemView", "z1", "i1", "h1", "initListeners", "c1", "A1", "isKeyboardVisible", "w1", "y1", "isEnabled", "D1", "x1", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "resultMap", "u1", "onStart", "onStop", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onPause", "f", "I", "numHint", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListViewModel;", "g", "Lkotlin/z;", "o1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "m1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "C1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;)V", "productSearchAnalyticsViewModel", "w", "Z", "isKeyboardShowing", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "x", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "l1", "()I", "numLine", "k1", "numFilledLine", "n1", "()Ljava/util/Set;", "searchList", "j1", "()Lcom/carrefour/fid/android/design/components/widgets/SearchWithListItemComponent;", "firstEmptyItem", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductSearchWithListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSearchWithListFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/ProductSearchWithListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BaseExpandableRecyclerView.kt\ncom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,390:1\n106#2,15:391\n202#3,4:406\n202#3,4:410\n202#3,4:419\n202#3,4:423\n1864#4,3:414\n1855#4,2:417\n*S KotlinDebug\n*F\n+ 1 ProductSearchWithListFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/ProductSearchWithListFragment\n*L\n50#1:391,15\n61#1:406,4\n74#1:410,4\n263#1:419,4\n359#1:423,4\n217#1:414,3\n223#1:417,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchWithListFragment */
public final class ProductSearchWithListFragment extends C25572i<C36712h3> {

    /* renamed from: y */
    public static final int f62798y = 8;

    /* renamed from: f */
    public final int f62799f = 4;
    @C12579k

    /* renamed from: g */
    public final C11677z f62800g;
    @Inject

    /* renamed from: v */
    public C27264a f62801v;

    /* renamed from: w */
    public boolean f62802w;
    @C12579k

    /* renamed from: x */
    public final ViewTreeObserver.OnGlobalLayoutListener f62803x;

    public ProductSearchWithListFragment() {
        super(C255371.f62804a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25549xec67d3b3(new C25548xec67d3b2(this)));
        this.f62800g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ProductSearchWithListViewModel.class), new C25550xec67d3b4(b), new C25551xec67d3b5((C11289a) null, b), new C25552xec67d3b6(this, b));
        this.f62803x = new C25583q(this);
    }

    /* renamed from: e1 */
    public static /* synthetic */ void m110083e1(ProductSearchWithListFragment productSearchWithListFragment, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        productSearchWithListFragment.mo74359d1(str, str2, z);
    }

    /* renamed from: q1 */
    public static final void m110084q1(ProductSearchWithListFragment productSearchWithListFragment, View view) {
        Intrinsics.checkNotNullParameter(productSearchWithListFragment, "this$0");
        productSearchWithListFragment.mo74377x1();
        productSearchWithListFragment.mo74371o1().sendIntent(new C27323c.C27332d.C27335c(productSearchWithListFragment.mo74370n1()));
        productSearchWithListFragment.mo74369m1().mo79297e(productSearchWithListFragment.mo74370n1().size());
    }

    /* renamed from: r1 */
    public static final void m110085r1(ProductSearchWithListFragment productSearchWithListFragment, View view) {
        Intrinsics.checkNotNullParameter(productSearchWithListFragment, "this$0");
        productSearchWithListFragment.mo74378y1();
    }

    /* renamed from: v1 */
    public static final void m110086v1(ProductSearchWithListFragment productSearchWithListFragment) {
        Intrinsics.checkNotNullParameter(productSearchWithListFragment, "this$0");
        View view = productSearchWithListFragment.getView();
        if (view != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            int height = view.getRootView().getHeight();
            if (((double) (height - rect.bottom)) > ((double) height) * 0.15d) {
                if (!productSearchWithListFragment.f62802w) {
                    productSearchWithListFragment.f62802w = true;
                    productSearchWithListFragment.mo74376w1(true);
                }
            } else if (productSearchWithListFragment.f62802w) {
                productSearchWithListFragment.f62802w = false;
                productSearchWithListFragment.mo74376w1(false);
            }
        }
    }

    /* renamed from: A1 */
    public final void mo74354A1() {
        View view = getView();
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f62803x);
        }
    }

    /* renamed from: B1 */
    public final void mo74355B1(C27323c.C27331c cVar) {
        if (cVar.isLoading()) {
            MaterialButton materialButton = ((C36712h3) getBinding()).f90954f;
            Intrinsics.checkNotNullExpressionValue(materialButton, "binding.productSearchWithListSeeResultsButton");
            ButtonKt.m152103e(materialButton, true, (Drawable) null, (String) null, (Integer) null, (Integer) null, 30, (Object) null);
            ((C36712h3) getBinding()).f90951c.setEnabled(false);
            mo74357D1(false);
            return;
        }
        MaterialButton materialButton2 = ((C36712h3) getBinding()).f90954f;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "binding.productSearchWithListSeeResultsButton");
        ButtonKt.m152103e(materialButton2, false, (Drawable) null, getString(R.string.product_search_with_list_see_results), (Integer) null, (Integer) null, 26, (Object) null);
        mo74360f1();
        mo74357D1(true);
    }

    /* renamed from: C1 */
    public final void mo74356C1(@C12579k C27264a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f62801v = aVar;
    }

    /* renamed from: D1 */
    public final void mo74357D1(boolean z) {
        LinearLayout linearLayout = ((C36712h3) getBinding()).f90955g;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.searchItemContainer");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if (childAt instanceof SearchWithListItemComponent) {
                ((SearchWithListItemComponent) childAt).setEnabled(z);
            }
        }
    }

    /* renamed from: c1 */
    public final void mo74358c1() {
        View view = getView();
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f62803x);
        }
    }

    /* renamed from: d1 */
    public final void mo74359d1(String str, String str2, boolean z) {
        LinearLayout linearLayout = ((C36712h3) getBinding()).f90955g;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.searchItemContainer");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        SearchWithListItemComponent searchWithListItemComponent = new SearchWithListItemComponent(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        searchWithListItemComponent.setId(View.generateViewId());
        searchWithListItemComponent.setHintText(str);
        searchWithListItemComponent.setText(str2);
        if (z) {
            searchWithListItemComponent.requestFocus();
        }
        searchWithListItemComponent.setOnEditTextEditionFinishedListener(new ProductSearchWithListFragment$addSearchListItem$1(this));
        searchWithListItemComponent.setOnKeyboardNextButtonClickedListener(new ProductSearchWithListFragment$addSearchListItem$2(this, searchWithListItemComponent));
        searchWithListItemComponent.setOnFocusChangeListener(new ProductSearchWithListFragment$addSearchListItem$3(searchWithListItemComponent, this));
        searchWithListItemComponent.setOnDeleteButtonClickListener(new ProductSearchWithListFragment$addSearchListItem$4(this, searchWithListItemComponent));
        linearLayout.addView(searchWithListItemComponent);
    }

    /* renamed from: f1 */
    public final void mo74360f1() {
        LinearLayout linearLayout = ((C36712h3) getBinding()).f90955g;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.searchItemContainer");
        int childCount = linearLayout.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if ((childAt instanceof SearchWithListItemComponent) && (!C11622t.isBlank(((SearchWithListItemComponent) childAt).getText()))) {
                z = true;
            }
        }
        if (z) {
            mo74363i1();
        } else {
            mo74362h1();
        }
    }

    /* renamed from: g1 */
    public final void mo74361g1() {
        if (mo74367k1() >= mo74368l1() - 1) {
            m110083e1(this, (String) null, (String) null, false, 7, (Object) null);
        }
    }

    /* renamed from: h1 */
    public final void mo74362h1() {
        ((C36712h3) getBinding()).f90951c.setEnabled(false);
        ((C36712h3) getBinding()).f90954f.setEnabled(false);
    }

    /* renamed from: i1 */
    public final void mo74363i1() {
        ((C36712h3) getBinding()).f90951c.setEnabled(true);
        ((C36712h3) getBinding()).f90954f.setEnabled(true);
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        ((C36712h3) getBinding()).f90952d.setContent(C8553b.m31049c(380227762, true, new ProductSearchWithListFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ((C36712h3) getBinding()).f90951c.setOnClickListener(new C25584r(this));
        ((C36712h3) getBinding()).f90954f.setOnClickListener(new C25684s(this));
    }

    /* renamed from: j1 */
    public final SearchWithListItemComponent mo74366j1() {
        int l1 = mo74368l1() - 1;
        if (l1 < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            View childAt = ((C36712h3) getBinding()).f90955g.getChildAt(i);
            if (childAt instanceof SearchWithListItemComponent) {
                SearchWithListItemComponent searchWithListItemComponent = (SearchWithListItemComponent) childAt;
                if (C11622t.isBlank(searchWithListItemComponent.getText())) {
                    return searchWithListItemComponent;
                }
            }
            if (i == l1) {
                return null;
            }
            i++;
        }
    }

    /* renamed from: k1 */
    public final int mo74367k1() {
        LinearLayout linearLayout = ((C36712h3) getBinding()).f90955g;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.searchItemContainer");
        int childCount = linearLayout.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if ((childAt instanceof SearchWithListItemComponent) && (!C11622t.isBlank(((SearchWithListItemComponent) childAt).getText()))) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: l1 */
    public final int mo74368l1() {
        return ((C36712h3) getBinding()).f90955g.getChildCount();
    }

    @C12579k
    /* renamed from: m1 */
    public final C27264a mo74369m1() {
        C27264a aVar = this.f62801v;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productSearchAnalyticsViewModel");
        return null;
    }

    /* renamed from: n1 */
    public final Set<String> mo74370n1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinearLayout linearLayout = ((C36712h3) getBinding()).f90955g;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.searchItemContainer");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if (childAt instanceof SearchWithListItemComponent) {
                SearchWithListItemComponent searchWithListItemComponent = (SearchWithListItemComponent) childAt;
                if (!C11622t.isBlank(searchWithListItemComponent.getText())) {
                    linkedHashSet.add(searchWithListItemComponent.getText());
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: o1 */
    public final ProductSearchWithListViewModel mo74371o1() {
        return (ProductSearchWithListViewModel) this.f62800g.getValue();
    }

    public void onPause() {
        mo74354A1();
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        FragmentExtensionKt.m58758i(requireActivity);
        mo74371o1().sendIntent(new C27323c.C27332d.C27334b(mo74370n1()));
        super.onPause();
    }

    public void onResume() {
        mo74358c1();
        super.onResume();
    }

    public void onStart() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        super.onStart();
    }

    public void onStop() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        super.onStop();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        initListeners();
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new ProductSearchWithListFragment$onViewCreated$1(this, (C11045c<? super ProductSearchWithListFragment$onViewCreated$1>) null), 3, (Object) null);
        mo74369m1().mo79293a();
    }

    /* renamed from: p1 */
    public final void mo74372p1(C27323c.C27327b bVar) {
        if (bVar instanceof C27323c.C27327b.C27328a) {
            mo74373s1(((C27323c.C27327b.C27328a) bVar).mo79523d());
        } else if (bVar instanceof C27323c.C27327b.C27330c) {
            mo74375u1(((C27323c.C27327b.C27330c) bVar).mo79535d());
        } else if (bVar instanceof C27323c.C27327b.C27329b) {
            C27323c.C27324a d = ((C27323c.C27327b.C27329b) bVar).mo79529d();
            if (!(d instanceof C27323c.C27324a.C27326b)) {
                boolean z = d instanceof C27323c.C27324a.C27325a;
            }
        }
    }

    /* renamed from: s1 */
    public final void mo74373s1(Set<String> set) {
        boolean z;
        if (set.isEmpty()) {
            String[] stringArray = requireActivity().getResources().getStringArray(R.array.default_search_list);
            Intrinsics.checkNotNullExpressionValue(stringArray, "requireActivity().resour…rray.default_search_list)");
            List cy = ArraysKt___ArraysKt.m39702cy(stringArray, this.f62799f);
            int i = 0;
            for (Object next : cy) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                String str = (String) next;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Object obj = cy.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "defaultSearchList[index]");
                m110083e1(this, (String) obj, (String) null, z, 2, (Object) null);
                i = i2;
            }
            m110083e1(this, (String) null, (String) null, false, 7, (Object) null);
            return;
        }
        for (String e1 : set) {
            m110083e1(this, (String) null, e1, false, 5, (Object) null);
        }
        m110083e1(this, (String) null, (String) null, true, 3, (Object) null);
    }

    /* renamed from: t1 */
    public final void mo74374t1(int i) {
        ((C36712h3) getBinding()).f90956h.scrollBy(0, i);
    }

    /* renamed from: u1 */
    public final void mo74375u1(HashMap<String, List<String>> hashMap) {
        C25685t.C25687b bVar = C25685t.f62978a;
        Bundle bundle = new Bundle();
        bundle.putSerializable(ProductSearchWithListResultFragment.f62914X, hashMap);
        C11079d2 d2Var = C11079d2.f28267a;
        FragmentKt.m118823k(this, C25685t.C25687b.m110356b(bVar, bundle, 0, 2, (Object) null));
    }

    /* renamed from: w1 */
    public final void mo74376w1(boolean z) {
        C28795b.m119161a(this, !z);
    }

    /* renamed from: x1 */
    public final void mo74377x1() {
        int l1 = mo74368l1();
        while (true) {
            l1--;
            if (-1 < l1) {
                View childAt = ((C36712h3) getBinding()).f90955g.getChildAt(l1);
                if ((childAt instanceof SearchWithListItemComponent) && C11622t.isBlank(((SearchWithListItemComponent) childAt).getText())) {
                    ((C36712h3) getBinding()).f90955g.removeViewAt(l1);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: y1 */
    public final void mo74378y1() {
        View childAt = ((C36712h3) getBinding()).f90955g.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent");
        SearchWithListItemComponent searchWithListItemComponent = (SearchWithListItemComponent) childAt;
        View childAt2 = ((C36712h3) getBinding()).f90955g.getChildAt(1);
        Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent");
        searchWithListItemComponent.setText("");
        ((SearchWithListItemComponent) childAt2).setText("");
        if (mo74368l1() > 2) {
            for (int l1 = mo74368l1() - 1; 1 < l1; l1--) {
                View childAt3 = ((C36712h3) getBinding()).f90955g.getChildAt(l1);
                Intrinsics.checkNotNull(childAt3, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent");
                ((SearchWithListItemComponent) childAt3).mo113073y();
                ((C36712h3) getBinding()).f90955g.removeViewAt(l1);
            }
        }
        searchWithListItemComponent.requestFocus();
    }

    /* renamed from: z1 */
    public final void mo74379z1(SearchWithListItemComponent searchWithListItemComponent) {
        SearchWithListItemComponent j1;
        LinearLayout linearLayout = ((C36712h3) getBinding()).f90955g;
        if (linearLayout.getChildCount() > 2) {
            searchWithListItemComponent.mo113073y();
            linearLayout.removeView(searchWithListItemComponent);
            mo74360f1();
            if (linearLayout.getChildCount() <= 2 && (j1 = mo74366j1()) != null) {
                j1.requestFocus();
                return;
            }
            return;
        }
        searchWithListItemComponent.setText("");
    }
}
