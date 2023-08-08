package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.urbanairship.analytics.location.C35560b;
import com.urbanairship.contacts.ContactApiClient;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.descriptors.C12204d;
import kotlinx.serialization.descriptors.C12207e;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12224h;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.internal.C12322w0;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12344b;
import kotlinx.serialization.json.C12354g;
import kotlinx.serialization.json.C12356i;
import kotlinx.serialization.json.C12403k;
import kotlinx.serialization.json.C12406m;
import kotlinx.serialization.json.C12413r;
import kotlinx.serialization.json.C12421x;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.C12434e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.internal.c */
public abstract class C12363c extends C12322w0 implements C12356i {
    @C12579k

    /* renamed from: f */
    public final C12341a f30276f;
    @C12579k

    /* renamed from: g */
    public final C12403k f30277g;
    @C12579k
    @C11287e

    /* renamed from: h */
    public final C12354g f30278h;

    public /* synthetic */ C12363c(C12341a aVar, C12403k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, kVar);
    }

    @C12579k
    /* renamed from: A0 */
    public C12403k mo25399A0() {
        return this.f30277g;
    }

    /* renamed from: B0 */
    public final <T> T mo25458B0(C12421x xVar, String str, C11300l<? super C12421x, ? extends T> lVar) {
        try {
            T invoke = lVar.invoke(xVar);
            if (invoke != null) {
                return invoke;
            }
            mo25459C0(str);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            mo25459C0(str);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: C0 */
    public final Void mo25459C0(String str) {
        throw C12388n.m50107f(-1, "Failed to parse '" + str + '\'', mo25461l0().toString());
    }

    /* renamed from: D */
    public boolean mo24867D() {
        return !(mo25461l0() instanceof JsonNull);
    }

    /* renamed from: G */
    public <T> T mo24870G(@C12579k C12199c<T> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        return C12362b0.m49917d(this, cVar);
    }

    @C12579k
    /* renamed from: a */
    public C12434e mo24933a() {
        return mo25372d().mo25277a();
    }

    @C12579k
    /* renamed from: b */
    public C12236c mo24875b(@C12579k C12217f fVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        C12403k l0 = mo25461l0();
        C12224h kind = fVar.getKind();
        if (Intrinsics.areEqual((Object) kind, (Object) C12227i.C12229b.f30012a)) {
            z = true;
        } else {
            z = kind instanceof C12204d;
        }
        Class<C12344b> cls = C12344b.class;
        if (z) {
            C12341a d = mo25372d();
            if (l0 instanceof C12344b) {
                return new C12399x(d, (C12344b) l0);
            }
            throw C12388n.m50106e(-1, "Expected " + C11342l0.m43547d(cls) + " as the serialized body of " + fVar.mo24830h() + ", but had " + C11342l0.m43547d(l0.getClass()));
        }
        Class<JsonObject> cls2 = JsonObject.class;
        if (Intrinsics.areEqual((Object) kind, (Object) C12227i.C12230c.f30013a)) {
            C12341a d2 = mo25372d();
            C12217f a = C12387m0.m50099a(fVar.mo24827g(0), d2.mo25277a());
            C12224h kind2 = a.getKind();
            if ((kind2 instanceof C12207e) || Intrinsics.areEqual((Object) kind2, (Object) C12224h.C12226b.f30010a)) {
                C12341a d3 = mo25372d();
                if (l0 instanceof JsonObject) {
                    return new C12401z(d3, (JsonObject) l0);
                }
                throw C12388n.m50106e(-1, "Expected " + C11342l0.m43547d(cls2) + " as the serialized body of " + fVar.mo24830h() + ", but had " + C11342l0.m43547d(l0.getClass()));
            } else if (d2.mo25282h().mo25358b()) {
                C12341a d4 = mo25372d();
                if (l0 instanceof C12344b) {
                    return new C12399x(d4, (C12344b) l0);
                }
                throw C12388n.m50106e(-1, "Expected " + C11342l0.m43547d(cls) + " as the serialized body of " + fVar.mo24830h() + ", but had " + C11342l0.m43547d(l0.getClass()));
            } else {
                throw C12388n.m50105d(a);
            }
        } else {
            C12341a d5 = mo25372d();
            if (l0 instanceof JsonObject) {
                return new JsonTreeDecoder(d5, (JsonObject) l0, (String) null, (C12217f) null, 12, (DefaultConstructorMarker) null);
            }
            throw C12388n.m50106e(-1, "Expected " + C11342l0.m43547d(cls2) + " as the serialized body of " + fVar.mo24830h() + ", but had " + C11342l0.m43547d(l0.getClass()));
        }
    }

    /* renamed from: c */
    public void mo24876c(@C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
    }

    @C12579k
    /* renamed from: d */
    public C12341a mo25372d() {
        return this.f30276f;
    }

    @C12579k
    /* renamed from: f0 */
    public String mo25203f0(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "parentName");
        Intrinsics.checkNotNullParameter(str2, "childName");
        return str2;
    }

    @C12579k
    /* renamed from: g */
    public C12403k mo25373g() {
        return mo25461l0();
    }

    /* renamed from: j0 */
    public final C12413r mo25460j0(C12421x xVar, String str) {
        C12413r rVar = xVar instanceof C12413r ? (C12413r) xVar : null;
        if (rVar != null) {
            return rVar;
        }
        throw C12388n.m50106e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    @C12579k
    /* renamed from: k0 */
    public abstract C12403k mo25403k0(@C12579k String str);

    /* renamed from: l0 */
    public final C12403k mo25461l0() {
        String str = (String) mo24993a0();
        C12403k k0 = str == null ? null : mo25403k0(str);
        return k0 == null ? mo25399A0() : k0;
    }

    /* renamed from: m0 */
    public boolean mo24978L(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        C12421x z0 = mo25475z0(str);
        if (mo25372d().mo25282h().mo25368n() || !mo25460j0(z0, C16717v.C16719b.f42183f).mo25232h()) {
            try {
                Boolean f = C12406m.m50171f(z0);
                if (f != null) {
                    return f.booleanValue();
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException unused) {
                mo25459C0(C16717v.C16719b.f42183f);
                throw new KotlinNothingValueException();
            }
        } else {
            throw C12388n.m50107f(-1, "Boolean literal for key '" + str + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", mo25461l0().toString());
        }
    }

    /* renamed from: n0 */
    public byte mo24979M(@C12579k String str) {
        Byte b;
        Intrinsics.checkNotNullParameter(str, "tag");
        try {
            int l = C12406m.m50177l(mo25475z0(str));
            boolean z = false;
            if (-128 <= l && l <= 127) {
                z = true;
            }
            if (z) {
                b = Byte.valueOf((byte) l);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            mo25459C0("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            mo25459C0("byte");
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: o0 */
    public char mo24980N(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        try {
            return StringsKt___StringsKt.single(mo25475z0(str).mo25231e());
        } catch (IllegalArgumentException unused) {
            mo25459C0("char");
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: p0 */
    public double mo24981O(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "tag");
        try {
            double h = C12406m.m50173h(mo25475z0(str));
            if (!mo25372d().mo25282h().mo25357a()) {
                if (Double.isInfinite(h) || Double.isNaN(h)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    throw C12388n.m50102a(Double.valueOf(h), str, mo25461l0().toString());
                }
            }
            return h;
        } catch (IllegalArgumentException unused) {
            mo25459C0(ContactApiClient.f24442G);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: q0 */
    public int mo24982P(@C12579k String str, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(fVar, "enumDescriptor");
        return JsonNamesMapKt.m49831f(fVar, mo25372d(), mo25475z0(str).mo25231e());
    }

    /* renamed from: r0 */
    public float mo24983Q(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "tag");
        try {
            float j = C12406m.m50175j(mo25475z0(str));
            if (!mo25372d().mo25282h().mo25357a()) {
                if (Float.isInfinite(j) || Float.isNaN(j)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    throw C12388n.m50102a(Float.valueOf(j), str, mo25461l0().toString());
                }
            }
            return j;
        } catch (IllegalArgumentException unused) {
            mo25459C0(C16717v.C16719b.f42180c);
            throw new KotlinNothingValueException();
        }
    }

    @C12579k
    /* renamed from: s0 */
    public C12241e mo24984R(@C12579k String str, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(fVar, "inlineDescriptor");
        if (C12378i0.m50068b(fVar)) {
            return new C12386m(new C12380j0(mo25475z0(str).mo25231e()), mo25372d());
        }
        return super.mo24984R(str, fVar);
    }

    /* renamed from: t0 */
    public int mo24985S(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        try {
            return C12406m.m50177l(mo25475z0(str));
        } catch (IllegalArgumentException unused) {
            mo25459C0("int");
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: u0 */
    public long mo24986T(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        try {
            return C12406m.m50183r(mo25475z0(str));
        } catch (IllegalArgumentException unused) {
            mo25459C0(C35560b.f87804W0);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: v0 */
    public boolean mo24987U(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        if (mo25403k0(str) != JsonNull.INSTANCE) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: w0 */
    public Void mo24988V(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        return null;
    }

    /* renamed from: x0 */
    public short mo24989W(@C12579k String str) {
        Short sh;
        Intrinsics.checkNotNullParameter(str, "tag");
        try {
            int l = C12406m.m50177l(mo25475z0(str));
            boolean z = false;
            if (-32768 <= l && l <= 32767) {
                z = true;
            }
            if (z) {
                sh = Short.valueOf((short) l);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            mo25459C0("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            mo25459C0("short");
            throw new KotlinNothingValueException();
        }
    }

    @C12579k
    /* renamed from: y0 */
    public String mo24990X(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        C12421x z0 = mo25475z0(str);
        if (!mo25372d().mo25282h().mo25368n() && !mo25460j0(z0, C16717v.C16719b.f42182e).mo25232h()) {
            throw C12388n.m50107f(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", mo25461l0().toString());
        } else if (!(z0 instanceof JsonNull)) {
            return z0.mo25231e();
        } else {
            throw C12388n.m50107f(-1, "Unexpected 'null' value instead of string literal", mo25461l0().toString());
        }
    }

    @C12579k
    /* renamed from: z0 */
    public final C12421x mo25475z0(@C12579k String str) {
        C12421x xVar;
        Intrinsics.checkNotNullParameter(str, "tag");
        C12403k k0 = mo25403k0(str);
        if (k0 instanceof C12421x) {
            xVar = (C12421x) k0;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        throw C12388n.m50107f(-1, "Expected JsonPrimitive at " + str + ", found " + k0, mo25461l0().toString());
    }

    public C12363c(C12341a aVar, C12403k kVar) {
        this.f30276f = aVar;
        this.f30277g = kVar;
        this.f30278h = mo25372d().mo25282h();
    }
}
