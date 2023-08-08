package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8448f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8450g;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8454i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C8466j;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8471d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8474f;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8497a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8499b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.C8507c;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.C8509d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.C8525b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.C8527c;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.Pair;
import kotlin.collections.C10956m;
import kotlin.collections.C10977s0;
import kotlin.collections.C10994x;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.a */
public final class C8438a {
    @C12579k
    /* renamed from: A */
    public static final <K, V> C8452h<K, V> m30457A(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k C11300l<? super Map<K, V>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "mutator");
        C8452h.C8453a<? extends K, ? extends V> builder = hVar.builder();
        lVar.invoke(builder);
        return builder.mo15671g();
    }

    @C12579k
    /* renamed from: B */
    public static final <T> C8454i<T> m30458B(@C12579k C8454i<? extends T> iVar, @C12579k C11300l<? super Set<T>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "mutator");
        C8454i.C8455a<? extends T> builder = iVar.builder();
        lVar.invoke(builder);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: C */
    public static final <K, V> C8452h<K, V> m30459C() {
        return C8471d.f22848f.mo15803a();
    }

    @C12579k
    /* renamed from: D */
    public static final <K, V> C8452h<K, V> m30460D(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        C8471d a = C8471d.f22848f.mo15803a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        C8452h.C8453a builder = a.builder();
        C10977s0.m41491y0(builder, pairArr);
        return builder.mo15671g();
    }

    @C12579k
    /* renamed from: E */
    public static final <E> C8454i<E> m30461E() {
        return C8497a.f22895d.mo15935a();
    }

    @C12579k
    /* renamed from: F */
    public static final <E> C8454i<E> m30462F(@C12579k E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "elements");
        return C8497a.f22895d.mo15935a().addAll(C10956m.m41290t(eArr));
    }

    @C12579k
    /* renamed from: G */
    public static final <E> C8450g<E> m30463G() {
        return C8466j.m30637b();
    }

    @C12579k
    /* renamed from: H */
    public static final <E> C8450g<E> m30464H(@C12579k E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "elements");
        return C8466j.m30637b().addAll(C10956m.m41290t(eArr));
    }

    @C12579k
    /* renamed from: I */
    public static final <K, V> C8452h<K, V> m30465I() {
        return C8507c.f22923g.mo16029a();
    }

    @C12579k
    /* renamed from: J */
    public static final <K, V> C8452h<K, V> m30466J(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        C8507c a = C8507c.f22923g.mo16029a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        C8452h.C8453a builder = a.builder();
        C10977s0.m41491y0(builder, pairArr);
        return builder.mo15671g();
    }

    @C12579k
    /* renamed from: K */
    public static final <E> C8454i<E> m30467K() {
        return C8525b.f22955e.mo16097a();
    }

    @C12579k
    /* renamed from: L */
    public static final <E> C8454i<E> m30468L(@C12579k E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "elements");
        return C8525b.f22955e.mo16097a().addAll(C10956m.m41290t(eArr));
    }

    @C12579k
    /* renamed from: M */
    public static final <E> C8448f<E> m30469M(@C12579k C8448f<? extends E> fVar, @C12579k Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return fVar.addAll((Collection) iterable);
        }
        C8448f.C8449a<? extends E> builder = fVar.builder();
        C10994x.m42360n0(builder, iterable);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: N */
    public static final <E> C8448f<E> m30470N(@C12579k C8448f<? extends E> fVar, E e) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.add(e);
    }

    @C12579k
    /* renamed from: O */
    public static final <E> C8448f<E> m30471O(@C12579k C8448f<? extends E> fVar, @C12579k C11559m<? extends E> mVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        C8448f.C8449a<? extends E> builder = fVar.builder();
        C10994x.m42361o0(builder, mVar);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: P */
    public static final <E> C8448f<E> m30472P(@C12579k C8448f<? extends E> fVar, @C12579k E[] eArr) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(eArr, "elements");
        C8448f.C8449a<? extends E> builder = fVar.builder();
        C10994x.m42362p0(builder, eArr);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: Q */
    public static final <E> C8450g<E> m30473Q(@C12579k C8450g<? extends E> gVar, @C12579k Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return gVar.addAll((Collection) iterable);
        }
        C8450g.C8451a<? extends E> builder = gVar.builder();
        C10994x.m42360n0(builder, iterable);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: R */
    public static final <E> C8450g<E> m30474R(@C12579k C8450g<? extends E> gVar, E e) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.add(e);
    }

    @C12579k
    /* renamed from: S */
    public static final <E> C8450g<E> m30475S(@C12579k C8450g<? extends E> gVar, @C12579k C11559m<? extends E> mVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        C8450g.C8451a<? extends E> builder = gVar.builder();
        C10994x.m42361o0(builder, mVar);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: T */
    public static final <E> C8450g<E> m30476T(@C12579k C8450g<? extends E> gVar, @C12579k E[] eArr) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(eArr, "elements");
        C8450g.C8451a<? extends E> builder = gVar.builder();
        C10994x.m42362p0(builder, eArr);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: U */
    public static final <K, V> C8452h<K, V> m30477U(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "pairs");
        return m30490d0(hVar, iterable);
    }

    @C12579k
    /* renamed from: V */
    public static final <K, V> C8452h<K, V> m30478V(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        return m30492e0(hVar, map);
    }

    @C12579k
    /* renamed from: W */
    public static final <K, V> C8452h<K, V> m30479W(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        return hVar.put(pair.mo21849e(), pair.mo21851f());
    }

    @C12579k
    /* renamed from: X */
    public static final <K, V> C8452h<K, V> m30480X(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k C11559m<? extends Pair<? extends K, ? extends V>> mVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "pairs");
        return m30494f0(hVar, mVar);
    }

    @C12579k
    /* renamed from: Y */
    public static final <K, V> C8452h<K, V> m30481Y(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        return m30496g0(hVar, pairArr);
    }

    @C12579k
    /* renamed from: Z */
    public static final <E> C8454i<E> m30482Z(@C12579k C8454i<? extends E> iVar, @C12579k Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return iVar.addAll((Collection) iterable);
        }
        C8454i.C8455a<? extends E> builder = iVar.builder();
        C10994x.m42360n0(builder, iterable);
        return builder.mo15660g();
    }

    @C11395k(message = "Use persistentHashMapOf instead.", replaceWith = @C11587t0(expression = "persistentHashMapOf(*pairs)", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final <K, V> C8452h<K, V> m30483a(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        return m30460D((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @C12579k
    /* renamed from: a0 */
    public static final <E> C8454i<E> m30484a0(@C12579k C8454i<? extends E> iVar, E e) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.add(e);
    }

    @C11395k(message = "Use persistentHashSetOf instead.", replaceWith = @C11587t0(expression = "persistentHashSetOf(*elements)", imports = {}))
    @C12579k
    /* renamed from: b */
    public static final <E> C8454i<E> m30485b(@C12579k E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "elements");
        return m30462F(Arrays.copyOf(eArr, eArr.length));
    }

    @C12579k
    /* renamed from: b0 */
    public static final <E> C8454i<E> m30486b0(@C12579k C8454i<? extends E> iVar, @C12579k C11559m<? extends E> mVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        C8454i.C8455a<? extends E> builder = iVar.builder();
        C10994x.m42361o0(builder, mVar);
        return builder.mo15660g();
    }

    @C11395k(message = "Use persistentListOf instead.", replaceWith = @C11587t0(expression = "persistentListOf()", imports = {}))
    @C12579k
    /* renamed from: c */
    public static final <E> C8450g<E> m30487c() {
        return m30463G();
    }

    @C12579k
    /* renamed from: c0 */
    public static final <E> C8454i<E> m30488c0(@C12579k C8454i<? extends E> iVar, @C12579k E[] eArr) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(eArr, "elements");
        C8454i.C8455a<? extends E> builder = iVar.builder();
        C10994x.m42362p0(builder, eArr);
        return builder.mo15660g();
    }

    @C11395k(message = "Use persistentListOf instead.", replaceWith = @C11587t0(expression = "persistentListOf(*elements)", imports = {}))
    @C12579k
    /* renamed from: d */
    public static final <E> C8450g<E> m30489d(@C12579k E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "elements");
        return m30464H(Arrays.copyOf(eArr, eArr.length));
    }

    @C12579k
    /* renamed from: d0 */
    public static final <K, V> C8452h<K, V> m30490d0(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "pairs");
        C8452h.C8453a<? extends K, ? extends V> builder = hVar.builder();
        C10977s0.m41487w0(builder, iterable);
        return builder.mo15671g();
    }

    @C11395k(message = "Use persistentMapOf instead.", replaceWith = @C11587t0(expression = "persistentMapOf(*pairs)", imports = {}))
    @C12579k
    /* renamed from: e */
    public static final <K, V> C8452h<K, V> m30491e(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        return m30466J((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @C12579k
    /* renamed from: e0 */
    public static final <K, V> C8452h<K, V> m30492e0(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        return hVar.putAll(map);
    }

    @C11395k(message = "Use persistentSetOf instead.", replaceWith = @C11587t0(expression = "persistentSetOf()", imports = {}))
    @C12579k
    /* renamed from: f */
    public static final <E> C8454i<E> m30493f() {
        return m30467K();
    }

    @C12579k
    /* renamed from: f0 */
    public static final <K, V> C8452h<K, V> m30494f0(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k C11559m<? extends Pair<? extends K, ? extends V>> mVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "pairs");
        C8452h.C8453a<? extends K, ? extends V> builder = hVar.builder();
        C10977s0.m41489x0(builder, mVar);
        return builder.mo15671g();
    }

    @C11395k(message = "Use persistentSetOf instead.", replaceWith = @C11587t0(expression = "persistentSetOf(*elements)", imports = {}))
    @C12579k
    /* renamed from: g */
    public static final <E> C8454i<E> m30495g(@C12579k E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "elements");
        return m30468L(Arrays.copyOf(eArr, eArr.length));
    }

    @C12579k
    /* renamed from: g0 */
    public static final <K, V> C8452h<K, V> m30496g0(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        C8452h.C8453a<? extends K, ? extends V> builder = hVar.builder();
        C10977s0.m41491y0(builder, pairArr);
        return builder.mo15671g();
    }

    @C12579k
    /* renamed from: h */
    public static final <E> C8454i<E> m30497h(@C12579k C8448f<? extends E> fVar, @C12579k Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        return m30499i(m30530x0(fVar), iterable);
    }

    @C12579k
    /* renamed from: h0 */
    public static final C8444c<Character> m30498h0(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return m30520s0(charSequence);
    }

    @C12579k
    /* renamed from: i */
    public static final <E> C8454i<E> m30499i(@C12579k C8454i<? extends E> iVar, @C12579k Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return iVar.retainAll((Collection) iterable);
        }
        C8454i.C8455a<? extends E> builder = iVar.builder();
        C10994x.m42354O0(builder, iterable);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: i0 */
    public static final <T> C8444c<T> m30500i0(@C12579k Iterable<? extends T> iterable) {
        C8444c<T> cVar;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof C8444c) {
            cVar = (C8444c) iterable;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return m30522t0(iterable);
        }
        return cVar;
    }

    @C12579k
    /* renamed from: j */
    public static final <E> C8448f<E> m30501j(@C12579k C8448f<? extends E> fVar, @C12579k Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return fVar.removeAll((Collection) iterable);
        }
        C8448f.C8449a<? extends E> builder = fVar.builder();
        C10994x.m42344E0(builder, iterable);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: j0 */
    public static final <T> C8444c<T> m30502j0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m30524u0(mVar);
    }

    @C12579k
    /* renamed from: k */
    public static final <E> C8448f<E> m30503k(@C12579k C8448f<? extends E> fVar, E e) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.remove(e);
    }

    @C12579k
    /* renamed from: k0 */
    public static final <K, V> C8446d<K, V> m30504k0(@C12579k Map<K, ? extends V> map) {
        C8446d<K, V> dVar;
        C8452h.C8453a aVar;
        Intrinsics.checkNotNullParameter(map, "<this>");
        C8452h hVar = null;
        if (map instanceof C8446d) {
            dVar = (C8446d) map;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        if (map instanceof C8452h.C8453a) {
            aVar = (C8452h.C8453a) map;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            hVar = aVar.mo15671g();
        }
        if (hVar != null) {
            return hVar;
        }
        return m30465I().putAll(map);
    }

    @C12579k
    /* renamed from: l */
    public static final <E> C8448f<E> m30505l(@C12579k C8448f<? extends E> fVar, @C12579k C11559m<? extends E> mVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        C8448f.C8449a<? extends E> builder = fVar.builder();
        C10994x.m42346G0(builder, mVar);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: l0 */
    public static final <T> C8447e<T> m30506l0(@C12579k Iterable<? extends T> iterable) {
        C8447e<T> eVar;
        C8454i.C8455a aVar;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        C8454i iVar = null;
        if (iterable instanceof C8447e) {
            eVar = (C8447e) iterable;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        if (iterable instanceof C8454i.C8455a) {
            aVar = (C8454i.C8455a) iterable;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            iVar = aVar.mo15660g();
        }
        if (iVar != null) {
            return iVar;
        }
        return m30482Z(m30467K(), iterable);
    }

    @C12579k
    /* renamed from: m */
    public static final <E> C8448f<E> m30507m(@C12579k C8448f<? extends E> fVar, @C12579k E[] eArr) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(eArr, "elements");
        C8448f.C8449a<? extends E> builder = fVar.builder();
        C10994x.m42347H0(builder, eArr);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: m0 */
    public static final <T> C8447e<T> m30508m0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m30532y0(mVar);
    }

    @C12579k
    /* renamed from: n */
    public static final <E> C8450g<E> m30509n(@C12579k C8450g<? extends E> gVar, @C12579k Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return gVar.removeAll((Collection) iterable);
        }
        C8450g.C8451a<? extends E> builder = gVar.builder();
        C10994x.m42344E0(builder, iterable);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: n0 */
    public static final C8454i<Character> m30510n0(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return m30528w0(charSequence);
    }

    @C12579k
    /* renamed from: o */
    public static final <E> C8450g<E> m30511o(@C12579k C8450g<? extends E> gVar, E e) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.remove(e);
    }

    @C12579k
    /* renamed from: o0 */
    public static final <K, V> C8452h<K, V> m30512o0(@C12579k Map<K, ? extends V> map) {
        C8471d dVar;
        C8474f fVar;
        Intrinsics.checkNotNullParameter(map, "<this>");
        C8471d dVar2 = null;
        if (map instanceof C8471d) {
            dVar = (C8471d) map;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        if (map instanceof C8474f) {
            fVar = (C8474f) map;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            dVar2 = fVar.mo15671g();
        }
        if (dVar2 != null) {
            return dVar2;
        }
        return C8471d.f22848f.mo15803a().putAll(map);
    }

    @C12579k
    /* renamed from: p */
    public static final <E> C8450g<E> m30513p(@C12579k C8450g<? extends E> gVar, @C12579k C11559m<? extends E> mVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        C8450g.C8451a<? extends E> builder = gVar.builder();
        C10994x.m42346G0(builder, mVar);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: p0 */
    public static final C8454i<Character> m30514p0(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        C8454i.C8455a builder = m30461E().builder();
        StringsKt___StringsKt.toCollection(charSequence, builder);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: q */
    public static final <E> C8450g<E> m30515q(@C12579k C8450g<? extends E> gVar, @C12579k E[] eArr) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(eArr, "elements");
        C8450g.C8451a<? extends E> builder = gVar.builder();
        C10994x.m42347H0(builder, eArr);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: q0 */
    public static final <T> C8454i<T> m30516q0(@C12579k Iterable<? extends T> iterable) {
        C8497a aVar;
        C8499b bVar;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        C8497a aVar2 = null;
        if (iterable instanceof C8497a) {
            aVar = (C8497a) iterable;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        if (iterable instanceof C8499b) {
            bVar = (C8499b) iterable;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            aVar2 = bVar.m30798g();
        }
        if (aVar2 != null) {
            return aVar2;
        }
        return m30482Z(C8497a.f22895d.mo15935a(), iterable);
    }

    @C12579k
    /* renamed from: r */
    public static final <K, V> C8452h<K, V> m30517r(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "keys");
        C8452h.C8453a<? extends K, ? extends V> builder = hVar.builder();
        C10994x.m42344E0(builder.keySet(), iterable);
        return builder.mo15671g();
    }

    @C12579k
    /* renamed from: r0 */
    public static final <T> C8454i<T> m30518r0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m30486b0(m30461E(), mVar);
    }

    @C12579k
    /* renamed from: s */
    public static final <K, V> C8452h<K, V> m30519s(@C12579k C8452h<? extends K, ? extends V> hVar, K k) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return hVar.remove(k);
    }

    @C12579k
    /* renamed from: s0 */
    public static final C8450g<Character> m30520s0(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        C8450g.C8451a builder = m30463G().builder();
        StringsKt___StringsKt.toCollection(charSequence, builder);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: t */
    public static final <K, V> C8452h<K, V> m30521t(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k C11559m<? extends K> mVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "keys");
        C8452h.C8453a<? extends K, ? extends V> builder = hVar.builder();
        C10994x.m42346G0(builder.keySet(), mVar);
        return builder.mo15671g();
    }

    @C12579k
    /* renamed from: t0 */
    public static final <T> C8450g<T> m30522t0(@C12579k Iterable<? extends T> iterable) {
        C8450g<T> gVar;
        C8450g.C8451a aVar;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        C8450g<T> gVar2 = null;
        if (iterable instanceof C8450g) {
            gVar = (C8450g) iterable;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        if (iterable instanceof C8450g.C8451a) {
            aVar = (C8450g.C8451a) iterable;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            gVar2 = aVar.mo15660g();
        }
        if (gVar2 == null) {
            return m30473Q(m30463G(), iterable);
        }
        return gVar2;
    }

    @C12579k
    /* renamed from: u */
    public static final <K, V> C8452h<K, V> m30523u(@C12579k C8452h<? extends K, ? extends V> hVar, @C12579k K[] kArr) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(kArr, "keys");
        C8452h.C8453a<? extends K, ? extends V> builder = hVar.builder();
        C10994x.m42347H0(builder.keySet(), kArr);
        return builder.mo15671g();
    }

    @C12579k
    /* renamed from: u0 */
    public static final <T> C8450g<T> m30524u0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m30475S(m30463G(), mVar);
    }

    @C12579k
    /* renamed from: v */
    public static final <E> C8454i<E> m30525v(@C12579k C8454i<? extends E> iVar, @C12579k Iterable<? extends E> iterable) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return iVar.removeAll((Collection) iterable);
        }
        C8454i.C8455a<? extends E> builder = iVar.builder();
        C10994x.m42344E0(builder, iterable);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: v0 */
    public static final <K, V> C8452h<K, V> m30526v0(@C12579k Map<K, ? extends V> map) {
        C8507c cVar;
        C8509d dVar;
        Intrinsics.checkNotNullParameter(map, "<this>");
        C8452h<K, V> hVar = null;
        if (map instanceof C8507c) {
            cVar = (C8507c) map;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        if (map instanceof C8509d) {
            dVar = (C8509d) map;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            hVar = dVar.mo15671g();
        }
        if (hVar == null) {
            return C8507c.f22923g.mo16029a().putAll(map);
        }
        return hVar;
    }

    @C12579k
    /* renamed from: w */
    public static final <E> C8454i<E> m30527w(@C12579k C8454i<? extends E> iVar, E e) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.remove(e);
    }

    @C12579k
    /* renamed from: w0 */
    public static final C8454i<Character> m30528w0(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        C8454i.C8455a builder = m30467K().builder();
        StringsKt___StringsKt.toCollection(charSequence, builder);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: x */
    public static final <E> C8454i<E> m30529x(@C12579k C8454i<? extends E> iVar, @C12579k C11559m<? extends E> mVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        C8454i.C8455a<? extends E> builder = iVar.builder();
        C10994x.m42346G0(builder, mVar);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: x0 */
    public static final <T> C8454i<T> m30530x0(@C12579k Iterable<? extends T> iterable) {
        C8525b bVar;
        C8527c cVar;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        C8454i<T> iVar = null;
        if (iterable instanceof C8525b) {
            bVar = (C8525b) iterable;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        if (iterable instanceof C8527c) {
            cVar = (C8527c) iterable;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            iVar = cVar.mo15660g();
        }
        if (iVar == null) {
            return m30482Z(C8525b.f22955e.mo16097a(), iterable);
        }
        return iVar;
    }

    @C12579k
    /* renamed from: y */
    public static final <E> C8454i<E> m30531y(@C12579k C8454i<? extends E> iVar, @C12579k E[] eArr) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(eArr, "elements");
        C8454i.C8455a<? extends E> builder = iVar.builder();
        C10994x.m42347H0(builder, eArr);
        return builder.mo15660g();
    }

    @C12579k
    /* renamed from: y0 */
    public static final <T> C8454i<T> m30532y0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m30486b0(m30467K(), mVar);
    }

    @C12579k
    /* renamed from: z */
    public static final <T> C8450g<T> m30533z(@C12579k C8450g<? extends T> gVar, @C12579k C11300l<? super List<T>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "mutator");
        C8450g.C8451a<? extends T> builder = gVar.builder();
        lVar.invoke(builder);
        return builder.mo15660g();
    }
}
