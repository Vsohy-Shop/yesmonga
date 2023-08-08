package p073j$.time;

/* renamed from: j$.time.i */
abstract /* synthetic */ class C42655i {

    /* renamed from: a */
    static final /* synthetic */ int[] f107926a;

    /* renamed from: b */
    static final /* synthetic */ int[] f107927b;

    /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(3:57|58|60)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f5 */
    static {
        /*
            j$.time.temporal.ChronoUnit[] r0 = p073j$.time.temporal.ChronoUnit.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            f107927b = r0
            r1 = 1
            j$.time.temporal.ChronoUnit r2 = p073j$.time.temporal.ChronoUnit.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            r0 = 2
            int[] r2 = f107927b     // Catch:{ NoSuchFieldError -> 0x001d }
            j$.time.temporal.ChronoUnit r3 = p073j$.time.temporal.ChronoUnit.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            r2 = 3
            int[] r3 = f107927b     // Catch:{ NoSuchFieldError -> 0x0028 }
            j$.time.temporal.ChronoUnit r4 = p073j$.time.temporal.ChronoUnit.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            r3 = 4
            int[] r4 = f107927b     // Catch:{ NoSuchFieldError -> 0x0033 }
            j$.time.temporal.ChronoUnit r5 = p073j$.time.temporal.ChronoUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            r4 = 5
            int[] r5 = f107927b     // Catch:{ NoSuchFieldError -> 0x003e }
            j$.time.temporal.ChronoUnit r6 = p073j$.time.temporal.ChronoUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
            int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            r5 = 6
            int[] r6 = f107927b     // Catch:{ NoSuchFieldError -> 0x0049 }
            j$.time.temporal.ChronoUnit r7 = p073j$.time.temporal.ChronoUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            r6 = 7
            int[] r7 = f107927b     // Catch:{ NoSuchFieldError -> 0x0054 }
            j$.time.temporal.ChronoUnit r8 = p073j$.time.temporal.ChronoUnit.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            j$.time.temporal.a[] r7 = p073j$.time.temporal.C42662a.values()
            int r7 = r7.length
            int[] r7 = new int[r7]
            f107926a = r7
            j$.time.temporal.a r8 = p073j$.time.temporal.C42662a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0065 }
            int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
            r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
        L_0x0065:
            int[] r1 = f107926a     // Catch:{ NoSuchFieldError -> 0x006f }
            j$.time.temporal.a r7 = p073j$.time.temporal.C42662a.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006f }
            int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
            r1[r7] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
        L_0x006f:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x0079 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0079 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
        L_0x0079:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x0083 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0083 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
            r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
        L_0x0083:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x008d }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x008d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
            r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
        L_0x008d:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x0097 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0097 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
            r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
        L_0x0097:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x00a1 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x00a1 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
            r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00a1 }
        L_0x00a1:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x00ad }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00ad }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ad }
        L_0x00ad:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x00b9 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x00b9 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
            r2 = 9
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
        L_0x00b9:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x00c5 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00c5 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
            r2 = 10
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c5 }
        L_0x00c5:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x00d1 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00d1 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
            r2 = 11
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d1 }
        L_0x00d1:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x00dd }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00dd }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
            r2 = 12
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
        L_0x00dd:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x00e9 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00e9 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
            r2 = 13
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
        L_0x00e9:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x00f5 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00f5 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
            r2 = 14
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
        L_0x00f5:
            int[] r0 = f107926a     // Catch:{ NoSuchFieldError -> 0x0101 }
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.AMPM_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0101 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
            r2 = 15
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.C42655i.<clinit>():void");
    }
}
