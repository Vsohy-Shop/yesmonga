package com.urbanairship.json;

import androidx.annotation.RestrictTo;
import androidx.room.C20315g2;
import com.urbanairship.C36059m;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.json.f */
public class C9334f {
    @C20315g2
    /* renamed from: a */
    public C9323b mo18843a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return JsonValue.m34960C(str).mo18749A();
        } catch (JsonException e) {
            C36059m.m148411g(e, "Unable to parse json value: " + str, new Object[0]);
            return null;
        }
    }

    @C20315g2
    /* renamed from: b */
    public String mo18844b(C9323b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar.mo17264q().toString();
    }

    @C20315g2
    /* renamed from: c */
    public C9329d mo18845c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return C9329d.m35055d(JsonValue.m34960C(str));
        } catch (JsonException e) {
            C36059m.m148411g(e, "Unable to parse trigger context: " + str, new Object[0]);
            return null;
        }
    }

    @C20315g2
    /* renamed from: d */
    public String mo18846d(C9329d dVar) {
        if (dVar == null) {
            return null;
        }
        return dVar.mo17264q().toString();
    }

    @C20315g2
    /* renamed from: e */
    public JsonValue mo18847e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return JsonValue.m34960C(str);
        } catch (JsonException e) {
            C36059m.m148411g(e, "Unable to parse json value: " + str, new Object[0]);
            return null;
        }
    }

    @C20315g2
    /* renamed from: f */
    public String mo18848f(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return jsonValue.toString();
    }
}
