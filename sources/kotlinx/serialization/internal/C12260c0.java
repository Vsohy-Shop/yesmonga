package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.c0 */
public final class C12260c0<E> extends C12303q0<E, Set<? extends E>, HashSet<E>> {
    @C12579k

    /* renamed from: b */
    public final C12217f f30055b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12260c0(@C12579k C12248g<E> gVar) {
        super(gVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, "eSerializer");
        this.f30055b = new C12257b0(gVar.getDescriptor());
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30055b;
    }

    @C12579k
    /* renamed from: o */
    public HashSet<E> mo25003a() {
        return new HashSet<>();
    }

    /* renamed from: p */
    public int mo25004b(@C12579k HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    /* renamed from: q */
    public void mo25005c(@C12579k HashSet<E> hashSet, int i) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
    }

    @C12579k
    /* renamed from: r */
    public Iterator<E> mo25006d(@C12579k Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return set.iterator();
    }

    /* renamed from: s */
    public int mo25007e(@C12579k Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return set.size();
    }

    /* renamed from: t */
    public void mo25024n(@C12579k HashSet<E> hashSet, int i, E e) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(e);
    }

    @C12579k
    /* renamed from: u */
    public HashSet<E> mo25012k(@C12579k Set<? extends E> set) {
        HashSet<E> hashSet;
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (set instanceof HashSet) {
            hashSet = (HashSet) set;
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            return new HashSet<>(set);
        }
        return hashSet;
    }

    @C12579k
    /* renamed from: v */
    public Set<E> mo25013l(@C12579k HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }
}
