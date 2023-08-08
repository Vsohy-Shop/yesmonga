package com.urbanairship.android.layout.property;

import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.property.g */
public class C35836g {
    @C0363p0

    /* renamed from: a */
    public final Platform f88594a;

    /* renamed from: b */
    public final boolean f88595b;
    @C0354l

    /* renamed from: c */
    public final int f88596c;

    public C35836g(@C0363p0 Platform platform, boolean z, int i) {
        this.f88594a = platform;
        this.f88595b = z;
        this.f88596c = i;
    }

    @C0359n0
    /* renamed from: a */
    public static C35836g m147759a(@C0359n0 C9323b bVar) throws JsonException {
        Platform platform;
        String B = bVar.mo18801A("platform").mo18750B();
        if (B.isEmpty()) {
            platform = null;
        } else {
            platform = Platform.m147682b(B);
        }
        boolean c = bVar.mo18801A("dark_mode").mo18757c(false);
        Integer a = C35839j.m147767a(bVar.mo18801A("color").mo18749A());
        if (a != null) {
            return new C35836g(platform, c, a.intValue());
        }
        throw new JsonException("Failed to parse color selector. 'color' may not be null! json = '" + bVar + "'");
    }

    @C0359n0
    /* renamed from: b */
    public static List<C35836g> m147760b(@C0359n0 C9322a aVar) throws JsonException {
        ArrayList arrayList = new ArrayList(aVar.size());
        for (int i = 0; i < aVar.size(); i++) {
            C35836g a = m147759a(aVar.mo18791h(i).mo18749A());
            if (a.f88594a == Platform.ANDROID) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @C0354l
    /* renamed from: c */
    public int mo107343c() {
        return this.f88596c;
    }

    /* renamed from: d */
    public boolean mo107344d() {
        return this.f88595b;
    }
}
