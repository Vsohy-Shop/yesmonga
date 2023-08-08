package kotlinx.serialization.json.internal;

import com.urbanairship.analytics.location.C35560b;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.c0 */
public final class C12364c0 implements SerializersModuleCollector {

    /* renamed from: a */
    public final boolean f30279a;
    @C12579k

    /* renamed from: b */
    public final String f30280b;

    public C12364c0(boolean z, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "discriminator");
        this.f30279a = z;
        this.f30280b = str;
    }

    /* renamed from: a */
    public <Base, Sub extends Base> void mo25476a(@C12579k C11494d<Base> dVar, @C12579k C11494d<Sub> dVar2, @C12579k C12248g<Sub> gVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(dVar2, "actualClass");
        Intrinsics.checkNotNullParameter(gVar, "actualSerializer");
        C12217f descriptor = gVar.getDescriptor();
        mo25483h(descriptor, dVar2);
        if (!this.f30279a) {
            mo25482g(descriptor, dVar2);
        }
    }

    /* renamed from: b */
    public <Base> void mo25477b(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(lVar, "defaultDeserializerProvider");
    }

    /* renamed from: c */
    public <T> void mo25478c(@C12579k C11494d<T> dVar, @C12579k C12248g<T> gVar) {
        SerializersModuleCollector.DefaultImpls.m50262a(this, dVar, gVar);
    }

    /* renamed from: d */
    public <Base> void mo25479d(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super Base, ? extends C12440p<? super Base>> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(lVar, "defaultSerializerProvider");
    }

    /* renamed from: e */
    public <Base> void mo25480e(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
        SerializersModuleCollector.DefaultImpls.m50263b(this, dVar, lVar);
    }

    /* renamed from: f */
    public <T> void mo25481f(@C12579k C11494d<T> dVar, @C12579k C11300l<? super List<? extends C12248g<?>>, ? extends C12248g<?>> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        Intrinsics.checkNotNullParameter(lVar, C35560b.f87807Z0);
    }

    /* renamed from: g */
    public final void mo25482g(C12217f fVar, C11494d<?> dVar) {
        int d = fVar.mo24823d();
        int i = 0;
        while (i < d) {
            int i2 = i + 1;
            String e = fVar.mo24824e(i);
            if (!Intrinsics.areEqual((Object) e, (Object) this.f30280b)) {
                i = i2;
            } else {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + e + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* renamed from: h */
    public final void mo25483h(C12217f fVar, C11494d<?> dVar) {
        C12224h kind = fVar.getKind();
        if ((kind instanceof C12204d) || Intrinsics.areEqual((Object) kind, (Object) C12224h.C12225a.f30009a)) {
            throw new IllegalArgumentException("Serializer for " + dVar.mo22848s() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        } else if (!this.f30279a) {
            if (Intrinsics.areEqual((Object) kind, (Object) C12227i.C12229b.f30012a) || Intrinsics.areEqual((Object) kind, (Object) C12227i.C12230c.f30013a) || (kind instanceof C12207e) || (kind instanceof C12224h.C12226b)) {
                throw new IllegalArgumentException("Serializer for " + dVar.mo22848s() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }
}
