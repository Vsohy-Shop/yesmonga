package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.gms.common.internal.C40843u;
import com.google.zxing.client.android.C34651e;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gtm.a9 */
public final class C41135a9 {
    /* renamed from: a */
    public static double m167067a(C41310hg<?> hgVar) {
        double b = m167068b(hgVar);
        if (Double.isNaN(b)) {
            return 0.0d;
        }
        int i = (b > 0.0d ? 1 : (b == 0.0d ? 0 : -1));
        if (i == 0 || i == 0 || Double.isInfinite(b)) {
            return b;
        }
        return Math.signum(b) * Math.floor(Math.abs(b));
    }

    /* renamed from: b */
    public static double m167068b(C41310hg<?> hgVar) {
        boolean z;
        if (hgVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVar == C41431mg.f104800h) {
            return Double.NaN;
        }
        if (hgVar == C41431mg.f104799g) {
            return 0.0d;
        }
        if (hgVar instanceof C41334ig) {
            if (((C41334ig) hgVar).mo135499i().booleanValue()) {
                return 1.0d;
            }
            return 0.0d;
        } else if (hgVar instanceof C41358jg) {
            return ((C41358jg) hgVar).mo135515i().doubleValue();
        } else {
            if (hgVar instanceof C41503pg) {
                C41503pg pgVar = (C41503pg) hgVar;
                if (pgVar.mo135719k().isEmpty()) {
                    return 0.0d;
                }
                if (pgVar.mo135719k().size() == 1) {
                    return m167068b(new C41599tg(m167070d(pgVar.mo135718i(0))));
                }
            } else if (hgVar instanceof C41599tg) {
                C41599tg tgVar = (C41599tg) hgVar;
                if (tgVar.mo135863k().isEmpty()) {
                    return 0.0d;
                }
                try {
                    return Double.parseDouble(tgVar.mo135863k());
                } catch (NumberFormatException unused) {
                    return Double.NaN;
                }
            }
            if (!m167076j(hgVar)) {
                return Double.NaN;
            }
            String hgVar2 = hgVar.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(hgVar2).length() + 41);
            sb.append("Illegal type given to numberEquivalent: ");
            sb.append(hgVar2);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public static double m167069c(C41310hg<?> hgVar, C41310hg<?> hgVar2) {
        boolean z;
        boolean z2 = true;
        if (hgVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVar2 == null) {
            z2 = false;
        }
        C40843u.m166191a(z2);
        double b = m167068b(hgVar);
        double b2 = m167068b(hgVar2);
        if (Double.isNaN(b) || Double.isNaN(b2)) {
            return Double.NaN;
        }
        if ((b == Double.POSITIVE_INFINITY && b2 == Double.NEGATIVE_INFINITY) || (b == Double.NEGATIVE_INFINITY && b2 == Double.POSITIVE_INFINITY)) {
            return Double.NaN;
        }
        if (Double.isInfinite(b) && !Double.isInfinite(b2)) {
            return b;
        }
        if (Double.isInfinite(b) || !Double.isInfinite(b2)) {
            return b + b2;
        }
        return b2;
    }

    /* renamed from: d */
    public static String m167070d(C41310hg<?> hgVar) {
        boolean z;
        String str;
        if (hgVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVar == C41431mg.f104800h) {
            return "undefined";
        }
        if (hgVar == C41431mg.f104799g) {
            return "null";
        }
        if (hgVar instanceof C41334ig) {
            if (true != ((C41334ig) hgVar).mo135499i().booleanValue()) {
                return C13758b.f33438c;
            }
            return C13758b.f33436b;
        } else if (hgVar instanceof C41358jg) {
            String d = Double.toString(((C41358jg) hgVar).mo135515i().doubleValue());
            int indexOf = d.indexOf("E");
            if (indexOf > 0) {
                int parseInt = Integer.parseInt(d.substring(indexOf + 1, d.length()));
                if (parseInt < 0) {
                    if (parseInt <= -7) {
                        return d.replace("E", C34651e.f83829d);
                    }
                    String replace = d.substring(0, indexOf).replace(".", "");
                    StringBuilder sb = new StringBuilder();
                    sb.append("0.");
                    while (true) {
                        parseInt++;
                        if (parseInt < 0) {
                            sb.append("0");
                        } else {
                            sb.append(replace);
                            return sb.toString();
                        }
                    }
                } else if (parseInt >= 21) {
                    return d.replace("E", "e+");
                } else {
                    String replace2 = d.substring(0, indexOf).replace(".", "");
                    int length = (parseInt + 1) - (replace2.length() - (replace2.startsWith("-") ? 1 : 0));
                    StringBuilder sb2 = new StringBuilder();
                    if (length < 0) {
                        int length2 = replace2.length() + length;
                        sb2.append(replace2.substring(0, length2));
                        sb2.append(".");
                        sb2.append(replace2.substring(length2, replace2.length()));
                    } else {
                        sb2.append(replace2);
                        while (length > 0) {
                            sb2.append("0");
                            length--;
                        }
                    }
                    return sb2.toString();
                }
            } else if (!d.endsWith(".0")) {
                return d;
            } else {
                String substring = d.substring(0, d.length() - 2);
                if (substring.equals("-0")) {
                    return "0";
                }
                return substring;
            }
        } else {
            if (hgVar instanceof C41383kg) {
                C41735z8 i = ((C41383kg) hgVar).mo135582i();
                if (i instanceof C41711y8) {
                    return ((C41711y8) i).mo136101c();
                }
            } else if (hgVar instanceof C41503pg) {
                ArrayList arrayList = new ArrayList();
                for (C41310hg next : ((C41503pg) hgVar).mo135719k()) {
                    if (next == C41431mg.f104799g || next == C41431mg.f104800h) {
                        arrayList.add("");
                    } else {
                        arrayList.add(m167070d(next));
                    }
                }
                return TextUtils.join(",", arrayList);
            } else if (hgVar instanceof C41527qg) {
                return "[object Object]";
            } else {
                if (hgVar instanceof C41599tg) {
                    return ((C41599tg) hgVar).mo135863k();
                }
            }
            if (m167076j(hgVar)) {
                String hgVar2 = hgVar.toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(hgVar2).length() + 41);
                sb3.append("Illegal type given to stringEquivalent: ");
                sb3.append(hgVar2);
                sb3.append(".");
                str = sb3.toString();
            } else {
                str = "Unknown type in stringEquivalent.";
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m167071e(com.google.android.gms.internal.gtm.C41310hg<?> r12, com.google.android.gms.internal.gtm.C41310hg<?> r13) {
        /*
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x0006
            r2 = r0
            goto L_0x0007
        L_0x0006:
            r2 = r1
        L_0x0007:
            com.google.android.gms.common.internal.C40843u.m166191a(r2)
            if (r13 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            com.google.android.gms.common.internal.C40843u.m166191a(r2)
            boolean r2 = m167076j(r12)
            java.lang.String r3 = "."
            java.lang.String r4 = "Illegal type given to abstractEqualityCompare: "
            if (r2 != 0) goto L_0x01b7
            boolean r2 = m167076j(r13)
            if (r2 != 0) goto L_0x0191
            java.lang.String r2 = m167075i(r12)
            java.lang.String r3 = m167075i(r13)
            boolean r4 = r2.equals(r3)
            java.lang.String r5 = "Boolean"
            java.lang.String r6 = "Object"
            java.lang.String r7 = "String"
            java.lang.String r8 = "Number"
            if (r4 == 0) goto L_0x00d3
            int r3 = r2.hashCode()
            r4 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            switch(r3) {
                case -1950496919: goto L_0x0070;
                case -1939501217: goto L_0x0068;
                case -1808118735: goto L_0x0060;
                case 2439591: goto L_0x0056;
                case 965837104: goto L_0x004c;
                case 1729365000: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x0078
        L_0x0044:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0078
            r2 = r9
            goto L_0x0079
        L_0x004c:
            java.lang.String r3 = "Undefined"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0078
            r2 = r1
            goto L_0x0079
        L_0x0056:
            java.lang.String r3 = "Null"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0078
            r2 = r0
            goto L_0x0079
        L_0x0060:
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0078
            r2 = r10
            goto L_0x0079
        L_0x0068:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0078
            r2 = r4
            goto L_0x0079
        L_0x0070:
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0078
            r2 = r11
            goto L_0x0079
        L_0x0078:
            r2 = -1
        L_0x0079:
            if (r2 == 0) goto L_0x00d2
            if (r2 == r0) goto L_0x00d2
            if (r2 == r11) goto L_0x00ab
            if (r2 == r10) goto L_0x009a
            if (r2 == r9) goto L_0x008a
            if (r2 == r4) goto L_0x0086
            return r1
        L_0x0086:
            if (r12 != r13) goto L_0x0089
            return r0
        L_0x0089:
            return r1
        L_0x008a:
            com.google.android.gms.internal.gtm.ig r12 = (com.google.android.gms.internal.gtm.C41334ig) r12
            java.lang.Boolean r12 = r12.mo135499i()
            com.google.android.gms.internal.gtm.ig r13 = (com.google.android.gms.internal.gtm.C41334ig) r13
            java.lang.Boolean r13 = r13.mo135499i()
            if (r12 != r13) goto L_0x0099
            return r0
        L_0x0099:
            return r1
        L_0x009a:
            com.google.android.gms.internal.gtm.tg r12 = (com.google.android.gms.internal.gtm.C41599tg) r12
            java.lang.String r12 = r12.mo135863k()
            com.google.android.gms.internal.gtm.tg r13 = (com.google.android.gms.internal.gtm.C41599tg) r13
            java.lang.String r13 = r13.mo135863k()
            boolean r12 = r12.equals(r13)
            return r12
        L_0x00ab:
            com.google.android.gms.internal.gtm.jg r12 = (com.google.android.gms.internal.gtm.C41358jg) r12
            java.lang.Double r12 = r12.mo135515i()
            double r2 = r12.doubleValue()
            com.google.android.gms.internal.gtm.jg r13 = (com.google.android.gms.internal.gtm.C41358jg) r13
            java.lang.Double r12 = r13.mo135515i()
            double r12 = r12.doubleValue()
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L_0x00d1
            boolean r4 = java.lang.Double.isNaN(r12)
            if (r4 == 0) goto L_0x00cc
            goto L_0x00d1
        L_0x00cc:
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x00d1
            return r0
        L_0x00d1:
            return r1
        L_0x00d2:
            return r0
        L_0x00d3:
            com.google.android.gms.internal.gtm.mg r4 = com.google.android.gms.internal.gtm.C41431mg.f104800h
            if (r12 == r4) goto L_0x00db
            com.google.android.gms.internal.gtm.mg r9 = com.google.android.gms.internal.gtm.C41431mg.f104799g
            if (r12 != r9) goto L_0x00e1
        L_0x00db:
            if (r13 == r4) goto L_0x0190
            com.google.android.gms.internal.gtm.mg r4 = com.google.android.gms.internal.gtm.C41431mg.f104799g
            if (r13 == r4) goto L_0x0190
        L_0x00e1:
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L_0x0100
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto L_0x00ee
            goto L_0x0100
        L_0x00ee:
            com.google.android.gms.internal.gtm.jg r0 = new com.google.android.gms.internal.gtm.jg
            double r1 = m167068b(r13)
            java.lang.Double r13 = java.lang.Double.valueOf(r1)
            r0.<init>(r13)
            boolean r12 = m167071e(r12, r0)
            return r12
        L_0x0100:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r3.equals(r8)
            if (r0 != 0) goto L_0x010d
            goto L_0x011f
        L_0x010d:
            com.google.android.gms.internal.gtm.jg r0 = new com.google.android.gms.internal.gtm.jg
            double r1 = m167068b(r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r1)
            r0.<init>(r12)
            boolean r12 = m167071e(r0, r13)
            return r12
        L_0x011f:
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x0137
            com.google.android.gms.internal.gtm.jg r0 = new com.google.android.gms.internal.gtm.jg
            double r1 = m167068b(r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r1)
            r0.<init>(r12)
            boolean r12 = m167071e(r0, r13)
            return r12
        L_0x0137:
            boolean r0 = r3.equals(r5)
            if (r0 == 0) goto L_0x014f
            com.google.android.gms.internal.gtm.jg r0 = new com.google.android.gms.internal.gtm.jg
            double r1 = m167068b(r13)
            java.lang.Double r13 = java.lang.Double.valueOf(r1)
            r0.<init>(r13)
            boolean r12 = m167071e(r12, r0)
            return r12
        L_0x014f:
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L_0x015b
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L_0x0161
        L_0x015b:
            boolean r0 = r3.equals(r6)
            if (r0 != 0) goto L_0x0182
        L_0x0161:
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0181
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto L_0x0173
            boolean r0 = r3.equals(r8)
            if (r0 == 0) goto L_0x0181
        L_0x0173:
            com.google.android.gms.internal.gtm.tg r0 = new com.google.android.gms.internal.gtm.tg
            java.lang.String r12 = m167070d(r12)
            r0.<init>(r12)
            boolean r12 = m167071e(r0, r13)
            return r12
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.gtm.tg r0 = new com.google.android.gms.internal.gtm.tg
            java.lang.String r13 = m167070d(r13)
            r0.<init>(r13)
            boolean r12 = m167071e(r12, r0)
            return r12
        L_0x0190:
            return r0
        L_0x0191:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 48
            r1.<init>(r0)
            r1.append(r4)
            r1.append(r13)
            r1.append(r3)
            java.lang.String r13 = r1.toString()
            r12.<init>(r13)
            throw r12
        L_0x01b7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 48
            r1.<init>(r0)
            r1.append(r4)
            r1.append(r12)
            r1.append(r3)
            java.lang.String r12 = r1.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41135a9.m167071e(com.google.android.gms.internal.gtm.hg, com.google.android.gms.internal.gtm.hg):boolean");
    }

    /* renamed from: f */
    public static boolean m167072f(C41310hg<?> hgVar, C41310hg<?> hgVar2) {
        boolean z;
        boolean z2;
        int i;
        if (hgVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVar2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        if (m167076j(hgVar)) {
            String hgVar3 = hgVar.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(hgVar3).length() + 50);
            sb.append("Illegal type given to abstractRelationalCompare: ");
            sb.append(hgVar3);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        } else if (!m167076j(hgVar2)) {
            if ((hgVar instanceof C41527qg) || (hgVar instanceof C41503pg) || (hgVar instanceof C41383kg)) {
                hgVar = new C41599tg(m167070d(hgVar));
            }
            if ((hgVar2 instanceof C41527qg) || (hgVar2 instanceof C41503pg) || (hgVar2 instanceof C41383kg)) {
                hgVar2 = new C41599tg(m167070d(hgVar2));
            }
            if (!(hgVar instanceof C41599tg) || !(hgVar2 instanceof C41599tg)) {
                double b = m167068b(hgVar);
                double b2 = m167068b(hgVar2);
                if (Double.isNaN(b) || Double.isNaN(b2) || ((b == 0.0d && b2 == 0.0d) || ((i == 0 && b2 == 0.0d) || b == Double.POSITIVE_INFINITY))) {
                    return false;
                }
                if (b2 == Double.POSITIVE_INFINITY) {
                    return true;
                }
                if (b2 == Double.NEGATIVE_INFINITY) {
                    return false;
                }
                if (b != Double.NEGATIVE_INFINITY && Double.compare(b, b2) >= 0) {
                    return false;
                }
                return true;
            } else if (((C41599tg) hgVar).mo135863k().compareTo(((C41599tg) hgVar2).mo135863k()) < 0) {
                return true;
            } else {
                return false;
            }
        } else {
            String hgVar4 = hgVar2.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(hgVar4).length() + 50);
            sb2.append("Illegal type given to abstractRelationalCompare: ");
            sb2.append(hgVar4);
            sb2.append(".");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: g */
    public static boolean m167073g(C41310hg<?> hgVar) {
        boolean z;
        if (hgVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVar == C41431mg.f104800h || hgVar == C41431mg.f104799g) {
            return false;
        }
        if (hgVar instanceof C41334ig) {
            return ((C41334ig) hgVar).mo135499i().booleanValue();
        }
        if (hgVar instanceof C41358jg) {
            C41358jg jgVar = (C41358jg) hgVar;
            if (jgVar.mo135515i().doubleValue() == 0.0d || jgVar.mo135515i().doubleValue() == 0.0d || Double.isNaN(jgVar.mo135515i().doubleValue())) {
                return false;
            }
        } else if (hgVar instanceof C41599tg) {
            if (((C41599tg) hgVar).mo135863k().isEmpty()) {
                return false;
            }
        } else if (m167076j(hgVar)) {
            String hgVar2 = hgVar.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(hgVar2).length() + 33);
            sb.append("Illegal type given to isTruthy: ");
            sb.append(hgVar2);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m167074h(com.google.android.gms.internal.gtm.C41310hg<?> r7, com.google.android.gms.internal.gtm.C41310hg<?> r8) {
        /*
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0006
            r2 = r0
            goto L_0x0007
        L_0x0006:
            r2 = r1
        L_0x0007:
            com.google.android.gms.common.internal.C40843u.m166191a(r2)
            if (r8 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            com.google.android.gms.common.internal.C40843u.m166191a(r2)
            boolean r2 = m167076j(r7)
            java.lang.String r3 = "."
            java.lang.String r4 = "Illegal type given to strictEqualityCompare: "
            if (r2 != 0) goto L_0x00ef
            boolean r2 = m167076j(r8)
            if (r2 != 0) goto L_0x00c9
            java.lang.String r2 = m167075i(r7)
            java.lang.String r3 = m167075i(r8)
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0031
            return r1
        L_0x0031:
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r3) {
                case -1950496919: goto L_0x0064;
                case -1808118735: goto L_0x005a;
                case 2439591: goto L_0x0050;
                case 965837104: goto L_0x0046;
                case 1729365000: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x006e
        L_0x003c:
            java.lang.String r3 = "Boolean"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006e
            r2 = r4
            goto L_0x006f
        L_0x0046:
            java.lang.String r3 = "Undefined"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006e
            r2 = r1
            goto L_0x006f
        L_0x0050:
            java.lang.String r3 = "Null"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006e
            r2 = r0
            goto L_0x006f
        L_0x005a:
            java.lang.String r3 = "String"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006e
            r2 = r5
            goto L_0x006f
        L_0x0064:
            java.lang.String r3 = "Number"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006e
            r2 = r6
            goto L_0x006f
        L_0x006e:
            r2 = -1
        L_0x006f:
            if (r2 == 0) goto L_0x00c8
            if (r2 == r0) goto L_0x00c8
            if (r2 == r6) goto L_0x00a1
            if (r2 == r5) goto L_0x008d
            if (r2 == r4) goto L_0x007d
            if (r7 != r8) goto L_0x007c
            return r0
        L_0x007c:
            return r1
        L_0x007d:
            com.google.android.gms.internal.gtm.ig r7 = (com.google.android.gms.internal.gtm.C41334ig) r7
            java.lang.Boolean r7 = r7.mo135499i()
            com.google.android.gms.internal.gtm.ig r8 = (com.google.android.gms.internal.gtm.C41334ig) r8
            java.lang.Boolean r8 = r8.mo135499i()
            if (r7 != r8) goto L_0x008c
            return r0
        L_0x008c:
            return r1
        L_0x008d:
            com.google.android.gms.internal.gtm.tg r7 = (com.google.android.gms.internal.gtm.C41599tg) r7
            java.lang.String r7 = r7.mo135863k()
            com.google.android.gms.internal.gtm.tg r8 = (com.google.android.gms.internal.gtm.C41599tg) r8
            java.lang.String r8 = r8.mo135863k()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00a0
            return r0
        L_0x00a0:
            return r1
        L_0x00a1:
            com.google.android.gms.internal.gtm.jg r7 = (com.google.android.gms.internal.gtm.C41358jg) r7
            java.lang.Double r7 = r7.mo135515i()
            double r2 = r7.doubleValue()
            com.google.android.gms.internal.gtm.jg r8 = (com.google.android.gms.internal.gtm.C41358jg) r8
            java.lang.Double r7 = r8.mo135515i()
            double r7 = r7.doubleValue()
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L_0x00c7
            boolean r4 = java.lang.Double.isNaN(r7)
            if (r4 == 0) goto L_0x00c2
            goto L_0x00c7
        L_0x00c2:
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x00c7
            return r0
        L_0x00c7:
            return r1
        L_0x00c8:
            return r0
        L_0x00c9:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 46
            r1.<init>(r0)
            r1.append(r4)
            r1.append(r8)
            r1.append(r3)
            java.lang.String r8 = r1.toString()
            r7.<init>(r8)
            throw r7
        L_0x00ef:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 46
            r1.<init>(r0)
            r1.append(r4)
            r1.append(r7)
            r1.append(r3)
            java.lang.String r7 = r1.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41135a9.m167074h(com.google.android.gms.internal.gtm.hg, com.google.android.gms.internal.gtm.hg):boolean");
    }

    /* renamed from: i */
    public static String m167075i(C41310hg<?> hgVar) {
        if (hgVar == C41431mg.f104800h) {
            return "Undefined";
        }
        if (hgVar == C41431mg.f104799g) {
            return "Null";
        }
        if (hgVar instanceof C41334ig) {
            return "Boolean";
        }
        if (hgVar instanceof C41358jg) {
            return "Number";
        }
        if (hgVar instanceof C41599tg) {
            return "String";
        }
        return "Object";
    }

    /* renamed from: j */
    public static boolean m167076j(C41310hg<?> hgVar) {
        if (hgVar instanceof C41551rg) {
            return true;
        }
        if (!(hgVar instanceof C41431mg) || hgVar == C41431mg.f104800h) {
            return false;
        }
        return hgVar != C41431mg.f104799g;
    }
}
