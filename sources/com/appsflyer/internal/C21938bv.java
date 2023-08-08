package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.bv */
public final class C21938bv {
    @Nullable
    public C21897aq AFInAppEventParameterName;
    final C21937bu AFInAppEventType;
    private final C21929bn AFKeystoreWrapper;
    private final C21923bh getLevel;
    private final C21940bw init;
    public final Executor valueOf;
    final C22015x values;

    public C21938bv(C21929bn bnVar, C22015x xVar, C21940bw bwVar, C21923bh bhVar, C21937bu buVar, Executor executor) {
        this.AFKeystoreWrapper = bnVar;
        this.values = xVar;
        this.init = bwVar;
        this.getLevel = bhVar;
        this.AFInAppEventType = buVar;
        this.valueOf = executor;
    }

    @WorkerThread
    @NonNull
    public final C21933br AFInAppEventType(boolean z, String str, long j) {
        C21932bq<String> bqVar;
        String str2;
        String str3 = str;
        try {
            C21923bh bhVar = this.getLevel;
            if (z) {
                str2 = C21923bh.valueOf;
            } else {
                str2 = C21923bh.AFInAppEventParameterName;
            }
            C21846ab abVar = new C21846ab(String.format(str2, new Object[]{str3}), "GET");
            abVar.AFLogger$LogLevel = 500;
            C22010u uVar = bhVar.values;
            C21932bq values2 = new C21921bg(abVar, uVar.valueOf, uVar.AFInAppEventParameterName, new C21926bk()).values();
            if (values2.AFInAppEventType()) {
                C21896ap apVar = (C21896ap) values2.values;
                String AFKeystoreWrapper2 = values2.AFKeystoreWrapper("x-amz-meta-af-auth-v1");
                String devKey = AppsFlyerProperties.getInstance().getDevKey();
                if (devKey == null || devKey.trim().length() == 0) {
                    AFLogger.AppsFlyer2dXConversionCallback("CFG: Dev key is not set, SDK is not started.");
                    return C21933br.FAILURE;
                }
                C21898ar AFInAppEventParameterName2 = this.AFKeystoreWrapper.AFInAppEventParameterName(apVar, AFKeystoreWrapper2, str3, devKey);
                if (AFInAppEventParameterName2.AFKeystoreWrapper()) {
                    long AFKeystoreWrapper3 = this.AFInAppEventType.AFKeystoreWrapper();
                    StringBuilder sb = new StringBuilder("CFG: using max-age fallback: ");
                    sb.append(AFKeystoreWrapper3);
                    sb.append(" seconds");
                    AFLogger.AFInAppEventType(sb.toString());
                    long currentTimeMillis = System.currentTimeMillis();
                    C21940bw bwVar = this.init;
                    bwVar.AFInAppEventParameterName.AFInAppEventParameterName("af_remote_config", Base64.encodeToString(apVar.values.getBytes(C21940bw.AFInAppEventType), 2));
                    bwVar.AFInAppEventParameterName.valueOf("af_rc_timestamp", currentTimeMillis);
                    bwVar.AFInAppEventParameterName.valueOf("af_rc_max_age", AFKeystoreWrapper3);
                    bwVar.AFKeystoreWrapper = apVar;
                    bwVar.valueOf = currentTimeMillis;
                    bwVar.values = AFKeystoreWrapper3;
                    StringBuilder sb2 = new StringBuilder("CFG: Config successfully updated, timeToLive: ");
                    sb2.append(AFKeystoreWrapper3);
                    sb2.append(" seconds");
                    AFLogger.values(sb2.toString());
                    C21960cn cnVar = AFInAppEventParameterName2.AFInAppEventParameterName;
                    AFKeystoreWrapper(str, j, values2, (C21896ap) values2.values, cnVar, (Throwable) null);
                    return C21933br.SUCCESS;
                }
                C21960cn cnVar2 = AFInAppEventParameterName2.AFInAppEventParameterName;
                AFKeystoreWrapper(str, j, values2, (C21896ap) values2.values, cnVar2, (Throwable) null);
                AFLogger.AppsFlyer2dXConversionCallback("CFG: fetched config is not valid (MITM?) refuse to use it.");
                return C21933br.FAILURE;
            }
            AFKeystoreWrapper(str, j, values2, (C21896ap) values2.values, (C21960cn) null, (Throwable) null);
            StringBuilder sb3 = new StringBuilder("CFG: failed to fetch remote config from CDN with status code: ");
            sb3.append(values2.AFInAppEventType);
            AFLogger.AppsFlyer2dXConversionCallback(sb3.toString());
            return C21933br.FAILURE;
        } catch (IOException e) {
            IOException iOException = e;
            StringBuilder sb4 = new StringBuilder("CFG: failed to fetch remote config: ");
            sb4.append(iOException.getMessage());
            AFLogger.AFKeystoreWrapper(sb4.toString(), iOException);
            if (iOException instanceof ParsingException) {
                bqVar = ((ParsingException) iOException).getRawResponse();
            } else {
                bqVar = null;
            }
            AFKeystoreWrapper(str, j, bqVar, (C21896ap) null, (C21960cn) null, iOException);
            return C21933br.FAILURE;
        }
    }

    public final void AFKeystoreWrapper(String str, long j, @Nullable C21932bq<?> bqVar, C21896ap apVar, C21960cn cnVar, @Nullable Throwable th) {
        long j2;
        int i;
        Throwable th2;
        long j3;
        String str2;
        C21932bq<?> bqVar2 = bqVar;
        C21896ap apVar2 = apVar;
        Throwable th3 = th;
        if (bqVar2 != null) {
            j2 = bqVar2.AFInAppEventParameterName.valueOf;
            i = bqVar2.AFInAppEventType;
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th3 instanceof HttpException) {
            th2 = th.getCause();
            j3 = ((HttpException) th3).getMetrics().valueOf;
        } else {
            th2 = th3;
            j3 = j2;
        }
        if (apVar2 != null) {
            str2 = apVar2.AFKeystoreWrapper;
        } else {
            str2 = null;
        }
        this.AFInAppEventParameterName = new C21897aq(str2, str, j3, System.currentTimeMillis() - j, i2, cnVar, th2);
    }
}
