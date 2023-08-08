package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.C15507w;
import androidx.compose.p004ui.input.pointer.PointerEventPass;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
public final class TapGestureDetectorKt {
    @C12579k

    /* renamed from: a */
    public static final C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> f5912a = new TapGestureDetectorKt$NoPressGesture$1((C11045c<? super TapGestureDetectorKt$NoPressGesture$1>) null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077 A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    public static final java.lang.Object m9437d(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15465c r9, boolean r10, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.PointerEventPass r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.input.pointer.C15507w> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.p004ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p004ui.input.pointer.C15465c) r11
            kotlin.C11661u0.m45747n(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            kotlin.C11661u0.m45747n(r12)
        L_0x0042:
            r0.L$0 = r9
            r0.L$1 = r11
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r12 = r9.mo44003i3(r11, r0)
            if (r12 != r1) goto L_0x0051
            return r1
        L_0x0051:
            androidx.compose.ui.input.pointer.o r12 = (androidx.compose.p004ui.input.pointer.C15491o) r12
            java.util.List r2 = r12.mo44110e()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x005d:
            if (r6 >= r4) goto L_0x0077
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.w r7 = (androidx.compose.p004ui.input.pointer.C15507w) r7
            if (r10 == 0) goto L_0x006c
            boolean r7 = androidx.compose.p004ui.input.pointer.C15492p.m68682b(r7)
            goto L_0x0070
        L_0x006c:
            boolean r7 = androidx.compose.p004ui.input.pointer.C15492p.m68683c(r7)
        L_0x0070:
            if (r7 != 0) goto L_0x0074
            r2 = r5
            goto L_0x0078
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x005d
        L_0x0077:
            r2 = r3
        L_0x0078:
            if (r2 == 0) goto L_0x0042
            java.util.List r9 = r12.mo44110e()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m9437d(androidx.compose.ui.input.pointer.c, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f */
    public static /* synthetic */ Object m9439f(C15465c cVar, boolean z, PointerEventPass pointerEventPass, C11045c cVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return m9437d(cVar, z, pointerEventPass, cVar2);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m9440g(C15465c cVar, boolean z, C11045c cVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m9437d(cVar, z, PointerEventPass.Main, cVar2);
    }

    /* renamed from: h */
    public static final Object m9441h(C15465c cVar, C15507w wVar, C11045c<? super C15507w> cVar2) {
        return cVar.mo44001d1(cVar.getViewConfiguration().mo44718a(), new TapGestureDetectorKt$awaitSecondDown$2(wVar, (C11045c<? super TapGestureDetectorKt$awaitSecondDown$2>) null), cVar2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[LOOP:0: B:17:0x0050->B:18:0x0052, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[EDGE_INSN: B:30:0x007a->B:25:0x007a ?: BREAK  , SYNTHETIC] */
    /* renamed from: i */
    public static final java.lang.Object m9442i(androidx.compose.p004ui.input.pointer.C15465c r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p004ui.input.pointer.C15465c) r8
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            kotlin.C11661u0.m45747n(r9)
        L_0x0038:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0044
            return r1
        L_0x0044:
            androidx.compose.ui.input.pointer.o r9 = (androidx.compose.p004ui.input.pointer.C15491o) r9
            java.util.List r2 = r9.mo44110e()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x0050:
            if (r6 >= r4) goto L_0x005e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.w r7 = (androidx.compose.p004ui.input.pointer.C15507w) r7
            r7.mo44168a()
            int r6 = r6 + 1
            goto L_0x0050
        L_0x005e:
            java.util.List r9 = r9.mo44110e()
            int r2 = r9.size()
            r4 = r5
        L_0x0067:
            if (r4 >= r2) goto L_0x007a
            java.lang.Object r6 = r9.get(r4)
            androidx.compose.ui.input.pointer.w r6 = (androidx.compose.p004ui.input.pointer.C15507w) r6
            boolean r6 = r6.mo44178r()
            if (r6 == 0) goto L_0x0077
            r5 = r3
            goto L_0x007a
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x0067
        L_0x007a:
            if (r5 != 0) goto L_0x0038
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m9442i(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: j */
    public static final Object m9443j(@C12579k C15472e0 e0Var, @C12579k C11305q<? super C2198j, ? super C15094f, ? super C11045c<? super C11079d2>, ? extends Object> qVar, @C12580l C11300l<? super C15094f, C11079d2> lVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new TapGestureDetectorKt$detectTapAndPress$2(e0Var, qVar, lVar, new PressGestureScopeImpl(e0Var), (C11045c<? super TapGestureDetectorKt$detectTapAndPress$2>) null), cVar);
        if (g == C11063b.m42612h()) {
            return g;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: k */
    public static /* synthetic */ Object m9444k(C15472e0 e0Var, C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> qVar, C11300l lVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            qVar = f5912a;
        }
        if ((i & 2) != 0) {
            lVar = null;
        }
        return m9443j(e0Var, qVar, lVar, cVar);
    }

    @C12580l
    /* renamed from: l */
    public static final Object m9445l(@C12579k C15472e0 e0Var, @C12580l C11300l<? super C15094f, C11079d2> lVar, @C12580l C11300l<? super C15094f, C11079d2> lVar2, @C12579k C11305q<? super C2198j, ? super C15094f, ? super C11045c<? super C11079d2>, ? extends Object> qVar, @C12580l C11300l<? super C15094f, C11079d2> lVar3, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new TapGestureDetectorKt$detectTapGestures$2(e0Var, qVar, lVar2, lVar, lVar3, (C11045c<? super TapGestureDetectorKt$detectTapGestures$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* renamed from: m */
    public static /* synthetic */ Object m9446m(C15472e0 e0Var, C11300l lVar, C11300l lVar2, C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> qVar, C11300l lVar3, C11045c cVar, int i, Object obj) {
        C11300l lVar4;
        C11300l lVar5;
        C11300l lVar6;
        if ((i & 1) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar;
        }
        if ((i & 2) != 0) {
            lVar5 = null;
        } else {
            lVar5 = lVar2;
        }
        if ((i & 4) != 0) {
            qVar = f5912a;
        }
        C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> qVar2 = qVar;
        if ((i & 8) != 0) {
            lVar6 = null;
        } else {
            lVar6 = lVar3;
        }
        return m9445l(e0Var, lVar4, lVar5, qVar2, lVar6, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9447n(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15465c r18, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.PointerEventPass r19, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.input.pointer.C15507w> r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r1 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r1.label
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0053
            if (r3 == r7) goto L_0x0047
            if (r3 != r5) goto L_0x003f
            java.lang.Object r3 = r1.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r3 = (androidx.compose.p004ui.input.pointer.PointerEventPass) r3
            java.lang.Object r8 = r1.L$0
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p004ui.input.pointer.C15465c) r8
            kotlin.C11661u0.m45747n(r0)
        L_0x0037:
            r16 = r2
            r2 = r1
            r1 = r3
            r3 = r16
            goto L_0x00e1
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            java.lang.Object r3 = r1.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r3 = (androidx.compose.p004ui.input.pointer.PointerEventPass) r3
            java.lang.Object r8 = r1.L$0
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p004ui.input.pointer.C15465c) r8
            kotlin.C11661u0.m45747n(r0)
            goto L_0x0074
        L_0x0053:
            kotlin.C11661u0.m45747n(r0)
            r0 = r18
            r3 = r2
            r2 = r1
            r1 = r19
        L_0x005c:
            r2.L$0 = r0
            r2.L$1 = r1
            r2.label = r7
            java.lang.Object r8 = r0.mo44003i3(r1, r2)
            if (r8 != r3) goto L_0x0069
            return r3
        L_0x0069:
            r16 = r8
            r8 = r0
            r0 = r16
            r17 = r3
            r3 = r1
            r1 = r2
            r2 = r17
        L_0x0074:
            androidx.compose.ui.input.pointer.o r0 = (androidx.compose.p004ui.input.pointer.C15491o) r0
            java.util.List r9 = r0.mo44110e()
            int r10 = r9.size()
            r11 = r6
        L_0x007f:
            if (r11 >= r10) goto L_0x0092
            java.lang.Object r12 = r9.get(r11)
            androidx.compose.ui.input.pointer.w r12 = (androidx.compose.p004ui.input.pointer.C15507w) r12
            boolean r12 = androidx.compose.p004ui.input.pointer.C15492p.m68684d(r12)
            if (r12 != 0) goto L_0x008f
            r9 = r6
            goto L_0x0093
        L_0x008f:
            int r11 = r11 + 1
            goto L_0x007f
        L_0x0092:
            r9 = r7
        L_0x0093:
            if (r9 == 0) goto L_0x009e
            java.util.List r0 = r0.mo44110e()
            java.lang.Object r0 = r0.get(r6)
            return r0
        L_0x009e:
            java.util.List r0 = r0.mo44110e()
            int r9 = r0.size()
            r10 = r6
        L_0x00a7:
            if (r10 >= r9) goto L_0x00ce
            java.lang.Object r11 = r0.get(r10)
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            boolean r12 = r11.mo44167A()
            if (r12 != 0) goto L_0x00c6
            long r12 = r8.mo44000a()
            long r14 = r8.mo44008y()
            boolean r11 = androidx.compose.p004ui.input.pointer.C15492p.m68690j(r11, r12, r14)
            if (r11 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r11 = r6
            goto L_0x00c7
        L_0x00c6:
            r11 = r7
        L_0x00c7:
            if (r11 == 0) goto L_0x00cb
            r0 = r7
            goto L_0x00cf
        L_0x00cb:
            int r10 = r10 + 1
            goto L_0x00a7
        L_0x00ce:
            r0 = r6
        L_0x00cf:
            if (r0 == 0) goto L_0x00d2
            return r4
        L_0x00d2:
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            r1.L$0 = r8
            r1.L$1 = r3
            r1.label = r5
            java.lang.Object r0 = r8.mo44003i3(r0, r1)
            if (r0 != r2) goto L_0x0037
            return r2
        L_0x00e1:
            androidx.compose.ui.input.pointer.o r0 = (androidx.compose.p004ui.input.pointer.C15491o) r0
            java.util.List r0 = r0.mo44110e()
            int r9 = r0.size()
            r10 = r6
        L_0x00ec:
            if (r10 >= r9) goto L_0x00ff
            java.lang.Object r11 = r0.get(r10)
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            boolean r11 = r11.mo44167A()
            if (r11 == 0) goto L_0x00fc
            r0 = r7
            goto L_0x0100
        L_0x00fc:
            int r10 = r10 + 1
            goto L_0x00ec
        L_0x00ff:
            r0 = r6
        L_0x0100:
            if (r0 == 0) goto L_0x0103
            return r4
        L_0x0103:
            r0 = r8
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.m9447n(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: p */
    public static /* synthetic */ Object m9449p(C15465c cVar, PointerEventPass pointerEventPass, C11045c cVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return m9447n(cVar, pointerEventPass, cVar2);
    }
}
