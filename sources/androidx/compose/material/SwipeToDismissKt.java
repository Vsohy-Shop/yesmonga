package androidx.compose.material;

import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,243:1\n50#2:244\n49#2:245\n1114#3,6:246\n154#4:252\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n*L\n153#1:244\n153#1:245\n153#1:246,6\n243#1:252\n*E\n"})
public final class SwipeToDismissKt {

    /* renamed from: a */
    public static final float f7866a = C16483g.m74435M((float) 56);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13891a(@org.jetbrains.annotations.C12579k androidx.compose.material.DismissState r21, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r22, @org.jetbrains.annotations.C12580l java.util.Set<? extends androidx.compose.material.DismissDirection> r23, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.C7941v1> r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r7 = r21
            r8 = r25
            r9 = r26
            r10 = r28
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "background"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "dismissContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 634380143(0x25cfdf6f, float:3.606018E-16)
            r1 = r27
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            r1 = r29 & 1
            r2 = 4
            r3 = 2
            if (r1 == 0) goto L_0x0029
            r1 = r10 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r15.mo15006n0(r7)
            if (r1 == 0) goto L_0x0035
            r1 = r2
            goto L_0x0036
        L_0x0035:
            r1 = r3
        L_0x0036:
            r1 = r1 | r10
            goto L_0x0039
        L_0x0038:
            r1 = r10
        L_0x0039:
            r4 = r29 & 2
            if (r4 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0053
        L_0x0040:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0053
            r5 = r22
            boolean r6 = r15.mo15006n0(r5)
            if (r6 == 0) goto L_0x004f
            r6 = 32
            goto L_0x0051
        L_0x004f:
            r6 = 16
        L_0x0051:
            r1 = r1 | r6
            goto L_0x0055
        L_0x0053:
            r5 = r22
        L_0x0055:
            r6 = r29 & 4
            if (r6 == 0) goto L_0x005b
            r1 = r1 | 128(0x80, float:1.794E-43)
        L_0x005b:
            r11 = r29 & 8
            if (r11 == 0) goto L_0x0062
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r12 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0075
            r12 = r24
            boolean r13 = r15.mo14927P(r12)
            if (r13 == 0) goto L_0x0071
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r1 = r1 | r13
            goto L_0x0077
        L_0x0075:
            r12 = r24
        L_0x0077:
            r13 = r29 & 16
            if (r13 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0090
        L_0x007e:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x0090
            boolean r13 = r15.mo14927P(r8)
            if (r13 == 0) goto L_0x008d
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r13
        L_0x0090:
            r13 = r29 & 32
            if (r13 == 0) goto L_0x0098
            r13 = 196608(0x30000, float:2.75506E-40)
        L_0x0096:
            r1 = r1 | r13
            goto L_0x00a9
        L_0x0098:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00a9
            boolean r13 = r15.mo14927P(r9)
            if (r13 == 0) goto L_0x00a6
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0096
        L_0x00a6:
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0096
        L_0x00a9:
            r13 = r1
            if (r6 != r2) goto L_0x00c6
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r13
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x00c6
            boolean r1 = r15.mo15011p()
            if (r1 != 0) goto L_0x00bc
            goto L_0x00c6
        L_0x00bc:
            r15.mo14958a0()
            r3 = r23
            r2 = r5
            r4 = r12
            r1 = r15
            goto L_0x0137
        L_0x00c6:
            if (r4 == 0) goto L_0x00cd
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r18 = r1
            goto L_0x00cf
        L_0x00cd:
            r18 = r5
        L_0x00cf:
            r14 = 1
            if (r6 == 0) goto L_0x00e4
            androidx.compose.material.DismissDirection[] r1 = new androidx.compose.material.DismissDirection[r3]
            r2 = 0
            androidx.compose.material.DismissDirection r3 = androidx.compose.material.DismissDirection.EndToStart
            r1[r2] = r3
            androidx.compose.material.DismissDirection r2 = androidx.compose.material.DismissDirection.StartToEnd
            r1[r14] = r2
            java.util.Set r1 = kotlin.collections.C10930d1.m40902u(r1)
            r19 = r1
            goto L_0x00e6
        L_0x00e4:
            r19 = r23
        L_0x00e6:
            if (r11 == 0) goto L_0x00ed
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1 r1 = androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1.f7867f
            r20 = r1
            goto L_0x00ef
        L_0x00ed:
            r20 = r12
        L_0x00ef:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00fb
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r1, r2)
        L_0x00fb:
            r12 = 0
            r16 = 0
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2 r11 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
            r0 = r11
            r1 = r19
            r2 = r20
            r3 = r13
            r4 = r21
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 338007641(0x14259659, float:8.360022E-27)
            androidx.compose.runtime.internal.a r14 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r14, r11)
            int r0 = r13 >> 3
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r17 = 6
            r11 = r18
            r13 = r16
            r1 = r15
            r16 = r0
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m9860a(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0131
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0131:
            r2 = r18
            r3 = r19
            r4 = r20
        L_0x0137:
            androidx.compose.runtime.t1 r11 = r1.mo15020s()
            if (r11 != 0) goto L_0x013e
            goto L_0x0151
        L_0x013e:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3 r12 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3
            r0 = r12
            r1 = r21
            r5 = r25
            r6 = r26
            r7 = r28
            r8 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.mo15202a(r12)
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt.m13891a(androidx.compose.material.DismissState, androidx.compose.ui.m, java.util.Set, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: d */
    public static final DismissDirection m13894d(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        DismissValue dismissValue3 = DismissValue.Default;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
            return DismissDirection.EndToStart;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.DismissState m13895e(@org.jetbrains.annotations.C12580l androidx.compose.material.DismissValue r7, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.material.DismissValue, java.lang.Boolean> r8, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r9, int r10, int r11) {
        /*
            r0 = -1753522702(0xffffffff977b5df2, float:-8.122105E-25)
            r9.mo14918M(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x000c
            androidx.compose.material.DismissValue r7 = androidx.compose.material.DismissValue.Default
        L_0x000c:
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0012
            androidx.compose.material.SwipeToDismissKt$rememberDismissState$1 r8 = androidx.compose.material.SwipeToDismissKt$rememberDismissState$1.f7868f
        L_0x0012:
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x001e
            r11 = -1
            java.lang.String r1 = "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:148)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r11, r1)
        L_0x001e:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            androidx.compose.material.DismissState$Companion r10 = androidx.compose.material.DismissState.f7632s
            androidx.compose.runtime.saveable.e r1 = r10.mo10135a(r8)
            r2 = 0
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.mo14918M(r10)
            boolean r10 = r9.mo15006n0(r7)
            boolean r11 = r9.mo15006n0(r8)
            r10 = r10 | r11
            java.lang.Object r11 = r9.mo14921N()
            if (r10 != 0) goto L_0x0045
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r11 != r10) goto L_0x004d
        L_0x0045:
            androidx.compose.material.SwipeToDismissKt$rememberDismissState$2$1 r11 = new androidx.compose.material.SwipeToDismissKt$rememberDismissState$2$1
            r11.<init>(r7, r8)
            r9.mo14893C(r11)
        L_0x004d:
            r9.mo15002m0()
            r3 = r11
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r5 = 72
            r6 = 4
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material.DismissState r7 = (androidx.compose.material.DismissState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0066
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0066:
            r9.mo15002m0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt.m13895e(androidx.compose.material.DismissValue, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):androidx.compose.material.DismissState");
    }
}
