package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C11532s0;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.C11333h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.l1 */
public final class C12289l1<ElementKlass, Element extends ElementKlass> extends C12303q0<Element, Element[], ArrayList<Element>> {
    @C12579k

    /* renamed from: b */
    public final C11494d<ElementKlass> f30085b;
    @C12579k

    /* renamed from: c */
    public final C12217f f30086c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12289l1(@C12579k C11494d<ElementKlass> dVar, @C12579k C12248g<Element> gVar) {
        super(gVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        Intrinsics.checkNotNullParameter(gVar, "eSerializer");
        this.f30085b = dVar;
        this.f30086c = new C12262d(gVar.getDescriptor());
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30086c;
    }

    @C12579k
    /* renamed from: o */
    public ArrayList<Element> mo25003a() {
        return new ArrayList<>();
    }

    /* renamed from: p */
    public int mo25004b(@C12579k ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* renamed from: q */
    public void mo25005c(@C12579k ArrayList<Element> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @C12579k
    /* renamed from: r */
    public Iterator<Element> mo25006d(@C12579k Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return C11333h.m43500a(elementArr);
    }

    /* renamed from: s */
    public int mo25007e(@C12579k Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return elementArr.length;
    }

    /* renamed from: t */
    public void mo25024n(@C12579k ArrayList<Element> arrayList, int i, Element element) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, element);
    }

    @C12579k
    /* renamed from: u */
    public ArrayList<Element> mo25012k(@C12579k Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return new ArrayList<>(C10956m.m41290t(elementArr));
    }

    @C12579k
    /* renamed from: v */
    public Element[] mo25013l(@C12579k ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return C12255a1.m49222o(arrayList, this.f30085b);
    }
}
