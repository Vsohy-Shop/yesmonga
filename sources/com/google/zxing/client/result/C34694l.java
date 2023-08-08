package com.google.zxing.client.result;

/* renamed from: com.google.zxing.client.result.l */
public final class C34694l extends C34702t {
    /* renamed from: q */
    public static String m141505q(int i, String str) {
        if (str.charAt(i) != '(') {
            return null;
        }
        String substring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == ')') {
                return sb.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static String m141506r(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == '(') {
                if (m141505q(i2, substring) != null) {
                    break;
                }
                sb.append('(');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020b, code lost:
        if (r1.equals(com.carrefour.fid.android.shared.constant.C28561l1.f69523p) == false) goto L_0x004f;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.client.result.C34693k mo102518k(com.google.zxing.C34761k r24) {
        /*
            r23 = this;
            com.google.zxing.BarcodeFormat r0 = r24.mo102873b()
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.RSS_EXPANDED
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r4 = com.google.zxing.client.result.C34702t.m141532c(r24)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r3 = 0
        L_0x0023:
            int r1 = r4.length()
            if (r3 >= r1) goto L_0x027d
            java.lang.String r1 = m141505q(r3, r4)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            int r18 = r1.length()
            r19 = 2
            int r18 = r18 + 2
            int r3 = r3 + r18
            java.lang.String r2 = m141506r(r3, r4)
            int r20 = r2.length()
            int r3 = r3 + r20
            int r20 = r1.hashCode()
            r21 = r3
            r22 = -1
            switch(r20) {
                case 1536: goto L_0x021c;
                case 1537: goto L_0x020f;
                case 1567: goto L_0x0205;
                case 1568: goto L_0x01f8;
                case 1570: goto L_0x01eb;
                case 1572: goto L_0x01de;
                case 1574: goto L_0x01d1;
                case 1567966: goto L_0x01c4;
                case 1567967: goto L_0x01b6;
                case 1567968: goto L_0x01a8;
                case 1567969: goto L_0x019a;
                case 1567970: goto L_0x018c;
                case 1567971: goto L_0x017e;
                case 1567972: goto L_0x0170;
                case 1567973: goto L_0x0162;
                case 1567974: goto L_0x0154;
                case 1567975: goto L_0x0146;
                case 1568927: goto L_0x0138;
                case 1568928: goto L_0x012a;
                case 1568929: goto L_0x011c;
                case 1568930: goto L_0x010e;
                case 1568931: goto L_0x0100;
                case 1568932: goto L_0x00f2;
                case 1568933: goto L_0x00e4;
                case 1568934: goto L_0x00d6;
                case 1568935: goto L_0x00c8;
                case 1568936: goto L_0x00bb;
                case 1575716: goto L_0x00ae;
                case 1575717: goto L_0x00a1;
                case 1575718: goto L_0x0094;
                case 1575719: goto L_0x0087;
                case 1575747: goto L_0x007a;
                case 1575748: goto L_0x006d;
                case 1575749: goto L_0x0060;
                case 1575750: goto L_0x0053;
                default: goto L_0x004f;
            }
        L_0x004f:
            r19 = r22
            goto L_0x0228
        L_0x0053:
            java.lang.String r3 = "3933"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005c
            goto L_0x004f
        L_0x005c:
            r19 = 34
            goto L_0x0228
        L_0x0060:
            java.lang.String r3 = "3932"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0069
            goto L_0x004f
        L_0x0069:
            r19 = 33
            goto L_0x0228
        L_0x006d:
            java.lang.String r3 = "3931"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0076
            goto L_0x004f
        L_0x0076:
            r19 = 32
            goto L_0x0228
        L_0x007a:
            java.lang.String r3 = "3930"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0083
            goto L_0x004f
        L_0x0083:
            r19 = 31
            goto L_0x0228
        L_0x0087:
            java.lang.String r3 = "3923"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0090
            goto L_0x004f
        L_0x0090:
            r19 = 30
            goto L_0x0228
        L_0x0094:
            java.lang.String r3 = "3922"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x009d
            goto L_0x004f
        L_0x009d:
            r19 = 29
            goto L_0x0228
        L_0x00a1:
            java.lang.String r3 = "3921"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00aa
            goto L_0x004f
        L_0x00aa:
            r19 = 28
            goto L_0x0228
        L_0x00ae:
            java.lang.String r3 = "3920"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00b7
            goto L_0x004f
        L_0x00b7:
            r19 = 27
            goto L_0x0228
        L_0x00bb:
            java.lang.String r3 = "3209"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00c4
            goto L_0x004f
        L_0x00c4:
            r19 = 26
            goto L_0x0228
        L_0x00c8:
            java.lang.String r3 = "3208"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00d2
            goto L_0x004f
        L_0x00d2:
            r19 = 25
            goto L_0x0228
        L_0x00d6:
            java.lang.String r3 = "3207"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00e0
            goto L_0x004f
        L_0x00e0:
            r19 = 24
            goto L_0x0228
        L_0x00e4:
            java.lang.String r3 = "3206"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00ee
            goto L_0x004f
        L_0x00ee:
            r19 = 23
            goto L_0x0228
        L_0x00f2:
            java.lang.String r3 = "3205"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x00fc
            goto L_0x004f
        L_0x00fc:
            r19 = 22
            goto L_0x0228
        L_0x0100:
            java.lang.String r3 = "3204"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x010a
            goto L_0x004f
        L_0x010a:
            r19 = 21
            goto L_0x0228
        L_0x010e:
            java.lang.String r3 = "3203"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0118
            goto L_0x004f
        L_0x0118:
            r19 = 20
            goto L_0x0228
        L_0x011c:
            java.lang.String r3 = "3202"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0126
            goto L_0x004f
        L_0x0126:
            r19 = 19
            goto L_0x0228
        L_0x012a:
            java.lang.String r3 = "3201"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0134
            goto L_0x004f
        L_0x0134:
            r19 = 18
            goto L_0x0228
        L_0x0138:
            java.lang.String r3 = "3200"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0142
            goto L_0x004f
        L_0x0142:
            r19 = 17
            goto L_0x0228
        L_0x0146:
            java.lang.String r3 = "3109"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0150
            goto L_0x004f
        L_0x0150:
            r19 = 16
            goto L_0x0228
        L_0x0154:
            java.lang.String r3 = "3108"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x015e
            goto L_0x004f
        L_0x015e:
            r19 = 15
            goto L_0x0228
        L_0x0162:
            java.lang.String r3 = "3107"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x016c
            goto L_0x004f
        L_0x016c:
            r19 = 14
            goto L_0x0228
        L_0x0170:
            java.lang.String r3 = "3106"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x017a
            goto L_0x004f
        L_0x017a:
            r19 = 13
            goto L_0x0228
        L_0x017e:
            java.lang.String r3 = "3105"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0188
            goto L_0x004f
        L_0x0188:
            r19 = 12
            goto L_0x0228
        L_0x018c:
            java.lang.String r3 = "3104"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0196
            goto L_0x004f
        L_0x0196:
            r19 = 11
            goto L_0x0228
        L_0x019a:
            java.lang.String r3 = "3103"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01a4
            goto L_0x004f
        L_0x01a4:
            r19 = 10
            goto L_0x0228
        L_0x01a8:
            java.lang.String r3 = "3102"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01b2
            goto L_0x004f
        L_0x01b2:
            r19 = 9
            goto L_0x0228
        L_0x01b6:
            java.lang.String r3 = "3101"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01c0
            goto L_0x004f
        L_0x01c0:
            r19 = 8
            goto L_0x0228
        L_0x01c4:
            java.lang.String r3 = "3100"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01ce
            goto L_0x004f
        L_0x01ce:
            r19 = 7
            goto L_0x0228
        L_0x01d1:
            java.lang.String r3 = "17"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01db
            goto L_0x004f
        L_0x01db:
            r19 = 6
            goto L_0x0228
        L_0x01de:
            java.lang.String r3 = "15"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01e8
            goto L_0x004f
        L_0x01e8:
            r19 = 5
            goto L_0x0228
        L_0x01eb:
            java.lang.String r3 = "13"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x01f5
            goto L_0x004f
        L_0x01f5:
            r19 = 4
            goto L_0x0228
        L_0x01f8:
            java.lang.String r3 = "11"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0202
            goto L_0x004f
        L_0x0202:
            r19 = 3
            goto L_0x0228
        L_0x0205:
            java.lang.String r3 = "10"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0228
            goto L_0x004f
        L_0x020f:
            java.lang.String r3 = "01"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0219
            goto L_0x004f
        L_0x0219:
            r19 = 1
            goto L_0x0228
        L_0x021c:
            java.lang.String r3 = "00"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0226
            goto L_0x004f
        L_0x0226:
            r19 = 0
        L_0x0228:
            switch(r19) {
                case 0: goto L_0x0277;
                case 1: goto L_0x0275;
                case 2: goto L_0x0273;
                case 3: goto L_0x0271;
                case 4: goto L_0x026f;
                case 5: goto L_0x026d;
                case 6: goto L_0x026b;
                case 7: goto L_0x0261;
                case 8: goto L_0x0261;
                case 9: goto L_0x0261;
                case 10: goto L_0x0261;
                case 11: goto L_0x0261;
                case 12: goto L_0x0261;
                case 13: goto L_0x0261;
                case 14: goto L_0x0261;
                case 15: goto L_0x0261;
                case 16: goto L_0x0261;
                case 17: goto L_0x0258;
                case 18: goto L_0x0258;
                case 19: goto L_0x0258;
                case 20: goto L_0x0258;
                case 21: goto L_0x0258;
                case 22: goto L_0x0258;
                case 23: goto L_0x0258;
                case 24: goto L_0x0258;
                case 25: goto L_0x0258;
                case 26: goto L_0x0258;
                case 27: goto L_0x0250;
                case 28: goto L_0x0250;
                case 29: goto L_0x0250;
                case 30: goto L_0x0250;
                case 31: goto L_0x022f;
                case 32: goto L_0x022f;
                case 33: goto L_0x022f;
                case 34: goto L_0x022f;
                default: goto L_0x022b;
            }
        L_0x022b:
            r0.put(r1, r2)
            goto L_0x0278
        L_0x022f:
            int r3 = r2.length()
            r15 = 4
            if (r3 >= r15) goto L_0x0238
            r3 = 0
            return r3
        L_0x0238:
            r3 = 0
            r15 = 3
            java.lang.String r16 = r2.substring(r15)
            r3 = 0
            java.lang.String r17 = r2.substring(r3, r15)
            java.lang.String r1 = r1.substring(r15)
            r15 = r16
            r3 = r21
            r2 = 0
            r16 = r1
            goto L_0x0023
        L_0x0250:
            r3 = 0
            r15 = 3
            java.lang.String r16 = r1.substring(r15)
            r15 = r2
            goto L_0x0278
        L_0x0258:
            r3 = 0
            r12 = 3
            java.lang.String r14 = r1.substring(r12)
            java.lang.String r13 = "LB"
            goto L_0x0269
        L_0x0261:
            r3 = 0
            r12 = 3
            java.lang.String r14 = r1.substring(r12)
            java.lang.String r13 = "KG"
        L_0x0269:
            r12 = r2
            goto L_0x0278
        L_0x026b:
            r11 = r2
            goto L_0x0278
        L_0x026d:
            r10 = r2
            goto L_0x0278
        L_0x026f:
            r9 = r2
            goto L_0x0278
        L_0x0271:
            r8 = r2
            goto L_0x0278
        L_0x0273:
            r7 = r2
            goto L_0x0278
        L_0x0275:
            r5 = r2
            goto L_0x0278
        L_0x0277:
            r6 = r2
        L_0x0278:
            r3 = r21
            r2 = 0
            goto L_0x0023
        L_0x027d:
            com.google.zxing.client.result.k r1 = new com.google.zxing.client.result.k
            r3 = r1
            r18 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.C34694l.mo102518k(com.google.zxing.k):com.google.zxing.client.result.k");
    }
}
