package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12250i;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12247f
/* renamed from: kotlinx.serialization.internal.b */
public abstract class C12256b<T> implements C12248g<T> {
    /* renamed from: a */
    public final T mo25023a(C12236c cVar) {
        return C12236c.C12238b.m49005d(cVar, getDescriptor(), 1, C12250i.m49067a(this, cVar, cVar.mo24884m(getDescriptor(), 0)), (Object) null, 8, (Object) null);
    }

    @C12247f
    @C12580l
    /* renamed from: b */
    public C12199c<? extends T> mo24811b(@C12579k C12236c cVar, @C12580l String str) {
        Intrinsics.checkNotNullParameter(cVar, "decoder");
        return cVar.mo24930a().mo25580e(mo24807d(), str);
    }

    @C12247f
    @C12580l
    /* renamed from: c */
    public C12440p<T> mo24812c(@C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        return gVar.mo24934a().mo25581f(mo24807d(), t);
    }

    @C12579k
    /* renamed from: d */
    public abstract C11494d<T> mo24807d();

    @C12579k
    public final T deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12217f descriptor = getDescriptor();
        C12236c b = eVar.mo24875b(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (b.mo24886p()) {
            T a = mo25023a(b);
            b.mo24876c(descriptor);
            return a;
        }
        T t = null;
        while (true) {
            int o = b.mo24931o(getDescriptor());
            if (o != -1) {
                if (o == 0) {
                    objectRef.element = b.mo24884m(getDescriptor(), o);
                } else if (o != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid index in polymorphic deserialization of ");
                    String str = (String) objectRef.element;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(o);
                    throw new SerializationException(sb.toString());
                } else {
                    T t2 = objectRef.element;
                    if (t2 != null) {
                        objectRef.element = t2;
                        C12199c a2 = C12250i.m49067a(this, b, (String) t2);
                        t = C12236c.C12238b.m49005d(b, getDescriptor(), o, a2, (Object) null, 8, (Object) null);
                    } else {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                }
            } else if (t != null) {
                b.mo24876c(descriptor);
                return t;
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Polymorphic value has not been read for class ", objectRef.element).toString());
            }
        }
    }

    public final void serialize(@C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        C12440p b = C12250i.m49068b(this, gVar, t);
        C12217f descriptor = getDescriptor();
        C12239d b2 = gVar.mo24906b(descriptor);
        b2.mo24929z(getDescriptor(), 0, b.getDescriptor().mo24830h());
        b2.mo24899D(getDescriptor(), 1, b, t);
        b2.mo24907c(descriptor);
    }
}
