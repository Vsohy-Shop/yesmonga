package androidx.compose.material3;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p004ui.layout.SubcomposeLayoutKt;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import com.urbanairship.util.C9647e0;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.collections.C10930d1;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n36#2:397\n25#2:404\n50#2:411\n49#2:412\n25#2:423\n50#2:436\n49#2:437\n36#2:444\n67#2,3:451\n66#2:454\n83#2,3:461\n1114#3,6:398\n1114#3,6:405\n1114#3,6:413\n1114#3,3:424\n1117#3,3:430\n1114#3,6:438\n1114#3,6:445\n1114#3,6:455\n1114#3,6:464\n474#4,4:419\n478#4,2:427\n482#4:433\n474#5:429\n76#6:434\n1#7:435\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n123#1:397\n169#1:404\n171#1:411\n171#1:412\n210#1:423\n215#1:436\n215#1:437\n236#1:444\n253#1:451,3\n253#1:454\n329#1:461,3\n123#1:398,6\n169#1:405,6\n171#1:413,6\n210#1:424,3\n210#1:430,3\n215#1:438,6\n236#1:445,6\n253#1:455,6\n329#1:464,6\n210#1:419,4\n210#1:427,2\n210#1:433\n210#1:429\n211#1:434\n*E\n"})
public final class BottomSheetScaffoldKt {

    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$a */
    public static final class C7956a implements C8179c<SheetValue> {

        /* renamed from: a */
        public final /* synthetic */ SheetState f19178a;

        /* renamed from: b */
        public final /* synthetic */ C11304p<SheetValue, Float, C11079d2> f19179b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<SheetValue, C11079d2> f19180c;

        /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$a$a */
        public /* synthetic */ class C7957a {
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.C7956a.C7957a.<clinit>():void");
            }
        }

        public C7956a(SheetState sheetState, C11304p<? super SheetValue, ? super Float, C11079d2> pVar, C11300l<? super SheetValue, C11079d2> lVar) {
            this.f19178a = sheetState;
            this.f19179b = pVar;
            this.f19180c = lVar;
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float>, java.util.Map, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11180a(@org.jetbrains.annotations.C12579k androidx.compose.material3.SheetValue r2, @org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float> r3, @org.jetbrains.annotations.C12579k java.util.Map<androidx.compose.material3.SheetValue, java.lang.Float> r4) {
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
                int[] r0 = androidx.compose.material3.BottomSheetScaffoldKt.C7956a.C7957a.$EnumSwitchMapping$0
                int r2 = r2.ordinal()
                r2 = r0[r2]
                r0 = 1
                if (r2 == r0) goto L_0x0038
                r0 = 2
                if (r2 == r0) goto L_0x0038
                r0 = 3
                if (r2 != r0) goto L_0x0032
                androidx.compose.material3.SheetValue r2 = androidx.compose.material3.SheetValue.Expanded
                boolean r0 = r4.containsKey(r2)
                if (r0 == 0) goto L_0x002f
                goto L_0x003a
            L_0x002f:
                androidx.compose.material3.SheetValue r2 = androidx.compose.material3.SheetValue.PartiallyExpanded
                goto L_0x003a
            L_0x0032:
                kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                r2.<init>()
                throw r2
            L_0x0038:
                androidx.compose.material3.SheetValue r2 = androidx.compose.material3.SheetValue.PartiallyExpanded
            L_0x003a:
                java.lang.Object r4 = kotlin.collections.C10977s0.m41443K(r4, r2)
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((float) r4, (java.lang.Float) r3)
                if (r3 != 0) goto L_0x006f
                androidx.compose.material3.SheetState r3 = r1.f19178a
                androidx.compose.material3.SwipeableV2State r3 = r3.mo11862j()
                boolean r3 = r3.mo12091C()
                if (r3 == 0) goto L_0x006a
                kotlin.jvm.functions.p<androidx.compose.material3.SheetValue, java.lang.Float, kotlin.d2> r3 = r1.f19179b
                androidx.compose.material3.SheetState r4 = r1.f19178a
                androidx.compose.material3.SwipeableV2State r4 = r4.mo11862j()
                float r4 = r4.mo12115s()
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r3.invoke(r2, r4)
                goto L_0x006f
            L_0x006a:
                kotlin.jvm.functions.l<androidx.compose.material3.SheetValue, kotlin.d2> r3 = r1.f19180c
                r3.invoke(r2)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.C7956a.mo11180a(androidx.compose.material3.SheetValue, java.util.Map, java.util.Map):void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01af, code lost:
        if (r2.mo14980g(r46) != false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01cc, code lost:
        if (r2.mo14980g(r48) != false) goto L_0x01d3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0132  */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25429a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r31, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r32, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8213i r33, float r34, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r35, long r36, long r38, float r40, float r41, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r42, boolean r43, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r44, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r45, long r46, long r48, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2366i0, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r50, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r51, int r52, int r53, int r54) {
        /*
            r1 = r31
            r15 = r50
            r14 = r52
            r13 = r53
            r12 = r54
            java.lang.String r0 = "sheetContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 144898711(0x8a2fa97, float:9.808934E-34)
            r2 = r51
            androidx.compose.runtime.o r2 = r2.mo15009o(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x0024
            r3 = r14 | 6
            goto L_0x0034
        L_0x0024:
            r3 = r14 & 14
            if (r3 != 0) goto L_0x0033
            boolean r3 = r2.mo14927P(r1)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r14
            goto L_0x0034
        L_0x0033:
            r3 = r14
        L_0x0034:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x003b
            r3 = r3 | 48
            goto L_0x004e
        L_0x003b:
            r9 = r14 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x004e
            r9 = r32
            boolean r10 = r2.mo15006n0(r9)
            if (r10 == 0) goto L_0x004a
            r10 = 32
            goto L_0x004c
        L_0x004a:
            r10 = 16
        L_0x004c:
            r3 = r3 | r10
            goto L_0x0050
        L_0x004e:
            r9 = r32
        L_0x0050:
            r10 = r14 & 896(0x380, float:1.256E-42)
            r16 = 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x006c
            r10 = r12 & 4
            if (r10 != 0) goto L_0x0065
            r10 = r33
            boolean r17 = r2.mo15006n0(r10)
            if (r17 == 0) goto L_0x0067
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0065:
            r10 = r33
        L_0x0067:
            r17 = r16
        L_0x0069:
            r3 = r3 | r17
            goto L_0x006e
        L_0x006c:
            r10 = r33
        L_0x006e:
            r17 = r12 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r19 = 1024(0x400, float:1.435E-42)
            if (r17 == 0) goto L_0x0079
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x0079:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x008d
            r4 = r34
            boolean r20 = r2.mo14968d(r4)
            if (r20 == 0) goto L_0x0088
            r20 = r18
            goto L_0x008a
        L_0x0088:
            r20 = r19
        L_0x008a:
            r3 = r3 | r20
            goto L_0x008f
        L_0x008d:
            r4 = r34
        L_0x008f:
            r20 = 57344(0xe000, float:8.0356E-41)
            r20 = r14 & r20
            r21 = 16384(0x4000, float:2.2959E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            if (r20 != 0) goto L_0x00ae
            r20 = r12 & 16
            r5 = r35
            if (r20 != 0) goto L_0x00a9
            boolean r23 = r2.mo15006n0(r5)
            if (r23 == 0) goto L_0x00a9
            r23 = r21
            goto L_0x00ab
        L_0x00a9:
            r23 = r22
        L_0x00ab:
            r3 = r3 | r23
            goto L_0x00b0
        L_0x00ae:
            r5 = r35
        L_0x00b0:
            r23 = 458752(0x70000, float:6.42848E-40)
            r24 = r14 & r23
            if (r24 != 0) goto L_0x00ca
            r24 = r12 & 32
            r7 = r36
            if (r24 != 0) goto L_0x00c5
            boolean r26 = r2.mo14980g(r7)
            if (r26 == 0) goto L_0x00c5
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00c5:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00c7:
            r3 = r3 | r26
            goto L_0x00cc
        L_0x00ca:
            r7 = r36
        L_0x00cc:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r14 & r26
            if (r26 != 0) goto L_0x00e6
            r26 = r12 & 64
            r0 = r38
            if (r26 != 0) goto L_0x00e1
            boolean r27 = r2.mo14980g(r0)
            if (r27 == 0) goto L_0x00e1
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r3 = r3 | r27
            goto L_0x00e8
        L_0x00e6:
            r0 = r38
        L_0x00e8:
            r11 = r12 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x00f3
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r28
            r0 = r40
            goto L_0x0107
        L_0x00f3:
            r28 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r14 & r28
            r0 = r40
            if (r28 != 0) goto L_0x0107
            boolean r1 = r2.mo14968d(r0)
            if (r1 == 0) goto L_0x0104
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r3 = r3 | r1
        L_0x0107:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0112
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r28
            r0 = r41
            goto L_0x0127
        L_0x0112:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r14 & r28
            r0 = r41
            if (r28 != 0) goto L_0x0127
            boolean r28 = r2.mo14968d(r0)
            if (r28 == 0) goto L_0x0123
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0125
        L_0x0123:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0125:
            r3 = r3 | r28
        L_0x0127:
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0132
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r28
            r4 = r42
            goto L_0x0147
        L_0x0132:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r14 & r28
            r4 = r42
            if (r28 != 0) goto L_0x0147
            boolean r28 = r2.mo14927P(r4)
            if (r28 == 0) goto L_0x0143
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r3 = r3 | r28
        L_0x0147:
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0150
            r20 = r13 | 6
            r5 = r43
            goto L_0x0166
        L_0x0150:
            r28 = r13 & 14
            r5 = r43
            if (r28 != 0) goto L_0x0164
            boolean r28 = r2.mo14961b(r5)
            if (r28 == 0) goto L_0x015f
            r20 = 4
            goto L_0x0161
        L_0x015f:
            r20 = 2
        L_0x0161:
            r20 = r13 | r20
            goto L_0x0166
        L_0x0164:
            r20 = r13
        L_0x0166:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016f
            r20 = r20 | 48
            r7 = r44
            goto L_0x0182
        L_0x016f:
            r28 = r13 & 112(0x70, float:1.57E-43)
            r7 = r44
            if (r28 != 0) goto L_0x0182
            boolean r8 = r2.mo14927P(r7)
            if (r8 == 0) goto L_0x017e
            r24 = 32
            goto L_0x0180
        L_0x017e:
            r24 = 16
        L_0x0180:
            r20 = r20 | r24
        L_0x0182:
            r8 = r20
            r7 = r12 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x018b
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x019f
        L_0x018b:
            r9 = r13 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x019f
            r9 = r45
            boolean r20 = r2.mo14927P(r9)
            if (r20 == 0) goto L_0x019a
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x019c
        L_0x019a:
            r27 = r16
        L_0x019c:
            r8 = r8 | r27
            goto L_0x01a1
        L_0x019f:
            r9 = r45
        L_0x01a1:
            r9 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x01b9
            r9 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r9 != 0) goto L_0x01b2
            r9 = r46
            boolean r16 = r2.mo14980g(r9)
            if (r16 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b2:
            r9 = r46
        L_0x01b4:
            r18 = r19
        L_0x01b6:
            r8 = r8 | r18
            goto L_0x01bb
        L_0x01b9:
            r9 = r46
        L_0x01bb:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x01d6
            r9 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r9 != 0) goto L_0x01cf
            r9 = r48
            boolean r16 = r2.mo14980g(r9)
            if (r16 == 0) goto L_0x01d1
            goto L_0x01d3
        L_0x01cf:
            r9 = r48
        L_0x01d1:
            r21 = r22
        L_0x01d3:
            r8 = r8 | r21
            goto L_0x01d8
        L_0x01d6:
            r9 = r48
        L_0x01d8:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r12 & r16
            if (r16 == 0) goto L_0x01e4
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x01e1:
            r8 = r8 | r16
            goto L_0x01f4
        L_0x01e4:
            r16 = r13 & r23
            if (r16 != 0) goto L_0x01f4
            boolean r16 = r2.mo14927P(r15)
            if (r16 == 0) goto L_0x01f1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e1
        L_0x01f1:
            r16 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01e1
        L_0x01f4:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r3 & r16
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L_0x022f
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r8
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r10) goto L_0x022f
            boolean r9 = r2.mo15011p()
            if (r9 != 0) goto L_0x020e
            goto L_0x022f
        L_0x020e:
            r2.mo14958a0()
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r9 = r36
            r19 = r38
            r11 = r40
            r12 = r41
            r13 = r42
            r14 = r43
            r17 = r44
            r15 = r45
            r21 = r46
            r24 = r48
            goto L_0x0445
        L_0x022f:
            r2.mo14930Q()
            r9 = r14 & 1
            if (r9 == 0) goto L_0x028c
            boolean r9 = r2.mo14977f0()
            if (r9 == 0) goto L_0x023d
            goto L_0x028c
        L_0x023d:
            r2.mo14958a0()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0246
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0246:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x024e
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r0
        L_0x024e:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0256
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x0256:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x025e
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x025e:
            r0 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0264
            r8 = r8 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0264:
            r0 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x026c
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r0
        L_0x026c:
            r0 = r32
            r1 = r33
            r4 = r35
            r9 = r36
            r19 = r38
            r6 = r40
            r5 = r41
            r7 = r42
            r17 = r44
            r11 = r45
            r21 = r46
            r24 = r48
            r12 = r3
            r13 = r8
            r3 = r34
            r8 = r43
            goto L_0x0380
        L_0x028c:
            if (r6 == 0) goto L_0x0291
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0293
        L_0x0291:
            r6 = r32
        L_0x0293:
            r9 = r12 & 4
            r10 = 0
            if (r9 == 0) goto L_0x02a3
            r9 = 0
            r32 = r6
            r6 = 3
            androidx.compose.material3.i r6 = m25436h(r10, r10, r2, r9, r6)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02a7
        L_0x02a3:
            r32 = r6
            r6 = r33
        L_0x02a7:
            if (r17 == 0) goto L_0x02b0
            androidx.compose.material3.BottomSheetDefaults r9 = androidx.compose.material3.BottomSheetDefaults.f19174a
            float r9 = r9.mo11176g()
            goto L_0x02b2
        L_0x02b0:
            r9 = r34
        L_0x02b2:
            r17 = r12 & 16
            if (r17 == 0) goto L_0x02c5
            androidx.compose.material3.BottomSheetDefaults r10 = androidx.compose.material3.BottomSheetDefaults.f19174a
            r33 = r6
            r6 = 6
            androidx.compose.ui.graphics.g4 r10 = r10.mo11173d(r2, r6)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r16
            goto L_0x02ca
        L_0x02c5:
            r33 = r6
            r6 = 6
            r10 = r35
        L_0x02ca:
            r16 = r12 & 32
            r34 = r9
            if (r16 == 0) goto L_0x02df
            androidx.compose.material3.BottomSheetDefaults r9 = androidx.compose.material3.BottomSheetDefaults.f19174a
            long r19 = r9.mo11171b(r2, r6)
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r6
            r35 = r10
            r9 = r19
            goto L_0x02e3
        L_0x02df:
            r35 = r10
            r9 = r36
        L_0x02e3:
            r6 = r12 & 64
            if (r6 == 0) goto L_0x02f4
            int r6 = r3 >> 15
            r6 = r6 & 14
            long r19 = androidx.compose.material3.ColorSchemeKt.m25516c(r9, r2, r6)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
            goto L_0x02f6
        L_0x02f4:
            r19 = r38
        L_0x02f6:
            if (r11 == 0) goto L_0x02ff
            androidx.compose.material3.BottomSheetDefaults r6 = androidx.compose.material3.BottomSheetDefaults.f19174a
            float r6 = r6.mo11172c()
            goto L_0x0301
        L_0x02ff:
            r6 = r40
        L_0x0301:
            if (r1 == 0) goto L_0x030a
            androidx.compose.material3.BottomSheetDefaults r1 = androidx.compose.material3.BottomSheetDefaults.f19174a
            float r1 = r1.mo11172c()
            goto L_0x030c
        L_0x030a:
            r1 = r41
        L_0x030c:
            if (r0 == 0) goto L_0x0315
            androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt r0 = androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.f19254a
            kotlin.jvm.functions.p r0 = r0.mo11298a()
            goto L_0x0317
        L_0x0315:
            r0 = r42
        L_0x0317:
            if (r4 == 0) goto L_0x031b
            r4 = 1
            goto L_0x031d
        L_0x031b:
            r4 = r43
        L_0x031d:
            if (r5 == 0) goto L_0x0322
            r17 = 0
            goto L_0x0324
        L_0x0322:
            r17 = r44
        L_0x0324:
            if (r7 == 0) goto L_0x032d
            androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt r5 = androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.f19254a
            kotlin.jvm.functions.q r5 = r5.mo11299b()
            goto L_0x032f
        L_0x032d:
            r5 = r45
        L_0x032f:
            r7 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0344
            androidx.compose.material3.i1 r7 = androidx.compose.material3.C8215i1.f20180a
            r11 = 6
            androidx.compose.material3.z r7 = r7.mo12652a(r2, r11)
            long r21 = r7.mo14802A()
            r8 = r8 & -7169(0xffffffffffffe3ff, float:NaN)
            r11 = r8
            r7 = r21
            goto L_0x0347
        L_0x0344:
            r11 = r8
            r7 = r46
        L_0x0347:
            r36 = r0
            r0 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x036d
            int r0 = r11 >> 9
            r0 = r0 & 14
            long r21 = androidx.compose.material3.ColorSchemeKt.m25516c(r7, r2, r0)
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r11
            r13 = r0
            r12 = r3
            r11 = r5
            r24 = r21
            r0 = r32
            r3 = r34
            r5 = r1
            r21 = r7
            r1 = r33
            r7 = r36
            r8 = r4
            r4 = r35
            goto L_0x0380
        L_0x036d:
            r0 = r32
            r24 = r48
            r12 = r3
            r21 = r7
            r13 = r11
            r3 = r34
            r7 = r36
            r8 = r4
            r11 = r5
            r4 = r35
            r5 = r1
            r1 = r33
        L_0x0380:
            r2.mo14899E()
            boolean r27 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r27 == 0) goto L_0x0391
            java.lang.String r14 = "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:96)"
            r15 = 144898711(0x8a2fa97, float:9.808934E-34)
            androidx.compose.runtime.ComposerKt.m29845w0(r15, r12, r13, r14)
        L_0x0391:
            androidx.compose.material3.SheetState r14 = r1.mo12648a()
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1 r15 = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1
            r32 = r15
            r33 = r1
            r34 = r3
            r35 = r8
            r36 = r4
            r37 = r9
            r39 = r19
            r41 = r6
            r42 = r5
            r43 = r7
            r44 = r31
            r45 = r12
            r46 = r13
            r32.<init>(r33, r34, r35, r36, r37, r39, r41, r42, r43, r44, r45, r46)
            r46 = r4
            r4 = 106433656(0x6580c78, float:4.0634245E-35)
            r47 = r5
            r5 = 1
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r4, r5, r15)
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2 r15 = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2
            r15.<init>(r11, r1, r13)
            r48 = r6
            r6 = -1629779374(0xffffffff9edb8a52, float:-2.3244735E-20)
            androidx.compose.runtime.internal.a r5 = androidx.compose.runtime.internal.C8553b.m31048b(r2, r6, r5, r15)
            r6 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r6)
            boolean r6 = r2.mo15006n0(r1)
            java.lang.Object r15 = r2.mo14921N()
            if (r6 != 0) goto L_0x03e6
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r15 != r6) goto L_0x03ee
        L_0x03e6:
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3$1 r15 = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3$1
            r15.<init>(r1)
            r2.mo14893C(r15)
        L_0x03ee:
            r2.mo15002m0()
            r6 = r15
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            int r15 = r12 >> 3
            r15 = r15 & 14
            r15 = r15 | 27648(0x6c00, float:3.8743E-41)
            r18 = r13 & 112(0x70, float:1.57E-43)
            r15 = r15 | r18
            r49 = r1
            int r1 = r13 >> 9
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r15
            r15 = 6
            int r12 = r12 << r15
            r12 = r12 & r23
            r1 = r1 | r12
            int r12 = r13 << 15
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r12
            r1 = r1 | r13
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r12 = r12 & r13
            r1 = r1 | r12
            r32 = r0
            r33 = r17
            r34 = r50
            r35 = r4
            r36 = r5
            r37 = r3
            r38 = r6
            r39 = r14
            r40 = r21
            r42 = r24
            r44 = r2
            r45 = r1
            m25431c(r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r44, r45)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0438
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0438:
            r6 = r46
            r12 = r47
            r4 = r49
            r5 = r3
            r13 = r7
            r14 = r8
            r15 = r11
            r11 = r48
            r3 = r0
        L_0x0445:
            androidx.compose.runtime.t1 r8 = r2.mo15020s()
            if (r8 != 0) goto L_0x044c
            goto L_0x0479
        L_0x044c:
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$4 r7 = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$4
            r0 = r7
            r1 = r31
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r29 = r7
            r6 = r9
            r10 = r8
            r8 = r19
            r30 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r17
            r16 = r21
            r18 = r24
            r20 = r50
            r21 = r52
            r22 = r53
            r23 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23)
            r1 = r29
            r0 = r30
            r0.mo15202a(r1)
        L_0x0479:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m25429a(kotlin.jvm.functions.q, androidx.compose.ui.m, androidx.compose.material3.i, float, androidx.compose.ui.graphics.g4, long, long, float, float, kotlin.jvm.functions.p, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.q, long, long, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8251n0
    /* renamed from: b */
    public static final C8179c<SheetValue> m25430b(SheetState sheetState, C11304p<? super SheetValue, ? super Float, C11079d2> pVar, C11300l<? super SheetValue, C11079d2> lVar) {
        return new C7956a(sheetState, pVar, lVar);
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_]]")
    /* renamed from: c */
    public static final void m25431c(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, float f, C11289a<Float> aVar, SheetState sheetState, long j, long j2, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C8767m mVar2 = mVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar;
        C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar3 = qVar;
        C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar4 = qVar2;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar2;
        C11289a<Float> aVar2 = aVar;
        SheetState sheetState2 = sheetState;
        int i13 = i;
        C8592o o = oVar.mo15009o(-1120561936);
        if ((i13 & 14) == 0) {
            if (o.mo15006n0(mVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i13;
        } else {
            i2 = i13;
        }
        if ((i13 & 112) == 0) {
            if (o.mo14927P(pVar3)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i13 & 896) == 0) {
            if (o.mo14927P(qVar3)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i13 & 7168) == 0) {
            if (o.mo14927P(qVar4)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((57344 & i13) == 0) {
            if (o.mo14927P(pVar4)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        float f2 = f;
        if ((458752 & i13) == 0) {
            if (o.mo14968d(f2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((3670016 & i13) == 0) {
            if (o.mo14927P(aVar2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((29360128 & i13) == 0) {
            if (o.mo15006n0(sheetState2)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((234881024 & i13) == 0) {
            if (o.mo14980g(j)) {
                i4 = C8698y1.f23302n;
            } else {
                i4 = C9647e0.f26435a;
            }
            i2 |= i4;
        } else {
            long j3 = j;
        }
        long j4 = j2;
        if ((i13 & 1879048192) == 0) {
            if (o.mo14980g(j4)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        if ((i2 & 1533916891) != 306783378 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1120561936, i2, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:316)");
            }
            Object[] objArr = {qVar4, aVar2, pVar3, mVar2, C15240j2.m66071n(j), C15240j2.m66071n(j2), qVar3, C16483g.m74451w(f), pVar4, sheetState2};
            o.mo14918M(-568225417);
            boolean z = false;
            for (int i14 = 0; i14 < 10; i14++) {
                z |= o.mo15006n0(objArr[i14]);
            }
            Object N = o.mo14921N();
            if (z || N == C8592o.f23032a.mo16277a()) {
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 = r0;
                oVar2 = o;
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$12 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(aVar, pVar, pVar2, sheetState, qVar2, i2, mVar, j, j2, qVar, f);
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
            s.mo15202a(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(mVar, pVar, qVar, qVar2, pVar2, f, aVar, sheetState, j, j2, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    public static final void m25432d(SheetState sheetState, float f, boolean z, float f2, C15218g4 g4Var, long j, long j2, float f3, float f4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        SheetState sheetState2 = sheetState;
        float f5 = f;
        float f6 = f2;
        int i5 = i;
        C8592o o = oVar.mo15009o(-763942484);
        int i6 = 4;
        if ((i5 & 14) == 0) {
            i3 = (o.mo15006n0(sheetState2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= o.mo14968d(f5) ? 32 : 16;
        }
        boolean z2 = z;
        if ((i5 & 896) == 0) {
            i3 |= o.mo14961b(z2) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i3 |= o.mo14968d(f6) ? 2048 : 1024;
        }
        C15218g4 g4Var2 = g4Var;
        if ((i5 & 57344) == 0) {
            i3 |= o.mo15006n0(g4Var2) ? 16384 : 8192;
        }
        long j3 = j;
        if ((i5 & 458752) == 0) {
            i3 |= o.mo14980g(j3) ? 131072 : 65536;
        }
        if ((3670016 & i5) == 0) {
            i3 |= o.mo14980g(j2) ? 1048576 : 524288;
        } else {
            long j4 = j2;
        }
        if ((29360128 & i5) == 0) {
            i3 |= o.mo14968d(f3) ? 8388608 : 4194304;
        } else {
            float f7 = f3;
        }
        float f8 = f4;
        if ((i5 & 234881024) == 0) {
            i3 |= o.mo14968d(f8) ? C8698y1.f23302n : C9647e0.f26435a;
        }
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        if ((i5 & 1879048192) == 0) {
            i3 |= o.mo14927P(pVar2) ? 536870912 : 268435456;
        }
        C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar2 = qVar;
        if ((i2 & 14) == 0) {
            if (!o.mo14927P(qVar2)) {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && o.mo15011p()) {
            o.mo14958a0();
        } else {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-763942484, i3, i4, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:196)");
            }
            o.mo14918M(773894976);
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, o));
                o.mo14893C(wVar);
                N = wVar;
            }
            o.mo15002m0();
            C12074o0 a = ((C8690w) N).mo16831a();
            o.mo15002m0();
            float g5 = ((C16479d) o.mo15032w(CompositionLocalsKt.m71011i())).mo7425g5(f5);
            int i7 = i3;
            Orientation orientation = Orientation.Vertical;
            int i8 = i4;
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(sheetState2) | o.mo15006n0(a);
            Object N2 = o.mo14921N();
            if (n0 || N2 == aVar.mo16277a()) {
                N2 = m25430b(sheetState2, new C7969x2ac34721(a, sheetState2), new C7971x2ac34722(a, sheetState2));
                o.mo14893C(N2);
            }
            o.mo15002m0();
            C8179c cVar = (C8179c) N2;
            C8767m t = SizeKt.m10120t(SizeKt.m10114n(SizeKt.m10094J(C8767m.f23478j, 0.0f, SheetDefaultsKt.m26132c(), 1, (Object) null), 0.0f, 1, (Object) null), f5, 0.0f, 2, (Object) null);
            SwipeableV2State<SheetValue> j5 = sheetState.mo11862j();
            o.mo14918M(1157296644);
            boolean n02 = o.mo15006n0(j5);
            Object N3 = o.mo14921N();
            if (n02 || N3 == aVar.mo16277a()) {
                N3 = SheetDefaultsKt.m26130a(sheetState2, orientation, new BottomSheetScaffoldKt$StandardBottomSheet$1$1(a, sheetState2));
                o.mo14893C(N3);
            }
            o.mo15002m0();
            C8767m n = SwipeableV2Kt.m26473n(NestedScrollModifierKt.m68305b(t, (C15446a) N3, (NestedScrollDispatcher) null, 2, (Object) null), sheetState.mo11862j(), orientation, z, false, (C2243g) null, 24, (Object) null);
            SwipeableV2State<SheetValue> j6 = sheetState.mo11862j();
            Set u = C10930d1.m40902u(SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded);
            Float valueOf = Float.valueOf(f2);
            Float valueOf2 = Float.valueOf(g5);
            o.mo14918M(1618982084);
            boolean n03 = o.mo15006n0(valueOf) | o.mo15006n0(sheetState2) | o.mo15006n0(valueOf2);
            Object N4 = o.mo14921N();
            if (n03 || N4 == aVar.mo16277a()) {
                N4 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1(sheetState2, f6, g5);
                o.mo14893C(N4);
            }
            o.mo15002m0();
            C8767m k = SwipeableV2Kt.m26470k(n, j6, u, cVar, (C11304p) N4);
            int i9 = i7;
            BottomSheetScaffoldKt$StandardBottomSheet$3 bottomSheetScaffoldKt$StandardBottomSheet$3 = r0;
            BottomSheetScaffoldKt$StandardBottomSheet$3 bottomSheetScaffoldKt$StandardBottomSheet$32 = new BottomSheetScaffoldKt$StandardBottomSheet$3(pVar, qVar, i8, sheetState, z, a, i9);
            int i10 = i9 >> 9;
            SurfaceKt.m26352a(k, g4Var, j, j2, f3, f4, (C2223i) null, C8553b.m31048b(o, -1381492089, true, bottomSheetScaffoldKt$StandardBottomSheet$3), o, (i10 & 112) | 12582912 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752), 64);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            BottomSheetScaffoldKt$StandardBottomSheet$4 bottomSheetScaffoldKt$StandardBottomSheet$4 = r0;
            BottomSheetScaffoldKt$StandardBottomSheet$4 bottomSheetScaffoldKt$StandardBottomSheet$42 = new BottomSheetScaffoldKt$StandardBottomSheet$4(sheetState, f, z, f2, g4Var, j, j2, f3, f4, pVar, qVar, i, i2);
            s.mo15202a(bottomSheetScaffoldKt$StandardBottomSheet$4);
        }
    }

    @C8540g
    @C8251n0
    @C12579k
    /* renamed from: h */
    public static final C8213i m25436h(@C12580l SheetState sheetState, @C12580l SnackbarHostState snackbarHostState, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(-1474606134);
        if ((i2 & 1) != 0) {
            sheetState = m25437i((SheetValue) null, (C11300l<? super SheetValue, Boolean>) null, false, oVar, 0, 7);
        }
        if ((i2 & 2) != 0) {
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
            ComposerKt.m29845w0(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:166)");
        }
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(sheetState) | oVar.mo15006n0(snackbarHostState);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == C8592o.f23032a.mo16277a()) {
            N2 = new C8213i(sheetState, snackbarHostState);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        C8213i iVar = (C8213i) N2;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return iVar;
    }

    @C8251n0
    @C8540g
    @C12579k
    /* renamed from: i */
    public static final SheetState m25437i(@C12580l SheetValue sheetValue, @C12580l C11300l<? super SheetValue, Boolean> lVar, boolean z, @C12580l C8592o oVar, int i, int i2) {
        oVar.mo14918M(678511581);
        if ((i2 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i2 & 2) != 0) {
            lVar = BottomSheetScaffoldKt$rememberStandardBottomSheetState$1.f19181f;
        }
        C11300l<? super SheetValue, Boolean> lVar2 = lVar;
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:188)");
        }
        SheetState d = SheetDefaultsKt.m26133d(false, lVar2, sheetValue2, z2, oVar, (i & 112) | 6 | ((i << 6) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }
}
