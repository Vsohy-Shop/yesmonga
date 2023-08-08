package com.contentsquare.android.sdk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.te */
public final class C14753te {

    /* renamed from: a */
    public final List<C14374ga> f36522a;

    /* renamed from: b */
    public final boolean f36523b;

    /* renamed from: c */
    public final boolean f36524c;

    /* renamed from: d */
    public final long f36525d;

    /* renamed from: e */
    public final long f36526e;

    public C14753te(List<? extends C14374ga> list, boolean z, boolean z2, long j, long j2) {
        Intrinsics.checkNotNullParameter(list, "mutationEvents");
        this.f36522a = list;
        this.f36523b = z;
        this.f36524c = z2;
        this.f36525d = j;
        this.f36526e = j2;
    }

    /* renamed from: a */
    public final boolean mo36533a() {
        return this.f36524c;
    }

    /* renamed from: b */
    public final List<C14374ga> mo36534b() {
        return this.f36522a;
    }

    /* renamed from: c */
    public final long mo36535c() {
        return this.f36526e;
    }

    /* renamed from: d */
    public final long mo36536d() {
        return this.f36525d;
    }

    /* renamed from: e */
    public final boolean mo36537e() {
        return this.f36523b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14753te)) {
            return false;
        }
        C14753te teVar = (C14753te) obj;
        return Intrinsics.areEqual((Object) this.f36522a, (Object) teVar.f36522a) && this.f36523b == teVar.f36523b && this.f36524c == teVar.f36524c && this.f36525d == teVar.f36525d && this.f36526e == teVar.f36526e;
    }

    public int hashCode() {
        List<C14374ga> list = this.f36522a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f36523b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f36524c;
        if (!z3) {
            z2 = z3;
        }
        return ((((i + (z2 ? 1 : 0)) * 31) + Long.hashCode(this.f36525d)) * 31) + Long.hashCode(this.f36526e);
    }

    public String toString() {
        List<C14374ga> list = this.f36522a;
        boolean z = this.f36523b;
        boolean z2 = this.f36524c;
        long j = this.f36525d;
        long j2 = this.f36526e;
        return "MutationDetected(mutationEvents=" + list + ", isSessionIdChanged=" + z + ", hasScreenNumberChanged=" + z2 + ", sessionNumber=" + j + ", pageNumber=" + j2 + ")";
    }
}
