package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C2187d;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15507w;
import androidx.compose.p004ui.input.pointer.util.C15504d;
import androidx.compose.p004ui.unit.C16509w;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11763t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,461:1\n25#2:462\n1114#3,6:463\n135#4:469\n658#5,18:470\n676#5,4:497\n680#5,58:508\n581#5,6:566\n615#5,4:572\n619#5,2:585\n621#5,8:594\n588#5,10:602\n116#6,2:488\n33#6,6:490\n118#6:496\n33#6,6:501\n118#6:507\n116#6,2:576\n33#6,6:578\n118#6:584\n33#6,6:587\n118#6:593\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n141#1:462\n141#1:463,6\n209#1:469\n334#1:470,18\n334#1:497,4\n334#1:508,58\n387#1:566,6\n387#1:572,4\n387#1:585,2\n387#1:594,8\n387#1:602,10\n334#1:488,2\n334#1:490,6\n334#1:496\n334#1:501,6\n334#1:507\n387#1:576,2\n387#1:578,6\n387#1:584\n387#1:587,6\n387#1:593\n*E\n"})
public final class DraggableKt {
    @C12579k
    /* renamed from: a */
    public static final C2193f m9297a(@C12579k C11300l<? super Float, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onDelta");
        return new DefaultDraggableState(lVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02ed A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9303g(androidx.compose.p004ui.input.pointer.C15465c r20, androidx.compose.runtime.C8578k2<? extends kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.input.pointer.C15507w, java.lang.Boolean>> r21, androidx.compose.runtime.C8578k2<? extends kotlin.jvm.functions.C11289a<java.lang.Boolean>> r22, androidx.compose.p004ui.input.pointer.util.C15504d r23, androidx.compose.foundation.gestures.Orientation r24, kotlin.coroutines.C11045c<? super kotlin.Pair<androidx.compose.p004ui.input.pointer.C15507w, androidx.compose.p004ui.geometry.C15094f>> r25) {
        /*
            r0 = r20
            r1 = r25
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r2 = (androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r2 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r10 = 1
            r11 = 0
            if (r4 == 0) goto L_0x00cc
            if (r4 == r10) goto L_0x00aa
            if (r4 == r7) goto L_0x0099
            if (r4 == r6) goto L_0x0070
            if (r4 != r5) goto L_0x0068
            float r0 = r2.F$2
            float r4 = r2.F$1
            float r7 = r2.F$0
            int r12 = r2.I$0
            java.lang.Object r13 = r2.L$5
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            java.lang.Object r14 = r2.L$4
            kotlin.jvm.internal.Ref$LongRef r14 = (kotlin.jvm.internal.Ref.LongRef) r14
            java.lang.Object r15 = r2.L$3
            androidx.compose.foundation.gestures.i r15 = (androidx.compose.foundation.gestures.C2197i) r15
            java.lang.Object r9 = r2.L$2
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.p004ui.input.pointer.C15465c) r9
            java.lang.Object r5 = r2.L$1
            kotlin.jvm.functions.p r5 = (kotlin.jvm.functions.C11304p) r5
            java.lang.Object r6 = r2.L$0
            kotlin.jvm.internal.Ref$LongRef r6 = (kotlin.jvm.internal.Ref.LongRef) r6
            kotlin.C11661u0.m45747n(r1)
            r1 = r0
            r10 = r12
            r0 = r15
            r11 = 4
            r12 = r5
            r5 = r14
            r18 = r3
            r3 = r2
            r2 = r7
            r7 = r9
            r9 = r6
            r6 = r4
            r4 = r18
            goto L_0x029f
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0070:
            float r0 = r2.F$2
            float r4 = r2.F$1
            float r5 = r2.F$0
            int r6 = r2.I$0
            java.lang.Object r7 = r2.L$4
            kotlin.jvm.internal.Ref$LongRef r7 = (kotlin.jvm.internal.Ref.LongRef) r7
            java.lang.Object r9 = r2.L$3
            androidx.compose.foundation.gestures.i r9 = (androidx.compose.foundation.gestures.C2197i) r9
            java.lang.Object r12 = r2.L$2
            androidx.compose.ui.input.pointer.c r12 = (androidx.compose.p004ui.input.pointer.C15465c) r12
            java.lang.Object r13 = r2.L$1
            kotlin.jvm.functions.p r13 = (kotlin.jvm.functions.C11304p) r13
            java.lang.Object r14 = r2.L$0
            kotlin.jvm.internal.Ref$LongRef r14 = (kotlin.jvm.internal.Ref.LongRef) r14
            kotlin.C11661u0.m45747n(r1)
            r15 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r14
            r14 = 3
            goto L_0x01c1
        L_0x0099:
            java.lang.Object r0 = r2.L$2
            androidx.compose.foundation.gestures.Orientation r0 = (androidx.compose.foundation.gestures.Orientation) r0
            java.lang.Object r4 = r2.L$1
            androidx.compose.ui.input.pointer.util.d r4 = (androidx.compose.p004ui.input.pointer.util.C15504d) r4
            java.lang.Object r5 = r2.L$0
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p004ui.input.pointer.C15465c) r5
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0150
        L_0x00aa:
            java.lang.Object r0 = r2.L$4
            androidx.compose.foundation.gestures.Orientation r0 = (androidx.compose.foundation.gestures.Orientation) r0
            java.lang.Object r4 = r2.L$3
            androidx.compose.ui.input.pointer.util.d r4 = (androidx.compose.p004ui.input.pointer.util.C15504d) r4
            java.lang.Object r5 = r2.L$2
            androidx.compose.runtime.k2 r5 = (androidx.compose.runtime.C8578k2) r5
            java.lang.Object r6 = r2.L$1
            androidx.compose.runtime.k2 r6 = (androidx.compose.runtime.C8578k2) r6
            java.lang.Object r9 = r2.L$0
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.p004ui.input.pointer.C15465c) r9
            kotlin.C11661u0.m45747n(r1)
            r18 = r9
            r9 = r0
            r0 = r18
            r19 = r6
            r6 = r4
            r4 = r19
            goto L_0x00ec
        L_0x00cc:
            kotlin.C11661u0.m45747n(r1)
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p004ui.input.pointer.PointerEventPass.Initial
            r2.L$0 = r0
            r4 = r21
            r2.L$1 = r4
            r5 = r22
            r2.L$2 = r5
            r6 = r23
            r2.L$3 = r6
            r9 = r24
            r2.L$4 = r9
            r2.label = r10
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9437d(r0, r8, r1, r2)
            if (r1 != r3) goto L_0x00ec
            return r3
        L_0x00ec:
            androidx.compose.ui.input.pointer.w r1 = (androidx.compose.p004ui.input.pointer.C15507w) r1
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            java.lang.Object r4 = r4.invoke(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0102
            goto L_0x02ee
        L_0x0102:
            java.lang.Object r4 = r5.getValue()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x012a
            r1.mo44168a()
            androidx.compose.p004ui.input.pointer.util.C15505e.m68781c(r6, r1)
            androidx.compose.ui.geometry.f$a r0 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r2 = r0.mo42248e()
            androidx.compose.ui.geometry.f r0 = androidx.compose.p004ui.geometry.C15094f.m64868d(r2)
            kotlin.Pair r11 = kotlin.C11078d1.m42659a(r1, r0)
            goto L_0x02ee
        L_0x012a:
            r1 = 0
            r4 = 0
            r5 = 2
            r12 = 0
            r2.L$0 = r0
            r2.L$1 = r6
            r2.L$2 = r9
            r2.L$3 = r11
            r2.L$4 = r11
            r2.label = r7
            r20 = r0
            r21 = r1
            r22 = r4
            r23 = r2
            r24 = r5
            r25 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r20, r21, r22, r23, r24, r25)
            if (r1 != r3) goto L_0x014d
            return r3
        L_0x014d:
            r5 = r0
            r4 = r6
            r0 = r9
        L_0x0150:
            androidx.compose.ui.input.pointer.w r1 = (androidx.compose.p004ui.input.pointer.C15507w) r1
            androidx.compose.p004ui.input.pointer.util.C15505e.m68781c(r4, r1)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            androidx.compose.ui.geometry.f$a r7 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r12 = r7.mo42248e()
            r6.element = r12
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1 r7 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
            r7.<init>(r4, r6)
            long r12 = r1.mo44176p()
            int r1 = r1.mo44185y()
            androidx.compose.foundation.gestures.i r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9241E(r0)
            androidx.compose.ui.input.pointer.o r4 = r5.mo44004j3()
            boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9239C(r4, r12)
            if (r4 == 0) goto L_0x0180
            r13 = r11
            goto L_0x02e0
        L_0x0180:
            androidx.compose.ui.platform.c4 r4 = r5.getViewConfiguration()
            float r1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9240D(r4, r1)
            kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
            r4.<init>()
            r4.element = r12
            r9 = r6
            r12 = r7
            r13 = r10
            r6 = 0
            r7 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = 0
        L_0x0199:
            r3.L$0 = r9
            r3.L$1 = r12
            r3.L$2 = r7
            r3.L$3 = r0
            r3.L$4 = r5
            r3.L$5 = r11
            r3.I$0 = r13
            r3.F$0 = r2
            r3.F$1 = r6
            r3.F$2 = r1
            r14 = 3
            r3.label = r14
            java.lang.Object r15 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r7, r11, r3, r10, r11)
            if (r15 != r4) goto L_0x01b7
            return r4
        L_0x01b7:
            r18 = r2
            r2 = r1
            r1 = r15
            r15 = r13
            r13 = r12
            r12 = r7
            r7 = r5
            r5 = r18
        L_0x01c1:
            androidx.compose.ui.input.pointer.o r1 = (androidx.compose.p004ui.input.pointer.C15491o) r1
            java.util.List r8 = r1.mo44110e()
            int r10 = r8.size()
            r11 = 0
        L_0x01cc:
            if (r11 >= r10) goto L_0x01f3
            java.lang.Object r16 = r8.get(r11)
            r17 = r16
            androidx.compose.ui.input.pointer.w r17 = (androidx.compose.p004ui.input.pointer.C15507w) r17
            r21 = r15
            long r14 = r17.mo44176p()
            r17 = r12
            r22 = r13
            long r12 = r7.element
            boolean r12 = androidx.compose.p004ui.input.pointer.C15506v.m68789d(r14, r12)
            if (r12 == 0) goto L_0x01e9
            goto L_0x01fb
        L_0x01e9:
            int r11 = r11 + 1
            r15 = r21
            r13 = r22
            r12 = r17
            r14 = 3
            goto L_0x01cc
        L_0x01f3:
            r17 = r12
            r22 = r13
            r21 = r15
            r16 = 0
        L_0x01fb:
            r13 = r16
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            if (r13 != 0) goto L_0x0203
            goto L_0x02a5
        L_0x0203:
            boolean r8 = r13.mo44167A()
            if (r8 == 0) goto L_0x020b
            goto L_0x02a5
        L_0x020b:
            boolean r8 = androidx.compose.p004ui.input.pointer.C15492p.m68685e(r13)
            if (r8 == 0) goto L_0x0245
            java.util.List r1 = r1.mo44110e()
            int r8 = r1.size()
            r10 = 0
        L_0x021a:
            if (r10 >= r8) goto L_0x022d
            java.lang.Object r11 = r1.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.w r12 = (androidx.compose.p004ui.input.pointer.C15507w) r12
            boolean r12 = r12.mo44178r()
            if (r12 == 0) goto L_0x022a
            goto L_0x022e
        L_0x022a:
            int r10 = r10 + 1
            goto L_0x021a
        L_0x022d:
            r11 = 0
        L_0x022e:
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            if (r11 != 0) goto L_0x0234
            goto L_0x02a5
        L_0x0234:
            long r10 = r11.mo44176p()
            r7.element = r10
            r13 = r21
            r12 = r22
            r1 = r2
            r2 = r5
            r5 = r7
            r7 = r17
            goto L_0x02a9
        L_0x0245:
            long r10 = r13.mo44177q()
            long r14 = r13.mo44181u()
            float r1 = r0.mo7369a(r10)
            float r8 = r0.mo7369a(r14)
            float r1 = r1 - r8
            float r8 = r0.mo7371c(r10)
            float r10 = r0.mo7371c(r14)
            float r8 = r8 - r10
            float r1 = r1 + r6
            float r2 = r2 + r8
            if (r21 == 0) goto L_0x0268
            float r6 = java.lang.Math.abs(r1)
            goto L_0x0270
        L_0x0268:
            long r10 = r0.mo7370b(r1, r2)
            float r6 = androidx.compose.p004ui.geometry.C15094f.m64877m(r10)
        L_0x0270:
            int r8 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x02ae
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            r3.L$0 = r9
            r12 = r22
            r3.L$1 = r12
            r8 = r17
            r3.L$2 = r8
            r3.L$3 = r0
            r3.L$4 = r7
            r3.L$5 = r13
            r10 = r21
            r3.I$0 = r10
            r3.F$0 = r5
            r3.F$1 = r1
            r3.F$2 = r2
            r11 = 4
            r3.label = r11
            java.lang.Object r6 = r8.mo44003i3(r6, r3)
            if (r6 != r4) goto L_0x029a
            return r4
        L_0x029a:
            r6 = r1
            r1 = r2
            r2 = r5
            r5 = r7
            r7 = r8
        L_0x029f:
            boolean r8 = r13.mo44167A()
            if (r8 == 0) goto L_0x02a8
        L_0x02a5:
            r6 = r9
            r13 = 0
            goto L_0x02e0
        L_0x02a8:
            r13 = r10
        L_0x02a9:
            r8 = 0
            r10 = 1
            r11 = 0
            goto L_0x0199
        L_0x02ae:
            r10 = r21
            r12 = r22
            r8 = r17
            r11 = 4
            if (r10 == 0) goto L_0x02c2
            float r6 = java.lang.Math.signum(r1)
            float r6 = r6 * r5
            float r1 = r1 - r6
            long r1 = r0.mo7370b(r1, r2)
            goto L_0x02d2
        L_0x02c2:
            long r1 = r0.mo7370b(r1, r2)
            long r14 = androidx.compose.p004ui.geometry.C15094f.m64874j(r1, r6)
            long r14 = androidx.compose.p004ui.geometry.C15094f.m64888x(r14, r5)
            long r1 = androidx.compose.p004ui.geometry.C15094f.m64885u(r1, r14)
        L_0x02d2:
            androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r1)
            r12.invoke(r13, r1)
            boolean r1 = r13.mo44167A()
            if (r1 == 0) goto L_0x02ef
            r6 = r9
        L_0x02e0:
            if (r13 == 0) goto L_0x02ed
            long r0 = r6.element
            androidx.compose.ui.geometry.f r0 = androidx.compose.p004ui.geometry.C15094f.m64868d(r0)
            kotlin.Pair r11 = kotlin.C11078d1.m42659a(r13, r0)
            goto L_0x02ee
        L_0x02ed:
            r11 = 0
        L_0x02ee:
            return r11
        L_0x02ef:
            r2 = r5
            r5 = r7
            r7 = r8
            r13 = r10
            r1 = 0
            r6 = 0
            goto L_0x02a9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m9303g(androidx.compose.ui.input.pointer.c, androidx.compose.runtime.k2, androidx.compose.runtime.k2, androidx.compose.ui.input.pointer.util.d, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public static final Object m9304h(C15465c cVar, C15507w wVar, long j, C15504d dVar, C11763t<? super C2187d> tVar, boolean z, Orientation orientation, C11045c<? super Boolean> cVar2) {
        long j2;
        C11763t<? super C2187d> tVar2 = tVar;
        boolean z2 = z;
        tVar.mo23751L(new C2187d.C2190c(C15094f.m64885u(wVar.mo44177q(), C15096g.m64898a(C15094f.m64880p(j) * Math.signum(C15094f.m64880p(wVar.mo44177q())), C15094f.m64882r(j) * Math.signum(C15094f.m64882r(wVar.mo44177q())))), (DefaultConstructorMarker) null));
        if (z2) {
            long j3 = j;
            j2 = C15094f.m64888x(j, -1.0f);
        } else {
            j2 = j;
        }
        tVar.mo23751L(new C2187d.C2189b(j2, (DefaultConstructorMarker) null));
        C15504d dVar2 = dVar;
        return m9309m(cVar, orientation, wVar.mo44176p(), new DraggableKt$awaitDrag$2(dVar, tVar, z), cVar2);
    }

    @C12579k
    /* renamed from: i */
    public static final C8767m m9305i(@C12579k C8767m mVar, @C12579k C2193f fVar, @C12579k Orientation orientation, boolean z, @C12580l C2243g gVar, boolean z2, @C12579k C11305q<? super C12074o0, ? super C15094f, ? super C11045c<? super C11079d2>, ? extends Object> qVar, @C12579k C11305q<? super C12074o0, ? super Float, ? super C11045c<? super C11079d2>, ? extends Object> qVar2, boolean z3) {
        C11305q<? super C12074o0, ? super Float, ? super C11045c<? super C11079d2>, ? extends Object> qVar3 = qVar2;
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        C2193f fVar2 = fVar;
        Intrinsics.checkNotNullParameter(fVar, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        C11305q<? super C12074o0, ? super C15094f, ? super C11045c<? super C11079d2>, ? extends Object> qVar4 = qVar;
        Intrinsics.checkNotNullParameter(qVar4, "onDragStarted");
        Intrinsics.checkNotNullParameter(qVar3, "onDragStopped");
        DraggableKt$draggable$3 draggableKt$draggable$3 = DraggableKt$draggable$3.f5880f;
        boolean z4 = z2;
        DraggableKt$draggable$4 draggableKt$draggable$4 = new DraggableKt$draggable$4(z2);
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(qVar3, orientation, (C11045c<? super DraggableKt$draggable$5>) null);
        return m9306j(mVar, fVar, draggableKt$draggable$3, orientation, z, gVar, draggableKt$draggable$4, qVar4, draggableKt$draggable$5, z3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v8, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m9306j(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r16, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2193f r17, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.input.pointer.C15507w, java.lang.Boolean> r18, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.Orientation r19, boolean r20, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r21, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<java.lang.Boolean> r22, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super kotlinx.coroutines.C12074o0, ? super androidx.compose.p004ui.geometry.C15094f, ? super kotlin.coroutines.C11045c<? super kotlin.C11079d2>, ? extends java.lang.Object> r23, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super kotlinx.coroutines.C12074o0, ? super androidx.compose.p004ui.unit.C16509w, ? super kotlin.coroutines.C11045c<? super kotlin.C11079d2>, ? extends java.lang.Object> r24, boolean r25) {
        /*
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "state"
            r12 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "canDrag"
            r13 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "orientation"
            r14 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "startDragImmediately"
            r15 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "onDragStarted"
            r11 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            java.lang.String r1 = "onDragStopped"
            r10 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x0050
            androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r25
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0054
        L_0x0050:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0054:
            androidx.compose.foundation.gestures.DraggableKt$draggable$9 r11 = new androidx.compose.foundation.gestures.DraggableKt$draggable$9
            r2 = r11
            r3 = r21
            r4 = r22
            r5 = r18
            r6 = r23
            r7 = r24
            r8 = r17
            r9 = r19
            r10 = r20
            r12 = r11
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r0, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m9306j(androidx.compose.ui.m, androidx.compose.foundation.gestures.f, kotlin.jvm.functions.l, androidx.compose.foundation.gestures.Orientation, boolean, androidx.compose.foundation.interaction.g, kotlin.jvm.functions.a, kotlin.jvm.functions.q, kotlin.jvm.functions.q, boolean):androidx.compose.ui.m");
    }

    /* renamed from: k */
    public static /* synthetic */ C8767m m9307k(C8767m mVar, C2193f fVar, Orientation orientation, boolean z, C2243g gVar, boolean z2, C11305q qVar, C11305q qVar2, boolean z3, int i, Object obj) {
        boolean z4;
        C2243g gVar2;
        boolean z5;
        DraggableKt$draggable$1 draggableKt$draggable$1;
        DraggableKt$draggable$2 draggableKt$draggable$2;
        boolean z6;
        int i2 = i;
        if ((i2 & 4) != 0) {
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i2 & 8) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 16) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i2 & 32) != 0) {
            draggableKt$draggable$1 = new DraggableKt$draggable$1((C11045c<? super DraggableKt$draggable$1>) null);
        } else {
            draggableKt$draggable$1 = qVar;
        }
        if ((i2 & 64) != 0) {
            draggableKt$draggable$2 = new DraggableKt$draggable$2((C11045c<? super DraggableKt$draggable$2>) null);
        } else {
            draggableKt$draggable$2 = qVar2;
        }
        if ((i2 & 128) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        return m9305i(mVar, fVar, orientation, z4, gVar2, z5, draggableKt$draggable$1, draggableKt$draggable$2, z6);
    }

    /* renamed from: l */
    public static /* synthetic */ C8767m m9308l(C8767m mVar, C2193f fVar, C11300l lVar, Orientation orientation, boolean z, C2243g gVar, C11289a aVar, C11305q qVar, C11305q qVar2, boolean z2, int i, Object obj) {
        boolean z3;
        C2243g gVar2;
        DraggableKt$draggable$6 draggableKt$draggable$6;
        DraggableKt$draggable$7 draggableKt$draggable$7;
        boolean z4;
        int i2 = i;
        if ((i2 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 64) != 0) {
            draggableKt$draggable$6 = new DraggableKt$draggable$6((C11045c<? super DraggableKt$draggable$6>) null);
        } else {
            draggableKt$draggable$6 = qVar;
        }
        if ((i2 & 128) != 0) {
            draggableKt$draggable$7 = new DraggableKt$draggable$7((C11045c<? super DraggableKt$draggable$7>) null);
        } else {
            draggableKt$draggable$7 = qVar2;
        }
        if ((i2 & 256) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return m9306j(mVar, fVar, lVar, orientation, z3, gVar2, aVar, draggableKt$draggable$6, draggableKt$draggable$7, z4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        if ((!r0) != false) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9309m(androidx.compose.p004ui.input.pointer.C15465c r17, androidx.compose.foundation.gestures.Orientation r18, long r19, kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.input.pointer.C15507w, kotlin.C11079d2> r21, kotlin.coroutines.C11045c<? super java.lang.Boolean> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1 r1 = (androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1 r1 = new androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r1.label
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004e
            if (r3 != r5) goto L_0x0046
            java.lang.Object r3 = r1.L$4
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r7 = r1.L$3
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p004ui.input.pointer.C15465c) r7
            java.lang.Object r8 = r1.L$2
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p004ui.input.pointer.C15465c) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            java.lang.Object r10 = r1.L$0
            kotlin.jvm.functions.l r10 = (kotlin.jvm.functions.C11300l) r10
            kotlin.C11661u0.m45747n(r0)
            r16 = r3
            r3 = r1
            r1 = r10
            r10 = r16
            goto L_0x009a
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            kotlin.C11661u0.m45747n(r0)
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            r3 = r18
            if (r3 != r0) goto L_0x005a
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$1 r0 = androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$1.f5883f
            goto L_0x005c
        L_0x005a:
            androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$2 r0 = androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$motionFromChange$2.f5884f
        L_0x005c:
            androidx.compose.ui.input.pointer.o r3 = r17.mo44004j3()
            r7 = r19
            boolean r3 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9239C(r3, r7)
            if (r3 == 0) goto L_0x006e
            r1 = r21
            r4 = r5
            r14 = r6
            goto L_0x0126
        L_0x006e:
            r3 = r1
            r9 = r2
            r1 = r21
            r2 = r0
            r0 = r17
        L_0x0075:
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r10.element = r7
            r7 = r0
            r16 = r9
            r9 = r2
            r2 = r16
        L_0x0082:
            r3.L$0 = r1
            r3.L$1 = r9
            r3.L$2 = r0
            r3.L$3 = r7
            r3.L$4 = r10
            r3.label = r5
            java.lang.Object r8 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r7, r6, r3, r5, r6)
            if (r8 != r2) goto L_0x0095
            return r2
        L_0x0095:
            r16 = r8
            r8 = r0
            r0 = r16
        L_0x009a:
            androidx.compose.ui.input.pointer.o r0 = (androidx.compose.p004ui.input.pointer.C15491o) r0
            java.util.List r11 = r0.mo44110e()
            int r12 = r11.size()
            r13 = 0
        L_0x00a5:
            if (r13 >= r12) goto L_0x00c4
            java.lang.Object r14 = r11.get(r13)
            r15 = r14
            androidx.compose.ui.input.pointer.w r15 = (androidx.compose.p004ui.input.pointer.C15507w) r15
            r17 = r7
            long r6 = r15.mo44176p()
            long r4 = r10.element
            boolean r4 = androidx.compose.p004ui.input.pointer.C15506v.m68789d(r6, r4)
            if (r4 == 0) goto L_0x00bd
            goto L_0x00c7
        L_0x00bd:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            r7 = r17
            goto L_0x00a5
        L_0x00c4:
            r17 = r7
            r14 = 0
        L_0x00c7:
            androidx.compose.ui.input.pointer.w r14 = (androidx.compose.p004ui.input.pointer.C15507w) r14
            if (r14 != 0) goto L_0x00ce
            r4 = 1
            r14 = 0
            goto L_0x0115
        L_0x00ce:
            boolean r4 = androidx.compose.p004ui.input.pointer.C15492p.m68685e(r14)
            if (r4 == 0) goto L_0x00ff
            java.util.List r0 = r0.mo44110e()
            int r4 = r0.size()
            r5 = 0
        L_0x00dd:
            if (r5 >= r4) goto L_0x00f0
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.w r7 = (androidx.compose.p004ui.input.pointer.C15507w) r7
            boolean r7 = r7.mo44178r()
            if (r7 == 0) goto L_0x00ed
            goto L_0x00f1
        L_0x00ed:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f0:
            r6 = 0
        L_0x00f1:
            androidx.compose.ui.input.pointer.w r6 = (androidx.compose.p004ui.input.pointer.C15507w) r6
            if (r6 != 0) goto L_0x00f7
            r4 = 1
            goto L_0x0115
        L_0x00f7:
            long r4 = r6.mo44176p()
            r10.element = r4
            r4 = 1
            goto L_0x014a
        L_0x00ff:
            java.lang.Object r0 = r9.invoke(r14)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0110
            r0 = 1
            goto L_0x0111
        L_0x0110:
            r0 = 0
        L_0x0111:
            r4 = 1
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x014a
        L_0x0115:
            if (r14 != 0) goto L_0x0119
        L_0x0117:
            r14 = 0
            goto L_0x0126
        L_0x0119:
            boolean r0 = r14.mo44167A()
            if (r0 == 0) goto L_0x0120
            goto L_0x0117
        L_0x0120:
            boolean r0 = androidx.compose.p004ui.input.pointer.C15492p.m68685e(r14)
            if (r0 == 0) goto L_0x0138
        L_0x0126:
            if (r14 == 0) goto L_0x012e
            r1.invoke(r14)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            goto L_0x012f
        L_0x012e:
            r6 = 0
        L_0x012f:
            if (r6 == 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r4 = 0
        L_0x0133:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            return r0
        L_0x0138:
            r1.invoke(r14)
            long r5 = r14.mo44176p()
            r0 = r8
            r7 = r5
            r6 = 0
            r5 = r4
            r16 = r9
            r9 = r2
            r2 = r16
            goto L_0x0075
        L_0x014a:
            r7 = r17
            r5 = r4
            r0 = r8
            r6 = 0
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m9309m(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    @C8540g
    @C12579k
    /* renamed from: n */
    public static final C2193f m9310n(@C12579k C11300l<? super Float, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "onDelta");
        oVar.mo14918M(-183245213);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:138)");
        }
        C8578k2<T> t = C8415c2.m30251t(lVar, oVar, i & 14);
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = m9297a(new DraggableKt$rememberDraggableState$1$1(t));
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2193f fVar = (C2193f) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return fVar;
    }

    /* renamed from: o */
    public static final float m9311o(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? C15094f.m64882r(j) : C15094f.m64880p(j);
    }

    /* renamed from: p */
    public static final float m9312p(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? C16509w.m74752n(j) : C16509w.m74750l(j);
    }
}
