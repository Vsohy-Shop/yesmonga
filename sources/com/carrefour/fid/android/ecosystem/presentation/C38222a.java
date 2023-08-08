package com.carrefour.fid.android.ecosystem.presentation;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.OneAppApplication;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.ecosystem.contrat.C38221a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.ecosystem.presentation.a */
public class C38222a implements C38221a {

    /* renamed from: b */
    public static final int f96852b = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f96853a;

    public C38222a() {
        this((C13783a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo119647a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "service");
        C13783a.m58668o(this.f96853a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "nos-services"), C11078d1.m42659a("screen_name", "ecosysteme-crf"), C11078d1.m42659a(C28526d.f68929i, "nos-services"), C11078d1.m42659a(C28526d.f68933j, StringKt.m118908Q(str))), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f96853a, "nos-services", "ecosysteme-crf", (Map) null, false, false, false, 60, (Object) null);
    }

    public C38222a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        this.f96853a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38222a(C13783a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OneAppApplication.f32244w.mo30856a().mo30844d() : aVar);
    }
}
