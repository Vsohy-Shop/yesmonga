package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.C40967c;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40992r;
import com.google.android.gms.common.util.C40993s;
import com.google.firebase.installations.local.C33093b;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@C40473a
@C40858y
public abstract class FastJsonResponse {

    @C40858y
    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface C40936a<I, O> {
        /* renamed from: i */
        int mo134621i();

        /* renamed from: k */
        int mo134622k();

        @C0359n0
        /* renamed from: q */
        Object mo134623q(@C0359n0 Object obj);

        @C0363p0
        /* renamed from: r */
        Object mo134624r(@C0359n0 Object obj);
    }

    @C0359n0
    /* renamed from: r */
    public static final Object m166387r(@C0359n0 Field field, @C0363p0 Object obj) {
        if (field.f104140y != null) {
            return field.mo134683M1(obj);
        }
        return obj;
    }

    /* renamed from: t */
    public static final void m166388t(StringBuilder sb, Field field, Object obj) {
        int i = field.f104131b;
        if (i == 11) {
            Class cls = field.f104137v;
            C40843u.m166202l(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(C40992r.m166672b((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: u */
    public static final void m166389u(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
        }
    }

    /* renamed from: A */
    public void mo134635A(@C0359n0 Field field, @C0359n0 String str, @C0363p0 BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    /* renamed from: B */
    public final void mo134636B(@C0359n0 Field field, @C0363p0 ArrayList arrayList) {
        if (field.f104140y != null) {
            mo134673s(field, arrayList);
        } else {
            mo134637C(field, field.f104135f, arrayList);
        }
    }

    /* renamed from: C */
    public void mo134637C(@C0359n0 Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    /* renamed from: D */
    public final void mo134638D(@C0359n0 Field field, boolean z) {
        if (field.f104140y != null) {
            mo134673s(field, Boolean.valueOf(z));
        } else {
            mo134663h(field, field.f104135f, z);
        }
    }

    /* renamed from: E */
    public final void mo134639E(@C0359n0 Field field, @C0363p0 ArrayList arrayList) {
        if (field.f104140y != null) {
            mo134673s(field, arrayList);
        } else {
            mo134640F(field, field.f104135f, arrayList);
        }
    }

    /* renamed from: F */
    public void mo134640F(@C0359n0 Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    /* renamed from: G */
    public final void mo134641G(@C0359n0 Field field, @C0363p0 byte[] bArr) {
        if (field.f104140y != null) {
            mo134673s(field, bArr);
        } else {
            mo134664i(field, field.f104135f, bArr);
        }
    }

    /* renamed from: H */
    public final void mo134642H(@C0359n0 Field field, double d) {
        if (field.f104140y != null) {
            mo134673s(field, Double.valueOf(d));
        } else {
            mo134643I(field, field.f104135f, d);
        }
    }

    /* renamed from: I */
    public void mo134643I(@C0359n0 Field field, @C0359n0 String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    /* renamed from: J */
    public final void mo134644J(@C0359n0 Field field, @C0363p0 ArrayList arrayList) {
        if (field.f104140y != null) {
            mo134673s(field, arrayList);
        } else {
            mo134645K(field, field.f104135f, arrayList);
        }
    }

    /* renamed from: K */
    public void mo134645K(@C0359n0 Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    /* renamed from: L */
    public final void mo134646L(@C0359n0 Field field, float f) {
        if (field.f104140y != null) {
            mo134673s(field, Float.valueOf(f));
        } else {
            mo134647M(field, field.f104135f, f);
        }
    }

    /* renamed from: M */
    public void mo134647M(@C0359n0 Field field, @C0359n0 String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    /* renamed from: N */
    public final void mo134648N(@C0359n0 Field field, @C0363p0 ArrayList arrayList) {
        if (field.f104140y != null) {
            mo134673s(field, arrayList);
        } else {
            mo134649O(field, field.f104135f, arrayList);
        }
    }

    /* renamed from: O */
    public void mo134649O(@C0359n0 Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    /* renamed from: P */
    public final void mo134650P(@C0359n0 Field field, int i) {
        if (field.f104140y != null) {
            mo134673s(field, Integer.valueOf(i));
        } else {
            mo134665j(field, field.f104135f, i);
        }
    }

    /* renamed from: Q */
    public final void mo134651Q(@C0359n0 Field field, @C0363p0 ArrayList arrayList) {
        if (field.f104140y != null) {
            mo134673s(field, arrayList);
        } else {
            mo134652R(field, field.f104135f, arrayList);
        }
    }

    /* renamed from: R */
    public void mo134652R(@C0359n0 Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    /* renamed from: S */
    public final void mo134653S(@C0359n0 Field field, long j) {
        if (field.f104140y != null) {
            mo134673s(field, Long.valueOf(j));
        } else {
            mo134666k(field, field.f104135f, j);
        }
    }

    /* renamed from: T */
    public final void mo134654T(@C0359n0 Field field, @C0363p0 ArrayList arrayList) {
        if (field.f104140y != null) {
            mo134673s(field, arrayList);
        } else {
            mo134655U(field, field.f104135f, arrayList);
        }
    }

    /* renamed from: U */
    public void mo134655U(@C0359n0 Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    @C40473a
    /* renamed from: a */
    public <T extends FastJsonResponse> void mo134656a(@C0359n0 Field field, @C0359n0 String str, @C0363p0 ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @C40473a
    /* renamed from: b */
    public <T extends FastJsonResponse> void mo134657b(@C0359n0 Field field, @C0359n0 String str, @C0359n0 T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public abstract Map<String, Field<?, ?>> mo134658c();

    @C0363p0
    @C40473a
    /* renamed from: d */
    public Object mo134659d(@C0359n0 Field field) {
        boolean z;
        String str = field.f104135f;
        if (field.f104137v == null) {
            return mo134660e(str);
        }
        if (mo134660e(str) == null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166210t(z, "Concrete field shouldn't be value object: %s", field.f104135f);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: e */
    public abstract Object mo134660e(@C0359n0 String str);

    @C40473a
    /* renamed from: f */
    public boolean mo134661f(@C0359n0 Field field) {
        if (field.f104133d != 11) {
            return mo134662g(field.f104135f);
        }
        if (field.f104134e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @C40473a
    /* renamed from: g */
    public abstract boolean mo134662g(@C0359n0 String str);

    @C40473a
    /* renamed from: h */
    public void mo134663h(@C0359n0 Field<?, ?> field, @C0359n0 String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @C40473a
    /* renamed from: i */
    public void mo134664i(@C0359n0 Field<?, ?> field, @C0359n0 String str, @C0363p0 byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @C40473a
    /* renamed from: j */
    public void mo134665j(@C0359n0 Field<?, ?> field, @C0359n0 String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @C40473a
    /* renamed from: k */
    public void mo134666k(@C0359n0 Field<?, ?> field, @C0359n0 String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @C40473a
    /* renamed from: l */
    public void mo134667l(@C0359n0 Field<?, ?> field, @C0359n0 String str, @C0363p0 String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @C40473a
    /* renamed from: m */
    public void mo134668m(@C0359n0 Field<?, ?> field, @C0359n0 String str, @C0363p0 Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @C40473a
    /* renamed from: n */
    public void mo134669n(@C0359n0 Field<?, ?> field, @C0359n0 String str, @C0363p0 ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* renamed from: o */
    public final void mo134670o(@C0359n0 Field field, @C0363p0 String str) {
        if (field.f104140y != null) {
            mo134673s(field, str);
        } else {
            mo134667l(field, field.f104135f, str);
        }
    }

    /* renamed from: p */
    public final void mo134671p(@C0359n0 Field field, @C0363p0 Map map) {
        if (field.f104140y != null) {
            mo134673s(field, map);
        } else {
            mo134668m(field, field.f104135f, map);
        }
    }

    /* renamed from: q */
    public final void mo134672q(@C0359n0 Field field, @C0363p0 ArrayList arrayList) {
        if (field.f104140y != null) {
            mo134673s(field, arrayList);
        } else {
            mo134669n(field, field.f104135f, arrayList);
        }
    }

    /* renamed from: s */
    public final void mo134673s(Field field, @C0363p0 Object obj) {
        String str = field.f104135f;
        Object L1 = field.mo134682L1(obj);
        int i = field.f104133d;
        switch (i) {
            case 0:
                if (L1 != null) {
                    mo134665j(field, str, ((Integer) L1).intValue());
                    return;
                } else {
                    m166389u(str);
                    return;
                }
            case 1:
                mo134635A(field, str, (BigInteger) L1);
                return;
            case 2:
                if (L1 != null) {
                    mo134666k(field, str, ((Long) L1).longValue());
                    return;
                } else {
                    m166389u(str);
                    return;
                }
            case 4:
                if (L1 != null) {
                    mo134643I(field, str, ((Double) L1).doubleValue());
                    return;
                } else {
                    m166389u(str);
                    return;
                }
            case 5:
                mo134676w(field, str, (BigDecimal) L1);
                return;
            case 6:
                if (L1 != null) {
                    mo134663h(field, str, ((Boolean) L1).booleanValue());
                    return;
                } else {
                    m166389u(str);
                    return;
                }
            case 7:
                mo134667l(field, str, (String) L1);
                return;
            case 8:
            case 9:
                if (L1 != null) {
                    mo134664i(field, str, (byte[]) L1);
                    return;
                } else {
                    m166389u(str);
                    return;
                }
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i);
        }
    }

    @C40473a
    @C0359n0
    public String toString() {
        Map<String, Field<?, ?>> c = mo134658c();
        StringBuilder sb = new StringBuilder(100);
        for (String next : c.keySet()) {
            Field field = c.get(next);
            if (mo134661f(field)) {
                Object r = m166387r(field, mo134659d(field));
                if (sb.length() == 0) {
                    sb.append(C33093b.f80281i);
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (r != null) {
                    switch (field.f104133d) {
                        case 8:
                            sb.append("\"");
                            sb.append(C40967c.m166596d((byte[]) r));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C40967c.m166597e((byte[]) r));
                            sb.append("\"");
                            break;
                        case 10:
                            C40993s.m166674a(sb, (HashMap) r);
                            break;
                        default:
                            if (!field.f104132c) {
                                m166388t(sb, field, r);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) r;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m166388t(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append(C28819e.f70617a);
        }
        return sb.toString();
    }

    /* renamed from: v */
    public final void mo134675v(@C0359n0 Field field, @C0363p0 BigDecimal bigDecimal) {
        if (field.f104140y != null) {
            mo134673s(field, bigDecimal);
        } else {
            mo134676w(field, field.f104135f, bigDecimal);
        }
    }

    /* renamed from: w */
    public void mo134676w(@C0359n0 Field field, @C0359n0 String str, @C0363p0 BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    /* renamed from: x */
    public final void mo134677x(@C0359n0 Field field, @C0363p0 ArrayList arrayList) {
        if (field.f104140y != null) {
            mo134673s(field, arrayList);
        } else {
            mo134678y(field, field.f104135f, arrayList);
        }
    }

    /* renamed from: y */
    public void mo134678y(@C0359n0 Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    /* renamed from: z */
    public final void mo134679z(@C0359n0 Field field, @C0363p0 BigInteger bigInteger) {
        if (field.f104140y != null) {
            mo134673s(field, bigInteger);
        } else {
            mo134635A(field, field.f104135f, bigInteger);
        }
    }

    @C40858y
    @SafeParcelable.C40812a(creator = "FieldCreator")
    @C40473a
    @C40974d0
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C40946j CREATOR = new C40946j();
        @SafeParcelable.C40819h(getter = "getVersionCode", mo134498id = 1)

        /* renamed from: a */
        public final int f104130a;
        @SafeParcelable.C40814c(getter = "getTypeIn", mo134489id = 2)

        /* renamed from: b */
        public final int f104131b;
        @SafeParcelable.C40814c(getter = "isTypeInArray", mo134489id = 3)

        /* renamed from: c */
        public final boolean f104132c;
        @SafeParcelable.C40814c(getter = "getTypeOut", mo134489id = 4)

        /* renamed from: d */
        public final int f104133d;
        @SafeParcelable.C40814c(getter = "isTypeOutArray", mo134489id = 5)

        /* renamed from: e */
        public final boolean f104134e;
        @C0359n0
        @SafeParcelable.C40814c(getter = "getOutputFieldName", mo134489id = 6)

        /* renamed from: f */
        public final String f104135f;
        @SafeParcelable.C40814c(getter = "getSafeParcelableFieldId", mo134489id = 7)

        /* renamed from: g */
        public final int f104136g;
        @C0363p0

        /* renamed from: v */
        public final Class f104137v;
        @C0363p0
        @SafeParcelable.C40814c(getter = "getConcreteTypeName", mo134489id = 8)

        /* renamed from: w */
        public final String f104138w;

        /* renamed from: x */
        public zan f104139x;
        @C0363p0
        @SafeParcelable.C40814c(getter = "getWrappedConverter", mo134489id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")

        /* renamed from: y */
        public C40936a f104140y;

        @SafeParcelable.C40813b
        public Field(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) boolean z, @SafeParcelable.C40816e(mo134492id = 4) int i3, @SafeParcelable.C40816e(mo134492id = 5) boolean z2, @SafeParcelable.C40816e(mo134492id = 6) String str, @SafeParcelable.C40816e(mo134492id = 7) int i4, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 9) zaa zaa) {
            this.f104130a = i;
            this.f104131b = i2;
            this.f104132c = z;
            this.f104133d = i3;
            this.f104134e = z2;
            this.f104135f = str;
            this.f104136g = i4;
            if (str2 == null) {
                this.f104137v = null;
                this.f104138w = null;
            } else {
                this.f104137v = SafeParcelResponse.class;
                this.f104138w = str2;
            }
            if (zaa == null) {
                this.f104140y = null;
            } else {
                this.f104140y = zaa.mo134632Q();
            }
        }

        @C40473a
        @C0359n0
        /* renamed from: A0 */
        public static Field<HashMap<String, String>, HashMap<String, String>> m166434A0(@C0359n0 String str, int i) {
            return new Field(10, false, 10, false, str, i, (Class) null, (C40936a) null);
        }

        @C40473a
        @C0359n0
        /* renamed from: C0 */
        public static Field<ArrayList<String>, ArrayList<String>> m166436C0(@C0359n0 String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class) null, (C40936a) null);
        }

        @C40473a
        @C0359n0
        @C40974d0
        /* renamed from: M */
        public static Field<byte[], byte[]> m166437M(@C0359n0 String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class) null, (C40936a) null);
        }

        @C40473a
        @C0359n0
        /* renamed from: N0 */
        public static Field m166438N0(@C0359n0 String str, int i, @C0359n0 C40936a<?, ?> aVar, boolean z) {
            aVar.mo134621i();
            aVar.mo134622k();
            return new Field(7, z, 0, false, str, i, (Class) null, aVar);
        }

        @C40473a
        @C0359n0
        /* renamed from: Q */
        public static Field<Boolean, Boolean> m166439Q(@C0359n0 String str, int i) {
            return new Field(6, false, 6, false, str, i, (Class) null, (C40936a) null);
        }

        @C40473a
        @C0359n0
        /* renamed from: W */
        public static <T extends FastJsonResponse> Field<T, T> m166440W(@C0359n0 String str, int i, @C0359n0 Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, (C40936a) null);
        }

        @C40473a
        @C0359n0
        /* renamed from: X */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m166441X(@C0359n0 String str, int i, @C0359n0 Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, (C40936a) null);
        }

        @C40473a
        @C0359n0
        /* renamed from: e0 */
        public static Field<Double, Double> m166442e0(@C0359n0 String str, int i) {
            return new Field(4, false, 4, false, str, i, (Class) null, (C40936a) null);
        }

        @C40473a
        @C0359n0
        /* renamed from: f0 */
        public static Field<Float, Float> m166443f0(@C0359n0 String str, int i) {
            return new Field(3, false, 3, false, str, i, (Class) null, (C40936a) null);
        }

        @C40473a
        @C0359n0
        @C40974d0
        /* renamed from: n0 */
        public static Field<Integer, Integer> m166444n0(@C0359n0 String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class) null, (C40936a) null);
        }

        @C40473a
        @C0359n0
        /* renamed from: p0 */
        public static Field<Long, Long> m166445p0(@C0359n0 String str, int i) {
            return new Field(2, false, 2, false, str, i, (Class) null, (C40936a) null);
        }

        @C40473a
        @C0359n0
        /* renamed from: t0 */
        public static Field<String, String> m166446t0(@C0359n0 String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class) null, (C40936a) null);
        }

        @C0359n0
        /* renamed from: G1 */
        public final FastJsonResponse mo134680G1() throws InstantiationException, IllegalAccessException {
            C40843u.m166202l(this.f104137v);
            Class<SafeParcelResponse> cls = this.f104137v;
            if (cls != SafeParcelResponse.class) {
                return cls.newInstance();
            }
            C40843u.m166202l(this.f104138w);
            C40843u.m166203m(this.f104139x, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.f104139x, this.f104138w);
        }

        @C40473a
        /* renamed from: K0 */
        public int mo134681K0() {
            return this.f104136g;
        }

        @C0359n0
        /* renamed from: L1 */
        public final Object mo134682L1(@C0363p0 Object obj) {
            C40843u.m166202l(this.f104140y);
            return C40843u.m166202l(this.f104140y.mo134624r(obj));
        }

        @C0359n0
        /* renamed from: M1 */
        public final Object mo134683M1(@C0359n0 Object obj) {
            C40843u.m166202l(this.f104140y);
            return this.f104140y.mo134623q(obj);
        }

        @C0363p0
        /* renamed from: X1 */
        public final String mo134684X1() {
            String str = this.f104138w;
            if (str == null) {
                return null;
            }
            return str;
        }

        @C0359n0
        /* renamed from: Y1 */
        public final Map mo134685Y1() {
            C40843u.m166202l(this.f104138w);
            C40843u.m166202l(this.f104139x);
            return (Map) C40843u.m166202l(this.f104139x.mo134733Q(this.f104138w));
        }

        /* renamed from: c2 */
        public final void mo134686c2(zan zan) {
            this.f104139x = zan;
        }

        /* renamed from: e2 */
        public final boolean mo134687e2() {
            return this.f104140y != null;
        }

        @C0363p0
        /* renamed from: j1 */
        public final zaa mo134688j1() {
            C40936a aVar = this.f104140y;
            if (aVar == null) {
                return null;
            }
            return zaa.m166385M(aVar);
        }

        @C0359n0
        /* renamed from: k1 */
        public final Field mo134689k1() {
            return new Field(this.f104130a, this.f104131b, this.f104132c, this.f104133d, this.f104134e, this.f104135f, this.f104136g, this.f104138w, mo134688j1());
        }

        @C0359n0
        public final String toString() {
            C40808s.C40809a a = C40808s.m166012d(this).mo134475a("versionCode", Integer.valueOf(this.f104130a)).mo134475a("typeIn", Integer.valueOf(this.f104131b)).mo134475a("typeInArray", Boolean.valueOf(this.f104132c)).mo134475a("typeOut", Integer.valueOf(this.f104133d)).mo134475a("typeOutArray", Boolean.valueOf(this.f104134e)).mo134475a("outputFieldName", this.f104135f).mo134475a("safeParcelFieldId", Integer.valueOf(this.f104136g)).mo134475a("concreteTypeName", mo134684X1());
            Class cls = this.f104137v;
            if (cls != null) {
                a.mo134475a("concreteType.class", cls.getCanonicalName());
            }
            C40936a aVar = this.f104140y;
            if (aVar != null) {
                a.mo134475a("converterName", aVar.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
            int a = C40820a.m166110a(parcel);
            C40820a.m166089F(parcel, 1, this.f104130a);
            C40820a.m166089F(parcel, 2, this.f104131b);
            C40820a.m166122g(parcel, 3, this.f104132c);
            C40820a.m166089F(parcel, 4, this.f104133d);
            C40820a.m166122g(parcel, 5, this.f104134e);
            C40820a.m166108Y(parcel, 6, this.f104135f, false);
            C40820a.m166089F(parcel, 7, mo134681K0());
            C40820a.m166108Y(parcel, 8, mo134684X1(), false);
            C40820a.m166102S(parcel, 9, mo134688j1(), i, false);
            C40820a.m166112b(parcel, a);
        }

        public Field(int i, boolean z, int i2, boolean z2, @C0359n0 String str, int i3, @C0363p0 Class cls, @C0363p0 C40936a aVar) {
            this.f104130a = 1;
            this.f104131b = i;
            this.f104132c = z;
            this.f104133d = i2;
            this.f104134e = z2;
            this.f104135f = str;
            this.f104136g = i3;
            this.f104137v = cls;
            if (cls == null) {
                this.f104138w = null;
            } else {
                this.f104138w = cls.getCanonicalName();
            }
            this.f104140y = aVar;
        }
    }
}
