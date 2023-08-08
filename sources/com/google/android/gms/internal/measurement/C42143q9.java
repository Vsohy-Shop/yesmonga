package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q9 */
public final class C42143q9 extends C42082n {

    /* renamed from: b */
    public final C41885c f106368b;

    public C42143q9(C41885c cVar) {
        this.f106368b = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C42133q mo136741i(java.lang.String r17, com.google.android.gms.internal.measurement.C41909d5 r18, java.util.List r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = r6
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = r14
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = r15
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = r7
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = r5
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0134
            if (r4 == r15) goto L_0x0114
            if (r4 == r14) goto L_0x00e1
            if (r4 == r7) goto L_0x00c9
            if (r4 == r6) goto L_0x008d
            r6 = 5
            if (r4 == r6) goto L_0x0064
            com.google.android.gms.internal.measurement.q r1 = super.mo136741i(r17, r18, r19)
            return r1
        L_0x0064:
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C42133q) r1
            com.google.android.gms.internal.measurement.q r1 = r2.mo136673b(r1)
            java.lang.String r1 = r1.mo136744k()
            java.lang.Object r3 = r3.get(r15)
            com.google.android.gms.internal.measurement.q r3 = (com.google.android.gms.internal.measurement.C42133q) r3
            com.google.android.gms.internal.measurement.q r2 = r2.mo136673b(r3)
            com.google.android.gms.internal.measurement.c r3 = r0.f106368b
            com.google.android.gms.internal.measurement.b r3 = r3.mo136641b()
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C41928e6.m169808f(r2)
            r3.mo136594g(r1, r4)
            return r2
        L_0x008d:
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C42133q) r1
            com.google.android.gms.internal.measurement.q r1 = r2.mo136673b(r1)
            com.google.android.gms.internal.measurement.q r2 = com.google.android.gms.internal.measurement.C42133q.f106351H
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.q r2 = com.google.android.gms.internal.measurement.C42133q.f106352I
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.c r2 = r0.f106368b
            com.google.android.gms.internal.measurement.b r2 = r2.mo136641b()
            java.lang.String r3 = r1.mo136744k()
            r2.mo136593f(r3)
            com.google.android.gms.internal.measurement.u r2 = new com.google.android.gms.internal.measurement.u
            java.lang.String r1 = r1.mo136744k()
            r2.<init>(r1)
            return r2
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00c9:
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r12, r5, r3)
            com.google.android.gms.internal.measurement.c r1 = r0.f106368b
            com.google.android.gms.internal.measurement.b r1 = r1.mo136641b()
            com.google.android.gms.internal.measurement.i r2 = new com.google.android.gms.internal.measurement.i
            long r3 = r1.mo136586a()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e1:
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r10, r5, r3)
            com.google.android.gms.internal.measurement.c r1 = r0.f106368b
            com.google.android.gms.internal.measurement.b r1 = r1.mo136641b()
            java.util.Map r1 = r1.mo136591e()
            com.google.android.gms.internal.measurement.n r2 = new com.google.android.gms.internal.measurement.n
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.q r5 = com.google.android.gms.internal.measurement.C41947f7.m169877b(r5)
            r2.mo136748w(r4, r5)
            goto L_0x00fb
        L_0x0113:
            return r2
        L_0x0114:
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C42133q) r1
            com.google.android.gms.internal.measurement.q r1 = r2.mo136673b(r1)
            java.lang.String r1 = r1.mo136744k()
            com.google.android.gms.internal.measurement.c r2 = r0.f106368b
            com.google.android.gms.internal.measurement.b r2 = r2.mo136641b()
            java.lang.Object r1 = r2.mo136588c(r1)
            com.google.android.gms.internal.measurement.q r1 = com.google.android.gms.internal.measurement.C41947f7.m169877b(r1)
            return r1
        L_0x0134:
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r13, r5, r3)
            com.google.android.gms.internal.measurement.c r1 = r0.f106368b
            com.google.android.gms.internal.measurement.b r1 = r1.mo136641b()
            com.google.android.gms.internal.measurement.u r2 = new com.google.android.gms.internal.measurement.u
            java.lang.String r1 = r1.mo136590d()
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C42143q9.mo136741i(java.lang.String, com.google.android.gms.internal.measurement.d5, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
