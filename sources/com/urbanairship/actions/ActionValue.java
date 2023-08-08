package com.urbanairship.actions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;

public class ActionValue implements C9333e, Parcelable {
    @C0359n0
    public static final Parcelable.Creator<ActionValue> CREATOR = new C35476a();
    @C0359n0

    /* renamed from: a */
    public final JsonValue f87420a;

    /* renamed from: com.urbanairship.actions.ActionValue$a */
    public class C35476a implements Parcelable.Creator<ActionValue> {
        @C0359n0
        /* renamed from: a */
        public ActionValue createFromParcel(@C0359n0 Parcel parcel) {
            return new ActionValue((JsonValue) parcel.readParcelable(JsonValue.class.getClassLoader()));
        }

        @C0359n0
        /* renamed from: b */
        public ActionValue[] newArray(int i) {
            return new ActionValue[i];
        }
    }

    public ActionValue(@C0363p0 JsonValue jsonValue) {
        this.f87420a = jsonValue == null ? JsonValue.f25436b : jsonValue;
    }

    @C0359n0
    /* renamed from: j */
    public static ActionValue m146323j(char c) {
        return new ActionValue(JsonValue.m34961G(c));
    }

    @C0359n0
    /* renamed from: k */
    public static ActionValue m146324k(int i) {
        return new ActionValue(JsonValue.m34963I(i));
    }

    @C0359n0
    /* renamed from: l */
    public static ActionValue m146325l(long j) {
        return new ActionValue(JsonValue.m34964J(j));
    }

    @C0359n0
    /* renamed from: m */
    public static ActionValue m146326m(@C0363p0 C9333e eVar) {
        return new ActionValue(JsonValue.m34965K(eVar));
    }

    @C0359n0
    /* renamed from: n */
    public static ActionValue m146327n(@C0363p0 Object obj) throws ActionValueException {
        try {
            return new ActionValue(JsonValue.m34966L(obj));
        } catch (JsonException e) {
            throw new ActionValueException("Invalid ActionValue object: " + obj, e);
        }
    }

    @C0359n0
    /* renamed from: o */
    public static ActionValue m146328o(@C0363p0 String str) {
        return new ActionValue(JsonValue.m34968N(str));
    }

    @C0359n0
    /* renamed from: p */
    public static ActionValue m146329p(boolean z) {
        return new ActionValue(JsonValue.m34969O(z));
    }

    /* renamed from: a */
    public boolean mo106300a(boolean z) {
        return this.f87420a.mo18757c(z);
    }

    /* renamed from: b */
    public double mo106301b(double d) {
        return this.f87420a.mo18758d(d);
    }

    /* renamed from: c */
    public int mo106302c(int i) {
        return this.f87420a.mo18762f(i);
    }

    @C0363p0
    /* renamed from: d */
    public C9322a mo106303d() {
        return this.f87420a.mo18764h();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo106305e(long j) {
        return this.f87420a.mo18766i(j);
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj instanceof ActionValue) {
            return this.f87420a.equals(((ActionValue) obj).f87420a);
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public C9323b mo106307f() {
        return this.f87420a.mo18767j();
    }

    @C0363p0
    /* renamed from: g */
    public String mo106308g() {
        return this.f87420a.mo18769l();
    }

    @C0359n0
    /* renamed from: h */
    public String mo106309h(@C0359n0 String str) {
        return this.f87420a.mo18770m(str);
    }

    public int hashCode() {
        return this.f87420a.hashCode();
    }

    /* renamed from: i */
    public boolean mo106311i() {
        return this.f87420a.mo18780w();
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return this.f87420a;
    }

    @C0359n0
    public String toString() {
        return this.f87420a.toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeParcelable(this.f87420a, i);
    }

    public ActionValue() {
        this.f87420a = JsonValue.f25436b;
    }
}
