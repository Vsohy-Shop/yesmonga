package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
public final class C41850a0 extends C42252x {
    public C41850a0() {
        this.f106488a.add(zzbl.APPLY);
        this.f106488a.add(zzbl.BLOCK);
        this.f106488a.add(zzbl.BREAK);
        this.f106488a.add(zzbl.CASE);
        this.f106488a.add(zzbl.DEFAULT);
        this.f106488a.add(zzbl.CONTINUE);
        this.f106488a.add(zzbl.DEFINE_FUNCTION);
        this.f106488a.add(zzbl.FN);
        this.f106488a.add(zzbl.IF);
        this.f106488a.add(zzbl.QUOTE);
        this.f106488a.add(zzbl.RETURN);
        this.f106488a.add(zzbl.SWITCH);
        this.f106488a.add(zzbl.TERNARY);
    }

    /* renamed from: c */
    public static C42133q m169581c(C41909d5 d5Var, List list) {
        C41928e6.m169811i(zzbl.FN.name(), 2, list);
        C42133q b = d5Var.mo136673b((C42133q) list.get(0));
        C42133q b2 = d5Var.mo136673b((C42133q) list.get(1));
        if (b2 instanceof C41939f) {
            List W = ((C41939f) b2).mo136731W();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C42116p(b.mo136744k(), W, arrayList, d5Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0129, code lost:
        if (r8.equals("continue") == false) goto L_0x012d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C42133q mo136495a(java.lang.String r8, com.google.android.gms.internal.measurement.C41909d5 r9, java.util.List r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.ADD
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.C41928e6.m169807e(r8)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x0211
            r5 = 15
            if (r0 == r5) goto L_0x0205
            r5 = 25
            if (r0 == r5) goto L_0x0200
            r5 = 41
            if (r0 == r5) goto L_0x01ae
            r5 = 54
            if (r0 == r5) goto L_0x01a8
            r5 = 57
            java.lang.String r6 = "return"
            if (r0 == r5) goto L_0x0185
            r5 = 19
            if (r0 == r5) goto L_0x0164
            r5 = 20
            if (r0 == r5) goto L_0x0140
            r5 = 60
            if (r0 == r5) goto L_0x008b
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x0164;
                default: goto L_0x0039;
            }
        L_0x0039:
            com.google.android.gms.internal.measurement.q r8 = super.mo137448b(r8)
            return r8
        L_0x003e:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r8, r4, r10)
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C42133q.f106354K
            return r8
        L_0x004a:
            com.google.android.gms.internal.measurement.d5 r8 = r9.mo136672a()
            com.google.android.gms.internal.measurement.f r9 = new com.google.android.gms.internal.measurement.f
            r9.<init>(r10)
            com.google.android.gms.internal.measurement.q r8 = r8.mo136674c(r9)
            return r8
        L_0x0058:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.TERNARY
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C42133q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136673b(r8)
            java.lang.Boolean r8 = r8.mo136738h()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0080
            java.lang.Object r8 = r10.get(r3)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C42133q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136673b(r8)
            goto L_0x008a
        L_0x0080:
            java.lang.Object r8 = r10.get(r2)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C42133q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136673b(r8)
        L_0x008a:
            return r8
        L_0x008b:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.SWITCH
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C42133q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136673b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r9.mo136673b(r0)
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.q r10 = (com.google.android.gms.internal.measurement.C42133q) r10
            com.google.android.gms.internal.measurement.q r10 = r9.mo136673b(r10)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C41939f
            if (r1 == 0) goto L_0x0138
            boolean r1 = r10 instanceof com.google.android.gms.internal.measurement.C41939f
            if (r1 == 0) goto L_0x0130
            com.google.android.gms.internal.measurement.f r0 = (com.google.android.gms.internal.measurement.C41939f) r0
            com.google.android.gms.internal.measurement.f r10 = (com.google.android.gms.internal.measurement.C41939f) r10
            r1 = r4
            r2 = r1
        L_0x00c0:
            int r5 = r0.mo136726A()
            if (r1 >= r5) goto L_0x00fb
            if (r2 != 0) goto L_0x00d9
            com.google.android.gms.internal.measurement.q r2 = r0.mo136727H(r1)
            com.google.android.gms.internal.measurement.q r2 = r9.mo136673b(r2)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r2 = r4
            goto L_0x00f8
        L_0x00d9:
            com.google.android.gms.internal.measurement.q r2 = r10.mo136727H(r1)
            com.google.android.gms.internal.measurement.q r2 = r9.mo136673b(r2)
            boolean r5 = r2 instanceof com.google.android.gms.internal.measurement.C41975h
            if (r5 == 0) goto L_0x00f7
            r8 = r2
            com.google.android.gms.internal.measurement.h r8 = (com.google.android.gms.internal.measurement.C41975h) r8
            java.lang.String r8 = r8.mo136890b()
            java.lang.String r9 = "break"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x012c
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C42133q.f106351H
            return r8
        L_0x00f7:
            r2 = r3
        L_0x00f8:
            int r1 = r1 + 1
            goto L_0x00c0
        L_0x00fb:
            int r8 = r0.mo136726A()
            int r8 = r8 + r3
            int r1 = r10.mo136726A()
            if (r8 != r1) goto L_0x012d
            int r8 = r0.mo136726A()
            com.google.android.gms.internal.measurement.q r8 = r10.mo136727H(r8)
            com.google.android.gms.internal.measurement.q r2 = r9.mo136673b(r8)
            boolean r8 = r2 instanceof com.google.android.gms.internal.measurement.C41975h
            if (r8 == 0) goto L_0x012d
            r8 = r2
            com.google.android.gms.internal.measurement.h r8 = (com.google.android.gms.internal.measurement.C41975h) r8
            java.lang.String r8 = r8.mo136890b()
            boolean r9 = r8.equals(r6)
            if (r9 != 0) goto L_0x012c
            java.lang.String r9 = "continue"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            return r2
        L_0x012d:
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C42133q.f106351H
            return r8
        L_0x0130:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, case statements are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0138:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, cases are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0140:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.DEFINE_FUNCTION
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C41928e6.m169811i(r8, r2, r10)
            com.google.android.gms.internal.measurement.q r8 = m169581c(r9, r10)
            r10 = r8
            com.google.android.gms.internal.measurement.j r10 = (com.google.android.gms.internal.measurement.C42011j) r10
            java.lang.String r0 = r10.mo137042b()
            if (r0 != 0) goto L_0x015c
            java.lang.String r10 = ""
            r9.mo136678g(r10, r8)
            goto L_0x0163
        L_0x015c:
            java.lang.String r10 = r10.mo137042b()
            r9.mo136678g(r10, r8)
        L_0x0163:
            return r8
        L_0x0164:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x016d
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C42133q.f106351H
            goto L_0x0184
        L_0x016d:
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C42133q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136673b(r8)
            boolean r10 = r8 instanceof com.google.android.gms.internal.measurement.C41939f
            if (r10 == 0) goto L_0x0182
            com.google.android.gms.internal.measurement.f r8 = (com.google.android.gms.internal.measurement.C41939f) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136674c(r8)
            goto L_0x0184
        L_0x0182:
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C42133q.f106351H
        L_0x0184:
            return r8
        L_0x0185:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x018e
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C42133q.f106355L
            goto L_0x01a7
        L_0x018e:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.RETURN
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r8, r3, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C42133q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136673b(r8)
            com.google.android.gms.internal.measurement.h r9 = new com.google.android.gms.internal.measurement.h
            r9.<init>(r6, r8)
            r8 = r9
        L_0x01a7:
            return r8
        L_0x01a8:
            com.google.android.gms.internal.measurement.f r8 = new com.google.android.gms.internal.measurement.f
            r8.<init>(r10)
            return r8
        L_0x01ae:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.IF
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C41928e6.m169811i(r8, r2, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C42133q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136673b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r9.mo136673b(r0)
            int r1 = r10.size()
            if (r1 <= r2) goto L_0x01dc
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.q r10 = (com.google.android.gms.internal.measurement.C42133q) r10
            com.google.android.gms.internal.measurement.q r10 = r9.mo136673b(r10)
            goto L_0x01dd
        L_0x01dc:
            r10 = 0
        L_0x01dd:
            com.google.android.gms.internal.measurement.q r1 = com.google.android.gms.internal.measurement.C42133q.f106351H
            java.lang.Boolean r8 = r8.mo136738h()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01f0
            com.google.android.gms.internal.measurement.f r0 = (com.google.android.gms.internal.measurement.C41939f) r0
            com.google.android.gms.internal.measurement.q r8 = r9.mo136674c(r0)
            goto L_0x01fa
        L_0x01f0:
            if (r10 == 0) goto L_0x01f9
            com.google.android.gms.internal.measurement.f r10 = (com.google.android.gms.internal.measurement.C41939f) r10
            com.google.android.gms.internal.measurement.q r8 = r9.mo136674c(r10)
            goto L_0x01fa
        L_0x01f9:
            r8 = r1
        L_0x01fa:
            boolean r9 = r8 instanceof com.google.android.gms.internal.measurement.C41975h
            if (r9 == 0) goto L_0x01ff
            return r8
        L_0x01ff:
            return r1
        L_0x0200:
            com.google.android.gms.internal.measurement.q r8 = m169581c(r9, r10)
            return r8
        L_0x0205:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r8, r4, r10)
            com.google.android.gms.internal.measurement.q r8 = com.google.android.gms.internal.measurement.C42133q.f106353J
            return r8
        L_0x0211:
            com.google.android.gms.internal.measurement.zzbl r8 = com.google.android.gms.internal.measurement.zzbl.APPLY
            java.lang.String r8 = r8.name()
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.android.gms.internal.measurement.q r8 = (com.google.android.gms.internal.measurement.C42133q) r8
            com.google.android.gms.internal.measurement.q r8 = r9.mo136673b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r9.mo136673b(r0)
            java.lang.String r0 = r0.mo136744k()
            java.lang.Object r10 = r10.get(r2)
            com.google.android.gms.internal.measurement.q r10 = (com.google.android.gms.internal.measurement.C42133q) r10
            com.google.android.gms.internal.measurement.q r10 = r9.mo136673b(r10)
            boolean r1 = r10 instanceof com.google.android.gms.internal.measurement.C41939f
            if (r1 == 0) goto L_0x0259
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0251
            com.google.android.gms.internal.measurement.f r10 = (com.google.android.gms.internal.measurement.C41939f) r10
            java.util.List r10 = r10.mo136731W()
            com.google.android.gms.internal.measurement.q r8 = r8.mo136741i(r0, r9, r10)
            return r8
        L_0x0251:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Function name for apply is undefined"
            r8.<init>(r9)
            throw r8
        L_0x0259:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            r9[r4] = r10
            java.lang.String r10 = "Function arguments for Apply are not a list found %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41850a0.mo136495a(java.lang.String, com.google.android.gms.internal.measurement.d5, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
