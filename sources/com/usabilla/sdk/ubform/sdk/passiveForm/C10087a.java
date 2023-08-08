package com.usabilla.sdk.ubform.sdk.passiveForm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.sdk.passiveForm.a */
public final class C10087a {
    @C12579k

    /* renamed from: c */
    public static final C10088a f27732c = new C10088a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final String f27733d = "id";
    @C12579k

    /* renamed from: e */
    public static final String f27734e = "sig";
    @C12579k

    /* renamed from: a */
    public final String f27735a;
    @C12579k

    /* renamed from: b */
    public final String f27736b;

    /* renamed from: com.usabilla.sdk.ubform.sdk.passiveForm.a$a */
    public static final class C10088a {
        public /* synthetic */ C10088a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10088a() {
        }
    }

    public C10087a(@C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(JSON_KEY_ID)");
        this.f27735a = string;
        String string2 = jSONObject.getString(f27734e);
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(JSON_KEY_SIGNATURE)");
        this.f27736b = string2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo21497a() {
        return this.f27735a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo21498b() {
        return this.f27736b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10087a(@C12579k String str) {
        this(new JSONObject(str));
        Intrinsics.checkNotNullParameter(str, "data");
    }
}
