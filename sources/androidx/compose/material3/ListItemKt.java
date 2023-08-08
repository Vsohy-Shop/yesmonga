package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.C8299e0;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,447:1\n154#2:448\n154#2:487\n154#2:488\n154#2:489\n154#2:490\n154#2:491\n154#2:492\n67#3,6:449\n73#3:481\n77#3:486\n75#4:455\n76#4,11:457\n89#4:485\n76#5:456\n460#6,13:468\n473#6,3:482\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n*L\n147#1:448\n432#1:487\n433#1:488\n434#1:489\n438#1:490\n442#1:491\n446#1:492\n250#1:449,6\n250#1:481\n250#1:486\n250#1:455\n250#1:457,11\n250#1:485\n250#1:456\n250#1:468,13\n250#1:482,3\n*E\n"})
public final class ListItemKt {

    /* renamed from: a */
    public static final float f19459a;

    /* renamed from: b */
    public static final float f19460b;

    /* renamed from: c */
    public static final float f19461c;

    /* renamed from: d */
    public static final float f19462d;

    /* renamed from: e */
    public static final float f19463e;

    /* renamed from: f */
    public static final float f19464f;

    static {
        float f = (float) 8;
        f19459a = C16483g.m74435M(f);
        float f2 = (float) 16;
        f19460b = C16483g.m74435M(f2);
        f19461c = C16483g.m74435M(f2);
        f19462d = C16483g.m74435M(f2);
        f19463e = C16483g.m74435M(f);
        f19464f = C16483g.m74435M(f);
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m25851a(C2411u0 u0Var, long j, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(1383930970);
        if ((i & 14) == 0) {
            if (o.mo15006n0(u0Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14980g(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (o.mo14961b(z)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1383930970, i2, -1, "androidx.compose.material3.LeadingContent (ListItem.kt:232)");
            }
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j))}, C8553b.m31048b(o, 315166618, true, new ListItemKt$LeadingContent$1(z, u0Var, pVar, i2)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ListItemKt$LeadingContent$2(u0Var, j, z, pVar, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25852b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r40, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r41, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r42, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r43, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8187d1 r46, float r47, float r48, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r49, int r50, int r51) {
        /*
            r1 = r40
            r10 = r50
            r11 = r51
            java.lang.String r0 = "headlineContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -1647707763(0xffffffff9dc9f98d, float:-5.3462286E-21)
            r2 = r49
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.mo14927P(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r41
            boolean r6 = r2.mo15006n0(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r41
        L_0x0047:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r42
            boolean r8 = r2.mo14927P(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r42
        L_0x0063:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007d
            r9 = r43
            boolean r12 = r2.mo14927P(r9)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
            goto L_0x007f
        L_0x007d:
            r9 = r43
        L_0x007f:
            r12 = r11 & 16
            r34 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0089:
            r13 = r10 & r34
            if (r13 != 0) goto L_0x009c
            r13 = r44
            boolean r14 = r2.mo14927P(r13)
            if (r14 == 0) goto L_0x0098
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r3 = r3 | r14
            goto L_0x009e
        L_0x009c:
            r13 = r44
        L_0x009e:
            r14 = r11 & 32
            r35 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a8
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00bc
        L_0x00a8:
            r15 = r10 & r35
            if (r15 != 0) goto L_0x00bc
            r15 = r45
            boolean r16 = r2.mo14927P(r15)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r16
            goto L_0x00be
        L_0x00bc:
            r15 = r45
        L_0x00be:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00d8
            r16 = r11 & 64
            r0 = r46
            if (r16 != 0) goto L_0x00d3
            boolean r16 = r2.mo15006n0(r0)
            if (r16 == 0) goto L_0x00d3
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r3 = r3 | r16
            goto L_0x00da
        L_0x00d8:
            r0 = r46
        L_0x00da:
            r15 = r11 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x00e3
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r16
            goto L_0x00fb
        L_0x00e3:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00fb
            r16 = r15
            r15 = r47
            boolean r17 = r2.mo14968d(r15)
            if (r17 == 0) goto L_0x00f6
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r3 = r3 | r17
            goto L_0x00ff
        L_0x00fb:
            r16 = r15
            r15 = r47
        L_0x00ff:
            r15 = r11 & 256(0x100, float:3.59E-43)
            r36 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x0108
            r3 = r3 | r36
            goto L_0x0120
        L_0x0108:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r10 & r17
            if (r17 != 0) goto L_0x0120
            r17 = r15
            r15 = r48
            boolean r18 = r2.mo14968d(r15)
            if (r18 == 0) goto L_0x011b
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r3 = r3 | r18
            goto L_0x0124
        L_0x0120:
            r17 = r15
            r15 = r48
        L_0x0124:
            r18 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r3 & r18
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r5) goto L_0x0144
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x0135
            goto L_0x0144
        L_0x0135:
            r2.mo14958a0()
            r3 = r41
            r6 = r45
            r8 = r46
            r4 = r9
            r5 = r13
            r9 = r47
            goto L_0x036b
        L_0x0144:
            r2.mo14930Q()
            r0 = r10 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r37 = 0
            if (r0 == 0) goto L_0x016c
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x0157
            goto L_0x016c
        L_0x0157:
            r2.mo14958a0()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x015f
            r3 = r3 & r5
        L_0x015f:
            r0 = r41
            r6 = r45
            r5 = r47
            r12 = r3
            r4 = r13
            r8 = r15
            r3 = r46
            goto L_0x01d3
        L_0x016c:
            if (r4 == 0) goto L_0x0171
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0173
        L_0x0171:
            r0 = r41
        L_0x0173:
            if (r6 == 0) goto L_0x0177
            r7 = r37
        L_0x0177:
            if (r8 == 0) goto L_0x017b
            r9 = r37
        L_0x017b:
            if (r12 == 0) goto L_0x0180
            r4 = r37
            goto L_0x0181
        L_0x0180:
            r4 = r13
        L_0x0181:
            if (r14 == 0) goto L_0x0186
            r6 = r37
            goto L_0x0188
        L_0x0186:
            r6 = r45
        L_0x0188:
            r8 = r11 & 64
            if (r8 == 0) goto L_0x01b2
            androidx.compose.material3.e1 r12 = androidx.compose.material3.C8193e1.f20111a
            r13 = 0
            r18 = 0
            r8 = r16
            r38 = r17
            r15 = r18
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r33 = 511(0x1ff, float:7.16E-43)
            r31 = r2
            androidx.compose.material3.d1 r12 = r12.mo12557a(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r32, r33)
            r3 = r3 & r5
            goto L_0x01b8
        L_0x01b2:
            r8 = r16
            r38 = r17
            r12 = r46
        L_0x01b8:
            if (r8 == 0) goto L_0x01c1
            androidx.compose.material3.e1 r5 = androidx.compose.material3.C8193e1.f20111a
            float r5 = r5.mo12560d()
            goto L_0x01c3
        L_0x01c1:
            r5 = r47
        L_0x01c3:
            if (r38 == 0) goto L_0x01cc
            androidx.compose.material3.e1 r8 = androidx.compose.material3.C8193e1.f20111a
            float r8 = r8.mo12560d()
            goto L_0x01ce
        L_0x01cc:
            r8 = r48
        L_0x01ce:
            r39 = r12
            r12 = r3
            r3 = r39
        L_0x01d3:
            r2.mo14899E()
            boolean r13 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r13 == 0) goto L_0x01e5
            r13 = -1
            java.lang.String r14 = "androidx.compose.material3.ListItem (ListItem.kt:73)"
            r15 = -1647707763(0xffffffff9dc9f98d, float:-5.3462286E-21)
            androidx.compose.runtime.ComposerKt.m29845w0(r15, r12, r13, r14)
        L_0x01e5:
            androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1 r13 = new androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
            r13.<init>(r3, r12, r1)
            r14 = -403249643(0xffffffffe7f6e615, float:-2.3318928E24)
            r15 = 1
            androidx.compose.runtime.internal.a r13 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r14, r15, r13)
            if (r9 == 0) goto L_0x0201
            androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1 r14 = new androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1
            r14.<init>(r3, r12, r9)
            r1 = -1020860251(0xffffffffc326e8a5, float:-166.90877)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r1, r15, r14)
            goto L_0x0203
        L_0x0201:
            r1 = r37
        L_0x0203:
            if (r7 == 0) goto L_0x0214
            androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1 r14 = new androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1
            r14.<init>(r3, r12, r7)
            r26 = r7
            r7 = -764441232(0xffffffffd26f8d70, float:-2.57217528E11)
            androidx.compose.runtime.internal.a r7 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r7, r15, r14)
            goto L_0x0218
        L_0x0214:
            r26 = r7
            r7 = r37
        L_0x0218:
            androidx.compose.material3.f1$a r14 = androidx.compose.material3.C8198f1.f20129b
            if (r7 == 0) goto L_0x021e
            r15 = 1
            goto L_0x021f
        L_0x021e:
            r15 = 0
        L_0x021f:
            r27 = r9
            if (r1 == 0) goto L_0x0225
            r9 = 1
            goto L_0x0226
        L_0x0225:
            r9 = 0
        L_0x0226:
            int r9 = r14.mo12596a(r15, r9)
            if (r4 == 0) goto L_0x023c
            androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1 r15 = new androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1
            r15.<init>(r3, r12, r9, r4)
            r28 = r4
            r4 = 1673725255(0x63c30547, float:7.194991E21)
            r10 = 1
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r4, r10, r15)
            goto L_0x0241
        L_0x023c:
            r28 = r4
            r10 = 1
            r4 = r37
        L_0x0241:
            if (r6 == 0) goto L_0x0252
            androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1 r15 = new androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1
            r15.<init>(r3, r12, r9, r6)
            r29 = r6
            r6 = 1392069445(0x52f94b45, float:5.35354835E11)
            androidx.compose.runtime.internal.a r37 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r6, r10, r15)
            goto L_0x0254
        L_0x0252:
            r29 = r6
        L_0x0254:
            int r6 = r14.mo12597b()
            boolean r6 = androidx.compose.material3.C8198f1.m27092W(r9, r6)
            if (r6 == 0) goto L_0x0267
            androidx.compose.material3.tokens.e0 r6 = androidx.compose.material3.tokens.C8299e0.f21005a
            float r6 = r6.mo13417I()
        L_0x0264:
            r20 = r6
            goto L_0x027f
        L_0x0267:
            int r6 = r14.mo12599d()
            boolean r6 = androidx.compose.material3.C8198f1.m27092W(r9, r6)
            if (r6 == 0) goto L_0x0278
            androidx.compose.material3.tokens.e0 r6 = androidx.compose.material3.tokens.C8299e0.f21005a
            float r6 = r6.mo13432X()
            goto L_0x0264
        L_0x0278:
            androidx.compose.material3.tokens.e0 r6 = androidx.compose.material3.tokens.C8299e0.f21005a
            float r6 = r6.mo13427S()
            goto L_0x0264
        L_0x027f:
            float r6 = f19461c
            int r10 = r14.mo12598c()
            boolean r10 = androidx.compose.material3.C8198f1.m27092W(r9, r10)
            if (r10 == 0) goto L_0x028e
            float r10 = f19460b
            goto L_0x0290
        L_0x028e:
            float r10 = f19459a
        L_0x0290:
            androidx.compose.foundation.layout.i0 r21 = androidx.compose.foundation.layout.PaddingKt.m10015b(r6, r10)
            r6 = 0
            r10 = 0
            int r15 = r14.mo12598c()
            boolean r15 = androidx.compose.material3.C8198f1.m27092W(r9, r15)
            if (r15 == 0) goto L_0x02a3
            float r15 = f19463e
            goto L_0x02a9
        L_0x02a3:
            r15 = 0
            float r15 = (float) r15
            float r15 = androidx.compose.p004ui.unit.C16483g.m74435M(r15)
        L_0x02a9:
            r17 = 0
            r18 = 11
            r19 = 0
            r42 = r6
            r43 = r10
            r44 = r15
            r45 = r17
            r46 = r18
            r47 = r19
            androidx.compose.foundation.layout.i0 r6 = androidx.compose.foundation.layout.PaddingKt.m10018e(r42, r43, r44, r45, r46, r47)
            int r10 = r14.mo12598c()
            boolean r10 = androidx.compose.material3.C8198f1.m27092W(r9, r10)
            if (r10 == 0) goto L_0x02d0
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r10 = r10.mo7631r()
            goto L_0x02d6
        L_0x02d0:
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r10 = r10.mo7625f()
        L_0x02d6:
            int r14 = r14.mo12598c()
            boolean r9 = androidx.compose.material3.C8198f1.m27092W(r9, r14)
            if (r9 == 0) goto L_0x02e7
            androidx.compose.ui.c$a r9 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r9 = r9.mo17073w()
            goto L_0x02ed
        L_0x02e7:
            androidx.compose.ui.c$a r9 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r9 = r9.mo17070q()
        L_0x02ed:
            int r15 = r12 >> 18
            r15 = r15 & 14
            androidx.compose.runtime.k2 r15 = r3.mo12526a(r2, r15)
            java.lang.Object r15 = r15.getValue()
            androidx.compose.ui.graphics.j2 r15 = (androidx.compose.p004ui.graphics.C15240j2) r15
            long r17 = r15.mo42833M()
            int r15 = r12 >> 15
            r15 = r15 & 112(0x70, float:1.57E-43)
            r15 = r15 | 6
            r14 = 1
            androidx.compose.runtime.k2 r15 = r3.mo12527b(r14, r2, r15)
            java.lang.Object r14 = r15.getValue()
            androidx.compose.ui.graphics.j2 r14 = (androidx.compose.p004ui.graphics.C15240j2) r14
            long r22 = r14.mo42833M()
            androidx.compose.material3.ListItemKt$ListItem$1 r14 = new androidx.compose.material3.ListItemKt$ListItem$1
            r41 = r14
            r42 = r4
            r43 = r6
            r44 = r9
            r45 = r10
            r46 = r37
            r47 = r7
            r48 = r13
            r49 = r1
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49)
            r1 = -1813277157(0xffffffff93eb961b, float:-5.9470355E-27)
            r4 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r1, r4, r14)
            int r4 = r12 >> 3
            r4 = r4 & 14
            r4 = r4 | r36
            int r6 = r12 >> 9
            r7 = r6 & r34
            r4 = r4 | r7
            r6 = r6 & r35
            r24 = r4 | r6
            r25 = 2
            r12 = r0
            r4 = 0
            r13 = r4
            r14 = r17
            r16 = r22
            r18 = r5
            r19 = r8
            r22 = r1
            r23 = r2
            m25853c(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x035f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x035f:
            r9 = r5
            r15 = r8
            r7 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r8 = r3
            r3 = r0
        L_0x036b:
            androidx.compose.runtime.t1 r12 = r2.mo15020s()
            if (r12 != 0) goto L_0x0372
            goto L_0x0386
        L_0x0372:
            androidx.compose.material3.ListItemKt$ListItem$2 r13 = new androidx.compose.material3.ListItemKt$ListItem$2
            r0 = r13
            r1 = r40
            r2 = r3
            r3 = r7
            r7 = r8
            r8 = r9
            r9 = r15
            r10 = r50
            r11 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x0386:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m25852b(kotlin.jvm.functions.p, androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.material3.d1, float, float, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25853c(androidx.compose.p004ui.C8767m r29, androidx.compose.p004ui.graphics.C15218g4 r30, long r31, long r33, float r35, float r36, float r37, androidx.compose.foundation.layout.C2366i0 r38, kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r39, androidx.compose.runtime.C8592o r40, int r41, int r42) {
        /*
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r41
            r13 = r42
            r0 = 1069030861(0x3fb81dcd, float:1.4384094)
            r1 = r40
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001d
            r3 = r12 | 6
            r4 = r3
            r3 = r29
            goto L_0x0031
        L_0x001d:
            r3 = r12 & 14
            if (r3 != 0) goto L_0x002e
            r3 = r29
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r12
            goto L_0x0031
        L_0x002e:
            r3 = r29
            r4 = r12
        L_0x0031:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r13 & 2
            if (r5 != 0) goto L_0x0044
            r5 = r30
            boolean r6 = r1.mo15006n0(r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0044:
            r5 = r30
        L_0x0046:
            r6 = 16
        L_0x0048:
            r4 = r4 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r30
        L_0x004c:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r13 & 4
            if (r6 != 0) goto L_0x005f
            r6 = r31
            boolean r8 = r1.mo14980g(r6)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r6 = r31
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r4 = r4 | r8
            goto L_0x0067
        L_0x0065:
            r6 = r31
        L_0x0067:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007e
            r8 = r13 & 8
            r14 = r33
            if (r8 != 0) goto L_0x007a
            boolean r8 = r1.mo14980g(r14)
            if (r8 == 0) goto L_0x007a
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r8
            goto L_0x0080
        L_0x007e:
            r14 = r33
        L_0x0080:
            r8 = r13 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008c
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r0 = r35
            goto L_0x009f
        L_0x008c:
            r17 = r12 & r16
            r0 = r35
            if (r17 != 0) goto L_0x009f
            boolean r18 = r1.mo14968d(r0)
            if (r18 == 0) goto L_0x009b
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r4 = r4 | r18
        L_0x009f:
            r18 = r13 & 32
            r19 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x00ac
            r20 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r20
            r0 = r36
            goto L_0x00bf
        L_0x00ac:
            r20 = r12 & r19
            r0 = r36
            if (r20 != 0) goto L_0x00bf
            boolean r20 = r1.mo14968d(r0)
            if (r20 == 0) goto L_0x00bb
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r4 = r4 | r20
        L_0x00bf:
            r20 = r13 & 64
            if (r20 == 0) goto L_0x00c8
            r20 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c5:
            r4 = r4 | r20
            goto L_0x00da
        L_0x00c8:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x00da
            boolean r20 = r1.mo14968d(r9)
            if (r20 == 0) goto L_0x00d7
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c5
        L_0x00d7:
            r20 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c5
        L_0x00da:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e3
            r4 = r4 | r20
            goto L_0x00f4
        L_0x00e3:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x00f4
            boolean r0 = r1.mo15006n0(r10)
            if (r0 == 0) goto L_0x00f1
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r4 = r4 | r0
        L_0x00f4:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00fc
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00fa:
            r4 = r4 | r0
            goto L_0x010d
        L_0x00fc:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x010d
            boolean r0 = r1.mo14927P(r11)
            if (r0 == 0) goto L_0x010a
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fa
        L_0x010a:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00fa
        L_0x010d:
            r0 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r0 & r4
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r3) goto L_0x0129
            boolean r0 = r1.mo15011p()
            if (r0 != 0) goto L_0x011d
            goto L_0x0129
        L_0x011d:
            r1.mo14958a0()
            r2 = r29
            r8 = r36
            r3 = r6
            r7 = r35
            goto L_0x01f7
        L_0x0129:
            r1.mo14930Q()
            r0 = r12 & 1
            if (r0 == 0) goto L_0x015a
            boolean r0 = r1.mo14977f0()
            if (r0 == 0) goto L_0x0137
            goto L_0x015a
        L_0x0137:
            r1.mo14958a0()
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0140
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0140:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0146
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0146:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x014c
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x014c:
            r0 = r29
            r8 = r36
            r2 = r5
            r5 = r6
            r7 = r35
        L_0x0154:
            r27 = r14
            r14 = r4
            r3 = r27
            goto L_0x01a4
        L_0x015a:
            if (r2 == 0) goto L_0x015f
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0161
        L_0x015f:
            r0 = r29
        L_0x0161:
            r2 = r13 & 2
            r3 = 6
            if (r2 == 0) goto L_0x016f
            androidx.compose.material3.e1 r2 = androidx.compose.material3.C8193e1.f20111a
            androidx.compose.ui.graphics.g4 r2 = r2.mo12561e(r1, r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0170
        L_0x016f:
            r2 = r5
        L_0x0170:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x017d
            androidx.compose.material3.e1 r5 = androidx.compose.material3.C8193e1.f20111a
            long r5 = r5.mo12558b(r1, r3)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x017e
        L_0x017d:
            r5 = r6
        L_0x017e:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x018b
            androidx.compose.material3.e1 r7 = androidx.compose.material3.C8193e1.f20111a
            long r14 = r7.mo12559c(r1, r3)
            r3 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r4 = r3
        L_0x018b:
            if (r8 == 0) goto L_0x0194
            androidx.compose.material3.e1 r3 = androidx.compose.material3.C8193e1.f20111a
            float r3 = r3.mo12560d()
            goto L_0x0196
        L_0x0194:
            r3 = r35
        L_0x0196:
            if (r18 == 0) goto L_0x01a0
            androidx.compose.material3.e1 r7 = androidx.compose.material3.C8193e1.f20111a
            float r7 = r7.mo12560d()
            r8 = r7
            goto L_0x01a2
        L_0x01a0:
            r8 = r36
        L_0x01a2:
            r7 = r3
            goto L_0x0154
        L_0x01a4:
            r1.mo14899E()
            boolean r15 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r15 == 0) goto L_0x01b6
            r15 = -1
            java.lang.String r12 = "androidx.compose.material3.ListItem (ListItem.kt:202)"
            r13 = 1069030861(0x3fb81dcd, float:1.4384094)
            androidx.compose.runtime.ComposerKt.m29845w0(r13, r14, r15, r12)
        L_0x01b6:
            r22 = 0
            androidx.compose.material3.ListItemKt$ListItem$3 r12 = new androidx.compose.material3.ListItemKt$ListItem$3
            r12.<init>(r9, r10, r11, r14)
            r13 = 1393735016(0x5312b568, float:6.3010872E11)
            r15 = 1
            androidx.compose.runtime.internal.a r23 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r13, r15, r12)
            r12 = r14 & 14
            r12 = r12 | r20
            r13 = r14 & 112(0x70, float:1.57E-43)
            r12 = r12 | r13
            r13 = r14 & 896(0x380, float:1.256E-42)
            r12 = r12 | r13
            r13 = r14 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            r13 = r14 & r16
            r12 = r12 | r13
            r13 = r14 & r19
            r25 = r12 | r13
            r26 = 64
            r14 = r0
            r15 = r2
            r16 = r5
            r18 = r3
            r20 = r7
            r21 = r8
            r24 = r1
            androidx.compose.material3.SurfaceKt.m26352a(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26)
            boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r12 == 0) goto L_0x01f3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01f3:
            r14 = r3
            r3 = r5
            r5 = r2
            r2 = r0
        L_0x01f7:
            androidx.compose.runtime.t1 r13 = r1.mo15020s()
            if (r13 != 0) goto L_0x01fe
            goto L_0x0216
        L_0x01fe:
            androidx.compose.material3.ListItemKt$ListItem$4 r12 = new androidx.compose.material3.ListItemKt$ListItem$4
            r0 = r12
            r1 = r2
            r2 = r5
            r5 = r14
            r9 = r37
            r10 = r38
            r11 = r39
            r14 = r12
            r12 = r41
            r15 = r13
            r13 = r42
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            r15.mo15202a(r14)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m25853c(androidx.compose.ui.m, androidx.compose.ui.graphics.g4, long, long, float, float, float, androidx.compose.foundation.layout.i0, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: d */
    public static final void m25854d(long j, TypographyKeyTokens typographyKeyTokens, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C8592o o = oVar.mo15009o(1133967795);
        if ((i & 14) == 0) {
            if (o.mo14980g(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo15006n0(typographyKeyTokens)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1133967795, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:389)");
            }
            C16361p0 a = TypographyKt.m26914a(C8215i1.f20180a.mo12654c(o, 6), typographyKeyTokens);
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j))}, C8553b.m31048b(o, -514310925, true, new ListItemKt$ProvideTextStyleFromToken$1(a, pVar, i2)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ListItemKt$ProvideTextStyleFromToken$2(j, typographyKeyTokens, pVar, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: e */
    public static final void m25855e(C2411u0 u0Var, long j, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C2411u0 u0Var2 = u0Var;
        boolean z2 = z;
        int i7 = i;
        C8592o o = oVar.mo15009o(1404787004);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(u0Var2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        long j2 = j;
        if ((i7 & 112) == 0) {
            if (o.mo14980g(j2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 896) == 0) {
            if (o.mo14961b(z2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        if ((i7 & 7168) == 0) {
            if (o.mo14927P(pVar2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1404787004, i2, -1, "androidx.compose.material3.TrailingContent (ListItem.kt:245)");
            }
            C8767m mVar = C8767m.f23478j;
            C8767m m = PaddingKt.m10026m(mVar, f19464f, 0.0f, 2, (Object) null);
            if (!z2) {
                mVar = u0Var2.mo7845f(mVar, C8734c.f23406a.mo17070q());
            }
            C8767m k3 = m.mo17224k3(mVar);
            o.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k3);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            int i8 = i2 >> 3;
            m25854d(j, C8299e0.f21005a.mo13431W(), pVar, o, (i8 & 14) | 48 | (i8 & 896));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ListItemKt$TrailingContent$2(u0Var, j, z, pVar, i));
        }
    }
}
