package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11665v0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* renamed from: kotlin.collections.g0 */
public class C10939g0 extends C10935f0 {
    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: c */
    public static final <T, K, R> Map<K, R> m40926c(@C12579k C10929d0<T, ? extends K> d0Var, @C12579k C11306r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = d0Var.mo21945b();
        while (b.hasNext()) {
            T next = b.next();
            Object a = d0Var.mo21944a(next);
            Object obj = linkedHashMap.get(a);
            if (obj != null || linkedHashMap.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            linkedHashMap.put(a, rVar.invoke(a, obj, next, Boolean.valueOf(z)));
        }
        return linkedHashMap;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: d */
    public static final <T, K, R, M extends Map<? super K, R>> M m40927d(@C12579k C10929d0<T, ? extends K> d0Var, @C12579k M m, @C12579k C11306r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(rVar, "operation");
        Iterator<T> b = d0Var.mo21945b();
        while (b.hasNext()) {
            T next = b.next();
            Object a = d0Var.mo21944a(next);
            Object obj = m.get(a);
            if (obj != null || m.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            m.put(a, rVar.invoke(a, obj, next, Boolean.valueOf(z)));
        }
        return m;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: e */
    public static final <T, K, M extends Map<? super K, Integer>> M m40928e(@C12579k C10929d0<T, ? extends K> d0Var, @C12579k M m) {
        boolean z;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Iterator<T> b = d0Var.mo21945b();
        while (b.hasNext()) {
            Object a = d0Var.mo21944a(b.next());
            Object obj = m.get(a);
            if (obj != null || m.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                obj = 0;
            }
            m.put(a, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: f */
    public static final <T, K, R> Map<K, R> m40929f(@C12579k C10929d0<T, ? extends K> d0Var, R r, @C12579k C11304p<? super R, ? super T, ? extends R> pVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = d0Var.mo21945b();
        while (b.hasNext()) {
            T next = b.next();
            Object a = d0Var.mo21944a(next);
            R r2 = linkedHashMap.get(a);
            if (r2 != null || linkedHashMap.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                r2 = r;
            }
            linkedHashMap.put(a, pVar.invoke(r2, next));
        }
        return linkedHashMap;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: g */
    public static final <T, K, R> Map<K, R> m40930g(@C12579k C10929d0<T, ? extends K> d0Var, @C12579k C11304p<? super K, ? super T, ? extends R> pVar, @C12579k C11305q<? super K, ? super R, ? super T, ? extends R> qVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "initialValueSelector");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = d0Var.mo21945b();
        while (b.hasNext()) {
            T next = b.next();
            Object a = d0Var.mo21944a(next);
            Object obj = linkedHashMap.get(a);
            if (obj != null || linkedHashMap.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                obj = pVar.invoke(a, next);
            }
            linkedHashMap.put(a, qVar.invoke(a, obj, next));
        }
        return linkedHashMap;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: h */
    public static final <T, K, R, M extends Map<? super K, R>> M m40931h(@C12579k C10929d0<T, ? extends K> d0Var, @C12579k M m, R r, @C12579k C11304p<? super R, ? super T, ? extends R> pVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "operation");
        Iterator<T> b = d0Var.mo21945b();
        while (b.hasNext()) {
            T next = b.next();
            Object a = d0Var.mo21944a(next);
            R r2 = m.get(a);
            if (r2 != null || m.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                r2 = r;
            }
            m.put(a, pVar.invoke(r2, next));
        }
        return m;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: i */
    public static final <T, K, R, M extends Map<? super K, R>> M m40932i(@C12579k C10929d0<T, ? extends K> d0Var, @C12579k M m, @C12579k C11304p<? super K, ? super T, ? extends R> pVar, @C12579k C11305q<? super K, ? super R, ? super T, ? extends R> qVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "initialValueSelector");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        Iterator<T> b = d0Var.mo21945b();
        while (b.hasNext()) {
            T next = b.next();
            Object a = d0Var.mo21944a(next);
            Object obj = m.get(a);
            if (obj != null || m.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                obj = pVar.invoke(a, next);
            }
            m.put(a, qVar.invoke(a, obj, next));
        }
        return m;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super K, ? super S, ? super T, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.1")
    @org.jetbrains.annotations.C12579k
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S, K> java.util.Map<K, S> m40933j(@org.jetbrains.annotations.C12579k kotlin.collections.C10929d0<T, ? extends K> r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super K, ? super S, ? super T, ? extends S> r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.mo21945b()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.mo21944a(r2)
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L_0x002f
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            java.lang.Object r2 = r7.invoke(r3, r4, r2)
        L_0x0037:
            r0.put(r3, r2)
            goto L_0x0013
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10939g0.m40933j(kotlin.collections.d0, kotlin.jvm.functions.q):java.util.Map");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super K, ? super S, ? super T, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.1")
    @org.jetbrains.annotations.C12579k
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S, K, M extends java.util.Map<? super K, S>> M m40934k(@org.jetbrains.annotations.C12579k kotlin.collections.C10929d0<T, ? extends K> r5, @org.jetbrains.annotations.C12579k M r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super K, ? super S, ? super T, ? extends S> r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.Iterator r0 = r5.mo21945b()
        L_0x0013:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r5.mo21944a(r1)
            java.lang.Object r3 = r6.get(r2)
            if (r3 != 0) goto L_0x002f
            boolean r4 = r6.containsKey(r2)
            if (r4 != 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            java.lang.Object r1 = r7.invoke(r2, r3, r1)
        L_0x0037:
            r6.put(r2, r1)
            goto L_0x0013
        L_0x003b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10939g0.m40934k(kotlin.collections.d0, java.util.Map, kotlin.jvm.functions.q):java.util.Map");
    }
}
