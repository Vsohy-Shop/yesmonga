package com.carrefour.fid.android.service.presentation.analytics.delivery;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.service.presentation.analytics.ServiceAnalyticsEventFactoryKt;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliverySummaryAnalyticsReporter;", "", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "type", "Lkotlin/d2;", "tagScreenView", "tagOnStartShoppingPressed", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "", "screenName", "Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class DeliverySummaryAnalyticsReporter {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    public static final String SCREEN_NAME_CLCV = "recap-choix-livraison-standard";
    @C12579k
    public static final String SCREEN_NAME_H1H3 = "recap-choix-lex";
    @C12579k
    private final C13783a analyticManager;
    @C12579k
    private String screenName = "recap-choix-livraison-standard";

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliverySummaryAnalyticsReporter$Companion;", "", "()V", "SCREEN_NAME_CLCV", "", "SCREEN_NAME_H1H3", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.service.presentation.model.DeliveryType[] r0 = com.carrefour.fid.android.service.presentation.model.DeliveryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.Clcv     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.H1h3     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter.WhenMappings.<clinit>():void");
        }
    }

    @Inject
    public DeliverySummaryAnalyticsReporter(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.analyticManager = aVar;
    }

    public final void tagOnStartShoppingPressed() {
        C13783a.m58668o(this.analyticManager, ServiceAnalyticsEventFactoryKt.channelSwitchEvent$default(this.screenName, "commencer-mes-courses", (String) null, 4, (Object) null), false, 2, (Object) null);
    }

    public final void tagScreenView(@C12579k DeliveryType deliveryType) {
        String str;
        Intrinsics.checkNotNullParameter(deliveryType, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[deliveryType.ordinal()];
        if (i == 1) {
            str = "recap-choix-livraison-standard";
        } else if (i == 2) {
            str = "recap-choix-lex";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = str;
        this.screenName = str2;
        C13783a.m58667i(this.analyticManager, "channel-switch", str2, (Map) null, false, false, false, 60, (Object) null);
    }
}
