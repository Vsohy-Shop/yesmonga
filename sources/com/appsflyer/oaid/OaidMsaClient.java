package com.appsflyer.oaid;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import com.appsflyer.oaid.OaidClient;
import com.bun.miitmdid.core.MdidSdkHelper;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IdSupplier;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

class OaidMsaClient {
    @C0363p0
    public static OaidClient.Info fetchMsa(Context context, final Logger logger, long j, TimeUnit timeUnit) {
        boolean z;
        String str;
        try {
            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            if (logger.getLevel() == null) {
                z = true;
            } else {
                z = false;
            }
            int InitSdk = MdidSdkHelper.InitSdk(context, z, new IIdentifierListener() {
                public void OnSupport(boolean z, IdSupplier idSupplier) {
                    String str;
                    try {
                        BlockingQueue blockingQueue = linkedBlockingQueue;
                        if (idSupplier == null) {
                            str = "";
                        } else {
                            str = idSupplier.getOAID();
                        }
                        blockingQueue.offer(str);
                    } catch (Throwable th) {
                        logger.info(th.getMessage());
                    }
                }
            });
            if (InitSdk != 0) {
                switch (InitSdk) {
                    case 1008610:
                        str = "Init error begin";
                        break;
                    case 1008611:
                        str = "Unsupported manufacturer";
                        break;
                    case 1008612:
                        str = "Unsupported device";
                        break;
                    case 1008613:
                        str = "Error loading configuration file";
                        break;
                    case 1008614:
                        str = "Callback will be executed in a different thread";
                        break;
                    case 1008615:
                        str = "Reflection call error";
                        break;
                    default:
                        str = String.valueOf(InitSdk);
                        break;
                }
                logger.warning(str);
            }
            String str2 = (String) linkedBlockingQueue.poll(j, timeUnit);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            return new OaidClient.Info(str2);
        } catch (Throwable th) {
            logger.info(th.getMessage());
            return null;
        }
    }
}
