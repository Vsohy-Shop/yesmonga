package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8740a;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,405:1\n25#2:406\n460#2,13:432\n473#2,3:446\n456#2,11:467\n460#2,13:497\n473#2,3:511\n460#2,13:535\n473#2,3:549\n467#2,3:554\n1114#3,6:407\n76#4:413\n76#4:420\n76#4:455\n76#4:485\n76#4:523\n68#5,5:414\n73#5:445\n77#5:450\n67#5,6:478\n73#5:510\n77#5:515\n67#5,6:516\n73#5:548\n77#5:553\n75#6:419\n76#6,11:421\n89#6:449\n71#6,4:451\n75#6,11:456\n75#6:484\n76#6,11:486\n89#6:514\n75#6:522\n76#6,11:524\n89#6:552\n88#6:557\n76#7:558\n154#8:559\n154#8:560\n154#8:561\n154#8:562\n154#8:563\n154#8:564\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n155#1:406\n176#1:432,13\n176#1:446,3\n265#1:467,11\n267#1:497,13\n267#1:511,3\n269#1:535,13\n269#1:549,3\n265#1:554,3\n155#1:407,6\n157#1:413\n176#1:420\n265#1:455\n267#1:485\n269#1:523\n176#1:414,5\n176#1:445\n176#1:450\n267#1:478,6\n267#1:510\n267#1:515\n269#1:516,6\n269#1:548\n269#1:553\n176#1:419\n176#1:421,11\n176#1:449\n265#1:451,4\n265#1:456,11\n267#1:484\n267#1:486,11\n267#1:514\n269#1:522\n269#1:524,11\n269#1:552\n265#1:557\n233#1:558\n379#1:559\n384#1:560\n389#1:561\n395#1:562\n400#1:563\n405#1:564\n*E\n"})
public final class NavigationRailKt {
    @C12579k

    /* renamed from: a */
    public static final C2023z0<Float> f7728a = new C2023z0(300, 0, C1947b0.m8290b(), 2, (DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final float f7729b = C16483g.m74435M((float) 72);

    /* renamed from: c */
    public static final float f7730c = C16483g.m74435M((float) 56);

    /* renamed from: d */
    public static final float f7731d;

    /* renamed from: e */
    public static final float f7732e;

    /* renamed from: f */
    public static final float f7733f = C16483g.m74435M((float) 16);

    /* renamed from: g */
    public static final float f7734g = C16483g.m74435M((float) 14);

    @C11363r0({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRailItemBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n223#2,2:406\n223#2,2:408\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt$NavigationRailItemBaselineLayout$2\n*L\n277#1:406,2\n280#1:408,2\n*E\n"})
    /* renamed from: androidx.compose.material.NavigationRailKt$a */
    public static final class C2966a implements C15560f0 {

        /* renamed from: a */
        public final /* synthetic */ C11304p<C8592o, Integer, C11079d2> f7735a;

        /* renamed from: b */
        public final /* synthetic */ float f7736b;

        public C2966a(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, float f) {
            this.f7735a = pVar;
            this.f7736b = f;
        }

        @C12579k
        /* renamed from: a */
        public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
            C15611w0 w0Var;
            C15568h0 h0Var2 = h0Var;
            List<? extends C15557e0> list2 = list;
            long j2 = j;
            Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
            Intrinsics.checkNotNullParameter(list2, "measurables");
            Iterable<C15557e0> iterable = list2;
            for (C15557e0 e0Var : iterable) {
                if (Intrinsics.areEqual(C15594q.m69317a(e0Var), (Object) "icon")) {
                    C15611w0 t0 = e0Var.mo44324t0(j2);
                    if (this.f7735a != null) {
                        for (C15557e0 e0Var2 : iterable) {
                            if (Intrinsics.areEqual(C15594q.m69317a(e0Var2), (Object) "label")) {
                                w0Var = e0Var2.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    w0Var = null;
                    if (this.f7735a == null) {
                        return NavigationRailKt.m13651m(h0Var, t0, j2);
                    }
                    Intrinsics.checkNotNull(w0Var);
                    return NavigationRailKt.m13652n(h0Var, w0Var, t0, j, this.f7736b);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static {
        float f = (float) 8;
        f7731d = C16483g.m74435M(f);
        f7732e = C16483g.m74435M(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0130  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13639a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r22, long r23, long r25, float r27, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31, int r32) {
        /*
            r8 = r29
            r9 = r31
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1790971523(0x6ac00e83, float:1.1609114E26)
            r1 = r30
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r32 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r9 | 6
            r4 = r3
            r3 = r22
            goto L_0x0030
        L_0x001c:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r22
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r9
            goto L_0x0030
        L_0x002d:
            r3 = r22
            r4 = r9
        L_0x0030:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r32 & 2
            if (r5 != 0) goto L_0x0043
            r5 = r23
            boolean r7 = r1.mo14980g(r5)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0043:
            r5 = r23
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
            goto L_0x004b
        L_0x0049:
            r5 = r23
        L_0x004b:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0062
            r7 = r32 & 4
            r10 = r25
            if (r7 != 0) goto L_0x005e
            boolean r7 = r1.mo14980g(r10)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r7
            goto L_0x0064
        L_0x0062:
            r10 = r25
        L_0x0064:
            r7 = r32 & 8
            if (r7 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006b:
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007e
            r12 = r27
            boolean r13 = r1.mo14968d(r12)
            if (r13 == 0) goto L_0x007a
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r13
            goto L_0x0080
        L_0x007e:
            r12 = r27
        L_0x0080:
            r13 = r32 & 16
            if (r13 == 0) goto L_0x0087
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0087:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x009c
            r14 = r28
            boolean r15 = r1.mo14927P(r14)
            if (r15 == 0) goto L_0x0098
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r15
            goto L_0x009e
        L_0x009c:
            r14 = r28
        L_0x009e:
            r15 = r32 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00a8
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00a6:
            r4 = r4 | r15
            goto L_0x00b8
        L_0x00a8:
            r15 = r9 & r16
            if (r15 != 0) goto L_0x00b8
            boolean r15 = r1.mo14927P(r8)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a6
        L_0x00b8:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r4
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r0) goto L_0x00ce
            boolean r0 = r1.mo15011p()
            if (r0 != 0) goto L_0x00c8
            goto L_0x00ce
        L_0x00c8:
            r1.mo14958a0()
            r7 = r14
            goto L_0x0175
        L_0x00ce:
            r1.mo14930Q()
            r0 = r9 & 1
            r15 = 6
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r1.mo14977f0()
            if (r0 == 0) goto L_0x00dd
            goto L_0x00f2
        L_0x00dd:
            r1.mo14958a0()
            r0 = r32 & 2
            if (r0 == 0) goto L_0x00e6
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e6:
            r0 = r32 & 4
            if (r0 == 0) goto L_0x00ec
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ec:
            r0 = r3
        L_0x00ed:
            r2 = r10
            r7 = r14
        L_0x00ef:
            r10 = r4
            r4 = r12
            goto L_0x0127
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00f8
        L_0x00f7:
            r0 = r3
        L_0x00f8:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x0109
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r1, r15)
            long r2 = r2.mo10975n()
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            r5 = r2
        L_0x0109:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x0118
            int r2 = r4 >> 3
            r2 = r2 & 14
            long r2 = androidx.compose.material.ColorsKt.m13381b(r5, r1, r2)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r10 = r2
        L_0x0118:
            if (r7 == 0) goto L_0x0121
            androidx.compose.material.w0 r2 = androidx.compose.material.C7943w0.f19093a
            float r2 = r2.mo11086a()
            r12 = r2
        L_0x0121:
            if (r13 == 0) goto L_0x00ed
            r2 = 0
            r7 = r2
            r2 = r10
            goto L_0x00ef
        L_0x0127:
            r1.mo14899E()
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x0139
            r11 = -1
            java.lang.String r12 = "androidx.compose.material.NavigationRail (NavigationRail.kt:92)"
            r13 = 1790971523(0x6ac00e83, float:1.1609114E26)
            androidx.compose.runtime.ComposerKt.m29845w0(r13, r10, r11, r12)
        L_0x0139:
            r11 = 0
            r17 = 0
            androidx.compose.material.NavigationRailKt$NavigationRail$1 r12 = new androidx.compose.material.NavigationRailKt$NavigationRail$1
            r12.<init>(r7, r10, r8)
            r13 = -1571506489(0xffffffffa254b6c7, float:-2.882812E-18)
            r14 = 1
            androidx.compose.runtime.internal.a r18 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r13, r14, r12)
            r12 = r10 & 14
            r13 = 1572864(0x180000, float:2.204052E-39)
            r12 = r12 | r13
            int r13 = r10 << 3
            r14 = r13 & 896(0x380, float:1.256E-42)
            r12 = r12 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            int r10 = r10 << r15
            r10 = r10 & r16
            r20 = r12 | r10
            r21 = 18
            r10 = r0
            r12 = r5
            r14 = r2
            r16 = r17
            r17 = r4
            r19 = r1
            androidx.compose.material.SurfaceKt.m13879b(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21)
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x0172
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0172:
            r10 = r2
            r12 = r4
            r3 = r0
        L_0x0175:
            androidx.compose.runtime.t1 r13 = r1.mo15020s()
            if (r13 != 0) goto L_0x017c
            goto L_0x018f
        L_0x017c:
            androidx.compose.material.NavigationRailKt$NavigationRail$2 r14 = new androidx.compose.material.NavigationRailKt$NavigationRail$2
            r0 = r14
            r1 = r3
            r2 = r5
            r4 = r10
            r6 = r12
            r8 = r29
            r9 = r31
            r10 = r32
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r13.mo15202a(r14)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m13639a(androidx.compose.ui.m, long, long, float, kotlin.jvm.functions.q, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0122  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13640b(boolean r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r25, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r27, boolean r28, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, boolean r30, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r31, long r32, long r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r36, int r37, int r38) {
        /*
            r2 = r25
            r3 = r26
            r13 = r37
            r14 = r38
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = -1813548445(0xffffffff93e77263, float:-5.8425392E-27)
            r1 = r36
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r4 = r14 & 1
            if (r4 == 0) goto L_0x0025
            r4 = r13 | 6
            r5 = r4
            r4 = r24
            goto L_0x0039
        L_0x0025:
            r4 = r13 & 14
            if (r4 != 0) goto L_0x0036
            r4 = r24
            boolean r5 = r1.mo14961b(r4)
            if (r5 == 0) goto L_0x0033
            r5 = 4
            goto L_0x0034
        L_0x0033:
            r5 = 2
        L_0x0034:
            r5 = r5 | r13
            goto L_0x0039
        L_0x0036:
            r4 = r24
            r5 = r13
        L_0x0039:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x0040
            r5 = r5 | 48
            goto L_0x0050
        L_0x0040:
            r6 = r13 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0050
            boolean r6 = r1.mo14927P(r2)
            if (r6 == 0) goto L_0x004d
            r6 = 32
            goto L_0x004f
        L_0x004d:
            r6 = 16
        L_0x004f:
            r5 = r5 | r6
        L_0x0050:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x0057
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            boolean r6 = r1.mo14927P(r3)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r5 = r5 | r6
        L_0x0067:
            r6 = r14 & 8
            if (r6 == 0) goto L_0x006e
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r27
            boolean r8 = r1.mo15006n0(r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r5 = r5 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r27
        L_0x0083:
            r8 = r14 & 16
            if (r8 == 0) goto L_0x008a
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008a:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x009f
            r9 = r28
            boolean r10 = r1.mo14961b(r9)
            if (r10 == 0) goto L_0x009b
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r5 = r5 | r10
            goto L_0x00a1
        L_0x009f:
            r9 = r28
        L_0x00a1:
            r10 = r14 & 32
            if (r10 == 0) goto L_0x00a9
            r11 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r11
            goto L_0x00bd
        L_0x00a9:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x00bd
            r11 = r29
            boolean r12 = r1.mo14927P(r11)
            if (r12 == 0) goto L_0x00b9
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r5 = r5 | r12
            goto L_0x00bf
        L_0x00bd:
            r11 = r29
        L_0x00bf:
            r12 = r14 & 64
            if (r12 == 0) goto L_0x00c7
            r15 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r15
            goto L_0x00dc
        L_0x00c7:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r13
            if (r15 != 0) goto L_0x00dc
            r15 = r30
            boolean r16 = r1.mo14961b(r15)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r5 = r5 | r16
            goto L_0x00de
        L_0x00dc:
            r15 = r30
        L_0x00de:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e9
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r2 = r31
            goto L_0x00fe
        L_0x00e9:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            r2 = r31
            if (r17 != 0) goto L_0x00fe
            boolean r17 = r1.mo15006n0(r2)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r5 = r5 | r17
        L_0x00fe:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x011a
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0113
            r2 = r32
            boolean r17 = r1.mo14980g(r2)
            if (r17 == 0) goto L_0x0115
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0113:
            r2 = r32
        L_0x0115:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r5 = r5 | r17
            goto L_0x011c
        L_0x011a:
            r2 = r32
        L_0x011c:
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x0138
            r2 = r14 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0131
            r2 = r34
            boolean r17 = r1.mo14980g(r2)
            if (r17 == 0) goto L_0x0133
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0131:
            r2 = r34
        L_0x0133:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r5 = r5 | r17
            goto L_0x013a
        L_0x0138:
            r2 = r34
        L_0x013a:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r5 & r17
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x015c
            boolean r2 = r1.mo15011p()
            if (r2 != 0) goto L_0x014b
            goto L_0x015c
        L_0x014b:
            r1.mo14958a0()
            r3 = r26
            r8 = r31
            r4 = r7
            r5 = r9
            r6 = r11
            r7 = r15
            r9 = r32
            r11 = r34
            goto L_0x035d
        L_0x015c:
            r1.mo14930Q()
            r2 = r13 & 1
            r17 = 0
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = 1
            if (r2 == 0) goto L_0x018a
            boolean r2 = r1.mo14977f0()
            if (r2 == 0) goto L_0x0170
            goto L_0x018a
        L_0x0170:
            r1.mo14958a0()
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0179
            r5 = r5 & r18
        L_0x0179:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0181
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r5 = r5 & r0
        L_0x0181:
            r0 = r31
            r19 = r34
            r2 = r7
            r6 = r32
            goto L_0x020b
        L_0x018a:
            if (r6 == 0) goto L_0x018f
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0190
        L_0x018f:
            r2 = r7
        L_0x0190:
            if (r8 == 0) goto L_0x0193
            r9 = r3
        L_0x0193:
            if (r10 == 0) goto L_0x0197
            r11 = r17
        L_0x0197:
            if (r12 == 0) goto L_0x019a
            r15 = r3
        L_0x019a:
            if (r0 == 0) goto L_0x01bb
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r0)
            java.lang.Object r0 = r1.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r0 != r6) goto L_0x01b5
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r1.mo14893C(r0)
        L_0x01b5:
            r1.mo15002m0()
            androidx.compose.foundation.interaction.g r0 = (androidx.compose.foundation.interaction.C2243g) r0
            goto L_0x01bd
        L_0x01bb:
            r0 = r31
        L_0x01bd:
            r6 = r14 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x01cf
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            r7 = 6
            androidx.compose.material.q r6 = r6.mo11075a(r1, r7)
            long r6 = r6.mo10971j()
            r5 = r5 & r18
            goto L_0x01d1
        L_0x01cf:
            r6 = r32
        L_0x01d1:
            r8 = r14 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0209
            androidx.compose.runtime.i1 r8 = androidx.compose.material.ContentColorKt.m13406a()
            java.lang.Object r8 = r1.mo15032w(r8)
            androidx.compose.ui.graphics.j2 r8 = (androidx.compose.p004ui.graphics.C15240j2) r8
            long r19 = r8.mo42833M()
            androidx.compose.material.r r8 = androidx.compose.material.C7904r.f18969a
            r10 = 6
            float r8 = r8.mo10993d(r1, r10)
            r10 = 0
            r12 = 0
            r18 = 0
            r21 = 14
            r22 = 0
            r27 = r19
            r29 = r8
            r30 = r10
            r31 = r12
            r32 = r18
            r33 = r21
            r34 = r22
            long r19 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r27, r29, r30, r31, r32, r33, r34)
            r8 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r5 = r5 & r8
            goto L_0x020b
        L_0x0209:
            r19 = r34
        L_0x020b:
            r1.mo14899E()
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x021d
            r8 = -1
            java.lang.String r10 = "androidx.compose.material.NavigationRailItem (NavigationRail.kt:146)"
            r12 = -1813548445(0xffffffff93e77263, float:-5.8425392E-27)
            androidx.compose.runtime.ComposerKt.m29845w0(r12, r5, r8, r10)
        L_0x021d:
            if (r11 == 0) goto L_0x022b
            androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1 r8 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
            r8.<init>(r11, r5)
            r10 = -180398615(0xfffffffff53f55e9, float:-2.4254667E32)
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r10, r3, r8)
        L_0x022b:
            r8 = r17
            if (r11 != 0) goto L_0x0232
            float r10 = f7730c
            goto L_0x0234
        L_0x0232:
            float r10 = f7729b
        L_0x0234:
            r12 = 0
            r16 = 0
            int r3 = r5 >> 18
            r3 = r3 & 896(0x380, float:1.256E-42)
            r17 = 6
            r3 = r3 | 6
            r17 = 2
            r27 = r12
            r28 = r16
            r29 = r6
            r31 = r1
            r32 = r3
            r33 = r17
            androidx.compose.foundation.a0 r3 = androidx.compose.material.ripple.C7922j.m25285e(r27, r28, r29, r31, r32, r33)
            androidx.compose.ui.semantics.g$a r12 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r12 = r12.mo46127g()
            androidx.compose.ui.semantics.g r12 = androidx.compose.p004ui.semantics.C16031g.m72093h(r12)
            r27 = r2
            r28 = r24
            r29 = r0
            r30 = r3
            r31 = r9
            r32 = r12
            r33 = r25
            androidx.compose.ui.m r3 = androidx.compose.foundation.selection.SelectableKt.m12058a(r27, r28, r29, r30, r31, r32, r33)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r10)
            androidx.compose.ui.c$a r10 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r10 = r10.mo17066i()
            r12 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r1.mo14918M(r12)
            r12 = 0
            r35 = r0
            r0 = 6
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.BoxKt.m9849k(r10, r12, r1, r0)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r0)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r1.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            r16 = r2
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r2 = r1.mo15032w(r2)
            androidx.compose.ui.platform.c4 r2 = (androidx.compose.p004ui.platform.C15863c4) r2
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r4 = r17.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            r18 = r9
            androidx.compose.runtime.d r9 = r1.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x02c2
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02c2:
            r1.mo14938T()
            boolean r9 = r1.mo14997l()
            if (r9 == 0) goto L_0x02cf
            r1.mo14947W(r4)
            goto L_0x02d2
        L_0x02cf:
            r1.mo14888A()
        L_0x02d2:
            r1.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r9 = r17.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r10, r9)
            kotlin.jvm.functions.p r9 = r17.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r0, r9)
            kotlin.jvm.functions.p r0 = r17.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r12, r0)
            kotlin.jvm.functions.p r0 = r17.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r2, r0)
            r1.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.invoke(r0, r1, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1 r0 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
            r3 = r26
            r0.<init>(r15, r3, r8, r5)
            r2 = 670576792(0x27f83098, float:6.8886513E-15)
            r4 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r2, r4, r0)
            int r2 = r5 >> 24
            r4 = r2 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            r4 = 6
            int r4 = r5 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r27 = r6
            r29 = r19
            r31 = r24
            r32 = r0
            r33 = r1
            r34 = r2
            m13642d(r27, r29, r31, r32, r33, r34)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0352
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0352:
            r8 = r35
            r9 = r6
            r6 = r11
            r7 = r15
            r4 = r16
            r5 = r18
            r11 = r19
        L_0x035d:
            androidx.compose.runtime.t1 r15 = r1.mo15020s()
            if (r15 != 0) goto L_0x0364
            goto L_0x037b
        L_0x0364:
            androidx.compose.material.NavigationRailKt$NavigationRailItem$3 r2 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$3
            r0 = r2
            r1 = r24
            r23 = r2
            r2 = r25
            r3 = r26
            r13 = r37
            r14 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14)
            r0 = r23
            r15.mo15202a(r0)
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m13640b(boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.p, androidx.compose.ui.m, boolean, kotlin.jvm.functions.p, boolean, androidx.compose.foundation.interaction.g, long, long, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m13641c(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, float f, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar2;
        float f2 = f;
        int i6 = i;
        C8592o o = oVar.mo15009o(-1903861684);
        if ((i6 & 14) == 0) {
            if (o.mo14927P(pVar3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14927P(pVar4)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14968d(f2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1903861684, i2, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:258)");
            }
            C2966a aVar = new C2966a(pVar4, f2);
            o.mo14918M(-1323940314);
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(aVar2);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, aVar, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            C8767m b2 = C15594q.m69318b(aVar2, "icon");
            o.mo14918M(733328855);
            C8734c.C8735a aVar3 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar3.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(b2);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a2);
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
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            pVar3.invoke(o, Integer.valueOf(i2 & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14918M(286683862);
            if (pVar4 != null) {
                C8767m a3 = C8740a.m32500a(C15594q.m69318b(aVar2, "label"), f2);
                o.mo14918M(733328855);
                C15560f0 k2 = BoxKt.m9849k(aVar3.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a4 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(a3);
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
                C8592o b4 = Updater.m30180b(o);
                Updater.m30188j(b4, k2, companion.mo44588d());
                Updater.m30188j(b4, dVar3, companion.mo44586b());
                Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
                Updater.m30188j(b4, c4Var3, companion.mo44590f());
                o.mo14972e();
                f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                pVar4.invoke(o, Integer.valueOf((i2 >> 3) & 14));
                o.mo15002m0();
                o.mo14896D();
                o.mo15002m0();
                o.mo15002m0();
            }
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NavigationRailKt$NavigationRailItemBaselineLayout$3(pVar3, pVar4, f2, i6));
        }
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: d */
    public static final void m13642d(long j, long j2, boolean z, C11305q<? super Float, ? super C8592o, ? super Integer, C11079d2> qVar, C8592o oVar, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3 = j;
        long j4 = j2;
        boolean z2 = z;
        C11305q<? super Float, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
        int i7 = i;
        C8592o o = oVar.mo15009o(-207161906);
        if ((i7 & 14) == 0) {
            if (o.mo14980g(j3)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo14980g(j4)) {
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
        if ((i7 & 7168) == 0) {
            if (o.mo14927P(qVar2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-207161906, i8, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:226)");
            }
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            C8578k2 f2 = AnimateAsStateKt.m7972f(f, f7728a, 0.0f, (C11300l) null, o, 48, 12);
            long n = C15258l2.m66189n(j4, j3, m13643e(f2));
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m13406a().mo16141f(C15240j2.m66071n(C15240j2.m66080w(n, 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C15240j2.m66047A(n)))}, C8553b.m31048b(o, -1688205042, true, new NavigationRailKt$NavigationRailTransition$1(qVar2, i8, f2)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NavigationRailKt$NavigationRailTransition$2(j, j2, z, qVar, i));
        }
    }

    /* renamed from: e */
    public static final float m13643e(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: m */
    public static final C15564g0 m13651m(C15568h0 h0Var, C15611w0 w0Var, long j) {
        return C15568h0.m69206r2(h0Var, C16476b.m74362p(j), C16476b.m74361o(j), (Map) null, new NavigationRailKt$placeIcon$1(w0Var, Math.max(0, (C16476b.m74362p(j) - w0Var.mo44471K0()) / 2), Math.max(0, (C16476b.m74361o(j) - w0Var.mo44468G0()) / 2)), 4, (Object) null);
    }

    /* renamed from: n */
    public static final C15564g0 m13652n(C15568h0 h0Var, C15611w0 w0Var, C15611w0 w0Var2, long j, float f) {
        int A = w0Var.mo44325A(AlignmentLineKt.m68886b());
        int o = (C16476b.m74361o(j) - A) - h0Var.mo7429n2(f7733f);
        int p = (C16476b.m74362p(j) - w0Var.mo44471K0()) / 2;
        int n2 = h0Var.mo7429n2(f7734g);
        int p2 = (C16476b.m74362p(j) - w0Var2.mo44471K0()) / 2;
        int L0 = C11409d.m43851L0(((float) (((C16476b.m74361o(j) - w0Var2.mo44468G0()) / 2) - n2)) * (((float) 1) - f));
        return C15568h0.m69206r2(h0Var, C16476b.m74362p(j), C16476b.m74361o(j), (Map) null, new NavigationRailKt$placeLabelAndIcon$1(f, w0Var, p, o, L0, w0Var2, p2, n2), 4, (Object) null);
    }
}
