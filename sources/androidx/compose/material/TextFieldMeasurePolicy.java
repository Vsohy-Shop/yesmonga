package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,929:1\n1#2:930\n223#3,2:931\n223#3,2:933\n223#3,2:935\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n*L\n599#1:931,2\n704#1:933,2\n733#1:935,2\n*E\n"})
public final class TextFieldMeasurePolicy implements C15560f0 {

    /* renamed from: a */
    public final boolean f7985a;

    /* renamed from: b */
    public final float f7986b;
    @C12579k

    /* renamed from: c */
    public final C2366i0 f7987c;

    public TextFieldMeasurePolicy(boolean z, float f, @C12579k C2366i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        this.f7985a = z;
        this.f7986b = f;
        this.f7987c = i0Var;
    }

    @C12579k
    /* renamed from: a */
    public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Object obj;
        C15611w0 w0Var;
        Object obj2;
        C15611w0 w0Var2;
        Object obj3;
        C15611w0 w0Var3;
        int i;
        int i2;
        Object obj4;
        C15611w0 w0Var4;
        boolean z;
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var2, "$this$measure");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        int n2 = h0Var2.mo7429n2(this.f7987c.mo8093d());
        int n22 = h0Var2.mo7429n2(this.f7987c.mo8090a());
        int n23 = h0Var2.mo7429n2(TextFieldKt.m14163o());
        long e = C16476b.m74351e(j, 0, 0, 0, 0, 10, (Object) null);
        Iterable<C15557e0> iterable = list2;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(C15594q.m69317a((C15557e0) obj), (Object) "Leading")) {
                break;
            }
        }
        C15557e0 e0Var = (C15557e0) obj;
        if (e0Var != null) {
            w0Var = e0Var.mo44324t0(e);
        } else {
            w0Var = null;
        }
        int i3 = TextFieldImplKt.m14143i(w0Var) + 0;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(C15594q.m69317a((C15557e0) obj2), (Object) "Trailing")) {
                break;
            }
        }
        C15557e0 e0Var2 = (C15557e0) obj2;
        if (e0Var2 != null) {
            w0Var2 = e0Var2.mo44324t0(C16478c.m74385j(e, -i3, 0, 2, (Object) null));
        } else {
            w0Var2 = null;
        }
        int i4 = -n22;
        int i5 = -(i3 + TextFieldImplKt.m14143i(w0Var2));
        long i6 = C16478c.m74384i(e, i5, i4);
        Iterator it3 = iterable.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (Intrinsics.areEqual(C15594q.m69317a((C15557e0) obj3), (Object) "Label")) {
                break;
            }
        }
        C15557e0 e0Var3 = (C15557e0) obj3;
        if (e0Var3 != null) {
            w0Var3 = e0Var3.mo44324t0(i6);
        } else {
            w0Var3 = null;
        }
        if (w0Var3 != null) {
            i = w0Var3.mo44325A(AlignmentLineKt.m68886b());
            if (i == Integer.MIN_VALUE) {
                i = w0Var3.mo44468G0();
            }
        } else {
            i = 0;
        }
        int max = Math.max(i, n2);
        if (w0Var3 != null) {
            i2 = (i4 - n23) - max;
        } else {
            i2 = (-n2) - n22;
        }
        int i7 = n23;
        long i8 = C16478c.m74384i(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null), i5, i2);
        for (C15557e0 e0Var4 : iterable) {
            if (Intrinsics.areEqual(C15594q.m69317a(e0Var4), (Object) "TextField")) {
                C15611w0 t0 = e0Var4.mo44324t0(i8);
                long e2 = C16476b.m74351e(i8, 0, 0, 0, 0, 14, (Object) null);
                Iterator it4 = iterable.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (Intrinsics.areEqual(C15594q.m69317a((C15557e0) obj4), (Object) "Hint")) {
                        break;
                    }
                }
                C15557e0 e0Var5 = (C15557e0) obj4;
                if (e0Var5 != null) {
                    w0Var4 = e0Var5.mo44324t0(e2);
                } else {
                    w0Var4 = null;
                }
                int g = TextFieldKt.m14159k(TextFieldImplKt.m14143i(w0Var), TextFieldImplKt.m14143i(w0Var2), t0.mo44471K0(), TextFieldImplKt.m14143i(w0Var3), TextFieldImplKt.m14143i(w0Var4), j);
                int G0 = t0.mo44468G0();
                if (w0Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                int f = TextFieldKt.m14158j(G0, z, max, TextFieldImplKt.m14142h(w0Var), TextFieldImplKt.m14142h(w0Var2), TextFieldImplKt.m14142h(w0Var4), j, h0Var.getDensity(), this.f7987c);
                return C15568h0.m69206r2(h0Var, g, f, (Map) null, new TextFieldMeasurePolicy$measure$1(w0Var3, n2, i, g, f, t0, w0Var4, w0Var, w0Var2, this, max, i7, h0Var), 4, (Object) null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo10671n(list, i, TextFieldMeasurePolicy$maxIntrinsicWidth$1.f7989f);
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo10670m(mVar, list, i, TextFieldMeasurePolicy$minIntrinsicHeight$1.f7990f);
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo10671n(list, i, TextFieldMeasurePolicy$minIntrinsicWidth$1.f7991f);
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo10670m(mVar, list, i, TextFieldMeasurePolicy$maxIntrinsicHeight$1.f7988f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: androidx.compose.ui.layout.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10670m(androidx.compose.p004ui.layout.C15583m r12, java.util.List<? extends androidx.compose.p004ui.layout.C15580l> r13, int r14, kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.layout.C15580l, ? super java.lang.Integer, java.lang.Integer> r15) {
        /*
            r11 = this;
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r0 = r13.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0115
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.l r2 = (androidx.compose.p004ui.layout.C15580l) r2
            java.lang.Object r2 = androidx.compose.material.TextFieldImplKt.m14139e(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0006
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r15.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.util.Iterator r0 = r13.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r0.next()
            r4 = r2
            androidx.compose.ui.layout.l r4 = (androidx.compose.p004ui.layout.C15580l) r4
            java.lang.Object r4 = androidx.compose.material.TextFieldImplKt.m14139e(r4)
            java.lang.String r5 = "Label"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0031
            goto L_0x004d
        L_0x004c:
            r2 = r3
        L_0x004d:
            androidx.compose.ui.layout.l r2 = (androidx.compose.p004ui.layout.C15580l) r2
            r0 = 0
            if (r2 == 0) goto L_0x0062
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r2, r4)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4 = r2
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.util.Iterator r2 = r13.iterator()
        L_0x0067:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r2.next()
            r6 = r5
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            java.lang.Object r6 = androidx.compose.material.TextFieldImplKt.m14139e(r6)
            java.lang.String r7 = "Trailing"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0067
            goto L_0x0082
        L_0x0081:
            r5 = r3
        L_0x0082:
            androidx.compose.ui.layout.l r5 = (androidx.compose.p004ui.layout.C15580l) r5
            if (r5 == 0) goto L_0x0096
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r5, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r5 = r2
            goto L_0x0097
        L_0x0096:
            r5 = r0
        L_0x0097:
            java.util.Iterator r2 = r13.iterator()
        L_0x009b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r2.next()
            r7 = r6
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.m14139e(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x009b
            goto L_0x00b6
        L_0x00b5:
            r6 = r3
        L_0x00b6:
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            if (r6 == 0) goto L_0x00ca
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r6, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r6 = r2
            goto L_0x00cb
        L_0x00ca:
            r6 = r0
        L_0x00cb:
            java.util.Iterator r13 = r13.iterator()
        L_0x00cf:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00e9
            java.lang.Object r2 = r13.next()
            r7 = r2
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.m14139e(r7)
            java.lang.String r8 = "Hint"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x00cf
            r3 = r2
        L_0x00e9:
            androidx.compose.ui.layout.l r3 = (androidx.compose.p004ui.layout.C15580l) r3
            if (r3 == 0) goto L_0x00fc
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object r13 = r15.invoke(r3, r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            goto L_0x00fd
        L_0x00fc:
            r13 = r0
        L_0x00fd:
            if (r4 <= 0) goto L_0x0102
            r14 = 1
            r2 = r14
            goto L_0x0103
        L_0x0102:
            r2 = r0
        L_0x0103:
            long r7 = androidx.compose.material.TextFieldImplKt.m14141g()
            float r9 = r12.getDensity()
            androidx.compose.foundation.layout.i0 r10 = r11.f7987c
            r3 = r4
            r4 = r6
            r6 = r13
            int r12 = androidx.compose.material.TextFieldKt.m14158j(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return r12
        L_0x0115:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "Collection contains no element matching the predicate."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldMeasurePolicy.mo10670m(androidx.compose.ui.layout.m, java.util.List, int, kotlin.jvm.functions.p):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10671n(java.util.List<? extends androidx.compose.p004ui.layout.C15580l> r10, int r11, kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.layout.C15580l, ? super java.lang.Integer, java.lang.Integer> r12) {
        /*
            r9 = this;
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r0 = r10.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0107
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.l r2 = (androidx.compose.p004ui.layout.C15580l) r2
            java.lang.Object r2 = androidx.compose.material.TextFieldImplKt.m14139e(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0006
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r12.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.util.Iterator r0 = r10.iterator()
        L_0x0031:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.compose.ui.layout.l r4 = (androidx.compose.p004ui.layout.C15580l) r4
            java.lang.Object r4 = androidx.compose.material.TextFieldImplKt.m14139e(r4)
            java.lang.String r5 = "Label"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0031
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            androidx.compose.ui.layout.l r1 = (androidx.compose.p004ui.layout.C15580l) r1
            r0 = 0
            if (r1 == 0) goto L_0x0062
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r12.invoke(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.util.Iterator r1 = r10.iterator()
        L_0x0067:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r1.next()
            r6 = r5
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            java.lang.Object r6 = androidx.compose.material.TextFieldImplKt.m14139e(r6)
            java.lang.String r7 = "Trailing"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0067
            goto L_0x0082
        L_0x0081:
            r5 = r2
        L_0x0082:
            androidx.compose.ui.layout.l r5 = (androidx.compose.p004ui.layout.C15580l) r5
            if (r5 == 0) goto L_0x0096
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r12.invoke(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r5 = r1
            goto L_0x0097
        L_0x0096:
            r5 = r0
        L_0x0097:
            java.util.Iterator r1 = r10.iterator()
        L_0x009b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r1.next()
            r7 = r6
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.m14139e(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x009b
            goto L_0x00b6
        L_0x00b5:
            r6 = r2
        L_0x00b6:
            androidx.compose.ui.layout.l r6 = (androidx.compose.p004ui.layout.C15580l) r6
            if (r6 == 0) goto L_0x00c9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r12.invoke(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x00ca
        L_0x00c9:
            r1 = r0
        L_0x00ca:
            java.util.Iterator r10 = r10.iterator()
        L_0x00ce:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r10.next()
            r7 = r6
            androidx.compose.ui.layout.l r7 = (androidx.compose.p004ui.layout.C15580l) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.m14139e(r7)
            java.lang.String r8 = "Hint"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x00ce
            r2 = r6
        L_0x00e8:
            androidx.compose.ui.layout.l r2 = (androidx.compose.p004ui.layout.C15580l) r2
            if (r2 == 0) goto L_0x00fb
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r12.invoke(r2, r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L_0x00fc
        L_0x00fb:
            r10 = r0
        L_0x00fc:
            long r6 = androidx.compose.material.TextFieldImplKt.m14141g()
            r2 = r5
            r5 = r10
            int r10 = androidx.compose.material.TextFieldKt.m14159k(r1, r2, r3, r4, r5, r6)
            return r10
        L_0x0107:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r11 = "Collection contains no element matching the predicate."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldMeasurePolicy.mo10671n(java.util.List, int, kotlin.jvm.functions.p):int");
    }
}
