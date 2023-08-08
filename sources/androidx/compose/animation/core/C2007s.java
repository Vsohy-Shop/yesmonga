package androidx.compose.animation.core;

import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n103#1:113\n107#1:119\n103#1:123\n103#1:134\n35#2,2:114\n72#2,3:116\n66#2,3:120\n35#2,2:124\n72#2,3:126\n35#2,2:129\n66#2,3:131\n35#2,2:135\n54#2,3:137\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n86#1:113\n87#1:119\n87#1:123\n107#1:134\n86#1:114,2\n86#1:116,3\n87#1:120,3\n87#1:124,2\n87#1:126,3\n103#1:129,2\n107#1:131,3\n107#1:135,2\n111#1:137,3\n*E\n"})
/* renamed from: androidx.compose.animation.core.s */
public final class C2007s {
    @C12579k
    /* renamed from: a */
    public static final Pair<C2005r, C2005r> m8609a(double d, double d2, double d3) {
        double d4 = -d2;
        double d5 = (d2 * d2) - ((4.0d * d) * d3);
        C2005r b = m8610b(d5);
        b.f5593a = b.f5593a + d4;
        double d6 = d * 2.0d;
        b.f5593a = b.f5593a / d6;
        b.f5594b = b.f5594b / d6;
        C2005r b2 = m8610b(d5);
        double d7 = (double) -1;
        b2.f5593a = b2.f5593a * d7;
        b2.f5594b = b2.f5594b * d7;
        b2.f5593a = b2.f5593a + d4;
        b2.f5593a = b2.f5593a / d6;
        b2.f5594b = b2.f5594b / d6;
        return C11078d1.m42659a(b, b2);
    }

    @C12579k
    /* renamed from: b */
    public static final C2005r m8610b(double d) {
        if (d < 0.0d) {
            return new C2005r(0.0d, Math.sqrt(Math.abs(d)));
        }
        return new C2005r(Math.sqrt(d), 0.0d);
    }

    @C12579k
    /* renamed from: c */
    public static final C2005r m8611c(double d, @C12579k C2005r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "other");
        double d2 = (double) -1;
        rVar.f5593a = rVar.f5593a * d2;
        rVar.f5594b = rVar.f5594b * d2;
        rVar.f5593a = rVar.f5593a + d;
        return rVar;
    }

    @C12579k
    /* renamed from: d */
    public static final C2005r m8612d(double d, @C12579k C2005r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "other");
        rVar.f5593a = rVar.f5593a + d;
        return rVar;
    }

    @C12579k
    /* renamed from: e */
    public static final C2005r m8613e(double d, @C12579k C2005r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "other");
        rVar.f5593a = rVar.f5593a * d;
        rVar.f5594b = rVar.f5594b * d;
        return rVar;
    }
}
