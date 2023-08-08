package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.C36306e;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.databinding.C36869x0;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.C37390r;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListTitle;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38512k;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderRecommendedProductsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25956f;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28935i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001e\u0010\u0012\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0014\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\rH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0012\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010#\u001a\u00020\u0005H\u0014J\b\u0010$\u001a\u00020\u0005H\u0014J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u001a\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u0005H\u0016R\u001b\u00107\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderFrequentPurchasesFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/x0;", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderRecommendedProductsViewModel$b;", "state", "Lkotlin/d2;", "o1", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderRecommendedProductsViewModel$c;", "uiEvent", "l1", "i1", "n1", "", "Lcom/carrefour/fid/android/presentation/models/RecommendedProductsByDepartmentModel;", "departments", "g1", "", "departmentIndex", "e1", "itemPosition", "d1", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "productPosition", "o0", "D", "m1", "z", "department", "h1", "", "error", "k1", "exception", "j1", "b1", "p1", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onPause", "onDestroy", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderRecommendedProductsViewModel;", "f", "Lkotlin/z;", "f1", "()Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderRecommendedProductsViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/f;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/f;", "c1", "()Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/f;", "q1", "(Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/f;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "w", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketBuilderFrequentPurchasesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBuilderFrequentPurchasesFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderFrequentPurchasesFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,461:1\n106#2,15:462\n168#3,7:477\n183#3,6:484\n1#4:490\n1559#5:491\n1590#5,4:492\n1360#5:496\n1446#5,5:497\n1549#5:502\n1620#5,3:503\n1360#5:506\n1446#5,5:507\n1789#5,3:512\n1864#5,3:515\n*S KotlinDebug\n*F\n+ 1 BasketBuilderFrequentPurchasesFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderFrequentPurchasesFragment\n*L\n78#1:462,15\n116#1:477,7\n117#1:484,6\n204#1:491\n204#1:492,4\n238#1:496\n238#1:497,5\n241#1:502\n241#1:503,3\n270#1:506\n270#1:507,5\n277#1:512,3\n290#1:515,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment */
public final class BasketBuilderFrequentPurchasesFragment extends C23228o<C36869x0> {

    /* renamed from: X */
    public static final int f58857X = 5;
    @C12579k

    /* renamed from: Y */
    public static final String f58858Y = "KEY_LIST_POSITION";
    @C12579k

    /* renamed from: x */
    public static final C23173a f58859x = new C23173a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f58860y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f58861z = "BasketBuilderRecommendedProductsFragment";
    @C12579k

    /* renamed from: f */
    public final C11677z f58862f;
    @Inject

    /* renamed from: g */
    public C28796c f58863g;
    @Inject

    /* renamed from: v */
    public C25956f f58864v;
    @C12580l

    /* renamed from: w */
    public C37370b f58865w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment$a */
    public static final class C23173a {
        public /* synthetic */ C23173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23173a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment$b */
    public static final class C23174b extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView f58867a;

        /* renamed from: b */
        public final /* synthetic */ BasketBuilderFragment f58868b;

        /* renamed from: c */
        public final /* synthetic */ BasketBuilderFrequentPurchasesFragment f58869c;

        /* renamed from: d */
        public final /* synthetic */ List<RecommendedProductsByDepartmentModel> f58870d;

        public C23174b(RecyclerView recyclerView, BasketBuilderFragment basketBuilderFragment, BasketBuilderFrequentPurchasesFragment basketBuilderFrequentPurchasesFragment, List<RecommendedProductsByDepartmentModel> list) {
            this.f58867a = recyclerView;
            this.f58868b = basketBuilderFragment;
            this.f58869c = basketBuilderFrequentPurchasesFragment;
            this.f58870d = list;
        }

        /* renamed from: b */
        public void mo30662b(@C12579k RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManager;
            int i3;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.mo30662b(recyclerView, i, i2);
            RecyclerView.C20076o layoutManager = this.f58867a.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                i3 = linearLayoutManager.mo59426t2();
            } else {
                i3 = 0;
            }
            this.f58868b.mo67958d1(this.f58869c.mo67981d1(this.f58870d, i3 + 1));
        }
    }

    public BasketBuilderFrequentPurchasesFragment() {
        super(C231721.f58866a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C23186xf4f313c7(new C23185xf4f313c6(this)));
        this.f58862f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BasketBuilderRecommendedProductsViewModel.class), new C23187xf4f313c8(b), new C23188xf4f313c9((C11289a) null, b), new C23189xf4f313ca(this, b));
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C36869x0 m103797Q0(BasketBuilderFrequentPurchasesFragment basketBuilderFrequentPurchasesFragment) {
        return (C36869x0) basketBuilderFrequentPurchasesFragment.getBinding();
    }

    /* renamed from: D */
    public final void mo67978D(OfferProductModel offerProductModel, int i) {
        mo67980c1().mo75384i(offerProductModel, i);
        mo67983f1().sendIntent(new BasketBuilderRecommendedProductsViewModel.C25934d.C25941g(offerProductModel));
    }

    /* renamed from: b1 */
    public void mo67979b1() {
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C13825a.m58787p(requireActivity, false, 0, 0, 7, (Object) null);
        mo67980c1().mo75382g();
    }

    @C12579k
    /* renamed from: c1 */
    public final C25956f mo67980c1() {
        C25956f fVar = this.f58864v;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: d1 */
    public final int mo67981d1(List<RecommendedProductsByDepartmentModel> list, int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        for (Object next : list) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = (RecommendedProductsByDepartmentModel) next;
            if (recommendedProductsByDepartmentModel.mo121909f().size() > 5) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            i4 += Integer.min(recommendedProductsByDepartmentModel.mo121909f().size(), 5) + 1 + i2;
            if (i4 >= i) {
                return i3;
            }
            i3 = i5;
        }
        return CollectionsKt__CollectionsKt.m40443G(list);
    }

    /* renamed from: e1 */
    public final int mo67982e1(List<RecommendedProductsByDepartmentModel> list, int i) {
        int i2;
        int i3 = 0;
        for (RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel : CollectionsKt___CollectionsKt.m40497E5(list, i)) {
            if (recommendedProductsByDepartmentModel.mo121909f().size() > 5) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            i3 = i3 + Integer.min(recommendedProductsByDepartmentModel.mo121909f().size(), 5) + 1 + i2;
        }
        return i3;
    }

    public /* bridge */ /* synthetic */ C11079d2 emptyFunction() {
        mo67979b1();
        return C11079d2.f28267a;
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36869x0) getBinding()).f91887d;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubBasketBuilderRecommendedProductsEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36869x0) getBinding()).f91888e;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubBasketBuilderRecommendedProductsError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final BasketBuilderRecommendedProductsViewModel mo67983f1() {
        return (BasketBuilderRecommendedProductsViewModel) this.f58862f.getValue();
    }

    /* renamed from: g1 */
    public final void mo67984g1(List<RecommendedProductsByDepartmentModel> list) {
        BottomNavActivity bottomNavActivity;
        Bundle L1;
        Parcelable parcelable;
        RecyclerView.C20076o layoutManager;
        List<RecommendedProductsByDepartmentModel> list2 = list;
        if (list.isEmpty()) {
            mo67987i1();
            return;
        }
        hideLoading();
        hideEmpty();
        hideErrorView();
        int i = 0;
        ((C36869x0) getBinding()).f91885b.setVisibility(0);
        C37370b bVar = this.f58865w;
        int i2 = 10;
        int i3 = 5;
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = (RecommendedProductsByDepartmentModel) next;
                List i6 = C10976s.m41417i();
                i6.add(new ProductCardListTitle.C37368a(recommendedProductsByDepartmentModel.mo121907e().mo121689Q() + C36306e.f89637a + recommendedProductsByDepartmentModel.mo121909f().size() + ")"));
                Iterable E5 = CollectionsKt___CollectionsKt.m40497E5(recommendedProductsByDepartmentModel.mo121909f(), i3);
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(E5, i2));
                int i7 = i;
                for (Object next2 : E5) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    OfferProductModel offerProductModel = (OfferProductModel) next2;
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "resources");
                    arrayList2.add(C38512k.m159777a(offerProductModel, resources, new C23190x12d7f11(this, offerProductModel, i4, i7), C23191x12d7f12.f58879f, new C23192x12d7f13(this, offerProductModel, i4, i7), new C23193x12d7f14(this, offerProductModel), new C23194x12d7f15(this, offerProductModel)));
                    i7 = i8;
                    it = it;
                }
                Iterator it2 = it;
                i6.addAll(arrayList2);
                if (recommendedProductsByDepartmentModel.mo121909f().size() > 5) {
                    StandardPickerComponent.C37293b.C37294a aVar = StandardPickerComponent.C37293b.C37294a.f93558f;
                    String Q = recommendedProductsByDepartmentModel.mo121907e().mo121689Q();
                    if (Q == null) {
                        Q = "";
                    }
                    String str = Q;
                    String string = getString(R.string.basket_builder_see_all_products);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.baske…builder_see_all_products)");
                    i6.add(new StandardPickerComponent.C37292a(aVar, R.drawable.ds_ic_departement, (Integer) null, str, string, (String) null, 0, (String) null, false, false, false, (Integer) null, new C23195xdc924b85(this, recommendedProductsByDepartmentModel), 4068, (DefaultConstructorMarker) null));
                }
                C10994x.m42360n0(arrayList, C10976s.m41409a(i6));
                i4 = i5;
                it = it2;
                i = 0;
                i2 = 10;
                i3 = 5;
            }
            bVar.setList(arrayList);
        }
        C25956f c1 = mo67980c1();
        Iterable<RecommendedProductsByDepartmentModel> iterable = list2;
        ArrayList arrayList3 = new ArrayList();
        for (RecommendedProductsByDepartmentModel f : iterable) {
            C10994x.m42360n0(arrayList3, CollectionsKt___CollectionsKt.m40497E5(f.mo121909f(), 5));
        }
        c1.mo75377a(arrayList3);
        BasketBuilderFragment basketBuilderFragment = (BasketBuilderFragment) FragmentKt.m148916b(this, BasketBuilderFragment.class);
        if (basketBuilderFragment != null) {
            ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (RecommendedProductsByDepartmentModel e : iterable) {
                arrayList4.add(e.mo121907e());
            }
            basketBuilderFragment.mo67955a1(arrayList4, new BasketBuilderFrequentPurchasesFragment$handleDepartmentList$3$2(this, list2));
            RecyclerView recyclerView = ((C36869x0) getBinding()).f91885b;
            recyclerView.mo59613r(new C23174b(recyclerView, basketBuilderFragment, this, list2));
            C19232h activity = basketBuilderFragment.getActivity();
            if (activity instanceof BottomNavActivity) {
                bottomNavActivity = (BottomNavActivity) activity;
            } else {
                bottomNavActivity = null;
            }
            if (!(bottomNavActivity == null || (L1 = bottomNavActivity.mo121105L1()) == null || (parcelable = L1.getParcelable("KEY_LIST_POSITION")) == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
                layoutManager.mo59429v1(parcelable);
            }
        }
        C25956f c12 = mo67980c1();
        ArrayList arrayList5 = new ArrayList();
        for (RecommendedProductsByDepartmentModel f2 : iterable) {
            C10994x.m42360n0(arrayList5, f2.mo121909f());
        }
        C25956f.m111125c(c12, arrayList5, false, 2, (Object) null);
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f58863g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo67986h1(RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
        BasketBuilderFragment basketBuilderFragment = (BasketBuilderFragment) FragmentKt.m148916b(this, BasketBuilderFragment.class);
        if (basketBuilderFragment != null) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(basketBuilderFragment, C23215e.f58900a.mo68063d(recommendedProductsByDepartmentModel));
        }
    }

    /* renamed from: i1 */
    public final void mo67987i1() {
        hideLoading();
        hideErrorView();
        mo67992n1();
        C28500r.C28501a.m118419a(this, (Integer) null, Integer.valueOf(R.string.additional_order_checkout_empty_message_title), Integer.valueOf(R.string.additional_order_checkout_empty_message_description), (Integer) null, false, true, (C11289a) null, 73, (Object) null);
        showEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v19, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67988j1(java.lang.Throwable r16) {
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
            goto L_0x01c4
        L_0x001a:
            boolean r1 = r0 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable
            if (r1 == 0) goto L_0x002b
            com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment$handleErrorEvent$1 r0 = new com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment$handleErrorEvent$1
            r0.<init>(r15)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r15, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r15)
            goto L_0x01c4
        L_0x002b:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            if (r1 == 0) goto L_0x0060
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r0
            java.lang.String r4 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r2)
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
            goto L_0x01c4
        L_0x0060:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r1 == 0) goto L_0x008b
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
            goto L_0x01c4
        L_0x008b:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r1 == 0) goto L_0x00b6
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
            goto L_0x01c4
        L_0x00b6:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x00fa
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.carrefour.fid.android.core.io.BasketUpdateThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketUpdateThrowable) r0
            java.lang.Throwable r0 = r0.getCause()
            boolean r4 = r0 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r4 == 0) goto L_0x00ce
            r3 = r0
            com.carrefour.fid.android.shared.io.ResponseThrowable r3 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r3
        L_0x00ce:
            if (r3 == 0) goto L_0x00d5
            int r0 = r3.mo83810a()
            goto L_0x00d6
        L_0x00d5:
            r0 = r5
        L_0x00d6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r5] = r0
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
            goto L_0x01c4
        L_0x00fa:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r1 == 0) goto L_0x014e
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.C11368t0.f28504a
            java.util.Locale r2 = java.util.Locale.getDefault()
            r6 = 2131952767(0x7f13047f, float:1.9541986E38)
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r7 = "getString(R.string.frequ…ales_default_error_title)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.carrefour.fid.android.core.io.ShoppingListThrowable r0 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r0
            java.lang.Throwable r0 = r0.getCause()
            boolean r8 = r0 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r8 == 0) goto L_0x0121
            r3 = r0
            com.carrefour.fid.android.shared.io.ResponseThrowable r3 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r3
        L_0x0121:
            if (r3 == 0) goto L_0x0128
            int r0 = r3.mo83810a()
            goto L_0x0129
        L_0x0128:
            r0 = r5
        L_0x0129:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r5] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r4)
            java.lang.String r2 = java.lang.String.format(r2, r6, r0)
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
            goto L_0x01c4
        L_0x014e:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketClosedStoreThrowable
            if (r1 == 0) goto L_0x0153
            goto L_0x0155
        L_0x0153:
            boolean r4 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketExpiredFacilityStoreIdThrowable
        L_0x0155:
            if (r4 == 0) goto L_0x0181
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
            com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment$handleErrorEvent$2 r0 = new com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment$handleErrorEvent$2
            r0.<init>(r15)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r15, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r15)
            goto L_0x01c4
        L_0x0181:
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r1 == 0) goto L_0x01bd
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r1 = r0
            com.carrefour.fid.android.shared.io.NetworkException r1 = (com.carrefour.fid.android.shared.p046io.NetworkException) r1
            java.lang.String r4 = r1.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r2)
            java.lang.Throwable r1 = r1.getCause()
            if (r1 != 0) goto L_0x0199
            r5 = r0
            goto L_0x019a
        L_0x0199:
            r5 = r1
        L_0x019a:
            r6 = 0
            r7 = 4
            r8 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r3, r4, r5, r6, r7, r8)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r2 = r15.getString(r0)
            java.lang.String r0 = "getString(R.string.gener…error_no_network_message)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r15
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x01c4
        L_0x01bd:
            boolean r0 = r0 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r0 == 0) goto L_0x01c4
            r15.mo67987i1()
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFrequentPurchasesFragment.mo67988j1(java.lang.Throwable):void");
    }

    /* renamed from: k1 */
    public final void mo67989k1(Throwable th) {
        C28935i iVar = C28935i.f70940a;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C28935i.m119705e(iVar, message, th, 0, 4, (Object) null);
        hideLoading();
        hideEmpty();
        mo67992n1();
        Drawable i = C17318d.m79726i(requireContext(), R.drawable.ds_il_empty_list);
        String string = getString(R.string.additional_order_checkout_error_message_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.addit…kout_error_message_title)");
        C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string, getString(R.string.additional_order_checkout_error_message_description), (String) null, (String) null, getString(R.string.general_try_again), MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
        C28500r.C28501a.m118423e(this, false, 1, (Object) null);
        C25956f.m111125c(mo67980c1(), (List) null, true, 1, (Object) null);
    }

    /* renamed from: l1 */
    public final void mo67990l1(BasketBuilderRecommendedProductsViewModel.C25932c cVar) {
        if (cVar instanceof BasketBuilderRecommendedProductsViewModel.C25932c.C25933a) {
            C28796c navigator = getNavigator();
            C19232h activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.carrefour.fid.android.navigation.BottomNavActivity");
            BasketBuilderRecommendedProductsViewModel.C25932c.C25933a aVar = (BasketBuilderRecommendedProductsViewModel.C25932c.C25933a) cVar;
            navigator.mo83838n(((BottomNavActivity) activity).mo83823k(), OfferProductModelKt.m159574W(aVar.mo75306f()), aVar.mo75304e());
        }
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36869x0) getBinding()).f91886c;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerFragmentBasketBuilder");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo67991m1(OfferProductModel offerProductModel) {
        FragmentExtensionKt.m58756g(this, offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen.PRODUCTS, (ProductListSettingsModel) null, 4, (Object) null);
        FragmentExtensionKt.m58759j(this, new BasketBuilderFrequentPurchasesFragment$handleOnMixingPressed$1(this));
        mo67983f1().sendIntent(new BasketBuilderRecommendedProductsViewModel.C25934d.C25937c(offerProductModel));
        mo67980c1().mo75385j();
    }

    /* renamed from: n1 */
    public final void mo67992n1() {
        ((C36869x0) getBinding()).f91885b.setVisibility(8);
    }

    /* renamed from: o0 */
    public final void mo67993o0(OfferProductModel offerProductModel, int i) {
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo67983f1().sendIntent(new BasketBuilderRecommendedProductsViewModel.C25934d.C25935a(offerProductModel));
            mo67980c1().mo75380e(offerProductModel, 1, i);
            return;
        }
        FragmentExtensionKt.m58759j(this, new BasketBuilderFrequentPurchasesFragment$handleAtcPressed$1(this, offerProductModel, p0, i));
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, offerProductModel, offerProductModel.mo121519p0(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: o1 */
    public final void mo67994o1(BasketBuilderRecommendedProductsViewModel.C25930b bVar) {
        C11079d2 d2Var;
        Throwable q = bVar.mo75296q();
        C11079d2 d2Var2 = null;
        if (q != null) {
            mo67989k1(q);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            hideErrorView();
        }
        if (bVar.isLoading()) {
            showLoading();
        }
        List<RecommendedProductsByDepartmentModel> o = bVar.mo75294o();
        if (o != null) {
            if (!o.isEmpty()) {
                mo67984g1(o);
            } else {
                mo67987i1();
            }
            d2Var2 = C11079d2.f28267a;
        }
        if (d2Var2 == null) {
            mo67992n1();
        }
        Throwable p = bVar.mo75295p();
        if (p != null) {
            mo67988j1(p);
        }
    }

    public void onDestroy() {
        BottomNavActivity bottomNavActivity;
        Bundle L1;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (!(bottomNavActivity == null || (L1 = bottomNavActivity.mo121105L1()) == null)) {
            L1.putParcelable("KEY_LIST_POSITION", (Parcelable) null);
        }
        super.onDestroy();
    }

    public void onPause() {
        BottomNavActivity bottomNavActivity;
        super.onPause();
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            RecyclerView recyclerView = ((C36869x0) getBinding()).f91885b;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.offerList");
            bottomNavActivity.mo121090D2(saveRecyclerViewState("KEY_LIST_POSITION", recyclerView));
        }
    }

    public void onResume() {
        super.onResume();
        mo67983f1().sendIntent(BasketBuilderRecommendedProductsViewModel.C25934d.C25938d.f63456b);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = ((C36869x0) getBinding()).f91885b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.offerList");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f58865w = C37373c.m153544b(recyclerView, requireContext, (C37390r) null, 2, (Object) null);
        mo67980c1().mo75379d();
        BasketBuilderRecommendedProductsViewModel f1 = mo67983f1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C23180x35468687(this, f1, (C11045c) null, this), 3, (Object) null);
        BasketBuilderRecommendedProductsViewModel f12 = mo67983f1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C23175x544ed650(this, f12, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: p1 */
    public void mo67995p1() {
        mo67983f1().sendIntent(BasketBuilderRecommendedProductsViewModel.C25934d.C25938d.f63456b);
    }

    /* renamed from: q1 */
    public final void mo67996q1(@C12579k C25956f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f58864v = fVar;
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo67995p1();
        return C11079d2.f28267a;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f58863g = cVar;
    }

    /* renamed from: z */
    public final void mo67998z(OfferProductModel offerProductModel) {
        mo67983f1().sendIntent(new BasketBuilderRecommendedProductsViewModel.C25934d.C25937c(offerProductModel));
        mo67980c1().mo75383h();
    }
}
