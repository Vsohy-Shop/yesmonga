package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36699g0;
import com.carrefour.fid.android.design.components.extension.ButtonKt;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderBottomSheetViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26836a;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
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
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0002R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderBottomSheetFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/g0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/a$b;", "state", "b1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/a$a;", "event", "a1", "", "isLoading", "Z0", "", "throwable", "Y0", "", "message", "V0", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderBottomSheetViewModel;", "f", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderBottomSheetViewModel;", "viewModel", "", "g", "W0", "()Ljava/lang/String;", "orderId", "<init>", "()V", "v", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAdditionalOrderBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderBottomSheetFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderBottomSheetFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,140:1\n106#2,15:141\n168#3,7:156\n183#3,6:163\n75#4,2:169\n260#5:171\n*S KotlinDebug\n*F\n+ 1 AdditionalOrderBottomSheetFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/AdditionalOrderBottomSheetFragment\n*L\n48#1:141,15\n55#1:156,7\n56#1:163,6\n61#1:169,2\n102#1:171\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment */
public final class AdditionalOrderBottomSheetFragment extends C25184n<C36699g0> {
    @C12579k

    /* renamed from: X */
    public static final String f61708X = "orderIdkEY";
    @C12579k

    /* renamed from: v */
    public static final C24904a f61709v = new C24904a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f61710w = 8;
    @C12579k

    /* renamed from: x */
    public static final String f61711x = "onDismissAdditionalOrder";
    @C12579k

    /* renamed from: y */
    public static final String f61712y = "isFromAdditionalOrder";
    @C12579k

    /* renamed from: z */
    public static final String f61713z = "additionalOrderEligibleExpired";
    @C12579k

    /* renamed from: f */
    public final C11677z f61714f;
    @C12579k

    /* renamed from: g */
    public final C11677z f61715g = C10864b0.m38748c(new AdditionalOrderBottomSheetFragment$orderId$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment$a */
    public static final class C24904a {
        public /* synthetic */ C24904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final AdditionalOrderBottomSheetFragment mo72662a(@C12580l String str) {
            AdditionalOrderBottomSheetFragment additionalOrderBottomSheetFragment = new AdditionalOrderBottomSheetFragment();
            Pair[] pairArr = new Pair[1];
            if (str == null) {
                str = "";
            }
            pairArr[0] = C11078d1.m42659a(AdditionalOrderBottomSheetFragment.f61708X, str);
            additionalOrderBottomSheetFragment.setArguments(C17779d.m81164b(pairArr));
            return additionalOrderBottomSheetFragment;
        }

        public C24904a() {
        }
    }

    public AdditionalOrderBottomSheetFragment() {
        super(C249021.f61716a, C249032.f61717a, true);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24917x1c361165(new C24916x1c361164(this)));
        this.f61714f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AdditionalOrderBottomSheetViewModel.class), new C24918x1c361166(b), new C24919x1c361167((C11289a) null, b), new C24920x1c361168(this, b));
    }

    /* renamed from: V0 */
    public final void mo72653V0(@C0324b1 int i) {
        ((C36699g0) getBinding()).f90859g.setVisibility(4);
        MessageComponent messageComponent = ((C36699g0) getBinding()).f90856d;
        messageComponent.mo112900L(false);
        messageComponent.setVisibility(0);
        if (i != -1) {
            messageComponent.setupMessageErrorView(R.drawable.ic_rayons_pb, i);
        }
        messageComponent.setOnSecondaryButtonClickListener(new AdditionalOrderBottomSheetFragment$bindErrorView$1$1(messageComponent, this));
    }

    /* renamed from: W0 */
    public final String mo72654W0() {
        return (String) this.f61715g.getValue();
    }

    /* renamed from: X0 */
    public final AdditionalOrderBottomSheetViewModel mo72655X0() {
        return (AdditionalOrderBottomSheetViewModel) this.f61714f.getValue();
    }

    /* renamed from: Y0 */
    public final void mo72656Y0(Throwable th) {
        if (th instanceof NetworkException) {
            mo72653V0(R.string.general_error_no_network_message);
        } else {
            mo72653V0(R.string.general_error_parameters_server_not_responding_03);
        }
    }

    /* renamed from: Z0 */
    public final void mo72657Z0(boolean z) {
        boolean z2;
        String str;
        Group group = ((C36699g0) getBinding()).f90859g;
        Intrinsics.checkNotNullExpressionValue(group, "binding.additionalOrderValidGroup");
        if (group.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            MaterialButton materialButton = ((C36699g0) getBinding()).f90854b;
            Intrinsics.checkNotNullExpressionValue(materialButton, "binding.additionalOrderAddProducts");
            if (z) {
                str = new String();
            } else {
                str = getString(R.string.additional_order_backdrop_add_products);
                Intrinsics.checkNotNullExpressionValue(str, "{\n                    ge…oducts)\n                }");
            }
            ButtonKt.m152103e(materialButton, z, (Drawable) null, str, (Integer) null, (Integer) null, 26, (Object) null);
        }
    }

    /* renamed from: a1 */
    public final void mo72658a1(C26836a.C26837a aVar) {
        if (aVar instanceof C26836a.C26837a.C26839b) {
            mo72656Y0(((C26836a.C26837a.C26839b) aVar).mo77913d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26836a.C26837a.C26840c.f65438a)) {
            requireActivity().mo57175g0().mo56857a(f61711x, C17779d.m81164b(C11078d1.m42659a(f61712y, Boolean.TRUE), C11078d1.m42659a(f61708X, mo72654W0())));
            dismiss();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26836a.C26837a.C26838a.f65434a)) {
            FragmentManager g0 = requireActivity().mo57175g0();
            Boolean bool = Boolean.TRUE;
            g0.mo56857a(f61711x, C17779d.m81164b(C11078d1.m42659a(f61712y, bool), C11078d1.m42659a(f61713z, bool)));
            dismiss();
        }
    }

    /* renamed from: b1 */
    public final void mo72659b1(C26836a.C26841b bVar) {
        if (bVar instanceof C26836a.C26841b.C26844c) {
            mo72657Z0(true);
        } else {
            mo72657Z0(false);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        AdditionalOrderBottomSheetViewModel X0 = mo72655X0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24911x5c898425(this, X0, (C11045c) null, this), 3, (Object) null);
        AdditionalOrderBottomSheetViewModel X02 = mo72655X0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C24906x7b91d3ee(this, X02, (C11045c) null, this), 3, (Object) null);
        MaterialButton materialButton = ((C36699g0) getBinding()).f90854b;
        Intrinsics.checkNotNullExpressionValue(materialButton, "binding.additionalOrderAddProducts");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(materialButton), new AdditionalOrderBottomSheetFragment$onViewCreated$3(this, (C11045c<? super AdditionalOrderBottomSheetFragment$onViewCreated$3>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner3, f1, new C24905xd3721df6((C11045c) null));
    }
}
