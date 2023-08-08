package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.C8314j0;
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
import androidx.compose.p004ui.unit.C16478c;
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

@C11363r0({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,668:1\n25#2:669\n460#2,13:694\n50#2:709\n49#2:710\n473#2,3:717\n456#2,11:738\n460#2,13:768\n473#2,3:782\n460#2,13:806\n473#2,3:820\n467#2,3:825\n1114#3,6:670\n1114#3,6:711\n68#4,5:676\n73#4:707\n77#4:721\n67#4,6:749\n73#4:781\n77#4:786\n67#4,6:787\n73#4:819\n77#4:824\n75#5:681\n76#5,11:683\n89#5:720\n71#5,4:722\n75#5,11:727\n75#5:755\n76#5,11:757\n89#5:785\n75#5:793\n76#5,11:795\n89#5:823\n88#5:828\n76#6:682\n76#6:708\n76#6:726\n76#6:756\n76#6:794\n76#7:829\n154#8:830\n154#8:831\n154#8:832\n58#9:833\n75#9:834\n58#9:835\n75#9:836\n58#9:837\n75#9:838\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n170#1:669\n191#1:694,13\n219#1:709\n219#1:710\n191#1:717,3\n435#1:738,11\n441#1:768,13\n441#1:782,3\n444#1:806,13\n444#1:820,3\n435#1:825,3\n170#1:670,6\n219#1:711,6\n191#1:676,5\n191#1:707\n191#1:721\n441#1:749,6\n441#1:781\n441#1:786\n444#1:787,6\n444#1:819\n444#1:824\n191#1:681\n191#1:683,11\n191#1:720\n435#1:722,4\n435#1:727,11\n441#1:755\n441#1:757,11\n441#1:785\n444#1:793\n444#1:795,11\n444#1:823\n435#1:828\n191#1:682\n214#1:708\n435#1:726\n441#1:756\n444#1:794\n205#1:829\n639#1:830\n645#1:831\n659#1:832\n662#1:833\n662#1:834\n665#1:835\n665#1:836\n668#1:837\n668#1:838\n*E\n"})
public final class NavigationRailKt {
    @C12579k

    /* renamed from: a */
    public static final String f19513a = "indicatorRipple";
    @C12579k

    /* renamed from: b */
    public static final String f19514b = "indicator";
    @C12579k

    /* renamed from: c */
    public static final String f19515c = "icon";
    @C12579k

    /* renamed from: d */
    public static final String f19516d = "label";

    /* renamed from: e */
    public static final float f19517e;

    /* renamed from: f */
    public static final float f19518f = C16483g.m74435M((float) 8);

    /* renamed from: g */
    public static final int f19519g = 150;

    /* renamed from: h */
    public static final float f19520h;

    /* renamed from: i */
    public static final float f19521i;

    /* renamed from: j */
    public static final float f19522j;

    /* renamed from: k */
    public static final float f19523k;

    /* renamed from: l */
    public static final float f19524l;

    /* renamed from: m */
    public static final float f19525m;

    @C11363r0({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItemBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,668:1\n223#2,2:669\n223#2,2:673\n288#2,2:675\n223#2,2:677\n92#3:671\n92#3:672\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItemBaselineLayout$2\n*L\n452#1:669,2\n465#1:673,2\n474#1:675,2\n485#1:677,2\n454#1:671\n461#1:672\n*E\n"})
    /* renamed from: androidx.compose.material3.NavigationRailKt$a */
    public static final class C8072a implements C15560f0 {

        /* renamed from: a */
        public final /* synthetic */ float f19526a;

        /* renamed from: b */
        public final /* synthetic */ C11304p<C8592o, Integer, C11079d2> f19527b;

        /* renamed from: c */
        public final /* synthetic */ boolean f19528c;

        public C8072a(float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, boolean z) {
            this.f19526a = f;
            this.f19527b = pVar;
            this.f19528c = z;
        }

        @C12579k
        /* renamed from: a */
        public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
            float f;
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
                    float f2 = (float) 2;
                    int K0 = t0.mo44471K0() + h0Var2.mo7429n2(C16483g.m74435M(NavigationRailKt.f19523k * f2));
                    int L0 = C11409d.m43851L0(((float) K0) * this.f19526a);
                    if (this.f19527b == null) {
                        f = NavigationRailKt.f19525m;
                    } else {
                        f = NavigationRailKt.f19524l;
                    }
                    int G0 = t0.mo44468G0() + h0Var2.mo7429n2(C16483g.m74435M(f * f2));
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
                            if (this.f19527b != null) {
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
                            if (this.f19527b == null) {
                                return NavigationRailKt.m25976q(h0Var, t0, t02, w0Var, j);
                            }
                            Intrinsics.checkNotNull(w0Var2);
                            return NavigationRailKt.m25977r(h0Var, w0Var2, t0, t02, w0Var, j, this.f19528c, this.f19526a);
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
        float f = (float) 4;
        f19517e = C16483g.m74435M(f);
        C8314j0 j0Var = C8314j0.f21426a;
        f19520h = j0Var.mo13833p();
        f19521i = j0Var.mo13816F();
        f19522j = C16483g.m74435M(f);
        float f2 = (float) 2;
        f19523k = C16483g.m74435M(C16483g.m74435M(j0Var.mo13826i() - j0Var.mo13834q()) / f2);
        f19524l = C16483g.m74435M(C16483g.m74435M(j0Var.mo13824g() - j0Var.mo13834q()) / f2);
        f19525m = C16483g.m74435M(C16483g.m74435M(j0Var.mo13816F() - j0Var.mo13834q()) / f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25960a(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r25, long r26, long r28, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2354e1 r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r8 = r32
            r9 = r34
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 118552648(0x710f848, float:1.0906319E-34)
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
            boolean r13 = r1.mo14927P(r12)
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
            r13 = r13 & r9
            if (r13 != 0) goto L_0x009b
            r13 = r35 & 16
            if (r13 != 0) goto L_0x0095
            r13 = r31
            boolean r14 = r1.mo15006n0(r13)
            if (r14 == 0) goto L_0x0097
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0095:
            r13 = r31
        L_0x0097:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r14
            goto L_0x009d
        L_0x009b:
            r13 = r31
        L_0x009d:
            r14 = r35 & 32
            if (r14 == 0) goto L_0x00a5
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a3:
            r4 = r4 | r14
            goto L_0x00b6
        L_0x00a5:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b6
            boolean r14 = r1.mo14927P(r8)
            if (r14 == 0) goto L_0x00b3
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a3
        L_0x00b3:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a3
        L_0x00b6:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r4
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00cd
            boolean r14 = r1.mo15011p()
            if (r14 != 0) goto L_0x00c6
            goto L_0x00cd
        L_0x00c6:
            r1.mo14958a0()
            r2 = r3
            r7 = r12
            goto L_0x0176
        L_0x00cd:
            r1.mo14930Q()
            r14 = r9 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            if (r14 == 0) goto L_0x00fb
            boolean r14 = r1.mo14977f0()
            if (r14 == 0) goto L_0x00de
            goto L_0x00fb
        L_0x00de:
            r1.mo14958a0()
            r2 = r35 & 2
            if (r2 == 0) goto L_0x00e7
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e7:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x00ed
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ed:
            r2 = r35 & 16
            if (r2 == 0) goto L_0x00f2
            r4 = r4 & r15
        L_0x00f2:
            r2 = r3
        L_0x00f3:
            r7 = r12
            r14 = r13
        L_0x00f5:
            r23 = r10
            r10 = r4
            r3 = r23
            goto L_0x012f
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0101
        L_0x0100:
            r2 = r3
        L_0x0101:
            r3 = r35 & 2
            r14 = 6
            if (r3 == 0) goto L_0x010e
            androidx.compose.material3.r1 r3 = androidx.compose.material3.C8273r1.f20440a
            long r5 = r3.mo12951a(r1, r14)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010e:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x011d
            int r3 = r4 >> 3
            r3 = r3 & 14
            long r10 = androidx.compose.material3.ColorSchemeKt.m25516c(r5, r1, r3)
            r3 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r3
        L_0x011d:
            if (r7 == 0) goto L_0x0121
            r3 = 0
            r12 = r3
        L_0x0121:
            r3 = r35 & 16
            if (r3 == 0) goto L_0x00f3
            androidx.compose.material3.r1 r3 = androidx.compose.material3.C8273r1.f20440a
            androidx.compose.foundation.layout.e1 r3 = r3.mo12952b(r1, r14)
            r4 = r4 & r15
            r14 = r3
            r7 = r12
            goto L_0x00f5
        L_0x012f:
            r1.mo14899E()
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x013e
            r11 = -1
            java.lang.String r12 = "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r11, r12)
        L_0x013e:
            r11 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            androidx.compose.material3.NavigationRailKt$NavigationRail$1 r0 = new androidx.compose.material3.NavigationRailKt$NavigationRail$1
            r0.<init>(r14, r7, r10, r8)
            r12 = -2092683357(0xffffffff83442fa3, float:-5.7653907E-37)
            r13 = 1
            androidx.compose.runtime.internal.a r19 = androidx.compose.runtime.internal.C8553b.m31048b(r1, r12, r13, r0)
            r0 = r10 & 14
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r12
            int r10 = r10 << 3
            r12 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 | r12
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r21 = r0 | r10
            r22 = 114(0x72, float:1.6E-43)
            r10 = r2
            r12 = r5
            r0 = r14
            r14 = r3
            r20 = r1
            androidx.compose.material3.SurfaceKt.m26352a(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x0174
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0174:
            r13 = r0
            r10 = r3
        L_0x0176:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x017d
            goto L_0x0191
        L_0x017d:
            androidx.compose.material3.NavigationRailKt$NavigationRail$2 r14 = new androidx.compose.material3.NavigationRailKt$NavigationRail$2
            r0 = r14
            r1 = r2
            r2 = r5
            r4 = r10
            r6 = r7
            r7 = r13
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r12.mo15202a(r14)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m25960a(androidx.compose.ui.m, long, long, kotlin.jvm.functions.q, androidx.compose.foundation.layout.e1, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25961b(boolean r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r33, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r35, boolean r36, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r37, boolean r38, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8278s1 r39, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r40, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r41, int r42, int r43) {
        /*
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r42
            r12 = r43
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1533971045(0xffffffffa491759b, float:-6.308296E-17)
            r1 = r41
            androidx.compose.runtime.o r7 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r11 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0033
            boolean r1 = r7.mo14961b(r8)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r11
            goto L_0x0034
        L_0x0033:
            r1 = r11
        L_0x0034:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004b
            boolean r2 = r7.mo14927P(r9)
            if (r2 == 0) goto L_0x0048
            r2 = 32
            goto L_0x004a
        L_0x0048:
            r2 = 16
        L_0x004a:
            r1 = r1 | r2
        L_0x004b:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0062
            boolean r2 = r7.mo14927P(r10)
            if (r2 == 0) goto L_0x005f
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r2
        L_0x0062:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r3 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x007c
            r3 = r35
            boolean r4 = r7.mo15006n0(r3)
            if (r4 == 0) goto L_0x0078
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r4
            goto L_0x007e
        L_0x007c:
            r3 = r35
        L_0x007e:
            r4 = r12 & 16
            r31 = 57344(0xe000, float:8.0356E-41)
            if (r4 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0088:
            r5 = r11 & r31
            if (r5 != 0) goto L_0x009b
            r5 = r36
            boolean r13 = r7.mo14961b(r5)
            if (r13 == 0) goto L_0x0097
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r13
            goto L_0x009d
        L_0x009b:
            r5 = r36
        L_0x009d:
            r13 = r12 & 32
            if (r13 == 0) goto L_0x00a5
            r14 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r14
            goto L_0x00b9
        L_0x00a5:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00b9
            r14 = r37
            boolean r15 = r7.mo14927P(r14)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r1 = r1 | r15
            goto L_0x00bb
        L_0x00b9:
            r14 = r37
        L_0x00bb:
            r15 = r12 & 64
            if (r15 == 0) goto L_0x00c6
            r16 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r16
            r6 = r38
            goto L_0x00db
        L_0x00c6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r11 & r16
            r6 = r38
            if (r16 != 0) goto L_0x00db
            boolean r16 = r7.mo14961b(r6)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r16
        L_0x00db:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00f7
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f0
            r0 = r39
            boolean r16 = r7.mo15006n0(r0)
            if (r16 == 0) goto L_0x00f2
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f0:
            r0 = r39
        L_0x00f2:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r1 = r1 | r16
            goto L_0x00f9
        L_0x00f7:
            r0 = r39
        L_0x00f9:
            r14 = r12 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0102
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r16
            goto L_0x011a
        L_0x0102:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r11 & r16
            if (r16 != 0) goto L_0x011a
            r16 = r14
            r14 = r40
            boolean r17 = r7.mo15006n0(r14)
            if (r17 == 0) goto L_0x0115
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0115:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r1 = r1 | r17
            goto L_0x011e
        L_0x011a:
            r16 = r14
            r14 = r40
        L_0x011e:
            r17 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r1 & r17
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r3) goto L_0x013c
            boolean r0 = r7.mo15011p()
            if (r0 != 0) goto L_0x012f
            goto L_0x013c
        L_0x012f:
            r7.mo14958a0()
            r4 = r35
            r9 = r39
            r10 = r7
            r7 = r6
            r6 = r37
            goto L_0x03cc
        L_0x013c:
            r7.mo14930Q()
            r0 = r11 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r14 = 1
            if (r0 == 0) goto L_0x0165
            boolean r0 = r7.mo14977f0()
            if (r0 == 0) goto L_0x014e
            goto L_0x0165
        L_0x014e:
            r7.mo14958a0()
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0156
            r1 = r1 & r3
        L_0x0156:
            r21 = r35
            r23 = r37
            r15 = r39
            r14 = r40
            r13 = r1
            r22 = r5
            r24 = r6
            goto L_0x01d0
        L_0x0165:
            if (r2 == 0) goto L_0x016a
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x016c
        L_0x016a:
            r0 = r35
        L_0x016c:
            if (r4 == 0) goto L_0x016f
            r5 = r14
        L_0x016f:
            if (r13 == 0) goto L_0x0173
            r2 = 0
            goto L_0x0175
        L_0x0173:
            r2 = r37
        L_0x0175:
            if (r15 == 0) goto L_0x0178
            r6 = r14
        L_0x0178:
            r4 = r12 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x019a
            androidx.compose.material3.t1 r13 = androidx.compose.material3.C8283t1.f20478a
            r18 = 0
            r4 = r16
            r14 = r18
            r16 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r30 = 127(0x7f, float:1.78E-43)
            r28 = r7
            androidx.compose.material3.s1 r13 = r13.mo13009a(r14, r16, r18, r20, r22, r24, r26, r28, r29, r30)
            r1 = r1 & r3
            goto L_0x019e
        L_0x019a:
            r4 = r16
            r13 = r39
        L_0x019e:
            if (r4 == 0) goto L_0x01c4
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo14918M(r3)
            java.lang.Object r3 = r7.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r3 != r4) goto L_0x01b9
            androidx.compose.foundation.interaction.g r3 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r7.mo14893C(r3)
        L_0x01b9:
            r7.mo15002m0()
            androidx.compose.foundation.interaction.g r3 = (androidx.compose.foundation.interaction.C2243g) r3
            r21 = r0
            r23 = r2
            r14 = r3
            goto L_0x01ca
        L_0x01c4:
            r14 = r40
            r21 = r0
            r23 = r2
        L_0x01ca:
            r22 = r5
            r24 = r6
            r15 = r13
            r13 = r1
        L_0x01d0:
            r7.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01e2
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)"
            r2 = -1533971045(0xffffffffa491759b, float:-6.308296E-17)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r13, r0, r1)
        L_0x01e2:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1 r6 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
            r0 = r6
            r1 = r15
            r2 = r32
            r3 = r22
            r4 = r13
            r5 = r23
            r9 = r6
            r10 = 2
            r6 = r24
            r10 = r7
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1023357515(0xffffffffc300cdb5, float:-128.80354)
            r1 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r0, r1, r9)
            if (r23 == 0) goto L_0x021a
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1 r2 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
            r35 = r2
            r36 = r15
            r37 = r32
            r38 = r22
            r39 = r13
            r40 = r23
            r35.<init>(r36, r37, r38, r39, r40)
            r3 = -105269599(0xfffffffff9b9b6a1, float:-1.2053488E35)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r3, r1, r2)
            goto L_0x021b
        L_0x021a:
            r2 = 0
        L_0x021b:
            androidx.compose.ui.semantics.g$a r3 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r3 = r3.mo46127g()
            r4 = 0
            androidx.compose.ui.semantics.g r3 = androidx.compose.p004ui.semantics.C16031g.m72093h(r3)
            r35 = r21
            r36 = r32
            r37 = r14
            r38 = r4
            r39 = r22
            r40 = r3
            r41 = r33
            androidx.compose.ui.m r3 = androidx.compose.foundation.selection.SelectableKt.m12058a(r35, r36, r37, r38, r39, r40, r41)
            float r4 = f19521i
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10115o(r3, r4)
            float r4 = f19520h
            r5 = 0
            r6 = 2
            r7 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10094J(r3, r4, r5, r6, r7)
            androidx.compose.ui.c$a r6 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r6 = r6.mo17066i()
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r10.mo14918M(r9)
            r9 = 0
            r1 = 6
            androidx.compose.ui.layout.f0 r6 = androidx.compose.foundation.layout.BoxKt.m9849k(r6, r9, r10, r1)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r10.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r10.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r1 = r10.mo15032w(r1)
            androidx.compose.ui.unit.LayoutDirection r1 = (androidx.compose.p004ui.unit.LayoutDirection) r1
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r10.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r9 = r16.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r11 = r10.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x0292
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0292:
            r10.mo14938T()
            boolean r11 = r10.mo14997l()
            if (r11 == 0) goto L_0x029f
            r10.mo14947W(r9)
            goto L_0x02a2
        L_0x029f:
            r10.mo14888A()
        L_0x02a2:
            r10.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r10)
            kotlin.jvm.functions.p r11 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r11)
            kotlin.jvm.functions.p r6 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r6)
            kotlin.jvm.functions.p r5 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r1, r5)
            kotlin.jvm.functions.p r1 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r1)
            r10.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r10)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.invoke(r1, r10, r6)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r10.mo14918M(r1)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            if (r8 == 0) goto L_0x02e5
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02e6
        L_0x02e5:
            r1 = 0
        L_0x02e6:
            r3 = 150(0x96, float:2.1E-43)
            r6 = 0
            r7 = 6
            androidx.compose.animation.core.z0 r3 = androidx.compose.animation.core.C1972h.m8392q(r3, r5, r6, r7, r6)
            r5 = 0
            r16 = 0
            r17 = 0
            r19 = 48
            r20 = 28
            r6 = r13
            r13 = r1
            r1 = r14
            r14 = r3
            r3 = r15
            r15 = r5
            r18 = r10
            androidx.compose.runtime.k2 r5 = androidx.compose.animation.core.AnimateAsStateKt.m7971e(r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r10.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            int r4 = r7.mo7429n2(r4)
            androidx.compose.material3.tokens.j0 r9 = androidx.compose.material3.tokens.C8314j0.f21426a
            float r11 = r9.mo13826i()
            int r7 = r7.mo7429n2(r11)
            int r4 = r4 - r7
            float r4 = (float) r4
            r7 = 2
            float r7 = (float) r7
            float r4 = r4 / r7
            r7 = 0
            long r13 = androidx.compose.p004ui.geometry.C15096g.m64898a(r4, r7)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            androidx.compose.ui.geometry.f r4 = androidx.compose.p004ui.geometry.C15094f.m64868d(r13)
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.mo14918M(r7)
            boolean r7 = r10.mo15006n0(r1)
            boolean r4 = r10.mo15006n0(r4)
            r4 = r4 | r7
            java.lang.Object r7 = r10.mo14921N()
            if (r4 != 0) goto L_0x0348
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r7 != r4) goto L_0x0351
        L_0x0348:
            androidx.compose.material3.MappedInteractionSource r7 = new androidx.compose.material3.MappedInteractionSource
            r4 = 0
            r7.<init>(r1, r13, r4)
            r10.mo14893C(r7)
        L_0x0351:
            r10.mo15002m0()
            androidx.compose.material3.MappedInteractionSource r7 = (androidx.compose.material3.MappedInteractionSource) r7
            if (r23 == 0) goto L_0x036b
            r4 = 1104516975(0x41d5976f, float:26.698942)
            r10.mo14918M(r4)
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r9.mo13825h()
            r11 = 6
            androidx.compose.ui.graphics.g4 r4 = androidx.compose.material3.ShapesKt.m26127f(r4, r10, r11)
            r10.mo15002m0()
            goto L_0x037d
        L_0x036b:
            r11 = 6
            r4 = 1104517056(0x41d597c0, float:26.699097)
            r10.mo14918M(r4)
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r9.mo13817G()
            androidx.compose.ui.graphics.g4 r4 = androidx.compose.material3.ShapesKt.m26127f(r4, r10, r11)
            r10.mo15002m0()
        L_0x037d:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1 r9 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
            r9.<init>(r4, r7)
            r7 = 211026382(0xc9401ce, float:2.2804097E-31)
            r11 = 1
            androidx.compose.runtime.internal.a r13 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r7, r11, r9)
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1 r7 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
            r7.<init>(r3, r6, r4, r5)
            r4 = -1862011490(0xffffffff9103f59e, float:-1.0409764E-28)
            androidx.compose.runtime.internal.a r14 = androidx.compose.runtime.internal.C8553b.m31048b(r10, r4, r11, r7)
            float r18 = m25962c(r5)
            r4 = 6
            int r4 = r6 >> 6
            r4 = r4 & r31
            r4 = r4 | 438(0x1b6, float:6.14E-43)
            r15 = r0
            r16 = r2
            r17 = r24
            r19 = r10
            r20 = r4
            m25963d(r13, r14, r15, r16, r17, r18, r19, r20)
            r10.mo15002m0()
            r10.mo14896D()
            r10.mo15002m0()
            r10.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03c2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03c2:
            r14 = r1
            r9 = r3
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
        L_0x03cc:
            androidx.compose.runtime.t1 r13 = r10.mo15020s()
            if (r13 != 0) goto L_0x03d3
            goto L_0x03e8
        L_0x03d3:
            androidx.compose.material3.NavigationRailKt$NavigationRailItem$3 r15 = new androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
            r0 = r15
            r1 = r32
            r2 = r33
            r3 = r34
            r8 = r9
            r9 = r14
            r10 = r42
            r11 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.mo15202a(r15)
        L_0x03e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m25961b(boolean, kotlin.jvm.functions.a, kotlin.jvm.functions.p, androidx.compose.ui.m, boolean, kotlin.jvm.functions.p, boolean, androidx.compose.material3.s1, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: c */
    public static final float m25962c(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    public static final void m25963d(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, boolean z, float f, C8592o oVar, int i) {
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
        C8592o o = oVar.mo15009o(-876426901);
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
                ComposerKt.m29845w0(-876426901, i2, -1, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:426)");
            }
            C8072a aVar = new C8072a(f3, pVar8, z2);
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
            o.mo14918M(935757179);
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
            o.mo14918M(-853550242);
            if (pVar8 != null) {
                C8767m b4 = C15594q.m69318b(aVar2, "label");
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = f3;
                }
                C8767m a3 = C8740a.m32500a(b4, f2);
                o.mo14918M(733328855);
                C15560f0 k2 = BoxKt.m9849k(aVar3.mo17061C(), false, o, 0);
                o.mo14918M(-1323940314);
                C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a4 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(a3);
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
            s.mo15202a(new NavigationRailKt$NavigationRailItemBaselineLayout$3(pVar, pVar2, pVar3, pVar4, z, f, i));
        }
    }

    /* renamed from: m */
    public static final float m25972m() {
        return f19521i;
    }

    /* renamed from: n */
    public static final float m25973n() {
        return f19522j;
    }

    /* renamed from: o */
    public static final float m25974o() {
        return f19520h;
    }

    /* renamed from: p */
    public static final float m25975p() {
        return f19517e;
    }

    /* renamed from: q */
    public static final C15564g0 m25976q(C15568h0 h0Var, C15611w0 w0Var, C15611w0 w0Var2, C15611w0 w0Var3, long j) {
        int i;
        int K0 = w0Var.mo44471K0();
        int K02 = w0Var2.mo44471K0();
        if (w0Var3 != null) {
            i = w0Var3.mo44471K0();
        } else {
            i = 0;
        }
        int g = C16478c.m74382g(j, Math.max(K0, Math.max(K02, i)));
        int o = C16476b.m74361o(j);
        return C15568h0.m69206r2(h0Var, g, o, (Map) null, new NavigationRailKt$placeIcon$1(w0Var3, w0Var, (g - w0Var.mo44471K0()) / 2, (o - w0Var.mo44468G0()) / 2, w0Var2, (g - w0Var2.mo44471K0()) / 2, (o - w0Var2.mo44468G0()) / 2, g, o), 4, (Object) null);
    }

    /* renamed from: r */
    public static final C15564g0 m25977r(C15568h0 h0Var, C15611w0 w0Var, C15611w0 w0Var2, C15611w0 w0Var3, C15611w0 w0Var4, long j, boolean z, float f) {
        int i;
        int i2;
        C15568h0 h0Var2 = h0Var;
        int o = C16476b.m74361o(j);
        float f2 = f19522j;
        int G0 = (o - w0Var.mo44468G0()) - h0Var2.mo7429n2(f2);
        int n2 = h0Var2.mo7429n2(f2);
        if (z) {
            i = n2;
        } else {
            i = (o - w0Var2.mo44468G0()) / 2;
        }
        int L0 = C11409d.m43851L0(((float) (i - n2)) * (((float) 1) - f));
        int K0 = w0Var2.mo44471K0();
        int K02 = w0Var.mo44471K0();
        if (w0Var4 != null) {
            i2 = w0Var4.mo44471K0();
        } else {
            i2 = 0;
        }
        int g = C16478c.m74382g(j, Math.max(K0, Math.max(K02, i2)));
        return C15568h0.m69206r2(h0Var, g, o, (Map) null, new NavigationRailKt$placeLabelAndIcon$1(w0Var4, z, f, w0Var, (g - w0Var.mo44471K0()) / 2, G0, L0, w0Var2, (g - w0Var2.mo44471K0()) / 2, n2, w0Var3, (g - w0Var3.mo44471K0()) / 2, n2 - h0Var2.mo7429n2(f19524l), g, h0Var), 4, (Object) null);
    }
}
