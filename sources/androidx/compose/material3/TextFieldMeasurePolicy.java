package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1121:1\n1#2:1122\n223#3,2:1123\n223#3,2:1125\n223#3,2:1127\n223#3,2:1129\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n689#1:1123,2\n738#1:1125,2\n829#1:1127,2\n866#1:1129,2\n*E\n"})
public final class TextFieldMeasurePolicy implements C15560f0 {

    /* renamed from: a */
    public final boolean f19869a;

    /* renamed from: b */
    public final float f19870b;
    @C12579k

    /* renamed from: c */
    public final C2366i0 f19871c;

    public TextFieldMeasurePolicy(boolean z, float f, @C12579k C2366i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        this.f19869a = z;
        this.f19870b = f;
        this.f19871c = i0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.ui.layout.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: androidx.compose.ui.layout.e0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p004ui.layout.C15564g0 mo6397a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15568h0 r47, @org.jetbrains.annotations.C12579k java.util.List<? extends androidx.compose.p004ui.layout.C15557e0> r48, long r49) {
        /*
            r46 = this;
            r15 = r46
            r14 = r47
            r0 = r48
            java.lang.String r1 = "$this$measure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "measurables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            androidx.compose.foundation.layout.i0 r1 = r15.f19871c
            float r1 = r1.mo8093d()
            int r13 = r14.mo7429n2(r1)
            androidx.compose.foundation.layout.i0 r1 = r15.f19871c
            float r1 = r1.mo8090a()
            int r1 = r14.mo7429n2(r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 10
            r9 = 0
            r2 = r49
            long r2 = androidx.compose.p004ui.unit.C16476b.m74351e(r2, r4, r5, r6, r7, r8, r9)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0037:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r4.next()
            r7 = r5
            androidx.compose.ui.layout.e0 r7 = (androidx.compose.p004ui.layout.C15557e0) r7
            java.lang.Object r7 = androidx.compose.p004ui.layout.C15594q.m69317a(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0037
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            androidx.compose.ui.layout.e0 r5 = (androidx.compose.p004ui.layout.C15557e0) r5
            if (r5 == 0) goto L_0x005c
            androidx.compose.ui.layout.w0 r4 = r5.mo44324t0(r2)
            r7 = r4
            goto L_0x005d
        L_0x005c:
            r7 = 0
        L_0x005d:
            int r4 = androidx.compose.material3.TextFieldImplKt.m26646n(r7)
            r5 = 0
            int r4 = r4 + r5
            int r8 = androidx.compose.material3.TextFieldImplKt.m26645m(r7)
            int r8 = java.lang.Math.max(r5, r8)
            java.util.Iterator r9 = r0.iterator()
        L_0x006f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0089
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.compose.ui.layout.e0 r11 = (androidx.compose.p004ui.layout.C15557e0) r11
            java.lang.Object r11 = androidx.compose.p004ui.layout.C15594q.m69317a(r11)
            java.lang.String r12 = "Trailing"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x006f
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            androidx.compose.ui.layout.e0 r10 = (androidx.compose.p004ui.layout.C15557e0) r10
            if (r10 == 0) goto L_0x00a2
            int r9 = -r4
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r9
            long r11 = androidx.compose.p004ui.unit.C16478c.m74385j(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.w0 r9 = r10.mo44324t0(r11)
            goto L_0x00a3
        L_0x00a2:
            r9 = 0
        L_0x00a3:
            int r10 = androidx.compose.material3.TextFieldImplKt.m26646n(r9)
            int r4 = r4 + r10
            int r10 = androidx.compose.material3.TextFieldImplKt.m26645m(r9)
            int r8 = java.lang.Math.max(r8, r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x00b4:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00d0
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.e0 r12 = (androidx.compose.p004ui.layout.C15557e0) r12
            java.lang.Object r12 = androidx.compose.p004ui.layout.C15594q.m69317a(r12)
            java.lang.String r5 = "Prefix"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00ce
            goto L_0x00d1
        L_0x00ce:
            r5 = 0
            goto L_0x00b4
        L_0x00d0:
            r11 = 0
        L_0x00d1:
            androidx.compose.ui.layout.e0 r11 = (androidx.compose.p004ui.layout.C15557e0) r11
            if (r11 == 0) goto L_0x00eb
            int r5 = -r4
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r5
            r10 = r7
            long r6 = androidx.compose.p004ui.unit.C16478c.m74385j(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.w0 r6 = r11.mo44324t0(r6)
            r11 = r6
            goto L_0x00ed
        L_0x00eb:
            r10 = r7
            r11 = 0
        L_0x00ed:
            int r6 = androidx.compose.material3.TextFieldImplKt.m26646n(r11)
            int r4 = r4 + r6
            int r6 = androidx.compose.material3.TextFieldImplKt.m26645m(r11)
            int r6 = java.lang.Math.max(r8, r6)
            java.util.Iterator r7 = r0.iterator()
        L_0x00fe:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0118
            java.lang.Object r8 = r7.next()
            r12 = r8
            androidx.compose.ui.layout.e0 r12 = (androidx.compose.p004ui.layout.C15557e0) r12
            java.lang.Object r12 = androidx.compose.p004ui.layout.C15594q.m69317a(r12)
            java.lang.String r5 = "Suffix"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00fe
            goto L_0x0119
        L_0x0118:
            r8 = 0
        L_0x0119:
            androidx.compose.ui.layout.e0 r8 = (androidx.compose.p004ui.layout.C15557e0) r8
            if (r8 == 0) goto L_0x0132
            int r5 = -r4
            r19 = 0
            r20 = 2
            r21 = 0
            r16 = r2
            r18 = r5
            long r14 = androidx.compose.p004ui.unit.C16478c.m74385j(r16, r18, r19, r20, r21)
            androidx.compose.ui.layout.w0 r5 = r8.mo44324t0(r14)
            r12 = r5
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            int r5 = androidx.compose.material3.TextFieldImplKt.m26646n(r12)
            int r4 = r4 + r5
            int r5 = androidx.compose.material3.TextFieldImplKt.m26645m(r12)
            int r5 = java.lang.Math.max(r6, r5)
            int r6 = -r1
            int r4 = -r4
            long r6 = androidx.compose.p004ui.unit.C16478c.m74384i(r2, r4, r6)
            java.util.Iterator r8 = r0.iterator()
        L_0x014a:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0169
            java.lang.Object r14 = r8.next()
            r15 = r14
            androidx.compose.ui.layout.e0 r15 = (androidx.compose.p004ui.layout.C15557e0) r15
            java.lang.Object r15 = androidx.compose.p004ui.layout.C15594q.m69317a(r15)
            r16 = r8
            java.lang.String r8 = "Label"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0166
            goto L_0x016a
        L_0x0166:
            r8 = r16
            goto L_0x014a
        L_0x0169:
            r14 = 0
        L_0x016a:
            androidx.compose.ui.layout.e0 r14 = (androidx.compose.p004ui.layout.C15557e0) r14
            if (r14 == 0) goto L_0x0173
            androidx.compose.ui.layout.w0 r6 = r14.mo44324t0(r6)
            goto L_0x0174
        L_0x0173:
            r6 = 0
        L_0x0174:
            int r7 = androidx.compose.material3.TextFieldImplKt.m26645m(r6)
            int r7 = r7 + r13
            int r8 = -r7
            int r8 = r8 - r1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 11
            r21 = 0
            r14 = r49
            long r14 = androidx.compose.p004ui.unit.C16476b.m74351e(r14, r16, r17, r18, r19, r20, r21)
            long r14 = androidx.compose.p004ui.unit.C16478c.m74384i(r14, r4, r8)
            java.util.Iterator r4 = r0.iterator()
        L_0x0195:
            boolean r8 = r4.hasNext()
            r31 = r13
            java.lang.String r13 = "Collection contains no element matching the predicate."
            if (r8 == 0) goto L_0x032e
            java.lang.Object r8 = r4.next()
            androidx.compose.ui.layout.e0 r8 = (androidx.compose.p004ui.layout.C15557e0) r8
            r16 = r4
            java.lang.Object r4 = androidx.compose.p004ui.layout.C15594q.m69317a(r8)
            r32 = r13
            java.lang.String r13 = "TextField"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r13)
            if (r4 == 0) goto L_0x0328
            androidx.compose.ui.layout.w0 r4 = r8.mo44324t0(r14)
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 14
            r30 = 0
            r23 = r14
            long r13 = androidx.compose.p004ui.unit.C16476b.m74351e(r23, r25, r26, r27, r28, r29, r30)
            java.util.Iterator r8 = r0.iterator()
        L_0x01cf:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x01f3
            java.lang.Object r15 = r8.next()
            r16 = r15
            androidx.compose.ui.layout.e0 r16 = (androidx.compose.p004ui.layout.C15557e0) r16
            r17 = r8
            java.lang.Object r8 = androidx.compose.p004ui.layout.C15594q.m69317a(r16)
            r16 = r15
            java.lang.String r15 = "Hint"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r15)
            if (r8 == 0) goto L_0x01f0
            r15 = r16
            goto L_0x01f4
        L_0x01f0:
            r8 = r17
            goto L_0x01cf
        L_0x01f3:
            r15 = 0
        L_0x01f4:
            androidx.compose.ui.layout.e0 r15 = (androidx.compose.p004ui.layout.C15557e0) r15
            if (r15 == 0) goto L_0x01fd
            androidx.compose.ui.layout.w0 r8 = r15.mo44324t0(r13)
            goto L_0x01fe
        L_0x01fd:
            r8 = 0
        L_0x01fe:
            int r13 = androidx.compose.material3.TextFieldImplKt.m26645m(r4)
            int r14 = androidx.compose.material3.TextFieldImplKt.m26645m(r8)
            int r13 = java.lang.Math.max(r13, r14)
            int r13 = r13 + r7
            int r13 = r13 + r1
            int r1 = java.lang.Math.max(r5, r13)
            r18 = 0
            int r1 = -r1
            r20 = 1
            r21 = 0
            r16 = r2
            r19 = r1
            long r23 = androidx.compose.p004ui.unit.C16478c.m74385j(r16, r18, r19, r20, r21)
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 11
            r30 = 0
            long r1 = androidx.compose.p004ui.unit.C16476b.m74351e(r23, r25, r26, r27, r28, r29, r30)
            java.util.Iterator r3 = r0.iterator()
        L_0x0233:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x024d
            java.lang.Object r5 = r3.next()
            r7 = r5
            androidx.compose.ui.layout.e0 r7 = (androidx.compose.p004ui.layout.C15557e0) r7
            java.lang.Object r7 = androidx.compose.p004ui.layout.C15594q.m69317a(r7)
            java.lang.String r13 = "Supporting"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r13)
            if (r7 == 0) goto L_0x0233
            goto L_0x024e
        L_0x024d:
            r5 = 0
        L_0x024e:
            androidx.compose.ui.layout.e0 r5 = (androidx.compose.p004ui.layout.C15557e0) r5
            if (r5 == 0) goto L_0x0259
            androidx.compose.ui.layout.w0 r1 = r5.mo44324t0(r1)
            r22 = r1
            goto L_0x025b
        L_0x0259:
            r22 = 0
        L_0x025b:
            int r1 = androidx.compose.material3.TextFieldImplKt.m26645m(r22)
            int r13 = androidx.compose.material3.TextFieldImplKt.m26646n(r10)
            int r14 = androidx.compose.material3.TextFieldImplKt.m26646n(r9)
            int r15 = androidx.compose.material3.TextFieldImplKt.m26646n(r11)
            int r16 = androidx.compose.material3.TextFieldImplKt.m26646n(r12)
            int r17 = r4.mo44471K0()
            int r18 = androidx.compose.material3.TextFieldImplKt.m26646n(r6)
            int r19 = androidx.compose.material3.TextFieldImplKt.m26646n(r8)
            r20 = r49
            int r15 = androidx.compose.material3.TextFieldKt.m26662k(r13, r14, r15, r16, r17, r18, r19, r20)
            int r33 = r4.mo44468G0()
            int r34 = androidx.compose.material3.TextFieldImplKt.m26645m(r6)
            int r35 = androidx.compose.material3.TextFieldImplKt.m26645m(r10)
            int r36 = androidx.compose.material3.TextFieldImplKt.m26645m(r9)
            int r37 = androidx.compose.material3.TextFieldImplKt.m26645m(r11)
            int r38 = androidx.compose.material3.TextFieldImplKt.m26645m(r12)
            int r39 = androidx.compose.material3.TextFieldImplKt.m26645m(r8)
            int r40 = androidx.compose.material3.TextFieldImplKt.m26645m(r22)
            r14 = r46
            float r2 = r14.f19870b
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x02af
            r2 = 1
            r41 = r2
            goto L_0x02b1
        L_0x02af:
            r41 = 0
        L_0x02b1:
            float r44 = r47.getDensity()
            androidx.compose.foundation.layout.i0 r2 = r14.f19871c
            r42 = r49
            r45 = r2
            int r16 = androidx.compose.material3.TextFieldKt.m26661j(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45)
            int r1 = r16 - r1
            java.util.Iterator r0 = r0.iterator()
        L_0x02c5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0320
            java.lang.Object r2 = r0.next()
            androidx.compose.ui.layout.e0 r2 = (androidx.compose.p004ui.layout.C15557e0) r2
            java.lang.Object r3 = androidx.compose.p004ui.layout.C15594q.m69317a(r2)
            java.lang.String r5 = "Container"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x031d
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == r0) goto L_0x02e4
            r3 = r15
            goto L_0x02e5
        L_0x02e4:
            r3 = 0
        L_0x02e5:
            if (r1 == r0) goto L_0x02e9
            r5 = r1
            goto L_0x02ea
        L_0x02e9:
            r5 = 0
        L_0x02ea:
            long r0 = androidx.compose.p004ui.unit.C16478c.m74376a(r3, r15, r5, r1)
            androidx.compose.ui.layout.w0 r13 = r2.mo44324t0(r0)
            r17 = 0
            androidx.compose.material3.TextFieldMeasurePolicy$measure$1 r18 = new androidx.compose.material3.TextFieldMeasurePolicy$measure$1
            r0 = r18
            r1 = r6
            r2 = r15
            r3 = r16
            r5 = r8
            r6 = r10
            r7 = r9
            r8 = r11
            r9 = r12
            r10 = r13
            r11 = r22
            r12 = r46
            r13 = r31
            r14 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = 4
            r6 = 0
            r0 = r47
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            androidx.compose.ui.layout.g0 r0 = androidx.compose.p004ui.layout.C15568h0.m69206r2(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x031d:
            r14 = r46
            goto L_0x02c5
        L_0x0320:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r4 = r32
            r0.<init>(r4)
            throw r0
        L_0x0328:
            r4 = r16
            r13 = r31
            goto L_0x0195
        L_0x032e:
            r4 = r13
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldMeasurePolicy.mo6397a(androidx.compose.ui.layout.h0, java.util.List, long):androidx.compose.ui.layout.g0");
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo12243n(list, i, TextFieldMeasurePolicy$maxIntrinsicWidth$1.f19873f);
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo12242m(mVar, list, i, TextFieldMeasurePolicy$minIntrinsicHeight$1.f19874f);
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo12243n(list, i, TextFieldMeasurePolicy$minIntrinsicWidth$1.f19875f);
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo12242m(mVar, list, i, TextFieldMeasurePolicy$maxIntrinsicHeight$1.f19872f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: androidx.compose.ui.layout.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12242m(androidx.compose.p004ui.layout.C15583m r18, java.util.List<? extends androidx.compose.p004ui.layout.C15580l> r19, int r20, kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.layout.C15580l, ? super java.lang.Integer, java.lang.Integer> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r21
            r2 = r19
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
        L_0x000c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01bb
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.compose.ui.layout.l r5 = (androidx.compose.p004ui.layout.C15580l) r5
            java.lang.Object r5 = androidx.compose.material3.TextFieldImplKt.m26637e(r5)
            java.lang.String r6 = "TextField"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x000c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r3 = r1.invoke(r4, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r4 = r3.intValue()
            java.util.Iterator r3 = r2.iterator()
        L_0x0037:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r3.next()
            r7 = r5
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            java.lang.Object r7 = androidx.compose.material3.TextFieldImplKt.m26637e(r7)
            java.lang.String r8 = "Label"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0037
            goto L_0x0053
        L_0x0052:
            r5 = r6
        L_0x0053:
            androidx.compose.ui.layout.l r5 = (androidx.compose.p004ui.layout.C15580l) r5
            r3 = 0
            if (r5 == 0) goto L_0x0067
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            java.lang.Object r5 = r1.invoke(r5, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            goto L_0x0068
        L_0x0067:
            r5 = r3
        L_0x0068:
            java.util.Iterator r7 = r2.iterator()
        L_0x006c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0086
            java.lang.Object r8 = r7.next()
            r9 = r8
            androidx.compose.ui.layout.l r9 = (androidx.compose.p004ui.layout.C15580l) r9
            java.lang.Object r9 = androidx.compose.material3.TextFieldImplKt.m26637e(r9)
            java.lang.String r10 = "Trailing"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x006c
            goto L_0x0087
        L_0x0086:
            r8 = r6
        L_0x0087:
            androidx.compose.ui.layout.l r8 = (androidx.compose.p004ui.layout.C15580l) r8
            if (r8 == 0) goto L_0x009a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            java.lang.Object r7 = r1.invoke(r8, r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L_0x009b
        L_0x009a:
            r7 = r3
        L_0x009b:
            java.util.Iterator r8 = r2.iterator()
        L_0x009f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00b9
            java.lang.Object r9 = r8.next()
            r10 = r9
            androidx.compose.ui.layout.l r10 = (androidx.compose.p004ui.layout.C15580l) r10
            java.lang.Object r10 = androidx.compose.material3.TextFieldImplKt.m26637e(r10)
            java.lang.String r11 = "Leading"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x009f
            goto L_0x00ba
        L_0x00b9:
            r9 = r6
        L_0x00ba:
            androidx.compose.ui.layout.l r9 = (androidx.compose.p004ui.layout.C15580l) r9
            if (r9 == 0) goto L_0x00cd
            java.lang.Integer r8 = java.lang.Integer.valueOf(r20)
            java.lang.Object r8 = r1.invoke(r9, r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L_0x00ce
        L_0x00cd:
            r8 = r3
        L_0x00ce:
            java.util.Iterator r9 = r2.iterator()
        L_0x00d2:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ec
            java.lang.Object r10 = r9.next()
            r11 = r10
            androidx.compose.ui.layout.l r11 = (androidx.compose.p004ui.layout.C15580l) r11
            java.lang.Object r11 = androidx.compose.material3.TextFieldImplKt.m26637e(r11)
            java.lang.String r12 = "Prefix"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x00d2
            goto L_0x00ed
        L_0x00ec:
            r10 = r6
        L_0x00ed:
            androidx.compose.ui.layout.l r10 = (androidx.compose.p004ui.layout.C15580l) r10
            if (r10 == 0) goto L_0x0100
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)
            java.lang.Object r9 = r1.invoke(r10, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            goto L_0x0101
        L_0x0100:
            r9 = r3
        L_0x0101:
            java.util.Iterator r10 = r2.iterator()
        L_0x0105:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x011f
            java.lang.Object r11 = r10.next()
            r12 = r11
            androidx.compose.ui.layout.l r12 = (androidx.compose.p004ui.layout.C15580l) r12
            java.lang.Object r12 = androidx.compose.material3.TextFieldImplKt.m26637e(r12)
            java.lang.String r13 = "Suffix"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0105
            goto L_0x0120
        L_0x011f:
            r11 = r6
        L_0x0120:
            androidx.compose.ui.layout.l r11 = (androidx.compose.p004ui.layout.C15580l) r11
            if (r11 == 0) goto L_0x0133
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)
            java.lang.Object r10 = r1.invoke(r11, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L_0x0134
        L_0x0133:
            r10 = r3
        L_0x0134:
            java.util.Iterator r11 = r2.iterator()
        L_0x0138:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0152
            java.lang.Object r12 = r11.next()
            r13 = r12
            androidx.compose.ui.layout.l r13 = (androidx.compose.p004ui.layout.C15580l) r13
            java.lang.Object r13 = androidx.compose.material3.TextFieldImplKt.m26637e(r13)
            java.lang.String r14 = "Hint"
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x0138
            goto L_0x0153
        L_0x0152:
            r12 = r6
        L_0x0153:
            androidx.compose.ui.layout.l r12 = (androidx.compose.p004ui.layout.C15580l) r12
            if (r12 == 0) goto L_0x0166
            java.lang.Integer r11 = java.lang.Integer.valueOf(r20)
            java.lang.Object r11 = r1.invoke(r12, r11)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            goto L_0x0167
        L_0x0166:
            r11 = r3
        L_0x0167:
            java.util.Iterator r2 = r2.iterator()
        L_0x016b:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0185
            java.lang.Object r12 = r2.next()
            r13 = r12
            androidx.compose.ui.layout.l r13 = (androidx.compose.p004ui.layout.C15580l) r13
            java.lang.Object r13 = androidx.compose.material3.TextFieldImplKt.m26637e(r13)
            java.lang.String r14 = "Supporting"
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x016b
            r6 = r12
        L_0x0185:
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            if (r6 == 0) goto L_0x0198
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r1.invoke(r6, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x0199
        L_0x0198:
            r1 = r3
        L_0x0199:
            float r2 = r0.f19870b
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x01a4
            r2 = 1
            r12 = r2
            goto L_0x01a5
        L_0x01a4:
            r12 = r3
        L_0x01a5:
            long r13 = androidx.compose.material3.TextFieldImplKt.m26644l()
            float r15 = r18.getDensity()
            androidx.compose.foundation.layout.i0 r2 = r0.f19871c
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r1
            r16 = r2
            int r1 = androidx.compose.material3.TextFieldKt.m26661j(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16)
            return r1
        L_0x01bb:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldMeasurePolicy.mo12242m(androidx.compose.ui.layout.m, java.util.List, int, kotlin.jvm.functions.p):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12243n(java.util.List<? extends androidx.compose.p004ui.layout.C15580l> r12, int r13, kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.layout.C15580l, ? super java.lang.Integer, java.lang.Integer> r14) {
        /*
            r11 = this;
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r0 = r12.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0171
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.l r2 = (androidx.compose.p004ui.layout.C15580l) r2
            java.lang.Object r2 = androidx.compose.material3.TextFieldImplKt.m26637e(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0006
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r14.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.util.Iterator r0 = r12.iterator()
        L_0x0031:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r0.next()
            r3 = r1
            androidx.compose.ui.layout.l r3 = (androidx.compose.p004ui.layout.C15580l) r3
            java.lang.Object r3 = androidx.compose.material3.TextFieldImplKt.m26637e(r3)
            java.lang.String r4 = "Label"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0031
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            androidx.compose.ui.layout.l r1 = (androidx.compose.p004ui.layout.C15580l) r1
            r0 = 0
            if (r1 == 0) goto L_0x0062
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r1, r3)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r6 = r1
            goto L_0x0063
        L_0x0062:
            r6 = r0
        L_0x0063:
            java.util.Iterator r1 = r12.iterator()
        L_0x0067:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r1.next()
            r4 = r3
            androidx.compose.ui.layout.l r4 = (androidx.compose.p004ui.layout.C15580l) r4
            java.lang.Object r4 = androidx.compose.material3.TextFieldImplKt.m26637e(r4)
            java.lang.String r7 = "Trailing"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r7)
            if (r4 == 0) goto L_0x0067
            goto L_0x0082
        L_0x0081:
            r3 = r2
        L_0x0082:
            androidx.compose.ui.layout.l r3 = (androidx.compose.p004ui.layout.C15580l) r3
            if (r3 == 0) goto L_0x0096
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r3, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r3 = r1
            goto L_0x0097
        L_0x0096:
            r3 = r0
        L_0x0097:
            java.util.Iterator r1 = r12.iterator()
        L_0x009b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r1.next()
            r7 = r4
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            java.lang.Object r7 = androidx.compose.material3.TextFieldImplKt.m26637e(r7)
            java.lang.String r8 = "Prefix"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x009b
            goto L_0x00b6
        L_0x00b5:
            r4 = r2
        L_0x00b6:
            androidx.compose.ui.layout.l r4 = (androidx.compose.p004ui.layout.C15580l) r4
            if (r4 == 0) goto L_0x00ca
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r4, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x00cb
        L_0x00ca:
            r4 = r0
        L_0x00cb:
            java.util.Iterator r1 = r12.iterator()
        L_0x00cf:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00e9
            java.lang.Object r7 = r1.next()
            r8 = r7
            androidx.compose.ui.layout.l r8 = (androidx.compose.p004ui.layout.C15580l) r8
            java.lang.Object r8 = androidx.compose.material3.TextFieldImplKt.m26637e(r8)
            java.lang.String r9 = "Suffix"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x00cf
            goto L_0x00ea
        L_0x00e9:
            r7 = r2
        L_0x00ea:
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            if (r7 == 0) goto L_0x00fe
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r7, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r7 = r1
            goto L_0x00ff
        L_0x00fe:
            r7 = r0
        L_0x00ff:
            java.util.Iterator r1 = r12.iterator()
        L_0x0103:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x011d
            java.lang.Object r8 = r1.next()
            r9 = r8
            androidx.compose.ui.layout.l r9 = (androidx.compose.p004ui.layout.C15580l) r9
            java.lang.Object r9 = androidx.compose.material3.TextFieldImplKt.m26637e(r9)
            java.lang.String r10 = "Leading"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0103
            goto L_0x011e
        L_0x011d:
            r8 = r2
        L_0x011e:
            androidx.compose.ui.layout.l r8 = (androidx.compose.p004ui.layout.C15580l) r8
            if (r8 == 0) goto L_0x0131
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r8, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x0132
        L_0x0131:
            r1 = r0
        L_0x0132:
            java.util.Iterator r12 = r12.iterator()
        L_0x0136:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x0150
            java.lang.Object r8 = r12.next()
            r9 = r8
            androidx.compose.ui.layout.l r9 = (androidx.compose.p004ui.layout.C15580l) r9
            java.lang.Object r9 = androidx.compose.material3.TextFieldImplKt.m26637e(r9)
            java.lang.String r10 = "Hint"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0136
            r2 = r8
        L_0x0150:
            androidx.compose.ui.layout.l r2 = (androidx.compose.p004ui.layout.C15580l) r2
            if (r2 == 0) goto L_0x0163
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r14.invoke(r2, r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            goto L_0x0164
        L_0x0163:
            r12 = r0
        L_0x0164:
            long r8 = androidx.compose.material3.TextFieldImplKt.m26644l()
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r12
            int r12 = androidx.compose.material3.TextFieldKt.m26662k(r1, r2, r3, r4, r5, r6, r7, r8)
            return r12
        L_0x0171:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "Collection contains no element matching the predicate."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldMeasurePolicy.mo12243n(java.util.List, int, kotlin.jvm.functions.p):int");
    }
}
