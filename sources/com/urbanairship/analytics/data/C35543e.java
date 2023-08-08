package com.urbanairship.analytics.data;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import androidx.room.C20277a0;
import androidx.room.C20340m0;
import androidx.room.C20351p;
import androidx.room.Index;
import com.urbanairship.analytics.C35554i;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.nio.charset.StandardCharsets;
import kotlinx.serialization.json.internal.C12361b;

@C20351p(indices = {@Index(unique = true, value = {"eventId"})}, tableName = "events")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.analytics.data.e */
public class C35543e {
    @C20340m0(autoGenerate = true)

    /* renamed from: a */
    public int f87676a;

    /* renamed from: b */
    public String f87677b;

    /* renamed from: c */
    public String f87678c;

    /* renamed from: d */
    public String f87679d;

    /* renamed from: e */
    public JsonValue f87680e;

    /* renamed from: f */
    public String f87681f;

    /* renamed from: g */
    public int f87682g;

    /* renamed from: com.urbanairship.analytics.data.e$a */
    public static class C35544a {

        /* renamed from: a */
        public int f87683a;

        /* renamed from: b */
        public String f87684b;

        /* renamed from: c */
        public JsonValue f87685c;

        public C35544a(int i, String str, JsonValue jsonValue) {
            this.f87683a = i;
            this.f87684b = str;
            this.f87685c = jsonValue;
        }
    }

    public C35543e(String str, String str2, String str3, JsonValue jsonValue, String str4, int i) {
        this.f87677b = str;
        this.f87678c = str2;
        this.f87679d = str3;
        this.f87680e = jsonValue;
        this.f87681f = str4;
        this.f87682g = i;
    }

    /* renamed from: b */
    public static C35543e m146658b(@C0359n0 C35554i iVar, @C0359n0 String str) throws JsonException {
        String a = iVar.mo106515a(str);
        return new C35543e(iVar.mo18412j(), iVar.mo106519f(), iVar.mo106521h(), JsonValue.m34960C(a), str, a.getBytes(StandardCharsets.UTF_8).length);
    }

    /* renamed from: a */
    public boolean mo106469a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C35543e eVar = (C35543e) obj;
        if (this.f87682g != eVar.f87682g || !C17992m.m81740a(this.f87677b, eVar.f87677b) || !C17992m.m81740a(this.f87678c, eVar.f87678c) || !C17992m.m81740a(this.f87679d, eVar.f87679d) || !C17992m.m81740a(this.f87680e, eVar.f87680e) || !C17992m.m81740a(this.f87681f, eVar.f87681f)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C35543e eVar = (C35543e) obj;
        if (this.f87676a != eVar.f87676a || this.f87682g != eVar.f87682g || !C17992m.m81740a(this.f87677b, eVar.f87677b) || !C17992m.m81740a(this.f87678c, eVar.f87678c) || !C17992m.m81740a(this.f87679d, eVar.f87679d) || !C17992m.m81740a(this.f87680e, eVar.f87680e) || !C17992m.m81740a(this.f87681f, eVar.f87681f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17992m.m81741b(Integer.valueOf(this.f87676a), this.f87677b, this.f87678c, this.f87679d, this.f87680e, this.f87681f, Integer.valueOf(this.f87682g));
    }

    @C20277a0
    public String toString() {
        return "EventEntity{id=" + this.f87676a + ", type='" + this.f87677b + '\'' + ", eventId='" + this.f87678c + '\'' + ", time=" + this.f87679d + ", data='" + this.f87680e.toString() + '\'' + ", sessionId='" + this.f87681f + '\'' + ", eventSize=" + this.f87682g + C12361b.f30259j;
    }
}
