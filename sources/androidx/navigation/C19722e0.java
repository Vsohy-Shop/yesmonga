package androidx.navigation;

import androidx.annotation.C0329d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.navigation.e0 */
public final class C19722e0 {
    /* renamed from: a */
    public static final boolean m91763a(@C12579k NavGraph navGraph, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        if (navGraph.mo58273J0(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m91764b(@C12579k NavGraph navGraph, @C12579k String str) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        if (navGraph.mo58275L0(str) != null) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: c */
    public static final NavDestination m91765c(@C12579k NavGraph navGraph, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        NavDestination J0 = navGraph.mo58273J0(i);
        if (J0 != null) {
            return J0;
        }
        throw new IllegalArgumentException("No destination for " + i + " was found in " + navGraph);
    }

    @C12579k
    /* renamed from: d */
    public static final NavDestination m91766d(@C12579k NavGraph navGraph, @C12579k String str) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        Intrinsics.checkNotNullParameter(str, "route");
        NavDestination L0 = navGraph.mo58275L0(str);
        if (L0 != null) {
            return L0;
        }
        throw new IllegalArgumentException("No destination for " + str + " was found in " + navGraph);
    }

    /* renamed from: e */
    public static final void m91767e(@C12579k NavGraph navGraph, @C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        Intrinsics.checkNotNullParameter(navDestination, "node");
        navGraph.mo58282U0(navDestination);
    }

    /* renamed from: f */
    public static final void m91768f(@C12579k NavGraph navGraph, @C12579k NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        Intrinsics.checkNotNullParameter(navDestination, "node");
        navGraph.mo58270G0(navDestination);
    }

    /* renamed from: g */
    public static final void m91769g(@C12579k NavGraph navGraph, @C12579k NavGraph navGraph2) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        Intrinsics.checkNotNullParameter(navGraph2, "other");
        navGraph.mo58269F0(navGraph2);
    }
}
