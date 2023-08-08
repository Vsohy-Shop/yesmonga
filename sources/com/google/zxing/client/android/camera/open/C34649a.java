package com.google.zxing.client.android.camera.open;

import android.hardware.Camera;

/* renamed from: com.google.zxing.client.android.camera.open.a */
public final class C34649a {

    /* renamed from: a */
    public static final String f83827a = "com.google.zxing.client.android.camera.open.a";

    /* renamed from: b */
    public static final int f83828b = -1;

    /* renamed from: a */
    public static int m141338a(int i) {
        boolean z;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            return i;
        }
        if (z) {
            return -1;
        }
        return 0;
    }

    /* renamed from: b */
    public static Camera m141339b(int i) {
        int a = m141338a(i);
        if (a == -1) {
            return null;
        }
        return Camera.open(a);
    }
}
