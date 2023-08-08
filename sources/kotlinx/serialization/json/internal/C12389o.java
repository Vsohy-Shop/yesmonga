package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.DecodeSequenceMode;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.o */
public final class C12389o<T> implements Iterator<T>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C12341a f30320a;
    @C12579k

    /* renamed from: b */
    public final C12366d0 f30321b;
    @C12579k

    /* renamed from: c */
    public final C12199c<T> f30322c;

    /* renamed from: d */
    public boolean f30323d = true;

    public C12389o(@C12579k C12341a aVar, @C12579k C12366d0 d0Var, @C12579k C12199c<T> cVar) {
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(d0Var, "lexer");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        this.f30320a = aVar;
        this.f30321b = d0Var;
        this.f30322c = cVar;
    }

    public boolean hasNext() {
        if (this.f30321b.mo25420G() == 9) {
            this.f30321b.mo25444m((byte) 9);
            if (this.f30321b.mo25418E()) {
                if (this.f30321b.mo25420G() != 8) {
                    this.f30321b.mo25454v();
                } else {
                    C12366d0 d0Var = this.f30321b;
                    C12359a.m49866x(d0Var, "There is a start of the new array after the one parsed to sequence. " + DecodeSequenceMode.ARRAY_WRAPPED.name() + " mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use " + DecodeSequenceMode.WHITESPACE_SEPARATED.name() + " mode instead.", 0, 2, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            return false;
        } else if (this.f30321b.mo25418E()) {
            return true;
        } else {
            this.f30321b.mo25456y((byte) 9);
            throw new KotlinNothingValueException();
        }
    }

    public T next() {
        if (this.f30323d) {
            this.f30323d = false;
        } else {
            this.f30321b.mo25445n(',');
        }
        return new C12370f0(this.f30320a, WriteMode.OBJ, this.f30321b, this.f30322c.getDescriptor()).mo24870G(this.f30322c);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
