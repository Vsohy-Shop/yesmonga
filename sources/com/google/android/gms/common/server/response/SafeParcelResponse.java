package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.C40965b;
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
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;

@C40473a
@SafeParcelable.C40812a(creator = "SafeParcelResponseCreator")
@C40974d0
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C40950n();
    @SafeParcelable.C40819h(getter = "getVersionCode", mo134498id = 1)

    /* renamed from: a */
    public final int f104161a;
    @SafeParcelable.C40814c(getter = "getParcel", mo134489id = 2)

    /* renamed from: b */
    public final Parcel f104162b;

    /* renamed from: c */
    public final int f104163c;
    @SafeParcelable.C40814c(getter = "getFieldMappingDictionary", mo134489id = 3)

    /* renamed from: d */
    public final zan f104164d;
    @C0363p0

    /* renamed from: e */
    public final String f104165e;

    /* renamed from: f */
    public int f104166f;

    /* renamed from: g */
    public int f104167g;

    @SafeParcelable.C40813b
    public SafeParcelResponse(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) Parcel parcel, @SafeParcelable.C40816e(mo134492id = 3) zan zan) {
        this.f104161a = i;
        this.f104162b = (Parcel) C40843u.m166202l(parcel);
        this.f104163c = 2;
        this.f104164d = zan;
        this.f104165e = zan == null ? null : zan.mo134732M();
        this.f104166f = 2;
    }

    @C40473a
    @C0359n0
    /* renamed from: W */
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse m166492W(@C0359n0 T t) {
        zan zan = new zan(t.getClass());
        m166493Y(zan, t);
        zan.mo134734W();
        zan.mo134735X();
        return new SafeParcelResponse((SafeParcelable) t, zan, (String) C40843u.m166202l(t.getClass().getCanonicalName()));
    }

    /* renamed from: Y */
    public static void m166493Y(zan zan, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (!zan.mo134737f0(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> c = fastJsonResponse.mo134658c();
            zan.mo134736e0(cls, c);
            for (String str : c.keySet()) {
                FastJsonResponse.Field field = c.get(str);
                Class cls2 = field.f104137v;
                if (cls2 != null) {
                    try {
                        m166493Y(zan, (FastJsonResponse) cls2.newInstance());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException("Could not instantiate an object of type ".concat(String.valueOf(((Class) C40843u.m166202l(field.f104137v)).getCanonicalName())), e);
                    } catch (IllegalAccessException e2) {
                        throw new IllegalStateException("Could not access object of type ".concat(String.valueOf(((Class) C40843u.m166202l(field.f104137v)).getCanonicalName())), e2);
                    }
                }
            }
        }
    }

    /* renamed from: b0 */
    public static final void m166494b0(StringBuilder sb, int i, @C0363p0 Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C40992r.m166672b(C40843u.m166202l(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C40967c.m166596d((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C40967c.m166597e((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C40993s.m166674a(sb, (HashMap) C40843u.m166202l(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    /* renamed from: c0 */
    public static final void m166495c0(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (field.f104132c) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m166494b0(sb, field.f104131b, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m166494b0(sb, field.f104131b, obj);
    }

    /* renamed from: A */
    public final void mo134635A(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 BigInteger bigInteger) {
        mo134716Z(field);
        C40820a.m166118e(this.f104162b, field.mo134681K0(), bigInteger, true);
    }

    /* renamed from: C */
    public final void mo134637C(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        mo134716Z(field);
        int size = ((ArrayList) C40843u.m166202l(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        C40820a.m166120f(this.f104162b, field.mo134681K0(), bigIntegerArr, true);
    }

    /* renamed from: F */
    public final void mo134640F(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        mo134716Z(field);
        int size = ((ArrayList) C40843u.m166202l(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        C40820a.m166124h(this.f104162b, field.mo134681K0(), zArr, true);
    }

    /* renamed from: I */
    public final void mo134643I(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, double d) {
        mo134716Z(field);
        C40820a.m166136r(this.f104162b, field.mo134681K0(), d);
    }

    /* renamed from: K */
    public final void mo134645K(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        mo134716Z(field);
        int size = ((ArrayList) C40843u.m166202l(arrayList)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        C40820a.m166137s(this.f104162b, field.mo134681K0(), dArr, true);
    }

    /* renamed from: M */
    public final void mo134647M(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, float f) {
        mo134716Z(field);
        C40820a.m166141w(this.f104162b, field.mo134681K0(), f);
    }

    /* renamed from: O */
    public final void mo134649O(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        mo134716Z(field);
        int size = ((ArrayList) C40843u.m166202l(arrayList)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        C40820a.m166142x(this.f104162b, field.mo134681K0(), fArr, true);
    }

    /* renamed from: R */
    public final void mo134652R(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        mo134716Z(field);
        int size = ((ArrayList) C40843u.m166202l(arrayList)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        C40820a.m166090G(this.f104162b, field.mo134681K0(), iArr, true);
    }

    /* renamed from: U */
    public final void mo134655U(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        mo134716Z(field);
        int size = ((ArrayList) C40843u.m166202l(arrayList)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        C40820a.m166095L(this.f104162b, field.mo134681K0(), jArr, true);
    }

    @C0359n0
    /* renamed from: X */
    public final Parcel mo134715X() {
        int i = this.f104166f;
        if (i == 0) {
            int a = C40820a.m166110a(this.f104162b);
            this.f104167g = a;
            C40820a.m166112b(this.f104162b, a);
            this.f104166f = 2;
        } else if (i == 1) {
            C40820a.m166112b(this.f104162b, this.f104167g);
            this.f104166f = 2;
        }
        return this.f104162b;
    }

    /* renamed from: Z */
    public final void mo134716Z(FastJsonResponse.Field field) {
        if (field.f104136g != -1) {
            Parcel parcel = this.f104162b;
            if (parcel != null) {
                int i = this.f104166f;
                if (i == 0) {
                    this.f104167g = C40820a.m166110a(parcel);
                    this.f104166f = 1;
                } else if (i != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    /* renamed from: a */
    public final <T extends FastJsonResponse> void mo134656a(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 ArrayList<T> arrayList) {
        mo134716Z(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) C40843u.m166202l(arrayList)).size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) ((FastJsonResponse) arrayList.get(i))).mo134715X());
        }
        C40820a.m166100Q(this.f104162b, field.mo134681K0(), arrayList2, true);
    }

    /* renamed from: a0 */
    public final void mo134717a0(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).mo134681K0(), entry);
        }
        sb.append(C12361b.f30258i);
        int i0 = SafeParcelReader.m166060i0(parcel);
        boolean z = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.m166031O(X));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.mo134687e2()) {
                    int i = field.f104133d;
                    switch (i) {
                        case 0:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, Integer.valueOf(SafeParcelReader.m166042Z(parcel, X))));
                            break;
                        case 1:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, SafeParcelReader.m166047c(parcel, X)));
                            break;
                        case 2:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, Long.valueOf(SafeParcelReader.m166048c0(parcel, X))));
                            break;
                        case 3:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, Float.valueOf(SafeParcelReader.m166038V(parcel, X))));
                            break;
                        case 4:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, Double.valueOf(SafeParcelReader.m166036T(parcel, X))));
                            break;
                        case 5:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, SafeParcelReader.m166043a(parcel, X)));
                            break;
                        case 6:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, Boolean.valueOf(SafeParcelReader.m166032P(parcel, X))));
                            break;
                        case 7:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, SafeParcelReader.m166023G(parcel, X)));
                            break;
                        case 8:
                        case 9:
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, SafeParcelReader.m166057h(parcel, X)));
                            break;
                        case 10:
                            Bundle g = SafeParcelReader.m166055g(parcel, X);
                            HashMap hashMap = new HashMap();
                            for (String next : g.keySet()) {
                                hashMap.put(next, (String) C40843u.m166202l(g.getString(next)));
                            }
                            m166495c0(sb, field, FastJsonResponse.m166387r(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i);
                    }
                } else if (field.f104134e) {
                    sb.append("[");
                    switch (field.f104133d) {
                        case 0:
                            C40965b.m166586l(sb, SafeParcelReader.m166074u(parcel, X));
                            break;
                        case 1:
                            C40965b.m166588n(sb, SafeParcelReader.m166049d(parcel, X));
                            break;
                        case 2:
                            C40965b.m166587m(sb, SafeParcelReader.m166076w(parcel, X));
                            break;
                        case 3:
                            C40965b.m166585k(sb, SafeParcelReader.m166068o(parcel, X));
                            break;
                        case 4:
                            C40965b.m166584j(sb, SafeParcelReader.m166065l(parcel, X));
                            break;
                        case 5:
                            C40965b.m166588n(sb, SafeParcelReader.m166045b(parcel, X));
                            break;
                        case 6:
                            C40965b.m166589o(sb, SafeParcelReader.m166051e(parcel, X));
                            break;
                        case 7:
                            C40965b.m166590p(sb, SafeParcelReader.m166024H(parcel, X));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] z2 = SafeParcelReader.m166079z(parcel, X);
                            int length = z2.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                z2[i2].setDataPosition(0);
                                mo134717a0(sb, field.mo134685Y1(), z2[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f104133d) {
                        case 0:
                            sb.append(SafeParcelReader.m166042Z(parcel, X));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m166047c(parcel, X));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m166048c0(parcel, X));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m166038V(parcel, X));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m166036T(parcel, X));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m166043a(parcel, X));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m166032P(parcel, X));
                            break;
                        case 7:
                            String G = SafeParcelReader.m166023G(parcel, X);
                            sb.append("\"");
                            sb.append(C40992r.m166672b(G));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] h = SafeParcelReader.m166057h(parcel, X);
                            sb.append("\"");
                            sb.append(C40967c.m166596d(h));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] h2 = SafeParcelReader.m166057h(parcel, X);
                            sb.append("\"");
                            sb.append(C40967c.m166597e(h2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle g2 = SafeParcelReader.m166055g(parcel, X);
                            Set<String> keySet = g2.keySet();
                            sb.append(C33093b.f80281i);
                            boolean z3 = true;
                            for (String next2 : keySet) {
                                if (!z3) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(next2);
                                sb.append("\":\"");
                                sb.append(C40992r.m166672b(g2.getString(next2)));
                                sb.append("\"");
                                z3 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel y = SafeParcelReader.m166078y(parcel, X);
                            y.setDataPosition(0);
                            mo134717a0(sb, field.mo134685Y1(), y);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == i0) {
            sb.append(C12361b.f30259j);
            return;
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + i0, parcel);
    }

    /* renamed from: b */
    public final <T extends FastJsonResponse> void mo134657b(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0359n0 T t) {
        mo134716Z(field);
        C40820a.m166098O(this.f104162b, field.mo134681K0(), ((SafeParcelResponse) t).mo134715X(), true);
    }

    @C0363p0
    /* renamed from: c */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo134658c() {
        zan zan = this.f104164d;
        if (zan == null) {
            return null;
        }
        return zan.mo134733Q((String) C40843u.m166202l(this.f104165e));
    }

    @C0359n0
    /* renamed from: e */
    public final Object mo134660e(@C0359n0 String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: g */
    public final boolean mo134662g(@C0359n0 String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: h */
    public final void mo134663h(@C0359n0 FastJsonResponse.Field<?, ?> field, @C0359n0 String str, boolean z) {
        mo134716Z(field);
        C40820a.m166122g(this.f104162b, field.mo134681K0(), z);
    }

    /* renamed from: i */
    public final void mo134664i(@C0359n0 FastJsonResponse.Field<?, ?> field, @C0359n0 String str, @C0363p0 byte[] bArr) {
        mo134716Z(field);
        C40820a.m166131m(this.f104162b, field.mo134681K0(), bArr, true);
    }

    /* renamed from: j */
    public final void mo134665j(@C0359n0 FastJsonResponse.Field<?, ?> field, @C0359n0 String str, int i) {
        mo134716Z(field);
        C40820a.m166089F(this.f104162b, field.mo134681K0(), i);
    }

    /* renamed from: k */
    public final void mo134666k(@C0359n0 FastJsonResponse.Field<?, ?> field, @C0359n0 String str, long j) {
        mo134716Z(field);
        C40820a.m166094K(this.f104162b, field.mo134681K0(), j);
    }

    /* renamed from: l */
    public final void mo134667l(@C0359n0 FastJsonResponse.Field<?, ?> field, @C0359n0 String str, @C0363p0 String str2) {
        mo134716Z(field);
        C40820a.m166108Y(this.f104162b, field.mo134681K0(), str2, true);
    }

    /* renamed from: m */
    public final void mo134668m(@C0359n0 FastJsonResponse.Field<?, ?> field, @C0359n0 String str, @C0363p0 Map<String, String> map) {
        mo134716Z(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) C40843u.m166202l(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        C40820a.m166129k(this.f104162b, field.mo134681K0(), bundle, true);
    }

    /* renamed from: n */
    public final void mo134669n(@C0359n0 FastJsonResponse.Field<?, ?> field, @C0359n0 String str, @C0363p0 ArrayList<String> arrayList) {
        mo134716Z(field);
        int size = ((ArrayList) C40843u.m166202l(arrayList)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        C40820a.m166109Z(this.f104162b, field.mo134681K0(), strArr, true);
    }

    @C0359n0
    public final String toString() {
        C40843u.m166203m(this.f104164d, "Cannot convert to JSON on client side.");
        Parcel X = mo134715X();
        X.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        mo134717a0(sb, (Map) C40843u.m166202l(this.f104164d.mo134733Q((String) C40843u.m166202l(this.f104165e))), X);
        return sb.toString();
    }

    /* renamed from: w */
    public final void mo134676w(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 BigDecimal bigDecimal) {
        mo134716Z(field);
        C40820a.m166114c(this.f104162b, field.mo134681K0(), bigDecimal, true);
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        zan zan;
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104161a);
        C40820a.m166098O(parcel, 2, mo134715X(), false);
        int i2 = this.f104163c;
        if (i2 == 0) {
            zan = null;
        } else if (i2 != 1) {
            zan = this.f104164d;
        } else {
            zan = this.f104164d;
        }
        C40820a.m166102S(parcel, 3, zan, i, false);
        C40820a.m166112b(parcel, a);
    }

    /* renamed from: y */
    public final void mo134678y(@C0359n0 FastJsonResponse.Field field, @C0359n0 String str, @C0363p0 ArrayList arrayList) {
        mo134716Z(field);
        int size = ((ArrayList) C40843u.m166202l(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        C40820a.m166116d(this.f104162b, field.mo134681K0(), bigDecimalArr, true);
    }

    public SafeParcelResponse(SafeParcelable safeParcelable, zan zan, String str) {
        this.f104161a = 1;
        Parcel obtain = Parcel.obtain();
        this.f104162b = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.f104163c = 1;
        this.f104164d = (zan) C40843u.m166202l(zan);
        this.f104165e = (String) C40843u.m166202l(str);
        this.f104166f = 2;
    }

    public SafeParcelResponse(zan zan, String str) {
        this.f104161a = 1;
        this.f104162b = Parcel.obtain();
        this.f104163c = 0;
        this.f104164d = (zan) C40843u.m166202l(zan);
        this.f104165e = (String) C40843u.m166202l(str);
        this.f104166f = 0;
    }
}
