package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C42222v3;

/* renamed from: com.google.android.gms.measurement.internal.hb */
public final class C30750hb extends C30737gb {

    /* renamed from: g */
    public final C42222v3 f73585g;

    /* renamed from: h */
    public final /* synthetic */ C30660b f73586h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30750hb(C30660b bVar, String str, int i, C42222v3 v3Var) {
        super(str, i);
        this.f73586h = bVar;
        this.f73585g = v3Var;
    }

    /* renamed from: a */
    public final int mo87065a() {
        return this.f73585g.mo137346B();
    }

    /* renamed from: b */
    public final boolean mo87066b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo87067c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87151k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.C42139q5 r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.C41989hd.m170237b()
            com.google.android.gms.measurement.internal.b r0 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            com.google.android.gms.measurement.internal.g r0 = r0.mo87130z()
            java.lang.String r1 = r10.f73475a
            com.google.android.gms.measurement.internal.g3 r2 = com.google.android.gms.measurement.internal.C30742h3.f73519Y
            boolean r0 = r0.mo87070B(r1, r2)
            com.google.android.gms.internal.measurement.v3 r1 = r10.f73585g
            boolean r1 = r1.mo137349H()
            com.google.android.gms.internal.measurement.v3 r2 = r10.f73585g
            boolean r2 = r2.mo137350I()
            com.google.android.gms.internal.measurement.v3 r3 = r10.f73585g
            boolean r3 = r3.mo137351J()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = r4
            goto L_0x0031
        L_0x0030:
            r1 = r5
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.b r11 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r11 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r11 = r11.mo86903d()
            com.google.android.gms.measurement.internal.s3 r11 = r11.mo87493v()
            int r12 = r10.f73476b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.v3 r13 = r10.f73585g
            boolean r13 = r13.mo137352K()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.v3 r13 = r10.f73585g
            int r13 = r13.mo137346B()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo87465c(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.v3 r6 = r10.f73585g
            com.google.android.gms.internal.measurement.o3 r6 = r6.mo137347C()
            boolean r7 = r6.mo137191H()
            boolean r8 = r13.mo137236R()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo137193J()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.b r6 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r6 = r6.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87494w()
            com.google.android.gms.measurement.internal.b r7 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r8 = r13.mo137233G()
            java.lang.String r7 = r7.mo87412f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.mo87464b(r8, r7)
            goto L_0x019c
        L_0x0099:
            long r8 = r13.mo137231C()
            com.google.android.gms.internal.measurement.t3 r2 = r6.mo137188D()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123788h(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123790j(r2, r7)
            goto L_0x019c
        L_0x00ab:
            boolean r8 = r13.mo137235Q()
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r6.mo137193J()
            if (r8 != 0) goto L_0x00da
            com.google.android.gms.measurement.internal.b r6 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r6 = r6.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87494w()
            com.google.android.gms.measurement.internal.b r7 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r8 = r13.mo137233G()
            java.lang.String r7 = r7.mo87412f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.mo87464b(r8, r7)
            goto L_0x019c
        L_0x00da:
            double r8 = r13.mo137230B()
            com.google.android.gms.internal.measurement.t3 r2 = r6.mo137188D()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123787g(r8, r2)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123790j(r2, r7)
            goto L_0x019c
        L_0x00ec:
            boolean r8 = r13.mo137238T()
            if (r8 == 0) goto L_0x017b
            boolean r8 = r6.mo137195L()
            if (r8 != 0) goto L_0x0162
            boolean r8 = r6.mo137193J()
            if (r8 != 0) goto L_0x0121
            com.google.android.gms.measurement.internal.b r6 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r6 = r6.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87494w()
            com.google.android.gms.measurement.internal.b r7 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r8 = r13.mo137233G()
            java.lang.String r7 = r7.mo87412f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.mo87464b(r8, r7)
            goto L_0x019c
        L_0x0121:
            java.lang.String r8 = r13.mo137234H()
            boolean r8 = com.google.android.gms.measurement.internal.C30846pa.m124115N(r8)
            if (r8 == 0) goto L_0x013c
            java.lang.String r2 = r13.mo137234H()
            com.google.android.gms.internal.measurement.t3 r6 = r6.mo137188D()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123789i(r2, r6)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123790j(r2, r7)
            goto L_0x019c
        L_0x013c:
            com.google.android.gms.measurement.internal.b r6 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r6 = r6.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87494w()
            com.google.android.gms.measurement.internal.b r7 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r8 = r13.mo137233G()
            java.lang.String r7 = r7.mo87412f(r8)
            java.lang.String r8 = r13.mo137234H()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo87465c(r9, r7, r8)
            goto L_0x019c
        L_0x0162:
            java.lang.String r2 = r13.mo137234H()
            com.google.android.gms.internal.measurement.a4 r6 = r6.mo137189E()
            com.google.android.gms.measurement.internal.b r8 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r8 = r8.f74136a
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo86903d()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123786f(r2, r6, r8)
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C30737gb.m123790j(r2, r7)
            goto L_0x019c
        L_0x017b:
            com.google.android.gms.measurement.internal.b r6 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r6 = r6.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87494w()
            com.google.android.gms.measurement.internal.b r7 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r7 = r7.f74136a
            com.google.android.gms.measurement.internal.p3 r7 = r7.mo87101D()
            java.lang.String r8 = r13.mo137233G()
            java.lang.String r7 = r7.mo87412f(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.mo87464b(r8, r7)
        L_0x019c:
            com.google.android.gms.measurement.internal.b r6 = r10.f73586h
            com.google.android.gms.measurement.internal.g5 r6 = r6.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87493v()
            if (r2 != 0) goto L_0x01ad
            java.lang.String r7 = "null"
            goto L_0x01ae
        L_0x01ad:
            r7 = r2
        L_0x01ae:
            java.lang.String r8 = "Property filter result"
            r6.mo87464b(r8, r7)
            if (r2 != 0) goto L_0x01b6
            return r4
        L_0x01b6:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f73477c = r4
            if (r3 == 0) goto L_0x01c4
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            return r5
        L_0x01c4:
            if (r14 == 0) goto L_0x01ce
            com.google.android.gms.internal.measurement.v3 r14 = r10.f73585g
            boolean r14 = r14.mo137349H()
            if (r14 == 0) goto L_0x01d0
        L_0x01ce:
            r10.f73478d = r2
        L_0x01d0:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0215
            if (r1 == 0) goto L_0x0215
            boolean r14 = r13.mo137237S()
            if (r14 == 0) goto L_0x0215
            long r13 = r13.mo137232D()
            if (r11 == 0) goto L_0x01e8
            long r13 = r11.longValue()
        L_0x01e8:
            if (r0 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.v3 r11 = r10.f73585g
            boolean r11 = r11.mo137349H()
            if (r11 == 0) goto L_0x0200
            com.google.android.gms.internal.measurement.v3 r11 = r10.f73585g
            boolean r11 = r11.mo137350I()
            if (r11 != 0) goto L_0x0200
            if (r12 == 0) goto L_0x0200
            long r13 = r12.longValue()
        L_0x0200:
            com.google.android.gms.internal.measurement.v3 r11 = r10.f73585g
            boolean r11 = r11.mo137350I()
            if (r11 == 0) goto L_0x020f
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f73480f = r11
            goto L_0x0215
        L_0x020f:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f73479e = r11
        L_0x0215:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30750hb.mo87151k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.q5, boolean):boolean");
    }
}
