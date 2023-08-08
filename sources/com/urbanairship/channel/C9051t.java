package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9668o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.channel.t */
public class C9051t implements C9333e {

    /* renamed from: d */
    public static final String f24372d = "action";

    /* renamed from: e */
    public static final String f24373e = "list_id";

    /* renamed from: f */
    public static final String f24374f = "timestamp";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: g */
    public static final String f24375g = "subscribe";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: v */
    public static final String f24376v = "unsubscribe";
    @C0359n0

    /* renamed from: a */
    public final String f24377a;
    @C0359n0

    /* renamed from: b */
    public final String f24378b;
    @C0363p0

    /* renamed from: c */
    public final String f24379c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9051t(@C0359n0 String str, @C0359n0 String str2, @C0363p0 String str3) {
        this.f24377a = str;
        this.f24378b = str2;
        this.f24379c = str3;
    }

    /* renamed from: b */
    public static List<C9051t> m33699b(List<C9051t> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C9051t> arrayList2 = new ArrayList<>(list);
        Collections.reverse(arrayList2);
        HashSet hashSet = new HashSet();
        for (C9051t tVar : arrayList2) {
            if (!hashSet.contains(tVar.f24378b)) {
                arrayList.add(0, tVar);
                hashSet.add(tVar.f24378b);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: c */
    public static List<C9051t> m33700c(@C0359n0 C9322a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(m33701d(it.next()));
            } catch (JsonException e) {
                C36059m.m148411g(e, "Invalid subscription list mutation!", new Object[0]);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: d */
    public static C9051t m33701d(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        String l = A.mo18801A("action").mo18769l();
        String l2 = A.mo18801A("list_id").mo18769l();
        String l3 = A.mo18801A("timestamp").mo18769l();
        if (l != null && l2 != null) {
            return new C9051t(l, l2, l3);
        }
        throw new JsonException("Invalid subscription list mutation: " + A);
    }

    @C0359n0
    /* renamed from: h */
    public static C9051t m33702h(@C0359n0 String str, long j) {
        return new C9051t("subscribe", str, C9668o.m36217a(j));
    }

    @C0359n0
    /* renamed from: i */
    public static C9051t m33703i(@C0359n0 String str, long j) {
        return new C9051t("unsubscribe", str, C9668o.m36217a(j));
    }

    /* renamed from: a */
    public void mo17911a(Set<String> set) {
        if (mo17912e().equals("subscribe")) {
            set.add(mo17914f());
        } else {
            set.remove(mo17914f());
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public String mo17912e() {
        return this.f24377a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9051t tVar = (C9051t) obj;
        if (!this.f24377a.equals(tVar.f24377a) || !this.f24378b.equals(tVar.f24378b) || !C17992m.m81740a(this.f24379c, tVar.f24379c)) {
            return false;
        }
        return true;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public String mo17914f() {
        return this.f24378b;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public String mo17915g() {
        return this.f24379c;
    }

    public int hashCode() {
        return C17992m.m81741b(this.f24377a, this.f24378b, this.f24379c);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("action", this.f24377a).mo18823g("list_id", this.f24378b).mo18823g("timestamp", this.f24379c).mo18817a().mo17264q();
    }

    public String toString() {
        return "SubscriptionListMutation{action='" + this.f24377a + '\'' + ", listId='" + this.f24378b + '\'' + ", timestamp='" + this.f24379c + '\'' + C12361b.f30259j;
    }
}
