package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nPhysicalStoreContactComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreContactComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreContactComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,112:1\n76#2:113\n154#3:114\n154#3:115\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreContactComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreContactComponentKt\n*L\n39#1:113\n42#1:114\n43#1:115\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt */
public final class PhysicalStoreContactComponentKt {
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109594a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r27, @org.jetbrains.annotations.C12579k java.lang.String r28, @org.jetbrains.annotations.C12579k java.lang.String r29, @org.jetbrains.annotations.C12579k java.lang.String r30, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r31, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r34
            java.lang.String r0 = "directionText"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "directionUri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "phoneNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 419217624(0x18fcc0d8, float:6.5335196E-24)
            r1 = r33
            androidx.compose.runtime.o r14 = r1.mo15009o(r0)
            r1 = r35 & 1
            if (r1 == 0) goto L_0x002a
            r2 = r11 | 6
            r3 = r2
            r2 = r27
            goto L_0x003e
        L_0x002a:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x003b
            r2 = r27
            boolean r3 = r14.mo15006n0(r2)
            if (r3 == 0) goto L_0x0038
            r3 = 4
            goto L_0x0039
        L_0x0038:
            r3 = 2
        L_0x0039:
            r3 = r3 | r11
            goto L_0x003e
        L_0x003b:
            r2 = r27
            r3 = r11
        L_0x003e:
            r4 = r35 & 2
            if (r4 == 0) goto L_0x0045
            r3 = r3 | 48
            goto L_0x0055
        L_0x0045:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0055
            boolean r4 = r14.mo15006n0(r8)
            if (r4 == 0) goto L_0x0052
            r4 = 32
            goto L_0x0054
        L_0x0052:
            r4 = 16
        L_0x0054:
            r3 = r3 | r4
        L_0x0055:
            r4 = r35 & 4
            if (r4 == 0) goto L_0x005c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006c
            boolean r4 = r14.mo15006n0(r9)
            if (r4 == 0) goto L_0x0069
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r3 = r3 | r4
        L_0x006c:
            r4 = r35 & 8
            if (r4 == 0) goto L_0x0073
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0073:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0083
            boolean r4 = r14.mo15006n0(r10)
            if (r4 == 0) goto L_0x0080
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r4
        L_0x0083:
            r4 = r35 & 16
            if (r4 == 0) goto L_0x008a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008a:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r11
            if (r5 != 0) goto L_0x009f
            r5 = r31
            boolean r6 = r14.mo14927P(r5)
            if (r6 == 0) goto L_0x009b
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r6
            goto L_0x00a1
        L_0x009f:
            r5 = r31
        L_0x00a1:
            r6 = r35 & 32
            if (r6 == 0) goto L_0x00a9
            r7 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r7
            goto L_0x00bd
        L_0x00a9:
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r11
            if (r7 != 0) goto L_0x00bd
            r7 = r32
            boolean r12 = r14.mo14927P(r7)
            if (r12 == 0) goto L_0x00b9
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r3 = r3 | r12
            goto L_0x00bf
        L_0x00bd:
            r7 = r32
        L_0x00bf:
            r12 = r3
            r3 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r12
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r13) goto L_0x00d9
            boolean r3 = r14.mo15011p()
            if (r3 != 0) goto L_0x00d0
            goto L_0x00d9
        L_0x00d0:
            r14.mo14958a0()
            r24 = r2
            r6 = r7
            r1 = r14
            goto L_0x0160
        L_0x00d9:
            if (r1 == 0) goto L_0x00e0
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r24 = r1
            goto L_0x00e2
        L_0x00e0:
            r24 = r2
        L_0x00e2:
            if (r4 == 0) goto L_0x00e9
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$1 r1 = com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$1.f62510f
            r25 = r1
            goto L_0x00eb
        L_0x00e9:
            r25 = r5
        L_0x00eb:
            if (r6 == 0) goto L_0x00f2
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$2 r1 = com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$2.f62511f
            r26 = r1
            goto L_0x00f4
        L_0x00f2:
            r26 = r7
        L_0x00f4:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0100
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponent (PhysicalStoreContactComponent.kt:30)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r1, r2)
        L_0x0100:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71024v()
            java.lang.Object r0 = r14.mo15032w(r0)
            r5 = r0
            androidx.compose.ui.platform.z3 r5 = (androidx.compose.p004ui.platform.C16007z3) r5
            r0 = 8
            float r0 = (float) r0
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.foundation.shape.n r13 = androidx.compose.foundation.shape.C2694o.m12166h(r1)
            r17 = 0
            r19 = 0
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3 r7 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3
            r0 = r7
            r1 = r26
            r2 = r30
            r3 = r12
            r4 = r25
            r6 = r29
            r15 = r7
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1402010852(0xffffffffac6f031c, float:-3.3965669E-12)
            r1 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r0, r1, r15)
            r1 = 1769472(0x1b0000, float:2.479558E-39)
            r2 = r12 & 14
            r22 = r2 | r1
            r23 = 28
            r12 = r24
            r1 = r14
            r2 = 0
            r14 = r2
            r16 = r17
            r18 = r19
            r19 = r20
            r20 = r0
            r21 = r1
            androidx.compose.material.SurfaceKt.m13879b(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x015c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x015c:
            r5 = r25
            r6 = r26
        L_0x0160:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x0167
            goto L_0x017c
        L_0x0167:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$4 r13 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$4
            r0 = r13
            r1 = r24
            r2 = r28
            r3 = r29
            r4 = r30
            r7 = r34
            r8 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.mo15202a(r13)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreContactComponentKt.m109594a(androidx.compose.ui.m, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109595b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1918312817);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1918312817, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentPreview (PhysicalStoreContactComponent.kt:101)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreContactComponentKt.f62427a.mo73930a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25358xff59f62(i));
        }
    }
}
