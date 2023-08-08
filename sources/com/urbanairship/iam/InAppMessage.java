package com.urbanairship.iam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.automation.C8800a0;
import com.urbanairship.iam.banner.C9156c;
import com.urbanairship.iam.custom.C9165a;
import com.urbanairship.iam.fullscreen.C9185c;
import com.urbanairship.iam.html.C9198c;
import com.urbanairship.iam.layout.C9219e;
import com.urbanairship.iam.modal.C9225c;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

public class InAppMessage implements Parcelable, C8800a0 {
    @C0359n0
    public static final Parcelable.Creator<InAppMessage> CREATOR = new C9121a();

    /* renamed from: E0 */
    public static final String f24667E0 = "source";

    /* renamed from: F0 */
    public static final String f24668F0 = "display_behavior";

    /* renamed from: G0 */
    public static final String f24669G0 = "reporting_enabled";

    /* renamed from: H0 */
    public static final String f24670H0 = "rendered_locale";

    /* renamed from: I0 */
    public static final String f24671I0 = "language";

    /* renamed from: J0 */
    public static final String f24672J0 = "country";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: K0 */
    public static final String f24673K0 = "legacy-push";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: L0 */
    public static final String f24674L0 = "remote-data";
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: M0 */
    public static final String f24675M0 = "app-defined";
    @C0359n0

    /* renamed from: N0 */
    public static final String f24676N0 = "banner";
    @C0359n0

    /* renamed from: O0 */
    public static final String f24677O0 = "custom";
    @C0359n0

    /* renamed from: P0 */
    public static final String f24678P0 = "fullscreen";
    @C0359n0

    /* renamed from: Q0 */
    public static final String f24679Q0 = "modal";
    @C0359n0

    /* renamed from: R0 */
    public static final String f24680R0 = "html";
    @C0359n0

    /* renamed from: S0 */
    public static final String f24681S0 = "layout";
    @C0359n0

    /* renamed from: T0 */
    public static final String f24682T0 = "default";
    @C0359n0

    /* renamed from: U0 */
    public static final String f24683U0 = "immediate";

    /* renamed from: X */
    public static final String f24684X = "name";

    /* renamed from: Y */
    public static final String f24685Y = "extra";

    /* renamed from: Z */
    public static final String f24686Z = "actions";

    /* renamed from: x */
    public static final int f24687x = 1024;

    /* renamed from: y */
    public static final String f24688y = "display_type";

    /* renamed from: z */
    public static final String f24689z = "display";

    /* renamed from: a */
    public final String f24690a;

    /* renamed from: b */
    public final C9323b f24691b;

    /* renamed from: c */
    public final String f24692c;

    /* renamed from: d */
    public final C9333e f24693d;

    /* renamed from: e */
    public final Map<String, JsonValue> f24694e;

    /* renamed from: f */
    public final String f24695f;

    /* renamed from: g */
    public final boolean f24696g;

    /* renamed from: v */
    public final String f24697v;

    /* renamed from: w */
    public final Map<String, JsonValue> f24698w;

    /* renamed from: com.urbanairship.iam.InAppMessage$a */
    public class C9121a implements Parcelable.Creator<InAppMessage> {
        @C0363p0
        /* renamed from: a */
        public InAppMessage createFromParcel(@C0359n0 Parcel parcel) {
            try {
                return InAppMessage.m34087j(JsonValue.m34960C(parcel.readString()));
            } catch (JsonException e) {
                C36059m.m148409e("InAppMessage - Invalid parcel: %s", e);
                return null;
            }
        }

        @C0359n0
        /* renamed from: b */
        public InAppMessage[] newArray(int i) {
            return new InAppMessage[i];
        }
    }

    /* renamed from: com.urbanairship.iam.InAppMessage$b */
    public static class C9122b {

        /* renamed from: a */
        public String f24699a;

        /* renamed from: b */
        public C9323b f24700b;

        /* renamed from: c */
        public String f24701c;

        /* renamed from: d */
        public C9333e f24702d;

        /* renamed from: e */
        public Map<String, JsonValue> f24703e;

        /* renamed from: f */
        public String f24704f;

        /* renamed from: g */
        public String f24705g;

        /* renamed from: h */
        public boolean f24706h;

        /* renamed from: i */
        public Map<String, JsonValue> f24707i;

        public /* synthetic */ C9122b(C9121a aVar) {
            this();
        }

        @C0359n0
        /* renamed from: k */
        public C9122b mo18195k(@C0359n0 String str, @C0359n0 JsonValue jsonValue) {
            this.f24703e.put(str, jsonValue);
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public InAppMessage mo18196l() {
            boolean z;
            String str = this.f24701c;
            if (str == null || str.length() <= 1024) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "Name exceeds max name length: 1024");
            C9654i.m36166b(this.f24699a, "Missing type.");
            C9654i.m36166b(this.f24702d, "Missing content.");
            return new InAppMessage(this, (C9121a) null);
        }

        @C0359n0
        /* renamed from: m */
        public C9122b mo18197m(@C0363p0 Map<String, JsonValue> map) {
            this.f24703e.clear();
            if (map != null) {
                this.f24703e.putAll(map);
            }
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9122b mo18198n(@C0359n0 String str) {
            this.f24705g = str;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9122b mo18199o(@C0359n0 C9156c cVar) {
            this.f24699a = "banner";
            this.f24702d = cVar;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9122b mo18200p(@C0359n0 C9165a aVar) {
            this.f24699a = "custom";
            this.f24702d = aVar;
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C9122b mo18201q(@C0359n0 C9185c cVar) {
            this.f24699a = InAppMessage.f24678P0;
            this.f24702d = cVar;
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C9122b mo18202r(@C0359n0 C9198c cVar) {
            this.f24699a = "html";
            this.f24702d = cVar;
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: s */
        public C9122b mo18203s(@C0359n0 C9219e eVar) {
            this.f24699a = "layout";
            this.f24702d = eVar;
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C9122b mo18204t(@C0359n0 C9225c cVar) {
            this.f24699a = InAppMessage.f24679Q0;
            this.f24702d = cVar;
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public final C9122b mo18205u(@C0359n0 String str, @C0359n0 JsonValue jsonValue) throws JsonException {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1349088399:
                    if (str.equals("custom")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1109722326:
                    if (str.equals("layout")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3213227:
                    if (str.equals("html")) {
                        c = 3;
                        break;
                    }
                    break;
                case 104069805:
                    if (str.equals(InAppMessage.f24679Q0)) {
                        c = 4;
                        break;
                    }
                    break;
                case 110066619:
                    if (str.equals(InAppMessage.f24678P0)) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo18199o(C9156c.m34299m(jsonValue));
                    break;
                case 1:
                    mo18200p(C9165a.m34356a(jsonValue));
                    break;
                case 2:
                    mo18203s(C9219e.m34616a(jsonValue));
                    break;
                case 3:
                    mo18202r(C9198c.m34513g(jsonValue));
                    break;
                case 4:
                    mo18204t(C9225c.m34642l(jsonValue));
                    break;
                case 5:
                    mo18201q(C9185c.m34445j(jsonValue));
                    break;
            }
            return this;
        }

        @C0359n0
        /* renamed from: v */
        public C9122b mo18206v(@C0363p0 C9323b bVar) {
            this.f24700b = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C9122b mo18207w(@C0363p0 @C0386z0(max = 1024, min = 1) String str) {
            this.f24701c = str;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C0359n0
        /* renamed from: x */
        public C9122b mo18208x(@C0363p0 Map<String, JsonValue> map) {
            this.f24707i = map;
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C9122b mo18209y(boolean z) {
            this.f24706h = z;
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: z */
        public C9122b mo18210z(@C0363p0 String str) {
            this.f24704f = str;
            return this;
        }

        public C9122b() {
            this.f24703e = new HashMap();
            this.f24704f = "app-defined";
            this.f24705g = "default";
            this.f24706h = true;
        }

        public C9122b(@C0359n0 InAppMessage inAppMessage) {
            this.f24703e = new HashMap();
            this.f24704f = "app-defined";
            this.f24705g = "default";
            this.f24706h = true;
            this.f24699a = inAppMessage.f24690a;
            this.f24702d = inAppMessage.f24693d;
            this.f24701c = inAppMessage.f24692c;
            this.f24700b = inAppMessage.f24691b;
            this.f24703e = inAppMessage.f24694e;
            this.f24704f = inAppMessage.f24697v;
            this.f24705g = inAppMessage.f24695f;
            this.f24706h = inAppMessage.f24696g;
            this.f24707i = inAppMessage.f24698w;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.InAppMessage$c */
    public @interface C9123c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.InAppMessage$d */
    public @interface C9124d {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.InAppMessage$e */
    public @interface C9125e {
    }

    public /* synthetic */ InAppMessage(C9122b bVar, C9121a aVar) {
        this(bVar);
    }

    @C0359n0
    /* renamed from: j */
    public static InAppMessage m34087j(@C0359n0 JsonValue jsonValue) throws JsonException {
        return m34088k(jsonValue, (String) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: k */
    public static InAppMessage m34088k(@C0359n0 JsonValue jsonValue, @C0363p0 String str) throws JsonException {
        String B = jsonValue.mo18749A().mo18801A(f24688y).mo18750B();
        JsonValue A = jsonValue.mo18749A().mo18801A("display");
        String l = jsonValue.mo18749A().mo18801A("name").mo18769l();
        if (l == null || l.length() <= 1024) {
            C9122b j = m34089v().mo18207w(l).mo18206v(jsonValue.mo18749A().mo18801A("extra").mo18749A()).mo18205u(B, A);
            String l2 = jsonValue.mo18749A().mo18801A("source").mo18769l();
            if (l2 != null) {
                j.mo18210z(l2);
            } else if (str != null) {
                j.mo18210z(str);
            }
            if (jsonValue.mo18749A().mo18805e("actions")) {
                C9323b j2 = jsonValue.mo18749A().mo18801A("actions").mo18767j();
                if (j2 != null) {
                    j.mo18197m(j2.mo18813r());
                } else {
                    throw new JsonException("Actions must be a JSON object: " + jsonValue.mo18749A().mo18801A("actions"));
                }
            }
            if (jsonValue.mo18749A().mo18805e(f24668F0)) {
                String B2 = jsonValue.mo18749A().mo18801A(f24668F0).mo18750B();
                B2.hashCode();
                if (B2.equals(f24683U0)) {
                    j.mo18198n(f24683U0);
                } else if (B2.equals("default")) {
                    j.mo18198n("default");
                } else {
                    throw new JsonException("Unexpected display behavior: " + jsonValue.mo18749A().mo18812k(f24683U0));
                }
            }
            if (jsonValue.mo18749A().mo18805e(f24669G0)) {
                j.mo18209y(jsonValue.mo18749A().mo18801A(f24669G0).mo18757c(true));
            }
            if (jsonValue.mo18749A().mo18805e(f24670H0)) {
                C9323b j3 = jsonValue.mo18749A().mo18801A(f24670H0).mo18767j();
                if (j3 == null) {
                    throw new JsonException("Rendered locale must be a JSON object: " + jsonValue.mo18749A().mo18801A(f24670H0));
                } else if (j3.mo18805e("language") || j3.mo18805e("country")) {
                    JsonValue A2 = j3.mo18801A("language");
                    if (A2.mo18780w() || A2.mo18783y()) {
                        JsonValue A3 = j3.mo18801A("country");
                        if (A3.mo18780w() || A3.mo18783y()) {
                            j.mo18208x(j3.mo18813r());
                        } else {
                            throw new JsonException("Country must be a string: " + A3);
                        }
                    } else {
                        throw new JsonException("Language must be a string: " + A2);
                    }
                } else {
                    throw new JsonException("Rendered locale must contain one of \"language\" or \"country\" fields :" + j3);
                }
            }
            try {
                return j.mo18196l();
            } catch (IllegalArgumentException e) {
                throw new JsonException("Invalid InAppMessage json.", e);
            }
        } else {
            throw new JsonException("Invalid message name. Must be less than or equal to 1024 characters.");
        }
    }

    @C0359n0
    /* renamed from: v */
    public static C9122b m34089v() {
        return new C9122b((C9121a) null);
    }

    @C0359n0
    /* renamed from: w */
    public static C9122b m34090w(@C0359n0 InAppMessage inAppMessage) {
        return new C9122b(inAppMessage);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InAppMessage inAppMessage = (InAppMessage) obj;
        if (!this.f24695f.equals(inAppMessage.f24695f) || this.f24696g != inAppMessage.f24696g || !this.f24690a.equals(inAppMessage.f24690a) || !this.f24691b.equals(inAppMessage.f24691b)) {
            return false;
        }
        String str = this.f24692c;
        if (str == null ? inAppMessage.f24692c != null : !str.equals(inAppMessage.f24692c)) {
            return false;
        }
        if (!this.f24693d.equals(inAppMessage.f24693d) || !this.f24694e.equals(inAppMessage.f24694e)) {
            return false;
        }
        Map<String, JsonValue> map = this.f24698w;
        if (map == null ? inAppMessage.f24698w == null : map.equals(inAppMessage.f24698w)) {
            return this.f24697v.equals(inAppMessage.f24697v);
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f24690a.hashCode() * 31) + this.f24691b.hashCode()) * 31;
        String str = this.f24692c;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.f24693d.hashCode()) * 31) + this.f24694e.hashCode()) * 31;
        Map<String, JsonValue> map = this.f24698w;
        if (map != null) {
            i2 = map.hashCode();
        }
        return ((((((hashCode2 + i2) * 31) + this.f24695f.hashCode()) * 31) + (this.f24696g ? 1 : 0)) * 31) + this.f24697v.hashCode();
    }

    @C0359n0
    /* renamed from: l */
    public Map<String, JsonValue> mo18180l() {
        return this.f24694e;
    }

    @C0359n0
    /* renamed from: m */
    public String mo18181m() {
        return this.f24695f;
    }

    @C0363p0
    /* renamed from: n */
    public <T extends C9166d> T mo18182n() {
        T t = this.f24693d;
        if (t == null) {
            return null;
        }
        try {
            return (C9166d) t;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @C0359n0
    /* renamed from: o */
    public C9323b mo18183o() {
        return this.f24691b;
    }

    @C0363p0
    /* renamed from: p */
    public String mo18184p() {
        return this.f24692c;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j("name", this.f24692c).mo18826j("extra", this.f24691b).mo18826j("display", this.f24693d).mo18826j(f24688y, this.f24690a).mo18826j("actions", this.f24694e).mo18826j("source", this.f24697v).mo18826j(f24668F0, this.f24695f).mo18826j(f24669G0, Boolean.valueOf(this.f24696g)).mo18826j(f24670H0, this.f24698w).mo18817a().mo17264q();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public Map<String, JsonValue> mo18185r() {
        return this.f24698w;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s */
    public String mo18186s() {
        return this.f24697v;
    }

    @C0359n0
    /* renamed from: t */
    public String mo18187t() {
        return this.f24690a;
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    /* renamed from: u */
    public boolean mo18189u() {
        return this.f24696g;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeString(mo17264q().toString());
    }

    public InAppMessage(@C0359n0 C9122b bVar) {
        this.f24690a = bVar.f24699a;
        this.f24693d = bVar.f24702d;
        this.f24692c = bVar.f24701c;
        this.f24691b = bVar.f24700b == null ? C9323b.f25440b : bVar.f24700b;
        this.f24694e = bVar.f24703e;
        this.f24697v = bVar.f24704f;
        this.f24695f = bVar.f24705g;
        this.f24696g = bVar.f24706h;
        this.f24698w = bVar.f24707i;
    }
}
