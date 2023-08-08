package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C8251n0
@C11363r0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1058:1\n25#2:1059\n25#2:1066\n36#2:1074\n1114#3,6:1060\n1114#3,6:1067\n1114#3,6:1075\n76#4:1073\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n*L\n260#1:1059\n264#1:1066\n269#1:1074\n260#1:1060,6\n264#1:1067,6\n269#1:1075,6\n265#1:1073\n*E\n"})
public interface ExposedDropdownMenuBoxScope {
    /* renamed from: c */
    static /* synthetic */ C8767m m25758c(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, C8767m mVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return exposedDropdownMenuBoxScope.mo11544a(mVar, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
    }

    @C12579k
    /* renamed from: a */
    C8767m mo11544a(@C12579k C8767m mVar, boolean z);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: kotlin.jvm.functions.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void mo11545b(boolean r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r28, int r29, int r30) {
        /*
            r23 = this;
            r6 = r25
            r14 = r27
            r15 = r29
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1658683708(0xffffffff9d227ec4, float:-2.1506058E-21)
            r1 = r28
            androidx.compose.runtime.o r5 = r1.mo15009o(r0)
            r1 = r30 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0023
            r1 = r15 | 6
            r4 = r24
            goto L_0x0035
        L_0x0023:
            r1 = r15 & 14
            r4 = r24
            if (r1 != 0) goto L_0x0034
            boolean r1 = r5.mo14961b(r4)
            if (r1 == 0) goto L_0x0031
            r1 = 4
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            r1 = r1 | r15
            goto L_0x0035
        L_0x0034:
            r1 = r15
        L_0x0035:
            r3 = r30 & 2
            if (r3 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004c
        L_0x003c:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            boolean r3 = r5.mo14927P(r6)
            if (r3 == 0) goto L_0x0049
            r3 = 32
            goto L_0x004b
        L_0x0049:
            r3 = 16
        L_0x004b:
            r1 = r1 | r3
        L_0x004c:
            r3 = r30 & 4
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0066
            r7 = r26
            boolean r8 = r5.mo15006n0(r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r8
            goto L_0x0068
        L_0x0066:
            r7 = r26
        L_0x0068:
            r8 = r30 & 8
            if (r8 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r8 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007f
            boolean r8 = r5.mo14927P(r14)
            if (r8 == 0) goto L_0x007c
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r8
        L_0x007f:
            r8 = r30 & 16
            if (r8 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r13 = r23
            goto L_0x009c
        L_0x0088:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r15
            r13 = r23
            if (r8 != 0) goto L_0x009c
            boolean r8 = r5.mo15006n0(r13)
            if (r8 == 0) goto L_0x0099
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r8
        L_0x009c:
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r1
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r9) goto L_0x00b2
            boolean r8 = r5.mo15011p()
            if (r8 != 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            r5.mo14958a0()
            r4 = r7
            r7 = r5
            goto L_0x01a3
        L_0x00b2:
            if (r3 == 0) goto L_0x00b9
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r3
            goto L_0x00bb
        L_0x00b9:
            r16 = r7
        L_0x00bb:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x00c7
            r3 = -1
            java.lang.String r7 = "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:244)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r3, r7)
        L_0x00c7:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r0)
            java.lang.Object r3 = r5.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r7.mo16277a()
            if (r3 != r8) goto L_0x00e3
            androidx.compose.animation.core.o0 r3 = new androidx.compose.animation.core.o0
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r3.<init>(r8)
            r5.mo14893C(r3)
        L_0x00e3:
            r5.mo15002m0()
            r8 = r3
            androidx.compose.animation.core.o0 r8 = (androidx.compose.animation.core.C1998o0) r8
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r24)
            r8.mo6949g(r3)
            java.lang.Object r3 = r8.mo6943a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x010c
            java.lang.Object r3 = r8.mo6944b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r7 = r5
            goto L_0x0198
        L_0x010c:
            r5.mo14918M(r0)
            java.lang.Object r0 = r5.mo14921N()
            java.lang.Object r3 = r7.mo16277a()
            if (r0 != r3) goto L_0x012b
            androidx.compose.ui.graphics.o4$a r0 = androidx.compose.p004ui.graphics.C15283o4.f37618b
            long r9 = r0.mo42933a()
            androidx.compose.ui.graphics.o4 r0 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r9)
            r3 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r3, r2, r3)
            r5.mo14893C(r0)
        L_0x012b:
            r5.mo15002m0()
            r9 = r0
            androidx.compose.runtime.z0 r9 = (androidx.compose.runtime.C8700z0) r9
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r5.mo15032w(r0)
            r20 = r0
            androidx.compose.ui.unit.d r20 = (androidx.compose.p004ui.unit.C16479d) r20
            androidx.compose.ui.unit.i$a r0 = androidx.compose.p004ui.unit.C16486i.f40876b
            long r18 = r0.mo47834b()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r5.mo14918M(r0)
            boolean r0 = r5.mo15006n0(r9)
            java.lang.Object r2 = r5.mo14921N()
            if (r0 != 0) goto L_0x0159
            java.lang.Object r0 = r7.mo16277a()
            if (r2 != r0) goto L_0x0161
        L_0x0159:
            androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 r2 = new androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
            r2.<init>(r9)
            r5.mo14893C(r2)
        L_0x0161:
            r5.mo15002m0()
            r21 = r2
            kotlin.jvm.functions.p r21 = (kotlin.jvm.functions.C11304p) r21
            r22 = 0
            androidx.compose.material3.DropdownMenuPositionProvider r2 = new androidx.compose.material3.DropdownMenuPositionProvider
            r17 = r2
            r17.<init>(r18, r20, r21, r22)
            androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 r0 = new androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
            r7 = r0
            r10 = r23
            r11 = r16
            r12 = r27
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r3 = 395026654(0x178ba0de, float:9.023273E-25)
            r7 = 1
            androidx.compose.runtime.internal.a r3 = androidx.compose.runtime.internal.C8553b.m31048b(r5, r3, r7, r0)
            int r0 = r1 >> 3
            r0 = r0 & 14
            r7 = r0 | 384(0x180, float:5.38E-43)
            r8 = 0
            r0 = r25
            r1 = r2
            r2 = r3
            r3 = r5
            r4 = r7
            r7 = r5
            r5 = r8
            androidx.compose.material3.internal.ExposedDropdownMenuPopupKt.m27169a(r0, r1, r2, r3, r4, r5)
        L_0x0198:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01a1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01a1:
            r4 = r16
        L_0x01a3:
            androidx.compose.runtime.t1 r8 = r7.mo15020s()
            if (r8 != 0) goto L_0x01aa
            goto L_0x01bf
        L_0x01aa:
            androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 r9 = new androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
            r0 = r9
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r27
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.mo11545b(boolean, kotlin.jvm.functions.a, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C12579k
    /* renamed from: d */
    C8767m mo11546d(@C12579k C8767m mVar);
}
