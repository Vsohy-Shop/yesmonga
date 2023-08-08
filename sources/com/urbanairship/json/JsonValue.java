package com.urbanairship.json;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9669o0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

public class JsonValue implements Parcelable, C9333e {
    @C0359n0
    public static final Parcelable.Creator<JsonValue> CREATOR = new C9321a();
    @C0359n0

    /* renamed from: b */
    public static final JsonValue f25436b = new JsonValue((Object) null);

    /* renamed from: a */
    public final Object f25437a;

    /* renamed from: com.urbanairship.json.JsonValue$a */
    public class C9321a implements Parcelable.Creator<JsonValue> {
        @C0359n0
        /* renamed from: a */
        public JsonValue createFromParcel(@C0359n0 Parcel parcel) {
            try {
                return JsonValue.m34960C(parcel.readString());
            } catch (JsonException e) {
                C36059m.m148411g(e, "JsonValue - Unable to create JsonValue from parcel.", new Object[0]);
                return JsonValue.f25436b;
            }
        }

        @C0359n0
        /* renamed from: b */
        public JsonValue[] newArray(int i) {
            return new JsonValue[i];
        }
    }

    public JsonValue(@C0363p0 Object obj) {
        this.f25437a = obj;
    }

    @C0359n0
    /* renamed from: C */
    public static JsonValue m34960C(@C0363p0 String str) throws JsonException {
        if (C9669o0.m36224e(str)) {
            return f25436b;
        }
        try {
            return m34966L(new JSONTokener(str).nextValue());
        } catch (JSONException e) {
            throw new JsonException("Unable to parse string", e);
        }
    }

    @C0359n0
    /* renamed from: G */
    public static JsonValue m34961G(char c) {
        return m34975U(Character.valueOf(c));
    }

    @C0359n0
    /* renamed from: H */
    public static JsonValue m34962H(double d) {
        Double valueOf = Double.valueOf(d);
        if (valueOf.isInfinite() || valueOf.isNaN()) {
            return f25436b;
        }
        return m34975U(Double.valueOf(d));
    }

    @C0359n0
    /* renamed from: I */
    public static JsonValue m34963I(int i) {
        return m34975U(Integer.valueOf(i));
    }

    @C0359n0
    /* renamed from: J */
    public static JsonValue m34964J(long j) {
        return m34975U(Long.valueOf(j));
    }

    @C0359n0
    /* renamed from: K */
    public static JsonValue m34965K(@C0363p0 C9333e eVar) {
        return m34975U(eVar);
    }

    @C0359n0
    /* renamed from: L */
    public static JsonValue m34966L(@C0363p0 Object obj) throws JsonException {
        if (obj == null || obj == JSONObject.NULL) {
            return f25436b;
        }
        if (obj instanceof JsonValue) {
            return (JsonValue) obj;
        }
        if ((obj instanceof C9323b) || (obj instanceof C9322a) || (obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof String)) {
            return new JsonValue(obj);
        }
        if (obj instanceof C9333e) {
            return ((C9333e) obj).mo17264q();
        }
        if ((obj instanceof Byte) || (obj instanceof Short)) {
            return new JsonValue(Integer.valueOf(((Number) obj).intValue()));
        }
        if (obj instanceof Character) {
            return new JsonValue(((Character) obj).toString());
        }
        if (obj instanceof Float) {
            return new JsonValue(Double.valueOf(((Number) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (!d.isInfinite() && !d.isNaN()) {
                return new JsonValue(obj);
            }
            throw new JsonException("Invalid Double value: " + d);
        }
        try {
            if (obj instanceof JSONArray) {
                return m34972R((JSONArray) obj);
            }
            if (obj instanceof JSONObject) {
                return m34973S((JSONObject) obj);
            }
            if (obj instanceof Collection) {
                return m34971Q((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return m34970P(obj);
            }
            if (obj instanceof Map) {
                return m34974T((Map) obj);
            }
            throw new JsonException("Illegal object: " + obj);
        } catch (JsonException e) {
            throw e;
        } catch (Exception e2) {
            throw new JsonException("Failed to wrap value.", e2);
        }
    }

    @C0359n0
    /* renamed from: M */
    public static JsonValue m34967M(@C0363p0 Object obj, @C0359n0 JsonValue jsonValue) {
        try {
            return m34966L(obj);
        } catch (JsonException unused) {
            return jsonValue;
        }
    }

    @C0359n0
    /* renamed from: N */
    public static JsonValue m34968N(@C0363p0 String str) {
        return m34975U(str);
    }

    @C0359n0
    /* renamed from: O */
    public static JsonValue m34969O(boolean z) {
        return m34975U(Boolean.valueOf(z));
    }

    /* renamed from: P */
    public static JsonValue m34970P(@C0359n0 Object obj) throws JsonException {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                arrayList.add(m34966L(obj2));
            }
        }
        return new JsonValue(new C9322a(arrayList));
    }

    /* renamed from: Q */
    public static JsonValue m34971Q(@C0359n0 Collection collection) throws JsonException {
        ArrayList arrayList = new ArrayList();
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(m34966L(next));
            }
        }
        return new JsonValue(new C9322a(arrayList));
    }

    /* renamed from: R */
    public static JsonValue m34972R(@C0359n0 JSONArray jSONArray) throws JsonException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            if (!jSONArray.isNull(i)) {
                arrayList.add(m34966L(jSONArray.opt(i)));
            }
        }
        return new JsonValue(new C9322a(arrayList));
    }

    /* renamed from: S */
    public static JsonValue m34973S(@C0359n0 JSONObject jSONObject) throws JsonException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.isNull(next)) {
                hashMap.put(next, m34966L(jSONObject.opt(next)));
            }
        }
        return new JsonValue(new C9323b(hashMap));
    }

    /* renamed from: T */
    public static JsonValue m34974T(@C0359n0 Map<?, ?> map) throws JsonException {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!(next.getKey() instanceof String)) {
                throw new JsonException("Only string map keys are accepted.");
            } else if (next.getValue() != null) {
                hashMap.put((String) next.getKey(), m34966L(next.getValue()));
            }
        }
        return new JsonValue(new C9323b(hashMap));
    }

    @C0359n0
    /* renamed from: U */
    public static JsonValue m34975U(@C0363p0 Object obj) {
        return m34967M(obj, f25436b);
    }

    @C0359n0
    /* renamed from: A */
    public C9323b mo18749A() {
        C9323b j = mo18767j();
        if (j == null) {
            return C9323b.f25440b;
        }
        return j;
    }

    @C0359n0
    /* renamed from: B */
    public String mo18750B() {
        return mo18770m("");
    }

    @C0359n0
    /* renamed from: D */
    public C9322a mo18751D() throws JsonException {
        C9322a h = mo18764h();
        if (h != null) {
            return h;
        }
        throw new JsonException("Expected list: " + this);
    }

    @C0359n0
    /* renamed from: E */
    public C9323b mo18752E() throws JsonException {
        C9323b j = mo18767j();
        if (j != null) {
            return j;
        }
        throw new JsonException("Expected map: " + this);
    }

    @C0359n0
    /* renamed from: F */
    public String mo18753F() throws JsonException {
        String l = mo18769l();
        if (l != null) {
            return l;
        }
        throw new JsonException("Expected string: " + this);
    }

    /* renamed from: V */
    public void mo18754V(@C0359n0 JSONStringer jSONStringer) throws JSONException {
        if (mo18780w()) {
            jSONStringer.value((Object) null);
            return;
        }
        Object obj = this.f25437a;
        if (obj instanceof C9322a) {
            ((C9322a) obj).mo18800w(jSONStringer);
        } else if (obj instanceof C9323b) {
            ((C9323b) obj).mo18804Q(jSONStringer);
        } else {
            jSONStringer.value(obj);
        }
    }

    @C0363p0
    /* renamed from: a */
    public String mo18755a() {
        Object obj = this.f25437a;
        if (obj == null || obj == f25436b || (obj instanceof C9323b) || (obj instanceof C9322a)) {
            return null;
        }
        if (mo18783y()) {
            return (String) this.f25437a;
        }
        if (!mo18782x()) {
            return String.valueOf(this.f25437a);
        }
        try {
            return JSONObject.numberToString((Number) this.f25437a);
        } catch (JSONException e) {
            C36059m.m148411g(e, "JsonValue - Failed to coerce JSON Number into String.", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public Boolean mo18756b() {
        if (this.f25437a != null && mo18772o()) {
            return (Boolean) this.f25437a;
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo18757c(boolean z) {
        if (this.f25437a != null && mo18772o()) {
            return ((Boolean) this.f25437a).booleanValue();
        }
        return z;
    }

    /* renamed from: d */
    public double mo18758d(double d) {
        if (this.f25437a == null) {
            return d;
        }
        if (mo18773p()) {
            return ((Double) this.f25437a).doubleValue();
        }
        if (mo18782x()) {
            return ((Number) this.f25437a).doubleValue();
        }
        return d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public float mo18760e(float f) {
        if (this.f25437a == null) {
            return f;
        }
        if (mo18774r()) {
            return ((Float) this.f25437a).floatValue();
        }
        if (mo18782x()) {
            return ((Number) this.f25437a).floatValue();
        }
        return f;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof JsonValue)) {
            return false;
        }
        JsonValue jsonValue = (JsonValue) obj;
        if (this.f25437a == null) {
            return jsonValue.mo18780w();
        }
        if (!mo18782x() || !jsonValue.mo18782x()) {
            return this.f25437a.equals(jsonValue.f25437a);
        }
        if (mo18773p() || jsonValue.mo18773p()) {
            if (Double.compare(mo18758d(0.0d), jsonValue.mo18758d(0.0d)) == 0) {
                return true;
            }
            return false;
        } else if (mo18774r() || jsonValue.mo18774r()) {
            if (Float.compare(mo18760e(0.0f), jsonValue.mo18760e(0.0f)) == 0) {
                return true;
            }
            return false;
        } else if (mo18766i(0) == jsonValue.mo18766i(0)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public int mo18762f(int i) {
        if (this.f25437a == null) {
            return i;
        }
        if (mo18775s()) {
            return ((Integer) this.f25437a).intValue();
        }
        if (mo18782x()) {
            return ((Number) this.f25437a).intValue();
        }
        return i;
    }

    @C0363p0
    /* renamed from: g */
    public Integer mo18763g() {
        if (mo18775s()) {
            return (Integer) this.f25437a;
        }
        if (mo18782x()) {
            return Integer.valueOf(((Number) this.f25437a).intValue());
        }
        return null;
    }

    @C0363p0
    /* renamed from: h */
    public C9322a mo18764h() {
        if (this.f25437a != null && mo18776t()) {
            return (C9322a) this.f25437a;
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f25437a;
        if (obj != null) {
            return 527 + obj.hashCode();
        }
        return 17;
    }

    /* renamed from: i */
    public long mo18766i(long j) {
        if (this.f25437a == null) {
            return j;
        }
        if (mo18779v()) {
            return ((Long) this.f25437a).longValue();
        }
        if (mo18782x()) {
            return ((Number) this.f25437a).longValue();
        }
        return j;
    }

    @C0363p0
    /* renamed from: j */
    public C9323b mo18767j() {
        if (this.f25437a != null && mo18778u()) {
            return (C9323b) this.f25437a;
        }
        return null;
    }

    @C0363p0
    /* renamed from: k */
    public Number mo18768k() {
        if (this.f25437a != null && mo18782x()) {
            return (Number) this.f25437a;
        }
        return null;
    }

    @C0363p0
    /* renamed from: l */
    public String mo18769l() {
        if (this.f25437a != null && mo18783y()) {
            return (String) this.f25437a;
        }
        return null;
    }

    @C0359n0
    /* renamed from: m */
    public String mo18770m(@C0359n0 String str) {
        String l = mo18769l();
        return l == null ? str : l;
    }

    @C0363p0
    /* renamed from: n */
    public Object mo18771n() {
        return this.f25437a;
    }

    /* renamed from: o */
    public boolean mo18772o() {
        return this.f25437a instanceof Boolean;
    }

    /* renamed from: p */
    public boolean mo18773p() {
        return this.f25437a instanceof Double;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return this;
    }

    /* renamed from: r */
    public boolean mo18774r() {
        return this.f25437a instanceof Float;
    }

    /* renamed from: s */
    public boolean mo18775s() {
        return this.f25437a instanceof Integer;
    }

    /* renamed from: t */
    public boolean mo18776t() {
        return this.f25437a instanceof C9322a;
    }

    @C0359n0
    public String toString() {
        if (mo18780w()) {
            return "null";
        }
        try {
            Object obj = this.f25437a;
            if (obj instanceof String) {
                return JSONObject.quote((String) obj);
            }
            if (obj instanceof Number) {
                return JSONObject.numberToString((Number) obj);
            }
            if (!(obj instanceof C9323b)) {
                if (!(obj instanceof C9322a)) {
                    return String.valueOf(obj);
                }
            }
            return obj.toString();
        } catch (JSONException e) {
            C36059m.m148411g(e, "JsonValue - Failed to create JSON String.", new Object[0]);
            return "";
        }
    }

    /* renamed from: u */
    public boolean mo18778u() {
        return this.f25437a instanceof C9323b;
    }

    /* renamed from: v */
    public boolean mo18779v() {
        return this.f25437a instanceof Long;
    }

    /* renamed from: w */
    public boolean mo18780w() {
        return this.f25437a == null;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeString(toString());
    }

    /* renamed from: x */
    public boolean mo18782x() {
        return this.f25437a instanceof Number;
    }

    /* renamed from: y */
    public boolean mo18783y() {
        return this.f25437a instanceof String;
    }

    @C0359n0
    /* renamed from: z */
    public C9322a mo18784z() {
        C9322a h = mo18764h();
        if (h == null) {
            return C9322a.f25438b;
        }
        return h;
    }
}
