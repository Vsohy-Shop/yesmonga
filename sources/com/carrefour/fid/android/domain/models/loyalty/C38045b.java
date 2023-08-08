package com.carrefour.fid.android.domain.models.loyalty;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.loyalty.b */
public final class C38045b {
    @C12579k

    /* renamed from: a */
    public final String f95920a;

    public /* synthetic */ C38045b(String str) {
        this.f95920a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38045b m156904a(String str) {
        return new C38045b(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m156905b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "number");
        return str;
    }

    /* renamed from: c */
    public static boolean m156906c(String str, Object obj) {
        return (obj instanceof C38045b) && Intrinsics.areEqual((Object) str, (Object) ((C38045b) obj).mo117869h());
    }

    /* renamed from: d */
    public static final boolean m156907d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m156908f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m156909g(String str) {
        return "LoyaltyCardNumber(number=" + str + ")";
    }

    @C12579k
    /* renamed from: e */
    public final String mo117867e() {
        return this.f95920a;
    }

    public boolean equals(Object obj) {
        return m156906c(this.f95920a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo117869h() {
        return this.f95920a;
    }

    public int hashCode() {
        return m156908f(this.f95920a);
    }

    public String toString() {
        return m156909g(this.f95920a);
    }
}
