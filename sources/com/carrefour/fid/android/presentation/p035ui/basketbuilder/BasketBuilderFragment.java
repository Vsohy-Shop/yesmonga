package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19758j0;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.databinding.C36849v0;
import com.carrefour.fid.android.design.components.widgets.TaglineComponent;
import com.carrefour.fid.android.presentation.models.BasketBuilderType;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.gms.common.internal.C40852x;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b:\u0010;J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ(\u0010\u0011\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000fJ\u001c\u0010\u0016\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0002J\b\u0010\u001f\u001a\u00020\u0007H\u0002J\f\u0010!\u001a\u00020\u0007*\u00020 H\u0002R\u001b\u0010'\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028BX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068BX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006>"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/v0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "", "position", "d1", "", "Lcom/carrefour/fid/android/presentation/models/OfferDepartmentModel;", "departments", "Lkotlin/Function1;", "listener", "a1", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "b1", "initHeader", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel$a;", "state", "c1", "Lcom/carrefour/fid/android/presentation/models/BasketBuilderType;", "basketBuilderType", "X0", "e1", "Y0", "Lcom/google/android/material/tabs/TabLayout;", "T0", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel;", "f", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/basketbuilder/d;", "g", "Landroidx/navigation/m;", "U0", "()Lcom/carrefour/fid/android/presentation/ui/basketbuilder/d;", "navArgs", "Lcom/google/android/material/tabs/TabLayout$f;", "v", "Lcom/google/android/material/tabs/TabLayout$f;", "onTabSelectedListener", "Landroidx/navigation/NavController;", "k", "()Landroidx/navigation/NavController;", "navController", "Landroidx/navigation/NavGraph;", "V0", "()Landroidx/navigation/NavGraph;", "navGraph", "<init>", "()V", "w", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketBuilderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBuilderFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n106#2,15:251\n42#3,3:266\n168#4,7:269\n262#5,2:276\n260#5:278\n262#5,2:279\n766#6:281\n857#6,2:282\n1855#6,2:284\n800#6,11:286\n1#7:297\n*S KotlinDebug\n*F\n+ 1 BasketBuilderFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderFragment\n*L\n54#1:251,15\n55#1:266,3\n88#1:269,7\n136#1:276,2\n194#1:278\n196#1:279,2\n198#1:281\n198#1:282,2\n198#1:284,2\n209#1:286,11\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment */
public final class BasketBuilderFragment extends C23227n<C36849v0> {
    @C12579k

    /* renamed from: w */
    public static final C23159a f58840w = new C23159a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f58841x = 8;
    @C12579k

    /* renamed from: y */
    public static final String f58842y = "BasketBuilderFragment";
    @C12579k

    /* renamed from: f */
    public final C11677z f58843f;
    @C12579k

    /* renamed from: g */
    public final C19766m f58844g = new C19766m(C11342l0.m43547d(C23213d.class), new BasketBuilderFragment$special$$inlined$navArgs$1(this));
    @C12580l

    /* renamed from: v */
    public TabLayout.C31610f f58845v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment$a */
    public static final class C23159a {
        public /* synthetic */ C23159a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final BasketBuilderFragment mo67963a() {
            return new BasketBuilderFragment();
        }

        public C23159a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment$b */
    public /* synthetic */ class C23160b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.presentation.models.BasketBuilderType[] r0 = com.carrefour.fid.android.presentation.models.BasketBuilderType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.models.BasketBuilderType r1 = com.carrefour.fid.android.presentation.models.BasketBuilderType.FREQUENT_PURCHASES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.models.BasketBuilderType r1 = com.carrefour.fid.android.presentation.models.BasketBuilderType.MY_LISTS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.presentation.models.BasketBuilderType r1 = com.carrefour.fid.android.presentation.models.BasketBuilderType.LAST_ORDER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.presentation.models.BasketBuilderType r1 = com.carrefour.fid.android.presentation.models.BasketBuilderType.SHOPPING_LIST     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFragment.C23160b.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment$c */
    public static final class C23161c implements TabLayout.C31610f {

        /* renamed from: a */
        public final /* synthetic */ BasketBuilderFragment f58847a;

        public C23161c(BasketBuilderFragment basketBuilderFragment) {
            this.f58847a = basketBuilderFragment;
        }

        /* renamed from: a */
        public void mo67964a(@C12579k TabLayout.C31615i iVar) {
            BasketBuilderType basketBuilderType;
            Intrinsics.checkNotNullParameter(iVar, "tab");
            int k = iVar.mo91427k();
            if (k == 1) {
                basketBuilderType = BasketBuilderType.MY_LISTS;
            } else if (k == 2) {
                basketBuilderType = BasketBuilderType.LAST_ORDER;
            } else if (k != 3) {
                basketBuilderType = BasketBuilderType.FREQUENT_PURCHASES;
            } else {
                basketBuilderType = BasketBuilderType.SHOPPING_LIST;
            }
            this.f58847a.mo67952W0().sendIntent(new BasketBuilderViewModel.C25945b.C25947b(basketBuilderType));
        }

        /* renamed from: b */
        public void mo67965b(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
        }

        /* renamed from: c */
        public void mo67966c(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
        }
    }

    @C11363r0({"SMAP\nBasketBuilderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBuilderFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderFragment$populateSecondaryTaglineFromOfferList$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment$d */
    public static final class C23162d extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView f58848a;

        /* renamed from: b */
        public final /* synthetic */ List<OfferModel> f58849b;

        /* renamed from: c */
        public final /* synthetic */ BasketBuilderFragment f58850c;

        /* renamed from: d */
        public final /* synthetic */ List<OfferDepartmentModel> f58851d;

        public C23162d(RecyclerView recyclerView, List<? extends OfferModel> list, BasketBuilderFragment basketBuilderFragment, List<OfferDepartmentModel> list2) {
            this.f58848a = recyclerView;
            this.f58849b = list;
            this.f58850c = basketBuilderFragment;
            this.f58851d = list2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.carrefour.fid.android.presentation.models.OfferModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.carrefour.fid.android.presentation.models.OfferModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.carrefour.fid.android.presentation.models.OfferModel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.carrefour.fid.android.presentation.models.OfferModel} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30662b(@org.jetbrains.annotations.C12579k androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
            /*
                r3 = this;
                java.lang.String r0 = "recyclerView"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                super.mo30662b(r4, r5, r6)
                androidx.recyclerview.widget.RecyclerView r4 = r3.f58848a
                androidx.recyclerview.widget.RecyclerView$o r4 = r4.getLayoutManager()
                boolean r5 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
                r6 = 0
                if (r5 == 0) goto L_0x0016
                androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
                goto L_0x0017
            L_0x0016:
                r4 = r6
            L_0x0017:
                if (r4 == 0) goto L_0x0022
                int r4 = r4.mo59426t2()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L_0x0023
            L_0x0022:
                r4 = r6
            L_0x0023:
                if (r4 == 0) goto L_0x005d
                java.util.List<com.carrefour.fid.android.presentation.models.OfferModel> r5 = r3.f58849b
                com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment r0 = r3.f58850c
                java.util.List<com.carrefour.fid.android.presentation.models.OfferDepartmentModel> r1 = r3.f58851d
                r4.intValue()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                int r4 = r4.intValue()
                int r4 = r4 + 1
                java.util.List r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40497E5(r5, r4)
                int r5 = r4.size()
                java.util.ListIterator r4 = r4.listIterator(r5)
            L_0x0042:
                boolean r5 = r4.hasPrevious()
                if (r5 == 0) goto L_0x0054
                java.lang.Object r5 = r4.previous()
                r2 = r5
                com.carrefour.fid.android.presentation.models.OfferModel r2 = (com.carrefour.fid.android.presentation.models.OfferModel) r2
                boolean r2 = r2 instanceof com.carrefour.fid.android.presentation.models.OfferDepartmentModel
                if (r2 == 0) goto L_0x0042
                r6 = r5
            L_0x0054:
                com.carrefour.fid.android.presentation.models.OfferModel r6 = (com.carrefour.fid.android.presentation.models.OfferModel) r6
                int r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40594Y2(r1, r6)
                r0.mo67958d1(r4)
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFragment.C23162d.mo30662b(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment$e */
    public static final class C23163e implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f58852a;

        public C23163e(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f58852a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f58852a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f58852a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public BasketBuilderFragment() {
        super(C231581.f58846a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new BasketBuilderFragment$special$$inlined$viewModels$default$2(new BasketBuilderFragment$special$$inlined$viewModels$default$1(this)));
        this.f58843f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BasketBuilderViewModel.class), new BasketBuilderFragment$special$$inlined$viewModels$default$3(b), new BasketBuilderFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new BasketBuilderFragment$special$$inlined$viewModels$default$5(this, b));
    }

    @C12579k
    @C11384m
    /* renamed from: Z0 */
    public static final BasketBuilderFragment m103774Z0() {
        return f58840w.mo67963a();
    }

    /* renamed from: T0 */
    public final void mo67949T0(TabLayout tabLayout) {
        TabLayout.C31610f fVar = this.f58845v;
        if (fVar != null) {
            tabLayout.mo91282J(fVar);
        }
        C23161c cVar = new C23161c(this);
        this.f58845v = cVar;
        tabLayout.mo91298d(cVar);
    }

    /* renamed from: U0 */
    public final C23213d mo67950U0() {
        return (C23213d) this.f58844g.getValue();
    }

    /* renamed from: V0 */
    public final NavGraph mo67951V0() {
        C19758j0 M;
        NavController k = mo67961k();
        if (k == null || (M = k.mo58111M()) == null) {
            return null;
        }
        return M.mo58438b(R.navigation.basket_builder_nested_graph);
    }

    /* renamed from: W0 */
    public final BasketBuilderViewModel mo67952W0() {
        return (BasketBuilderViewModel) this.f58843f.getValue();
    }

    /* renamed from: X0 */
    public final void mo67953X0(BasketBuilderType basketBuilderType) {
        int i;
        TaglineComponent taglineComponent = ((C36849v0) getBinding()).f91784d;
        Intrinsics.checkNotNullExpressionValue(taglineComponent, "binding.basketBuilderSecondaryTagline");
        taglineComponent.setVisibility(8);
        NavGraph V0 = mo67951V0();
        if (V0 != null) {
            int i2 = C23160b.$EnumSwitchMapping$0[basketBuilderType.ordinal()];
            if (i2 == 1) {
                TabLayout.C31615i z = ((C36849v0) getBinding()).f91785e.mo91367z(BasketBuilderType.FREQUENT_PURCHASES.ordinal());
                if (z != null) {
                    z.mo91434r();
                }
                i = R.id.frequentPurchaseFragment;
            } else if (i2 == 2) {
                TabLayout.C31615i z2 = ((C36849v0) getBinding()).f91785e.mo91367z(BasketBuilderType.MY_LISTS.ordinal());
                if (z2 != null) {
                    z2.mo91434r();
                }
                i = R.id.myListsFragment;
            } else if (i2 == 3) {
                TabLayout.C31615i z3 = ((C36849v0) getBinding()).f91785e.mo91367z(BasketBuilderType.LAST_ORDER.ordinal());
                if (z3 != null) {
                    z3.mo91434r();
                }
                i = R.id.lastOrderFragment;
            } else if (i2 == 4) {
                TabLayout.C31615i z4 = ((C36849v0) getBinding()).f91785e.mo91367z(BasketBuilderType.SHOPPING_LIST.ordinal());
                if (z4 != null) {
                    z4.mo91434r();
                }
                i = R.id.shoppingListFragment;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            V0.mo58283V0(i);
            NavController k = mo67961k();
            if (k != null) {
                k.mo58112M0(V0);
            }
        }
    }

    /* renamed from: Y0 */
    public final void mo67954Y0() {
        ((C36849v0) getBinding()).f91785e.setVisibility(8);
    }

    /* renamed from: a1 */
    public final void mo67955a1(@C12579k List<OfferDepartmentModel> list, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(list, "departments");
        Intrinsics.checkNotNullParameter(lVar, C40852x.C40853a.f103958a);
        TaglineComponent taglineComponent = ((C36849v0) getBinding()).f91784d;
        Intrinsics.checkNotNullExpressionValue(taglineComponent, "populateSecondaryTagline$lambda$6");
        if (taglineComponent.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            taglineComponent.mo91280H();
            taglineComponent.setVisibility(0);
            taglineComponent.setTriggerListener(false);
            ArrayList<OfferDepartmentModel> arrayList = new ArrayList<>();
            for (Object next : list) {
                String Q = ((OfferDepartmentModel) next).mo121689Q();
                if (Q == null || Q.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    arrayList.add(next);
                }
            }
            for (OfferDepartmentModel Q2 : arrayList) {
                taglineComponent.mo91299e(taglineComponent.mo91277E().mo91419D(Q2.mo121689Q()));
            }
            taglineComponent.setTabSelectedPositionListener(lVar);
            taglineComponent.setTriggerListener(true);
        }
    }

    /* renamed from: b1 */
    public final void mo67956b1(@C12579k List<? extends OfferModel> list, @C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(list, "offerList");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof OfferDepartmentModel) {
                arrayList.add(next);
            }
        }
        mo67955a1(arrayList, new BasketBuilderFragment$populateSecondaryTaglineFromOfferList$1(arrayList, recyclerView, list));
        recyclerView.mo59613r(new C23162d(recyclerView, list, this, arrayList));
    }

    /* renamed from: c1 */
    public final void mo67957c1(BasketBuilderViewModel.C25943a aVar) {
        if (aVar.mo75355k()) {
            mo67959e1();
        } else {
            mo67954Y0();
        }
        mo67953X0(aVar.mo75354j());
    }

    /* renamed from: d1 */
    public final void mo67958d1(int i) {
        TaglineComponent taglineComponent = ((C36849v0) getBinding()).f91784d;
        taglineComponent.setTriggerListener(false);
        TabLayout.C31615i z = taglineComponent.mo91367z(i);
        if (z != null) {
            z.mo91434r();
        }
        taglineComponent.setTriggerListener(true);
    }

    /* renamed from: e1 */
    public final void mo67959e1() {
        TabLayout tabLayout = ((C36849v0) getBinding()).f91785e;
        if (tabLayout.getVisibility() != 0) {
            tabLayout.setVisibility(0);
            tabLayout.mo91280H();
            tabLayout.mo91299e(tabLayout.mo91277E().mo91418C(R.string.basket_builder_menu_filter_frequent_purchases));
            tabLayout.mo91299e(tabLayout.mo91277E().mo91418C(R.string.basket_builder_menu_filter_my_lists));
            tabLayout.mo91299e(tabLayout.mo91277E().mo91418C(R.string.basket_builder_menu_filter_last_order));
            Intrinsics.checkNotNullExpressionValue(tabLayout, "showFilters$lambda$2");
            mo67949T0(tabLayout);
        }
    }

    public final void initHeader() {
        C36849v0 v0Var = (C36849v0) getBinding();
        v0Var.f91782b.setContent(C8553b.m31049c(1796805548, true, new BasketBuilderFragment$initHeader$1$1(this, v0Var)));
    }

    /* renamed from: k */
    public final NavController mo67961k() {
        NavHostFragment navHostFragment;
        Fragment r0 = getChildFragmentManager().mo56900r0(R.id.fragment_basket_builder_container);
        if (r0 instanceof NavHostFragment) {
            navHostFragment = (NavHostFragment) r0;
        } else {
            navHostFragment = null;
        }
        if (navHostFragment != null) {
            return navHostFragment.mo58400k();
        }
        return null;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118697g(requireActivity);
        initHeader();
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C23163e(new BasketBuilderFragment$onViewCreated$1(this)));
        BasketBuilderViewModel W0 = mo67952W0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new BasketBuilderFragment$onViewCreated$$inlined$processState$1(this, W0, (C11045c) null, this), 3, (Object) null);
    }
}
