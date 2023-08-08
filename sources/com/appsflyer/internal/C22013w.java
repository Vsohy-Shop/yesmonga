package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.w */
final class C22013w implements SensorEventListener {
    final float[][] AFInAppEventParameterName = new float[2][];
    final long[] AFInAppEventType = new long[2];
    long AFKeystoreWrapper;
    @NonNull
    private final String AFLogger$LogLevel;
    private final Executor AFVersionDeclaration;
    private final int AppsFlyer2dXConversionCallback;
    @NonNull
    private final String init;
    double valueOf;
    private final int values;

    public C22013w(Sensor sensor, Executor executor) {
        this.AFVersionDeclaration = executor;
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        String str = "";
        name = name == null ? str : name;
        this.init = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.AFLogger$LogLevel = str;
        this.AppsFlyer2dXConversionCallback = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    @NonNull
    private Map<String, Object> AFInAppEventParameterName() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.init);
        concurrentHashMap.put("sV", this.AFLogger$LogLevel);
        float[] fArr = this.AFInAppEventParameterName[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFKeystoreWrapper(fArr));
        }
        float[] fArr2 = this.AFInAppEventParameterName[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFKeystoreWrapper(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean AFInAppEventType(int i, @NonNull String str, @NonNull String str2) {
        return this.values == i && this.init.equals(str) && this.AFLogger$LogLevel.equals(str2);
    }

    @NonNull
    private static List<Float> AFKeystoreWrapper(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf2 : fArr) {
            arrayList.add(Float.valueOf(valueOf2));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22013w)) {
            return false;
        }
        C22013w wVar = (C22013w) obj;
        return AFInAppEventType(wVar.values, wVar.init, wVar.AFLogger$LogLevel);
    }

    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.AFVersionDeclaration.execute(new Runnable() {
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                C22013w wVar = C22013w.this;
                float[][] fArr = wVar.AFInAppEventParameterName;
                float[] fArr2 = fArr[0];
                if (fArr2 == null) {
                    float[] fArr3 = fArr;
                    fArr[0] = Arrays.copyOf(fArr3, fArr3.length);
                    C22013w.this.AFInAppEventType[0] = currentTimeMillis;
                    return;
                }
                float[] fArr4 = fArr[1];
                if (fArr4 == null) {
                    float[] fArr5 = fArr;
                    float[] copyOf = Arrays.copyOf(fArr5, fArr5.length);
                    C22013w wVar2 = C22013w.this;
                    wVar2.AFInAppEventParameterName[1] = copyOf;
                    wVar2.AFInAppEventType[1] = currentTimeMillis;
                    wVar2.valueOf = C22013w.AFKeystoreWrapper(fArr2, copyOf);
                    return;
                }
                long j = j;
                if (50000000 <= j - wVar.AFKeystoreWrapper) {
                    wVar.AFKeystoreWrapper = j;
                    if (Arrays.equals(fArr4, fArr)) {
                        C22013w.this.AFInAppEventType[1] = currentTimeMillis;
                        return;
                    }
                    double AFKeystoreWrapper = C22013w.AFKeystoreWrapper(fArr2, fArr);
                    C22013w wVar3 = C22013w.this;
                    if (AFKeystoreWrapper > wVar3.valueOf) {
                        float[][] fArr6 = wVar3.AFInAppEventParameterName;
                        float[] fArr7 = fArr;
                        fArr6[1] = Arrays.copyOf(fArr7, fArr7.length);
                        C22013w wVar4 = C22013w.this;
                        wVar4.AFInAppEventType[1] = currentTimeMillis;
                        wVar4.valueOf = AFKeystoreWrapper;
                    }
                }
            }
        });
    }

    public final void values(@NonNull Map<C22013w, Map<String, Object>> map, boolean z) {
        if (AFInAppEventType()) {
            map.put(this, AFInAppEventParameterName());
            if (z) {
                int length = this.AFInAppEventParameterName.length;
                for (int i = 0; i < length; i++) {
                    this.AFInAppEventParameterName[i] = null;
                }
                int length2 = this.AFInAppEventType.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.AFInAppEventType[i2] = 0;
                }
                this.valueOf = 0.0d;
                this.AFKeystoreWrapper = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, AFInAppEventParameterName());
        }
    }

    private boolean AFInAppEventType() {
        return this.AFInAppEventParameterName[0] != null;
    }

    public static /* synthetic */ double AFKeystoreWrapper(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }
}
