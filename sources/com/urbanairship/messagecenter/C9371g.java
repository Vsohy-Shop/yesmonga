package com.urbanairship.messagecenter;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9668o;
import com.urbanairship.util.C9669o0;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.urbanairship.messagecenter.g */
public class C9371g implements Comparable<C9371g> {

    /* renamed from: E0 */
    public static final String f25616E0 = "message_url";

    /* renamed from: F0 */
    public static final String f25617F0 = "message_body_url";

    /* renamed from: G0 */
    public static final String f25618G0 = "message_read_url";

    /* renamed from: H0 */
    public static final String f25619H0 = "message_sent";

    /* renamed from: I0 */
    public static final String f25620I0 = "message_reporting";

    /* renamed from: J0 */
    public static final String f25621J0 = "extra";

    /* renamed from: K0 */
    public static final String f25622K0 = "title";

    /* renamed from: L0 */
    public static final String f25623L0 = "unread";

    /* renamed from: Y */
    public static final String f25624Y = "message_expiry";

    /* renamed from: Z */
    public static final String f25625Z = "message_id";

    /* renamed from: X */
    public boolean f25626X;

    /* renamed from: a */
    public boolean f25627a;

    /* renamed from: b */
    public Map<String, String> f25628b;

    /* renamed from: c */
    public long f25629c;

    /* renamed from: d */
    public Long f25630d;

    /* renamed from: e */
    public String f25631e;

    /* renamed from: f */
    public String f25632f;

    /* renamed from: g */
    public String f25633g;

    /* renamed from: v */
    public String f25634v;

    /* renamed from: w */
    public JsonValue f25635w;

    /* renamed from: x */
    public String f25636x;

    /* renamed from: y */
    public JsonValue f25637y;

    /* renamed from: z */
    public boolean f25638z = false;

    @C0363p0
    /* renamed from: g */
    public static C9371g m35231g(@C0359n0 JsonValue jsonValue, boolean z, boolean z2) {
        String l;
        String l2;
        String l3;
        String l4;
        C9323b j = jsonValue.mo18767j();
        if (j == null || (l = j.mo18801A("message_id").mo18769l()) == null || (l2 = j.mo18801A("message_url").mo18769l()) == null || (l3 = j.mo18801A("message_body_url").mo18769l()) == null || (l4 = j.mo18801A("message_read_url").mo18769l()) == null) {
            return null;
        }
        JsonValue k = j.mo18812k(f25620I0);
        C9371g gVar = new C9371g();
        gVar.f25631e = l;
        gVar.f25632f = l2;
        gVar.f25633g = l3;
        gVar.f25634v = l4;
        gVar.f25635w = k;
        gVar.f25636x = j.mo18801A("title").mo18750B();
        gVar.f25627a = j.mo18801A("unread").mo18757c(true);
        gVar.f25637y = jsonValue;
        String l5 = j.mo18801A(f25619H0).mo18769l();
        if (C9669o0.m36224e(l5)) {
            gVar.f25629c = System.currentTimeMillis();
        } else {
            gVar.f25629c = C9668o.m36219c(l5, System.currentTimeMillis());
        }
        String l6 = j.mo18801A(f25624Y).mo18769l();
        if (!C9669o0.m36224e(l6)) {
            gVar.f25630d = Long.valueOf(C9668o.m36219c(l6, Long.MAX_VALUE));
        }
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, JsonValue>> it = j.mo18801A("extra").mo18749A().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((JsonValue) next.getValue()).mo18783y()) {
                hashMap.put((String) next.getKey(), ((JsonValue) next.getValue()).mo18769l());
            } else {
                hashMap.put((String) next.getKey(), ((JsonValue) next.getValue()).toString());
            }
        }
        gVar.f25628b = hashMap;
        gVar.f25638z = z2;
        gVar.f25626X = z;
        return gVar;
    }

    @C0363p0
    /* renamed from: M */
    public String mo18975M() {
        JsonValue A = mo18984f0().mo18749A().mo18801A("icons");
        if (A.mo18778u()) {
            return A.mo18749A().mo18801A("list_icon").mo18769l();
        }
        return null;
    }

    @C0359n0
    /* renamed from: Q */
    public String mo18976Q() {
        return this.f25633g;
    }

    @C0359n0
    /* renamed from: W */
    public String mo18977W() {
        return this.f25631e;
    }

    @C0359n0
    /* renamed from: X */
    public String mo18978X() {
        return this.f25634v;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: Z */
    public JsonValue mo18979Z() {
        return this.f25635w;
    }

    /* renamed from: b */
    public int compareTo(@C0359n0 C9371g gVar) {
        return mo18977W().compareTo(gVar.mo18977W());
    }

    @C0359n0
    /* renamed from: e0 */
    public String mo18982e0() {
        return this.f25632f;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof C9371g)) {
            return false;
        }
        C9371g gVar = (C9371g) obj;
        if (this == gVar) {
            return true;
        }
        String str = this.f25631e;
        if (str == null) {
            if (gVar.f25631e != null) {
                return false;
            }
        } else if (!str.equals(gVar.f25631e)) {
            return false;
        }
        String str2 = this.f25633g;
        if (str2 == null) {
            if (gVar.f25633g != null) {
                return false;
            }
        } else if (!str2.equals(gVar.f25633g)) {
            return false;
        }
        String str3 = this.f25634v;
        if (str3 == null) {
            if (gVar.f25634v != null) {
                return false;
            }
        } else if (!str3.equals(gVar.f25634v)) {
            return false;
        }
        String str4 = this.f25632f;
        if (str4 == null) {
            if (gVar.f25632f != null) {
                return false;
            }
        } else if (!str4.equals(gVar.f25632f)) {
            return false;
        }
        Map<String, String> map = this.f25628b;
        if (map == null) {
            if (gVar.f25628b != null) {
                return false;
            }
        } else if (!map.equals(gVar.f25628b)) {
            return false;
        }
        if (this.f25626X == gVar.f25626X && this.f25627a == gVar.f25627a && this.f25638z == gVar.f25638z && this.f25629c == gVar.f25629c) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: f0 */
    public JsonValue mo18984f0() {
        return this.f25637y;
    }

    @C0359n0
    /* renamed from: h0 */
    public Date mo18985h0() {
        return new Date(this.f25629c);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f25631e;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (629 + i) * 37;
        String str2 = this.f25633g;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 + i2) * 37;
        String str3 = this.f25634v;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 + i3) * 37;
        String str4 = this.f25632f;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i9 = (i8 + i4) * 37;
        Map<String, String> map = this.f25628b;
        if (map != null) {
            i5 = map.hashCode();
        }
        return ((((((((i9 + i5) * 37) + (this.f25626X ^ true ? 1 : 0)) * 37) + (this.f25627a ^ true ? 1 : 0)) * 37) + (this.f25638z ^ true ? 1 : 0)) * 37) + Long.valueOf(this.f25629c).hashCode();
    }

    /* renamed from: i0 */
    public long mo18987i0() {
        return this.f25629c;
    }

    @C0359n0
    /* renamed from: j0 */
    public String mo18988j0() {
        return this.f25636x;
    }

    /* renamed from: m0 */
    public boolean mo18989m0() {
        return this.f25638z;
    }

    /* renamed from: n0 */
    public boolean mo18990n0() {
        return this.f25630d != null && System.currentTimeMillis() >= this.f25630d.longValue();
    }

    /* renamed from: o0 */
    public boolean mo18991o0() {
        return !this.f25626X;
    }

    /* renamed from: p0 */
    public void mo18992p0() {
        if (this.f25626X) {
            this.f25626X = false;
            HashSet hashSet = new HashSet();
            hashSet.add(this.f25631e);
            C9372h.m35254H().mo18999B().mo18942y(hashSet);
        }
    }

    /* renamed from: q */
    public void mo18993q() {
        if (!this.f25638z) {
            this.f25638z = true;
            HashSet hashSet = new HashSet();
            hashSet.add(this.f25631e);
            C9372h.m35254H().mo18999B().mo18922e(hashSet);
        }
    }

    @C0363p0
    /* renamed from: r */
    public Date mo18994r() {
        if (this.f25630d != null) {
            return new Date(this.f25630d.longValue());
        }
        return null;
    }

    /* renamed from: t0 */
    public void mo18995t0() {
        if (!this.f25626X) {
            this.f25626X = true;
            HashSet hashSet = new HashSet();
            hashSet.add(this.f25631e);
            C9372h.m35254H().mo18999B().mo18943z(hashSet);
        }
    }

    @C0363p0
    /* renamed from: w */
    public Long mo18996w() {
        return this.f25630d;
    }

    @C0359n0
    /* renamed from: y */
    public Bundle mo18997y() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.f25628b.entrySet()) {
            bundle.putString((String) next.getKey(), (String) next.getValue());
        }
        return bundle;
    }

    @C0359n0
    /* renamed from: z */
    public Map<String, String> mo18998z() {
        return this.f25628b;
    }
}
