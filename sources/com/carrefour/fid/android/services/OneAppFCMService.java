package com.carrefour.fid.android.services;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.core.p056di.providers.C36295b;
import com.google.firebase.messaging.RemoteMessage;
import com.urbanairship.push.fcm.AirshipFirebaseMessagingService;
import com.urbanairship.push.fcm.C9466a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/services/OneAppFCMService;", "Lcom/urbanairship/push/fcm/AirshipFirebaseMessagingService;", "Lkotlin/d2;", "onCreate", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "", "token", "onNewToken", "Lcom/carrefour/fid/android/airship/data/datasource/e;", "a", "Lcom/carrefour/fid/android/airship/data/datasource/e;", "l", "()Lcom/carrefour/fid/android/airship/data/datasource/e;", "m", "(Lcom/carrefour/fid/android/airship/data/datasource/e;)V", "audienceTrackingManager", "<init>", "()V", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class OneAppFCMService extends AirshipFirebaseMessagingService {
    @C12579k

    /* renamed from: b */
    public static final C28440a f68534b = new C28440a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f68535c = 8;
    @C12579k

    /* renamed from: d */
    public static final String f68536d = "OneAppFCMService";
    @Inject

    /* renamed from: a */
    public C13747e f68537a;

    /* renamed from: com.carrefour.fid.android.services.OneAppFCMService$a */
    public static final class C28440a {
        public /* synthetic */ C28440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28440a() {
        }
    }

    @C12579k
    /* renamed from: l */
    public final C13747e mo83327l() {
        C13747e eVar = this.f68537a;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audienceTrackingManager");
        return null;
    }

    /* renamed from: m */
    public final void mo83328m(@C12579k C13747e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f68537a = eVar;
    }

    public void onCreate() {
        super.onCreate();
        C36295b.C36296a aVar = C36295b.f89631b;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        aVar.mo108300a(applicationContext).mo34049q(this);
    }

    public void onMessageReceived(@C12579k RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        C9466a.m35574c(getApplicationContext(), remoteMessage);
    }

    public void onNewToken(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        super.onNewToken(str);
        C9466a.m35575d(getApplicationContext());
    }
}
