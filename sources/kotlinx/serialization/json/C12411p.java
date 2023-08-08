package kotlinx.serialization.json;

import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12364c0;
import kotlinx.serialization.modules.C12434e;
import kotlinx.serialization.modules.C12436g;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.p */
public final class C12411p extends C12341a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12411p(@C12579k C12354g gVar, @C12579k C12434e eVar) {
        super(gVar, eVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(eVar, "module");
        mo25551l();
    }

    /* renamed from: l */
    public final void mo25551l() {
        if (!Intrinsics.areEqual((Object) mo25277a(), (Object) C12436g.m50300a())) {
            mo25277a().mo25578a(new C12364c0(mo25282h().mo25367m(), mo25282h().mo25359c()));
        }
    }
}
