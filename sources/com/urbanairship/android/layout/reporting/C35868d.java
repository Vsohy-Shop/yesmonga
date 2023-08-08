package com.urbanairship.android.layout.reporting;

import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.reporting.d */
public class C35868d {

    /* renamed from: d */
    public static C35868d f88695d = new C35868d((C35867c) null, (C35869e) null, (String) null);
    @C0363p0

    /* renamed from: a */
    public final C35867c f88696a;
    @C0363p0

    /* renamed from: b */
    public final C35869e f88697b;
    @C0363p0

    /* renamed from: c */
    public final String f88698c;

    public C35868d(@C0363p0 C35867c cVar, @C0363p0 C35869e eVar, @C0363p0 String str) {
        this.f88696a = cVar;
        this.f88697b = eVar;
        this.f88698c = str;
    }

    /* renamed from: a */
    public static C35868d m147935a(@C0363p0 String str) {
        return new C35868d((C35867c) null, (C35869e) null, str);
    }

    /* renamed from: b */
    public static C35868d m147936b() {
        return f88695d;
    }

    /* renamed from: c */
    public static C35868d m147937c(@C0363p0 C35867c cVar) {
        return new C35868d(cVar, (C35869e) null, (String) null);
    }

    /* renamed from: g */
    public static C35868d m147938g(@C0363p0 C35869e eVar) {
        return new C35868d((C35867c) null, eVar, (String) null);
    }

    @C0363p0
    /* renamed from: d */
    public String mo107465d() {
        return this.f88698c;
    }

    @C0363p0
    /* renamed from: e */
    public C35867c mo107466e() {
        return this.f88696a;
    }

    @C0363p0
    /* renamed from: f */
    public C35869e mo107467f() {
        return this.f88697b;
    }

    public String toString() {
        return "LayoutData{formInfo=" + this.f88696a + ", pagerData=" + this.f88697b + ", buttonIdentifier='" + this.f88698c + '\'' + C12361b.f30259j;
    }
}
