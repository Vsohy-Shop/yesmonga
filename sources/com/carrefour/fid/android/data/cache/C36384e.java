package com.carrefour.fid.android.data.cache;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.FrequentSaleDomain;
import com.carrefour.fid.android.shared.base.C28484f;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.cache.e */
public final class C36384e extends C28484f<List<? extends FrequentSaleDomain>> {
    @C12579k

    /* renamed from: k */
    public static final C36385a f89992k = new C36385a((DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final int f89993l = 8;

    /* renamed from: m */
    public static final long f89994m = 0;
    @C12579k

    /* renamed from: g */
    public String f89995g;
    @C12579k

    /* renamed from: h */
    public String f89996h;
    @C12579k

    /* renamed from: i */
    public String f89997i;
    @C12579k

    /* renamed from: j */
    public String f89998j;

    /* renamed from: com.carrefour.fid.android.data.cache.e$a */
    public static final class C36385a {
        public /* synthetic */ C36385a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C36385a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36384e(String str, String str2, String str3, String str4, List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, (i & 32) != 0 ? 0 : j);
    }

    /* renamed from: d */
    public final boolean mo108648d(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "customerId");
        Intrinsics.checkNotNullParameter(str2, "localUid");
        Intrinsics.checkNotNullParameter(str3, "storeId");
        Intrinsics.checkNotNullParameter(str4, "widgetId");
        if (!Intrinsics.areEqual((Object) str, (Object) this.f89995g) || !Intrinsics.areEqual((Object) str2, (Object) this.f89996h) || !Intrinsics.areEqual((Object) str3, (Object) this.f89997i) || !Intrinsics.areEqual((Object) str4, (Object) this.f89998j) || !mo83405c()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36384e(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k List<FrequentSaleDomain> list, long j) {
        super(list, j);
        Intrinsics.checkNotNullParameter(str, "customerId");
        Intrinsics.checkNotNullParameter(str2, "localUid");
        Intrinsics.checkNotNullParameter(str3, "storeId");
        Intrinsics.checkNotNullParameter(str4, "widgetId");
        Intrinsics.checkNotNullParameter(list, "data");
        this.f89995g = str;
        this.f89996h = str2;
        this.f89997i = str3;
        this.f89998j = str4;
    }
}
