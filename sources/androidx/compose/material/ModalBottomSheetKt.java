package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n474#2,4:685\n478#2,2:693\n482#2:699\n25#3:689\n50#3:700\n49#3:701\n36#3:709\n50#3:716\n49#3:717\n50#3:724\n49#3:725\n1114#4,3:690\n1117#4,3:696\n1114#4,6:702\n1114#4,6:710\n1114#4,6:718\n1114#4,6:726\n474#5:695\n646#6:708\n76#7:732\n154#8:733\n154#8:734\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n443#1:685,4\n443#1:693,2\n443#1:699\n443#1:689\n445#1:700\n445#1:701\n561#1:709\n562#1:716\n562#1:717\n574#1:724\n574#1:725\n443#1:690,3\n443#1:696,3\n445#1:702,6\n561#1:710,6\n562#1:718,6\n574#1:726,6\n443#1:695\n553#1:708\n554#1:732\n682#1:733\n683#1:734\n*E\n"})
public final class ModalBottomSheetKt {
    @C12579k

    /* renamed from: a */
    public static final C11304p<C16479d, Float, Float> f7707a = ModalBottomSheetKt$PositionalThreshold$1.f7716f;

    /* renamed from: b */
    public static final float f7708b = C16483g.m74435M((float) 125);

    /* renamed from: c */
    public static final float f7709c = C16483g.m74435M((float) 640);

    /* renamed from: androidx.compose.material.ModalBottomSheetKt$a */
    public static final class C2943a implements C3025a<ModalBottomSheetValue> {

        /* renamed from: a */
        public final /* synthetic */ ModalBottomSheetState f7710a;

        /* renamed from: b */
        public final /* synthetic */ C11304p<ModalBottomSheetValue, Float, C11079d2> f7711b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<ModalBottomSheetValue, C11079d2> f7712c;

        /* renamed from: androidx.compose.material.ModalBottomSheetKt$a$a */
        public /* synthetic */ class C2944a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    androidx.compose.material.ModalBottomSheetValue[] r0 = androidx.compose.material.ModalBottomSheetValue.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.HalfExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.C2943a.C2944a.<clinit>():void");
            }
        }

        public C2943a(ModalBottomSheetState modalBottomSheetState, C11304p<? super ModalBottomSheetValue, ? super Float, C11079d2> pVar, C11300l<? super ModalBottomSheetValue, C11079d2> lVar) {
            this.f7710a = modalBottomSheetState;
            this.f7711b = pVar;
            this.f7712c = lVar;
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map, java.lang.Object, java.util.Map<androidx.compose.material.ModalBottomSheetValue, java.lang.Float>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo10032a(@org.jetbrains.annotations.C12579k androidx.compose.material.ModalBottomSheetValue r2, @org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.material.ModalBottomSheetValue, java.lang.Float> r3, @org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.material.ModalBottomSheetValue, java.lang.Float> r4) {
            /*
                r1 = this;
                java.lang.String r0 = "previousTarget"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "previousAnchors"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "newAnchors"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.Object r3 = r3.get(r2)
                java.lang.Float r3 = (java.lang.Float) r3
                int[] r0 = androidx.compose.material.ModalBottomSheetKt.C2943a.C2944a.$EnumSwitchMapping$0
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L_0x0042
                r0 = 2
                if (r2 == r0) goto L_0x002d
                r0 = 3
                if (r2 != r0) goto L_0x0027
                goto L_0x002d
            L_0x0027:
                kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                r2.<init>()
                throw r2
            L_0x002d:
                androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.HalfExpanded
                boolean r0 = r4.containsKey(r2)
                if (r0 == 0) goto L_0x0036
                goto L_0x0044
            L_0x0036:
                androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Expanded
                boolean r0 = r4.containsKey(r2)
                if (r0 == 0) goto L_0x003f
                goto L_0x0044
            L_0x003f:
                androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Hidden
                goto L_0x0044
            L_0x0042:
                androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Hidden
            L_0x0044:
                java.lang.Object r4 = kotlin.collections.C10977s0.m41443K(r4, r2)
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((float) r4, (java.lang.Float) r3)
                if (r3 != 0) goto L_0x0071
                androidx.compose.material.ModalBottomSheetState r3 = r1.f7710a
                boolean r3 = r3.mo10292l()
                if (r3 == 0) goto L_0x006c
                kotlin.jvm.functions.p<androidx.compose.material.ModalBottomSheetValue, java.lang.Float, kotlin.d2> r3 = r1.f7711b
                androidx.compose.material.ModalBottomSheetState r4 = r1.f7710a
                float r4 = r4.mo10287g()
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r3.invoke(r2, r4)
                goto L_0x0071
            L_0x006c:
                kotlin.jvm.functions.l<androidx.compose.material.ModalBottomSheetValue, kotlin.d2> r3 = r1.f7712c
                r3.invoke(r2)
            L_0x0071:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.C2943a.mo10032a(androidx.compose.material.ModalBottomSheetValue, java.util.Map, java.util.Map):void");
        }
    }

    /* renamed from: a */
    public static final C15446a m13580a(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
        return new C2945x58e3e91b(swipeableV2State, orientation);
    }

    /* renamed from: b */
    public static final C3025a<ModalBottomSheetValue> m13581b(ModalBottomSheetState modalBottomSheetState, C11304p<? super ModalBottomSheetValue, ? super Float, C11079d2> pVar, C11300l<? super ModalBottomSheetValue, C11079d2> lVar) {
        return new C2943a(modalBottomSheetState, pVar, lVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011b  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13582c(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r34, @org.jetbrains.annotations.C12580l androidx.compose.material.ModalBottomSheetState r35, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r36, float r37, long r38, long r40, long r42, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r45, int r46, int r47) {
        /*
            r15 = r33
            r14 = r44
            r12 = r46
            r13 = r47
            java.lang.String r0 = "sheetContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1633763156(0xffffffff9e9ec0ac, float:-1.6808588E-20)
            r1 = r45
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r13 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0023
            r1 = r12 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0032
            boolean r1 = r11.mo14927P(r15)
            if (r1 == 0) goto L_0x002f
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = 2
        L_0x0030:
            r1 = r1 | r12
            goto L_0x0033
        L_0x0032:
            r1 = r12
        L_0x0033:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004d
        L_0x003a:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r34
            boolean r5 = r11.mo15006n0(r4)
            if (r5 == 0) goto L_0x0049
            r5 = 32
            goto L_0x004b
        L_0x0049:
            r5 = 16
        L_0x004b:
            r1 = r1 | r5
            goto L_0x004f
        L_0x004d:
            r4 = r34
        L_0x004f:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x0055
            r1 = r1 | 128(0x80, float:1.794E-43)
        L_0x0055:
            r6 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x006c
            r6 = r13 & 8
            r8 = r36
            if (r6 != 0) goto L_0x0068
            boolean r6 = r11.mo15006n0(r8)
            if (r6 == 0) goto L_0x0068
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r1 = r1 | r6
            goto L_0x006e
        L_0x006c:
            r8 = r36
        L_0x006e:
            r9 = r13 & 16
            if (r9 == 0) goto L_0x0077
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r10 = r37
            goto L_0x008b
        L_0x0077:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r12
            r10 = r37
            if (r6 != 0) goto L_0x008b
            boolean r6 = r11.mo14968d(r10)
            if (r6 == 0) goto L_0x0088
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008a
        L_0x0088:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x008a:
            r1 = r1 | r6
        L_0x008b:
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x00a6
            r6 = r13 & 32
            if (r6 != 0) goto L_0x009f
            r6 = r38
            boolean r16 = r11.mo14980g(r6)
            if (r16 == 0) goto L_0x00a1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a3
        L_0x009f:
            r6 = r38
        L_0x00a1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a3:
            r1 = r1 | r16
            goto L_0x00a8
        L_0x00a6:
            r6 = r38
        L_0x00a8:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x00c1
            r16 = r13 & 64
            r7 = r40
            if (r16 != 0) goto L_0x00bd
            boolean r6 = r11.mo14980g(r7)
            if (r6 == 0) goto L_0x00bd
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bf
        L_0x00bd:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00bf:
            r1 = r1 | r6
            goto L_0x00c3
        L_0x00c1:
            r7 = r40
        L_0x00c3:
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x00db
            r6 = r13 & 128(0x80, float:1.794E-43)
            r7 = r42
            if (r6 != 0) goto L_0x00d7
            boolean r6 = r11.mo14980g(r7)
            if (r6 == 0) goto L_0x00d7
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00d9
        L_0x00d7:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x00d9:
            r1 = r1 | r6
            goto L_0x00dd
        L_0x00db:
            r7 = r42
        L_0x00dd:
            r6 = r13 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x00e5
            r6 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00e3:
            r1 = r1 | r6
            goto L_0x00f6
        L_0x00e5:
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x00f6
            boolean r6 = r11.mo14927P(r14)
            if (r6 == 0) goto L_0x00f3
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00e3
        L_0x00f3:
            r6 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00e3
        L_0x00f6:
            r6 = r1
            if (r5 != r2) goto L_0x011b
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r1 & r6
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r2) goto L_0x011b
            boolean r1 = r11.mo15011p()
            if (r1 != 0) goto L_0x0109
            goto L_0x011b
        L_0x0109:
            r11.mo14958a0()
            r3 = r35
            r19 = r4
            r5 = r10
            r2 = r11
            r4 = r36
            r10 = r7
            r6 = r38
            r8 = r40
            goto L_0x02c5
        L_0x011b:
            r11.mo14930Q()
            r1 = r12 & 1
            r16 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r1 == 0) goto L_0x0162
            boolean r1 = r11.mo14977f0()
            if (r1 == 0) goto L_0x0132
            goto L_0x0162
        L_0x0132:
            r11.mo14958a0()
            if (r5 == 0) goto L_0x0139
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0139:
            r1 = r13 & 8
            if (r1 == 0) goto L_0x013f
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013f:
            r1 = r13 & 32
            if (r1 == 0) goto L_0x0145
            r6 = r6 & r18
        L_0x0145:
            r1 = r13 & 64
            if (r1 == 0) goto L_0x014b
            r6 = r6 & r17
        L_0x014b:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0151
            r6 = r6 & r16
        L_0x0151:
            r16 = r36
            r20 = r38
            r23 = r40
            r19 = r4
            r9 = r6
            r25 = r7
            r17 = r10
            r10 = r35
            goto L_0x01ed
        L_0x0162:
            if (r3 == 0) goto L_0x0169
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r19 = r1
            goto L_0x016b
        L_0x0169:
            r19 = r4
        L_0x016b:
            if (r5 == 0) goto L_0x0183
            androidx.compose.material.ModalBottomSheetValue r1 = androidx.compose.material.ModalBottomSheetValue.Hidden
            r2 = 0
            r3 = 0
            r4 = 0
            r20 = 6
            r21 = 14
            r5 = r11
            r0 = r6
            r6 = r20
            r7 = r21
            androidx.compose.material.ModalBottomSheetState r1 = m13595p(r1, r2, r3, r4, r5, r6, r7)
            r6 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0186
        L_0x0183:
            r0 = r6
            r1 = r35
        L_0x0186:
            r0 = r13 & 8
            r2 = 6
            if (r0 == 0) goto L_0x0198
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.f1 r0 = r0.mo11076b(r11, r2)
            androidx.compose.foundation.shape.e r0 = r0.mo10756c()
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x019a
        L_0x0198:
            r0 = r36
        L_0x019a:
            if (r9 == 0) goto L_0x01a3
            androidx.compose.material.v0 r3 = androidx.compose.material.C7940v0.f19087a
            float r3 = r3.mo11082a()
            goto L_0x01a4
        L_0x01a3:
            r3 = r10
        L_0x01a4:
            r4 = r13 & 32
            if (r4 == 0) goto L_0x01b5
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r4 = r4.mo11075a(r11, r2)
            long r4 = r4.mo10975n()
            r6 = r6 & r18
            goto L_0x01b7
        L_0x01b5:
            r4 = r38
        L_0x01b7:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x01c6
            int r7 = r6 >> 15
            r7 = r7 & 14
            long r7 = androidx.compose.material.ColorsKt.m13381b(r4, r11, r7)
            r6 = r6 & r17
            goto L_0x01c8
        L_0x01c6:
            r7 = r40
        L_0x01c8:
            r9 = r13 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01e1
            androidx.compose.material.v0 r9 = androidx.compose.material.C7940v0.f19087a
            long r9 = r9.mo11083b(r11, r2)
            r6 = r6 & r16
            r16 = r0
            r17 = r3
            r20 = r4
            r23 = r7
            r25 = r9
            r10 = r1
            r9 = r6
            goto L_0x01ed
        L_0x01e1:
            r25 = r42
            r16 = r0
            r10 = r1
            r17 = r3
            r20 = r4
            r9 = r6
            r23 = r7
        L_0x01ed:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01ff
            r0 = -1
            java.lang.String r1 = "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:430)"
            r2 = -1633763156(0xffffffff9e9ec0ac, float:-1.6808588E-20)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r9, r0, r1)
        L_0x01ff:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r11.mo14918M(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r0 = r11.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r1.mo16277a()
            if (r0 != r2) goto L_0x0226
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r0 = androidx.compose.runtime.EffectsKt.m29901m(r0, r11)
            androidx.compose.runtime.w r2 = new androidx.compose.runtime.w
            r2.<init>(r0)
            r11.mo14893C(r2)
            r0 = r2
        L_0x0226:
            r11.mo15002m0()
            androidx.compose.runtime.w r0 = (androidx.compose.runtime.C8690w) r0
            kotlinx.coroutines.o0 r7 = r0.mo16831a()
            r11.mo15002m0()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo14918M(r0)
            boolean r0 = r11.mo15006n0(r10)
            boolean r3 = r11.mo15006n0(r7)
            r0 = r0 | r3
            java.lang.Object r3 = r11.mo14921N()
            if (r0 != 0) goto L_0x024f
            java.lang.Object r0 = r1.mo16277a()
            if (r3 != r0) goto L_0x0260
        L_0x024f:
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1 r0 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$1
            r0.<init>(r7, r10)
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2 r1 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$anchorChangeHandler$1$2
            r1.<init>(r7, r10)
            androidx.compose.material.a r3 = m13581b(r10, r0, r1)
            r11.mo14893C(r3)
        L_0x0260:
            r11.mo15002m0()
            androidx.compose.material.a r3 = (androidx.compose.material.C3025a) r3
            r18 = 0
            r22 = 0
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1 r8 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
            r0 = r8
            r1 = r10
            r4 = r16
            r5 = r20
            r27 = r7
            r28 = r8
            r7 = r23
            r29 = r9
            r9 = r17
            r30 = r10
            r10 = r29
            r31 = r11
            r11 = r44
            r12 = r25
            r14 = r27
            r15 = r33
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r14, r15)
            r0 = 1607356310(0x5fce4f96, float:2.9732532E19)
            r1 = 1
            r3 = r28
            r2 = r31
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r0, r1, r3)
            int r1 = r29 >> 3
            r1 = r1 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r3 = 6
            r34 = r19
            r35 = r18
            r36 = r22
            r37 = r0
            r38 = r2
            r39 = r1
            r40 = r3
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m9860a(r34, r35, r36, r37, r38, r39, r40)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02b9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02b9:
            r4 = r16
            r5 = r17
            r6 = r20
            r8 = r23
            r10 = r25
            r3 = r30
        L_0x02c5:
            androidx.compose.runtime.t1 r15 = r2.mo15020s()
            if (r15 != 0) goto L_0x02cc
            goto L_0x02e3
        L_0x02cc:
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2 r14 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
            r0 = r14
            r1 = r33
            r2 = r19
            r12 = r44
            r13 = r46
            r32 = r14
            r14 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r13, r14)
            r0 = r32
            r15.mo15202a(r0)
        L_0x02e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m13582c(kotlin.jvm.functions.q, androidx.compose.ui.m, androidx.compose.material.ModalBottomSheetState, androidx.compose.ui.graphics.g4, float, long, long, long, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C3044g0
    @C12579k
    /* renamed from: d */
    public static final ModalBottomSheetState m13583d(@C12579k ModalBottomSheetValue modalBottomSheetValue, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super ModalBottomSheetValue, Boolean> lVar, boolean z) {
        Intrinsics.checkNotNullParameter(modalBottomSheetValue, "initialValue");
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmValueChange");
        return new ModalBottomSheetState(modalBottomSheetValue, gVar, z, lVar);
    }

    /* renamed from: e */
    public static /* synthetic */ ModalBottomSheetState m13584e(ModalBottomSheetValue modalBottomSheetValue, C1968g gVar, C11300l lVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = C7885n1.f18885a.mo10889a();
        }
        if ((i & 4) != 0) {
            lVar = ModalBottomSheetKt$ModalBottomSheetState$1.f7715f;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return m13583d(modalBottomSheetValue, gVar, lVar, z);
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m13585f(long j, C11289a<C11079d2> aVar, boolean z, C8592o oVar, int i) {
        int i2;
        boolean z2;
        float f;
        C8767m mVar;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        C11289a<C11079d2> aVar2 = aVar;
        boolean z3 = z;
        int i6 = i;
        C8592o o = oVar.mo15009o(-526532668);
        if ((i6 & 14) == 0) {
            if (o.mo14980g(j2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z3)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-526532668, i2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:547)");
            }
            if (j2 != C15240j2.f37547b.mo42851u()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                C8578k2 f2 = AnimateAsStateKt.m7972f(f, new C2023z0(0, 0, (C2022z) null, 7, (DefaultConstructorMarker) null), 0.0f, (C11300l) null, o, 48, 12);
                String a = C7879l1.m25061a(C7875k1.f18863b.mo10862b(), o, 6);
                o.mo14918M(1010553415);
                if (z3) {
                    C8767m.C8768a aVar3 = C8767m.f23478j;
                    o.mo14918M(1157296644);
                    boolean n0 = o.mo15006n0(aVar2);
                    Object N = o.mo14921N();
                    if (n0 || N == C8592o.f23032a.mo16277a()) {
                        N = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(aVar2, (C11045c<? super ModalBottomSheetKt$Scrim$dismissModifier$1$1>) null);
                        o.mo14893C(N);
                    }
                    o.mo15002m0();
                    C8767m c = SuspendingPointerInputFilterKt.m68437c(aVar3, aVar2, (C11304p) N);
                    o.mo14918M(511388516);
                    boolean n02 = o.mo15006n0(a) | o.mo15006n0(aVar2);
                    Object N2 = o.mo14921N();
                    if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                        N2 = new ModalBottomSheetKt$Scrim$dismissModifier$2$1(a, aVar2);
                        o.mo14893C(N2);
                    }
                    o.mo15002m0();
                    mVar = SemanticsModifierKt.m71867b(c, true, (C11300l) N2);
                } else {
                    mVar = C8767m.f23478j;
                }
                o.mo15002m0();
                C8767m k3 = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null).mo17224k3(mVar);
                C15240j2 n = C15240j2.m66071n(j);
                o.mo14918M(511388516);
                boolean n03 = o.mo15006n0(n) | o.mo15006n0(f2);
                Object N3 = o.mo14921N();
                if (n03 || N3 == C8592o.f23032a.mo16277a()) {
                    N3 = new ModalBottomSheetKt$Scrim$1$1(j2, f2);
                    o.mo14893C(N3);
                }
                o.mo15002m0();
                CanvasKt.m8873b(k3, (C11300l) N3, o, 0);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ModalBottomSheetKt$Scrim$2(j, aVar, z, i));
        }
    }

    /* renamed from: g */
    public static final float m13586g(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C11395k(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @C11587t0(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)", imports = {}))
    @C3044g0
    @C8540g
    @C12579k
    /* renamed from: o */
    public static final ModalBottomSheetState m13594o(@C12579k ModalBottomSheetValue modalBottomSheetValue, @C12580l C1968g<Float> gVar, @C12579k C11300l<? super ModalBottomSheetValue, Boolean> lVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(modalBottomSheetValue, "initialValue");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        oVar.mo14918M(-1928569212);
        if ((i2 & 2) != 0) {
            gVar = C7885n1.f18885a.mo10889a();
        }
        C1968g<Float> gVar2 = gVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1928569212, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:389)");
        }
        ModalBottomSheetState p = m13595p(modalBottomSheetValue, gVar2, lVar, false, oVar, (i & 14) | 3136 | (i & 896), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return p;
    }

    @C3044g0
    @C8540g
    @C12579k
    /* renamed from: p */
    public static final ModalBottomSheetState m13595p(@C12579k ModalBottomSheetValue modalBottomSheetValue, @C12580l C1968g<Float> gVar, @C12580l C11300l<? super ModalBottomSheetValue, Boolean> lVar, boolean z, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(modalBottomSheetValue, "initialValue");
        oVar.mo14918M(-126412120);
        if ((i2 & 2) != 0) {
            gVar = C7885n1.f18885a.mo10889a();
        }
        if ((i2 & 4) != 0) {
            lVar = ModalBottomSheetKt$rememberModalBottomSheetState$1.f7717f;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-126412120, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:313)");
        }
        oVar.mo14933R(170046719, modalBottomSheetValue);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m31343d(new Object[]{modalBottomSheetValue, gVar, Boolean.valueOf(z), lVar}, ModalBottomSheetState.f7718d.mo10298a(gVar, lVar, z), (String) null, new ModalBottomSheetKt$rememberModalBottomSheetState$2(modalBottomSheetValue, gVar, lVar, z), oVar, 72, 4);
        oVar.mo14998l0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return modalBottomSheetState;
    }

    @C11395k(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @C11587t0(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    @C3044g0
    @C8540g
    @C12579k
    /* renamed from: q */
    public static final ModalBottomSheetState m13596q(@C12579k ModalBottomSheetValue modalBottomSheetValue, @C12580l C1968g<Float> gVar, boolean z, @C12579k C11300l<? super ModalBottomSheetValue, Boolean> lVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(modalBottomSheetValue, "initialValue");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        oVar.mo14918M(-409288536);
        if ((i2 & 2) != 0) {
            gVar = C7885n1.f18885a.mo10889a();
        }
        C1968g<Float> gVar2 = gVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-409288536, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:362)");
        }
        ModalBottomSheetState p = m13595p(modalBottomSheetValue, gVar2, lVar, z, oVar, (i & 14) | 64 | ((i >> 3) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return p;
    }
}
