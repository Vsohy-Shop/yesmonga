package kotlin.time;

import com.google.android.material.badge.C31132a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.collections.C10953k0;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11452c;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11471o;
import kotlin.ranges.C11479u;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1484:1\n1436#1,6:1486\n1439#1,3:1492\n1436#1,6:1495\n1436#1,6:1501\n1439#1,3:1510\n1#2:1485\n1726#3,3:1507\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1360#1:1486,6\n1394#1:1492,3\n1397#1:1495,6\n1400#1:1501,6\n1436#1:1510,3\n1425#1:1507,3\n*E\n"})
/* renamed from: kotlin.time.g */
public final class C11639g {

    /* renamed from: a */
    public static final int f28961a = 1000000;

    /* renamed from: b */
    public static final long f28962b = 4611686018426999999L;

    /* renamed from: c */
    public static final long f28963c = 4611686018427387903L;

    /* renamed from: d */
    public static final long f28964d = 4611686018426L;

    /* renamed from: A */
    public static final long m45587A(int i) {
        return m45638m0(i, DurationUnit.MICROSECONDS);
    }

    /* renamed from: B */
    public static final long m45588B(long j) {
        return m45640n0(j, DurationUnit.MICROSECONDS);
    }

    @C11395k(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: C */
    public static /* synthetic */ void m45589C(double d) {
    }

    @C11395k(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: D */
    public static /* synthetic */ void m45590D(int i) {
    }

    @C11395k(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: E */
    public static /* synthetic */ void m45591E(long j) {
    }

    /* renamed from: F */
    public static final long m45592F(double d) {
        return m45636l0(d, DurationUnit.MILLISECONDS);
    }

    /* renamed from: G */
    public static final long m45593G(int i) {
        return m45638m0(i, DurationUnit.MILLISECONDS);
    }

    /* renamed from: H */
    public static final long m45594H(long j) {
        return m45640n0(j, DurationUnit.MILLISECONDS);
    }

    @C11395k(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: I */
    public static /* synthetic */ void m45595I(double d) {
    }

    @C11395k(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: J */
    public static /* synthetic */ void m45596J(int i) {
    }

    @C11395k(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: K */
    public static /* synthetic */ void m45597K(long j) {
    }

    /* renamed from: L */
    public static final long m45598L(double d) {
        return m45636l0(d, DurationUnit.MINUTES);
    }

    /* renamed from: M */
    public static final long m45599M(int i) {
        return m45638m0(i, DurationUnit.MINUTES);
    }

    /* renamed from: N */
    public static final long m45600N(long j) {
        return m45640n0(j, DurationUnit.MINUTES);
    }

    @C11395k(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: O */
    public static /* synthetic */ void m45601O(double d) {
    }

    @C11395k(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: P */
    public static /* synthetic */ void m45602P(int i) {
    }

    @C11395k(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: Q */
    public static /* synthetic */ void m45603Q(long j) {
    }

    /* renamed from: R */
    public static final long m45604R(double d) {
        return m45636l0(d, DurationUnit.NANOSECONDS);
    }

    /* renamed from: S */
    public static final long m45605S(int i) {
        return m45638m0(i, DurationUnit.NANOSECONDS);
    }

    /* renamed from: T */
    public static final long m45606T(long j) {
        return m45640n0(j, DurationUnit.NANOSECONDS);
    }

    @C11395k(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: U */
    public static /* synthetic */ void m45607U(double d) {
    }

    @C11395k(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: V */
    public static /* synthetic */ void m45608V(int i) {
    }

    @C11395k(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: W */
    public static /* synthetic */ void m45609W(long j) {
    }

    /* renamed from: X */
    public static final long m45610X(double d) {
        return m45636l0(d, DurationUnit.SECONDS);
    }

    /* renamed from: Y */
    public static final long m45611Y(int i) {
        return m45638m0(i, DurationUnit.SECONDS);
    }

    /* renamed from: Z */
    public static final long m45612Z(long j) {
        return m45640n0(j, DurationUnit.SECONDS);
    }

    @C11395k(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: a0 */
    public static /* synthetic */ void m45614a0(double d) {
    }

    @C11395k(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: b0 */
    public static /* synthetic */ void m45616b0(int i) {
    }

    @C11395k(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: c0 */
    public static /* synthetic */ void m45618c0(long j) {
    }

    /* renamed from: d0 */
    public static final long m45620d0(long j) {
        return j * ((long) 1000000);
    }

    /* renamed from: e0 */
    public static final long m45622e0(long j) {
        return j / ((long) 1000000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x00a6 A[EDGE_INSN: B:160:0x00a6->B:45:0x00a6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009a A[LOOP:1: B:33:0x006c->B:43:0x009a, LOOP_END] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m45624f0(java.lang.String r27, boolean r28) {
        /*
            r6 = r27
            int r7 = r27.length()
            if (r7 == 0) goto L_0x02cf
            kotlin.time.e$a r8 = kotlin.time.C11636e.f28954b
            long r9 = r8.mo23447W()
            java.lang.String r2 = "Infinity"
            r11 = 0
            char r0 = r6.charAt(r11)
            r1 = 43
            r3 = 45
            r12 = 1
            if (r0 != r1) goto L_0x001e
        L_0x001c:
            r13 = r12
            goto L_0x0022
        L_0x001e:
            if (r0 != r3) goto L_0x0021
            goto L_0x001c
        L_0x0021:
            r13 = r11
        L_0x0022:
            if (r13 <= 0) goto L_0x0026
            r14 = r12
            goto L_0x0027
        L_0x0026:
            r14 = r11
        L_0x0027:
            r0 = 2
            r15 = 0
            if (r14 == 0) goto L_0x0034
            boolean r1 = kotlin.text.StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) r6, (char) r3, (boolean) r11, (int) r0, (java.lang.Object) r15)
            if (r1 == 0) goto L_0x0034
            r16 = r12
            goto L_0x0036
        L_0x0034:
            r16 = r11
        L_0x0036:
            java.lang.String r5 = "No components"
            if (r7 <= r13) goto L_0x02c8
            char r1 = r6.charAt(r13)
            r3 = 80
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            r17 = r5
            java.lang.String r5 = "Unexpected order of duration components"
            r11 = 48
            java.lang.String r15 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            if (r1 != r3) goto L_0x015c
            int r13 = r13 + r12
            if (r13 == r7) goto L_0x0156
            r1 = 0
            r2 = 0
        L_0x0053:
            if (r13 >= r7) goto L_0x02bb
            char r3 = r6.charAt(r13)
            r8 = 84
            if (r3 != r8) goto L_0x006b
            if (r1 != 0) goto L_0x0065
            int r13 = r13 + 1
            if (r13 == r7) goto L_0x0065
            r1 = r12
            goto L_0x0053
        L_0x0065:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x006b:
            r3 = r13
        L_0x006c:
            int r8 = r27.length()
            if (r3 >= r8) goto L_0x00a2
            char r8 = r6.charAt(r3)
            kotlin.ranges.c r14 = new kotlin.ranges.c
            r12 = 57
            r14.<init>(r11, r12)
            boolean r14 = r14.mo23018Q(r8)
            if (r14 != 0) goto L_0x0093
            java.lang.String r14 = "+-."
            r18 = r7
            r7 = 0
            r11 = 0
            r12 = 2
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r14, (char) r8, (boolean) r7, (int) r12, (java.lang.Object) r11)
            if (r8 == 0) goto L_0x0091
            goto L_0x0097
        L_0x0091:
            r7 = 0
            goto L_0x0098
        L_0x0093:
            r18 = r7
            r11 = 0
            r12 = 2
        L_0x0097:
            r7 = 1
        L_0x0098:
            if (r7 == 0) goto L_0x00a6
            int r3 = r3 + 1
            r7 = r18
            r11 = 48
            r12 = 1
            goto L_0x006c
        L_0x00a2:
            r18 = r7
            r11 = 0
            r12 = 2
        L_0x00a6:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r0)
            java.lang.String r3 = r6.substring(r13, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r15)
            int r7 = r3.length()
            if (r7 != 0) goto L_0x00b8
            r7 = 1
            goto L_0x00b9
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            if (r7 != 0) goto L_0x0150
            int r7 = r3.length()
            int r13 = r13 + r7
            if (r13 < 0) goto L_0x0139
            int r7 = kotlin.text.StringsKt__StringsKt.getLastIndex(r27)
            if (r13 > r7) goto L_0x0139
            char r7 = r6.charAt(r13)
            int r13 = r13 + 1
            kotlin.time.DurationUnit r7 = kotlin.time.C11643j.m45658f(r7, r1)
            if (r2 == 0) goto L_0x00e1
            int r2 = r2.compareTo(r7)
            if (r2 <= 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L_0x00e1:
            r20 = 46
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            r19 = r3
            int r2 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r19, (char) r20, (int) r21, (boolean) r22, (int) r23, (java.lang.Object) r24)
            kotlin.time.DurationUnit r8 = kotlin.time.DurationUnit.SECONDS
            if (r7 != r8) goto L_0x0125
            if (r2 <= 0) goto L_0x0125
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            r8 = 0
            java.lang.String r14 = r3.substring(r8, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            long r11 = m45626g0(r14)
            long r11 = m45640n0(r11, r7)
            long r9 = kotlin.time.C11636e.m45469c2(r9, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            java.lang.String r2 = r3.substring(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            double r2 = java.lang.Double.parseDouble(r2)
            long r2 = m45636l0(r2, r7)
            long r9 = kotlin.time.C11636e.m45469c2(r9, r2)
            goto L_0x0131
        L_0x0125:
            long r2 = m45626g0(r3)
            long r2 = m45640n0(r2, r7)
            long r9 = kotlin.time.C11636e.m45469c2(r9, r2)
        L_0x0131:
            r2 = r7
            r7 = r18
            r11 = 48
            r12 = 1
            goto L_0x0053
        L_0x0139:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing unit for value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0156:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x015c:
            r18 = r7
            if (r28 != 0) goto L_0x02c2
            r3 = 0
            int r7 = r18 - r13
            r1 = 8
            int r7 = java.lang.Math.max(r7, r1)
            r11 = 1
            r1 = r0
            r12 = 57
            r0 = r27
            r25 = r1
            r1 = r13
            r26 = r4
            r4 = r7
            r7 = r5
            r12 = r17
            r5 = r11
            boolean r0 = kotlin.text.C11622t.regionMatches((java.lang.String) r0, (int) r1, (java.lang.String) r2, (int) r3, (int) r4, (boolean) r5)
            if (r0 == 0) goto L_0x0185
            long r9 = r8.mo23477q()
            goto L_0x02bb
        L_0x0185:
            r0 = r14 ^ 1
            if (r14 == 0) goto L_0x01a8
            char r1 = r6.charAt(r13)
            r2 = 40
            if (r1 != r2) goto L_0x01a8
            char r1 = kotlin.text.StringsKt___StringsKt.last(r27)
            r2 = 41
            if (r1 != r2) goto L_0x01a8
            int r13 = r13 + 1
            int r0 = r18 + -1
            if (r13 == r0) goto L_0x01a2
            r1 = r0
            r0 = 1
            goto L_0x01aa
        L_0x01a2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r12)
            throw r0
        L_0x01a8:
            r1 = r18
        L_0x01aa:
            r2 = 0
            r3 = 0
        L_0x01ac:
            if (r13 >= r1) goto L_0x02bb
            if (r2 == 0) goto L_0x01c8
            if (r0 == 0) goto L_0x01c8
        L_0x01b2:
            int r2 = r27.length()
            if (r13 >= r2) goto L_0x01c8
            char r2 = r6.charAt(r13)
            r4 = 32
            if (r2 != r4) goto L_0x01c2
            r2 = 1
            goto L_0x01c3
        L_0x01c2:
            r2 = 0
        L_0x01c3:
            if (r2 == 0) goto L_0x01c8
            int r13 = r13 + 1
            goto L_0x01b2
        L_0x01c8:
            r2 = r13
        L_0x01c9:
            int r4 = r27.length()
            if (r2 >= r4) goto L_0x01ef
            char r4 = r6.charAt(r2)
            kotlin.ranges.c r5 = new kotlin.ranges.c
            r8 = 57
            r11 = 48
            r5.<init>(r11, r8)
            boolean r5 = r5.mo23018Q(r4)
            if (r5 != 0) goto L_0x01e9
            r5 = 46
            if (r4 != r5) goto L_0x01e7
            goto L_0x01e9
        L_0x01e7:
            r4 = 0
            goto L_0x01ea
        L_0x01e9:
            r4 = 1
        L_0x01ea:
            if (r4 == 0) goto L_0x01f3
            int r2 = r2 + 1
            goto L_0x01c9
        L_0x01ef:
            r8 = 57
            r11 = 48
        L_0x01f3:
            r4 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r4)
            java.lang.String r2 = r6.substring(r13, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r15)
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0207
            r5 = 1
            goto L_0x0208
        L_0x0207:
            r5 = 0
        L_0x0208:
            if (r5 != 0) goto L_0x02b5
            int r5 = r2.length()
            int r13 = r13 + r5
            r5 = r13
        L_0x0210:
            int r12 = r27.length()
            if (r5 >= r12) goto L_0x0230
            char r12 = r6.charAt(r5)
            kotlin.ranges.c r14 = new kotlin.ranges.c
            r8 = 97
            r11 = 122(0x7a, float:1.71E-43)
            r14.<init>(r8, r11)
            boolean r8 = r14.mo23018Q(r12)
            if (r8 == 0) goto L_0x0230
            int r5 = r5 + 1
            r8 = 57
            r11 = 48
            goto L_0x0210
        L_0x0230:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r4)
            java.lang.String r5 = r6.substring(r13, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r15)
            int r8 = r5.length()
            int r13 = r13 + r8
            kotlin.time.DurationUnit r5 = kotlin.time.C11643j.m45659g(r5)
            if (r3 == 0) goto L_0x0252
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L_0x024c
            goto L_0x0252
        L_0x024c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L_0x0252:
            r20 = 46
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            r19 = r2
            int r3 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r19, (char) r20, (int) r21, (boolean) r22, (int) r23, (java.lang.Object) r24)
            if (r3 <= 0) goto L_0x02a0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            r8 = 0
            java.lang.String r11 = r2.substring(r8, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
            long r11 = java.lang.Long.parseLong(r11)
            long r11 = m45640n0(r11, r5)
            long r9 = kotlin.time.C11636e.m45469c2(r9, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            java.lang.String r2 = r2.substring(r3)
            r3 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            double r11 = java.lang.Double.parseDouble(r2)
            long r11 = m45636l0(r11, r5)
            long r9 = kotlin.time.C11636e.m45469c2(r9, r11)
            if (r13 < r1) goto L_0x0298
            r26 = r3
            goto L_0x02af
        L_0x0298:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fractional component must be last"
            r0.<init>(r1)
            throw r0
        L_0x02a0:
            r3 = r26
            r8 = 0
            long r11 = java.lang.Long.parseLong(r2)
            long r11 = m45640n0(r11, r5)
            long r9 = kotlin.time.C11636e.m45469c2(r9, r11)
        L_0x02af:
            r25 = r4
            r3 = r5
            r2 = 1
            goto L_0x01ac
        L_0x02b5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x02bb:
            if (r16 == 0) goto L_0x02c1
            long r9 = kotlin.time.C11636e.m45506w2(r9)
        L_0x02c1:
            return r9
        L_0x02c2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x02c8:
            r12 = r5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r12)
            throw r0
        L_0x02cf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string is empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.C11639g.m45624f0(java.lang.String, boolean):long");
    }

    /* renamed from: g0 */
    public static final long m45626g0(String str) {
        int i;
        boolean z;
        int length = str.length();
        if (length <= 0 || !StringsKt__StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) {
            i = 0;
        } else {
            i = 1;
        }
        if (length - i > 16) {
            C11466l lVar = new C11466l(i, StringsKt__StringsKt.getLastIndex(str));
            if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                Iterator it = lVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!new C11452c('0', '9').mo23018Q(str.charAt(((C10953k0) it).mo6374c()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                if (str.charAt(0) == '-') {
                    return Long.MIN_VALUE;
                }
                return Long.MAX_VALUE;
            }
        }
        if (C11622t.startsWith$default(str, C31132a.f74628J0, false, 2, (Object) null)) {
            str = StringsKt___StringsKt.drop(str, 1);
        }
        return Long.parseLong(str);
    }

    /* renamed from: h0 */
    public static final int m45628h0(String str, int i, C11300l<? super Character, Boolean> lVar) {
        while (i < str.length() && lVar.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    /* renamed from: i */
    public static final long m45629i(long j, int i) {
        return C11636e.m45462W((j << 1) + ((long) i));
    }

    /* renamed from: i0 */
    public static final String m45630i0(String str, int i, C11300l<? super Character, Boolean> lVar) {
        int i2 = i;
        while (i2 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: j */
    public static final long m45631j(long j) {
        return C11636e.m45462W((j << 1) + 1);
    }

    @C11097g2(markerClass = {C11646k.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: j0 */
    public static final long m45632j0(double d, long j) {
        return C11636e.m45471e2(j, d);
    }

    /* renamed from: k */
    public static final long m45633k(long j) {
        if (new C11471o(-4611686018426L, f28964d).mo23073Q(j)) {
            return m45635l(m45620d0(j));
        }
        return m45631j(C11479u.m44340K(j, -4611686018427387903L, 4611686018427387903L));
    }

    @C11097g2(markerClass = {C11646k.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: k0 */
    public static final long m45634k0(int i, long j) {
        return C11636e.m45476i2(j, i);
    }

    /* renamed from: l */
    public static final long m45635l(long j) {
        return C11636e.m45462W(j << 1);
    }

    @C11097g2(markerClass = {C11646k.class})
    @C11665v0(version = "1.6")
    /* renamed from: l0 */
    public static final long m45636l0(double d, @C12579k DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "unit");
        double a = C11641i.m45653a(d, durationUnit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(a)) {
            long M0 = C11409d.m43853M0(a);
            if (new C11471o(-4611686018426999999L, f28962b).mo23073Q(M0)) {
                return m45635l(M0);
            }
            return m45633k(C11409d.m43853M0(C11641i.m45653a(d, durationUnit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    /* renamed from: m */
    public static final long m45637m(long j) {
        if (new C11471o(-4611686018426999999L, f28962b).mo23073Q(j)) {
            return m45635l(j);
        }
        return m45631j(m45622e0(j));
    }

    @C11097g2(markerClass = {C11646k.class})
    @C11665v0(version = "1.6")
    /* renamed from: m0 */
    public static final long m45638m0(int i, @C12579k DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "unit");
        if (durationUnit.compareTo(DurationUnit.SECONDS) <= 0) {
            return m45635l(C11641i.m45655c((long) i, durationUnit, DurationUnit.NANOSECONDS));
        }
        return m45640n0((long) i, durationUnit);
    }

    /* renamed from: n */
    public static final long m45639n(double d) {
        return m45636l0(d, DurationUnit.DAYS);
    }

    @C11097g2(markerClass = {C11646k.class})
    @C11665v0(version = "1.6")
    /* renamed from: n0 */
    public static final long m45640n0(long j, @C12579k DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "unit");
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long c = C11641i.m45655c(f28962b, durationUnit2, durationUnit);
        if (new C11471o(-c, c).mo23073Q(j)) {
            return m45635l(C11641i.m45655c(j, durationUnit, durationUnit2));
        }
        return m45631j(C11479u.m44340K(C11641i.m45654b(j, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    /* renamed from: o */
    public static final long m45641o(int i) {
        return m45638m0(i, DurationUnit.DAYS);
    }

    /* renamed from: p */
    public static final long m45642p(long j) {
        return m45640n0(j, DurationUnit.DAYS);
    }

    @C11395k(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: q */
    public static /* synthetic */ void m45643q(double d) {
    }

    @C11395k(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: r */
    public static /* synthetic */ void m45644r(int i) {
    }

    @C11395k(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: s */
    public static /* synthetic */ void m45645s(long j) {
    }

    /* renamed from: t */
    public static final long m45646t(double d) {
        return m45636l0(d, DurationUnit.HOURS);
    }

    /* renamed from: u */
    public static final long m45647u(int i) {
        return m45638m0(i, DurationUnit.HOURS);
    }

    /* renamed from: v */
    public static final long m45648v(long j) {
        return m45640n0(j, DurationUnit.HOURS);
    }

    @C11395k(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: w */
    public static /* synthetic */ void m45649w(double d) {
    }

    @C11395k(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: x */
    public static /* synthetic */ void m45650x(int i) {
    }

    @C11395k(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @C11587t0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @C11398l(errorSince = "1.8", warningSince = "1.5")
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: y */
    public static /* synthetic */ void m45651y(long j) {
    }

    /* renamed from: z */
    public static final long m45652z(double d) {
        return m45636l0(d, DurationUnit.MICROSECONDS);
    }
}
