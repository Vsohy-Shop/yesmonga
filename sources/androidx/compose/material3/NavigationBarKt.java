package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.C8308h0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8740a;
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
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,637:1\n25#2:638\n25#2:645\n36#2:652\n460#2,13:677\n50#2:692\n49#2:693\n473#2,3:700\n456#2,11:721\n460#2,13:751\n473#2,3:765\n460#2,13:790\n473#2,3:804\n467#2,3:809\n1114#3,6:639\n1114#3,6:646\n1114#3,6:653\n1114#3,6:694\n68#4,5:659\n73#4:690\n77#4:704\n67#4,6:732\n73#4:764\n77#4:769\n67#4,6:771\n73#4:803\n77#4:808\n75#5:664\n76#5,11:666\n89#5:703\n71#5,4:705\n75#5,11:710\n75#5:738\n76#5,11:740\n89#5:768\n75#5:777\n76#5,11:779\n89#5:807\n88#5:812\n76#6:665\n76#6:691\n76#6:709\n76#6:739\n76#6:778\n75#7:770\n58#7:819\n75#7:820\n58#7:821\n75#7:822\n76#8:813\n102#8,2:814\n76#8:816\n154#9:817\n154#9:818\n154#9:823\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n169#1:638\n190#1:645\n203#1:652\n192#1:677,13\n224#1:692\n224#1:693\n192#1:700,3\n435#1:721,11\n441#1:751,13\n441#1:765,3\n444#1:790,13\n444#1:804,3\n435#1:809,3\n169#1:639,6\n190#1:646,6\n203#1:653,6\n224#1:694,6\n192#1:659,5\n192#1:690\n192#1:704\n441#1:732,6\n441#1:764\n441#1:769\n444#1:771,6\n444#1:803\n444#1:808\n192#1:664\n192#1:666,11\n192#1:703\n435#1:705,4\n435#1:710,11\n441#1:738\n441#1:740,11\n441#1:768\n444#1:777\n444#1:779,11\n444#1:807\n435#1:812\n192#1:665\n217#1:691\n435#1:709\n441#1:739\n444#1:778\n448#1:770\n632#1:819\n632#1:820\n635#1:821\n635#1:822\n190#1:813\n190#1:814,2\n208#1:816\n626#1:817\n629#1:818\n637#1:823\n*E\n"})
public final class NavigationBarKt {
    @C12579k

    /* renamed from: a */
    public static final String f19490a = "indicatorRipple";
    @C12579k

    /* renamed from: b */
    public static final String f19491b = "indicator";
    @C12579k

    /* renamed from: c */
    public static final String f19492c = "icon";
    @C12579k

    /* renamed from: d */
    public static final String f19493d = "label";

    /* renamed from: e */
    public static final float f19494e;

    /* renamed from: f */
    public static final int f19495f = 100;

    /* renamed from: g */
    public static final float f19496g = C16483g.m74435M((float) 8);

    /* renamed from: h */
    public static final float f19497h = C16483g.m74435M((float) 16);

    /* renamed from: i */
    public static final float f19498i;

    /* renamed from: j */
    public static final float f19499j;

    /* renamed from: k */
    public static final float f19500k = C16483g.m74435M((float) 12);

    @C11363r0({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItemBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,637:1\n223#2,2:638\n223#2,2:642\n288#2,2:644\n223#2,2:646\n92#3:640\n92#3:641\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt$NavigationBarItemBaselineLayout$2\n*L\n453#1:638,2\n460#1:642,2\n469#1:644,2\n480#1:646,2\n455#1:640\n457#1:641\n*E\n"})
    /* renamed from: androidx.compose.material3.NavigationBarKt$a */
    public static final class C8062a implements C15560f0 {

        /* renamed from: a */
        public final /* synthetic */ float f19501a;

        /* renamed from: b */
        public final /* synthetic */ C11304p<C8592o, Integer, C11079d2> f19502b;

        /* renamed from: c */
        public final /* synthetic */ boolean f19503c;

        public C8062a(float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, boolean z) {
            this.f19501a = f;
            this.f19502b = pVar;
            this.f19503c = z;
        }

        @C12579k
        /* renamed from: a */
        public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
            Object obj;
            C15611w0 w0Var;
            C15611w0 w0Var2;
            C15568h0 h0Var2 = h0Var;
            List<? extends C15557e0> list2 = list;
            Intrinsics.checkNotNullParameter(h0Var2, "$this$Layout");
            Intrinsics.checkNotNullParameter(list2, "measurables");
            Iterable<C15557e0> iterable = list2;
            for (C15557e0 e0Var : iterable) {
                if (Intrinsics.areEqual(C15594q.m69317a(e0Var), (Object) "icon")) {
                    C15611w0 t0 = e0Var.mo44324t0(j);
                    float f = (float) 2;
                    int K0 = t0.mo44471K0() + h0Var2.mo7429n2(C16483g.m74435M(NavigationBarKt.f19498i * f));
                    int L0 = C11409d.m43851L0(((float) K0) * this.f19501a);
                    int G0 = t0.mo44468G0() + h0Var2.mo7429n2(C16483g.m74435M(NavigationBarKt.f19499j * f));
                    for (C15557e0 e0Var2 : iterable) {
                        if (Intrinsics.areEqual(C15594q.m69317a(e0Var2), (Object) "indicatorRipple")) {
                            C15611w0 t02 = e0Var2.mo44324t0(C16476b.f40850b.mo47810c(K0, G0));
                            Iterator it = iterable.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (Intrinsics.areEqual(C15594q.m69317a((C15557e0) obj), (Object) "indicator")) {
                                    break;
                                }
                            }
                            C15557e0 e0Var3 = (C15557e0) obj;
                            if (e0Var3 != null) {
                                w0Var = e0Var3.mo44324t0(C16476b.f40850b.mo47810c(L0, G0));
                            } else {
                                w0Var = null;
                            }
                            if (this.f19502b != null) {
                                for (C15557e0 e0Var4 : iterable) {
                                    if (Intrinsics.areEqual(C15594q.m69317a(e0Var4), (Object) "label")) {
                                        w0Var2 = e0Var4.mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null));
                                    } else {
                                        long j2 = j;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            w0Var2 = null;
                            if (this.f19502b == null) {
                                return NavigationBarKt.m25926q(h0Var, t0, t02, w0Var, j);
                            }
                            Intrinsics.checkNotNull(w0Var2);
                            return NavigationBarKt.m25927r(h0Var, w0Var2, t0, t02, w0Var, j, this.f19503c, this.f19501a);
                        }
                        long j3 = j;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    static {
        C8308h0 h0Var = C8308h0.f21270a;
        f19494e = h0Var.mo13683o();
        float f = (float) 2;
        f19498i = C16483g.m74435M(C16483g.m74435M(h0Var.mo13677i() - h0Var.mo13686r()) / f);
        f19499j = C16483g.m74435M(C16483g.m74435M(h0Var.mo13675g() - h0Var.mo13686r()) / f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25910a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, long r26, long r28, float r30, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2411u0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r8 = r32
            r9 = r34
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1596802123(0x5f2d444b, float:1.2485187E19)
            r1 = r33
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r9 | 6
            r4 = r3
            r3 = r25
            goto L_0x0030
        L_0x001c:
            r3 = r9 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r25
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
            r3 = r25
            r4 = r9
        L_0x0030:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r35 & 2
            if (r5 != 0) goto L_0x0043
            r5 = r26
            boolean r7 = r1.mo14980g(r5)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0043:
            r5 = r26
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
            goto L_0x004b
        L_0x0049:
            r5 = r26
        L_0x004b:
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0062
            r7 = r35 & 4
            r10 = r28
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
            r10 = r28
        L_0x0064:
            r7 = r35 & 8
            if (r7 == 0) goto L_0x006b
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006b:
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007e
            r12 = r30
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
            r12 = r30
        L_0x0080:
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = r9 & r13
            if (r14 != 0) goto L_0x009c
            r14 = r35 & 16
            if (r14 != 0) goto L_0x0096
            r14 = r31
            boolean r15 = r1.mo15006n0(r14)
            if (r15 == 0) goto L_0x0098
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0096:
            r14 = r31
        L_0x0098:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r15
            goto L_0x009e
        L_0x009c:
            r14 = r31
        L_0x009e:
            r15 = r35 & 32
            if (r15 == 0) goto L_0x00a6
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00a4:
            r4 = r4 | r15
            goto L_0x00b7
        L_0x00a6:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00b7
            boolean r15 = r1.mo14927P(r8)
            if (r15 == 0) goto L_0x00b4
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a4
        L_0x00b4:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a4
        L_0x00b7:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r4
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r13) goto L_0x00ce
            boolean r13 = r1.mo15011p()
            if (r13 != 0) goto L_0x00c7
            goto L_0x00ce
        L_0x00c7:
            r1.mo14958a0()
            r2 = r3
            r7 = r12
            goto L_0x0181
        L_0x00ce:
            r1.mo14930Q()
            r13 = r9 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r13 == 0) goto L_0x00fb
            boolean r13 = r1.mo14977f0()
            if (r13 == 0) goto L_0x00df
            goto L_0x00fb
        L_0x00df:
            r1.mo14958a0()
            r2 = r35 & 2
            if (r2 == 0) goto L_0x00e8
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e8:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x00ee
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ee:
            r2 = r35 & 16
            if (r2 == 0) goto L_0x00f3
            r4 = r4 & r15
        L_0x00f3:
            r2 = r3
        L_0x00f4:
            r7 = r12
            r23 = r10
            r10 = r4
            r3 = r23
            goto L_0x0135
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0101
        L_0x0100:
            r2 = r3
        L_0x0101:
            r3 = r35 & 2
            r13 = 6
            if (r3 == 0) goto L_0x010e
            androidx.compose.material3.m1 r3 = androidx.compose.material3.C8246m1.f20359a
            long r5 = r3.mo12853a(r1, r13)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010e:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x011f
            androidx.compose.material3.i1 r3 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.z r3 = r3.mo12652a(r1, r13)
            long r10 = androidx.compose.material3.ColorSchemeKt.m25515b(r3, r5)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x011f:
            if (r7 == 0) goto L_0x0128
            androidx.compose.material3.m1 r3 = androidx.compose.material3.C8246m1.f20359a
            float r3 = r3.mo12854b()
            r12 = r3
        L_0x0128:
            r3 = r35 & 16
            if (r3 == 0) goto L_0x00f4
            androidx.compose.material3.m1 r3 = androidx.compose.material3.C8246m1.f20359a
            androidx.compose.foundation.layout.e1 r3 = r3.mo12855c(r1, r13)
            r4 = r4 & r15
            r14 = r3
            goto L_0x00f4
        L_0x0135:
            r1.mo14899E()
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x0144
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r11, r12)
        L_0x0144:
            r11 = 0
            r17 = 0
            r18 = 0
            androidx.compose.material3.NavigationBarKt$NavigationBar$1 r0 = new androidx.compose.material3.NavigationBarKt$NavigationBar$1
            r0.<init>(r14, r8, r10)
            r12 = 105663120(0x64c4a90, float:3.8422915E-35)
            r13 = 1
            androidx.compose.runtime.internal.a r19 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r13, r0)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r10 & 14
            r0 = r0 | r12
            int r10 = r10 << 3
            r12 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r12 = r10 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r12
            r21 = r0 | r10
            r22 = 98
            r10 = r2
            r12 = r5
            r0 = r14
            r14 = r3
            r16 = r7
            r20 = r1
            androidx.compose.material3.SurfaceKt.m26352a(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x017f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x017f:
            r14 = r0
            r10 = r3
        L_0x0181:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x0188
            goto L_0x019c
        L_0x0188:
            androidx.compose.material3.NavigationBarKt$NavigationBar$2 r13 = new androidx.compose.material3.NavigationBarKt$NavigationBar$2
            r0 = r13
            r1 = r2
            r2 = r5
            r4 = r10
            r6 = r7
            r7 = r14
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r12.mo15202a(r13)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m25910a(androidx.compose.ui.m, long, long, float, androidx.compose.foundation.layout.e1, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0126  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25911b(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2411u0 r35, boolean r36, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r37, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r39, boolean r40, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r41, boolean r42, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8252n1 r43, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r44, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r45, int r46, int r47) {
        /*
            r1 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r46
            r14 = r47
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -663510974(0xffffffffd873a042, float:-1.07147851E15)
            r2 = r45
            androidx.compose.runtime.o r9 = r2.mo15009o(r0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x002c
            r2 = r13 | 6
            goto L_0x003c
        L_0x002c:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x003b
            boolean r2 = r9.mo15006n0(r1)
            if (r2 == 0) goto L_0x0038
            r2 = 4
            goto L_0x0039
        L_0x0038:
            r2 = 2
        L_0x0039:
            r2 = r2 | r13
            goto L_0x003c
        L_0x003b:
            r2 = r13
        L_0x003c:
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0043
            r2 = r2 | 48
            goto L_0x0053
        L_0x0043:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0053
            boolean r3 = r9.mo14961b(r10)
            if (r3 == 0) goto L_0x0050
            r3 = 32
            goto L_0x0052
        L_0x0050:
            r3 = 16
        L_0x0052:
            r2 = r2 | r3
        L_0x0053:
            r3 = r14 & 2
            if (r3 == 0) goto L_0x005a
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006a
            boolean r3 = r9.mo14927P(r11)
            if (r3 == 0) goto L_0x0067
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r2 = r2 | r3
        L_0x006a:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0071
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0081
            boolean r3 = r9.mo14927P(r12)
            if (r3 == 0) goto L_0x007e
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r2 = r2 | r3
        L_0x0081:
            r3 = r14 & 8
            r33 = 57344(0xe000, float:8.0356E-41)
            if (r3 == 0) goto L_0x008b
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r4 = r13 & r33
            if (r4 != 0) goto L_0x009e
            r4 = r39
            boolean r5 = r9.mo15006n0(r4)
            if (r5 == 0) goto L_0x009a
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r2 = r2 | r5
            goto L_0x00a0
        L_0x009e:
            r4 = r39
        L_0x00a0:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x00a8
            r6 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r6
            goto L_0x00bc
        L_0x00a8:
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00bc
            r6 = r40
            boolean r7 = r9.mo14961b(r6)
            if (r7 == 0) goto L_0x00b8
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r2 = r2 | r7
            goto L_0x00be
        L_0x00bc:
            r6 = r40
        L_0x00be:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x00c6
            r15 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r15
            goto L_0x00db
        L_0x00c6:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r13
            if (r15 != 0) goto L_0x00db
            r15 = r41
            boolean r16 = r9.mo14927P(r15)
            if (r16 == 0) goto L_0x00d6
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r2 = r2 | r16
            goto L_0x00dd
        L_0x00db:
            r15 = r41
        L_0x00dd:
            r16 = r14 & 64
            if (r16 == 0) goto L_0x00e8
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r17
            r8 = r42
            goto L_0x00fd
        L_0x00e8:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r13 & r17
            r8 = r42
            if (r17 != 0) goto L_0x00fd
            boolean r17 = r9.mo14961b(r8)
            if (r17 == 0) goto L_0x00f9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r2 = r2 | r17
        L_0x00fd:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x0119
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0112
            r0 = r43
            boolean r17 = r9.mo15006n0(r0)
            if (r17 == 0) goto L_0x0114
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0112:
            r0 = r43
        L_0x0114:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r2 = r2 | r17
            goto L_0x011b
        L_0x0119:
            r0 = r43
        L_0x011b:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0126
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r17
            r1 = r44
            goto L_0x013b
        L_0x0126:
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r13 & r17
            r1 = r44
            if (r17 != 0) goto L_0x013b
            boolean r17 = r9.mo15006n0(r1)
            if (r17 == 0) goto L_0x0137
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r2 = r2 | r17
        L_0x013b:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r2 & r17
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r4) goto L_0x0159
            boolean r1 = r9.mo15011p()
            if (r1 != 0) goto L_0x014c
            goto L_0x0159
        L_0x014c:
            r9.mo14958a0()
            r5 = r39
            r11 = r44
            r12 = r9
            r7 = r15
            r9 = r43
            goto L_0x041c
        L_0x0159:
            r9.mo14930Q()
            r1 = r13 & 1
            r34 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = 0
            r11 = 1
            if (r1 == 0) goto L_0x0186
            boolean r1 = r9.mo14977f0()
            if (r1 == 0) goto L_0x016c
            goto L_0x0186
        L_0x016c:
            r9.mo14958a0()
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0175
            r2 = r2 & r34
        L_0x0175:
            r1 = r39
            r7 = r44
            r17 = r8
            r16 = r15
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8 = r43
            r15 = r6
            r6 = r2
            goto L_0x01e8
        L_0x0186:
            if (r3 == 0) goto L_0x018b
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x018d
        L_0x018b:
            r1 = r39
        L_0x018d:
            if (r5 == 0) goto L_0x0190
            r6 = r11
        L_0x0190:
            if (r7 == 0) goto L_0x0194
            r3 = r4
            goto L_0x0195
        L_0x0194:
            r3 = r15
        L_0x0195:
            if (r16 == 0) goto L_0x0198
            r8 = r11
        L_0x0198:
            r5 = r14 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x01b9
            androidx.compose.material3.o1 r15 = androidx.compose.material3.C8257o1.f20393a
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            r32 = 127(0x7f, float:1.78E-43)
            r30 = r9
            androidx.compose.material3.n1 r5 = r15.mo12884a(r16, r18, r20, r22, r24, r26, r28, r30, r31, r32)
            r2 = r2 & r34
            goto L_0x01bb
        L_0x01b9:
            r5 = r43
        L_0x01bb:
            if (r0 == 0) goto L_0x01dc
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo14918M(r0)
            java.lang.Object r7 = r9.mo14921N()
            androidx.compose.runtime.o$a r15 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r15 = r15.mo16277a()
            if (r7 != r15) goto L_0x01d6
            androidx.compose.foundation.interaction.g r7 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r9.mo14893C(r7)
        L_0x01d6:
            r9.mo15002m0()
            androidx.compose.foundation.interaction.g r7 = (androidx.compose.foundation.interaction.C2243g) r7
            goto L_0x01e1
        L_0x01dc:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7 = r44
        L_0x01e1:
            r16 = r3
            r15 = r6
            r17 = r8
            r6 = r2
            r8 = r5
        L_0x01e8:
            r9.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x01fa
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)"
            r5 = -663510974(0xffffffffd873a042, float:-1.07147851E15)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r6, r2, r3)
        L_0x01fa:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1 r5 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
            r2 = r5
            r3 = r8
            r4 = r36
            r0 = r5
            r5 = r15
            r18 = r6
            r19 = r7
            r7 = r16
            r20 = r8
            r8 = r17
            r12 = r9
            r9 = r38
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2 = -1419576100(0xffffffffab62fcdc, float:-8.064224E-13)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r2, r11, r0)
            if (r16 == 0) goto L_0x0239
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1 r2 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
            r39 = r2
            r40 = r20
            r41 = r36
            r42 = r15
            r43 = r18
            r44 = r16
            r39.<init>(r40, r41, r42, r43, r44)
            r3 = 1644987592(0x620c84c8, float:6.48028E20)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r3, r11, r2)
            r21 = r2
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            goto L_0x023e
        L_0x0239:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r21 = 0
        L_0x023e:
            r12.mo14918M(r2)
            java.lang.Object r2 = r12.mo14921N()
            androidx.compose.runtime.o$a r22 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r22.mo16277a()
            r4 = 0
            if (r2 != r3) goto L_0x025c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r8 = 0
            r9 = 2
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r8, r9, r8)
            r12.mo14893C(r2)
            goto L_0x025e
        L_0x025c:
            r8 = 0
            r9 = 2
        L_0x025e:
            r12.mo15002m0()
            r7 = r2
            androidx.compose.runtime.z0 r7 = (androidx.compose.runtime.C8700z0) r7
            androidx.compose.ui.semantics.g$a r2 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r2 = r2.mo46127g()
            r3 = 0
            androidx.compose.ui.semantics.g r2 = androidx.compose.p004ui.semantics.C16031g.m72093h(r2)
            r39 = r1
            r40 = r36
            r41 = r19
            r42 = r3
            r43 = r15
            r44 = r2
            r45 = r37
            androidx.compose.ui.m r2 = androidx.compose.foundation.selection.SelectableKt.m12058a(r39, r40, r41, r42, r43, r44, r45)
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 2
            r23 = 0
            r39 = r35
            r40 = r2
            r41 = r3
            r42 = r5
            r43 = r6
            r44 = r23
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.C2411u0.m10660e(r39, r40, r41, r42, r43, r44)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r3)
            boolean r3 = r12.mo15006n0(r7)
            java.lang.Object r5 = r12.mo14921N()
            if (r3 != 0) goto L_0x02ad
            java.lang.Object r3 = r22.mo16277a()
            if (r5 != r3) goto L_0x02b5
        L_0x02ad:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1 r5 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
            r5.<init>(r7)
            r12.mo14893C(r5)
        L_0x02b5:
            r12.mo15002m0()
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            androidx.compose.ui.m r2 = androidx.compose.p004ui.layout.OnRemeasuredModifierKt.m69010a(r2, r5)
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r3 = r3.mo17066i()
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r12.mo14918M(r5)
            r5 = 6
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.BoxKt.m9849k(r3, r4, r12, r5)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r12.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r12.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r12.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r23 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r5 = r23.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r8 = r12.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x0308
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0308:
            r12.mo14938T()
            boolean r8 = r12.mo14997l()
            if (r8 == 0) goto L_0x0315
            r12.mo14947W(r5)
            goto L_0x0318
        L_0x0315:
            r12.mo14888A()
        L_0x0318:
            r12.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r8 = r23.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r8)
            kotlin.jvm.functions.p r3 = r23.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r6, r3)
            kotlin.jvm.functions.p r3 = r23.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r9, r3)
            kotlin.jvm.functions.p r3 = r23.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r11, r3)
            r12.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.invoke(r3, r12, r5)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.mo14918M(r2)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            if (r10 == 0) goto L_0x035a
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x035b
        L_0x035a:
            r2 = 0
        L_0x035b:
            r3 = 100
            r5 = 6
            r8 = 0
            androidx.compose.animation.core.z0 r3 = androidx.compose.animation.core.C1972h.m8392q(r3, r4, r8, r5, r8)
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 48
            r11 = 28
            r23 = r7
            r7 = r12
            r8 = r9
            r39 = r1
            r1 = 2
            r9 = r11
            androidx.compose.runtime.k2 r2 = androidx.compose.animation.core.AnimateAsStateKt.m7971e(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r12.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.material3.tokens.h0 r4 = androidx.compose.material3.tokens.C8308h0.f21270a
            float r4 = r4.mo13677i()
            int r4 = r3.mo7429n2(r4)
            int r5 = m25912c(r23)
            int r5 = r5 - r4
            float r4 = (float) r5
            float r1 = (float) r1
            float r4 = r4 / r1
            float r1 = f19500k
            float r1 = r3.mo7425g5(r1)
            long r3 = androidx.compose.p004ui.geometry.C15096g.m64898a(r4, r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r3)
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.mo14918M(r5)
            r11 = r19
            boolean r5 = r12.mo15006n0(r11)
            boolean r1 = r12.mo15006n0(r1)
            r1 = r1 | r5
            java.lang.Object r5 = r12.mo14921N()
            if (r1 != 0) goto L_0x03bf
            java.lang.Object r1 = r22.mo16277a()
            if (r5 != r1) goto L_0x03c8
        L_0x03bf:
            androidx.compose.material3.MappedInteractionSource r5 = new androidx.compose.material3.MappedInteractionSource
            r1 = 0
            r5.<init>(r11, r3, r1)
            r12.mo14893C(r5)
        L_0x03c8:
            r12.mo15002m0()
            androidx.compose.material3.MappedInteractionSource r5 = (androidx.compose.material3.MappedInteractionSource) r5
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1 r1 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
            r1.<init>(r5)
            r3 = 691730997(0x293afa35, float:4.1517317E-14)
            r4 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r3, r4, r1)
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1 r3 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
            r9 = r20
            r3.<init>(r9, r2)
            r5 = -474426875(0xffffffffe3b8d205, float:-6.818669E21)
            androidx.compose.runtime.internal.a r3 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r5, r4, r3)
            float r7 = m25914e(r2)
            int r2 = r18 >> 9
            r2 = r2 & r33
            r8 = r2 | 438(0x1b6, float:6.14E-43)
            r2 = r1
            r4 = r0
            r5 = r21
            r6 = r17
            r0 = r8
            r8 = r12
            r1 = r9
            r9 = r0
            m25915f(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.mo15002m0()
            r12.mo14896D()
            r12.mo15002m0()
            r12.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0414
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0414:
            r5 = r39
            r9 = r1
            r6 = r15
            r7 = r16
            r8 = r17
        L_0x041c:
            androidx.compose.runtime.t1 r15 = r12.mo15020s()
            if (r15 != 0) goto L_0x0423
            goto L_0x043a
        L_0x0423:
            androidx.compose.material3.NavigationBarKt$NavigationBarItem$4 r12 = new androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
            r0 = r12
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r10 = r11
            r11 = r46
            r13 = r12
            r12 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.mo15202a(r13)
        L_0x043a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m25911b(androidx.compose.foundation.layout.u0, boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.p, androidx.compose.ui.m, boolean, kotlin.jvm.functions.p, boolean, androidx.compose.material3.n1, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: c */
    public static final int m25912c(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    /* renamed from: d */
    public static final void m25913d(C8700z0<Integer> z0Var, int i) {
        z0Var.setValue(Integer.valueOf(i));
    }

    /* renamed from: e */
    public static final float m25914e(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: f */
    public static final void m25915f(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, boolean z, float f, C8592o oVar, int i) {
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar7 = pVar3;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar8 = pVar4;
        boolean z2 = z;
        float f3 = f;
        int i9 = i;
        C8592o o = oVar.mo15009o(591111291);
        if ((i9 & 14) == 0) {
            if (o.mo14927P(pVar5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (o.mo14927P(pVar6)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 896) == 0) {
            if (o.mo14927P(pVar7)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i9 & 7168) == 0) {
            if (o.mo14927P(pVar8)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i9) == 0) {
            if (o.mo14961b(z2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i9) == 0) {
            if (o.mo14968d(f3)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(591111291, i2, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:426)");
            }
            C8062a aVar = new C8062a(f3, pVar8, z2);
            o.mo14918M(-1323940314);
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(aVar2);
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
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            pVar5.invoke(o, Integer.valueOf(i2 & 14));
            o.mo14918M(-311734399);
            if (f3 > 0.0f) {
                pVar6.invoke(o, Integer.valueOf((i2 >> 3) & 14));
            }
            o.mo15002m0();
            C8767m b2 = C15594q.m69318b(aVar2, "icon");
            o.mo14918M(733328855);
            C8734c.C8735a aVar3 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar3.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(b2);
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
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            pVar7.invoke(o, Integer.valueOf((i2 >> 6) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14918M(1204551908);
            if (pVar8 != null) {
                C8767m b4 = C15594q.m69318b(aVar2, "label");
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = f3;
                }
                C8767m m = PaddingKt.m10026m(C8740a.m32500a(b4, f2), C16483g.m74435M(f19496g / ((float) 2)), 0.0f, 2, (Object) null);
                o.mo14918M(733328855);
                C15560f0 k2 = BoxKt.m9849k(aVar3.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a3 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(m);
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
                C8592o b5 = Updater.m30180b(o);
                Updater.m30188j(b5, k2, companion.mo44588d());
                Updater.m30188j(b5, dVar3, companion.mo44586b());
                Updater.m30188j(b5, layoutDirection3, companion.mo44587c());
                Updater.m30188j(b5, c4Var3, companion.mo44590f());
                o.mo14972e();
                f6.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
                o.mo14918M(2058660585);
                pVar8.invoke(o, Integer.valueOf((i2 >> 9) & 14));
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
            s.mo15202a(new NavigationBarKt$NavigationBarItemBaselineLayout$3(pVar, pVar2, pVar3, pVar4, z, f, i));
        }
    }

    /* renamed from: o */
    public static final float m25924o() {
        return f19496g;
    }

    /* renamed from: p */
    public static final float m25925p() {
        return f19497h;
    }

    /* renamed from: q */
    public static final C15564g0 m25926q(C15568h0 h0Var, C15611w0 w0Var, C15611w0 w0Var2, C15611w0 w0Var3, long j) {
        int p = C16476b.m74362p(j);
        int o = C16476b.m74361o(j);
        return C15568h0.m69206r2(h0Var, p, o, (Map) null, new NavigationBarKt$placeIcon$1(w0Var3, w0Var, (p - w0Var.mo44471K0()) / 2, (o - w0Var.mo44468G0()) / 2, w0Var2, (p - w0Var2.mo44471K0()) / 2, (o - w0Var2.mo44468G0()) / 2, p, o), 4, (Object) null);
    }

    /* renamed from: r */
    public static final C15564g0 m25927r(C15568h0 h0Var, C15611w0 w0Var, C15611w0 w0Var2, C15611w0 w0Var3, C15611w0 w0Var4, long j, boolean z, float f) {
        int i;
        C15568h0 h0Var2 = h0Var;
        int o = C16476b.m74361o(j);
        float f2 = f19497h;
        int G0 = (o - w0Var.mo44468G0()) - h0Var2.mo7429n2(f2);
        int n2 = h0Var2.mo7429n2(f2);
        if (z) {
            i = n2;
        } else {
            i = (o - w0Var2.mo44468G0()) / 2;
        }
        int L0 = C11409d.m43851L0(((float) (i - n2)) * (((float) 1) - f));
        int p = C16476b.m74362p(j);
        return C15568h0.m69206r2(h0Var, p, o, (Map) null, new NavigationBarKt$placeLabelAndIcon$1(w0Var4, z, f, w0Var, (p - w0Var.mo44471K0()) / 2, G0, L0, w0Var2, (p - w0Var2.mo44471K0()) / 2, n2, w0Var3, (p - w0Var3.mo44471K0()) / 2, n2 - h0Var2.mo7429n2(f19499j), p, h0Var), 4, (Object) null);
    }
}
