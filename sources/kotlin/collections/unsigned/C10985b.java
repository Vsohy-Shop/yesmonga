package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.C10857a2;
import kotlin.C11093f2;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11400l1;
import kotlin.C11403m0;
import kotlin.C11404m1;
import kotlin.C11419p1;
import kotlin.C11431q1;
import kotlin.C11531s;
import kotlin.C11587t0;
import kotlin.C11588t1;
import kotlin.C11662u1;
import kotlin.C11665v0;
import kotlin.C11679z1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10904b;
import kotlin.collections.C10953k0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.unsigned.b */
public class C10985b {

    /* renamed from: kotlin.collections.unsigned.b$a */
    public static final class C10986a extends C10904b<C11419p1> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ int[] f28194b;

        public C10986a(int[] iArr) {
            this.f28194b = iArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof C11419p1)) {
                return false;
            }
            return mo22406h(((C11419p1) obj).mo22930j2());
        }

        /* renamed from: e */
        public int mo15650e() {
            return C11431q1.m44045X(this.f28194b);
        }

        public /* bridge */ /* synthetic */ Object get(int i) {
            return C11419p1.m43993g(mo22407i(i));
        }

        /* renamed from: h */
        public boolean mo22406h(int i) {
            return C11431q1.m44055w(this.f28194b, i);
        }

        /* renamed from: i */
        public int mo22407i(int i) {
            return C11431q1.m44044Q(this.f28194b, i);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof C11419p1)) {
                return -1;
            }
            return mo22408q(((C11419p1) obj).mo22930j2());
        }

        public boolean isEmpty() {
            return C11431q1.m44049h0(this.f28194b);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof C11419p1)) {
                return -1;
            }
            return mo22409r(((C11419p1) obj).mo22930j2());
        }

        /* renamed from: q */
        public int mo22408q(int i) {
            return ArraysKt___ArraysKt.m39844hg(this.f28194b, i);
        }

        /* renamed from: r */
        public int mo22409r(int i) {
            return ArraysKt___ArraysKt.m39969li(this.f28194b, i);
        }
    }

    /* renamed from: kotlin.collections.unsigned.b$b */
    public static final class C10987b extends C10904b<C11588t1> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ long[] f28195b;

        public C10987b(long[] jArr) {
            this.f28195b = jArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof C11588t1)) {
                return false;
            }
            return mo22410h(((C11588t1) obj).mo23301j2());
        }

        /* renamed from: e */
        public int mo15650e() {
            return C11662u1.m45751X(this.f28195b);
        }

        public /* bridge */ /* synthetic */ Object get(int i) {
            return C11588t1.m44992g(mo22411i(i));
        }

        /* renamed from: h */
        public boolean mo22410h(long j) {
            return C11662u1.m45761w(this.f28195b, j);
        }

        /* renamed from: i */
        public long mo22411i(int i) {
            return C11662u1.m45750Q(this.f28195b, i);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof C11588t1)) {
                return -1;
            }
            return mo22412q(((C11588t1) obj).mo23301j2());
        }

        public boolean isEmpty() {
            return C11662u1.m45755h0(this.f28195b);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof C11588t1)) {
                return -1;
            }
            return mo22413r(((C11588t1) obj).mo23301j2());
        }

        /* renamed from: q */
        public int mo22412q(long j) {
            return ArraysKt___ArraysKt.m39875ig(this.f28195b, j);
        }

        /* renamed from: r */
        public int mo22413r(long j) {
            return ArraysKt___ArraysKt.m40000mi(this.f28195b, j);
        }
    }

    /* renamed from: kotlin.collections.unsigned.b$c */
    public static final class C10988c extends C10904b<C11400l1> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ byte[] f28196b;

        public C10988c(byte[] bArr) {
            this.f28196b = bArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof C11400l1)) {
                return false;
            }
            return mo22414h(((C11400l1) obj).mo22897e2());
        }

        /* renamed from: e */
        public int mo15650e() {
            return C11404m1.m43809X(this.f28196b);
        }

        public /* bridge */ /* synthetic */ Object get(int i) {
            return C11400l1.m43782g(mo22415i(i));
        }

        /* renamed from: h */
        public boolean mo22414h(byte b) {
            return C11404m1.m43819w(this.f28196b, b);
        }

        /* renamed from: i */
        public byte mo22415i(int i) {
            return C11404m1.m43808Q(this.f28196b, i);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof C11400l1)) {
                return -1;
            }
            return mo22416q(((C11400l1) obj).mo22897e2());
        }

        public boolean isEmpty() {
            return C11404m1.m43813h0(this.f28196b);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof C11400l1)) {
                return -1;
            }
            return mo22417r(((C11400l1) obj).mo22897e2());
        }

        /* renamed from: q */
        public int mo22416q(byte b) {
            return ArraysKt___ArraysKt.m39716dg(this.f28196b, b);
        }

        /* renamed from: r */
        public int mo22417r(byte b) {
            return ArraysKt___ArraysKt.m39846hi(this.f28196b, b);
        }
    }

    /* renamed from: kotlin.collections.unsigned.b$d */
    public static final class C10989d extends C10904b<C11679z1> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ short[] f28197b;

        public C10989d(short[] sArr) {
            this.f28197b = sArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof C11679z1)) {
                return false;
            }
            return mo22418h(((C11679z1) obj).mo23548e2());
        }

        /* renamed from: e */
        public int mo15650e() {
            return C10857a2.m38727X(this.f28197b);
        }

        public /* bridge */ /* synthetic */ Object get(int i) {
            return C11679z1.m45862g(mo22419i(i));
        }

        /* renamed from: h */
        public boolean mo22418h(short s) {
            return C10857a2.m38737w(this.f28197b, s);
        }

        /* renamed from: i */
        public short mo22419i(int i) {
            return C10857a2.m38726Q(this.f28197b, i);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof C11679z1)) {
                return -1;
            }
            return mo22420q(((C11679z1) obj).mo23548e2());
        }

        public boolean isEmpty() {
            return C10857a2.m38731h0(this.f28197b);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof C11679z1)) {
                return -1;
            }
            return mo22421r(((C11679z1) obj).mo23548e2());
        }

        /* renamed from: q */
        public int mo22420q(short s) {
            return ArraysKt___ArraysKt.m39936kg(this.f28197b, s);
        }

        /* renamed from: r */
        public int mo22421r(short s) {
            return ArraysKt___ArraysKt.m40062oi(this.f28197b, s);
        }
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: A */
    public static final /* synthetic */ C11679z1 m42259A(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m41713M6(sArr, comparator);
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: B */
    public static final /* synthetic */ C11588t1 m42260B(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m41726N6(jArr, comparator);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: G */
    public static final /* synthetic */ <R extends Comparable<? super R>> C11400l1 m42265G(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re != 0) {
            Comparable comparable = (Comparable) lVar.invoke(C11400l1.m43782g(Q));
            C10953k0 H = new C11466l(1, Re).iterator();
            while (H.hasNext()) {
                byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11400l1.m43782g(Q2));
                if (comparable.compareTo(comparable2) > 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
        }
        return C11400l1.m43782g(Q);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: H */
    public static final /* synthetic */ <R extends Comparable<? super R>> C11588t1 m42266H(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We != 0) {
            Comparable comparable = (Comparable) lVar.invoke(C11588t1.m44992g(Q));
            C10953k0 H = new C11466l(1, We).iterator();
            while (H.hasNext()) {
                long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11588t1.m44992g(Q2));
                if (comparable.compareTo(comparable2) > 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
        }
        return C11588t1.m44992g(Q);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: I */
    public static final /* synthetic */ <R extends Comparable<? super R>> C11419p1 m42267I(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve != 0) {
            Comparable comparable = (Comparable) lVar.invoke(C11419p1.m43993g(Q));
            C10953k0 H = new C11466l(1, Ve).iterator();
            while (H.hasNext()) {
                int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11419p1.m43993g(Q2));
                if (comparable.compareTo(comparable2) > 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
        }
        return C11419p1.m43993g(Q);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: J */
    public static final /* synthetic */ <R extends Comparable<? super R>> C11679z1 m42268J(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye != 0) {
            Comparable comparable = (Comparable) lVar.invoke(C11679z1.m45862g(Q));
            C10953k0 H = new C11466l(1, Ye).iterator();
            while (H.hasNext()) {
                short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11679z1.m45862g(Q2));
                if (comparable.compareTo(comparable2) > 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
        }
        return C11679z1.m45862g(Q);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: K */
    public static final /* synthetic */ C11400l1 m42269K(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m41740O7(bArr, comparator);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: L */
    public static final /* synthetic */ C11419p1 m42270L(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m41753P7(iArr, comparator);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: M */
    public static final /* synthetic */ C11679z1 m42271M(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m41766Q7(sArr, comparator);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: N */
    public static final /* synthetic */ C11588t1 m42272N(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m41779R7(jArr, comparator);
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: O */
    public static final BigDecimal m42273O(byte[] bArr, C11300l<? super C11400l1, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: P */
    public static final BigDecimal m42274P(int[] iArr, C11300l<? super C11419p1, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Q */
    public static final BigDecimal m42275Q(long[] jArr, C11300l<? super C11588t1, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: R */
    public static final BigDecimal m42276R(short[] sArr, C11300l<? super C11679z1, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: S */
    public static final BigInteger m42277S(byte[] bArr, C11300l<? super C11400l1, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(C11400l1.m43782g(C11404m1.m43808Q(bArr, i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: T */
    public static final BigInteger m42278T(int[] iArr, C11300l<? super C11419p1, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int X = C11431q1.m44045X(iArr);
        for (int i = 0; i < X; i++) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(C11419p1.m43993g(C11431q1.m44044Q(iArr, i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: U */
    public static final BigInteger m42279U(long[] jArr, C11300l<? super C11588t1, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(C11588t1.m44992g(C11662u1.m45750Q(jArr, i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11531s
    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: V */
    public static final BigInteger m42280V(short[] sArr, C11300l<? super C11679z1, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$sumOf");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(C11679z1.m45862g(C10857a2.m38726Q(sArr, i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: a */
    public static final List<C11419p1> m42281a(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$this$asList");
        return new C10986a(iArr);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: b */
    public static final List<C11400l1> m42282b(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$this$asList");
        return new C10988c(bArr);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: c */
    public static final List<C11588t1> m42283c(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$this$asList");
        return new C10987b(jArr);
    }

    @C11531s
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: d */
    public static final List<C11679z1> m42284d(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$this$asList");
        return new C10989d(sArr);
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: e */
    public static final int m42285e(@C12579k int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "$this$binarySearch");
        C10904b.f28138a.mo22058d(i2, i3, C11431q1.m44045X(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int c = C11093f2.m42714c(iArr[i5], i);
            if (c < 0) {
                i2 = i5 + 1;
            } else if (c <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: f */
    public static /* synthetic */ int m42286f(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = C11431q1.m44045X(iArr);
        }
        return m42285e(iArr, i, i2, i3);
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: g */
    public static final int m42287g(@C12579k short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "$this$binarySearch");
        C10904b.f28138a.mo22058d(i, i2, C10857a2.m38727X(sArr));
        short s2 = s & C11679z1.f28988d;
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int c = C11093f2.m42714c(sArr[i4], s2);
            if (c < 0) {
                i = i4 + 1;
            } else if (c <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: h */
    public static /* synthetic */ int m42288h(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C10857a2.m38727X(sArr);
        }
        return m42287g(sArr, s, i, i2);
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: i */
    public static final int m42289i(@C12579k long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "$this$binarySearch");
        C10904b.f28138a.mo22058d(i, i2, C11662u1.m45751X(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int g = C11093f2.m42718g(jArr[i4], j);
            if (g < 0) {
                i = i4 + 1;
            } else if (g <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: j */
    public static /* synthetic */ int m42290j(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C11662u1.m45751X(jArr);
        }
        return m42289i(jArr, j, i, i2);
    }

    @C11531s
    @C11665v0(version = "1.3")
    /* renamed from: k */
    public static final int m42291k(@C12579k byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "$this$binarySearch");
        C10904b.f28138a.mo22058d(i, i2, C11404m1.m43809X(bArr));
        byte b2 = b & 255;
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int c = C11093f2.m42714c(bArr[i4], b2);
            if (c < 0) {
                i = i4 + 1;
            } else if (c <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: l */
    public static /* synthetic */ int m42292l(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C11404m1.m43809X(bArr);
        }
        return m42291k(bArr, b, i, i2);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: m */
    public static final byte m42293m(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "$this$elementAt");
        return C11404m1.m43808Q(bArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: n */
    public static final short m42294n(short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "$this$elementAt");
        return C10857a2.m38726Q(sArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: o */
    public static final int m42295o(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "$this$elementAt");
        return C11431q1.m44044Q(iArr, i);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: p */
    public static final long m42296p(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "$this$elementAt");
        return C11662u1.m45750Q(jArr, i);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: u */
    public static final /* synthetic */ <R extends Comparable<? super R>> C11400l1 m42301u(byte[] bArr, C11300l<? super C11400l1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11404m1.m43813h0(bArr)) {
            return null;
        }
        byte Q = C11404m1.m43808Q(bArr, 0);
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re != 0) {
            Comparable comparable = (Comparable) lVar.invoke(C11400l1.m43782g(Q));
            C10953k0 H = new C11466l(1, Re).iterator();
            while (H.hasNext()) {
                byte Q2 = C11404m1.m43808Q(bArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11400l1.m43782g(Q2));
                if (comparable.compareTo(comparable2) < 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
        }
        return C11400l1.m43782g(Q);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: v */
    public static final /* synthetic */ <R extends Comparable<? super R>> C11588t1 m42302v(long[] jArr, C11300l<? super C11588t1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "$this$maxBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11662u1.m45755h0(jArr)) {
            return null;
        }
        long Q = C11662u1.m45750Q(jArr, 0);
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We != 0) {
            Comparable comparable = (Comparable) lVar.invoke(C11588t1.m44992g(Q));
            C10953k0 H = new C11466l(1, We).iterator();
            while (H.hasNext()) {
                long Q2 = C11662u1.m45750Q(jArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11588t1.m44992g(Q2));
                if (comparable.compareTo(comparable2) < 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
        }
        return C11588t1.m44992g(Q);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: w */
    public static final /* synthetic */ <R extends Comparable<? super R>> C11419p1 m42303w(int[] iArr, C11300l<? super C11419p1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C11431q1.m44049h0(iArr)) {
            return null;
        }
        int Q = C11431q1.m44044Q(iArr, 0);
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve != 0) {
            Comparable comparable = (Comparable) lVar.invoke(C11419p1.m43993g(Q));
            C10953k0 H = new C11466l(1, Ve).iterator();
            while (H.hasNext()) {
                int Q2 = C11431q1.m44044Q(iArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11419p1.m43993g(Q2));
                if (comparable.compareTo(comparable2) < 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
        }
        return C11419p1.m43993g(Q);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: x */
    public static final /* synthetic */ <R extends Comparable<? super R>> C11679z1 m42304x(short[] sArr, C11300l<? super C11679z1, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "$this$maxBy");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (C10857a2.m38731h0(sArr)) {
            return null;
        }
        short Q = C10857a2.m38726Q(sArr, 0);
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye != 0) {
            Comparable comparable = (Comparable) lVar.invoke(C11679z1.m45862g(Q));
            C10953k0 H = new C11466l(1, Ye).iterator();
            while (H.hasNext()) {
                short Q2 = C10857a2.m38726Q(sArr, H.mo6374c());
                Comparable comparable2 = (Comparable) lVar.invoke(C11679z1.m45862g(Q2));
                if (comparable.compareTo(comparable2) < 0) {
                    Q = Q2;
                    comparable = comparable2;
                }
            }
        }
        return C11679z1.m45862g(Q);
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: y */
    public static final /* synthetic */ C11400l1 m42305y(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m41687K6(bArr, comparator);
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11531s
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11665v0(version = "1.3")
    /* renamed from: z */
    public static final /* synthetic */ C11419p1 m42306z(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m41700L6(iArr, comparator);
    }
}
