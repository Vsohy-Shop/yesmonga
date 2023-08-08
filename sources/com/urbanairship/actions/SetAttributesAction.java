package com.urbanairship.actions;

import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.actions.C35492e;
import com.urbanairship.channel.C9022g;
import com.urbanairship.json.JsonValue;
import java.util.Date;
import java.util.Map;

public class SetAttributesAction extends C35487a {
    @C0359n0

    /* renamed from: h */
    public static final String f87474h = "set_attributes_action";
    @C0359n0

    /* renamed from: i */
    public static final String f87475i = "^a";
    @C0359n0

    /* renamed from: j */
    public static final String f87476j = "channel";
    @C0359n0

    /* renamed from: k */
    public static final String f87477k = "named_user";
    @C0359n0

    /* renamed from: l */
    public static final String f87478l = "set";
    @C0359n0

    /* renamed from: m */
    public static final String f87479m = "remove";

    public static class SetAttributesPredicate implements C35492e.C35494b {
        /* renamed from: a */
        public boolean mo106318a(@C0359n0 C35489b bVar) {
            return 1 != bVar.mo106348b();
        }
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        if (bVar.mo106349c().mo106311i() || bVar.mo106349c().mo106307f() == null) {
            return false;
        }
        JsonValue A = bVar.mo106349c().mo106307f().mo18801A("channel");
        JsonValue jsonValue = JsonValue.f25436b;
        if (A != jsonValue && !mo106334g(A)) {
            return false;
        }
        JsonValue A2 = bVar.mo106349c().mo106307f().mo18801A("named_user");
        if (A2 != jsonValue && !mo106334g(A2)) {
            return false;
        }
        if (A == jsonValue && A2 == jsonValue) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        if (bVar.mo106349c().mo106307f() != null) {
            if (bVar.mo106349c().mo106307f().mo18805e("channel")) {
                C9022g S = UAirship.m146188Y().mo106223n().mo17786S();
                for (Map.Entry<String, JsonValue> h : bVar.mo106349c().mo106307f().mo18801A("channel").mo18749A().mo18813r().entrySet()) {
                    mo106335h(S, h);
                }
                S.mo17828a();
            }
            if (bVar.mo106349c().mo106307f().mo18805e("named_user")) {
                C9022g V = UAirship.m146188Y().mo106227r().mo18029V();
                for (Map.Entry<String, JsonValue> h2 : bVar.mo106349c().mo106307f().mo18801A("named_user").mo18749A().mo18813r().entrySet()) {
                    mo106335h(V, h2);
                }
                V.mo17828a();
            }
        }
        return C35495f.m146456d();
    }

    /* renamed from: g */
    public final boolean mo106334g(@C0359n0 JsonValue jsonValue) {
        if (jsonValue.mo18767j() == null) {
            return false;
        }
        JsonValue A = jsonValue.mo18749A().mo18801A("set");
        JsonValue jsonValue2 = JsonValue.f25436b;
        if (A != jsonValue2 && !mo106337j(A)) {
            return false;
        }
        JsonValue A2 = jsonValue.mo18749A().mo18801A("remove");
        if (A2 == jsonValue2 || mo106336i(A2)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo106335h(@C0359n0 C9022g gVar, @C0359n0 Map.Entry<String, JsonValue> entry) {
        String key = entry.getKey();
        key.hashCode();
        if (key.equals("remove")) {
            for (JsonValue B : entry.getValue().mo18784z().mo18793i()) {
                gVar.mo17830d(B.mo18750B());
            }
        } else if (key.equals("set")) {
            for (Map.Entry next : entry.getValue().mo18749A().mo18809i()) {
                mo106338k(gVar, (String) next.getKey(), ((JsonValue) next.getValue()).mo18771n());
            }
        }
    }

    /* renamed from: i */
    public final boolean mo106336i(@C0359n0 JsonValue jsonValue) {
        return jsonValue.mo18764h() != null;
    }

    /* renamed from: j */
    public final boolean mo106337j(@C0359n0 JsonValue jsonValue) {
        return jsonValue.mo18767j() != null;
    }

    /* renamed from: k */
    public final void mo106338k(@C0359n0 C9022g gVar, @C0359n0 String str, @C0359n0 Object obj) {
        if (obj instanceof Integer) {
            gVar.mo17833g(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            gVar.mo17834h(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            gVar.mo17832f(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            gVar.mo17831e(str, ((Double) obj).doubleValue());
        } else if (obj instanceof String) {
            gVar.mo17835i(str, (String) obj);
        } else if (obj instanceof Date) {
            gVar.mo17836j(str, (Date) obj);
        } else {
            C36059m.m148421q("SetAttributesAction - Invalid value type for the key: %s", str);
        }
    }
}
