package androidx.compose.animation.core;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16485h;
import androidx.compose.p004ui.unit.C16486i;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11324c0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,114:1\n175#2:115\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:115\n*E\n"})
/* renamed from: androidx.compose.animation.core.p1 */
public final class C2002p1 {

    /* renamed from: a */
    public static final float f5584a = 0.1f;

    /* renamed from: b */
    public static final float f5585b = 0.5f;
    @C12579k

    /* renamed from: c */
    public static final C15098i f5586c = new C15098i(0.5f, 0.5f, 0.5f, 0.5f);
    @C12579k

    /* renamed from: d */
    public static final Map<C1945a1<?, ?>, Float> f5587d;

    static {
        Float valueOf = Float.valueOf(0.5f);
        C1945a1<Integer, C1983k> j = VectorConvertersKt.m8225j(C11324c0.f28435a);
        Float valueOf2 = Float.valueOf(1.0f);
        C1945a1<C16483g, C1983k> e = VectorConvertersKt.m8220e(C16483g.f40871b);
        Float valueOf3 = Float.valueOf(0.1f);
        f5587d = C10977s0.m41456W(C11078d1.m42659a(j, valueOf2), C11078d1.m42659a(VectorConvertersKt.m8223h(C16500q.f40900b), valueOf2), C11078d1.m42659a(VectorConvertersKt.m8222g(C16494m.f40890b), valueOf2), C11078d1.m42659a(VectorConvertersKt.m8224i(C11377x.f28521a), Float.valueOf(0.01f)), C11078d1.m42659a(VectorConvertersKt.m8218c(C15098i.f37261e), valueOf), C11078d1.m42659a(VectorConvertersKt.m8219d(C15104m.f37280b), valueOf), C11078d1.m42659a(VectorConvertersKt.m8217b(C15094f.f37256b), valueOf), C11078d1.m42659a(e, valueOf3), C11078d1.m42659a(VectorConvertersKt.m8221f(C16486i.f40876b), valueOf3));
    }

    /* renamed from: a */
    public static final float m8572a(@C12579k C16483g.C16484a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C16483g.m74435M(0.1f);
    }

    /* renamed from: b */
    public static final int m8573b(@C12579k C11324c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return 1;
    }

    /* renamed from: c */
    public static final long m8574c(@C12579k C15094f.C15095a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C15096g.m64898a(0.5f, 0.5f);
    }

    /* renamed from: d */
    public static final long m8575d(@C12579k C15104m.C15105a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C15106n.m65033a(0.5f, 0.5f);
    }

    /* renamed from: e */
    public static final long m8576e(@C12579k C16486i.C16487a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        C16483g.C16484a aVar2 = C16483g.f40871b;
        return C16485h.m74482a(m8572a(aVar2), m8572a(aVar2));
    }

    /* renamed from: f */
    public static final long m8577f(@C12579k C16494m.C16495a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C16496n.m74593a(1, 1);
    }

    /* renamed from: g */
    public static final long m8578g(@C12579k C16500q.C16501a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C16502r.m74668a(1, 1);
    }

    @C12579k
    /* renamed from: h */
    public static final C15098i m8579h(@C12579k C15098i.C15099a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5586c;
    }

    @C12579k
    /* renamed from: i */
    public static final Map<C1945a1<?, ?>, Float> m8580i() {
        return f5587d;
    }
}
