package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.journeyapps.barcodescanner.camera.C34923i;
import com.journeyapps.barcodescanner.camera.CameraSettings;

/* renamed from: com.google.zxing.client.android.b */
public final class C34647b implements SensorEventListener {

    /* renamed from: f */
    public static final float f83820f = 45.0f;

    /* renamed from: g */
    public static final float f83821g = 450.0f;

    /* renamed from: a */
    public C34923i f83822a;

    /* renamed from: b */
    public CameraSettings f83823b;

    /* renamed from: c */
    public Sensor f83824c;

    /* renamed from: d */
    public Context f83825d;

    /* renamed from: e */
    public Handler f83826e = new Handler();

    public C34647b(Context context, C34923i iVar, CameraSettings cameraSettings) {
        this.f83825d = context;
        this.f83822a = iVar;
        this.f83823b = cameraSettings;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m141334b(boolean z) {
        this.f83822a.mo103444A(z);
    }

    /* renamed from: c */
    public final void mo102493c(boolean z) {
        this.f83826e.post(new C34646a(this, z));
    }

    /* renamed from: d */
    public void mo102494d() {
        if (this.f83823b.mo103390d()) {
            SensorManager sensorManager = (SensorManager) this.f83825d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f83824c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* renamed from: e */
    public void mo102495e() {
        if (this.f83824c != null) {
            ((SensorManager) this.f83825d.getSystemService("sensor")).unregisterListener(this);
            this.f83824c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.f83822a == null) {
            return;
        }
        if (f <= 45.0f) {
            mo102493c(true);
        } else if (f >= 450.0f) {
            mo102493c(false);
        }
    }
}
