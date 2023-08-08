package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.fragment.app.q0 */
public final class C19266q0 {
    @C12579k
    /* renamed from: a */
    public static final <F extends Fragment> F m90370a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        F q0 = FragmentManager.m89710q0(view);
        Intrinsics.checkNotNullExpressionValue(q0, "findFragment(this)");
        return q0;
    }
}
