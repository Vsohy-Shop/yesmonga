package kotlin.collections;

import java.util.Comparator;
import java.util.Map;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11587t0;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.collections.t0 */
public class C10980t0 extends C10977s0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.Map$Entry<K, V>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.Map$Entry<K, V>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.C11395k(message = "Use maxByOrNull instead.", replaceWith = @kotlin.C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.internal.C11110f
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m41499L0(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.C11300l<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x001c
            r5 = 0
            goto L_0x0047
        L_0x001c:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L_0x0028
        L_0x0026:
            r5 = r0
            goto L_0x0047
        L_0x0028:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L_0x002e:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L_0x0040
            r0 = r2
            r1 = r3
        L_0x0040:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L_0x002e
            goto L_0x0026
        L_0x0047:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10980t0.m41499L0(java.util.Map, kotlin.jvm.functions.l):java.util.Map$Entry");
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @C11110f
    /* renamed from: M0 */
    public static final /* synthetic */ <K, V> Map.Entry<K, V> m41500M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.m40555Q3(map.entrySet(), comparator);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.Map$Entry<K, V>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.Map$Entry<K, V>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.C11395k(message = "Use minByOrNull instead.", replaceWith = @kotlin.C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m41501N0(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.C11300l<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x001c
            r5 = 0
            goto L_0x0047
        L_0x001c:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L_0x0028
        L_0x0026:
            r5 = r0
            goto L_0x0047
        L_0x0028:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L_0x002e:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L_0x0040
            r0 = r2
            r1 = r3
        L_0x0040:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L_0x002e
            goto L_0x0026
        L_0x0047:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10980t0.m41501N0(java.util.Map, kotlin.jvm.functions.l):java.util.Map$Entry");
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: O0 */
    public static final /* synthetic */ Map.Entry m41502O0(Map map, Comparator comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.m40645i4(map.entrySet(), comparator);
    }
}
