package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.C33033f;
import com.google.firebase.C33277p;
import com.google.firebase.inject.C33058b;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.util.C33436e;
import com.google.firebase.remoteconfig.C33563l;
import com.google.firebase.remoteconfig.C33568o;
import com.google.firebase.remoteconfig.C33584t;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final C33363a logger = C33363a.m134449e();
    private final ConcurrentHashMap<String, C33568o> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final C33310d cache;
    private final Executor executor;
    @C0363p0
    private C33563l firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    @C0363p0
    private C33058b<C33584t> firebaseRemoteConfigProvider;

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(C33310d.m134380h(), new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue()), (C33563l) null, ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)) + 5000, getInitialStartupMillis());
    }

    @C40974d0
    public static long getInitialStartupMillis() {
        C33277p pVar = (C33277p) C33033f.m133333p().mo95720l(C33277p.class);
        if (pVar != null) {
            return pVar.mo94599c();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private C33568o getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        C33568o oVar = this.allRcConfigMap.get(str);
        if (oVar.getSource() != 2) {
            return null;
        }
        logger.mo96430b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", oVar.mo97377b(), str);
        return oVar;
    }

    @C40974d0
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m134325xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.mo97398o());
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m134326xc904e814(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (!hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) || !hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return false;
        }
        return true;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.mo97397n().mo87728l(this.executor, new C33311e(this)).mo87725i(this.executor, new C33312f(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.mo97398o());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public C33436e<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.mo96429a("The key to get Remote Config boolean value is null.");
            return C33436e.m134825a();
        }
        C33568o remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C33436e.m134827e(Boolean.valueOf(remoteConfigValue.mo97380e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo97377b().isEmpty()) {
                    logger.mo96430b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo97377b(), str);
                }
            }
        }
        return C33436e.m134825a();
    }

    @C40974d0
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C33436e<Float> getFloat(String str) {
        if (str == null) {
            logger.mo96429a("The key to get Remote Config float value is null.");
            return C33436e.m134825a();
        }
        C33568o remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C33436e.m134827e(Float.valueOf(Double.valueOf(remoteConfigValue.mo97379d()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo97377b().isEmpty()) {
                    logger.mo96430b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo97377b(), str);
                }
            }
        }
        return C33436e.m134825a();
    }

    public C33436e<Long> getLong(String str) {
        if (str == null) {
            logger.mo96429a("The key to get Remote Config long value is null.");
            return C33436e.m134825a();
        }
        C33568o remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C33436e.m134827e(Long.valueOf(remoteConfigValue.mo97378c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo97377b().isEmpty()) {
                    logger.mo96430b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo97377b(), str);
                }
            }
        }
        return C33436e.m134825a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r8, T r9) {
        /*
            r7 = this;
            com.google.firebase.remoteconfig.o r0 = r7.getRemoteConfigValue(r8)
            if (r0 == 0) goto L_0x0075
            r1 = 1
            r2 = 0
            boolean r3 = r9 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x0016
            boolean r3 = r0.mo97380e()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
        L_0x0014:
            r9 = r8
            goto L_0x0075
        L_0x0016:
            boolean r3 = r9 instanceof java.lang.Float     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x002b
            double r3 = r0.mo97379d()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            float r3 = r3.floatValue()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Float r8 = java.lang.Float.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x002b:
            boolean r3 = r9 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 != 0) goto L_0x0050
            boolean r3 = r9 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x0034
            goto L_0x0050
        L_0x0034:
            boolean r3 = r9 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x003d
            java.lang.String r8 = r0.mo97377b()     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x003d:
            java.lang.String r3 = r0.mo97377b()     // Catch:{ IllegalArgumentException -> 0x0059 }
            com.google.firebase.perf.logging.a r4 = logger     // Catch:{ IllegalArgumentException -> 0x004e }
            java.lang.String r5 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IllegalArgumentException -> 0x004e }
            r6[r2] = r9     // Catch:{ IllegalArgumentException -> 0x004e }
            r4.mo96430b(r5, r6)     // Catch:{ IllegalArgumentException -> 0x004e }
            r9 = r3
            goto L_0x0075
        L_0x004e:
            r9 = r3
            goto L_0x0059
        L_0x0050:
            long r3 = r0.mo97378c()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x0059:
            java.lang.String r3 = r0.mo97377b()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0075
            com.google.firebase.perf.logging.a r3 = logger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.mo97377b()
            r4[r2] = r0
            r4[r1] = r8
            java.lang.String r8 = "Could not parse value: '%s' for key: '%s'."
            r3.mo96430b(r8, r4)
        L_0x0075:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public C33436e<String> getString(String str) {
        if (str == null) {
            logger.mo96429a("The key to get Remote Config String value is null.");
            return C33436e.m134825a();
        }
        C33568o remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return C33436e.m134827e(remoteConfigValue.mo97377b());
        }
        return C33436e.m134825a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        C33058b<C33584t> bVar;
        C33584t tVar;
        if (!(this.firebaseRemoteConfig != null || (bVar = this.firebaseRemoteConfigProvider) == null || (tVar = bVar.get()) == null)) {
            this.firebaseRemoteConfig = tVar.mo97417c(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        C33563l lVar = this.firebaseRemoteConfig;
        if (lVar == null || lVar.mo97401r().mo97371c() == 1) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(@C0363p0 C33058b<C33584t> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    @C40974d0
    public void syncConfigValues(Map<String, C33568o> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
        ConfigurationConstants.C33290c f = ConfigurationConstants.C33290c.m134230f();
        C33568o oVar = this.allRcConfigMap.get(f.mo96308d());
        if (oVar != null) {
            try {
                this.cache.mo96397p(f.mo96307b(), oVar.mo97380e());
            } catch (Exception unused) {
                logger.mo96429a("ExperimentTTID remote config flag has invalid value, expected boolean.");
            }
        } else {
            logger.mo96429a("ExperimentTTID remote config flag does not exist.");
        }
    }

    @C40974d0
    public RemoteConfigManager(C33310d dVar, Executor executor2, C33563l lVar, long j, long j2) {
        ConcurrentHashMap<String, C33568o> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
        this.cache = dVar;
        this.executor = executor2;
        this.firebaseRemoteConfig = lVar;
        if (lVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(lVar.mo97398o());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }
}
