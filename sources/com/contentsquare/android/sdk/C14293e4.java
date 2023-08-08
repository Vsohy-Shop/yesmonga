package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.contentsquare.android.sdk.e4 */
public final class C14293e4 extends C14517m3<C14359g4.C14363d> {

    /* renamed from: com.contentsquare.android.sdk.e4$a */
    public static /* synthetic */ class C14294a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35295a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.contentsquare.android.sdk.sf$b[] r0 = com.contentsquare.android.sdk.C14710sf.C14712b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35295a = r0
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f35295a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.contentsquare.android.sdk.sf$b r1 = com.contentsquare.android.sdk.C14710sf.C14712b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14293e4.C14294a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public int mo35025a(Map.Entry<?, ?> entry) {
        return ((C14359g4.C14363d) entry.getKey()).mo34877a();
    }

    /* renamed from: b */
    public C14253cc<C14359g4.C14363d> mo35026b(Object obj) {
        return ((C14359g4.C14362c) obj).f35522e;
    }

    /* renamed from: c */
    public Object mo35027c(C14787v2 v2Var, C14218ba baVar, int i) {
        return v2Var.mo36615b(baVar, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016d, code lost:
        r4 = java.lang.Long.valueOf(r0);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <UT, UB> UB mo35028d(com.contentsquare.android.sdk.C14475k6 r4, java.lang.Object r5, com.contentsquare.android.sdk.C14787v2 r6, com.contentsquare.android.sdk.C14253cc<com.contentsquare.android.sdk.C14359g4.C14363d> r7, UB r8, com.contentsquare.android.sdk.C14436j0<UT, UB> r9) {
        /*
            r3 = this;
            com.contentsquare.android.sdk.g4$e r5 = (com.contentsquare.android.sdk.C14359g4.C14364e) r5
            int r0 = r5.mo35339c()
            com.contentsquare.android.sdk.g4$d r1 = r5.f35529b
            boolean r1 = r1.mo34881p()
            if (r1 == 0) goto L_0x00d2
            com.contentsquare.android.sdk.g4$d r1 = r5.f35529b
            boolean r1 = r1.mo34879c()
            if (r1 == 0) goto L_0x00d2
            int[] r6 = com.contentsquare.android.sdk.C14293e4.C14294a.f35295a
            com.contentsquare.android.sdk.sf$b r1 = r5.mo35337a()
            int r1 = r1.ordinal()
            r6 = r6[r1]
            switch(r6) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009f;
                case 6: goto L_0x0096;
                case 7: goto L_0x008d;
                case 8: goto L_0x0084;
                case 9: goto L_0x007b;
                case 10: goto L_0x0072;
                case 11: goto L_0x0069;
                case 12: goto L_0x0060;
                case 13: goto L_0x0056;
                case 14: goto L_0x0042;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Type cannot be packed: "
            r6.append(r7)
            com.contentsquare.android.sdk.g4$d r5 = r5.f35529b
            com.contentsquare.android.sdk.sf$b r5 = r5.mo34880j()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0042:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34573a1(r6)
            com.contentsquare.android.sdk.g4$d r4 = r5.f35529b
            com.contentsquare.android.sdk.o3$d r4 = r4.mo35336g()
            java.lang.Object r8 = com.contentsquare.android.sdk.C14646q9.m63156i(r0, r6, r4, r8, r9)
            goto L_0x00cb
        L_0x0056:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34593k1(r6)
            goto L_0x00cb
        L_0x0060:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34565V0(r6)
            goto L_0x00cb
        L_0x0069:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34583f1(r6)
            goto L_0x00cb
        L_0x0072:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34601o1(r6)
            goto L_0x00cb
        L_0x007b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34560R0(r6)
            goto L_0x00cb
        L_0x0084:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34564V(r6)
            goto L_0x00cb
        L_0x008d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34579d1(r6)
            goto L_0x00cb
        L_0x0096:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34575b1(r6)
            goto L_0x00cb
        L_0x009f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34571Z0(r6)
            goto L_0x00cb
        L_0x00a8:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34566W(r6)
            goto L_0x00cb
        L_0x00b1:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34568X0(r6)
            goto L_0x00cb
        L_0x00ba:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34563U0(r6)
            goto L_0x00cb
        L_0x00c3:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.mo34610s1(r6)
        L_0x00cb:
            com.contentsquare.android.sdk.g4$d r4 = r5.f35529b
            r7.mo34866o(r4, r6)
            goto L_0x01b5
        L_0x00d2:
            com.contentsquare.android.sdk.sf$b r1 = r5.mo35337a()
            com.contentsquare.android.sdk.sf$b r2 = com.contentsquare.android.sdk.C14710sf.C14712b.ENUM
            if (r1 != r2) goto L_0x00ef
            int r4 = r4.mo34569Y()
            com.contentsquare.android.sdk.g4$d r6 = r5.f35529b
            com.contentsquare.android.sdk.o3$d r6 = r6.mo35336g()
            com.contentsquare.android.sdk.o3$c r6 = r6.mo35920b(r4)
            if (r6 != 0) goto L_0x015f
            java.lang.Object r4 = com.contentsquare.android.sdk.C14646q9.m63155h(r0, r4, r8, r9)
            return r4
        L_0x00ef:
            int[] r9 = com.contentsquare.android.sdk.C14293e4.C14294a.f35295a
            com.contentsquare.android.sdk.sf$b r0 = r5.mo35337a()
            int r0 = r0.ordinal()
            r9 = r9[r0]
            switch(r9) {
                case 1: goto L_0x017b;
                case 2: goto L_0x0172;
                case 3: goto L_0x0169;
                case 4: goto L_0x0164;
                case 5: goto L_0x015b;
                case 6: goto L_0x0156;
                case 7: goto L_0x0151;
                case 8: goto L_0x0148;
                case 9: goto L_0x0143;
                case 10: goto L_0x013e;
                case 11: goto L_0x0139;
                case 12: goto L_0x0134;
                case 13: goto L_0x012f;
                case 14: goto L_0x0127;
                case 15: goto L_0x0122;
                case 16: goto L_0x011d;
                case 17: goto L_0x010f;
                case 18: goto L_0x0101;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            r4 = 0
            goto L_0x0183
        L_0x0101:
            com.contentsquare.android.sdk.ba r9 = r5.mo35338b()
            java.lang.Class r9 = r9.getClass()
            java.lang.Object r4 = r4.mo34607r1(r9, r6)
            goto L_0x0183
        L_0x010f:
            com.contentsquare.android.sdk.ba r9 = r5.mo35338b()
            java.lang.Class r9 = r9.getClass()
            java.lang.Object r4 = r4.mo34605q1(r9, r6)
            goto L_0x0183
        L_0x011d:
            java.lang.String r4 = r4.mo34561S0()
            goto L_0x0183
        L_0x0122:
            com.contentsquare.android.sdk.t0 r4 = r4.mo34602p()
            goto L_0x0183
        L_0x0127:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Shouldn't reach here."
            r4.<init>(r5)
            throw r4
        L_0x012f:
            long r0 = r4.mo34574b()
            goto L_0x016d
        L_0x0134:
            int r4 = r4.mo34608s()
            goto L_0x015f
        L_0x0139:
            long r0 = r4.mo34597m1()
            goto L_0x016d
        L_0x013e:
            int r4 = r4.mo34576c()
            goto L_0x015f
        L_0x0143:
            int r4 = r4.mo34582f()
            goto L_0x015f
        L_0x0148:
            boolean r4 = r4.mo34577c1()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0183
        L_0x0151:
            int r4 = r4.mo34598n()
            goto L_0x015f
        L_0x0156:
            long r0 = r4.mo34596m()
            goto L_0x016d
        L_0x015b:
            int r4 = r4.mo34569Y()
        L_0x015f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0183
        L_0x0164:
            long r0 = r4.mo34594l()
            goto L_0x016d
        L_0x0169:
            long r0 = r4.mo34588i()
        L_0x016d:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x0183
        L_0x0172:
            float r4 = r4.mo34572a()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0183
        L_0x017b:
            double r0 = r4.mo34581e1()
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
        L_0x0183:
            boolean r6 = r5.mo35340d()
            if (r6 == 0) goto L_0x018f
            com.contentsquare.android.sdk.g4$d r5 = r5.f35529b
            r7.mo34862g(r5, r4)
            goto L_0x01b5
        L_0x018f:
            int[] r6 = com.contentsquare.android.sdk.C14293e4.C14294a.f35295a
            com.contentsquare.android.sdk.sf$b r9 = r5.mo35337a()
            int r9 = r9.ordinal()
            r6 = r6[r9]
            r9 = 17
            if (r6 == r9) goto L_0x01a4
            r9 = 18
            if (r6 == r9) goto L_0x01a4
            goto L_0x01b0
        L_0x01a4:
            com.contentsquare.android.sdk.g4$d r6 = r5.f35529b
            java.lang.Object r6 = r7.mo34860e(r6)
            if (r6 == 0) goto L_0x01b0
            java.lang.Object r4 = com.contentsquare.android.sdk.C14566o3.m62805g(r6, r4)
        L_0x01b0:
            com.contentsquare.android.sdk.g4$d r5 = r5.f35529b
            r7.mo34866o(r5, r4)
        L_0x01b5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14293e4.mo35028d(com.contentsquare.android.sdk.k6, java.lang.Object, com.contentsquare.android.sdk.v2, com.contentsquare.android.sdk.cc, java.lang.Object, com.contentsquare.android.sdk.j0):java.lang.Object");
    }

    /* renamed from: e */
    public void mo35029e(C14475k6 k6Var, Object obj, C14787v2 v2Var, C14253cc<C14359g4.C14363d> ccVar) {
        C14359g4.C14364e eVar = (C14359g4.C14364e) obj;
        ccVar.mo34866o(eVar.f35529b, k6Var.mo34607r1(eVar.mo35338b().getClass(), v2Var));
    }

    /* renamed from: f */
    public void mo35030f(C14719t0 t0Var, Object obj, C14787v2 v2Var, C14253cc<C14359g4.C14363d> ccVar) {
        C14359g4.C14364e eVar = (C14359g4.C14364e) obj;
        C14218ba a = eVar.mo35338b().mo34700j().mo34701a();
        C14193b b = C14193b.m60853b(ByteBuffer.wrap(t0Var.mo36438p0()), true);
        C14599od.m62876d().mo36107e(a, b, v2Var);
        ccVar.mo34866o(eVar.f35529b, a);
        if (b.mo34585g1() != Integer.MAX_VALUE) {
            throw C14394h5.m62025c();
        }
    }

    /* renamed from: g */
    public void mo35031g(C14782uf ufVar, Map.Entry<?, ?> entry) {
        C14359g4.C14363d dVar = (C14359g4.C14363d) entry.getKey();
        if (dVar.mo34881p()) {
            switch (C14294a.f35295a[dVar.mo34880j().ordinal()]) {
                case 1:
                    C14646q9.m63173z(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 2:
                    C14646q9.m63131O(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 3:
                    C14646q9.m63137U(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 4:
                    C14646q9.m63152e0(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 5:
                case 14:
                    C14646q9.m63134R(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 6:
                    C14646q9.m63128L(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 7:
                    C14646q9.m63124H(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 8:
                    C14646q9.m63160m(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 9:
                    C14646q9.m63150d0(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 10:
                    C14646q9.m63140X(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 11:
                    C14646q9.m63144a0(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 12:
                    C14646q9.m63146b0(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 13:
                    C14646q9.m63148c0(dVar.mo34877a(), (List) entry.getValue(), ufVar, dVar.mo34879c());
                    return;
                case 15:
                    C14646q9.m63158k(dVar.mo34877a(), (List) entry.getValue(), ufVar);
                    return;
                case 16:
                    C14646q9.m63171x(dVar.mo34877a(), (List) entry.getValue(), ufVar);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C14646q9.m63159l(dVar.mo34877a(), (List) entry.getValue(), ufVar, C14599od.m62876d().mo36104a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C14646q9.m63172y(dVar.mo34877a(), (List) entry.getValue(), ufVar, C14599od.m62876d().mo36104a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C14294a.f35295a[dVar.mo34880j().ordinal()]) {
                case 1:
                    ufVar.mo35422F(dVar.mo34877a(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    ufVar.mo35423G(dVar.mo34877a(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    ufVar.mo35429M(dVar.mo34877a(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    ufVar.mo35425I(dVar.mo34877a(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    ufVar.mo35424H(dVar.mo34877a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    ufVar.mo35438e(dVar.mo34877a(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    ufVar.mo35437d(dVar.mo34877a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    ufVar.mo35427K(dVar.mo34877a(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    ufVar.mo35441h(dVar.mo34877a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    ufVar.mo35445l(dVar.mo34877a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    ufVar.mo35446m(dVar.mo34877a(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    ufVar.mo35448o(dVar.mo34877a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    ufVar.mo35442i(dVar.mo34877a(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    ufVar.mo35453t(dVar.mo34877a(), (C14719t0) entry.getValue());
                    return;
                case 16:
                    ufVar.mo35436c(dVar.mo34877a(), (String) entry.getValue());
                    return;
                case 17:
                    ufVar.mo35443j(dVar.mo34877a(), entry.getValue(), C14599od.m62876d().mo36104a(entry.getValue().getClass()));
                    return;
                case 18:
                    ufVar.mo35439f(dVar.mo34877a(), entry.getValue(), C14599od.m62876d().mo36104a(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: h */
    public boolean mo35032h(C14218ba baVar) {
        return baVar instanceof C14359g4.C14362c;
    }

    /* renamed from: i */
    public C14253cc<C14359g4.C14363d> mo35033i(Object obj) {
        return ((C14359g4.C14362c) obj).mo35333H();
    }

    /* renamed from: j */
    public void mo35034j(Object obj) {
        mo35026b(obj).mo34875x();
    }
}
