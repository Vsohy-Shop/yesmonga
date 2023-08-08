package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11403m0;
import kotlin.C11532s0;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.internal.C11112h;
import kotlin.internal.C11125m;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n14166#2,14:3421\n14189#2,14:3435\n14212#2,14:3449\n14235#2,14:3463\n14258#2,14:3477\n14281#2,14:3491\n14304#2,14:3505\n14327#2,14:3519\n14350#2,14:3533\n16752#2,14:3547\n16775#2,14:3561\n16798#2,14:3575\n16821#2,14:3589\n16844#2,14:3603\n16867#2,14:3617\n16890#2,14:3631\n16913#2,14:3645\n16936#2,14:3659\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2812#1:3421,14\n2819#1:3435,14\n2826#1:3449,14\n2833#1:3463,14\n2840#1:3477,14\n2847#1:3491,14\n2854#1:3505,14\n2861#1:3519,14\n2868#1:3533,14\n3010#1:3547,14\n3017#1:3561,14\n3024#1:3575,14\n3031#1:3589,14\n3038#1:3603,14\n3045#1:3617,14\n3052#1:3631,14\n3059#1:3645,14\n3066#1:3659,14\n*E\n"})
/* renamed from: kotlin.collections.m */
public class C10956m extends C10954l {

    /* renamed from: kotlin.collections.m$a */
    public static final class C10957a extends C10904b<Byte> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ byte[] f28181b;

        public C10957a(byte[] bArr) {
            this.f28181b = bArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            return mo22333h(((Number) obj).byteValue());
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28181b.length;
        }

        /* renamed from: h */
        public boolean mo22333h(byte b) {
            return ArraysKt___ArraysKt.m39196N8(this.f28181b, b);
        }

        @C12579k
        /* renamed from: i */
        public Byte get(int i) {
            return Byte.valueOf(this.f28181b[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return mo22335q(((Number) obj).byteValue());
        }

        public boolean isEmpty() {
            return this.f28181b.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return mo22336r(((Number) obj).byteValue());
        }

        /* renamed from: q */
        public int mo22335q(byte b) {
            return ArraysKt___ArraysKt.m39716dg(this.f28181b, b);
        }

        /* renamed from: r */
        public int mo22336r(byte b) {
            return ArraysKt___ArraysKt.m39846hi(this.f28181b, b);
        }
    }

    /* renamed from: kotlin.collections.m$b */
    public static final class C10958b extends C10904b<Short> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ short[] f28182b;

        public C10958b(short[] sArr) {
            this.f28182b = sArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Short)) {
                return false;
            }
            return mo22337h(((Number) obj).shortValue());
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28182b.length;
        }

        /* renamed from: h */
        public boolean mo22337h(short s) {
            return ArraysKt___ArraysKt.m39420U8(this.f28182b, s);
        }

        @C12579k
        /* renamed from: i */
        public Short get(int i) {
            return Short.valueOf(this.f28182b[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return mo22339q(((Number) obj).shortValue());
        }

        public boolean isEmpty() {
            return this.f28182b.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return mo22340r(((Number) obj).shortValue());
        }

        /* renamed from: q */
        public int mo22339q(short s) {
            return ArraysKt___ArraysKt.m39936kg(this.f28182b, s);
        }

        /* renamed from: r */
        public int mo22340r(short s) {
            return ArraysKt___ArraysKt.m40062oi(this.f28182b, s);
        }
    }

    /* renamed from: kotlin.collections.m$c */
    public static final class C10959c extends C10904b<Integer> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ int[] f28183b;

        public C10959c(int[] iArr) {
            this.f28183b = iArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return mo22341h(((Number) obj).intValue());
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28183b.length;
        }

        /* renamed from: h */
        public boolean mo22341h(int i) {
            return ArraysKt___ArraysKt.m39324R8(this.f28183b, i);
        }

        @C12579k
        /* renamed from: i */
        public Integer get(int i) {
            return Integer.valueOf(this.f28183b[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return mo22343q(((Number) obj).intValue());
        }

        public boolean isEmpty() {
            return this.f28183b.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return mo22344r(((Number) obj).intValue());
        }

        /* renamed from: q */
        public int mo22343q(int i) {
            return ArraysKt___ArraysKt.m39844hg(this.f28183b, i);
        }

        /* renamed from: r */
        public int mo22344r(int i) {
            return ArraysKt___ArraysKt.m39969li(this.f28183b, i);
        }
    }

    /* renamed from: kotlin.collections.m$d */
    public static final class C10960d extends C10904b<Long> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ long[] f28184b;

        public C10960d(long[] jArr) {
            this.f28184b = jArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return mo22345h(((Number) obj).longValue());
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28184b.length;
        }

        /* renamed from: h */
        public boolean mo22345h(long j) {
            return ArraysKt___ArraysKt.m39356S8(this.f28184b, j);
        }

        @C12579k
        /* renamed from: i */
        public Long get(int i) {
            return Long.valueOf(this.f28184b[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return mo22347q(((Number) obj).longValue());
        }

        public boolean isEmpty() {
            return this.f28184b.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return mo22348r(((Number) obj).longValue());
        }

        /* renamed from: q */
        public int mo22347q(long j) {
            return ArraysKt___ArraysKt.m39875ig(this.f28184b, j);
        }

        /* renamed from: r */
        public int mo22348r(long j) {
            return ArraysKt___ArraysKt.m40000mi(this.f28184b, j);
        }
    }

    @C11363r0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n12794#2,2:3421\n1687#2,6:3423\n1795#2,6:3429\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3421,2\n201#1:3423,6\n202#1:3429,6\n*E\n"})
    /* renamed from: kotlin.collections.m$e */
    public static final class C10961e extends C10904b<Float> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ float[] f28185b;

        public C10961e(float[] fArr) {
            this.f28185b = fArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Float)) {
                return false;
            }
            return mo22349h(((Number) obj).floatValue());
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28185b.length;
        }

        /* renamed from: h */
        public boolean mo22349h(float f) {
            boolean z;
            for (float floatToIntBits : this.f28185b) {
                if (Float.floatToIntBits(floatToIntBits) == Float.floatToIntBits(f)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        @C12579k
        /* renamed from: i */
        public Float get(int i) {
            return Float.valueOf(this.f28185b[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return mo22351q(((Number) obj).floatValue());
        }

        public boolean isEmpty() {
            return this.f28185b.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return mo22352r(((Number) obj).floatValue());
        }

        /* renamed from: q */
        public int mo22351q(float f) {
            boolean z;
            float[] fArr = this.f28185b;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: r */
        public int mo22352r(float f) {
            boolean z;
            float[] fArr = this.f28185b;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    @C11363r0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n12804#2,2:3421\n1699#2,6:3423\n1807#2,6:3429\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3421,2\n215#1:3423,6\n216#1:3429,6\n*E\n"})
    /* renamed from: kotlin.collections.m$f */
    public static final class C10962f extends C10904b<Double> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ double[] f28186b;

        public C10962f(double[] dArr) {
            this.f28186b = dArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Double)) {
                return false;
            }
            return mo22353h(((Number) obj).doubleValue());
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28186b.length;
        }

        /* renamed from: h */
        public boolean mo22353h(double d) {
            boolean z;
            for (double doubleToLongBits : this.f28186b) {
                if (Double.doubleToLongBits(doubleToLongBits) == Double.doubleToLongBits(d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        @C12579k
        /* renamed from: i */
        public Double get(int i) {
            return Double.valueOf(this.f28186b[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return mo22355q(((Number) obj).doubleValue());
        }

        public boolean isEmpty() {
            return this.f28186b.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return mo22356r(((Number) obj).doubleValue());
        }

        /* renamed from: q */
        public int mo22355q(double d) {
            boolean z;
            double[] dArr = this.f28186b;
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: r */
        public int mo22356r(double d) {
            boolean z;
            double[] dArr = this.f28186b;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* renamed from: kotlin.collections.m$g */
    public static final class C10963g extends C10904b<Boolean> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ boolean[] f28187b;

        public C10963g(boolean[] zArr) {
            this.f28187b = zArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return mo22357h(((Boolean) obj).booleanValue());
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28187b.length;
        }

        /* renamed from: h */
        public boolean mo22357h(boolean z) {
            return ArraysKt___ArraysKt.m39452V8(this.f28187b, z);
        }

        @C12579k
        /* renamed from: i */
        public Boolean get(int i) {
            return Boolean.valueOf(this.f28187b[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return mo22359q(((Boolean) obj).booleanValue());
        }

        public boolean isEmpty() {
            return this.f28187b.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return mo22360r(((Boolean) obj).booleanValue());
        }

        /* renamed from: q */
        public int mo22359q(boolean z) {
            return ArraysKt___ArraysKt.m39967lg(this.f28187b, z);
        }

        /* renamed from: r */
        public int mo22360r(boolean z) {
            return ArraysKt___ArraysKt.m40093pi(this.f28187b, z);
        }
    }

    /* renamed from: kotlin.collections.m$h */
    public static final class C10964h extends C10904b<Character> implements RandomAccess {

        /* renamed from: b */
        public final /* synthetic */ char[] f28188b;

        public C10964h(char[] cArr) {
            this.f28188b = cArr;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Character)) {
                return false;
            }
            return mo22361h(((Character) obj).charValue());
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28188b.length;
        }

        /* renamed from: h */
        public boolean mo22361h(char c) {
            return ArraysKt___ArraysKt.m39228O8(this.f28188b, c);
        }

        @C12579k
        /* renamed from: i */
        public Character get(int i) {
            return Character.valueOf(this.f28188b[i]);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return mo22363q(((Character) obj).charValue());
        }

        public boolean isEmpty() {
            return this.f28188b.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return mo22364r(((Character) obj).charValue());
        }

        /* renamed from: q */
        public int mo22363q(char c) {
            return ArraysKt___ArraysKt.m39748eg(this.f28188b, c);
        }

        /* renamed from: r */
        public int mo22364r(char c) {
            return ArraysKt___ArraysKt.m39877ii(this.f28188b, c);
        }
    }

    /* renamed from: A */
    public static final int m41014A(@C12579k int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return Arrays.binarySearch(iArr, i2, i3, i);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: A0 */
    public static final int m41015A0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @C11110f
    /* renamed from: A1 */
    public static final <T> T[] m41016A1(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C12579k
    /* renamed from: A2 */
    public static final <C extends Collection<? super R>, R> C m41017A2(@C12579k Object[] objArr, @C12579k C c, @C12579k Class<R> cls) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(cls, "klass");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: A3 */
    public static final /* synthetic */ Float m41018A3(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39756eo(fArr, comparator);
    }

    /* renamed from: A4 */
    public static /* synthetic */ void m41019A4(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        m41234k4(cArr, i, i2);
    }

    /* renamed from: B */
    public static final int m41020B(@C12579k long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return Arrays.binarySearch(jArr, i, i2, j);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: B0 */
    public static final <T> int m41021B0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @C11110f
    /* renamed from: B1 */
    public static final <T> T[] m41022B1(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] copyOf = Arrays.copyOf(tArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: B3 */
    public static final /* synthetic */ Integer m41024B3(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39788fo(iArr, comparator);
    }

    /* renamed from: B4 */
    public static /* synthetic */ void m41025B4(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        m41246m4(dArr, i, i2);
    }

    /* renamed from: C */
    public static final <T> int m41026C(@C12579k T[] tArr, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return Arrays.binarySearch(tArr, i, i2, t);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: C0 */
    public static final int m41027C0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @C11110f
    /* renamed from: C1 */
    public static final short[] m41028C1(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: C3 */
    public static final /* synthetic */ Long m41030C3(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39820go(jArr, comparator);
    }

    /* renamed from: C4 */
    public static /* synthetic */ void m41031C4(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        m41260o4(fArr, i, i2);
    }

    /* renamed from: D */
    public static final <T> int m41032D(@C12579k T[] tArr, T t, @C12579k Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: D0 */
    public static final int m41033D0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @C11110f
    /* renamed from: D1 */
    public static final short[] m41034D1(short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: D3 */
    public static final /* synthetic */ Object m41036D3(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39852ho(objArr, comparator);
    }

    /* renamed from: D4 */
    public static /* synthetic */ void m41037D4(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        m41274q4(iArr, i, i2);
    }

    /* renamed from: E */
    public static final int m41038E(@C12579k short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return Arrays.binarySearch(sArr, i, i2, s);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: E0 */
    public static final /* synthetic */ String m41039E0(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String arrays = Arrays.toString(bArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    /* renamed from: E1 */
    public static final boolean[] m41040E1(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: E3 */
    public static final /* synthetic */ Short m41042E3(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39883io(sArr, comparator);
    }

    /* renamed from: E4 */
    public static /* synthetic */ void m41043E4(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        m41288s4(jArr, i, i2);
    }

    /* renamed from: F */
    public static /* synthetic */ int m41044F(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return m41310w(bArr, b, i, i2);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: F0 */
    public static final /* synthetic */ String m41045F0(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        String arrays = Arrays.toString(cArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    /* renamed from: F1 */
    public static final boolean[] m41046F1(boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @C12579k
    /* renamed from: F3 */
    public static final byte[] m41048F3(@C12579k byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + 1);
        copyOf[length] = b;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    /* renamed from: F4 */
    public static /* synthetic */ void m41049F4(Comparable[] comparableArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        m41302u4(comparableArr, i, i2);
    }

    /* renamed from: G */
    public static /* synthetic */ int m41050G(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return m41316x(cArr, c, i, i2);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: G0 */
    public static final /* synthetic */ String m41051G0(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        String arrays = Arrays.toString(dArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: G1 */
    public static final byte[] m41052G1(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C10952k.m40999c(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C12579k
    /* renamed from: G3 */
    public static final byte[] m41054G3(@C12579k byte[] bArr, @C12579k Collection<Byte> collection) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, collection.size() + length);
        for (Byte byteValue : collection) {
            copyOf[length] = byteValue.byteValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    /* renamed from: G4 */
    public static /* synthetic */ void m41055G4(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        m41315w4(objArr, i, i2);
    }

    /* renamed from: H */
    public static /* synthetic */ int m41056H(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return m41322y(dArr, d, i, i2);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: H0 */
    public static final /* synthetic */ String m41057H0(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        String arrays = Arrays.toString(fArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: H1 */
    public static final char[] m41058H1(@C12579k char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        C10952k.m40999c(i2, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C12579k
    /* renamed from: H3 */
    public static final byte[] m41060H3(@C12579k byte[] bArr, @C12579k byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    /* renamed from: H4 */
    public static /* synthetic */ void m41061H4(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        m41327y4(sArr, i, i2);
    }

    /* renamed from: I */
    public static /* synthetic */ int m41062I(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return m41328z(fArr, f, i, i2);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: I0 */
    public static final /* synthetic */ String m41063I0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        String arrays = Arrays.toString(iArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: I1 */
    public static final double[] m41064I1(@C12579k double[] dArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        C10952k.m40999c(i2, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C12579k
    /* renamed from: I3 */
    public static final char[] m41066I3(@C12579k char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, length + 1);
        copyOf[length] = c;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    /* renamed from: I4 */
    public static final <T> void m41067I4(@C12579k T[] tArr, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: J */
    public static /* synthetic */ int m41068J(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return m41014A(iArr, i, i2, i3);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: J0 */
    public static final /* synthetic */ String m41069J0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        String arrays = Arrays.toString(jArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: J1 */
    public static final float[] m41070J1(@C12579k float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        C10952k.m40999c(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C12579k
    /* renamed from: J3 */
    public static final char[] m41072J3(@C12579k char[] cArr, @C12579k Collection<Character> collection) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, collection.size() + length);
        for (Character charValue : collection) {
            copyOf[length] = charValue.charValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    /* renamed from: J4 */
    public static final <T> void m41073J4(@C12579k T[] tArr, @C12579k Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    /* renamed from: K */
    public static /* synthetic */ int m41074K(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return m41020B(jArr, j, i, i2);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: K0 */
    public static final /* synthetic */ <T> String m41075K0(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        String arrays = Arrays.toString(tArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: K1 */
    public static final int[] m41076K1(@C12579k int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        C10952k.m40999c(i2, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C12579k
    /* renamed from: K3 */
    public static final char[] m41078K3(@C12579k char[] cArr, @C12579k char[] cArr2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    /* renamed from: K4 */
    public static /* synthetic */ void m41079K4(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m41073J4(objArr, comparator, i, i2);
    }

    /* renamed from: L */
    public static /* synthetic */ int m41080L(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return m41026C(objArr, obj, i, i2);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: L0 */
    public static final /* synthetic */ String m41081L0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        String arrays = Arrays.toString(sArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: L1 */
    public static final long[] m41082L1(@C12579k long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        C10952k.m40999c(i2, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: L2 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean m41083L2(boolean[] zArr, C11300l<? super Boolean, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (zArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        boolean z2 = zArr[0];
        int Ze = ArraysKt___ArraysKt.m39587Ze(zArr);
        if (Ze == 0) {
            return Boolean.valueOf(z2);
        }
        Comparable comparable = (Comparable) lVar.invoke(Boolean.valueOf(z2));
        C10953k0 H = new C11466l(1, Ze).iterator();
        while (H.hasNext()) {
            boolean z3 = zArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Boolean.valueOf(z3));
            if (comparable.compareTo(comparable2) < 0) {
                z2 = z3;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z2);
    }

    @C12579k
    /* renamed from: L3 */
    public static final double[] m41084L3(@C12579k double[] dArr, double d) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
        copyOf[length] = d;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: L4 */
    public static final BigDecimal m41085L4(byte[] bArr, C11300l<? super Byte, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (byte valueOf2 : bArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Byte.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    /* renamed from: M */
    public static /* synthetic */ int m41086M(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return m41032D(objArr, obj, comparator, i, i2);
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: M0 */
    public static final /* synthetic */ String m41087M0(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        String arrays = Arrays.toString(zArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: M1 */
    public static final <T> T[] m41088M1(@C12579k T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        C10952k.m40999c(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: M2 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte m41089M2(byte[] bArr, C11300l<? super Byte, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        byte b = bArr[0];
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re == 0) {
            return Byte.valueOf(b);
        }
        Comparable comparable = (Comparable) lVar.invoke(Byte.valueOf(b));
        C10953k0 H = new C11466l(1, Re).iterator();
        while (H.hasNext()) {
            byte b2 = bArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Byte.valueOf(b2));
            if (comparable.compareTo(comparable2) < 0) {
                b = b2;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b);
    }

    @C12579k
    /* renamed from: M3 */
    public static final double[] m41090M3(@C12579k double[] dArr, @C12579k Collection<Double> collection) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, collection.size() + length);
        for (Double doubleValue : collection) {
            copyOf[length] = doubleValue.doubleValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: M4 */
    public static final BigDecimal m41091M4(char[] cArr, C11300l<? super Character, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (char valueOf2 : cArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Character.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    /* renamed from: N */
    public static /* synthetic */ int m41092N(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return m41038E(sArr, s, i, i2);
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: N0 */
    public static final String m41093N0(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: N1 */
    public static final short[] m41094N1(@C12579k short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        C10952k.m40999c(i2, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: N2 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m41095N2(char[] cArr, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (cArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char c = cArr[0];
        int Se = ArraysKt___ArraysKt.m39363Se(cArr);
        if (Se == 0) {
            return Character.valueOf(c);
        }
        Comparable comparable = (Comparable) lVar.invoke(Character.valueOf(c));
        C10953k0 H = new C11466l(1, Se).iterator();
        while (H.hasNext()) {
            char c2 = cArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Character.valueOf(c2));
            if (comparable.compareTo(comparable2) < 0) {
                c = c2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c);
    }

    @C12579k
    /* renamed from: N3 */
    public static final double[] m41096N3(@C12579k double[] dArr, @C12579k double[] dArr2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: N4 */
    public static final BigDecimal m41097N4(double[] dArr, C11300l<? super Double, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (double valueOf2 : dArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Double.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "contentDeepEqualsInline")
    @C11665v0(version = "1.1")
    @C11112h
    /* renamed from: O */
    public static final <T> boolean m41098O(T[] tArr, T[] tArr2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(tArr2, "other");
        return C10954l.m41005g(tArr, tArr2);
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: O0 */
    public static final String m41099O0(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11314h(name = "copyOfRange")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: O1 */
    public static final boolean[] m41100O1(@C12579k boolean[] zArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        C10952k.m40999c(i2, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: O2 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Double m41101O2(double[] dArr, C11300l<? super Double, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (dArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        double d = dArr[0];
        int Te = ArraysKt___ArraysKt.m39395Te(dArr);
        if (Te == 0) {
            return Double.valueOf(d);
        }
        Comparable comparable = (Comparable) lVar.invoke(Double.valueOf(d));
        C10953k0 H = new C11466l(1, Te).iterator();
        while (H.hasNext()) {
            double d2 = dArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Double.valueOf(d2));
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
                d = d2;
            }
        }
        return Double.valueOf(d);
    }

    @C12579k
    /* renamed from: O3 */
    public static final float[] m41102O3(@C12579k float[] fArr, float f) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        copyOf[length] = f;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: O4 */
    public static final BigDecimal m41103O4(float[] fArr, C11300l<? super Float, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (float valueOf2 : fArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Float.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "contentDeepEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: P */
    public static final <T> boolean m41104P(T[] tArr, T[] tArr2) {
        if (C11125m.m42830a(1, 3, 0)) {
            return C10954l.m41005g(tArr, tArr2);
        }
        return Arrays.deepEquals(tArr, tArr2);
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: P0 */
    public static final String m41105P0(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: P1 */
    public static final byte[] m41106P1(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41052G1(bArr, i, i2);
        }
        if (i2 <= bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + bArr.length);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: P2 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Float m41107P2(float[] fArr, C11300l<? super Float, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        float f = fArr[0];
        int Ue = ArraysKt___ArraysKt.m39427Ue(fArr);
        if (Ue == 0) {
            return Float.valueOf(f);
        }
        Comparable comparable = (Comparable) lVar.invoke(Float.valueOf(f));
        C10953k0 H = new C11466l(1, Ue).iterator();
        while (H.hasNext()) {
            float f2 = fArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Float.valueOf(f2));
            if (comparable.compareTo(comparable2) < 0) {
                f = f2;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f);
    }

    @C12579k
    /* renamed from: P3 */
    public static final float[] m41108P3(@C12579k float[] fArr, @C12579k Collection<Float> collection) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, collection.size() + length);
        for (Float floatValue : collection) {
            copyOf[length] = floatValue.floatValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: P4 */
    public static final BigDecimal m41109P4(int[] iArr, C11300l<? super Integer, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int valueOf2 : iArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Integer.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "contentDeepHashCodeInline")
    @C11665v0(version = "1.1")
    @C11112h
    /* renamed from: Q */
    public static final <T> int m41110Q(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return C10952k.m40998b(tArr);
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: Q0 */
    public static final String m41111Q0(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: Q1 */
    public static final char[] m41112Q1(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41058H1(cArr, i, i2);
        }
        if (i2 <= cArr.length) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + cArr.length);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: Q2 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer m41113Q2(int[] iArr, C11300l<? super Integer, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int i = iArr[0];
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve == 0) {
            return Integer.valueOf(i);
        }
        Comparable comparable = (Comparable) lVar.invoke(Integer.valueOf(i));
        C10953k0 H = new C11466l(1, Ve).iterator();
        while (H.hasNext()) {
            int i2 = iArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Integer.valueOf(i2));
            if (comparable.compareTo(comparable2) < 0) {
                i = i2;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i);
    }

    @C12579k
    /* renamed from: Q3 */
    public static final float[] m41114Q3(@C12579k float[] fArr, @C12579k float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Q4 */
    public static final BigDecimal m41115Q4(long[] jArr, C11300l<? super Long, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (long valueOf2 : jArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Long.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "contentDeepHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: R */
    public static final <T> int m41116R(T[] tArr) {
        if (C11125m.m42830a(1, 3, 0)) {
            return C10952k.m40998b(tArr);
        }
        return Arrays.deepHashCode(tArr);
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: R0 */
    public static final String m41117R0(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: R1 */
    public static final double[] m41118R1(double[] dArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41064I1(dArr, i, i2);
        }
        if (i2 <= dArr.length) {
            double[] copyOfRange = Arrays.copyOfRange(dArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + dArr.length);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: R2 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Long m41119R2(long[] jArr, C11300l<? super Long, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (jArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        long j = jArr[0];
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We == 0) {
            return Long.valueOf(j);
        }
        Comparable comparable = (Comparable) lVar.invoke(Long.valueOf(j));
        C10953k0 H = new C11466l(1, We).iterator();
        while (H.hasNext()) {
            long j2 = jArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Long.valueOf(j2));
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
                j = j2;
            }
        }
        return Long.valueOf(j);
    }

    @C12579k
    /* renamed from: R3 */
    public static final int[] m41120R3(@C12579k int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: R4 */
    public static final <T> BigDecimal m41121R4(T[] tArr, C11300l<? super T, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (T invoke : tArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(invoke));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "contentDeepToStringInline")
    @C11665v0(version = "1.1")
    @C11112h
    /* renamed from: S */
    public static final <T> String m41122S(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return C10954l.m41006h(tArr);
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: S0 */
    public static final String m41123S0(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: S1 */
    public static final float[] m41124S1(float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41070J1(fArr, i, i2);
        }
        if (i2 <= fArr.length) {
            float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + fArr.length);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: S2 */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m41125S2(T[] tArr, C11300l<? super T, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        T t = tArr[0];
        int Xe = ArraysKt___ArraysKt.m39523Xe(tArr);
        if (Xe != 0) {
            Comparable comparable = (Comparable) lVar.invoke(t);
            C10953k0 H = new C11466l(1, Xe).iterator();
            while (H.hasNext()) {
                T t2 = tArr[H.mo6374c()];
                Comparable comparable2 = (Comparable) lVar.invoke(t2);
                if (comparable.compareTo(comparable2) < 0) {
                    t = t2;
                    comparable = comparable2;
                }
            }
        }
        return t;
    }

    @C12579k
    /* renamed from: S3 */
    public static final int[] m41126S3(@C12579k int[] iArr, @C12579k Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, collection.size() + length);
        for (Integer intValue : collection) {
            copyOf[length] = intValue.intValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: S4 */
    public static final BigDecimal m41127S4(short[] sArr, C11300l<? super Short, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (short valueOf2 : sArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Short.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "contentDeepToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: T */
    public static final <T> String m41128T(T[] tArr) {
        if (C11125m.m42830a(1, 3, 0)) {
            return C10954l.m41006h(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        Intrinsics.checkNotNullExpressionValue(deepToString, "deepToString(this)");
        return deepToString;
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: T0 */
    public static final <T> String m41129T0(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: T1 */
    public static final int[] m41130T1(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41076K1(iArr, i, i2);
        }
        if (i2 <= iArr.length) {
            int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + iArr.length);
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: T2 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Short m41131T2(short[] sArr, C11300l<? super Short, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (sArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        short s = sArr[0];
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye == 0) {
            return Short.valueOf(s);
        }
        Comparable comparable = (Comparable) lVar.invoke(Short.valueOf(s));
        C10953k0 H = new C11466l(1, Ye).iterator();
        while (H.hasNext()) {
            short s2 = sArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Short.valueOf(s2));
            if (comparable.compareTo(comparable2) < 0) {
                s = s2;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s);
    }

    @C12579k
    /* renamed from: T3 */
    public static final int[] m41132T3(@C12579k int[] iArr, @C12579k int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: T4 */
    public static final BigDecimal m41133T4(boolean[] zArr, C11300l<? super Boolean, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (boolean valueOf2 : zArr) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Boolean.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: U */
    public static final /* synthetic */ boolean m41134U(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr2, "other");
        return Arrays.equals(bArr, bArr2);
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: U0 */
    public static final String m41135U0(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: U1 */
    public static final long[] m41136U1(long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41082L1(jArr, i, i2);
        }
        if (i2 <= jArr.length) {
            long[] copyOfRange = Arrays.copyOfRange(jArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + jArr.length);
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: U2 */
    public static final /* synthetic */ Boolean m41137U2(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m38858Cl(zArr, comparator);
    }

    @C12579k
    /* renamed from: U3 */
    public static final long[] m41138U3(@C12579k long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        copyOf[length] = j;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: U4 */
    public static final BigInteger m41139U4(byte[] bArr, C11300l<? super Byte, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (byte valueOf2 : bArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Byte.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: V */
    public static final /* synthetic */ boolean m41140V(char[] cArr, char[] cArr2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr2, "other");
        return Arrays.equals(cArr, cArr2);
    }

    @C11110f
    @C11314h(name = "contentToStringNullable")
    @C11665v0(version = "1.4")
    /* renamed from: V0 */
    public static final String m41141V0(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: V1 */
    public static final <T> T[] m41142V1(T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41088M1(tArr, i, i2);
        }
        if (i2 <= tArr.length) {
            T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + tArr.length);
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: V2 */
    public static final /* synthetic */ Byte m41143V2(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m38890Dl(bArr, comparator);
    }

    @C12579k
    /* renamed from: V3 */
    public static final long[] m41144V3(@C12579k long[] jArr, @C12579k Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, collection.size() + length);
        for (Long longValue : collection) {
            copyOf[length] = longValue.longValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: V4 */
    public static final BigInteger m41145V4(char[] cArr, C11300l<? super Character, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (char valueOf2 : cArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Character.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: W */
    public static final /* synthetic */ boolean m41146W(double[] dArr, double[] dArr2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(dArr2, "other");
        return Arrays.equals(dArr, dArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: W0 */
    public static final byte[] m41147W0(@C12579k byte[] bArr, @C12579k byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: W1 */
    public static final short[] m41148W1(short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41094N1(sArr, i, i2);
        }
        if (i2 <= sArr.length) {
            short[] copyOfRange = Arrays.copyOfRange(sArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + sArr.length);
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: W2 */
    public static final /* synthetic */ Character m41149W2(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m38922El(cArr, comparator);
    }

    @C12579k
    /* renamed from: W3 */
    public static final long[] m41150W3(@C12579k long[] jArr, @C12579k long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: W4 */
    public static final BigInteger m41151W4(double[] dArr, C11300l<? super Double, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (double valueOf2 : dArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Double.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: X */
    public static final /* synthetic */ boolean m41152X(float[] fArr, float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(fArr2, "other");
        return Arrays.equals(fArr, fArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: X0 */
    public static final char[] m41153X0(@C12579k char[] cArr, @C12579k char[] cArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    @C11110f
    @C11314h(name = "copyOfRangeInline")
    /* renamed from: X1 */
    public static final boolean[] m41154X1(boolean[] zArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (C11125m.m42830a(1, 3, 0)) {
            return m41100O1(zArr, i, i2);
        }
        if (i2 <= zArr.length) {
            boolean[] copyOfRange = Arrays.copyOfRange(zArr, i, i2);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + zArr.length);
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: X2 */
    public static final /* synthetic */ Double m41155X2(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m38954Fl(dArr, comparator);
    }

    @C12579k
    /* renamed from: X3 */
    public static final <T> T[] m41156X3(@C12579k T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: X4 */
    public static final BigInteger m41157X4(float[] fArr, C11300l<? super Float, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (float valueOf2 : fArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Float.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: Y */
    public static final /* synthetic */ boolean m41158Y(int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr2, "other");
        return Arrays.equals(iArr, iArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Y0 */
    public static final double[] m41159Y0(@C12579k double[] dArr, @C12579k double[] dArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(dArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    @C11110f
    /* renamed from: Y1 */
    public static final byte m41160Y1(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[i];
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: Y2 */
    public static final /* synthetic */ Float m41161Y2(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m38986Gl(fArr, comparator);
    }

    @C12579k
    /* renamed from: Y3 */
    public static final <T> T[] m41162Y3(@C12579k T[] tArr, @C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, collection.size() + length);
        for (T t : collection) {
            copyOf[length] = t;
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Y4 */
    public static final BigInteger m41163Y4(int[] iArr, C11300l<? super Integer, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int valueOf2 : iArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Integer.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: Z */
    public static final /* synthetic */ boolean m41164Z(long[] jArr, long[] jArr2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr2, "other");
        return Arrays.equals(jArr, jArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: Z0 */
    public static final float[] m41165Z0(@C12579k float[] fArr, @C12579k float[] fArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(fArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    @C11110f
    /* renamed from: Z1 */
    public static final char m41166Z1(char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[i];
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: Z2 */
    public static final /* synthetic */ Integer m41167Z2(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39018Hl(iArr, comparator);
    }

    @C12579k
    /* renamed from: Z3 */
    public static final <T> T[] m41168Z3(@C12579k T[] tArr, @C12579k T[] tArr2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Z4 */
    public static final BigInteger m41169Z4(long[] jArr, C11300l<? super Long, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (long valueOf2 : jArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Long.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: a0 */
    public static final /* synthetic */ <T> boolean m41170a0(T[] tArr, T[] tArr2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(tArr2, "other");
        return Arrays.equals(tArr, tArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: a1 */
    public static final int[] m41171a1(@C12579k int[] iArr, @C12579k int[] iArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    @C11110f
    /* renamed from: a2 */
    public static final double m41172a2(double[] dArr, int i) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[i];
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: a3 */
    public static final /* synthetic */ Long m41173a3(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39050Il(jArr, comparator);
    }

    @C12579k
    /* renamed from: a4 */
    public static final short[] m41174a4(@C12579k short[] sArr, @C12579k Collection<Short> collection) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, collection.size() + length);
        for (Short shortValue : collection) {
            copyOf[length] = shortValue.shortValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: a5 */
    public static final <T> BigInteger m41175a5(T[] tArr, C11300l<? super T, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (T invoke : tArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(invoke));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: b0 */
    public static final /* synthetic */ boolean m41176b0(short[] sArr, short[] sArr2) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(sArr2, "other");
        return Arrays.equals(sArr, sArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: b1 */
    public static final long[] m41177b1(@C12579k long[] jArr, @C12579k long[] jArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    @C11110f
    /* renamed from: b2 */
    public static final float m41178b2(float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[i];
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: b3 */
    public static final /* synthetic */ Object m41179b3(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39082Jl(objArr, comparator);
    }

    @C12579k
    /* renamed from: b4 */
    public static final short[] m41180b4(@C12579k short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, length + 1);
        copyOf[length] = s;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: b5 */
    public static final BigInteger m41181b5(short[] sArr, C11300l<? super Short, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (short valueOf2 : sArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Short.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @C11398l(hiddenSince = "1.4")
    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: c0 */
    public static final /* synthetic */ boolean m41182c0(boolean[] zArr, boolean[] zArr2) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(zArr2, "other");
        return Arrays.equals(zArr, zArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: c1 */
    public static final <T> T[] m41183c1(@C12579k T[] tArr, @C12579k T[] tArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(tArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    @C11110f
    /* renamed from: c2 */
    public static final int m41184c2(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[i];
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: c3 */
    public static final /* synthetic */ Short m41185c3(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39114Kl(sArr, comparator);
    }

    @C12579k
    /* renamed from: c4 */
    public static final short[] m41186c4(@C12579k short[] sArr, @C12579k short[] sArr2) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(sArr2, "elements");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] copyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: c5 */
    public static final BigInteger m41187c5(boolean[] zArr, C11300l<? super Boolean, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (boolean valueOf2 : zArr) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Boolean.valueOf(valueOf2)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: d0 */
    public static final boolean m41188d0(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: d1 */
    public static final short[] m41189d1(@C12579k short[] sArr, @C12579k short[] sArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(sArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    @C11110f
    /* renamed from: d2 */
    public static final long m41190d2(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[i];
    }

    @C12579k
    /* renamed from: d4 */
    public static final boolean[] m41192d4(@C12579k boolean[] zArr, @C12579k Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(collection, "elements");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, collection.size() + length);
        for (Boolean booleanValue : collection) {
            copyOf[length] = booleanValue.booleanValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C12579k
    /* renamed from: d5 */
    public static final SortedSet<Byte> m41193d5(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39095Jy(bArr, new TreeSet());
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: e0 */
    public static final boolean m41194e0(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: e1 */
    public static final boolean[] m41195e1(@C12579k boolean[] zArr, @C12579k boolean[] zArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(zArr2, FirebaseAnalytics.C32532b.f78977z);
        System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    @C11110f
    /* renamed from: e2 */
    public static final <T> T m41196e2(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[i];
    }

    @C12579k
    /* renamed from: e4 */
    public static final boolean[] m41198e4(@C12579k boolean[] zArr, boolean z) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        copyOf[length] = z;
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C12579k
    /* renamed from: e5 */
    public static final SortedSet<Character> m41199e5(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39127Ky(cArr, new TreeSet());
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: f0 */
    public static final boolean m41200f0(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    /* renamed from: f1 */
    public static /* synthetic */ byte[] m41201f1(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m41147W0(bArr, bArr2, i, i2, i3);
    }

    @C11110f
    /* renamed from: f2 */
    public static final short m41202f2(short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[i];
    }

    @C12579k
    /* renamed from: f4 */
    public static final boolean[] m41204f4(@C12579k boolean[] zArr, @C12579k boolean[] zArr2) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "result");
        return copyOf;
    }

    @C12579k
    /* renamed from: f5 */
    public static final SortedSet<Double> m41205f5(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39159Ly(dArr, new TreeSet());
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: g0 */
    public static final boolean m41206g0(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    /* renamed from: g1 */
    public static /* synthetic */ char[] m41207g1(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return m41153X0(cArr, cArr2, i, i2, i3);
    }

    @C11110f
    /* renamed from: g2 */
    public static final boolean m41208g2(boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[i];
    }

    @C11110f
    /* renamed from: g4 */
    public static final <T> T[] m41210g4(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return m41156X3(tArr, t);
    }

    @C12579k
    /* renamed from: g5 */
    public static final SortedSet<Float> m41211g5(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39191My(fArr, new TreeSet());
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: h0 */
    public static final boolean m41212h0(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: h1 */
    public static /* synthetic */ double[] m41213h1(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return m41159Y0(dArr, dArr2, i, i2, i3);
    }

    /* renamed from: h2 */
    public static final void m41214h2(@C12579k byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i, i2, b);
    }

    /* renamed from: h4 */
    public static final void m41216h4(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @C12579k
    /* renamed from: h5 */
    public static final SortedSet<Integer> m41217h5(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39223Ny(iArr, new TreeSet());
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: i0 */
    public static final boolean m41218i0(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    /* renamed from: i1 */
    public static /* synthetic */ float[] m41219i1(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return m41165Z0(fArr, fArr2, i, i2, i3);
    }

    /* renamed from: i2 */
    public static final void m41220i2(@C12579k char[] cArr, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.fill(cArr, i, i2, c);
    }

    /* renamed from: i4 */
    public static final void m41222i4(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.sort(bArr, i, i2);
    }

    @C12579k
    /* renamed from: i5 */
    public static final SortedSet<Long> m41223i5(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39255Oy(jArr, new TreeSet());
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: j0 */
    public static final <T> boolean m41224j0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    /* renamed from: j1 */
    public static /* synthetic */ int[] m41225j1(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return m41171a1(iArr, iArr2, i, i2, i3);
    }

    /* renamed from: j2 */
    public static final void m41226j2(@C12579k double[] dArr, double d, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.fill(dArr, i, i2, d);
    }

    /* renamed from: j4 */
    public static final void m41228j4(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @C12579k
    /* renamed from: j5 */
    public static final <T extends Comparable<? super T>> SortedSet<T> m41229j5(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39287Py(tArr, new TreeSet());
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: k0 */
    public static final boolean m41230k0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: k1 */
    public static /* synthetic */ long[] m41231k1(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return m41177b1(jArr, jArr2, i, i2, i3);
    }

    /* renamed from: k2 */
    public static final void m41232k2(@C12579k float[] fArr, float f, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i, i2, f);
    }

    /* renamed from: k4 */
    public static final void m41234k4(@C12579k char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.sort(cArr, i, i2);
    }

    @C12579k
    /* renamed from: k5 */
    public static final <T> SortedSet<T> m41235k5(@C12579k T[] tArr, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) ArraysKt___ArraysKt.m39287Py(tArr, new TreeSet(comparator));
    }

    @C11110f
    @C11314h(name = "contentEqualsNullable")
    @C11665v0(version = "1.4")
    /* renamed from: l0 */
    public static final boolean m41236l0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    /* renamed from: l1 */
    public static /* synthetic */ Object[] m41237l1(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m41183c1(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: l2 */
    public static final void m41238l2(@C12579k int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: l4 */
    public static final void m41240l4(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @C12579k
    /* renamed from: l5 */
    public static final SortedSet<Short> m41241l5(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39319Qy(sArr, new TreeSet());
    }

    /* renamed from: m1 */
    public static /* synthetic */ short[] m41243m1(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return m41189d1(sArr, sArr2, i, i2, i3);
    }

    /* renamed from: m2 */
    public static final void m41244m2(@C12579k long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    /* renamed from: m4 */
    public static final void m41246m4(@C12579k double[] dArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.sort(dArr, i, i2);
    }

    @C12579k
    /* renamed from: m5 */
    public static final SortedSet<Boolean> m41247m5(@C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.m39351Ry(zArr, new TreeSet());
    }

    @C12579k
    /* renamed from: n */
    public static final List<Byte> m41248n(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new C10957a(bArr);
    }

    /* renamed from: n1 */
    public static /* synthetic */ boolean[] m41250n1(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return m41195e1(zArr, zArr2, i, i2, i3);
    }

    /* renamed from: n2 */
    public static final <T> void m41251n2(@C12579k T[] tArr, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: n3 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean m41252n3(boolean[] zArr, C11300l<? super Boolean, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (zArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        boolean z2 = zArr[0];
        int Ze = ArraysKt___ArraysKt.m39587Ze(zArr);
        if (Ze == 0) {
            return Boolean.valueOf(z2);
        }
        Comparable comparable = (Comparable) lVar.invoke(Boolean.valueOf(z2));
        C10953k0 H = new C11466l(1, Ze).iterator();
        while (H.hasNext()) {
            boolean z3 = zArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Boolean.valueOf(z3));
            if (comparable.compareTo(comparable2) > 0) {
                z2 = z3;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z2);
    }

    /* renamed from: n4 */
    public static final void m41253n4(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @C12579k
    /* renamed from: n5 */
    public static final Boolean[] m41254n5(@C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @C12579k
    /* renamed from: o */
    public static final List<Character> m41255o(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new C10964h(cArr);
    }

    @C11110f
    /* renamed from: o1 */
    public static final byte[] m41257o1(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: o2 */
    public static final void m41258o2(@C12579k short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.fill(sArr, i, i2, s);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: o3 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte m41259o3(byte[] bArr, C11300l<? super Byte, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        byte b = bArr[0];
        int Re = ArraysKt___ArraysKt.m39331Re(bArr);
        if (Re == 0) {
            return Byte.valueOf(b);
        }
        Comparable comparable = (Comparable) lVar.invoke(Byte.valueOf(b));
        C10953k0 H = new C11466l(1, Re).iterator();
        while (H.hasNext()) {
            byte b2 = bArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Byte.valueOf(b2));
            if (comparable.compareTo(comparable2) > 0) {
                b = b2;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b);
    }

    /* renamed from: o4 */
    public static final void m41260o4(@C12579k float[] fArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.sort(fArr, i, i2);
    }

    @C12579k
    /* renamed from: o5 */
    public static final Byte[] m41261o5(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @C12579k
    /* renamed from: p */
    public static final List<Double> m41262p(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new C10962f(dArr);
    }

    @C11110f
    /* renamed from: p1 */
    public static final byte[] m41264p1(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: p2 */
    public static final void m41265p2(@C12579k boolean[] zArr, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i, i2, z);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: p3 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m41266p3(char[] cArr, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (cArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char c = cArr[0];
        int Se = ArraysKt___ArraysKt.m39363Se(cArr);
        if (Se == 0) {
            return Character.valueOf(c);
        }
        Comparable comparable = (Comparable) lVar.invoke(Character.valueOf(c));
        C10953k0 H = new C11466l(1, Se).iterator();
        while (H.hasNext()) {
            char c2 = cArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Character.valueOf(c2));
            if (comparable.compareTo(comparable2) > 0) {
                c = c2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c);
    }

    /* renamed from: p4 */
    public static final void m41267p4(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @C12579k
    /* renamed from: p5 */
    public static final Character[] m41268p5(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    @C12579k
    /* renamed from: q */
    public static final List<Float> m41269q(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new C10961e(fArr);
    }

    @C11110f
    /* renamed from: q1 */
    public static final char[] m41271q1(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: q2 */
    public static /* synthetic */ void m41272q2(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        m41214h2(bArr, b, i, i2);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: q3 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Double m41273q3(double[] dArr, C11300l<? super Double, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (dArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        double d = dArr[0];
        int Te = ArraysKt___ArraysKt.m39395Te(dArr);
        if (Te == 0) {
            return Double.valueOf(d);
        }
        Comparable comparable = (Comparable) lVar.invoke(Double.valueOf(d));
        C10953k0 H = new C11466l(1, Te).iterator();
        while (H.hasNext()) {
            double d2 = dArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Double.valueOf(d2));
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
                d = d2;
            }
        }
        return Double.valueOf(d);
    }

    /* renamed from: q4 */
    public static final void m41274q4(@C12579k int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i, i2);
    }

    @C12579k
    /* renamed from: q5 */
    public static final Double[] m41275q5(@C12579k double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @C12579k
    /* renamed from: r */
    public static final List<Integer> m41276r(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new C10959c(iArr);
    }

    @C11110f
    /* renamed from: r1 */
    public static final char[] m41278r1(char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: r2 */
    public static /* synthetic */ void m41279r2(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        m41220i2(cArr, c, i, i2);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: r3 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Float m41280r3(float[] fArr, C11300l<? super Float, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (fArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        float f = fArr[0];
        int Ue = ArraysKt___ArraysKt.m39427Ue(fArr);
        if (Ue == 0) {
            return Float.valueOf(f);
        }
        Comparable comparable = (Comparable) lVar.invoke(Float.valueOf(f));
        C10953k0 H = new C11466l(1, Ue).iterator();
        while (H.hasNext()) {
            float f2 = fArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Float.valueOf(f2));
            if (comparable.compareTo(comparable2) > 0) {
                f = f2;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f);
    }

    /* renamed from: r4 */
    public static final void m41281r4(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @C12579k
    /* renamed from: r5 */
    public static final Float[] m41282r5(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @C12579k
    /* renamed from: s */
    public static final List<Long> m41283s(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new C10960d(jArr);
    }

    @C11110f
    /* renamed from: s1 */
    public static final double[] m41285s1(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: s2 */
    public static /* synthetic */ void m41286s2(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        m41226j2(dArr, d, i, i2);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: s3 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer m41287s3(int[] iArr, C11300l<? super Integer, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int i = iArr[0];
        int Ve = ArraysKt___ArraysKt.m39459Ve(iArr);
        if (Ve == 0) {
            return Integer.valueOf(i);
        }
        Comparable comparable = (Comparable) lVar.invoke(Integer.valueOf(i));
        C10953k0 H = new C11466l(1, Ve).iterator();
        while (H.hasNext()) {
            int i2 = iArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Integer.valueOf(i2));
            if (comparable.compareTo(comparable2) > 0) {
                i = i2;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: s4 */
    public static final void m41288s4(@C12579k long[] jArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.sort(jArr, i, i2);
    }

    @C12579k
    /* renamed from: s5 */
    public static final Integer[] m41289s5(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @C12579k
    /* renamed from: t */
    public static final <T> List<T> m41290t(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> a = C10966n.m41377a(tArr);
        Intrinsics.checkNotNullExpressionValue(a, "asList(this)");
        return a;
    }

    @C11110f
    /* renamed from: t1 */
    public static final double[] m41292t1(double[] dArr, int i) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: t2 */
    public static /* synthetic */ void m41293t2(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        m41232k2(fArr, f, i, i2);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: t3 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Long m41294t3(long[] jArr, C11300l<? super Long, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (jArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        long j = jArr[0];
        int We = ArraysKt___ArraysKt.m39491We(jArr);
        if (We == 0) {
            return Long.valueOf(j);
        }
        Comparable comparable = (Comparable) lVar.invoke(Long.valueOf(j));
        C10953k0 H = new C11466l(1, We).iterator();
        while (H.hasNext()) {
            long j2 = jArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Long.valueOf(j2));
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
                j = j2;
            }
        }
        return Long.valueOf(j);
    }

    @C11110f
    /* renamed from: t4 */
    public static final <T extends Comparable<? super T>> void m41295t4(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        m41309v4(tArr);
    }

    @C12579k
    /* renamed from: t5 */
    public static final Long[] m41296t5(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @C12579k
    /* renamed from: u */
    public static final List<Short> m41297u(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new C10958b(sArr);
    }

    @C11110f
    /* renamed from: u1 */
    public static final float[] m41299u1(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: u2 */
    public static /* synthetic */ void m41300u2(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m41238l2(iArr, i, i2, i3);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: u3 */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m41301u3(T[] tArr, C11300l<? super T, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        T t = tArr[0];
        int Xe = ArraysKt___ArraysKt.m39523Xe(tArr);
        if (Xe != 0) {
            Comparable comparable = (Comparable) lVar.invoke(t);
            C10953k0 H = new C11466l(1, Xe).iterator();
            while (H.hasNext()) {
                T t2 = tArr[H.mo6374c()];
                Comparable comparable2 = (Comparable) lVar.invoke(t2);
                if (comparable.compareTo(comparable2) > 0) {
                    t = t2;
                    comparable = comparable2;
                }
            }
        }
        return t;
    }

    @C11665v0(version = "1.4")
    /* renamed from: u4 */
    public static final <T extends Comparable<? super T>> void m41302u4(@C12579k T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    @C12579k
    /* renamed from: u5 */
    public static final Short[] m41303u5(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }

    @C12579k
    /* renamed from: v */
    public static final List<Boolean> m41304v(@C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new C10963g(zArr);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: v0 */
    public static final int m41305v0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @C11110f
    /* renamed from: v1 */
    public static final float[] m41306v1(float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: v2 */
    public static /* synthetic */ void m41307v2(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        m41244m2(jArr, j, i, i2);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: v3 */
    public static final /* synthetic */ <R extends Comparable<? super R>> Short m41308v3(short[] sArr, C11300l<? super Short, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (sArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        short s = sArr[0];
        int Ye = ArraysKt___ArraysKt.m39555Ye(sArr);
        if (Ye == 0) {
            return Short.valueOf(s);
        }
        Comparable comparable = (Comparable) lVar.invoke(Short.valueOf(s));
        C10953k0 H = new C11466l(1, Ye).iterator();
        while (H.hasNext()) {
            short s2 = sArr[H.mo6374c()];
            Comparable comparable2 = (Comparable) lVar.invoke(Short.valueOf(s2));
            if (comparable.compareTo(comparable2) > 0) {
                s = s2;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s);
    }

    /* renamed from: v4 */
    public static final <T> void m41309v4(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: w */
    public static final int m41310w(@C12579k byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Arrays.binarySearch(bArr, i, i2, b);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: w0 */
    public static final int m41311w0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @C11110f
    /* renamed from: w1 */
    public static final int[] m41312w1(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: w2 */
    public static /* synthetic */ void m41313w2(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m41251n2(objArr, obj, i, i2);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: w3 */
    public static final /* synthetic */ Boolean m41314w3(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39629ao(zArr, comparator);
    }

    /* renamed from: w4 */
    public static final <T> void m41315w4(@C12579k T[] tArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    /* renamed from: x */
    public static final int m41316x(@C12579k char[] cArr, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return Arrays.binarySearch(cArr, i, i2, c);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: x0 */
    public static final int m41317x0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @C11110f
    /* renamed from: x1 */
    public static final int[] m41318x1(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: x2 */
    public static /* synthetic */ void m41319x2(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        m41258o2(sArr, s, i, i2);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: x3 */
    public static final /* synthetic */ Byte m41320x3(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39661bo(bArr, comparator);
    }

    /* renamed from: x4 */
    public static final void m41321x4(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    /* renamed from: y */
    public static final int m41322y(@C12579k double[] dArr, double d, int i, int i2) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return Arrays.binarySearch(dArr, i, i2, d);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: y0 */
    public static final int m41323y0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @C11110f
    /* renamed from: y1 */
    public static final long[] m41324y1(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: y2 */
    public static /* synthetic */ void m41325y2(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        m41265p2(zArr, z, i, i2);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: y3 */
    public static final /* synthetic */ Character m41326y3(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39692co(cArr, comparator);
    }

    /* renamed from: y4 */
    public static final void m41327y4(@C12579k short[] sArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.sort(sArr, i, i2);
    }

    /* renamed from: z */
    public static final int m41328z(@C12579k float[] fArr, float f, int i, int i2) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i, i2, f);
    }

    @C11110f
    @C11314h(name = "contentHashCodeNullable")
    @C11665v0(version = "1.4")
    /* renamed from: z0 */
    public static final int m41329z0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @C11110f
    /* renamed from: z1 */
    public static final long[] m41330z1(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @C12579k
    /* renamed from: z2 */
    public static final <R> List<R> m41331z2(@C12579k Object[] objArr, @C12579k Class<R> cls) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(cls, "klass");
        return (List) m41017A2(objArr, new ArrayList(), cls);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: z3 */
    public static final /* synthetic */ Double m41332z3(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.m39724do(dArr, comparator);
    }

    /* renamed from: z4 */
    public static /* synthetic */ void m41333z4(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        m41222i4(bArr, i, i2);
    }
}
