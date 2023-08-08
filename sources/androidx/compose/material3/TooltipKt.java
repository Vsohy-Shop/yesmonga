package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.C8284t2;
import androidx.compose.material3.tokens.C8334q0;
import androidx.compose.material3.tokens.C8340t0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.window.C16546g;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.urbanairship.util.C9647e0;
import kotlin.C11079d2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,770:1\n25#2:771\n25#2:780\n25#2:788\n25#2:796\n50#2:803\n49#2:804\n25#2:815\n25#2:826\n460#2,13:853\n473#2,3:867\n460#2,13:891\n473#2,3:905\n460#2,13:929\n460#2,13:962\n473#2,3:976\n460#2,13:1000\n473#2,3:1014\n460#2,13:1038\n473#2,3:1052\n473#2,3:1057\n1114#3,6:772\n1114#3,6:781\n1114#3,6:789\n1114#3,6:797\n1114#3,6:805\n1114#3,3:816\n1117#3,3:822\n1114#3,6:827\n76#4:778\n76#4:795\n76#4:841\n76#4:879\n76#4:917\n76#4:950\n76#4:988\n76#4:1026\n1#5:779\n154#6:787\n154#6:1063\n154#6:1064\n154#6:1065\n154#6:1066\n154#6:1067\n154#6:1068\n154#6:1069\n154#6:1070\n154#6:1071\n154#6:1072\n154#6:1073\n154#6:1074\n154#6:1075\n474#7,4:811\n478#7,2:819\n482#7:825\n474#8:821\n66#9,7:833\n73#9:866\n77#9:871\n67#9,6:872\n73#9:904\n77#9:909\n67#9,6:943\n73#9:975\n77#9:980\n67#9,6:981\n73#9:1013\n77#9:1018\n67#9,6:1019\n73#9:1051\n77#9:1056\n75#10:840\n76#10,11:842\n89#10:870\n75#10:878\n76#10,11:880\n89#10:908\n75#10:916\n76#10,11:918\n75#10:949\n76#10,11:951\n89#10:979\n75#10:987\n76#10,11:989\n89#10:1017\n75#10:1025\n76#10,11:1027\n89#10:1055\n89#10:1060\n74#11,6:910\n80#11:942\n84#11:1061\n135#12:1062\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n98#1:771\n105#1:780\n152#1:788\n160#1:796\n162#1:803\n162#1:804\n200#1:815\n203#1:826\n246#1:853,13\n246#1:867,3\n285#1:891,13\n285#1:905,3\n309#1:929,13\n313#1:962,13\n313#1:976,3\n323#1:1000,13\n323#1:1014,3\n333#1:1038,13\n333#1:1052,3\n309#1:1057,3\n98#1:772,6\n105#1:781,6\n152#1:789,6\n160#1:797,6\n162#1:805,6\n200#1:816,3\n200#1:822,3\n203#1:827,6\n104#1:778\n159#1:795\n246#1:841\n285#1:879\n309#1:917\n313#1:950\n323#1:988\n333#1:1026\n119#1:787\n752#1:1063\n753#1:1064\n754#1:1065\n755#1:1066\n756#1:1067\n757#1:1068\n760#1:1069\n761#1:1070\n762#1:1071\n763#1:1072\n764#1:1073\n765#1:1074\n766#1:1075\n200#1:811,4\n200#1:819,2\n200#1:825\n200#1:821\n246#1:833,7\n246#1:866\n246#1:871\n285#1:872,6\n285#1:904\n285#1:909\n313#1:943,6\n313#1:975\n313#1:980\n323#1:981,6\n323#1:1013\n323#1:1018\n333#1:1019,6\n333#1:1051\n333#1:1056\n246#1:840\n246#1:842,11\n246#1:870\n285#1:878\n285#1:880,11\n285#1:908\n309#1:916\n309#1:918,11\n313#1:949\n313#1:951,11\n313#1:979\n323#1:987\n323#1:989,11\n323#1:1017\n333#1:1025\n333#1:1027,11\n333#1:1055\n309#1:1060\n309#1:910,6\n309#1:942\n309#1:1061\n696#1:1062\n*E\n"})
public final class TooltipKt {

    /* renamed from: a */
    public static final float f19930a;

    /* renamed from: b */
    public static final float f19931b;

    /* renamed from: c */
    public static final float f19932c = C16483g.m74435M((float) 40);

    /* renamed from: d */
    public static final float f19933d = C16483g.m74435M((float) 200);

    /* renamed from: e */
    public static final float f19934e;

    /* renamed from: f */
    public static final float f19935f;
    @C12579k

    /* renamed from: g */
    public static final C2366i0 f19936g;

    /* renamed from: h */
    public static final float f19937h = C16483g.m74435M((float) 320);

    /* renamed from: i */
    public static final float f19938i;

    /* renamed from: j */
    public static final float f19939j = C16483g.m74435M((float) 28);

    /* renamed from: k */
    public static final float f19940k;

    /* renamed from: l */
    public static final float f19941l;

    /* renamed from: m */
    public static final float f19942m = C16483g.m74435M((float) 36);

    /* renamed from: n */
    public static final float f19943n;

    /* renamed from: o */
    public static final long f19944o = 1500;

    /* renamed from: p */
    public static final int f19945p = 150;

    /* renamed from: q */
    public static final int f19946q = 75;

    static {
        float f = (float) 4;
        f19930a = C16483g.m74435M(f);
        float f2 = (float) 24;
        f19931b = C16483g.m74435M(f2);
        float M = C16483g.m74435M(f);
        f19934e = M;
        float f3 = (float) 8;
        float M2 = C16483g.m74435M(f3);
        f19935f = M2;
        f19936g = PaddingKt.m10015b(M2, M);
        float f4 = (float) 16;
        f19938i = C16483g.m74435M(f4);
        f19940k = C16483g.m74435M(f2);
        f19941l = C16483g.m74435M(f4);
        f19943n = C16483g.m74435M(f3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x011a, code lost:
        if ((r35 & 32) != 0) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f7  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26854a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r24, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8364w1 r26, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r27, long r28, long r30, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8254n3, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r1 = r24
            r14 = r32
            r15 = r34
            java.lang.String r0 = "tooltip"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -531325137(0xffffffffe0549f2f, float:-6.1284065E19)
            r2 = r33
            androidx.compose.runtime.o r13 = r2.mo15009o(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r15 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r15 & 14
            if (r2 != 0) goto L_0x002f
            boolean r2 = r13.mo14927P(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r15
            goto L_0x0030
        L_0x002f:
            r2 = r15
        L_0x0030:
            r3 = r35 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x004a
        L_0x0037:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r25
            boolean r5 = r13.mo15006n0(r4)
            if (r5 == 0) goto L_0x0046
            r5 = 32
            goto L_0x0048
        L_0x0046:
            r5 = 16
        L_0x0048:
            r2 = r2 | r5
            goto L_0x004c
        L_0x004a:
            r4 = r25
        L_0x004c:
            r5 = r35 & 4
            if (r5 == 0) goto L_0x0053
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0066
            r6 = r26
            boolean r7 = r13.mo15006n0(r6)
            if (r7 == 0) goto L_0x0062
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r2 = r2 | r7
            goto L_0x0068
        L_0x0066:
            r6 = r26
        L_0x0068:
            r7 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r35 & 8
            if (r7 != 0) goto L_0x007b
            r7 = r27
            boolean r8 = r13.mo15006n0(r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007b:
            r7 = r27
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r2 = r2 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r27
        L_0x0083:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r15 & r8
            if (r9 != 0) goto L_0x009f
            r9 = r35 & 16
            if (r9 != 0) goto L_0x0099
            r9 = r28
            boolean r11 = r13.mo14980g(r9)
            if (r11 == 0) goto L_0x009b
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r9 = r28
        L_0x009b:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r2 = r2 | r11
            goto L_0x00a1
        L_0x009f:
            r9 = r28
        L_0x00a1:
            r11 = 458752(0x70000, float:6.42848E-40)
            r12 = r15 & r11
            if (r12 != 0) goto L_0x00bd
            r12 = r35 & 32
            if (r12 != 0) goto L_0x00b6
            r11 = r30
            boolean r16 = r13.mo14980g(r11)
            if (r16 == 0) goto L_0x00b8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b6:
            r11 = r30
        L_0x00b8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r2 = r2 | r16
            goto L_0x00bf
        L_0x00bd:
            r11 = r30
        L_0x00bf:
            r16 = r35 & 64
            if (r16 == 0) goto L_0x00c8
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c5:
            r2 = r2 | r16
            goto L_0x00da
        L_0x00c8:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00da
            boolean r16 = r13.mo14927P(r14)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c5
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c5
        L_0x00da:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r8 = r2 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r8 != r0) goto L_0x00f7
            boolean r0 = r13.mo15011p()
            if (r0 != 0) goto L_0x00eb
            goto L_0x00f7
        L_0x00eb:
            r13.mo14958a0()
            r2 = r4
            r3 = r6
            r4 = r7
            r5 = r9
            r7 = r11
            r17 = r13
            goto L_0x020b
        L_0x00f7:
            r13.mo14930Q()
            r0 = r15 & 1
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = 6
            if (r0 == 0) goto L_0x0128
            boolean r0 = r13.mo14977f0()
            if (r0 == 0) goto L_0x0109
            goto L_0x0128
        L_0x0109:
            r13.mo14958a0()
            r0 = r35 & 8
            if (r0 == 0) goto L_0x0112
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0112:
            r0 = r35 & 16
            if (r0 == 0) goto L_0x0118
            r2 = r2 & r18
        L_0x0118:
            r0 = r35 & 32
            if (r0 == 0) goto L_0x0120
        L_0x011c:
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r2 = r2 & r0
        L_0x0120:
            r0 = r4
            r18 = r6
            r19 = r7
            r20 = r9
            goto L_0x0174
        L_0x0128:
            if (r3 == 0) goto L_0x012d
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r4 = r0
        L_0x012d:
            if (r5 == 0) goto L_0x014f
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r0)
            java.lang.Object r0 = r13.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r0 != r3) goto L_0x0149
            androidx.compose.material3.w1 r0 = new androidx.compose.material3.w1
            r0.<init>()
            r13.mo14893C(r0)
        L_0x0149:
            r13.mo15002m0()
            androidx.compose.material3.w1 r0 = (androidx.compose.material3.C8364w1) r0
            r6 = r0
        L_0x014f:
            r0 = r35 & 8
            if (r0 == 0) goto L_0x015c
            androidx.compose.material3.o3 r0 = androidx.compose.material3.C8259o3.f20406a
            androidx.compose.ui.graphics.g4 r0 = r0.mo12892b(r13, r8)
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
            r7 = r0
        L_0x015c:
            r0 = r35 & 16
            if (r0 == 0) goto L_0x0169
            androidx.compose.material3.o3 r0 = androidx.compose.material3.C8259o3.f20406a
            long r9 = r0.mo12891a(r13, r8)
            r0 = r2 & r18
            r2 = r0
        L_0x0169:
            r0 = r35 & 32
            if (r0 == 0) goto L_0x0120
            androidx.compose.material3.o3 r0 = androidx.compose.material3.C8259o3.f20406a
            long r11 = r0.mo12893c(r13, r8)
            goto L_0x011c
        L_0x0174:
            r13.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0186
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)"
            r5 = -531325137(0xffffffffe0549f2f, float:-6.1284065E19)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r3, r4)
        L_0x0186:
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r13.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            float r4 = f19930a
            int r3 = r3.mo7429n2(r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r4)
            java.lang.Object r4 = r13.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r4 != r5) goto L_0x01b0
            androidx.compose.material3.v1 r4 = new androidx.compose.material3.v1
            r4.<init>(r3)
            r13.mo14893C(r4)
        L_0x01b0:
            r13.mo15002m0()
            r3 = r4
            androidx.compose.material3.v1 r3 = (androidx.compose.material3.C8360v1) r3
            r4 = 0
            float r4 = (float) r4
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r10 = f19933d
            androidx.compose.material3.TooltipKt$PlainTooltipBox$2 r4 = new androidx.compose.material3.TooltipKt$PlainTooltipBox$2
            r4.<init>(r11, r1, r2)
            r5 = -785135750(0xffffffffd133c77a, float:-4.8259113E10)
            r6 = 1
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r5, r6, r4)
            int r5 = r2 << 3
            r6 = r5 & 896(0x380, float:1.256E-42)
            r7 = 14155830(0xd80036, float:1.9836543E-38)
            r6 = r6 | r7
            r7 = r2 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            int r2 = r2 << r8
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r2
            r6 = r6 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r7
            r5 = r5 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r6
            r16 = r5 | r2
            r2 = r4
            r4 = r0
            r5 = r19
            r6 = r18
            r7 = r20
            r22 = r11
            r11 = r32
            r12 = r13
            r17 = r13
            r13 = r16
            m26858e(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0202
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0202:
            r2 = r0
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r22
        L_0x020b:
            androidx.compose.runtime.t1 r12 = r17.mo15020s()
            if (r12 != 0) goto L_0x0212
            goto L_0x0223
        L_0x0212:
            androidx.compose.material3.TooltipKt$PlainTooltipBox$3 r13 = new androidx.compose.material3.TooltipKt$PlainTooltipBox$3
            r0 = r13
            r1 = r24
            r9 = r32
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m26854a(kotlin.jvm.functions.p, androidx.compose.ui.m, androidx.compose.material3.w1, androidx.compose.ui.graphics.g4, long, long, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m26855b(long j, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(893340370);
        if ((i & 14) == 0) {
            if (o.mo14980g(j)) {
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
                ComposerKt.m29845w0(893340370, i2, -1, "androidx.compose.material3.PlainTooltipImpl (Tooltip.kt:280)");
            }
            C8767m j2 = PaddingKt.m10023j(C8767m.f23478j, f19936g);
            o.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(j2);
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
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j)), TextKt.m26703f().mo16141f(TypographyKt.m26914a(C8215i1.f20180a.mo12654c(o, 6), C8334q0.f21971a.mo14324d()))}, pVar, o, (i2 & 112) | 8);
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
            s.mo15202a(new TooltipKt$PlainTooltipImpl$2(j, pVar, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26856c(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8194e2 r30, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r33, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8183c2 r34, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.material3.C8254n3, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r35, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r36, int r37, int r38) {
        /*
            r1 = r28
            r14 = r35
            r15 = r37
            r0 = r38
            java.lang.String r2 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)
            r2 = 180959998(0xac93afe, float:1.9377786E-32)
            r3 = r36
            androidx.compose.runtime.o r13 = r3.mo15009o(r2)
            r3 = r0 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r13.mo14927P(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r15
            goto L_0x0032
        L_0x0031:
            r3 = r15
        L_0x0032:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r29
            boolean r6 = r13.mo15006n0(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r29
        L_0x004e:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r30
            boolean r8 = r13.mo15006n0(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r30
        L_0x006a:
            r8 = r0 & 8
            if (r8 == 0) goto L_0x0071
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0084
            r9 = r31
            boolean r10 = r13.mo14927P(r9)
            if (r10 == 0) goto L_0x0080
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r10
            goto L_0x0086
        L_0x0084:
            r9 = r31
        L_0x0086:
            r10 = r0 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0090
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0090:
            r12 = r15 & r11
            if (r12 != 0) goto L_0x00a4
            r12 = r32
            boolean r16 = r13.mo14927P(r12)
            if (r16 == 0) goto L_0x009f
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r3 = r3 | r16
            goto L_0x00a6
        L_0x00a4:
            r12 = r32
        L_0x00a6:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00c0
            r16 = r0 & 32
            r11 = r33
            if (r16 != 0) goto L_0x00bb
            boolean r16 = r13.mo15006n0(r11)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r3 = r3 | r16
            goto L_0x00c2
        L_0x00c0:
            r11 = r33
        L_0x00c2:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00dc
            r16 = r0 & 64
            r2 = r34
            if (r16 != 0) goto L_0x00d7
            boolean r16 = r13.mo15006n0(r2)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r3 = r3 | r16
            goto L_0x00de
        L_0x00dc:
            r2 = r34
        L_0x00de:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00e6
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e4:
            r3 = r3 | r1
            goto L_0x00f7
        L_0x00e6:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r15
            if (r1 != 0) goto L_0x00f7
            boolean r1 = r13.mo14927P(r14)
            if (r1 == 0) goto L_0x00f4
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e4
        L_0x00f4:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e4
        L_0x00f7:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r3
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r2) goto L_0x0115
            boolean r1 = r13.mo15011p()
            if (r1 != 0) goto L_0x0107
            goto L_0x0115
        L_0x0107:
            r13.mo14958a0()
            r2 = r5
            r3 = r7
            r4 = r9
            r6 = r11
            r5 = r12
            r21 = r13
            r7 = r34
            goto L_0x026e
        L_0x0115:
            r13.mo14930Q()
            r1 = r15 & 1
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r2 = 6
            if (r1 == 0) goto L_0x0142
            boolean r1 = r13.mo14977f0()
            if (r1 == 0) goto L_0x0127
            goto L_0x0142
        L_0x0127:
            r13.mo14958a0()
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0130
            r3 = r3 & r16
        L_0x0130:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0138
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r1
        L_0x0138:
            r18 = r34
        L_0x013a:
            r1 = r5
            r16 = r9
            r17 = r11
            r11 = r12
            r12 = r7
            goto L_0x019c
        L_0x0142:
            if (r4 == 0) goto L_0x0147
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r5 = r1
        L_0x0147:
            if (r6 == 0) goto L_0x0169
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r1)
            java.lang.Object r1 = r13.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r1 != r4) goto L_0x0163
            androidx.compose.material3.e2 r1 = new androidx.compose.material3.e2
            r1.<init>()
            r13.mo14893C(r1)
        L_0x0163:
            r13.mo15002m0()
            androidx.compose.material3.e2 r1 = (androidx.compose.material3.C8194e2) r1
            r7 = r1
        L_0x0169:
            r1 = 0
            if (r8 == 0) goto L_0x016d
            r9 = r1
        L_0x016d:
            if (r10 == 0) goto L_0x0170
            r12 = r1
        L_0x0170:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x017d
            androidx.compose.material3.o3 r1 = androidx.compose.material3.C8259o3.f20406a
            androidx.compose.ui.graphics.g4 r1 = r1.mo12894d(r13, r2)
            r3 = r3 & r16
            r11 = r1
        L_0x017d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0138
            androidx.compose.material3.o3 r16 = androidx.compose.material3.C8259o3.f20406a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 24576(0x6000, float:3.4438E-41)
            r27 = 15
            r25 = r13
            androidx.compose.material3.c2 r1 = r16.mo12895e(r17, r19, r21, r23, r25, r26, r27)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r18 = r1
            goto L_0x013a
        L_0x019c:
            r13.mo14899E()
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x01ae
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)"
            r6 = 180959998(0xac93afe, float:1.9377786E-32)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r3, r4, r5)
        L_0x01ae:
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r13.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            float r5 = f19930a
            int r4 = r4.mo7429n2(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo14918M(r5)
            java.lang.Object r5 = r13.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r6.mo16277a()
            if (r5 != r7) goto L_0x01d8
            androidx.compose.material3.d2 r5 = new androidx.compose.material3.d2
            r5.<init>(r4)
            r13.mo14893C(r5)
        L_0x01d8:
            r13.mo15002m0()
            r4 = r5
            androidx.compose.material3.d2 r4 = (androidx.compose.material3.C8188d2) r4
            int r5 = r3 >> 6
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r7)
            boolean r7 = r13.mo15006n0(r12)
            boolean r8 = r13.mo15006n0(r11)
            r7 = r7 | r8
            java.lang.Object r8 = r13.mo14921N()
            if (r7 != 0) goto L_0x01fb
            java.lang.Object r6 = r6.mo16277a()
            if (r8 != r6) goto L_0x0203
        L_0x01fb:
            androidx.compose.material3.TooltipKt$RichTooltipBox$2$1 r8 = new androidx.compose.material3.TooltipKt$RichTooltipBox$2$1
            r8.<init>(r12, r11)
            r13.mo14893C(r8)
        L_0x0203:
            r13.mo15002m0()
            kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
            r6 = 0
            androidx.compose.runtime.EffectsKt.m29899k(r8, r13, r6)
            long r7 = r18.mo12506b()
            androidx.compose.material3.tokens.t0 r6 = androidx.compose.material3.tokens.C8340t0.f22131a
            float r9 = r6.mo14472g()
            float r10 = f19937h
            androidx.compose.material3.TooltipKt$RichTooltipBox$3 r6 = new androidx.compose.material3.TooltipKt$RichTooltipBox$3
            r29 = r6
            r30 = r18
            r31 = r28
            r32 = r16
            r33 = r11
            r34 = r3
            r29.<init>(r30, r31, r32, r33, r34)
            r2 = 1423372873(0x54d6f249, float:7.385503E12)
            r0 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r2, r0, r6)
            int r0 = r3 << 3
            r6 = r0 & 896(0x380, float:1.256E-42)
            r20 = 14155830(0xd80036, float:1.9836543E-38)
            r6 = r6 | r20
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            r6 = 6
            int r3 = r3 << r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r6
            r3 = r3 | r5
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r5
            r0 = r0 | r3
            r3 = r4
            r4 = r1
            r5 = r17
            r6 = r12
            r19 = r11
            r11 = r35
            r20 = r12
            r12 = r13
            r21 = r13
            r13 = r0
            m26858e(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0263
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0263:
            r2 = r1
            r4 = r16
            r6 = r17
            r7 = r18
            r5 = r19
            r3 = r20
        L_0x026e:
            androidx.compose.runtime.t1 r11 = r21.mo15020s()
            if (r11 != 0) goto L_0x0275
            goto L_0x0286
        L_0x0275:
            androidx.compose.material3.TooltipKt$RichTooltipBox$4 r12 = new androidx.compose.material3.TooltipKt$RichTooltipBox$4
            r0 = r12
            r1 = r28
            r8 = r35
            r9 = r37
            r10 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x0286:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m26856c(kotlin.jvm.functions.p, androidx.compose.ui.m, androidx.compose.material3.e2, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, androidx.compose.material3.c2, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    public static final void m26857d(C8183c2 c2Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8592o oVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar3;
        int i7 = i;
        C8592o o = oVar.mo15009o(-878950288);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(c2Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            C8183c2 c2Var2 = c2Var;
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo14927P(pVar4)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i7 & 896) == 0) {
            if (o.mo14927P(pVar5)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 7168) == 0) {
            if (o.mo14927P(pVar6)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-878950288, i2, -1, "androidx.compose.material3.RichTooltipImpl (Tooltip.kt:296)");
            }
            C8215i1 i1Var = C8215i1.f20180a;
            C8280s3 c = i1Var.mo12654c(o, 6);
            C8340t0 t0Var = C8340t0.f22131a;
            C16361p0 a = TypographyKt.m26914a(c, t0Var.mo14469d());
            C16361p0 a2 = TypographyKt.m26914a(i1Var.mo12654c(o, 6), t0Var.mo14476k());
            C16361p0 a3 = TypographyKt.m26914a(i1Var.mo12654c(o, 6), t0Var.mo14478m());
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m m = PaddingKt.m10026m(aVar, f19938i, 0.0f, 2, (Object) null);
            o.mo14918M(-483455358);
            Arrangement.C2279l r = Arrangement.f6010a.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a4 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(m);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a4);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            o.mo14918M(51873568);
            if (pVar5 != null) {
                C8767m j = AlignmentLineKt.m9717j(aVar, f19939j, 0.0f, 2, (Object) null);
                o.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a5 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(j);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a5);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b3 = Updater.m30180b(o);
                Updater.m30188j(b3, k, companion.mo44588d());
                Updater.m30188j(b3, dVar2, companion.mo44586b());
                Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b3, c4Var2, companion.mo44590f());
                o.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(c2Var.mo12508d())), TextKt.m26703f().mo16141f(a2)}, pVar5, o, 8);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            o.mo15002m0();
            if (pVar5 != null) {
                z = true;
            } else {
                z = false;
            }
            if (pVar6 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C8767m n = m26867n(aVar, z, z2);
            o.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a6 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(n);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a6);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b4 = Updater.m30180b(o);
            Updater.m30188j(b4, k2, companion.mo44588d());
            Updater.m30188j(b4, dVar3, companion.mo44586b());
            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b4, c4Var3, companion.mo44590f());
            o.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f6046a;
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(c2Var.mo12507c())), TextKt.m26703f().mo16141f(a3)}, pVar4, o, (i2 & 112) | 8);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14918M(75391440);
            if (pVar6 != null) {
                C8767m o2 = PaddingKt.m10028o(SizeKt.m10120t(aVar, f19942m, 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, f19943n, 7, (Object) null);
                o.mo14918M(733328855);
                C15560f0 k3 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar4 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection4 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var4 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a7 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(o2);
                if (!(o.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                o.mo14938T();
                if (o.mo14997l()) {
                    o.mo14947W(a7);
                } else {
                    o.mo14888A();
                }
                o.mo14941U();
                C8592o b5 = Updater.m30180b(o);
                Updater.m30188j(b5, k3, companion.mo44588d());
                Updater.m30188j(b5, dVar4, companion.mo44586b());
                Updater.m30188j(b5, layoutDirection4, companion.mo44587c());
                Updater.m30188j(b5, c4Var4, companion.mo44590f());
                o.mo14972e();
                f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(c2Var.mo12505a())), TextKt.m26703f().mo16141f(a)}, pVar6, o, 8);
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
                C11079d2 d2Var2 = C11079d2.f28267a;
            }
            o.mo15002m0();
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
            s.mo15202a(new TooltipKt$RichTooltipImpl$2(c2Var, pVar, pVar2, pVar3, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: e */
    public static final void m26858e(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16546g gVar, C8767m mVar, C15218g4 g4Var, C8265p3 p3Var, long j, float f, float f2, C11305q<? super C8254n3, ? super C8592o, ? super Integer, C11079d2> qVar, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C16546g gVar2 = gVar;
        C8265p3 p3Var2 = p3Var;
        C11305q<? super C8254n3, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
        int i12 = i;
        C8592o o = oVar.mo15009o(-1415647894);
        if ((i12 & 14) == 0) {
            if (o.mo14927P(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i12;
        } else {
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
            i2 = i12;
        }
        if ((i12 & 112) == 0) {
            if (o.mo15006n0(gVar2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i12 & 896) == 0) {
            if (o.mo15006n0(mVar)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        } else {
            C8767m mVar2 = mVar;
        }
        if ((i12 & 7168) == 0) {
            if (o.mo15006n0(g4Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        } else {
            C15218g4 g4Var2 = g4Var;
        }
        if ((57344 & i12) == 0) {
            if (o.mo15006n0(p3Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((458752 & i12) == 0) {
            if (o.mo14980g(j)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        } else {
            long j2 = j;
        }
        float f3 = f;
        if ((3670016 & i12) == 0) {
            if (o.mo14968d(f3)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        float f4 = f2;
        if ((29360128 & i12) == 0) {
            if (o.mo14968d(f4)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((234881024 & i12) == 0) {
            if (o.mo14927P(qVar2)) {
                i3 = C8698y1.f23302n;
            } else {
                i3 = C9647e0.f26435a;
            }
            i2 |= i3;
        }
        if ((191739611 & i2) != 38347922 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1415647894, i2, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:188)");
            }
            o.mo14918M(773894976);
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
                o.mo14893C(N);
            }
            o.mo15002m0();
            C12074o0 a = ((C8690w) N).mo16831a();
            o.mo15002m0();
            C8284t2.C8285a aVar2 = C8284t2.f20507b;
            String a2 = C8357u2.m29348a(aVar2.mo13059j0(), o, 6);
            o.mo14918M(-492369756);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = new TooltipKt$TooltipBox$scope$1$1(p3Var2, a, a2);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            TooltipKt$TooltipBox$scope$1$1 tooltipKt$TooltipBox$scope$1$1 = (TooltipKt$TooltipBox$scope$1$1) N2;
            o.mo14918M(733328855);
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(aVar3);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a3);
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
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            Transition o2 = TransitionKt.m8196o(Boolean.valueOf(p3Var.isVisible()), "Tooltip transition", o, 48, 0);
            o.mo14918M(-1995827526);
            if (((Boolean) o2.mo6700h()).booleanValue() || ((Boolean) o2.mo6706o()).booleanValue()) {
                TooltipPopup_androidKt.m26879a(gVar2, new TooltipKt$TooltipBox$1$1(p3Var2, a), C8553b.m31048b(o, -442150991, true, new TooltipKt$TooltipBox$1$2(mVar, f2, o2, C8357u2.m29348a(aVar2.mo13061k0(), o, 6), g4Var, j, f, pVar, i2)), o, ((i2 >> 3) & 14) | C22132b.f56831b);
            }
            o.mo15002m0();
            qVar2.invoke(tooltipKt$TooltipBox$scope$1$1, o, Integer.valueOf(((i2 >> 21) & 112) | 6));
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
            s.mo15202a(new TooltipKt$TooltipBox$2(pVar, gVar, mVar, g4Var, p3Var, j, f, f2, qVar, i));
        }
    }

    /* renamed from: j */
    public static final C8767m m26863j(C8767m mVar, Transition<Boolean> transition) {
        C11300l lVar;
        if (InspectableValueKt.m71063e()) {
            lVar = new TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(transition);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new TooltipKt$animateTooltip$2(transition));
    }

    /* renamed from: k */
    public static final float m26864k() {
        return f19938i;
    }

    /* renamed from: l */
    public static final float m26865l() {
        return f19931b;
    }

    /* renamed from: m */
    public static final float m26866m() {
        return f19932c;
    }

    /* renamed from: n */
    public static final C8767m m26867n(C8767m mVar, boolean z, boolean z2) {
        if (z || z2) {
            return PaddingKt.m10028o(AlignmentLineKt.m9717j(mVar, f19940k, 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, f19941l, 7, (Object) null);
        }
        return PaddingKt.m10026m(mVar, 0.0f, f19934e, 1, (Object) null);
    }
}
