package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C12247f
@C11532s0
/* renamed from: kotlinx.serialization.internal.f */
public final class C12269f<E> extends C12303q0<E, List<? extends E>, ArrayList<E>> {
    @C12579k

    /* renamed from: b */
    public final C12217f f30059b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12269f(@C12579k C12248g<E> gVar) {
        super(gVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, "element");
        this.f30059b = new C12265e(gVar.getDescriptor());
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30059b;
    }

    @C12579k
    /* renamed from: o */
    public ArrayList<E> mo25003a() {
        return new ArrayList<>();
    }

    /* renamed from: p */
    public int mo25004b(@C12579k ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* renamed from: q */
    public void mo25005c(@C12579k ArrayList<E> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @C12579k
    /* renamed from: r */
    public Iterator<E> mo25006d(@C12579k List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.iterator();
    }

    /* renamed from: s */
    public int mo25007e(@C12579k List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size();
    }

    /* renamed from: t */
    public void mo25024n(@C12579k ArrayList<E> arrayList, int i, E e) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, e);
    }

    @C12579k
    /* renamed from: u */
    public ArrayList<E> mo25012k(@C12579k List<? extends E> list) {
        ArrayList<E> arrayList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList<>(list);
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: v */
    public List<E> mo25013l(@C12579k ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }
}
