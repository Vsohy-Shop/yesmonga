package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1968g;
import androidx.compose.p004ui.platform.C15851b;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n76#2:374\n76#2:396\n25#3:375\n460#3,13:408\n473#3,3:428\n25#3:433\n25#3:440\n1114#4,6:376\n1114#4,6:434\n1114#4,6:441\n1549#5:382\n1620#5,3:383\n1620#5,3:386\n67#6,6:389\n73#6:421\n77#6:432\n75#7:395\n76#7,11:397\n89#7:431\n33#8,6:422\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n157#1:374\n316#1:396\n262#1:375\n316#1:408,13\n316#1:428,3\n348#1:433\n361#1:440\n262#1:376,6\n348#1:434,6\n361#1:441,6\n265#1:382\n265#1:383,3\n270#1:386,3\n316#1:389,6\n316#1:421\n316#1:432\n316#1:395\n316#1:397,11\n316#1:431\n318#1:422,6\n*E\n"})
public final class SnackbarHostKt {

    /* renamed from: a */
    public static final int f7835a = 150;

    /* renamed from: b */
    public static final int f7836b = 75;

    /* renamed from: c */
    public static final int f7837c = 0;

    /* renamed from: androidx.compose.material.SnackbarHostKt$a */
    public /* synthetic */ class C2992a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material.SnackbarDuration[] r0 = androidx.compose.material.SnackbarDuration.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Indefinite     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Long     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material.SnackbarDuration r1 = androidx.compose.material.SnackbarDuration.Short     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.C2992a.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13844a(androidx.compose.material.C3052i1 r17, androidx.compose.p004ui.C8767m r18, kotlin.jvm.functions.C11305q<? super androidx.compose.material.C3052i1, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r19, androidx.compose.runtime.C8592o r20, int r21, int r22) {
        /*
            r1 = r17
            r3 = r19
            r4 = r21
            r0 = 2036134589(0x795cf2bd, float:7.170179E34)
            r2 = r20
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r5 = r22 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x0025
            boolean r5 = r2.mo15006n0(r1)
            if (r5 == 0) goto L_0x0022
            r5 = 4
            goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r5 = r5 | r4
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            r6 = r22 & 2
            if (r6 == 0) goto L_0x002d
            r5 = r5 | 48
            goto L_0x0040
        L_0x002d:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0040
            r7 = r18
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x003c
            r8 = 32
            goto L_0x003e
        L_0x003c:
            r8 = 16
        L_0x003e:
            r5 = r5 | r8
            goto L_0x0042
        L_0x0040:
            r7 = r18
        L_0x0042:
            r8 = r22 & 4
            if (r8 == 0) goto L_0x0049
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0049:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0059
            boolean r8 = r2.mo14927P(r3)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r5 = r5 | r8
        L_0x0059:
            r8 = r5 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x006c
            boolean r8 = r2.mo15011p()
            if (r8 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r2.mo14958a0()
            r6 = r7
            goto L_0x0231
        L_0x006c:
            if (r6 == 0) goto L_0x0071
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0072
        L_0x0071:
            r6 = r7
        L_0x0072:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x007e
            r7 = -1
            java.lang.String r8 = "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r7, r8)
        L_0x007e:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r0)
            java.lang.Object r0 = r2.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r0 != r7) goto L_0x0098
            androidx.compose.material.k0 r0 = new androidx.compose.material.k0
            r0.<init>()
            r2.mo14893C(r0)
        L_0x0098:
            r2.mo15002m0()
            androidx.compose.material.k0 r0 = (androidx.compose.material.C7874k0) r0
            java.lang.Object r7 = r0.mo10851a()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r7)
            r8 = 1
            if (r7 != 0) goto L_0x011e
            r0.mo10854d(r1)
            java.util.List r7 = r0.mo10852b()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = kotlin.collections.C10978t.m41495Y(r7, r10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x00c0:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00d6
            java.lang.Object r10 = r7.next()
            androidx.compose.material.j0 r10 = (androidx.compose.material.C7871j0) r10
            java.lang.Object r10 = r10.mo10844e()
            androidx.compose.material.i1 r10 = (androidx.compose.material.C3052i1) r10
            r9.add(r10)
            goto L_0x00c0
        L_0x00d6:
            java.util.List r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r9)
            boolean r9 = r7.contains(r1)
            if (r9 != 0) goto L_0x00e3
            r7.add(r1)
        L_0x00e3:
            java.util.List r9 = r0.mo10852b()
            r9.clear()
            r9 = r7
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40664n2(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r10 = r0.mo10852b()
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.Iterator r9 = r9.iterator()
        L_0x00fd:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x011e
            java.lang.Object r11 = r9.next()
            androidx.compose.material.i1 r11 = (androidx.compose.material.C3052i1) r11
            androidx.compose.material.j0 r12 = new androidx.compose.material.j0
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1 r13 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
            r13.<init>(r11, r1, r7, r0)
            r14 = -94104314(0xfffffffffa641506, float:-2.9606752E35)
            androidx.compose.runtime.internal.a r13 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r14, r8, r13)
            r12.<init>(r11, r13)
            r10.add(r12)
            goto L_0x00fd
        L_0x011e:
            int r7 = r5 >> 3
            r7 = r7 & 14
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r9)
            androidx.compose.ui.c$a r9 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r9 = r9.mo17061C()
            int r10 = r7 >> 3
            r11 = r10 & 14
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            r11 = 0
            androidx.compose.ui.layout.f0 r9 = androidx.compose.foundation.layout.BoxKt.m9849k(r9, r11, r2, r10)
            int r7 = r7 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r10)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r2.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r12 = r2.mo15032w(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p004ui.unit.LayoutDirection) r12
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r15 = r14.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r16 = 6
            r7 = r7 | 6
            androidx.compose.runtime.d r11 = r2.mo15017r()
            boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
            if (r11 != 0) goto L_0x017f
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x017f:
            r2.mo14938T()
            boolean r11 = r2.mo14997l()
            if (r11 == 0) goto L_0x018c
            r2.mo14947W(r15)
            goto L_0x018f
        L_0x018c:
            r2.mo14888A()
        L_0x018f:
            r2.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r2)
            kotlin.jvm.functions.p r15 = r14.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r15)
            kotlin.jvm.functions.p r9 = r14.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r9)
            kotlin.jvm.functions.p r9 = r14.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r12, r9)
            kotlin.jvm.functions.p r9 = r14.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r13, r9)
            r2.mo14972e()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.C8684u1.m31906b(r2)
            androidx.compose.runtime.u1 r9 = androidx.compose.runtime.C8684u1.m31905a(r9)
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.invoke(r9, r2, r7)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r7)
            androidx.compose.foundation.layout.BoxScopeInstance r7 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r7 = 0
            androidx.compose.runtime.m1 r8 = androidx.compose.runtime.ComposablesKt.m29518m(r2, r7)
            r0.mo10856f(r8)
            r8 = -1656513320(0xffffffff9d439cd8, float:-2.5889121E-21)
            r2.mo14918M(r8)
            java.util.List r0 = r0.mo10852b()
            int r8 = r0.size()
            r11 = r7
        L_0x01e7:
            if (r11 >= r8) goto L_0x0219
            java.lang.Object r7 = r0.get(r11)
            androidx.compose.material.j0 r7 = (androidx.compose.material.C7871j0) r7
            java.lang.Object r9 = r7.mo10841a()
            androidx.compose.material.i1 r9 = (androidx.compose.material.C3052i1) r9
            kotlin.jvm.functions.q r7 = r7.mo10842b()
            r10 = -208579897(0xfffffffff39152c7, float:-2.3027404E31)
            r2.mo14933R(r10, r9)
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 r10 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
            r10.<init>(r3, r9, r5)
            r9 = 2041982076(0x79b62c7c, float:1.1823753E35)
            r12 = 1
            androidx.compose.runtime.internal.a r9 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r9, r12, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            r7.invoke(r9, r2, r10)
            r2.mo14998l0()
            int r11 = r11 + 1
            goto L_0x01e7
        L_0x0219:
            r2.mo15002m0()
            r2.mo15002m0()
            r2.mo14896D()
            r2.mo15002m0()
            r2.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0231
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0231:
            androidx.compose.runtime.t1 r7 = r2.mo15020s()
            if (r7 != 0) goto L_0x0238
            goto L_0x024a
        L_0x0238:
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3 r8 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
            r0 = r8
            r1 = r17
            r2 = r6
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mo15202a(r8)
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.m13844a(androidx.compose.material.i1, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13845b(@org.jetbrains.annotations.C12579k androidx.compose.material.SnackbarHostState r7, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r8, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material.C3052i1, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r9, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r10, int r11, int r12) {
        /*
            java.lang.String r0 = "hostState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 431012348(0x19b0b9fc, float:1.8273092E-23)
            androidx.compose.runtime.o r10 = r10.mo15009o(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r11 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0022
            boolean r1 = r10.mo15006n0(r7)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r11
            goto L_0x0023
        L_0x0022:
            r1 = r11
        L_0x0023:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x002a
            r1 = r1 | 48
            goto L_0x003a
        L_0x002a:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003a
            boolean r3 = r10.mo15006n0(r8)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r1 = r1 | r3
        L_0x003a:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0051
        L_0x0041:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0051
            boolean r4 = r10.mo14927P(r9)
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
            if (r4 != r5) goto L_0x0064
            boolean r4 = r10.mo15011p()
            if (r4 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            r10.mo14958a0()
        L_0x0061:
            r3 = r8
            r4 = r9
            goto L_0x00b1
        L_0x0064:
            if (r2 == 0) goto L_0x0068
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
        L_0x0068:
            if (r3 == 0) goto L_0x0070
            androidx.compose.material.ComposableSingletons$SnackbarHostKt r9 = androidx.compose.material.ComposableSingletons$SnackbarHostKt.f7606a
            kotlin.jvm.functions.q r9 = r9.mo10113a()
        L_0x0070:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x007c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x007c:
            androidx.compose.material.i1 r0 = r7.mo10434b()
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71005c()
            java.lang.Object r2 = r10.mo15032w(r2)
            androidx.compose.ui.platform.b r2 = (androidx.compose.p004ui.platform.C15851b) r2
            androidx.compose.material.SnackbarHostKt$SnackbarHost$1 r3 = new androidx.compose.material.SnackbarHostKt$SnackbarHost$1
            r4 = 0
            r3.<init>(r0, r2, r4)
            r2 = 64
            androidx.compose.runtime.EffectsKt.m29896h(r0, r3, r10, r2)
            androidx.compose.material.i1 r0 = r7.mo10434b()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r2 | r1
            r6 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            m13844a(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0061
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x0061
        L_0x00b1:
            androidx.compose.runtime.t1 r8 = r10.mo15020s()
            if (r8 != 0) goto L_0x00b8
            goto L_0x00c4
        L_0x00b8:
            androidx.compose.material.SnackbarHostKt$SnackbarHost$2 r9 = new androidx.compose.material.SnackbarHostKt$SnackbarHost$2
            r1 = r9
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8.mo15202a(r9)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.m13845b(androidx.compose.material.SnackbarHostState, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    /* renamed from: f */
    public static final C8578k2<Float> m13849f(C1968g<Float> gVar, boolean z, C11289a<C11079d2> aVar, C8592o oVar, int i, int i2) {
        float f;
        oVar.mo14918M(1016418159);
        if ((i2 & 4) != 0) {
            aVar = SnackbarHostKt$animatedOpacity$1.f7838f;
        }
        C11289a<C11079d2> aVar2 = aVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            N = C1946b.m8288b(f, 0.0f, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Animatable animatable = (Animatable) N;
        EffectsKt.m29896h(Boolean.valueOf(z), new SnackbarHostKt$animatedOpacity$2(animatable, z, gVar, aVar2, (C11045c<? super SnackbarHostKt$animatedOpacity$2>) null), oVar, ((i >> 3) & 14) | 64);
        C8578k2<Float> j = animatable.mo6602j();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j;
    }

    @C8540g
    /* renamed from: g */
    public static final C8578k2<Float> m13850g(C1968g<Float> gVar, boolean z, C8592o oVar, int i) {
        float f;
        oVar.mo14918M(2003504988);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            N = C1946b.m8288b(f, 0.0f, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        Animatable animatable = (Animatable) N;
        EffectsKt.m29896h(Boolean.valueOf(z), new SnackbarHostKt$animatedScale$1(animatable, z, gVar, (C11045c<? super SnackbarHostKt$animatedScale$1>) null), oVar, ((i >> 3) & 14) | 64);
        C8578k2<Float> j = animatable.mo6602j();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j;
    }

    /* renamed from: h */
    public static final long m13851h(@C12579k SnackbarDuration snackbarDuration, boolean z, @C12580l C15851b bVar) {
        long j;
        Intrinsics.checkNotNullParameter(snackbarDuration, "<this>");
        int i = C2992a.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else if (i == 3) {
            j = 4000;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = j;
        if (bVar == null) {
            return j2;
        }
        return bVar.mo45677b(j2, true, true, z);
    }
}
