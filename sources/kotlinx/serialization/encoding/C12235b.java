package kotlinx.serialization.encoding;

import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12329y0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12200d
/* renamed from: kotlinx.serialization.encoding.b */
public abstract class C12235b implements C12244g, C12239d {
    @C12200d
    /* renamed from: A */
    public boolean mo24897A(@C12579k C12217f fVar, int i) {
        return C12239d.C12240a.m49021a(this, fVar, i);
    }

    /* renamed from: C */
    public void mo24898C(int i) {
        mo24905J(Integer.valueOf(i));
    }

    /* renamed from: D */
    public <T> void mo24899D(@C12579k C12217f fVar, int i, @C12579k C12440p<? super T> pVar, T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        if (mo24904I(fVar, i)) {
            mo24908e(pVar, t);
        }
    }

    /* renamed from: E */
    public final void mo24900E(@C12579k C12217f fVar, int i, short s) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            mo24921r(s);
        }
    }

    /* renamed from: F */
    public final void mo24901F(@C12579k C12217f fVar, int i, double d) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            mo24910g(d);
        }
    }

    /* renamed from: G */
    public final void mo24902G(@C12579k C12217f fVar, int i, long j) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            mo24917n(j);
        }
    }

    /* renamed from: H */
    public void mo24903H(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        mo24905J(str);
    }

    /* renamed from: I */
    public boolean mo24904I(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return true;
    }

    /* renamed from: J */
    public void mo24905J(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        throw new SerializationException("Non-serializable " + C11342l0.m43547d(obj.getClass()) + " is not supported by " + C11342l0.m43547d(getClass()) + " encoder");
    }

    @C12579k
    /* renamed from: b */
    public C12239d mo24906b(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return this;
    }

    /* renamed from: c */
    public void mo24907c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
    }

    /* renamed from: e */
    public <T> void mo24908e(@C12579k C12440p<? super T> pVar, T t) {
        C12244g.C12245a.m49063d(this, pVar, t);
    }

    @C12579k
    /* renamed from: f */
    public final C12244g mo24909f(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            return mo24916m(fVar.mo24827g(i));
        }
        return C12329y0.f30149a;
    }

    /* renamed from: g */
    public void mo24910g(double d) {
        mo24905J(Double.valueOf(d));
    }

    /* renamed from: h */
    public void mo24911h(byte b) {
        mo24905J(Byte.valueOf(b));
    }

    /* renamed from: i */
    public <T> void mo24912i(@C12579k C12217f fVar, int i, @C12579k C12440p<? super T> pVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        if (mo24904I(fVar, i)) {
            mo24915l(pVar, t);
        }
    }

    @C12579k
    /* renamed from: j */
    public C12239d mo24913j(@C12579k C12217f fVar, int i) {
        return C12244g.C12245a.m49060a(this, fVar, i);
    }

    /* renamed from: k */
    public void mo24914k(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        mo24905J(Integer.valueOf(i));
    }

    @C12200d
    /* renamed from: l */
    public <T> void mo24915l(@C12579k C12440p<? super T> pVar, @C12580l T t) {
        C12244g.C12245a.m49062c(this, pVar, t);
    }

    @C12579k
    /* renamed from: m */
    public C12244g mo24916m(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        return this;
    }

    /* renamed from: n */
    public void mo24917n(long j) {
        mo24905J(Long.valueOf(j));
    }

    /* renamed from: o */
    public final void mo24918o(@C12579k C12217f fVar, int i, char c) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            mo24925v(c);
        }
    }

    /* renamed from: p */
    public void mo24919p() {
        throw new SerializationException("'null' is not supported by default");
    }

    /* renamed from: q */
    public final void mo24920q(@C12579k C12217f fVar, int i, byte b) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            mo24911h(b);
        }
    }

    /* renamed from: r */
    public void mo24921r(short s) {
        mo24905J(Short.valueOf(s));
    }

    /* renamed from: s */
    public void mo24922s(boolean z) {
        mo24905J(Boolean.valueOf(z));
    }

    /* renamed from: t */
    public final void mo24923t(@C12579k C12217f fVar, int i, float f) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            mo24924u(f);
        }
    }

    /* renamed from: u */
    public void mo24924u(float f) {
        mo24905J(Float.valueOf(f));
    }

    /* renamed from: v */
    public void mo24925v(char c) {
        mo24905J(Character.valueOf(c));
    }

    @C12200d
    /* renamed from: w */
    public void mo24926w() {
        C12244g.C12245a.m49061b(this);
    }

    /* renamed from: x */
    public final void mo24927x(@C12579k C12217f fVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            mo24898C(i2);
        }
    }

    /* renamed from: y */
    public final void mo24928y(@C12579k C12217f fVar, int i, boolean z) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo24904I(fVar, i)) {
            mo24922s(z);
        }
    }

    /* renamed from: z */
    public final void mo24929z(@C12579k C12217f fVar, int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(str, "value");
        if (mo24904I(fVar, i)) {
            mo24903H(str);
        }
    }
}
