package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C42069m3;

/* renamed from: com.google.android.gms.measurement.internal.fb */
public final class C30724fb extends C30737gb {

    /* renamed from: g */
    public final C42069m3 f73403g;

    /* renamed from: h */
    public final /* synthetic */ C30660b f73404h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30724fb(C30660b bVar, String str, int i, C42069m3 m3Var) {
        super(str, i);
        this.f73404h = bVar;
        this.f73403g = m3Var;
    }

    /* renamed from: a */
    public final int mo87065a() {
        return this.f73403g.mo137130C();
    }

    /* renamed from: b */
    public final boolean mo87066b() {
        return this.f73403g.mo137138O();
    }

    /* renamed from: c */
    public final boolean mo87067c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fb  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87068k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.C42240w4 r18, long r19, com.google.android.gms.measurement.internal.C30859r r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.measurement.C41989hd.m170237b()
            com.google.android.gms.measurement.internal.b r1 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.g r1 = r1.mo87130z()
            java.lang.String r2 = r0.f73475a
            com.google.android.gms.measurement.internal.g3 r3 = com.google.android.gms.measurement.internal.C30742h3.f73522a0
            boolean r1 = r1.mo87070B(r2, r3)
            com.google.android.gms.internal.measurement.m3 r2 = r0.f73403g
            boolean r2 = r2.mo137137N()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f73889e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            com.google.android.gms.measurement.internal.b r4 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r4 = r4.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            java.lang.String r4 = r4.mo87486D()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.b r4 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r4 = r4.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87493v()
            int r6 = r0.f73476b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.measurement.m3 r7 = r0.f73403g
            boolean r7 = r7.mo137139P()
            if (r7 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.m3 r7 = r0.f73403g
            int r7 = r7.mo137130C()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            com.google.android.gms.measurement.internal.b r8 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r8 = r8.f74136a
            com.google.android.gms.measurement.internal.p3 r8 = r8.mo87101D()
            com.google.android.gms.internal.measurement.m3 r9 = r0.f73403g
            java.lang.String r9 = r9.mo137133H()
            java.lang.String r8 = r8.mo87410d(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.mo87466d(r9, r6, r7, r8)
            com.google.android.gms.measurement.internal.b r4 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r4 = r4.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87493v()
            com.google.android.gms.measurement.internal.b r6 = r0.f73404h
            com.google.android.gms.measurement.internal.na r6 = r6.f74119b
            com.google.android.gms.measurement.internal.pa r6 = r6.mo87370g0()
            com.google.android.gms.internal.measurement.m3 r7 = r0.f73403g
            java.lang.String r6 = r6.mo87421E(r7)
            java.lang.String r7 = "Filter definition"
            r4.mo87464b(r7, r6)
        L_0x0093:
            com.google.android.gms.internal.measurement.m3 r4 = r0.f73403g
            boolean r4 = r4.mo137139P()
            r6 = 0
            if (r4 == 0) goto L_0x0440
            com.google.android.gms.internal.measurement.m3 r4 = r0.f73403g
            int r4 = r4.mo137130C()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x0440
        L_0x00a8:
            com.google.android.gms.internal.measurement.m3 r4 = r0.f73403g
            boolean r4 = r4.mo137135L()
            com.google.android.gms.internal.measurement.m3 r7 = r0.f73403g
            boolean r7 = r7.mo137136M()
            com.google.android.gms.internal.measurement.m3 r8 = r0.f73403g
            boolean r8 = r8.mo137137N()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = r6
            goto L_0x00c5
        L_0x00c4:
            r4 = r9
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.b r1 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87493v()
            int r2 = r0.f73476b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.m3 r3 = r0.f73403g
            boolean r3 = r3.mo137139P()
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.m3 r3 = r0.f73403g
            int r3 = r3.mo137130C()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo87465c(r3, r2, r5)
            return r9
        L_0x00f3:
            com.google.android.gms.internal.measurement.m3 r7 = r0.f73403g
            java.lang.String r8 = r18.mo137400I()
            boolean r10 = r7.mo137138O()
            if (r10 == 0) goto L_0x0115
            com.google.android.gms.internal.measurement.t3 r10 = r7.mo137132G()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123788h(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03e1
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.mo137134I()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            com.google.android.gms.internal.measurement.o3 r10 = (com.google.android.gms.internal.measurement.C42103o3) r10
            java.lang.String r11 = r10.mo137190F()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
            r2.mo87464b(r7, r3)
            goto L_0x03e1
        L_0x0157:
            java.lang.String r10 = r10.mo137190F()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            androidx.collection.a r3 = new androidx.collection.a
            r3.<init>()
            java.util.List r10 = r18.mo137401J()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.a5 r11 = (com.google.android.gms.internal.measurement.C41855a5) r11
            java.lang.String r12 = r11.mo136514H()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.mo136519W()
            if (r12 == 0) goto L_0x01a0
            java.lang.String r12 = r11.mo136514H()
            boolean r13 = r11.mo136519W()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.mo136513E()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x019c
        L_0x019b:
            r11 = r5
        L_0x019c:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01a0:
            boolean r12 = r11.mo136517U()
            if (r12 == 0) goto L_0x01be
            java.lang.String r12 = r11.mo136514H()
            boolean r13 = r11.mo136517U()
            if (r13 == 0) goto L_0x01b9
            double r13 = r11.mo136510B()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ba
        L_0x01b9:
            r11 = r5
        L_0x01ba:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01be:
            boolean r12 = r11.mo136521Y()
            if (r12 == 0) goto L_0x01d0
            java.lang.String r12 = r11.mo136514H()
            java.lang.String r11 = r11.mo136515I()
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01d0:
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r8 = r11.mo136514H()
            java.lang.String r7 = r7.mo87411e(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
            r2.mo87465c(r8, r3, r7)
            goto L_0x03e1
        L_0x01ff:
            java.util.List r2 = r7.mo137134I()
            java.util.Iterator r2 = r2.iterator()
        L_0x0207:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03df
            java.lang.Object r7 = r2.next()
            com.google.android.gms.internal.measurement.o3 r7 = (com.google.android.gms.internal.measurement.C42103o3) r7
            boolean r10 = r7.mo137192I()
            if (r10 == 0) goto L_0x0221
            boolean r10 = r7.mo137191H()
            if (r10 == 0) goto L_0x0221
            r10 = r9
            goto L_0x0222
        L_0x0221:
            r10 = r6
        L_0x0222:
            java.lang.String r11 = r7.mo137190F()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x024b
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            java.lang.String r7 = "Event has empty param name. event"
            r2.mo87464b(r7, r3)
            goto L_0x03e1
        L_0x024b:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x02a0
            boolean r13 = r7.mo137193J()
            if (r13 != 0) goto L_0x0284
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r7 = r7.mo87411e(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            r2.mo87465c(r8, r3, r7)
            goto L_0x03e1
        L_0x0284:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.t3 r7 = r7.mo137188D()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C30737gb.m123788h(r11, r7)
            if (r7 != 0) goto L_0x0296
            goto L_0x03e1
        L_0x0296:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02a0:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02f1
            boolean r13 = r7.mo137193J()
            if (r13 != 0) goto L_0x02d5
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r7 = r7.mo87411e(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            r2.mo87465c(r8, r3, r7)
            goto L_0x03e1
        L_0x02d5:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.t3 r7 = r7.mo137188D()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C30737gb.m123787g(r11, r7)
            if (r7 != 0) goto L_0x02e7
            goto L_0x03e1
        L_0x02e7:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x02f1:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0387
            boolean r13 = r7.mo137195L()
            if (r13 == 0) goto L_0x030e
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.a4 r7 = r7.mo137189E()
            com.google.android.gms.measurement.internal.b r11 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r11 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r11 = r11.mo86903d()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C30737gb.m123786f(r12, r7, r11)
            goto L_0x0324
        L_0x030e:
            boolean r13 = r7.mo137193J()
            if (r13 == 0) goto L_0x035d
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.C30846pa.m124115N(r12)
            if (r13 == 0) goto L_0x0332
            com.google.android.gms.internal.measurement.t3 r7 = r7.mo137188D()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.C30737gb.m123789i(r12, r7)
        L_0x0324:
            if (r7 != 0) goto L_0x0328
            goto L_0x03e1
        L_0x0328:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x0207
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x0332:
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r7 = r7.mo87411e(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            r2.mo87465c(r8, r3, r7)
            goto L_0x03e1
        L_0x035d:
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r7 = r7.mo87411e(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            r2.mo87465c(r8, r3, r7)
            goto L_0x03e1
        L_0x0387:
            if (r12 != 0) goto L_0x03b5
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87493v()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            com.google.android.gms.measurement.internal.b r5 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r5 = r5.f74136a
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo87101D()
            java.lang.String r5 = r5.mo87411e(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.mo87465c(r7, r3, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03e1
        L_0x03b5:
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87494w()
            com.google.android.gms.measurement.internal.b r3 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r3 = r3.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r8)
            com.google.android.gms.measurement.internal.b r7 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r7 = r7.mo87411e(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            r2.mo87465c(r8, r3, r7)
            goto L_0x03e1
        L_0x03df:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03e1:
            com.google.android.gms.measurement.internal.b r2 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87493v()
            if (r5 != 0) goto L_0x03f2
            java.lang.String r3 = "null"
            goto L_0x03f3
        L_0x03f2:
            r3 = r5
        L_0x03f3:
            java.lang.String r7 = "Event filter result"
            r2.mo87464b(r7, r3)
            if (r5 != 0) goto L_0x03fb
            return r6
        L_0x03fb:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f73477c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x0406
            return r9
        L_0x0406:
            r0.f73478d = r2
            if (r4 == 0) goto L_0x043f
            boolean r2 = r18.mo137404U()
            if (r2 == 0) goto L_0x043f
            long r2 = r18.mo137398E()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.measurement.m3 r3 = r0.f73403g
            boolean r3 = r3.mo137136M()
            if (r3 == 0) goto L_0x0430
            if (r1 == 0) goto L_0x042d
            com.google.android.gms.internal.measurement.m3 r1 = r0.f73403g
            boolean r1 = r1.mo137138O()
            if (r1 != 0) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            r2 = r16
        L_0x042d:
            r0.f73480f = r2
            goto L_0x043f
        L_0x0430:
            if (r1 == 0) goto L_0x043d
            com.google.android.gms.internal.measurement.m3 r1 = r0.f73403g
            boolean r1 = r1.mo137138O()
            if (r1 != 0) goto L_0x043b
            goto L_0x043d
        L_0x043b:
            r2 = r17
        L_0x043d:
            r0.f73479e = r2
        L_0x043f:
            return r9
        L_0x0440:
            com.google.android.gms.measurement.internal.b r1 = r0.f73404h
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87494w()
            java.lang.String r2 = r0.f73475a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r2)
            com.google.android.gms.internal.measurement.m3 r3 = r0.f73403g
            boolean r3 = r3.mo137139P()
            if (r3 == 0) goto L_0x0464
            com.google.android.gms.internal.measurement.m3 r3 = r0.f73403g
            int r3 = r3.mo137130C()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0464:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo87465c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30724fb.mo87068k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.w4, long, com.google.android.gms.measurement.internal.r, boolean):boolean");
    }
}
