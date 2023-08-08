package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12271f1;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.h1 */
public abstract class C12277h1<Element, Array, Builder extends C12271f1<Array>> extends C12303q0<Element, Array, Builder> {
    @C12579k

    /* renamed from: b */
    public final C12217f f30069b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12277h1(@C12579k C12248g<Element> gVar) {
        super(gVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, "primitiveSerializer");
        this.f30069b = new C12274g1(gVar.getDescriptor());
    }

    @C12579k
    /* renamed from: d */
    public final Iterator<Element> mo25006d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    public final Array deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        return mo25008f(eVar, null);
    }

    @C12579k
    public final C12217f getDescriptor() {
        return this.f30069b;
    }

    @C12579k
    /* renamed from: o */
    public final Builder mo25003a() {
        return (C12271f1) mo25012k(mo25051r());
    }

    /* renamed from: p */
    public final int mo25004b(@C12579k Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return builder.mo25045d();
    }

    /* renamed from: q */
    public final void mo25005c(@C12579k Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.mo25044b(i);
    }

    /* renamed from: r */
    public abstract Array mo25051r();

    /* renamed from: s */
    public final void mo25024n(@C12579k Builder builder, int i, Element element) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public final void serialize(@C12579k C12244g gVar, Array array) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        int e = mo25007e(array);
        C12217f fVar = this.f30069b;
        C12239d j = gVar.mo24913j(fVar, e);
        mo25053v(j, array, e);
        j.mo24907c(fVar);
    }

    /* renamed from: t */
    public abstract void mo25052t(@C12579k C12236c cVar, int i, @C12579k Builder builder, boolean z);

    /* renamed from: u */
    public final Array mo25013l(@C12579k Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return builder.mo25043a();
    }

    /* renamed from: v */
    public abstract void mo25053v(@C12579k C12239d dVar, Array array, int i);
}
