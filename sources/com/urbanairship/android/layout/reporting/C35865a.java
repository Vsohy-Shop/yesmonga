package com.urbanairship.android.layout.reporting;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17992m;
import com.urbanairship.json.C9323b;
import com.urbanairship.util.C9669o0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.android.layout.reporting.a */
public class C35865a {
    @C0363p0

    /* renamed from: a */
    public final String f88689a;
    @C0363p0

    /* renamed from: b */
    public final String f88690b;

    public C35865a(@C0363p0 String str, @C0363p0 String str2) {
        this.f88689a = str;
        this.f88690b = str2;
    }

    @C0363p0
    /* renamed from: a */
    public static C35865a m147925a(@C0359n0 C9323b bVar) {
        return m147926b(bVar.mo18801A("attribute_name").mo18749A());
    }

    @C0363p0
    /* renamed from: b */
    public static C35865a m147926b(@C0359n0 C9323b bVar) {
        String l = bVar.mo18801A("channel").mo18769l();
        String l2 = bVar.mo18801A("contact").mo18769l();
        if (l == null && l2 == null) {
            return null;
        }
        return new C35865a(l, l2);
    }

    @C0363p0
    /* renamed from: c */
    public String mo107453c() {
        return this.f88689a;
    }

    @C0363p0
    /* renamed from: d */
    public String mo107454d() {
        return this.f88690b;
    }

    /* renamed from: e */
    public boolean mo107455e() {
        return !C9669o0.m36224e(this.f88689a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C35865a aVar = (C35865a) obj;
        if (!C17992m.m81740a(this.f88689a, aVar.f88689a) || !C17992m.m81740a(this.f88690b, aVar.f88690b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo107457f() {
        return !C9669o0.m36224e(this.f88690b);
    }

    public int hashCode() {
        return C17992m.m81741b(this.f88689a, this.f88690b);
    }

    @C0359n0
    public String toString() {
        return "AttributeName{channel='" + this.f88689a + '\'' + ", contact='" + this.f88690b + '\'' + C12361b.f30259j;
    }
}
