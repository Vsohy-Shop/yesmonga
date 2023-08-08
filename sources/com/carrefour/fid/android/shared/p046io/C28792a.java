package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.a */
public final class C28792a {

    /* renamed from: e */
    public static final int f70566e = 0;
    @C33608c("message")
    @C12580l

    /* renamed from: a */
    public final String f70567a;
    @C33608c("error_code")
    @C12580l

    /* renamed from: b */
    public final Integer f70568b;
    @C33608c("timestamp")
    @C12580l

    /* renamed from: c */
    public final String f70569c;
    @C33608c("more_information")
    @C12580l

    /* renamed from: d */
    public final String f70570d;

    public C28792a() {
        this((String) null, (Integer) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C28792a m119147f(C28792a aVar, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f70567a;
        }
        if ((i & 2) != 0) {
            num = aVar.f70568b;
        }
        if ((i & 4) != 0) {
            str2 = aVar.f70569c;
        }
        if ((i & 8) != 0) {
            str3 = aVar.f70570d;
        }
        return aVar.mo83815e(str, num, str2, str3);
    }

    @C12580l
    /* renamed from: a */
    public final String mo83811a() {
        return this.f70567a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo83812b() {
        return this.f70568b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo83813c() {
        return this.f70569c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo83814d() {
        return this.f70570d;
    }

    @C12579k
    /* renamed from: e */
    public final C28792a mo83815e(@C12580l String str, @C12580l Integer num, @C12580l String str2, @C12580l String str3) {
        return new C28792a(str, num, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28792a)) {
            return false;
        }
        C28792a aVar = (C28792a) obj;
        return Intrinsics.areEqual((Object) this.f70567a, (Object) aVar.f70567a) && Intrinsics.areEqual((Object) this.f70568b, (Object) aVar.f70568b) && Intrinsics.areEqual((Object) this.f70569c, (Object) aVar.f70569c) && Intrinsics.areEqual((Object) this.f70570d, (Object) aVar.f70570d);
    }

    @C12580l
    /* renamed from: g */
    public final Integer mo83817g() {
        return this.f70568b;
    }

    @C12580l
    /* renamed from: h */
    public final String mo83818h() {
        return this.f70567a;
    }

    public int hashCode() {
        String str = this.f70567a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f70568b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f70569c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70570d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo83820i() {
        return this.f70570d;
    }

    @C12580l
    /* renamed from: j */
    public final String mo83821j() {
        return this.f70569c;
    }

    @C12579k
    public String toString() {
        String str = this.f70567a;
        Integer num = this.f70568b;
        String str2 = this.f70569c;
        String str3 = this.f70570d;
        return "OneAppServerError(message=" + str + ", errorCode=" + num + ", timeStamp=" + str2 + ", moreInformation=" + str3 + ")";
    }

    public C28792a(@C12580l String str, @C12580l Integer num, @C12580l String str2, @C12580l String str3) {
        this.f70567a = str;
        this.f70568b = num;
        this.f70569c = str2;
        this.f70570d = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28792a(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new String() : str2, (i & 8) != 0 ? new String() : str3);
    }
}
