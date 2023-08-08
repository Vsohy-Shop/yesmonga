package com.carrefour.fid.android.domain.models.account;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.account.b */
public final class C37948b {
    @C12579k

    /* renamed from: a */
    public final String f95438a;

    public /* synthetic */ C37948b(String str) {
        this.f95438a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C37948b m155947a(String str) {
        return new C37948b(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m155948b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "number");
        return str;
    }

    /* renamed from: c */
    public static boolean m155949c(String str, Object obj) {
        return (obj instanceof C37948b) && Intrinsics.areEqual((Object) str, (Object) ((C37948b) obj).mo116781h());
    }

    /* renamed from: d */
    public static final boolean m155950d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m155951f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m155952g(String str) {
        return "Telephone(number=" + str + ")";
    }

    @C12579k
    /* renamed from: e */
    public final String mo116779e() {
        return this.f95438a;
    }

    public boolean equals(Object obj) {
        return m155949c(this.f95438a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo116781h() {
        return this.f95438a;
    }

    public int hashCode() {
        return m155951f(this.f95438a);
    }

    public String toString() {
        return m155952g(this.f95438a);
    }
}
