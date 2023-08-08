package kotlinx.serialization.internal;

import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.k0 */
public abstract class C12285k0<K, V, R> implements C12248g<R> {
    @C12579k

    /* renamed from: a */
    public final C12248g<K> f30080a;
    @C12579k

    /* renamed from: b */
    public final C12248g<V> f30081b;

    public /* synthetic */ C12285k0(C12248g gVar, C12248g gVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, gVar2);
    }

    /* renamed from: a */
    public abstract K mo24944a(R r);

    @C12579k
    /* renamed from: b */
    public final C12248g<K> mo25086b() {
        return this.f30080a;
    }

    /* renamed from: c */
    public abstract V mo24945c(R r);

    @C12579k
    /* renamed from: d */
    public final C12248g<V> mo25087d() {
        return this.f30081b;
    }

    public R deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12236c b = eVar.mo24875b(getDescriptor());
        if (b.mo24886p()) {
            C12236c cVar = b;
            return mo24946e(C12236c.C12238b.m49005d(cVar, getDescriptor(), 0, this.f30080a, (Object) null, 8, (Object) null), C12236c.C12238b.m49005d(cVar, getDescriptor(), 1, this.f30081b, (Object) null, 8, (Object) null));
        }
        Object a = C12317u1.f30134a;
        Object a2 = C12317u1.f30134a;
        while (true) {
            int o = b.mo24931o(getDescriptor());
            if (o == -1) {
                b.mo24876c(getDescriptor());
                if (a == C12317u1.f30134a) {
                    throw new SerializationException("Element 'key' is missing");
                } else if (a2 != C12317u1.f30134a) {
                    return mo24946e(a, a2);
                } else {
                    throw new SerializationException("Element 'value' is missing");
                }
            } else if (o == 0) {
                a = C12236c.C12238b.m49005d(b, getDescriptor(), 0, this.f30080a, (Object) null, 8, (Object) null);
            } else if (o == 1) {
                a2 = C12236c.C12238b.m49005d(b, getDescriptor(), 1, this.f30081b, (Object) null, 8, (Object) null);
            } else {
                throw new SerializationException(Intrinsics.stringPlus("Invalid index: ", Integer.valueOf(o)));
            }
        }
    }

    /* renamed from: e */
    public abstract R mo24946e(K k, V v);

    public void serialize(@C12579k C12244g gVar, R r) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        C12239d b = gVar.mo24906b(getDescriptor());
        b.mo24899D(getDescriptor(), 0, this.f30080a, mo24944a(r));
        b.mo24899D(getDescriptor(), 1, this.f30081b, mo24945c(r));
        b.mo24907c(getDescriptor());
    }

    public C12285k0(C12248g<K> gVar, C12248g<V> gVar2) {
        this.f30080a = gVar;
        this.f30081b = gVar2;
    }
}
