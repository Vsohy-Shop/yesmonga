package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36731j2;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.decoration.C38367a;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType;
import com.carrefour.fid.android.presentation.viewmodels.order.online.ListProductsOrderedViewModel;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/ListProductsOrderedFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/j2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel$b;", "uiState", "V0", "Lcom/carrefour/fid/android/presentation/ui/orders/online/d;", "f", "Landroidx/navigation/m;", "S0", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/d;", "listProductsOrderedFragmentArgs", "", "g", "Lkotlin/z;", "T0", "()Ljava/lang/String;", "orderId", "Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailType;", "v", "R0", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/model/OrdersOnlineDetailType;", "detailType", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel;", "w", "U0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/ListProductsOrderedViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nListProductsOrderedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListProductsOrderedFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/ListProductsOrderedFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 5 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,77:1\n42#2,3:78\n106#3,15:81\n75#4,2:96\n168#5,7:98\n*S KotlinDebug\n*F\n+ 1 ListProductsOrderedFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/ListProductsOrderedFragment\n*L\n30#1:78,3\n34#1:81,15\n66#1:96,2\n69#1:98,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.ListProductsOrderedFragment */
public final class ListProductsOrderedFragment extends C24844a<C36731j2> {

    /* renamed from: x */
    public static final int f61539x = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f61540f = new C19766m(C11342l0.m43547d(C25191d.class), new ListProductsOrderedFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f61541g = C10864b0.m38748c(new ListProductsOrderedFragment$orderId$2(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f61542v = C10864b0.m38748c(new ListProductsOrderedFragment$detailType$2(this));
    @C12579k

    /* renamed from: w */
    public final C11677z f61543w;

    public ListProductsOrderedFragment() {
        super(C248041.f61544a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24812x1cdf8e83(new C24811x1cdf8e82(this)));
        this.f61543w = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ListProductsOrderedViewModel.class), new C24813x1cdf8e84(b), new C24814x1cdf8e85((C11289a) null, b), new C24815x1cdf8e86(this, b));
    }

    /* renamed from: R0 */
    public final OrdersOnlineDetailType mo72487R0() {
        return (OrdersOnlineDetailType) this.f61542v.getValue();
    }

    /* renamed from: S0 */
    public final C25191d mo72488S0() {
        return (C25191d) this.f61540f.getValue();
    }

    /* renamed from: T0 */
    public final String mo72489T0() {
        return (String) this.f61541g.getValue();
    }

    /* renamed from: U0 */
    public final ListProductsOrderedViewModel mo72490U0() {
        return (ListProductsOrderedViewModel) this.f61543w.getValue();
    }

    /* renamed from: V0 */
    public final void mo72491V0(@C12579k ListProductsOrderedViewModel.C26699b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "uiState");
        RecyclerView.Adapter adapter = ((C36731j2) getBinding()).f91059b.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsAdapter");
        ((C24881i) adapter).mo72633m(bVar.mo77578i());
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            ToolBarDefaultView M1 = bottomNavActivity.mo121107M1();
            String string = bottomNavActivity.getString(R.string.nhp_label_order);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.nhp_label_order)");
            ToolBarDefaultView.m158942o0(M1, string, bottomNavActivity.getString(R.string.order_txt_order_number, new Object[]{mo72488S0().mo73207g()}), 0, 4, (Object) null);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
        RecyclerView recyclerView = ((C36731j2) getBinding()).f91059b;
        recyclerView.setAdapter(new C24881i((C24881i.C24882a) null, (List) null, 3, (DefaultConstructorMarker) null));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.mo59589n(new C38367a(1, true, 0, 4, (DefaultConstructorMarker) null));
        if (mo72487R0() == OrdersOnlineDetailType.MISSING_REPLACEMENT_PRODUCTS) {
            ((C36731j2) getBinding()).f91060c.setVisibility(8);
        } else {
            Button button = ((C36731j2) getBinding()).f91060c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.submitOrderAgain");
            C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(button), new ListProductsOrderedFragment$onViewCreated$3(this, (C11045c<? super ListProductsOrderedFragment$onViewCreated$3>) null));
            C19499w viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
            new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24805xfdc08298((C11045c) null));
        }
        ListProductsOrderedViewModel U0 = mo72490U0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C24806x5d330143(this, U0, (C11045c) null, this), 3, (Object) null);
        mo72490U0().sendIntent(new ListProductsOrderedViewModel.C26701c.C26702a(mo72489T0(), mo72487R0()));
    }
}
