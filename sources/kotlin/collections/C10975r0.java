package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
/* renamed from: kotlin.collections.r0 */
public class C10975r0 extends C10973q0 {

    /* renamed from: a */
    public static final int f28191a = 1073741824;

    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: d */
    public static final <K, V> Map<K, V> m41394d(@C12579k Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "builder");
        return ((MapBuilder) map).mo22151j();
    }

    @C11110f
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: e */
    public static final <K, V> Map<K, V> m41395e(int i, C11300l<? super Map<K, V>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        Map h = m41398h(i);
        lVar.invoke(h);
        return m41394d(h);
    }

    @C11110f
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: f */
    public static final <K, V> Map<K, V> m41396f(C11300l<? super Map<K, V>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        Map g = m41397g();
        lVar.invoke(g);
        return m41394d(g);
    }

    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: g */
    public static final <K, V> Map<K, V> m41397g() {
        return new MapBuilder();
    }

    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: h */
    public static final <K, V> Map<K, V> m41398h(int i) {
        return new MapBuilder(i);
    }

    /* renamed from: i */
    public static final <K, V> V m41399i(@C12579k ConcurrentMap<K, V> concurrentMap, K k, @C12579k C11289a<? extends V> aVar) {
        Intrinsics.checkNotNullParameter(concurrentMap, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        V v = concurrentMap.get(k);
        if (v != null) {
            return v;
        }
        V invoke = aVar.invoke();
        V putIfAbsent = concurrentMap.putIfAbsent(k, invoke);
        if (putIfAbsent == null) {
            return invoke;
        }
        return putIfAbsent;
    }

    @C11532s0
    /* renamed from: j */
    public static final int m41400j(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @C12579k
    /* renamed from: k */
    public static final <K, V> Map<K, V> m41401k(@C12579k Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.mo21849e(), pair.mo21851f());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: l */
    public static final <K, V> SortedMap<K, V> m41402l(@C12579k Comparator<? super K> comparator, @C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        C10977s0.m41491y0(treeMap, pairArr);
        return treeMap;
    }

    @C12579k
    /* renamed from: m */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m41403m(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        TreeMap treeMap = new TreeMap();
        C10977s0.m41491y0(treeMap, pairArr);
        return treeMap;
    }

    @C11110f
    /* renamed from: n */
    public static final Properties m41404n(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @C12579k
    /* renamed from: o */
    public static final <K, V> Map<K, V> m41405o(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    @C11110f
    /* renamed from: p */
    public static final <K, V> Map<K, V> m41406p(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return m41405o(map);
    }

    @C12579k
    /* renamed from: q */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m41407q(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new TreeMap(map);
    }

    @C12579k
    /* renamed from: r */
    public static final <K, V> SortedMap<K, V> m41408r(@C12579k Map<? extends K, ? extends V> map, @C12579k Comparator<? super K> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
