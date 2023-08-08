package kotlinx.serialization.modules;

import com.urbanairship.analytics.location.C35560b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C11532s0;
import kotlin.collections.C10983u0;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.modules.C12428a;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.modules.f */
public final class C12435f implements SerializersModuleCollector {
    @C12579k

    /* renamed from: a */
    public final Map<C11494d<?>, C12428a> f30378a = new HashMap();
    @C12579k

    /* renamed from: b */
    public final Map<C11494d<?>, Map<C11494d<?>, C12248g<?>>> f30379b = new HashMap();
    @C12579k

    /* renamed from: c */
    public final Map<C11494d<?>, C11300l<?, C12440p<?>>> f30380c = new HashMap();
    @C12579k

    /* renamed from: d */
    public final Map<C11494d<?>, Map<String, C12248g<?>>> f30381d = new HashMap();
    @C12579k

    /* renamed from: e */
    public final Map<C11494d<?>, C11300l<String, C12199c<?>>> f30382e = new HashMap();

    /* renamed from: l */
    public static /* synthetic */ void m50286l(C12435f fVar, C11494d dVar, C11494d dVar2, C12248g gVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        fVar.mo25587k(dVar, dVar2, gVar, z);
    }

    /* renamed from: n */
    public static /* synthetic */ void m50287n(C12435f fVar, C11494d dVar, C12428a aVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fVar.mo25588m(dVar, aVar, z);
    }

    /* renamed from: a */
    public <Base, Sub extends Base> void mo25476a(@C12579k C11494d<Base> dVar, @C12579k C11494d<Sub> dVar2, @C12579k C12248g<Sub> gVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(dVar2, "actualClass");
        Intrinsics.checkNotNullParameter(gVar, "actualSerializer");
        m50286l(this, dVar, dVar2, gVar, false, 8, (Object) null);
    }

    @C12200d
    /* renamed from: b */
    public <Base> void mo25477b(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(lVar, "defaultDeserializerProvider");
        mo25585i(dVar, lVar, false);
    }

    /* renamed from: c */
    public <T> void mo25478c(@C12579k C11494d<T> dVar, @C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        Intrinsics.checkNotNullParameter(gVar, "serializer");
        m50287n(this, dVar, new C12428a.C12429a(gVar), false, 4, (Object) null);
    }

    @C12200d
    /* renamed from: d */
    public <Base> void mo25479d(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super Base, ? extends C12440p<? super Base>> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(lVar, "defaultSerializerProvider");
        mo25586j(dVar, lVar, false);
    }

    /* renamed from: e */
    public <Base> void mo25480e(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
        SerializersModuleCollector.DefaultImpls.m50263b(this, dVar, lVar);
    }

    /* renamed from: f */
    public <T> void mo25481f(@C12579k C11494d<T> dVar, @C12579k C11300l<? super List<? extends C12248g<?>>, ? extends C12248g<?>> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        Intrinsics.checkNotNullParameter(lVar, C35560b.f87807Z0);
        m50287n(this, dVar, new C12428a.C12430b(lVar), false, 4, (Object) null);
    }

    @C12579k
    @C11532s0
    /* renamed from: g */
    public final C12434e mo25583g() {
        return new C12433d(this.f30378a, this.f30379b, this.f30380c, this.f30381d, this.f30382e);
    }

    /* renamed from: h */
    public final void mo25584h(@C12579k C12434e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "module");
        eVar.mo25578a(this);
    }

    @C11314h(name = "registerDefaultPolymorphicDeserializer")
    /* renamed from: i */
    public final <Base> void mo25585i(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar, boolean z) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(lVar, "defaultDeserializerProvider");
        C11300l lVar2 = this.f30382e.get(dVar);
        if (lVar2 == null || Intrinsics.areEqual((Object) lVar2, (Object) lVar) || z) {
            this.f30382e.put(dVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for class " + dVar + " is already registered: " + lVar2);
    }

    @C11314h(name = "registerDefaultPolymorphicSerializer")
    /* renamed from: j */
    public final <Base> void mo25586j(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super Base, ? extends C12440p<? super Base>> lVar, boolean z) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(lVar, "defaultSerializerProvider");
        C11300l lVar2 = this.f30382e.get(dVar);
        if (lVar2 == null || Intrinsics.areEqual((Object) lVar2, (Object) lVar) || z) {
            this.f30380c.put(dVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for class " + dVar + " is already registered: " + lVar2);
    }

    @C11314h(name = "registerPolymorphicSerializer")
    /* renamed from: k */
    public final <Base, Sub extends Base> void mo25587k(@C12579k C11494d<Base> dVar, @C12579k C11494d<Sub> dVar2, @C12579k C12248g<Sub> gVar, boolean z) {
        Object obj;
        boolean z2;
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        Intrinsics.checkNotNullParameter(dVar2, "concreteClass");
        Intrinsics.checkNotNullParameter(gVar, "concreteSerializer");
        String h = gVar.getDescriptor().mo24830h();
        Map<C11494d<?>, Map<C11494d<?>, C12248g<?>>> map = this.f30379b;
        Map<C11494d<?>, C12248g<?>> map2 = map.get(dVar);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(dVar, map2);
        }
        Map map3 = map2;
        C12248g gVar2 = (C12248g) map3.get(dVar2);
        Map<C11494d<?>, Map<String, C12248g<?>>> map4 = this.f30381d;
        Map<String, C12248g<?>> map5 = map4.get(dVar);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(dVar, map5);
        }
        Map map6 = map5;
        if (z) {
            if (gVar2 != null) {
                map6.remove(gVar2.getDescriptor().mo24830h());
            }
            map3.put(dVar2, gVar);
            map6.put(h, gVar);
            return;
        }
        if (gVar2 != null) {
            if (Intrinsics.areEqual((Object) gVar2, (Object) gVar)) {
                map6.remove(gVar2.getDescriptor().mo24830h());
            } else {
                throw new SerializerAlreadyRegisteredException(dVar, dVar2);
            }
        }
        C12248g gVar3 = (C12248g) map6.get(h);
        if (gVar3 != null) {
            Map<C11494d<?>, C12248g<?>> map7 = this.f30379b.get(dVar);
            Intrinsics.checkNotNull(map7);
            Iterator it = C10983u0.m41518T0(map7).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Map.Entry) obj).getValue() == gVar3) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + dVar + "' have the same serial name '" + h + "': '" + dVar2 + "' and '" + ((Map.Entry) obj) + '\'');
        }
        map3.put(dVar2, gVar);
        map6.put(h, gVar);
    }

    @C11314h(name = "registerSerializer")
    /* renamed from: m */
    public final <T> void mo25588m(@C12579k C11494d<T> dVar, @C12579k C12428a aVar, boolean z) {
        C12428a aVar2;
        Intrinsics.checkNotNullParameter(dVar, "forClass");
        Intrinsics.checkNotNullParameter(aVar, C35560b.f87807Z0);
        if (z || (aVar2 = this.f30378a.get(dVar)) == null || Intrinsics.areEqual((Object) aVar2, (Object) aVar)) {
            this.f30378a.put(dVar, aVar);
            return;
        }
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + dVar + " already registered in this module");
    }
}
