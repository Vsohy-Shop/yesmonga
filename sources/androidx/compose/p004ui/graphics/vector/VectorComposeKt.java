package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15251k3;
import androidx.compose.p004ui.graphics.C15253k4;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n325#2,11:166\n251#2,10:177\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,11\n116#1:177,10\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt */
public final class VectorComposeKt {
    /* JADX WARNING: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0115  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.p004ui.graphics.vector.C15375k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m66777a(@org.jetbrains.annotations.C12580l java.lang.String r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, @org.jetbrains.annotations.C12580l java.util.List<? extends androidx.compose.p004ui.graphics.vector.C15349f> r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r10 = r29
            r11 = r31
            r12 = r32
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -213417674(0xfffffffff3478136, float:-1.5806393E31)
            r1 = r30
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x001e
            r3 = r11 | 6
            r4 = r3
            r3 = r20
            goto L_0x0032
        L_0x001e:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x002f
            r3 = r20
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002c
            r4 = 4
            goto L_0x002d
        L_0x002c:
            r4 = 2
        L_0x002d:
            r4 = r4 | r11
            goto L_0x0032
        L_0x002f:
            r3 = r20
            r4 = r11
        L_0x0032:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0039
            r4 = r4 | 48
            goto L_0x004c
        L_0x0039:
            r6 = r11 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r21
            boolean r7 = r1.mo14968d(r6)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r4 = r4 | r7
            goto L_0x004e
        L_0x004c:
            r6 = r21
        L_0x004e:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r9 = r11 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0068
            r9 = r22
            boolean r13 = r1.mo14968d(r9)
            if (r13 == 0) goto L_0x0064
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r13
            goto L_0x006a
        L_0x0068:
            r9 = r22
        L_0x006a:
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0071
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r14 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x0084
            r14 = r23
            boolean r15 = r1.mo14968d(r14)
            if (r15 == 0) goto L_0x0080
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r4 = r4 | r15
            goto L_0x0086
        L_0x0084:
            r14 = r23
        L_0x0086:
            r15 = r12 & 16
            if (r15 == 0) goto L_0x008f
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r0 = r24
            goto L_0x00a5
        L_0x008f:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r11 & r16
            r0 = r24
            if (r16 != 0) goto L_0x00a5
            boolean r17 = r1.mo14968d(r0)
            if (r17 == 0) goto L_0x00a1
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r4 = r4 | r17
        L_0x00a5:
            r17 = r12 & 32
            if (r17 == 0) goto L_0x00b0
            r18 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r18
            r8 = r25
            goto L_0x00c5
        L_0x00b0:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r11 & r18
            r8 = r25
            if (r18 != 0) goto L_0x00c5
            boolean r18 = r1.mo14968d(r8)
            if (r18 == 0) goto L_0x00c1
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r4 = r4 | r18
        L_0x00c5:
            r18 = r12 & 64
            if (r18 == 0) goto L_0x00d0
            r19 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r19
            r0 = r26
            goto L_0x00e5
        L_0x00d0:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r11 & r19
            r0 = r26
            if (r19 != 0) goto L_0x00e5
            boolean r19 = r1.mo14968d(r0)
            if (r19 == 0) goto L_0x00e1
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r4 = r4 | r19
        L_0x00e5:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f0
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r19
            r3 = r27
            goto L_0x0105
        L_0x00f0:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r11 & r19
            r3 = r27
            if (r19 != 0) goto L_0x0105
            boolean r19 = r1.mo14968d(r3)
            if (r19 == 0) goto L_0x0101
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0103
        L_0x0101:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0103:
            r4 = r4 | r19
        L_0x0105:
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x010d
            r19 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 | r19
        L_0x010d:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0115
            r6 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0113:
            r4 = r4 | r6
            goto L_0x0126
        L_0x0115:
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x0126
            boolean r6 = r1.mo14927P(r10)
            if (r6 == 0) goto L_0x0123
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0113
        L_0x0123:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0113
        L_0x0126:
            r6 = 256(0x100, float:3.59E-43)
            if (r3 != r6) goto L_0x014f
            r6 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r6 & r4
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r8) goto L_0x014f
            boolean r6 = r1.mo15011p()
            if (r6 != 0) goto L_0x013a
            goto L_0x014f
        L_0x013a:
            r1.mo14958a0()
            r2 = r20
            r5 = r21
            r13 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r3 = r9
            r4 = r14
            r9 = r28
            goto L_0x024a
        L_0x014f:
            r1.mo14930Q()
            r6 = r11 & 1
            r8 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r6 == 0) goto L_0x0175
            boolean r6 = r1.mo14977f0()
            if (r6 == 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            r1.mo14958a0()
            if (r3 == 0) goto L_0x0166
            r4 = r4 & r8
        L_0x0166:
            r2 = r20
            r5 = r21
            r13 = r24
            r7 = r25
            r15 = r26
            r6 = r27
        L_0x0172:
            r0 = r28
            goto L_0x01a8
        L_0x0175:
            if (r2 == 0) goto L_0x017a
            java.lang.String r2 = ""
            goto L_0x017c
        L_0x017a:
            r2 = r20
        L_0x017c:
            r6 = 0
            if (r5 == 0) goto L_0x0181
            r5 = r6
            goto L_0x0183
        L_0x0181:
            r5 = r21
        L_0x0183:
            if (r7 == 0) goto L_0x0186
            r9 = r6
        L_0x0186:
            if (r13 == 0) goto L_0x0189
            r14 = r6
        L_0x0189:
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r15 == 0) goto L_0x018f
            r13 = r7
            goto L_0x0191
        L_0x018f:
            r13 = r24
        L_0x0191:
            if (r17 == 0) goto L_0x0194
            goto L_0x0196
        L_0x0194:
            r7 = r25
        L_0x0196:
            if (r18 == 0) goto L_0x019a
            r15 = r6
            goto L_0x019c
        L_0x019a:
            r15 = r26
        L_0x019c:
            if (r0 == 0) goto L_0x019f
            goto L_0x01a1
        L_0x019f:
            r6 = r27
        L_0x01a1:
            if (r3 == 0) goto L_0x0172
            java.util.List r0 = androidx.compose.p004ui.graphics.vector.C15380n.m67243h()
            r4 = r4 & r8
        L_0x01a8:
            r1.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x01ba
            r3 = -1
            java.lang.String r8 = "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)"
            r11 = -213417674(0xfffffffff3478136, float:-1.5806393E31)
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r4, r3, r8)
        L_0x01ba:
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 r3 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$1.f37770f
            r8 = -548224868(0xffffffffdf52c09c, float:-1.518631E19)
            r1.mo14918M(r8)
            androidx.compose.runtime.d r8 = r1.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.p004ui.graphics.vector.C15374j
            if (r8 != 0) goto L_0x01cd
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01cd:
            r1.mo15026u()
            boolean r8 = r1.mo14997l()
            if (r8 == 0) goto L_0x01da
            r1.mo14947W(r3)
            goto L_0x01dd
        L_0x01da:
            r1.mo14888A()
        L_0x01dd:
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r1)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1 r8 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$1.f37771f
            androidx.compose.runtime.Updater.m30188j(r3, r2, r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r5)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2 r11 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$2.f37772f
            androidx.compose.runtime.Updater.m30188j(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r9)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3 r11 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$3.f37773f
            androidx.compose.runtime.Updater.m30188j(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r14)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4 r11 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$4.f37774f
            androidx.compose.runtime.Updater.m30188j(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r13)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5 r11 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$5.f37775f
            androidx.compose.runtime.Updater.m30188j(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6 r11 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$6.f37776f
            androidx.compose.runtime.Updater.m30188j(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r15)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7 r11 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$7.f37777f
            androidx.compose.runtime.Updater.m30188j(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r6)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8 r11 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$8.f37778f
            androidx.compose.runtime.Updater.m30188j(r3, r8, r11)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9 r8 = androidx.compose.p004ui.graphics.vector.VectorComposeKt$Group$2$9.f37779f
            androidx.compose.runtime.Updater.m30188j(r3, r0, r8)
            int r3 = r4 >> 27
            r3 = r3 & 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.invoke(r1, r3)
            r1.mo14896D()
            r1.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0244
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0244:
            r8 = r6
            r6 = r7
            r3 = r9
            r4 = r14
            r7 = r15
            r9 = r0
        L_0x024a:
            androidx.compose.runtime.t1 r14 = r1.mo15020s()
            if (r14 != 0) goto L_0x0251
            goto L_0x0263
        L_0x0251:
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4 r15 = new androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
            r0 = r15
            r1 = r2
            r2 = r5
            r5 = r13
            r10 = r29
            r11 = r31
            r12 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.mo15202a(r15)
        L_0x0263:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.vector.VectorComposeKt.m66777a(java.lang.String, float, float, float, float, float, float, float, java.util.List, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C15375k
    /* renamed from: b */
    public static final void m66778b(@C12579k List<? extends C15349f> list, int i, @C12580l String str, @C12580l C15421z1 z1Var, float f, @C12580l C15421z1 z1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, @C12580l C8592o oVar, int i4, int i5, int i6) {
        List<? extends C15349f> list2 = list;
        int i7 = i6;
        Intrinsics.checkNotNullParameter(list2, "pathData");
        C8592o o = oVar.mo15009o(-1478270750);
        int c = (i7 & 2) != 0 ? C15380n.m67238c() : i;
        String str2 = (i7 & 4) != 0 ? "" : str;
        C15421z1 z1Var3 = null;
        C15421z1 z1Var4 = (i7 & 8) != 0 ? null : z1Var;
        float f8 = (i7 & 16) != 0 ? 1.0f : f;
        if ((i7 & 32) == 0) {
            z1Var3 = z1Var2;
        }
        float f9 = (i7 & 64) != 0 ? 1.0f : f2;
        float f10 = (i7 & 128) != 0 ? 0.0f : f3;
        int d = (i7 & 256) != 0 ? C15380n.m67239d() : i2;
        int e = (i7 & 512) != 0 ? C15380n.m67240e() : i3;
        float f11 = (i7 & 1024) != 0 ? 4.0f : f4;
        float f12 = (i7 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i7 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i7 & 8192) != 0 ? 0.0f : f7;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1478270750, i4, i5, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:99)");
        } else {
            int i8 = i4;
            int i9 = i5;
        }
        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = VectorComposeKt$Path$1.f37780f;
        o.mo14918M(1886828752);
        if (!(o.mo15017r() instanceof C15374j)) {
            ComposablesKt.m29519n();
        }
        o.mo15026u();
        if (o.mo14997l()) {
            o.mo14947W(new VectorComposeKt$Path9cdaXJ4$$inlined$ComposeNode$1(vectorComposeKt$Path$1));
        } else {
            o.mo14888A();
        }
        C8592o b = Updater.m30180b(o);
        Updater.m30188j(b, str2, VectorComposeKt$Path$2$1.f37781f);
        Updater.m30188j(b, list2, VectorComposeKt$Path$2$2.f37787f);
        Updater.m30188j(b, C15251k3.m66150c(c), VectorComposeKt$Path$2$3.f37788f);
        Updater.m30188j(b, z1Var4, VectorComposeKt$Path$2$4.f37789f);
        Updater.m30188j(b, Float.valueOf(f8), VectorComposeKt$Path$2$5.f37790f);
        Updater.m30188j(b, z1Var3, VectorComposeKt$Path$2$6.f37791f);
        Updater.m30188j(b, Float.valueOf(f9), VectorComposeKt$Path$2$7.f37792f);
        Updater.m30188j(b, Float.valueOf(f10), VectorComposeKt$Path$2$8.f37793f);
        Updater.m30188j(b, C15253k4.m66162d(e), VectorComposeKt$Path$2$9.f37794f);
        Updater.m30188j(b, C15244j4.m66126d(d), VectorComposeKt$Path$2$10.f37782f);
        Updater.m30188j(b, Float.valueOf(f11), VectorComposeKt$Path$2$11.f37783f);
        Updater.m30188j(b, Float.valueOf(f12), VectorComposeKt$Path$2$12.f37784f);
        Updater.m30188j(b, Float.valueOf(f13), VectorComposeKt$Path$2$13.f37785f);
        Updater.m30188j(b, Float.valueOf(f14), VectorComposeKt$Path$2$14.f37786f);
        o.mo14896D();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            VectorComposeKt$Path$3 vectorComposeKt$Path$3 = r0;
            VectorComposeKt$Path$3 vectorComposeKt$Path$32 = new VectorComposeKt$Path$3(list, c, str2, z1Var4, f8, z1Var3, f9, f10, d, e, f11, f12, f13, f14, i4, i5, i6);
            s.mo15202a(vectorComposeKt$Path$3);
        }
    }
}
