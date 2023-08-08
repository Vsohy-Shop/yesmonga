package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,180:1\n135#2:181\n101#3,2:182\n33#3,6:184\n103#3:190\n33#3,6:191\n101#3,2:197\n33#3,6:199\n103#3:205\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n106#1:181\n137#1:182,2\n137#1:184,6\n137#1:190\n171#1:191,6\n178#1:197,2\n178#1:199,6\n178#1:205\n*E\n"})
public final class TransformableKt {
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018d, code lost:
        if (androidx.compose.p004ui.geometry.C15094f.m64876l(r1, androidx.compose.p004ui.geometry.C15094f.f37256b.mo42248e()) != false) goto L_0x019d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9468b(androidx.compose.p004ui.input.pointer.C15465c r27, androidx.compose.runtime.C8578k2<java.lang.Boolean> r28, kotlinx.coroutines.channels.C11744g<androidx.compose.foundation.gestures.C2205o> r29, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r30) {
        /*
            r0 = r30
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.TransformableKt$detectZoom$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 r1 = (androidx.compose.foundation.gestures.TransformableKt$detectZoom$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 r1 = new androidx.compose.foundation.gestures.TransformableKt$detectZoom$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 2
            r11 = 0
            r12 = 0
            r13 = 1
            if (r2 == 0) goto L_0x006f
            if (r2 == r13) goto L_0x0053
            if (r2 != r10) goto L_0x004b
            int r2 = r1.I$1
            float r3 = r1.F$2
            int r4 = r1.I$0
            long r5 = r1.J$0
            float r7 = r1.F$1
            float r14 = r1.F$0
            java.lang.Object r15 = r1.L$2
            kotlinx.coroutines.channels.g r15 = (kotlinx.coroutines.channels.C11744g) r15
            java.lang.Object r10 = r1.L$1
            androidx.compose.runtime.k2 r10 = (androidx.compose.runtime.C8578k2) r10
            java.lang.Object r13 = r1.L$0
            androidx.compose.ui.input.pointer.c r13 = (androidx.compose.p004ui.input.pointer.C15465c) r13
            kotlin.C11661u0.m45747n(r0)
            goto L_0x00db
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0053:
            int r2 = r1.I$1
            float r3 = r1.F$2
            int r4 = r1.I$0
            long r5 = r1.J$0
            float r7 = r1.F$1
            float r10 = r1.F$0
            java.lang.Object r13 = r1.L$2
            kotlinx.coroutines.channels.g r13 = (kotlinx.coroutines.channels.C11744g) r13
            java.lang.Object r14 = r1.L$1
            androidx.compose.runtime.k2 r14 = (androidx.compose.runtime.C8578k2) r14
            java.lang.Object r15 = r1.L$0
            androidx.compose.ui.input.pointer.c r15 = (androidx.compose.p004ui.input.pointer.C15465c) r15
            kotlin.C11661u0.m45747n(r0)
            goto L_0x00b3
        L_0x006f:
            kotlin.C11661u0.m45747n(r0)
            androidx.compose.ui.geometry.f$a r0 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r13 = r0.mo42248e()
            androidx.compose.ui.platform.c4 r0 = r27.getViewConfiguration()
            float r0 = r0.mo44722f()
            r3 = 0
            r4 = 0
            r6 = 2
            r7 = 0
            r10 = r27
            r1.L$0 = r10
            r15 = r28
            r1.L$1 = r15
            r5 = r29
            r1.L$2 = r5
            r1.F$0 = r11
            r1.F$1 = r9
            r1.J$0 = r13
            r1.I$0 = r12
            r1.F$2 = r0
            r1.I$1 = r12
            r2 = 1
            r1.label = r2
            r2 = r27
            r5 = r1
            java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r2, r3, r4, r5, r6, r7)
            if (r2 != r8) goto L_0x00a9
            return r8
        L_0x00a9:
            r3 = r0
            r7 = r9
            r2 = r12
            r4 = r2
            r5 = r13
            r14 = r15
            r13 = r29
            r15 = r10
            r10 = r11
        L_0x00b3:
            r25 = r14
            r14 = r10
            r10 = r25
            r26 = r15
            r15 = r13
            r13 = r26
        L_0x00bd:
            r1.L$0 = r13
            r1.L$1 = r10
            r1.L$2 = r15
            r1.F$0 = r14
            r1.F$1 = r7
            r1.J$0 = r5
            r1.I$0 = r4
            r1.F$2 = r3
            r1.I$1 = r2
            r0 = 2
            r1.label = r0
            r0 = 0
            r9 = 1
            java.lang.Object r0 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r13, r0, r1, r9, r0)
            if (r0 != r8) goto L_0x00db
            return r8
        L_0x00db:
            androidx.compose.ui.input.pointer.o r0 = (androidx.compose.p004ui.input.pointer.C15491o) r0
            java.util.List r9 = r0.mo44110e()
            int r11 = r9.size()
        L_0x00e5:
            if (r12 >= r11) goto L_0x00f8
            java.lang.Object r19 = r9.get(r12)
            androidx.compose.ui.input.pointer.w r19 = (androidx.compose.p004ui.input.pointer.C15507w) r19
            boolean r19 = r19.mo44167A()
            if (r19 == 0) goto L_0x00f5
            r9 = 1
            goto L_0x00f9
        L_0x00f5:
            int r12 = r12 + 1
            goto L_0x00e5
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            if (r9 != 0) goto L_0x01be
            float r20 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9463h(r0)
            float r11 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9462g(r0)
            r27 = r1
            r28 = r2
            long r1 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9461f(r0)
            if (r4 != 0) goto L_0x015e
            float r7 = r7 * r20
            float r14 = r14 + r11
            long r5 = androidx.compose.p004ui.geometry.C15094f.m64886v(r5, r1)
            r12 = 0
            float r18 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9459d(r0, r12)
            r16 = r4
            r12 = 1
            float r4 = (float) r12
            float r4 = r4 - r7
            float r4 = java.lang.Math.abs(r4)
            float r4 = r4 * r18
            r19 = 1078530011(0x40490fdb, float:3.1415927)
            float r19 = r19 * r14
            float r19 = r19 * r18
            r18 = 1127481344(0x43340000, float:180.0)
            float r19 = r19 / r18
            float r18 = java.lang.Math.abs(r19)
            float r19 = androidx.compose.p004ui.geometry.C15094f.m64877m(r5)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0143
            int r4 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0143
            int r4 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0160
        L_0x0143:
            java.lang.Object r4 = r10.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0155
            int r4 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0155
            r4 = r12
            goto L_0x0156
        L_0x0155:
            r4 = 0
        L_0x0156:
            androidx.compose.foundation.gestures.o$b r12 = androidx.compose.foundation.gestures.C2205o.C2207b.f5941a
            r15.mo23751L(r12)
            r16 = 1
            goto L_0x0162
        L_0x015e:
            r16 = r4
        L_0x0160:
            r4 = r28
        L_0x0162:
            if (r16 == 0) goto L_0x01ba
            if (r4 == 0) goto L_0x016a
            r11 = 0
            r23 = 0
            goto L_0x016d
        L_0x016a:
            r23 = r11
            r11 = 0
        L_0x016d:
            int r12 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r12 != 0) goto L_0x0173
            r12 = 1
            goto L_0x0174
        L_0x0173:
            r12 = 0
        L_0x0174:
            if (r12 == 0) goto L_0x018f
            r12 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r17 != 0) goto L_0x017f
            r17 = 1
            goto L_0x0181
        L_0x017f:
            r17 = 0
        L_0x0181:
            if (r17 == 0) goto L_0x018f
            androidx.compose.ui.geometry.f$a r17 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r11 = r17.mo42248e()
            boolean r11 = androidx.compose.p004ui.geometry.C15094f.m64876l(r1, r11)
            if (r11 != 0) goto L_0x019d
        L_0x018f:
            androidx.compose.foundation.gestures.o$a r11 = new androidx.compose.foundation.gestures.o$a
            r24 = 0
            r19 = r11
            r21 = r1
            r19.<init>(r20, r21, r23, r24)
            r15.mo23751L(r11)
        L_0x019d:
            java.util.List r1 = r0.mo44110e()
            int r2 = r1.size()
            r11 = 0
        L_0x01a6:
            if (r11 >= r2) goto L_0x01ba
            java.lang.Object r12 = r1.get(r11)
            androidx.compose.ui.input.pointer.w r12 = (androidx.compose.p004ui.input.pointer.C15507w) r12
            boolean r17 = androidx.compose.p004ui.input.pointer.C15492p.m68696p(r12)
            if (r17 == 0) goto L_0x01b7
            r12.mo44168a()
        L_0x01b7:
            int r11 = r11 + 1
            goto L_0x01a6
        L_0x01ba:
            r2 = r4
            r4 = r16
            goto L_0x01c4
        L_0x01be:
            r27 = r1
            r28 = r2
            r16 = r4
        L_0x01c4:
            if (r9 != 0) goto L_0x01ee
            java.util.List r0 = r0.mo44110e()
            int r1 = r0.size()
            r9 = 0
        L_0x01cf:
            if (r9 >= r1) goto L_0x01e2
            java.lang.Object r11 = r0.get(r9)
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            boolean r11 = r11.mo44178r()
            if (r11 == 0) goto L_0x01df
            r0 = 1
            goto L_0x01e3
        L_0x01df:
            int r9 = r9 + 1
            goto L_0x01cf
        L_0x01e2:
            r0 = 0
        L_0x01e3:
            if (r0 != 0) goto L_0x01e6
            goto L_0x01ee
        L_0x01e6:
            r1 = r27
            r9 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r12 = 0
            goto L_0x00bd
        L_0x01ee:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.m9468b(androidx.compose.ui.input.pointer.c, androidx.compose.runtime.k2, kotlinx.coroutines.channels.g, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m9469c(@C12579k C8767m mVar, @C12579k C2211q qVar, boolean z, boolean z2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "state");
        if (InspectableValueKt.m71063e()) {
            lVar = new TransformableKt$transformable$$inlined$debugInspectorInfo$1(qVar, z2, z);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new TransformableKt$transformable$2(z, z2, qVar));
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m9470d(C8767m mVar, C2211q qVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return m9469c(mVar, qVar, z, z2);
    }
}
