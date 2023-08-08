package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.q0 */
public abstract class C12303q0<Element, Collection, Builder> extends C12253a<Element, Collection, Builder> {
    @C12579k

    /* renamed from: a */
    public final C12248g<Element> f30107a;

    public /* synthetic */ C12303q0(C12248g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar);
    }

    /* renamed from: g */
    public final void mo25009g(@C12579k C12236c cVar, Builder builder, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i3 = 0; i3 < i2; i3++) {
                mo25010h(cVar, i3 + i, builder, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @C12579k
    public abstract C12217f getDescriptor();

    /* renamed from: h */
    public void mo25010h(@C12579k C12236c cVar, int i, Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        mo25024n(builder, i, C12236c.C12238b.m49005d(cVar, getDescriptor(), i, this.f30107a, (Object) null, 8, (Object) null));
    }

    /* renamed from: n */
    public abstract void mo25024n(Builder builder, int i, Element element);

    public void serialize(@C12579k C12244g gVar, Collection collection) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        int e = mo25007e(collection);
        C12217f descriptor = getDescriptor();
        C12239d j = gVar.mo24913j(descriptor, e);
        Iterator d = mo25006d(collection);
        for (int i = 0; i < e; i++) {
            j.mo24899D(getDescriptor(), i, this.f30107a, d.next());
        }
        j.mo24907c(descriptor);
    }

    public C12303q0(C12248g<Element> gVar) {
        super((DefaultConstructorMarker) null);
        this.f30107a = gVar;
    }
}
