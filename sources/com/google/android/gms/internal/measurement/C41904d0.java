package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
public final class C41904d0 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f6, code lost:
        r1 = r22.mo136726A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fa, code lost:
        r2 = r22.mo136726A();
        r4 = new com.google.android.gms.internal.measurement.C41939f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0208, code lost:
        if (r24.size() <= 1) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020a, code lost:
        r5 = java.lang.Math.max(0, (int) com.google.android.gms.internal.measurement.C41928e6.m169803a(r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(1)).mo136743j().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0226, code lost:
        if (r5 <= 0) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0228, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022f, code lost:
        if (r6 >= java.lang.Math.min(r2, r1 + r5)) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0231, code lost:
        r4.mo136737f0(r4.mo136726A(), r9.mo136727H(r1));
        r9.mo136735e0(r1);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0247, code lost:
        if (r24.size() <= 2) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0249, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024e, code lost:
        if (r2 >= r24.size()) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0250, code lost:
        r5 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025c, code lost:
        if ((r5 instanceof com.google.android.gms.internal.measurement.C41975h) != false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025e, code lost:
        r9.mo136733Y((r1 + r2) - 2, r5);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026f, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0270, code lost:
        if (r1 >= r2) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0272, code lost:
        r4.mo136737f0(r4.mo136726A(), r9.mo136727H(r1));
        r9.mo136737f0(r1, (com.google.android.gms.internal.measurement.C42133q) null);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0286, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169812j("sort", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0295, code lost:
        if (r22.mo136726A() >= 2) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0298, code lost:
        r1 = r22.mo136731W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a0, code lost:
        if (r24.isEmpty() != false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a2, code lost:
        r0 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02af, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C42011j) == false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b1, code lost:
        r0 = (com.google.android.gms.internal.measurement.C42011j) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02bb, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02bc, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02bd, code lost:
        java.util.Collections.sort(r1, new com.google.android.gms.internal.measurement.C41886c0(r0, r3));
        r22.mo136732X();
        r0 = r1.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d1, code lost:
        if (r0.hasNext() == false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d3, code lost:
        r9.mo136737f0(r2, (com.google.android.gms.internal.measurement.C42133q) r0.next());
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e0, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e1, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169810h("some", 1, r0);
        r0 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f8, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C42011j) == false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02fe, code lost:
        if (r22.mo136726A() != 0) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0303, code lost:
        r0 = (com.google.android.gms.internal.measurement.C42011j) r0;
        r1 = r22.mo136730Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030d, code lost:
        if (r1.hasNext() == false) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x030f, code lost:
        r2 = ((java.lang.Integer) r1.next()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x031d, code lost:
        if (r9.mo136739h0(r2) == false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0349, code lost:
        if (r0.mo136725a(r3, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.C42133q[]{r9.mo136727H(r2), new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf((double) r2)), r9})).mo136738h().booleanValue() == false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0358, code lost:
        throw new java.lang.IllegalArgumentException(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0359, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169812j("slice", 2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0367, code lost:
        if (r24.isEmpty() == false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x036e, code lost:
        r4 = (double) r22.mo136726A();
        r6 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0)).mo136743j().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038c, code lost:
        if (r6 >= 0.0d) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x038e, code lost:
        r6 = java.lang.Math.max(r6 + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0394, code lost:
        r6 = java.lang.Math.min(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x039d, code lost:
        if (r24.size() != 2) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x039f, code lost:
        r10 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(1)).mo136743j().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b8, code lost:
        if (r10 >= 0.0d) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ba, code lost:
        r4 = java.lang.Math.max(r4 + r10, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c0, code lost:
        r4 = java.lang.Math.min(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03c4, code lost:
        r0 = new com.google.android.gms.internal.measurement.C41939f();
        r1 = (int) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03cd, code lost:
        if (((double) r1) >= r4) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03cf, code lost:
        r0.mo136737f0(r0.mo136726A(), r9.mo136727H(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03de, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.C41928e6.m169810h("shift", 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ea, code lost:
        if (r22.mo136726A() != 0) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ef, code lost:
        r0 = r9.mo136727H(0);
        r9.mo136735e0(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03f7, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.C41928e6.m169810h("reverse", 0, r24);
        r0 = r22.mo136726A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0403, code lost:
        if (r0 == 0) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0405, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0408, code lost:
        if (r2 >= (r0 / 2)) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x040e, code lost:
        if (r9.mo136739h0(r2) == false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0410, code lost:
        r1 = r9.mo136727H(r2);
        r9.mo136737f0(r2, (com.google.android.gms.internal.measurement.C42133q) null);
        r3 = (r0 - 1) - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x041f, code lost:
        if (r9.mo136739h0(r3) == false) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0421, code lost:
        r9.mo136737f0(r2, r9.mo136727H(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0428, code lost:
        r9.mo136737f0(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x042b, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x042e, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x043a, code lost:
        return m169760c(r22, r23, r24, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0446, code lost:
        return m169760c(r22, r23, r24, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0447, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0451, code lost:
        if (r24.isEmpty() != false) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0453, code lost:
        r0 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x045b, code lost:
        if (r0.hasNext() == false) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x045d, code lost:
        r9.mo136737f0(r22.mo136726A(), r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x047d, code lost:
        return new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf((double) r22.mo136726A()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x047e, code lost:
        r9 = r22;
        com.google.android.gms.internal.measurement.C41928e6.m169810h("pop", 0, r24);
        r0 = r22.mo136726A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x048a, code lost:
        if (r0 != 0) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x048f, code lost:
        r0 = r0 - 1;
        r1 = r9.mo136727H(r0);
        r9.mo136735e0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x049a, code lost:
        r1 = r21;
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169810h("map", 1, r0);
        r0 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04b3, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C42116p) == false) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04b9, code lost:
        if (r22.mo136726A() != 0) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04ce, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04cf, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169812j("lastIndexOf", 2, r0);
        r4 = com.google.android.gms.internal.measurement.C42133q.f106351H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04df, code lost:
        if (r24.isEmpty() != false) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04e1, code lost:
        r4 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04ec, code lost:
        r5 = r22.mo136726A() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04f7, code lost:
        if (r24.size() <= 1) goto L_0x0530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04f9, code lost:
        r0 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x050f, code lost:
        if (java.lang.Double.isNaN(r0.mo136743j().doubleValue()) == false) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0511, code lost:
        r5 = (double) (r22.mo136726A() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0519, code lost:
        r5 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r0.mo136743j().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0527, code lost:
        if (r5 >= 0.0d) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0529, code lost:
        r5 = r5 + ((double) r22.mo136726A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0530, code lost:
        r5 = (double) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0533, code lost:
        if (r5 >= 0.0d) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x053f, code lost:
        r0 = (int) java.lang.Math.min((double) r22.mo136726A(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0549, code lost:
        if (r0 < 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x054f, code lost:
        if (r9.mo136739h0(r0) == false) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0559, code lost:
        if (com.google.android.gms.internal.measurement.C41928e6.m169814l(r9.mo136727H(r0), r4) == false) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0567, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0574, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169812j("join", 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0582, code lost:
        if (r22.mo136726A() != 0) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x058b, code lost:
        if (r24.isEmpty() != false) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x058d, code lost:
        r0 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x059a, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C42099o) != false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x059e, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C42218v) == false) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05a1, code lost:
        r0 = r0.mo136744k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05a6, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05a9, code lost:
        r0 = ",";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05b6, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169812j("indexOf", 2, r0);
        r4 = com.google.android.gms.internal.measurement.C42133q.f106351H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05c6, code lost:
        if (r24.isEmpty() != false) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05c8, code lost:
        r4 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05d8, code lost:
        if (r24.size() <= 1) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05da, code lost:
        r5 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(1)).mo136743j().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05f7, code lost:
        if (r5 < ((double) r22.mo136726A())) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0605, code lost:
        if (r5 >= 0.0d) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0607, code lost:
        r1 = ((double) r22.mo136726A()) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x060f, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0610, code lost:
        r0 = r22.mo136730Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0618, code lost:
        if (r0.hasNext() == false) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x061a, code lost:
        r3 = ((java.lang.Integer) r0.next()).intValue();
        r5 = (double) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0627, code lost:
        if (r5 < r1) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0631, code lost:
        if (com.google.android.gms.internal.measurement.C41928e6.m169814l(r9.mo136727H(r3), r4) == false) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0647, code lost:
        r1 = r21;
        r9 = r22;
        r0 = r24;
        r3 = r23;
        com.google.android.gms.internal.measurement.C41928e6.m169810h("forEach", 1, r0);
        r0 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0661, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C42116p) == false) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0667, code lost:
        if (r22.mo136749y() != 0) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x066c, code lost:
        m169759b(r9, r3, (com.google.android.gms.internal.measurement.C42116p) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x067a, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x067b, code lost:
        r1 = r21;
        r9 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169810h(r20, 1, r0);
        r0 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0696, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C42116p) == false) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x069c, code lost:
        if (r22.mo136749y() != 0) goto L_0x06a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06a4, code lost:
        r1 = r22.mo136734e();
        r0 = m169759b(r9, r3, (com.google.android.gms.internal.measurement.C42116p) r0, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r2 = new com.google.android.gms.internal.measurement.C41939f();
        r0 = r0.mo136730Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06be, code lost:
        if (r0.hasNext() == false) goto L_0x06d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06c0, code lost:
        r2.mo136737f0(r2.mo136726A(), ((com.google.android.gms.internal.measurement.C41939f) r1).mo136727H(((java.lang.Integer) r0.next()).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06e0, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06e1, code lost:
        r1 = r21;
        r2 = r22;
        r3 = r23;
        r0 = r24;
        com.google.android.gms.internal.measurement.C41928e6.m169810h("every", 1, r0);
        r0 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06fa, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C42116p) == false) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0700, code lost:
        if (r22.mo136726A() != 0) goto L_0x0705;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0717, code lost:
        if (m169759b(r2, r3, (com.google.android.gms.internal.measurement.C42116p) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).mo136726A() == r22.mo136726A()) goto L_0x071c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0724, code lost:
        throw new java.lang.IllegalArgumentException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0725, code lost:
        r2 = r22;
        r3 = r23;
        r0 = r24;
        r1 = r22.mo136734e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0733, code lost:
        if (r24.isEmpty() != false) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0735, code lost:
        r0 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x073d, code lost:
        if (r0.hasNext() == false) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x073f, code lost:
        r2 = r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x074b, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.C41975h) != false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x074d, code lost:
        r4 = (com.google.android.gms.internal.measurement.C41939f) r1;
        r5 = r4.mo136726A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0756, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.C41939f) == false) goto L_0x077b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0758, code lost:
        r2 = (com.google.android.gms.internal.measurement.C41939f) r2;
        r6 = r2.mo136730Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0762, code lost:
        if (r6.hasNext() == false) goto L_0x0739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0764, code lost:
        r7 = (java.lang.Integer) r6.next();
        r4.mo136737f0(r7.intValue() + r5, r2.mo136727H(r7.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x077b, code lost:
        r4.mo136737f0(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0786, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0787, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        return new com.google.android.gms.internal.measurement.C41939f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106357N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106357N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106356M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return r22.mo136734e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106351H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106351H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        return m169759b(r9, r3, (com.google.android.gms.internal.measurement.C42116p) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        return new com.google.android.gms.internal.measurement.C41939f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf((double) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        return new com.google.android.gms.internal.measurement.C42201u(r9.mo136729M(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106358O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:?, code lost:
        return new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        return new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106351H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106351H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        return new com.google.android.gms.internal.measurement.C41939f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106356M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106356M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        return com.google.android.gms.internal.measurement.C42133q.f106357N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fb, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fd, code lost:
        r20 = "filter";
        r21 = "Callback should be a method";
        r1 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0107, code lost:
        switch(r0) {
            case 0: goto L_0x0725;
            case 1: goto L_0x06e1;
            case 2: goto L_0x067b;
            case 3: goto L_0x0647;
            case 4: goto L_0x05b6;
            case 5: goto L_0x0574;
            case 6: goto L_0x04cf;
            case 7: goto L_0x049a;
            case 8: goto L_0x047e;
            case 9: goto L_0x0447;
            case 10: goto L_0x043b;
            case 11: goto L_0x042f;
            case 12: goto L_0x03f7;
            case 13: goto L_0x03de;
            case 14: goto L_0x0359;
            case 15: goto L_0x02e1;
            case 16: goto L_0x0286;
            case 17: goto L_0x01b9;
            case 18: goto L_0x01a4;
            case 19: goto L_0x0112;
            default: goto L_0x010a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0111, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0116, code lost:
        if (r24.isEmpty() != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0118, code lost:
        r0 = new com.google.android.gms.internal.measurement.C41939f();
        r1 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0125, code lost:
        if (r1.hasNext() == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0127, code lost:
        r2 = r23.mo136673b((com.google.android.gms.internal.measurement.C42133q) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0135, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.C41975h) != false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0137, code lost:
        r0.mo136737f0(r0.mo136726A(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0146, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0147, code lost:
        r1 = r0.mo136726A();
        r2 = r22.mo136730Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0153, code lost:
        if (r2.hasNext() == false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0155, code lost:
        r3 = (java.lang.Integer) r2.next();
        r0.mo136737f0(r3.intValue() + r1, r22.mo136727H(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016e, code lost:
        r9 = r22;
        r22.mo136732X();
        r1 = r0.mo136730Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017b, code lost:
        if (r1.hasNext() == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017d, code lost:
        r2 = (java.lang.Integer) r1.next();
        r9.mo136737f0(r2.intValue(), r0.mo136727H(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0193, code lost:
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a3, code lost:
        return new com.google.android.gms.internal.measurement.C41993i(java.lang.Double.valueOf((double) r22.mo136726A()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a4, code lost:
        com.google.android.gms.internal.measurement.C41928e6.m169810h(r4, 0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b8, code lost:
        return new com.google.android.gms.internal.measurement.C42201u(r22.mo136729M(","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b9, code lost:
        r9 = r22;
        r3 = r23;
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c4, code lost:
        if (r24.isEmpty() == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cd, code lost:
        r1 = (int) com.google.android.gms.internal.measurement.C41928e6.m169803a(r3.mo136673b((com.google.android.gms.internal.measurement.C42133q) r0.get(0)).mo136743j().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e4, code lost:
        if (r1 >= 0) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e6, code lost:
        r1 = java.lang.Math.max(0, r1 + r22.mo136726A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f4, code lost:
        if (r1 <= r22.mo136726A()) goto L_0x01fa;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C42133q m169758a(java.lang.String r21, com.google.android.gms.internal.measurement.C41939f r22, com.google.android.gms.internal.measurement.C41909d5 r23, java.util.List r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            int r4 = r21.hashCode()
            java.lang.String r5 = "indexOf"
            java.lang.String r6 = "reverse"
            java.lang.String r7 = "slice"
            java.lang.String r8 = "shift"
            java.lang.String r9 = "every"
            java.lang.String r10 = "sort"
            java.lang.String r11 = "some"
            java.lang.String r12 = "join"
            java.lang.String r13 = "pop"
            java.lang.String r14 = "map"
            java.lang.String r15 = "lastIndexOf"
            java.lang.String r3 = "forEach"
            java.lang.String r1 = "filter"
            java.lang.String r2 = "toString"
            r16 = -1
            r17 = r2
            switch(r4) {
                case -1776922004: goto L_0x00f0;
                case -1354795244: goto L_0x00e4;
                case -1274492040: goto L_0x00da;
                case -934873754: goto L_0x00cd;
                case -895859076: goto L_0x00c2;
                case -678635926: goto L_0x00ba;
                case -467511597: goto L_0x00b2;
                case -277637751: goto L_0x00a7;
                case 107868: goto L_0x009f;
                case 111185: goto L_0x0096;
                case 3267882: goto L_0x008e;
                case 3452698: goto L_0x0083;
                case 3536116: goto L_0x007a;
                case 3536286: goto L_0x0071;
                case 96891675: goto L_0x0066;
                case 109407362: goto L_0x005c;
                case 109526418: goto L_0x0052;
                case 965561430: goto L_0x0046;
                case 1099846370: goto L_0x003c;
                case 1943291465: goto L_0x0033;
                default: goto L_0x002f;
            }
        L_0x002f:
            r4 = r17
            goto L_0x00fb
        L_0x0033:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x002f
            r0 = 4
            goto L_0x00d7
        L_0x003c:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x002f
            r0 = 12
            goto L_0x00d7
        L_0x0046:
            java.lang.String r4 = "reduceRight"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 11
            goto L_0x00d7
        L_0x0052:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x002f
            r0 = 14
            goto L_0x00d7
        L_0x005c:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x002f
            r0 = 13
            goto L_0x00d7
        L_0x0066:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 1
            goto L_0x00fd
        L_0x0071:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x002f
            r0 = 16
            goto L_0x00d7
        L_0x007a:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x002f
            r0 = 15
            goto L_0x00d7
        L_0x0083:
            java.lang.String r4 = "push"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 9
            goto L_0x00d7
        L_0x008e:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x002f
            r0 = 5
            goto L_0x00d7
        L_0x0096:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x002f
            r0 = 8
            goto L_0x00d7
        L_0x009f:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x002f
            r0 = 7
            goto L_0x00d7
        L_0x00a7:
            java.lang.String r4 = "unshift"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 19
            goto L_0x00d7
        L_0x00b2:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x002f
            r0 = 6
            goto L_0x00d7
        L_0x00ba:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002f
            r0 = 3
            goto L_0x00d7
        L_0x00c2:
            java.lang.String r4 = "splice"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 17
            goto L_0x00d7
        L_0x00cd:
            java.lang.String r4 = "reduce"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 10
        L_0x00d7:
            r4 = r17
            goto L_0x00fd
        L_0x00da:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 2
            goto L_0x00fd
        L_0x00e4:
            java.lang.String r4 = "concat"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x002f
            r4 = r17
            r0 = 0
            goto L_0x00fd
        L_0x00f0:
            r4 = r17
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00fb
            r0 = 18
            goto L_0x00fd
        L_0x00fb:
            r0 = r16
        L_0x00fd:
            r18 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r2 = "Callback should be a method"
            r20 = r1
            r21 = r2
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0725;
                case 1: goto L_0x06e1;
                case 2: goto L_0x067b;
                case 3: goto L_0x0647;
                case 4: goto L_0x05b6;
                case 5: goto L_0x0574;
                case 6: goto L_0x04cf;
                case 7: goto L_0x049a;
                case 8: goto L_0x047e;
                case 9: goto L_0x0447;
                case 10: goto L_0x043b;
                case 11: goto L_0x042f;
                case 12: goto L_0x03f7;
                case 13: goto L_0x03de;
                case 14: goto L_0x0359;
                case 15: goto L_0x02e1;
                case 16: goto L_0x0286;
                case 17: goto L_0x01b9;
                case 18: goto L_0x01a4;
                case 19: goto L_0x0112;
                default: goto L_0x010a;
            }
        L_0x010a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0112:
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x0193
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            java.util.Iterator r1 = r24.iterator()
        L_0x0121:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0147
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.q r2 = (com.google.android.gms.internal.measurement.C42133q) r2
            r3 = r23
            com.google.android.gms.internal.measurement.q r2 = r3.mo136673b(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.C41975h
            if (r4 != 0) goto L_0x013f
            int r4 = r0.mo136726A()
            r0.mo136737f0(r4, r2)
            goto L_0x0121
        L_0x013f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x0147:
            int r1 = r0.mo136726A()
            java.util.Iterator r2 = r22.mo136730Q()
        L_0x014f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x016e
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r9 = r22
            com.google.android.gms.internal.measurement.q r3 = r9.mo136727H(r3)
            r0.mo136737f0(r4, r3)
            goto L_0x014f
        L_0x016e:
            r9 = r22
            r22.mo136732X()
            java.util.Iterator r1 = r0.mo136730Q()
        L_0x0177:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0195
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            com.google.android.gms.internal.measurement.q r2 = r0.mo136727H(r2)
            r9.mo136737f0(r3, r2)
            goto L_0x0177
        L_0x0193:
            r9 = r22
        L_0x0195:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            int r1 = r22.mo136726A()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x01a4:
            r9 = r22
            r0 = r24
            r1 = r4
            r2 = 0
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r1, r2, r0)
            com.google.android.gms.internal.measurement.u r0 = new com.google.android.gms.internal.measurement.u
            java.lang.String r1 = ","
            java.lang.String r1 = r9.mo136729M(r1)
            r0.<init>(r1)
            return r0
        L_0x01b9:
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = 0
            boolean r1 = r24.isEmpty()
            if (r1 == 0) goto L_0x01cd
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x0285
        L_0x01cd:
            java.lang.Object r1 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C42133q) r1
            com.google.android.gms.internal.measurement.q r1 = r3.mo136673b(r1)
            java.lang.Double r1 = r1.mo136743j()
            double r4 = r1.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r4)
            int r1 = (int) r4
            if (r1 >= 0) goto L_0x01f0
            int r4 = r22.mo136726A()
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            goto L_0x01fa
        L_0x01f0:
            int r2 = r22.mo136726A()
            if (r1 <= r2) goto L_0x01fa
            int r1 = r22.mo136726A()
        L_0x01fa:
            int r2 = r22.mo136726A()
            com.google.android.gms.internal.measurement.f r4 = new com.google.android.gms.internal.measurement.f
            r4.<init>()
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0270
            java.lang.Object r5 = r0.get(r6)
            com.google.android.gms.internal.measurement.q r5 = (com.google.android.gms.internal.measurement.C42133q) r5
            com.google.android.gms.internal.measurement.q r5 = r3.mo136673b(r5)
            java.lang.Double r5 = r5.mo136743j()
            double r5 = r5.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r5)
            int r5 = (int) r5
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            if (r5 <= 0) goto L_0x0242
            r6 = r1
        L_0x0229:
            int r7 = r1 + r5
            int r7 = java.lang.Math.min(r2, r7)
            if (r6 >= r7) goto L_0x0242
            com.google.android.gms.internal.measurement.q r7 = r9.mo136727H(r1)
            int r8 = r4.mo136726A()
            r4.mo136737f0(r8, r7)
            r9.mo136735e0(r1)
            int r6 = r6 + 1
            goto L_0x0229
        L_0x0242:
            int r2 = r24.size()
            r5 = 2
            if (r2 <= r5) goto L_0x0284
            r2 = 2
        L_0x024a:
            int r5 = r24.size()
            if (r2 >= r5) goto L_0x0284
            java.lang.Object r5 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r5 = (com.google.android.gms.internal.measurement.C42133q) r5
            com.google.android.gms.internal.measurement.q r5 = r3.mo136673b(r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C41975h
            if (r6 != 0) goto L_0x0268
            int r6 = r1 + r2
            int r6 = r6 + -2
            r9.mo136733Y(r6, r5)
            int r2 = r2 + 1
            goto L_0x024a
        L_0x0268:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x0270:
            if (r1 >= r2) goto L_0x0284
            com.google.android.gms.internal.measurement.q r0 = r9.mo136727H(r1)
            int r3 = r4.mo136726A()
            r4.mo136737f0(r3, r0)
            r0 = 0
            r9.mo136737f0(r1, r0)
            int r1 = r1 + 1
            goto L_0x0270
        L_0x0284:
            r0 = r4
        L_0x0285:
            return r0
        L_0x0286:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.C41928e6.m169812j(r10, r1, r0)
            int r1 = r22.mo136726A()
            r2 = 2
            if (r1 >= r2) goto L_0x0298
            goto L_0x02e0
        L_0x0298:
            java.util.List r1 = r22.mo136731W()
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x02bc
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C42011j
            if (r2 == 0) goto L_0x02b4
            com.google.android.gms.internal.measurement.j r0 = (com.google.android.gms.internal.measurement.C42011j) r0
            goto L_0x02bd
        L_0x02b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x02bc:
            r0 = 0
        L_0x02bd:
            com.google.android.gms.internal.measurement.c0 r2 = new com.google.android.gms.internal.measurement.c0
            r2.<init>(r0, r3)
            java.util.Collections.sort(r1, r2)
            r22.mo136732X()
            java.util.Iterator r0 = r1.iterator()
            r2 = 0
        L_0x02cd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02e0
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C42133q) r1
            int r3 = r2 + 1
            r9.mo136737f0(r2, r1)
            r2 = r3
            goto L_0x02cd
        L_0x02e0:
            return r9
        L_0x02e1:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r11, r1, r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C42011j
            if (r1 == 0) goto L_0x0351
            int r1 = r22.mo136726A()
            if (r1 != 0) goto L_0x0303
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106357N
            goto L_0x0350
        L_0x0303:
            com.google.android.gms.internal.measurement.j r0 = (com.google.android.gms.internal.measurement.C42011j) r0
            java.util.Iterator r1 = r22.mo136730Q()
        L_0x0309:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x034e
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r9.mo136739h0(r2)
            if (r4 == 0) goto L_0x0309
            r4 = 3
            com.google.android.gms.internal.measurement.q[] r4 = new com.google.android.gms.internal.measurement.C42133q[r4]
            com.google.android.gms.internal.measurement.q r5 = r9.mo136727H(r2)
            r6 = 0
            r4[r6] = r5
            double r5 = (double) r2
            com.google.android.gms.internal.measurement.i r2 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r2.<init>(r5)
            r5 = 1
            r4[r5] = r2
            r2 = 2
            r4[r2] = r9
            java.util.List r2 = java.util.Arrays.asList(r4)
            com.google.android.gms.internal.measurement.q r2 = r0.mo136725a(r3, r2)
            java.lang.Boolean r2 = r2.mo136738h()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0309
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106356M
            goto L_0x0350
        L_0x034e:
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106357N
        L_0x0350:
            return r0
        L_0x0351:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r21
            r0.<init>(r1)
            throw r0
        L_0x0359:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.C41928e6.m169812j(r7, r4, r0)
            boolean r4 = r24.isEmpty()
            if (r4 == 0) goto L_0x036e
            com.google.android.gms.internal.measurement.q r0 = r22.mo136734e()
            goto L_0x03dd
        L_0x036e:
            int r4 = r22.mo136726A()
            double r4 = (double) r4
            r6 = 0
            java.lang.Object r6 = r0.get(r6)
            com.google.android.gms.internal.measurement.q r6 = (com.google.android.gms.internal.measurement.C42133q) r6
            com.google.android.gms.internal.measurement.q r6 = r3.mo136673b(r6)
            java.lang.Double r6 = r6.mo136743j()
            double r6 = r6.doubleValue()
            double r6 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r6)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x0394
            double r6 = r6 + r4
            double r6 = java.lang.Math.max(r6, r1)
            goto L_0x0398
        L_0x0394:
            double r6 = java.lang.Math.min(r6, r4)
        L_0x0398:
            int r8 = r24.size()
            r10 = 2
            if (r8 != r10) goto L_0x03c4
            r8 = 1
            java.lang.Object r0 = r0.get(r8)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            java.lang.Double r0 = r0.mo136743j()
            double r10 = r0.doubleValue()
            double r10 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r10)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c0
            double r4 = r4 + r10
            double r4 = java.lang.Math.max(r4, r1)
            goto L_0x03c4
        L_0x03c0:
            double r4 = java.lang.Math.min(r4, r10)
        L_0x03c4:
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            int r1 = (int) r6
        L_0x03ca:
            double r2 = (double) r1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x03dd
            com.google.android.gms.internal.measurement.q r2 = r9.mo136727H(r1)
            int r3 = r0.mo136726A()
            r0.mo136737f0(r3, r2)
            int r1 = r1 + 1
            goto L_0x03ca
        L_0x03dd:
            return r0
        L_0x03de:
            r9 = r22
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r8, r1, r0)
            int r0 = r22.mo136726A()
            if (r0 != 0) goto L_0x03ef
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106351H
            goto L_0x03f6
        L_0x03ef:
            com.google.android.gms.internal.measurement.q r0 = r9.mo136727H(r1)
            r9.mo136735e0(r1)
        L_0x03f6:
            return r0
        L_0x03f7:
            r9 = r22
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r6, r1, r0)
            int r0 = r22.mo136726A()
            if (r0 == 0) goto L_0x042e
            r2 = 0
        L_0x0406:
            int r1 = r0 / 2
            if (r2 >= r1) goto L_0x042e
            boolean r1 = r9.mo136739h0(r2)
            if (r1 == 0) goto L_0x042b
            com.google.android.gms.internal.measurement.q r1 = r9.mo136727H(r2)
            r3 = 0
            r9.mo136737f0(r2, r3)
            int r3 = r0 + -1
            int r3 = r3 - r2
            boolean r4 = r9.mo136739h0(r3)
            if (r4 == 0) goto L_0x0428
            com.google.android.gms.internal.measurement.q r4 = r9.mo136727H(r3)
            r9.mo136737f0(r2, r4)
        L_0x0428:
            r9.mo136737f0(r3, r1)
        L_0x042b:
            int r2 = r2 + 1
            goto L_0x0406
        L_0x042e:
            return r9
        L_0x042f:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 0
            com.google.android.gms.internal.measurement.q r0 = m169760c(r9, r3, r0, r1)
            return r0
        L_0x043b:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.q r0 = m169760c(r9, r3, r0, r1)
            return r0
        L_0x0447:
            r9 = r22
            r3 = r23
            r0 = r24
            boolean r1 = r24.isEmpty()
            if (r1 != 0) goto L_0x046f
            java.util.Iterator r0 = r24.iterator()
        L_0x0457:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x046f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.q r1 = (com.google.android.gms.internal.measurement.C42133q) r1
            com.google.android.gms.internal.measurement.q r1 = r3.mo136673b(r1)
            int r2 = r22.mo136726A()
            r9.mo136737f0(r2, r1)
            goto L_0x0457
        L_0x046f:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            int r1 = r22.mo136726A()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return r0
        L_0x047e:
            r9 = r22
            r0 = r24
            r2 = 0
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r13, r2, r0)
            int r0 = r22.mo136726A()
            if (r0 != 0) goto L_0x048f
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106351H
            goto L_0x0499
        L_0x048f:
            int r0 = r0 + -1
            com.google.android.gms.internal.measurement.q r1 = r9.mo136727H(r0)
            r9.mo136735e0(r0)
            r0 = r1
        L_0x0499:
            return r0
        L_0x049a:
            r1 = r21
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = 0
            r4 = 1
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r14, r4, r0)
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C42116p
            if (r2 == 0) goto L_0x04c9
            int r1 = r22.mo136726A()
            if (r1 != 0) goto L_0x04c1
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x04c8
        L_0x04c1:
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C42116p) r0
            r1 = 0
            com.google.android.gms.internal.measurement.f r0 = m169759b(r9, r3, r0, r1, r1)
        L_0x04c8:
            return r0
        L_0x04c9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04cf:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.C41928e6.m169812j(r15, r4, r0)
            com.google.android.gms.internal.measurement.q r4 = com.google.android.gms.internal.measurement.C42133q.f106351H
            boolean r5 = r24.isEmpty()
            if (r5 != 0) goto L_0x04ec
            r5 = 0
            java.lang.Object r4 = r0.get(r5)
            com.google.android.gms.internal.measurement.q r4 = (com.google.android.gms.internal.measurement.C42133q) r4
            com.google.android.gms.internal.measurement.q r4 = r3.mo136673b(r4)
        L_0x04ec:
            int r5 = r22.mo136726A()
            int r5 = r5 + -1
            int r6 = r24.size()
            r7 = 1
            if (r6 <= r7) goto L_0x0530
            java.lang.Object r0 = r0.get(r7)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            java.lang.Double r3 = r0.mo136743j()
            double r5 = r3.doubleValue()
            boolean r3 = java.lang.Double.isNaN(r5)
            if (r3 == 0) goto L_0x0519
            int r0 = r22.mo136726A()
            int r0 = r0 + -1
            double r5 = (double) r0
            goto L_0x0525
        L_0x0519:
            java.lang.Double r0 = r0.mo136743j()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r5)
        L_0x0525:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0531
            int r0 = r22.mo136726A()
            double r7 = (double) r0
            double r5 = r5 + r7
            goto L_0x0531
        L_0x0530:
            double r5 = (double) r5
        L_0x0531:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x053f
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x0573
        L_0x053f:
            int r0 = r22.mo136726A()
            double r0 = (double) r0
            double r0 = java.lang.Math.min(r0, r5)
            int r0 = (int) r0
        L_0x0549:
            if (r0 < 0) goto L_0x056a
            boolean r1 = r9.mo136739h0(r0)
            if (r1 == 0) goto L_0x0567
            com.google.android.gms.internal.measurement.q r1 = r9.mo136727H(r0)
            boolean r1 = com.google.android.gms.internal.measurement.C41928e6.m169814l(r1, r4)
            if (r1 == 0) goto L_0x0567
            double r0 = (double) r0
            com.google.android.gms.internal.measurement.i r2 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.<init>(r0)
            r0 = r2
            goto L_0x0573
        L_0x0567:
            int r0 = r0 + -1
            goto L_0x0549
        L_0x056a:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
        L_0x0573:
            return r0
        L_0x0574:
            r9 = r22
            r3 = r23
            r0 = r24
            r1 = 1
            com.google.android.gms.internal.measurement.C41928e6.m169812j(r12, r1, r0)
            int r1 = r22.mo136726A()
            if (r1 != 0) goto L_0x0587
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106358O
            goto L_0x05b5
        L_0x0587:
            boolean r1 = r24.isEmpty()
            if (r1 != 0) goto L_0x05a9
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C42099o
            if (r1 != 0) goto L_0x05a6
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C42218v
            if (r1 == 0) goto L_0x05a1
            goto L_0x05a6
        L_0x05a1:
            java.lang.String r0 = r0.mo136744k()
            goto L_0x05ab
        L_0x05a6:
            java.lang.String r0 = ""
            goto L_0x05ab
        L_0x05a9:
            java.lang.String r0 = ","
        L_0x05ab:
            com.google.android.gms.internal.measurement.u r1 = new com.google.android.gms.internal.measurement.u
            java.lang.String r0 = r9.mo136729M(r0)
            r1.<init>(r0)
            r0 = r1
        L_0x05b5:
            return r0
        L_0x05b6:
            r9 = r22
            r3 = r23
            r0 = r24
            r4 = 2
            com.google.android.gms.internal.measurement.C41928e6.m169812j(r5, r4, r0)
            com.google.android.gms.internal.measurement.q r4 = com.google.android.gms.internal.measurement.C42133q.f106351H
            boolean r5 = r24.isEmpty()
            if (r5 != 0) goto L_0x05d3
            r5 = 0
            java.lang.Object r4 = r0.get(r5)
            com.google.android.gms.internal.measurement.q r4 = (com.google.android.gms.internal.measurement.C42133q) r4
            com.google.android.gms.internal.measurement.q r4 = r3.mo136673b(r4)
        L_0x05d3:
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0610
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            java.lang.Double r0 = r0.mo136743j()
            double r5 = r0.doubleValue()
            double r5 = com.google.android.gms.internal.measurement.C41928e6.m169803a(r5)
            int r0 = r22.mo136726A()
            double r7 = (double) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0603
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x0646
        L_0x0603:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x060f
            int r0 = r22.mo136726A()
            double r0 = (double) r0
            double r1 = r0 + r5
            goto L_0x0610
        L_0x060f:
            r1 = r5
        L_0x0610:
            java.util.Iterator r0 = r22.mo136730Q()
        L_0x0614:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x063d
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            double r5 = (double) r3
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x0614
            com.google.android.gms.internal.measurement.q r3 = r9.mo136727H(r3)
            boolean r3 = com.google.android.gms.internal.measurement.C41928e6.m169814l(r3, r4)
            if (r3 == 0) goto L_0x0614
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.<init>(r1)
            goto L_0x0646
        L_0x063d:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
        L_0x0646:
            return r0
        L_0x0647:
            r1 = r21
            r9 = r22
            r0 = r24
            r2 = r3
            r4 = 1
            r3 = r23
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r2, r4, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C42116p
            if (r2 == 0) goto L_0x0675
            int r1 = r22.mo136749y()
            if (r1 != 0) goto L_0x066c
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106351H
            goto L_0x0674
        L_0x066c:
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C42116p) r0
            r1 = 0
            m169759b(r9, r3, r0, r1, r1)
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106351H
        L_0x0674:
            return r0
        L_0x0675:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x067b:
            r1 = r21
            r9 = r22
            r3 = r23
            r0 = r24
            r2 = r20
            r4 = 1
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r2, r4, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C42116p
            if (r2 == 0) goto L_0x06db
            int r1 = r22.mo136749y()
            if (r1 != 0) goto L_0x06a4
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x06da
        L_0x06a4:
            com.google.android.gms.internal.measurement.q r1 = r22.mo136734e()
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C42116p) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4 = 0
            com.google.android.gms.internal.measurement.f r0 = m169759b(r9, r3, r0, r4, r2)
            com.google.android.gms.internal.measurement.f r2 = new com.google.android.gms.internal.measurement.f
            r2.<init>()
            java.util.Iterator r0 = r0.mo136730Q()
        L_0x06ba:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06d9
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r1
            com.google.android.gms.internal.measurement.f r4 = (com.google.android.gms.internal.measurement.C41939f) r4
            com.google.android.gms.internal.measurement.q r3 = r4.mo136727H(r3)
            int r4 = r2.mo136726A()
            r2.mo136737f0(r4, r3)
            goto L_0x06ba
        L_0x06d9:
            r0 = r2
        L_0x06da:
            return r0
        L_0x06db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x06e1:
            r1 = r21
            r2 = r22
            r3 = r23
            r0 = r24
            r4 = 1
            com.google.android.gms.internal.measurement.C41928e6.m169810h(r9, r4, r0)
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.q r0 = (com.google.android.gms.internal.measurement.C42133q) r0
            com.google.android.gms.internal.measurement.q r0 = r3.mo136673b(r0)
            boolean r4 = r0 instanceof com.google.android.gms.internal.measurement.C42116p
            if (r4 == 0) goto L_0x071f
            int r1 = r22.mo136726A()
            if (r1 != 0) goto L_0x0705
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106356M
            goto L_0x071e
        L_0x0705:
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C42116p) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.measurement.f r0 = m169759b(r2, r3, r0, r1, r4)
            int r0 = r0.mo136726A()
            int r1 = r22.mo136726A()
            if (r0 == r1) goto L_0x071c
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106357N
            goto L_0x071e
        L_0x071c:
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.C42133q.f106356M
        L_0x071e:
            return r0
        L_0x071f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0725:
            r2 = r22
            r3 = r23
            r0 = r24
            com.google.android.gms.internal.measurement.q r1 = r22.mo136734e()
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x0787
            java.util.Iterator r0 = r24.iterator()
        L_0x0739:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0787
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.q r2 = (com.google.android.gms.internal.measurement.C42133q) r2
            com.google.android.gms.internal.measurement.q r2 = r3.mo136673b(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.C41975h
            if (r4 != 0) goto L_0x077f
            r4 = r1
            com.google.android.gms.internal.measurement.f r4 = (com.google.android.gms.internal.measurement.C41939f) r4
            int r5 = r4.mo136726A()
            boolean r6 = r2 instanceof com.google.android.gms.internal.measurement.C41939f
            if (r6 == 0) goto L_0x077b
            com.google.android.gms.internal.measurement.f r2 = (com.google.android.gms.internal.measurement.C41939f) r2
            java.util.Iterator r6 = r2.mo136730Q()
        L_0x075e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0739
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            int r8 = r8 + r5
            int r7 = r7.intValue()
            com.google.android.gms.internal.measurement.q r7 = r2.mo136727H(r7)
            r4.mo136737f0(r8, r7)
            goto L_0x075e
        L_0x077b:
            r4.mo136737f0(r5, r2)
            goto L_0x0739
        L_0x077f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x0787:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41904d0.m169758a(java.lang.String, com.google.android.gms.internal.measurement.f, com.google.android.gms.internal.measurement.d5, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    /* renamed from: b */
    public static C41939f m169759b(C41939f fVar, C41909d5 d5Var, C42011j jVar, Boolean bool, Boolean bool2) {
        C41939f fVar2 = new C41939f();
        Iterator Q = fVar.mo136730Q();
        while (Q.hasNext()) {
            int intValue = ((Integer) Q.next()).intValue();
            if (fVar.mo136739h0(intValue)) {
                C42133q a = jVar.mo136725a(d5Var, Arrays.asList(new C42133q[]{fVar.mo136727H(intValue), new C41993i(Double.valueOf((double) intValue)), fVar}));
                if (a.mo136738h().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || a.mo136738h().equals(bool2)) {
                    fVar2.mo136737f0(intValue, a);
                }
            }
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C42133q m169760c(com.google.android.gms.internal.measurement.C41939f r9, com.google.android.gms.internal.measurement.C41909d5 r10, java.util.List r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.android.gms.internal.measurement.C41928e6.m169811i(r0, r1, r11)
            r2 = 2
            com.google.android.gms.internal.measurement.C41928e6.m169812j(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.android.gms.internal.measurement.q r3 = (com.google.android.gms.internal.measurement.C42133q) r3
            com.google.android.gms.internal.measurement.q r3 = r10.mo136673b(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C42011j
            if (r4 == 0) goto L_0x009d
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            com.google.android.gms.internal.measurement.q r11 = (com.google.android.gms.internal.measurement.C42133q) r11
            com.google.android.gms.internal.measurement.q r11 = r10.mo136673b(r11)
            boolean r4 = r11 instanceof com.google.android.gms.internal.measurement.C41975h
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.mo136726A()
            if (r11 == 0) goto L_0x0095
            r11 = 0
        L_0x003d:
            com.google.android.gms.internal.measurement.j r3 = (com.google.android.gms.internal.measurement.C42011j) r3
            int r4 = r9.mo136726A()
            if (r12 == 0) goto L_0x0047
            r5 = r0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = r0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = r1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.q r11 = r9.mo136727H(r5)
        L_0x0059:
            int r5 = r5 + r6
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0094
            boolean r12 = r9.mo136739h0(r5)
            if (r12 == 0) goto L_0x0059
            r12 = 4
            com.google.android.gms.internal.measurement.q[] r12 = new com.google.android.gms.internal.measurement.C42133q[r12]
            r12[r0] = r11
            com.google.android.gms.internal.measurement.q r11 = r9.mo136727H(r5)
            r12[r1] = r11
            double r7 = (double) r5
            com.google.android.gms.internal.measurement.i r11 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            com.google.android.gms.internal.measurement.q r11 = r3.mo136725a(r10, r11)
            boolean r12 = r11 instanceof com.google.android.gms.internal.measurement.C41975h
            if (r12 != 0) goto L_0x008c
            goto L_0x0059
        L_0x008c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0094:
            return r11
        L_0x0095:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x009d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41904d0.m169760c(com.google.android.gms.internal.measurement.f, com.google.android.gms.internal.measurement.d5, java.util.List, boolean):com.google.android.gms.internal.measurement.q");
    }
}
