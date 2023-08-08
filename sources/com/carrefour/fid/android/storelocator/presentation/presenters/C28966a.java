package com.carrefour.fid.android.storelocator.presentation.presenters;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.OneAppApplication;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.carrefour.fid.android.storelocator.presentation.contracts.C28960b;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.storelocator.presentation.presenters.a */
public class C28966a implements C28960b {

    /* renamed from: b */
    public static final int f71021b = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f71022a;

    public C28966a() {
        this((C13783a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo84295a() {
        C13783a.m58668o(this.f71022a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "store-page"), C11078d1.m42659a("screen_name", "presentation-choisir-un-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28531e0.f69087q)), false, 2, (Object) null);
    }

    @C12579k
    /* renamed from: b */
    public final C13783a mo84343b() {
        return this.f71022a;
    }

    /* renamed from: c */
    public final void mo84344c(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f71022a = aVar;
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f71022a, "store-page", "presentation-choisir-un-magasin", (Map) null, false, false, false, 60, (Object) null);
    }

    public C28966a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "mAnalyticManager");
        this.f71022a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28966a(C13783a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OneAppApplication.f32244w.mo30856a().mo30844d() : aVar);
    }
}
