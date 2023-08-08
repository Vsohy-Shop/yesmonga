package com.urbanairship.messagecenter;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.room.C20305f;
import androidx.room.C20340m0;
import androidx.room.C20351p;
import androidx.room.Index;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.List;

@C20351p(indices = {@Index(unique = true, value = {"message_id"})}, tableName = "richpush")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.messagecenter.m */
public class C9383m {
    @C20340m0(autoGenerate = true)
    @C20305f(name = "_id")

    /* renamed from: a */
    public int f25661a;
    @C20305f(name = "message_id")

    /* renamed from: b */
    public String f25662b;
    @C20305f(name = "message_url")

    /* renamed from: c */
    public String f25663c;
    @C20305f(name = "message_body_url")

    /* renamed from: d */
    public String f25664d;
    @C20305f(name = "message_read_url")

    /* renamed from: e */
    public String f25665e;

    /* renamed from: f */
    public String f25666f;

    /* renamed from: g */
    public String f25667g;

    /* renamed from: h */
    public boolean f25668h;
    @C20305f(name = "unread_orig")

    /* renamed from: i */
    public boolean f25669i;

    /* renamed from: j */
    public boolean f25670j;

    /* renamed from: k */
    public String f25671k;
    @C20305f(name = "raw_message_object")

    /* renamed from: l */
    public String f25672l;
    @C20305f(name = "expiration_timestamp")

    /* renamed from: m */
    public String f25673m;

    public C9383m(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, String str7, String str8, String str9) {
        this.f25662b = str;
        this.f25663c = str2;
        this.f25664d = str3;
        this.f25665e = str4;
        this.f25666f = str5;
        this.f25667g = str6;
        this.f25668h = z;
        this.f25669i = z2;
        this.f25670j = z3;
        this.f25671k = str7;
        this.f25672l = str8;
        this.f25673m = str9;
    }

    @C0363p0
    /* renamed from: b */
    public static C9383m m35326b(@C0363p0 String str, @C0359n0 JsonValue jsonValue) {
        String str2;
        JsonValue jsonValue2 = jsonValue;
        String str3 = null;
        if (jsonValue2 == JsonValue.f25436b || !jsonValue.mo18778u()) {
            C36059m.m148409e("MessageEntity - Unexpected message: %s", jsonValue2);
            return null;
        }
        C9323b A = jsonValue.mo18749A();
        if (C9669o0.m36224e(A.mo18801A("message_id").mo18769l())) {
            C36059m.m148409e("MessageEntity - Message is missing an ID: %s", jsonValue2);
            return null;
        }
        if (str != null) {
            str2 = str;
        } else {
            str2 = A.mo18801A("message_id").mo18769l();
        }
        String l = A.mo18801A("message_url").mo18769l();
        String l2 = A.mo18801A("message_body_url").mo18769l();
        String l3 = A.mo18801A("message_read_url").mo18769l();
        String l4 = A.mo18801A("title").mo18769l();
        String l5 = A.mo18801A("extra").mo18769l();
        boolean c = A.mo18801A("unread").mo18757c(true);
        boolean c2 = A.mo18801A("unread").mo18757c(true);
        String l6 = A.mo18801A(C9371g.f25619H0).mo18769l();
        String bVar = A.toString();
        if (A.mo18805e(C9371g.f25624Y)) {
            str3 = A.mo18801A(C9371g.f25624Y).mo18769l();
        }
        return new C9383m(str2, l, l2, l3, l4, l5, c, c2, false, l6, bVar, str3);
    }

    @C0359n0
    /* renamed from: c */
    public static List<C9383m> m35327c(@C0359n0 List<JsonValue> list) {
        ArrayList arrayList = new ArrayList();
        for (JsonValue b : list) {
            C9383m b2 = m35326b((String) null, b);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C9371g mo19041a(C9383m mVar) {
        try {
            return C9371g.m35231g(JsonValue.m34960C(mVar.f25672l), mVar.f25668h, mVar.f25670j);
        } catch (JsonException unused) {
            C36059m.m148409e("Failed to create Message from JSON", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public String mo19042d() {
        return this.f25662b;
    }

    @C0363p0
    /* renamed from: e */
    public JsonValue mo19043e() {
        try {
            C9323b j = JsonValue.m34960C(this.f25672l).mo18767j();
            if (j != null) {
                return j.mo18812k(C9371g.f25620I0);
            }
            return null;
        } catch (JsonException e) {
            C36059m.m148411g(e, "MessageEntity - Failed to parse Message reporting.", new Object[0]);
            return null;
        }
    }

    /* renamed from: f */
    public boolean mo19044f() {
        return this.f25670j;
    }
}
