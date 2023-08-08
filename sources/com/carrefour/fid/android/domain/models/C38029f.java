package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.f */
public final class C38029f {

    /* renamed from: d */
    public static final int f95855d = 8;
    @C12579k

    /* renamed from: a */
    public String f95856a;
    @C12579k

    /* renamed from: b */
    public String f95857b;
    @C12579k

    /* renamed from: c */
    public String f95858c;

    public C38029f() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117688a() {
        return this.f95856a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117689b() {
        return this.f95858c;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117690c() {
        return this.f95857b;
    }

    /* renamed from: d */
    public final void mo117691d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f95856a = str;
    }

    /* renamed from: e */
    public final void mo117692e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f95858c = str;
    }

    /* renamed from: f */
    public final void mo117693f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f95857b = str;
    }

    public C38029f(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "damId");
        Intrinsics.checkNotNullParameter(str2, "imagePatternId");
        Intrinsics.checkNotNullParameter(str3, "imageName");
        this.f95856a = str;
        this.f95857b = str2;
        this.f95858c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38029f(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3);
    }
}
