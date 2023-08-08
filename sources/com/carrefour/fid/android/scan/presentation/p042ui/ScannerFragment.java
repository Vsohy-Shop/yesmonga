package com.carrefour.fid.android.scan.presentation.p042ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.C1353a2;
import androidx.camera.core.C1647n;
import androidx.camera.core.C1677r2;
import androidx.camera.core.C1689t0;
import androidx.camera.lifecycle.C1750f;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19259o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.scan.core.constants.C28255a;
import com.carrefour.fid.android.scan.core.constants.ScanType;
import com.carrefour.fid.android.scan.databinding.C28270b;
import com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel;
import com.carrefour.fid.android.scan.presentation.viewmodels.mvi.C28318a;
import com.carrefour.fid.android.shared.extension.C28775q;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
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
@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/scan/presentation/ui/ScannerFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/scan/databinding/b;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/scan/presentation/viewmodels/mvi/a$a;", "event", "c1", "b1", "Landroidx/camera/lifecycle/f;", "processCameraProvider", "V0", "Landroidx/camera/core/r2;", "Z0", "Landroidx/camera/core/t0;", "X0", "Landroidx/camera/core/n;", "Y0", "Lcom/carrefour/fid/android/scan/presentation/viewmodels/ScannerViewModel;", "f", "Lkotlin/z;", "a1", "()Lcom/carrefour/fid/android/scan/presentation/viewmodels/ScannerViewModel;", "viewModel", "g", "Landroidx/camera/core/t0;", "analysis", "<init>", "()V", "v", "a", "scan_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nScannerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScannerFragment.kt\ncom/carrefour/fid/android/scan/presentation/ui/ScannerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,106:1\n106#2,15:107\n183#3,6:122\n*S KotlinDebug\n*F\n+ 1 ScannerFragment.kt\ncom/carrefour/fid/android/scan/presentation/ui/ScannerFragment\n*L\n31#1:107,15\n49#1:122,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.scan.presentation.ui.ScannerFragment */
public final class ScannerFragment extends C28308e<C28270b> {
    @C12579k

    /* renamed from: v */
    public static final C28299a f68459v = new C28299a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public final C11677z f68460f;
    @C12580l

    /* renamed from: g */
    public C1689t0 f68461g;

    /* renamed from: com.carrefour.fid.android.scan.presentation.ui.ScannerFragment$a */
    public static final class C28299a {
        public /* synthetic */ C28299a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ScannerFragment mo82270a(@C12579k ScanType scanType) {
            Intrinsics.checkNotNullParameter(scanType, C28310g.f68481a);
            ScannerFragment scannerFragment = new ScannerFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(C28310g.f68481a, scanType);
            scannerFragment.setArguments(bundle);
            return scannerFragment;
        }

        public C28299a() {
        }
    }

    public ScannerFragment() {
        super(C282981.f68462a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new ScannerFragment$special$$inlined$viewModels$default$2(new ScannerFragment$special$$inlined$viewModels$default$1(this)));
        this.f68460f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ScannerViewModel.class), new ScannerFragment$special$$inlined$viewModels$default$3(b), new ScannerFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new ScannerFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: W0 */
    public static final void m118262W0(ScannerFragment scannerFragment, C1353a2 a2Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(scannerFragment, "this$0");
        Intrinsics.checkNotNullParameter(a2Var, "it");
        Bundle arguments = scannerFragment.getArguments();
        ScanType scanType = null;
        if (arguments != null) {
            obj = arguments.getSerializable(C28310g.f68481a);
        } else {
            obj = null;
        }
        if (obj instanceof ScanType) {
            scanType = (ScanType) obj;
        }
        if (scanType != null) {
            scannerFragment.mo82266a1().sendIntent(new C28318a.C28328c.C28329a(a2Var, scanType));
        }
    }

    /* renamed from: V0 */
    public final void mo82262V0(C1750f fVar) {
        C1677r2 Z0 = mo82265Z0();
        C1647n Y0 = mo82264Y0();
        fVar.mo5810a();
        C1689t0 t0Var = this.f68461g;
        if (t0Var != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            t0Var.mo5708T(C28775q.m119095c(requireContext), new C28309f(this));
        }
        fVar.mo5816h(this, Y0, Z0, this.f68461g);
    }

    /* renamed from: X0 */
    public final C1689t0 mo82263X0() {
        C1689t0 t = new C1689t0.C1692c().mo5731y(0).mo4098g();
        Intrinsics.checkNotNullExpressionValue(t, "Builder()\n        .setBa…_LATEST)\n        .build()");
        return t;
    }

    /* renamed from: Y0 */
    public final C1647n mo82264Y0() {
        C1647n b = new C1647n.C1648a().mo5638d(1).mo5637b();
        Intrinsics.checkNotNullExpressionValue(b, "Builder()\n        .requi…NG_BACK)\n        .build()");
        return b;
    }

    /* renamed from: Z0 */
    public final C1677r2 mo82265Z0() {
        C1677r2 t = new C1677r2.C1679b().mo4098g();
        Intrinsics.checkNotNullExpressionValue(t, "Builder()\n        .build()");
        t.mo5673S(((C28270b) getBinding()).f68429c.getSurfaceProvider());
        return t;
    }

    /* renamed from: a1 */
    public final ScannerViewModel mo82266a1() {
        return (ScannerViewModel) this.f68460f.getValue();
    }

    /* renamed from: b1 */
    public final void mo82267b1() {
        C1689t0 t0Var = this.f68461g;
        if (t0Var != null) {
            t0Var.mo5702L();
        }
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C19501x.m90847a(viewLifecycleOwner).mo57477c(new ScannerFragment$handlerAnalyser$1(this, (C11045c<? super ScannerFragment$handlerAnalyser$1>) null));
    }

    /* renamed from: c1 */
    public final void mo82268c1(C28318a.C28319a aVar) {
        if (aVar instanceof C28318a.C28319a.C28321b) {
            C19259o.m90349d(this, C28255a.f68402b, C17779d.m81164b(C11078d1.m42659a(C28255a.f68403c, ((C28318a.C28319a.C28321b) aVar).mo82296d())));
        } else if (aVar instanceof C28318a.C28319a.C28320a) {
            C28935i iVar = C28935i.f70940a;
            Throwable d = ((C28318a.C28319a.C28320a) aVar).mo82290d();
            C28935i.m119705e(iVar, "Error to detect image :'" + d + "'", (Throwable) null, 0, 6, (Object) null);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo82267b1();
        ScannerViewModel a1 = mo82266a1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ScannerFragment$onViewCreated$$inlined$processEvent$1(this, a1, (C11045c) null, this), 3, (Object) null);
    }
}
