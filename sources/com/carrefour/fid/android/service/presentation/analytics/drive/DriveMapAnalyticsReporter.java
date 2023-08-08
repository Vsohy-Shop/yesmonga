package com.carrefour.fid.android.service.presentation.analytics.drive;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.service.presentation.analytics.ServiceAnalyticsEventFactoryKt;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveMapAnalyticsReporter;", "", "", "driveId", "Lkotlin/d2;", "tagChooseDrive", "tagValidatePressed", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class DriveMapAnalyticsReporter {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    public static final String SCREEN_NAME = "service-disponible-drive";
    @C12579k
    private final C13783a analyticManager;

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveMapAnalyticsReporter$Companion;", "", "()V", "SCREEN_NAME", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Inject
    public DriveMapAnalyticsReporter(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.analyticManager = aVar;
    }

    public final void tagChooseDrive(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "driveId");
        C13783a.m58668o(this.analyticManager, ServiceAnalyticsEventFactoryKt.channelSwitchEvent("service-disponible-drive", "choisir-ce-drive", str), false, 2, (Object) null);
    }

    public final void tagValidatePressed() {
        C13783a.m58668o(this.analyticManager, ServiceAnalyticsEventFactoryKt.channelSwitchEvent$default("choix-drive", "valider-drive", (String) null, 4, (Object) null), false, 2, (Object) null);
    }
}
