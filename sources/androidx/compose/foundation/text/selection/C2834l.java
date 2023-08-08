package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,70:1\n154#2:71\n154#2:72\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n27#1:71\n28#1:72\n*E\n"})
/* renamed from: androidx.compose.foundation.text.selection.l */
public final class C2834l {

    /* renamed from: a */
    public static final float f7458a;

    /* renamed from: b */
    public static final float f7459b;
    @C12579k

    /* renamed from: c */
    public static final SemanticsPropertyKey<C2833k> f7460c = new SemanticsPropertyKey<>("SelectionHandleInfo", (C11304p) null, 2, (DefaultConstructorMarker) null);

    static {
        float f = (float) 25;
        f7458a = C16483g.m74435M(f);
        f7459b = C16483g.m74435M(f);
    }

    /* renamed from: a */
    public static final long m13089a(long j) {
        return C15096g.m64898a(C15094f.m64880p(j), C15094f.m64882r(j) - 1.0f);
    }

    /* renamed from: b */
    public static final float m13090b() {
        return f7459b;
    }

    /* renamed from: c */
    public static final float m13091c() {
        return f7458a;
    }

    @C12579k
    /* renamed from: d */
    public static final SemanticsPropertyKey<C2833k> m13092d() {
        return f7460c;
    }
}
