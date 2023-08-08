package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12250i;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12235b;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12256b;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12354g;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12409o;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.internal.h0 */
public final class C12375h0 extends C12235b implements C12409o {
    @C12579k

    /* renamed from: a */
    public final C12372g f30303a;
    @C12579k

    /* renamed from: b */
    public final C12341a f30304b;
    @C12579k

    /* renamed from: c */
    public final WriteMode f30305c;
    @C12580l

    /* renamed from: d */
    public final C12409o[] f30306d;
    @C12579k

    /* renamed from: e */
    public final C12434e f30307e;
    @C12579k

    /* renamed from: f */
    public final C12354g f30308f;

    /* renamed from: g */
    public boolean f30309g;
    @C12580l

    /* renamed from: h */
    public String f30310h;

    /* renamed from: kotlinx.serialization.json.internal.h0$a */
    public /* synthetic */ class C12376a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            iArr[WriteMode.LIST.ordinal()] = 1;
            iArr[WriteMode.MAP.ordinal()] = 2;
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C12375h0(@C12579k C12372g gVar, @C12579k C12341a aVar, @C12579k WriteMode writeMode, @C12580l C12409o[] oVarArr) {
        Intrinsics.checkNotNullParameter(gVar, "composer");
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(writeMode, "mode");
        this.f30303a = gVar;
        this.f30304b = aVar;
        this.f30305c = writeMode;
        this.f30306d = oVarArr;
        this.f30307e = mo25375d().mo25277a();
        this.f30308f = mo25375d().mo25282h();
        int ordinal = writeMode.ordinal();
        if (oVarArr != null) {
            C12409o oVar = oVarArr[ordinal];
            if (oVar != null || oVar != this) {
                oVarArr[ordinal] = this;
            }
        }
    }

    /* renamed from: A */
    public boolean mo24897A(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        return this.f30308f.mo25361e();
    }

    /* renamed from: B */
    public void mo25374B(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "element");
        mo24908e(JsonElementSerializer.f30161a, kVar);
    }

    /* renamed from: C */
    public void mo24898C(int i) {
        if (this.f30309g) {
            mo24903H(String.valueOf(i));
        } else {
            this.f30303a.mo25514h(i);
        }
    }

    /* renamed from: H */
    public void mo24903H(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f30303a.mo25519m(str);
    }

    /* renamed from: I */
    public boolean mo24904I(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        int i2 = C12376a.$EnumSwitchMapping$0[this.f30305c.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.f30303a.mo25507a()) {
                        this.f30303a.mo25511e(',');
                    }
                    this.f30303a.mo25509c();
                    mo24903H(fVar.mo24824e(i));
                    this.f30303a.mo25511e(C12361b.f30257h);
                    this.f30303a.mo25521o();
                } else {
                    if (i == 0) {
                        this.f30309g = true;
                    }
                    if (i == 1) {
                        this.f30303a.mo25511e(',');
                        this.f30303a.mo25521o();
                        this.f30309g = false;
                    }
                }
            } else if (!this.f30303a.mo25507a()) {
                if (i % 2 == 0) {
                    this.f30303a.mo25511e(',');
                    this.f30303a.mo25509c();
                    z = true;
                } else {
                    this.f30303a.mo25511e(C12361b.f30257h);
                    this.f30303a.mo25521o();
                }
                this.f30309g = z;
            } else {
                this.f30309g = true;
                this.f30303a.mo25509c();
            }
        } else {
            if (!this.f30303a.mo25507a()) {
                this.f30303a.mo25511e(',');
            }
            this.f30303a.mo25509c();
        }
        return true;
    }

    /* renamed from: K */
    public final void mo25523K(C12217f fVar) {
        this.f30303a.mo25509c();
        String str = this.f30310h;
        Intrinsics.checkNotNull(str);
        mo24903H(str);
        this.f30303a.mo25511e(C12361b.f30257h);
        this.f30303a.mo25521o();
        mo24903H(fVar.mo24830h());
    }

    @C12579k
    /* renamed from: a */
    public C12434e mo24934a() {
        return this.f30307e;
    }

    @C12579k
    /* renamed from: b */
    public C12239d mo24906b(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        WriteMode c = C12387m0.m50101c(mo25375d(), fVar);
        char c2 = c.begin;
        if (c2 != 0) {
            this.f30303a.mo25511e(c2);
            this.f30303a.mo25508b();
        }
        C12409o oVar = null;
        if (this.f30310h != null) {
            mo25523K(fVar);
            this.f30310h = null;
        }
        if (this.f30305c == c) {
            return this;
        }
        C12409o[] oVarArr = this.f30306d;
        if (oVarArr != null) {
            oVar = oVarArr[c.ordinal()];
        }
        if (oVar == null) {
            return new C12375h0(this.f30303a, mo25375d(), c, this.f30306d);
        }
        return oVar;
    }

    /* renamed from: c */
    public void mo24907c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        if (this.f30305c.end != 0) {
            this.f30303a.mo25522p();
            this.f30303a.mo25509c();
            this.f30303a.mo25511e(this.f30305c.end);
        }
    }

    @C12579k
    /* renamed from: d */
    public C12341a mo25375d() {
        return this.f30304b;
    }

    /* renamed from: e */
    public <T> void mo24908e(@C12579k C12440p<? super T> pVar, T t) {
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        if (!(pVar instanceof C12256b) || mo25375d().mo25282h().mo25367m()) {
            pVar.serialize(this, t);
            return;
        }
        C12256b bVar = (C12256b) pVar;
        String c = C12362b0.m49916c(pVar.getDescriptor(), mo25375d());
        if (t != null) {
            C12440p b = C12250i.m49068b(bVar, this, t);
            C12362b0.m49920g(bVar, b, c);
            C12362b0.m49915b(b.getDescriptor().getKind());
            this.f30310h = c;
            b.serialize(this, t);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    /* renamed from: g */
    public void mo24910g(double d) {
        boolean z;
        if (this.f30309g) {
            mo24903H(String.valueOf(d));
        } else {
            this.f30303a.mo25512f(d);
        }
        if (!this.f30308f.mo25357a()) {
            if (Double.isInfinite(d) || Double.isNaN(d)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                throw C12388n.m50103b(Double.valueOf(d), this.f30303a.f30301a.toString());
            }
        }
    }

    /* renamed from: h */
    public void mo24911h(byte b) {
        if (this.f30309g) {
            mo24903H(String.valueOf(b));
        } else {
            this.f30303a.mo25510d(b);
        }
    }

    /* renamed from: i */
    public <T> void mo24912i(@C12579k C12217f fVar, int i, @C12579k C12440p<? super T> pVar, @C12580l T t) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        if (t != null || this.f30308f.mo25362f()) {
            super.mo24912i(fVar, i, pVar, t);
        }
    }

    /* renamed from: k */
    public void mo24914k(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        mo24903H(fVar.mo24824e(i));
    }

    @C12579k
    /* renamed from: m */
    public C12244g mo24916m(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        if (C12378i0.m50068b(fVar)) {
            return new C12375h0((C12372g) new C12374h(this.f30303a.f30301a), mo25375d(), this.f30305c, (C12409o[]) null);
        }
        return super.mo24916m(fVar);
    }

    /* renamed from: n */
    public void mo24917n(long j) {
        if (this.f30309g) {
            mo24903H(String.valueOf(j));
        } else {
            this.f30303a.mo25515i(j);
        }
    }

    /* renamed from: p */
    public void mo24919p() {
        this.f30303a.mo25516j("null");
    }

    /* renamed from: r */
    public void mo24921r(short s) {
        if (this.f30309g) {
            mo24903H(String.valueOf(s));
        } else {
            this.f30303a.mo25517k(s);
        }
    }

    /* renamed from: s */
    public void mo24922s(boolean z) {
        if (this.f30309g) {
            mo24903H(String.valueOf(z));
        } else {
            this.f30303a.mo25518l(z);
        }
    }

    /* renamed from: u */
    public void mo24924u(float f) {
        boolean z;
        if (this.f30309g) {
            mo24903H(String.valueOf(f));
        } else {
            this.f30303a.mo25513g(f);
        }
        if (!this.f30308f.mo25357a()) {
            if (Float.isInfinite(f) || Float.isNaN(f)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                throw C12388n.m50103b(Float.valueOf(f), this.f30303a.f30301a.toString());
            }
        }
    }

    /* renamed from: v */
    public void mo24925v(char c) {
        mo24903H(String.valueOf(c));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12375h0(@C12579k C12396u uVar, @C12579k C12341a aVar, @C12579k WriteMode writeMode, @C12579k C12409o[] oVarArr) {
        this(C12379j.m50070a(uVar, aVar), aVar, writeMode, oVarArr);
        Intrinsics.checkNotNullParameter(uVar, "output");
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(writeMode, "mode");
        Intrinsics.checkNotNullParameter(oVarArr, "modeReuseCache");
    }
}
