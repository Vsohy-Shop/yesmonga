package com.android.volley;

import android.text.TextUtils;

/* renamed from: com.android.volley.i */
public final class C21759i {

    /* renamed from: a */
    public final String f56290a;

    /* renamed from: b */
    public final String f56291b;

    public C21759i(String str, String str2) {
        this.f56290a = str;
        this.f56291b = str2;
    }

    /* renamed from: a */
    public final String mo64934a() {
        return this.f56290a;
    }

    /* renamed from: b */
    public final String mo64935b() {
        return this.f56291b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21759i.class != obj.getClass()) {
            return false;
        }
        C21759i iVar = (C21759i) obj;
        if (!TextUtils.equals(this.f56290a, iVar.f56290a) || !TextUtils.equals(this.f56291b, iVar.f56291b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f56290a.hashCode() * 31) + this.f56291b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f56290a + ",value=" + this.f56291b + "]";
    }
}
