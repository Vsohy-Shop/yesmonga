package kotlin.collections;

import com.google.firebase.installations.local.C33093b;
import com.google.zxing.client.android.C34651e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C11665v0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.1")
@C11363r0({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
public abstract class AbstractMap<K, V> implements Map<K, V>, C11345a {
    @C12579k

    /* renamed from: c */
    public static final C10872a f28086c = new C10872a((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: a */
    public volatile Set<? extends K> f28087a;
    @C12580l

    /* renamed from: b */
    public volatile Collection<? extends V> f28088b;

    @C11363r0({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    /* renamed from: kotlin.collections.AbstractMap$a */
    public static final class C10872a {
        public /* synthetic */ C10872a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo21924a(@C12579k Map.Entry<?, ?> entry, @C12580l Object obj) {
            Intrinsics.checkNotNullParameter(entry, C34651e.f83829d);
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (!Intrinsics.areEqual((Object) entry.getKey(), entry2.getKey()) || !Intrinsics.areEqual((Object) entry.getValue(), entry2.getValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final int mo21925b(@C12579k Map.Entry<?, ?> entry) {
            int i;
            Intrinsics.checkNotNullParameter(entry, C34651e.f83829d);
            Object key = entry.getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            Object value = entry.getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        @C12579k
        /* renamed from: c */
        public final String mo21926c(@C12579k Map.Entry<?, ?> entry) {
            Intrinsics.checkNotNullParameter(entry, C34651e.f83829d);
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }

        public C10872a() {
        }
    }

    /* renamed from: kotlin.collections.AbstractMap$b */
    public static final class C10873b extends C10937g<K> {

        /* renamed from: b */
        public final /* synthetic */ AbstractMap<K, V> f28089b;

        /* renamed from: kotlin.collections.AbstractMap$b$a */
        public static final class C10874a implements Iterator<K>, C11345a {

            /* renamed from: a */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f28090a;

            public C10874a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f28090a = it;
            }

            public boolean hasNext() {
                return this.f28090a.hasNext();
            }

            public K next() {
                return this.f28090a.next().getKey();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        public C10873b(AbstractMap<K, ? extends V> abstractMap) {
            this.f28089b = abstractMap;
        }

        public boolean contains(Object obj) {
            return this.f28089b.containsKey(obj);
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28089b.size();
        }

        @C12579k
        public Iterator<K> iterator() {
            return new C10874a(this.f28089b.entrySet().iterator());
        }
    }

    /* renamed from: kotlin.collections.AbstractMap$c */
    public static final class C10875c extends AbstractCollection<V> {

        /* renamed from: a */
        public final /* synthetic */ AbstractMap<K, V> f28091a;

        /* renamed from: kotlin.collections.AbstractMap$c$a */
        public static final class C10876a implements Iterator<V>, C11345a {

            /* renamed from: a */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f28092a;

            public C10876a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f28092a = it;
            }

            public boolean hasNext() {
                return this.f28092a.hasNext();
            }

            public V next() {
                return this.f28092a.next().getValue();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        public C10875c(AbstractMap<K, ? extends V> abstractMap) {
            this.f28091a = abstractMap;
        }

        public boolean contains(Object obj) {
            return this.f28091a.containsValue(obj);
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28091a.size();
        }

        @C12579k
        public Iterator<V> iterator() {
            return new C10876a(this.f28091a.entrySet().iterator());
        }
    }

    /* renamed from: b */
    public final boolean mo21911b(@C12580l Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!Intrinsics.areEqual((Object) value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        if (!containsKey(key)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Set mo15788c();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return mo21915h(obj) != null;
    }

    public boolean containsValue(Object obj) {
        Iterable<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (Intrinsics.areEqual(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: d */
    public Set<K> mo15790d() {
        if (this.f28087a == null) {
            this.f28087a = new C10873b(this);
        }
        Set<? extends K> set = this.f28087a;
        Intrinsics.checkNotNull(set);
        return set;
    }

    /* renamed from: e */
    public int mo15791e() {
        return entrySet().size();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo15788c();
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterable<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return true;
        }
        for (Map.Entry b : entrySet) {
            if (!mo21911b(b)) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    /* renamed from: f */
    public Collection<V> mo15792f() {
        if (this.f28088b == null) {
            this.f28088b = new C10875c(this);
        }
        Collection<? extends V> collection = this.f28088b;
        Intrinsics.checkNotNull(collection);
        return collection;
    }

    @C12580l
    public V get(Object obj) {
        Map.Entry h = mo21915h(obj);
        if (h != null) {
            return h.getValue();
        }
        return null;
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo21915h(K k) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Map.Entry) obj).getKey(), (Object) k)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    /* renamed from: i */
    public final String mo21917i(Object obj) {
        if (obj == this) {
            return "(this Map)";
        }
        return String.valueOf(obj);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final String mo21919j(Map.Entry<? extends K, ? extends V> entry) {
        return mo21917i(entry.getKey()) + '=' + mo21917i(entry.getValue());
    }

    public final /* bridge */ Set<K> keySet() {
        return mo15790d();
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo15791e();
    }

    @C12579k
    public String toString() {
        return CollectionsKt___CollectionsKt.m40639h3(entrySet(), ", ", C33093b.f80281i, "}", 0, (CharSequence) null, new AbstractMap$toString$1(this), 24, (Object) null);
    }

    public final /* bridge */ Collection<V> values() {
        return mo15792f();
    }
}
