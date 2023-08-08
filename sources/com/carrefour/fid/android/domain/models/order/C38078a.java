package com.carrefour.fid.android.domain.models.order;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.order.a */
public final class C38078a {
    @C12579k

    /* renamed from: a */
    public final String f96196a;

    public /* synthetic */ C38078a(String str) {
        this.f96196a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38078a m157200a(String str) {
        return new C38078a(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m157201b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return str;
    }

    /* renamed from: c */
    public static boolean m157202c(String str, Object obj) {
        return (obj instanceof C38078a) && Intrinsics.areEqual((Object) str, (Object) ((C38078a) obj).mo118253h());
    }

    /* renamed from: d */
    public static final boolean m157203d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m157204f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m157205g(String str) {
        return "OrderId(id=" + str + ")";
    }

    @C12579k
    /* renamed from: e */
    public final String mo118251e() {
        return this.f96196a;
    }

    public boolean equals(Object obj) {
        return m157202c(this.f96196a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo118253h() {
        return this.f96196a;
    }

    public int hashCode() {
        return m157204f(this.f96196a);
    }

    public String toString() {
        return m157205g(this.f96196a);
    }
}
