package com.carrefour.fid.android.domain.models.basket;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.basket.c */
public final class C37971c {
    @C12579k

    /* renamed from: a */
    public final String f95532a;

    public /* synthetic */ C37971c(String str) {
        this.f95532a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C37971c m156162a(String str) {
        return new C37971c(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m156163b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        return str;
    }

    /* renamed from: c */
    public static boolean m156164c(String str, Object obj) {
        return (obj instanceof C37971c) && Intrinsics.areEqual((Object) str, (Object) ((C37971c) obj).mo117031h());
    }

    /* renamed from: d */
    public static final boolean m156165d(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: f */
    public static int m156166f(String str) {
        return str.hashCode();
    }

    /* renamed from: g */
    public static String m156167g(String str) {
        return "PromotionCode(code=" + str + ")";
    }

    @C12579k
    /* renamed from: e */
    public final String mo117029e() {
        return this.f95532a;
    }

    public boolean equals(Object obj) {
        return m156164c(this.f95532a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ String mo117031h() {
        return this.f95532a;
    }

    public int hashCode() {
        return m156166f(this.f95532a);
    }

    public String toString() {
        return m156167g(this.f95532a);
    }
}
