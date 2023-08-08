package com.urbanairship.iam.banner;

import android.graphics.Color;
import androidx.annotation.C0337f0;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.annotation.C0386z0;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.C9166d;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9658k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.iam.banner.c */
public class C9156c implements C9166d {
    @C0359n0

    /* renamed from: E0 */
    public static final String f24816E0 = "media_right";

    /* renamed from: F0 */
    public static final long f24817F0 = 15000;

    /* renamed from: G0 */
    public static final int f24818G0 = 2;

    /* renamed from: H0 */
    public static final String f24819H0 = "actions";
    @C0359n0

    /* renamed from: X */
    public static final String f24820X = "top";
    @C0359n0

    /* renamed from: Y */
    public static final String f24821Y = "bottom";
    @C0359n0

    /* renamed from: Z */
    public static final String f24822Z = "media_left";

    /* renamed from: a */
    public final C9168d0 f24823a;

    /* renamed from: b */
    public final C9168d0 f24824b;

    /* renamed from: c */
    public final C9127a0 f24825c;

    /* renamed from: d */
    public final List<C9139b> f24826d;

    /* renamed from: e */
    public final String f24827e;

    /* renamed from: f */
    public final String f24828f;

    /* renamed from: g */
    public final String f24829g;

    /* renamed from: v */
    public final long f24830v;

    /* renamed from: w */
    public final int f24831w;

    /* renamed from: x */
    public final int f24832x;

    /* renamed from: y */
    public final float f24833y;

    /* renamed from: z */
    public final Map<String, JsonValue> f24834z;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.banner.c$c */
    public @interface C9159c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.banner.c$d */
    public @interface C9160d {
    }

    @C0359n0
    /* renamed from: A */
    public static C9158b m34285A() {
        return new C9158b();
    }

    @C0359n0
    /* renamed from: B */
    public static C9158b m34286B(@C0359n0 C9156c cVar) {
        return new C9158b();
    }

    @C0359n0
    /* renamed from: m */
    public static C9156c m34299m(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        C9158b A2 = m34285A();
        if (A.mo18805e("heading")) {
            A2.mo18366x(C9168d0.m34366h(A.mo18801A("heading")));
        }
        if (A.mo18805e("body")) {
            A2.mo18360r(C9168d0.m34366h(A.mo18801A("body")));
        }
        if (A.mo18805e("media")) {
            A2.mo18367y(C9127a0.m34132d(A.mo18801A("media")));
        }
        if (A.mo18805e("buttons")) {
            C9322a h = A.mo18801A("buttons").mo18764h();
            if (h != null) {
                A2.mo18363u(C9139b.m34196i(h));
            } else {
                throw new JsonException("Buttons must be an array of button objects.");
            }
        }
        if (A.mo18805e(C9166d.f24871l0)) {
            String B = A.mo18801A(C9166d.f24871l0).mo18750B();
            B.hashCode();
            char c = 65535;
            switch (B.hashCode()) {
                case -1897640665:
                    if (B.equals(C9166d.f24865f0)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1154529463:
                    if (B.equals(C9166d.f24864e0)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1302823715:
                    if (B.equals(C9166d.f24863d0)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    A2.mo18362t(C9166d.f24865f0);
                    break;
                case 1:
                    A2.mo18362t(C9166d.f24864e0);
                    break;
                case 2:
                    A2.mo18362t(C9166d.f24863d0);
                    break;
                default:
                    throw new JsonException("Unexpected button layout: " + A.mo18801A(C9166d.f24871l0));
            }
        }
        if (A.mo18805e(C9166d.f24869j0)) {
            String B2 = A.mo18801A(C9166d.f24869j0).mo18750B();
            B2.hashCode();
            if (B2.equals(f24821Y)) {
                A2.mo18368z(f24821Y);
            } else if (B2.equals(f24820X)) {
                A2.mo18368z(f24820X);
            } else {
                throw new JsonException("Unexpected placement: " + A.mo18801A(C9166d.f24869j0));
            }
        }
        if (A.mo18805e(C9166d.f24876q0)) {
            String B3 = A.mo18801A(C9166d.f24876q0).mo18750B();
            B3.hashCode();
            if (B3.equals(f24816E0)) {
                A2.mo18354A(f24816E0);
            } else if (B3.equals(f24822Z)) {
                A2.mo18354A(f24822Z);
            } else {
                throw new JsonException("Unexpected template: " + A.mo18801A(C9166d.f24876q0));
            }
        }
        if (A.mo18805e("duration")) {
            long i = A.mo18801A("duration").mo18766i(0);
            if (i != 0) {
                A2.mo18365w(i, TimeUnit.SECONDS);
            } else {
                throw new JsonException("Invalid duration: " + A.mo18801A("duration"));
            }
        }
        if (A.mo18805e("background_color")) {
            try {
                A2.mo18359q(Color.parseColor(A.mo18801A("background_color").mo18750B()));
            } catch (IllegalArgumentException e) {
                throw new JsonException("Invalid background color: " + A.mo18801A("background_color"), e);
            }
        }
        if (A.mo18805e(C9166d.f24875p0)) {
            try {
                A2.mo18364v(Color.parseColor(A.mo18801A(C9166d.f24875p0).mo18750B()));
            } catch (IllegalArgumentException e2) {
                throw new JsonException("Invalid dismiss button color: " + A.mo18801A(C9166d.f24875p0), e2);
            }
        }
        if (A.mo18805e("border_radius")) {
            if (A.mo18801A("border_radius").mo18782x()) {
                A2.mo18361s(A.mo18801A("border_radius").mo18760e(0.0f));
            } else {
                throw new JsonException("Border radius must be a number " + A.mo18801A("border_radius"));
            }
        }
        if (A.mo18805e("actions")) {
            C9323b j = A.mo18801A("actions").mo18767j();
            if (j != null) {
                A2.mo18358p(j.mo18813r());
            } else {
                throw new JsonException("Actions must be a JSON object: " + A.mo18801A("actions"));
            }
        }
        try {
            return A2.mo18357o();
        } catch (IllegalArgumentException e3) {
            throw new JsonException("Invalid banner JSON: " + A, e3);
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9156c cVar = (C9156c) obj;
        if (this.f24830v != cVar.f24830v || this.f24831w != cVar.f24831w || this.f24832x != cVar.f24832x || Float.compare(cVar.f24833y, this.f24833y) != 0) {
            return false;
        }
        C9168d0 d0Var = this.f24823a;
        if (d0Var == null ? cVar.f24823a != null : !d0Var.equals(cVar.f24823a)) {
            return false;
        }
        C9168d0 d0Var2 = this.f24824b;
        if (d0Var2 == null ? cVar.f24824b != null : !d0Var2.equals(cVar.f24824b)) {
            return false;
        }
        C9127a0 a0Var = this.f24825c;
        if (a0Var == null ? cVar.f24825c != null : !a0Var.equals(cVar.f24825c)) {
            return false;
        }
        List<C9139b> list = this.f24826d;
        if (list == null ? cVar.f24826d != null : !list.equals(cVar.f24826d)) {
            return false;
        }
        String str = this.f24827e;
        if (str == null ? cVar.f24827e != null : !str.equals(cVar.f24827e)) {
            return false;
        }
        String str2 = this.f24828f;
        if (str2 == null ? cVar.f24828f != null : !str2.equals(cVar.f24828f)) {
            return false;
        }
        String str3 = this.f24829g;
        if (str3 == null ? cVar.f24829g != null : !str3.equals(cVar.f24829g)) {
            return false;
        }
        Map<String, JsonValue> map = this.f24834z;
        Map<String, JsonValue> map2 = cVar.f24834z;
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
        int i6;
        int i7;
        int i8;
        C9168d0 d0Var = this.f24823a;
        int i9 = 0;
        if (d0Var != null) {
            i = d0Var.hashCode();
        } else {
            i = 0;
        }
        int i10 = i * 31;
        C9168d0 d0Var2 = this.f24824b;
        if (d0Var2 != null) {
            i2 = d0Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        C9127a0 a0Var = this.f24825c;
        if (a0Var != null) {
            i3 = a0Var.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        List<C9139b> list = this.f24826d;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str = this.f24827e;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        String str2 = this.f24828f;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 31;
        String str3 = this.f24829g;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        long j = this.f24830v;
        int i16 = (((((((i15 + i7) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f24831w) * 31) + this.f24832x) * 31;
        float f = this.f24833y;
        if (f != 0.0f) {
            i8 = Float.floatToIntBits(f);
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 31;
        Map<String, JsonValue> map = this.f24834z;
        if (map != null) {
            i9 = map.hashCode();
        }
        return i17 + i9;
    }

    @C0359n0
    /* renamed from: n */
    public Map<String, JsonValue> mo18341n() {
        return this.f24834z;
    }

    @C0354l
    /* renamed from: o */
    public int mo18342o() {
        return this.f24831w;
    }

    @C0363p0
    /* renamed from: p */
    public C9168d0 mo18343p() {
        return this.f24824b;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18822f("heading", this.f24823a).mo18822f("body", this.f24824b).mo18822f("media", this.f24825c).mo18822f("buttons", JsonValue.m34975U(this.f24826d)).mo18823g(C9166d.f24871l0, this.f24827e).mo18823g(C9166d.f24869j0, this.f24828f).mo18823g(C9166d.f24876q0, this.f24829g).mo18821e("duration", TimeUnit.MILLISECONDS.toSeconds(this.f24830v)).mo18823g("background_color", C9658k.m36180a(this.f24831w)).mo18823g(C9166d.f24875p0, C9658k.m36180a(this.f24832x)).mo18819c("border_radius", (double) this.f24833y).mo18822f("actions", JsonValue.m34975U(this.f24834z)).mo18817a().mo17264q();
    }

    /* renamed from: r */
    public float mo18344r() {
        return this.f24833y;
    }

    @C0359n0
    /* renamed from: s */
    public String mo18345s() {
        return this.f24827e;
    }

    @C0359n0
    /* renamed from: t */
    public List<C9139b> mo18346t() {
        return this.f24826d;
    }

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }

    @C0354l
    /* renamed from: u */
    public int mo18348u() {
        return this.f24832x;
    }

    /* renamed from: v */
    public long mo18349v() {
        return this.f24830v;
    }

    @C0363p0
    /* renamed from: w */
    public C9168d0 mo18350w() {
        return this.f24823a;
    }

    @C0363p0
    /* renamed from: x */
    public C9127a0 mo18351x() {
        return this.f24825c;
    }

    @C0359n0
    /* renamed from: y */
    public String mo18352y() {
        return this.f24828f;
    }

    @C0359n0
    /* renamed from: z */
    public String mo18353z() {
        return this.f24829g;
    }

    /* renamed from: com.urbanairship.iam.banner.c$b */
    public static class C9158b {

        /* renamed from: a */
        public C9168d0 f24835a;

        /* renamed from: b */
        public C9168d0 f24836b;

        /* renamed from: c */
        public C9127a0 f24837c;

        /* renamed from: d */
        public List<C9139b> f24838d;

        /* renamed from: e */
        public String f24839e;

        /* renamed from: f */
        public String f24840f;

        /* renamed from: g */
        public String f24841g;

        /* renamed from: h */
        public long f24842h;

        /* renamed from: i */
        public int f24843i;

        /* renamed from: j */
        public int f24844j;

        /* renamed from: k */
        public float f24845k;

        /* renamed from: l */
        public final Map<String, JsonValue> f24846l;

        @C0359n0
        /* renamed from: A */
        public C9158b mo18354A(@C0359n0 String str) {
            this.f24841g = str;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9158b mo18355m(@C0359n0 String str, @C0359n0 JsonValue jsonValue) {
            this.f24846l.put(str, jsonValue);
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9158b mo18356n(@C0359n0 C9139b bVar) {
            this.f24838d.add(bVar);
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9156c mo18357o() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = true;
            if (this.f24845k >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "Border radius must be >= 0");
            if (this.f24835a == null && this.f24836b == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C9654i.m36165a(z2, "Either the body or heading must be defined.");
            if (this.f24838d.size() <= 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            C9654i.m36165a(z3, "Banner allows a max of 2 buttons");
            C9127a0 a0Var = this.f24837c;
            if (a0Var != null && !a0Var.mo18214f().equals(C9127a0.f24709d)) {
                z4 = false;
            }
            C9654i.m36165a(z4, "Banner only supports image media");
            return new C9156c(this);
        }

        @C0359n0
        /* renamed from: p */
        public C9158b mo18358p(@C0363p0 Map<String, JsonValue> map) {
            this.f24846l.clear();
            if (map != null) {
                this.f24846l.putAll(map);
            }
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C9158b mo18359q(@C0354l int i) {
            this.f24843i = i;
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C9158b mo18360r(@C0363p0 C9168d0 d0Var) {
            this.f24836b = d0Var;
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C9158b mo18361s(@C0379x(from = 0.0d) float f) {
            this.f24845k = f;
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C9158b mo18362t(@C0359n0 String str) {
            this.f24839e = str;
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C9158b mo18363u(@C0363p0 @C0386z0(max = 2) List<C9139b> list) {
            this.f24838d.clear();
            if (list != null) {
                this.f24838d.addAll(list);
            }
            return this;
        }

        @C0359n0
        /* renamed from: v */
        public C9158b mo18364v(@C0354l int i) {
            this.f24844j = i;
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C9158b mo18365w(@C0337f0(from = 0) long j, @C0359n0 TimeUnit timeUnit) {
            this.f24842h = timeUnit.toMillis(j);
            return this;
        }

        @C0359n0
        /* renamed from: x */
        public C9158b mo18366x(@C0363p0 C9168d0 d0Var) {
            this.f24835a = d0Var;
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C9158b mo18367y(@C0363p0 C9127a0 a0Var) {
            this.f24837c = a0Var;
            return this;
        }

        @C0359n0
        /* renamed from: z */
        public C9158b mo18368z(@C0359n0 String str) {
            this.f24840f = str;
            return this;
        }

        public C9158b() {
            this.f24838d = new ArrayList();
            this.f24839e = C9166d.f24863d0;
            this.f24840f = C9156c.f24821Y;
            this.f24841g = C9156c.f24822Z;
            this.f24842h = 15000;
            this.f24843i = -1;
            this.f24844j = -16777216;
            this.f24845k = 0.0f;
            this.f24846l = new HashMap();
        }

        public C9158b(@C0359n0 C9156c cVar) {
            this.f24838d = new ArrayList();
            this.f24839e = C9166d.f24863d0;
            this.f24840f = C9156c.f24821Y;
            this.f24841g = C9156c.f24822Z;
            this.f24842h = 15000;
            this.f24843i = -1;
            this.f24844j = -16777216;
            this.f24845k = 0.0f;
            HashMap hashMap = new HashMap();
            this.f24846l = hashMap;
            this.f24835a = cVar.f24823a;
            this.f24836b = cVar.f24824b;
            this.f24837c = cVar.f24825c;
            this.f24839e = cVar.f24827e;
            this.f24838d = cVar.f24826d;
            this.f24840f = cVar.f24828f;
            this.f24841g = cVar.f24829g;
            this.f24842h = cVar.f24830v;
            this.f24843i = cVar.f24831w;
            this.f24844j = cVar.f24832x;
            this.f24845k = cVar.f24833y;
            hashMap.putAll(cVar.f24834z);
        }
    }

    public C9156c(@C0359n0 C9158b bVar) {
        this.f24823a = bVar.f24835a;
        this.f24824b = bVar.f24836b;
        this.f24825c = bVar.f24837c;
        this.f24827e = bVar.f24839e;
        this.f24826d = bVar.f24838d;
        this.f24828f = bVar.f24840f;
        this.f24829g = bVar.f24841g;
        this.f24830v = bVar.f24842h;
        this.f24831w = bVar.f24843i;
        this.f24832x = bVar.f24844j;
        this.f24833y = bVar.f24845k;
        this.f24834z = bVar.f24846l;
    }
}
