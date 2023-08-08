package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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

@C11363r0({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,400:1\n25#2:401\n460#2,13:427\n473#2,3:441\n456#2,11:462\n460#2,13:492\n473#2,3:506\n460#2,13:530\n473#2,3:544\n467#2,3:549\n1114#3,6:402\n76#4:408\n76#4:415\n76#4:450\n76#4:480\n76#4:518\n68#5,5:409\n73#5:440\n77#5:445\n67#5,6:473\n73#5:505\n77#5:510\n67#5,6:511\n73#5:543\n77#5:548\n75#6:414\n76#6,11:416\n89#6:444\n71#6,4:446\n75#6,11:451\n75#6:479\n76#6,11:481\n89#6:509\n75#6:517\n76#6,11:519\n89#6:547\n88#6:552\n76#7:553\n154#8:554\n154#8:555\n154#8:556\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n155#1:401\n170#1:427,13\n170#1:441,3\n260#1:462,11\n262#1:492,13\n262#1:506,3\n264#1:530,13\n264#1:544,3\n260#1:549,3\n155#1:402,6\n156#1:408\n170#1:415\n260#1:450\n262#1:480\n264#1:518\n170#1:409,5\n170#1:440\n170#1:445\n262#1:473,6\n262#1:505\n262#1:510\n264#1:511,6\n264#1:543\n264#1:548\n170#1:414\n170#1:416,11\n170#1:444\n260#1:446,4\n260#1:451,11\n262#1:479\n262#1:481,11\n262#1:509\n264#1:517\n264#1:519,11\n264#1:547\n260#1:552\n228#1:553\n388#1:554\n393#1:555\n399#1:556\n*E\n"})
public final class BottomNavigationKt {
    @C12579k

    /* renamed from: a */
    public static final C2023z0<Float> f7539a = new C2023z0(300, 0, C1947b0.m8290b(), 2, (DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final float f7540b = C16483g.m74435M((float) 56);

    /* renamed from: c */
    public static final float f7541c;

    /* renamed from: d */
    public static final float f7542d;

    @C11363r0({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigationItemBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n223#2,2:401\n223#2,2:403\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigationItemBaselineLayout$2\n*L\n273#1:401,2\n276#1:403,2\n*E\n"})
    /* renamed from: androidx.compose.material.BottomNavigationKt$a */
    public static final class C2883a implements C15560f0 {

        /* renamed from: a */
        public final /* synthetic */ C11304p<C8592o, Integer, C11079d2> f7543a;

        /* renamed from: b */
        public final /* synthetic */ float f7544b;

        public C2883a(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, float f) {
            this.f7543a = pVar;
            this.f7544b = f;
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
                    if (this.f7543a != null) {
                        for (C15557e0 e0Var2 : iterable) {
                            if (Intrinsics.areEqual(C15594q.m69317a(e0Var2), (Object) "label")) {
                                w0Var = e0Var2.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    w0Var = null;
                    if (this.f7543a == null) {
                        return BottomNavigationKt.m13285l(h0Var, t0, j2);
                    }
                    Intrinsics.checkNotNull(w0Var);
                    return BottomNavigationKt.m13286m(h0Var, w0Var, t0, j, this.f7544b);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static {
        float f = (float) 12;
        f7541c = C16483g.m74435M(f);
        f7542d = C16483g.m74435M(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13274a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, long r25, long r27, float r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r7 = r30
            r8 = r32
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 456489494(0x1b357a16, float:1.5011417E-22)
            r1 = r31
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r8 | 6
            r4 = r3
            r3 = r24
            goto L_0x0030
        L_0x001c:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r24
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r8
            goto L_0x0030
        L_0x002d:
            r3 = r24
            r4 = r8
        L_0x0030:
            r5 = r8 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r33 & 2
            if (r5 != 0) goto L_0x0043
            r5 = r25
            boolean r9 = r1.mo14980g(r5)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0043:
            r5 = r25
        L_0x0045:
            r9 = 16
        L_0x0047:
            r4 = r4 | r9
            goto L_0x004b
        L_0x0049:
            r5 = r25
        L_0x004b:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0064
            r9 = r33 & 4
            if (r9 != 0) goto L_0x005e
            r9 = r27
            boolean r11 = r1.mo14980g(r9)
            if (r11 == 0) goto L_0x0060
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r9 = r27
        L_0x0060:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r11
            goto L_0x0066
        L_0x0064:
            r9 = r27
        L_0x0066:
            r11 = r33 & 8
            if (r11 == 0) goto L_0x006d
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x006d:
            r12 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r29
            boolean r13 = r1.mo14968d(r12)
            if (r13 == 0) goto L_0x007c
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r4 = r4 | r13
            goto L_0x0082
        L_0x0080:
            r12 = r29
        L_0x0082:
            r13 = r33 & 16
            if (r13 == 0) goto L_0x0089
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0089:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r8
            if (r13 != 0) goto L_0x009b
            boolean r13 = r1.mo14927P(r7)
            if (r13 == 0) goto L_0x0098
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r13
        L_0x009b:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b0
            boolean r13 = r1.mo15011p()
            if (r13 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            r1.mo14958a0()
            r2 = r3
            goto L_0x0150
        L_0x00b0:
            r1.mo14930Q()
            r13 = r8 & 1
            r14 = 6
            if (r13 == 0) goto L_0x00d7
            boolean r13 = r1.mo14977f0()
            if (r13 == 0) goto L_0x00bf
            goto L_0x00d7
        L_0x00bf:
            r1.mo14958a0()
            r2 = r33 & 2
            if (r2 == 0) goto L_0x00c8
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c8:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x00ce
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ce:
            r2 = r3
        L_0x00cf:
            r21 = r12
        L_0x00d1:
            r22 = r9
            r9 = r4
            r3 = r22
            goto L_0x0107
        L_0x00d7:
            if (r2 == 0) goto L_0x00dc
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00dd
        L_0x00dc:
            r2 = r3
        L_0x00dd:
            r3 = r33 & 2
            if (r3 == 0) goto L_0x00ed
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r3 = r3.mo11075a(r1, r14)
            long r5 = androidx.compose.material.ColorsKt.m13385f(r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ed:
            r3 = r33 & 4
            if (r3 == 0) goto L_0x00fc
            int r3 = r4 >> 3
            r3 = r3 & 14
            long r9 = androidx.compose.material.ColorsKt.m13381b(r5, r1, r3)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x00fc:
            if (r11 == 0) goto L_0x00cf
            androidx.compose.material.e r3 = androidx.compose.material.C3037e.f8104a
            float r3 = r3.mo10748a()
            r21 = r3
            goto L_0x00d1
        L_0x0107:
            r1.mo14899E()
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x0116
            r10 = -1
            java.lang.String r11 = "androidx.compose.material.BottomNavigation (BottomNavigation.kt:89)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r10, r11)
        L_0x0116:
            r10 = 0
            r15 = 0
            androidx.compose.material.BottomNavigationKt$BottomNavigation$1 r0 = new androidx.compose.material.BottomNavigationKt$BottomNavigation$1
            r0.<init>(r7, r9)
            r11 = 678339930(0x286ea55a, float:1.3247509E-14)
            r12 = 1
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r11, r12, r0)
            r0 = r9 & 14
            r11 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r11
            int r11 = r9 << 3
            r12 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            int r9 = r9 << r14
            r9 = r9 & r11
            r19 = r0 | r9
            r20 = 18
            r9 = r2
            r11 = r5
            r13 = r3
            r16 = r21
            r18 = r1
            androidx.compose.material.SurfaceKt.m13879b(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x014d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x014d:
            r9 = r3
            r12 = r21
        L_0x0150:
            androidx.compose.runtime.t1 r11 = r1.mo15020s()
            if (r11 != 0) goto L_0x0157
            goto L_0x016a
        L_0x0157:
            androidx.compose.material.BottomNavigationKt$BottomNavigation$2 r13 = new androidx.compose.material.BottomNavigationKt$BottomNavigation$2
            r0 = r13
            r1 = r2
            r2 = r5
            r4 = r9
            r6 = r12
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            r11.mo15202a(r13)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m13274a(androidx.compose.ui.m, long, long, float, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0126  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13275b(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2411u0 r26, boolean r27, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r30, boolean r31, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, boolean r33, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r34, long r35, long r37, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r39, int r40, int r41, int r42) {
        /*
            r1 = r26
            r3 = r28
            r4 = r29
            r14 = r40
            r15 = r42
            java.lang.String r0 = "$this$BottomNavigationItem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -1473735525(0xffffffffa828949b, float:-9.358097E-15)
            r2 = r39
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r15
            if (r5 == 0) goto L_0x002a
            r5 = r14 | 6
            goto L_0x003a
        L_0x002a:
            r5 = r14 & 14
            if (r5 != 0) goto L_0x0039
            boolean r5 = r2.mo15006n0(r1)
            if (r5 == 0) goto L_0x0036
            r5 = 4
            goto L_0x0037
        L_0x0036:
            r5 = 2
        L_0x0037:
            r5 = r5 | r14
            goto L_0x003a
        L_0x0039:
            r5 = r14
        L_0x003a:
            r8 = r15 & 1
            if (r8 == 0) goto L_0x0041
            r5 = r5 | 48
            goto L_0x0054
        L_0x0041:
            r8 = r14 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0054
            r8 = r27
            boolean r9 = r2.mo14961b(r8)
            if (r9 == 0) goto L_0x0050
            r9 = 32
            goto L_0x0052
        L_0x0050:
            r9 = 16
        L_0x0052:
            r5 = r5 | r9
            goto L_0x0056
        L_0x0054:
            r8 = r27
        L_0x0056:
            r9 = r15 & 2
            if (r9 == 0) goto L_0x005d
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005d:
            r9 = r14 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x006d
            boolean r9 = r2.mo14927P(r3)
            if (r9 == 0) goto L_0x006a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r5 = r5 | r9
        L_0x006d:
            r9 = r15 & 4
            if (r9 == 0) goto L_0x0074
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r9 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0084
            boolean r9 = r2.mo14927P(r4)
            if (r9 == 0) goto L_0x0081
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r5 = r5 | r9
        L_0x0084:
            r9 = r15 & 8
            if (r9 == 0) goto L_0x008b
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008b:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00a0
            r10 = r30
            boolean r11 = r2.mo15006n0(r10)
            if (r11 == 0) goto L_0x009c
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r5 = r5 | r11
            goto L_0x00a2
        L_0x00a0:
            r10 = r30
        L_0x00a2:
            r11 = r15 & 16
            if (r11 == 0) goto L_0x00aa
            r12 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r12
            goto L_0x00be
        L_0x00aa:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r14
            if (r12 != 0) goto L_0x00be
            r12 = r31
            boolean r13 = r2.mo14961b(r12)
            if (r13 == 0) goto L_0x00ba
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r5 = r5 | r13
            goto L_0x00c0
        L_0x00be:
            r12 = r31
        L_0x00c0:
            r13 = r15 & 32
            if (r13 == 0) goto L_0x00cb
            r16 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r16
            r6 = r32
            goto L_0x00e0
        L_0x00cb:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r14 & r16
            r6 = r32
            if (r16 != 0) goto L_0x00e0
            boolean r16 = r2.mo14927P(r6)
            if (r16 == 0) goto L_0x00dc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r5 = r5 | r16
        L_0x00e0:
            r16 = r15 & 64
            if (r16 == 0) goto L_0x00eb
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r17
            r0 = r33
            goto L_0x0100
        L_0x00eb:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r14 & r17
            r0 = r33
            if (r17 != 0) goto L_0x0100
            boolean r18 = r2.mo14961b(r0)
            if (r18 == 0) goto L_0x00fc
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r5 = r5 | r18
        L_0x0100:
            r7 = r15 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x010b
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r19
            r0 = r34
            goto L_0x0120
        L_0x010b:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r14 & r19
            r0 = r34
            if (r19 != 0) goto L_0x0120
            boolean r19 = r2.mo15006n0(r0)
            if (r19 == 0) goto L_0x011c
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r5 = r5 | r19
        L_0x0120:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x013c
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0135
            r0 = r35
            boolean r19 = r2.mo14980g(r0)
            if (r19 == 0) goto L_0x0137
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0135:
            r0 = r35
        L_0x0137:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r5 = r5 | r19
            goto L_0x013e
        L_0x013c:
            r0 = r35
        L_0x013e:
            r19 = r41 & 14
            if (r19 != 0) goto L_0x0158
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0151
            r0 = r37
            boolean r19 = r2.mo14980g(r0)
            if (r19 == 0) goto L_0x0153
            r19 = 4
            goto L_0x0155
        L_0x0151:
            r0 = r37
        L_0x0153:
            r19 = 2
        L_0x0155:
            r19 = r41 | r19
            goto L_0x015c
        L_0x0158:
            r0 = r37
            r19 = r41
        L_0x015c:
            r20 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r5 & r20
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r1) goto L_0x0182
            r0 = r19 & 11
            r1 = 2
            if (r0 != r1) goto L_0x0182
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x0172
            goto L_0x0182
        L_0x0172:
            r2.mo14958a0()
            r8 = r33
            r9 = r34
            r7 = r6
            r5 = r10
            r6 = r12
            r10 = r35
            r12 = r37
            goto L_0x0389
        L_0x0182:
            r2.mo14930Q()
            r0 = r14 & 1
            r18 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            if (r0 == 0) goto L_0x01af
            boolean r0 = r2.mo14977f0()
            if (r0 == 0) goto L_0x0193
            goto L_0x01af
        L_0x0193:
            r2.mo14958a0()
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x019c
            r5 = r5 & r18
        L_0x019c:
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01a2
            r19 = r19 & -15
        L_0x01a2:
            r9 = r33
            r7 = r34
            r21 = r37
            r0 = r10
            r1 = r19
            r10 = r35
            goto L_0x0228
        L_0x01af:
            if (r9 == 0) goto L_0x01b4
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01b5
        L_0x01b4:
            r0 = r10
        L_0x01b5:
            if (r11 == 0) goto L_0x01b8
            r12 = 1
        L_0x01b8:
            if (r13 == 0) goto L_0x01bb
            r6 = 0
        L_0x01bb:
            if (r16 == 0) goto L_0x01bf
            r9 = 1
            goto L_0x01c1
        L_0x01bf:
            r9 = r33
        L_0x01c1:
            if (r7 == 0) goto L_0x01e2
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r7)
            java.lang.Object r7 = r2.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r7 != r10) goto L_0x01dc
            androidx.compose.foundation.interaction.g r7 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r2.mo14893C(r7)
        L_0x01dc:
            r2.mo15002m0()
            androidx.compose.foundation.interaction.g r7 = (androidx.compose.foundation.interaction.C2243g) r7
            goto L_0x01e4
        L_0x01e2:
            r7 = r34
        L_0x01e4:
            r10 = r15 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x01f9
            androidx.compose.runtime.i1 r10 = androidx.compose.material.ContentColorKt.m13406a()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.graphics.j2 r10 = (androidx.compose.p004ui.graphics.C15240j2) r10
            long r10 = r10.mo42833M()
            r5 = r5 & r18
            goto L_0x01fb
        L_0x01f9:
            r10 = r35
        L_0x01fb:
            r13 = r15 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0224
            androidx.compose.material.r r13 = androidx.compose.material.C7904r.f18969a
            r1 = 6
            float r13 = r13.mo10993d(r2, r1)
            r1 = 0
            r18 = 0
            r21 = 0
            r22 = 14
            r23 = 0
            r30 = r10
            r32 = r13
            r33 = r1
            r34 = r18
            r35 = r21
            r36 = r22
            r37 = r23
            long r21 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r30, r32, r33, r34, r35, r36, r37)
            r19 = r19 & -15
            goto L_0x0226
        L_0x0224:
            r21 = r37
        L_0x0226:
            r1 = r19
        L_0x0228:
            r2.mo14899E()
            boolean r13 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r13 == 0) goto L_0x0239
            java.lang.String r13 = "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)"
            r3 = -1473735525(0xffffffffa828949b, float:-9.358097E-15)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r5, r1, r13)
        L_0x0239:
            if (r6 == 0) goto L_0x024b
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1 r3 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1
            r3.<init>(r6, r5)
            r13 = 1343298261(0x50111ad5, float:9.7378191E9)
            r38 = r6
            r6 = 1
            androidx.compose.runtime.internal.a r3 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r13, r6, r3)
            goto L_0x024e
        L_0x024b:
            r38 = r6
            r3 = 0
        L_0x024e:
            r6 = 0
            int r13 = r5 >> 21
            r13 = r13 & 896(0x380, float:1.256E-42)
            r17 = 6
            r13 = r13 | 6
            r17 = 2
            r30 = r6
            r6 = 0
            r31 = r6
            r32 = r10
            r34 = r2
            r35 = r13
            r36 = r17
            androidx.compose.foundation.a0 r6 = androidx.compose.material.ripple.C7922j.m25285e(r30, r31, r32, r34, r35, r36)
            androidx.compose.ui.semantics.g$a r13 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r13 = r13.mo46127g()
            androidx.compose.ui.semantics.g r13 = androidx.compose.p004ui.semantics.C16031g.m72093h(r13)
            r30 = r0
            r31 = r27
            r32 = r7
            r33 = r6
            r34 = r12
            r35 = r13
            r36 = r28
            androidx.compose.ui.m r6 = androidx.compose.foundation.selection.SelectableKt.m12058a(r30, r31, r32, r33, r34, r35, r36)
            r13 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r18 = 2
            r19 = 0
            r30 = r26
            r31 = r6
            r32 = r13
            r33 = r17
            r34 = r18
            r35 = r19
            androidx.compose.ui.m r6 = androidx.compose.foundation.layout.C2411u0.m10660e(r30, r31, r32, r33, r34, r35)
            androidx.compose.ui.c$a r13 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r13 = r13.mo17066i()
            r39 = r0
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r0)
            r0 = 0
            r17 = r7
            r7 = 6
            androidx.compose.ui.layout.f0 r7 = androidx.compose.foundation.layout.BoxKt.m9849k(r13, r0, r2, r7)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r13)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r2.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p004ui.unit.LayoutDirection) r0
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r19 = r12
            kotlin.jvm.functions.a r12 = r18.mo44585a()
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r14 = r2.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x02ef
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02ef:
            r2.mo14938T()
            boolean r14 = r2.mo14997l()
            if (r14 == 0) goto L_0x02fc
            r2.mo14947W(r12)
            goto L_0x02ff
        L_0x02fc:
            r2.mo14888A()
        L_0x02ff:
            r2.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r14 = r18.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r7, r14)
            kotlin.jvm.functions.p r7 = r18.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r13, r7)
            kotlin.jvm.functions.p r7 = r18.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r0, r7)
            kotlin.jvm.functions.p r0 = r18.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r0)
            r2.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.invoke(r0, r2, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1 r0 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1
            r0.<init>(r9, r4, r3, r5)
            r3 = -1411872801(0xffffffffabd887df, float:-1.5385435E-12)
            r6 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r3, r6, r0)
            int r3 = r5 >> 27
            r3 = r3 & 14
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            int r3 = r5 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            r30 = r10
            r32 = r21
            r34 = r27
            r35 = r0
            r36 = r2
            r37 = r1
            m13277d(r30, r32, r34, r35, r36, r37)
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x037e
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x037e:
            r7 = r38
            r5 = r39
            r8 = r9
            r9 = r17
            r6 = r19
            r12 = r21
        L_0x0389:
            androidx.compose.runtime.t1 r14 = r2.mo15020s()
            if (r14 != 0) goto L_0x0390
            goto L_0x03af
        L_0x0390:
            androidx.compose.material.BottomNavigationKt$BottomNavigationItem$3 r3 = new androidx.compose.material.BottomNavigationKt$BottomNavigationItem$3
            r0 = r3
            r1 = r26
            r2 = r27
            r24 = r3
            r3 = r28
            r4 = r29
            r25 = r14
            r14 = r40
            r15 = r41
            r16 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16)
            r1 = r24
            r0 = r25
            r0.mo15202a(r1)
        L_0x03af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m13275b(androidx.compose.foundation.layout.u0, boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.p, androidx.compose.ui.m, boolean, kotlin.jvm.functions.p, boolean, androidx.compose.foundation.interaction.g, long, long, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m13276c(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, float f, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar2;
        float f2 = f;
        int i6 = i;
        C8592o o = oVar.mo15009o(-1162995092);
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
                ComposerKt.m29845w0(-1162995092, i2, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:253)");
            }
            C2883a aVar = new C2883a(pVar4, f2);
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
            o.mo14918M(-1198312437);
            if (pVar4 != null) {
                C8767m m = PaddingKt.m10026m(C8740a.m32500a(C15594q.m69318b(aVar2, "label"), f2), f7541c, 0.0f, 2, (Object) null);
                o.mo14918M(733328855);
                C15560f0 k2 = BoxKt.m9849k(aVar3.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a3 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(m);
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
            s.mo15202a(new BottomNavigationKt$BottomNavigationItemBaselineLayout$3(pVar3, pVar4, f2, i6));
        }
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: d */
    public static final void m13277d(long j, long j2, boolean z, C11305q<? super Float, ? super C8592o, ? super Integer, C11079d2> qVar, C8592o oVar, int i) {
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
        C8592o o = oVar.mo15009o(-985175058);
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
                ComposerKt.m29845w0(-985175058, i8, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:221)");
            }
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            C8578k2 f2 = AnimateAsStateKt.m7972f(f, f7539a, 0.0f, (C11300l) null, o, 48, 12);
            long n = C15258l2.m66189n(j4, j3, m13278e(f2));
            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m13406a().mo16141f(C15240j2.m66071n(C15240j2.m66080w(n, 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C15240j2.m66047A(n)))}, C8553b.m31048b(o, -138092754, true, new BottomNavigationKt$BottomNavigationTransition$1(qVar2, i8, f2)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BottomNavigationKt$BottomNavigationTransition$2(j, j2, z, qVar, i));
        }
    }

    /* renamed from: e */
    public static final float m13278e(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: l */
    public static final C15564g0 m13285l(C15568h0 h0Var, C15611w0 w0Var, long j) {
        int o = C16476b.m74361o(j);
        return C15568h0.m69206r2(h0Var, w0Var.mo44471K0(), o, (Map) null, new BottomNavigationKt$placeIcon$1(w0Var, (o - w0Var.mo44468G0()) / 2), 4, (Object) null);
    }

    /* renamed from: m */
    public static final C15564g0 m13286m(C15568h0 h0Var, C15611w0 w0Var, C15611w0 w0Var2, long j, float f) {
        int o = C16476b.m74361o(j);
        int A = w0Var.mo44325A(AlignmentLineKt.m68886b());
        int n2 = h0Var.mo7429n2(f7542d);
        int i = (o - A) - n2;
        int G0 = (o - (n2 * 2)) - w0Var2.mo44468G0();
        int max = Math.max(w0Var.mo44471K0(), w0Var2.mo44471K0());
        return C15568h0.m69206r2(h0Var, max, o, (Map) null, new BottomNavigationKt$placeLabelAndIcon$1(f, w0Var, (max - w0Var.mo44471K0()) / 2, i, C11409d.m43851L0(((float) (((o - w0Var2.mo44468G0()) / 2) - G0)) * (((float) 1) - f)), w0Var2, (max - w0Var2.mo44471K0()) / 2, G0), 4, (Object) null);
    }
}
