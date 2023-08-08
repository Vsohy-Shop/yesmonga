package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.modules.C12434e;
import kotlinx.serialization.modules.C12436g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12247f
/* renamed from: kotlinx.serialization.internal.t1 */
public abstract class C12313t1<Tag> implements C12244g, C12239d {
    @C12579k

    /* renamed from: a */
    public final ArrayList<Tag> f30123a = new ArrayList<>();

    /* renamed from: I */
    private final boolean m49525I(C12217f fVar, int i) {
        mo25179b0(mo25177Z(fVar, i));
        return true;
    }

    @C12200d
    /* renamed from: A */
    public boolean mo24897A(@C12579k C12217f fVar, int i) {
        return C12239d.C12240a.m49021a(this, fVar, i);
    }

    /* renamed from: C */
    public final void mo24898C(int i) {
        mo25168Q(mo25178a0(), i);
    }

    /* renamed from: D */
    public <T> void mo24899D(@C12579k C12217f fVar, int i, @C12579k C12440p<? super T> pVar, T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        if (m49525I(fVar, i)) {
            mo24908e(pVar, t);
        }
    }

    /* renamed from: E */
    public final void mo24900E(@C12579k C12217f fVar, int i, short s) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        mo25171T(mo25177Z(fVar, i), s);
    }

    /* renamed from: F */
    public final void mo24901F(@C12579k C12217f fVar, int i, double d) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        mo25164M(mo25177Z(fVar, i), d);
    }

    /* renamed from: G */
    public final void mo24902G(@C12579k C12217f fVar, int i, long j) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        mo25169R(mo25177Z(fVar, i), j);
    }

    /* renamed from: H */
    public final void mo24903H(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        mo25172U(mo25178a0(), str);
    }

    /* renamed from: J */
    public void mo25161J(Tag tag, boolean z) {
        mo25173V(tag, Boolean.valueOf(z));
    }

    /* renamed from: K */
    public void mo25162K(Tag tag, byte b) {
        mo25173V(tag, Byte.valueOf(b));
    }

    /* renamed from: L */
    public void mo25163L(Tag tag, char c) {
        mo25173V(tag, Character.valueOf(c));
    }

    /* renamed from: M */
    public void mo25164M(Tag tag, double d) {
        mo25173V(tag, Double.valueOf(d));
    }

    /* renamed from: N */
    public void mo25165N(Tag tag, @C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        mo25173V(tag, Integer.valueOf(i));
    }

    /* renamed from: O */
    public void mo25166O(Tag tag, float f) {
        mo25173V(tag, Float.valueOf(f));
    }

    @C12579k
    /* renamed from: P */
    public C12244g mo25167P(Tag tag, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        mo25179b0(tag);
        return this;
    }

    /* renamed from: Q */
    public void mo25168Q(Tag tag, int i) {
        mo25173V(tag, Integer.valueOf(i));
    }

    /* renamed from: R */
    public void mo25169R(Tag tag, long j) {
        mo25173V(tag, Long.valueOf(j));
    }

    /* renamed from: S */
    public void mo25170S(Tag tag) {
        throw new SerializationException("null is not supported");
    }

    /* renamed from: T */
    public void mo25171T(Tag tag, short s) {
        mo25173V(tag, Short.valueOf(s));
    }

    /* renamed from: U */
    public void mo25172U(Tag tag, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        mo25173V(tag, str);
    }

    /* renamed from: V */
    public void mo25173V(Tag tag, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        throw new SerializationException("Non-serializable " + C11342l0.m43547d(obj.getClass()) + " is not supported by " + C11342l0.m43547d(getClass()) + " encoder");
    }

    /* renamed from: W */
    public void mo25174W(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
    }

    /* renamed from: X */
    public final Tag mo25175X() {
        return CollectionsKt___CollectionsKt.m40653k3(this.f30123a);
    }

    @C12580l
    /* renamed from: Y */
    public final Tag mo25176Y() {
        return CollectionsKt___CollectionsKt.m40677q3(this.f30123a);
    }

    /* renamed from: Z */
    public abstract Tag mo25177Z(@C12579k C12217f fVar, int i);

    @C12579k
    /* renamed from: a */
    public C12434e mo24934a() {
        return C12436g.m50300a();
    }

    /* renamed from: a0 */
    public final Tag mo25178a0() {
        if (!this.f30123a.isEmpty()) {
            ArrayList<Tag> arrayList = this.f30123a;
            return arrayList.remove(CollectionsKt__CollectionsKt.m40443G(arrayList));
        }
        throw new SerializationException("No tag in stack for requested element");
    }

    @C12579k
    /* renamed from: b */
    public C12239d mo24906b(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return this;
    }

    /* renamed from: b0 */
    public final void mo25179b0(Tag tag) {
        this.f30123a.add(tag);
    }

    /* renamed from: c */
    public final void mo24907c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (!this.f30123a.isEmpty()) {
            mo25178a0();
        }
        mo25174W(fVar);
    }

    /* renamed from: e */
    public <T> void mo24908e(@C12579k C12440p<? super T> pVar, T t) {
        C12244g.C12245a.m49063d(this, pVar, t);
    }

    @C12579k
    /* renamed from: f */
    public final C12244g mo24909f(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo25167P(mo25177Z(fVar, i), fVar.mo24827g(i));
    }

    /* renamed from: g */
    public final void mo24910g(double d) {
        mo25164M(mo25178a0(), d);
    }

    /* renamed from: h */
    public final void mo24911h(byte b) {
        mo25162K(mo25178a0(), b);
    }

    /* renamed from: i */
    public <T> void mo24912i(@C12579k C12217f fVar, int i, @C12579k C12440p<? super T> pVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        if (m49525I(fVar, i)) {
            mo24915l(pVar, t);
        }
    }

    @C12579k
    /* renamed from: j */
    public C12239d mo24913j(@C12579k C12217f fVar, int i) {
        return C12244g.C12245a.m49060a(this, fVar, i);
    }

    /* renamed from: k */
    public final void mo24914k(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        mo25165N(mo25178a0(), fVar, i);
    }

    @C12200d
    /* renamed from: l */
    public <T> void mo24915l(@C12579k C12440p<? super T> pVar, @C12580l T t) {
        C12244g.C12245a.m49062c(this, pVar, t);
    }

    @C12579k
    /* renamed from: m */
    public final C12244g mo24916m(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        return mo25167P(mo25178a0(), fVar);
    }

    /* renamed from: n */
    public final void mo24917n(long j) {
        mo25169R(mo25178a0(), j);
    }

    /* renamed from: o */
    public final void mo24918o(@C12579k C12217f fVar, int i, char c) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        mo25163L(mo25177Z(fVar, i), c);
    }

    /* renamed from: p */
    public void mo24919p() {
        mo25170S(mo25178a0());
    }

    /* renamed from: q */
    public final void mo24920q(@C12579k C12217f fVar, int i, byte b) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        mo25162K(mo25177Z(fVar, i), b);
    }

    /* renamed from: r */
    public final void mo24921r(short s) {
        mo25171T(mo25178a0(), s);
    }

    /* renamed from: s */
    public final void mo24922s(boolean z) {
        mo25161J(mo25178a0(), z);
    }

    /* renamed from: t */
    public final void mo24923t(@C12579k C12217f fVar, int i, float f) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        mo25166O(mo25177Z(fVar, i), f);
    }

    /* renamed from: u */
    public final void mo24924u(float f) {
        mo25166O(mo25178a0(), f);
    }

    /* renamed from: v */
    public final void mo24925v(char c) {
        mo25163L(mo25178a0(), c);
    }

    /* renamed from: w */
    public final void mo24926w() {
    }

    /* renamed from: x */
    public final void mo24927x(@C12579k C12217f fVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        mo25168Q(mo25177Z(fVar, i), i2);
    }

    /* renamed from: y */
    public final void mo24928y(@C12579k C12217f fVar, int i, boolean z) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        mo25161J(mo25177Z(fVar, i), z);
    }

    /* renamed from: z */
    public final void mo24929z(@C12579k C12217f fVar, int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(str, "value");
        mo25172U(mo25177Z(fVar, i), str);
    }
}
