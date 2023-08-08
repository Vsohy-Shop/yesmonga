package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,157:1\n83#2,3:158\n1114#3,6:161\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n47#1:158,3\n47#1:161,6\n*E\n"})
public final class LazyStaggeredGridMeasurePolicyKt {

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$a */
    public /* synthetic */ class C2588a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.C2588a.<clinit>():void");
        }
    }

    /* renamed from: d */
    public static final float m11659d(C2366i0 i0Var, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = C2588a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                return PaddingKt.m10022i(i0Var, layoutDirection);
            } else {
                return PaddingKt.m10021h(i0Var, layoutDirection);
            }
        } else if (z) {
            return i0Var.mo8093d();
        } else {
            return i0Var.mo8090a();
        }
    }

    /* renamed from: e */
    public static final float m11660e(C2366i0 i0Var, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = C2588a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                return PaddingKt.m10021h(i0Var, layoutDirection);
            } else {
                return PaddingKt.m10022i(i0Var, layoutDirection);
            }
        } else if (z) {
            return i0Var.mo8090a();
        } else {
            return i0Var.mo8093d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007c, code lost:
        if (r0 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x007e;
     */
    @androidx.compose.runtime.C8540g
    @androidx.compose.foundation.C2855v
    @org.jetbrains.annotations.C12579k
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.C11304p<androidx.compose.foundation.lazy.layout.C2552k, androidx.compose.p004ui.unit.C16476b, androidx.compose.foundation.lazy.staggeredgrid.C2604l> m11661f(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r11, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.staggeredgrid.C2597f r12, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r13, boolean r14, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.Orientation r15, float r16, float r17, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.unit.C16479d, ? super androidx.compose.p004ui.unit.C16476b, int[]> r18, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r19, int r20) {
        /*
            r3 = r11
            r4 = r12
            r5 = r13
            r1 = r15
            r2 = r18
            r9 = r19
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "itemProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "slotSizesSums"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1305398815(0x4dcece1f, float:4.33701856E8)
            r9.mo14918M(r0)
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x0035
            r6 = -1
            java.lang.String r7 = "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:37)"
            r8 = r20
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r6, r7)
        L_0x0035:
            r0 = 8
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r7 = 0
            r6[r7] = r3
            r8 = 1
            r6[r8] = r4
            r8 = 2
            r6[r8] = r5
            r8 = 3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r14)
            r6[r8] = r10
            r8 = 4
            r6[r8] = r1
            r8 = 5
            androidx.compose.ui.unit.g r10 = androidx.compose.p004ui.unit.C16483g.m74451w(r16)
            r6[r8] = r10
            r8 = 6
            androidx.compose.ui.unit.g r10 = androidx.compose.p004ui.unit.C16483g.m74451w(r17)
            r6[r8] = r10
            r8 = 7
            r6[r8] = r2
            r8 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r9.mo14918M(r8)
            r8 = r7
        L_0x0064:
            if (r7 >= r0) goto L_0x0070
            r10 = r6[r7]
            boolean r10 = r9.mo15006n0(r10)
            r8 = r8 | r10
            int r7 = r7 + 1
            goto L_0x0064
        L_0x0070:
            java.lang.Object r0 = r19.mo14921N()
            if (r8 != 0) goto L_0x007e
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r0 != r6) goto L_0x0092
        L_0x007e:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 r10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
            r0 = r10
            r1 = r15
            r2 = r18
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo14893C(r10)
        L_0x0092:
            r19.mo15002m0()
            kotlin.jvm.functions.p r0 = (kotlin.jvm.functions.C11304p) r0
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00a0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00a0:
            r19.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.m11661f(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.lazy.staggeredgrid.f, androidx.compose.foundation.layout.i0, boolean, androidx.compose.foundation.gestures.Orientation, float, float, kotlin.jvm.functions.p, androidx.compose.runtime.o, int):kotlin.jvm.functions.p");
    }

    /* renamed from: g */
    public static final float m11662g(C2366i0 i0Var, Orientation orientation, LayoutDirection layoutDirection) {
        int i = C2588a.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            return PaddingKt.m10022i(i0Var, layoutDirection);
        }
        if (i == 2) {
            return i0Var.mo8093d();
        }
        throw new NoWhenBranchMatchedException();
    }
}
