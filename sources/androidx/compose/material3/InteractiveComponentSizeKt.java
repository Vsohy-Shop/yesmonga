package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16485h;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/InteractiveComponentSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,128:1\n135#2:129\n154#3:130\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/InteractiveComponentSizeKt\n*L\n48#1:129\n127#1:130\n*E\n"})
public final class InteractiveComponentSizeKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<Boolean> f19447a;
    @C12579k

    /* renamed from: b */
    public static final C8550i1<Boolean> f19448b;

    /* renamed from: c */
    public static final long f19449c;

    static {
        C8550i1<Boolean> e = CompositionLocalKt.m29859e(C8035x5503ad70.f19450f);
        f19447a = e;
        f19448b = e;
        float f = (float) 48;
        f19449c = C16485h.m74483b(C16483g.m74435M(f), C16483g.m74435M(f));
    }

    @C8251n0
    @C12579k
    /* renamed from: b */
    public static final C8550i1<Boolean> m25830b() {
        return f19447a;
    }

    @C8251n0
    /* renamed from: c */
    public static /* synthetic */ void m25831c() {
    }

    @C8251n0
    @C12579k
    /* renamed from: d */
    public static final C8550i1<Boolean> m25832d() {
        return f19448b;
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @C11587t0(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    @C8251n0
    /* renamed from: e */
    public static /* synthetic */ void m25833e() {
    }

    @C12579k
    /* renamed from: f */
    public static final C8767m m25834f(@C12579k C8767m mVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (InspectableValueKt.m71063e()) {
            lVar = new C8034xe41b1c03();
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, InteractiveComponentSizeKt$minimumInteractiveComponentSize$2.f19451f);
    }
}
