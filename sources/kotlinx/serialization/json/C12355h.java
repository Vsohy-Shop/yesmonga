package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlin.text.C11626x;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.C12442r;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.h */
public abstract class C12355h<T> implements C12248g<T> {
    @C12579k

    /* renamed from: a */
    public final C11494d<T> f30213a;
    @C12579k

    /* renamed from: b */
    public final C12217f f30214b;

    public C12355h(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        this.f30213a = dVar;
        this.f30214b = SerialDescriptorsKt.m48846f("JsonContentPolymorphicSerializer<" + dVar.mo22848s() + C11626x.f28915f, C12204d.C12206b.f29993a, new C12217f[0], (C11300l) null, 8, (Object) null);
    }

    @C12579k
    /* renamed from: a */
    public abstract C12199c<? extends T> mo25370a(@C12579k C12403k kVar);

    /* renamed from: b */
    public final Void mo25371b(C11494d<?> dVar, C11494d<?> dVar2) {
        String s = dVar.mo22848s();
        if (s == null) {
            s = String.valueOf(dVar);
        }
        throw new SerializationException("Class '" + s + "' is not registered for polymorphic serialization " + ("in the scope of '" + dVar2.mo22848s() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @C12579k
    public final T deserialize(@C12579k C12241e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "decoder");
        C12356i d = C12407n.m50189d(eVar);
        C12403k g = d.mo25373g();
        return d.mo25372d().mo25280f((C12248g) mo25370a(g), g);
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30214b;
    }

    public final void serialize(@C12579k C12244g gVar, @C12579k T t) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(t, "value");
        C12440p<T> f = gVar.mo24934a().mo25581f(this.f30213a, t);
        if (f == null && (f = C12442r.m50319j(C11342l0.m43547d(t.getClass()))) == null) {
            mo25371b(C11342l0.m43547d(t.getClass()), this.f30213a);
            throw new KotlinNothingValueException();
        } else {
            ((C12248g) f).serialize(gVar, t);
        }
    }
}
