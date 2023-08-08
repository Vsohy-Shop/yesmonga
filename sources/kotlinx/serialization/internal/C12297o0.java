package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.o0 */
public final class C12297o0<E> extends C12303q0<E, Set<? extends E>, LinkedHashSet<E>> {
    @C12579k

    /* renamed from: b */
    public final C12217f f30094b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12297o0(@C12579k C12248g<E> gVar) {
        super(gVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, "eSerializer");
        this.f30094b = new C12294n0(gVar.getDescriptor());
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30094b;
    }

    @C12579k
    /* renamed from: o */
    public LinkedHashSet<E> mo25003a() {
        return new LinkedHashSet<>();
    }

    /* renamed from: p */
    public int mo25004b(@C12579k LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* renamed from: q */
    public void mo25005c(@C12579k LinkedHashSet<E> linkedHashSet, int i) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
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
    public void mo25024n(@C12579k LinkedHashSet<E> linkedHashSet, int i, E e) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(e);
    }

    @C12579k
    /* renamed from: u */
    public LinkedHashSet<E> mo25012k(@C12579k Set<? extends E> set) {
        LinkedHashSet<E> linkedHashSet;
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet<>(set);
        }
        return linkedHashSet;
    }

    @C12579k
    /* renamed from: v */
    public Set<E> mo25013l(@C12579k LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
