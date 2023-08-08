package com.urbanairship.iam;

import com.urbanairship.json.JsonValue;

/* renamed from: com.urbanairship.iam.r */
public final /* synthetic */ class C9233r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9237v f25137a;

    /* renamed from: b */
    public final /* synthetic */ InAppMessage f25138b;

    /* renamed from: c */
    public final /* synthetic */ String f25139c;

    /* renamed from: d */
    public final /* synthetic */ JsonValue f25140d;

    /* renamed from: e */
    public final /* synthetic */ JsonValue f25141e;

    public /* synthetic */ C9233r(C9237v vVar, InAppMessage inAppMessage, String str, JsonValue jsonValue, JsonValue jsonValue2) {
        this.f25137a = vVar;
        this.f25138b = inAppMessage;
        this.f25139c = str;
        this.f25140d = jsonValue;
        this.f25141e = jsonValue2;
    }

    public final void run() {
        this.f25137a.m34694s(this.f25138b, this.f25139c, this.f25140d, this.f25141e);
    }
}
