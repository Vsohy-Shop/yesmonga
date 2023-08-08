package com.urbanairship.iam;

import android.graphics.Color;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.annotation.C0386z0;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9658k;
import com.urbanairship.util.C9669o0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.urbanairship.iam.b */
public class C9139b implements C9333e {
    @C0359n0

    /* renamed from: E0 */
    public static final String f24749E0 = "cancel";
    @C0359n0

    /* renamed from: F0 */
    public static final String f24750F0 = "dismiss";

    /* renamed from: X */
    public static final String f24751X = "background_color";

    /* renamed from: Y */
    public static final String f24752Y = "border_color";

    /* renamed from: Z */
    public static final String f24753Z = "actions";

    /* renamed from: v */
    public static final int f24754v = 100;

    /* renamed from: w */
    public static final String f24755w = "label";

    /* renamed from: x */
    public static final String f24756x = "id";

    /* renamed from: y */
    public static final String f24757y = "behavior";

    /* renamed from: z */
    public static final String f24758z = "border_radius";

    /* renamed from: a */
    public final C9168d0 f24759a;

    /* renamed from: b */
    public final String f24760b;

    /* renamed from: c */
    public final String f24761c;

    /* renamed from: d */
    public final Float f24762d;

    /* renamed from: e */
    public final Integer f24763e;

    /* renamed from: f */
    public final Integer f24764f;

    /* renamed from: g */
    public final Map<String, JsonValue> f24765g;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.b$b */
    public @interface C9141b {
    }

    @C0359n0
    /* renamed from: h */
    public static C9139b m34195h(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        C9142c r = m34197r();
        if (A.mo18805e("label")) {
            r.mo18275q(C9168d0.m34366h(A.mo18801A("label")));
        }
        if (A.mo18801A("id").mo18783y()) {
            r.mo18274p(A.mo18801A("id").mo18750B());
        }
        if (A.mo18805e(f24757y)) {
            String B = A.mo18801A(f24757y).mo18750B();
            B.hashCode();
            if (B.equals("cancel")) {
                r.mo18271m("cancel");
            } else if (B.equals("dismiss")) {
                r.mo18271m("dismiss");
            } else {
                throw new JsonException("Unexpected behavior: " + A.mo18801A(f24757y));
            }
        }
        if (A.mo18805e("border_radius")) {
            if (A.mo18801A("border_radius").mo18782x()) {
                r.mo18273o(A.mo18801A("border_radius").mo18760e(0.0f));
            } else {
                throw new JsonException("Border radius must be a number: " + A.mo18801A("border_radius"));
            }
        }
        if (A.mo18805e("background_color")) {
            try {
                r.mo18270l(Color.parseColor(A.mo18801A("background_color").mo18750B()));
            } catch (IllegalArgumentException e) {
                throw new JsonException("Invalid background button color: " + A.mo18801A("background_color"), e);
            }
        }
        if (A.mo18805e(f24752Y)) {
            try {
                r.mo18272n(Color.parseColor(A.mo18801A(f24752Y).mo18750B()));
            } catch (IllegalArgumentException e2) {
                throw new JsonException("Invalid border color: " + A.mo18801A(f24752Y), e2);
            }
        }
        if (A.mo18805e("actions")) {
            C9323b j = A.mo18801A("actions").mo18767j();
            if (j != null) {
                r.mo18269k(j.mo18813r());
            } else {
                throw new JsonException("Actions must be a JSON object: " + A.mo18801A("actions"));
            }
        }
        try {
            return r.mo18267i();
        } catch (IllegalArgumentException e3) {
            throw new JsonException("Invalid button JSON: " + A, e3);
        }
    }

    @C0359n0
    /* renamed from: i */
    public static List<C9139b> m34196i(@C0359n0 C9322a aVar) throws JsonException {
        if (aVar.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m34195h(it.next()));
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: r */
    public static C9142c m34197r() {
        return new C9142c();
    }

    @C0359n0
    /* renamed from: s */
    public static C9142c m34198s(@C0359n0 C9139b bVar) {
        return new C9142c();
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9139b bVar = (C9139b) obj;
        C9168d0 d0Var = this.f24759a;
        if (d0Var == null ? bVar.f24759a != null : !d0Var.equals(bVar.f24759a)) {
            return false;
        }
        String str = this.f24760b;
        if (str == null ? bVar.f24760b != null : !str.equals(bVar.f24760b)) {
            return false;
        }
        String str2 = this.f24761c;
        if (str2 == null ? bVar.f24761c != null : !str2.equals(bVar.f24761c)) {
            return false;
        }
        if (!this.f24762d.equals(bVar.f24762d)) {
            return false;
        }
        Integer num = this.f24763e;
        if (num == null ? bVar.f24763e != null : !num.equals(bVar.f24763e)) {
            return false;
        }
        Integer num2 = this.f24764f;
        if (num2 == null ? bVar.f24764f != null : !num2.equals(bVar.f24764f)) {
            return false;
        }
        Map<String, JsonValue> map = this.f24765g;
        Map<String, JsonValue> map2 = bVar.f24765g;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C9168d0 d0Var = this.f24759a;
        int i6 = 0;
        if (d0Var != null) {
            i = d0Var.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str = this.f24760b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str2 = this.f24761c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode = (((i8 + i3) * 31) + this.f24762d.hashCode()) * 31;
        Integer num = this.f24763e;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (hashCode + i4) * 31;
        Integer num2 = this.f24764f;
        if (num2 != null) {
            i5 = num2.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        Map<String, JsonValue> map = this.f24765g;
        if (map != null) {
            i6 = map.hashCode();
        }
        return i10 + i6;
    }

    @C0359n0
    /* renamed from: j */
    public Map<String, JsonValue> mo18258j() {
        return this.f24765g;
    }

    @C0363p0
    @C0354l
    /* renamed from: k */
    public Integer mo18259k() {
        return this.f24763e;
    }

    @C0359n0
    /* renamed from: l */
    public String mo18260l() {
        return this.f24761c;
    }

    @C0363p0
    @C0354l
    /* renamed from: m */
    public Integer mo18261m() {
        return this.f24764f;
    }

    @C0363p0
    /* renamed from: n */
    public Float mo18262n() {
        return this.f24762d;
    }

    @C0359n0
    /* renamed from: o */
    public String mo18263o() {
        return this.f24760b;
    }

    @C0359n0
    /* renamed from: p */
    public C9168d0 mo18264p() {
        return this.f24759a;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        String str;
        C9323b.C9325b j = C9323b.m35017y().mo18822f("label", this.f24759a).mo18823g("id", this.f24760b).mo18823g(f24757y, this.f24761c).mo18826j("border_radius", this.f24762d);
        Integer num = this.f24763e;
        String str2 = null;
        if (num == null) {
            str = null;
        } else {
            str = C9658k.m36180a(num.intValue());
        }
        C9323b.C9325b j2 = j.mo18826j("background_color", str);
        Integer num2 = this.f24764f;
        if (num2 != null) {
            str2 = C9658k.m36180a(num2.intValue());
        }
        return j2.mo18826j(f24752Y, str2).mo18822f("actions", JsonValue.m34975U(this.f24765g)).mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    /* renamed from: com.urbanairship.iam.b$c */
    public static class C9142c {

        /* renamed from: a */
        public C9168d0 f24766a;

        /* renamed from: b */
        public String f24767b;

        /* renamed from: c */
        public String f24768c;

        /* renamed from: d */
        public float f24769d;

        /* renamed from: e */
        public Integer f24770e;

        /* renamed from: f */
        public Integer f24771f;

        /* renamed from: g */
        public final Map<String, JsonValue> f24772g;

        @C0359n0
        /* renamed from: h */
        public C9142c mo18266h(@C0359n0 String str, @C0359n0 C9333e eVar) {
            this.f24772g.put(str, eVar.mo17264q());
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9139b mo18267i() {
            return mo18268j(Boolean.TRUE);
        }

        @C0359n0
        /* renamed from: j */
        public C9139b mo18268j(Boolean bool) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (this.f24769d >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "Border radius must be >= 0");
            C9654i.m36165a(!C9669o0.m36224e(this.f24767b), "Missing ID.");
            if (bool.booleanValue()) {
                if (this.f24767b.length() <= 100) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9654i.m36165a(z2, "Id exceeds max ID length: 100");
            }
            if (this.f24766a != null) {
                z3 = true;
            }
            C9654i.m36165a(z3, "Missing label.");
            return new C9139b(this);
        }

        @C0359n0
        /* renamed from: k */
        public C9142c mo18269k(@C0363p0 Map<String, JsonValue> map) {
            this.f24772g.clear();
            if (map != null) {
                this.f24772g.putAll(map);
            }
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C9142c mo18270l(@C0354l int i) {
            this.f24770e = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9142c mo18271m(@C0359n0 String str) {
            this.f24768c = str;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9142c mo18272n(@C0354l int i) {
            this.f24771f = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9142c mo18273o(@C0379x(from = 0.0d) float f) {
            this.f24769d = f;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9142c mo18274p(@C0359n0 @C0386z0(max = 100, min = 1) String str) {
            this.f24767b = str;
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C9142c mo18275q(@C0359n0 C9168d0 d0Var) {
            this.f24766a = d0Var;
            return this;
        }

        public C9142c() {
            this.f24768c = "dismiss";
            this.f24769d = 0.0f;
            this.f24772g = new HashMap();
        }

        public C9142c(@C0359n0 C9139b bVar) {
            this.f24768c = "dismiss";
            this.f24769d = 0.0f;
            HashMap hashMap = new HashMap();
            this.f24772g = hashMap;
            this.f24766a = bVar.f24759a;
            this.f24767b = bVar.f24760b;
            this.f24768c = bVar.f24761c;
            this.f24769d = bVar.f24762d.floatValue();
            this.f24770e = bVar.f24763e;
            this.f24771f = bVar.f24764f;
            hashMap.putAll(bVar.f24765g);
        }
    }

    public C9139b(@C0359n0 C9142c cVar) {
        this.f24759a = cVar.f24766a;
        this.f24760b = cVar.f24767b;
        this.f24761c = cVar.f24768c;
        this.f24762d = Float.valueOf(cVar.f24769d);
        this.f24763e = cVar.f24770e;
        this.f24764f = cVar.f24771f;
        this.f24765g = cVar.f24772g;
    }
}
