package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.l */
public final class C38042l {

    /* renamed from: e */
    public static final int f95896e = 8;
    @C12579k

    /* renamed from: a */
    public String f95897a;
    @C12579k

    /* renamed from: b */
    public final HashMap<String, String> f95898b;
    @C12579k

    /* renamed from: c */
    public final String f95899c;
    @C12580l

    /* renamed from: d */
    public final String f95900d;

    public C38042l(@C12579k String str, @C12579k HashMap<String, String> hashMap, @C12579k String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "storeRef");
        Intrinsics.checkNotNullParameter(hashMap, "critizrParams");
        Intrinsics.checkNotNullParameter(str2, "newCustomer");
        this.f95897a = str;
        this.f95898b = hashMap;
        this.f95899c = str2;
        this.f95900d = str3;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo117788a() {
        return this.f95898b;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117789b() {
        return this.f95899c;
    }

    @C12580l
    /* renamed from: c */
    public final String mo117790c() {
        return this.f95900d;
    }

    @C12579k
    /* renamed from: d */
    public final String mo117791d() {
        return this.f95897a;
    }

    /* renamed from: e */
    public final void mo117792e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f95897a = str;
    }
}
