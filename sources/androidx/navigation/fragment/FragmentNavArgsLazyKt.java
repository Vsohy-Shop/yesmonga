package androidx.navigation.fragment;

import androidx.annotation.C0353k0;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19764l;
import androidx.navigation.C19766m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;

public final class FragmentNavArgsLazyKt {
    @C0353k0
    /* renamed from: a */
    public static final /* synthetic */ <Args extends C19764l> C19766m<Args> m91782a(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new C19766m<>(C11342l0.m43547d(C19764l.class), new FragmentNavArgsLazyKt$navArgs$1(fragment));
    }
}
