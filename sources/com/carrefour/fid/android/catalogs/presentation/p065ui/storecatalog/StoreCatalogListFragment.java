package com.carrefour.fid.android.catalogs.presentation.p065ui.storecatalog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.C20208s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39422m;
import com.carrefour.fid.android.catalogs.presentation.p065ui.storecatalog.adapter.C39601e;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39692e;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
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
@C11076d0(mo22515d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b>\u0010?J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\u0016\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0015H\u0002R0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006B"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/ui/storecatalog/StoreCatalogListFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/catalogs/databinding/m;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "", "storeId", "e1", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/e$b;", "state", "g1", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/e$a;", "event", "f1", "Z0", "", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "list", "b1", "k1", "j1", "catalog", "d1", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/l;", "X0", "()Lkotlin/jvm/functions/l;", "i1", "(Lkotlin/jvm/functions/l;)V", "onCatalogDetailClicked", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "g", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "W0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "h1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/StoreCatalogListViewModel;", "v", "Lkotlin/z;", "Y0", "()Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/StoreCatalogListViewModel;", "viewModel", "Lcom/carrefour/fid/android/catalogs/presentation/ui/storecatalog/adapter/e;", "w", "Lcom/carrefour/fid/android/catalogs/presentation/ui/storecatalog/adapter/e;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "x", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/s;", "y", "Landroidx/recyclerview/widget/s;", "snapHelper", "<init>", "()V", "z", "a", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nStoreCatalogListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreCatalogListFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/storecatalog/StoreCatalogListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n56#2,10:166\n168#3,7:176\n183#3,6:183\n1#4:189\n*S KotlinDebug\n*F\n+ 1 StoreCatalogListFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/storecatalog/StoreCatalogListFragment\n*L\n49#1:166,10\n57#1:176,7\n58#1:183,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.storecatalog.StoreCatalogListFragment */
public final class StoreCatalogListFragment extends C39596a<C39422m> {

    /* renamed from: X */
    public static final int f101138X = 8;
    @C12579k

    /* renamed from: Y */
    public static final String f101139Y = "store_id";
    @C12579k

    /* renamed from: z */
    public static final C39586a f101140z = new C39586a((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: f */
    public C11300l<? super Catalog, C11079d2> f101141f;
    @Inject

    /* renamed from: g */
    public AppEnvironment f101142g;
    @C12579k

    /* renamed from: v */
    public final C11677z f101143v;
    @C12580l

    /* renamed from: w */
    public C39601e f101144w;
    @C12580l

    /* renamed from: x */
    public LinearLayoutManager f101145x;
    @C12579k

    /* renamed from: y */
    public final C20208s f101146y = new C20208s();

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.storecatalog.StoreCatalogListFragment$a */
    public static final class C39586a {
        public /* synthetic */ C39586a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39586a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.storecatalog.StoreCatalogListFragment$b */
    public static final class C39587b extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ StoreCatalogListFragment f101148a;

        /* renamed from: b */
        public final /* synthetic */ List<Catalog> f101149b;

        public C39587b(StoreCatalogListFragment storeCatalogListFragment, List<Catalog> list) {
            this.f101148a = storeCatalogListFragment;
            this.f101149b = list;
        }

        /* renamed from: b */
        public void mo30662b(@C12579k RecyclerView recyclerView, int i, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.mo30662b(recyclerView, i, i2);
            LinearLayoutManager S0 = this.f101148a.f101145x;
            if (S0 != null) {
                i3 = S0.mo59434x2();
            } else {
                i3 = 0;
            }
            if (i3 >= 0 && i3 < this.f101149b.size()) {
                this.f101148a.mo130797d1(this.f101149b.get(i3));
            }
        }
    }

    public StoreCatalogListFragment() {
        super(C395851.f101147a);
        StoreCatalogListFragment$special$$inlined$viewModels$default$1 storeCatalogListFragment$special$$inlined$viewModels$default$1 = new StoreCatalogListFragment$special$$inlined$viewModels$default$1(this);
        this.f101143v = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(StoreCatalogListViewModel.class), new StoreCatalogListFragment$special$$inlined$viewModels$default$2(storeCatalogListFragment$special$$inlined$viewModels$default$1), new StoreCatalogListFragment$special$$inlined$viewModels$default$3(storeCatalogListFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: a1 */
    public static final void m161929a1(StoreCatalogListFragment storeCatalogListFragment, View view) {
        Intrinsics.checkNotNullParameter(storeCatalogListFragment, "this$0");
        storeCatalogListFragment.mo130794Y0().sendIntent(C39692e.C39700c.C39701a.f101332a);
        C19736g.m91827a(storeCatalogListFragment).mo58128V(C39364b.C39374j.catalogs_graph);
    }

    /* renamed from: c1 */
    public static final void m161930c1(StoreCatalogListFragment storeCatalogListFragment) {
        View R;
        LinearLayoutManager linearLayoutManager;
        List<Integer> list;
        Intrinsics.checkNotNullParameter(storeCatalogListFragment, "this$0");
        LinearLayoutManager linearLayoutManager2 = storeCatalogListFragment.f101145x;
        if (linearLayoutManager2 != null && (R = linearLayoutManager2.mo59384R(1)) != null && (linearLayoutManager = storeCatalogListFragment.f101145x) != null) {
            int[] c = storeCatalogListFragment.f101146y.mo60275c(linearLayoutManager, R);
            if (c != null) {
                Intrinsics.checkNotNullExpressionValue(c, "calculateDistanceToFinalSnap(it, view)");
                list = ArraysKt___ArraysKt.m39893iz(c);
            } else {
                list = null;
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            if (((Number) CollectionsKt___CollectionsKt.m40706w2(list)).intValue() != 0 || list.get(1).intValue() != 0) {
                ((C39422m) storeCatalogListFragment.getBinding()).f100878e.scrollBy(list.get(0).intValue(), list.get(1).intValue());
            }
        }
    }

    @C12579k
    /* renamed from: W0 */
    public final AppEnvironment mo130792W0() {
        AppEnvironment appEnvironment = this.f101142g;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    @C12580l
    /* renamed from: X0 */
    public final C11300l<Catalog, C11079d2> mo130793X0() {
        return this.f101141f;
    }

    /* renamed from: Y0 */
    public final StoreCatalogListViewModel mo130794Y0() {
        return (StoreCatalogListViewModel) this.f101143v.getValue();
    }

    /* renamed from: Z0 */
    public final void mo130795Z0() {
        this.f101145x = new LinearLayoutManager(getContext(), 0, false);
        C39422m mVar = (C39422m) getBinding();
        this.f101146y.mo60274b(mVar.f100878e);
        mVar.f100878e.setLayoutManager(this.f101145x);
        mVar.f100877d.setDisplayedChild(ViewFlipperPosition.FIRST_DISPLAY_ITEM.mo130811q());
        mVar.f100880g.setOnClickListener(new C39605d(this));
    }

    /* renamed from: b1 */
    public final void mo130796b1(List<Catalog> list) {
        C39601e eVar;
        ((C39422m) getBinding()).f100877d.setDisplayedChild(ViewFlipperPosition.FIRST_DISPLAY_ITEM.mo130811q());
        this.f101144w = new C39601e(list);
        ((C39422m) getBinding()).f100878e.setAdapter(this.f101144w);
        C39601e eVar2 = this.f101144w;
        if (eVar2 != null) {
            eVar2.mo130823r(new StoreCatalogListFragment$populateUIWithData$1(this));
        }
        if (list.size() > 1) {
            mo130797d1((Catalog) CollectionsKt___CollectionsKt.m40706w2(list));
            ((C39422m) getBinding()).f100878e.mo59479G1(1);
            ((C39422m) getBinding()).f100878e.post(new C39604c(this));
            ((C39422m) getBinding()).f100878e.mo59613r(new C39587b(this, list));
        } else if (list.size() == 1 && ((C39422m) getBinding()).f100878e.getAdapter() != null) {
            RecyclerView.Adapter adapter = ((C39422m) getBinding()).f100878e.getAdapter();
            Catalog catalog = null;
            if (adapter instanceof C39601e) {
                eVar = (C39601e) adapter;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                catalog = eVar.mo130818l(1);
            }
            if (catalog != null) {
                mo130797d1(catalog);
            }
        }
    }

    /* renamed from: d1 */
    public final void mo130797d1(Catalog catalog) {
        String str;
        ((C39422m) getBinding()).f100875b.setText(catalog.mo117075w());
        TextView textView = ((C39422m) getBinding()).f100876c;
        Context context = getContext();
        if (context != null) {
            int i = C39364b.C39383s.catalog_date_validity_formatter;
            C28932h.C28933a aVar = C28932h.f70914a;
            str = context.getString(i, new Object[]{aVar.mo84228S(catalog.mo117049F()), aVar.mo84228S(catalog.mo117048E())});
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: e1 */
    public final void mo130798e1(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "storeId");
        mo130794Y0().sendIntent(new C39692e.C39700c.C39702b(str));
    }

    /* renamed from: f1 */
    public final void mo130799f1(C39692e.C39693a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C39692e.C39693a.C39694a.f101324a)) {
            mo130803j1();
        }
    }

    /* renamed from: g1 */
    public final void mo130800g1(C39692e.C39695b bVar) {
        if (bVar instanceof C39692e.C39695b.C39696a) {
            List<Catalog> h = ((C39692e.C39695b.C39696a) bVar).mo131001h();
            if (h == null) {
                h = CollectionsKt__CollectionsKt.m40441E();
            }
            if (h.isEmpty()) {
                mo130804k1();
            } else {
                mo130796b1(h);
            }
        }
    }

    /* renamed from: h1 */
    public final void mo130801h1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f101142g = appEnvironment;
    }

    /* renamed from: i1 */
    public final void mo130802i1(@C12580l C11300l<? super Catalog, C11079d2> lVar) {
        this.f101141f = lVar;
    }

    /* renamed from: j1 */
    public final void mo130803j1() {
        ((C39422m) getBinding()).f100877d.setDisplayedChild(ViewFlipperPosition.CATALOGS_ERROR.mo130811q());
    }

    /* renamed from: k1 */
    public final void mo130804k1() {
        ((C39422m) getBinding()).f100877d.setDisplayedChild(ViewFlipperPosition.NOT_FOUND.mo130811q());
    }

    public void onResume() {
        String string;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("store_id")) != null) {
            mo130794Y0().sendIntent(new C39692e.C39700c.C39702b(string));
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        StoreCatalogListViewModel Y0 = mo130794Y0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new StoreCatalogListFragment$onViewCreated$$inlined$processState$1(this, Y0, (C11045c) null, this), 3, (Object) null);
        StoreCatalogListViewModel Y02 = mo130794Y0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new StoreCatalogListFragment$onViewCreated$$inlined$processEvent$1(this, Y02, (C11045c) null, this), 3, (Object) null);
        mo130795Z0();
    }
}
