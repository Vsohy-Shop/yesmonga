package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,780:1\n76#2:781\n76#2:832\n36#3:782\n36#3:789\n36#3:796\n50#3:816\n49#3:817\n25#3:824\n460#3,13:844\n473#3,3:859\n1057#4,6:783\n1057#4,6:790\n1057#4,6:797\n1057#4,6:818\n1057#4,6:825\n350#5,7:803\n1855#5,2:857\n32#6,6:810\n75#7:831\n76#7,11:833\n89#7:862\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n617#1:781\n709#1:832\n618#1:782\n623#1:789\n624#1:796\n707#1:816\n707#1:817\n718#1:824\n709#1:844,13\n709#1:859,3\n618#1:783,6\n623#1:790,6\n624#1:797,6\n707#1:818,6\n718#1:825,6\n653#1:803,7\n712#1:857,2\n663#1:810,6\n709#1:831\n709#1:833,11\n709#1:862\n*E\n"})
public final class AnimatedContentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: androidx.compose.animation.AnimatedContentScope} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: androidx.compose.animation.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: androidx.compose.animation.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d7  */
    @androidx.compose.animation.C2031i
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void m7631a(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.Transition<S> r23, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.C2024d> r25, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c r26, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super S, ? extends java.lang.Object> r27, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r28, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r8 = r23
            r9 = r28
            r10 = r30
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -114689412(0xfffffffff929fa7c, float:-5.516116E34)
            r1 = r29
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r31 & r1
            if (r1 == 0) goto L_0x0022
            r1 = r10 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r11.mo15006n0(r8)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r10
            goto L_0x0032
        L_0x0031:
            r1 = r10
        L_0x0032:
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r24
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r24
        L_0x004e:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r25
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r6
            goto L_0x006a
        L_0x0068:
            r5 = r25
        L_0x006a:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0084
            r7 = r26
            boolean r12 = r11.mo15006n0(r7)
            if (r12 == 0) goto L_0x0080
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r12
            goto L_0x0086
        L_0x0084:
            r7 = r26
        L_0x0086:
            r12 = r31 & 8
            if (r12 == 0) goto L_0x008d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008d:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00a2
            r13 = r27
            boolean r14 = r11.mo15006n0(r13)
            if (r14 == 0) goto L_0x009e
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r14
            goto L_0x00a4
        L_0x00a2:
            r13 = r27
        L_0x00a4:
            r14 = r31 & 16
            if (r14 == 0) goto L_0x00ac
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00aa:
            r1 = r1 | r14
            goto L_0x00bd
        L_0x00ac:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00bd
            boolean r14 = r11.mo15006n0(r9)
            if (r14 == 0) goto L_0x00ba
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00ba:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00aa
        L_0x00bd:
            r14 = r1
            r1 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r1 & r14
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r15) goto L_0x00d7
            boolean r1 = r11.mo15011p()
            if (r1 != 0) goto L_0x00ce
            goto L_0x00d7
        L_0x00ce:
            r11.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r13
            goto L_0x03c1
        L_0x00d7:
            if (r2 == 0) goto L_0x00dd
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r1
            goto L_0x00de
        L_0x00dd:
            r15 = r3
        L_0x00de:
            if (r4 == 0) goto L_0x00e3
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5 r1 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$5.f5178f
            r5 = r1
        L_0x00e3:
            if (r6 == 0) goto L_0x00ec
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r1 = r1.mo17061C()
            r7 = r1
        L_0x00ec:
            if (r12 == 0) goto L_0x00f1
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$6 r1 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$6.f5179f
            r13 = r1
        L_0x00f1:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            r2 = -1
            if (r1 == 0) goto L_0x00fd
            java.lang.String r1 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:605)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r2, r1)
        L_0x00fd:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r11.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p004ui.unit.LayoutDirection) r0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r1)
            boolean r3 = r11.mo15006n0(r8)
            java.lang.Object r4 = r11.mo14921N()
            if (r3 != 0) goto L_0x011f
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0127
        L_0x011f:
            androidx.compose.animation.AnimatedContentScope r4 = new androidx.compose.animation.AnimatedContentScope
            r4.<init>(r8, r7, r0)
            r11.mo14893C(r4)
        L_0x0127:
            r11.mo15002m0()
            r12 = r4
            androidx.compose.animation.AnimatedContentScope r12 = (androidx.compose.animation.AnimatedContentScope) r12
            r11.mo14918M(r1)
            boolean r3 = r11.mo15006n0(r8)
            java.lang.Object r4 = r11.mo14921N()
            r6 = 0
            r2 = 1
            if (r3 != 0) goto L_0x0144
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0153
        L_0x0144:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r4 = r23.mo6700h()
            r3[r6] = r4
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = androidx.compose.runtime.C8415c2.m30238g(r3)
            r11.mo14893C(r4)
        L_0x0153:
            r11.mo15002m0()
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = (androidx.compose.runtime.snapshots.SnapshotStateList) r4
            r11.mo14918M(r1)
            boolean r1 = r11.mo15006n0(r8)
            java.lang.Object r3 = r11.mo14921N()
            if (r1 != 0) goto L_0x016d
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r3 != r1) goto L_0x0175
        L_0x016d:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r11.mo14893C(r3)
        L_0x0175:
            r11.mo15002m0()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r23.mo6700h()
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x018e
            r4.clear()
            java.lang.Object r1 = r23.mo6700h()
            r4.add(r1)
        L_0x018e:
            java.lang.Object r1 = r23.mo6700h()
            java.lang.Object r6 = r23.mo6706o()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r6)
            if (r1 == 0) goto L_0x01d4
            int r1 = r4.size()
            if (r1 != r2) goto L_0x01b1
            r6 = 0
            java.lang.Object r1 = r4.get(r6)
            java.lang.Object r6 = r23.mo6700h()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r6)
            if (r1 != 0) goto L_0x01bb
        L_0x01b1:
            r4.clear()
            java.lang.Object r1 = r23.mo6700h()
            r4.add(r1)
        L_0x01bb:
            int r1 = r3.size()
            if (r1 != r2) goto L_0x01cb
            java.lang.Object r1 = r23.mo6700h()
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x01ce
        L_0x01cb:
            r3.clear()
        L_0x01ce:
            r12.mo6423u(r7)
            r12.mo6424v(r0)
        L_0x01d4:
            java.lang.Object r0 = r23.mo6700h()
            java.lang.Object r1 = r23.mo6706o()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0226
            java.lang.Object r0 = r23.mo6706o()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0226
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        L_0x01f1:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r0.next()
            java.lang.Object r6 = r13.invoke(r6)
            java.lang.Object r2 = r23.mo6706o()
            java.lang.Object r2 = r13.invoke(r2)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x020f
            r0 = -1
            goto L_0x0215
        L_0x020f:
            int r1 = r1 + 1
            r2 = 1
            goto L_0x01f1
        L_0x0213:
            r0 = -1
            r1 = -1
        L_0x0215:
            if (r1 != r0) goto L_0x021f
            java.lang.Object r0 = r23.mo6706o()
            r4.add(r0)
            goto L_0x0226
        L_0x021f:
            java.lang.Object r0 = r23.mo6706o()
            r4.set(r1, r0)
        L_0x0226:
            java.lang.Object r0 = r23.mo6706o()
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x0244
            java.lang.Object r0 = r23.mo6700h()
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x023b
            goto L_0x0244
        L_0x023b:
            r18 = r4
            r19 = r5
            r22 = r7
            r21 = 0
            goto L_0x0292
        L_0x0244:
            r3.clear()
            int r6 = r4.size()
            r2 = 0
        L_0x024c:
            if (r2 >= r6) goto L_0x023b
            java.lang.Object r1 = r4.get(r2)
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$7$1 r0 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$7$1
            r24 = r0
            r27 = r1
            r1 = r23
            r16 = r2
            r8 = 1
            r2 = r27
            r17 = r3
            r3 = r14
            r18 = r4
            r4 = r5
            r19 = r5
            r5 = r12
            r20 = r6
            r21 = 0
            r6 = r28
            r22 = r7
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 885640742(0x34c9ce26, float:3.758916E-7)
            r1 = r24
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r0, r8, r1)
            r1 = r27
            r3 = r17
            r3.put(r1, r0)
            int r2 = r16 + 1
            r8 = r23
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r22
            goto L_0x024c
        L_0x0292:
            androidx.compose.animation.core.Transition$b r0 = r23.mo6704m()
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo14918M(r1)
            boolean r1 = r11.mo15006n0(r12)
            boolean r0 = r11.mo15006n0(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r11.mo14921N()
            if (r0 != 0) goto L_0x02b8
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x02b4
            goto L_0x02b8
        L_0x02b4:
            r0 = r1
            r1 = r19
            goto L_0x02c3
        L_0x02b8:
            r1 = r19
            java.lang.Object r0 = r1.invoke(r12)
            androidx.compose.animation.d r0 = (androidx.compose.animation.C2024d) r0
            r11.mo14893C(r0)
        L_0x02c3:
            r11.mo15002m0()
            androidx.compose.animation.d r0 = (androidx.compose.animation.C2024d) r0
            r2 = 72
            androidx.compose.ui.m r0 = r12.mo6412h(r0, r11, r2)
            androidx.compose.ui.m r0 = r15.mo17224k3(r0)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r2)
            java.lang.Object r2 = r11.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r2 != r4) goto L_0x02ec
            androidx.compose.animation.AnimatedContentMeasurePolicy r2 = new androidx.compose.animation.AnimatedContentMeasurePolicy
            r2.<init>(r12)
            r11.mo14893C(r2)
        L_0x02ec:
            r11.mo15002m0()
            androidx.compose.animation.AnimatedContentMeasurePolicy r2 = (androidx.compose.animation.AnimatedContentMeasurePolicy) r2
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r11.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r11.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r11.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r7.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r12 = r11.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x032a
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x032a:
            r11.mo14938T()
            boolean r12 = r11.mo14997l()
            if (r12 == 0) goto L_0x0337
            r11.mo14947W(r8)
            goto L_0x033a
        L_0x0337:
            r11.mo14888A()
        L_0x033a:
            r11.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r11)
            kotlin.jvm.functions.p r12 = r7.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r2, r12)
            kotlin.jvm.functions.p r2 = r7.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r2)
            kotlin.jvm.functions.p r2 = r7.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r2)
            kotlin.jvm.functions.p r2 = r7.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r2)
            r11.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r11)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r0.invoke(r2, r11, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.mo14918M(r0)
            r0 = -441512234(0xffffffffe5af0ed6, float:-1.0333598E23)
            r11.mo14918M(r0)
            java.util.Iterator r0 = r18.iterator()
        L_0x037f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x03a7
            java.lang.Object r2 = r0.next()
            r4 = -1739564366(0xffffffff98505ab2, float:-2.692916E-24)
            java.lang.Object r5 = r13.invoke(r2)
            r11.mo14933R(r4, r5)
            java.lang.Object r2 = r3.get(r2)
            kotlin.jvm.functions.p r2 = (kotlin.jvm.functions.C11304p) r2
            if (r2 != 0) goto L_0x039c
            goto L_0x03a3
        L_0x039c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r2.invoke(r11, r4)
        L_0x03a3:
            r11.mo14998l0()
            goto L_0x037f
        L_0x03a7:
            r11.mo15002m0()
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03bc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03bc:
            r3 = r1
            r5 = r13
            r2 = r15
            r4 = r22
        L_0x03c1:
            androidx.compose.runtime.t1 r11 = r11.mo15020s()
            if (r11 != 0) goto L_0x03c8
            goto L_0x03d9
        L_0x03c8:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$10 r12 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$10
            r0 = r12
            r1 = r23
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.mo15202a(r12)
        L_0x03d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.m7631a(androidx.compose.animation.core.Transition, androidx.compose.ui.m, kotlin.jvm.functions.l, androidx.compose.ui.c, kotlin.jvm.functions.l, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.animation.C2031i
    @androidx.compose.runtime.C8540g
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void m7632b(S r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.C2024d> r20, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c r21, @org.jetbrains.annotations.C12580l java.lang.String r22, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11306r<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r23, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r24, int r25, int r26) {
        /*
            r1 = r18
            r11 = r23
            r12 = r25
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -802295584(0xffffffffd02df0e0, float:-1.16729774E10)
            r2 = r24
            androidx.compose.runtime.o r13 = r2.mo15009o(r0)
            r2 = r26 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r12 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r13.mo15006n0(r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r12
            goto L_0x002b
        L_0x002a:
            r2 = r12
        L_0x002b:
            r3 = r26 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r19
            boolean r5 = r13.mo15006n0(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r2 = r2 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r19
        L_0x0047:
            r5 = r26 & 4
            if (r5 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r20
            boolean r7 = r13.mo15006n0(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r2 = r2 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r20
        L_0x0063:
            r7 = r26 & 8
            if (r7 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r21
            boolean r9 = r13.mo15006n0(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r9
            goto L_0x007f
        L_0x007d:
            r8 = r21
        L_0x007f:
            r9 = r26 & 16
            if (r9 == 0) goto L_0x0086
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r12
            if (r10 != 0) goto L_0x009b
            r10 = r22
            boolean r14 = r13.mo15006n0(r10)
            if (r14 == 0) goto L_0x0097
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r2 = r2 | r14
            goto L_0x009d
        L_0x009b:
            r10 = r22
        L_0x009d:
            r14 = r26 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a7
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a5:
            r2 = r2 | r14
            goto L_0x00b7
        L_0x00a7:
            r14 = r12 & r15
            if (r14 != 0) goto L_0x00b7
            boolean r14 = r13.mo15006n0(r11)
            if (r14 == 0) goto L_0x00b4
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a5
        L_0x00b4:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a5
        L_0x00b7:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r2
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d0
            boolean r14 = r13.mo15011p()
            if (r14 != 0) goto L_0x00c7
            goto L_0x00d0
        L_0x00c7:
            r13.mo14958a0()
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r10
            goto L_0x0137
        L_0x00d0:
            if (r3 == 0) goto L_0x00d6
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r14 = r3
            goto L_0x00d7
        L_0x00d6:
            r14 = r4
        L_0x00d7:
            if (r5 == 0) goto L_0x00dd
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$1 r3 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$1.f5176f
            r15 = r3
            goto L_0x00de
        L_0x00dd:
            r15 = r6
        L_0x00de:
            if (r7 == 0) goto L_0x00e9
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r3 = r3.mo17061C()
            r16 = r3
            goto L_0x00eb
        L_0x00e9:
            r16 = r8
        L_0x00eb:
            if (r9 == 0) goto L_0x00f0
            java.lang.String r3 = "AnimatedContent"
            r10 = r3
        L_0x00f0:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x00fc
            r3 = -1
            java.lang.String r4 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:120)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r3, r4)
        L_0x00fc:
            r0 = r2 & 8
            r3 = r2 & 14
            r0 = r0 | r3
            int r3 = r2 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m8196o(r1, r10, r13, r0, r3)
            r6 = 0
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = r2 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r9 = r3 | r2
            r17 = 8
            r2 = r0
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r23
            r8 = r13
            r0 = r10
            r10 = r17
            m7631a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0132
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0132:
            r5 = r0
            r2 = r14
            r3 = r15
            r4 = r16
        L_0x0137:
            androidx.compose.runtime.t1 r9 = r13.mo15020s()
            if (r9 != 0) goto L_0x013e
            goto L_0x014f
        L_0x013e:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$2 r10 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
            r0 = r10
            r1 = r18
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.m7632b(java.lang.Object, androidx.compose.ui.m, kotlin.jvm.functions.l, androidx.compose.ui.c, java.lang.String, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.animation.C2031i
    @androidx.compose.runtime.C8540g
    @kotlin.C11395k(level = kotlin.DeprecationLevel.f28051c, message = "AnimatedContent API now has a new label parameter added.")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void m7633c(java.lang.Object r16, androidx.compose.p004ui.C8767m r17, kotlin.jvm.functions.C11300l r18, androidx.compose.p004ui.C8734c r19, kotlin.jvm.functions.C11306r r20, androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r9 = r20
            r10 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 2124549995(0x7ea20f6b, float:1.077075E38)
            r1 = r21
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r23 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r10 | 6
            r12 = r16
            goto L_0x002d
        L_0x001b:
            r1 = r10 & 14
            r12 = r16
            if (r1 != 0) goto L_0x002c
            boolean r1 = r11.mo15006n0(r12)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r10
            goto L_0x002d
        L_0x002c:
            r1 = r10
        L_0x002d:
            r2 = r23 & 2
            if (r2 == 0) goto L_0x0034
            r1 = r1 | 48
            goto L_0x0047
        L_0x0034:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0047
            r3 = r17
            boolean r4 = r11.mo15006n0(r3)
            if (r4 == 0) goto L_0x0043
            r4 = 32
            goto L_0x0045
        L_0x0043:
            r4 = 16
        L_0x0045:
            r1 = r1 | r4
            goto L_0x0049
        L_0x0047:
            r3 = r17
        L_0x0049:
            r4 = r23 & 4
            if (r4 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r18
            boolean r6 = r11.mo15006n0(r5)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r6
            goto L_0x0065
        L_0x0063:
            r5 = r18
        L_0x0065:
            r6 = r23 & 8
            if (r6 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r19
            boolean r8 = r11.mo15006n0(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r8
            goto L_0x0081
        L_0x007f:
            r7 = r19
        L_0x0081:
            r8 = r23 & 16
            if (r8 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009a
        L_0x0088:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r10
            if (r8 != 0) goto L_0x009a
            boolean r8 = r11.mo15006n0(r9)
            if (r8 == 0) goto L_0x0097
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r8
        L_0x009a:
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r1
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r13) goto L_0x00b1
            boolean r8 = r11.mo15011p()
            if (r8 != 0) goto L_0x00a9
            goto L_0x00b1
        L_0x00a9:
            r11.mo14958a0()
            r2 = r3
            r3 = r5
            r4 = r7
            goto L_0x0107
        L_0x00b1:
            if (r2 == 0) goto L_0x00b7
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r13 = r2
            goto L_0x00b8
        L_0x00b7:
            r13 = r3
        L_0x00b8:
            if (r4 == 0) goto L_0x00be
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$3 r2 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$3.f5177f
            r14 = r2
            goto L_0x00bf
        L_0x00be:
            r14 = r5
        L_0x00bf:
            if (r6 == 0) goto L_0x00c9
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r2 = r2.mo17061C()
            r15 = r2
            goto L_0x00ca
        L_0x00c9:
            r15 = r7
        L_0x00ca:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00d6
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:148)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x00d6:
            java.lang.String r4 = "AnimatedContent"
            r0 = r1 & 8
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r1 & 14
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r1 = r1 << 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r7 = r0 | r1
            r8 = 0
            r0 = r16
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r20
            r6 = r11
            m7632b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0104
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0104:
            r2 = r13
            r3 = r14
            r4 = r15
        L_0x0107:
            androidx.compose.runtime.t1 r8 = r11.mo15020s()
            if (r8 != 0) goto L_0x010e
            goto L_0x011f
        L_0x010e:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$4 r11 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$4
            r0 = r11
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r11)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.m7633c(java.lang.Object, androidx.compose.ui.m, kotlin.jvm.functions.l, androidx.compose.ui.c, kotlin.jvm.functions.r, androidx.compose.runtime.o, int, int):void");
    }

    @C2031i
    @C12579k
    /* renamed from: d */
    public static final C2041q m7634d(boolean z, @C12579k C11304p<? super C16500q, ? super C16500q, ? extends C1956d0<C16500q>> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "sizeAnimationSpec");
        return new C2042r(z, pVar);
    }

    /* renamed from: e */
    public static /* synthetic */ C2041q m7635e(boolean z, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pVar = AnimatedContentKt$SizeTransform$1.f5183f;
        }
        return m7634d(z, pVar);
    }

    @C2031i
    @C12579k
    /* renamed from: f */
    public static final C2024d m7636f(@C12579k C2025e eVar, @C12579k C2028g gVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(gVar, "exit");
        return new C2024d(eVar, gVar, 0.0f, (C2041q) null, 12, (DefaultConstructorMarker) null);
    }
}
