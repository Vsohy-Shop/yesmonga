package com.carrefour.fid.android.domain.models.catalog;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.catalog.c */
public final class C37978c {
    @C12579k

    /* renamed from: a */
    public final String f95564a;

    public /* synthetic */ C37978c(String str) {
        this.f95564a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C37978c m156226a(String str) {
        return new C37978c(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m156227b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ String m156228c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = new String();
        }
        return m156227b(str);
    }

    /* renamed from: d */
    public static boolean m156229d(String str, Object obj) {
        return (obj instanceof C37978c) && Intrinsics.areEqual((Object) str, (Object) ((C37978c) obj).mo117092i());
    }

    /* renamed from: e */
    public static final boolean m156230e(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: g */
    public static int m156231g(String str) {
        return str.hashCode();
    }

    /* renamed from: h */
    public static String m156232h(String str) {
        return "CatalogStoreId(id=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m156229d(this.f95564a, obj);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117090f() {
        return this.f95564a;
    }

    public int hashCode() {
        return m156231g(this.f95564a);
    }

    /* renamed from: i */
    public final /* synthetic */ String mo117092i() {
        return this.f95564a;
    }

    public String toString() {
        return m156232h(this.f95564a);
    }
}
