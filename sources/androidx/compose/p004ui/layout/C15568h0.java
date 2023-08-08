package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.node.C15694i0;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.unit.C16489j;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.collections.C10977s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.h0 */
public interface C15568h0 extends C15583m {

    /* renamed from: androidx.compose.ui.layout.h0$a */
    public static final class C15569a {
        @Deprecated
        @C12579k
        /* renamed from: a */
        public static C15564g0 m69209a(@C12579k C15568h0 h0Var, int i, int i2, @C12579k Map<C15531a, Integer> map, @C12579k C11300l<? super C15611w0.C15612a, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(map, "alignmentLines");
            Intrinsics.checkNotNullParameter(lVar, "placementBlock");
            return C15568h0.super.mo8741C3(i, i2, map, lVar);
        }

        @C8547h2
        @Deprecated
        /* renamed from: c */
        public static int m69211c(@C12579k C15568h0 h0Var, long j) {
            return C15568h0.super.mo7433u5(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: d */
        public static int m69212d(@C12579k C15568h0 h0Var, float f) {
            return C15568h0.super.mo7429n2(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: e */
        public static float m69213e(@C12579k C15568h0 h0Var, long j) {
            return C15568h0.super.mo7430q(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: f */
        public static float m69214f(@C12579k C15568h0 h0Var, float f) {
            return C15568h0.super.mo7418M(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: g */
        public static float m69215g(@C12579k C15568h0 h0Var, int i) {
            return C15568h0.super.mo7416L(i);
        }

        @C8547h2
        @Deprecated
        /* renamed from: h */
        public static long m69216h(@C12579k C15568h0 h0Var, long j) {
            return C15568h0.super.mo7428n(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: i */
        public static float m69217i(@C12579k C15568h0 h0Var, long j) {
            return C15568h0.super.mo7415C2(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: j */
        public static float m69218j(@C12579k C15568h0 h0Var, float f) {
            return C15568h0.super.mo7425g5(f);
        }

        @C8547h2
        @Deprecated
        @C12579k
        /* renamed from: k */
        public static C15098i m69219k(@C12579k C15568h0 h0Var, @C12579k C16489j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "$receiver");
            return C15568h0.super.mo7417L4(jVar);
        }

        @C8547h2
        @Deprecated
        /* renamed from: l */
        public static long m69220l(@C12579k C15568h0 h0Var, long j) {
            return C15568h0.super.mo7420V(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: m */
        public static long m69221m(@C12579k C15568h0 h0Var, float f) {
            return C15568h0.super.mo7427m(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: n */
        public static long m69222n(@C12579k C15568h0 h0Var, float f) {
            return C15568h0.super.mo7432u(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: o */
        public static long m69223o(@C12579k C15568h0 h0Var, int i) {
            return C15568h0.super.mo7431t(i);
        }
    }

    @C11363r0({"SMAP\nMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n+ 2 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n*L\n1#1,61:1\n360#2,15:62\n*S KotlinDebug\n*F\n+ 1 MeasureScope.kt\nandroidx/compose/ui/layout/MeasureScope$layout$1\n*L\n52#1:62,15\n*E\n"})
    /* renamed from: androidx.compose.ui.layout.h0$b */
    public static final class C15570b implements C15564g0 {

        /* renamed from: a */
        public final int f38720a;

        /* renamed from: b */
        public final int f38721b;
        @C12579k

        /* renamed from: c */
        public final Map<C15531a, Integer> f38722c;

        /* renamed from: d */
        public final /* synthetic */ int f38723d;

        /* renamed from: e */
        public final /* synthetic */ C15568h0 f38724e;

        /* renamed from: f */
        public final /* synthetic */ C11300l<C15611w0.C15612a, C11079d2> f38725f;

        public C15570b(int i, int i2, Map<C15531a, Integer> map, C15568h0 h0Var, C11300l<? super C15611w0.C15612a, C11079d2> lVar) {
            this.f38723d = i;
            this.f38724e = h0Var;
            this.f38725f = lVar;
            this.f38720a = i;
            this.f38721b = i2;
            this.f38722c = map;
        }

        public int getHeight() {
            return this.f38721b;
        }

        public int getWidth() {
            return this.f38720a;
        }

        @C12579k
        /* renamed from: w */
        public Map<C15531a, Integer> mo8593w() {
            return this.f38722c;
        }

        /* renamed from: x */
        public void mo8594x() {
            C15694i0 i0Var;
            C15611w0.C15612a.C15613a aVar = C15611w0.C15612a.f38749a;
            int i = this.f38723d;
            LayoutDirection layoutDirection = this.f38724e.getLayoutDirection();
            C15568h0 h0Var = this.f38724e;
            if (h0Var instanceof C15694i0) {
                i0Var = (C15694i0) h0Var;
            } else {
                i0Var = null;
            }
            C11300l<C15611w0.C15612a, C11079d2> lVar = this.f38725f;
            C15588o f = C15611w0.C15612a.f38753e;
            int I = aVar.mo44480n();
            LayoutDirection H = aVar.mo44479m();
            LayoutNodeLayoutDelegate a = C15611w0.C15612a.f38754f;
            C15611w0.C15612a.f38752d = i;
            C15611w0.C15612a.f38751c = layoutDirection;
            boolean G = aVar.mo44488J(i0Var);
            lVar.invoke(aVar);
            if (i0Var != null) {
                i0Var.mo45024r1(G);
            }
            C15611w0.C15612a.f38752d = I;
            C15611w0.C15612a.f38751c = H;
            C15611w0.C15612a.f38753e = f;
            C15611w0.C15612a.f38754f = a;
        }
    }

    /* renamed from: r2 */
    static /* synthetic */ C15564g0 m69206r2(C15568h0 h0Var, int i, int i2, Map map, C11300l lVar, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                map = C10977s0.m41492z();
            }
            return h0Var.mo8741C3(i, i2, map, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    @C12579k
    /* renamed from: C3 */
    C15564g0 mo8741C3(int i, int i2, @C12579k Map<C15531a, Integer> map, @C12579k C11300l<? super C15611w0.C15612a, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(map, "alignmentLines");
        Intrinsics.checkNotNullParameter(lVar, "placementBlock");
        return new C15570b(i, i2, map, this, lVar);
    }
}
