package kotlinx.serialization.json.internal;

import com.journeyapps.barcodescanner.camera.C34935s;
import kotlin.C11079d2;
import kotlin.C11400l1;
import kotlin.C11419p1;
import kotlin.C11588t1;
import kotlin.C11679z1;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12250i;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.encoding.C12235b;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12256b;
import kotlinx.serialization.internal.C12325x0;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12354g;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12406m;
import kotlinx.serialization.json.C12409o;
import kotlinx.serialization.json.C12413r;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12200d
public abstract class AbstractJsonTreeEncoder extends C12325x0 implements C12409o {
    @C12579k

    /* renamed from: b */
    public final C12341a f30215b;
    @C12579k

    /* renamed from: c */
    public final C11300l<C12403k, C11079d2> f30216c;
    @C12579k
    @C11287e

    /* renamed from: d */
    public final C12354g f30217d;
    @C12580l

    /* renamed from: e */
    public String f30218e;

    /* renamed from: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$a */
    public static final class C12358a extends C12235b {
        @C12579k

        /* renamed from: a */
        public final C12434e f30219a;

        /* renamed from: b */
        public final /* synthetic */ AbstractJsonTreeEncoder f30220b;

        /* renamed from: c */
        public final /* synthetic */ String f30221c;

        public C12358a(AbstractJsonTreeEncoder abstractJsonTreeEncoder, String str) {
            this.f30220b = abstractJsonTreeEncoder;
            this.f30221c = str;
            this.f30219a = abstractJsonTreeEncoder.mo25375d().mo25277a();
        }

        /* renamed from: C */
        public void mo24898C(int i) {
            mo25391K(C11419p1.m43984Y1(C11419p1.m43971M(i)));
        }

        /* renamed from: K */
        public final void mo25391K(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C34935s.f84988a);
            this.f30220b.mo25390v0(this.f30221c, new C12413r(str, false));
        }

        @C12579k
        /* renamed from: a */
        public C12434e mo24934a() {
            return this.f30219a;
        }

        /* renamed from: h */
        public void mo24911h(byte b) {
            mo25391K(C11400l1.m43769T1(C11400l1.m43761M(b)));
        }

        /* renamed from: n */
        public void mo24917n(long j) {
            mo25391K(C11588t1.m44983Y1(C11588t1.m44970M(j)));
        }

        /* renamed from: r */
        public void mo24921r(short s) {
            mo25391K(C11679z1.m45849T1(C11679z1.m45841M(s)));
        }
    }

    public /* synthetic */ AbstractJsonTreeEncoder(C12341a aVar, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, lVar);
    }

    /* renamed from: g0 */
    public static final /* synthetic */ String m49775g0(AbstractJsonTreeEncoder abstractJsonTreeEncoder) {
        return (String) abstractJsonTreeEncoder.mo25175X();
    }

    /* renamed from: A */
    public boolean mo24897A(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return this.f30217d.mo25361e();
    }

    /* renamed from: B */
    public void mo25374B(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "element");
        mo24908e(JsonElementSerializer.f30161a, kVar);
    }

    /* renamed from: W */
    public void mo25174W(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        this.f30216c.invoke(mo25389u0());
    }

    @C12579k
    /* renamed from: a */
    public final C12434e mo24934a() {
        return this.f30215b.mo25277a();
    }

    @C12579k
    /* renamed from: b */
    public C12239d mo24906b(@C12579k C12217f fVar) {
        C11300l lVar;
        boolean z;
        AbstractJsonTreeEncoder abstractJsonTreeEncoder;
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (mo25176Y() == null) {
            lVar = this.f30216c;
        } else {
            lVar = new AbstractJsonTreeEncoder$beginStructure$consumer$1(this);
        }
        C12224h kind = fVar.getKind();
        if (Intrinsics.areEqual((Object) kind, (Object) C12227i.C12229b.f30012a)) {
            z = true;
        } else {
            z = kind instanceof C12204d;
        }
        if (z) {
            abstractJsonTreeEncoder = new C12400y(this.f30215b, lVar);
        } else if (Intrinsics.areEqual((Object) kind, (Object) C12227i.C12230c.f30013a)) {
            C12341a aVar = this.f30215b;
            C12217f a = C12387m0.m50099a(fVar.mo24827g(0), aVar.mo25277a());
            C12224h kind2 = a.getKind();
            if ((kind2 instanceof C12207e) || Intrinsics.areEqual((Object) kind2, (Object) C12224h.C12226b.f30010a)) {
                abstractJsonTreeEncoder = new C12360a0(mo25375d(), lVar);
            } else if (aVar.mo25282h().mo25358b()) {
                abstractJsonTreeEncoder = new C12400y(mo25375d(), lVar);
            } else {
                throw C12388n.m50105d(a);
            }
        } else {
            abstractJsonTreeEncoder = new C12398w(this.f30215b, lVar);
        }
        String str = this.f30218e;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            abstractJsonTreeEncoder.mo25390v0(str, C12406m.m50168c(fVar.mo24830h()));
            this.f30218e = null;
        }
        return abstractJsonTreeEncoder;
    }

    @C12579k
    /* renamed from: c0 */
    public String mo25211c0(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "parentName");
        Intrinsics.checkNotNullParameter(str2, "childName");
        return str2;
    }

    @C12579k
    /* renamed from: d */
    public final C12341a mo25375d() {
        return this.f30215b;
    }

    /* renamed from: e */
    public <T> void mo24908e(@C12579k C12440p<? super T> pVar, T t) {
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        if (mo25176Y() == null && TreeJsonEncoderKt.m49860c(C12387m0.m50099a(pVar.getDescriptor(), mo24934a()))) {
            C12395t tVar = new C12395t(this.f30215b, this.f30216c);
            tVar.mo24908e(pVar, t);
            tVar.mo25174W(pVar.getDescriptor());
        } else if (!(pVar instanceof C12256b) || mo25375d().mo25282h().mo25367m()) {
            pVar.serialize(this, t);
        } else {
            C12256b bVar = (C12256b) pVar;
            String c = C12362b0.m49916c(pVar.getDescriptor(), mo25375d());
            if (t != null) {
                C12440p b = C12250i.m49068b(bVar, this, t);
                C12362b0.m49920g(bVar, b, c);
                C12362b0.m49915b(b.getDescriptor().getKind());
                this.f30218e = c;
                b.serialize(this, t);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
    }

    /* renamed from: h0 */
    public void mo25161J(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, C12406m.m50166a(Boolean.valueOf(z)));
    }

    /* renamed from: i0 */
    public void mo25162K(@C12579k String str, byte b) {
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, C12406m.m50167b(Byte.valueOf(b)));
    }

    /* renamed from: j0 */
    public void mo25163L(@C12579k String str, char c) {
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, C12406m.m50168c(String.valueOf(c)));
    }

    /* renamed from: k0 */
    public void mo25164M(@C12579k String str, double d) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, C12406m.m50167b(Double.valueOf(d)));
        if (!this.f30217d.mo25357a()) {
            if (Double.isInfinite(d) || Double.isNaN(d)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                throw C12388n.m50104c(Double.valueOf(d), str, mo25389u0().toString());
            }
        }
    }

    /* renamed from: l0 */
    public void mo25165N(@C12579k String str, @C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        mo25390v0(str, C12406m.m50168c(fVar.mo24824e(i)));
    }

    /* renamed from: m0 */
    public void mo25166O(@C12579k String str, float f) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, C12406m.m50167b(Float.valueOf(f)));
        if (!this.f30217d.mo25357a()) {
            if (Float.isInfinite(f) || Float.isNaN(f)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                throw C12388n.m50104c(Float.valueOf(f), str, mo25389u0().toString());
            }
        }
    }

    @C12579k
    /* renamed from: n0 */
    public C12244g mo25167P(@C12579k String str, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        if (C12378i0.m50068b(fVar)) {
            return new C12358a(this, str);
        }
        return super.mo25167P(str, fVar);
    }

    /* renamed from: o0 */
    public void mo25168Q(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, C12406m.m50167b(Integer.valueOf(i)));
    }

    /* renamed from: p */
    public void mo24919p() {
        String str = (String) mo25176Y();
        if (str == null) {
            this.f30216c.invoke(JsonNull.INSTANCE);
        } else {
            mo25170S(str);
        }
    }

    /* renamed from: p0 */
    public void mo25169R(@C12579k String str, long j) {
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, C12406m.m50167b(Long.valueOf(j)));
    }

    /* renamed from: q0 */
    public void mo25170S(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, JsonNull.INSTANCE);
    }

    /* renamed from: r0 */
    public void mo25171T(@C12579k String str, short s) {
        Intrinsics.checkNotNullParameter(str, "tag");
        mo25390v0(str, C12406m.m50167b(Short.valueOf(s)));
    }

    /* renamed from: s0 */
    public void mo25172U(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "value");
        mo25390v0(str, C12406m.m50168c(str2));
    }

    /* renamed from: t0 */
    public void mo25173V(@C12579k String str, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(obj, "value");
        mo25390v0(str, C12406m.m50168c(obj.toString()));
    }

    @C12579k
    /* renamed from: u0 */
    public abstract C12403k mo25389u0();

    /* renamed from: v0 */
    public abstract void mo25390v0(@C12579k String str, @C12579k C12403k kVar);

    public AbstractJsonTreeEncoder(C12341a aVar, C11300l<? super C12403k, C11079d2> lVar) {
        this.f30215b = aVar;
        this.f30216c = lVar;
        this.f30217d = aVar.mo25282h();
    }
}
