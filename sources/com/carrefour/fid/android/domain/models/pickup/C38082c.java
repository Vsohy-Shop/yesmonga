package com.carrefour.fid.android.domain.models.pickup;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.pickup.c */
public final class C38082c {
    @C12580l

    /* renamed from: a */
    public final String f96216a;
    @C12580l

    /* renamed from: b */
    public final String f96217b;

    public C38082c() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C38082c m157250d(C38082c cVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f96216a;
        }
        if ((i & 2) != 0) {
            str2 = cVar.f96217b;
        }
        return cVar.mo118306c(str, str2);
    }

    @C12580l
    /* renamed from: a */
    public final String mo118304a() {
        return this.f96216a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo118305b() {
        return this.f96217b;
    }

    @C12579k
    /* renamed from: c */
    public final C38082c mo118306c(@C12580l String str, @C12580l String str2) {
        return new C38082c(str, str2);
    }

    @C12580l
    /* renamed from: e */
    public final String mo118307e() {
        return this.f96216a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38082c)) {
            return false;
        }
        C38082c cVar = (C38082c) obj;
        return Intrinsics.areEqual((Object) this.f96216a, (Object) cVar.f96216a) && Intrinsics.areEqual((Object) this.f96217b, (Object) cVar.f96217b);
    }

    @C12580l
    /* renamed from: f */
    public final String mo118309f() {
        return this.f96217b;
    }

    public int hashCode() {
        String str = this.f96216a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f96217b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.f96216a;
        String str2 = this.f96217b;
        return "TimeRange(beginTime=" + str + ", endTime=" + str2 + ")";
    }

    public C38082c(@C12580l String str, @C12580l String str2) {
        this.f96216a = str;
        this.f96217b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38082c(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
