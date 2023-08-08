package com.appsflyer.oaid;

import android.content.Context;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OaidClient {
    /* access modifiers changed from: private */
    public final Context context;
    private final Logger logger;
    private final long timeout;
    private final TimeUnit unit;

    public OaidClient(Context context2, long j, TimeUnit timeUnit) {
        Logger logger2 = Logger.getLogger("AppsFlyerOaid6.2.4");
        this.logger = logger2;
        this.context = context2;
        this.timeout = j;
        this.unit = timeUnit;
        logger2.setLevel(Level.OFF);
    }

    @C0363p0
    private Info fetchHuawei() {
        try {
            FutureTask futureTask = new FutureTask(new Callable<Info>() {
                public Info call() {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(OaidClient.this.context);
                    if (advertisingIdInfo == null) {
                        return null;
                    }
                    return new Info(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                }
            });
            new Thread(futureTask).start();
            return (Info) futureTask.get(this.timeout, this.unit);
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    private static boolean isHuawei() {
        try {
            if (Build.BRAND.equalsIgnoreCase("huawei") || ((Integer) Class.forName("com.huawei.android.os.BuildEx$VERSION").getDeclaredField("EMUI_SDK_INT").get((Object) null)).intValue() > 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    private static boolean isMsaAvailableAtRuntime() {
        Class<IIdentifierListener> cls = IIdentifierListener.class;
        return true;
    }

    @C0363p0
    public Info fetch() {
        Info info;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (isHuawei()) {
                info = fetchHuawei();
            } else if (isMsaAvailableAtRuntime()) {
                info = OaidMsaClient.fetchMsa(this.context, this.logger, this.timeout, this.unit);
            } else {
                info = null;
            }
            this.logger.info("Fetch " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return info;
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    public void setLogging(boolean z) {
        this.logger.setLevel(z ? null : Level.OFF);
    }

    public static class Info {

        /* renamed from: id */
        private final String f56490id;
        private final Boolean lat;

        @C0344h1
        public Info(String str, Boolean bool) {
            this.f56490id = str;
            this.lat = bool;
        }

        public String getId() {
            return this.f56490id;
        }

        @C0363p0
        public Boolean getLat() {
            return this.lat;
        }

        public Info(String str) {
            this(str, (Boolean) null);
        }
    }

    public OaidClient(Context context2) {
        this(context2, 1, TimeUnit.SECONDS);
    }
}
