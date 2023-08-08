package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.C2672d;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.input.key.C15441f;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16313q;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.text.input.C16331y0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.C8646f;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 11 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1087:1\n25#2:1088\n36#2:1100\n50#2:1107\n49#2:1108\n25#2:1115\n25#2:1122\n25#2:1129\n25#2:1143\n25#2:1154\n460#2,13:1180\n473#2,3:1194\n36#2:1200\n36#2:1208\n1114#3,6:1089\n1114#3,6:1101\n1114#3,6:1109\n1114#3,6:1116\n1114#3,6:1123\n1114#3,6:1130\n1114#3,3:1144\n1117#3,3:1150\n1114#3,6:1155\n1114#3,6:1201\n1114#3,6:1209\n76#4:1095\n76#4:1096\n76#4:1097\n76#4:1098\n76#4:1099\n76#4:1136\n76#4:1137\n76#4:1138\n76#4:1168\n76#4:1207\n474#5,4:1139\n478#5,2:1147\n482#5:1153\n474#6:1149\n67#7,6:1161\n73#7:1193\n77#7:1198\n75#8:1167\n76#8,11:1169\n89#8:1197\n1#9:1199\n480#10,4:1215\n485#10:1224\n122#11,5:1219\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n200#1:1088\n216#1:1100\n219#1:1107\n219#1:1108\n232#1:1115\n260#1:1122\n263#1:1129\n275#1:1143\n276#1:1154\n669#1:1180,13\n669#1:1194,3\n1037#1:1200\n1045#1:1208\n200#1:1089,6\n216#1:1101,6\n219#1:1109,6\n232#1:1116,6\n260#1:1123,6\n263#1:1130,6\n275#1:1144,3\n275#1:1150,3\n276#1:1155,6\n1037#1:1201,6\n1045#1:1209,6\n204#1:1095\n205#1:1096\n206#1:1097\n207#1:1098\n208#1:1099\n269#1:1136\n270#1:1137\n271#1:1138\n669#1:1168\n1038#1:1207\n275#1:1139,4\n275#1:1147,2\n275#1:1153\n275#1:1149\n669#1:1161,6\n669#1:1193\n669#1:1198\n669#1:1167\n669#1:1169,11\n669#1:1197\n1073#1:1215,4\n1073#1:1224\n1073#1:1219,5\n*E\n"})
public final class CoreTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: kotlin.jvm.functions.q<? super kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: kotlin.jvm.functions.q<? super kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: kotlin.jvm.functions.q<? super kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: kotlin.jvm.functions.q<kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: kotlin.jvm.functions.q<? super kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: kotlin.jvm.functions.q<? super kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: kotlin.jvm.functions.q<? super kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0455, code lost:
        if (r11 == null) goto L_0x045a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06c7  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x072a  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0787  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0137  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12246a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.input.TextFieldValue r45, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.input.TextFieldValue, kotlin.C11079d2> r46, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r47, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r48, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.input.C16275a1 r49, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.C16260h0, kotlin.C11079d2> r50, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r51, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15421z1 r52, boolean r53, int r54, int r55, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.input.C16313q r56, @org.jetbrains.annotations.C12580l androidx.compose.foundation.text.C2776k r57, boolean r58, boolean r59, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2>, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r60, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r61, int r62, int r63, int r64) {
        /*
            r15 = r45
            r14 = r46
            r13 = r62
            r12 = r63
            r11 = r64
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -958708118(0xffffffffc6db466a, float:-28067.207)
            r1 = r61
            androidx.compose.runtime.o r10 = r1.mo15009o(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.mo15006n0(r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r10.mo14927P(r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0052:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r47
            boolean r16 = r10.mo15006n0(r9)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r16
            goto L_0x0068
        L_0x0066:
            r9 = r47
        L_0x0068:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r48
            boolean r19 = r10.mo15006n0(r2)
            if (r19 == 0) goto L_0x0082
            r19 = r18
            goto L_0x0084
        L_0x0082:
            r19 = r17
        L_0x0084:
            r1 = r1 | r19
            goto L_0x0089
        L_0x0087:
            r2 = r48
        L_0x0089:
            r19 = r11 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x0096
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r5 = r49
            goto L_0x00ac
        L_0x0096:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r13 & r22
            r5 = r49
            if (r22 != 0) goto L_0x00ac
            boolean r23 = r10.mo15006n0(r5)
            if (r23 == 0) goto L_0x00a8
            r23 = r20
            goto L_0x00aa
        L_0x00a8:
            r23 = r21
        L_0x00aa:
            r1 = r1 | r23
        L_0x00ac:
            r23 = r11 & 32
            if (r23 == 0) goto L_0x00b7
            r24 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r24
            r6 = r50
            goto L_0x00cc
        L_0x00b7:
            r24 = 458752(0x70000, float:6.42848E-40)
            r24 = r13 & r24
            r6 = r50
            if (r24 != 0) goto L_0x00cc
            boolean r25 = r10.mo14927P(r6)
            if (r25 == 0) goto L_0x00c8
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r1 = r1 | r25
        L_0x00cc:
            r25 = r11 & 64
            if (r25 == 0) goto L_0x00d7
            r26 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r26
            r7 = r51
            goto L_0x00ec
        L_0x00d7:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r13 & r26
            r7 = r51
            if (r26 != 0) goto L_0x00ec
            boolean r27 = r10.mo15006n0(r7)
            if (r27 == 0) goto L_0x00e8
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r1 = r1 | r27
        L_0x00ec:
            r8 = r11 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00f7
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r28
            r3 = r52
            goto L_0x010c
        L_0x00f7:
            r28 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r13 & r28
            r3 = r52
            if (r28 != 0) goto L_0x010c
            boolean r29 = r10.mo15006n0(r3)
            if (r29 == 0) goto L_0x0108
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r1 = r1 | r29
        L_0x010c:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0117
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r30
            r2 = r53
            goto L_0x012c
        L_0x0117:
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r13 & r30
            r2 = r53
            if (r30 != 0) goto L_0x012c
            boolean r30 = r10.mo14961b(r2)
            if (r30 == 0) goto L_0x0128
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r1 = r1 | r30
        L_0x012c:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0137
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r30
            r3 = r54
            goto L_0x014c
        L_0x0137:
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            r30 = r13 & r30
            r3 = r54
            if (r30 != 0) goto L_0x014c
            boolean r30 = r10.mo14976f(r3)
            if (r30 == 0) goto L_0x0148
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014a
        L_0x0148:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014a:
            r1 = r1 | r30
        L_0x014c:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0155
            r30 = r12 | 6
            r5 = r55
            goto L_0x016b
        L_0x0155:
            r30 = r12 & 14
            r5 = r55
            if (r30 != 0) goto L_0x0169
            boolean r30 = r10.mo14976f(r5)
            if (r30 == 0) goto L_0x0164
            r30 = 4
            goto L_0x0166
        L_0x0164:
            r30 = 2
        L_0x0166:
            r30 = r12 | r30
            goto L_0x016b
        L_0x0169:
            r30 = r12
        L_0x016b:
            r31 = r12 & 112(0x70, float:1.57E-43)
            if (r31 != 0) goto L_0x0185
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x017e
            r5 = r56
            boolean r31 = r10.mo15006n0(r5)
            if (r31 == 0) goto L_0x0180
            r22 = 32
            goto L_0x0182
        L_0x017e:
            r5 = r56
        L_0x0180:
            r22 = 16
        L_0x0182:
            r30 = r30 | r22
            goto L_0x0187
        L_0x0185:
            r5 = r56
        L_0x0187:
            r5 = r30
            r6 = r11 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0190
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01a4
        L_0x0190:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x01a4
            r7 = r57
            boolean r22 = r10.mo15006n0(r7)
            if (r22 == 0) goto L_0x019f
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01a1
        L_0x019f:
            r26 = 128(0x80, float:1.794E-43)
        L_0x01a1:
            r5 = r5 | r26
            goto L_0x01a6
        L_0x01a4:
            r7 = r57
        L_0x01a6:
            r7 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x01ad
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01be
        L_0x01ad:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x01be
            r9 = r58
            boolean r22 = r10.mo14961b(r9)
            if (r22 == 0) goto L_0x01bb
            r17 = r18
        L_0x01bb:
            r5 = r5 | r17
            goto L_0x01c0
        L_0x01be:
            r9 = r58
        L_0x01c0:
            r9 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01c9
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r14 = r59
            goto L_0x01dd
        L_0x01c9:
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r12 & r17
            r14 = r59
            if (r17 != 0) goto L_0x01dd
            boolean r17 = r10.mo14961b(r14)
            if (r17 == 0) goto L_0x01d9
            goto L_0x01db
        L_0x01d9:
            r20 = r21
        L_0x01db:
            r5 = r5 | r20
        L_0x01dd:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01eb
            r18 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r18
            r12 = r60
            goto L_0x0200
        L_0x01eb:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r12 & r18
            r12 = r60
            if (r18 != 0) goto L_0x0200
            boolean r18 = r10.mo14927P(r12)
            if (r18 == 0) goto L_0x01fc
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fe
        L_0x01fc:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01fe:
            r5 = r5 | r18
        L_0x0200:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r1 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r14) goto L_0x023c
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r5
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r14) goto L_0x023c
            boolean r12 = r10.mo15011p()
            if (r12 != 0) goto L_0x021a
            goto L_0x023c
        L_0x021a:
            r10.mo14958a0()
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r7 = r51
            r8 = r52
            r9 = r53
            r11 = r55
            r12 = r56
            r13 = r57
            r14 = r58
            r15 = r59
            r16 = r60
            r1 = r10
            r10 = r54
            goto L_0x07a6
        L_0x023c:
            r10.mo14930Q()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x0291
            boolean r12 = r10.mo14977f0()
            if (r12 == 0) goto L_0x024a
            goto L_0x0291
        L_0x024a:
            r10.mo14958a0()
            r0 = r11 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0272
            r0 = r5 & -113(0xffffffffffffff8f, float:NaN)
            r15 = r47
            r21 = r48
            r14 = r49
            r23 = r50
            r12 = r51
            r24 = r52
            r25 = r53
            r9 = r54
            r26 = r55
            r8 = r56
            r27 = r57
            r7 = r58
            r30 = r59
            r31 = r60
            r2 = r0
            goto L_0x033e
        L_0x0272:
            r15 = r47
            r21 = r48
            r14 = r49
            r23 = r50
            r12 = r51
            r24 = r52
            r25 = r53
            r9 = r54
            r26 = r55
            r8 = r56
            r27 = r57
            r7 = r58
            r30 = r59
            r31 = r60
        L_0x028e:
            r2 = r5
            goto L_0x033e
        L_0x0291:
            if (r4 == 0) goto L_0x0296
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0298
        L_0x0296:
            r4 = r47
        L_0x0298:
            if (r16 == 0) goto L_0x02a1
            androidx.compose.ui.text.p0$a r12 = androidx.compose.p004ui.text.C16361p0.f40603d
            androidx.compose.ui.text.p0 r12 = r12.mo47519a()
            goto L_0x02a3
        L_0x02a1:
            r12 = r48
        L_0x02a3:
            if (r19 == 0) goto L_0x02ac
            androidx.compose.ui.text.input.a1$a r16 = androidx.compose.p004ui.text.input.C16275a1.f40457a
            androidx.compose.ui.text.input.a1 r16 = r16.mo47161a()
            goto L_0x02ae
        L_0x02ac:
            r16 = r49
        L_0x02ae:
            if (r23 == 0) goto L_0x02b3
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1 r19 = androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1.f7091f
            goto L_0x02b5
        L_0x02b3:
            r19 = r50
        L_0x02b5:
            if (r25 == 0) goto L_0x02ba
            r20 = 0
            goto L_0x02bc
        L_0x02ba:
            r20 = r51
        L_0x02bc:
            if (r8 == 0) goto L_0x02cd
            androidx.compose.ui.graphics.h4 r8 = new androidx.compose.ui.graphics.h4
            androidx.compose.ui.graphics.j2$a r21 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r14 = r21.mo42851u()
            r47 = r4
            r4 = 0
            r8.<init>(r14, r4)
            goto L_0x02d1
        L_0x02cd:
            r47 = r4
            r8 = r52
        L_0x02d1:
            if (r0 == 0) goto L_0x02d5
            r0 = 1
            goto L_0x02d7
        L_0x02d5:
            r0 = r53
        L_0x02d7:
            if (r2 == 0) goto L_0x02dd
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02df
        L_0x02dd:
            r2 = r54
        L_0x02df:
            if (r3 == 0) goto L_0x02e3
            r3 = 1
            goto L_0x02e5
        L_0x02e3:
            r3 = r55
        L_0x02e5:
            r4 = r11 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x02f2
            androidx.compose.ui.text.input.q$a r4 = androidx.compose.p004ui.text.input.C16313q.f40529f
            androidx.compose.ui.text.input.q r4 = r4.mo47302a()
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02f4
        L_0x02f2:
            r4 = r56
        L_0x02f4:
            if (r6 == 0) goto L_0x02fd
            androidx.compose.foundation.text.k$a r6 = androidx.compose.foundation.text.C2776k.f7285g
            androidx.compose.foundation.text.k r6 = r6.mo9531a()
            goto L_0x02ff
        L_0x02fd:
            r6 = r57
        L_0x02ff:
            if (r7 == 0) goto L_0x0303
            r7 = 1
            goto L_0x0305
        L_0x0303:
            r7 = r58
        L_0x0305:
            if (r9 == 0) goto L_0x0309
            r9 = 0
            goto L_0x030b
        L_0x0309:
            r9 = r59
        L_0x030b:
            if (r17 == 0) goto L_0x0324
            androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt r14 = androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.f7088a
            kotlin.jvm.functions.q r14 = r14.mo9264a()
            r15 = r47
            r25 = r0
            r26 = r3
            r27 = r6
            r24 = r8
            r30 = r9
            r21 = r12
            r31 = r14
            goto L_0x0334
        L_0x0324:
            r15 = r47
            r31 = r60
            r25 = r0
            r26 = r3
            r27 = r6
            r24 = r8
            r30 = r9
            r21 = r12
        L_0x0334:
            r14 = r16
            r23 = r19
            r12 = r20
            r9 = r2
            r8 = r4
            goto L_0x028e
        L_0x033e:
            r10.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x034f
            java.lang.String r0 = "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:180)"
            r3 = -958708118(0xffffffffc6db466a, float:-28067.207)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r1, r2, r0)
        L_0x034f:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r0)
            java.lang.Object r1 = r10.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r3.mo16277a()
            if (r1 != r4) goto L_0x0369
            androidx.compose.ui.focus.FocusRequester r1 = new androidx.compose.ui.focus.FocusRequester
            r1.<init>()
            r10.mo14893C(r1)
        L_0x0369:
            r10.mo15002m0()
            androidx.compose.ui.focus.FocusRequester r1 = (androidx.compose.p004ui.focus.FocusRequester) r1
            r4 = -55012947(0xfffffffffcb891ad, float:-7.666698E36)
            r10.mo14918M(r4)
            if (r7 == 0) goto L_0x0384
            if (r30 == 0) goto L_0x0379
            goto L_0x0384
        L_0x0379:
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71022t()
            java.lang.Object r4 = r10.mo15032w(r4)
            androidx.compose.ui.text.input.t0 r4 = (androidx.compose.p004ui.text.input.C16321t0) r4
            goto L_0x0385
        L_0x0384:
            r4 = 0
        L_0x0385:
            r10.mo15002m0()
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r10.mo15032w(r5)
            r20 = r5
            androidx.compose.ui.unit.d r20 = (androidx.compose.p004ui.unit.C16479d) r20
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71013k()
            java.lang.Object r5 = r10.mo15032w(r5)
            androidx.compose.ui.text.font.u$b r5 = (androidx.compose.p004ui.text.font.C16242u.C16244b) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.m12954c()
            java.lang.Object r6 = r10.mo15032w(r6)
            androidx.compose.foundation.text.selection.t r6 = (androidx.compose.foundation.text.selection.C2844t) r6
            long r16 = r6.mo9906a()
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71012j()
            java.lang.Object r6 = r10.mo15032w(r6)
            androidx.compose.ui.focus.j r6 = (androidx.compose.p004ui.focus.C15068j) r6
            r0 = 1
            if (r9 != r0) goto L_0x03c3
            if (r25 != 0) goto L_0x03c3
            boolean r0 = r8.mo47299h()
            if (r0 == 0) goto L_0x03c3
            r0 = 1
            goto L_0x03c4
        L_0x03c3:
            r0 = 0
        L_0x03c4:
            if (r0 == 0) goto L_0x03c9
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x03cb
        L_0x03c9:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x03cb:
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r11 = 0
            r13[r11] = r0
            androidx.compose.foundation.text.TextFieldScrollerPosition$a r11 = androidx.compose.foundation.text.TextFieldScrollerPosition.f7214f
            androidx.compose.runtime.saveable.e r11 = r11.mo9426a()
            r19 = 0
            r29 = r15
            r15 = 1157296644(0x44faf204, float:2007.563)
            r10.mo14918M(r15)
            boolean r15 = r10.mo15006n0(r0)
            r60 = r9
            java.lang.Object r9 = r10.mo14921N()
            if (r15 != 0) goto L_0x03f3
            java.lang.Object r15 = r3.mo16277a()
            if (r9 != r15) goto L_0x03fb
        L_0x03f3:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 r9 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            r9.<init>(r0)
            r10.mo14893C(r9)
        L_0x03fb:
            r10.mo15002m0()
            r0 = r9
            kotlin.jvm.functions.a r0 = (kotlin.jvm.functions.C11289a) r0
            r9 = 72
            r15 = 4
            r47 = r13
            r48 = r11
            r49 = r19
            r50 = r0
            r51 = r10
            r52 = r9
            r53 = r15
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r47, r48, r49, r50, r51, r52, r53)
            r9 = r0
            androidx.compose.foundation.text.TextFieldScrollerPosition r9 = (androidx.compose.foundation.text.TextFieldScrollerPosition) r9
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.mo14918M(r0)
            r15 = r45
            boolean r0 = r10.mo15006n0(r15)
            boolean r11 = r10.mo15006n0(r14)
            r0 = r0 | r11
            java.lang.Object r11 = r10.mo14921N()
            if (r0 != 0) goto L_0x043a
            java.lang.Object r0 = r3.mo16277a()
            if (r11 != r0) goto L_0x0437
            goto L_0x043a
        L_0x0437:
            r19 = r12
            goto L_0x045e
        L_0x043a:
            androidx.compose.ui.text.d r0 = r45.mo47111f()
            androidx.compose.ui.text.input.z0 r0 = androidx.compose.foundation.text.C2772g0.m12578a(r14, r0)
            androidx.compose.ui.text.n0 r11 = r45.mo47112g()
            if (r11 == 0) goto L_0x0458
            r13 = r12
            long r11 = r11.mo47427r()
            r19 = r13
            androidx.compose.foundation.text.TextFieldDelegate$Companion r13 = androidx.compose.foundation.text.TextFieldDelegate.f7187a
            androidx.compose.ui.text.input.z0 r11 = r13.mo9366a(r11, r0)
            if (r11 != 0) goto L_0x045b
            goto L_0x045a
        L_0x0458:
            r19 = r12
        L_0x045a:
            r11 = r0
        L_0x045b:
            r10.mo14893C(r11)
        L_0x045e:
            r10.mo15002m0()
            r0 = r11
            androidx.compose.ui.text.input.z0 r0 = (androidx.compose.p004ui.text.input.C16334z0) r0
            androidx.compose.ui.text.d r11 = r0.mo47343b()
            androidx.compose.ui.text.input.c0 r13 = r0.mo47342a()
            r32 = r9
            r12 = 0
            androidx.compose.runtime.m1 r9 = androidx.compose.runtime.ComposablesKt.m29518m(r10, r12)
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r12)
            java.lang.Object r12 = r10.mo14921N()
            r33 = r2
            java.lang.Object r2 = r3.mo16277a()
            if (r12 != r2) goto L_0x04b6
            androidx.compose.foundation.text.TextFieldState r12 = new androidx.compose.foundation.text.TextFieldState
            androidx.compose.foundation.text.r r2 = new androidx.compose.foundation.text.r
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 300(0x12c, float:4.2E-43)
            r39 = 0
            r47 = r2
            r48 = r11
            r49 = r21
            r50 = r34
            r51 = r35
            r52 = r25
            r53 = r36
            r54 = r20
            r55 = r5
            r56 = r37
            r57 = r38
            r58 = r39
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r12.<init>(r2, r9)
            r10.mo14893C(r12)
        L_0x04b6:
            r10.mo15002m0()
            r9 = r12
            androidx.compose.foundation.text.TextFieldState r9 = (androidx.compose.foundation.text.TextFieldState) r9
            androidx.compose.ui.text.d r2 = r45.mo47111f()
            r47 = r9
            r48 = r2
            r49 = r11
            r50 = r21
            r51 = r25
            r52 = r20
            r53 = r5
            r54 = r46
            r55 = r27
            r56 = r6
            r57 = r16
            r47.mo9438G(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            androidx.compose.ui.text.input.EditProcessor r2 = r9.mo9447k()
            androidx.compose.ui.text.input.y0 r5 = r9.mo9441e()
            r2.mo47080f(r15, r5)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r2)
            java.lang.Object r2 = r10.mo14921N()
            java.lang.Object r5 = r3.mo16277a()
            if (r2 != r5) goto L_0x04ff
            androidx.compose.foundation.text.c0 r2 = new androidx.compose.foundation.text.c0
            r5 = 0
            r11 = 0
            r12 = 1
            r2.<init>(r11, r12, r5)
            r10.mo14893C(r2)
        L_0x04ff:
            r10.mo15002m0()
            androidx.compose.foundation.text.c0 r2 = (androidx.compose.foundation.text.C2763c0) r2
            r11 = 0
            r5 = 2
            r16 = 0
            r47 = r2
            r48 = r45
            r49 = r11
            r51 = r5
            r52 = r16
            androidx.compose.foundation.text.C2763c0.m12557g(r47, r48, r49, r51, r52)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r5)
            java.lang.Object r5 = r10.mo14921N()
            java.lang.Object r11 = r3.mo16277a()
            if (r5 != r11) goto L_0x052e
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager
            r5.<init>(r2)
            r10.mo14893C(r5)
        L_0x052e:
            r10.mo15002m0()
            r12 = r5
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r12 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r12
            r12.mo9753Y(r13)
            r12.mo9758d0(r14)
            kotlin.jvm.functions.l r5 = r9.mo9446j()
            r12.mo9754Z(r5)
            r12.mo9755a0(r9)
            r12.mo9757c0(r15)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71010h()
            java.lang.Object r5 = r10.mo15032w(r5)
            androidx.compose.ui.platform.k0 r5 = (androidx.compose.p004ui.platform.C15912k0) r5
            r12.mo9746R(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71023u()
            java.lang.Object r5 = r10.mo15032w(r5)
            androidx.compose.ui.platform.x3 r5 = (androidx.compose.p004ui.platform.C15996x3) r5
            r12.mo9756b0(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71016n()
            java.lang.Object r5 = r10.mo15032w(r5)
            androidx.compose.ui.hapticfeedback.a r5 = (androidx.compose.p004ui.hapticfeedback.C15425a) r5
            r12.mo9752X(r5)
            r12.mo9750V(r1)
            r5 = r30 ^ 1
            r12.mo9749U(r5)
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.mo14918M(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r5)
            java.lang.Object r5 = r10.mo14921N()
            java.lang.Object r11 = r3.mo16277a()
            if (r5 != r11) goto L_0x059b
            kotlin.coroutines.EmptyCoroutineContext r5 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r5 = androidx.compose.runtime.EffectsKt.m29901m(r5, r10)
            androidx.compose.runtime.w r11 = new androidx.compose.runtime.w
            r11.<init>(r5)
            r10.mo14893C(r11)
            r5 = r11
        L_0x059b:
            r10.mo15002m0()
            androidx.compose.runtime.w r5 = (androidx.compose.runtime.C8690w) r5
            kotlinx.coroutines.o0 r5 = r5.mo16831a()
            r10.mo15002m0()
            r11 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r11)
            java.lang.Object r11 = r10.mo14921N()
            java.lang.Object r3 = r3.mo16277a()
            if (r11 != r3) goto L_0x05be
            androidx.compose.foundation.relocation.d r11 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.m12020a()
            r10.mo14893C(r11)
        L_0x05be:
            r10.mo15002m0()
            r16 = r11
            androidx.compose.foundation.relocation.d r16 = (androidx.compose.foundation.relocation.C2672d) r16
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1 r11 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
            r47 = r11
            r48 = r9
            r49 = r4
            r50 = r45
            r51 = r8
            r52 = r13
            r53 = r12
            r54 = r5
            r55 = r16
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55)
            r5 = r19
            androidx.compose.ui.m r11 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.m12403c(r3, r7, r1, r5, r11)
            r58 = r6
            r6 = -55008430(0xfffffffffcb8a352, float:-7.669561E36)
            r10.mo14918M(r6)
            r6 = 8
            if (r7 == 0) goto L_0x05fd
            if (r30 != 0) goto L_0x05fd
            r59 = r11
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2 r11 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
            r11.<init>(r9)
            androidx.compose.runtime.EffectsKt.m29891c(r9, r11, r10, r6)
            goto L_0x05ff
        L_0x05fd:
            r59 = r11
        L_0x05ff:
            r10.mo15002m0()
            boolean r11 = androidx.compose.foundation.text.C2761b0.m12554a()
            if (r11 == 0) goto L_0x0631
            androidx.compose.foundation.text.t r11 = r12.mo9737I()
            androidx.compose.ui.m r11 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.m12401a(r3, r11, r7)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
            r47 = r6
            r48 = r9
            r49 = r1
            r50 = r30
            r51 = r12
            r52 = r13
            r47.<init>(r48, r49, r50, r51, r52)
            androidx.compose.ui.m r6 = androidx.compose.foundation.text.TextFieldPressGestureFilterKt.m12437a(r3, r5, r7, r6)
            androidx.compose.ui.m r6 = r6.mo17224k3(r11)
            r61 = r2
            r18 = r4
            r19 = r5
            r4 = 0
            goto L_0x064a
        L_0x0631:
            androidx.compose.foundation.text.selection.e r6 = r12.mo9732D()
            androidx.compose.ui.m r6 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.m12402b(r3, r6, r7)
            androidx.compose.ui.input.pointer.s r11 = androidx.compose.foundation.text.C2759a0.m12548a()
            r61 = r2
            r18 = r4
            r19 = r5
            r2 = 0
            r4 = 0
            r5 = 2
            androidx.compose.ui.m r6 = androidx.compose.p004ui.input.pointer.PointerIconKt.m68353b(r6, r11, r4, r5, r2)
        L_0x064a:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1 r2 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
            r2.<init>(r9, r15, r13)
            androidx.compose.ui.m r11 = androidx.compose.p004ui.draw.DrawModifierKt.m32436a(r3, r2)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1 r2 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
            r47 = r2
            r48 = r9
            r49 = r7
            r50 = r12
            r51 = r45
            r52 = r13
            r47.<init>(r48, r49, r50, r51, r52)
            androidx.compose.ui.m r28 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r3, r2)
            boolean r2 = r14 instanceof androidx.compose.p004ui.text.input.C16288e0
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1 r5 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
            r47 = r5
            r48 = r8
            r49 = r0
            r50 = r45
            r51 = r7
            r52 = r2
            r53 = r30
            r54 = r9
            r55 = r13
            r56 = r12
            r57 = r1
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r0 = 1
            androidx.compose.ui.m r1 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r3, r0, r5)
            if (r7 == 0) goto L_0x0690
            if (r30 != 0) goto L_0x0690
            r0 = 1
            goto L_0x0691
        L_0x0690:
            r0 = r4
        L_0x0691:
            r47 = r3
            r48 = r9
            r49 = r45
            r50 = r13
            r51 = r24
            r52 = r0
            androidx.compose.ui.m r34 = androidx.compose.foundation.text.TextFieldCursorKt.m12375b(r47, r48, r49, r50, r51, r52)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
            r0.<init>(r12)
            r2 = 8
            androidx.compose.runtime.EffectsKt.m29891c(r12, r0, r10, r2)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
            r2 = r18
            r0.<init>(r2, r9, r15, r8)
            int r2 = r33 >> 3
            r2 = r2 & 14
            androidx.compose.runtime.EffectsKt.m29891c(r8, r0, r10, r2)
            kotlin.jvm.functions.l r0 = r9.mo9446j()
            r2 = r30 ^ 1
            r5 = r60
            r15 = 1
            if (r5 != r15) goto L_0x06c7
            r17 = r15
            goto L_0x06c9
        L_0x06c7:
            r17 = r4
        L_0x06c9:
            r47 = r3
            r48 = r9
            r49 = r12
            r50 = r45
            r51 = r0
            r52 = r2
            r53 = r17
            r54 = r13
            r55 = r61
            androidx.compose.ui.m r0 = androidx.compose.foundation.text.TextFieldKeyInputKt.m12432a(r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r2 = r59
            r15 = r29
            androidx.compose.ui.m r2 = r15.mo17224k3(r2)
            r4 = r58
            androidx.compose.ui.m r2 = androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.m12399a(r2, r9, r4)
            androidx.compose.ui.m r2 = m12260o(r2, r9, r12)
            androidx.compose.ui.m r0 = r2.mo17224k3(r0)
            r2 = r19
            r4 = r32
            androidx.compose.ui.m r0 = androidx.compose.foundation.text.TextFieldScrollKt.m12448d(r0, r4, r2, r7)
            androidx.compose.ui.m r0 = r0.mo17224k3(r6)
            androidx.compose.ui.m r0 = r0.mo17224k3(r1)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 r1 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            r1.<init>(r9)
            androidx.compose.ui.m r6 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r0, r1)
            if (r7 == 0) goto L_0x071f
            boolean r0 = r9.mo9440d()
            if (r0 == 0) goto L_0x071f
            boolean r0 = androidx.compose.foundation.text.C2761b0.m12554a()
            if (r0 == 0) goto L_0x071f
            r18 = 1
            goto L_0x0721
        L_0x071f:
            r18 = 0
        L_0x0721:
            if (r18 == 0) goto L_0x072a
            androidx.compose.ui.m r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.m12942b(r3, r12)
            r17 = r0
            goto L_0x072c
        L_0x072a:
            r17 = r3
        L_0x072c:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5 r3 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
            r0 = r3
            r1 = r31
            r19 = r2
            r2 = r33
            r40 = r3
            r3 = r9
            r9 = r4
            r4 = r21
            r29 = r19
            r19 = r5
            r5 = r26
            r41 = r6
            r6 = r19
            r32 = r7
            r7 = r9
            r33 = r8
            r8 = r45
            r35 = r19
            r9 = r14
            r42 = r10
            r10 = r34
            r47 = r12
            r12 = r28
            r19 = r13
            r13 = r17
            r22 = r14
            r14 = r16
            r28 = r15
            r15 = r47
            r16 = r18
            r17 = r30
            r18 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = -374338080(0xffffffffe9b00de0, float:-2.6604558E25)
            r2 = r40
            r1 = r42
            r3 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r0, r3, r2)
            r2 = 448(0x1c0, float:6.28E-43)
            r5 = r47
            r3 = r41
            m12247b(r3, r5, r0, r1, r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x078a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x078a:
            r4 = r21
            r5 = r22
            r6 = r23
            r8 = r24
            r9 = r25
            r11 = r26
            r13 = r27
            r3 = r28
            r7 = r29
            r15 = r30
            r16 = r31
            r14 = r32
            r12 = r33
            r10 = r35
        L_0x07a6:
            androidx.compose.runtime.t1 r2 = r1.mo15020s()
            if (r2 != 0) goto L_0x07ad
            goto L_0x07c8
        L_0x07ad:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6 r1 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
            r0 = r1
            r43 = r1
            r1 = r45
            r44 = r2
            r2 = r46
            r17 = r62
            r18 = r63
            r19 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r43
            r0 = r44
            r0.mo15202a(r1)
        L_0x07c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.m12246a(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.l, androidx.compose.ui.m, androidx.compose.ui.text.p0, androidx.compose.ui.text.input.a1, kotlin.jvm.functions.l, androidx.compose.foundation.interaction.g, androidx.compose.ui.graphics.z1, boolean, int, int, androidx.compose.ui.text.input.q, androidx.compose.foundation.text.k, boolean, boolean, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m12247b(C8767m mVar, TextFieldSelectionManager textFieldSelectionManager, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-20551815);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:663)");
        }
        int i2 = (i & 14) | C22132b.f56831b;
        o.mo14918M(733328855);
        int i3 = i2 >> 3;
        C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), true, o, (i3 & 112) | (i3 & 14));
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
        int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i4 >> 3) & 112));
        o.mo14918M(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
        ContextMenu_androidKt.m12245b(textFieldSelectionManager, pVar, o, ((i >> 3) & 112) | 8);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CoreTextFieldKt$CoreTextFieldRootBox$2(mVar, textFieldSelectionManager, pVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m12248c(TextFieldSelectionManager textFieldSelectionManager, boolean z, C8592o oVar, int i) {
        boolean z2;
        C2851y g;
        C16260h0 i2;
        boolean z3;
        C8592o o = oVar.mo15009o(626339208);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:991)");
        }
        if (z) {
            TextFieldState G = textFieldSelectionManager.mo9735G();
            C16260h0 h0Var = null;
            boolean z4 = true;
            if (!(G == null || (g = G.mo9443g()) == null || (i2 = g.mo9930i()) == null)) {
                TextFieldState G2 = textFieldSelectionManager.mo9735G();
                if (G2 != null) {
                    z3 = G2.mo9456t();
                } else {
                    z3 = true;
                }
                if (!z3) {
                    h0Var = i2;
                }
            }
            if (h0Var != null) {
                if (!C16356n0.m73736h(textFieldSelectionManager.mo9739K().mo47113h())) {
                    int b = textFieldSelectionManager.mo9733E().mo9514b(C16356n0.m73742n(textFieldSelectionManager.mo9739K().mo47113h()));
                    int b2 = textFieldSelectionManager.mo9733E().mo9514b(C16356n0.m73737i(textFieldSelectionManager.mo9739K().mo47113h()));
                    ResolvedTextDirection c = h0Var.mo47047c(b);
                    ResolvedTextDirection c2 = h0Var.mo47047c(Math.max(b2 - 1, 0));
                    o.mo14918M(-498391544);
                    TextFieldState G3 = textFieldSelectionManager.mo9735G();
                    if (G3 == null || !G3.mo9453q()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        TextFieldSelectionManagerKt.m12937a(true, c, textFieldSelectionManager, o, 518);
                    }
                    o.mo15002m0();
                    TextFieldState G4 = textFieldSelectionManager.mo9735G();
                    if (G4 == null || !G4.mo9452p()) {
                        z4 = false;
                    }
                    if (z4) {
                        TextFieldSelectionManagerKt.m12937a(false, c2, textFieldSelectionManager, o, 518);
                    }
                }
                TextFieldState G5 = textFieldSelectionManager.mo9735G();
                if (G5 != null) {
                    if (textFieldSelectionManager.mo9743O()) {
                        G5.mo9433B(false);
                    }
                    if (G5.mo9440d()) {
                        if (G5.mo9451o()) {
                            textFieldSelectionManager.mo9759e0();
                        } else {
                            textFieldSelectionManager.mo9742N();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.mo9742N();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, z, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m12249d(@C12579k TextFieldSelectionManager textFieldSelectionManager, @C12580l C8592o oVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "manager");
        C8592o o = oVar.mo15009o(-1436003720);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1034)");
        }
        TextFieldState G = textFieldSelectionManager.mo9735G();
        if (G == null || !G.mo9450n()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(textFieldSelectionManager);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = textFieldSelectionManager.mo9764o();
                o.mo14893C(N);
            }
            o.mo15002m0();
            C2846t tVar = (C2846t) N;
            long x = textFieldSelectionManager.mo9772x((C16479d) o.mo15032w(CompositionLocalsKt.m71011i()));
            C8767m c = SuspendingPointerInputFilterKt.m68437c(C8767m.f23478j, tVar, new CoreTextFieldKt$TextFieldCursorHandle$1(tVar, (C11045c<? super CoreTextFieldKt$TextFieldCursorHandle$1>) null));
            C15094f d = C15094f.m64868d(x);
            o.mo14918M(1157296644);
            boolean n02 = o.mo15006n0(d);
            Object N2 = o.mo14921N();
            if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                N2 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(x);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            AndroidCursorHandle_androidKt.m12180a(x, SemanticsModifierKt.m71868c(c, false, (C11300l) N2, 1, (Object) null), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, o, C22132b.f56831b);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CoreTextFieldKt$TextFieldCursorHandle$3(textFieldSelectionManager, i));
        }
    }

    @C12580l
    /* renamed from: k */
    public static final Object m12256k(@C12579k C2672d dVar, @C12579k TextFieldValue textFieldValue, @C12579k C2785r rVar, @C12579k C16260h0 h0Var, @C12579k C16281c0 c0Var, @C12579k C11045c<? super C11079d2> cVar) {
        C15098i iVar;
        int b = c0Var.mo9514b(C16356n0.m73739k(textFieldValue.mo47113h()));
        if (b < h0Var.mo47058l().mo47040n().length()) {
            iVar = h0Var.mo47048d(b);
        } else if (b != 0) {
            iVar = h0Var.mo47048d(b - 1);
        } else {
            iVar = new C15098i(0.0f, 0.0f, 1.0f, (float) C16500q.m74659j(C2847u.m13130b(rVar.mo9578m(), rVar.mo9566a(), rVar.mo9567b(), (String) null, 0, 24, (Object) null)));
        }
        Object b2 = dVar.mo9125b(iVar, cVar);
        if (b2 == C11063b.m42612h()) {
            return b2;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: l */
    public static final void m12257l(TextFieldState textFieldState, TextFieldValue textFieldValue, C16281c0 c0Var) {
        C8646f p;
        C8646f a = C8646f.f23196e.mo16621a();
        try {
            p = a.mo16617p();
            C2851y g = textFieldState.mo9443g();
            if (g == null) {
                a.mo16619w(p);
                a.mo16415d();
                return;
            }
            C16331y0 e = textFieldState.mo9441e();
            if (e == null) {
                a.mo16619w(p);
                a.mo16415d();
                return;
            }
            C15588o f = textFieldState.mo9442f();
            if (f == null) {
                a.mo16619w(p);
                a.mo16415d();
                return;
            }
            TextFieldDelegate.f7187a.mo9369e(textFieldValue, textFieldState.mo9454r(), g.mo9930i(), f, e, textFieldState.mo9440d(), c0Var);
            C11079d2 d2Var = C11079d2.f28267a;
            a.mo16619w(p);
            a.mo16415d();
        } catch (Throwable th) {
            a.mo16415d();
            throw th;
        }
    }

    /* renamed from: m */
    public static final void m12258m(C16321t0 t0Var, TextFieldState textFieldState, TextFieldValue textFieldValue, C16313q qVar, C16281c0 c0Var) {
        if (textFieldState.mo9440d()) {
            textFieldState.mo9459w(TextFieldDelegate.f7187a.mo9372h(t0Var, textFieldValue, textFieldState.mo9447k(), qVar, textFieldState.mo9446j(), textFieldState.mo9445i()));
            m12257l(textFieldState, textFieldValue, c0Var);
            return;
        }
        m12259n(textFieldState);
    }

    /* renamed from: n */
    public static final void m12259n(TextFieldState textFieldState) {
        C16331y0 e = textFieldState.mo9441e();
        if (e != null) {
            TextFieldDelegate.f7187a.mo9370f(e, textFieldState.mo9447k(), textFieldState.mo9446j());
        }
        textFieldState.mo9459w((C16331y0) null);
    }

    /* renamed from: o */
    public static final C8767m m12260o(C8767m mVar, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return C15441f.m68287b(mVar, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(textFieldState, textFieldSelectionManager));
    }

    /* renamed from: p */
    public static final void m12261p(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        C16331y0 e;
        if (!textFieldState.mo9440d()) {
            focusRequester.mo42129h();
        } else if (z && (e = textFieldState.mo9441e()) != null) {
            e.mo47332f();
        }
    }
}
