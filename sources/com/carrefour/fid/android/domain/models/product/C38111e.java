package com.carrefour.fid.android.domain.models.product;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.product.e */
public final class C38111e {
    @C12579k

    /* renamed from: a */
    public final String f96406a;

    public /* synthetic */ C38111e(String str) {
        this.f96406a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38111e m157649a(String str) {
        return new C38111e(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m157650b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "field");
        return str;
    }

    /* renamed from: c */
    public static boolean m157651c(String str, Object obj) {
        return (obj instanceof C38111e) && Intrinsics.areEqual((Object) str, (Object) ((C38111e) obj).mo118782h());
    }

    /* renamed from: d */
    public static final boolean m157652d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m157653f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m157654g(String str) {
        return "SortField(field=" + str + ")";
    }

    @C12579k
    /* renamed from: e */
    public final String mo118780e() {
        return this.f96406a;
    }

    public boolean equals(Object obj) {
        return m157651c(this.f96406a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo118782h() {
        return this.f96406a;
    }

    public int hashCode() {
        return m157653f(this.f96406a);
    }

    public String toString() {
        return m157654g(this.f96406a);
    }
}
