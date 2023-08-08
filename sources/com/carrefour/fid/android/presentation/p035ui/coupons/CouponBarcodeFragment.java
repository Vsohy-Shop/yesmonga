package com.carrefour.fid.android.presentation.p035ui.coupons;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.C20144i;
import androidx.recyclerview.widget.GridLayoutManager;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36860w1;
import com.carrefour.fid.android.design.components.divider.C37094b;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.adapter.C23785a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.BarcodeViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.util.C28951s;
import com.carrefour.fid.android.shared.util.FragmentViewBindingDelegate;
import com.carrefour.fid.android.shared.util.FragmentViewBindingDelegateKt;
import com.facebook.shimmer.ShimmerFrameLayout;
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
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0016\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0002XD¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00064"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/coupons/CouponBarcodeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onDestroyView", "", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "couponItems", "O0", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel$b;", "state", "N0", "initHeader", "M0", "", "loading", "P0", "", "exception", "L0", "", "f", "I", "NUM_COLUMN", "Lcom/carrefour/fid/android/presentation/ui/coupons/adapter/a;", "g", "Lcom/carrefour/fid/android/presentation/ui/coupons/adapter/a;", "mAdapter", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel;", "v", "Lkotlin/z;", "K0", "()Lcom/carrefour/fid/android/presentation/viewmodels/coupons/BarcodeViewModel;", "viewModel", "Lcom/carrefour/fid/android/databinding/w1;", "w", "Lcom/carrefour/fid/android/shared/util/FragmentViewBindingDelegate;", "J0", "()Lcom/carrefour/fid/android/databinding/w1;", "binding", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCouponBarcodeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponBarcodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/CouponBarcodeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,136:1\n106#2,15:137\n1#3:152\n168#4,7:153\n262#5,2:160\n*S KotlinDebug\n*F\n+ 1 CouponBarcodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/CouponBarcodeFragment\n*L\n38#1:137,15\n67#1:153,7\n120#1:160,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.CouponBarcodeFragment */
public final class CouponBarcodeFragment extends C23794e {

    /* renamed from: x */
    public static final /* synthetic */ C11510n<Object>[] f59863x = {C11342l0.m43564u(new PropertyReference1Impl(CouponBarcodeFragment.class, "binding", "getBinding()Lcom/carrefour/fid/android/databinding/FragmentCouponShowBarcodesBinding;", 0))};

    /* renamed from: y */
    public static final int f59864y = 8;

    /* renamed from: f */
    public final int f59865f = 1;
    @C12580l

    /* renamed from: g */
    public C23785a f59866g;
    @C12579k

    /* renamed from: v */
    public final C11677z f59867v;
    @C12579k

    /* renamed from: w */
    public final FragmentViewBindingDelegate f59868w;

    public CouponBarcodeFragment() {
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new CouponBarcodeFragment$special$$inlined$viewModels$default$2(new CouponBarcodeFragment$special$$inlined$viewModels$default$1(this)));
        this.f59867v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BarcodeViewModel.class), new CouponBarcodeFragment$special$$inlined$viewModels$default$3(b), new CouponBarcodeFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new CouponBarcodeFragment$special$$inlined$viewModels$default$5(this, b));
        this.f59868w = FragmentViewBindingDelegateKt.m119491b(this, CouponBarcodeFragment$binding$2.f59873a);
    }

    /* renamed from: J0 */
    public final C36860w1 mo69649J0() {
        return (C36860w1) this.f59868w.mo22938a(this, f59863x[0]);
    }

    /* renamed from: K0 */
    public final BarcodeViewModel mo69650K0() {
        return (BarcodeViewModel) this.f59867v.getValue();
    }

    /* renamed from: L0 */
    public final void mo69651L0(Throwable th) {
        if (th instanceof NetworkException) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…error_no_network_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            return;
        }
        NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
        String string2 = getString(R.string.general_error_server_not_responding_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…r_not_responding_message)");
        FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: M0 */
    public final void mo69652M0() {
        initHeader();
        mo69649J0().f91838e.setLayoutManager(new GridLayoutManager(getActivity(), this.f59865f));
        Context context = getContext();
        if (context != null) {
            mo69649J0().f91838e.mo59589n(new C37094b(this.f59865f, C28951s.f70964a.mo84277c(12, context), true));
        }
        mo69649J0().f91838e.setItemAnimator(new C20144i());
        mo69649J0().f91838e.setNestedScrollingEnabled(false);
    }

    /* renamed from: N0 */
    public final void mo69653N0(BarcodeViewModel.C26210b bVar) {
        mo69655P0(bVar.isLoading());
        List<CouponModel> k = bVar.mo76251k();
        if (k != null) {
            mo69654O0(k);
        }
        Throwable l = bVar.mo76252l();
        if (l != null) {
            mo69651L0(l);
        }
    }

    /* renamed from: O0 */
    public final void mo69654O0(@C12580l List<CouponModel> list) {
        C11079d2 d2Var;
        C23785a aVar = this.f59866g;
        if (aVar != null) {
            aVar.mo69671l(list);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            this.f59866g = new C23785a(list, requireContext);
            mo69649J0().f91838e.setAdapter(this.f59866g);
        }
    }

    /* renamed from: P0 */
    public final void mo69655P0(boolean z) {
        int i;
        if (z) {
            mo69649J0().f91835b.mo36996g();
        } else {
            mo69649J0().f91835b.mo36997h();
        }
        ShimmerFrameLayout shimmerFrameLayout = mo69649J0().f91835b;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.couponShimmerViewContainer");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        shimmerFrameLayout.setVisibility(i);
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        mo69649J0().f91836c.setContent(C8553b.m31049c(-1177522690, true, new CouponBarcodeFragment$initHeader$1(this)));
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        mo69650K0().sendIntent(BarcodeViewModel.C26212c.C26213a.f64131b);
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        LinearLayout b = mo69649J0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f59866g = null;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo69652M0();
        BarcodeViewModel K0 = mo69650K0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CouponBarcodeFragment$onViewCreated$$inlined$processState$1(this, K0, (C11045c) null, this), 3, (Object) null);
    }
}
