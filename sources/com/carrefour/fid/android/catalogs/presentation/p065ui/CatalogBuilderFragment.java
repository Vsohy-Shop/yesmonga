package com.carrefour.fid.android.catalogs.presentation.p065ui;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.view.ViewKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.core.type.CatalogsType;
import com.carrefour.fid.android.catalogs.databinding.C39416g;
import com.carrefour.fid.android.catalogs.presentation.p065ui.C39482c;
import com.carrefour.fid.android.catalogs.presentation.p065ui.adapter.C39474b;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d;
import com.carrefour.fid.android.design.components.widgets.catalogs.CriteoCatalogBannerComponent;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.RecyclerViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.C10164b;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bN\u0010OJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\tH\u0002J0\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u001e\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0002J\b\u0010\"\u001a\u00020\u0007H\u0002J\u001a\u0010$\u001a\u00020\u0007*\u00020#2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0002R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010:R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/ui/CatalogBuilderFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/catalogs/databinding/g;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "", "isStoreSectionAvailable", "e1", "initUi", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/d$b;", "state", "h1", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/d$a;", "event", "g1", "loading", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "c1", "isWithStore", "", "Lcom/carrefour/fid/android/catalogs/presentation/models/b;", "catalogList", "Lcom/carrefour/fid/android/catalogs/core/type/CatalogsType;", "catalogTabList", "a1", "", "position", "i1", "taglineVisible", "d1", "k1", "Lcom/google/android/material/tabs/TabLayout;", "X0", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Lcom/carrefour/fid/android/catalogs/presentation/ui/adapter/b;", "v", "Lcom/carrefour/fid/android/catalogs/presentation/ui/adapter/b;", "catalogListAdapter", "w", "Z", "isCriteoViewTracked", "Lcom/carrefour/fid/android/catalogs/presentation/ui/b;", "x", "Landroidx/navigation/m;", "Y0", "()Lcom/carrefour/fid/android/catalogs/presentation/ui/b;", "args", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogsBuilderViewModel;", "y", "Lkotlin/z;", "Z0", "()Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogsBuilderViewModel;", "viewModel", "z", "isUserScrolling", "Lcom/google/android/material/tabs/TabLayout$f;", "X", "Lcom/google/android/material/tabs/TabLayout$f;", "onTabSelectedListener", "<init>", "()V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCatalogBuilderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogBuilderFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/CatalogBuilderFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n42#2,3:244\n56#3,10:247\n168#4,7:257\n183#4,6:264\n262#5,2:270\n262#5,2:272\n262#5,2:274\n262#5,2:276\n1747#6,3:278\n1855#6,2:281\n1#7:283\n*S KotlinDebug\n*F\n+ 1 CatalogBuilderFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/CatalogBuilderFragment\n*L\n52#1:244,3\n54#1:247,10\n64#1:257,7\n65#1:264,6\n167#1:270,2\n170#1:272,2\n173#1:274,2\n176#1:276,2\n185#1:278,3\n208#1:281,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.CatalogBuilderFragment */
public final class CatalogBuilderFragment extends C39542f<C39416g> {

    /* renamed from: Y */
    public static final int f100948Y = 8;
    @C12580l

    /* renamed from: X */
    public TabLayout.C31610f f100949X;
    @Inject

    /* renamed from: f */
    public C28796c f100950f;
    @Inject

    /* renamed from: g */
    public C28936j f100951g;
    @C12580l

    /* renamed from: v */
    public C39474b f100952v;

    /* renamed from: w */
    public boolean f100953w;
    @C12579k

    /* renamed from: x */
    public final C19766m f100954x = new C19766m(C11342l0.m43547d(C39480b.class), new CatalogBuilderFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: y */
    public final C11677z f100955y;

    /* renamed from: z */
    public boolean f100956z;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.CatalogBuilderFragment$a */
    public static final class C39458a implements TabLayout.C31610f {

        /* renamed from: a */
        public final /* synthetic */ CatalogBuilderFragment f100958a;

        /* renamed from: b */
        public final /* synthetic */ List<CatalogsType> f100959b;

        public C39458a(CatalogBuilderFragment catalogBuilderFragment, List<? extends CatalogsType> list) {
            this.f100958a = catalogBuilderFragment;
            this.f100959b = list;
        }

        /* renamed from: a */
        public void mo67964a(@C12579k TabLayout.C31615i iVar) {
            CatalogsType catalogsType;
            Intrinsics.checkNotNullParameter(iVar, "tab");
            if (!this.f100958a.f100956z) {
                List<CatalogsType> list = this.f100959b;
                int k = iVar.mo91427k();
                if (k < 0 || k > CollectionsKt__CollectionsKt.m40443G(list)) {
                    catalogsType = CatalogsType.HYPERMARCHE;
                } else {
                    catalogsType = list.get(k);
                }
                this.f100958a.mo130567i1(catalogsType.mo130271q());
            }
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

    @C11363r0({"SMAP\nCatalogBuilderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogBuilderFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/CatalogBuilderFragment$initUi$1$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n45#2:244\n1#3:245\n*S KotlinDebug\n*F\n+ 1 CatalogBuilderFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/CatalogBuilderFragment$initUi$1$1\n*L\n113#1:244\n*E\n"})
    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.CatalogBuilderFragment$b */
    public static final class C39459b extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ CatalogBuilderFragment f100960a;

        /* renamed from: b */
        public final /* synthetic */ LinearLayoutManager f100961b;

        /* renamed from: c */
        public final /* synthetic */ C39416g f100962c;

        public C39459b(CatalogBuilderFragment catalogBuilderFragment, LinearLayoutManager linearLayoutManager, C39416g gVar) {
            this.f100960a = catalogBuilderFragment;
            this.f100961b = linearLayoutManager;
            this.f100962c = gVar;
        }

        /* renamed from: a */
        public void mo30661a(@C12579k RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.mo30661a(recyclerView, i);
            if (i == 0) {
                this.f100960a.f100956z = false;
            } else if (i == 1) {
                this.f100960a.f100956z = true;
            }
        }

        /* renamed from: b */
        public void mo30662b(@C12579k RecyclerView recyclerView, int i, int i2) {
            int i3;
            View view;
            boolean z;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.mo30662b(recyclerView, i, i2);
            if (this.f100960a.f100956z) {
                if (i2 > 0) {
                    i3 = this.f100961b.mo59435y2();
                } else {
                    i3 = this.f100961b.mo59434x2();
                }
                TabLayout tabLayout = this.f100962c.f100818b;
                tabLayout.mo91286N(tabLayout.mo91367z(i3));
                RecyclerView recyclerView2 = this.f100962c.f100821e;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "catalogsList");
                RecyclerView recyclerView3 = this.f100962c.f100821e;
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "catalogsList");
                View h = RecyclerViewKt.m118869h(recyclerView3, recyclerView2.getChildCount() - 1);
                if (h != null) {
                    Iterator<View> it = ViewKt.m81838i(h).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            view = null;
                            break;
                        }
                        view = it.next();
                        if (view.getId() == C39364b.C39374j.criteo_component) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    if (view instanceof CriteoCatalogBannerComponent) {
                        this.f100960a.mo130569k1();
                    }
                }
            }
        }
    }

    public CatalogBuilderFragment() {
        super(C394571.f100957a);
        CatalogBuilderFragment$special$$inlined$viewModels$default$1 catalogBuilderFragment$special$$inlined$viewModels$default$1 = new CatalogBuilderFragment$special$$inlined$viewModels$default$1(this);
        this.f100955y = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CatalogsBuilderViewModel.class), new CatalogBuilderFragment$special$$inlined$viewModels$default$2(catalogBuilderFragment$special$$inlined$viewModels$default$1), new CatalogBuilderFragment$special$$inlined$viewModels$default$3(catalogBuilderFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m161684b1(CatalogBuilderFragment catalogBuilderFragment, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        catalogBuilderFragment.mo130559a1(z, list, list2);
    }

    /* renamed from: f1 */
    public static /* synthetic */ void m161685f1(CatalogBuilderFragment catalogBuilderFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        catalogBuilderFragment.mo130562e1(z);
    }

    /* renamed from: j1 */
    public static final void m161686j1(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        Intrinsics.checkNotNullParameter(recyclerView, "$this_apply");
        RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            linearLayoutManager.mo59401d3(i, 0);
        }
    }

    /* renamed from: X0 */
    public final void mo130556X0(TabLayout tabLayout, List<? extends CatalogsType> list) {
        TabLayout.C31610f fVar = this.f100949X;
        if (fVar != null) {
            tabLayout.mo91282J(fVar);
        }
        C39458a aVar = new C39458a(this, list);
        this.f100949X = aVar;
        tabLayout.mo91298d(aVar);
    }

    /* renamed from: Y0 */
    public final C39480b mo130557Y0() {
        return (C39480b) this.f100954x.getValue();
    }

    /* renamed from: Z0 */
    public final CatalogsBuilderViewModel mo130558Z0() {
        return (CatalogsBuilderViewModel) this.f100955y.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo130559a1(boolean r5, java.util.List<? extends com.carrefour.fid.android.catalogs.presentation.models.C39449b> r6, java.util.List<? extends com.carrefour.fid.android.catalogs.core.type.CatalogsType> r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x002f
            r2 = r6
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0016
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0016
        L_0x0014:
            r2 = r1
            goto L_0x002b
        L_0x0016:
            java.util.Iterator r2 = r2.iterator()
        L_0x001a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0014
            java.lang.Object r3 = r2.next()
            com.carrefour.fid.android.catalogs.presentation.models.b r3 = (com.carrefour.fid.android.catalogs.presentation.models.C39449b) r3
            boolean r3 = r3 instanceof com.carrefour.fid.android.catalogs.presentation.models.C39456i
            if (r3 == 0) goto L_0x001a
            r2 = r0
        L_0x002b:
            if (r2 != r0) goto L_0x002f
            r2 = r0
            goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            r5 = r5 ^ r0
            r4.mo130561d1(r5, r7)
            com.carrefour.fid.android.catalogs.presentation.ui.adapter.b r5 = r4.f100952v
            if (r5 != 0) goto L_0x0039
            goto L_0x0042
        L_0x0039:
            if (r6 != 0) goto L_0x003f
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x003f:
            r5.setList(r6)
        L_0x0042:
            r4.mo130562e1(r2)
            r4.mo130567i1(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.CatalogBuilderFragment.mo130559a1(boolean, java.util.List, java.util.List):void");
    }

    /* renamed from: c1 */
    public final ShimmerFrameLayout mo130560c1(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout;
        if (z) {
            RecyclerView recyclerView = ((C39416g) getBinding()).f100821e;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.catalogsList");
            recyclerView.setVisibility(8);
            shimmerFrameLayout = ((C39416g) getBinding()).f100822f;
            shimmerFrameLayout.mo36996g();
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "handleLoading$lambda$3");
            shimmerFrameLayout.setVisibility(0);
        } else {
            RecyclerView recyclerView2 = ((C39416g) getBinding()).f100821e;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.catalogsList");
            recyclerView2.setVisibility(0);
            shimmerFrameLayout = ((C39416g) getBinding()).f100822f;
            shimmerFrameLayout.mo36997h();
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "handleLoading$lambda$4");
            shimmerFrameLayout.setVisibility(8);
        }
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "if (loading) {\n        b…e = false\n        }\n    }");
        return shimmerFrameLayout;
    }

    /* renamed from: d1 */
    public final void mo130561d1(boolean z, List<? extends CatalogsType> list) {
        int i;
        TabLayout tabLayout = ((C39416g) getBinding()).f100818b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tabLayout.setVisibility(i);
        if (z) {
            tabLayout.mo91280H();
            for (CatalogsType w : list) {
                tabLayout.mo91299e(tabLayout.mo91277E().mo91418C(w.mo130273w()));
            }
            Intrinsics.checkNotNullExpressionValue(tabLayout, "handleTaglineVisibility$lambda$9");
            mo130556X0(tabLayout, list);
        }
    }

    /* renamed from: e1 */
    public final void mo130562e1(boolean z) {
        C39416g gVar = (C39416g) getBinding();
        gVar.f100819c.setContent(C8553b.m31049c(-878024612, true, new CatalogBuilderFragment$initHeader$1$1(z, gVar, this)));
    }

    /* renamed from: g1 */
    public final void mo130563g1(C39675d.C39676a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C39675d.C39676a.C39677a.f101298a)) {
            FragmentKt.m118823k(this, C39482c.C39485c.m161746d(C39482c.f100988a, false, 1, (Object) null));
        } else if (aVar instanceof C39675d.C39676a.C39678b) {
            mo130558Z0().sendIntent(C39675d.C39686c.C39687a.f101314a);
            getNavigator().mo83837m(this, ((C39675d.C39676a.C39678b) aVar).mo130966d());
        } else if (aVar instanceof C39675d.C39676a.C39679c) {
            FragmentKt.m118823k(this, C39482c.f100988a.mo130629b(((C39675d.C39676a.C39679c) aVar).mo130972d()));
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C39675d.C39676a.C39680d.f101304a)) {
            FragmentKt.m118823k(this, C39482c.f100988a.mo130628a());
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f100951g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f100950f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo130566h1(C39675d.C39681b bVar) {
        boolean z;
        if (bVar instanceof C39675d.C39681b.C39685d) {
            mo130560c1(((C39675d.C39681b.C39685d) bVar).isLoading());
        } else if (bVar instanceof C39675d.C39681b.C39682a) {
            C39675d.C39681b.C39682a aVar = (C39675d.C39681b.C39682a) bVar;
            if (aVar.mo130984l() != null) {
                z = true;
            } else {
                z = false;
            }
            mo130559a1(z, aVar.mo130982j(), aVar.mo130983k());
        }
    }

    /* renamed from: i1 */
    public final void mo130567i1(int i) {
        RecyclerView recyclerView = ((C39416g) getBinding()).f100821e;
        recyclerView.post(new C39470a(recyclerView, i));
    }

    public final void initUi() {
        this.f100953w = false;
        getFragmentUtil().mo32776b(this);
        this.f100952v = new C39474b();
        C39416g gVar = (C39416g) getBinding();
        gVar.f100821e.setAdapter(this.f100952v);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        gVar.f100821e.setLayoutManager(linearLayoutManager);
        gVar.f100821e.mo59613r(new C39459b(this, linearLayoutManager, gVar));
    }

    /* renamed from: k1 */
    public final void mo130569k1() {
        if (!this.f100953w) {
            this.f100953w = true;
            mo130558Z0().sendIntent(C39675d.C39686c.C39688b.f101316a);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        m161685f1(this, false, 1, (Object) null);
        initUi();
        mo130558Z0().sendIntent(new C39675d.C39686c.C39689c(mo130557Y0().mo130608e()));
        CatalogsBuilderViewModel Z0 = mo130558Z0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CatalogBuilderFragment$onViewCreated$$inlined$processState$1(this, Z0, (C11045c) null, this), 3, (Object) null);
        CatalogsBuilderViewModel Z02 = mo130558Z0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new CatalogBuilderFragment$onViewCreated$$inlined$processEvent$1(this, Z02, (C11045c) null, this), 3, (Object) null);
        mo130558Z0().sendIntent(C39675d.C39686c.C39691e.f101322a);
        mo130558Z0().sendIntent(C39675d.C39686c.C39690d.f101320a);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f100951g = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f100950f = cVar;
    }
}
