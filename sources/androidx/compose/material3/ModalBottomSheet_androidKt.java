package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.window.AndroidPopup_androidKt;
import androidx.compose.p004ui.window.C16547h;
import androidx.compose.p004ui.window.SecureFlagPolicy;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.collections.C10930d1;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.C12590b;

@C11363r0({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,354:1\n474#2,4:355\n478#2,2:363\n482#2:369\n25#3:359\n50#3:370\n49#3:371\n36#3:379\n36#3:387\n50#3:394\n49#3:395\n1114#4,3:360\n1117#4,3:366\n1114#4,6:372\n1114#4,6:380\n1114#4,6:388\n1114#4,6:396\n474#5:365\n76#6:378\n646#7:386\n76#8:402\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n105#1:355,4\n105#1:363,2\n105#1:369\n105#1:359\n122#1:370\n122#1:371\n230#1:379\n264#1:387\n276#1:394\n276#1:395\n105#1:360,3\n105#1:366,3\n122#1:372,6\n230#1:380,6\n264#1:388,6\n276#1:396,6\n105#1:365\n131#1:378\n257#1:386\n258#1:402\n*E\n"})
public final class ModalBottomSheet_androidKt {

    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$a */
    public static final class C8043a implements C8179c<SheetValue> {

        /* renamed from: a */
        public final /* synthetic */ SheetState f19485a;

        /* renamed from: b */
        public final /* synthetic */ C11304p<SheetValue, Float, C11079d2> f19486b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<SheetValue, C11079d2> f19487c;

        /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$a$a */
        public /* synthetic */ class C8044a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.C8043a.C8044a.<clinit>():void");
            }
        }

        public C8043a(SheetState sheetState, C11304p<? super SheetValue, ? super Float, C11079d2> pVar, C11300l<? super SheetValue, C11079d2> lVar) {
            this.f19485a = sheetState;
            this.f19486b = pVar;
            this.f19487c = lVar;
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float>, java.util.Map, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11180a(@org.jetbrains.annotations.C12579k androidx.compose.material3.SheetValue r3, @org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float> r4, @org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float> r5) {
            /*
                r2 = this;
                java.lang.String r0 = "previousTarget"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "previousAnchors"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "newAnchors"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.Object r0 = r4.get(r3)
                java.lang.Float r0 = (java.lang.Float) r0
                int[] r1 = androidx.compose.material3.ModalBottomSheet_androidKt.C8043a.C8044a.$EnumSwitchMapping$0
                int r3 = r3.ordinal()
                r3 = r1[r3]
                r1 = 1
                if (r3 == r1) goto L_0x0042
                r1 = 2
                if (r3 == r1) goto L_0x002d
                r1 = 3
                if (r3 != r1) goto L_0x0027
                goto L_0x002d
            L_0x0027:
                kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
                r3.<init>()
                throw r3
            L_0x002d:
                androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.PartiallyExpanded
                boolean r1 = r5.containsKey(r3)
                if (r1 == 0) goto L_0x0036
                goto L_0x0044
            L_0x0036:
                androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.Expanded
                boolean r1 = r5.containsKey(r3)
                if (r1 == 0) goto L_0x003f
                goto L_0x0044
            L_0x003f:
                androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.Hidden
                goto L_0x0044
            L_0x0042:
                androidx.compose.material3.SheetValue r3 = androidx.compose.material3.SheetValue.Hidden
            L_0x0044:
                java.lang.Object r5 = kotlin.collections.C10977s0.m41443K(r5, r3)
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((float) r5, (java.lang.Float) r0)
                if (r5 != 0) goto L_0x0080
                androidx.compose.material3.SheetState r5 = r2.f19485a
                androidx.compose.material3.SwipeableV2State r5 = r5.mo11862j()
                boolean r5 = r5.mo12091C()
                if (r5 != 0) goto L_0x006d
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x0067
                goto L_0x006d
            L_0x0067:
                kotlin.jvm.functions.l<androidx.compose.material3.SheetValue, kotlin.d2> r4 = r2.f19487c
                r4.invoke(r3)
                goto L_0x0080
            L_0x006d:
                kotlin.jvm.functions.p<androidx.compose.material3.SheetValue, java.lang.Float, kotlin.d2> r4 = r2.f19486b
                androidx.compose.material3.SheetState r5 = r2.f19485a
                androidx.compose.material3.SwipeableV2State r5 = r5.mo11862j()
                float r5 = r5.mo12115s()
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                r4.invoke(r3, r5)
            L_0x0080:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.C8043a.mo11180a(androidx.compose.material3.SheetValue, java.util.Map, java.util.Map):void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: androidx.compose.material3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: kotlin.jvm.functions.p<? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011b  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25884a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r34, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r35, @org.jetbrains.annotations.C12580l androidx.compose.material3.SheetState r36, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r37, long r38, long r40, float r42, long r43, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r45, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r46, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r47, int r48, int r49) {
        /*
            r1 = r34
            r0 = r46
            r15 = r48
            r13 = r49
            java.lang.String r2 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -1311611302(0xffffffffb1d2665a, float:-6.1234404E-9)
            r3 = r47
            androidx.compose.runtime.o r14 = r3.mo15009o(r2)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r14.mo14927P(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r15
            goto L_0x0032
        L_0x0031:
            r3 = r15
        L_0x0032:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r35
            boolean r6 = r14.mo15006n0(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r35
        L_0x004e:
            r6 = r15 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r13 & 4
            if (r6 != 0) goto L_0x0061
            r6 = r36
            boolean r7 = r14.mo15006n0(r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r6 = r36
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r7
            goto L_0x0069
        L_0x0067:
            r6 = r36
        L_0x0069:
            r7 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r13 & 8
            if (r7 != 0) goto L_0x007c
            r7 = r37
            boolean r8 = r14.mo15006n0(r7)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r7 = r37
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r8
            goto L_0x0084
        L_0x0082:
            r7 = r37
        L_0x0084:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r15
            if (r8 != 0) goto L_0x009f
            r8 = r13 & 16
            if (r8 != 0) goto L_0x0099
            r8 = r38
            boolean r10 = r14.mo14980g(r8)
            if (r10 == 0) goto L_0x009b
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r8 = r38
        L_0x009b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r10
            goto L_0x00a1
        L_0x009f:
            r8 = r38
        L_0x00a1:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r15
            if (r10 != 0) goto L_0x00bb
            r10 = r13 & 32
            if (r10 != 0) goto L_0x00b5
            r10 = r40
            boolean r12 = r14.mo14980g(r10)
            if (r12 == 0) goto L_0x00b7
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r10 = r40
        L_0x00b7:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r12
            goto L_0x00bd
        L_0x00bb:
            r10 = r40
        L_0x00bd:
            r12 = r13 & 64
            if (r12 == 0) goto L_0x00c8
            r16 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r16
            r2 = r42
            goto L_0x00dd
        L_0x00c8:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r16
            r2 = r42
            if (r16 != 0) goto L_0x00dd
            boolean r17 = r14.mo14968d(r2)
            if (r17 == 0) goto L_0x00d9
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r3 = r3 | r17
        L_0x00dd:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x00f6
            r2 = r13 & 128(0x80, float:1.794E-43)
            r5 = r43
            if (r2 != 0) goto L_0x00f2
            boolean r2 = r14.mo14980g(r5)
            if (r2 == 0) goto L_0x00f2
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r3 = r3 | r2
            goto L_0x00f8
        L_0x00f6:
            r5 = r43
        L_0x00f8:
            r2 = r13 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0103
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r17
            r5 = r45
            goto L_0x0117
        L_0x0103:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r15 & r17
            r5 = r45
            if (r17 != 0) goto L_0x0117
            boolean r6 = r14.mo14927P(r5)
            if (r6 == 0) goto L_0x0114
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r6 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r3 = r3 | r6
        L_0x0117:
            r6 = r13 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x011f
            r6 = 805306368(0x30000000, float:4.656613E-10)
        L_0x011d:
            r3 = r3 | r6
            goto L_0x0130
        L_0x011f:
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r15
            if (r6 != 0) goto L_0x0130
            boolean r6 = r14.mo14927P(r0)
            if (r6 == 0) goto L_0x012d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x011d
        L_0x012d:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x011d
        L_0x0130:
            r6 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r6 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r0) goto L_0x0152
            boolean r0 = r14.mo15011p()
            if (r0 != 0) goto L_0x0140
            goto L_0x0152
        L_0x0140:
            r14.mo14958a0()
            r2 = r35
            r3 = r36
            r12 = r5
            r4 = r7
            r5 = r8
            r7 = r10
            r0 = r14
            r9 = r42
            r10 = r43
            goto L_0x0355
        L_0x0152:
            r14.mo14930Q()
            r0 = r15 & 1
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = 0
            if (r0 == 0) goto L_0x01b0
            boolean r0 = r14.mo14977f0()
            if (r0 == 0) goto L_0x0167
            goto L_0x01b0
        L_0x0167:
            r14.mo14958a0()
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0170
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0170:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0176
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0176:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x017c
            r3 = r3 & r18
        L_0x017c:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0182
            r3 = r3 & r17
        L_0x0182:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x019d
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r3
            r12 = r36
            r26 = r42
            r27 = r43
            r29 = r5
            r21 = r7
            r22 = r8
            r24 = r10
            r7 = r0
            r0 = r35
            goto L_0x0232
        L_0x019d:
            r0 = r35
            r12 = r36
            r26 = r42
            r27 = r43
            r29 = r5
            r21 = r7
            r22 = r8
            r24 = r10
        L_0x01ad:
            r7 = r3
            goto L_0x0232
        L_0x01b0:
            if (r4 == 0) goto L_0x01b5
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x01b7
        L_0x01b5:
            r0 = r35
        L_0x01b7:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x01c6
            r4 = 3
            r35 = r0
            r0 = 0
            androidx.compose.material3.SheetState r0 = m25896m(r0, r6, r14, r0, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01ca
        L_0x01c6:
            r35 = r0
            r0 = r36
        L_0x01ca:
            r4 = r13 & 8
            r6 = 6
            if (r4 == 0) goto L_0x01d8
            androidx.compose.material3.BottomSheetDefaults r4 = androidx.compose.material3.BottomSheetDefaults.f19174a
            androidx.compose.ui.graphics.g4 r4 = r4.mo11173d(r14, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x01d9
        L_0x01d8:
            r4 = r7
        L_0x01d9:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x01e6
            androidx.compose.material3.BottomSheetDefaults r7 = androidx.compose.material3.BottomSheetDefaults.f19174a
            long r7 = r7.mo11171b(r14, r6)
            r3 = r3 & r18
            goto L_0x01e7
        L_0x01e6:
            r7 = r8
        L_0x01e7:
            r9 = r13 & 32
            if (r9 == 0) goto L_0x01f6
            int r9 = r3 >> 12
            r9 = r9 & 14
            long r9 = androidx.compose.material3.ColorSchemeKt.m25516c(r7, r14, r9)
            r3 = r3 & r17
            goto L_0x01f7
        L_0x01f6:
            r9 = r10
        L_0x01f7:
            if (r12 == 0) goto L_0x0200
            androidx.compose.material3.BottomSheetDefaults r11 = androidx.compose.material3.BottomSheetDefaults.f19174a
            float r11 = r11.mo11172c()
            goto L_0x0202
        L_0x0200:
            r11 = r42
        L_0x0202:
            r12 = r13 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0211
            androidx.compose.material3.BottomSheetDefaults r12 = androidx.compose.material3.BottomSheetDefaults.f19174a
            long r17 = r12.mo11175f(r14, r6)
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r6
            goto L_0x0213
        L_0x0211:
            r17 = r43
        L_0x0213:
            if (r2 == 0) goto L_0x0221
            androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt r2 = androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.f19267a
            kotlin.jvm.functions.p r2 = r2.mo11308a()
            r12 = r0
            r29 = r2
            r21 = r4
            goto L_0x0226
        L_0x0221:
            r12 = r0
            r21 = r4
            r29 = r5
        L_0x0226:
            r22 = r7
            r24 = r9
            r26 = r11
            r27 = r17
            r0 = r35
            goto L_0x01ad
        L_0x0232:
            r14.mo14899E()
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0244
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:92)"
            r4 = -1311611302(0xffffffffb1d2665a, float:-6.1234404E-9)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r7, r2, r3)
        L_0x0244:
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r14.mo14918M(r2)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo14918M(r2)
            java.lang.Object r2 = r14.mo14921N()
            androidx.compose.runtime.o$a r30 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r30.mo16277a()
            if (r2 != r3) goto L_0x026b
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r2 = androidx.compose.runtime.EffectsKt.m29901m(r2, r14)
            androidx.compose.runtime.w r3 = new androidx.compose.runtime.w
            r3.<init>(r2)
            r14.mo14893C(r3)
            r2 = r3
        L_0x026b:
            r14.mo15002m0()
            androidx.compose.runtime.w r2 = (androidx.compose.runtime.C8690w) r2
            kotlinx.coroutines.o0 r11 = r2.mo16831a()
            r14.mo15002m0()
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1 r5 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1
            r5.<init>(r12, r11, r1)
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1 r8 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1
            r8.<init>(r11, r12, r1)
            int r2 = r7 >> 6
            r2 = r2 & 14
            r6 = r2 | 64
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo14918M(r2)
            boolean r2 = r14.mo15006n0(r12)
            boolean r3 = r14.mo15006n0(r11)
            r2 = r2 | r3
            java.lang.Object r3 = r14.mo14921N()
            if (r2 != 0) goto L_0x02a2
            java.lang.Object r2 = r30.mo16277a()
            if (r3 != r2) goto L_0x02b3
        L_0x02a2:
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$1 r2 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$1
            r2.<init>(r11, r12)
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$2 r3 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$anchorChangeHandler$1$2
            r3.<init>(r11, r12)
            androidx.compose.material3.c r3 = m25885b(r12, r2, r3)
            r14.mo14893C(r3)
        L_0x02b3:
            r14.mo15002m0()
            r9 = r3
            androidx.compose.material3.c r9 = (androidx.compose.material3.C8179c) r9
            androidx.compose.foundation.layout.e1$a r2 = androidx.compose.foundation.layout.C2354e1.f6262a
            r3 = 8
            androidx.compose.foundation.layout.e1 r2 = androidx.compose.material3.C8178b3.m26962a(r2, r14, r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            int r10 = r2.mo7986c(r3)
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1 r3 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
            r3.<init>(r12, r11, r1)
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2 r4 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2
            r2 = r4
            r35 = r3
            r1 = r4
            r3 = r27
            r31 = r6
            r6 = r12
            r16 = r8
            r8 = r0
            r20 = r11
            r11 = r16
            r36 = r12
            r12 = r21
            r37 = r0
            r0 = r14
            r13 = r22
            r15 = r24
            r17 = r26
            r18 = r29
            r19 = r46
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20)
            r2 = -620400863(0xffffffffdb056f21, float:-3.7558359E16)
            r3 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r2, r3, r1)
            r2 = 48
            r3 = r35
            m25886c(r3, r1, r0, r2)
            boolean r1 = r36.mo11857e()
            if (r1 == 0) goto L_0x033b
            r1 = 1157296644(0x44faf204, float:2007.563)
            r0.mo14918M(r1)
            r1 = r36
            boolean r2 = r0.mo15006n0(r1)
            java.lang.Object r3 = r0.mo14921N()
            if (r2 != 0) goto L_0x0327
            java.lang.Object r2 = r30.mo16277a()
            if (r3 != r2) goto L_0x0330
        L_0x0327:
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1 r3 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1
            r2 = 0
            r3.<init>(r1, r2)
            r0.mo14893C(r3)
        L_0x0330:
            r0.mo15002m0()
            kotlin.jvm.functions.p r3 = (kotlin.jvm.functions.C11304p) r3
            r2 = r31
            androidx.compose.runtime.EffectsKt.m29896h(r1, r3, r0, r2)
            goto L_0x033d
        L_0x033b:
            r1 = r36
        L_0x033d:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0346
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0346:
            r2 = r37
            r3 = r1
            r4 = r21
            r5 = r22
            r7 = r24
            r9 = r26
            r10 = r27
            r12 = r29
        L_0x0355:
            androidx.compose.runtime.t1 r15 = r0.mo15020s()
            if (r15 != 0) goto L_0x035c
            goto L_0x0375
        L_0x035c:
            androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$4 r14 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$4
            r0 = r14
            r1 = r34
            r13 = r46
            r32 = r14
            r14 = r48
            r33 = r15
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r12, r13, r14, r15)
            r1 = r32
            r0 = r33
            r0.mo15202a(r1)
        L_0x0375:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.m25884a(kotlin.jvm.functions.a, androidx.compose.ui.m, androidx.compose.material3.SheetState, androidx.compose.ui.graphics.g4, long, long, float, long, kotlin.jvm.functions.p, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8251n0
    /* renamed from: b */
    public static final C8179c<SheetValue> m25885b(SheetState sheetState, C11304p<? super SheetValue, ? super Float, C11079d2> pVar, C11300l<? super SheetValue, C11079d2> lVar) {
        return new C8043a(sheetState, pVar, lVar);
    }

    @C8251n0
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m25886c(@C12579k C11289a<C11079d2> aVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C11289a<C11079d2> aVar2 = aVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        int i5 = i;
        Intrinsics.checkNotNullParameter(aVar2, "onDismissRequest");
        Intrinsics.checkNotNullParameter(pVar2, "content");
        C8592o o = oVar.mo15009o(-2079923476);
        if ((i5 & 14) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(pVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2079923476, i2, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:346)");
            }
            C11289a<C11079d2> aVar3 = aVar;
            AndroidPopup_androidKt.m74870c((C8734c) null, 0, aVar3, new C16547h(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null), pVar, o, ((i2 << 6) & 896) | 3072 | ((i2 << 9) & 57344), 3);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ModalBottomSheet_androidKt$ModalBottomSheetPopup$1(aVar2, pVar2, i5));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m25887d(long j, C11289a<C11079d2> aVar, boolean z, C8592o oVar, int i) {
        int i2;
        boolean z2;
        float f;
        C8767m mVar;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        C11289a<C11079d2> aVar2 = aVar;
        boolean z3 = z;
        int i6 = i;
        C8592o o = oVar.mo15009o(1053897700);
        if ((i6 & 14) == 0) {
            if (o.mo14980g(j2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z3)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1053897700, i2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:251)");
            }
            if (j2 != C15240j2.f37547b.mo42851u()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                C8578k2<Float> e = AnimateAsStateKt.m7971e(f, new C2023z0(0, 0, (C2022z) null, 7, (DefaultConstructorMarker) null), 0.0f, (String) null, (C11300l<? super Float, C11079d2>) null, o, 48, 28);
                o.mo14918M(-1858724388);
                if (z3) {
                    C8767m.C8768a aVar3 = C8767m.f23478j;
                    o.mo14918M(1157296644);
                    boolean n0 = o.mo15006n0(aVar2);
                    Object N = o.mo14921N();
                    if (n0 || N == C8592o.f23032a.mo16277a()) {
                        N = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(aVar2, (C11045c<? super ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1>) null);
                        o.mo14893C(N);
                    }
                    o.mo15002m0();
                    mVar = SemanticsModifierKt.m71866a(SuspendingPointerInputFilterKt.m68437c(aVar3, aVar2, (C11304p) N), ModalBottomSheet_androidKt$Scrim$dismissSheet$2.f19488f);
                } else {
                    mVar = C8767m.f23478j;
                }
                o.mo15002m0();
                C8767m k3 = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null).mo17224k3(mVar);
                C15240j2 n = C15240j2.m66071n(j);
                o.mo14918M(511388516);
                boolean n02 = o.mo15006n0(n) | o.mo15006n0(e);
                Object N2 = o.mo14921N();
                if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                    N2 = new ModalBottomSheet_androidKt$Scrim$1$1(j2, e);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                CanvasKt.m8873b(k3, (C11300l) N2, o, 0);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ModalBottomSheet_androidKt$Scrim$2(j, aVar, z, i));
        }
    }

    /* renamed from: e */
    public static final float m25888e(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C8251n0
    /* renamed from: k */
    public static final C8767m m25894k(C8767m mVar, SheetState sheetState, C8179c<SheetValue> cVar, float f, float f2, C11304p<? super C12074o0, ? super Float, C11079d2> pVar) {
        SheetState sheetState2 = sheetState;
        float f3 = f;
        C8179c<SheetValue> cVar2 = cVar;
        return SwipeableV2Kt.m26470k(DraggableKt.m9307k(mVar, sheetState.mo11862j().mo12121y(), Orientation.Vertical, sheetState.mo11865m(), (C2243g) null, sheetState.mo11862j().mo12091C(), (C11305q) null, new ModalBottomSheet_androidKt$modalBottomSheetSwipeable$1(pVar), false, C12590b.f30836K, (Object) null), sheetState.mo11862j(), C10930d1.m40902u(SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded), cVar, new ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2(f, f2, sheetState));
    }

    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: m */
    public static final SheetState m25896m(boolean z, @C12580l C11300l<? super SheetValue, Boolean> lVar, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(-1261794383);
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            lVar = ModalBottomSheet_androidKt$rememberModalBottomSheetState$1.f19489f;
        }
        C11300l<? super SheetValue, Boolean> lVar2 = lVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1261794383, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:245)");
        }
        SheetState d = SheetDefaultsKt.m26133d(z2, lVar2, SheetValue.Hidden, false, oVar, (i & 14) | C22132b.f56831b | (i & 112), 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }
}
