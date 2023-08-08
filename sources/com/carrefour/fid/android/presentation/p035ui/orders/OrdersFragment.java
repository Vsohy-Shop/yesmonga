package com.carrefour.fid.android.presentation.p035ui.orders;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.databinding.C36821s2;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.OrdersOfflineFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.OrdersViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment.OrderOnlineFragment;
import com.carrefour.fid.android.shared.base.BaseViewPagerAdapter;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.tabs.C31624d;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0014\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/OrdersFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/s2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "initHeader", "Lcom/carrefour/fid/android/presentation/viewmodels/order/OrdersViewModel$a;", "uiState", "W0", "Lcom/carrefour/fid/android/presentation/viewmodels/order/OrdersViewModel;", "f", "Lkotlin/z;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/OrdersViewModel;", "viewModel", "com/carrefour/fid/android/presentation/ui/orders/OrdersFragment$a", "g", "Lcom/carrefour/fid/android/presentation/ui/orders/OrdersFragment$a;", "onPageChangeCallback", "Lcom/google/android/material/tabs/d;", "v", "Lcom/google/android/material/tabs/d;", "tabLayoutMediator", "Lcom/carrefour/fid/android/shared/base/BaseViewPagerAdapter;", "w", "U0", "()Lcom/carrefour/fid/android/shared/base/BaseViewPagerAdapter;", "viewPagerAdapter", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/OrdersFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n48#2,9:129\n168#3,7:138\n1#4:145\n*S KotlinDebug\n*F\n+ 1 OrdersFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/OrdersFragment\n*L\n36#1:129,9\n84#1:138,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.OrdersFragment */
public final class OrdersFragment extends C24674a<C36821s2> {

    /* renamed from: x */
    public static final int f61258x = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f61259f;
    @C12579k

    /* renamed from: g */
    public final C24665a f61260g = new C24665a(this);
    @C12580l

    /* renamed from: v */
    public C31624d f61261v;
    @C12579k

    /* renamed from: w */
    public final C11677z f61262w = C10864b0.m38748c(new OrdersFragment$viewPagerAdapter$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.OrdersFragment$a */
    public static final class C24665a extends ViewPager2.C20817j {

        /* renamed from: a */
        public final /* synthetic */ OrdersFragment f61264a;

        public C24665a(OrdersFragment ordersFragment) {
            this.f61264a = ordersFragment;
        }

        /* renamed from: c */
        public void mo30667c(int i) {
            this.f61264a.mo72074T0().sendIntent(new OrdersViewModel.C26640b.C26641a(i));
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.OrdersFragment$b */
    public static final class C24666b implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f61265a;

        public C24666b(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f61265a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f61265a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f61265a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public OrdersFragment() {
        super(C246641.f61263a);
        C11677z c = C10864b0.m38748c(new OrdersFragment$special$$inlined$hiltNavGraphViewModels$1(this, R.id.orders_graph));
        this.f61259f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(OrdersViewModel.class), new OrdersFragment$special$$inlined$hiltNavGraphViewModels$2(c, (C11510n) null), new OrdersFragment$special$$inlined$hiltNavGraphViewModels$3(this, c, (C11510n) null));
    }

    /* renamed from: V0 */
    public static final void m107741V0(OrdersFragment ordersFragment, TabLayout.C31615i iVar, int i) {
        Intrinsics.checkNotNullParameter(ordersFragment, "this$0");
        Intrinsics.checkNotNullParameter(iVar, "tab");
        RecyclerView.Adapter adapter = ((C36821s2) ordersFragment.getBinding()).f91627e.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.shared.base.BaseViewPagerAdapter");
        iVar.mo91419D(((BaseViewPagerAdapter) adapter).mo83348F()[i]);
    }

    /* renamed from: T0 */
    public final OrdersViewModel mo72074T0() {
        return (OrdersViewModel) this.f61259f.getValue();
    }

    /* renamed from: U0 */
    public final BaseViewPagerAdapter mo72075U0() {
        return (BaseViewPagerAdapter) this.f61262w.getValue();
    }

    /* renamed from: W0 */
    public final void mo72076W0(OrdersViewModel.C26639a aVar) {
        boolean z;
        Integer h = aVar.mo77408h();
        if (h != null) {
            if (((C36821s2) getBinding()).f91627e.getCurrentItem() != h.intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                h = null;
            }
            if (h != null) {
                ((C36821s2) getBinding()).f91627e.setCurrentItem(h.intValue(), false);
            }
        }
    }

    public final void initHeader() {
        ((C36821s2) getBinding()).f91625c.setContent(C8553b.m31049c(-1487885960, true, new OrdersFragment$initHeader$1(this)));
    }

    public void onDestroyView() {
        C31624d dVar = this.f61261v;
        if (dVar != null) {
            dVar.mo91447b();
        }
        ((C36821s2) getBinding()).f91627e.setAdapter((RecyclerView.Adapter) null);
        ((C36821s2) getBinding()).f91627e.mo62493w(this.f61260g);
        cleanBinding();
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
        initHeader();
        ViewPager2 viewPager2 = ((C36821s2) getBinding()).f91627e;
        viewPager2.setSaveEnabled(false);
        if (viewPager2.getAdapter() == null) {
            BaseViewPagerAdapter U0 = mo72075U0();
            U0.mo83350H(CollectionsKt__CollectionsKt.m40448L(new OrderOnlineFragment(), new OrdersOfflineFragment()));
            viewPager2.setAdapter(U0);
        } else {
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        C31624d dVar = new C31624d(((C36821s2) getBinding()).f91628f, ((C36821s2) getBinding()).f91627e, new C24679f(this));
        this.f61261v = dVar;
        dVar.mo91446a();
        ((C36821s2) getBinding()).f91627e.mo62469n(this.f61260g);
        OrdersViewModel T0 = mo72074T0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new OrdersFragment$onViewCreated$$inlined$processState$1(this, T0, (C11045c) null, this), 3, (Object) null);
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner2, new C24666b(new OrdersFragment$onViewCreated$4(this)));
    }
}
