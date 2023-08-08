package com.usabilla.sdk.ubform.net;

import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.net.b */
public final class C9850b {
    @C12580l

    /* renamed from: a */
    public final String f26930a;
    @C12580l

    /* renamed from: b */
    public final Integer f26931b;
    @C12580l

    /* renamed from: c */
    public final JSONObject f26932c;
    @C12580l

    /* renamed from: d */
    public final JSONObject f26933d;
    @C12580l

    /* renamed from: e */
    public final Boolean f26934e;
    @C12580l

    /* renamed from: f */
    public final JSONObject f26935f;

    @C11315i
    public C9850b() {
        this((String) null, (Integer) null, (JSONObject) null, (JSONObject) null, (Boolean) null, (JSONObject) null, 63, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public final JSONObject mo20269a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", this.f26930a);
        jSONObject.put("form_version", this.f26931b);
        jSONObject.put("data", this.f26932c);
        jSONObject.put("metadata", this.f26933d);
        jSONObject.put("complete", this.f26934e);
        jSONObject.put(C9175a.f24932Y, this.f26935f);
        return jSONObject;
    }

    @C11315i
    public C9850b(@C12580l String str) {
        this(str, (Integer) null, (JSONObject) null, (JSONObject) null, (Boolean) null, (JSONObject) null, 62, (DefaultConstructorMarker) null);
    }

    @C11315i
    public C9850b(@C12580l String str, @C12580l Integer num) {
        this(str, num, (JSONObject) null, (JSONObject) null, (Boolean) null, (JSONObject) null, 60, (DefaultConstructorMarker) null);
    }

    @C11315i
    public C9850b(@C12580l String str, @C12580l Integer num, @C12580l JSONObject jSONObject) {
        this(str, num, jSONObject, (JSONObject) null, (Boolean) null, (JSONObject) null, 56, (DefaultConstructorMarker) null);
    }

    @C11315i
    public C9850b(@C12580l String str, @C12580l Integer num, @C12580l JSONObject jSONObject, @C12580l JSONObject jSONObject2) {
        this(str, num, jSONObject, jSONObject2, (Boolean) null, (JSONObject) null, 48, (DefaultConstructorMarker) null);
    }

    @C11315i
    public C9850b(@C12580l String str, @C12580l Integer num, @C12580l JSONObject jSONObject, @C12580l JSONObject jSONObject2, @C12580l Boolean bool) {
        this(str, num, jSONObject, jSONObject2, bool, (JSONObject) null, 32, (DefaultConstructorMarker) null);
    }

    @C11315i
    public C9850b(@C12580l String str, @C12580l Integer num, @C12580l JSONObject jSONObject, @C12580l JSONObject jSONObject2, @C12580l Boolean bool, @C12580l JSONObject jSONObject3) {
        this.f26930a = str;
        this.f26931b = num;
        this.f26932c = jSONObject;
        this.f26933d = jSONObject2;
        this.f26934e = bool;
        this.f26935f = jSONObject3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9850b(java.lang.String r6, java.lang.Integer r7, org.json.JSONObject r8, org.json.JSONObject r9, java.lang.Boolean r10, org.json.JSONObject r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.net.C9850b.<init>(java.lang.String, java.lang.Integer, org.json.JSONObject, org.json.JSONObject, java.lang.Boolean, org.json.JSONObject, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
