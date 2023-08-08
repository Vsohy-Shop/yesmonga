package com.urbanairship.actions;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.urbanairship.actions.b */
public final class C35489b {
    @C0359n0

    /* renamed from: d */
    public static final String f87515d = "com.urbanairship.RICH_PUSH_ID_METADATA";
    @C0359n0

    /* renamed from: e */
    public static final String f87516e = "com.urbanairship.PUSH_MESSAGE";
    @C0359n0

    /* renamed from: f */
    public static final String f87517f = "com.urbanairship.REMOTE_INPUT";
    @C0359n0

    /* renamed from: g */
    public static final String f87518g = "com.urbanairship.ACTION_SCHEDULE_ID";
    @C0359n0

    /* renamed from: h */
    public static final String f87519h = "com.urbanairship.REGISTRY_ACTION_NAME";

    /* renamed from: a */
    public final int f87520a;

    /* renamed from: b */
    public final ActionValue f87521b;

    /* renamed from: c */
    public final Bundle f87522c;

    public C35489b(int i, @C0363p0 ActionValue actionValue, @C0363p0 Bundle bundle) {
        Bundle bundle2;
        this.f87520a = i;
        this.f87521b = actionValue == null ? new ActionValue() : actionValue;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        }
        this.f87522c = bundle2;
    }

    @C0359n0
    /* renamed from: a */
    public Bundle mo106347a() {
        return this.f87522c;
    }

    /* renamed from: b */
    public int mo106348b() {
        return this.f87520a;
    }

    @C0359n0
    /* renamed from: c */
    public ActionValue mo106349c() {
        return this.f87521b;
    }

    @C0359n0
    public String toString() {
        return "ActionArguments { situation: " + this.f87520a + ", value: " + this.f87521b + ", metadata: " + this.f87522c + " }";
    }
}
