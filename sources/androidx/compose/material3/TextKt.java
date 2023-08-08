package androidx.compose.material3;

import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,362:1\n76#2:363\n76#2:368\n76#2:369\n76#2:370\n76#2:375\n76#2:376\n76#2:377\n658#3:364\n646#3:365\n658#3:366\n646#3:367\n658#3:371\n646#3:372\n658#3:373\n646#3:374\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n*L\n109#1:363\n114#1:368\n165#1:369\n259#1:370\n263#1:375\n316#1:376\n359#1:377\n112#1:364\n112#1:365\n113#1:366\n113#1:367\n261#1:371\n261#1:372\n262#1:373\n262#1:374\n*E\n"})
public final class TextKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C16361p0> f19885a = CompositionLocalKt.m29857c(C8415c2.m30254w(), TextKt$LocalTextStyle$1.f19886f);

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public static final void m26698a(@C12579k C16361p0 p0Var, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(p0Var, "value");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-460300127);
        if ((i & 14) == 0) {
            if (o.mo15006n0(p0Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:357)");
            }
            C8550i1 i1Var = f19885a;
            CompositionLocalKt.m29856b(new C8572j1[]{i1Var.mo16141f(((C16361p0) o.mo15032w(i1Var)).mo47493V(p0Var))}, pVar, o, (i2 & 112) | 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TextKt$ProvideTextStyle$1(p0Var, pVar, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0130  */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m26699b(androidx.compose.p004ui.text.C16156d r51, androidx.compose.p004ui.C8767m r52, long r53, long r55, androidx.compose.p004ui.text.font.C16190e0 r57, androidx.compose.p004ui.text.font.C16209i0 r58, androidx.compose.p004ui.text.font.C16242u r59, long r60, androidx.compose.p004ui.text.style.C16434j r62, androidx.compose.p004ui.text.style.C16432i r63, long r64, int r66, boolean r67, int r68, java.util.Map r69, kotlin.jvm.functions.C11300l r70, androidx.compose.p004ui.text.C16361p0 r71, androidx.compose.runtime.C8592o r72, int r73, int r74, int r75) {
        /*
            r15 = r51
            r13 = r73
            r14 = r74
            r12 = r75
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 224529679(0xd620d0f, float:6.9657345E-31)
            r1 = r72
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r13 | 6
            goto L_0x002d
        L_0x001d:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002c
            boolean r1 = r11.mo15006n0(r15)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r13
            goto L_0x002d
        L_0x002c:
            r1 = r13
        L_0x002d:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0034
            r1 = r1 | 48
            goto L_0x0047
        L_0x0034:
            r7 = r13 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r52
            boolean r8 = r11.mo15006n0(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r1 = r1 | r8
            goto L_0x0049
        L_0x0047:
            r7 = r52
        L_0x0049:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            r5 = r53
            goto L_0x0065
        L_0x0052:
            r2 = r13 & 896(0x380, float:1.256E-42)
            r5 = r53
            if (r2 != 0) goto L_0x0065
            boolean r17 = r11.mo14980g(r5)
            if (r17 == 0) goto L_0x0061
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r17
        L_0x0065:
            r17 = r12 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r9 = r55
            goto L_0x0085
        L_0x0072:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            r9 = r55
            if (r2 != 0) goto L_0x0085
            boolean r22 = r11.mo14980g(r9)
            if (r22 == 0) goto L_0x0081
            r22 = r18
            goto L_0x0083
        L_0x0081:
            r22 = r19
        L_0x0083:
            r1 = r1 | r22
        L_0x0085:
            r22 = r12 & 16
            if (r22 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r57
            goto L_0x00a4
        L_0x008e:
            r24 = 57344(0xe000, float:8.0356E-41)
            r24 = r13 & r24
            r3 = r57
            if (r24 != 0) goto L_0x00a4
            boolean r25 = r11.mo15006n0(r3)
            if (r25 == 0) goto L_0x00a0
            r25 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r25 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r1 = r1 | r25
        L_0x00a4:
            r25 = r12 & 32
            r26 = 458752(0x70000, float:6.42848E-40)
            r27 = 65536(0x10000, float:9.18355E-41)
            if (r25 == 0) goto L_0x00b3
            r28 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r28
            r0 = r58
            goto L_0x00c6
        L_0x00b3:
            r28 = r13 & r26
            r0 = r58
            if (r28 != 0) goto L_0x00c6
            boolean r29 = r11.mo15006n0(r0)
            if (r29 == 0) goto L_0x00c2
            r29 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r29 = r27
        L_0x00c4:
            r1 = r1 | r29
        L_0x00c6:
            r29 = r12 & 64
            r30 = 3670016(0x380000, float:5.142788E-39)
            if (r29 == 0) goto L_0x00d3
            r31 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r31
            r2 = r59
            goto L_0x00e6
        L_0x00d3:
            r31 = r13 & r30
            r2 = r59
            if (r31 != 0) goto L_0x00e6
            boolean r32 = r11.mo15006n0(r2)
            if (r32 == 0) goto L_0x00e2
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e4
        L_0x00e2:
            r32 = 524288(0x80000, float:7.34684E-40)
        L_0x00e4:
            r1 = r1 | r32
        L_0x00e6:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r32 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00f3
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r33
            r2 = r60
            goto L_0x0106
        L_0x00f3:
            r33 = r13 & r32
            r2 = r60
            if (r33 != 0) goto L_0x0106
            boolean r33 = r11.mo14980g(r2)
            if (r33 == 0) goto L_0x0102
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0102:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r1 = r1 | r33
        L_0x0106:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x010e
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r3
            goto L_0x0123
        L_0x010e:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x0123
            r3 = r62
            boolean r33 = r11.mo15006n0(r3)
            if (r33 == 0) goto L_0x011e
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0120
        L_0x011e:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0120:
            r1 = r1 | r33
            goto L_0x0125
        L_0x0123:
            r3 = r62
        L_0x0125:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0130
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r33
            r5 = r63
            goto L_0x0144
        L_0x0130:
            r33 = 1879048192(0x70000000, float:1.58456325E29)
            r33 = r13 & r33
            r5 = r63
            if (r33 != 0) goto L_0x0144
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x0141
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0143
        L_0x0141:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0143:
            r1 = r1 | r6
        L_0x0144:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x014d
            r24 = r14 | 6
            r9 = r64
            goto L_0x0163
        L_0x014d:
            r33 = r14 & 14
            r9 = r64
            if (r33 != 0) goto L_0x0161
            boolean r33 = r11.mo14980g(r9)
            if (r33 == 0) goto L_0x015c
            r24 = 4
            goto L_0x015e
        L_0x015c:
            r24 = 2
        L_0x015e:
            r24 = r14 | r24
            goto L_0x0163
        L_0x0161:
            r24 = r14
        L_0x0163:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016a
            r24 = r24 | 48
            goto L_0x017d
        L_0x016a:
            r33 = r14 & 112(0x70, float:1.57E-43)
            r7 = r66
            if (r33 != 0) goto L_0x017d
            boolean r33 = r11.mo14976f(r7)
            if (r33 == 0) goto L_0x0179
            r16 = 32
            goto L_0x017b
        L_0x0179:
            r16 = 16
        L_0x017b:
            r24 = r24 | r16
        L_0x017d:
            r7 = r24
            r9 = r12 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0186
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x019a
        L_0x0186:
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x019a
            r10 = r67
            boolean r16 = r11.mo14961b(r10)
            if (r16 == 0) goto L_0x0195
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x0197
        L_0x0195:
            r23 = 128(0x80, float:1.794E-43)
        L_0x0197:
            r7 = r7 | r23
            goto L_0x019c
        L_0x019a:
            r10 = r67
        L_0x019c:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a3
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b5
        L_0x01a3:
            r15 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01b5
            r15 = r68
            boolean r16 = r11.mo14976f(r15)
            if (r16 == 0) goto L_0x01b0
            goto L_0x01b2
        L_0x01b0:
            r18 = r19
        L_0x01b2:
            r7 = r7 | r18
            goto L_0x01b7
        L_0x01b5:
            r15 = r68
        L_0x01b7:
            r15 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01bd
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
        L_0x01bd:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r12 & r16
            if (r16 == 0) goto L_0x01c9
            r18 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r18
            goto L_0x01df
        L_0x01c9:
            r18 = r14 & r26
            if (r18 != 0) goto L_0x01df
            r18 = r10
            r10 = r70
            boolean r19 = r11.mo14927P(r10)
            if (r19 == 0) goto L_0x01da
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01dc
        L_0x01da:
            r19 = r27
        L_0x01dc:
            r7 = r7 | r19
            goto L_0x01e3
        L_0x01df:
            r18 = r10
            r10 = r70
        L_0x01e3:
            r19 = r14 & r30
            if (r19 != 0) goto L_0x01fb
            r19 = r12 & r27
            r10 = r71
            if (r19 != 0) goto L_0x01f6
            boolean r19 = r11.mo15006n0(r10)
            if (r19 == 0) goto L_0x01f6
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01f8
        L_0x01f6:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x01f8:
            r7 = r7 | r19
            goto L_0x01fd
        L_0x01fb:
            r10 = r71
        L_0x01fd:
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r15 != r10) goto L_0x0241
            r10 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r10 & r1
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r14) goto L_0x0241
            r10 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r10 & r7
            r14 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r14) goto L_0x0241
            boolean r10 = r11.mo15011p()
            if (r10 != 0) goto L_0x021a
            goto L_0x0241
        L_0x021a:
            r11.mo14958a0()
            r2 = r52
            r3 = r53
            r5 = r55
            r7 = r57
            r8 = r58
            r9 = r59
            r12 = r62
            r13 = r63
            r14 = r64
            r16 = r66
            r17 = r67
            r18 = r68
            r19 = r69
            r20 = r70
            r21 = r71
            r26 = r11
            r10 = r60
            goto L_0x03d0
        L_0x0241:
            r11.mo14930Q()
            r10 = r13 & 1
            if (r10 == 0) goto L_0x027c
            boolean r10 = r11.mo14977f0()
            if (r10 == 0) goto L_0x024f
            goto L_0x027c
        L_0x024f:
            r11.mo14958a0()
            r0 = r12 & r27
            if (r0 == 0) goto L_0x025a
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r0
        L_0x025a:
            r27 = r52
            r33 = r53
            r35 = r55
            r29 = r57
            r31 = r58
            r37 = r59
            r38 = r60
            r40 = r62
            r41 = r63
            r42 = r64
            r44 = r66
            r45 = r67
            r46 = r68
            r47 = r69
            r48 = r70
            r49 = r71
            goto L_0x032f
        L_0x027c:
            if (r4 == 0) goto L_0x0281
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0283
        L_0x0281:
            r4 = r52
        L_0x0283:
            if (r8 == 0) goto L_0x028c
            androidx.compose.ui.graphics.j2$a r8 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r19 = r8.mo42851u()
            goto L_0x028e
        L_0x028c:
            r19 = r53
        L_0x028e:
            if (r17 == 0) goto L_0x0297
            androidx.compose.ui.unit.t$a r8 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r23 = r8.mo47903b()
            goto L_0x0299
        L_0x0297:
            r23 = r55
        L_0x0299:
            r8 = 0
            if (r22 == 0) goto L_0x029e
            r10 = r8
            goto L_0x02a0
        L_0x029e:
            r10 = r57
        L_0x02a0:
            if (r25 == 0) goto L_0x02a4
            r14 = r8
            goto L_0x02a6
        L_0x02a4:
            r14 = r58
        L_0x02a6:
            if (r29 == 0) goto L_0x02ab
            r17 = r8
            goto L_0x02ad
        L_0x02ab:
            r17 = r59
        L_0x02ad:
            if (r0 == 0) goto L_0x02b6
            androidx.compose.ui.unit.t$a r0 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r21 = r0.mo47903b()
            goto L_0x02b8
        L_0x02b6:
            r21 = r60
        L_0x02b8:
            if (r2 == 0) goto L_0x02bc
            r0 = r8
            goto L_0x02be
        L_0x02bc:
            r0 = r62
        L_0x02be:
            if (r3 == 0) goto L_0x02c1
            goto L_0x02c3
        L_0x02c1:
            r8 = r63
        L_0x02c3:
            if (r6 == 0) goto L_0x02cc
            androidx.compose.ui.unit.t$a r2 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r2 = r2.mo47903b()
            goto L_0x02ce
        L_0x02cc:
            r2 = r64
        L_0x02ce:
            if (r5 == 0) goto L_0x02d7
            androidx.compose.ui.text.style.r$a r5 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r5 = r5.mo47726a()
            goto L_0x02d9
        L_0x02d7:
            r5 = r66
        L_0x02d9:
            if (r9 == 0) goto L_0x02dd
            r6 = 1
            goto L_0x02df
        L_0x02dd:
            r6 = r67
        L_0x02df:
            if (r18 == 0) goto L_0x02e5
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02e7
        L_0x02e5:
            r9 = r68
        L_0x02e7:
            if (r15 == 0) goto L_0x02ee
            java.util.Map r15 = kotlin.collections.C10977s0.m41492z()
            goto L_0x02f0
        L_0x02ee:
            r15 = r69
        L_0x02f0:
            if (r16 == 0) goto L_0x02f5
            androidx.compose.material3.TextKt$Text$7 r16 = androidx.compose.material3.TextKt$Text$7.f19890f
            goto L_0x02f7
        L_0x02f5:
            r16 = r70
        L_0x02f7:
            r18 = r12 & r27
            r52 = r0
            if (r18 == 0) goto L_0x030f
            androidx.compose.runtime.i1<androidx.compose.ui.text.p0> r0 = f19885a
            java.lang.Object r0 = r11.mo15032w(r0)
            androidx.compose.ui.text.p0 r0 = (androidx.compose.p004ui.text.C16361p0) r0
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r18
            r40 = r52
            r49 = r0
            goto L_0x0313
        L_0x030f:
            r40 = r52
            r49 = r71
        L_0x0313:
            r42 = r2
            r27 = r4
            r44 = r5
            r45 = r6
            r41 = r8
            r46 = r9
            r29 = r10
            r31 = r14
            r47 = r15
            r48 = r16
            r37 = r17
            r33 = r19
            r38 = r21
            r35 = r23
        L_0x032f:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0340
            java.lang.String r0 = "androidx.compose.material3.Text (Text.kt:298)"
            r2 = 224529679(0xd620d0f, float:6.9657345E-31)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r7, r0)
        L_0x0340:
            r18 = 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r26
            r0 = r0 | r2
            r2 = r1 & r30
            r0 = r0 | r2
            r2 = r1 & r32
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r23 = r0 | r1
            r0 = 286720(0x46000, float:4.0178E-40)
            r1 = r7 & 14
            r0 = r0 | r1
            r1 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r7 << 3
            r2 = r1 & r30
            r0 = r0 | r2
            r1 = r1 & r32
            r24 = r0 | r1
            r25 = 0
            r0 = r51
            r1 = r27
            r2 = r33
            r4 = r35
            r6 = r29
            r7 = r31
            r8 = r37
            r9 = r38
            r26 = r11
            r11 = r40
            r12 = r41
            r13 = r42
            r15 = r44
            r16 = r45
            r17 = r46
            r19 = r47
            r20 = r48
            r21 = r49
            r22 = r26
            m26701d(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03b0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03b0:
            r2 = r27
            r7 = r29
            r8 = r31
            r3 = r33
            r5 = r35
            r9 = r37
            r10 = r38
            r12 = r40
            r13 = r41
            r14 = r42
            r16 = r44
            r17 = r45
            r18 = r46
            r19 = r47
            r20 = r48
            r21 = r49
        L_0x03d0:
            androidx.compose.runtime.t1 r1 = r26.mo15020s()
            if (r1 != 0) goto L_0x03d7
            goto L_0x03ef
        L_0x03d7:
            androidx.compose.material3.TextKt$Text$8 r0 = new androidx.compose.material3.TextKt$Text$8
            r52 = r0
            r50 = r1
            r1 = r51
            r22 = r73
            r23 = r74
            r24 = r75
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r52
            r0 = r50
            r0.mo15202a(r1)
        L_0x03ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m26699b(androidx.compose.ui.text.d, androidx.compose.ui.m, long, long, androidx.compose.ui.text.font.e0, androidx.compose.ui.text.font.i0, androidx.compose.ui.text.font.u, long, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.i, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.l, androidx.compose.ui.text.p0, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0134  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26700c(@org.jetbrains.annotations.C12579k java.lang.String r66, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r67, long r68, long r70, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.font.C16190e0 r72, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.font.C16209i0 r73, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.font.C16242u r74, long r75, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.style.C16434j r77, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.style.C16432i r78, long r79, int r81, boolean r82, int r83, int r84, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.C16260h0, kotlin.C11079d2> r85, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r86, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r87, int r88, int r89, int r90) {
        /*
            r1 = r66
            r14 = r88
            r15 = r89
            r13 = r90
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -2055108902(0xffffffff858186da, float:-1.2180638E-35)
            r2 = r87
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001d
            r3 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r14
            goto L_0x002d
        L_0x002c:
            r3 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0034
            r3 = r3 | 48
            goto L_0x0047
        L_0x0034:
            r9 = r14 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r67
            boolean r10 = r2.mo15006n0(r9)
            if (r10 == 0) goto L_0x0043
            r10 = 32
            goto L_0x0045
        L_0x0043:
            r10 = 16
        L_0x0045:
            r3 = r3 | r10
            goto L_0x0049
        L_0x0047:
            r9 = r67
        L_0x0049:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            r7 = r68
            goto L_0x0065
        L_0x0052:
            r4 = r14 & 896(0x380, float:1.256E-42)
            r7 = r68
            if (r4 != 0) goto L_0x0065
            boolean r17 = r2.mo14980g(r7)
            if (r17 == 0) goto L_0x0061
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r17
        L_0x0065:
            r17 = r13 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0072
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r11 = r70
            goto L_0x0085
        L_0x0072:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            r11 = r70
            if (r4 != 0) goto L_0x0085
            boolean r22 = r2.mo14980g(r11)
            if (r22 == 0) goto L_0x0081
            r22 = r18
            goto L_0x0083
        L_0x0081:
            r22 = r19
        L_0x0083:
            r3 = r3 | r22
        L_0x0085:
            r22 = r13 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r22 == 0) goto L_0x0095
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r4 = r72
            goto L_0x00a8
        L_0x0095:
            r26 = r14 & r25
            r4 = r72
            if (r26 != 0) goto L_0x00a8
            boolean r27 = r2.mo15006n0(r4)
            if (r27 == 0) goto L_0x00a4
            r27 = r23
            goto L_0x00a6
        L_0x00a4:
            r27 = r24
        L_0x00a6:
            r3 = r3 | r27
        L_0x00a8:
            r27 = r13 & 32
            r28 = 458752(0x70000, float:6.42848E-40)
            r29 = 65536(0x10000, float:9.18355E-41)
            if (r27 == 0) goto L_0x00b7
            r30 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r30
            r5 = r73
            goto L_0x00ca
        L_0x00b7:
            r30 = r14 & r28
            r5 = r73
            if (r30 != 0) goto L_0x00ca
            boolean r31 = r2.mo15006n0(r5)
            if (r31 == 0) goto L_0x00c6
            r31 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c8
        L_0x00c6:
            r31 = r29
        L_0x00c8:
            r3 = r3 | r31
        L_0x00ca:
            r31 = r13 & 64
            r32 = 3670016(0x380000, float:5.142788E-39)
            if (r31 == 0) goto L_0x00d7
            r33 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r33
            r0 = r74
            goto L_0x00ea
        L_0x00d7:
            r33 = r14 & r32
            r0 = r74
            if (r33 != 0) goto L_0x00ea
            boolean r34 = r2.mo15006n0(r0)
            if (r34 == 0) goto L_0x00e6
            r34 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r34 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r3 = r3 | r34
        L_0x00ea:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f5
            r34 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r34
            r4 = r75
            goto L_0x010a
        L_0x00f5:
            r34 = 29360128(0x1c00000, float:7.052966E-38)
            r34 = r14 & r34
            r4 = r75
            if (r34 != 0) goto L_0x010a
            boolean r34 = r2.mo14980g(r4)
            if (r34 == 0) goto L_0x0106
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0108
        L_0x0106:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x0108:
            r3 = r3 | r34
        L_0x010a:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0115
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r34
            r4 = r77
            goto L_0x0129
        L_0x0115:
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            r34 = r14 & r34
            r4 = r77
            if (r34 != 0) goto L_0x0129
            boolean r5 = r2.mo15006n0(r4)
            if (r5 == 0) goto L_0x0126
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0128
        L_0x0126:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0128:
            r3 = r3 | r5
        L_0x0129:
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0134
            r34 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r34
            r4 = r78
            goto L_0x0149
        L_0x0134:
            r34 = 1879048192(0x70000000, float:1.58456325E29)
            r34 = r14 & r34
            r4 = r78
            if (r34 != 0) goto L_0x0149
            boolean r34 = r2.mo15006n0(r4)
            if (r34 == 0) goto L_0x0145
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0147
        L_0x0145:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0147:
            r3 = r3 | r34
        L_0x0149:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0152
            r30 = r15 | 6
            r7 = r79
            goto L_0x0168
        L_0x0152:
            r34 = r15 & 14
            r7 = r79
            if (r34 != 0) goto L_0x0166
            boolean r34 = r2.mo14980g(r7)
            if (r34 == 0) goto L_0x0161
            r30 = 4
            goto L_0x0163
        L_0x0161:
            r30 = 2
        L_0x0163:
            r30 = r15 | r30
            goto L_0x0168
        L_0x0166:
            r30 = r15
        L_0x0168:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x016f
            r30 = r30 | 48
            goto L_0x0185
        L_0x016f:
            r8 = r15 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0183
            r8 = r81
            boolean r34 = r2.mo14976f(r8)
            if (r34 == 0) goto L_0x017e
            r16 = 32
            goto L_0x0180
        L_0x017e:
            r16 = 16
        L_0x0180:
            r30 = r30 | r16
            goto L_0x0185
        L_0x0183:
            r8 = r81
        L_0x0185:
            r8 = r30
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x018e
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x01a2
        L_0x018e:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x01a2
            r11 = r82
            boolean r12 = r2.mo14961b(r11)
            if (r12 == 0) goto L_0x019d
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r8 = r8 | r26
            goto L_0x01a4
        L_0x01a2:
            r11 = r82
        L_0x01a4:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01ab
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bd
        L_0x01ab:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01bd
            r11 = r83
            boolean r16 = r2.mo14976f(r11)
            if (r16 == 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r18 = r19
        L_0x01ba:
            r8 = r8 | r18
            goto L_0x01bf
        L_0x01bd:
            r11 = r83
        L_0x01bf:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c6
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01da
        L_0x01c6:
            r16 = r15 & r25
            if (r16 != 0) goto L_0x01da
            r16 = r11
            r11 = r84
            boolean r18 = r2.mo14976f(r11)
            if (r18 == 0) goto L_0x01d5
            goto L_0x01d7
        L_0x01d5:
            r23 = r24
        L_0x01d7:
            r8 = r8 | r23
            goto L_0x01de
        L_0x01da:
            r16 = r11
            r11 = r84
        L_0x01de:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01ec
            r19 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 | r19
            r11 = r85
            goto L_0x01ff
        L_0x01ec:
            r19 = r15 & r28
            r11 = r85
            if (r19 != 0) goto L_0x01ff
            boolean r19 = r2.mo14927P(r11)
            if (r19 == 0) goto L_0x01fb
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fd
        L_0x01fb:
            r19 = r29
        L_0x01fd:
            r8 = r8 | r19
        L_0x01ff:
            r19 = r15 & r32
            if (r19 != 0) goto L_0x0217
            r19 = r13 & r29
            r11 = r86
            if (r19 != 0) goto L_0x0212
            boolean r19 = r2.mo15006n0(r11)
            if (r19 == 0) goto L_0x0212
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0214
        L_0x0212:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x0214:
            r8 = r8 | r19
            goto L_0x0219
        L_0x0217:
            r11 = r86
        L_0x0219:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r3 & r19
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r15) goto L_0x0258
            r11 = 2995931(0x2db6db, float:4.198194E-39)
            r11 = r11 & r8
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r15) goto L_0x0258
            boolean r11 = r2.mo15011p()
            if (r11 != 0) goto L_0x0233
            goto L_0x0258
        L_0x0233:
            r2.mo14958a0()
            r6 = r67
            r3 = r68
            r19 = r70
            r7 = r72
            r8 = r73
            r9 = r74
            r10 = r75
            r12 = r77
            r13 = r78
            r14 = r79
            r16 = r81
            r17 = r82
            r18 = r83
            r21 = r84
            r22 = r85
            r23 = r86
            goto L_0x03fd
        L_0x0258:
            r2.mo14930Q()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x0293
            boolean r11 = r2.mo14977f0()
            if (r11 == 0) goto L_0x0266
            goto L_0x0293
        L_0x0266:
            r2.mo14958a0()
            r0 = r13 & r29
            if (r0 == 0) goto L_0x0271
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r0
        L_0x0271:
            r6 = r67
            r10 = r68
            r19 = r70
            r21 = r72
            r22 = r73
            r23 = r74
            r26 = r75
            r0 = r77
            r17 = r78
            r4 = r79
            r1 = r81
            r7 = r82
            r9 = r83
            r12 = r84
            r16 = r85
        L_0x028f:
            r15 = r86
            goto L_0x0320
        L_0x0293:
            if (r6 == 0) goto L_0x0298
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x029a
        L_0x0298:
            r6 = r67
        L_0x029a:
            if (r10 == 0) goto L_0x02a3
            androidx.compose.ui.graphics.j2$a r10 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r10 = r10.mo42851u()
            goto L_0x02a5
        L_0x02a3:
            r10 = r68
        L_0x02a5:
            if (r17 == 0) goto L_0x02ae
            androidx.compose.ui.unit.t$a r17 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r19 = r17.mo47903b()
            goto L_0x02b0
        L_0x02ae:
            r19 = r70
        L_0x02b0:
            r17 = 0
            if (r22 == 0) goto L_0x02b7
            r21 = r17
            goto L_0x02b9
        L_0x02b7:
            r21 = r72
        L_0x02b9:
            if (r27 == 0) goto L_0x02be
            r22 = r17
            goto L_0x02c0
        L_0x02be:
            r22 = r73
        L_0x02c0:
            if (r31 == 0) goto L_0x02c5
            r23 = r17
            goto L_0x02c7
        L_0x02c5:
            r23 = r74
        L_0x02c7:
            if (r0 == 0) goto L_0x02d0
            androidx.compose.ui.unit.t$a r0 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r26 = r0.mo47903b()
            goto L_0x02d2
        L_0x02d0:
            r26 = r75
        L_0x02d2:
            if (r1 == 0) goto L_0x02d7
            r0 = r17
            goto L_0x02d9
        L_0x02d7:
            r0 = r77
        L_0x02d9:
            if (r5 == 0) goto L_0x02dc
            goto L_0x02de
        L_0x02dc:
            r17 = r78
        L_0x02de:
            if (r4 == 0) goto L_0x02e7
            androidx.compose.ui.unit.t$a r1 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r4 = r1.mo47903b()
            goto L_0x02e9
        L_0x02e7:
            r4 = r79
        L_0x02e9:
            if (r7 == 0) goto L_0x02f2
            androidx.compose.ui.text.style.r$a r1 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r1 = r1.mo47726a()
            goto L_0x02f4
        L_0x02f2:
            r1 = r81
        L_0x02f4:
            if (r9 == 0) goto L_0x02f8
            r7 = 1
            goto L_0x02fa
        L_0x02f8:
            r7 = r82
        L_0x02fa:
            if (r12 == 0) goto L_0x0300
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0302
        L_0x0300:
            r9 = r83
        L_0x0302:
            if (r16 == 0) goto L_0x0306
            r12 = 1
            goto L_0x0308
        L_0x0306:
            r12 = r84
        L_0x0308:
            if (r18 == 0) goto L_0x030d
            androidx.compose.material3.TextKt$Text$1 r16 = androidx.compose.material3.TextKt$Text$1.f19887f
            goto L_0x030f
        L_0x030d:
            r16 = r85
        L_0x030f:
            r18 = r13 & r29
            if (r18 == 0) goto L_0x028f
            androidx.compose.runtime.i1<androidx.compose.ui.text.p0> r15 = f19885a
            java.lang.Object r15 = r2.mo15032w(r15)
            androidx.compose.ui.text.p0 r15 = (androidx.compose.p004ui.text.C16361p0) r15
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r18
        L_0x0320:
            r2.mo14899E()
            boolean r18 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r18 == 0) goto L_0x0331
            java.lang.String r13 = "androidx.compose.material3.Text (Text.kt:91)"
            r14 = -2055108902(0xffffffff858186da, float:-1.2180638E-35)
            androidx.compose.runtime.ComposerKt.m29845w0(r14, r3, r8, r13)
        L_0x0331:
            r13 = 79582822(0x4be5666, float:4.474813E-36)
            r2.mo14918M(r13)
            androidx.compose.ui.graphics.j2$a r13 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r29 = r13.mo42851u()
            int r14 = (r10 > r29 ? 1 : (r10 == r29 ? 0 : -1))
            if (r14 == 0) goto L_0x0343
            r14 = 1
            goto L_0x0344
        L_0x0343:
            r14 = 0
        L_0x0344:
            if (r14 == 0) goto L_0x0349
            r35 = r10
            goto L_0x036b
        L_0x0349:
            long r29 = r15.mo47510r()
            long r13 = r13.mo42851u()
            int r13 = (r29 > r13 ? 1 : (r29 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x0357
            r13 = 1
            goto L_0x0358
        L_0x0357:
            r13 = 0
        L_0x0358:
            if (r13 == 0) goto L_0x035b
            goto L_0x0369
        L_0x035b:
            androidx.compose.runtime.i1 r13 = androidx.compose.material3.ContentColorKt.m25558a()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.graphics.j2 r13 = (androidx.compose.p004ui.graphics.C15240j2) r13
            long r29 = r13.mo42833M()
        L_0x0369:
            r35 = r29
        L_0x036b:
            r2.mo15002m0()
            androidx.compose.ui.text.p0 r13 = new androidx.compose.ui.text.p0
            r34 = r13
            r41 = 0
            r43 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r52 = 0
            r54 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 4108112(0x3eaf50, float:5.756691E-39)
            r63 = 0
            r37 = r19
            r39 = r22
            r40 = r21
            r42 = r23
            r44 = r26
            r51 = r0
            r53 = r17
            r55 = r4
            r34.<init>((long) r35, (long) r37, (androidx.compose.p004ui.text.font.C16209i0) r39, (androidx.compose.p004ui.text.font.C16190e0) r40, (androidx.compose.p004ui.text.font.C16194f0) r41, (androidx.compose.p004ui.text.font.C16242u) r42, (java.lang.String) r43, (long) r44, (androidx.compose.p004ui.text.style.C16410a) r46, (androidx.compose.p004ui.text.style.C16439m) r47, (androidx.compose.p004ui.text.intl.C16342f) r48, (long) r49, (androidx.compose.p004ui.text.style.C16434j) r51, (androidx.compose.p004ui.graphics.C15205e4) r52, (androidx.compose.p004ui.text.style.C16432i) r53, (androidx.compose.p004ui.text.style.C16436k) r54, (long) r55, (androidx.compose.p004ui.text.style.C16442o) r57, (androidx.compose.p004ui.text.C16051a0) r58, (androidx.compose.p004ui.text.style.C16426h) r59, (androidx.compose.p004ui.text.style.C16417f) r60, (androidx.compose.p004ui.text.style.C16415e) r61, (int) r62, (kotlin.jvm.internal.DefaultConstructorMarker) r63)
            androidx.compose.ui.text.p0 r13 = r15.mo47493V(r13)
            r14 = r3 & 14
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r14
            int r14 = r8 >> 6
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r14
            int r8 = r8 << 9
            r14 = r8 & r25
            r3 = r3 | r14
            r14 = r8 & r28
            r3 = r3 | r14
            r14 = r8 & r32
            r3 = r3 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r14
            r3 = r3 | r8
            r8 = 0
            r67 = r66
            r68 = r6
            r69 = r13
            r70 = r16
            r71 = r1
            r72 = r7
            r73 = r9
            r74 = r12
            r75 = r2
            r76 = r3
            r77 = r8
            androidx.compose.foundation.text.BasicTextKt.m12207b(r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x03e4
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03e4:
            r18 = r9
            r13 = r17
            r8 = r22
            r9 = r23
            r17 = r7
            r23 = r15
            r22 = r16
            r7 = r21
            r16 = r1
            r14 = r4
            r3 = r10
            r21 = r12
            r10 = r26
            r12 = r0
        L_0x03fd:
            androidx.compose.runtime.t1 r5 = r2.mo15020s()
            if (r5 != 0) goto L_0x0404
            goto L_0x0426
        L_0x0404:
            androidx.compose.material3.TextKt$Text$2 r2 = new androidx.compose.material3.TextKt$Text$2
            r0 = r2
            r1 = r66
            r64 = r2
            r2 = r6
            r65 = r5
            r5 = r19
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r88
            r23 = r89
            r24 = r90
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r64
            r0 = r65
            r0.mo15202a(r1)
        L_0x0426:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m26700c(java.lang.String, androidx.compose.ui.m, long, long, androidx.compose.ui.text.font.e0, androidx.compose.ui.text.font.i0, androidx.compose.ui.text.font.u, long, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.i, long, int, boolean, int, int, kotlin.jvm.functions.l, androidx.compose.ui.text.p0, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0136  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26701d(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.C16156d r68, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r69, long r70, long r72, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.font.C16190e0 r74, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.font.C16209i0 r75, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.font.C16242u r76, long r77, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.style.C16434j r79, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.style.C16432i r80, long r81, int r83, boolean r84, int r85, int r86, @org.jetbrains.annotations.C12580l java.util.Map<java.lang.String, androidx.compose.foundation.text.C2762c> r87, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.C16260h0, kotlin.C11079d2> r88, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r89, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r90, int r91, int r92, int r93) {
        /*
            r1 = r68
            r14 = r91
            r15 = r92
            r13 = r93
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 2027001676(0x78d1974c, float:3.4008085E34)
            r2 = r90
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001d
            r3 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r14
            goto L_0x002d
        L_0x002c:
            r3 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0034
            r3 = r3 | 48
            goto L_0x0047
        L_0x0034:
            r9 = r14 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r69
            boolean r10 = r2.mo15006n0(r9)
            if (r10 == 0) goto L_0x0043
            r10 = 32
            goto L_0x0045
        L_0x0043:
            r10 = 16
        L_0x0045:
            r3 = r3 | r10
            goto L_0x0049
        L_0x0047:
            r9 = r69
        L_0x0049:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            r7 = r70
            goto L_0x0065
        L_0x0052:
            r4 = r14 & 896(0x380, float:1.256E-42)
            r7 = r70
            if (r4 != 0) goto L_0x0065
            boolean r17 = r2.mo14980g(r7)
            if (r17 == 0) goto L_0x0061
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r17
        L_0x0065:
            r17 = r13 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0072
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r11 = r72
            goto L_0x0085
        L_0x0072:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            r11 = r72
            if (r4 != 0) goto L_0x0085
            boolean r22 = r2.mo14980g(r11)
            if (r22 == 0) goto L_0x0081
            r22 = r18
            goto L_0x0083
        L_0x0081:
            r22 = r19
        L_0x0083:
            r3 = r3 | r22
        L_0x0085:
            r22 = r13 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r22 == 0) goto L_0x0095
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r4 = r74
            goto L_0x00a8
        L_0x0095:
            r26 = r14 & r25
            r4 = r74
            if (r26 != 0) goto L_0x00a8
            boolean r27 = r2.mo15006n0(r4)
            if (r27 == 0) goto L_0x00a4
            r27 = r23
            goto L_0x00a6
        L_0x00a4:
            r27 = r24
        L_0x00a6:
            r3 = r3 | r27
        L_0x00a8:
            r27 = r13 & 32
            r28 = 65536(0x10000, float:9.18355E-41)
            r29 = 131072(0x20000, float:1.83671E-40)
            if (r27 == 0) goto L_0x00b7
            r30 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r30
            r5 = r75
            goto L_0x00cc
        L_0x00b7:
            r30 = 458752(0x70000, float:6.42848E-40)
            r30 = r14 & r30
            r5 = r75
            if (r30 != 0) goto L_0x00cc
            boolean r31 = r2.mo15006n0(r5)
            if (r31 == 0) goto L_0x00c8
            r31 = r29
            goto L_0x00ca
        L_0x00c8:
            r31 = r28
        L_0x00ca:
            r3 = r3 | r31
        L_0x00cc:
            r31 = r13 & 64
            r32 = 3670016(0x380000, float:5.142788E-39)
            if (r31 == 0) goto L_0x00d9
            r33 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r33
            r0 = r76
            goto L_0x00ec
        L_0x00d9:
            r33 = r14 & r32
            r0 = r76
            if (r33 != 0) goto L_0x00ec
            boolean r34 = r2.mo15006n0(r0)
            if (r34 == 0) goto L_0x00e8
            r34 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r34 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r3 = r3 | r34
        L_0x00ec:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r34 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x00f9
            r35 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r35
            r4 = r77
            goto L_0x010c
        L_0x00f9:
            r35 = r14 & r34
            r4 = r77
            if (r35 != 0) goto L_0x010c
            boolean r35 = r2.mo14980g(r4)
            if (r35 == 0) goto L_0x0108
            r35 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r35 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r3 = r3 | r35
        L_0x010c:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0117
            r35 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r35
            r4 = r79
            goto L_0x012b
        L_0x0117:
            r35 = 234881024(0xe000000, float:1.5777218E-30)
            r35 = r14 & r35
            r4 = r79
            if (r35 != 0) goto L_0x012b
            boolean r5 = r2.mo15006n0(r4)
            if (r5 == 0) goto L_0x0128
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r3 = r3 | r5
        L_0x012b:
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0136
            r35 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r35
            r4 = r80
            goto L_0x014b
        L_0x0136:
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            r35 = r14 & r35
            r4 = r80
            if (r35 != 0) goto L_0x014b
            boolean r35 = r2.mo15006n0(r4)
            if (r35 == 0) goto L_0x0147
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0149
        L_0x0147:
            r35 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0149:
            r3 = r3 | r35
        L_0x014b:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0154
            r30 = r15 | 6
            r7 = r81
            goto L_0x016a
        L_0x0154:
            r35 = r15 & 14
            r7 = r81
            if (r35 != 0) goto L_0x0168
            boolean r35 = r2.mo14980g(r7)
            if (r35 == 0) goto L_0x0163
            r30 = 4
            goto L_0x0165
        L_0x0163:
            r30 = 2
        L_0x0165:
            r30 = r15 | r30
            goto L_0x016a
        L_0x0168:
            r30 = r15
        L_0x016a:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0171
            r30 = r30 | 48
            goto L_0x0187
        L_0x0171:
            r8 = r15 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0185
            r8 = r83
            boolean r35 = r2.mo14976f(r8)
            if (r35 == 0) goto L_0x0180
            r16 = 32
            goto L_0x0182
        L_0x0180:
            r16 = 16
        L_0x0182:
            r30 = r30 | r16
            goto L_0x0187
        L_0x0185:
            r8 = r83
        L_0x0187:
            r8 = r30
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0190
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x01a4
        L_0x0190:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x01a4
            r11 = r84
            boolean r12 = r2.mo14961b(r11)
            if (r12 == 0) goto L_0x019f
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01a1
        L_0x019f:
            r26 = 128(0x80, float:1.794E-43)
        L_0x01a1:
            r8 = r8 | r26
            goto L_0x01a6
        L_0x01a4:
            r11 = r84
        L_0x01a6:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01ad
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bf
        L_0x01ad:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01bf
            r11 = r85
            boolean r16 = r2.mo14976f(r11)
            if (r16 == 0) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r18 = r19
        L_0x01bc:
            r8 = r8 | r18
            goto L_0x01c1
        L_0x01bf:
            r11 = r85
        L_0x01c1:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c8
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01dc
        L_0x01c8:
            r16 = r15 & r25
            if (r16 != 0) goto L_0x01dc
            r16 = r11
            r11 = r86
            boolean r18 = r2.mo14976f(r11)
            if (r18 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            r23 = r24
        L_0x01d9:
            r8 = r8 | r23
            goto L_0x01e0
        L_0x01dc:
            r16 = r11
            r11 = r86
        L_0x01e0:
            r18 = 32768(0x8000, float:4.5918E-41)
            r11 = r13 & r18
            if (r11 == 0) goto L_0x01e9
            r8 = r8 | r28
        L_0x01e9:
            r18 = r13 & r28
            if (r18 == 0) goto L_0x01f2
            r19 = 1572864(0x180000, float:2.204052E-39)
            r8 = r8 | r19
            goto L_0x0208
        L_0x01f2:
            r19 = r15 & r32
            if (r19 != 0) goto L_0x0208
            r19 = r12
            r12 = r88
            boolean r20 = r2.mo14927P(r12)
            if (r20 == 0) goto L_0x0203
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0205
        L_0x0203:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x0205:
            r8 = r8 | r20
            goto L_0x020c
        L_0x0208:
            r19 = r12
            r12 = r88
        L_0x020c:
            r20 = r15 & r34
            if (r20 != 0) goto L_0x0224
            r20 = r13 & r29
            r12 = r89
            if (r20 != 0) goto L_0x021f
            boolean r20 = r2.mo15006n0(r12)
            if (r20 == 0) goto L_0x021f
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0221
        L_0x021f:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x0221:
            r8 = r8 | r20
            goto L_0x0226
        L_0x0224:
            r12 = r89
        L_0x0226:
            r12 = 32768(0x8000, float:4.5918E-41)
            if (r11 != r12) goto L_0x026b
            r12 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r12 & r3
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x026b
            r12 = 23967451(0x16db6db, float:4.3661218E-38)
            r12 = r12 & r8
            r15 = 4793490(0x492492, float:6.71711E-39)
            if (r12 != r15) goto L_0x026b
            boolean r12 = r2.mo15011p()
            if (r12 != 0) goto L_0x0244
            goto L_0x026b
        L_0x0244:
            r2.mo14958a0()
            r6 = r69
            r3 = r70
            r23 = r72
            r7 = r74
            r8 = r75
            r9 = r76
            r10 = r77
            r12 = r79
            r13 = r80
            r14 = r81
            r16 = r83
            r17 = r84
            r18 = r85
            r19 = r86
            r20 = r87
            r21 = r88
            r22 = r89
            goto L_0x0422
        L_0x026b:
            r2.mo14930Q()
            r12 = r14 & 1
            if (r12 == 0) goto L_0x02a8
            boolean r12 = r2.mo14977f0()
            if (r12 == 0) goto L_0x0279
            goto L_0x02a8
        L_0x0279:
            r2.mo14958a0()
            r0 = r13 & r29
            if (r0 == 0) goto L_0x0284
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = r8 & r0
        L_0x0284:
            r6 = r69
            r20 = r70
            r23 = r72
            r12 = r74
            r17 = r75
            r22 = r76
            r26 = r77
            r0 = r79
            r10 = r80
            r4 = r81
            r1 = r83
            r7 = r84
            r9 = r85
            r16 = r86
            r11 = r87
            r18 = r88
        L_0x02a4:
            r15 = r89
            goto L_0x033c
        L_0x02a8:
            if (r6 == 0) goto L_0x02ad
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x02af
        L_0x02ad:
            r6 = r69
        L_0x02af:
            if (r10 == 0) goto L_0x02b8
            androidx.compose.ui.graphics.j2$a r10 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r20 = r10.mo42851u()
            goto L_0x02ba
        L_0x02b8:
            r20 = r70
        L_0x02ba:
            if (r17 == 0) goto L_0x02c3
            androidx.compose.ui.unit.t$a r10 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r23 = r10.mo47903b()
            goto L_0x02c5
        L_0x02c3:
            r23 = r72
        L_0x02c5:
            r10 = 0
            if (r22 == 0) goto L_0x02ca
            r12 = r10
            goto L_0x02cc
        L_0x02ca:
            r12 = r74
        L_0x02cc:
            if (r27 == 0) goto L_0x02d1
            r17 = r10
            goto L_0x02d3
        L_0x02d1:
            r17 = r75
        L_0x02d3:
            if (r31 == 0) goto L_0x02d8
            r22 = r10
            goto L_0x02da
        L_0x02d8:
            r22 = r76
        L_0x02da:
            if (r0 == 0) goto L_0x02e3
            androidx.compose.ui.unit.t$a r0 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r26 = r0.mo47903b()
            goto L_0x02e5
        L_0x02e3:
            r26 = r77
        L_0x02e5:
            if (r1 == 0) goto L_0x02e9
            r0 = r10
            goto L_0x02eb
        L_0x02e9:
            r0 = r79
        L_0x02eb:
            if (r5 == 0) goto L_0x02ee
            goto L_0x02f0
        L_0x02ee:
            r10 = r80
        L_0x02f0:
            if (r4 == 0) goto L_0x02f9
            androidx.compose.ui.unit.t$a r1 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r4 = r1.mo47903b()
            goto L_0x02fb
        L_0x02f9:
            r4 = r81
        L_0x02fb:
            if (r7 == 0) goto L_0x0304
            androidx.compose.ui.text.style.r$a r1 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r1 = r1.mo47726a()
            goto L_0x0306
        L_0x0304:
            r1 = r83
        L_0x0306:
            if (r9 == 0) goto L_0x030a
            r7 = 1
            goto L_0x030c
        L_0x030a:
            r7 = r84
        L_0x030c:
            if (r19 == 0) goto L_0x0312
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0314
        L_0x0312:
            r9 = r85
        L_0x0314:
            if (r16 == 0) goto L_0x0319
            r16 = 1
            goto L_0x031b
        L_0x0319:
            r16 = r86
        L_0x031b:
            if (r11 == 0) goto L_0x0322
            java.util.Map r11 = kotlin.collections.C10977s0.m41492z()
            goto L_0x0324
        L_0x0322:
            r11 = r87
        L_0x0324:
            if (r18 == 0) goto L_0x0329
            androidx.compose.material3.TextKt$Text$5 r18 = androidx.compose.material3.TextKt$Text$5.f19889f
            goto L_0x032b
        L_0x0329:
            r18 = r88
        L_0x032b:
            r19 = r13 & r29
            if (r19 == 0) goto L_0x02a4
            androidx.compose.runtime.i1<androidx.compose.ui.text.p0> r15 = f19885a
            java.lang.Object r15 = r2.mo15032w(r15)
            androidx.compose.ui.text.p0 r15 = (androidx.compose.p004ui.text.C16361p0) r15
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = r8 & r19
        L_0x033c:
            r2.mo14899E()
            boolean r19 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r19 == 0) goto L_0x034d
            java.lang.String r13 = "androidx.compose.material3.Text (Text.kt:240)"
            r14 = 2027001676(0x78d1974c, float:3.4008085E34)
            androidx.compose.runtime.ComposerKt.m29845w0(r14, r3, r8, r13)
        L_0x034d:
            r13 = 79588971(0x4be6e6b, float:4.477019E-36)
            r2.mo14918M(r13)
            androidx.compose.ui.graphics.j2$a r13 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r28 = r13.mo42851u()
            int r14 = (r20 > r28 ? 1 : (r20 == r28 ? 0 : -1))
            if (r14 == 0) goto L_0x035f
            r14 = 1
            goto L_0x0360
        L_0x035f:
            r14 = 0
        L_0x0360:
            if (r14 == 0) goto L_0x0365
            r36 = r20
            goto L_0x0387
        L_0x0365:
            long r28 = r15.mo47510r()
            long r13 = r13.mo42851u()
            int r13 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x0373
            r13 = 1
            goto L_0x0374
        L_0x0373:
            r13 = 0
        L_0x0374:
            if (r13 == 0) goto L_0x0377
            goto L_0x0385
        L_0x0377:
            androidx.compose.runtime.i1 r13 = androidx.compose.material3.ContentColorKt.m25558a()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.graphics.j2 r13 = (androidx.compose.p004ui.graphics.C15240j2) r13
            long r28 = r13.mo42833M()
        L_0x0385:
            r36 = r28
        L_0x0387:
            r2.mo15002m0()
            androidx.compose.ui.text.p0 r13 = new androidx.compose.ui.text.p0
            r35 = r13
            r42 = 0
            r44 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r53 = 0
            r55 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 4108112(0x3eaf50, float:5.756691E-39)
            r64 = 0
            r38 = r23
            r40 = r17
            r41 = r12
            r43 = r22
            r45 = r26
            r52 = r0
            r54 = r10
            r56 = r4
            r35.<init>((long) r36, (long) r38, (androidx.compose.p004ui.text.font.C16209i0) r40, (androidx.compose.p004ui.text.font.C16190e0) r41, (androidx.compose.p004ui.text.font.C16194f0) r42, (androidx.compose.p004ui.text.font.C16242u) r43, (java.lang.String) r44, (long) r45, (androidx.compose.p004ui.text.style.C16410a) r47, (androidx.compose.p004ui.text.style.C16439m) r48, (androidx.compose.p004ui.text.intl.C16342f) r49, (long) r50, (androidx.compose.p004ui.text.style.C16434j) r52, (androidx.compose.p004ui.graphics.C15205e4) r53, (androidx.compose.p004ui.text.style.C16432i) r54, (androidx.compose.p004ui.text.style.C16436k) r55, (long) r56, (androidx.compose.p004ui.text.style.C16442o) r58, (androidx.compose.p004ui.text.C16051a0) r59, (androidx.compose.p004ui.text.style.C16426h) r60, (androidx.compose.p004ui.text.style.C16417f) r61, (androidx.compose.p004ui.text.style.C16415e) r62, (int) r63, (kotlin.jvm.internal.DefaultConstructorMarker) r64)
            androidx.compose.ui.text.p0 r13 = r15.mo47493V(r13)
            r14 = 134217728(0x8000000, float:3.85186E-34)
            r19 = r3 & 14
            r14 = r19 | r14
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r14
            int r14 = r8 >> 9
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r14
            int r8 = r8 << 9
            r14 = r8 & r25
            r3 = r3 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r8
            r3 = r3 | r14
            r14 = r8 & r32
            r3 = r3 | r14
            r8 = r8 & r34
            r3 = r3 | r8
            r8 = 0
            r69 = r68
            r70 = r6
            r71 = r13
            r72 = r18
            r73 = r1
            r74 = r7
            r75 = r9
            r76 = r16
            r77 = r11
            r78 = r2
            r79 = r3
            r80 = r8
            androidx.compose.foundation.text.BasicTextKt.m12209d(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0406
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0406:
            r13 = r10
            r19 = r16
            r8 = r17
            r16 = r1
            r17 = r7
            r7 = r12
            r12 = r0
            r67 = r18
            r18 = r9
            r9 = r22
            r22 = r15
            r14 = r4
            r3 = r20
            r20 = r11
            r21 = r67
            r10 = r26
        L_0x0422:
            androidx.compose.runtime.t1 r5 = r2.mo15020s()
            if (r5 != 0) goto L_0x0429
            goto L_0x0445
        L_0x0429:
            androidx.compose.material3.TextKt$Text$6 r2 = new androidx.compose.material3.TextKt$Text$6
            r0 = r2
            r1 = r68
            r65 = r2
            r2 = r6
            r66 = r5
            r5 = r23
            r23 = r91
            r24 = r92
            r25 = r93
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r65
            r0 = r66
            r0.mo15202a(r1)
        L_0x0445:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m26701d(androidx.compose.ui.text.d, androidx.compose.ui.m, long, long, androidx.compose.ui.text.font.e0, androidx.compose.ui.text.font.i0, androidx.compose.ui.text.font.u, long, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.i, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.l, androidx.compose.ui.text.p0, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0132  */
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m26702e(java.lang.String r49, androidx.compose.p004ui.C8767m r50, long r51, long r53, androidx.compose.p004ui.text.font.C16190e0 r55, androidx.compose.p004ui.text.font.C16209i0 r56, androidx.compose.p004ui.text.font.C16242u r57, long r58, androidx.compose.p004ui.text.style.C16434j r60, androidx.compose.p004ui.text.style.C16432i r61, long r62, int r64, boolean r65, int r66, kotlin.jvm.functions.C11300l r67, androidx.compose.p004ui.text.C16361p0 r68, androidx.compose.runtime.C8592o r69, int r70, int r71, int r72) {
        /*
            r15 = r49
            r13 = r70
            r14 = r71
            r12 = r72
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 1968784669(0x7559451d, float:2.7542241E32)
            r1 = r69
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r13 | 6
            goto L_0x002d
        L_0x001d:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002c
            boolean r1 = r11.mo15006n0(r15)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r13
            goto L_0x002d
        L_0x002c:
            r1 = r13
        L_0x002d:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0034
            r1 = r1 | 48
            goto L_0x0047
        L_0x0034:
            r7 = r13 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r50
            boolean r8 = r11.mo15006n0(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r1 = r1 | r8
            goto L_0x0049
        L_0x0047:
            r7 = r50
        L_0x0049:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            r5 = r51
            goto L_0x0065
        L_0x0052:
            r2 = r13 & 896(0x380, float:1.256E-42)
            r5 = r51
            if (r2 != 0) goto L_0x0065
            boolean r17 = r11.mo14980g(r5)
            if (r17 == 0) goto L_0x0061
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r17
        L_0x0065:
            r17 = r12 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r9 = r53
            goto L_0x0085
        L_0x0072:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            r9 = r53
            if (r2 != 0) goto L_0x0085
            boolean r22 = r11.mo14980g(r9)
            if (r22 == 0) goto L_0x0081
            r22 = r18
            goto L_0x0083
        L_0x0081:
            r22 = r19
        L_0x0083:
            r1 = r1 | r22
        L_0x0085:
            r22 = r12 & 16
            r23 = 16384(0x4000, float:2.2959E-41)
            r24 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r22 == 0) goto L_0x0095
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r2 = r55
            goto L_0x00a8
        L_0x0095:
            r26 = r13 & r25
            r2 = r55
            if (r26 != 0) goto L_0x00a8
            boolean r27 = r11.mo15006n0(r2)
            if (r27 == 0) goto L_0x00a4
            r27 = r23
            goto L_0x00a6
        L_0x00a4:
            r27 = r24
        L_0x00a6:
            r1 = r1 | r27
        L_0x00a8:
            r27 = r12 & 32
            r28 = 458752(0x70000, float:6.42848E-40)
            if (r27 == 0) goto L_0x00b5
            r29 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r29
            r3 = r56
            goto L_0x00c8
        L_0x00b5:
            r29 = r13 & r28
            r3 = r56
            if (r29 != 0) goto L_0x00c8
            boolean r30 = r11.mo15006n0(r3)
            if (r30 == 0) goto L_0x00c4
            r30 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r30 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r1 = r1 | r30
        L_0x00c8:
            r30 = r12 & 64
            r31 = 3670016(0x380000, float:5.142788E-39)
            if (r30 == 0) goto L_0x00d5
            r32 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r32
            r0 = r57
            goto L_0x00e8
        L_0x00d5:
            r32 = r13 & r31
            r0 = r57
            if (r32 != 0) goto L_0x00e8
            boolean r33 = r11.mo15006n0(r0)
            if (r33 == 0) goto L_0x00e4
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r1 = r1 | r33
        L_0x00e8:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r33
            r2 = r58
            goto L_0x0108
        L_0x00f3:
            r33 = 29360128(0x1c00000, float:7.052966E-38)
            r33 = r13 & r33
            r2 = r58
            if (r33 != 0) goto L_0x0108
            boolean r33 = r11.mo14980g(r2)
            if (r33 == 0) goto L_0x0104
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r33
        L_0x0108:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0110
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r3
            goto L_0x0125
        L_0x0110:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x0125
            r3 = r60
            boolean r33 = r11.mo15006n0(r3)
            if (r33 == 0) goto L_0x0120
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0122
        L_0x0120:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0122:
            r1 = r1 | r33
            goto L_0x0127
        L_0x0125:
            r3 = r60
        L_0x0127:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0132
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r33
            r5 = r61
            goto L_0x0146
        L_0x0132:
            r33 = 1879048192(0x70000000, float:1.58456325E29)
            r33 = r13 & r33
            r5 = r61
            if (r33 != 0) goto L_0x0146
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x0143
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r1 = r1 | r6
        L_0x0146:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x014f
            r29 = r14 | 6
            r9 = r62
            goto L_0x0165
        L_0x014f:
            r33 = r14 & 14
            r9 = r62
            if (r33 != 0) goto L_0x0163
            boolean r33 = r11.mo14980g(r9)
            if (r33 == 0) goto L_0x015e
            r29 = 4
            goto L_0x0160
        L_0x015e:
            r29 = 2
        L_0x0160:
            r29 = r14 | r29
            goto L_0x0165
        L_0x0163:
            r29 = r14
        L_0x0165:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016c
            r29 = r29 | 48
            goto L_0x017f
        L_0x016c:
            r33 = r14 & 112(0x70, float:1.57E-43)
            r7 = r64
            if (r33 != 0) goto L_0x017f
            boolean r33 = r11.mo14976f(r7)
            if (r33 == 0) goto L_0x017b
            r16 = 32
            goto L_0x017d
        L_0x017b:
            r16 = 16
        L_0x017d:
            r29 = r29 | r16
        L_0x017f:
            r7 = r29
            r9 = r12 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0188
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x019c
        L_0x0188:
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x019c
            r10 = r65
            boolean r16 = r11.mo14961b(r10)
            if (r16 == 0) goto L_0x0197
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x0199
        L_0x0197:
            r26 = 128(0x80, float:1.794E-43)
        L_0x0199:
            r7 = r7 | r26
            goto L_0x019e
        L_0x019c:
            r10 = r65
        L_0x019e:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a5
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b7
        L_0x01a5:
            r15 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01b7
            r15 = r66
            boolean r16 = r11.mo14976f(r15)
            if (r16 == 0) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r18 = r19
        L_0x01b4:
            r7 = r7 | r18
            goto L_0x01b9
        L_0x01b7:
            r15 = r66
        L_0x01b9:
            r15 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01c0
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01d4
        L_0x01c0:
            r16 = r14 & r25
            if (r16 != 0) goto L_0x01d4
            r16 = r15
            r15 = r67
            boolean r18 = r11.mo14927P(r15)
            if (r18 == 0) goto L_0x01cf
            goto L_0x01d1
        L_0x01cf:
            r23 = r24
        L_0x01d1:
            r7 = r7 | r23
            goto L_0x01d8
        L_0x01d4:
            r16 = r15
            r15 = r67
        L_0x01d8:
            r18 = r14 & r28
            r19 = 32768(0x8000, float:4.5918E-41)
            if (r18 != 0) goto L_0x01f3
            r18 = r12 & r19
            r14 = r68
            if (r18 != 0) goto L_0x01ee
            boolean r18 = r11.mo15006n0(r14)
            if (r18 == 0) goto L_0x01ee
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f0
        L_0x01ee:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01f0:
            r7 = r7 | r18
            goto L_0x01f5
        L_0x01f3:
            r14 = r68
        L_0x01f5:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r1 & r18
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r15) goto L_0x0234
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r7
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x0234
            boolean r14 = r11.mo15011p()
            if (r14 != 0) goto L_0x020f
            goto L_0x0234
        L_0x020f:
            r11.mo14958a0()
            r2 = r50
            r3 = r51
            r5 = r53
            r7 = r55
            r8 = r56
            r9 = r57
            r12 = r60
            r13 = r61
            r14 = r62
            r16 = r64
            r17 = r65
            r18 = r66
            r19 = r67
            r20 = r68
            r25 = r11
            r10 = r58
            goto L_0x03b1
        L_0x0234:
            r11.mo14930Q()
            r14 = r13 & 1
            if (r14 == 0) goto L_0x026d
            boolean r14 = r11.mo14977f0()
            if (r14 == 0) goto L_0x0242
            goto L_0x026d
        L_0x0242:
            r11.mo14958a0()
            r0 = r12 & r19
            if (r0 == 0) goto L_0x024d
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r0
        L_0x024d:
            r26 = r50
            r29 = r51
            r33 = r53
            r27 = r55
            r35 = r56
            r36 = r57
            r37 = r58
            r39 = r60
            r40 = r61
            r41 = r62
            r43 = r64
            r44 = r65
            r45 = r66
            r46 = r67
            r47 = r68
            goto L_0x0317
        L_0x026d:
            if (r4 == 0) goto L_0x0272
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0274
        L_0x0272:
            r4 = r50
        L_0x0274:
            if (r8 == 0) goto L_0x027d
            androidx.compose.ui.graphics.j2$a r8 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r14 = r8.mo42851u()
            goto L_0x027f
        L_0x027d:
            r14 = r51
        L_0x027f:
            if (r17 == 0) goto L_0x0288
            androidx.compose.ui.unit.t$a r8 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r17 = r8.mo47903b()
            goto L_0x028a
        L_0x0288:
            r17 = r53
        L_0x028a:
            r8 = 0
            if (r22 == 0) goto L_0x0290
            r20 = r8
            goto L_0x0292
        L_0x0290:
            r20 = r55
        L_0x0292:
            if (r27 == 0) goto L_0x0297
            r21 = r8
            goto L_0x0299
        L_0x0297:
            r21 = r56
        L_0x0299:
            if (r30 == 0) goto L_0x029e
            r22 = r8
            goto L_0x02a0
        L_0x029e:
            r22 = r57
        L_0x02a0:
            if (r0 == 0) goto L_0x02a9
            androidx.compose.ui.unit.t$a r0 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r23 = r0.mo47903b()
            goto L_0x02ab
        L_0x02a9:
            r23 = r58
        L_0x02ab:
            if (r2 == 0) goto L_0x02af
            r0 = r8
            goto L_0x02b1
        L_0x02af:
            r0 = r60
        L_0x02b1:
            if (r3 == 0) goto L_0x02b4
            goto L_0x02b6
        L_0x02b4:
            r8 = r61
        L_0x02b6:
            if (r6 == 0) goto L_0x02bf
            androidx.compose.ui.unit.t$a r2 = androidx.compose.p004ui.unit.C16504t.f40903b
            long r2 = r2.mo47903b()
            goto L_0x02c1
        L_0x02bf:
            r2 = r62
        L_0x02c1:
            if (r5 == 0) goto L_0x02ca
            androidx.compose.ui.text.style.r$a r5 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r5 = r5.mo47726a()
            goto L_0x02cc
        L_0x02ca:
            r5 = r64
        L_0x02cc:
            if (r9 == 0) goto L_0x02d0
            r6 = 1
            goto L_0x02d2
        L_0x02d0:
            r6 = r65
        L_0x02d2:
            if (r10 == 0) goto L_0x02d8
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02da
        L_0x02d8:
            r9 = r66
        L_0x02da:
            if (r16 == 0) goto L_0x02df
            androidx.compose.material3.TextKt$Text$3 r10 = androidx.compose.material3.TextKt$Text$3.f19888f
            goto L_0x02e1
        L_0x02df:
            r10 = r67
        L_0x02e1:
            r16 = r12 & r19
            r50 = r0
            if (r16 == 0) goto L_0x02f9
            androidx.compose.runtime.i1<androidx.compose.ui.text.p0> r0 = f19885a
            java.lang.Object r0 = r11.mo15032w(r0)
            androidx.compose.ui.text.p0 r0 = (androidx.compose.p004ui.text.C16361p0) r0
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r16
            r39 = r50
            r47 = r0
            goto L_0x02fd
        L_0x02f9:
            r39 = r50
            r47 = r68
        L_0x02fd:
            r41 = r2
            r26 = r4
            r43 = r5
            r44 = r6
            r40 = r8
            r45 = r9
            r46 = r10
            r29 = r14
            r33 = r17
            r27 = r20
            r35 = r21
            r36 = r22
            r37 = r23
        L_0x0317:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0328
            java.lang.String r0 = "androidx.compose.material3.Text (Text.kt:148)"
            r2 = 1968784669(0x7559451d, float:2.7542241E32)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r7, r0)
        L_0x0328:
            r18 = 1
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r1 & r25
            r0 = r0 | r2
            r2 = r1 & r28
            r0 = r0 | r2
            r2 = r1 & r31
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r22 = r0 | r1
            r0 = r7 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r7 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r7 << 3
            r2 = r1 & r28
            r0 = r0 | r2
            r1 = r1 & r31
            r23 = r0 | r1
            r24 = 0
            r0 = r49
            r1 = r26
            r2 = r29
            r4 = r33
            r6 = r27
            r7 = r35
            r8 = r36
            r9 = r37
            r25 = r11
            r11 = r39
            r12 = r40
            r13 = r41
            r15 = r43
            r16 = r44
            r17 = r45
            r19 = r46
            r20 = r47
            r21 = r25
            m26700c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0393
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0393:
            r2 = r26
            r7 = r27
            r3 = r29
            r5 = r33
            r8 = r35
            r9 = r36
            r10 = r37
            r12 = r39
            r13 = r40
            r14 = r41
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
        L_0x03b1:
            androidx.compose.runtime.t1 r1 = r25.mo15020s()
            if (r1 != 0) goto L_0x03b8
            goto L_0x03d0
        L_0x03b8:
            androidx.compose.material3.TextKt$Text$4 r0 = new androidx.compose.material3.TextKt$Text$4
            r50 = r0
            r48 = r1
            r1 = r49
            r21 = r70
            r22 = r71
            r23 = r72
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r50
            r0 = r48
            r0.mo15202a(r1)
        L_0x03d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m26702e(java.lang.String, androidx.compose.ui.m, long, long, androidx.compose.ui.text.font.e0, androidx.compose.ui.text.font.i0, androidx.compose.ui.text.font.u, long, androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.i, long, int, boolean, int, kotlin.jvm.functions.l, androidx.compose.ui.text.p0, androidx.compose.runtime.o, int, int, int):void");
    }

    @C12579k
    /* renamed from: f */
    public static final C8550i1<C16361p0> m26703f() {
        return f19885a;
    }
}
