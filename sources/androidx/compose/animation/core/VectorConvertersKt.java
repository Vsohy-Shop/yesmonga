package androidx.compose.animation.core;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16486i;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11324c0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class VectorConvertersKt {
    @C12579k

    /* renamed from: a */
    public static final C1945a1<Float, C1983k> f5393a = m8216a(VectorConvertersKt$FloatToVector$1.f5406f, VectorConvertersKt$FloatToVector$2.f5407f);
    @C12579k

    /* renamed from: b */
    public static final C1945a1<Integer, C1983k> f5394b = m8216a(VectorConvertersKt$IntToVector$1.f5412f, VectorConvertersKt$IntToVector$2.f5413f);
    @C12579k

    /* renamed from: c */
    public static final C1945a1<C16483g, C1983k> f5395c = m8216a(VectorConvertersKt$DpToVector$1.f5404f, VectorConvertersKt$DpToVector$2.f5405f);
    @C12579k

    /* renamed from: d */
    public static final C1945a1<C16486i, C1986l> f5396d = m8216a(VectorConvertersKt$DpOffsetToVector$1.f5402f, VectorConvertersKt$DpOffsetToVector$2.f5403f);
    @C12579k

    /* renamed from: e */
    public static final C1945a1<C15104m, C1986l> f5397e = m8216a(VectorConvertersKt$SizeToVector$1.f5418f, VectorConvertersKt$SizeToVector$2.f5419f);
    @C12579k

    /* renamed from: f */
    public static final C1945a1<C15094f, C1986l> f5398f = m8216a(VectorConvertersKt$OffsetToVector$1.f5414f, VectorConvertersKt$OffsetToVector$2.f5415f);
    @C12579k

    /* renamed from: g */
    public static final C1945a1<C16494m, C1986l> f5399g = m8216a(VectorConvertersKt$IntOffsetToVector$1.f5408f, VectorConvertersKt$IntOffsetToVector$2.f5409f);
    @C12579k

    /* renamed from: h */
    public static final C1945a1<C16500q, C1986l> f5400h = m8216a(VectorConvertersKt$IntSizeToVector$1.f5410f, VectorConvertersKt$IntSizeToVector$2.f5411f);
    @C12579k

    /* renamed from: i */
    public static final C1945a1<C15098i, C1994n> f5401i = m8216a(VectorConvertersKt$RectToVector$1.f5416f, VectorConvertersKt$RectToVector$2.f5417f);

    @C12579k
    /* renamed from: a */
    public static final <T, V extends C1997o> C1945a1<T, V> m8216a(@C12579k C11300l<? super T, ? extends V> lVar, @C12579k C11300l<? super V, ? extends T> lVar2) {
        Intrinsics.checkNotNullParameter(lVar, "convertToVector");
        Intrinsics.checkNotNullParameter(lVar2, "convertFromVector");
        return new C1949b1(lVar, lVar2);
    }

    @C12579k
    /* renamed from: b */
    public static final C1945a1<C15094f, C1986l> m8217b(@C12579k C15094f.C15095a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5398f;
    }

    @C12579k
    /* renamed from: c */
    public static final C1945a1<C15098i, C1994n> m8218c(@C12579k C15098i.C15099a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5401i;
    }

    @C12579k
    /* renamed from: d */
    public static final C1945a1<C15104m, C1986l> m8219d(@C12579k C15104m.C15105a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5397e;
    }

    @C12579k
    /* renamed from: e */
    public static final C1945a1<C16483g, C1983k> m8220e(@C12579k C16483g.C16484a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5395c;
    }

    @C12579k
    /* renamed from: f */
    public static final C1945a1<C16486i, C1986l> m8221f(@C12579k C16486i.C16487a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5396d;
    }

    @C12579k
    /* renamed from: g */
    public static final C1945a1<C16494m, C1986l> m8222g(@C12579k C16494m.C16495a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5399g;
    }

    @C12579k
    /* renamed from: h */
    public static final C1945a1<C16500q, C1986l> m8223h(@C12579k C16500q.C16501a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f5400h;
    }

    @C12579k
    /* renamed from: i */
    public static final C1945a1<Float, C1983k> m8224i(@C12579k C11377x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return f5393a;
    }

    @C12579k
    /* renamed from: j */
    public static final C1945a1<Integer, C1983k> m8225j(@C12579k C11324c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return f5394b;
    }

    /* renamed from: k */
    public static final float m8226k(float f, float f2, float f3) {
        return (f * (((float) 1) - f3)) + (f2 * f3);
    }
}
