package com.carrefour.fid.android.service.presentation.analytics.delivery;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.service.presentation.analytics.ServiceAnalyticsEventFactoryKt;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.H1h3Service;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliveryServiceSelectionAnalyticsReporter;", "", "", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;", "services", "Lkotlin/d2;", "updateScreenName", "sendScreenView", "tagChangeToDrive", "tagChangeAddress", "service", "tagServiceSelected", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "analyticManager", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "", "screenName", "Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliveryServiceSelectionAnalyticsReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryServiceSelectionAnalyticsReporter.kt\ncom/carrefour/fid/android/service/presentation/analytics/delivery/DeliveryServiceSelectionAnalyticsReporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1747#2,3:67\n1747#2,3:70\n*S KotlinDebug\n*F\n+ 1 DeliveryServiceSelectionAnalyticsReporter.kt\ncom/carrefour/fid/android/service/presentation/analytics/delivery/DeliveryServiceSelectionAnalyticsReporter\n*L\n21#1:67,3\n22#1:70,3\n*E\n"})
public final class DeliveryServiceSelectionAnalyticsReporter {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    public static final String SCREEN_NAME_NO_SERVICE = "aucun-service-livraison-disponible";
    @C12579k
    private final C13783a analyticManager;
    @C12580l
    private String screenName;

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliveryServiceSelectionAnalyticsReporter$Companion;", "", "()V", "SCREEN_NAME_NO_SERVICE", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Inject
    public DeliveryServiceSelectionAnalyticsReporter(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.analyticManager = aVar;
    }

    public final void sendScreenView() {
        String str = this.screenName;
        if (str != null) {
            C13783a.m58667i(this.analyticManager, "channel-switch", str, (Map) null, false, false, false, 60, (Object) null);
        }
    }

    public final void tagChangeAddress() {
        C13783a aVar = this.analyticManager;
        String str = this.screenName;
        if (str == null) {
            str = "aucun-service-livraison-disponible";
        }
        C13783a.m58668o(aVar, ServiceAnalyticsEventFactoryKt.channelSwitchEvent$default(str, "changer-adresse", (String) null, 4, (Object) null), false, 2, (Object) null);
    }

    public final void tagChangeToDrive() {
        C13783a aVar = this.analyticManager;
        String str = this.screenName;
        if (str == null) {
            str = "aucun-service-livraison-disponible";
        }
        C13783a.m58668o(aVar, ServiceAnalyticsEventFactoryKt.channelSwitchEvent$default(str, "changer-pour-drive", (String) null, 4, (Object) null), false, 2, (Object) null);
    }

    public final void tagServiceSelected(@C12579k DeliveryService deliveryService) {
        Intrinsics.checkNotNullParameter(deliveryService, "service");
        String str = "aucun-service-livraison-disponible";
        if (deliveryService instanceof ClcvService) {
            C13783a aVar = this.analyticManager;
            String str2 = this.screenName;
            if (str2 != null) {
                str = str2;
            }
            C13783a.m58668o(aVar, ServiceAnalyticsEventFactoryKt.channelSwitchEvent$default(str, "choix-livraison-standard", (String) null, 4, (Object) null), false, 2, (Object) null);
        } else if (deliveryService instanceof H1h3Service) {
            C13783a aVar2 = this.analyticManager;
            String str3 = this.screenName;
            if (str3 != null) {
                str = str3;
            }
            C13783a.m58668o(aVar2, ServiceAnalyticsEventFactoryKt.channelSwitchEvent$default(str, "choix-livraison-lex", (String) null, 4, (Object) null), false, 2, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0047 A[EDGE_INSN: B:44:0x0047->B:20:0x0047 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateScreenName(@org.jetbrains.annotations.C12579k java.util.List<? extends com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "services"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r0 = r8 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0019
            r4 = r8
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0019
        L_0x0017:
            r4 = r3
            goto L_0x003c
        L_0x0019:
            java.util.Iterator r4 = r8.iterator()
        L_0x001d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0017
            java.lang.Object r5 = r4.next()
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService r5 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService) r5
            boolean r6 = r5 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService
            if (r6 == 0) goto L_0x0030
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService r5 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService) r5
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            if (r5 == 0) goto L_0x0038
            boolean r5 = r5.isAvailable()
            goto L_0x0039
        L_0x0038:
            r5 = r3
        L_0x0039:
            if (r5 == 0) goto L_0x001d
            r4 = r1
        L_0x003c:
            if (r0 == 0) goto L_0x0049
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0049
        L_0x0047:
            r1 = r3
            goto L_0x006b
        L_0x0049:
            java.util.Iterator r8 = r8.iterator()
        L_0x004d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r8.next()
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService r0 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService) r0
            boolean r5 = r0 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.H1h3Service
            if (r5 == 0) goto L_0x0060
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.H1h3Service r0 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.H1h3Service) r0
            goto L_0x0061
        L_0x0060:
            r0 = r2
        L_0x0061:
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.isAvailable()
            goto L_0x0069
        L_0x0068:
            r0 = r3
        L_0x0069:
            if (r0 == 0) goto L_0x004d
        L_0x006b:
            if (r4 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            java.lang.String r8 = "livraisons-standard-lex-eligibles"
            goto L_0x0079
        L_0x0072:
            if (r4 == 0) goto L_0x0077
            java.lang.String r8 = "livraison-lex-non-eligible"
            goto L_0x0079
        L_0x0077:
            java.lang.String r8 = "aucun-service-livraison-disponible"
        L_0x0079:
            r7.screenName = r8
            r7.sendScreenView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.analytics.delivery.DeliveryServiceSelectionAnalyticsReporter.updateScreenName(java.util.List):void");
    }
}
