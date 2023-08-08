package org.joda.time.convert;

import kotlinx.serialization.json.internal.C12361b;

/* renamed from: org.joda.time.convert.e */
public class C12625e {

    /* renamed from: a */
    public final C12623c[] f31107a;

    /* renamed from: b */
    public C12626a[] f31108b = new C12626a[16];

    /* renamed from: org.joda.time.convert.e$a */
    public static class C12626a {

        /* renamed from: a */
        public final Class<?> f31109a;

        /* renamed from: b */
        public final C12623c f31110b;

        public C12626a(Class<?> cls, C12623c cVar) {
            this.f31109a = cls;
            this.f31110b = cVar;
        }
    }

    public C12625e(C12623c[] cVarArr) {
        this.f31107a = cVarArr;
    }

    /* renamed from: f */
    public static C12623c m53313f(C12625e eVar, Class<?> cls) {
        String str;
        C12623c[] cVarArr = eVar.f31107a;
        int length = cVarArr.length;
        int i = length;
        while (true) {
            length--;
            if (length >= 0) {
                C12623c cVar = cVarArr[length];
                Class<?> j = cVar.mo28992j();
                if (j == cls) {
                    return cVar;
                }
                if (j == null || (cls != null && !j.isAssignableFrom(cls))) {
                    eVar = eVar.mo29021c(length, (C12623c[]) null);
                    cVarArr = eVar.f31107a;
                    i = cVarArr.length;
                }
            } else if (cls == null || i == 0) {
                return null;
            } else {
                if (i == 1) {
                    return cVarArr[0];
                }
                int i2 = i;
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    Class<?> j2 = cVarArr[i].mo28992j();
                    int i3 = i2;
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                            break;
                        } else if (i2 != i && cVarArr[i2].mo28992j().isAssignableFrom(j2)) {
                            eVar = eVar.mo29021c(i2, (C12623c[]) null);
                            cVarArr = eVar.f31107a;
                            i3 = cVarArr.length;
                            i = i3 - 1;
                        }
                    }
                    i2 = i3;
                }
                if (i2 == 1) {
                    return cVarArr[0];
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find best converter for type \"");
                sb.append(cls.getName());
                sb.append("\" from remaining set: ");
                for (int i4 = 0; i4 < i2; i4++) {
                    C12623c cVar2 = cVarArr[i4];
                    Class<?> j3 = cVar2.mo28992j();
                    sb.append(cVar2.getClass().getName());
                    sb.append(C12361b.f30260k);
                    if (j3 == null) {
                        str = null;
                    } else {
                        str = j3.getName();
                    }
                    sb.append(str);
                    sb.append("], ");
                }
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public C12625e mo29019a(C12623c cVar, C12623c[] cVarArr) {
        C12623c[] cVarArr2 = this.f31107a;
        int length = cVarArr2.length;
        int i = 0;
        while (i < length) {
            C12623c cVar2 = cVarArr2[i];
            if (cVar.equals(cVar2)) {
                if (cVarArr != null) {
                    cVarArr[0] = null;
                }
                return this;
            } else if (cVar.mo28992j() == cVar2.mo28992j()) {
                C12623c[] cVarArr3 = new C12623c[length];
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 != i) {
                        cVarArr3[i2] = cVarArr2[i2];
                    } else {
                        cVarArr3[i2] = cVar;
                    }
                }
                if (cVarArr != null) {
                    cVarArr[0] = cVar2;
                }
                return new C12625e(cVarArr3);
            } else {
                i++;
            }
        }
        C12623c[] cVarArr4 = new C12623c[(length + 1)];
        System.arraycopy(cVarArr2, 0, cVarArr4, 0, length);
        cVarArr4[length] = cVar;
        if (cVarArr != null) {
            cVarArr[0] = null;
        }
        return new C12625e(cVarArr4);
    }

    /* renamed from: b */
    public void mo29020b(C12623c[] cVarArr) {
        C12623c[] cVarArr2 = this.f31107a;
        System.arraycopy(cVarArr2, 0, cVarArr, 0, cVarArr2.length);
    }

    /* renamed from: c */
    public C12625e mo29021c(int i, C12623c[] cVarArr) {
        C12623c[] cVarArr2 = this.f31107a;
        int length = cVarArr2.length;
        if (i < length) {
            if (cVarArr != null) {
                cVarArr[0] = cVarArr2[i];
            }
            C12623c[] cVarArr3 = new C12623c[(length - 1)];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 != i) {
                    cVarArr3[i2] = cVarArr2[i3];
                    i2++;
                }
            }
            return new C12625e(cVarArr3);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: d */
    public C12625e mo29022d(C12623c cVar, C12623c[] cVarArr) {
        C12623c[] cVarArr2 = this.f31107a;
        int length = cVarArr2.length;
        for (int i = 0; i < length; i++) {
            if (cVar.equals(cVarArr2[i])) {
                return mo29021c(i, cVarArr);
            }
        }
        if (cVarArr != null) {
            cVarArr[0] = null;
        }
        return this;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005c A[EDGE_INSN: B:39:0x005c->B:29:0x005c ?: BREAK  , SYNTHETIC] */
    /* renamed from: e */
    public org.joda.time.convert.C12623c mo29023e(java.lang.Class<?> r10) throws java.lang.IllegalStateException {
        /*
            r9 = this;
            org.joda.time.convert.e$a[] r0 = r9.f31108b
            int r1 = r0.length
            r2 = 0
            if (r10 != 0) goto L_0x0007
            goto L_0x001d
        L_0x0007:
            int r3 = r10.hashCode()
            int r4 = r1 + -1
            r3 = r3 & r4
        L_0x000e:
            r4 = r0[r3]
            if (r4 == 0) goto L_0x001f
            java.lang.Class<?> r5 = r4.f31109a
            if (r5 != r10) goto L_0x0019
            org.joda.time.convert.c r10 = r4.f31110b
            return r10
        L_0x0019:
            int r3 = r3 + 1
            if (r3 < r1) goto L_0x000e
        L_0x001d:
            r3 = r2
            goto L_0x000e
        L_0x001f:
            org.joda.time.convert.c r4 = m53313f(r9, r10)
            org.joda.time.convert.e$a r5 = new org.joda.time.convert.e$a
            r5.<init>(r10, r4)
            java.lang.Object r10 = r0.clone()
            org.joda.time.convert.e$a[] r10 = (org.joda.time.convert.C12625e.C12626a[]) r10
            r10[r3] = r5
            r0 = r2
        L_0x0031:
            if (r0 >= r1) goto L_0x003d
            r3 = r10[r0]
            if (r3 != 0) goto L_0x003a
            r9.f31108b = r10
            return r4
        L_0x003a:
            int r0 = r0 + 1
            goto L_0x0031
        L_0x003d:
            int r0 = r1 << 1
            org.joda.time.convert.e$a[] r3 = new org.joda.time.convert.C12625e.C12626a[r0]
            r5 = r2
        L_0x0042:
            if (r5 >= r1) goto L_0x0061
            r6 = r10[r5]
            java.lang.Class<?> r7 = r6.f31109a
            if (r7 != 0) goto L_0x004b
            goto L_0x005a
        L_0x004b:
            int r7 = r7.hashCode()
            int r8 = r0 + -1
            r7 = r7 & r8
        L_0x0052:
            r8 = r3[r7]
            if (r8 == 0) goto L_0x005c
            int r7 = r7 + 1
            if (r7 < r0) goto L_0x0052
        L_0x005a:
            r7 = r2
            goto L_0x0052
        L_0x005c:
            r3[r7] = r6
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0061:
            r9.f31108b = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.convert.C12625e.mo29023e(java.lang.Class):org.joda.time.convert.c");
    }

    /* renamed from: g */
    public int mo29024g() {
        return this.f31107a.length;
    }
}
