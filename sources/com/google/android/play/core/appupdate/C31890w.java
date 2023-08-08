package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.C31870e;

/* renamed from: com.google.android.play.core.appupdate.w */
public final class C31890w extends C31870e.C31871a {

    /* renamed from: a */
    public Integer f77781a;

    /* renamed from: b */
    public Boolean f77782b;

    /* renamed from: a */
    public final C31870e mo92411a() {
        String str = "";
        if (this.f77781a == null) {
            str = str.concat(" appUpdateType");
        }
        if (this.f77782b == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new C31891x(this.f77781a.intValue(), this.f77782b.booleanValue());
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    /* renamed from: b */
    public final C31870e.C31871a mo92412b(boolean z) {
        this.f77782b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final C31870e.C31871a mo92413c(int i) {
        this.f77781a = Integer.valueOf(i);
        return this;
    }
}
