package com.urbanairship.automation.storage;

import androidx.annotation.RestrictTo;
import androidx.room.C20315g2;
import com.urbanairship.C36059m;
import com.urbanairship.automation.C8814b;
import com.urbanairship.automation.C8828d0;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.storage.d */
public final class C8945d {
    @C20315g2
    /* renamed from: c */
    public static String m33316c(List<String> list) {
        return JsonValue.m34975U(list).toString();
    }

    @C20315g2
    /* renamed from: d */
    public static List<String> m33317d(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<JsonValue> it = JsonValue.m34960C(str).mo18784z().iterator();
            while (it.hasNext()) {
                JsonValue next = it.next();
                if (next.mo18769l() != null) {
                    arrayList.add(next.mo18750B());
                }
            }
            return arrayList;
        } catch (JsonException e) {
            C36059m.m148411g(e, "Unable to parse string array from string: " + str, new Object[0]);
            return null;
        }
    }

    @C20315g2
    /* renamed from: a */
    public C8814b mo17666a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return C8814b.m32733a(JsonValue.m34960C(str));
        } catch (JsonException e) {
            C36059m.m148411g(e, "Unable to parse audience: " + str, new Object[0]);
            return null;
        }
    }

    @C20315g2
    /* renamed from: b */
    public String mo17667b(C8814b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar.mo17264q().toString();
    }

    @C20315g2
    /* renamed from: e */
    public C8828d0 mo17668e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return C8828d0.m32844a(JsonValue.m34960C(str));
        } catch (JsonException e) {
            C36059m.m148411g(e, "Unable to parse trigger context: " + str, new Object[0]);
            return null;
        }
    }

    @C20315g2
    /* renamed from: f */
    public String mo17669f(C8828d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        return d0Var.mo17264q().toString();
    }
}
