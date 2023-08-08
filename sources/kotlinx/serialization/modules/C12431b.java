package kotlinx.serialization.modules;

import java.util.ArrayList;
import java.util.List;
import kotlin.C11078d1;
import kotlin.C11532s0;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12440p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.modules.b */
public final class C12431b<Base> {
    @C12579k

    /* renamed from: a */
    public final C11494d<Base> f30368a;
    @C12580l

    /* renamed from: b */
    public final C12248g<Base> f30369b;
    @C12579k

    /* renamed from: c */
    public final List<Pair<C11494d<? extends Base>, C12248g<? extends Base>>> f30370c;
    @C12580l

    /* renamed from: d */
    public C11300l<? super Base, ? extends C12440p<? super Base>> f30371d;
    @C12580l

    /* renamed from: e */
    public C11300l<? super String, ? extends C12199c<? extends Base>> f30372e;

    @C11532s0
    public C12431b(@C12579k C11494d<Base> dVar, @C12580l C12248g<Base> gVar) {
        Intrinsics.checkNotNullParameter(dVar, "baseClass");
        this.f30368a = dVar;
        this.f30369b = gVar;
        this.f30370c = new ArrayList();
    }

    @C11532s0
    /* renamed from: a */
    public final void mo25574a(@C12579k C12435f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "builder");
        C12248g<Base> gVar = this.f30369b;
        if (gVar != null) {
            C11494d<Base> dVar = this.f30368a;
            C12435f.m50286l(fVar, dVar, dVar, gVar, false, 8, (Object) null);
        }
        for (Pair pair : this.f30370c) {
            C12435f fVar2 = fVar;
            C12435f.m50286l(fVar2, this.f30368a, (C11494d) pair.mo21846a(), (C12248g) pair.mo21847b(), false, 8, (Object) null);
        }
        C11300l<? super Base, ? extends C12440p<? super Base>> lVar = this.f30371d;
        if (lVar != null) {
            fVar.mo25586j(this.f30368a, lVar, false);
        }
        C11300l<? super String, ? extends C12199c<? extends Base>> lVar2 = this.f30372e;
        if (lVar2 != null) {
            fVar.mo25585i(this.f30368a, lVar2, false);
        }
    }

    /* renamed from: b */
    public final void mo25575b(@C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "defaultSerializerProvider");
        mo25576c(lVar);
    }

    @C12200d
    /* renamed from: c */
    public final void mo25576c(@C12579k C11300l<? super String, ? extends C12199c<? extends Base>> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVar, "defaultDeserializerProvider");
        if (this.f30372e == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f30372e = lVar;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.f30368a + ": " + this.f30372e).toString());
    }

    /* renamed from: d */
    public final <T extends Base> void mo25577d(@C12579k C11494d<T> dVar, @C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(dVar, "subclass");
        Intrinsics.checkNotNullParameter(gVar, "serializer");
        this.f30370c.add(C11078d1.m42659a(dVar, gVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12431b(C11494d dVar, C12248g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i & 2) != 0 ? null : gVar);
    }
}
