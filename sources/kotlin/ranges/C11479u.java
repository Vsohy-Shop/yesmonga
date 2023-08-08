package kotlin.ranges;

import com.urbanairship.automation.C8970v;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.NoSuchElementException;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.C11443d;
import kotlin.random.Random;
import kotlin.ranges.C11446a;
import kotlin.ranges.C11463j;
import kotlin.ranges.C11468m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* renamed from: kotlin.ranges.u */
public class C11479u extends C11478t {
    /* renamed from: A */
    public static final float m44310A(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: A0 */
    public static final Integer m44311A0(@C12579k C11463j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.mo23049r());
    }

    @C12579k
    /* renamed from: A1 */
    public static final C11446a m44312A1(@C12579k C11446a aVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C11478t.m44301a(z, Integer.valueOf(i));
        C11446a.C11447a aVar2 = C11446a.f28574d;
        char r = aVar.mo22998r();
        char w = aVar.mo23000w();
        if (aVar.mo23001y() <= 0) {
            i = -i;
        }
        return aVar2.mo23002a(r, w, i);
    }

    /* renamed from: B */
    public static final int m44313B(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: B0 */
    public static final Long m44314B0(@C12579k C11468m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.mo23066r());
    }

    @C12579k
    /* renamed from: B1 */
    public static final C11463j m44315B1(@C12579k C11463j jVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C11478t.m44301a(z, Integer.valueOf(i));
        C11463j.C11464a aVar = C11463j.f28594d;
        int r = jVar.mo23049r();
        int w = jVar.mo23051w();
        if (jVar.mo23052y() <= 0) {
            i = -i;
        }
        return aVar.mo23053a(r, w, i);
    }

    /* renamed from: C */
    public static final long m44316C(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    @C12579k
    /* renamed from: C1 */
    public static final C11468m m44318C1(@C12579k C11468m mVar, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C11478t.m44301a(z, Long.valueOf(j));
        C11468m.C11469a aVar = C11468m.f28604d;
        long r = mVar.mo23066r();
        long w = mVar.mo23068w();
        if (mVar.mo23069y() <= 0) {
            j = -j;
        }
        return aVar.mo23070a(r, w, j);
    }

    @C12579k
    /* renamed from: D */
    public static final <T extends Comparable<? super T>> T m44319D(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(t2, "maximumValue");
        if (t.compareTo(t2) > 0) {
            return t2;
        }
        return t;
    }

    @C11314h(name = "floatRangeContains")
    /* renamed from: D0 */
    public static final boolean m44320D0(@C12579k C11459g<Float> gVar, double d) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.mo23006e(Float.valueOf((float) d));
    }

    @C12580l
    /* renamed from: D1 */
    public static final Byte m44321D1(double d) {
        boolean z = false;
        if (-128.0d <= d && d <= 127.0d) {
            z = true;
        }
        if (z) {
            return Byte.valueOf((byte) ((int) d));
        }
        return null;
    }

    /* renamed from: E */
    public static final short m44322E(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    @C12580l
    /* renamed from: E1 */
    public static final Byte m44324E1(float f) {
        boolean z = false;
        if (-128.0f <= f && f <= 127.0f) {
            z = true;
        }
        if (z) {
            return Byte.valueOf((byte) ((int) f));
        }
        return null;
    }

    /* renamed from: F */
    public static final byte m44325F(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            return b < b2 ? b2 : b > b3 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + b3 + " is less than minimum " + b2 + '.');
    }

    @C12580l
    /* renamed from: F1 */
    public static final Byte m44327F1(int i) {
        if (new C11466l(-128, 127).mo23056Q(i)) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    /* renamed from: G */
    public static final double m44328G(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    @C12580l
    /* renamed from: G1 */
    public static final Byte m44330G1(long j) {
        if (new C11471o(-128, 127).mo23073Q(j)) {
            return Byte.valueOf((byte) ((int) j));
        }
        return null;
    }

    /* renamed from: H */
    public static final float m44331H(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    @C11314h(name = "intRangeContains")
    /* renamed from: H0 */
    public static final boolean m44332H0(@C12579k C11459g<Integer> gVar, byte b) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.mo23006e(Integer.valueOf(b));
    }

    @C12580l
    /* renamed from: H1 */
    public static final Byte m44333H1(short s) {
        if (m44344L0(new C11466l(-128, 127), s)) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    /* renamed from: I */
    public static final int m44334I(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    @C11395k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @C11398l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @C11314h(name = "intRangeContains")
    /* renamed from: I0 */
    public static final /* synthetic */ boolean m44335I0(C11459g gVar, double d) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer I1 = m44336I1(d);
        if (I1 != null) {
            return gVar.mo23006e(I1);
        }
        return false;
    }

    @C12580l
    /* renamed from: I1 */
    public static final Integer m44336I1(double d) {
        boolean z = false;
        if (-2.147483648E9d <= d && d <= 2.147483647E9d) {
            z = true;
        }
        if (z) {
            return Integer.valueOf((int) d);
        }
        return null;
    }

    /* renamed from: J */
    public static final int m44337J(int i, @C12579k C11459g<Integer> gVar) {
        Intrinsics.checkNotNullParameter(gVar, C8970v.f24100k);
        if (gVar instanceof C11457f) {
            return ((Number) m44349N(Integer.valueOf(i), (C11457f) gVar)).intValue();
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (i < gVar.getStart().intValue()) {
            return gVar.getStart().intValue();
        } else {
            if (i > gVar.mo23013q().intValue()) {
                return gVar.mo23013q().intValue();
            }
            return i;
        }
    }

    @C11395k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @C11398l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @C11314h(name = "intRangeContains")
    /* renamed from: J0 */
    public static final /* synthetic */ boolean m44338J0(C11459g gVar, float f) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer J1 = m44339J1(f);
        if (J1 != null) {
            return gVar.mo23006e(J1);
        }
        return false;
    }

    @C12580l
    /* renamed from: J1 */
    public static final Integer m44339J1(float f) {
        boolean z = false;
        if (-2.14748365E9f <= f && f <= 2.14748365E9f) {
            z = true;
        }
        if (z) {
            return Integer.valueOf((int) f);
        }
        return null;
    }

    /* renamed from: K */
    public static final long m44340K(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    @C11314h(name = "intRangeContains")
    /* renamed from: K0 */
    public static final boolean m44341K0(@C12579k C11459g<Integer> gVar, long j) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Integer K1 = m44342K1(j);
        if (K1 != null) {
            return gVar.mo23006e(K1);
        }
        return false;
    }

    @C12580l
    /* renamed from: K1 */
    public static final Integer m44342K1(long j) {
        if (new C11471o(-2147483648L, 2147483647L).mo23073Q(j)) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    /* renamed from: L */
    public static final long m44343L(long j, @C12579k C11459g<Long> gVar) {
        Intrinsics.checkNotNullParameter(gVar, C8970v.f24100k);
        if (gVar instanceof C11457f) {
            return ((Number) m44349N(Long.valueOf(j), (C11457f) gVar)).longValue();
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (j < gVar.getStart().longValue()) {
            return gVar.getStart().longValue();
        } else {
            if (j > gVar.mo23013q().longValue()) {
                return gVar.mo23013q().longValue();
            }
            return j;
        }
    }

    @C11314h(name = "intRangeContains")
    /* renamed from: L0 */
    public static final boolean m44344L0(@C12579k C11459g<Integer> gVar, short s) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.mo23006e(Integer.valueOf(s));
    }

    @C12580l
    /* renamed from: L1 */
    public static final Long m44345L1(double d) {
        boolean z = false;
        if (-9.223372036854776E18d <= d && d <= 9.223372036854776E18d) {
            z = true;
        }
        if (z) {
            return Long.valueOf((long) d);
        }
        return null;
    }

    @C12579k
    /* renamed from: M */
    public static final <T extends Comparable<? super T>> T m44346M(@C12579k T t, @C12580l T t2, @C12580l T t3) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        if (t2 == null || t3 == null) {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 == null || t.compareTo(t3) <= 0) {
                return t;
            }
            return t3;
        } else if (t2.compareTo(t3) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
        } else if (t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    @C11314h(name = "intRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: M0 */
    public static final boolean m44347M0(@C12579k C11475r<Integer> rVar, byte b) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.mo23006e(Integer.valueOf(b));
    }

    @C12580l
    /* renamed from: M1 */
    public static final Long m44348M1(float f) {
        boolean z = false;
        if (-9.223372E18f <= f && f <= 9.223372E18f) {
            z = true;
        }
        if (z) {
            return Long.valueOf((long) f);
        }
        return null;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: N */
    public static final <T extends Comparable<? super T>> T m44349N(@C12579k T t, @C12579k C11457f<T> fVar) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(fVar, C8970v.f24100k);
        if (fVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
        } else if (fVar.mo23029i(t, fVar.getStart()) && !fVar.mo23029i(fVar.getStart(), t)) {
            return fVar.getStart();
        } else {
            if (!fVar.mo23029i(fVar.mo23013q(), t) || fVar.mo23029i(t, fVar.mo23013q())) {
                return t;
            }
            return fVar.mo23013q();
        }
    }

    @C11314h(name = "intRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: N0 */
    public static final boolean m44350N0(@C12579k C11475r<Integer> rVar, long j) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Integer K1 = m44342K1(j);
        if (K1 != null) {
            return rVar.mo23006e(K1);
        }
        return false;
    }

    @C12580l
    /* renamed from: N1 */
    public static final Short m44351N1(double d) {
        boolean z = false;
        if (-32768.0d <= d && d <= 32767.0d) {
            z = true;
        }
        if (z) {
            return Short.valueOf((short) ((int) d));
        }
        return null;
    }

    @C12579k
    /* renamed from: O */
    public static final <T extends Comparable<? super T>> T m44352O(@C12579k T t, @C12579k C11459g<T> gVar) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(gVar, C8970v.f24100k);
        if (gVar instanceof C11457f) {
            return m44349N(t, (C11457f) gVar);
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (t.compareTo(gVar.getStart()) < 0) {
            return gVar.getStart();
        } else {
            if (t.compareTo(gVar.mo23013q()) > 0) {
                return gVar.mo23013q();
            }
            return t;
        }
    }

    @C11314h(name = "intRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: O0 */
    public static final boolean m44353O0(@C12579k C11475r<Integer> rVar, short s) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.mo23006e(Integer.valueOf(s));
    }

    @C12580l
    /* renamed from: O1 */
    public static final Short m44354O1(float f) {
        boolean z = false;
        if (-32768.0f <= f && f <= 32767.0f) {
            z = true;
        }
        if (z) {
            return Short.valueOf((short) ((int) f));
        }
        return null;
    }

    /* renamed from: P */
    public static final short m44355P(short s, short s2, short s3) {
        if (s2 <= s3) {
            return s < s2 ? s2 : s > s3 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + s3 + " is less than minimum " + s2 + '.');
    }

    @C11665v0(version = "1.7")
    /* renamed from: P0 */
    public static final char m44356P0(@C12579k C11446a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.mo23000w();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @C12580l
    /* renamed from: P1 */
    public static final Short m44357P1(int i) {
        if (new C11466l(-32768, 32767).mo23056Q(i)) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: Q */
    public static final boolean m44358Q(C11452c cVar, Character ch) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (ch == null || !cVar.mo23018Q(ch.charValue())) {
            return false;
        }
        return true;
    }

    @C11665v0(version = "1.7")
    /* renamed from: Q0 */
    public static final int m44359Q0(@C12579k C11463j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.mo23051w();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @C12580l
    /* renamed from: Q1 */
    public static final Short m44360Q1(long j) {
        if (new C11471o(-32768, 32767).mo23073Q(j)) {
            return Short.valueOf((short) ((int) j));
        }
        return null;
    }

    @C11110f
    /* renamed from: R */
    public static final boolean m44361R(C11466l lVar, byte b) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return m44332H0(lVar, b);
    }

    @C11665v0(version = "1.7")
    /* renamed from: R0 */
    public static final long m44362R0(@C12579k C11468m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.mo23068w();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @C12579k
    /* renamed from: R1 */
    public static final C11452c m44363R1(char c, char c2) {
        if (Intrinsics.compare((int) c2, 0) <= 0) {
            return C11452c.f28584e.mo23022a();
        }
        return new C11452c(c, (char) (c2 - 1));
    }

    @C11110f
    /* renamed from: S */
    public static final boolean m44364S(C11466l lVar, long j) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return m44341K0(lVar, j);
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: S0 */
    public static final Character m44365S0(@C12579k C11446a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.mo23000w());
    }

    @C12579k
    /* renamed from: S1 */
    public static final C11466l m44366S1(byte b, byte b2) {
        return new C11466l(b, b2 - 1);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: T */
    public static final boolean m44367T(C11466l lVar, Integer num) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (num == null || !lVar.mo23056Q(num.intValue())) {
            return false;
        }
        return true;
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: T0 */
    public static final Integer m44368T0(@C12579k C11463j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.mo23051w());
    }

    @C12579k
    /* renamed from: T1 */
    public static final C11466l m44369T1(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return C11466l.f28602e.mo23060a();
        }
        return new C11466l(b, i - 1);
    }

    @C11110f
    /* renamed from: U */
    public static final boolean m44370U(C11466l lVar, short s) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return m44344L0(lVar, s);
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: U0 */
    public static final Long m44371U0(@C12579k C11468m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.mo23068w());
    }

    @C12579k
    /* renamed from: U1 */
    public static final C11466l m44372U1(byte b, short s) {
        return new C11466l(b, s - 1);
    }

    @C11110f
    /* renamed from: V */
    public static final boolean m44373V(C11471o oVar, byte b) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return m44374V0(oVar, b);
    }

    @C11314h(name = "longRangeContains")
    /* renamed from: V0 */
    public static final boolean m44374V0(@C12579k C11459g<Long> gVar, byte b) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.mo23006e(Long.valueOf((long) b));
    }

    @C12579k
    /* renamed from: V1 */
    public static final C11466l m44375V1(int i, byte b) {
        return new C11466l(i, b - 1);
    }

    @C11110f
    /* renamed from: W */
    public static final boolean m44376W(C11471o oVar, int i) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return m44383Y0(oVar, i);
    }

    @C11395k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @C11398l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @C11314h(name = "longRangeContains")
    /* renamed from: W0 */
    public static final /* synthetic */ boolean m44377W0(C11459g gVar, double d) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Long L1 = m44345L1(d);
        if (L1 != null) {
            return gVar.mo23006e(L1);
        }
        return false;
    }

    @C12579k
    /* renamed from: W1 */
    public static final C11466l m44378W1(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C11466l.f28602e.mo23060a();
        }
        return new C11466l(i, i2 - 1);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: X */
    public static final boolean m44379X(C11471o oVar, Long l) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (l == null || !oVar.mo23073Q(l.longValue())) {
            return false;
        }
        return true;
    }

    @C11395k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @C11398l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @C11314h(name = "longRangeContains")
    /* renamed from: X0 */
    public static final /* synthetic */ boolean m44380X0(C11459g gVar, float f) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Long M1 = m44348M1(f);
        if (M1 != null) {
            return gVar.mo23006e(M1);
        }
        return false;
    }

    @C12579k
    /* renamed from: X1 */
    public static final C11466l m44381X1(int i, short s) {
        return new C11466l(i, s - 1);
    }

    @C11110f
    /* renamed from: Y */
    public static final boolean m44382Y(C11471o oVar, short s) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return m44386Z0(oVar, s);
    }

    @C11314h(name = "longRangeContains")
    /* renamed from: Y0 */
    public static final boolean m44383Y0(@C12579k C11459g<Long> gVar, int i) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.mo23006e(Long.valueOf((long) i));
    }

    @C12579k
    /* renamed from: Y1 */
    public static final C11466l m44384Y1(short s, byte b) {
        return new C11466l(s, b - 1);
    }

    @C11314h(name = "longRangeContains")
    /* renamed from: Z0 */
    public static final boolean m44386Z0(@C12579k C11459g<Long> gVar, short s) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.mo23006e(Long.valueOf((long) s));
    }

    @C12579k
    /* renamed from: Z1 */
    public static final C11466l m44387Z1(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return C11466l.f28602e.mo23060a();
        }
        return new C11466l(s, i - 1);
    }

    @C11314h(name = "doubleRangeContains")
    /* renamed from: a0 */
    public static final boolean m44388a0(@C12579k C11459g<Double> gVar, float f) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.mo23006e(Double.valueOf((double) f));
    }

    @C11314h(name = "longRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: a1 */
    public static final boolean m44389a1(@C12579k C11475r<Long> rVar, byte b) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.mo23006e(Long.valueOf((long) b));
    }

    @C12579k
    /* renamed from: a2 */
    public static final C11466l m44390a2(short s, short s2) {
        return new C11466l(s, s2 - 1);
    }

    @C11314h(name = "longRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: b1 */
    public static final boolean m44392b1(@C12579k C11475r<Long> rVar, int i) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.mo23006e(Long.valueOf((long) i));
    }

    @C12579k
    /* renamed from: b2 */
    public static final C11471o m44393b2(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return C11471o.f28612e.mo23077a();
        }
        return new C11471o((long) b, j - 1);
    }

    @C11314h(name = "longRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: c1 */
    public static final boolean m44395c1(@C12579k C11475r<Long> rVar, short s) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.mo23006e(Long.valueOf((long) s));
    }

    @C12579k
    /* renamed from: c2 */
    public static final C11471o m44396c2(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return C11471o.f28612e.mo23077a();
        }
        return new C11471o((long) i, j - 1);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: d1 */
    public static final char m44398d1(C11452c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return m44401e1(cVar, Random.f28564a);
    }

    @C12579k
    /* renamed from: d2 */
    public static final C11471o m44399d2(long j, byte b) {
        return new C11471o(j, ((long) b) - 1);
    }

    @C11314h(name = "doubleRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: e0 */
    public static final boolean m44400e0(@C12579k C11475r<Double> rVar, float f) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.mo23006e(Double.valueOf((double) f));
    }

    @C11665v0(version = "1.3")
    /* renamed from: e1 */
    public static final char m44401e1(@C12579k C11452c cVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        try {
            return (char) random.mo22987n(cVar.mo22998r(), cVar.mo23000w() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @C12579k
    /* renamed from: e2 */
    public static final C11471o m44402e2(long j, int i) {
        return new C11471o(j, ((long) i) - 1);
    }

    @C12579k
    /* renamed from: f0 */
    public static final C11446a m44403f0(char c, char c2) {
        return C11446a.f28574d.mo23002a(c, c2, -1);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f1 */
    public static final int m44404f1(C11466l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return m44407g1(lVar, Random.f28564a);
    }

    @C12579k
    /* renamed from: f2 */
    public static final C11471o m44405f2(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return C11471o.f28612e.mo23077a();
        }
        return new C11471o(j, j2 - 1);
    }

    @C12579k
    /* renamed from: g0 */
    public static final C11463j m44406g0(byte b, byte b2) {
        return C11463j.f28594d.mo23053a(b, b2, -1);
    }

    @C11665v0(version = "1.3")
    /* renamed from: g1 */
    public static final int m44407g1(@C12579k C11466l lVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        try {
            return C11443d.m44126h(random, lVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @C12579k
    /* renamed from: g2 */
    public static final C11471o m44408g2(long j, short s) {
        return new C11471o(j, ((long) s) - 1);
    }

    @C12579k
    /* renamed from: h0 */
    public static final C11463j m44409h0(byte b, int i) {
        return C11463j.f28594d.mo23053a(b, i, -1);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: h1 */
    public static final long m44410h1(C11471o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return m44413i1(oVar, Random.f28564a);
    }

    @C12579k
    /* renamed from: h2 */
    public static final C11471o m44411h2(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return C11471o.f28612e.mo23077a();
        }
        return new C11471o((long) s, j - 1);
    }

    @C12579k
    /* renamed from: i0 */
    public static final C11463j m44412i0(byte b, short s) {
        return C11463j.f28594d.mo23053a(b, s, -1);
    }

    @C11665v0(version = "1.3")
    /* renamed from: i1 */
    public static final long m44413i1(@C12579k C11471o oVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        try {
            return C11443d.m44127i(random, oVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @C11395k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @C11398l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @C11314h(name = "byteRangeContains")
    /* renamed from: j */
    public static final /* synthetic */ boolean m44414j(C11459g gVar, double d) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte D1 = m44321D1(d);
        if (D1 != null) {
            return gVar.mo23006e(D1);
        }
        return false;
    }

    @C12579k
    /* renamed from: j0 */
    public static final C11463j m44415j0(int i, byte b) {
        return C11463j.f28594d.mo23053a(i, b, -1);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: j1 */
    public static final Character m44416j1(C11452c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return m44419k1(cVar, Random.f28564a);
    }

    @C11395k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @C11398l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @C11314h(name = "byteRangeContains")
    /* renamed from: k */
    public static final /* synthetic */ boolean m44417k(C11459g gVar, float f) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte E1 = m44324E1(f);
        if (E1 != null) {
            return gVar.mo23006e(E1);
        }
        return false;
    }

    @C12579k
    /* renamed from: k0 */
    public static final C11463j m44418k0(int i, int i2) {
        return C11463j.f28594d.mo23053a(i, i2, -1);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: k1 */
    public static final Character m44419k1(@C12579k C11452c cVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.mo22987n(cVar.mo22998r(), cVar.mo23000w() + 1));
    }

    @C11314h(name = "byteRangeContains")
    /* renamed from: l */
    public static final boolean m44420l(@C12579k C11459g<Byte> gVar, int i) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte F1 = m44327F1(i);
        if (F1 != null) {
            return gVar.mo23006e(F1);
        }
        return false;
    }

    @C12579k
    /* renamed from: l0 */
    public static final C11463j m44421l0(int i, short s) {
        return C11463j.f28594d.mo23053a(i, s, -1);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: l1 */
    public static final Integer m44422l1(C11466l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return m44425m1(lVar, Random.f28564a);
    }

    @C11314h(name = "byteRangeContains")
    /* renamed from: m */
    public static final boolean m44423m(@C12579k C11459g<Byte> gVar, long j) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte G1 = m44330G1(j);
        if (G1 != null) {
            return gVar.mo23006e(G1);
        }
        return false;
    }

    @C12579k
    /* renamed from: m0 */
    public static final C11463j m44424m0(short s, byte b) {
        return C11463j.f28594d.mo23053a(s, b, -1);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: m1 */
    public static final Integer m44425m1(@C12579k C11466l lVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(C11443d.m44126h(random, lVar));
    }

    @C11314h(name = "byteRangeContains")
    /* renamed from: n */
    public static final boolean m44426n(@C12579k C11459g<Byte> gVar, short s) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Byte H1 = m44333H1(s);
        if (H1 != null) {
            return gVar.mo23006e(H1);
        }
        return false;
    }

    @C12579k
    /* renamed from: n0 */
    public static final C11463j m44427n0(short s, int i) {
        return C11463j.f28594d.mo23053a(s, i, -1);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: n1 */
    public static final Long m44428n1(C11471o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return m44431o1(oVar, Random.f28564a);
    }

    @C11314h(name = "byteRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: o */
    public static final boolean m44429o(@C12579k C11475r<Byte> rVar, int i) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Byte F1 = m44327F1(i);
        if (F1 != null) {
            return rVar.mo23006e(F1);
        }
        return false;
    }

    @C12579k
    /* renamed from: o0 */
    public static final C11463j m44430o0(short s, short s2) {
        return C11463j.f28594d.mo23053a(s, s2, -1);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: o1 */
    public static final Long m44431o1(@C12579k C11471o oVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(C11443d.m44127i(random, oVar));
    }

    @C11314h(name = "byteRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: p */
    public static final boolean m44432p(@C12579k C11475r<Byte> rVar, long j) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Byte G1 = m44330G1(j);
        if (G1 != null) {
            return rVar.mo23006e(G1);
        }
        return false;
    }

    @C12579k
    /* renamed from: p0 */
    public static final C11468m m44433p0(byte b, long j) {
        return C11468m.f28604d.mo23070a((long) b, j, -1);
    }

    @C12579k
    /* renamed from: p1 */
    public static final C11446a m44434p1(@C12579k C11446a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C11446a.f28574d.mo23002a(aVar.mo23000w(), aVar.mo22998r(), -aVar.mo23001y());
    }

    @C11314h(name = "byteRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: q */
    public static final boolean m44435q(@C12579k C11475r<Byte> rVar, short s) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Byte H1 = m44333H1(s);
        if (H1 != null) {
            return rVar.mo23006e(H1);
        }
        return false;
    }

    @C12579k
    /* renamed from: q0 */
    public static final C11468m m44436q0(int i, long j) {
        return C11468m.f28604d.mo23070a((long) i, j, -1);
    }

    @C12579k
    /* renamed from: q1 */
    public static final C11463j m44437q1(@C12579k C11463j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return C11463j.f28594d.mo23053a(jVar.mo23051w(), jVar.mo23049r(), -jVar.mo23052y());
    }

    /* renamed from: r */
    public static final byte m44438r(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    @C12579k
    /* renamed from: r0 */
    public static final C11468m m44439r0(long j, byte b) {
        return C11468m.f28604d.mo23070a(j, (long) b, -1);
    }

    @C12579k
    /* renamed from: r1 */
    public static final C11468m m44440r1(@C12579k C11468m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return C11468m.f28604d.mo23070a(mVar.mo23068w(), mVar.mo23066r(), -mVar.mo23069y());
    }

    /* renamed from: s */
    public static final double m44441s(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    @C12579k
    /* renamed from: s0 */
    public static final C11468m m44442s0(long j, int i) {
        return C11468m.f28604d.mo23070a(j, (long) i, -1);
    }

    @C11314h(name = "shortRangeContains")
    /* renamed from: s1 */
    public static final boolean m44443s1(@C12579k C11459g<Short> gVar, byte b) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.mo23006e(Short.valueOf((short) b));
    }

    /* renamed from: t */
    public static final float m44444t(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    @C12579k
    /* renamed from: t0 */
    public static final C11468m m44445t0(long j, long j2) {
        return C11468m.f28604d.mo23070a(j, j2, -1);
    }

    @C11395k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @C11398l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @C11314h(name = "shortRangeContains")
    /* renamed from: t1 */
    public static final /* synthetic */ boolean m44446t1(C11459g gVar, double d) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short N1 = m44351N1(d);
        if (N1 != null) {
            return gVar.mo23006e(N1);
        }
        return false;
    }

    /* renamed from: u */
    public static final int m44447u(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    @C12579k
    /* renamed from: u0 */
    public static final C11468m m44448u0(long j, short s) {
        return C11468m.f28604d.mo23070a(j, (long) s, -1);
    }

    @C11395k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @C11398l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @C11314h(name = "shortRangeContains")
    /* renamed from: u1 */
    public static final /* synthetic */ boolean m44449u1(C11459g gVar, float f) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short O1 = m44354O1(f);
        if (O1 != null) {
            return gVar.mo23006e(O1);
        }
        return false;
    }

    /* renamed from: v */
    public static final long m44450v(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    @C12579k
    /* renamed from: v0 */
    public static final C11468m m44451v0(short s, long j) {
        return C11468m.f28604d.mo23070a((long) s, j, -1);
    }

    @C11314h(name = "shortRangeContains")
    /* renamed from: v1 */
    public static final boolean m44452v1(@C12579k C11459g<Short> gVar, int i) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short P1 = m44357P1(i);
        if (P1 != null) {
            return gVar.mo23006e(P1);
        }
        return false;
    }

    @C12579k
    /* renamed from: w */
    public static final <T extends Comparable<? super T>> T m44453w(@C12579k T t, @C12579k T t2) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(t2, "minimumValue");
        if (t.compareTo(t2) < 0) {
            return t2;
        }
        return t;
    }

    @C11665v0(version = "1.7")
    /* renamed from: w0 */
    public static final char m44454w0(@C12579k C11446a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.mo22998r();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @C11314h(name = "shortRangeContains")
    /* renamed from: w1 */
    public static final boolean m44455w1(@C12579k C11459g<Short> gVar, long j) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Short Q1 = m44360Q1(j);
        if (Q1 != null) {
            return gVar.mo23006e(Q1);
        }
        return false;
    }

    /* renamed from: x */
    public static final short m44456x(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    @C11665v0(version = "1.7")
    /* renamed from: x0 */
    public static final int m44457x0(@C12579k C11463j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.mo23049r();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @C11314h(name = "shortRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: x1 */
    public static final boolean m44458x1(@C12579k C11475r<Short> rVar, byte b) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return rVar.mo23006e(Short.valueOf((short) b));
    }

    /* renamed from: y */
    public static final byte m44459y(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    @C11665v0(version = "1.7")
    /* renamed from: y0 */
    public static final long m44460y0(@C12579k C11468m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.mo23066r();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @C11314h(name = "shortRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: y1 */
    public static final boolean m44461y1(@C12579k C11475r<Short> rVar, int i) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Short P1 = m44357P1(i);
        if (P1 != null) {
            return rVar.mo23006e(P1);
        }
        return false;
    }

    /* renamed from: z */
    public static final double m44462z(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: z0 */
    public static final Character m44463z0(@C12579k C11446a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.mo22998r());
    }

    @C11314h(name = "shortRangeContains")
    @C11429q
    @C11665v0(version = "1.7")
    /* renamed from: z1 */
    public static final boolean m44464z1(@C12579k C11475r<Short> rVar, long j) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Short Q1 = m44360Q1(j);
        if (Q1 != null) {
            return rVar.mo23006e(Q1);
        }
        return false;
    }
}
