package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11403m0;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.collections.C10953k0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1239#2,14:109\n1521#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
/* renamed from: kotlin.text.u */
public class C11623u extends StringsKt__StringsKt {
    @C11110f
    /* renamed from: Q1 */
    public static final char m45364Q1(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.charAt(i);
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: R1 */
    public static final BigDecimal m45365R1(CharSequence charSequence, C11300l<? super Character, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(Character.valueOf(charSequence.charAt(i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: S1 */
    public static final BigInteger m45366S1(CharSequence charSequence, C11300l<? super Character, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(Character.valueOf(charSequence.charAt(i))));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
        Comparable comparable = (Comparable) lVar.invoke(Character.valueOf(charAt));
        C10953k0 H = new C11466l(1, lastIndex).iterator();
        while (H.hasNext()) {
            char charAt2 = charSequence.charAt(H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(Character.valueOf(charAt2));
            if (comparable.compareTo(comparable2) < 0) {
                charAt = charAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(charAt);
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.maxWithOrNull(charSequence, comparator);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
        Comparable comparable = (Comparable) lVar.invoke(Character.valueOf(charAt));
        C10953k0 H = new C11466l(1, lastIndex).iterator();
        while (H.hasNext()) {
            char charAt2 = charSequence.charAt(H.mo6374c());
            Comparable comparable2 = (Comparable) lVar.invoke(Character.valueOf(charAt2));
            if (comparable.compareTo(comparable2) > 0) {
                charAt = charAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(charAt);
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.minWithOrNull(charSequence, comparator);
    }

    @C12579k
    public static final SortedSet<Character> toSortedSet(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) StringsKt___StringsKt.toCollection(charSequence, new TreeSet());
    }
}
