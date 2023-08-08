package androidx.compose.p004ui.window;

import androidx.compose.p004ui.layout.C15560f0;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,456:1\n151#2,3:457\n33#2,4:460\n154#2,2:464\n38#2:466\n156#2:467\n171#2,13:468\n171#2,13:481\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n*L\n448#1:457,3\n448#1:460,4\n448#1:464,2\n448#1:466\n448#1:467\n449#1:468,13\n450#1:481,13\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1 */
public final class AndroidDialog_androidKt$DialogLayout$1 implements C15560f0 {

    /* renamed from: a */
    public static final AndroidDialog_androidKt$DialogLayout$1 f40976a = new AndroidDialog_androidKt$DialogLayout$1();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.ui.layout.w0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.layout.C15564g0 mo6397a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15568h0 r12, @org.jetbrains.annotations.C12579k java.util.List<? extends androidx.compose.p004ui.layout.C15557e0> r13, long r14) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$Layout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "measurables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.size()
            r0.<init>(r1)
            int r1 = r13.size()
            r2 = 0
            r3 = r2
        L_0x0019:
            if (r3 >= r1) goto L_0x002b
            java.lang.Object r4 = r13.get(r3)
            androidx.compose.ui.layout.e0 r4 = (androidx.compose.p004ui.layout.C15557e0) r4
            androidx.compose.ui.layout.w0 r4 = r4.mo44324t0(r14)
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x0019
        L_0x002b:
            boolean r13 = r0.isEmpty()
            r1 = 0
            r3 = 1
            if (r13 == 0) goto L_0x0035
            r13 = r1
            goto L_0x005b
        L_0x0035:
            java.lang.Object r13 = r0.get(r2)
            r4 = r13
            androidx.compose.ui.layout.w0 r4 = (androidx.compose.p004ui.layout.C15611w0) r4
            int r4 = r4.mo44471K0()
            int r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r0)
            if (r3 > r5) goto L_0x005b
            r6 = r3
        L_0x0047:
            java.lang.Object r7 = r0.get(r6)
            r8 = r7
            androidx.compose.ui.layout.w0 r8 = (androidx.compose.p004ui.layout.C15611w0) r8
            int r8 = r8.mo44471K0()
            if (r4 >= r8) goto L_0x0056
            r13 = r7
            r4 = r8
        L_0x0056:
            if (r6 == r5) goto L_0x005b
            int r6 = r6 + 1
            goto L_0x0047
        L_0x005b:
            androidx.compose.ui.layout.w0 r13 = (androidx.compose.p004ui.layout.C15611w0) r13
            if (r13 == 0) goto L_0x0064
            int r13 = r13.mo44471K0()
            goto L_0x0068
        L_0x0064:
            int r13 = androidx.compose.p004ui.unit.C16476b.m74364r(r14)
        L_0x0068:
            r5 = r13
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L_0x0070
            goto L_0x0096
        L_0x0070:
            java.lang.Object r13 = r0.get(r2)
            r1 = r13
            androidx.compose.ui.layout.w0 r1 = (androidx.compose.p004ui.layout.C15611w0) r1
            int r1 = r1.mo44468G0()
            int r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r0)
            if (r3 > r2) goto L_0x0095
        L_0x0081:
            java.lang.Object r4 = r0.get(r3)
            r6 = r4
            androidx.compose.ui.layout.w0 r6 = (androidx.compose.p004ui.layout.C15611w0) r6
            int r6 = r6.mo44468G0()
            if (r1 >= r6) goto L_0x0090
            r13 = r4
            r1 = r6
        L_0x0090:
            if (r3 == r2) goto L_0x0095
            int r3 = r3 + 1
            goto L_0x0081
        L_0x0095:
            r1 = r13
        L_0x0096:
            androidx.compose.ui.layout.w0 r1 = (androidx.compose.p004ui.layout.C15611w0) r1
            if (r1 == 0) goto L_0x009f
            int r13 = r1.mo44468G0()
            goto L_0x00a3
        L_0x009f:
            int r13 = androidx.compose.p004ui.unit.C16476b.m74363q(r14)
        L_0x00a3:
            r6 = r13
            r7 = 0
            androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$measure$1 r8 = new androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$measure$1
            r8.<init>(r0)
            r9 = 4
            r10 = 0
            r4 = r12
            androidx.compose.ui.layout.g0 r12 = androidx.compose.p004ui.layout.C15568h0.m69206r2(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.AndroidDialog_androidKt$DialogLayout$1.mo6397a(androidx.compose.ui.layout.h0, java.util.List, long):androidx.compose.ui.layout.g0");
    }
}
