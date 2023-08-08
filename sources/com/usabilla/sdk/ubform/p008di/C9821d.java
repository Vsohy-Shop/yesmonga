package com.usabilla.sdk.ubform.p008di;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.di.d */
public final class C9821d implements Map<Class<?>, C9824g<?>>, C11345a {
    @C12579k

    /* renamed from: a */
    public final Map<Class<?>, C9824g<?>> f26875a;

    public C9821d() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public C9824g<?> compute(Class<?> cls, BiFunction<? super Class<?>, ? super C9824g<?>, ? extends C9824g<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public C9824g<?> computeIfAbsent(Class<?> cls, Function<? super Class<?>, ? extends C9824g<?>> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public C9824g<?> computeIfPresent(Class<?> cls, BiFunction<? super Class<?>, ? super C9824g<?>, ? extends C9824g<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            return false;
        }
        return mo20123d((Class) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C9824g)) {
            return false;
        }
        return mo20124e((C9824g) obj);
    }

    /* renamed from: d */
    public boolean mo20123d(@C12579k Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "key");
        return this.f26875a.containsKey(cls);
    }

    /* renamed from: e */
    public boolean mo20124e(@C12579k C9824g<?> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "value");
        return this.f26875a.containsValue(gVar);
    }

    public final /* bridge */ Set<Map.Entry<Class<?>, C9824g<?>>> entrySet() {
        return mo20129i();
    }

    @C12580l
    /* renamed from: f */
    public C9824g<?> mo20126f(@C12579k Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "key");
        return this.f26875a.get(cls);
    }

    /* renamed from: h */
    public final /* bridge */ C9824g<?> get(Object obj) {
        if (!(obj instanceof Class)) {
            return null;
        }
        return mo20126f((Class) obj);
    }

    @C12579k
    /* renamed from: i */
    public Set<Map.Entry<Class<?>, C9824g<?>>> mo20129i() {
        return this.f26875a.entrySet();
    }

    public boolean isEmpty() {
        return this.f26875a.isEmpty();
    }

    @C12579k
    /* renamed from: j */
    public Set<Class<?>> mo20131j() {
        return this.f26875a.keySet();
    }

    public final /* bridge */ Set<Class<?>> keySet() {
        return mo20131j();
    }

    /* renamed from: l */
    public int mo20133l() {
        return this.f26875a.size();
    }

    @C12579k
    /* renamed from: m */
    public Collection<C9824g<?>> mo20134m() {
        return this.f26875a.values();
    }

    /* renamed from: n */
    public C9824g<?> merge(Class<?> cls, C9824g<?> gVar, BiFunction<? super C9824g<?>, ? super C9824g<?>, ? extends C9824g<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: o */
    public C9824g<?> put(Class<?> cls, C9824g<?> gVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: p */
    public C9824g<?> putIfAbsent(Class<?> cls, C9824g<?> gVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends Class<?>, ? extends C9824g<?>> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: q */
    public C9824g<?> remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: r */
    public C9824g<?> replace(Class<?> cls, C9824g<?> gVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super Class<?>, ? super C9824g<?>, ? extends C9824g<?>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: s */
    public boolean replace(Class<?> cls, C9824g<?> gVar, C9824g<?> gVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo20133l();
    }

    public final /* bridge */ Collection<C9824g<?>> values() {
        return mo20134m();
    }

    public C9821d(@C12579k Map<Class<?>, ? extends C9824g<?>> map) {
        Intrinsics.checkNotNullParameter(map, "providers");
        this.f26875a = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9821d(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HashMap() : map);
    }
}
