package androidx.compose.foundation.pager;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.interaction.C2240d;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.foundation.lazy.C2570o;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,455:1\n50#2:456\n49#2:457\n1114#3,6:458\n154#4:464\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n71#1:456\n71#1:457\n71#1:458,6\n408#1:464\n*E\n"})
public final class PagerStateKt {

    /* renamed from: a */
    public static final float f7001a = -0.5f;

    /* renamed from: b */
    public static final float f7002b = 0.5f;
    @C12579k

    /* renamed from: c */
    public static final C11305q<C16479d, Float, Float, Float> f7003c = PagerStateKt$SnapAlignmentStartToStart$1.f7017f;

    /* renamed from: d */
    public static final float f7004d = C16483g.m74435M((float) 56);

    /* renamed from: e */
    public static final int f7005e = 3;
    @C12579k

    /* renamed from: f */
    public static final C2648b f7006f = new C2648b();
    @C12579k

    /* renamed from: g */
    public static final C2649c f7007g = new C2649c();
    @C12579k

    /* renamed from: h */
    public static final C2647a f7008h = new C2647a();

    /* renamed from: i */
    public static final boolean f7009i = false;

    /* renamed from: androidx.compose.foundation.pager.PagerStateKt$a */
    public static final class C2647a implements C2241e {
        @C12579k
        /* renamed from: c */
        public C11907e<C2240d> mo7603c() {
            return C11909g.m47474n0();
        }
    }

    /* renamed from: androidx.compose.foundation.pager.PagerStateKt$b */
    public static final class C2648b implements C2570o {
        @C12579k

        /* renamed from: a */
        public final List<C2517l> f7010a = CollectionsKt__CollectionsKt.m40441E();

        /* renamed from: b */
        public final int f7011b;

        /* renamed from: c */
        public final int f7012c;

        /* renamed from: d */
        public final int f7013d;

        /* renamed from: e */
        public final int f7014e;

        /* renamed from: d */
        public int mo8373d() {
            return this.f7012c;
        }

        /* renamed from: e */
        public int mo8374e() {
            return this.f7013d;
        }

        /* renamed from: g */
        public int mo8376g() {
            return this.f7014e;
        }

        /* renamed from: h */
        public int mo8377h() {
            return this.f7011b;
        }

        @C12579k
        /* renamed from: i */
        public List<C2517l> mo8378i() {
            return this.f7010a;
        }
    }

    /* renamed from: androidx.compose.foundation.pager.PagerStateKt$c */
    public static final class C2649c implements C16479d {

        /* renamed from: a */
        public final float f7015a = 1.0f;

        /* renamed from: b */
        public final float f7016b = 1.0f;

        /* renamed from: R4 */
        public float mo7419R4() {
            return this.f7016b;
        }

        public float getDensity() {
            return this.f7015a;
        }
    }

    @C12580l
    /* renamed from: d */
    public static final Object m11974d(@C12579k PagerState pagerState, @C12579k C11045c<? super C11079d2> cVar) {
        if (pagerState.mo9095w() + 1 >= pagerState.mo9073H()) {
            return C11079d2.f28267a;
        }
        Object r = PagerState.m11928r(pagerState, pagerState.mo9095w() + 1, 0.0f, (C1968g) null, cVar, 6, (Object) null);
        if (r == C11063b.m42612h()) {
            return r;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: e */
    public static final Object m11975e(@C12579k PagerState pagerState, @C12579k C11045c<? super C11079d2> cVar) {
        if (pagerState.mo9095w() - 1 < 0) {
            return C11079d2.f28267a;
        }
        Object r = PagerState.m11928r(pagerState, pagerState.mo9095w() - 1, 0.0f, (C1968g) null, cVar, 6, (Object) null);
        if (r == C11063b.m42612h()) {
            return r;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: f */
    public static final void m11976f(C11289a<String> aVar) {
    }

    /* renamed from: g */
    public static final float m11977g() {
        return f7004d;
    }

    @C12579k
    /* renamed from: h */
    public static final C11305q<C16479d, Float, Float, Float> m11978h() {
        return f7003c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.foundation.C2855v
    @org.jetbrains.annotations.C12579k
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.pager.PagerState m11979i(int r10, float r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13, int r14) {
        /*
            r0 = 144687223(0x89fc077, float:9.614713E-34)
            r12.mo14918M(r0)
            r1 = r14 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000c
            r10 = r2
        L_0x000c:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0011
            r11 = 0
        L_0x0011:
            boolean r14 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r14 == 0) goto L_0x001d
            r14 = -1
            java.lang.String r1 = "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:66)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r14, r1)
        L_0x001d:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            androidx.compose.foundation.pager.PagerState$a r13 = androidx.compose.foundation.pager.PagerState.f6984m
            androidx.compose.runtime.saveable.e r4 = r13.mo9099a()
            r5 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            java.lang.Float r14 = java.lang.Float.valueOf(r11)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.mo14918M(r0)
            boolean r13 = r12.mo15006n0(r13)
            boolean r14 = r12.mo15006n0(r14)
            r13 = r13 | r14
            java.lang.Object r14 = r12.mo14921N()
            if (r13 != 0) goto L_0x004b
            androidx.compose.runtime.o$a r13 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r13 = r13.mo16277a()
            if (r14 != r13) goto L_0x0053
        L_0x004b:
            androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1 r14 = new androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
            r14.<init>(r10, r11)
            r12.mo14893C(r14)
        L_0x0053:
            r12.mo15002m0()
            r6 = r14
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            r8 = 72
            r9 = 4
            r7 = r12
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.pager.PagerState r10 = (androidx.compose.foundation.pager.PagerState) r10
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x006c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x006c:
            r12.mo15002m0()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerStateKt.m11979i(int, float, androidx.compose.runtime.o, int, int):androidx.compose.foundation.pager.PagerState");
    }
}
