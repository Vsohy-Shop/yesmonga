package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.e */
public final class C13793e implements C13794f {
    @C12579k

    /* renamed from: a */
    public final String f33592a;
    @C12579k

    /* renamed from: b */
    public final String f33593b;
    @C12579k

    /* renamed from: c */
    public final String f33594c;

    public C13793e(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "eventCategory");
        Intrinsics.checkNotNullParameter(str2, "eventAction");
        Intrinsics.checkNotNullParameter(str3, "label");
        this.f33592a = str;
        this.f33593b = str2;
        this.f33594c = str3;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        return C10977s0.m41456W(C11078d1.m42659a(C28526d.f68933j, this.f33593b), C11078d1.m42659a(C28526d.f68929i, this.f33592a), C11078d1.m42659a(C28526d.f68937k, this.f33594c));
    }
}
