package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8454i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8471d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10937g;
import kotlin.collections.C10994x;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.b */
public final class C8525b<E> extends C10937g<E> implements C8454i<E> {
    @C12579k

    /* renamed from: e */
    public static final C8526a f22955e = new C8526a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final C8525b f22956f;
    @C12580l

    /* renamed from: b */
    public final Object f22957b;
    @C12580l

    /* renamed from: c */
    public final Object f22958c;
    @C12579k

    /* renamed from: d */
    public final C8471d<E, C8524a> f22959d;

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.b$a */
    public static final class C8526a {
        public /* synthetic */ C8526a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final <E> C8454i<E> mo16097a() {
            return C8525b.f22956f;
        }

        public C8526a() {
        }
    }

    static {
        C8532c cVar = C8532c.f22972a;
        f22956f = new C8525b(cVar, cVar, C8471d.f22848f.mo15803a());
    }

    public C8525b(@C12580l Object obj, @C12580l Object obj2, @C12579k C8471d<E, C8524a> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "hashMap");
        this.f22957b = obj;
        this.f22958c = obj2;
        this.f22959d = dVar;
    }

    public boolean contains(Object obj) {
        return this.f22959d.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22959d.size();
    }

    @C12580l
    /* renamed from: i */
    public final Object mo16094i() {
        return this.f22957b;
    }

    @C12579k
    public Iterator<E> iterator() {
        return new C8528d(this.f22957b, this.f22959d);
    }

    @C12579k
    /* renamed from: q */
    public final C8471d<E, C8524a> mo16095q() {
        return this.f22959d;
    }

    @C12580l
    /* renamed from: r */
    public final Object mo16096r() {
        return this.f22958c;
    }

    @C12579k
    /* renamed from: D */
    public C8454i<E> m30934D(@C12579k C11300l<? super E, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        C8454i.C8455a builder = builder();
        C10994x.m42343D0(builder, lVar);
        return builder.mo15660g();
    }

    @C12579k
    public C8454i<E> add(E e) {
        if (this.f22959d.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new C8525b(e, e, this.f22959d.put(e, new C8524a()));
        }
        Object obj = this.f22958c;
        C8524a aVar = this.f22959d.get(obj);
        Intrinsics.checkNotNull(aVar);
        return new C8525b(this.f22957b, e, this.f22959d.put(obj, aVar.mo16092e(e)).put(e, new C8524a(obj)));
    }

    @C12579k
    public C8454i<E> addAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        C8454i.C8455a builder = builder();
        builder.addAll(collection);
        return builder.mo15660g();
    }

    @C12579k
    public C8454i.C8455a<E> builder() {
        return new C8527c(this);
    }

    @C12579k
    public C8454i<E> clear() {
        return f22955e.mo16097a();
    }

    @C12579k
    public C8454i<E> remove(E e) {
        C8524a aVar = this.f22959d.get(e);
        if (aVar == null) {
            return this;
        }
        C8471d<E, C8524a> s = this.f22959d.remove(e);
        if (aVar.mo16089b()) {
            C8524a aVar2 = s.get(aVar.mo16091d());
            Intrinsics.checkNotNull(aVar2);
            s = s.put(aVar.mo16091d(), aVar2.mo16092e(aVar.mo16090c()));
        }
        if (aVar.mo16088a()) {
            C8524a aVar3 = s.get(aVar.mo16090c());
            Intrinsics.checkNotNull(aVar3);
            s = s.put(aVar.mo16090c(), aVar3.mo16093f(aVar.mo16091d()));
        }
        return new C8525b(!aVar.mo16089b() ? aVar.mo16090c() : this.f22957b, !aVar.mo16088a() ? aVar.mo16091d() : this.f22958c, s);
    }

    @C12579k
    public C8454i<E> removeAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        C8454i.C8455a builder = builder();
        builder.removeAll(collection);
        return builder.mo15660g();
    }

    @C12579k
    public C8454i<E> retainAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        C8454i.C8455a builder = builder();
        builder.retainAll(collection);
        return builder.mo15660g();
    }
}
