package kotlinx.serialization.encoding;

import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12241e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12200d
/* renamed from: kotlinx.serialization.encoding.a */
public abstract class C12234a implements C12241e, C12236c {
    /* renamed from: K */
    public static /* synthetic */ Object m48918K(C12234a aVar, C12199c cVar, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                obj = null;
            }
            return aVar.mo24873J(cVar, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
    }

    /* renamed from: A */
    public final char mo24864A(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24894x();
    }

    /* renamed from: B */
    public final byte mo24865B(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24871H();
    }

    /* renamed from: C */
    public final boolean mo24866C(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24893w();
    }

    /* renamed from: D */
    public boolean mo24867D() {
        return true;
    }

    /* renamed from: E */
    public final short mo24868E(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24889s();
    }

    /* renamed from: F */
    public final double mo24869F(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24892v();
    }

    /* renamed from: G */
    public <T> T mo24870G(@C12579k C12199c<T> cVar) {
        return C12241e.C12242a.m49040b(this, cVar);
    }

    /* renamed from: H */
    public byte mo24871H() {
        return ((Byte) mo24874L()).byteValue();
    }

    @C12580l
    @C12200d
    /* renamed from: I */
    public <T> T mo24872I(@C12579k C12199c<T> cVar) {
        return C12241e.C12242a.m49039a(this, cVar);
    }

    /* renamed from: J */
    public <T> T mo24873J(@C12579k C12199c<T> cVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        return mo24870G(cVar);
    }

    @C12579k
    /* renamed from: L */
    public Object mo24874L() {
        throw new SerializationException(C11342l0.m43547d(getClass()) + " can't retrieve untyped values");
    }

    @C12579k
    /* renamed from: b */
    public C12236c mo24875b(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return this;
    }

    /* renamed from: c */
    public void mo24876c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
    }

    /* renamed from: e */
    public int mo24877e(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        return ((Integer) mo24874L()).intValue();
    }

    /* renamed from: f */
    public final long mo24878f(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24883l();
    }

    /* renamed from: h */
    public int mo24879h() {
        return ((Integer) mo24874L()).intValue();
    }

    /* renamed from: i */
    public final int mo24880i(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24879h();
    }

    @C12580l
    /* renamed from: j */
    public Void mo24881j() {
        return null;
    }

    /* renamed from: k */
    public int mo24882k(@C12579k C12217f fVar) {
        return C12236c.C12238b.m49002a(this, fVar);
    }

    /* renamed from: l */
    public long mo24883l() {
        return ((Long) mo24874L()).longValue();
    }

    @C12579k
    /* renamed from: m */
    public final String mo24884m(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24896z();
    }

    @C12580l
    /* renamed from: n */
    public final <T> T mo24885n(@C12579k C12217f fVar, int i, @C12579k C12199c<T> cVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        if (cVar.getDescriptor().mo24821b() || mo24867D()) {
            return mo24873J(cVar, t);
        }
        return mo24881j();
    }

    @C12200d
    /* renamed from: p */
    public boolean mo24886p() {
        return C12236c.C12238b.m49004c(this);
    }

    @C12579k
    /* renamed from: q */
    public C12241e mo24887q(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        return this;
    }

    @C12579k
    /* renamed from: r */
    public final C12241e mo24888r(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24887q(fVar.mo24827g(i));
    }

    /* renamed from: s */
    public short mo24889s() {
        return ((Short) mo24874L()).shortValue();
    }

    /* renamed from: t */
    public float mo24890t() {
        return ((Float) mo24874L()).floatValue();
    }

    /* renamed from: u */
    public final float mo24891u(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return mo24890t();
    }

    /* renamed from: v */
    public double mo24892v() {
        return ((Double) mo24874L()).doubleValue();
    }

    /* renamed from: w */
    public boolean mo24893w() {
        return ((Boolean) mo24874L()).booleanValue();
    }

    /* renamed from: x */
    public char mo24894x() {
        return ((Character) mo24874L()).charValue();
    }

    /* renamed from: y */
    public final <T> T mo24895y(@C12579k C12217f fVar, int i, @C12579k C12199c<T> cVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        return mo24873J(cVar, t);
    }

    @C12579k
    /* renamed from: z */
    public String mo24896z() {
        return (String) mo24874L();
    }
}
