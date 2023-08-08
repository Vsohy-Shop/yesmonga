package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.appsflyer.internal.ac */
public final class C21850ac {
    private static final BitSet AFLogger$LogLevel;
    private static final Handler AFVersionDeclaration = new Handler(Looper.getMainLooper());
    @VisibleForTesting
    private static volatile C21850ac AppsFlyer2dXConversionCallback;
    final Handler AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    final Runnable AFKeystoreWrapper;
    /* access modifiers changed from: package-private */
    public final Executor getLevel;
    final Runnable init;
    private long onAppOpenAttribution;
    /* access modifiers changed from: private */
    public boolean onAppOpenAttributionNative;
    /* access modifiers changed from: private */
    public final Map<C22013w, C22013w> onAttributionFailureNative;
    /* access modifiers changed from: private */
    public final SensorManager onDeepLinkingNative;
    /* access modifiers changed from: private */
    public int onInstallConversionDataLoadedNative;
    /* access modifiers changed from: private */
    public final Map<C22013w, Map<String, Object>> onInstallConversionFailureNative;
    /* access modifiers changed from: private */
    public final Runnable onResponseNative;
    final Object valueOf = new Object();
    boolean values;

    static {
        BitSet bitSet = new BitSet(6);
        AFLogger$LogLevel = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private C21850ac(@NonNull SensorManager sensorManager, Handler handler) {
        BitSet bitSet = AFLogger$LogLevel;
        this.onAttributionFailureNative = new HashMap(bitSet.size());
        this.onInstallConversionFailureNative = new ConcurrentHashMap(bitSet.size());
        this.AFKeystoreWrapper = new Runnable() {
            public final void run() {
                synchronized (C21850ac.this.valueOf) {
                    C21850ac acVar = C21850ac.this;
                    acVar.getLevel.execute(new Runnable() {
                        public final void run() {
                            try {
                                for (Sensor next : C21850ac.this.onDeepLinkingNative.getSensorList(-1)) {
                                    if (C21850ac.values(next.getType())) {
                                        C22013w wVar = new C22013w(next, C21850ac.this.getLevel);
                                        if (!C21850ac.this.onAttributionFailureNative.containsKey(wVar)) {
                                            C21850ac.this.onAttributionFailureNative.put(wVar, wVar);
                                        }
                                        C21850ac.this.onDeepLinkingNative.registerListener((SensorEventListener) C21850ac.this.onAttributionFailureNative.get(wVar), next, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            boolean unused2 = C21850ac.this.onAppOpenAttributionNative = true;
                        }
                    });
                    C21850ac acVar2 = C21850ac.this;
                    acVar2.AFInAppEventParameterName.postDelayed(acVar2.onResponseNative, 100);
                    C21850ac.this.values = true;
                }
            }
        };
        this.AFInAppEventType = new Runnable() {
            public final void run() {
                synchronized (C21850ac.this.valueOf) {
                    C21850ac acVar = C21850ac.this;
                    acVar.getLevel.execute(new Runnable() {
                        public final void run() {
                            try {
                                if (!C21850ac.this.onAttributionFailureNative.isEmpty()) {
                                    for (C22013w wVar : C21850ac.this.onAttributionFailureNative.values()) {
                                        C21850ac.this.onDeepLinkingNative.unregisterListener(wVar);
                                        wVar.values(C21850ac.this.onInstallConversionFailureNative, true);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            int unused2 = C21850ac.this.onInstallConversionDataLoadedNative = 0;
                            boolean unused3 = C21850ac.this.onAppOpenAttributionNative = false;
                        }
                    });
                }
            }
        };
        this.init = new Runnable() {
            public final void run() {
                synchronized (C21850ac.this.valueOf) {
                    C21850ac acVar = C21850ac.this;
                    if (acVar.values) {
                        acVar.AFInAppEventParameterName.removeCallbacks(acVar.AFKeystoreWrapper);
                        C21850ac acVar2 = C21850ac.this;
                        acVar2.AFInAppEventParameterName.removeCallbacks(acVar2.AFInAppEventType);
                        C21850ac acVar3 = C21850ac.this;
                        acVar3.getLevel.execute(new Runnable() {
                            public final void run() {
                                try {
                                    if (!C21850ac.this.onAttributionFailureNative.isEmpty()) {
                                        for (C22013w wVar : C21850ac.this.onAttributionFailureNative.values()) {
                                            C21850ac.this.onDeepLinkingNative.unregisterListener(wVar);
                                            wVar.values(C21850ac.this.onInstallConversionFailureNative, true);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                                int unused2 = C21850ac.this.onInstallConversionDataLoadedNative = 0;
                                boolean unused3 = C21850ac.this.onAppOpenAttributionNative = false;
                            }
                        });
                        C21850ac.this.values = false;
                    }
                }
            }
        };
        this.onInstallConversionDataLoadedNative = 1;
        this.onAppOpenAttribution = 0;
        this.onResponseNative = new Runnable() {
            public final void run() {
                synchronized (C21850ac.this.valueOf) {
                    if (C21850ac.this.onInstallConversionDataLoadedNative == 0) {
                        int unused = C21850ac.this.onInstallConversionDataLoadedNative = 1;
                    }
                    C21850ac acVar = C21850ac.this;
                    acVar.AFInAppEventParameterName.postDelayed(acVar.AFInAppEventType, ((long) acVar.onInstallConversionDataLoadedNative) * 500);
                }
            }
        };
        this.getLevel = Executors.newSingleThreadExecutor();
        this.onDeepLinkingNative = sensorManager;
        this.AFInAppEventParameterName = handler;
    }

    public static C21850ac AFInAppEventType(Context context) {
        if (AppsFlyer2dXConversionCallback != null) {
            return AppsFlyer2dXConversionCallback;
        }
        return AFInAppEventParameterName((SensorManager) context.getApplicationContext().getSystemService("sensor"), AFVersionDeclaration);
    }

    /* access modifiers changed from: private */
    public static boolean values(int i) {
        return i >= 0 && AFLogger$LogLevel.get(i);
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> AFInAppEventType2 = AFInAppEventType();
        if (!AFInAppEventType2.isEmpty()) {
            concurrentHashMap.put("sensors", AFInAppEventType2);
        } else {
            List<Map<String, Object>> valueOf2 = valueOf();
            if (!valueOf2.isEmpty()) {
                concurrentHashMap.put("sensors", valueOf2);
            }
        }
        return concurrentHashMap;
    }

    private static C21850ac AFInAppEventParameterName(SensorManager sensorManager, Handler handler) {
        if (AppsFlyer2dXConversionCallback == null) {
            synchronized (C21850ac.class) {
                if (AppsFlyer2dXConversionCallback == null) {
                    AppsFlyer2dXConversionCallback = new C21850ac(sensorManager, handler);
                }
            }
        }
        return AppsFlyer2dXConversionCallback;
    }

    public final void values() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.onAppOpenAttribution;
        if (j != 0) {
            this.onInstallConversionDataLoadedNative++;
            if (j - currentTimeMillis < 500) {
                this.AFInAppEventParameterName.removeCallbacks(this.AFInAppEventType);
                this.AFInAppEventParameterName.post(this.AFKeystoreWrapper);
            }
        } else {
            this.AFInAppEventParameterName.post(this.init);
            this.AFInAppEventParameterName.post(this.AFKeystoreWrapper);
        }
        this.onAppOpenAttribution = currentTimeMillis;
    }

    public final List<Map<String, Object>> valueOf() {
        for (C22013w values2 : this.onAttributionFailureNative.values()) {
            values2.values(this.onInstallConversionFailureNative, true);
        }
        Map<C22013w, Map<String, Object>> map = this.onInstallConversionFailureNative;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.onInstallConversionFailureNative.values());
    }

    @NonNull
    private List<Map<String, Object>> AFInAppEventType() {
        synchronized (this.valueOf) {
            if (!this.onAttributionFailureNative.isEmpty() && this.onAppOpenAttributionNative) {
                for (C22013w values2 : this.onAttributionFailureNative.values()) {
                    values2.values(this.onInstallConversionFailureNative, false);
                }
            }
            if (this.onInstallConversionFailureNative.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Collections.emptyList());
                return copyOnWriteArrayList;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(this.onInstallConversionFailureNative.values());
            return copyOnWriteArrayList2;
        }
    }
}
