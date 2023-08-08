package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0329d0;
import androidx.appcompat.widget.C0696c;
import androidx.core.app.C17018b;
import androidx.navigation.C19844w0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.lang.ref.WeakReference;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class Navigation {
    @C12579k

    /* renamed from: a */
    public static final Navigation f50476a = new Navigation();

    @C12579k
    @C11315i
    @C11384m
    /* renamed from: d */
    public static final View.OnClickListener m91641d(@C0329d0 int i) {
        return m91644g(i, (Bundle) null, 2, (Object) null);
    }

    @C12579k
    @C11315i
    @C11384m
    /* renamed from: e */
    public static final View.OnClickListener m91642e(@C0329d0 int i, @C12580l Bundle bundle) {
        return new C19793q0(i, bundle);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final View.OnClickListener m91643f(@C12579k C19693b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "directions");
        return new C19791p0(b0Var);
    }

    /* renamed from: g */
    public static /* synthetic */ View.OnClickListener m91644g(int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return m91642e(i, bundle);
    }

    /* renamed from: h */
    public static final void m91645h(int i, Bundle bundle, View view) {
        Intrinsics.checkNotNullExpressionValue(view, C40383c.f102945c);
        m91648k(view).mo58130W(i, bundle);
    }

    /* renamed from: i */
    public static final void m91646i(C19693b0 b0Var, View view) {
        Intrinsics.checkNotNullParameter(b0Var, "$directions");
        Intrinsics.checkNotNullExpressionValue(view, C40383c.f102945c);
        m91648k(view).mo58142g0(b0Var);
    }

    @C12579k
    @C11384m
    /* renamed from: j */
    public static final NavController m91647j(@C12579k Activity activity, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        View K = C17018b.m78744K(activity, i);
        Intrinsics.checkNotNullExpressionValue(K, "requireViewById<View>(activity, viewId)");
        NavController l = f50476a.mo58311l(K);
        if (l != null) {
            return l;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    @C12579k
    @C11384m
    /* renamed from: k */
    public static final NavController m91648k(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        NavController l = f50476a.mo58311l(view);
        if (l != null) {
            return l;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    @C11384m
    /* renamed from: n */
    public static final void m91649n(@C12579k View view, @C12580l NavController navController) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        view.setTag(C19844w0.C19846b.nav_controller_view_tag, navController);
    }

    /* renamed from: l */
    public final NavController mo58311l(View view) {
        return (NavController) SequencesKt___SequencesKt.m44641F0(SequencesKt___SequencesKt.m44781p1(SequencesKt__SequencesKt.m44595l(view, Navigation$findViewNavController$1.f50477f), Navigation$findViewNavController$2.f50478f));
    }

    /* renamed from: m */
    public final NavController mo58312m(View view) {
        Object tag = view.getTag(C19844w0.C19846b.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }
}
