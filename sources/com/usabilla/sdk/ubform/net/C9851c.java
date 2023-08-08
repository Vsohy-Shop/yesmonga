package com.usabilla.sdk.ubform.net;

import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.net.c */
public final class C9851c {
    @C12579k

    /* renamed from: g */
    public static final C9852a f26936g = new C9852a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: h */
    public static final String f26937h = "v";
    @C12579k

    /* renamed from: i */
    public static final String f26938i = "type";
    @C12579k

    /* renamed from: j */
    public static final String f26939j = "subtype";
    @C12579k

    /* renamed from: k */
    public static final String f26940k = "data";
    @C12579k

    /* renamed from: l */
    public static final String f26941l = "done";

    /* renamed from: a */
    public final int f26942a;
    @C12579k

    /* renamed from: b */
    public final String f26943b;
    @C12579k

    /* renamed from: c */
    public final String f26944c;

    /* renamed from: d */
    public final boolean f26945d;
    @C12579k

    /* renamed from: e */
    public final JSONObject f26946e;
    @C12580l

    /* renamed from: f */
    public String f26947f;

    /* renamed from: com.usabilla.sdk.ubform.net.c$a */
    public static final class C9852a {
        public /* synthetic */ C9852a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C9851c mo20273a(@C12579k String str) throws JSONException {
            Intrinsics.checkNotNullParameter(str, "jsonString");
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(C9851c.f26937h);
            String string = jSONObject.getString("type");
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(JSON_FORM_TYPE_KEY)");
            String string2 = jSONObject.getString("subtype");
            Intrinsics.checkNotNullExpressionValue(string2, "json.getString(JSON_FORM_SUBTYPE_KEY)");
            boolean z = jSONObject.getBoolean(C9851c.f26941l);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.getJSONObject(JSON_FORM_DATA)");
            return new C9851c(i, string, string2, z, jSONObject2, (String) null, 32, (DefaultConstructorMarker) null);
        }

        public C9852a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C9851c(int i, @C12579k String str, @C12579k String str2, @C12579k JSONObject jSONObject) {
        this(i, str, str2, false, jSONObject, (String) null, 40, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "subtype");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final C9851c m36926a(@C12579k String str) throws JSONException {
        return f26936g.mo20273a(str);
    }

    @C12580l
    /* renamed from: b */
    public final String mo20270b() {
        return this.f26947f;
    }

    /* renamed from: c */
    public final void mo20271c(@C12580l String str) {
        this.f26947f = str;
    }

    @C12579k
    /* renamed from: d */
    public final String mo20272d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", this.f26946e);
        jSONObject.put("subtype", this.f26944c);
        jSONObject.put("type", this.f26943b);
        jSONObject.put(f26941l, this.f26945d);
        jSONObject.put(f26937h, this.f26942a);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "JSONObject().apply {\n        put(JSON_FORM_DATA, data)\n        put(JSON_FORM_SUBTYPE_KEY, subtype)\n        put(JSON_FORM_TYPE_KEY, type)\n        put(JSON_COMPLETE, done)\n        put(JSON_FORM_VERSION, version)\n    }.toString()");
        return jSONObject2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C9851c(int i, @C12579k String str, @C12579k String str2, boolean z, @C12579k JSONObject jSONObject) {
        this(i, str, str2, z, jSONObject, (String) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "subtype");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C9851c(int i, @C12579k String str, @C12579k JSONObject jSONObject) {
        this(i, str, (String) null, false, jSONObject, (String) null, 44, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C9851c(int i, @C12579k JSONObject jSONObject) {
        this(i, (String) null, (String) null, false, jSONObject, (String) null, 46, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
    }

    @C11315i
    public C9851c(int i, @C12579k String str, @C12579k String str2, boolean z, @C12579k JSONObject jSONObject, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(str2, "subtype");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        this.f26942a = i;
        this.f26943b = str;
        this.f26944c = str2;
        this.f26945d = z;
        this.f26946e = jSONObject;
        this.f26947f = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9851c(int i, String str, String str2, boolean z, JSONObject jSONObject, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "app_feedback" : str, (i2 & 4) != 0 ? "form" : str2, (i2 & 8) != 0 ? true : z, jSONObject, (i2 & 32) != 0 ? null : str3);
    }
}
