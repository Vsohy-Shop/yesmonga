package com.carrefour.fid.android.domain.models.product;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.product.f */
public final class C38112f {
    @C12579k

    /* renamed from: a */
    public final String f96407a;

    public /* synthetic */ C38112f(String str) {
        this.f96407a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38112f m157657a(String str) {
        return new C38112f(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m157658b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "field");
        return str;
    }

    /* renamed from: c */
    public static boolean m157659c(String str, Object obj) {
        return (obj instanceof C38112f) && Intrinsics.areEqual((Object) str, (Object) ((C38112f) obj).mo118787h());
    }

    /* renamed from: d */
    public static final boolean m157660d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m157661f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m157662g(String str) {
        return "TermField(field=" + str + ")";
    }

    @C12579k
    /* renamed from: e */
    public final String mo118785e() {
        return this.f96407a;
    }

    public boolean equals(Object obj) {
        return m157659c(this.f96407a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo118787h() {
        return this.f96407a;
    }

    public int hashCode() {
        return m157661f(this.f96407a);
    }

    public String toString() {
        return m157662g(this.f96407a);
    }
}
