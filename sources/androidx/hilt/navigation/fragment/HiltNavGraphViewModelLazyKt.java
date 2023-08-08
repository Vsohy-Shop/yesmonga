package androidx.hilt.navigation.fragment;

import androidx.annotation.C0329d0;
import androidx.annotation.C0353k0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19476v0;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;

public final class HiltNavGraphViewModelLazyKt {
    @C0353k0
    /* renamed from: a */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m90446a(Fragment fragment, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(fragment, "$this$hiltNavGraphViewModels");
        C11677z c = C10864b0.m38748c(new C19300xd37b66e9(fragment, i));
        C19301x558e8296 hiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$1 = new C19301x558e8296(c, (C11510n) null);
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.m89922g(fragment, C11342l0.m43547d(C19476v0.class), hiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$1, new HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$1(fragment, c, (C11510n) null));
    }
}
