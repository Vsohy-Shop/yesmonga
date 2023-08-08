package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.layout.SubcomposeLayoutKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import com.urbanairship.util.C9647e0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,614:1\n25#2:615\n67#2,3:622\n66#2:625\n25#2:638\n50#2:649\n49#2:650\n83#2,3:657\n1114#3,6:616\n1114#3,6:626\n1114#3,3:639\n1117#3,3:645\n1114#3,6:651\n1114#3,6:660\n76#4:632\n1#5:633\n474#6,4:634\n478#6,2:642\n482#6:648\n474#7:644\n154#8:666\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n*L\n243#1:615\n245#1:622,3\n245#1:625\n411#1:638\n412#1:649\n412#1:650\n488#1:657,3\n243#1:616,6\n245#1:626,6\n411#1:639,3\n411#1:645,3\n412#1:651,6\n488#1:660,6\n328#1:632\n411#1:634,4\n411#1:642,2\n411#1:648\n411#1:644\n614#1:666\n*E\n"})
public final class BottomSheetScaffoldKt {

    /* renamed from: a */
    public static final float f7545a = C16483g.m74435M((float) 16);

    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$a */
    public static final class C2884a implements C3025a<BottomSheetValue> {

        /* renamed from: a */
        public final /* synthetic */ BottomSheetState f7546a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<BottomSheetValue, C11079d2> f7547b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<BottomSheetValue, C11079d2> f7548c;

        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$a$a */
        public /* synthetic */ class C2885a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    androidx.compose.material.BottomSheetValue[] r0 = androidx.compose.material.BottomSheetValue.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Collapsed     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.C2884a.C2885a.<clinit>():void");
            }
        }

        public C2884a(BottomSheetState bottomSheetState, C11300l<? super BottomSheetValue, C11079d2> lVar, C11300l<? super BottomSheetValue, C11079d2> lVar2) {
            this.f7546a = bottomSheetState;
            this.f7547b = lVar;
            this.f7548c = lVar2;
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<androidx.compose.material.BottomSheetValue, java.lang.Float>, java.util.Map, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo10032a(@org.jetbrains.annotations.C12579k androidx.compose.material.BottomSheetValue r2, @org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.material.BottomSheetValue, java.lang.Float> r3, @org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.material.BottomSheetValue, java.lang.Float> r4) {
            /*
                r1 = this;
                java.lang.String r0 = "previousTarget"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "previousAnchors"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "newAnchors"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.Object r3 = r3.get(r2)
                java.lang.Float r3 = (java.lang.Float) r3
                int[] r0 = androidx.compose.material.BottomSheetScaffoldKt.C2884a.C2885a.$EnumSwitchMapping$0
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L_0x0035
                r0 = 2
                if (r2 != r0) goto L_0x002f
                androidx.compose.material.BottomSheetValue r2 = androidx.compose.material.BottomSheetValue.Expanded
                boolean r0 = r4.containsKey(r2)
                if (r0 == 0) goto L_0x002c
                goto L_0x0037
            L_0x002c:
                androidx.compose.material.BottomSheetValue r2 = androidx.compose.material.BottomSheetValue.Collapsed
                goto L_0x0037
            L_0x002f:
                kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                r2.<init>()
                throw r2
            L_0x0035:
                androidx.compose.material.BottomSheetValue r2 = androidx.compose.material.BottomSheetValue.Collapsed
            L_0x0037:
                java.lang.Object r4 = kotlin.collections.C10977s0.m41443K(r4, r2)
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((float) r4, (java.lang.Float) r3)
                if (r3 != 0) goto L_0x005a
                androidx.compose.material.BottomSheetState r3 = r1.f7546a
                boolean r3 = r3.mo10068j()
                if (r3 == 0) goto L_0x0055
                kotlin.jvm.functions.l<androidx.compose.material.BottomSheetValue, kotlin.d2> r3 = r1.f7547b
                r3.invoke(r2)
                goto L_0x005a
            L_0x0055:
                kotlin.jvm.functions.l<androidx.compose.material.BottomSheetValue, kotlin.d2> r3 = r1.f7548c
                r3.invoke(r2)
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.C2884a.mo10032a(androidx.compose.material.BottomSheetValue, java.util.Map, java.util.Map):void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0121  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13291a(androidx.compose.material.BottomSheetState r26, boolean r27, kotlin.jvm.functions.C11304p<? super androidx.compose.material.BottomSheetValue, ? super androidx.compose.p004ui.unit.C16500q, java.lang.Float> r28, androidx.compose.p004ui.graphics.C15218g4 r29, float r30, long r31, long r33, androidx.compose.p004ui.C8767m r35, kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r36, androidx.compose.runtime.C8592o r37, int r38, int r39) {
        /*
            r1 = r26
            r3 = r28
            r11 = r36
            r12 = r38
            r13 = r39
            r0 = 2101692940(0x7d454a0c, float:1.6390149E37)
            r2 = r37
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x001a
            r4 = r12 | 6
            goto L_0x002a
        L_0x001a:
            r4 = r12 & 14
            if (r4 != 0) goto L_0x0029
            boolean r4 = r2.mo15006n0(r1)
            if (r4 == 0) goto L_0x0026
            r4 = 4
            goto L_0x0027
        L_0x0026:
            r4 = 2
        L_0x0027:
            r4 = r4 | r12
            goto L_0x002a
        L_0x0029:
            r4 = r12
        L_0x002a:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0031
            r4 = r4 | 48
            goto L_0x0044
        L_0x0031:
            r6 = r12 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0044
            r6 = r27
            boolean r7 = r2.mo14961b(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r4 = r4 | r7
            goto L_0x0046
        L_0x0044:
            r6 = r27
        L_0x0046:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004d:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005d
            boolean r7 = r2.mo14927P(r3)
            if (r7 == 0) goto L_0x005a
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r4 = r4 | r7
        L_0x005d:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0064
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0077
        L_0x0064:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0077
            r7 = r29
            boolean r8 = r2.mo15006n0(r7)
            if (r8 == 0) goto L_0x0073
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r4 = r4 | r8
            goto L_0x0079
        L_0x0077:
            r7 = r29
        L_0x0079:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x0080
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0095
        L_0x0080:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r12
            if (r8 != 0) goto L_0x0095
            r8 = r30
            boolean r9 = r2.mo14968d(r8)
            if (r9 == 0) goto L_0x0091
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r9
            goto L_0x0097
        L_0x0095:
            r8 = r30
        L_0x0097:
            r9 = r13 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00a3
            r9 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r9
            r14 = r31
            goto L_0x00b5
        L_0x00a3:
            r9 = r12 & r10
            r14 = r31
            if (r9 != 0) goto L_0x00b5
            boolean r9 = r2.mo14980g(r14)
            if (r9 == 0) goto L_0x00b2
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r4 = r4 | r9
        L_0x00b5:
            r9 = r13 & 64
            r22 = 1572864(0x180000, float:2.204052E-39)
            if (r9 == 0) goto L_0x00c0
            r4 = r4 | r22
            r5 = r33
            goto L_0x00d3
        L_0x00c0:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r12
            r5 = r33
            if (r9 != 0) goto L_0x00d3
            boolean r9 = r2.mo14980g(r5)
            if (r9 == 0) goto L_0x00d0
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r9 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r4 = r4 | r9
        L_0x00d3:
            r9 = r13 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x00de
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r16
            r10 = r35
            goto L_0x00f3
        L_0x00de:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r12 & r16
            r10 = r35
            if (r16 != 0) goto L_0x00f3
            boolean r16 = r2.mo15006n0(r10)
            if (r16 == 0) goto L_0x00ef
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r4 = r4 | r16
        L_0x00f3:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00fb
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00f9:
            r4 = r4 | r0
            goto L_0x010c
        L_0x00fb:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x010c
            boolean r0 = r2.mo14927P(r11)
            if (r0 == 0) goto L_0x0109
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f9
        L_0x0109:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00f9
        L_0x010c:
            r0 = 191739611(0xb6db6db, float:4.5782105E-32)
            r0 = r0 & r4
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r5) goto L_0x0121
            boolean r0 = r2.mo15011p()
            if (r0 != 0) goto L_0x011c
            goto L_0x0121
        L_0x011c:
            r2.mo14958a0()
            goto L_0x0210
        L_0x0121:
            if (r9 == 0) goto L_0x0126
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r10 = r0
        L_0x0126:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0135
            r0 = -1
            java.lang.String r5 = "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:399)"
            r6 = 2101692940(0x7d454a0c, float:1.6390149E37)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r4, r0, r5)
        L_0x0135:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r2.mo14918M(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo14918M(r0)
            java.lang.Object r0 = r2.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r5.mo16277a()
            if (r0 != r6) goto L_0x015c
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r0 = androidx.compose.runtime.EffectsKt.m29901m(r0, r2)
            androidx.compose.runtime.w r6 = new androidx.compose.runtime.w
            r6.<init>(r0)
            r2.mo14893C(r6)
            r0 = r6
        L_0x015c:
            r2.mo15002m0()
            androidx.compose.runtime.w r0 = (androidx.compose.runtime.C8690w) r0
            kotlinx.coroutines.o0 r0 = r0.mo16831a()
            r2.mo15002m0()
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2.mo14918M(r6)
            boolean r6 = r2.mo15006n0(r1)
            boolean r9 = r2.mo15006n0(r0)
            r6 = r6 | r9
            java.lang.Object r9 = r2.mo14921N()
            if (r6 != 0) goto L_0x0183
            java.lang.Object r5 = r5.mo16277a()
            if (r9 != r5) goto L_0x0194
        L_0x0183:
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$anchorChangeHandler$1$1 r5 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$anchorChangeHandler$1$1
            r5.<init>(r0, r1)
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$anchorChangeHandler$1$2 r6 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$anchorChangeHandler$1$2
            r6.<init>(r0, r1)
            androidx.compose.material.a r9 = m13293c(r1, r5, r6)
            r2.mo14893C(r9)
        L_0x0194:
            r2.mo15002m0()
            androidx.compose.material.a r9 = (androidx.compose.material.C3025a) r9
            androidx.compose.material.SwipeableV2State r5 = r26.mo10067i()
            androidx.compose.foundation.gestures.Orientation r16 = androidx.compose.foundation.gestures.Orientation.Vertical
            r18 = 0
            r19 = 0
            r20 = 24
            r21 = 0
            r14 = r10
            r15 = r5
            r17 = r27
            androidx.compose.ui.m r5 = androidx.compose.material.SwipeableV2Kt.m14001o(r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.compose.material.SwipeableV2State r6 = r26.mo10067i()
            r14 = 2
            androidx.compose.material.BottomSheetValue[] r14 = new androidx.compose.material.BottomSheetValue[r14]
            androidx.compose.material.BottomSheetValue r15 = androidx.compose.material.BottomSheetValue.Collapsed
            r7 = 0
            r14[r7] = r15
            androidx.compose.material.BottomSheetValue r15 = androidx.compose.material.BottomSheetValue.Expanded
            r7 = 1
            r14[r7] = r15
            java.util.Set r14 = kotlin.collections.C10930d1.m40902u(r14)
            androidx.compose.ui.m r5 = androidx.compose.material.SwipeableV2Kt.m13998l(r5, r6, r14, r9, r3)
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1 r6 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1
            r6.<init>(r1, r0)
            r0 = 0
            r9 = 0
            androidx.compose.ui.m r14 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r5, r9, r6, r7, r0)
            r20 = 0
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2 r0 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2
            r0.<init>(r11, r4)
            r5 = -1655326136(0xffffffff9d55ba48, float:-2.828662E-21)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r5, r7, r0)
            int r5 = r4 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | r22
            int r6 = r4 >> 9
            r7 = r6 & 896(0x380, float:1.256E-42)
            r5 = r5 | r7
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            int r4 = r4 << 3
            r6 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r6
            r24 = r5 | r4
            r25 = 16
            r15 = r29
            r16 = r31
            r18 = r33
            r21 = r30
            r22 = r0
            r23 = r2
            androidx.compose.material.SurfaceKt.m13879b(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0210
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0210:
            androidx.compose.runtime.t1 r14 = r2.mo15020s()
            if (r14 != 0) goto L_0x0217
            goto L_0x0234
        L_0x0217:
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3 r15 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3
            r0 = r15
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r8 = r33
            r11 = r36
            r12 = r38
            r13 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)
            r14.mo15202a(r15)
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m13291a(androidx.compose.material.BottomSheetState, boolean, kotlin.jvm.functions.p, androidx.compose.ui.graphics.g4, float, long, long, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0611  */
    /* JADX WARNING: Removed duplicated region for block: B:366:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0144  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13292b(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r41, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r42, @org.jetbrains.annotations.C12580l androidx.compose.material.C3043g r43, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r46, int r47, boolean r48, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r49, float r50, long r51, long r53, float r55, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r56, boolean r57, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r58, float r59, long r60, long r62, long r64, long r66, long r68, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2366i0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r70, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r71, int r72, int r73, int r74, int r75) {
        /*
            r1 = r41
            r15 = r70
            r13 = r72
            r14 = r73
            r11 = r74
            r12 = r75
            java.lang.String r0 = "sheetContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 46422755(0x2c45ae3, float:2.8851778E-37)
            r2 = r71
            androidx.compose.runtime.o r0 = r2.mo15009o(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0026
            r2 = r13 | 6
            goto L_0x0036
        L_0x0026:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x0035
            boolean r2 = r0.mo14927P(r1)
            if (r2 == 0) goto L_0x0032
            r2 = 4
            goto L_0x0033
        L_0x0032:
            r2 = 2
        L_0x0033:
            r2 = r2 | r13
            goto L_0x0036
        L_0x0035:
            r2 = r13
        L_0x0036:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x003d
            r2 = r2 | 48
            goto L_0x0050
        L_0x003d:
            r8 = r13 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0050
            r8 = r42
            boolean r9 = r0.mo15006n0(r8)
            if (r9 == 0) goto L_0x004c
            r9 = 32
            goto L_0x004e
        L_0x004c:
            r9 = 16
        L_0x004e:
            r2 = r2 | r9
            goto L_0x0052
        L_0x0050:
            r8 = r42
        L_0x0052:
            r9 = r13 & 896(0x380, float:1.256E-42)
            r16 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x006e
            r9 = r12 & 4
            if (r9 != 0) goto L_0x0067
            r9 = r43
            boolean r17 = r0.mo15006n0(r9)
            if (r17 == 0) goto L_0x0069
            r17 = r16
            goto L_0x006b
        L_0x0067:
            r9 = r43
        L_0x0069:
            r17 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r2 = r2 | r17
            goto L_0x0070
        L_0x006e:
            r9 = r43
        L_0x0070:
            r17 = r12 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x007b
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x008f
        L_0x007b:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x008f
            r3 = r44
            boolean r20 = r0.mo14927P(r3)
            if (r20 == 0) goto L_0x008a
            r20 = r18
            goto L_0x008c
        L_0x008a:
            r20 = r19
        L_0x008c:
            r2 = r2 | r20
            goto L_0x0091
        L_0x008f:
            r3 = r44
        L_0x0091:
            r20 = r12 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r20 == 0) goto L_0x009c
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r10 = r45
            goto L_0x00b2
        L_0x009c:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r13 & r22
            r10 = r45
            if (r22 != 0) goto L_0x00b2
            boolean r23 = r0.mo14927P(r10)
            if (r23 == 0) goto L_0x00ae
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b0
        L_0x00ae:
            r23 = r21
        L_0x00b0:
            r2 = r2 | r23
        L_0x00b2:
            r23 = r12 & 32
            r24 = 131072(0x20000, float:1.83671E-40)
            if (r23 == 0) goto L_0x00bf
            r25 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r25
            r7 = r46
            goto L_0x00d4
        L_0x00bf:
            r25 = 458752(0x70000, float:6.42848E-40)
            r25 = r13 & r25
            r7 = r46
            if (r25 != 0) goto L_0x00d4
            boolean r26 = r0.mo14927P(r7)
            if (r26 == 0) goto L_0x00d0
            r26 = r24
            goto L_0x00d2
        L_0x00d0:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00d2:
            r2 = r2 | r26
        L_0x00d4:
            r26 = r12 & 64
            r27 = 1048576(0x100000, float:1.469368E-39)
            r28 = 524288(0x80000, float:7.34684E-40)
            if (r26 == 0) goto L_0x00e3
            r29 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r29
            r7 = r47
            goto L_0x00f8
        L_0x00e3:
            r29 = 3670016(0x380000, float:5.142788E-39)
            r29 = r13 & r29
            r7 = r47
            if (r29 != 0) goto L_0x00f8
            boolean r29 = r0.mo14976f(r7)
            if (r29 == 0) goto L_0x00f4
            r29 = r27
            goto L_0x00f6
        L_0x00f4:
            r29 = r28
        L_0x00f6:
            r2 = r2 | r29
        L_0x00f8:
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0101
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r29
            goto L_0x0119
        L_0x0101:
            r29 = 29360128(0x1c00000, float:7.052966E-38)
            r29 = r13 & r29
            if (r29 != 0) goto L_0x0119
            r29 = r7
            r7 = r48
            boolean r30 = r0.mo14961b(r7)
            if (r30 == 0) goto L_0x0114
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0116
        L_0x0114:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x0116:
            r2 = r2 | r30
            goto L_0x011d
        L_0x0119:
            r29 = r7
            r7 = r48
        L_0x011d:
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r13 & r30
            if (r30 != 0) goto L_0x0139
            r4 = r12 & 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x0132
            r4 = r49
            boolean r31 = r0.mo15006n0(r4)
            if (r31 == 0) goto L_0x0134
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0136
        L_0x0132:
            r4 = r49
        L_0x0134:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0136:
            r2 = r2 | r31
            goto L_0x013b
        L_0x0139:
            r4 = r49
        L_0x013b:
            r7 = r12 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x0144
            r31 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r31
            goto L_0x015c
        L_0x0144:
            r31 = 1879048192(0x70000000, float:1.58456325E29)
            r31 = r13 & r31
            if (r31 != 0) goto L_0x015c
            r31 = r7
            r7 = r50
            boolean r32 = r0.mo14968d(r7)
            if (r32 == 0) goto L_0x0157
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0159
        L_0x0157:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0159:
            r2 = r2 | r32
            goto L_0x0160
        L_0x015c:
            r31 = r7
            r7 = r50
        L_0x0160:
            r32 = r14 & 14
            if (r32 != 0) goto L_0x0175
            r6 = r12 & 1024(0x400, float:1.435E-42)
            r7 = r51
            if (r6 != 0) goto L_0x0172
            boolean r6 = r0.mo14980g(r7)
            if (r6 == 0) goto L_0x0172
            r6 = 4
            goto L_0x0173
        L_0x0172:
            r6 = 2
        L_0x0173:
            r6 = r6 | r14
            goto L_0x0178
        L_0x0175:
            r7 = r51
            r6 = r14
        L_0x0178:
            r33 = r14 & 112(0x70, float:1.57E-43)
            if (r33 != 0) goto L_0x018f
            r1 = r12 & 2048(0x800, float:2.87E-42)
            r7 = r53
            if (r1 != 0) goto L_0x018b
            boolean r1 = r0.mo14980g(r7)
            if (r1 == 0) goto L_0x018b
            r1 = 32
            goto L_0x018d
        L_0x018b:
            r1 = 16
        L_0x018d:
            r6 = r6 | r1
            goto L_0x0191
        L_0x018f:
            r7 = r53
        L_0x0191:
            r1 = r12 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0198
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01ac
        L_0x0198:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x01ac
            r3 = r55
            boolean r33 = r0.mo14968d(r3)
            if (r33 == 0) goto L_0x01a7
            r33 = r16
            goto L_0x01a9
        L_0x01a7:
            r33 = 128(0x80, float:1.794E-43)
        L_0x01a9:
            r6 = r6 | r33
            goto L_0x01ae
        L_0x01ac:
            r3 = r55
        L_0x01ae:
            r7 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x01b5
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c7
        L_0x01b5:
            r8 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x01c7
            r8 = r56
            boolean r33 = r0.mo14927P(r8)
            if (r33 == 0) goto L_0x01c2
            goto L_0x01c4
        L_0x01c2:
            r18 = r19
        L_0x01c4:
            r6 = r6 | r18
            goto L_0x01c9
        L_0x01c7:
            r8 = r56
        L_0x01c9:
            r18 = r7
            r7 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x01d2
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01e8
        L_0x01d2:
            r19 = 57344(0xe000, float:8.0356E-41)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x01e8
            r19 = r7
            r7 = r57
            boolean r33 = r0.mo14961b(r7)
            if (r33 == 0) goto L_0x01e5
            r21 = 16384(0x4000, float:2.2959E-41)
        L_0x01e5:
            r6 = r6 | r21
            goto L_0x01ec
        L_0x01e8:
            r19 = r7
            r7 = r57
        L_0x01ec:
            r21 = 458752(0x70000, float:6.42848E-40)
            r21 = r14 & r21
            if (r21 != 0) goto L_0x0209
            r21 = 32768(0x8000, float:4.5918E-41)
            r21 = r12 & r21
            r7 = r58
            if (r21 != 0) goto L_0x0204
            boolean r21 = r0.mo15006n0(r7)
            if (r21 == 0) goto L_0x0204
            r21 = r24
            goto L_0x0206
        L_0x0204:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x0206:
            r6 = r6 | r21
            goto L_0x020b
        L_0x0209:
            r7 = r58
        L_0x020b:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r12 & r21
            if (r21 == 0) goto L_0x0218
            r33 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r33
            r7 = r59
            goto L_0x022d
        L_0x0218:
            r33 = 3670016(0x380000, float:5.142788E-39)
            r33 = r14 & r33
            r7 = r59
            if (r33 != 0) goto L_0x022d
            boolean r33 = r0.mo14968d(r7)
            if (r33 == 0) goto L_0x0229
            r33 = r27
            goto L_0x022b
        L_0x0229:
            r33 = r28
        L_0x022b:
            r6 = r6 | r33
        L_0x022d:
            r33 = 29360128(0x1c00000, float:7.052966E-38)
            r33 = r14 & r33
            if (r33 != 0) goto L_0x0247
            r33 = r12 & r24
            r7 = r60
            if (r33 != 0) goto L_0x0242
            boolean r33 = r0.mo14980g(r7)
            if (r33 == 0) goto L_0x0242
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0244
        L_0x0242:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x0244:
            r6 = r6 | r33
            goto L_0x0249
        L_0x0247:
            r7 = r60
        L_0x0249:
            r33 = 234881024(0xe000000, float:1.5777218E-30)
            r33 = r14 & r33
            if (r33 != 0) goto L_0x0265
            r33 = 262144(0x40000, float:3.67342E-40)
            r33 = r12 & r33
            r7 = r62
            if (r33 != 0) goto L_0x0260
            boolean r33 = r0.mo14980g(r7)
            if (r33 == 0) goto L_0x0260
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0262
        L_0x0260:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0262:
            r6 = r6 | r33
            goto L_0x0267
        L_0x0265:
            r7 = r62
        L_0x0267:
            r33 = 1879048192(0x70000000, float:1.58456325E29)
            r33 = r14 & r33
            if (r33 != 0) goto L_0x0281
            r33 = r12 & r28
            r7 = r64
            if (r33 != 0) goto L_0x027c
            boolean r33 = r0.mo14980g(r7)
            if (r33 == 0) goto L_0x027c
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x027e
        L_0x027c:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x027e:
            r6 = r6 | r33
            goto L_0x0283
        L_0x0281:
            r7 = r64
        L_0x0283:
            r33 = r6
            r6 = r11 & 14
            if (r6 != 0) goto L_0x029d
            r6 = r12 & r27
            r7 = r66
            if (r6 != 0) goto L_0x0298
            boolean r6 = r0.mo14980g(r7)
            if (r6 == 0) goto L_0x0298
            r30 = 4
            goto L_0x029a
        L_0x0298:
            r30 = 2
        L_0x029a:
            r6 = r11 | r30
            goto L_0x02a0
        L_0x029d:
            r7 = r66
            r6 = r11
        L_0x02a0:
            r30 = r11 & 112(0x70, float:1.57E-43)
            if (r30 != 0) goto L_0x02ba
            r30 = 2097152(0x200000, float:2.938736E-39)
            r30 = r12 & r30
            r7 = r68
            if (r30 != 0) goto L_0x02b5
            boolean r30 = r0.mo14980g(r7)
            if (r30 == 0) goto L_0x02b5
            r32 = 32
            goto L_0x02b7
        L_0x02b5:
            r32 = 16
        L_0x02b7:
            r6 = r6 | r32
            goto L_0x02bc
        L_0x02ba:
            r7 = r68
        L_0x02bc:
            r25 = 4194304(0x400000, float:5.877472E-39)
            r25 = r12 & r25
            if (r25 == 0) goto L_0x02c5
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x02d4
        L_0x02c5:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x02d4
            boolean r3 = r0.mo14927P(r15)
            if (r3 == 0) goto L_0x02d0
            goto L_0x02d2
        L_0x02d0:
            r16 = 128(0x80, float:1.794E-43)
        L_0x02d2:
            r6 = r6 | r16
        L_0x02d4:
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r3 & r2
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r4) goto L_0x0321
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r33 & r3
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r4) goto L_0x0321
            r3 = r6 & 731(0x2db, float:1.024E-42)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x0321
            boolean r3 = r0.mo15011p()
            if (r3 != 0) goto L_0x02f4
            goto L_0x0321
        L_0x02f4:
            r0.mo14958a0()
            r2 = r42
            r4 = r44
            r6 = r46
            r11 = r51
            r30 = r53
            r16 = r55
            r17 = r56
            r20 = r57
            r18 = r58
            r19 = r59
            r28 = r60
            r22 = r62
            r24 = r64
            r26 = r66
            r36 = r7
            r3 = r9
            r5 = r10
            r7 = r47
            r8 = r48
            r9 = r49
            r10 = r50
            goto L_0x060a
        L_0x0321:
            r0.mo14930Q()
            r3 = r13 & 1
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r4 = 0
            r7 = 6
            if (r3 == 0) goto L_0x03ae
            boolean r3 = r0.mo14977f0()
            if (r3 == 0) goto L_0x0335
            goto L_0x03ae
        L_0x0335:
            r0.mo14958a0()
            r1 = r12 & 4
            if (r1 == 0) goto L_0x033e
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x033e:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0344
            r2 = r2 & r16
        L_0x0344:
            r1 = r12 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x034a
            r33 = r33 & -15
        L_0x034a:
            r1 = r12 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0350
            r33 = r33 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0350:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r12
            if (r1 == 0) goto L_0x035b
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r33 = r33 & r1
        L_0x035b:
            r1 = r12 & r24
            if (r1 == 0) goto L_0x0364
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r33 = r33 & r1
        L_0x0364:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r12
            if (r1 == 0) goto L_0x036b
            r33 = r33 & r16
        L_0x036b:
            r1 = r12 & r28
            if (r1 == 0) goto L_0x0374
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r33 = r33 & r1
        L_0x0374:
            r1 = r12 & r27
            if (r1 == 0) goto L_0x037a
            r6 = r6 & -15
        L_0x037a:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0381
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0381:
            r1 = r42
            r4 = r44
            r7 = r47
            r3 = r49
            r18 = r50
            r25 = r51
            r30 = r53
            r11 = r55
            r16 = r56
            r20 = r57
            r21 = r58
            r22 = r59
            r28 = r60
            r23 = r62
            r34 = r66
            r36 = r68
            r27 = r6
            r5 = r10
            r8 = r33
            r6 = r46
            r10 = r48
            r32 = r64
            goto L_0x0546
        L_0x03ae:
            if (r5 == 0) goto L_0x03b5
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r22 = r3
            goto L_0x03b7
        L_0x03b5:
            r22 = r42
        L_0x03b7:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x03e2
            r3 = 0
            r5 = 0
            r9 = 0
            r25 = 0
            r30 = 7
            r8 = r2
            r2 = r3
            r3 = r5
            r5 = r4
            r4 = r9
            r9 = r5
            r5 = r0
            r32 = r6
            r6 = r25
            r9 = r7
            r25 = r18
            r18 = r29
            r29 = r19
            r19 = r31
            r7 = r30
            androidx.compose.material.g r2 = m13303m(r2, r3, r4, r5, r6, r7)
            r3 = r8 & -897(0xfffffffffffffc7f, float:NaN)
            r8 = r3
            r3 = r2
            r2 = 0
            goto L_0x03f1
        L_0x03e2:
            r8 = r2
            r2 = r4
            r32 = r6
            r9 = r7
            r25 = r18
            r18 = r29
            r29 = r19
            r19 = r31
            r3 = r43
        L_0x03f1:
            if (r17 == 0) goto L_0x03f5
            r4 = r2
            goto L_0x03f7
        L_0x03f5:
            r4 = r44
        L_0x03f7:
            if (r20 == 0) goto L_0x0400
            androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt r5 = androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.f7594a
            kotlin.jvm.functions.q r5 = r5.mo10103a()
            goto L_0x0401
        L_0x0400:
            r5 = r10
        L_0x0401:
            if (r23 == 0) goto L_0x0405
            r6 = r2
            goto L_0x0407
        L_0x0405:
            r6 = r46
        L_0x0407:
            if (r26 == 0) goto L_0x0410
            androidx.compose.material.i0$a r7 = androidx.compose.material.C3050i0.f8146b
            int r7 = r7.mo10793b()
            goto L_0x0412
        L_0x0410:
            r7 = r47
        L_0x0412:
            if (r18 == 0) goto L_0x0416
            r10 = 1
            goto L_0x0418
        L_0x0416:
            r10 = r48
        L_0x0418:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0429
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.f1 r2 = r2.mo11076b(r0, r9)
            androidx.compose.foundation.shape.e r2 = r2.mo10756c()
            r8 = r8 & r16
            goto L_0x042b
        L_0x0429:
            r2 = r49
        L_0x042b:
            if (r19 == 0) goto L_0x0434
            androidx.compose.material.f r18 = androidx.compose.material.C3040f.f8110a
            float r18 = r18.mo10752a()
            goto L_0x0436
        L_0x0434:
            r18 = r50
        L_0x0436:
            r9 = r12 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x044e
            androidx.compose.material.t0 r9 = androidx.compose.material.C7933t0.f19075a
            r42 = r2
            r2 = 6
            androidx.compose.material.q r9 = r9.mo11075a(r0, r2)
            long r30 = r9.mo10975n()
            r33 = r33 & -15
            r43 = r3
            r2 = r30
            goto L_0x0454
        L_0x044e:
            r42 = r2
            r43 = r3
            r2 = r51
        L_0x0454:
            r9 = r12 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0461
            r9 = r33 & 14
            long r30 = androidx.compose.material.ColorsKt.m13381b(r2, r0, r9)
            r33 = r33 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0463
        L_0x0461:
            r30 = r53
        L_0x0463:
            if (r1 == 0) goto L_0x046c
            androidx.compose.material.f r1 = androidx.compose.material.C3040f.f8110a
            float r1 = r1.mo10753b()
            goto L_0x046e
        L_0x046c:
            r1 = r55
        L_0x046e:
            if (r25 == 0) goto L_0x0472
            r9 = 0
            goto L_0x0474
        L_0x0472:
            r9 = r56
        L_0x0474:
            if (r29 == 0) goto L_0x0479
            r20 = 1
            goto L_0x047b
        L_0x0479:
            r20 = r57
        L_0x047b:
            r23 = 32768(0x8000, float:4.5918E-41)
            r23 = r12 & r23
            r44 = r1
            if (r23 == 0) goto L_0x0497
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            r25 = r2
            r2 = 6
            androidx.compose.material.f1 r1 = r1.mo11076b(r0, r2)
            androidx.compose.foundation.shape.e r1 = r1.mo10756c()
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r33 = r33 & r2
            goto L_0x049b
        L_0x0497:
            r25 = r2
            r1 = r58
        L_0x049b:
            if (r21 == 0) goto L_0x04a4
            androidx.compose.material.c0 r2 = androidx.compose.material.C3032c0.f8090a
            float r2 = r2.mo10725a()
            goto L_0x04a6
        L_0x04a4:
            r2 = r59
        L_0x04a6:
            r3 = r12 & r24
            if (r3 == 0) goto L_0x04c1
            androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
            r45 = r1
            r1 = 6
            androidx.compose.material.q r3 = r3.mo11075a(r0, r1)
            long r23 = r3.mo10975n()
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r33 = r33 & r1
            r46 = r2
            r1 = r23
            goto L_0x04c7
        L_0x04c1:
            r45 = r1
            r46 = r2
            r1 = r60
        L_0x04c7:
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r12
            if (r3 == 0) goto L_0x04d7
            int r3 = r33 >> 21
            r3 = r3 & 14
            long r23 = androidx.compose.material.ColorsKt.m13381b(r1, r0, r3)
            r33 = r33 & r16
            goto L_0x04d9
        L_0x04d7:
            r23 = r62
        L_0x04d9:
            r3 = r12 & r28
            if (r3 == 0) goto L_0x04ee
            androidx.compose.material.c0 r3 = androidx.compose.material.C3032c0.f8090a
            r28 = r1
            r1 = 6
            long r2 = r3.mo10726b(r0, r1)
            r16 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r16 = r33 & r16
            r33 = r16
            goto L_0x04f3
        L_0x04ee:
            r28 = r1
            r1 = 6
            r2 = r64
        L_0x04f3:
            r16 = r12 & r27
            r47 = r2
            if (r16 == 0) goto L_0x0508
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r0, r1)
            long r1 = r2.mo10964c()
            r3 = r32 & -15
            r32 = r3
            goto L_0x050a
        L_0x0508:
            r1 = r66
        L_0x050a:
            r3 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 & r12
            if (r3 == 0) goto L_0x052d
            r3 = r32 & 14
            long r34 = androidx.compose.material.ColorsKt.m13381b(r1, r0, r3)
            r3 = r32 & -113(0xffffffffffffff8f, float:NaN)
            r11 = r44
            r21 = r45
            r27 = r3
            r16 = r9
            r36 = r34
            r3 = r42
            r9 = r43
            r34 = r1
            r2 = r8
            r1 = r22
            r8 = r33
            goto L_0x0542
        L_0x052d:
            r3 = r42
            r11 = r44
            r21 = r45
            r36 = r68
            r34 = r1
            r2 = r8
            r16 = r9
            r1 = r22
            r27 = r32
            r8 = r33
            r9 = r43
        L_0x0542:
            r22 = r46
            r32 = r47
        L_0x0546:
            r0.mo14899E()
            boolean r38 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r38 == 0) goto L_0x0557
            r12 = 46422755(0x2c45ae3, float:2.8851778E-37)
            java.lang.String r13 = "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:302)"
            androidx.compose.runtime.ComposerKt.m29845w0(r12, r2, r8, r13)
        L_0x0557:
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r0.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            float r12 = r12.mo7425g5(r11)
            r53 = r12
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1 r12 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
            r42 = r12
            r43 = r9
            r44 = r4
            r45 = r70
            r46 = r6
            r47 = r11
            r48 = r7
            r49 = r2
            r50 = r27
            r51 = r8
            r52 = r10
            r54 = r3
            r55 = r18
            r56 = r25
            r58 = r30
            r60 = r41
            r61 = r5
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r58, r60, r61)
            r2 = 893101063(0x353ba407, float:6.990162E-7)
            r13 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r2, r13, r12)
            r12 = 0
            r56 = r3
            r3 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10112l(r1, r12, r13, r3)
            r12 = 0
            r17 = 0
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1 r13 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
            r42 = r13
            r43 = r16
            r44 = r2
            r45 = r9
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r28
            r51 = r23
            r53 = r32
            r55 = r8
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r51, r53, r55)
            r2 = 1273816607(0x4bece61f, float:3.1050814E7)
            r8 = 1
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r2, r8, r13)
            r8 = 6
            int r8 = r27 << 6
            r13 = r8 & 896(0x380, float:1.256E-42)
            r19 = 1572864(0x180000, float:2.204052E-39)
            r13 = r13 | r19
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r13
            r13 = 50
            r42 = r3
            r43 = r12
            r44 = r34
            r46 = r36
            r3 = 0
            r48 = r3
            r49 = r17
            r50 = r2
            r51 = r0
            r52 = r8
            r53 = r13
            androidx.compose.material.SurfaceKt.m13879b(r42, r43, r44, r46, r48, r49, r50, r51, r52, r53)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x05f3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x05f3:
            r2 = r1
            r3 = r9
            r8 = r10
            r17 = r16
            r10 = r18
            r18 = r21
            r19 = r22
            r22 = r23
            r9 = r56
            r16 = r11
            r11 = r25
            r24 = r32
            r26 = r34
        L_0x060a:
            androidx.compose.runtime.t1 r13 = r0.mo15020s()
            if (r13 != 0) goto L_0x0611
            goto L_0x063a
        L_0x0611:
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2 r1 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
            r0 = r1
            r39 = r1
            r1 = r41
            r40 = r13
            r13 = r30
            r15 = r16
            r16 = r17
            r17 = r20
            r20 = r28
            r28 = r36
            r30 = r70
            r31 = r72
            r32 = r73
            r33 = r74
            r34 = r75
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r22, r24, r26, r28, r30, r31, r32, r33, r34)
            r1 = r39
            r0 = r40
            r0.mo15202a(r1)
        L_0x063a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m13292b(kotlin.jvm.functions.q, androidx.compose.ui.m, androidx.compose.material.g, kotlin.jvm.functions.p, kotlin.jvm.functions.q, kotlin.jvm.functions.p, int, boolean, androidx.compose.ui.graphics.g4, float, long, long, float, kotlin.jvm.functions.q, boolean, androidx.compose.ui.graphics.g4, float, long, long, long, long, long, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int, int):void");
    }

    /* renamed from: c */
    public static final C3025a<BottomSheetValue> m13293c(BottomSheetState bottomSheetState, C11300l<? super BottomSheetValue, C11079d2> lVar, C11300l<? super BottomSheetValue, C11079d2> lVar2) {
        return new C2884a(bottomSheetState, lVar, lVar2);
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: d */
    public static final void m13294d(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, float f, int i, C11289a<Float> aVar, BottomSheetState bottomSheetState, C8592o oVar, int i2) {
        int i3;
        C8592o oVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar;
        C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar3 = qVar;
        C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar4 = qVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar3;
        C11289a<Float> aVar2 = aVar;
        BottomSheetState bottomSheetState2 = bottomSheetState;
        int i13 = i2;
        C8592o o = oVar.mo15009o(1621720523);
        if ((i13 & 14) == 0) {
            if (o.mo14927P(pVar4)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i13;
        } else {
            i3 = i13;
        }
        if ((i13 & 112) == 0) {
            if (o.mo14927P(qVar3)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i13 & 896) == 0) {
            if (o.mo14927P(qVar4)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        if ((i13 & 7168) == 0) {
            if (o.mo14927P(pVar5)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((57344 & i13) == 0) {
            if (o.mo14927P(pVar6)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        float f2 = f;
        if ((458752 & i13) == 0) {
            if (o.mo14968d(f2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        int i14 = i;
        if ((3670016 & i13) == 0) {
            if (o.mo14976f(i14)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((29360128 & i13) == 0) {
            if (o.mo14927P(aVar2)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((234881024 & i13) == 0) {
            if (o.mo15006n0(bottomSheetState2)) {
                i4 = C8698y1.f23302n;
            } else {
                i4 = C9647e0.f26435a;
            }
            i3 |= i4;
        }
        int i15 = i3;
        if ((191739611 & i15) != 38347922 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1621720523, i15, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:476)");
            }
            Object[] objArr = {qVar4, aVar2, pVar4, qVar3, C16483g.m74451w(f), pVar5, C3050i0.m14309c(i), pVar6, bottomSheetState2};
            o.mo14918M(-568225417);
            boolean z = false;
            for (int i16 = 0; i16 < 9; i16++) {
                z |= o.mo15006n0(objArr[i16]);
            }
            Object N = o.mo14921N();
            if (z || N == C8592o.f23032a.mo16277a()) {
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 = r0;
                oVar2 = o;
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$12 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(aVar, pVar, pVar2, i, f, pVar3, bottomSheetState, qVar2, i15, qVar);
                oVar2.mo14893C(bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1);
                N = bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1;
            } else {
                oVar2 = o;
            }
            oVar2.mo15002m0();
            SubcomposeLayoutKt.m69021a((C8767m) null, (C11304p) N, oVar2, 0, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(pVar, qVar, qVar2, pVar2, pVar3, f, i, aVar, bottomSheetState, i2));
        }
    }

    @C11395k(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @C11587t0(expression = "BottomSheetScaffoldState(initialValue, animationSpec, confirmStateChange)", imports = {}))
    @C3044g0
    @C12579k
    /* renamed from: e */
    public static final BottomSheetState m13295e(@C12579k BottomSheetValue bottomSheetValue, @C12579k C1968g<Float> gVar, @C12579k C11300l<? super BottomSheetValue, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(bottomSheetValue, "initialValue");
        Intrinsics.checkNotNullParameter(gVar, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        return new BottomSheetState(bottomSheetValue, gVar, lVar);
    }

    /* renamed from: f */
    public static /* synthetic */ BottomSheetState m13296f(BottomSheetValue bottomSheetValue, C1968g gVar, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = C7885n1.f18885a.mo10889a();
        }
        return m13295e(bottomSheetValue, gVar, lVar);
    }

    /* renamed from: g */
    public static final C15446a m13297g(SwipeableV2State<?> swipeableV2State, Orientation orientation) {
        return new C2900x7deaba9e(swipeableV2State, orientation);
    }

    @C8540g
    @C3044g0
    @C12579k
    /* renamed from: m */
    public static final C3043g m13303m(@C12580l DrawerState drawerState, @C12580l BottomSheetState bottomSheetState, @C12580l SnackbarHostState snackbarHostState, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(-1353009744);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.m13447o(DrawerValue.Closed, (C11300l<? super DrawerValue, Boolean>) null, oVar, 6, 2);
        }
        if ((i2 & 2) != 0) {
            bottomSheetState = m13304n(BottomSheetValue.Collapsed, (C1968g<Float>) null, (C11300l<? super BottomSheetValue, Boolean>) null, oVar, 6, 6);
        }
        if ((i2 & 4) != 0) {
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = new SnackbarHostState();
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            snackbarHostState = (SnackbarHostState) N;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1353009744, i, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:239)");
        }
        oVar.mo14918M(1618982084);
        boolean n0 = oVar.mo15006n0(drawerState) | oVar.mo15006n0(bottomSheetState) | oVar.mo15006n0(snackbarHostState);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new C3043g(drawerState, bottomSheetState, snackbarHostState);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C3043g gVar = (C3043g) N2;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return gVar;
    }

    @C3044g0
    @C8540g
    @C12579k
    /* renamed from: n */
    public static final BottomSheetState m13304n(@C12579k BottomSheetValue bottomSheetValue, @C12580l C1968g<Float> gVar, @C12580l C11300l<? super BottomSheetValue, Boolean> lVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(bottomSheetValue, "initialValue");
        oVar.mo14918M(1808153344);
        if ((i2 & 2) != 0) {
            gVar = C7885n1.f18885a.mo10889a();
        }
        if ((i2 & 4) != 0) {
            lVar = BottomSheetScaffoldKt$rememberBottomSheetState$1.f7551f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1808153344, i, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:197)");
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m31343d(new Object[]{gVar}, BottomSheetState.f7558b.mo10074a(gVar, lVar), (String) null, new BottomSheetScaffoldKt$rememberBottomSheetState$2(bottomSheetValue, gVar, lVar), oVar, 72, 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return bottomSheetState;
    }
}
