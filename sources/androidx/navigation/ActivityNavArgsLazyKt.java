package androidx.navigation;

import android.app.Activity;
import androidx.annotation.C0353k0;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityNavArgsLazyKt {
    @C0353k0
    /* renamed from: a */
    public static final /* synthetic */ <Args extends C19764l> C19766m<Args> m91320a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new C19766m<>(C11342l0.m43547d(C19764l.class), new ActivityNavArgsLazyKt$navArgs$1(activity));
    }
}
