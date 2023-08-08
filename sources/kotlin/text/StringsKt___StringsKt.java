package kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11403m0;
import kotlin.C11419p1;
import kotlin.C11429q;
import kotlin.C11531s;
import kotlin.C11587t0;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.Pair;
import kotlin.collections.C10927c1;
import kotlin.collections.C10929d0;
import kotlin.collections.C10930d1;
import kotlin.collections.C10942h0;
import kotlin.collections.C10946i0;
import kotlin.collections.C10953k0;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.random.Random;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2486:1\n126#1,2:2487\n214#1,5:2489\n502#1,5:2495\n502#1,5:2500\n462#1:2505\n1183#1,2:2506\n463#1,2:2508\n1185#1:2510\n465#1:2511\n462#1:2512\n1183#1,2:2513\n463#1,2:2515\n1185#1:2517\n465#1:2518\n1183#1,3:2519\n492#1,2:2522\n492#1,2:2524\n750#1,4:2526\n719#1,4:2530\n735#1,4:2534\n782#1,4:2538\n882#1,5:2542\n923#1,3:2547\n926#1,3:2557\n941#1,3:2560\n944#1,3:2570\n1041#1,3:2587\n1011#1,4:2590\n1000#1:2594\n1183#1,2:2595\n1185#1:2598\n1001#1:2599\n1183#1,3:2600\n1032#1:2603\n1174#1:2604\n1175#1:2606\n1033#1:2607\n1174#1,2:2608\n1183#1,3:2610\n1982#1,2:2613\n1984#1,6:2616\n2006#1,2:2622\n2008#1,6:2625\n2431#1,6:2631\n2461#1,7:2637\n1#2:2494\n1#2:2597\n1#2:2605\n1#2:2615\n1#2:2624\n361#3,7:2550\n361#3,7:2563\n361#3,7:2573\n361#3,7:2580\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n52#1:2487,2\n62#1:2489,5\n420#1:2495,5\n429#1:2500,5\n440#1:2505\n440#1:2506,2\n440#1:2508,2\n440#1:2510\n440#1:2511\n451#1:2512\n451#1:2513,2\n451#1:2515,2\n451#1:2517\n451#1:2518\n462#1:2519,3\n474#1:2522,2\n483#1:2524,2\n677#1:2526,4\n692#1:2530,4\n706#1:2534,4\n769#1:2538,4\n842#1:2542,5\n898#1:2547,3\n898#1:2557,3\n911#1:2560,3\n911#1:2570,3\n970#1:2587,3\n980#1:2590,4\n990#1:2594\n990#1:2595,2\n990#1:2598\n990#1:2599\n1000#1:2600,3\n1024#1:2603\n1024#1:2604\n1024#1:2606\n1024#1:2607\n1032#1:2608,2\n1786#1:2610,3\n2077#1:2613,2\n2077#1:2616,6\n2095#1:2622,2\n2095#1:2625,6\n2420#1:2631,6\n2448#1:2637,7\n990#1:2597\n1024#1:2605\n2077#1:2615\n2095#1:2624\n898#1:2550,7\n911#1:2563,7\n925#1:2573,7\n943#1:2580,7\n*E\n"})
public class StringsKt___StringsKt extends C11623u {

    @C11363r0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,70:1\n2475#2:71\n*E\n"})
    /* renamed from: kotlin.text.StringsKt___StringsKt$a */
    public static final class C11596a implements Iterable<Character>, C11345a {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f28860a;

        public C11596a(CharSequence charSequence) {
            this.f28860a = charSequence;
        }

        @C12579k
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.iterator(this.f28860a);
        }
    }

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,680:1\n2483#2:681\n*E\n"})
    /* renamed from: kotlin.text.StringsKt___StringsKt$b */
    public static final class C11597b implements C11559m<Character> {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f28861a;

        public C11597b(CharSequence charSequence) {
            this.f28861a = charSequence;
        }

        @C12579k
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.iterator(this.f28861a);
        }
    }

    @C11363r0({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt$groupingBy$1\n*L\n1#1,2486:1\n*E\n"})
    /* renamed from: kotlin.text.StringsKt___StringsKt$c */
    public static final class C11598c implements C10929d0<Character, K> {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f28862a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Character, K> f28863b;

        public C11598c(CharSequence charSequence, C11300l<? super Character, ? extends K> lVar) {
            this.f28862a = charSequence;
            this.f28863b = lVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo21944a(Object obj) {
            return mo23365c(((Character) obj).charValue());
        }

        @C12579k
        /* renamed from: b */
        public Iterator<Character> mo21945b() {
            return StringsKt__StringsKt.iterator(this.f28862a);
        }

        /* renamed from: c */
        public K mo23365c(char c) {
            return this.f28863b.invoke(Character.valueOf(c));
        }
    }

    @C11110f
    @C11314h(name = "sumOfUInt")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    @C11403m0
    /* renamed from: A2 */
    public static final int m45127A2(CharSequence charSequence, C11300l<? super Character, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int M = C11419p1.m43971M(0);
        for (int i = 0; i < charSequence.length(); i++) {
            M = C11419p1.m43971M(M + lVar.invoke(Character.valueOf(charSequence.charAt(i))).mo22930j2());
        }
        return M;
    }

    @C11110f
    @C11314h(name = "sumOfULong")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    @C11403m0
    /* renamed from: B2 */
    public static final long m45128B2(CharSequence charSequence, C11300l<? super Character, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long M = C11588t1.m44970M(0);
        for (int i = 0; i < charSequence.length(); i++) {
            M = C11588t1.m44970M(M + lVar.invoke(Character.valueOf(charSequence.charAt(i))).mo23301j2());
        }
        return M;
    }

    @C11110f
    /* renamed from: T1 */
    public static final int m45129T1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    @C11110f
    /* renamed from: U1 */
    public static final char m45130U1(CharSequence charSequence, int i, C11300l<? super Integer, Character> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > StringsKt__StringsKt.getLastIndex(charSequence)) {
            return lVar.invoke(Integer.valueOf(i)).charValue();
        }
        return charSequence.charAt(i);
    }

    @C11110f
    /* renamed from: V1 */
    public static final Character m45131V1(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return getOrNull(charSequence, i);
    }

    @C11110f
    /* renamed from: W1 */
    public static final Character m45132W1(CharSequence charSequence, C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @C11110f
    /* renamed from: X1 */
    public static final Character m45133X1(CharSequence charSequence, C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = charSequence.charAt(length);
                if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                    return Character.valueOf(charAt);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return null;
    }

    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: Y1 */
    public static final <R> R m45134Y1(CharSequence charSequence, C11300l<? super Character, ? extends R> lVar) {
        R r;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int i = 0;
        while (true) {
            if (i >= charSequence.length()) {
                r = null;
                break;
            }
            r = lVar.invoke(Character.valueOf(charSequence.charAt(i)));
            if (r != null) {
                break;
            }
            i++;
        }
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: Z1 */
    public static final <R> R m45135Z1(CharSequence charSequence, C11300l<? super Character, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            R invoke = lVar.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @C11110f
    @C11314h(name = "flatMapIndexedIterable")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: a2 */
    public static final <R> List<R> m45136a2(CharSequence charSequence, C11304p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            C10994x.m42360n0(arrayList, (Iterable) pVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    public static final boolean all(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!lVar.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    @C12579k
    public static final Iterable<Character> asIterable(@C12579k CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return CollectionsKt__CollectionsKt.m40441E();
            }
        }
        return new C11596a(charSequence);
    }

    @C12579k
    public static final C11559m<Character> asSequence(@C12579k CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return SequencesKt__SequencesKt.m44590g();
            }
        }
        return new C11597b(charSequence);
    }

    @C12579k
    public static final <K, V> Map<K, V> associate(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends Pair<? extends K, ? extends V>> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            Pair pair = (Pair) lVar.invoke(Character.valueOf(charSequence.charAt(i)));
            linkedHashMap.put(pair.mo21849e(), pair.mo21851f());
        }
        return linkedHashMap;
    }

    @C12579k
    public static final <K> Map<K, Character> associateBy(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(lVar.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @C12579k
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@C12579k CharSequence charSequence, @C12579k M m, @C12579k C11300l<? super Character, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(lVar.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return m;
    }

    @C12579k
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@C12579k CharSequence charSequence, @C12579k M m, @C12579k C11300l<? super Character, ? extends Pair<? extends K, ? extends V>> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            Pair pair = (Pair) lVar.invoke(Character.valueOf(charSequence.charAt(i)));
            m.put(pair.mo21849e(), pair.mo21851f());
        }
        return m;
    }

    @C11665v0(version = "1.3")
    @C12579k
    public static final <V> Map<Character, V> associateWith(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C11479u.m44313B(charSequence.length(), 128)), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(Character.valueOf(charAt), lVar.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @C11665v0(version = "1.3")
    @C12579k
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(@C12579k CharSequence charSequence, @C12579k M m, @C12579k C11300l<? super Character, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(Character.valueOf(charAt), lVar.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    @C11110f
    @C11314h(name = "flatMapIndexedIterableTo")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: b2 */
    public static final <R, C extends Collection<? super R>> C m45137b2(CharSequence charSequence, C c, C11304p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            C10994x.m42360n0(c, (Iterable) pVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return c;
    }

    @C11110f
    /* renamed from: c2 */
    public static final char m45138c2(CharSequence charSequence, int i, C11300l<? super Integer, Character> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > StringsKt__StringsKt.getLastIndex(charSequence)) {
            return lVar.invoke(Integer.valueOf(i)).charValue();
        }
        return charSequence.charAt(i);
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final List<String> chunked(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i, i, true);
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final C11559m<String> chunkedSequence(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i, StringsKt___StringsKt$chunkedSequence$1.f28864f);
    }

    public static final int count(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (lVar.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: d2 */
    public static final double m45139d2(CharSequence charSequence, C11300l<? super Character, Double> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            double doubleValue = lVar.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    public static final CharSequence drop(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(C11479u.m44313B(i, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @C12579k
    public static final CharSequence dropLast(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return take(charSequence, C11479u.m44447u(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @C12579k
    public static final CharSequence dropLastWhile(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!lVar.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    @C12579k
    public static final CharSequence dropWhile(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!lVar.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: e2 */
    public static final float m45140e2(CharSequence charSequence, C11300l<? super Character, Float> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            float floatValue = lVar.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                floatValue = Math.max(floatValue, lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: f2 */
    public static final <R extends Comparable<? super R>> R m45141f2(CharSequence charSequence, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            R r = (Comparable) lVar.invoke(Character.valueOf(charSequence.charAt(0)));
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c())));
                if (r.compareTo(r2) < 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    public static final CharSequence filter(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    @C12579k
    public static final CharSequence filterIndexed(@C12579k CharSequence charSequence, @C12579k C11304p<? super Integer, ? super Character, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return sb;
    }

    @C12579k
    public static final <C extends Appendable> C filterIndexedTo(@C12579k CharSequence charSequence, @C12579k C c, @C12579k C11304p<? super Integer, ? super Character, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @C12579k
    public static final CharSequence filterNot(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    @C12579k
    public static final <C extends Appendable> C filterNotTo(@C12579k CharSequence charSequence, @C12579k C c, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
        }
        return c;
    }

    @C12579k
    public static final <C extends Appendable> C filterTo(@C12579k CharSequence charSequence, @C12579k C c, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
        }
        return c;
    }

    public static final char first(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @C12580l
    public static final Character firstOrNull(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @C12579k
    public static final <R> List<R> flatMap(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            C10994x.m42360n0(arrayList, (Iterable) lVar.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @C12579k
    public static final <R, C extends Collection<? super R>> C flatMapTo(@C12579k CharSequence charSequence, @C12579k C c, @C12579k C11300l<? super Character, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            C10994x.m42360n0(c, (Iterable) lVar.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super java.lang.Character, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R fold(@org.jetbrains.annotations.C12579k java.lang.CharSequence r2, R r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super java.lang.Character, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
        L_0x000b:
            int r1 = r2.length()
            if (r0 >= r1) goto L_0x0020
            char r1 = r2.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r3 = r4.invoke(r3, r1)
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt___StringsKt.fold(java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R foldIndexed(@org.jetbrains.annotations.C12579k java.lang.CharSequence r4, R r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = r0
        L_0x000c:
            int r2 = r4.length()
            if (r0 >= r2) goto L_0x0028
            char r2 = r4.charAt(r0)
            int r3 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r5 = r6.invoke(r1, r5, r2)
            int r0 = r0 + 1
            r1 = r3
            goto L_0x000c
        L_0x0028:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt___StringsKt.foldIndexed(java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super java.lang.Character, ? super R, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R foldRight(@org.jetbrains.annotations.C12579k java.lang.CharSequence r2, R r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super java.lang.Character, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = kotlin.text.StringsKt__StringsKt.getLastIndex(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            char r0 = r2.charAt(r0)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r3 = r4.invoke(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt___StringsKt.foldRight(java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super java.lang.Character, ? super R, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R foldRightIndexed(@org.jetbrains.annotations.C12579k java.lang.CharSequence r3, R r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super java.lang.Character, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = kotlin.text.StringsKt__StringsKt.getLastIndex(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            char r2 = r3.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r4 = r5.invoke(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt___StringsKt.foldRightIndexed(java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    public static final void forEach(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        for (int i = 0; i < charSequence.length(); i++) {
            lVar.invoke(Character.valueOf(charSequence.charAt(i)));
        }
    }

    public static final void forEachIndexed(@C12579k CharSequence charSequence, @C12579k C11304p<? super Integer, ? super Character, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            pVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            i++;
            i2++;
        }
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: g2 */
    public static final <R extends Comparable<? super R>> R m45142g2(CharSequence charSequence, C11300l<? super Character, ? extends R> lVar) {
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
        R r = (Comparable) lVar.invoke(Character.valueOf(charSequence.charAt(0)));
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c())));
            if (r.compareTo(r2) < 0) {
                r = r2;
            }
        }
        return r;
    }

    @C12580l
    public static final Character getOrNull(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0 || i > StringsKt__StringsKt.getLastIndex(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    @C12579k
    public static final <K> Map<K, List<Character>> groupBy(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = lVar.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @C12579k
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@C12579k CharSequence charSequence, @C12579k M m, @C12579k C11300l<? super Character, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = lVar.invoke(Character.valueOf(charAt));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return m;
    }

    @C11665v0(version = "1.1")
    @C12579k
    public static final <K> C10929d0<Character, K> groupingBy(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        return new C11598c(charSequence, lVar);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: h2 */
    public static final Double m45143h2(CharSequence charSequence, C11300l<? super Character, Double> lVar) {
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
        double doubleValue = lVar.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: i2 */
    public static final Float m45144i2(CharSequence charSequence, C11300l<? super Character, Float> lVar) {
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
        float floatValue = lVar.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final int indexOfFirst(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (lVar.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (lVar.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: j2 */
    public static final <R> R m45145j2(CharSequence charSequence, Comparator<? super R> comparator, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            R invoke = lVar.invoke(Character.valueOf(charSequence.charAt(0)));
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c())));
                if (comparator.compare(invoke, invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: k2 */
    public static final <R> R m45146k2(CharSequence charSequence, Comparator<? super R> comparator, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        R invoke = lVar.invoke(Character.valueOf(charSequence.charAt(0)));
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c())));
            if (comparator.compare(invoke, invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: l2 */
    public static final double m45147l2(CharSequence charSequence, C11300l<? super Character, Double> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            double doubleValue = lVar.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final char last(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(StringsKt__StringsKt.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @C12580l
    public static final Character lastOrNull(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: m2 */
    public static final float m45148m2(CharSequence charSequence, C11300l<? super Character, Float> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            float floatValue = lVar.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                floatValue = Math.min(floatValue, lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    public static final <R> List<R> map(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            arrayList.add(lVar.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @C12579k
    public static final <R> List<R> mapIndexed(@C12579k CharSequence charSequence, @C12579k C11304p<? super Integer, ? super Character, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            arrayList.add(pVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return arrayList;
    }

    @C12579k
    public static final <R> List<R> mapIndexedNotNull(@C12579k CharSequence charSequence, @C12579k C11304p<? super Integer, ? super Character, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            Object invoke = pVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @C12579k
    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(@C12579k CharSequence charSequence, @C12579k C c, @C12579k C11304p<? super Integer, ? super Character, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            Object invoke = pVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                c.add(invoke);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    @C12579k
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@C12579k CharSequence charSequence, @C12579k C c, @C12579k C11304p<? super Integer, ? super Character, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            c.add(pVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i))));
            i++;
            i2++;
        }
        return c;
    }

    @C12579k
    public static final <R> List<R> mapNotNull(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            Object invoke = lVar.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @C12579k
    public static final <R, C extends Collection<? super R>> C mapNotNullTo(@C12579k CharSequence charSequence, @C12579k C c, @C12579k C11300l<? super Character, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            Object invoke = lVar.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    @C12579k
    public static final <R, C extends Collection<? super R>> C mapTo(@C12579k CharSequence charSequence, @C12579k C c, @C12579k C11300l<? super Character, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(lVar.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    @C12580l
    @C11665v0(version = "1.4")
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends R> lVar) {
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

    @C11314h(name = "maxByOrThrow")
    @C11665v0(version = "1.7")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            if (lastIndex == 0) {
                return charAt;
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
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @C12580l
    @C11665v0(version = "1.4")
    public static final Character maxOrNull(@C12579k CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            char charAt2 = charSequence.charAt(H.mo6374c());
            if (Intrinsics.compare((int) charAt, (int) charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @C11314h(name = "maxOrThrow")
    @C11665v0(version = "1.7")
    public static final char maxOrThrow(@C12579k CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                char charAt2 = charSequence.charAt(H.mo6374c());
                if (Intrinsics.compare((int) charAt, (int) charAt2) < 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @C12580l
    @C11665v0(version = "1.4")
    public static final Character maxWithOrNull(@C12579k CharSequence charSequence, @C12579k Comparator<? super Character> comparator) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            char charAt2 = charSequence.charAt(H.mo6374c());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @C11314h(name = "maxWithOrThrow")
    @C11665v0(version = "1.7")
    public static final char maxWithOrThrow(@C12579k CharSequence charSequence, @C12579k Comparator<? super Character> comparator) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                char charAt2 = charSequence.charAt(H.mo6374c());
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @C12580l
    @C11665v0(version = "1.4")
    public static final <R extends Comparable<? super R>> Character minByOrNull(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends R> lVar) {
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

    @C11314h(name = "minByOrThrow")
    @C11665v0(version = "1.7")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
            if (lastIndex == 0) {
                return charAt;
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
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @C12580l
    @C11665v0(version = "1.4")
    public static final Character minOrNull(@C12579k CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            char charAt2 = charSequence.charAt(H.mo6374c());
            if (Intrinsics.compare((int) charAt, (int) charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @C11314h(name = "minOrThrow")
    @C11665v0(version = "1.7")
    public static final char minOrThrow(@C12579k CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                char charAt2 = charSequence.charAt(H.mo6374c());
                if (Intrinsics.compare((int) charAt, (int) charAt2) > 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @C12580l
    @C11665v0(version = "1.4")
    public static final Character minWithOrNull(@C12579k CharSequence charSequence, @C12579k Comparator<? super Character> comparator) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            char charAt2 = charSequence.charAt(H.mo6374c());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @C11314h(name = "minWithOrThrow")
    @C11665v0(version = "1.7")
    public static final char minWithOrThrow(@C12579k CharSequence charSequence, @C12579k Comparator<? super Character> comparator) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                char charAt2 = charSequence.charAt(H.mo6374c());
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: n2 */
    public static final <R extends Comparable<? super R>> R m45149n2(CharSequence charSequence, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            R r = (Comparable) lVar.invoke(Character.valueOf(charSequence.charAt(0)));
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                R r2 = (Comparable) lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c())));
                if (r.compareTo(r2) > 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: o2 */
    public static final <R extends Comparable<? super R>> R m45150o2(CharSequence charSequence, C11300l<? super Character, ? extends R> lVar) {
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
        R r = (Comparable) lVar.invoke(Character.valueOf(charSequence.charAt(0)));
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            R r2 = (Comparable) lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c())));
            if (r.compareTo(r2) > 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11665v0(version = "1.1")
    @C12579k
    public static final <S extends CharSequence> S onEach(@C12579k S s, @C12579k C11300l<? super Character, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        for (int i = 0; i < s.length(); i++) {
            lVar.invoke(Character.valueOf(s.charAt(i)));
        }
        return s;
    }

    @C11665v0(version = "1.4")
    @C12579k
    public static final <S extends CharSequence> S onEachIndexed(@C12579k S s, @C12579k C11304p<? super Integer, ? super Character, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int i = 0;
        int i2 = 0;
        while (i < s.length()) {
            pVar.invoke(Integer.valueOf(i2), Character.valueOf(s.charAt(i)));
            i++;
            i2++;
        }
        return s;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: p2 */
    public static final Double m45151p2(CharSequence charSequence, C11300l<? super Character, Double> lVar) {
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
        double doubleValue = lVar.invoke(Character.valueOf(charSequence.charAt(0))).doubleValue();
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C12579k
    public static final Pair<CharSequence, CharSequence> partition(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: q2 */
    public static final Float m45152q2(CharSequence charSequence, C11300l<? super Character, Float> lVar) {
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
        float floatValue = lVar.invoke(Character.valueOf(charSequence.charAt(0))).floatValue();
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: r2 */
    public static final <R> R m45153r2(CharSequence charSequence, Comparator<? super R> comparator, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            R invoke = lVar.invoke(Character.valueOf(charSequence.charAt(0)));
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                R invoke2 = lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c())));
                if (comparator.compare(invoke, invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11665v0(version = "1.3")
    public static final char random(@C12579k CharSequence charSequence, @C12579k Random random) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(random.mo22986m(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @C11097g2(markerClass = {C11429q.class})
    @C12580l
    @C11665v0(version = "1.4")
    public static final Character randomOrNull(@C12579k CharSequence charSequence, @C12579k Random random) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.mo22986m(charSequence.length())));
    }

    public static final char reduce(@C12579k CharSequence charSequence, @C12579k C11304p<? super Character, ? super Character, Character> pVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                charAt = pVar.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(H.mo6374c()))).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final char reduceIndexed(@C12579k CharSequence charSequence, @C12579k C11305q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (H.hasNext()) {
                int c = H.mo6374c();
                charAt = qVar.invoke(Integer.valueOf(c), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(c))).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @C12580l
    @C11665v0(version = "1.4")
    public static final Character reduceIndexedOrNull(@C12579k CharSequence charSequence, @C12579k C11305q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            int c = H.mo6374c();
            charAt = qVar.invoke(Integer.valueOf(c), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(c))).charValue();
        }
        return Character.valueOf(charAt);
    }

    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    public static final Character reduceOrNull(@C12579k CharSequence charSequence, @C12579k C11304p<? super Character, ? super Character, Character> pVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            charAt = pVar.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(H.mo6374c()))).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final char reduceRight(@C12579k CharSequence charSequence, @C12579k C11304p<? super Character, ? super Character, Character> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex >= 0) {
            char charAt = charSequence.charAt(lastIndex);
            for (int i = lastIndex - 1; i >= 0; i--) {
                charAt = pVar.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final char reduceRightIndexed(@C12579k CharSequence charSequence, @C12579k C11305q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex >= 0) {
            char charAt = charSequence.charAt(lastIndex);
            for (int i = lastIndex - 1; i >= 0; i--) {
                charAt = qVar.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @C12580l
    @C11665v0(version = "1.4")
    public static final Character reduceRightIndexedOrNull(@C12579k CharSequence charSequence, @C12579k C11305q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            charAt = qVar.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    public static final Character reduceRightOrNull(@C12579k CharSequence charSequence, @C12579k C11304p<? super Character, ? super Character, Character> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            charAt = pVar.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @C12579k
    public static final CharSequence reversed(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super java.lang.Character, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> runningFold(@org.jetbrains.annotations.C12579k java.lang.CharSequence r4, R r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super java.lang.Character, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            return r4
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length()
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
        L_0x0029:
            int r2 = r4.length()
            if (r1 >= r2) goto L_0x0041
            char r2 = r4.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r5 = r6.invoke(r5, r2)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt___StringsKt.runningFold(java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> runningFoldIndexed(@org.jetbrains.annotations.C12579k java.lang.CharSequence r5, R r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r5.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            return r5
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length()
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length()
        L_0x002d:
            if (r1 >= r2) goto L_0x0045
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            char r4 = r5.charAt(r1)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt___StringsKt.runningFoldIndexed(java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11665v0(version = "1.4")
    @C12579k
    public static final List<Character> runningReduce(@C12579k CharSequence charSequence, @C12579k C11304p<? super Character, ? super Character, Character> pVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i = 1; i < length; i++) {
            charAt = pVar.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @C11665v0(version = "1.4")
    @C12579k
    public static final List<Character> runningReduceIndexed(@C12579k CharSequence charSequence, @C12579k C11305q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i = 1; i < length; i++) {
            charAt = qVar.invoke(Integer.valueOf(i), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: s2 */
    public static final <R> R m45154s2(CharSequence charSequence, Comparator<? super R> comparator, C11300l<? super Character, ? extends R> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        R invoke = lVar.invoke(Character.valueOf(charSequence.charAt(0)));
        C10953k0 H = new C11466l(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (H.hasNext()) {
            R invoke2 = lVar.invoke(Character.valueOf(charSequence.charAt(H.mo6374c())));
            if (comparator.compare(invoke, invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super java.lang.Character, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> scan(@org.jetbrains.annotations.C12579k java.lang.CharSequence r4, R r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super java.lang.Character, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            goto L_0x0042
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length()
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
        L_0x0029:
            int r2 = r4.length()
            if (r1 >= r2) goto L_0x0041
            char r2 = r4.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r5 = r6.invoke(r5, r2)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0041:
            r4 = r0
        L_0x0042:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt___StringsKt.scan(java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> scanIndexed(@org.jetbrains.annotations.C12579k java.lang.CharSequence r5, R r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r5.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            java.util.List r5 = kotlin.collections.C10976s.m41419k(r6)
            goto L_0x0046
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length()
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length()
        L_0x002d:
            if (r1 >= r2) goto L_0x0045
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            char r4 = r5.charAt(r1)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0045:
            r5 = r0
        L_0x0046:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt___StringsKt.scanIndexed(java.lang.CharSequence, java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    public static final char single(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    @C12580l
    public static final Character singleOrNull(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @C12579k
    public static final CharSequence slice(@C12579k CharSequence charSequence, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        if (lVar.isEmpty()) {
            return "";
        }
        return StringsKt__StringsKt.subSequence(charSequence, lVar);
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11398l(warningSince = "1.5")
    public static final int sumBy(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Integer> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i += lVar.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return i;
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11398l(warningSince = "1.5")
    public static final double sumByDouble(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Double> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        double d = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            d += lVar.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return d;
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: t2 */
    public static final char m45155t2(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return random(charSequence, Random.f28564a);
    }

    @C12579k
    public static final CharSequence take(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            return charSequence.subSequence(0, C11479u.m44313B(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @C12579k
    public static final CharSequence takeLast(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - C11479u.m44313B(i, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @C12579k
    public static final CharSequence takeLastWhile(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!lVar.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @C12579k
    public static final CharSequence takeWhile(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!lVar.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @C12579k
    public static final <C extends Collection<? super Character>> C toCollection(@C12579k CharSequence charSequence, @C12579k C c) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(Character.valueOf(charSequence.charAt(i)));
        }
        return c;
    }

    @C12579k
    public static final HashSet<Character> toHashSet(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) toCollection(charSequence, new HashSet(C10975r0.m41400j(C11479u.m44313B(charSequence.length(), 128))));
    }

    @C12579k
    public static final List<Character> toList(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        if (length != 1) {
            return toMutableList(charSequence);
        }
        return C10976s.m41419k(Character.valueOf(charSequence.charAt(0)));
    }

    @C12579k
    public static final List<Character> toMutableList(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    @C12579k
    public static final Set<Character> toSet(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            return C10930d1.m40892k();
        }
        if (length != 1) {
            return (Set) toCollection(charSequence, new LinkedHashSet(C10975r0.m41400j(C11479u.m44313B(charSequence.length(), 128))));
        }
        return C10927c1.m40883f(Character.valueOf(charSequence.charAt(0)));
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: u2 */
    public static final Character m45156u2(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return randomOrNull(charSequence, Random.f28564a);
    }

    @C11110f
    /* renamed from: v2 */
    public static final String m45157v2(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return reversed(str).toString();
    }

    @C11110f
    /* renamed from: w2 */
    public static final String m45158w2(String str, Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "indices");
        return slice((CharSequence) str, iterable).toString();
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final List<String> windowed(@C12579k CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i, i2, z, StringsKt___StringsKt$windowed$1.f28865f);
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(charSequence, i, i2, z);
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final C11559m<String> windowedSequence(@C12579k CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i, i2, z, StringsKt___StringsKt$windowedSequence$1.f28866f);
    }

    public static /* synthetic */ C11559m windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowedSequence(charSequence, i, i2, z);
    }

    @C12579k
    public static final Iterable<C10942h0<Character>> withIndex(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new C10946i0(new StringsKt___StringsKt$withIndex$1(charSequence));
    }

    @C11110f
    @C11314h(name = "sumOfDouble")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: x2 */
    public static final double m45159x2(CharSequence charSequence, C11300l<? super Character, Double> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        double d = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            d += lVar.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return d;
    }

    @C11110f
    @C11314h(name = "sumOfInt")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: y2 */
    public static final int m45160y2(CharSequence charSequence, C11300l<? super Character, Integer> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i += lVar.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return i;
    }

    @C11110f
    @C11314h(name = "sumOfLong")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: z2 */
    public static final long m45161z2(CharSequence charSequence, C11300l<? super Character, Long> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long j = 0;
        for (int i = 0; i < charSequence.length(); i++) {
            j += lVar.invoke(Character.valueOf(charSequence.charAt(i))).longValue();
        }
        return j;
    }

    @C12579k
    public static final <V> List<V> zip(@C12579k CharSequence charSequence, @C12579k CharSequence charSequence2, @C12579k C11304p<? super Character, ? super Character, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(charSequence2, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(pVar.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final <R> List<R> zipWithNext(@C12579k CharSequence charSequence, @C12579k C11304p<? super Character, ? super Character, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            i++;
            arrayList.add(pVar.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    public static final boolean any(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (lVar.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final <R> List<R> chunked(@C12579k CharSequence charSequence, int i, @C12579k C11300l<? super CharSequence, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return windowed(charSequence, i, i, true, lVar);
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final <R> C11559m<R> chunkedSequence(@C12579k CharSequence charSequence, int i, @C12579k C11300l<? super CharSequence, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return windowedSequence(charSequence, i, i, true, lVar);
    }

    @C12580l
    public static final Character firstOrNull(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @C12580l
    public static final Character lastOrNull(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i = length - 1;
            char charAt = charSequence.charAt(length);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i < 0) {
                return null;
            }
            length = i;
        }
    }

    public static final boolean none(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (lVar.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C12580l
    public static final Character singleOrNull(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        Character ch = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return ch;
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final <R> List<R> windowed(@C12579k CharSequence charSequence, int i, int i2, boolean z, @C12579k C11300l<? super CharSequence, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        SlidingWindowKt.m40748a(i, i2);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (true) {
            if (!(i3 >= 0 && i3 < length)) {
                break;
            }
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(lVar.invoke(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, C11300l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(charSequence, i, i2, z, lVar);
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final <R> C11559m<R> windowedSequence(@C12579k CharSequence charSequence, int i, int i2, boolean z, @C12579k C11300l<? super CharSequence, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        SlidingWindowKt.m40748a(i, i2);
        return SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(C11479u.m44315B1(z ? StringsKt__StringsKt.getIndices(charSequence) : C11479u.m44378W1(0, (charSequence.length() - i) + 1), i2)), new StringsKt___StringsKt$windowedSequence$2(i, charSequence, lVar));
    }

    public static /* synthetic */ C11559m windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, C11300l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowedSequence(charSequence, i, i2, z, lVar);
    }

    @C12579k
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@C12579k CharSequence charSequence, @C12579k M m, @C12579k C11300l<? super Character, ? extends K> lVar, @C12579k C11300l<? super Character, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(lVar.invoke(Character.valueOf(charAt)), lVar2.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    @C12579k
    public static final String drop(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(C11479u.m44313B(i, str.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @C12579k
    public static final String dropLast(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            return take(str, C11479u.m44447u(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @C12579k
    public static final String filterNot(@C12579k String str, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    @C12579k
    public static final String slice(@C12579k String str, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        if (lVar.isEmpty()) {
            return "";
        }
        return StringsKt__StringsKt.substring(str, lVar);
    }

    @C12579k
    public static final String take(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(0, C11479u.m44313B(i, str.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @C12579k
    public static final String dropLastWhile(@C12579k String str, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!lVar.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String substring = str.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "";
    }

    @C12579k
    public static final String dropWhile(@C12579k String str, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!lVar.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String substring = str.substring(i);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "";
    }

    @C12579k
    public static final String filterIndexed(@C12579k String str, @C12579k C11304p<? super Integer, ? super Character, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (pVar.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterIndexedTo(StringBu…(), predicate).toString()");
        return sb2;
    }

    public static final char first(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = charSequence.charAt(length);
                if (!lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return charAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @C12579k
    public static final String takeLast(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            String substring = str.substring(length - C11479u.m44313B(i, length));
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @C12579k
    public static final List<Pair<Character, Character>> zip(@C12579k CharSequence charSequence, @C12579k CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C11078d1.m42659a(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    @C12579k
    public static final <K, V> Map<K, V> associateBy(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends K> lVar, @C12579k C11300l<? super Character, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(lVar.invoke(Character.valueOf(charAt)), lVar2.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @C12579k
    public static final String filter(@C12579k String str, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final char single(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        Character ch = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (!z) {
                    ch = Character.valueOf(charAt);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z) {
            Intrinsics.checkNotNull(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @C12579k
    public static final CharSequence slice(@C12579k CharSequence charSequence, @C12579k Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "indices");
        int Y = C10978t.m41495Y(iterable, 10);
        if (Y == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Y);
        for (Integer intValue : iterable) {
            sb.append(charSequence.charAt(intValue.intValue()));
        }
        return sb;
    }

    @C12579k
    public static final String takeLastWhile(@C12579k String str, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!lVar.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String substring = str.substring(lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return str;
    }

    @C12579k
    public static final String takeWhile(@C12579k String str, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!lVar.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String substring = str.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    @C11665v0(version = "1.2")
    @C12579k
    public static final List<Pair<Character, Character>> zipWithNext(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            i++;
            arrayList.add(C11078d1.m42659a(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @C12579k
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@C12579k CharSequence charSequence, @C12579k M m, @C12579k C11300l<? super Character, ? extends K> lVar, @C12579k C11300l<? super Character, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = lVar.invoke(Character.valueOf(charAt));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    @C12579k
    public static final Pair<String, String> partition(@C12579k String str, @C12579k C11300l<? super Character, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "first.toString()");
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "second.toString()");
        return new Pair<>(sb3, sb4);
    }

    @C12579k
    public static final <K, V> Map<K, List<V>> groupBy(@C12579k CharSequence charSequence, @C12579k C11300l<? super Character, ? extends K> lVar, @C12579k C11300l<? super Character, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = lVar.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }
}
