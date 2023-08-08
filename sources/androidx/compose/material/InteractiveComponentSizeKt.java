package androidx.compose.material;

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

@C11363r0({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,129:1\n135#2:130\n154#3:131\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n49#1:130\n128#1:131\n*E\n"})
public final class InteractiveComponentSizeKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<Boolean> f7685a;
    @C12579k

    /* renamed from: b */
    public static final C8550i1<Boolean> f7686b;

    /* renamed from: c */
    public static final long f7687c;

    static {
        C8550i1<Boolean> e = CompositionLocalKt.m29859e(C2939x5503ad70.f7688f);
        f7685a = e;
        f7686b = e;
        float f = (float) 48;
        f7687c = C16485h.m74483b(C16483g.m74435M(f), C16483g.m74435M(f));
    }

    @C3044g0
    @C12579k
    /* renamed from: b */
    public static final C8550i1<Boolean> m13545b() {
        return f7685a;
    }

    @C3044g0
    /* renamed from: c */
    public static /* synthetic */ void m13546c() {
    }

    @C3044g0
    @C12579k
    /* renamed from: d */
    public static final C8550i1<Boolean> m13547d() {
        return f7686b;
    }

    @C11395k(level = DeprecationLevel.f28049a, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @C11587t0(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    @C3044g0
    /* renamed from: e */
    public static /* synthetic */ void m13548e() {
    }

    @C12579k
    /* renamed from: f */
    public static final C8767m m13549f(@C12579k C8767m mVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2938xe41b1c03();
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, InteractiveComponentSizeKt$minimumInteractiveComponentSize$2.f7689f);
    }
}
