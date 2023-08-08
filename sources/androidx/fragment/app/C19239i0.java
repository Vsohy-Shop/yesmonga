package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.C0329d0;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.i0 */
public final class C19239i0 {
    /* renamed from: a */
    public static final /* synthetic */ <F extends Fragment> C19234h0 m90205a(C19234h0 h0Var, @C0329d0 int i, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19234h0 i2 = h0Var.mo57219i(i, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(i2, "add(containerViewId, F::class.java, args, tag)");
        return i2;
    }

    /* renamed from: b */
    public static final /* synthetic */ <F extends Fragment> C19234h0 m90206b(C19234h0 h0Var, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19234h0 l = h0Var.mo57222l(Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(l, "add(F::class.java, args, tag)");
        return l;
    }

    /* renamed from: c */
    public static /* synthetic */ C19234h0 m90207c(C19234h0 h0Var, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19234h0 i3 = h0Var.mo57219i(i, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(i3, "add(containerViewId, F::class.java, args, tag)");
        return i3;
    }

    /* renamed from: d */
    public static /* synthetic */ C19234h0 m90208d(C19234h0 h0Var, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19234h0 l = h0Var.mo57222l(Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(l, "add(F::class.java, args, tag)");
        return l;
    }

    /* renamed from: e */
    public static final /* synthetic */ <F extends Fragment> C19234h0 m90209e(C19234h0 h0Var, @C0329d0 int i, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19234h0 F = h0Var.mo57204F(i, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(F, "replace(containerViewId, F::class.java, args, tag)");
        return F;
    }

    /* renamed from: f */
    public static /* synthetic */ C19234h0 m90210f(C19234h0 h0Var, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.reifiedOperationMarker(4, EnergyLabelKt.f67711i);
        C19234h0 F = h0Var.mo57204F(i, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(F, "replace(containerViewId, F::class.java, args, tag)");
        return F;
    }
}
