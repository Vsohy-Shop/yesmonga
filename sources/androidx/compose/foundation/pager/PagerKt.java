package androidx.compose.foundation.pager;

import androidx.compose.animation.core.C2013v;
import androidx.compose.animation.core.C2017x;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.C2218e;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.foundation.lazy.C2570o;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,781:1\n154#2:782\n154#2:783\n154#2:784\n154#2:785\n76#3:786\n76#3:787\n67#4,3:788\n66#4:791\n50#4:798\n49#4:799\n67#4,3:806\n66#4:809\n36#4:816\n25#4:828\n1114#5,6:792\n1114#5,6:800\n1114#5,6:810\n1114#5,6:817\n1114#5,3:829\n1117#5,3:835\n51#6:823\n474#7,4:824\n478#7,2:832\n482#7:838\n474#8:834\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n126#1:782\n129#1:783\n206#1:784\n209#1:785\n265#1:786\n266#1:787\n267#1:788,3\n267#1:791\n275#1:798\n275#1:799\n279#1:806,3\n279#1:809\n283#1:816\n740#1:828\n267#1:792,6\n275#1:800,6\n279#1:810,6\n283#1:817,6\n740#1:829,3\n740#1:835,3\n388#1:823\n740#1:824,4\n740#1:832,2\n740#1:838\n740#1:834\n*E\n"})
public final class PagerKt {
    @C12579k

    /* renamed from: a */
    public static final C2650a f6974a = new C2650a(Orientation.Horizontal);
    @C12579k

    /* renamed from: b */
    public static final C2650a f6975b = new C2650a(Orientation.Vertical);

    /* renamed from: c */
    public static final boolean f6976c = false;

    /* renamed from: d */
    public static final int f6977d = 500;

    @C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n1#1,781:1\n33#2,6:782\n132#2,3:788\n33#2,4:791\n135#2,2:795\n38#2:797\n137#2:798\n116#2,2:799\n33#2,6:801\n118#2:807\n776#3,4:808\n776#3,4:812\n776#3,4:816\n776#3,4:820\n776#3,4:824\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$SnapLayoutInfoProvider$1\n*L\n597#1:782,6\n620#1:788,3\n620#1:791,4\n620#1:795,2\n620#1:797\n620#1:798\n635#1:799,2\n635#1:801,6\n635#1:807\n637#1:808,4\n653#1:812,4\n663#1:816,4\n667#1:820,4\n677#1:824,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.pager.PagerKt$a */
    public static final class C2635a implements C2218e {

        /* renamed from: a */
        public final /* synthetic */ PagerState f6978a;

        /* renamed from: b */
        public final /* synthetic */ C2013v<Float> f6979b;

        /* renamed from: c */
        public final /* synthetic */ C2655d f6980c;

        public C2635a(PagerState pagerState, C2013v<Float> vVar, C2655d dVar) {
            this.f6978a = pagerState;
            this.f6979b = vVar;
            this.f6980c = dVar;
        }

        /* renamed from: a */
        public float mo7546a(@C12579k C16479d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            C2570o d = mo9052d();
            if (!(!d.mo8378i().isEmpty())) {
                return 0.0f;
            }
            List<C2517l> i = d.mo8378i();
            int size = i.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += i.get(i3).getSize();
            }
            return ((float) i2) / ((float) d.mo8378i().size());
        }

        @C12579k
        /* renamed from: b */
        public C11457f<Float> mo7547b(@C12579k C16479d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            List<C2517l> i = mo9052d().mo8378i();
            int size = i.size();
            float f = Float.NEGATIVE_INFINITY;
            float f2 = Float.POSITIVE_INFINITY;
            for (int i2 = 0; i2 < size; i2++) {
                float c = LazyListSnapLayoutInfoProviderKt.m9586c(dVar, mo9052d(), i.get(i2), PagerStateKt.m11978h());
                if (c <= 0.0f && c > f) {
                    f = c;
                }
                if (c >= 0.0f && c < f2) {
                    f2 = c;
                }
            }
            return C11478t.m44305e(f, f2);
        }

        /* renamed from: c */
        public float mo7548c(@C12579k C16479d dVar, float f) {
            int i;
            C2517l lVar;
            int i2;
            double d;
            boolean z;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            int I = this.f6978a.mo9074I() + this.f6978a.mo9075J();
            float a = C2017x.m8654a(this.f6979b, 0.0f, f);
            C2517l A = this.f6978a.mo9066A();
            if (A != null) {
                int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = A.getIndex();
                if (i3 < 0) {
                    i++;
                }
            } else {
                i = this.f6978a.mo9095w();
            }
            List<C2517l> i4 = mo9052d().mo8378i();
            int size = i4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    lVar = null;
                    break;
                }
                lVar = i4.get(i5);
                if (lVar.getIndex() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i5++;
            }
            C2517l lVar2 = lVar;
            if (lVar2 != null) {
                i2 = lVar2.getOffset();
            } else {
                i2 = 0;
            }
            float f2 = (((float) (i * I)) + a) / ((float) I);
            if (f > 0.0f) {
                d = Math.ceil((double) f2);
            } else {
                d = Math.floor((double) f2);
            }
            int u = C11479u.m44447u(Math.abs((C11479u.m44334I(this.f6980c.mo9115a(i, C11479u.m44334I((int) ((float) d), 0, this.f6978a.mo9073H()), f, this.f6978a.mo9074I(), this.f6978a.mo9075J()), 0, this.f6978a.mo9073H()) - i) * I) - Math.abs(i2), 0);
            if (u == 0) {
                return (float) u;
            }
            return ((float) u) * Math.signum(f);
        }

        @C12579k
        /* renamed from: d */
        public final C2570o mo9052d() {
            return this.f6978a.mo9070E();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012f  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.foundation.C2855v
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m11897a(int r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r37, @org.jetbrains.annotations.C12580l androidx.compose.foundation.pager.PagerState r38, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r39, @org.jetbrains.annotations.C12580l androidx.compose.foundation.pager.C2651b r40, int r41, float r42, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8737c r43, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r44, boolean r45, boolean r46, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r47, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.input.nestedscroll.C15446a r48, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r49, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r50, int r51, int r52, int r53) {
        /*
            r15 = r49
            r14 = r51
            r13 = r52
            r12 = r53
            java.lang.String r0 = "pageContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = -547020879(0xffffffffdf651fb1, float:-1.6510109E19)
            r1 = r50
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r14 | 6
            r10 = r36
            goto L_0x0031
        L_0x001f:
            r1 = r14 & 14
            r10 = r36
            if (r1 != 0) goto L_0x0030
            boolean r1 = r11.mo14976f(r10)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r14
            goto L_0x0031
        L_0x0030:
            r1 = r14
        L_0x0031:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x004b
        L_0x0038:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r37
            boolean r8 = r11.mo15006n0(r7)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r1 = r1 | r8
            goto L_0x004d
        L_0x004b:
            r7 = r37
        L_0x004d:
            r8 = r14 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r12 & 4
            if (r8 != 0) goto L_0x0060
            r8 = r38
            boolean r9 = r11.mo15006n0(r8)
            if (r9 == 0) goto L_0x0062
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r8 = r38
        L_0x0062:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r9
            goto L_0x0068
        L_0x0066:
            r8 = r38
        L_0x0068:
            r9 = r12 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r39
            boolean r18 = r11.mo15006n0(r2)
            if (r18 == 0) goto L_0x0082
            r18 = r16
            goto L_0x0084
        L_0x0082:
            r18 = r17
        L_0x0084:
            r1 = r1 | r18
            goto L_0x0089
        L_0x0087:
            r2 = r39
        L_0x0089:
            r18 = r12 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r18 == 0) goto L_0x0095
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r40
            goto L_0x00a8
        L_0x0095:
            r20 = r14 & r19
            r3 = r40
            if (r20 != 0) goto L_0x00a8
            boolean r21 = r11.mo15006n0(r3)
            if (r21 == 0) goto L_0x00a4
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r21
        L_0x00a8:
            r21 = r12 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00b3
            r1 = r1 | r22
            r5 = r41
            goto L_0x00c8
        L_0x00b3:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r14 & r23
            r5 = r41
            if (r23 != 0) goto L_0x00c8
            boolean r24 = r11.mo14976f(r5)
            if (r24 == 0) goto L_0x00c4
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r1 = r1 | r24
        L_0x00c8:
            r24 = r12 & 64
            if (r24 == 0) goto L_0x00d3
            r25 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r25
            r6 = r42
            goto L_0x00e8
        L_0x00d3:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r14 & r25
            r6 = r42
            if (r25 != 0) goto L_0x00e8
            boolean r26 = r11.mo14968d(r6)
            if (r26 == 0) goto L_0x00e4
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r1 = r1 | r26
        L_0x00e8:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r2 = r43
            goto L_0x0108
        L_0x00f3:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r14 & r27
            r2 = r43
            if (r27 != 0) goto L_0x0108
            boolean r27 = r11.mo15006n0(r2)
            if (r27 == 0) goto L_0x0104
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r27
        L_0x0108:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0124
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x011d
            r2 = r44
            boolean r27 = r11.mo15006n0(r2)
            if (r27 == 0) goto L_0x011f
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011d:
            r2 = r44
        L_0x011f:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r1 = r1 | r27
            goto L_0x0126
        L_0x0124:
            r2 = r44
        L_0x0126:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x012f
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            goto L_0x0147
        L_0x012f:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0147
            r27 = r6
            r6 = r45
            boolean r28 = r11.mo14961b(r6)
            if (r28 == 0) goto L_0x0142
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0144
        L_0x0142:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0144:
            r1 = r1 | r28
            goto L_0x014b
        L_0x0147:
            r27 = r6
            r6 = r45
        L_0x014b:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0156
            r20 = r13 | 6
            r28 = r6
            r6 = r46
            goto L_0x0172
        L_0x0156:
            r28 = r13 & 14
            if (r28 != 0) goto L_0x016c
            r28 = r6
            r6 = r46
            boolean r29 = r11.mo14961b(r6)
            if (r29 == 0) goto L_0x0167
            r20 = 4
            goto L_0x0169
        L_0x0167:
            r20 = 2
        L_0x0169:
            r20 = r13 | r20
            goto L_0x0172
        L_0x016c:
            r28 = r6
            r6 = r46
            r20 = r13
        L_0x0172:
            r6 = r12 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x017f
            r20 = r20 | 48
            r29 = r6
            r2 = r20
            r6 = r47
            goto L_0x019b
        L_0x017f:
            r29 = r13 & 112(0x70, float:1.57E-43)
            if (r29 != 0) goto L_0x0195
            r29 = r6
            r6 = r47
            boolean r30 = r11.mo14927P(r6)
            if (r30 == 0) goto L_0x0190
            r23 = 32
            goto L_0x0192
        L_0x0190:
            r23 = 16
        L_0x0192:
            r20 = r20 | r23
            goto L_0x0199
        L_0x0195:
            r29 = r6
            r6 = r47
        L_0x0199:
            r2 = r20
        L_0x019b:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x01a1
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x01a1:
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01a8
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b7
        L_0x01a8:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x01b7
            boolean r3 = r11.mo14927P(r15)
            if (r3 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r16 = r17
        L_0x01b5:
            r2 = r2 | r16
        L_0x01b7:
            r3 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 != r2) goto L_0x01ef
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r1
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r5) goto L_0x01ef
            r2 = r3 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r2 != r5) goto L_0x01ef
            boolean r2 = r11.mo15011p()
            if (r2 != 0) goto L_0x01d2
            goto L_0x01ef
        L_0x01d2:
            r11.mo14958a0()
            r4 = r39
            r5 = r40
            r6 = r41
            r9 = r44
            r10 = r45
            r12 = r47
            r13 = r48
            r2 = r7
            r3 = r8
            r22 = r11
            r7 = r42
            r8 = r43
            r11 = r46
            goto L_0x0395
        L_0x01ef:
            r11.mo14930Q()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x022c
            boolean r2 = r11.mo14977f0()
            if (r2 == 0) goto L_0x01fd
            goto L_0x022c
        L_0x01fd:
            r11.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0206
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0206:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x020e
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x020e:
            if (r6 == 0) goto L_0x0212
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0212:
            r23 = r39
            r24 = r40
            r25 = r41
            r27 = r42
            r28 = r43
            r29 = r44
            r30 = r45
            r33 = r46
            r31 = r47
            r32 = r48
            r20 = r7
            r21 = r8
            goto L_0x02fc
        L_0x022c:
            if (r4 == 0) goto L_0x0233
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x0235
        L_0x0233:
            r16 = r7
        L_0x0235:
            r2 = r12 & 4
            r7 = 0
            if (r2 == 0) goto L_0x0247
            r2 = 0
            r4 = 3
            androidx.compose.foundation.pager.PagerState r2 = androidx.compose.foundation.pager.PagerStateKt.m11979i(r7, r2, r11, r7, r4)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r20 = r1
            r17 = r2
            goto L_0x024b
        L_0x0247:
            r20 = r1
            r17 = r8
        L_0x024b:
            if (r9 == 0) goto L_0x0259
            float r1 = (float) r7
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.foundation.layout.i0 r1 = androidx.compose.foundation.layout.PaddingKt.m10014a(r1)
            r23 = r1
            goto L_0x025b
        L_0x0259:
            r23 = r39
        L_0x025b:
            if (r18 == 0) goto L_0x0262
            androidx.compose.foundation.pager.b$a r1 = androidx.compose.foundation.pager.C2651b.C2652a.f7021a
            r18 = r1
            goto L_0x0264
        L_0x0262:
            r18 = r40
        L_0x0264:
            if (r21 == 0) goto L_0x0269
            r21 = r7
            goto L_0x026b
        L_0x0269:
            r21 = r41
        L_0x026b:
            if (r24 == 0) goto L_0x0275
            float r1 = (float) r7
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r24 = r1
            goto L_0x0277
        L_0x0275:
            r24 = r42
        L_0x0277:
            if (r0 == 0) goto L_0x0280
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r0 = r0.mo17070q()
            goto L_0x0282
        L_0x0280:
            r0 = r43
        L_0x0282:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02af
            androidx.compose.foundation.pager.c r1 = androidx.compose.foundation.pager.C2654c.f7025a
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            int r2 = r20 >> 6
            r2 = r2 & 14
            r25 = r2 | r22
            r30 = 30
            r2 = r17
            r31 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r32 = r6
            r6 = r9
            r33 = r7
            r7 = r11
            r8 = r25
            r9 = r30
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = r1.mo9113a(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r20 & r2
            goto L_0x02b9
        L_0x02af:
            r31 = r3
            r32 = r6
            r33 = r7
            r1 = r44
            r2 = r20
        L_0x02b9:
            if (r27 == 0) goto L_0x02bd
            r3 = 1
            goto L_0x02bf
        L_0x02bd:
            r3 = r45
        L_0x02bf:
            if (r28 == 0) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            r33 = r46
        L_0x02c4:
            if (r29 == 0) goto L_0x02c8
            r4 = 0
            goto L_0x02ca
        L_0x02c8:
            r4 = r47
        L_0x02ca:
            if (r32 == 0) goto L_0x02e4
            androidx.compose.foundation.pager.c r5 = androidx.compose.foundation.pager.C2654c.f7025a
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.ui.input.nestedscroll.a r5 = r5.mo9114b(r6)
            r6 = r31
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            goto L_0x02f1
        L_0x02e4:
            r6 = r31
            r32 = r48
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
        L_0x02f1:
            r3 = r6
            r20 = r16
            r25 = r21
            r27 = r24
            r21 = r17
            r24 = r18
        L_0x02fc:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:121)"
            r2 = -547020879(0xffffffffdf651fb1, float:-1.6510109E19)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r0)
        L_0x030d:
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Horizontal
            r8 = 0
            int r0 = r1 >> 3
            r2 = r0 & 14
            r2 = r2 | r22
            r4 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r1 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r2 = r2 & r19
            r0 = r0 | r2
            int r2 = r1 << 3
            r4 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r4
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            int r2 = r1 << 18
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r4
            r17 = r0 | r2
            int r0 = r1 >> 24
            r1 = r0 & 14
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 << 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 256(0x100, float:3.59E-43)
            r0 = r20
            r1 = r21
            r2 = r36
            r3 = r24
            r4 = r27
            r6 = r25
            r7 = r28
            r9 = r23
            r10 = r29
            r22 = r11
            r11 = r30
            r12 = r33
            r13 = r31
            r14 = r32
            r15 = r49
            r16 = r22
            m11898b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x037d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x037d:
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r12 = r31
            r13 = r32
            r11 = r33
        L_0x0395:
            androidx.compose.runtime.t1 r15 = r22.mo15020s()
            if (r15 != 0) goto L_0x039c
            goto L_0x03b7
        L_0x039c:
            androidx.compose.foundation.pager.PagerKt$HorizontalPager$1 r14 = new androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
            r0 = r14
            r1 = r36
            r34 = r14
            r14 = r49
            r35 = r15
            r15 = r51
            r16 = r52
            r17 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r34
            r0 = r35
            r0.mo15202a(r1)
        L_0x03b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m11897a(int, androidx.compose.ui.m, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.i0, androidx.compose.foundation.pager.b, int, float, androidx.compose.ui.c$c, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.l, androidx.compose.ui.input.nestedscroll.a, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: androidx.compose.foundation.pager.PagerWrapperFlingBehavior} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m11898b(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r29, @org.jetbrains.annotations.C12579k androidx.compose.foundation.pager.PagerState r30, int r31, @org.jetbrains.annotations.C12579k androidx.compose.foundation.pager.C2651b r32, float r33, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.Orientation r34, int r35, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8737c r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r37, @org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2366i0 r38, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r39, boolean r40, boolean r41, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r42, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.nestedscroll.C15446a r43, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r45, int r46, int r47, int r48) {
        /*
            r1 = r29
            r0 = r30
            r15 = r34
            r14 = r35
            r13 = r38
            r12 = r39
            r11 = r46
            r10 = r48
            java.lang.String r2 = "modifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "pageSize"
            r9 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.lang.String r2 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            java.lang.String r2 = "flingBehavior"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            java.lang.String r2 = "pageNestedScrollConnection"
            r8 = r43
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "pageContent"
            r7 = r44
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            r2 = -765777783(0xffffffffd25b2889, float:-2.35319476E11)
            r3 = r45
            androidx.compose.runtime.o r6 = r3.mo15009o(r2)
            r3 = r10 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0054
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r3 = r3.mo17070q()
            r22 = r3
            goto L_0x0056
        L_0x0054:
            r22 = r36
        L_0x0056:
            r3 = r10 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0063
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r3.mo17068m()
            r23 = r3
            goto L_0x0065
        L_0x0063:
            r23 = r37
        L_0x0065:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0073
            java.lang.String r3 = "androidx.compose.foundation.pager.Pager (Pager.kt:240)"
            r5 = r47
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r11, r5, r3)
            goto L_0x0075
        L_0x0073:
            r5 = r47
        L_0x0075:
            r2 = 0
            if (r14 < 0) goto L_0x007a
            r3 = 1
            goto L_0x007b
        L_0x007a:
            r3 = r2
        L_0x007b:
            if (r3 == 0) goto L_0x022a
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r15 != r3) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0083:
            r3 = r2
        L_0x0084:
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r6.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r6.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            r37 = r3
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            r6.mo14918M(r3)
            boolean r16 = r6.mo15006n0(r13)
            boolean r17 = r6.mo15006n0(r15)
            r16 = r16 | r17
            boolean r17 = r6.mo15006n0(r4)
            r16 = r16 | r17
            java.lang.Object r3 = r6.mo14921N()
            if (r16 != 0) goto L_0x00be
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r16.mo16277a()
            if (r3 != r5) goto L_0x00c9
        L_0x00be:
            float r3 = m11907k(r13, r15, r4)
            androidx.compose.ui.unit.g r3 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            r6.mo14893C(r3)
        L_0x00c9:
            r6.mo15002m0()
            androidx.compose.ui.unit.g r3 = (androidx.compose.p004ui.unit.C16483g) r3
            float r16 = r3.mo47823t0()
            r5 = r11 & 112(0x70, float:1.57E-43)
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo14918M(r3)
            boolean r3 = r6.mo15006n0(r12)
            boolean r4 = r6.mo15006n0(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r6.mo14921N()
            if (r3 != 0) goto L_0x00f1
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x00f9
        L_0x00f1:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r4 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior
            r4.<init>(r12, r0)
            r6.mo14893C(r4)
        L_0x00f9:
            r6.mo15002m0()
            r17 = r4
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r17 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r17
            androidx.compose.ui.unit.g r4 = androidx.compose.p004ui.unit.C16483g.m74451w(r33)
            androidx.compose.ui.unit.g r3 = androidx.compose.p004ui.unit.C16483g.m74451w(r33)
            int r7 = r11 >> 6
            r7 = r7 & 896(0x380, float:1.256E-42)
            r8 = 1618982084(0x607fb4c4, float:7.370227E19)
            r6.mo14918M(r8)
            boolean r8 = r6.mo15006n0(r2)
            boolean r18 = r6.mo15006n0(r0)
            r8 = r8 | r18
            boolean r3 = r6.mo15006n0(r3)
            r3 = r3 | r8
            java.lang.Object r8 = r6.mo14921N()
            r9 = 0
            if (r3 != 0) goto L_0x0134
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r8 != r3) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            r3 = r33
            goto L_0x013e
        L_0x0134:
            androidx.compose.foundation.pager.PagerKt$Pager$2$1 r8 = new androidx.compose.foundation.pager.PagerKt$Pager$2$1
            r3 = r33
            r8.<init>(r2, r0, r3, r9)
            r6.mo14893C(r8)
        L_0x013e:
            r6.mo15002m0()
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            r9 = r5 | 4096(0x1000, float:5.74E-42)
            r7 = r7 | r9
            r9 = r2
            r10 = r37
            r3 = r30
            r18 = r5
            r5 = r8
            r8 = r6
            androidx.compose.runtime.EffectsKt.m29894f(r2, r3, r4, r5, r6, r7)
            int r2 = r11 >> 3
            r2 = r2 & 14
            r3 = 1157296644(0x44faf204, float:2007.563)
            r8.mo14918M(r3)
            boolean r3 = r8.mo15006n0(r0)
            java.lang.Object r4 = r8.mo14921N()
            if (r3 != 0) goto L_0x016e
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0177
        L_0x016e:
            androidx.compose.foundation.pager.PagerKt$Pager$3$1 r4 = new androidx.compose.foundation.pager.PagerKt$Pager$3$1
            r3 = 0
            r4.<init>(r0, r3)
            r8.mo14893C(r4)
        L_0x0177:
            r8.mo15002m0()
            kotlin.jvm.functions.p r4 = (kotlin.jvm.functions.C11304p) r4
            r2 = r2 | 64
            androidx.compose.runtime.EffectsKt.m29896h(r0, r4, r8, r2)
            r2 = 1445594592(0x562a05e0, float:4.6735552E13)
            r8.mo14918M(r2)
            if (r40 == 0) goto L_0x0192
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = r18 | 6
            androidx.compose.ui.m r2 = m11909m(r2, r0, r10, r8, r3)
            goto L_0x0194
        L_0x0192:
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
        L_0x0194:
            r8.mo15002m0()
            androidx.compose.ui.m r24 = r1.mo17224k3(r2)
            r25 = 0
            r26 = 0
            androidx.compose.foundation.pager.PagerKt$Pager$4 r7 = new androidx.compose.foundation.pager.PagerKt$Pager$4
            r2 = r7
            r3 = r10
            r4 = r9
            r5 = r33
            r6 = r16
            r10 = r7
            r7 = r41
            r9 = r8
            r8 = r30
            r0 = r9
            r9 = r46
            r1 = r10
            r10 = r38
            r11 = r17
            r12 = r40
            r13 = r35
            r14 = r23
            r15 = r22
            r16 = r47
            r17 = r32
            r18 = r31
            r19 = r42
            r20 = r43
            r21 = r44
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = -1677736225(0xffffffff9bffc6df, float:-4.2314729E-22)
            r3 = 1
            androidx.compose.runtime.internal.a r6 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r2, r3, r1)
            r8 = 3072(0xc00, float:4.305E-42)
            r9 = 6
            r3 = r24
            r4 = r25
            r5 = r26
            r7 = r0
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m9860a(r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01eb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01eb:
            androidx.compose.runtime.t1 r15 = r0.mo15020s()
            if (r15 != 0) goto L_0x01f2
            goto L_0x0229
        L_0x01f2:
            androidx.compose.foundation.pager.PagerKt$Pager$5 r14 = new androidx.compose.foundation.pager.PagerKt$Pager$5
            r0 = r14
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r22
            r9 = r23
            r10 = r38
            r11 = r39
            r12 = r40
            r13 = r41
            r27 = r14
            r14 = r42
            r28 = r15
            r15 = r43
            r16 = r44
            r17 = r46
            r18 = r47
            r19 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r27
            r0 = r28
            r0.mo15202a(r1)
        L_0x0229:
            return
        L_0x022a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "beyondBoundsPageCount should be greater than or equal to 0, you selected "
            r0.append(r1)
            r1 = r35
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m11898b(androidx.compose.ui.m, androidx.compose.foundation.pager.PagerState, int, androidx.compose.foundation.pager.b, float, androidx.compose.foundation.gestures.Orientation, int, androidx.compose.ui.c$c, androidx.compose.ui.c$b, androidx.compose.foundation.layout.i0, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.l, androidx.compose.ui.input.nestedscroll.a, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: c */
    public static final C2218e m11899c(PagerState pagerState, C2655d dVar, C2013v<Float> vVar) {
        return new C2635a(pagerState, vVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012f  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.foundation.C2855v
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m11900d(int r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r37, @org.jetbrains.annotations.C12580l androidx.compose.foundation.pager.PagerState r38, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.C2366i0 r39, @org.jetbrains.annotations.C12580l androidx.compose.foundation.pager.C2651b r40, int r41, float r42, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c.C8736b r43, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r44, boolean r45, boolean r46, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Integer, ? extends java.lang.Object> r47, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.input.nestedscroll.C15446a r48, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r49, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r50, int r51, int r52, int r53) {
        /*
            r15 = r49
            r14 = r51
            r13 = r52
            r12 = r53
            java.lang.String r0 = "pageContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 26030705(0x18d3271, float:5.18676E-38)
            r1 = r50
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r14 | 6
            r10 = r36
            goto L_0x0031
        L_0x001f:
            r1 = r14 & 14
            r10 = r36
            if (r1 != 0) goto L_0x0030
            boolean r1 = r11.mo14976f(r10)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r14
            goto L_0x0031
        L_0x0030:
            r1 = r14
        L_0x0031:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0038
            r1 = r1 | 48
            goto L_0x004b
        L_0x0038:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r37
            boolean r8 = r11.mo15006n0(r7)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r1 = r1 | r8
            goto L_0x004d
        L_0x004b:
            r7 = r37
        L_0x004d:
            r8 = r14 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r12 & 4
            if (r8 != 0) goto L_0x0060
            r8 = r38
            boolean r9 = r11.mo15006n0(r8)
            if (r9 == 0) goto L_0x0062
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0060:
            r8 = r38
        L_0x0062:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r9
            goto L_0x0068
        L_0x0066:
            r8 = r38
        L_0x0068:
            r9 = r12 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0073:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0087
            r2 = r39
            boolean r18 = r11.mo15006n0(r2)
            if (r18 == 0) goto L_0x0082
            r18 = r16
            goto L_0x0084
        L_0x0082:
            r18 = r17
        L_0x0084:
            r1 = r1 | r18
            goto L_0x0089
        L_0x0087:
            r2 = r39
        L_0x0089:
            r18 = r12 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r18 == 0) goto L_0x0095
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r40
            goto L_0x00a8
        L_0x0095:
            r20 = r14 & r19
            r3 = r40
            if (r20 != 0) goto L_0x00a8
            boolean r21 = r11.mo15006n0(r3)
            if (r21 == 0) goto L_0x00a4
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r21
        L_0x00a8:
            r21 = r12 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00b3
            r1 = r1 | r22
            r5 = r41
            goto L_0x00c8
        L_0x00b3:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r14 & r23
            r5 = r41
            if (r23 != 0) goto L_0x00c8
            boolean r24 = r11.mo14976f(r5)
            if (r24 == 0) goto L_0x00c4
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r1 = r1 | r24
        L_0x00c8:
            r24 = r12 & 64
            if (r24 == 0) goto L_0x00d3
            r25 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r25
            r6 = r42
            goto L_0x00e8
        L_0x00d3:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r14 & r25
            r6 = r42
            if (r25 != 0) goto L_0x00e8
            boolean r26 = r11.mo14968d(r6)
            if (r26 == 0) goto L_0x00e4
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r1 = r1 | r26
        L_0x00e8:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f3
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r2 = r43
            goto L_0x0108
        L_0x00f3:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r14 & r27
            r2 = r43
            if (r27 != 0) goto L_0x0108
            boolean r27 = r11.mo15006n0(r2)
            if (r27 == 0) goto L_0x0104
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r27
        L_0x0108:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0124
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x011d
            r2 = r44
            boolean r27 = r11.mo15006n0(r2)
            if (r27 == 0) goto L_0x011f
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011d:
            r2 = r44
        L_0x011f:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r1 = r1 | r27
            goto L_0x0126
        L_0x0124:
            r2 = r44
        L_0x0126:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x012f
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            goto L_0x0147
        L_0x012f:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0147
            r27 = r6
            r6 = r45
            boolean r28 = r11.mo14961b(r6)
            if (r28 == 0) goto L_0x0142
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0144
        L_0x0142:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0144:
            r1 = r1 | r28
            goto L_0x014b
        L_0x0147:
            r27 = r6
            r6 = r45
        L_0x014b:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0156
            r20 = r13 | 6
            r28 = r6
            r6 = r46
            goto L_0x0172
        L_0x0156:
            r28 = r13 & 14
            if (r28 != 0) goto L_0x016c
            r28 = r6
            r6 = r46
            boolean r29 = r11.mo14961b(r6)
            if (r29 == 0) goto L_0x0167
            r20 = 4
            goto L_0x0169
        L_0x0167:
            r20 = 2
        L_0x0169:
            r20 = r13 | r20
            goto L_0x0172
        L_0x016c:
            r28 = r6
            r6 = r46
            r20 = r13
        L_0x0172:
            r6 = r12 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x017f
            r20 = r20 | 48
            r29 = r6
            r2 = r20
            r6 = r47
            goto L_0x019b
        L_0x017f:
            r29 = r13 & 112(0x70, float:1.57E-43)
            if (r29 != 0) goto L_0x0195
            r29 = r6
            r6 = r47
            boolean r30 = r11.mo14927P(r6)
            if (r30 == 0) goto L_0x0190
            r23 = 32
            goto L_0x0192
        L_0x0190:
            r23 = 16
        L_0x0192:
            r20 = r20 | r23
            goto L_0x0199
        L_0x0195:
            r29 = r6
            r6 = r47
        L_0x0199:
            r2 = r20
        L_0x019b:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x01a1
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x01a1:
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01a8
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b7
        L_0x01a8:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x01b7
            boolean r3 = r11.mo14927P(r15)
            if (r3 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r16 = r17
        L_0x01b5:
            r2 = r2 | r16
        L_0x01b7:
            r3 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 != r2) goto L_0x01ef
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r1
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r5) goto L_0x01ef
            r2 = r3 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r2 != r5) goto L_0x01ef
            boolean r2 = r11.mo15011p()
            if (r2 != 0) goto L_0x01d2
            goto L_0x01ef
        L_0x01d2:
            r11.mo14958a0()
            r4 = r39
            r5 = r40
            r6 = r41
            r9 = r44
            r10 = r45
            r12 = r47
            r13 = r48
            r2 = r7
            r3 = r8
            r22 = r11
            r7 = r42
            r8 = r43
            r11 = r46
            goto L_0x0395
        L_0x01ef:
            r11.mo14930Q()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x022c
            boolean r2 = r11.mo14977f0()
            if (r2 == 0) goto L_0x01fd
            goto L_0x022c
        L_0x01fd:
            r11.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0206
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0206:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x020e
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x020e:
            if (r6 == 0) goto L_0x0212
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0212:
            r23 = r39
            r24 = r40
            r25 = r41
            r27 = r42
            r28 = r43
            r29 = r44
            r30 = r45
            r33 = r46
            r31 = r47
            r32 = r48
            r20 = r7
            r21 = r8
            goto L_0x02fc
        L_0x022c:
            if (r4 == 0) goto L_0x0233
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r16 = r2
            goto L_0x0235
        L_0x0233:
            r16 = r7
        L_0x0235:
            r2 = r12 & 4
            r7 = 0
            if (r2 == 0) goto L_0x0247
            r2 = 0
            r4 = 3
            androidx.compose.foundation.pager.PagerState r2 = androidx.compose.foundation.pager.PagerStateKt.m11979i(r7, r2, r11, r7, r4)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r20 = r1
            r17 = r2
            goto L_0x024b
        L_0x0247:
            r20 = r1
            r17 = r8
        L_0x024b:
            if (r9 == 0) goto L_0x0259
            float r1 = (float) r7
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.foundation.layout.i0 r1 = androidx.compose.foundation.layout.PaddingKt.m10014a(r1)
            r23 = r1
            goto L_0x025b
        L_0x0259:
            r23 = r39
        L_0x025b:
            if (r18 == 0) goto L_0x0262
            androidx.compose.foundation.pager.b$a r1 = androidx.compose.foundation.pager.C2651b.C2652a.f7021a
            r18 = r1
            goto L_0x0264
        L_0x0262:
            r18 = r40
        L_0x0264:
            if (r21 == 0) goto L_0x0269
            r21 = r7
            goto L_0x026b
        L_0x0269:
            r21 = r41
        L_0x026b:
            if (r24 == 0) goto L_0x0275
            float r1 = (float) r7
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r24 = r1
            goto L_0x0277
        L_0x0275:
            r24 = r42
        L_0x0277:
            if (r0 == 0) goto L_0x0280
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r0 = r0.mo17068m()
            goto L_0x0282
        L_0x0280:
            r0 = r43
        L_0x0282:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02af
            androidx.compose.foundation.pager.c r1 = androidx.compose.foundation.pager.C2654c.f7025a
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            int r2 = r20 >> 6
            r2 = r2 & 14
            r25 = r2 | r22
            r30 = 30
            r2 = r17
            r31 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r32 = r6
            r6 = r9
            r33 = r7
            r7 = r11
            r8 = r25
            r9 = r30
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = r1.mo9113a(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r20 & r2
            goto L_0x02b9
        L_0x02af:
            r31 = r3
            r32 = r6
            r33 = r7
            r1 = r44
            r2 = r20
        L_0x02b9:
            if (r27 == 0) goto L_0x02bd
            r3 = 1
            goto L_0x02bf
        L_0x02bd:
            r3 = r45
        L_0x02bf:
            if (r28 == 0) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            r33 = r46
        L_0x02c4:
            if (r29 == 0) goto L_0x02c8
            r4 = 0
            goto L_0x02ca
        L_0x02c8:
            r4 = r47
        L_0x02ca:
            if (r32 == 0) goto L_0x02e4
            androidx.compose.foundation.pager.c r5 = androidx.compose.foundation.pager.C2654c.f7025a
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.input.nestedscroll.a r5 = r5.mo9114b(r6)
            r6 = r31
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            goto L_0x02f1
        L_0x02e4:
            r6 = r31
            r32 = r48
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
        L_0x02f1:
            r3 = r6
            r20 = r16
            r25 = r21
            r27 = r24
            r21 = r17
            r24 = r18
        L_0x02fc:
            r11.mo14899E()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "androidx.compose.foundation.pager.VerticalPager (Pager.kt:201)"
            r2 = 26030705(0x18d3271, float:5.18676E-38)
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r0)
        L_0x030d:
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Vertical
            r7 = 0
            int r0 = r1 >> 3
            r2 = r0 & 14
            r2 = r2 | r22
            r4 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r1 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r2 = r2 & r19
            r0 = r0 | r2
            int r2 = r1 << 3
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r2
            r0 = r0 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r4
            r0 = r0 | r2
            int r2 = r1 << 18
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r4
            r17 = r0 | r2
            int r0 = r1 >> 24
            r1 = r0 & 14
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 << 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 128(0x80, float:1.794E-43)
            r0 = r20
            r1 = r21
            r2 = r36
            r3 = r24
            r4 = r27
            r6 = r25
            r8 = r28
            r9 = r23
            r10 = r29
            r22 = r11
            r11 = r30
            r12 = r33
            r13 = r31
            r14 = r32
            r15 = r49
            r16 = r22
            m11898b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x037d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x037d:
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r12 = r31
            r13 = r32
            r11 = r33
        L_0x0395:
            androidx.compose.runtime.t1 r15 = r22.mo15020s()
            if (r15 != 0) goto L_0x039c
            goto L_0x03b7
        L_0x039c:
            androidx.compose.foundation.pager.PagerKt$VerticalPager$1 r14 = new androidx.compose.foundation.pager.PagerKt$VerticalPager$1
            r0 = r14
            r1 = r36
            r34 = r14
            r14 = r49
            r35 = r15
            r15 = r51
            r16 = r52
            r17 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r34
            r0 = r35
            r0.mo15202a(r1)
        L_0x03b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m11900d(int, androidx.compose.ui.m, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.i0, androidx.compose.foundation.pager.b, int, float, androidx.compose.ui.c$b, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.l, androidx.compose.ui.input.nestedscroll.a, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    /* renamed from: k */
    public static final float m11907k(C2366i0 i0Var, Orientation orientation, LayoutDirection layoutDirection) {
        float f;
        float f2;
        Orientation orientation2 = Orientation.Vertical;
        if (orientation == orientation2) {
            f = i0Var.mo8093d();
        } else {
            f = i0Var.mo8091b(layoutDirection);
        }
        if (orientation == orientation2) {
            f2 = i0Var.mo8090a();
        } else {
            f2 = i0Var.mo8092c(layoutDirection);
        }
        return C16483g.m74435M(f + f2);
    }

    /* renamed from: l */
    public static final void m11908l(C11289a<String> aVar) {
    }

    @C8540g
    /* renamed from: m */
    public static final C8767m m11909m(C8767m mVar, PagerState pagerState, boolean z, C8592o oVar, int i) {
        oVar.mo14918M(1509835088);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1509835088, i, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:738)");
        }
        oVar.mo14918M(773894976);
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar));
            oVar.mo14893C(wVar);
            N = wVar;
        }
        oVar.mo15002m0();
        C12074o0 a = ((C8690w) N).mo16831a();
        oVar.mo15002m0();
        C8767m k3 = mVar.mo17224k3(SemanticsModifierKt.m71868c(C8767m.f23478j, false, new PagerKt$pagerSemantics$1(z, pagerState, a), 1, (Object) null));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }

    /* renamed from: n */
    public static final boolean m11910n(PagerState pagerState, C12074o0 o0Var) {
        if (!pagerState.mo7252f()) {
            return false;
        }
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, (C11045c<? super PagerKt$pagerSemantics$performBackwardPaging$1>) null), 3, (Object) null);
        return true;
    }

    /* renamed from: o */
    public static final boolean m11911o(PagerState pagerState, C12074o0 o0Var) {
        if (!pagerState.mo7249a()) {
            return false;
        }
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, (C11045c<? super PagerKt$pagerSemantics$performForwardPaging$1>) null), 3, (Object) null);
        return true;
    }
}
