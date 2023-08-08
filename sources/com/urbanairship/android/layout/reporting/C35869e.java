package com.urbanairship.android.layout.reporting;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.reporting.e */
public class C35869e {

    /* renamed from: a */
    public final String f88699a;

    /* renamed from: b */
    public final int f88700b;

    /* renamed from: c */
    public final String f88701c;

    /* renamed from: d */
    public final int f88702d;

    /* renamed from: e */
    public final boolean f88703e;

    public C35869e(@C0359n0 String str, int i, @C0359n0 String str2, int i2, boolean z) {
        this.f88699a = str;
        this.f88700b = i;
        this.f88701c = str2;
        this.f88702d = i2;
        this.f88703e = z;
    }

    /* renamed from: a */
    public int mo107469a() {
        return this.f88702d;
    }

    @C0359n0
    /* renamed from: b */
    public String mo107470b() {
        return this.f88699a;
    }

    /* renamed from: c */
    public int mo107471c() {
        return this.f88700b;
    }

    @C0359n0
    /* renamed from: d */
    public String mo107472d() {
        return this.f88701c;
    }

    /* renamed from: e */
    public boolean mo107473e() {
        return this.f88703e;
    }

    @C0359n0
    public String toString() {
        return "PagerData{identifier='" + this.f88699a + '\'' + ", pageIndex=" + this.f88700b + ", pageId=" + this.f88701c + ", count=" + this.f88702d + ", completed=" + this.f88703e + C12361b.f30259j;
    }
}
