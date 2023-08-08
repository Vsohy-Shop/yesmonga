package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.json.C12341a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.q */
public final class C12392q<T> implements Iterator<T>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C12341a f30324a;
    @C12579k

    /* renamed from: b */
    public final C12366d0 f30325b;
    @C12579k

    /* renamed from: c */
    public final C12199c<T> f30326c;

    public C12392q(@C12579k C12341a aVar, @C12579k C12366d0 d0Var, @C12579k C12199c<T> cVar) {
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(d0Var, "lexer");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        this.f30324a = aVar;
        this.f30325b = d0Var;
        this.f30326c = cVar;
    }

    public boolean hasNext() {
        return this.f30325b.mo25418E();
    }

    public T next() {
        return new C12370f0(this.f30324a, WriteMode.OBJ, this.f30325b, this.f30326c.getDescriptor()).mo24870G(this.f30326c);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
