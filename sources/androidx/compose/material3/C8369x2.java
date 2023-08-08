package androidx.compose.material3;

import androidx.compose.animation.core.C2014v0;
import androidx.compose.p004ui.unit.C16483g;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,886:1\n154#2:887\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableDefaults\n*L\n808#1:887\n*E\n"})
/* renamed from: androidx.compose.material3.x2 */
public final class C8369x2 {
    @C12579k

    /* renamed from: a */
    public static final C8369x2 f22476a = new C8369x2();
    @C12579k

    /* renamed from: b */
    public static final C2014v0<Float> f22477b = new C2014v0(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final float f22478c = C16483g.m74435M((float) 125);

    /* renamed from: d */
    public static final float f22479d = 20.0f;

    /* renamed from: e */
    public static final float f22480e = 10.0f;

    /* renamed from: d */
    public static /* synthetic */ C8177b2 m29399d(C8369x2 x2Var, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return x2Var.mo14792c(set, f, f2);
    }

    @C12579k
    /* renamed from: a */
    public final C2014v0<Float> mo14790a() {
        return f22477b;
    }

    /* renamed from: b */
    public final float mo14791b() {
        return f22478c;
    }

    @C12580l
    /* renamed from: c */
    public final C8177b2 mo14792c(@C12579k Set<Float> set, float f, float f2) {
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
        return new C8177b2(floatValue - e4.floatValue(), f, f2);
    }
}
