package com.carrefour.fid.android.scan.presentation.p042ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.C1353a2;
import androidx.camera.core.C1624j;
import androidx.camera.core.C1641m;
import androidx.camera.core.C1647n;
import androidx.camera.core.C1677r2;
import androidx.camera.core.C1689t0;
import androidx.camera.core.CameraControl;
import androidx.camera.lifecycle.C1750f;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19259o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.scan.core.constants.C28255a;
import com.carrefour.fid.android.scan.core.constants.ScanType;
import com.carrefour.fid.android.scan.databinding.C28269a;
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
@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/scan/presentation/ui/CouponsBarcodeScannerFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/scan/databinding/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/scan/presentation/viewmodels/mvi/a$b;", "state", "g1", "Lcom/carrefour/fid/android/scan/presentation/viewmodels/mvi/a$a;", "event", "f1", "e1", "Landroidx/camera/lifecycle/f;", "processCameraProvider", "X0", "Landroidx/camera/core/r2;", "c1", "Landroidx/camera/core/t0;", "a1", "Landroidx/camera/core/n;", "b1", "Lcom/carrefour/fid/android/scan/presentation/viewmodels/ScannerViewModel;", "f", "Lkotlin/z;", "d1", "()Lcom/carrefour/fid/android/scan/presentation/viewmodels/ScannerViewModel;", "viewModel", "g", "Landroidx/camera/core/t0;", "analysis", "<init>", "()V", "v", "a", "scan_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCouponsBarcodeScannerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsBarcodeScannerFragment.kt\ncom/carrefour/fid/android/scan/presentation/ui/CouponsBarcodeScannerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 Serializable.kt\ncom/carrefour/fid/android/shared/util/SerializableKt\n*L\n1#1,133:1\n106#2,15:134\n183#3,6:149\n168#3,7:155\n6#4,4:162\n*S KotlinDebug\n*F\n+ 1 CouponsBarcodeScannerFragment.kt\ncom/carrefour/fid/android/scan/presentation/ui/CouponsBarcodeScannerFragment\n*L\n34#1:134,15\n52#1:149,6\n53#1:155,7\n101#1:162,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.scan.presentation.ui.CouponsBarcodeScannerFragment */
public final class CouponsBarcodeScannerFragment extends C28307d<C28269a> {
    @C12579k

    /* renamed from: v */
    public static final C28282a f68447v = new C28282a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public final C11677z f68448f;
    @C12580l

    /* renamed from: g */
    public C1689t0 f68449g;

    /* renamed from: com.carrefour.fid.android.scan.presentation.ui.CouponsBarcodeScannerFragment$a */
    public static final class C28282a {
        public /* synthetic */ C28282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final CouponsBarcodeScannerFragment mo82254a(@C12579k ScanType scanType) {
            Intrinsics.checkNotNullParameter(scanType, C28310g.f68481a);
            CouponsBarcodeScannerFragment couponsBarcodeScannerFragment = new CouponsBarcodeScannerFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(C28310g.f68481a, scanType);
            couponsBarcodeScannerFragment.setArguments(bundle);
            return couponsBarcodeScannerFragment;
        }

        public C28282a() {
        }
    }

    public CouponsBarcodeScannerFragment() {
        super(C282811.f68450a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C28294x83946463(new C28293x83946462(this)));
        this.f68448f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ScannerViewModel.class), new C28295x83946464(b), new C28296x83946465((C11289a) null, b), new C28297x83946466(this, b));
    }

    /* renamed from: Y0 */
    public static final void m118243Y0(CouponsBarcodeScannerFragment couponsBarcodeScannerFragment, C1353a2 a2Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(couponsBarcodeScannerFragment, "this$0");
        Intrinsics.checkNotNullParameter(a2Var, "it");
        Bundle arguments = couponsBarcodeScannerFragment.getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = arguments.getSerializable(C28310g.f68481a, ScanType.class);
            } else {
                obj = (ScanType) arguments.getSerializable(C28310g.f68481a);
            }
            ScanType scanType = (ScanType) obj;
            if (scanType != null) {
                couponsBarcodeScannerFragment.mo82249d1().sendIntent(new C28318a.C28328c.C28329a(a2Var, scanType));
            }
        }
    }

    /* renamed from: Z0 */
    public static final void m118244Z0(C1641m mVar, CameraControl cameraControl, View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "$cameraInfo");
        Intrinsics.checkNotNullParameter(cameraControl, "$cameraControl");
        Integer f = mVar.mo4598h().mo4610f();
        if (f != null && f.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        cameraControl.mo4682h(z);
    }

    /* renamed from: X0 */
    public final void mo82245X0(C1750f fVar) {
        C1677r2 c1 = mo82248c1();
        C1647n b1 = mo82247b1();
        fVar.mo5810a();
        C1689t0 t0Var = this.f68449g;
        if (t0Var != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            t0Var.mo5708T(C28775q.m119095c(requireContext), new C28304a(this));
        }
        C1624j h = fVar.mo5816h(this, b1, c1, this.f68449g);
        Intrinsics.checkNotNullExpressionValue(h, "processCameraProvider.bi…       analysis\n        )");
        CameraControl a = h.mo5119a();
        Intrinsics.checkNotNullExpressionValue(a, "camera.cameraControl");
        C1641m c = h.mo5121c();
        Intrinsics.checkNotNullExpressionValue(c, "camera.cameraInfo");
        ((C28269a) getBinding()).f68423c.setOnClickListener(new C28305b(c, a));
    }

    /* renamed from: a1 */
    public final C1689t0 mo82246a1() {
        C1689t0 t = new C1689t0.C1692c().mo5731y(0).mo4098g();
        Intrinsics.checkNotNullExpressionValue(t, "Builder()\n        .setBa…_LATEST)\n        .build()");
        return t;
    }

    /* renamed from: b1 */
    public final C1647n mo82247b1() {
        C1647n b = new C1647n.C1648a().mo5638d(1).mo5637b();
        Intrinsics.checkNotNullExpressionValue(b, "Builder()\n        .requi…NG_BACK)\n        .build()");
        return b;
    }

    /* renamed from: c1 */
    public final C1677r2 mo82248c1() {
        C1677r2 t = new C1677r2.C1679b().mo4098g();
        Intrinsics.checkNotNullExpressionValue(t, "Builder()\n        .build()");
        t.mo5673S(((C28269a) getBinding()).f68424d.getSurfaceProvider());
        return t;
    }

    /* renamed from: d1 */
    public final ScannerViewModel mo82249d1() {
        return (ScannerViewModel) this.f68448f.getValue();
    }

    /* renamed from: e1 */
    public final void mo82250e1() {
        C1689t0 t0Var = this.f68449g;
        if (t0Var != null) {
            t0Var.mo5702L();
        }
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C19501x.m90847a(viewLifecycleOwner).mo57477c(new CouponsBarcodeScannerFragment$handlerAnalyser$1(this, (C11045c<? super CouponsBarcodeScannerFragment$handlerAnalyser$1>) null));
    }

    /* renamed from: f1 */
    public final void mo82251f1(C28318a.C28319a aVar) {
        if (aVar instanceof C28318a.C28319a.C28321b) {
            C19259o.m90349d(this, C28255a.f68402b, C17779d.m81164b(C11078d1.m42659a(C28255a.f68403c, ((C28318a.C28319a.C28321b) aVar).mo82296d())));
        } else if (aVar instanceof C28318a.C28319a.C28320a) {
            C28935i iVar = C28935i.f70940a;
            Throwable d = ((C28318a.C28319a.C28320a) aVar).mo82290d();
            C28935i.m119705e(iVar, "Error to detect image :'" + d + "'", (Throwable) null, 0, 6, (Object) null);
        }
    }

    /* renamed from: g1 */
    public final void mo82252g1(C28318a.C28322b bVar) {
        boolean z;
        if (bVar instanceof C28318a.C28322b.C28326d) {
            ((C28269a) getBinding()).f68422b.setVisibility(8);
            ((C28269a) getBinding()).f68425e.setVisibility(0);
            return;
        }
        if (bVar instanceof C28318a.C28322b.C28324b) {
            z = true;
        } else {
            z = bVar instanceof C28318a.C28322b.C28325c;
        }
        if (z) {
            ((C28269a) getBinding()).f68425e.setVisibility(8);
            ((C28269a) getBinding()).f68422b.setVisibility(8);
        } else if (bVar instanceof C28318a.C28322b.C28327e) {
            ((C28269a) getBinding()).f68425e.setVisibility(8);
            ((C28269a) getBinding()).f68422b.setVisibility(0);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo82250e1();
        ScannerViewModel d1 = mo82249d1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C28283xe2f026ec(this, d1, (C11045c) null, this), 3, (Object) null);
        ScannerViewModel d12 = mo82249d1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C28288xc3e7d723(this, d12, (C11045c) null, this), 3, (Object) null);
    }
}
