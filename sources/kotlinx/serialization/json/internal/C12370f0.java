package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.urbanairship.contacts.ContactApiClient;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.encoding.C12234a;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12354g;
import kotlinx.serialization.json.C12356i;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.internal.f0 */
public class C12370f0 extends C12234a implements C12356i {
    @C12579k

    /* renamed from: d */
    public final C12341a f30294d;
    @C12579k

    /* renamed from: e */
    public final WriteMode f30295e;
    @C12579k
    @C11287e

    /* renamed from: f */
    public final C12359a f30296f;
    @C12579k

    /* renamed from: g */
    public final C12434e f30297g;

    /* renamed from: h */
    public int f30298h = -1;
    @C12579k

    /* renamed from: i */
    public final C12354g f30299i;
    @C12580l

    /* renamed from: j */
    public final JsonElementMarker f30300j;

    /* renamed from: kotlinx.serialization.json.internal.f0$a */
    public /* synthetic */ class C12371a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            iArr[WriteMode.LIST.ordinal()] = 1;
            iArr[WriteMode.MAP.ordinal()] = 2;
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            iArr[WriteMode.OBJ.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C12370f0(@C12579k C12341a aVar, @C12579k WriteMode writeMode, @C12579k C12359a aVar2, @C12579k C12217f fVar) {
        JsonElementMarker jsonElementMarker;
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(writeMode, "mode");
        Intrinsics.checkNotNullParameter(aVar2, "lexer");
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        this.f30294d = aVar;
        this.f30295e = writeMode;
        this.f30296f = aVar2;
        this.f30297g = aVar.mo25277a();
        C12354g h = aVar.mo25282h();
        this.f30299i = h;
        if (h.mo25362f()) {
            jsonElementMarker = null;
        } else {
            jsonElementMarker = new JsonElementMarker(fVar);
        }
        this.f30300j = jsonElementMarker;
    }

    /* renamed from: D */
    public boolean mo24867D() {
        JsonElementMarker jsonElementMarker = this.f30300j;
        return !(jsonElementMarker == null ? false : jsonElementMarker.mo25393b()) && this.f30296f.mo25430R();
    }

    /* renamed from: G */
    public <T> T mo24870G(@C12579k C12199c<T> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        return C12362b0.m49917d(this, cVar);
    }

    /* renamed from: H */
    public byte mo24871H() {
        long o = this.f30296f.mo25446o();
        byte b = (byte) ((int) o);
        if (o == ((long) b)) {
            return b;
        }
        C12359a aVar = this.f30296f;
        C12359a.m49866x(aVar, "Failed to parse byte for input '" + o + '\'', 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: M */
    public final void mo25499M() {
        if (this.f30296f.mo25420G() == 4) {
            C12359a.m49866x(this.f30296f, "Unexpected leading comma", 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: N */
    public final boolean mo25500N(C12217f fVar, int i) {
        String H;
        C12341a aVar = this.f30294d;
        C12217f g = fVar.mo24827g(i);
        if (!g.mo24821b() && (!this.f30296f.mo25430R())) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) g.getKind(), (Object) C12224h.C12226b.f30010a) || (H = this.f30296f.mo25421H(this.f30299i.mo25368n())) == null || JsonNamesMapKt.m49830e(g, aVar, H) != -3) {
            return false;
        }
        this.f30296f.mo25447p();
        return true;
    }

    /* renamed from: O */
    public final int mo25501O() {
        boolean Q = this.f30296f.mo25429Q();
        if (this.f30296f.mo25437f()) {
            int i = this.f30298h;
            if (i == -1 || Q) {
                int i2 = i + 1;
                this.f30298h = i2;
                return i2;
            }
            C12359a.m49866x(this.f30296f, "Expected end of the array or comma", 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        } else if (!Q) {
            return -1;
        } else {
            C12359a.m49866x(this.f30296f, "Unexpected trailing comma", 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo25502P() {
        /*
            r6 = this;
            int r0 = r6.f30298h
            int r1 = r0 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r3
        L_0x000b:
            r4 = -1
            if (r1 == 0) goto L_0x0017
            if (r0 == r4) goto L_0x001e
            kotlinx.serialization.json.internal.a r0 = r6.f30296f
            boolean r0 = r0.mo25429Q()
            goto L_0x001f
        L_0x0017:
            kotlinx.serialization.json.internal.a r0 = r6.f30296f
            r5 = 58
            r0.mo25445n(r5)
        L_0x001e:
            r0 = r3
        L_0x001f:
            kotlinx.serialization.json.internal.a r5 = r6.f30296f
            boolean r5 = r5.mo25437f()
            if (r5 == 0) goto L_0x005d
            if (r1 == 0) goto L_0x0056
            int r1 = r6.f30298h
            if (r1 != r4) goto L_0x0042
            kotlinx.serialization.json.internal.a r1 = r6.f30296f
            r0 = r0 ^ r2
            int r3 = r1.f30240a
            if (r0 == 0) goto L_0x0037
            goto L_0x0056
        L_0x0037:
            java.lang.String r0 = "Unexpected trailing comma"
            r1.mo25455w(r0, r3)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0042:
            kotlinx.serialization.json.internal.a r1 = r6.f30296f
            int r3 = r1.f30240a
            if (r0 == 0) goto L_0x004b
            goto L_0x0056
        L_0x004b:
            java.lang.String r0 = "Expected comma after the key-value pair"
            r1.mo25455w(r0, r3)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0056:
            int r0 = r6.f30298h
            int r4 = r0 + 1
            r6.f30298h = r4
            goto L_0x005f
        L_0x005d:
            if (r0 != 0) goto L_0x0060
        L_0x005f:
            return r4
        L_0x0060:
            kotlinx.serialization.json.internal.a r0 = r6.f30296f
            java.lang.String r1 = "Expected '}', but had ',' instead"
            r2 = 0
            r4 = 2
            kotlinx.serialization.json.internal.C12359a.m49866x(r0, r1, r3, r4, r2)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C12370f0.mo25502P():int");
    }

    /* renamed from: Q */
    public final int mo25503Q(C12217f fVar) {
        int e;
        boolean z;
        boolean Q = this.f30296f.mo25429Q();
        while (true) {
            boolean z2 = false;
            if (this.f30296f.mo25437f()) {
                String R = mo25504R();
                this.f30296f.mo25445n(C12361b.f30257h);
                e = JsonNamesMapKt.m49830e(fVar, this.f30294d, R);
                if (e == -3) {
                    z2 = true;
                    z = false;
                } else if (!this.f30299i.mo25360d() || !mo25500N(fVar, e)) {
                    JsonElementMarker jsonElementMarker = this.f30300j;
                } else {
                    z = this.f30296f.mo25429Q();
                }
                if (z2) {
                    Q = mo25505S(R);
                } else {
                    Q = z;
                }
            } else if (!Q) {
                JsonElementMarker jsonElementMarker2 = this.f30300j;
                if (jsonElementMarker2 == null) {
                    return -1;
                }
                return jsonElementMarker2.mo25395d();
            } else {
                C12359a.m49866x(this.f30296f, "Unexpected trailing comma", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
        }
        JsonElementMarker jsonElementMarker3 = this.f30300j;
        if (jsonElementMarker3 != null) {
            jsonElementMarker3.mo25394c(e);
        }
        return e;
    }

    /* renamed from: R */
    public final String mo25504R() {
        if (this.f30299i.mo25368n()) {
            return this.f30296f.mo25450s();
        }
        return this.f30296f.mo25442k();
    }

    /* renamed from: S */
    public final boolean mo25505S(String str) {
        if (this.f30299i.mo25363h()) {
            this.f30296f.mo25425M(this.f30299i.mo25368n());
        } else {
            this.f30296f.mo25457z(str);
        }
        return this.f30296f.mo25429Q();
    }

    /* renamed from: T */
    public final void mo25506T(C12217f fVar) {
        do {
        } while (mo24931o(fVar) != -1);
    }

    @C12579k
    /* renamed from: a */
    public C12434e mo24933a() {
        return this.f30297g;
    }

    @C12579k
    /* renamed from: b */
    public C12236c mo24875b(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        WriteMode c = C12387m0.m50101c(this.f30294d, fVar);
        this.f30296f.mo25445n(c.begin);
        mo25499M();
        int i = C12371a.$EnumSwitchMapping$0[c.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new C12370f0(this.f30294d, c, this.f30296f, fVar);
        }
        if (this.f30295e != c || !this.f30294d.mo25282h().mo25362f()) {
            return new C12370f0(this.f30294d, c, this.f30296f, fVar);
        }
        return this;
    }

    /* renamed from: c */
    public void mo24876c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (this.f30294d.mo25282h().mo25363h() && fVar.mo24823d() == 0) {
            mo25506T(fVar);
        }
        this.f30296f.mo25445n(this.f30295e.end);
    }

    @C12579k
    /* renamed from: d */
    public final C12341a mo25372d() {
        return this.f30294d;
    }

    /* renamed from: e */
    public int mo24877e(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        return JsonNamesMapKt.m49831f(fVar, this.f30294d, mo24896z());
    }

    @C12579k
    /* renamed from: g */
    public C12403k mo25373g() {
        return new JsonTreeReader(this.f30294d.mo25282h(), this.f30296f).mo25405e();
    }

    /* renamed from: h */
    public int mo24879h() {
        long o = this.f30296f.mo25446o();
        int i = (int) o;
        if (o == ((long) i)) {
            return i;
        }
        C12359a aVar = this.f30296f;
        C12359a.m49866x(aVar, "Failed to parse int for input '" + o + '\'', 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    @C12580l
    /* renamed from: j */
    public Void mo24881j() {
        return null;
    }

    /* renamed from: l */
    public long mo24883l() {
        return this.f30296f.mo25446o();
    }

    /* renamed from: o */
    public int mo24931o(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        int i = C12371a.$EnumSwitchMapping$0[this.f30295e.ordinal()];
        if (i == 2) {
            return mo25502P();
        }
        if (i != 4) {
            return mo25501O();
        }
        return mo25503Q(fVar);
    }

    @C12579k
    /* renamed from: q */
    public C12241e mo24887q(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        if (C12378i0.m50068b(fVar)) {
            return new C12386m(this.f30296f, this.f30294d);
        }
        return super.mo24887q(fVar);
    }

    /* renamed from: s */
    public short mo24889s() {
        long o = this.f30296f.mo25446o();
        short s = (short) ((int) o);
        if (o == ((long) s)) {
            return s;
        }
        C12359a aVar = this.f30296f;
        C12359a.m49866x(aVar, "Failed to parse short for input '" + o + '\'', 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: t */
    public float mo24890t() {
        C12359a aVar = this.f30296f;
        String r = aVar.mo25449r();
        boolean z = false;
        try {
            float parseFloat = Float.parseFloat(r);
            if (!this.f30294d.mo25282h().mo25357a()) {
                if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                    z = true;
                }
                if (!z) {
                    C12388n.m50111j(this.f30296f, Float.valueOf(parseFloat));
                    throw new KotlinNothingValueException();
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            C12359a.m49866x(aVar, "Failed to parse type '" + C16717v.C16719b.f42180c + "' for input '" + r + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: v */
    public double mo24892v() {
        C12359a aVar = this.f30296f;
        String r = aVar.mo25449r();
        boolean z = false;
        try {
            double parseDouble = Double.parseDouble(r);
            if (!this.f30294d.mo25282h().mo25357a()) {
                if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                    z = true;
                }
                if (!z) {
                    C12388n.m50111j(this.f30296f, Double.valueOf(parseDouble));
                    throw new KotlinNothingValueException();
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            C12359a.m49866x(aVar, "Failed to parse type '" + ContactApiClient.f24442G + "' for input '" + r + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: w */
    public boolean mo24893w() {
        if (this.f30299i.mo25368n()) {
            return this.f30296f.mo25440i();
        }
        return this.f30296f.mo25438g();
    }

    /* renamed from: x */
    public char mo24894x() {
        String r = this.f30296f.mo25449r();
        if (r.length() == 1) {
            return r.charAt(0);
        }
        C12359a aVar = this.f30296f;
        C12359a.m49866x(aVar, "Expected single char, but got '" + r + '\'', 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: z */
    public String mo24896z() {
        if (this.f30299i.mo25368n()) {
            return this.f30296f.mo25450s();
        }
        return this.f30296f.mo25447p();
    }
}
