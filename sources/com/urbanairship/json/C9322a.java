package com.urbanairship.json;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONStringer;

/* renamed from: com.urbanairship.json.a */
public class C9322a implements Iterable<JsonValue>, C9333e {
    @C0359n0

    /* renamed from: b */
    public static final C9322a f25438b = new C9322a((List<JsonValue>) null);

    /* renamed from: a */
    public final List<JsonValue> f25439a;

    public C9322a(@C0363p0 List<JsonValue> list) {
        ArrayList arrayList;
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(list);
        }
        this.f25439a = arrayList;
    }

    /* renamed from: e */
    public boolean mo18789e(@C0359n0 JsonValue jsonValue) {
        return this.f25439a.contains(jsonValue);
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9322a) {
            return this.f25439a.equals(((C9322a) obj).f25439a);
        }
        return false;
    }

    @C0359n0
    /* renamed from: h */
    public JsonValue mo18791h(int i) {
        return this.f25439a.get(i);
    }

    public int hashCode() {
        return this.f25439a.hashCode();
    }

    @C0359n0
    /* renamed from: i */
    public List<JsonValue> mo18793i() {
        return new ArrayList(this.f25439a);
    }

    public boolean isEmpty() {
        return this.f25439a.isEmpty();
    }

    @C0359n0
    public Iterator<JsonValue> iterator() {
        return this.f25439a.iterator();
    }

    /* renamed from: k */
    public int mo18796k(@C0359n0 JsonValue jsonValue) {
        return this.f25439a.indexOf(jsonValue);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return JsonValue.m34965K(this);
    }

    /* renamed from: r */
    public int mo18797r(@C0359n0 JsonValue jsonValue) {
        return this.f25439a.indexOf(jsonValue);
    }

    public int size() {
        return this.f25439a.size();
    }

    @C0359n0
    public String toString() {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            mo18800w(jSONStringer);
            return jSONStringer.toString();
        } catch (StringIndexOutOfBoundsException | JSONException e) {
            C36059m.m148411g(e, "JsonList - Failed to create JSON String.", new Object[0]);
            return "";
        }
    }

    /* renamed from: w */
    public void mo18800w(@C0359n0 JSONStringer jSONStringer) throws JSONException {
        jSONStringer.array();
        Iterator<JsonValue> it = iterator();
        while (it.hasNext()) {
            it.next().mo18754V(jSONStringer);
        }
        jSONStringer.endArray();
    }
}
