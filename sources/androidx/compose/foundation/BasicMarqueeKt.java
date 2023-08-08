package androidx.compose.foundation;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2016w0;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,417:1\n135#2:418\n1#3:419\n154#4:420\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n142#1:418\n91#1:420\n*E\n"})
public final class BasicMarqueeKt {

    /* renamed from: a */
    public static final int f5723a = 3;

    /* renamed from: b */
    public static final int f5724b = 1200;
    @C12579k

    /* renamed from: c */
    public static final C2124g0 f5725c = C2124g0.f5820a.mo7314a(0.33333334f);

    /* renamed from: d */
    public static final float f5726d = C16483g.m74435M((float) 30);

    /* renamed from: androidx.compose.foundation.BasicMarqueeKt$a */
    public static final class C2052a implements C2124g0 {

        /* renamed from: b */
        public final /* synthetic */ float f5727b;

        public C2052a(float f) {
            this.f5727b = f;
        }

        /* renamed from: a */
        public final int mo7127a(@C12579k C16479d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(dVar, "$this$MarqueeSpacing");
            return dVar.mo7429n2(this.f5727b);
        }
    }

    @C2855v
    @C12579k
    /* renamed from: a */
    public static final C2124g0 m8828a(float f) {
        return new C2052a(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v3, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.C2855v
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m8830c(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r9, int r10, int r11, int r12, int r13, @org.jetbrains.annotations.C12579k androidx.compose.foundation.C2124g0 r14, float r15) {
        /*
            java.lang.String r0 = "$this$basicMarquee"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "spacing"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r0 == 0) goto L_0x001d
            androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0021
        L_0x001d:
            kotlin.jvm.functions.l r0 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0021:
            androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2 r8 = new androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2
            r1 = r8
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = r14
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.m r9 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r9, r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicMarqueeKt.m8830c(androidx.compose.ui.m, int, int, int, int, androidx.compose.foundation.g0, float):androidx.compose.ui.m");
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m8831d(C8767m mVar, int i, int i2, int i3, int i4, C2124g0 g0Var, float f, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = f5723a;
        }
        if ((i5 & 2) != 0) {
            i2 = C2120f0.f5809b.mo7307a();
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = f5724b;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            if (C2120f0.m9149f(i6, C2120f0.f5809b.mo7307a())) {
                i4 = i7;
            } else {
                i4 = 0;
            }
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            g0Var = f5725c;
        }
        C2124g0 g0Var2 = g0Var;
        if ((i5 & 32) != 0) {
            f = f5726d;
        }
        return m8830c(mVar, i, i6, i7, i8, g0Var2, f);
    }

    /* renamed from: e */
    public static final C1968g<Float> m8832e(int i, float f, int i2, int i3, float f2, C16479d dVar) {
        C2023z0<Float> n = m8841n(Math.abs(dVar.mo7425g5(f2)), f, i3);
        long d = C2016w0.m8646d((-i3) + i2, 0, 2, (DefaultConstructorMarker) null);
        if (i == Integer.MAX_VALUE) {
            return C1972h.m8381f(n, (RepeatMode) null, d, 2, (Object) null);
        }
        return C1972h.m8386k(i, n, (RepeatMode) null, d, 4, (Object) null);
    }

    @C2855v
    /* renamed from: f */
    public static final int m8833f() {
        return f5724b;
    }

    @C2855v
    /* renamed from: g */
    public static /* synthetic */ void m8834g() {
    }

    @C2855v
    /* renamed from: h */
    public static final int m8835h() {
        return f5723a;
    }

    @C2855v
    /* renamed from: i */
    public static /* synthetic */ void m8836i() {
    }

    @C2855v
    @C12579k
    /* renamed from: j */
    public static final C2124g0 m8837j() {
        return f5725c;
    }

    @C2855v
    /* renamed from: k */
    public static /* synthetic */ void m8838k() {
    }

    @C2855v
    /* renamed from: l */
    public static final float m8839l() {
        return f5726d;
    }

    @C2855v
    /* renamed from: m */
    public static /* synthetic */ void m8840m() {
    }

    /* renamed from: n */
    public static final C2023z0<Float> m8841n(float f, float f2, int i) {
        return C1972h.m8391p((int) ((float) Math.ceil((double) (f2 / (f / 1000.0f)))), i, C1947b0.m8291c());
    }
}
