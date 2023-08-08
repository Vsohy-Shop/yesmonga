package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
public final class TripleSerializer<A, B, C> implements C12248g<Triple<? extends A, ? extends B, ? extends C>> {
    @C12579k

    /* renamed from: a */
    public final C12248g<A> f30049a;
    @C12579k

    /* renamed from: b */
    public final C12248g<B> f30050b;
    @C12579k

    /* renamed from: c */
    public final C12248g<C> f30051c;
    @C12579k

    /* renamed from: d */
    public final C12217f f30052d = SerialDescriptorsKt.m48843c("kotlin.Triple", new C12217f[0], new TripleSerializer$descriptor$1(this));

    public TripleSerializer(@C12579k C12248g<A> gVar, @C12579k C12248g<B> gVar2, @C12579k C12248g<C> gVar3) {
        Intrinsics.checkNotNullParameter(gVar, "aSerializer");
        Intrinsics.checkNotNullParameter(gVar2, "bSerializer");
        Intrinsics.checkNotNullParameter(gVar3, "cSerializer");
        this.f30049a = gVar;
        this.f30050b = gVar2;
        this.f30051c = gVar3;
    }

    /* renamed from: d */
    public final Triple<A, B, C> mo24998d(C12236c cVar) {
        Object d = C12236c.C12238b.m49005d(cVar, getDescriptor(), 0, this.f30049a, (Object) null, 8, (Object) null);
        Object d2 = C12236c.C12238b.m49005d(cVar, getDescriptor(), 1, this.f30050b, (Object) null, 8, (Object) null);
        Object d3 = C12236c.C12238b.m49005d(cVar, getDescriptor(), 2, this.f30051c, (Object) null, 8, (Object) null);
        cVar.mo24876c(getDescriptor());
        return new Triple<>(d, d2, d3);
    }

    /* renamed from: e */
    public final Triple<A, B, C> mo24999e(C12236c cVar) {
        Object a = C12317u1.f30134a;
        Object a2 = C12317u1.f30134a;
        Object a3 = C12317u1.f30134a;
        while (true) {
            int o = cVar.mo24931o(getDescriptor());
            if (o == -1) {
                cVar.mo24876c(getDescriptor());
                if (a == C12317u1.f30134a) {
                    throw new SerializationException("Element 'first' is missing");
                } else if (a2 == C12317u1.f30134a) {
                    throw new SerializationException("Element 'second' is missing");
                } else if (a3 != C12317u1.f30134a) {
                    return new Triple<>(a, a2, a3);
                } else {
                    throw new SerializationException("Element 'third' is missing");
                }
            } else if (o == 0) {
                a = C12236c.C12238b.m49005d(cVar, getDescriptor(), 0, this.f30049a, (Object) null, 8, (Object) null);
            } else if (o == 1) {
                a2 = C12236c.C12238b.m49005d(cVar, getDescriptor(), 1, this.f30050b, (Object) null, 8, (Object) null);
            } else if (o == 2) {
                a3 = C12236c.C12238b.m49005d(cVar, getDescriptor(), 2, this.f30051c, (Object) null, 8, (Object) null);
            } else {
                throw new SerializationException(Intrinsics.stringPlus("Unexpected index ", Integer.valueOf(o)));
            }
        }
    }

    @C12579k
    /* renamed from: f */
    public Triple<A, B, C> deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12236c b = eVar.mo24875b(getDescriptor());
        if (b.mo24886p()) {
            return mo24998d(b);
        }
        return mo24999e(b);
    }

    /* renamed from: g */
    public void serialize(@C12579k C12244g gVar, @C12579k Triple<? extends A, ? extends B, ? extends C> triple) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(triple, "value");
        C12239d b = gVar.mo24906b(getDescriptor());
        b.mo24899D(getDescriptor(), 0, this.f30049a, triple.mo21872f());
        b.mo24899D(getDescriptor(), 1, this.f30050b, triple.mo21873g());
        b.mo24899D(getDescriptor(), 2, this.f30051c, triple.mo21874h());
        b.mo24907c(getDescriptor());
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30052d;
    }
}
