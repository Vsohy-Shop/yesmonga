package com.carrefour.fid.android.domain.models.service.models;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.service.models.a */
public final class C38146a {
    @C12579k

    /* renamed from: a */
    public final String f96625a;

    public /* synthetic */ C38146a(String str) {
        this.f96625a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38146a m158071a(String str) {
        return new C38146a(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m158072b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return str;
    }

    /* renamed from: c */
    public static boolean m158073c(String str, Object obj) {
        return (obj instanceof C38146a) && Intrinsics.areEqual((Object) str, (Object) ((C38146a) obj).mo119248h());
    }

    /* renamed from: d */
    public static final boolean m158074d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m158075f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m158076g(String str) {
        return "AnabelKey(key=" + str + ")";
    }

    @C12579k
    /* renamed from: e */
    public final String mo119246e() {
        return this.f96625a;
    }

    public boolean equals(Object obj) {
        return m158073c(this.f96625a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo119248h() {
        return this.f96625a;
    }

    public int hashCode() {
        return m158075f(this.f96625a);
    }

    public String toString() {
        return m158076g(this.f96625a);
    }
}
