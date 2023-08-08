package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.C8310i;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.semantics.C16026d;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,809:1\n25#2:810\n36#2:818\n460#2,13:844\n473#2,3:858\n36#2:863\n50#2:870\n49#2:871\n1114#3,6:811\n1114#3,6:819\n1114#3,6:864\n1114#3,6:872\n58#4:817\n74#5,6:825\n80#5:857\n84#5:862\n75#6:831\n76#6,11:833\n89#6:861\n76#7:832\n154#8:878\n154#8:879\n154#8:880\n154#8:881\n154#8:882\n154#8:883\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n88#1:810\n490#1:818\n493#1:844,13\n493#1:858,3\n521#1:863\n585#1:870\n585#1:871\n88#1:811,6\n490#1:819,6\n521#1:864,6\n585#1:872,6\n128#1:817\n493#1:825,6\n493#1:857\n493#1:862\n493#1:831\n493#1:833,11\n493#1:861\n493#1:832\n613#1:878\n614#1:879\n615#1:880\n801#1:881\n803#1:882\n808#1:883\n*E\n"})
public final class DateRangePickerKt {
    @C12579k

    /* renamed from: a */
    public static final C2366i0 f19348a = PaddingKt.m10018e(C16483g.m74435M((float) 24), C16483g.m74435M((float) 20), 0.0f, C16483g.m74435M((float) 8), 4, (Object) null);
    @C12579k

    /* renamed from: b */
    public static final C2366i0 f19349b;
    @C12579k

    /* renamed from: c */
    public static final C2366i0 f19350c;

    /* renamed from: d */
    public static final float f19351d = C16483g.m74435M((float) 60);

    static {
        float f = (float) 64;
        float f2 = (float) 12;
        f19349b = PaddingKt.m10018e(C16483g.m74435M(f), 0.0f, C16483g.m74435M(f2), 0.0f, 10, (Object) null);
        f19350c = PaddingKt.m10018e(C16483g.m74435M(f), 0.0f, C16483g.m74435M(f2), C16483g.m74435M(f2), 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011a  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25654a(@org.jetbrains.annotations.C12579k androidx.compose.material3.DateRangePickerState r56, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r57, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8186d0 r58, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Long, java.lang.Boolean> r59, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r60, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r61, boolean r62, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8180c0 r63, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r64, int r65, int r66) {
        /*
            r1 = r56
            r9 = r65
            r10 = r66
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = -1835392055(0xffffffff929a23c9, float:-9.727588E-28)
            r2 = r64
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r10 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r9 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.mo15006n0(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r9
            goto L_0x002b
        L_0x002a:
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r57
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
            r5 = r57
        L_0x0047:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r58
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r58
        L_0x0063:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007d
            r11 = r59
            boolean r12 = r2.mo14927P(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
            goto L_0x007f
        L_0x007d:
            r11 = r59
        L_0x007f:
            r12 = r10 & 16
            r54 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0089:
            r13 = r9 & r54
            if (r13 != 0) goto L_0x009c
            r13 = r60
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
            r13 = r60
        L_0x009e:
            r14 = r10 & 32
            if (r14 == 0) goto L_0x00a6
            r15 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r15
            goto L_0x00bb
        L_0x00a6:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00bb
            r15 = r61
            boolean r16 = r2.mo14927P(r15)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r3 = r3 | r16
            goto L_0x00bd
        L_0x00bb:
            r15 = r61
        L_0x00bd:
            r16 = r10 & 64
            if (r16 == 0) goto L_0x00c8
            r17 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r17
            r0 = r62
            goto L_0x00dd
        L_0x00c8:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r9 & r17
            r0 = r62
            if (r17 != 0) goto L_0x00dd
            boolean r17 = r2.mo14961b(r0)
            if (r17 == 0) goto L_0x00d9
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r3 = r3 | r17
        L_0x00dd:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r9 & r17
            if (r17 != 0) goto L_0x00f9
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f2
            r0 = r63
            boolean r17 = r2.mo15006n0(r0)
            if (r17 == 0) goto L_0x00f4
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r0 = r63
        L_0x00f4:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r3 = r3 | r17
            goto L_0x00fb
        L_0x00f9:
            r0 = r63
        L_0x00fb:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r3 & r17
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x011a
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x010c
            goto L_0x011a
        L_0x010c:
            r2.mo14958a0()
            r3 = r57
            r55 = r62
            r8 = r63
            r4 = r11
            r5 = r13
            r6 = r15
            goto L_0x0266
        L_0x011a:
            r2.mo14930Q()
            r0 = r9 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r15 = 1
            if (r0 == 0) goto L_0x0141
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x012c
            goto L_0x0141
        L_0x012c:
            r2.mo14958a0()
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0134
            r3 = r3 & r5
        L_0x0134:
            r0 = r57
            r8 = r61
            r55 = r62
            r5 = r3
            r4 = r11
            r6 = r13
        L_0x013d:
            r3 = r63
            goto L_0x01e4
        L_0x0141:
            if (r4 == 0) goto L_0x0146
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0148
        L_0x0146:
            r0 = r57
        L_0x0148:
            if (r6 == 0) goto L_0x0176
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r4)
            java.lang.Object r4 = r2.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r4 != r6) goto L_0x0170
            androidx.compose.material3.d0 r4 = new androidx.compose.material3.d0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 7
            r22 = 0
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r2.mo14893C(r4)
        L_0x0170:
            r2.mo15002m0()
            androidx.compose.material3.d0 r4 = (androidx.compose.material3.C8186d0) r4
            r7 = r4
        L_0x0176:
            if (r8 == 0) goto L_0x017b
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$2 r4 = androidx.compose.material3.DateRangePickerKt$DateRangePicker$2.f19352f
            goto L_0x017c
        L_0x017b:
            r4 = r11
        L_0x017c:
            if (r12 == 0) goto L_0x018b
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$3 r6 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$3
            r6.<init>(r1, r3)
            r8 = 492752701(0x1d5ecf3d, float:2.9488595E-21)
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r8, r15, r6)
            goto L_0x018c
        L_0x018b:
            r6 = r13
        L_0x018c:
            if (r14 == 0) goto L_0x019b
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$4 r8 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
            r8.<init>(r1, r7, r3)
            r11 = -204181785(0xfffffffff3d46ee7, float:-3.3661386E31)
            androidx.compose.runtime.internal.a r8 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r11, r15, r8)
            goto L_0x019d
        L_0x019b:
            r8 = r61
        L_0x019d:
            if (r16 == 0) goto L_0x01a2
            r55 = r15
            goto L_0x01a4
        L_0x01a2:
            r55 = r62
        L_0x01a4:
            r11 = r10 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x01e1
            androidx.compose.material3.DatePickerDefaults r11 = androidx.compose.material3.DatePickerDefaults.f19304a
            r12 = 0
            r16 = 0
            r14 = r16
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r51 = 0
            r52 = 805306368(0x30000000, float:4.656613E-10)
            r53 = 524287(0x7ffff, float:7.34683E-40)
            r50 = r2
            androidx.compose.material3.c0 r11 = r11.mo11347c(r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r51, r52, r53)
            r3 = r3 & r5
            r5 = r3
            r3 = r11
            goto L_0x01e4
        L_0x01e1:
            r5 = r3
            goto L_0x013d
        L_0x01e4:
            r2.mo14899E()
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x01f6
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)"
            r13 = -1835392055(0xffffffff929a23c9, float:-9.727588E-28)
            androidx.compose.runtime.ComposerKt.m29845w0(r13, r5, r11, r12)
        L_0x01f6:
            if (r55 == 0) goto L_0x0206
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$5 r11 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
            r11.<init>(r1, r5)
            r12 = -1062265737(0xffffffffc0af1c77, float:-5.4722247)
            r13 = 1
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r12, r13, r11)
            goto L_0x0208
        L_0x0206:
            r13 = 1
            r11 = 0
        L_0x0208:
            r14 = r11
            androidx.compose.material3.i1 r11 = androidx.compose.material3.C8215i1.f20180a
            r12 = 6
            androidx.compose.material3.s3 r11 = r11.mo12654c(r2, r12)
            androidx.compose.material3.tokens.i r12 = androidx.compose.material3.tokens.C8310i.f21329a
            androidx.compose.material3.tokens.TypographyKeyTokens r15 = r12.mo13711F()
            androidx.compose.ui.text.p0 r16 = androidx.compose.material3.TypographyKt.m26914a(r11, r15)
            float r11 = r12.mo13710E()
            float r12 = f19351d
            float r11 = r11 - r12
            float r17 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$6 r11 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$6
            r57 = r11
            r58 = r56
            r59 = r7
            r60 = r4
            r61 = r3
            r62 = r5
            r57.<init>(r58, r59, r60, r61, r62)
            r12 = -186850856(0xfffffffff4dce1d8, float:-1.4000073E32)
            androidx.compose.runtime.internal.a r18 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r12, r13, r11)
            int r11 = r5 >> 3
            r11 = r11 & 14
            r12 = 14155776(0xd80000, float:1.9836467E-38)
            r11 = r11 | r12
            int r5 = r5 >> 9
            r12 = r5 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = r5 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r5 = r5 & r54
            r20 = r11 | r5
            r11 = r0
            r12 = r6
            r13 = r8
            r15 = r3
            r19 = r2
            androidx.compose.material3.DatePickerKt.m25595a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x0262
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0262:
            r5 = r6
            r6 = r8
            r8 = r3
            r3 = r0
        L_0x0266:
            androidx.compose.runtime.t1 r11 = r2.mo15020s()
            if (r11 != 0) goto L_0x026d
            goto L_0x0280
        L_0x026d:
            androidx.compose.material3.DateRangePickerKt$DateRangePicker$7 r12 = new androidx.compose.material3.DateRangePickerKt$DateRangePicker$7
            r0 = r12
            r1 = r56
            r2 = r3
            r3 = r7
            r7 = r55
            r9 = r65
            r10 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.m25654a(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.m, androidx.compose.material3.d0, kotlin.jvm.functions.l, kotlin.jvm.functions.p, kotlin.jvm.functions.p, boolean, androidx.compose.material3.c0, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25655b(androidx.compose.material3.StateData r16, androidx.compose.material3.C8186d0 r17, kotlin.jvm.functions.C11300l<? super java.lang.Long, java.lang.Boolean> r18, androidx.compose.material3.C8180c0 r19, androidx.compose.runtime.C8592o r20, int r21) {
        /*
            r8 = r16
            r9 = r19
            r10 = r21
            r0 = -1003501610(0xffffffffc42fc7d6, float:-703.12244)
            r1 = r20
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r10 & 14
            r2 = 2
            if (r1 != 0) goto L_0x001f
            boolean r1 = r11.mo15006n0(r8)
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            r1 = r1 | r10
            goto L_0x0020
        L_0x001f:
            r1 = r10
        L_0x0020:
            r3 = r10 & 112(0x70, float:1.57E-43)
            r12 = r17
            if (r3 != 0) goto L_0x0032
            boolean r3 = r11.mo15006n0(r12)
            if (r3 == 0) goto L_0x002f
            r3 = 32
            goto L_0x0031
        L_0x002f:
            r3 = 16
        L_0x0031:
            r1 = r1 | r3
        L_0x0032:
            r3 = r10 & 896(0x380, float:1.256E-42)
            r13 = r18
            if (r3 != 0) goto L_0x0044
            boolean r3 = r11.mo14927P(r13)
            if (r3 == 0) goto L_0x0041
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r1 = r1 | r3
        L_0x0044:
            r3 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0054
            boolean r3 = r11.mo15006n0(r9)
            if (r3 == 0) goto L_0x0051
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r1 = r1 | r3
        L_0x0054:
            r3 = r1 & 5851(0x16db, float:8.199E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r3 != r4) goto L_0x0066
            boolean r3 = r11.mo15011p()
            if (r3 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r11.mo14958a0()
            goto L_0x018a
        L_0x0066:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0072
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:478)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r3, r4)
        L_0x0072:
            int r0 = r16.mo11991e()
            r3 = 0
            androidx.compose.foundation.lazy.LazyListState r4 = androidx.compose.foundation.lazy.LazyListStateKt.m10895a(r0, r3, r11, r3, r2)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r0)
            boolean r0 = r11.mo15006n0(r8)
            java.lang.Object r5 = r11.mo14921N()
            if (r0 != 0) goto L_0x0093
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r5 != r0) goto L_0x009b
        L_0x0093:
            androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1 r5 = new androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1
            r5.<init>(r8)
            r11.mo14893C(r5)
        L_0x009b:
            r11.mo15002m0()
            r0 = r5
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            float r6 = androidx.compose.material3.DatePickerKt.m25588H()
            r7 = 0
            r14 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10026m(r5, r6, r7, r2, r14)
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r11.mo14918M(r5)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r5 = r5.mo7631r()
            androidx.compose.ui.c$a r6 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r6 = r6.mo17072u()
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.ColumnKt.m9863b(r5, r6, r11, r3)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r11.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r11.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r11.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r3 = r15.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r8 = r11.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x00fc
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00fc:
            r11.mo14938T()
            boolean r8 = r11.mo14997l()
            if (r8 == 0) goto L_0x0109
            r11.mo14947W(r3)
            goto L_0x010c
        L_0x0109:
            r11.mo14888A()
        L_0x010c:
            r11.mo14941U()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r11)
            kotlin.jvm.functions.p r8 = r15.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r3, r5, r8)
            kotlin.jvm.functions.p r5 = r15.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r3, r6, r5)
            kotlin.jvm.functions.p r5 = r15.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r3, r7, r5)
            kotlin.jvm.functions.p r5 = r15.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r3, r14, r5)
            r11.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r11)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.invoke(r3, r11, r5)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.mo14918M(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.material3.m r2 = r16.mo11987a()
            int r3 = r1 >> 9
            r3 = r3 & 14
            androidx.compose.material3.DatePickerKt.m25607m(r9, r2, r11, r3)
            int r2 = r1 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r1 = r1 << 6
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r3
            r7 = r2 | r1
            r1 = r16
            r2 = r4
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r11
            m25657d(r0, r1, r2, r3, r4, r5, r6, r7)
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            r11.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x018a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x018a:
            androidx.compose.runtime.t1 r6 = r11.mo15020s()
            if (r6 != 0) goto L_0x0191
            goto L_0x01a4
        L_0x0191:
            androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$2 r7 = new androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$2
            r0 = r7
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.m25655b(androidx.compose.material3.StateData, androidx.compose.material3.d0, kotlin.jvm.functions.l, androidx.compose.material3.c0, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m25656c(DateRangePickerState dateRangePickerState, C8186d0 d0Var, C11300l<? super Long, Boolean> lVar, C8180c0 c0Var, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        C8592o o = oVar.mo15009o(984055784);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(dateRangePickerState)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            DateRangePickerState dateRangePickerState2 = dateRangePickerState;
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo15006n0(d0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        } else {
            C8186d0 d0Var2 = d0Var;
        }
        C11300l<? super Long, Boolean> lVar2 = lVar;
        if ((i7 & 896) == 0) {
            if (o.mo14927P(lVar2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        C8180c0 c0Var2 = c0Var;
        if ((i7 & 7168) == 0) {
            if (o.mo15006n0(c0Var2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(984055784, i8, -1, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:447)");
            }
            int a = dateRangePickerState.mo11484a();
            C2014v0 o2 = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
            C8767m c = SemanticsModifierKt.m71868c(C8767m.f23478j, false, DateRangePickerKt$SwitchableDateEntryContent$1.f19353f, 1, (Object) null);
            C8208h0 c2 = C8208h0.m27129c(a);
            DateRangePickerKt$SwitchableDateEntryContent$2 dateRangePickerKt$SwitchableDateEntryContent$2 = r6;
            DateRangePickerKt$SwitchableDateEntryContent$2 dateRangePickerKt$SwitchableDateEntryContent$22 = new DateRangePickerKt$SwitchableDateEntryContent$2(dateRangePickerState, d0Var, lVar, c0Var, i8);
            CrossfadeKt.m7789b(c2, c, o2, (String) null, C8553b.m31048b(o, 1354418636, true, dateRangePickerKt$SwitchableDateEntryContent$2), o, 24960, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DateRangePickerKt$SwitchableDateEntryContent$3(dateRangePickerState, d0Var, lVar, c0Var, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.compose.material3.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25657d(kotlin.jvm.functions.C11300l<? super java.lang.Long, kotlin.C11079d2> r19, androidx.compose.material3.StateData r20, androidx.compose.foundation.lazy.LazyListState r21, androidx.compose.material3.C8186d0 r22, kotlin.jvm.functions.C11300l<? super java.lang.Long, java.lang.Boolean> r23, androidx.compose.material3.C8180c0 r24, androidx.compose.runtime.C8592o r25, int r26) {
        /*
            r10 = r20
            r11 = r21
            r12 = r26
            r0 = -837198453(0xffffffffce195d8b, float:-6.4326112E8)
            r1 = r25
            androidx.compose.runtime.o r13 = r1.mo15009o(r0)
            r1 = r12 & 14
            r14 = r19
            if (r1 != 0) goto L_0x0020
            boolean r1 = r13.mo14927P(r14)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r12
            goto L_0x0021
        L_0x0020:
            r1 = r12
        L_0x0021:
            r2 = r12 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0031
            boolean r2 = r13.mo15006n0(r10)
            if (r2 == 0) goto L_0x002e
            r2 = 32
            goto L_0x0030
        L_0x002e:
            r2 = 16
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r12 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0041
            boolean r2 = r13.mo15006n0(r11)
            if (r2 == 0) goto L_0x003e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r1 = r1 | r2
        L_0x0041:
            r2 = r12 & 7168(0x1c00, float:1.0045E-41)
            r15 = r22
            if (r2 != 0) goto L_0x0053
            boolean r2 = r13.mo15006n0(r15)
            if (r2 == 0) goto L_0x0050
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0052
        L_0x0050:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0052:
            r1 = r1 | r2
        L_0x0053:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r12
            r9 = r23
            if (r2 != 0) goto L_0x0067
            boolean r2 = r13.mo14927P(r9)
            if (r2 == 0) goto L_0x0064
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0066
        L_0x0064:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0066:
            r1 = r1 | r2
        L_0x0067:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r12
            r8 = r24
            if (r2 != 0) goto L_0x007a
            boolean r2 = r13.mo15006n0(r8)
            if (r2 == 0) goto L_0x0077
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0079
        L_0x0077:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x0079:
            r1 = r1 | r2
        L_0x007a:
            r7 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r7
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x0090
            boolean r1 = r13.mo15011p()
            if (r1 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r13.mo14958a0()
            goto L_0x0150
        L_0x0090:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x009c
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:511)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r1, r2)
        L_0x009c:
            androidx.compose.material3.m r0 = r20.mo11987a()
            androidx.compose.material3.l r16 = r0.mo12487c()
            kotlin.ranges.l r0 = r20.mo11995i()
            r1 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r1)
            boolean r0 = r13.mo15006n0(r0)
            java.lang.Object r1 = r13.mo14921N()
            r6 = 1
            if (r0 != 0) goto L_0x00c1
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00d4
        L_0x00c1:
            androidx.compose.material3.m r0 = r20.mo11987a()
            kotlin.ranges.l r1 = r20.mo11995i()
            int r1 = r1.mo23049r()
            androidx.compose.material3.q r1 = r0.mo12490g(r1, r6)
            r13.mo14893C(r1)
        L_0x00d4:
            r13.mo15002m0()
            r4 = r1
            androidx.compose.material3.q r4 = (androidx.compose.material3.C8266q) r4
            androidx.compose.material3.i1 r0 = androidx.compose.material3.C8215i1.f20180a
            r5 = 6
            androidx.compose.material3.s3 r0 = r0.mo12654c(r13, r5)
            androidx.compose.material3.tokens.i r1 = androidx.compose.material3.tokens.C8310i.f21329a
            androidx.compose.material3.tokens.TypographyKeyTokens r1 = r1.mo13713H()
            androidx.compose.ui.text.p0 r3 = androidx.compose.material3.TypographyKt.m26914a(r0, r1)
            androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1 r2 = new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1
            r0 = r2
            r1 = r21
            r12 = r2
            r2 = r7
            r14 = r3
            r3 = r20
            r17 = r5
            r5 = r22
            r15 = r6
            r6 = r24
            r18 = r7
            r7 = r19
            r8 = r16
            r9 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 56792252(0x36294bc, float:6.658617E-37)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r0, r15, r12)
            r1 = 48
            androidx.compose.material3.TextKt.m26698a(r14, r0, r13, r1)
            int r0 = r18 >> 6
            r0 = r0 & 14
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r1)
            boolean r1 = r13.mo15006n0(r11)
            boolean r2 = r13.mo15006n0(r10)
            r1 = r1 | r2
            java.lang.Object r2 = r13.mo14921N()
            if (r1 != 0) goto L_0x0134
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x013d
        L_0x0134:
            androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1 r2 = new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1
            r1 = 0
            r2.<init>(r11, r10, r1)
            r13.mo14893C(r2)
        L_0x013d:
            r13.mo15002m0()
            kotlin.jvm.functions.p r2 = (kotlin.jvm.functions.C11304p) r2
            r0 = r0 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r11, r2, r13, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0150
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0150:
            androidx.compose.runtime.t1 r8 = r13.mo15020s()
            if (r8 != 0) goto L_0x0157
            goto L_0x016e
        L_0x0157:
            androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$3 r9 = new androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$3
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.m25657d(kotlin.jvm.functions.l, androidx.compose.material3.StateData, androidx.compose.foundation.lazy.LazyListState, androidx.compose.material3.d0, kotlin.jvm.functions.l, androidx.compose.material3.c0, androidx.compose.runtime.o, int):void");
    }

    /* renamed from: l */
    public static final List<C16026d> m25665l(LazyListState lazyListState, C12074o0 o0Var, String str, String str2) {
        return CollectionsKt__CollectionsKt.m40448L(new C16026d(str, new DateRangePickerKt$customScrollActions$scrollUpAction$1(lazyListState, o0Var)), new C16026d(str2, new DateRangePickerKt$customScrollActions$scrollDownAction$1(lazyListState, o0Var)));
    }

    /* renamed from: m */
    public static final void m25666m(@C12579k C15184c cVar, @C12579k C8235k2 k2Var, long j) {
        float f;
        boolean z;
        float f2;
        float f3;
        C15184c cVar2 = cVar;
        Intrinsics.checkNotNullParameter(cVar2, "$this$drawRangeBackground");
        Intrinsics.checkNotNullParameter(k2Var, "selectedRangeInfo");
        float g5 = cVar2.mo7425g5(DatePickerKt.m25591K());
        float g52 = cVar2.mo7425g5(DatePickerKt.m25591K());
        float g53 = cVar2.mo7425g5(C8310i.f21329a.mo13738m());
        float f4 = (float) 2;
        float f5 = (g52 - g53) / f4;
        float f6 = (float) 7;
        float t = (C15104m.m65023t(cVar.mo42718b()) - (f6 * g5)) / f6;
        long w = k2Var.mo12757b().mo21849e().mo47856w();
        int c = C16494m.m74571c(w);
        int d = C16494m.m74572d(w);
        long w2 = k2Var.mo12757b().mo21851f().mo47856w();
        int c2 = C16494m.m74571c(w2);
        int d2 = C16494m.m74572d(w2);
        float f7 = g5 + t;
        float f8 = ((float) c) * f7;
        if (k2Var.mo12756a()) {
            f = g5 / f4;
        } else {
            f = 0.0f;
        }
        float f9 = t / f4;
        float f10 = f8 + f + f9;
        float f11 = (((float) d) * g52) + f5;
        float f12 = ((float) c2) * f7;
        if (k2Var.mo12758c()) {
            g5 /= f4;
        }
        float f13 = f12 + g5 + f9;
        float f14 = (((float) d2) * g52) + f5;
        if (cVar.getLayoutDirection() == LayoutDirection.Rtl) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f10 = C15104m.m65023t(cVar.mo42718b()) - f10;
            f13 = C15104m.m65023t(cVar.mo42718b()) - f13;
        }
        float f15 = f13;
        long a = C15096g.m64898a(f10, f11);
        if (d == d2) {
            f2 = f15 - f10;
        } else if (z) {
            f2 = -f10;
        } else {
            f2 = C15104m.m65023t(cVar.mo42718b()) - f10;
        }
        float f16 = f14;
        float f17 = f11;
        int i = d;
        C15187e.m65710e5(cVar, j, a, C15106n.m65033a(f2, g53), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
        int i2 = d2;
        if (i != i2) {
            for (int i3 = (i2 - i) - 1; i3 > 0; i3--) {
                C15187e.m65710e5(cVar, j, C15096g.m64898a(0.0f, f17 + (((float) i3) * g52)), C15106n.m65033a(C15104m.m65023t(cVar.mo42718b()), g53), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
            }
            if (cVar.getLayoutDirection() == LayoutDirection.Ltr) {
                f3 = 0.0f;
            } else {
                f3 = C15104m.m65023t(cVar.mo42718b());
            }
            long a2 = C15096g.m64898a(f3, f16);
            if (z) {
                f15 -= C15104m.m65023t(cVar.mo42718b());
            }
            C15187e.m65710e5(cVar, j, a2, C15106n.m65033a(f15, g53), 0.0f, (C15192h) null, (C15249k2) null, 0, 120, (Object) null);
        }
    }

    @C12579k
    /* renamed from: n */
    public static final C2366i0 m25667n() {
        return f19348a;
    }

    @C8540g
    @C8251n0
    @C12579k
    /* renamed from: o */
    public static final DateRangePickerState m25668o(@C12580l Long l, @C12580l Long l2, @C12580l Long l3, @C12580l C11466l lVar, int i, @C12580l C8592o oVar, int i2, int i3) {
        Long l4;
        Long l5;
        Long l6;
        C11466l lVar2;
        int i4;
        oVar.mo14918M(501019096);
        if ((i3 & 1) != 0) {
            l4 = null;
        } else {
            l4 = l;
        }
        if ((i3 & 2) != 0) {
            l5 = null;
        } else {
            l5 = l2;
        }
        if ((i3 & 4) != 0) {
            l6 = l4;
        } else {
            l6 = l3;
        }
        if ((i3 & 8) != 0) {
            lVar2 = DatePickerDefaults.f19304a.mo11350f();
        } else {
            lVar2 = lVar;
        }
        if ((i3 & 16) != 0) {
            i4 = C8208h0.f20150b.mo12627b();
        } else {
            i4 = i;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(501019096, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:157)");
        }
        DateRangePickerState dateRangePickerState = (DateRangePickerState) RememberSaveableKt.m31343d(new Object[0], DateRangePickerState.f19358c.mo11490a(), (String) null, new DateRangePickerKt$rememberDateRangePickerState$1(l4, l5, l6, lVar2, i4), oVar, 72, 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return dateRangePickerState;
    }

    /* renamed from: p */
    public static final void m25669p(StateData stateData, long j) {
        C8238l h = stateData.mo11987a().mo12491h(j);
        C8238l value = stateData.mo11993g().getValue();
        C8238l value2 = stateData.mo11992f().getValue();
        if ((value == null && value2 == null) || ((value != null && value2 != null) || (value != null && h.compareTo(value) < 0))) {
            stateData.mo11993g().setValue(h);
            stateData.mo11992f().setValue(null);
        } else if (value != null && h.compareTo(value) >= 0) {
            stateData.mo11992f().setValue(h);
        }
    }
}
