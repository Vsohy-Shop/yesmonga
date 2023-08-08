package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
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
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.channel.i */
public class C9025i implements C9333e {

    /* renamed from: e */
    public static final String f24262e = "remove";

    /* renamed from: f */
    public static final String f24263f = "set";

    /* renamed from: g */
    public static final String f24264g = "key";

    /* renamed from: v */
    public static final String f24265v = "value";

    /* renamed from: w */
    public static final String f24266w = "action";

    /* renamed from: x */
    public static final String f24267x = "timestamp";

    /* renamed from: a */
    public final String f24268a;

    /* renamed from: b */
    public final String f24269b;

    /* renamed from: c */
    public final JsonValue f24270c;

    /* renamed from: d */
    public final String f24271d;

    public C9025i(@C0359n0 String str, @C0359n0 String str2, @C0363p0 JsonValue jsonValue, @C0363p0 String str3) {
        this.f24268a = str;
        this.f24269b = str2;
        this.f24270c = jsonValue;
        this.f24271d = str3;
    }

    @C0359n0
    /* renamed from: a */
    public static List<C9025i> m33597a(@C0359n0 List<C9025i> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C9025i> arrayList2 = new ArrayList<>(list);
        Collections.reverse(arrayList2);
        HashSet hashSet = new HashSet();
        for (C9025i iVar : arrayList2) {
            if (!hashSet.contains(iVar.f24269b)) {
                arrayList.add(0, iVar);
                hashSet.add(iVar.f24269b);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: b */
    public static List<C9025i> m33598b(@C0359n0 C9322a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(m33599c(it.next()));
            } catch (JsonException e) {
                C36059m.m148411g(e, "Invalid attribute.", new Object[0]);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: c */
    public static C9025i m33599c(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        String l = A.mo18801A("action").mo18769l();
        String l2 = A.mo18801A("key").mo18769l();
        JsonValue k = A.mo18812k("value");
        String l3 = A.mo18801A("timestamp").mo18769l();
        if (l != null && l2 != null && (k == null || m33600d(k))) {
            return new C9025i(l, l2, k, l3);
        }
        throw new JsonException("Invalid attribute mutation: " + A);
    }

    /* renamed from: d */
    public static boolean m33600d(@C0359n0 JsonValue jsonValue) {
        return !jsonValue.mo18780w() && !jsonValue.mo18776t() && !jsonValue.mo18778u() && !jsonValue.mo18772o();
    }

    @C0359n0
    /* renamed from: e */
    public static C9025i m33601e(@C0359n0 String str, long j) {
        return new C9025i("remove", str, (JsonValue) null, C9668o.m36217a(j));
    }

    @C0359n0
    /* renamed from: f */
    public static C9025i m33602f(@C0359n0 String str, @C0359n0 JsonValue jsonValue, long j) {
        if (!jsonValue.mo18780w() && !jsonValue.mo18776t() && !jsonValue.mo18778u() && !jsonValue.mo18772o()) {
            return new C9025i("set", str, jsonValue, C9668o.m36217a(j));
        }
        throw new IllegalArgumentException("Invalid attribute value: " + jsonValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9025i iVar = (C9025i) obj;
        if (!this.f24268a.equals(iVar.f24268a) || !this.f24269b.equals(iVar.f24269b)) {
            return false;
        }
        JsonValue jsonValue = this.f24270c;
        if (jsonValue == null ? iVar.f24270c == null : jsonValue.equals(iVar.f24270c)) {
            return this.f24271d.equals(iVar.f24271d);
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f24268a.hashCode() * 31) + this.f24269b.hashCode()) * 31;
        JsonValue jsonValue = this.f24270c;
        if (jsonValue != null) {
            i = jsonValue.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.f24271d.hashCode();
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("action", this.f24268a).mo18823g("key", this.f24269b).mo18822f("value", this.f24270c).mo18823g("timestamp", this.f24271d).mo18817a().mo17264q();
    }

    public String toString() {
        return "AttributeMutation{action='" + this.f24268a + '\'' + ", name='" + this.f24269b + '\'' + ", value=" + this.f24270c + ", timestamp='" + this.f24271d + '\'' + C12361b.f30259j;
    }
}
