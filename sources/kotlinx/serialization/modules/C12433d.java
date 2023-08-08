package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.internal.C12255a1;
import kotlinx.serialization.modules.C12428a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.modules.d */
public final class C12433d extends C12434e {
    @C12579k

    /* renamed from: a */
    public final Map<C11494d<?>, C12428a> f30373a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public final Map<C11494d<?>, Map<C11494d<?>, C12248g<?>>> f30374b;
    @C12579k

    /* renamed from: c */
    public final Map<C11494d<?>, C11300l<?, C12440p<?>>> f30375c;
    @C12579k

    /* renamed from: d */
    public final Map<C11494d<?>, Map<String, C12248g<?>>> f30376d;
    @C12579k

    /* renamed from: e */
    public final Map<C11494d<?>, C11300l<String, C12199c<?>>> f30377e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12433d(@C12579k Map<C11494d<?>, ? extends C12428a> map, @C12579k Map<C11494d<?>, ? extends Map<C11494d<?>, ? extends C12248g<?>>> map2, @C12579k Map<C11494d<?>, ? extends C11300l<?, ? extends C12440p<?>>> map3, @C12579k Map<C11494d<?>, ? extends Map<String, ? extends C12248g<?>>> map4, @C12579k Map<C11494d<?>, ? extends C11300l<? super String, ? extends C12199c<?>>> map5) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(map, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(map2, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(map3, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(map4, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(map5, "polyBase2DefaultDeserializerProvider");
        this.f30373a = map;
        this.f30374b = map2;
        this.f30375c = map3;
        this.f30376d = map4;
        this.f30377e = map5;
    }

    /* renamed from: a */
    public void mo25578a(@C12579k SerializersModuleCollector serializersModuleCollector) {
        Intrinsics.checkNotNullParameter(serializersModuleCollector, "collector");
        for (Map.Entry next : this.f30373a.entrySet()) {
            C11494d dVar = (C11494d) next.getKey();
            C12428a aVar = (C12428a) next.getValue();
            if (aVar instanceof C12428a.C12429a) {
                serializersModuleCollector.mo25478c(dVar, ((C12428a.C12429a) aVar).mo25570b());
            } else if (aVar instanceof C12428a.C12430b) {
                serializersModuleCollector.mo25481f(dVar, ((C12428a.C12430b) aVar).mo25573b());
            }
        }
        for (Map.Entry next2 : this.f30374b.entrySet()) {
            C11494d dVar2 = (C11494d) next2.getKey();
            for (Map.Entry entry : ((Map) next2.getValue()).entrySet()) {
                serializersModuleCollector.mo25476a(dVar2, (C11494d) entry.getKey(), (C12248g) entry.getValue());
            }
        }
        for (Map.Entry next3 : this.f30375c.entrySet()) {
            serializersModuleCollector.mo25479d((C11494d) next3.getKey(), (C11300l) C11370u0.m43701q((C11300l) next3.getValue(), 1));
        }
        for (Map.Entry next4 : this.f30377e.entrySet()) {
            serializersModuleCollector.mo25477b((C11494d) next4.getKey(), (C11300l) C11370u0.m43701q((C11300l) next4.getValue(), 1));
        }
    }

    @C12580l
    /* renamed from: c */
    public <T> C12248g<T> mo25579c(@C12579k C11494d<T> dVar, @C12579k List<? extends C12248g<?>> list) {
        C12248g<?> gVar;
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        Intrinsics.checkNotNullParameter(list, "typeArgumentsSerializers");
        C12428a aVar = this.f30373a.get(dVar);
        if (aVar == null) {
            gVar = null;
        } else {
            gVar = aVar.mo25569a(list);
        }
        if (gVar instanceof C12248g) {
            return gVar;
        }
        return null;
    }

    @C12580l
    /* renamed from: e */
    public <T> C12199c<? extends T> mo25580e(@C12579k C11494d<? super T> dVar, @C12580l String str) {
        C12248g gVar;
        C11300l lVar;
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Map map = this.f30376d.get(dVar);
        if (map == null) {
            gVar = null;
        } else {
            gVar = (C12248g) map.get(str);
        }
        if (!(gVar instanceof C12248g)) {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        C11300l<String, C12199c<?>> lVar2 = this.f30377e.get(dVar);
        if (C11370u0.m43672B(lVar2, 1)) {
            lVar = lVar2;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            return null;
        }
        return (C12199c) lVar.invoke(str);
    }

    @C12580l
    /* renamed from: f */
    public <T> C12440p<T> mo25581f(@C12579k C11494d<? super T> dVar, @C12579k T t) {
        C12248g gVar;
        C11300l lVar;
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(t, "value");
        if (!C12255a1.m49217j(t, dVar)) {
            return null;
        }
        Map map = this.f30374b.get(dVar);
        if (map == null) {
            gVar = null;
        } else {
            gVar = (C12248g) map.get(C11342l0.m43547d(t.getClass()));
        }
        if (!(gVar instanceof C12440p)) {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        C11300l<?, C12440p<?>> lVar2 = this.f30375c.get(dVar);
        if (C11370u0.m43672B(lVar2, 1)) {
            lVar = lVar2;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            return null;
        }
        return (C12440p) lVar.invoke(t);
    }
}
