package kotlinx.serialization.modules;

import com.urbanairship.analytics.location.C35560b;
import java.util.List;
import kotlin.collections.C10977s0;
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

/* renamed from: kotlinx.serialization.modules.g */
public final class C12436g {
    @C12579k

    /* renamed from: a */
    public static final C12434e f30383a = new C12433d(C10977s0.m41492z(), C10977s0.m41492z(), C10977s0.m41492z(), C10977s0.m41492z(), C10977s0.m41492z());

    /* renamed from: kotlinx.serialization.modules.g$a */
    public static final class C12437a implements SerializersModuleCollector {

        /* renamed from: a */
        public final /* synthetic */ C12435f f30384a;

        public C12437a(C12435f fVar) {
            this.f30384a = fVar;
        }

        /* renamed from: a */
        public <Base, Sub extends Base> void mo25476a(@C12579k C11494d<Base> dVar, @C12579k C11494d<Sub> dVar2, @C12579k C12248g<Sub> gVar) {
            Intrinsics.checkNotNullParameter(dVar, "baseClass");
            Intrinsics.checkNotNullParameter(dVar2, "actualClass");
            Intrinsics.checkNotNullParameter(gVar, "actualSerializer");
            this.f30384a.mo25587k(dVar, dVar2, gVar, true);
        }

        /* renamed from: b */
        public <Base> void mo25477b(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
            Intrinsics.checkNotNullParameter(dVar, "baseClass");
            Intrinsics.checkNotNullParameter(lVar, "defaultDeserializerProvider");
            this.f30384a.mo25585i(dVar, lVar, true);
        }

        /* renamed from: c */
        public <T> void mo25478c(@C12579k C11494d<T> dVar, @C12579k C12248g<T> gVar) {
            Intrinsics.checkNotNullParameter(dVar, "kClass");
            Intrinsics.checkNotNullParameter(gVar, "serializer");
            this.f30384a.mo25588m(dVar, new C12428a.C12429a(gVar), true);
        }

        /* renamed from: d */
        public <Base> void mo25479d(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super Base, ? extends C12440p<? super Base>> lVar) {
            Intrinsics.checkNotNullParameter(dVar, "baseClass");
            Intrinsics.checkNotNullParameter(lVar, "defaultSerializerProvider");
            this.f30384a.mo25586j(dVar, lVar, true);
        }

        /* renamed from: e */
        public <Base> void mo25480e(@C12579k C11494d<Base> dVar, @C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
            SerializersModuleCollector.DefaultImpls.m50263b(this, dVar, lVar);
        }

        /* renamed from: f */
        public <T> void mo25481f(@C12579k C11494d<T> dVar, @C12579k C11300l<? super List<? extends C12248g<?>>, ? extends C12248g<?>> lVar) {
            Intrinsics.checkNotNullParameter(dVar, "kClass");
            Intrinsics.checkNotNullParameter(lVar, C35560b.f87807Z0);
            this.f30384a.mo25588m(dVar, new C12428a.C12430b(lVar), true);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C12434e m50300a() {
        return f30383a;
    }

    @C12200d
    /* renamed from: b */
    public static /* synthetic */ void m50301b() {
    }

    @C12579k
    /* renamed from: c */
    public static final C12434e m50302c(@C12579k C12434e eVar, @C12579k C12434e eVar2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar2, "other");
        C12435f fVar = new C12435f();
        fVar.mo25584h(eVar);
        eVar2.mo25578a(new C12437a(fVar));
        return fVar.mo25583g();
    }

    @C12579k
    /* renamed from: d */
    public static final C12434e m50303d(@C12579k C12434e eVar, @C12579k C12434e eVar2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar2, "other");
        C12435f fVar = new C12435f();
        fVar.mo25584h(eVar);
        fVar.mo25584h(eVar2);
        return fVar.mo25583g();
    }
}
