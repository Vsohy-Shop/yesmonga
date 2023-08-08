package androidx.navigation;

import androidx.annotation.C0329d0;
import androidx.annotation.C0353k0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;

public final class NavGraphViewModelLazyKt {
    @C0353k0
    /* renamed from: c */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m91615c(Fragment fragment, @C0329d0 int i, C11289a<? extends C19502x0.C19506b> aVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        C11677z c = C10864b0.m38748c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(c);
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.m89922g(fragment, C11342l0.m43547d(C19476v0.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, new NavGraphViewModelLazyKt$navGraphViewModels$1(aVar, c));
    }

    @C0353k0
    /* renamed from: d */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m91616d(Fragment fragment, String str, C11289a<? extends C19502x0.C19506b> aVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "navGraphRoute");
        C11677z c = C10864b0.m38748c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(c);
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.m89922g(fragment, C11342l0.m43547d(C19476v0.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, new NavGraphViewModelLazyKt$navGraphViewModels$2(aVar, c));
    }

    /* renamed from: e */
    public static /* synthetic */ C11677z m91617e(Fragment fragment, int i, C11289a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        C11677z c = C10864b0.m38748c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(c);
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.m89922g(fragment, C11342l0.m43547d(C19476v0.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, new NavGraphViewModelLazyKt$navGraphViewModels$1(aVar, c));
    }

    /* renamed from: f */
    public static /* synthetic */ C11677z m91618f(Fragment fragment, String str, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(str, "navGraphRoute");
        C11677z c = C10864b0.m38748c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(c);
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.m89922g(fragment, C11342l0.m43547d(C19476v0.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, new NavGraphViewModelLazyKt$navGraphViewModels$2(aVar, c));
    }

    /* renamed from: g */
    public static final NavBackStackEntry m91619g(C11677z<NavBackStackEntry> zVar) {
        return zVar.getValue();
    }

    /* renamed from: h */
    public static final NavBackStackEntry m91620h(C11677z<NavBackStackEntry> zVar) {
        return zVar.getValue();
    }
}
