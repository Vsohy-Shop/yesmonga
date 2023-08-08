package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.C8767m;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.InspectableValueKt */
public final class InspectableValueKt {
    @C12579k

    /* renamed from: a */
    public static final C11300l<C15983v0, C11079d2> f39361a = InspectableValueKt$NoInspectorInfo$1.f39363f;

    /* renamed from: b */
    public static boolean f39362b;

    @C12579k
    /* renamed from: a */
    public static final C11300l<C15983v0, C11079d2> m71059a(@C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "definitions");
        if (m71063e()) {
            return new InspectableValueKt$debugInspectorInfo$1(lVar);
        }
        return m71060b();
    }

    @C12579k
    /* renamed from: b */
    public static final C11300l<C15983v0, C11079d2> m71060b() {
        return f39361a;
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m71061c(@C12579k C8767m mVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11300l<? super C8767m, ? extends C8767m> lVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(lVar2, "factory");
        return m71062d(mVar, lVar, (C8767m) lVar2.invoke(C8767m.f23478j));
    }

    @C12579k
    @C11532s0
    /* renamed from: d */
    public static final C8767m m71062d(@C12579k C8767m mVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C8767m mVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(mVar2, "wrapped");
        C15971t0 t0Var = new C15971t0(lVar);
        return mVar.mo17224k3(t0Var).mo17224k3(mVar2).mo17224k3(t0Var.mo45956r());
    }

    /* renamed from: e */
    public static final boolean m71063e() {
        return f39362b;
    }

    /* renamed from: f */
    public static final void m71064f(boolean z) {
        f39362b = z;
    }
}
