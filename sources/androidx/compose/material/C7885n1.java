package androidx.compose.material;

import androidx.compose.animation.core.C2014v0;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.internal.C8567o;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,890:1\n154#2:891\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n*L\n812#1:891\n*E\n"})
/* renamed from: androidx.compose.material.n1 */
public final class C7885n1 {
    @C12579k

    /* renamed from: a */
    public static final C7885n1 f18885a = new C7885n1();
    @C12579k

    /* renamed from: b */
    public static final C2014v0<Float> f18886b = new C2014v0(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final float f18887c = C16483g.m74435M((float) 125);

    /* renamed from: d */
    public static final float f18888d = 20.0f;

    /* renamed from: e */
    public static final float f18889e = 10.0f;

    /* renamed from: f */
    public static final int f18890f = 0;

    /* renamed from: d */
    public static /* synthetic */ C3033c1 m25072d(C7885n1 n1Var, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return n1Var.mo10891c(set, f, f2);
    }

    @C12579k
    /* renamed from: a */
    public final C2014v0<Float> mo10889a() {
        return f18886b;
    }

    /* renamed from: b */
    public final float mo10890b() {
        return f18887c;
    }

    @C12580l
    /* renamed from: c */
    public final C3033c1 mo10891c(@C12579k Set<Float> set, float f, float f2) {
        Intrinsics.checkNotNullParameter(set, "anchors");
        if (set.size() <= 1) {
            return null;
        }
        Iterable iterable = set;
        Float M3 = CollectionsKt___CollectionsKt.m40535M3(iterable);
        Intrinsics.checkNotNull(M3);
        float floatValue = M3.floatValue();
        Float e4 = CollectionsKt___CollectionsKt.m40625e4(iterable);
        Intrinsics.checkNotNull(e4);
        return new C3033c1(floatValue - e4.floatValue(), f, f2);
    }
}
