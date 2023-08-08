package kotlinx.serialization.json;

import com.google.firebase.installations.local.C33093b;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o(with = C12419w.class)
public final class JsonObject extends C12403k implements Map<String, C12403k>, C11345a {
    @C12579k
    public static final C12340a Companion = new C12340a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final Map<String, C12403k> f30172a;

    /* renamed from: kotlinx.serialization.json.JsonObject$a */
    public static final class C12340a {
        public /* synthetic */ C12340a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<JsonObject> serializer() {
            return C12419w.f30358a;
        }

        public C12340a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonObject(@C12579k Map<String, ? extends C12403k> map) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(map, "content");
        this.f30172a = map;
    }

    @C12579k
    /* renamed from: H */
    public Set<Map.Entry<String, C12403k>> mo25234H() {
        return this.f30172a.entrySet();
    }

    @C12579k
    /* renamed from: M */
    public Set<String> mo25235M() {
        return this.f30172a.keySet();
    }

    /* renamed from: Q */
    public int mo25236Q() {
        return this.f30172a.size();
    }

    @C12579k
    /* renamed from: W */
    public Collection<C12403k> mo25237W() {
        return this.f30172a.values();
    }

    /* renamed from: X */
    public C12403k merge(String str, C12403k kVar, BiFunction<? super C12403k, ? super C12403k, ? extends C12403k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return mo25263q((String) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C12403k)) {
            return false;
        }
        return mo25264r((C12403k) obj);
    }

    /* renamed from: e */
    public C12403k compute(String str, BiFunction<? super String, ? super C12403k, ? extends C12403k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: e0 */
    public C12403k put(String str, C12403k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ Set<Map.Entry<String, C12403k>> entrySet() {
        return mo25234H();
    }

    public boolean equals(@C12580l Object obj) {
        return Intrinsics.areEqual((Object) this.f30172a, obj);
    }

    /* renamed from: f0 */
    public C12403k putIfAbsent(String str, C12403k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: h */
    public C12403k computeIfAbsent(String str, Function<? super String, ? extends C12403k> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: h0 */
    public C12403k remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return this.f30172a.hashCode();
    }

    /* renamed from: i */
    public C12403k computeIfPresent(String str, BiFunction<? super String, ? super C12403k, ? extends C12403k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: i0 */
    public C12403k replace(String str, C12403k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean isEmpty() {
        return this.f30172a.isEmpty();
    }

    /* renamed from: j0 */
    public boolean replace(String str, C12403k kVar, C12403k kVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ Set<String> keySet() {
        return mo25235M();
    }

    public void putAll(Map<? extends String, ? extends C12403k> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: q */
    public boolean mo25263q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f30172a.containsKey(str);
    }

    /* renamed from: r */
    public boolean mo25264r(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "value");
        return this.f30172a.containsValue(kVar);
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super C12403k, ? extends C12403k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo25236Q();
    }

    @C12579k
    public String toString() {
        return CollectionsKt___CollectionsKt.m40639h3(this.f30172a.entrySet(), ",", C33093b.f80281i, "}", 0, (CharSequence) null, JsonObject$toString$1.f30173f, 24, (Object) null);
    }

    public final /* bridge */ Collection<C12403k> values() {
        return mo25237W();
    }

    /* renamed from: w */
    public final /* bridge */ C12403k get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return mo25274y((String) obj);
    }

    @C12580l
    /* renamed from: y */
    public C12403k mo25274y(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f30172a.get(str);
    }
}
