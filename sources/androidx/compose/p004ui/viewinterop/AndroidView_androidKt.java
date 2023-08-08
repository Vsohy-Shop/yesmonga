package androidx.compose.p004ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.C8624c;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.C19499w;
import androidx.savedstate.C20437e;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,374:1\n25#2:375\n251#2,10:386\n25#2:396\n286#2,10:407\n1114#3,6:376\n1114#3,6:397\n76#4:382\n76#4:383\n76#4:384\n76#4:385\n76#4:403\n76#4:404\n76#4:405\n76#4:406\n76#4:417\n76#4:418\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n101#1:375\n115#1:386,10\n204#1:396\n219#1:407,10\n101#1:376,6\n204#1:397,6\n105#1:382\n106#1:383\n112#1:384\n113#1:385\n209#1:403\n210#1:404\n216#1:405\n217#1:406\n241#1:417\n243#1:418\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt */
public final class AndroidView_androidKt {
    @C12579k

    /* renamed from: a */
    public static final C11300l<View, C11079d2> f40950a = AndroidView_androidKt$NoOpUpdate$1.f40956f;
    @C12579k

    /* renamed from: b */
    public static final C16519a f40951b = new C16519a();

    /* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$a */
    public static final class C16519a implements C15446a {
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    @androidx.compose.runtime.C8540g
    @androidx.compose.p004ui.C8782q
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void m74829a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super android.content.Context, ? extends T> r9, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r10, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super T, kotlin.C11079d2> r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13, int r14) {
        /*
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            androidx.compose.runtime.o r12 = r12.mo15009o(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r13 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0022
            boolean r1 = r12.mo14927P(r9)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r13
            goto L_0x0023
        L_0x0022:
            r1 = r13
        L_0x0023:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x002a
            r1 = r1 | 48
            goto L_0x003a
        L_0x002a:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003a
            boolean r3 = r12.mo15006n0(r10)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r1 = r1 | r3
        L_0x003a:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0051
        L_0x0041:
            r4 = r13 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0051
            boolean r4 = r12.mo14927P(r11)
            if (r4 == 0) goto L_0x004e
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r1 = r1 | r4
        L_0x0051:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0065
            boolean r4 = r12.mo15011p()
            if (r4 != 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            r12.mo14958a0()
        L_0x0061:
            r3 = r10
            r4 = r11
            goto L_0x011a
        L_0x0065:
            if (r2 == 0) goto L_0x0069
            androidx.compose.ui.m$a r10 = androidx.compose.p004ui.C8767m.f23478j
        L_0x0069:
            if (r3 == 0) goto L_0x006d
            kotlin.jvm.functions.l<android.view.View, kotlin.d2> r11 = f40950a
        L_0x006d:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0079
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:95)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0079:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo14918M(r0)
            java.lang.Object r0 = r12.mo14921N()
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r0 != r2) goto L_0x0093
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r0.<init>()
            r12.mo14893C(r0)
        L_0x0093:
            r12.mo15002m0()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher) r0
            androidx.compose.ui.viewinterop.AndroidView_androidKt$a r2 = f40951b
            androidx.compose.ui.m r2 = androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt.m68304a(r10, r2, r0)
            androidx.compose.ui.m r4 = androidx.compose.p004ui.ComposedModifierKt.m32288k(r12, r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r12.mo15032w(r2)
            r5 = r2
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r12.mo15032w(r2)
            r8 = r2
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p004ui.unit.LayoutDirection) r8
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r2 = r12.mo15032w(r2)
            r6 = r2
            androidx.lifecycle.w r6 = (androidx.lifecycle.C19499w) r6
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70955j()
            java.lang.Object r2 = r12.mo15032w(r2)
            r7 = r2
            androidx.savedstate.e r7 = (androidx.savedstate.C20437e) r7
            r1 = r1 & 14
            r1 = r1 | 64
            kotlin.jvm.functions.a r0 = m74832d(r9, r0, r12, r1)
            r1 = 1886828752(0x7076b8d0, float:3.0542695E29)
            r12.mo14918M(r1)
            androidx.compose.runtime.d r1 = r12.mo15017r()
            boolean r1 = r1 instanceof androidx.compose.p004ui.node.C15715n1
            if (r1 != 0) goto L_0x00e7
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00e7:
            r12.mo15026u()
            boolean r1 = r12.mo14997l()
            if (r1 == 0) goto L_0x00f9
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
            r1.<init>(r0)
            r12.mo14947W(r1)
            goto L_0x00fc
        L_0x00f9:
            r12.mo14888A()
        L_0x00fc:
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r12)
            r3 = r0
            m74835g(r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1$1 r1 = androidx.compose.p004ui.viewinterop.AndroidView_androidKt$AndroidView$1$1.f40952f
            androidx.compose.runtime.Updater.m30188j(r0, r11, r1)
            r12.mo14896D()
            r12.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0061
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x0061
        L_0x011a:
            androidx.compose.runtime.t1 r10 = r12.mo15020s()
            if (r10 != 0) goto L_0x0121
            goto L_0x012d
        L_0x0121:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2 r11 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2
            r1 = r11
            r2 = r9
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r10.mo15202a(r11)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.viewinterop.AndroidView_androidKt.m74829a(kotlin.jvm.functions.l, androidx.compose.ui.m, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.p004ui.C8782q
    @androidx.compose.runtime.C8540g
    @androidx.compose.p004ui.C8761g
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void m74830b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super android.content.Context, ? extends T> r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super T, kotlin.C11079d2> r19, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r20, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super T, kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super T, kotlin.C11079d2> r22, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r1 = r18
            r2 = r19
            r6 = r24
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onReset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -841537049(0xffffffffcdd729e7, float:-4.51230944E8)
            r3 = r23
            androidx.compose.runtime.o r3 = r3.mo15009o(r0)
            r4 = r25 & 1
            if (r4 == 0) goto L_0x0020
            r4 = r6 | 6
            goto L_0x0030
        L_0x0020:
            r4 = r6 & 14
            if (r4 != 0) goto L_0x002f
            boolean r4 = r3.mo14927P(r1)
            if (r4 == 0) goto L_0x002c
            r4 = 4
            goto L_0x002d
        L_0x002c:
            r4 = 2
        L_0x002d:
            r4 = r4 | r6
            goto L_0x0030
        L_0x002f:
            r4 = r6
        L_0x0030:
            r5 = r25 & 2
            if (r5 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x0047
        L_0x0037:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0047
            boolean r5 = r3.mo14927P(r2)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r4 = r4 | r5
        L_0x0047:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x004e
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r20
            boolean r8 = r3.mo15006n0(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r4 = r4 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r20
        L_0x0063:
            r8 = r25 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007d
            r9 = r21
            boolean r10 = r3.mo14927P(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r10
            goto L_0x007f
        L_0x007d:
            r9 = r21
        L_0x007f:
            r10 = r25 & 16
            if (r10 == 0) goto L_0x0086
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r6
            if (r11 != 0) goto L_0x009b
            r11 = r22
            boolean r12 = r3.mo14927P(r11)
            if (r12 == 0) goto L_0x0097
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r12
            goto L_0x009d
        L_0x009b:
            r11 = r22
        L_0x009d:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r4
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00b3
            boolean r12 = r3.mo15011p()
            if (r12 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r3.mo14958a0()
            r5 = r7
        L_0x00b0:
            r4 = r9
            goto L_0x017c
        L_0x00b3:
            if (r5 == 0) goto L_0x00b8
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00b9
        L_0x00b8:
            r5 = r7
        L_0x00b9:
            if (r8 == 0) goto L_0x00be
            kotlin.jvm.functions.l<android.view.View, kotlin.d2> r7 = f40950a
            r9 = r7
        L_0x00be:
            if (r10 == 0) goto L_0x00c3
            kotlin.jvm.functions.l<android.view.View, kotlin.d2> r7 = f40950a
            r11 = r7
        L_0x00c3:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x00cf
            r7 = -1
            java.lang.String r8 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:187)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r7, r8)
        L_0x00cf:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r0)
            java.lang.Object r0 = r3.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r0 != r7) goto L_0x00e9
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r0.<init>()
            r3.mo14893C(r0)
        L_0x00e9:
            r3.mo15002m0()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher) r0
            androidx.compose.ui.viewinterop.AndroidView_androidKt$a r7 = f40951b
            androidx.compose.ui.m r7 = androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt.m68304a(r5, r7, r0)
            androidx.compose.ui.m r13 = androidx.compose.p004ui.ComposedModifierKt.m32288k(r3, r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r3.mo15032w(r7)
            r14 = r7
            androidx.compose.ui.unit.d r14 = (androidx.compose.p004ui.unit.C16479d) r14
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r3.mo15032w(r7)
            r17 = r7
            androidx.compose.ui.unit.LayoutDirection r17 = (androidx.compose.p004ui.unit.LayoutDirection) r17
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70954i()
            java.lang.Object r7 = r3.mo15032w(r7)
            r15 = r7
            androidx.lifecycle.w r15 = (androidx.lifecycle.C19499w) r15
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70955j()
            java.lang.Object r7 = r3.mo15032w(r7)
            r16 = r7
            androidx.savedstate.e r16 = (androidx.savedstate.C20437e) r16
            r4 = r4 & 14
            r4 = r4 | 64
            kotlin.jvm.functions.a r0 = m74832d(r1, r0, r3, r4)
            r4 = 1405779621(0x53ca7ea5, float:1.73941627E12)
            r3.mo14918M(r4)
            androidx.compose.runtime.d r4 = r3.mo15017r()
            boolean r4 = r4 instanceof androidx.compose.p004ui.node.C15715n1
            if (r4 != 0) goto L_0x013f
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x013f:
            r3.mo14938T()
            boolean r4 = r3.mo14997l()
            if (r4 == 0) goto L_0x0151
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1 r4 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
            r4.<init>(r0)
            r3.mo14947W(r4)
            goto L_0x0154
        L_0x0151:
            r3.mo14888A()
        L_0x0154:
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r3)
            r12 = r0
            m74835g(r12, r13, r14, r15, r16, r17)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1 r4 = androidx.compose.p004ui.viewinterop.AndroidView_androidKt$AndroidView$3$1.f40953f
            androidx.compose.runtime.Updater.m30188j(r0, r2, r4)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2 r4 = androidx.compose.p004ui.viewinterop.AndroidView_androidKt$AndroidView$3$2.f40954f
            androidx.compose.runtime.Updater.m30188j(r0, r9, r4)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$3 r4 = androidx.compose.p004ui.viewinterop.AndroidView_androidKt$AndroidView$3$3.f40955f
            androidx.compose.runtime.Updater.m30188j(r0, r11, r4)
            r3.mo14896D()
            r3.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00b0
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x00b0
        L_0x017c:
            androidx.compose.runtime.t1 r8 = r3.mo15020s()
            if (r8 != 0) goto L_0x0183
            goto L_0x0196
        L_0x0183:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4 r9 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = r5
            r5 = r11
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.viewinterop.AndroidView_androidKt.m74830b(kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.ui.m, kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    /* renamed from: d */
    public static final <T extends View> C11289a<LayoutNode> m74832d(C11300l<? super Context, ? extends T> lVar, NestedScrollDispatcher nestedScrollDispatcher, C8592o oVar, int i) {
        oVar.mo14918M(-430628662);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-430628662, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:236)");
        }
        AndroidView_androidKt$createAndroidViewNodeFactory$1 androidView_androidKt$createAndroidViewNodeFactory$1 = new AndroidView_androidKt$createAndroidViewNodeFactory$1((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g()), lVar, ComposablesKt.m29526u(oVar, 0), nestedScrollDispatcher, (C8624c) oVar.mo15032w(SaveableStateRegistryKt.m31373b()), String.valueOf(ComposablesKt.m29515j(oVar, 0)));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return androidView_androidKt$createAndroidViewNodeFactory$1;
    }

    @C12579k
    /* renamed from: e */
    public static final C11300l<View, C11079d2> m74833e() {
        return f40950a;
    }

    /* renamed from: f */
    public static final <T extends View> ViewFactoryHolder<T> m74834f(LayoutNode layoutNode) {
        AndroidViewHolder h0 = layoutNode.mo44681h0();
        if (h0 != null) {
            Intrinsics.checkNotNull(h0, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
            return (ViewFactoryHolder) h0;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: g */
    public static final <T extends View> void m74835g(C8592o oVar, C8767m mVar, C16479d dVar, C19499w wVar, C20437e eVar, LayoutDirection layoutDirection) {
        Updater.m30188j(oVar, mVar, AndroidView_androidKt$updateViewHolderParams$1.f40957f);
        Updater.m30188j(oVar, dVar, AndroidView_androidKt$updateViewHolderParams$2.f40958f);
        Updater.m30188j(oVar, wVar, AndroidView_androidKt$updateViewHolderParams$3.f40959f);
        Updater.m30188j(oVar, eVar, AndroidView_androidKt$updateViewHolderParams$4.f40960f);
        Updater.m30188j(oVar, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.f40961f);
    }
}
