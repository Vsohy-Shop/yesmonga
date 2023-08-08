package com.carrefour.fid.android.domain.models.product;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.product.a */
public final class C38102a {
    @C12579k

    /* renamed from: a */
    public final String f96344a;

    public /* synthetic */ C38102a(String str) {
        this.f96344a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38102a m157520a(String str) {
        return new C38102a(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m157521b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "field");
        return str;
    }

    /* renamed from: c */
    public static boolean m157522c(String str, Object obj) {
        return (obj instanceof C38102a) && Intrinsics.areEqual((Object) str, (Object) ((C38102a) obj).mo118656h());
    }

    /* renamed from: d */
    public static final boolean m157523d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m157524f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m157525g(String str) {
        return "FacetField(field=" + str + ")";
    }

    @C12579k
    /* renamed from: e */
    public final String mo118654e() {
        return this.f96344a;
    }

    public boolean equals(Object obj) {
        return m157522c(this.f96344a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo118656h() {
        return this.f96344a;
    }

    public int hashCode() {
        return m157524f(this.f96344a);
    }

    public String toString() {
        return m157525g(this.f96344a);
    }
}
