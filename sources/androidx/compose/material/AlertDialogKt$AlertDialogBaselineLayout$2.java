package androidx.compose.material;

import androidx.compose.p004ui.layout.C15560f0;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n288#2,2:292\n288#2,2:294\n1#3:296\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2\n*L\n114#1:292,2\n117#1:294,2\n*E\n"})
public final class AlertDialogKt$AlertDialogBaselineLayout$2 implements C15560f0 {

    /* renamed from: a */
    public static final AlertDialogKt$AlertDialogBaselineLayout$2 f7500a = new AlertDialogKt$AlertDialogBaselineLayout$2();

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0118  */
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
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r0 = r13.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()
            r3 = r1
            androidx.compose.ui.layout.e0 r3 = (androidx.compose.p004ui.layout.C15557e0) r3
            java.lang.Object r3 = androidx.compose.p004ui.layout.C15594q.m69317a(r3)
            java.lang.String r4 = "title"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0010
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            androidx.compose.ui.layout.e0 r1 = (androidx.compose.p004ui.layout.C15557e0) r1
            if (r1 == 0) goto L_0x0041
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 11
            r10 = 0
            r3 = r14
            long r3 = androidx.compose.p004ui.unit.C16476b.m74351e(r3, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.layout.w0 r0 = r1.mo44324t0(r3)
            goto L_0x0042
        L_0x0041:
            r0 = r2
        L_0x0042:
            java.util.Iterator r13 = r13.iterator()
        L_0x0046:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r13.next()
            r3 = r1
            androidx.compose.ui.layout.e0 r3 = (androidx.compose.p004ui.layout.C15557e0) r3
            java.lang.Object r3 = androidx.compose.p004ui.layout.C15594q.m69317a(r3)
            java.lang.String r4 = "text"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0046
            goto L_0x0061
        L_0x0060:
            r1 = r2
        L_0x0061:
            androidx.compose.ui.layout.e0 r1 = (androidx.compose.p004ui.layout.C15557e0) r1
            if (r1 == 0) goto L_0x0076
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 11
            r10 = 0
            r3 = r14
            long r13 = androidx.compose.p004ui.unit.C16476b.m74351e(r3, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.layout.w0 r13 = r1.mo44324t0(r13)
            goto L_0x0077
        L_0x0076:
            r13 = r2
        L_0x0077:
            r14 = 0
            if (r0 == 0) goto L_0x007f
            int r15 = r0.mo44471K0()
            goto L_0x0080
        L_0x007f:
            r15 = r14
        L_0x0080:
            if (r13 == 0) goto L_0x0087
            int r1 = r13.mo44471K0()
            goto L_0x0088
        L_0x0087:
            r1 = r14
        L_0x0088:
            int r4 = java.lang.Math.max(r15, r1)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x00af
            androidx.compose.ui.layout.j r1 = androidx.compose.p004ui.layout.AlignmentLineKt.m68885a()
            int r1 = r0.mo44325A(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            if (r1 != r15) goto L_0x00a4
            r1 = r2
            goto L_0x00a8
        L_0x00a4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x00a8:
            if (r1 == 0) goto L_0x00af
            int r1 = r1.intValue()
            goto L_0x00b0
        L_0x00af:
            r1 = r14
        L_0x00b0:
            if (r0 == 0) goto L_0x00c9
            androidx.compose.ui.layout.j r3 = androidx.compose.p004ui.layout.AlignmentLineKt.m68886b()
            int r3 = r0.mo44325A(r3)
            if (r3 != r15) goto L_0x00be
            r3 = r2
            goto L_0x00c2
        L_0x00be:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x00c2:
            if (r3 == 0) goto L_0x00c9
            int r3 = r3.intValue()
            goto L_0x00ca
        L_0x00c9:
            r3 = r14
        L_0x00ca:
            long r5 = androidx.compose.material.AlertDialogKt.f7497c
            int r5 = r12.mo7433u5(r5)
            int r5 = r5 - r1
            if (r13 == 0) goto L_0x00eb
            androidx.compose.ui.layout.j r1 = androidx.compose.p004ui.layout.AlignmentLineKt.m68885a()
            int r1 = r13.mo44325A(r1)
            if (r1 != r15) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x00e4:
            if (r2 == 0) goto L_0x00eb
            int r15 = r2.intValue()
            goto L_0x00ec
        L_0x00eb:
            r15 = r14
        L_0x00ec:
            if (r0 != 0) goto L_0x00f7
            long r1 = androidx.compose.material.AlertDialogKt.f7499e
            int r1 = r12.mo7433u5(r1)
            goto L_0x00ff
        L_0x00f7:
            long r1 = androidx.compose.material.AlertDialogKt.f7498d
            int r1 = r12.mo7433u5(r1)
        L_0x00ff:
            if (r0 == 0) goto L_0x0107
            int r2 = r0.mo44468G0()
            int r2 = r2 + r5
            goto L_0x0108
        L_0x0107:
            r2 = r14
        L_0x0108:
            if (r0 != 0) goto L_0x010d
            int r6 = r1 - r15
            goto L_0x0116
        L_0x010d:
            if (r3 != 0) goto L_0x0112
            int r6 = r2 - r15
            goto L_0x0115
        L_0x0112:
            int r6 = r5 + r3
            int r6 = r6 - r15
        L_0x0115:
            int r6 = r6 + r1
        L_0x0116:
            if (r13 == 0) goto L_0x0130
            if (r3 != 0) goto L_0x0121
            int r14 = r13.mo44468G0()
            int r14 = r14 + r1
            int r14 = r14 - r15
            goto L_0x0130
        L_0x0121:
            int r7 = r13.mo44468G0()
            int r7 = r7 + r1
            int r7 = r7 - r15
            if (r0 == 0) goto L_0x012d
            int r14 = r0.mo44468G0()
        L_0x012d:
            int r14 = r14 - r3
            int r7 = r7 - r14
            r14 = r7
        L_0x0130:
            int r14 = r14 + r2
            r15 = 0
            androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 r7 = new androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
            r7.<init>(r0, r5, r13, r6)
            r8 = 4
            r9 = 0
            r3 = r12
            r5 = r14
            r6 = r15
            androidx.compose.ui.layout.g0 r12 = androidx.compose.p004ui.layout.C15568h0.m69206r2(r3, r4, r5, r6, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.mo6397a(androidx.compose.ui.layout.h0, java.util.List, long):androidx.compose.ui.layout.g0");
    }
}
