package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8454i;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10937g;
import kotlin.collections.C10994x;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a */
public final class C8497a<E> extends C10937g<E> implements C8454i<E> {
    @C12579k

    /* renamed from: d */
    public static final C8498a f22895d = new C8498a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final C8497a f22896e = new C8497a(C8502e.f22911d.mo16002a(), 0);
    @C12579k

    /* renamed from: b */
    public final C8502e<E> f22897b;

    /* renamed from: c */
    public final int f22898c;

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.a$a */
    public static final class C8498a {
        public /* synthetic */ C8498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final <E> C8454i<E> mo15935a() {
            return C8497a.f22896e;
        }

        public C8498a() {
        }
    }

    public C8497a(@C12579k C8502e<E> eVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "node");
        this.f22897b = eVar;
        this.f22898c = i;
    }

    public boolean contains(Object obj) {
        return this.f22897b.mo15984i(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection instanceof C8497a) {
            return this.f22897b.mo15985j(((C8497a) collection).f22897b, 0);
        }
        if (collection instanceof C8499b) {
            return this.f22897b.mo15985j(((C8499b) collection).mo15943q(), 0);
        }
        return super.containsAll(collection);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22898c;
    }

    @C12579k
    /* renamed from: i */
    public final C8502e<E> mo15934i() {
        return this.f22897b;
    }

    @C12579k
    public Iterator<E> iterator() {
        return new C8500c(this.f22897b);
    }

    @C12579k
    /* renamed from: D */
    public C8454i<E> m30792D(@C12579k C11300l<? super E, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        C8454i.C8455a builder = builder();
        C10994x.m42343D0(builder, lVar);
        return builder.mo15660g();
    }

    @C12579k
    public C8454i<E> add(E e) {
        C8502e<E> b = this.f22897b.mo15977b(e != null ? e.hashCode() : 0, e, 0);
        if (this.f22897b == b) {
            return this;
        }
        return new C8497a(b, size() + 1);
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
        return new C8499b(this);
    }

    @C12579k
    public C8454i<E> clear() {
        return f22895d.mo15935a();
    }

    @C12579k
    public C8454i<E> remove(E e) {
        C8502e<E> K = this.f22897b.mo15971K(e != null ? e.hashCode() : 0, e, 0);
        if (this.f22897b == K) {
            return this;
        }
        return new C8497a(K, size() - 1);
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
