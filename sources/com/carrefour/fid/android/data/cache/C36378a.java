package com.carrefour.fid.android.data.cache;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28484f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.cache.a */
public final class C36378a extends C28484f<String> {

    /* renamed from: i */
    public static final int f89981i = 0;
    @C12579k

    /* renamed from: g */
    public final String f89982g;

    /* renamed from: h */
    public final boolean f89983h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36378a(String str, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? 900000 : j);
    }

    @C12579k
    /* renamed from: d */
    public final String mo108644d() {
        return this.f89982g;
    }

    /* renamed from: e */
    public final boolean mo108645e() {
        return this.f89983h;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36378a(@C12579k String str, boolean z, long j) {
        super(str, j);
        Intrinsics.checkNotNullParameter(str, "trackingUrl");
        this.f89982g = str;
        this.f89983h = z;
    }
}
