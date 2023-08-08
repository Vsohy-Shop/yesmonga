package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
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
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,981:1\n1#2:982\n223#3,2:983\n223#3,2:985\n223#3,2:987\n223#3,2:989\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n622#1:983,2\n653#1:985,2\n722#1:987,2\n754#1:989,2\n*E\n"})
public final class OutlinedTextFieldMeasurePolicy implements C15560f0 {
    @C12579k

    /* renamed from: a */
    public final C11300l<C15104m, C11079d2> f7751a;

    /* renamed from: b */
    public final boolean f7752b;

    /* renamed from: c */
    public final float f7753c;
    @C12579k

    /* renamed from: d */
    public final C2366i0 f7754d;

    public OutlinedTextFieldMeasurePolicy(@C12579k C11300l<? super C15104m, C11079d2> lVar, boolean z, float f, @C12579k C2366i0 i0Var) {
        Intrinsics.checkNotNullParameter(lVar, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        this.f7751a = lVar;
        this.f7752b = z;
        this.f7753c = f;
        this.f7754d = i0Var;
    }

    @C12579k
    /* renamed from: a */
    public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Object obj;
        C15611w0 w0Var;
        Object obj2;
        C15611w0 w0Var2;
        boolean z;
        int i;
        Object obj3;
        C15611w0 w0Var3;
        Object obj4;
        C15611w0 w0Var4;
        int i2;
        int i3;
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var2, "$this$measure");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        int n2 = h0Var2.mo7429n2(this.f7754d.mo8090a());
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
        int i4 = TextFieldImplKt.m14143i(w0Var) + 0;
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
            w0Var2 = e0Var2.mo44324t0(C16478c.m74385j(e, -i4, 0, 2, (Object) null));
        } else {
            w0Var2 = null;
        }
        int i5 = i4 + TextFieldImplKt.m14143i(w0Var2);
        if (this.f7753c < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        int n22 = h0Var2.mo7429n2(this.f7754d.mo8091b(h0Var.getLayoutDirection())) + h0Var2.mo7429n2(this.f7754d.mo8092c(h0Var.getLayoutDirection()));
        if (z) {
            i = (-i5) - n22;
        } else {
            i = -n22;
        }
        int i6 = -n2;
        long i7 = C16478c.m74384i(e, i, i6);
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
            w0Var3 = e0Var3.mo44324t0(i7);
        } else {
            w0Var3 = null;
        }
        if (w0Var3 != null) {
            this.f7751a.invoke(C15104m.m65006c(C15106n.m65033a((float) w0Var3.mo44471K0(), (float) w0Var3.mo44468G0())));
        }
        long e2 = C16476b.m74351e(C16478c.m74384i(j, -i5, i6 - Math.max(TextFieldImplKt.m14142h(w0Var3) / 2, h0Var2.mo7429n2(this.f7754d.mo8093d()))), 0, 0, 0, 0, 11, (Object) null);
        for (C15557e0 e0Var4 : iterable) {
            if (Intrinsics.areEqual(C15594q.m69317a(e0Var4), (Object) "TextField")) {
                C15611w0 t0 = e0Var4.mo44324t0(e2);
                long e3 = C16476b.m74351e(e2, 0, 0, 0, 0, 14, (Object) null);
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
                    w0Var4 = e0Var5.mo44324t0(e3);
                } else {
                    w0Var4 = null;
                }
                int g = OutlinedTextFieldKt.m13668k(TextFieldImplKt.m14143i(w0Var), TextFieldImplKt.m14143i(w0Var2), t0.mo44471K0(), TextFieldImplKt.m14143i(w0Var3), TextFieldImplKt.m14143i(w0Var4), z, j, h0Var.getDensity(), this.f7754d);
                int f = OutlinedTextFieldKt.m13667j(TextFieldImplKt.m14142h(w0Var), TextFieldImplKt.m14142h(w0Var2), t0.mo44468G0(), TextFieldImplKt.m14142h(w0Var3), TextFieldImplKt.m14142h(w0Var4), j, h0Var.getDensity(), this.f7754d);
                for (C15557e0 e0Var6 : iterable) {
                    if (Intrinsics.areEqual(C15594q.m69317a(e0Var6), (Object) OutlinedTextFieldKt.f7748c)) {
                        if (g != Integer.MAX_VALUE) {
                            i2 = g;
                        } else {
                            i2 = 0;
                        }
                        if (f != Integer.MAX_VALUE) {
                            i3 = f;
                        } else {
                            i3 = 0;
                        }
                        return C15568h0.m69206r2(h0Var, g, f, (Map) null, new OutlinedTextFieldMeasurePolicy$measure$2(f, g, w0Var, w0Var2, t0, w0Var3, w0Var4, e0Var6.mo44324t0(C16478c.m74376a(i2, g, i3, f)), this, h0Var), 4, (Object) null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long j2 = j;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo10327n(mVar, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.f7756f);
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo10326m(mVar, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.f7757f);
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo10327n(mVar, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.f7758f);
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo10326m(mVar, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.f7755f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10326m(androidx.compose.p004ui.layout.C15583m r11, java.util.List<? extends androidx.compose.p004ui.layout.C15580l> r12, int r13, kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.layout.C15580l, ? super java.lang.Integer, java.lang.Integer> r14) {
        /*
            r10 = this;
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r0 = r12.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010d
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.l r2 = (androidx.compose.p004ui.layout.C15580l) r2
            java.lang.Object r2 = androidx.compose.material.TextFieldImplKt.m14139e(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0006
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r14.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.util.Iterator r0 = r12.iterator()
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
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.util.Iterator r1 = r12.iterator()
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
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r5 = r1
            goto L_0x0097
        L_0x0096:
            r5 = r0
        L_0x0097:
            java.util.Iterator r1 = r12.iterator()
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
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x00ca
        L_0x00c9:
            r1 = r0
        L_0x00ca:
            java.util.Iterator r12 = r12.iterator()
        L_0x00ce:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r12.next()
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
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r14.invoke(r2, r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            goto L_0x00fc
        L_0x00fb:
            r12 = r0
        L_0x00fc:
            long r6 = androidx.compose.material.TextFieldImplKt.m14141g()
            float r8 = r11.getDensity()
            androidx.compose.foundation.layout.i0 r9 = r10.f7754d
            r2 = r5
            r5 = r12
            int r11 = androidx.compose.material.OutlinedTextFieldKt.m13667j(r1, r2, r3, r4, r5, r6, r8, r9)
            return r11
        L_0x010d:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            java.lang.String r12 = "Collection contains no element matching the predicate."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldMeasurePolicy.mo10326m(androidx.compose.ui.layout.m, java.util.List, int, kotlin.jvm.functions.p):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: androidx.compose.ui.layout.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10327n(androidx.compose.p004ui.layout.C15583m r12, java.util.List<? extends androidx.compose.p004ui.layout.C15580l> r13, int r14, kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.layout.C15580l, ? super java.lang.Integer, java.lang.Integer> r15) {
        /*
            r11 = this;
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r0 = r13.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0119
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
            int r3 = r0.intValue()
            java.util.Iterator r0 = r13.iterator()
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
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Object r1 = r15.invoke(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x0063
        L_0x0062:
            r4 = r0
        L_0x0063:
            java.util.Iterator r1 = r13.iterator()
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
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r1 = r15.invoke(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r5 = r1
            goto L_0x0097
        L_0x0096:
            r5 = r0
        L_0x0097:
            java.util.Iterator r1 = r13.iterator()
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
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r1 = r15.invoke(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x00ca
        L_0x00c9:
            r1 = r0
        L_0x00ca:
            java.util.Iterator r13 = r13.iterator()
        L_0x00ce:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r13.next()
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
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object r13 = r15.invoke(r2, r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            goto L_0x00fc
        L_0x00fb:
            r13 = r0
        L_0x00fc:
            float r14 = r11.f7753c
            r15 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x0107
            r14 = 1
            r6 = r14
            goto L_0x0108
        L_0x0107:
            r6 = r0
        L_0x0108:
            long r7 = androidx.compose.material.TextFieldImplKt.m14141g()
            float r9 = r12.getDensity()
            androidx.compose.foundation.layout.i0 r10 = r11.f7754d
            r2 = r5
            r5 = r13
            int r12 = androidx.compose.material.OutlinedTextFieldKt.m13668k(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return r12
        L_0x0119:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "Collection contains no element matching the predicate."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldMeasurePolicy.mo10327n(androidx.compose.ui.layout.m, java.util.List, int, kotlin.jvm.functions.p):int");
    }
}
