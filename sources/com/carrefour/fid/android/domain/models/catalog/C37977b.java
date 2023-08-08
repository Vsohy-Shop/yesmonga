package com.carrefour.fid.android.domain.models.catalog;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.catalog.b */
public final class C37977b {
    @C12579k

    /* renamed from: a */
    public final String f95563a;

    public /* synthetic */ C37977b(String str) {
        this.f95563a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C37977b m156217a(String str) {
        return new C37977b(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m156218b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ String m156219c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = new String();
        }
        return m156218b(str);
    }

    /* renamed from: d */
    public static boolean m156220d(String str, Object obj) {
        return (obj instanceof C37977b) && Intrinsics.areEqual((Object) str, (Object) ((C37977b) obj).mo117087i());
    }

    /* renamed from: e */
    public static final boolean m156221e(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: g */
    public static int m156222g(String str) {
        return str.hashCode();
    }

    /* renamed from: h */
    public static String m156223h(String str) {
        return "CatalogId(id=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m156220d(this.f95563a, obj);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117085f() {
        return this.f95563a;
    }

    public int hashCode() {
        return m156222g(this.f95563a);
    }

    /* renamed from: i */
    public final /* synthetic */ String mo117087i() {
        return this.f95563a;
    }

    public String toString() {
        return m156223h(this.f95563a);
    }
}
