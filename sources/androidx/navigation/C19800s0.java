package androidx.navigation;

import kotlin.jvm.C11283a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.s0 */
public final class C19800s0 {
    @C12579k
    /* renamed from: a */
    public static final <T extends Navigator<? extends NavDestination>> T m92066a(@C12579k C19795r0 r0Var, @C12579k String str) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        return r0Var.mo58562f(str);
    }

    @C12579k
    /* renamed from: b */
    public static final <T extends Navigator<? extends NavDestination>> T m92067b(@C12579k C19795r0 r0Var, @C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "clazz");
        return r0Var.mo58561e(C11283a.m43409e(dVar));
    }

    /* renamed from: c */
    public static final void m92068c(@C12579k C19795r0 r0Var, @C12579k Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        r0Var.mo58559b(navigator);
    }

    @C12580l
    /* renamed from: d */
    public static final Navigator<? extends NavDestination> m92069d(@C12579k C19795r0 r0Var, @C12579k String str, @C12579k Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return r0Var.mo58560c(str, navigator);
    }
}
