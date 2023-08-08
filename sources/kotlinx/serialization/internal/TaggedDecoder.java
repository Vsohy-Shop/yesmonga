package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.modules.C12434e;
import kotlinx.serialization.modules.C12436g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12247f
public abstract class TaggedDecoder<Tag> implements C12241e, C12236c {
    @C12579k

    /* renamed from: d */
    public final ArrayList<Tag> f30047d = new ArrayList<>();

    /* renamed from: e */
    public boolean f30048e;

    /* renamed from: A */
    public final char mo24864A(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24980N(mo24994b0(fVar, i));
    }

    /* renamed from: B */
    public final byte mo24865B(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24979M(mo24994b0(fVar, i));
    }

    /* renamed from: C */
    public final boolean mo24866C(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24978L(mo24994b0(fVar, i));
    }

    /* renamed from: D */
    public boolean mo24867D() {
        Object a0 = mo24993a0();
        if (a0 == null) {
            return false;
        }
        return mo24987U(a0);
    }

    /* renamed from: E */
    public final short mo24868E(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24989W(mo24994b0(fVar, i));
    }

    /* renamed from: F */
    public final double mo24869F(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24981O(mo24994b0(fVar, i));
    }

    /* renamed from: G */
    public <T> T mo24870G(@C12579k C12199c<T> cVar) {
        return C12241e.C12242a.m49040b(this, cVar);
    }

    /* renamed from: H */
    public final byte mo24871H() {
        return mo24979M(mo24995c0());
    }

    @C12580l
    @C12200d
    /* renamed from: I */
    public <T> T mo24872I(@C12579k C12199c<T> cVar) {
        return C12241e.C12242a.m49039a(this, cVar);
    }

    /* renamed from: J */
    public final void mo24976J(@C12579k TaggedDecoder<Tag> taggedDecoder) {
        Intrinsics.checkNotNullParameter(taggedDecoder, "other");
        taggedDecoder.f30047d.addAll(this.f30047d);
    }

    /* renamed from: K */
    public <T> T mo24977K(@C12579k C12199c<T> cVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        return mo24870G(cVar);
    }

    /* renamed from: L */
    public boolean mo24978L(Tag tag) {
        return ((Boolean) mo24991Y(tag)).booleanValue();
    }

    /* renamed from: M */
    public byte mo24979M(Tag tag) {
        return ((Byte) mo24991Y(tag)).byteValue();
    }

    /* renamed from: N */
    public char mo24980N(Tag tag) {
        return ((Character) mo24991Y(tag)).charValue();
    }

    /* renamed from: O */
    public double mo24981O(Tag tag) {
        return ((Double) mo24991Y(tag)).doubleValue();
    }

    /* renamed from: P */
    public int mo24982P(Tag tag, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        return ((Integer) mo24991Y(tag)).intValue();
    }

    /* renamed from: Q */
    public float mo24983Q(Tag tag) {
        return ((Float) mo24991Y(tag)).floatValue();
    }

    @C12579k
    /* renamed from: R */
    public C12241e mo24984R(Tag tag, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        mo24996d0(tag);
        return this;
    }

    /* renamed from: S */
    public int mo24985S(Tag tag) {
        return ((Integer) mo24991Y(tag)).intValue();
    }

    /* renamed from: T */
    public long mo24986T(Tag tag) {
        return ((Long) mo24991Y(tag)).longValue();
    }

    /* renamed from: U */
    public boolean mo24987U(Tag tag) {
        return true;
    }

    @C12580l
    /* renamed from: V */
    public Void mo24988V(Tag tag) {
        return null;
    }

    /* renamed from: W */
    public short mo24989W(Tag tag) {
        return ((Short) mo24991Y(tag)).shortValue();
    }

    @C12579k
    /* renamed from: X */
    public String mo24990X(Tag tag) {
        return (String) mo24991Y(tag);
    }

    @C12579k
    /* renamed from: Y */
    public Object mo24991Y(Tag tag) {
        throw new SerializationException(C11342l0.m43547d(getClass()) + " can't retrieve untyped values");
    }

    /* renamed from: Z */
    public final Tag mo24992Z() {
        return CollectionsKt___CollectionsKt.m40653k3(this.f30047d);
    }

    @C12579k
    /* renamed from: a */
    public C12434e mo24933a() {
        return C12436g.m50300a();
    }

    @C12580l
    /* renamed from: a0 */
    public final Tag mo24993a0() {
        return CollectionsKt___CollectionsKt.m40677q3(this.f30047d);
    }

    @C12579k
    /* renamed from: b */
    public C12236c mo24875b(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return this;
    }

    /* renamed from: b0 */
    public abstract Tag mo24994b0(@C12579k C12217f fVar, int i);

    /* renamed from: c */
    public void mo24876c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
    }

    /* renamed from: c0 */
    public final Tag mo24995c0() {
        ArrayList<Tag> arrayList = this.f30047d;
        Tag remove = arrayList.remove(CollectionsKt__CollectionsKt.m40443G(arrayList));
        this.f30048e = true;
        return remove;
    }

    /* renamed from: d0 */
    public final void mo24996d0(Tag tag) {
        this.f30047d.add(tag);
    }

    /* renamed from: e */
    public final int mo24877e(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        return mo24982P(mo24995c0(), fVar);
    }

    /* renamed from: e0 */
    public final <E> E mo24997e0(Tag tag, C11289a<? extends E> aVar) {
        mo24996d0(tag);
        E invoke = aVar.invoke();
        if (!this.f30048e) {
            mo24995c0();
        }
        this.f30048e = false;
        return invoke;
    }

    /* renamed from: f */
    public final long mo24878f(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24986T(mo24994b0(fVar, i));
    }

    /* renamed from: h */
    public final int mo24879h() {
        return mo24985S(mo24995c0());
    }

    /* renamed from: i */
    public final int mo24880i(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24985S(mo24994b0(fVar, i));
    }

    @C12580l
    /* renamed from: j */
    public final Void mo24881j() {
        return null;
    }

    /* renamed from: k */
    public int mo24882k(@C12579k C12217f fVar) {
        return C12236c.C12238b.m49002a(this, fVar);
    }

    /* renamed from: l */
    public final long mo24883l() {
        return mo24986T(mo24995c0());
    }

    @C12579k
    /* renamed from: m */
    public final String mo24884m(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24990X(mo24994b0(fVar, i));
    }

    @C12580l
    /* renamed from: n */
    public final <T> T mo24885n(@C12579k C12217f fVar, int i, @C12579k C12199c<T> cVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        return mo24997e0(mo24994b0(fVar, i), new TaggedDecoder$decodeNullableSerializableElement$1(this, cVar, t));
    }

    @C12200d
    /* renamed from: p */
    public boolean mo24886p() {
        return C12236c.C12238b.m49004c(this);
    }

    @C12579k
    /* renamed from: q */
    public final C12241e mo24887q(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        return mo24984R(mo24995c0(), fVar);
    }

    @C12579k
    /* renamed from: r */
    public final C12241e mo24888r(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24984R(mo24994b0(fVar, i), fVar.mo24827g(i));
    }

    /* renamed from: s */
    public final short mo24889s() {
        return mo24989W(mo24995c0());
    }

    /* renamed from: t */
    public final float mo24890t() {
        return mo24983Q(mo24995c0());
    }

    /* renamed from: u */
    public final float mo24891u(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24983Q(mo24994b0(fVar, i));
    }

    /* renamed from: v */
    public final double mo24892v() {
        return mo24981O(mo24995c0());
    }

    /* renamed from: w */
    public final boolean mo24893w() {
        return mo24978L(mo24995c0());
    }

    /* renamed from: x */
    public final char mo24894x() {
        return mo24980N(mo24995c0());
    }

    /* renamed from: y */
    public final <T> T mo24895y(@C12579k C12217f fVar, int i, @C12579k C12199c<T> cVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        return mo24997e0(mo24994b0(fVar, i), new TaggedDecoder$decodeSerializableElement$1(this, cVar, t));
    }

    @C12579k
    /* renamed from: z */
    public final String mo24896z() {
        return mo24990X(mo24995c0());
    }
}
