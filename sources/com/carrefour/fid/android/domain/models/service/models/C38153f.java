package com.carrefour.fid.android.domain.models.service.models;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.service.models.f */
public final class C38153f {
    @C12579k

    /* renamed from: a */
    public final String f96639a;

    public /* synthetic */ C38153f(String str) {
        this.f96639a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38153f m158108a(String str) {
        return new C38153f(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m158109b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ String m158110c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = new String();
        }
        return m158109b(str);
    }

    /* renamed from: d */
    public static boolean m158111d(String str, Object obj) {
        return (obj instanceof C38153f) && Intrinsics.areEqual((Object) str, (Object) ((C38153f) obj).mo119289i());
    }

    /* renamed from: e */
    public static final boolean m158112e(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: g */
    public static int m158113g(String str) {
        return str.hashCode();
    }

    /* renamed from: h */
    public static String m158114h(String str) {
        return "MetiRef(id=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m158111d(this.f96639a, obj);
    }

    @C12579k
    /* renamed from: f */
    public final String mo119287f() {
        return this.f96639a;
    }

    public int hashCode() {
        return m158113g(this.f96639a);
    }

    /* renamed from: i */
    public final /* synthetic */ String mo119289i() {
        return this.f96639a;
    }

    public String toString() {
        return m158114h(this.f96639a);
    }
}
