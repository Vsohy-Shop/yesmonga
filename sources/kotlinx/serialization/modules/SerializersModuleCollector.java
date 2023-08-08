package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12440p;
import org.jetbrains.annotations.C12579k;

@C12200d
public interface SerializersModuleCollector {

    public static final class DefaultImpls {
        /* renamed from: a */
        public static <T> void m50262a(@C12579k SerializersModuleCollector serializersModuleCollector, @C12579k C11494d<T> dVar, @C12579k C12248g<T> gVar) {
            Intrinsics.checkNotNullParameter(serializersModuleCollector, "this");
            Intrinsics.checkNotNullParameter(dVar, "kClass");
            Intrinsics.checkNotNullParameter(gVar, "serializer");
            serializersModuleCollector.mo25481f(dVar, new SerializersModuleCollector$contextual$1(gVar));
        }

        /* renamed from: b */
        public static <Base> void m50263b(@C12579k SerializersModuleCollector serializersModuleCollector, @C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
            Intrinsics.checkNotNullParameter(serializersModuleCollector, "this");
            Intrinsics.checkNotNullParameter(dVar, "baseClass");
            Intrinsics.checkNotNullParameter(lVar, "defaultDeserializerProvider");
            serializersModuleCollector.mo25477b(dVar, lVar);
        }
    }

    /* renamed from: a */
    <Base, Sub extends Base> void mo25476a(@C12579k C11494d<Base> dVar, @C12579k C11494d<Sub> dVar2, @C12579k C12248g<Sub> gVar);

    @C12200d
    /* renamed from: b */
    <Base> void mo25477b(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar);

    /* renamed from: c */
    <T> void mo25478c(@C12579k C11494d<T> dVar, @C12579k C12248g<T> gVar);

    @C12200d
    /* renamed from: d */
    <Base> void mo25479d(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super Base, ? extends C12440p<? super Base>> lVar);

    /* renamed from: e */
    <Base> void mo25480e(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar);

    /* renamed from: f */
    <T> void mo25481f(@C12579k C11494d<T> dVar, @C12579k C11300l<? super List<? extends C12248g<?>>, ? extends C12248g<?>> lVar);
}
