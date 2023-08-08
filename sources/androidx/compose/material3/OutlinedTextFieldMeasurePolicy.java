package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1124:1\n1#2:1125\n223#3,2:1126\n223#3,2:1128\n223#3,2:1130\n223#3,2:1132\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n705#1:1126,2\n756#1:1128,2\n828#1:1130,2\n868#1:1132,2\n*E\n"})
public final class OutlinedTextFieldMeasurePolicy implements C15560f0 {
    @C12579k

    /* renamed from: a */
    public final C11300l<C15104m, C11079d2> f19540a;

    /* renamed from: b */
    public final boolean f19541b;

    /* renamed from: c */
    public final float f19542c;
    @C12579k

    /* renamed from: d */
    public final C2366i0 f19543d;

    public OutlinedTextFieldMeasurePolicy(@C12579k C11300l<? super C15104m, C11079d2> lVar, boolean z, float f, @C12579k C2366i0 i0Var) {
        Intrinsics.checkNotNullParameter(lVar, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        this.f19540a = lVar;
        this.f19541b = z;
        this.f19542c = f;
        this.f19543d = i0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.ui.layout.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: androidx.compose.ui.layout.e0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p004ui.layout.C15564g0 mo6397a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15568h0 r46, @org.jetbrains.annotations.C12579k java.util.List<? extends androidx.compose.p004ui.layout.C15557e0> r47, long r48) {
        /*
            r45 = this;
            r14 = r45
            r15 = r46
            r0 = r47
            java.lang.String r1 = "$this$measure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "measurables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            androidx.compose.foundation.layout.i0 r1 = r14.f19543d
            float r1 = r1.mo8090a()
            int r1 = r15.mo7429n2(r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 10
            r9 = 0
            r2 = r48
            long r2 = androidx.compose.p004ui.unit.C16476b.m74351e(r2, r4, r5, r6, r7, r8, r9)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x002d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r4.next()
            r7 = r5
            androidx.compose.ui.layout.e0 r7 = (androidx.compose.p004ui.layout.C15557e0) r7
            java.lang.Object r7 = androidx.compose.p004ui.layout.C15594q.m69317a(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x002d
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            androidx.compose.ui.layout.e0 r5 = (androidx.compose.p004ui.layout.C15557e0) r5
            if (r5 == 0) goto L_0x0051
            androidx.compose.ui.layout.w0 r4 = r5.mo44324t0(r2)
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            int r5 = androidx.compose.material3.TextFieldImplKt.m26646n(r4)
            r7 = 0
            int r5 = r5 + r7
            int r8 = androidx.compose.material3.TextFieldImplKt.m26645m(r4)
            int r8 = java.lang.Math.max(r7, r8)
            java.util.Iterator r9 = r0.iterator()
        L_0x0064:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x007e
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.compose.ui.layout.e0 r11 = (androidx.compose.p004ui.layout.C15557e0) r11
            java.lang.Object r11 = androidx.compose.p004ui.layout.C15594q.m69317a(r11)
            java.lang.String r12 = "Trailing"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x0064
            goto L_0x007f
        L_0x007e:
            r10 = 0
        L_0x007f:
            androidx.compose.ui.layout.e0 r10 = (androidx.compose.p004ui.layout.C15557e0) r10
            if (r10 == 0) goto L_0x0097
            int r9 = -r5
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r9
            long r11 = androidx.compose.p004ui.unit.C16478c.m74385j(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.w0 r9 = r10.mo44324t0(r11)
            goto L_0x0098
        L_0x0097:
            r9 = 0
        L_0x0098:
            int r10 = androidx.compose.material3.TextFieldImplKt.m26646n(r9)
            int r5 = r5 + r10
            int r10 = androidx.compose.material3.TextFieldImplKt.m26645m(r9)
            int r8 = java.lang.Math.max(r8, r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x00a9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c3
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.e0 r12 = (androidx.compose.p004ui.layout.C15557e0) r12
            java.lang.Object r12 = androidx.compose.p004ui.layout.C15594q.m69317a(r12)
            java.lang.String r13 = "Prefix"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x00a9
            goto L_0x00c4
        L_0x00c3:
            r11 = 0
        L_0x00c4:
            androidx.compose.ui.layout.e0 r11 = (androidx.compose.p004ui.layout.C15557e0) r11
            if (r11 == 0) goto L_0x00dc
            int r10 = -r5
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r10
            long r12 = androidx.compose.p004ui.unit.C16478c.m74385j(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.w0 r10 = r11.mo44324t0(r12)
            goto L_0x00dd
        L_0x00dc:
            r10 = 0
        L_0x00dd:
            int r11 = androidx.compose.material3.TextFieldImplKt.m26646n(r10)
            int r5 = r5 + r11
            int r11 = androidx.compose.material3.TextFieldImplKt.m26645m(r10)
            int r8 = java.lang.Math.max(r8, r11)
            java.util.Iterator r11 = r0.iterator()
        L_0x00ee:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0108
            java.lang.Object r12 = r11.next()
            r13 = r12
            androidx.compose.ui.layout.e0 r13 = (androidx.compose.p004ui.layout.C15557e0) r13
            java.lang.Object r13 = androidx.compose.p004ui.layout.C15594q.m69317a(r13)
            java.lang.String r6 = "Suffix"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00ee
            goto L_0x0109
        L_0x0108:
            r12 = 0
        L_0x0109:
            androidx.compose.ui.layout.e0 r12 = (androidx.compose.p004ui.layout.C15557e0) r12
            if (r12 == 0) goto L_0x0122
            int r6 = -r5
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r6
            r11 = r8
            long r7 = androidx.compose.p004ui.unit.C16478c.m74385j(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.w0 r7 = r12.mo44324t0(r7)
            goto L_0x0124
        L_0x0122:
            r11 = r8
            r7 = 0
        L_0x0124:
            int r8 = androidx.compose.material3.TextFieldImplKt.m26646n(r7)
            int r5 = r5 + r8
            int r8 = androidx.compose.material3.TextFieldImplKt.m26645m(r7)
            int r8 = java.lang.Math.max(r11, r8)
            float r11 = r14.f19542c
            r12 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x013d
            r11 = 1
            r23 = r11
            goto L_0x013f
        L_0x013d:
            r23 = 0
        L_0x013f:
            androidx.compose.foundation.layout.i0 r11 = r14.f19543d
            androidx.compose.ui.unit.LayoutDirection r12 = r46.getLayoutDirection()
            float r11 = r11.mo8091b(r12)
            int r11 = r15.mo7429n2(r11)
            androidx.compose.foundation.layout.i0 r12 = r14.f19543d
            androidx.compose.ui.unit.LayoutDirection r13 = r46.getLayoutDirection()
            float r12 = r12.mo8092c(r13)
            int r12 = r15.mo7429n2(r12)
            int r11 = r11 + r12
            if (r23 == 0) goto L_0x0161
            int r12 = -r5
            int r12 = r12 - r11
            goto L_0x0162
        L_0x0161:
            int r12 = -r11
        L_0x0162:
            int r11 = -r1
            long r12 = androidx.compose.p004ui.unit.C16478c.m74384i(r2, r12, r11)
            java.util.Iterator r16 = r0.iterator()
        L_0x016b:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x018b
            java.lang.Object r17 = r16.next()
            r18 = r17
            androidx.compose.ui.layout.e0 r18 = (androidx.compose.p004ui.layout.C15557e0) r18
            java.lang.Object r6 = androidx.compose.p004ui.layout.C15594q.m69317a(r18)
            r28 = r7
            java.lang.String r7 = "Label"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0188
            goto L_0x018f
        L_0x0188:
            r7 = r28
            goto L_0x016b
        L_0x018b:
            r28 = r7
            r17 = 0
        L_0x018f:
            r6 = r17
            androidx.compose.ui.layout.e0 r6 = (androidx.compose.p004ui.layout.C15557e0) r6
            if (r6 == 0) goto L_0x019b
            androidx.compose.ui.layout.w0 r6 = r6.mo44324t0(r12)
            r12 = r6
            goto L_0x019c
        L_0x019b:
            r12 = 0
        L_0x019c:
            if (r12 == 0) goto L_0x01b5
            kotlin.jvm.functions.l<androidx.compose.ui.geometry.m, kotlin.d2> r6 = r14.f19540a
            int r7 = r12.mo44471K0()
            float r7 = (float) r7
            int r13 = r12.mo44468G0()
            float r13 = (float) r13
            long r16 = androidx.compose.p004ui.geometry.C15106n.m65033a(r7, r13)
            androidx.compose.ui.geometry.m r7 = androidx.compose.p004ui.geometry.C15104m.m65006c(r16)
            r6.invoke(r7)
        L_0x01b5:
            int r6 = androidx.compose.material3.TextFieldImplKt.m26645m(r12)
            int r6 = r6 / 2
            androidx.compose.foundation.layout.i0 r7 = r14.f19543d
            float r7 = r7.mo8093d()
            int r7 = r15.mo7429n2(r7)
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = -r5
            int r11 = r11 - r6
            r13 = r48
            long r29 = androidx.compose.p004ui.unit.C16478c.m74384i(r13, r5, r11)
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 11
            r36 = 0
            long r13 = androidx.compose.p004ui.unit.C16476b.m74351e(r29, r31, r32, r33, r34, r35, r36)
            java.util.Iterator r5 = r0.iterator()
        L_0x01e5:
            boolean r7 = r5.hasNext()
            java.lang.String r11 = "Collection contains no element matching the predicate."
            if (r7 == 0) goto L_0x0371
            java.lang.Object r7 = r5.next()
            androidx.compose.ui.layout.e0 r7 = (androidx.compose.p004ui.layout.C15557e0) r7
            r16 = r5
            java.lang.Object r5 = androidx.compose.p004ui.layout.C15594q.m69317a(r7)
            java.lang.String r15 = "TextField"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r15)
            if (r5 == 0) goto L_0x0369
            androidx.compose.ui.layout.w0 r7 = r7.mo44324t0(r13)
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 14
            r44 = 0
            r37 = r13
            long r13 = androidx.compose.p004ui.unit.C16476b.m74351e(r37, r39, r40, r41, r42, r43, r44)
            java.util.Iterator r5 = r0.iterator()
        L_0x021b:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x023f
            java.lang.Object r15 = r5.next()
            r16 = r15
            androidx.compose.ui.layout.e0 r16 = (androidx.compose.p004ui.layout.C15557e0) r16
            r17 = r5
            java.lang.Object r5 = androidx.compose.p004ui.layout.C15594q.m69317a(r16)
            r16 = r15
            java.lang.String r15 = "Hint"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r15)
            if (r5 == 0) goto L_0x023c
            r15 = r16
            goto L_0x0240
        L_0x023c:
            r5 = r17
            goto L_0x021b
        L_0x023f:
            r15 = 0
        L_0x0240:
            androidx.compose.ui.layout.e0 r15 = (androidx.compose.p004ui.layout.C15557e0) r15
            if (r15 == 0) goto L_0x024a
            androidx.compose.ui.layout.w0 r5 = r15.mo44324t0(r13)
            r13 = r5
            goto L_0x024b
        L_0x024a:
            r13 = 0
        L_0x024b:
            int r5 = androidx.compose.material3.TextFieldImplKt.m26645m(r7)
            int r14 = androidx.compose.material3.TextFieldImplKt.m26645m(r13)
            int r5 = java.lang.Math.max(r5, r14)
            int r5 = r5 + r6
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r8, r5)
            r18 = 0
            int r1 = -r1
            r20 = 1
            r21 = 0
            r16 = r2
            r19 = r1
            long r29 = androidx.compose.p004ui.unit.C16478c.m74385j(r16, r18, r19, r20, r21)
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 11
            r36 = 0
            long r1 = androidx.compose.p004ui.unit.C16476b.m74351e(r29, r31, r32, r33, r34, r35, r36)
            java.util.Iterator r3 = r0.iterator()
        L_0x0280:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x029a
            java.lang.Object r5 = r3.next()
            r6 = r5
            androidx.compose.ui.layout.e0 r6 = (androidx.compose.p004ui.layout.C15557e0) r6
            java.lang.Object r6 = androidx.compose.p004ui.layout.C15594q.m69317a(r6)
            java.lang.String r8 = "Supporting"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)
            if (r6 == 0) goto L_0x0280
            goto L_0x029b
        L_0x029a:
            r5 = 0
        L_0x029b:
            androidx.compose.ui.layout.e0 r5 = (androidx.compose.p004ui.layout.C15557e0) r5
            if (r5 == 0) goto L_0x02a5
            androidx.compose.ui.layout.w0 r1 = r5.mo44324t0(r1)
            r14 = r1
            goto L_0x02a6
        L_0x02a5:
            r14 = 0
        L_0x02a6:
            int r1 = androidx.compose.material3.TextFieldImplKt.m26645m(r14)
            int r16 = androidx.compose.material3.TextFieldImplKt.m26646n(r4)
            int r17 = androidx.compose.material3.TextFieldImplKt.m26646n(r9)
            int r18 = androidx.compose.material3.TextFieldImplKt.m26646n(r10)
            int r19 = androidx.compose.material3.TextFieldImplKt.m26646n(r28)
            int r20 = r7.mo44471K0()
            int r21 = androidx.compose.material3.TextFieldImplKt.m26646n(r12)
            int r22 = androidx.compose.material3.TextFieldImplKt.m26646n(r13)
            float r26 = r46.getDensity()
            r15 = r45
            androidx.compose.foundation.layout.i0 r2 = r15.f19543d
            r24 = r48
            r27 = r2
            int r8 = androidx.compose.material3.OutlinedTextFieldKt.m26003k(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            int r29 = androidx.compose.material3.TextFieldImplKt.m26645m(r4)
            int r30 = androidx.compose.material3.TextFieldImplKt.m26645m(r9)
            int r31 = androidx.compose.material3.TextFieldImplKt.m26645m(r10)
            int r32 = androidx.compose.material3.TextFieldImplKt.m26645m(r28)
            int r33 = r7.mo44468G0()
            int r34 = androidx.compose.material3.TextFieldImplKt.m26645m(r12)
            int r35 = androidx.compose.material3.TextFieldImplKt.m26645m(r13)
            int r36 = androidx.compose.material3.TextFieldImplKt.m26645m(r14)
            float r39 = r46.getDensity()
            androidx.compose.foundation.layout.i0 r2 = r15.f19543d
            r37 = r48
            r40 = r2
            int r16 = androidx.compose.material3.OutlinedTextFieldKt.m26002j(r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40)
            int r1 = r16 - r1
            java.util.Iterator r0 = r0.iterator()
        L_0x030a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0363
            java.lang.Object r2 = r0.next()
            androidx.compose.ui.layout.e0 r2 = (androidx.compose.p004ui.layout.C15557e0) r2
            java.lang.Object r3 = androidx.compose.p004ui.layout.C15594q.m69317a(r2)
            java.lang.String r5 = "Container"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x030a
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == r0) goto L_0x0329
            r3 = r8
            goto L_0x032a
        L_0x0329:
            r3 = 0
        L_0x032a:
            if (r1 == r0) goto L_0x032e
            r0 = r1
            goto L_0x032f
        L_0x032e:
            r0 = 0
        L_0x032f:
            long r0 = androidx.compose.p004ui.unit.C16478c.m74376a(r3, r8, r0, r1)
            androidx.compose.ui.layout.w0 r11 = r2.mo44324t0(r0)
            r17 = 0
            androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$2 r18 = new androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$2
            r0 = r18
            r1 = r16
            r2 = r8
            r3 = r4
            r4 = r9
            r5 = r10
            r6 = r28
            r19 = r8
            r8 = r12
            r9 = r13
            r10 = r11
            r11 = r14
            r12 = r45
            r13 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r5 = 4
            r6 = 0
            r0 = r46
            r1 = r19
            r2 = r16
            r3 = r17
            r4 = r18
            androidx.compose.ui.layout.g0 r0 = androidx.compose.p004ui.layout.C15568h0.m69206r2(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0363:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r11)
            throw r0
        L_0x0369:
            r15 = r45
            r15 = r46
            r5 = r16
            goto L_0x01e5
        L_0x0371:
            r15 = r45
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.mo6397a(androidx.compose.ui.layout.h0, java.util.List, long):androidx.compose.ui.layout.g0");
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo11771n(mVar, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.f19545f);
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo11770m(mVar, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.f19546f);
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo11771n(mVar, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.f19547f);
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo11770m(mVar, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.f19544f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.compose.ui.layout.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11770m(androidx.compose.p004ui.layout.C15583m r17, java.util.List<? extends androidx.compose.p004ui.layout.C15580l> r18, int r19, kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.layout.C15580l, ? super java.lang.Integer, java.lang.Integer> r20) {
        /*
            r16 = this;
            r0 = r20
            r1 = r18
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
        L_0x000a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01b3
            java.lang.Object r3 = r2.next()
            r4 = r3
            androidx.compose.ui.layout.l r4 = (androidx.compose.p004ui.layout.C15580l) r4
            java.lang.Object r4 = androidx.compose.material3.TextFieldImplKt.m26637e(r4)
            java.lang.String r5 = "TextField"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x01af
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r0.invoke(r3, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r7 = r2.intValue()
            java.util.Iterator r2 = r1.iterator()
        L_0x0035:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r2.next()
            r5 = r3
            androidx.compose.ui.layout.l r5 = (androidx.compose.p004ui.layout.C15580l) r5
            java.lang.Object r5 = androidx.compose.material3.TextFieldImplKt.m26637e(r5)
            java.lang.String r6 = "Label"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0035
            goto L_0x0051
        L_0x0050:
            r3 = r4
        L_0x0051:
            androidx.compose.ui.layout.l r3 = (androidx.compose.p004ui.layout.C15580l) r3
            r2 = 0
            if (r3 == 0) goto L_0x0066
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r0.invoke(r3, r5)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r8 = r3
            goto L_0x0067
        L_0x0066:
            r8 = r2
        L_0x0067:
            java.util.Iterator r3 = r1.iterator()
        L_0x006b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r3.next()
            r6 = r5
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            java.lang.Object r6 = androidx.compose.material3.TextFieldImplKt.m26637e(r6)
            java.lang.String r9 = "Trailing"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x006b
            goto L_0x0086
        L_0x0085:
            r5 = r4
        L_0x0086:
            androidx.compose.ui.layout.l r5 = (androidx.compose.p004ui.layout.C15580l) r5
            if (r5 == 0) goto L_0x009a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r0.invoke(r5, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r5 = r3
            goto L_0x009b
        L_0x009a:
            r5 = r2
        L_0x009b:
            java.util.Iterator r3 = r1.iterator()
        L_0x009f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00b9
            java.lang.Object r6 = r3.next()
            r9 = r6
            androidx.compose.ui.layout.l r9 = (androidx.compose.p004ui.layout.C15580l) r9
            java.lang.Object r9 = androidx.compose.material3.TextFieldImplKt.m26637e(r9)
            java.lang.String r10 = "Leading"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x009f
            goto L_0x00ba
        L_0x00b9:
            r6 = r4
        L_0x00ba:
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            if (r6 == 0) goto L_0x00cd
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r0.invoke(r6, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            goto L_0x00ce
        L_0x00cd:
            r3 = r2
        L_0x00ce:
            java.util.Iterator r6 = r1.iterator()
        L_0x00d2:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00ec
            java.lang.Object r9 = r6.next()
            r10 = r9
            androidx.compose.ui.layout.l r10 = (androidx.compose.p004ui.layout.C15580l) r10
            java.lang.Object r10 = androidx.compose.material3.TextFieldImplKt.m26637e(r10)
            java.lang.String r11 = "Prefix"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00d2
            goto L_0x00ed
        L_0x00ec:
            r9 = r4
        L_0x00ed:
            androidx.compose.ui.layout.l r9 = (androidx.compose.p004ui.layout.C15580l) r9
            if (r9 == 0) goto L_0x0100
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            java.lang.Object r6 = r0.invoke(r9, r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L_0x0101
        L_0x0100:
            r6 = r2
        L_0x0101:
            java.util.Iterator r9 = r1.iterator()
        L_0x0105:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x011f
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.compose.ui.layout.l r11 = (androidx.compose.p004ui.layout.C15580l) r11
            java.lang.Object r11 = androidx.compose.material3.TextFieldImplKt.m26637e(r11)
            java.lang.String r12 = "Suffix"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x0105
            goto L_0x0120
        L_0x011f:
            r10 = r4
        L_0x0120:
            androidx.compose.ui.layout.l r10 = (androidx.compose.p004ui.layout.C15580l) r10
            if (r10 == 0) goto L_0x0133
            java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
            java.lang.Object r9 = r0.invoke(r10, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            goto L_0x0134
        L_0x0133:
            r9 = r2
        L_0x0134:
            java.util.Iterator r10 = r1.iterator()
        L_0x0138:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0152
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.l r12 = (androidx.compose.p004ui.layout.C15580l) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.m26637e(r12)
            java.lang.String r13 = "Hint"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0138
            goto L_0x0153
        L_0x0152:
            r11 = r4
        L_0x0153:
            androidx.compose.ui.layout.l r11 = (androidx.compose.p004ui.layout.C15580l) r11
            if (r11 == 0) goto L_0x0166
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            java.lang.Object r10 = r0.invoke(r11, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L_0x0167
        L_0x0166:
            r10 = r2
        L_0x0167:
            java.util.Iterator r1 = r1.iterator()
        L_0x016b:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0185
            java.lang.Object r11 = r1.next()
            r12 = r11
            androidx.compose.ui.layout.l r12 = (androidx.compose.p004ui.layout.C15580l) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.m26637e(r12)
            java.lang.String r13 = "Supporting"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x016b
            r4 = r11
        L_0x0185:
            androidx.compose.ui.layout.l r4 = (androidx.compose.p004ui.layout.C15580l) r4
            if (r4 == 0) goto L_0x0198
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Object r0 = r0.invoke(r4, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x0199
        L_0x0198:
            r0 = r2
        L_0x0199:
            long r11 = androidx.compose.material3.TextFieldImplKt.m26644l()
            float r13 = r17.getDensity()
            r15 = r16
            androidx.compose.foundation.layout.i0 r14 = r15.f19543d
            r4 = r5
            r5 = r6
            r6 = r9
            r9 = r10
            r10 = r0
            int r0 = androidx.compose.material3.OutlinedTextFieldKt.m26002j(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            return r0
        L_0x01af:
            r15 = r16
            goto L_0x000a
        L_0x01b3:
            r15 = r16
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.mo11770m(androidx.compose.ui.layout.m, java.util.List, int, kotlin.jvm.functions.p):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: androidx.compose.ui.layout.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11771n(androidx.compose.p004ui.layout.C15583m r17, java.util.List<? extends androidx.compose.p004ui.layout.C15580l> r18, int r19, kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.layout.C15580l, ? super java.lang.Integer, java.lang.Integer> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            r2 = r18
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
        L_0x000c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0187
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.compose.ui.layout.l r5 = (androidx.compose.p004ui.layout.C15580l) r5
            java.lang.Object r5 = androidx.compose.material3.TextFieldImplKt.m26637e(r5)
            java.lang.String r6 = "TextField"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x000c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r3 = r1.invoke(r4, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r8 = r3.intValue()
            java.util.Iterator r3 = r2.iterator()
        L_0x0037:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r3.next()
            r6 = r4
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            java.lang.Object r6 = androidx.compose.material3.TextFieldImplKt.m26637e(r6)
            java.lang.String r7 = "Label"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0037
            goto L_0x0053
        L_0x0052:
            r4 = r5
        L_0x0053:
            androidx.compose.ui.layout.l r4 = (androidx.compose.p004ui.layout.C15580l) r4
            r3 = 0
            if (r4 == 0) goto L_0x0068
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            java.lang.Object r4 = r1.invoke(r4, r6)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r9 = r4
            goto L_0x0069
        L_0x0068:
            r9 = r3
        L_0x0069:
            java.util.Iterator r4 = r2.iterator()
        L_0x006d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0087
            java.lang.Object r6 = r4.next()
            r7 = r6
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            java.lang.Object r7 = androidx.compose.material3.TextFieldImplKt.m26637e(r7)
            java.lang.String r10 = "Trailing"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r10)
            if (r7 == 0) goto L_0x006d
            goto L_0x0088
        L_0x0087:
            r6 = r5
        L_0x0088:
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            if (r6 == 0) goto L_0x009c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            java.lang.Object r4 = r1.invoke(r6, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6 = r4
            goto L_0x009d
        L_0x009c:
            r6 = r3
        L_0x009d:
            java.util.Iterator r4 = r2.iterator()
        L_0x00a1:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00bb
            java.lang.Object r7 = r4.next()
            r10 = r7
            androidx.compose.ui.layout.l r10 = (androidx.compose.p004ui.layout.C15580l) r10
            java.lang.Object r10 = androidx.compose.material3.TextFieldImplKt.m26637e(r10)
            java.lang.String r11 = "Leading"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00a1
            goto L_0x00bc
        L_0x00bb:
            r7 = r5
        L_0x00bc:
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            if (r7 == 0) goto L_0x00cf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            java.lang.Object r4 = r1.invoke(r7, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            goto L_0x00d0
        L_0x00cf:
            r4 = r3
        L_0x00d0:
            java.util.Iterator r7 = r2.iterator()
        L_0x00d4:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00ee
            java.lang.Object r10 = r7.next()
            r11 = r10
            androidx.compose.ui.layout.l r11 = (androidx.compose.p004ui.layout.C15580l) r11
            java.lang.Object r11 = androidx.compose.material3.TextFieldImplKt.m26637e(r11)
            java.lang.String r12 = "Prefix"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x00d4
            goto L_0x00ef
        L_0x00ee:
            r10 = r5
        L_0x00ef:
            androidx.compose.ui.layout.l r10 = (androidx.compose.p004ui.layout.C15580l) r10
            if (r10 == 0) goto L_0x0102
            java.lang.Integer r7 = java.lang.Integer.valueOf(r19)
            java.lang.Object r7 = r1.invoke(r10, r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L_0x0103
        L_0x0102:
            r7 = r3
        L_0x0103:
            java.util.Iterator r10 = r2.iterator()
        L_0x0107:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0121
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.l r12 = (androidx.compose.p004ui.layout.C15580l) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.m26637e(r12)
            java.lang.String r13 = "Suffix"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0107
            goto L_0x0122
        L_0x0121:
            r11 = r5
        L_0x0122:
            androidx.compose.ui.layout.l r11 = (androidx.compose.p004ui.layout.C15580l) r11
            if (r11 == 0) goto L_0x0135
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            java.lang.Object r10 = r1.invoke(r11, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L_0x0136
        L_0x0135:
            r10 = r3
        L_0x0136:
            java.util.Iterator r2 = r2.iterator()
        L_0x013a:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0154
            java.lang.Object r11 = r2.next()
            r12 = r11
            androidx.compose.ui.layout.l r12 = (androidx.compose.p004ui.layout.C15580l) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.m26637e(r12)
            java.lang.String r13 = "Hint"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x013a
            r5 = r11
        L_0x0154:
            androidx.compose.ui.layout.l r5 = (androidx.compose.p004ui.layout.C15580l) r5
            if (r5 == 0) goto L_0x0167
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Object r1 = r1.invoke(r5, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x0168
        L_0x0167:
            r1 = r3
        L_0x0168:
            float r2 = r0.f19542c
            r5 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0173
            r2 = 1
            r11 = r2
            goto L_0x0174
        L_0x0173:
            r11 = r3
        L_0x0174:
            long r12 = androidx.compose.material3.TextFieldImplKt.m26644l()
            float r14 = r17.getDensity()
            androidx.compose.foundation.layout.i0 r15 = r0.f19543d
            r5 = r6
            r6 = r7
            r7 = r10
            r10 = r1
            int r1 = androidx.compose.material3.OutlinedTextFieldKt.m26003k(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return r1
        L_0x0187:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.mo11771n(androidx.compose.ui.layout.m, java.util.List, int, kotlin.jvm.functions.p):int");
    }
}
