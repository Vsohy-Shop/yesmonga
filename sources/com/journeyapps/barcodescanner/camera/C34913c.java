package com.journeyapps.barcodescanner.camera;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import com.google.mlkit.common.sdkinternal.C33969n;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.C12085q0;
import kotlinx.serialization.json.internal.C12361b;
import okhttp3.HttpUrl;

/* renamed from: com.journeyapps.barcodescanner.camera.c */
public final class C34913c {

    /* renamed from: a */
    public static final String f84919a = "CameraConfiguration";

    /* renamed from: b */
    public static final Pattern f84920b = Pattern.compile(";");

    /* renamed from: c */
    public static final float f84921c = 1.5f;

    /* renamed from: d */
    public static final float f84922d = 0.0f;

    /* renamed from: e */
    public static final int f84923e = 10;

    /* renamed from: f */
    public static final int f84924f = 20;

    /* renamed from: g */
    public static final int f84925g = 400;

    @TargetApi(15)
    /* renamed from: a */
    public static List<Camera.Area> m142755a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    /* renamed from: b */
    public static String m142756b(Camera.Parameters parameters) {
        return m142757c(parameters.flatten());
    }

    /* renamed from: c */
    public static String m142757c(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append(10);
        sb.append("BRAND=");
        sb.append(Build.BRAND);
        sb.append(10);
        sb.append("CPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append(10);
        sb.append("DEVICE=");
        sb.append(Build.DEVICE);
        sb.append(10);
        sb.append("DISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append(10);
        sb.append("FINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append(10);
        sb.append("HOST=");
        sb.append(Build.HOST);
        sb.append(10);
        sb.append("ID=");
        sb.append(Build.ID);
        sb.append(10);
        sb.append("MANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append(10);
        sb.append("MODEL=");
        sb.append(Build.MODEL);
        sb.append(10);
        sb.append("PRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append(10);
        sb.append("TAGS=");
        sb.append(Build.TAGS);
        sb.append(10);
        sb.append("TIME=");
        sb.append(Build.TIME);
        sb.append(10);
        sb.append("TYPE=");
        sb.append(Build.TYPE);
        sb.append(10);
        sb.append("USER=");
        sb.append(Build.USER);
        sb.append(10);
        sb.append("VERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(10);
        sb.append("VERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append(10);
        sb.append("VERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(10);
        sb.append("VERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(10);
        if (charSequence != null) {
            String[] split = f84920b.split(charSequence);
            Arrays.sort(split);
            for (String append : split) {
                sb.append(append);
                sb.append(10);
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m142758d(String str, Collection<String> collection, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Requesting ");
        sb.append(str);
        sb.append(" value from among: ");
        sb.append(Arrays.toString(strArr));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Supported ");
        sb2.append(str);
        sb2.append(" values: ");
        sb2.append(collection);
        if (collection == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (collection.contains(str2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Can set ");
                sb3.append(str);
                sb3.append(" to: ");
                sb3.append(str2);
                return str2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static Integer m142759e(Camera.Parameters parameters, double d) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        StringBuilder sb = new StringBuilder();
        sb.append("Zoom ratios: ");
        sb.append(zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            return null;
        }
        double d2 = d * 100.0d;
        double d3 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
            double abs = Math.abs(((double) zoomRatios.get(i2).intValue()) - d2);
            if (abs < d3) {
                i = i2;
                d3 = abs;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Chose zoom ratio of ");
        sb2.append(((double) zoomRatios.get(i).intValue()) / 100.0d);
        return Integer.valueOf(i);
    }

    /* renamed from: f */
    public static void m142760f(Camera.Parameters parameters) {
        String d;
        if (!C33969n.f82459d.equals(parameters.getSceneMode()) && (d = m142758d("scene mode", parameters.getSupportedSceneModes(), C33969n.f82459d)) != null) {
            parameters.setSceneMode(d);
        }
    }

    /* renamed from: g */
    public static void m142761g(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            float f = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z) {
                    f = 1.5f;
                }
                int round = Math.round(f / exposureCompensationStep);
                float f2 = exposureCompensationStep * ((float) round);
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exposure compensation already set to ");
                    sb.append(max);
                    sb.append(" / ");
                    sb.append(f2);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting exposure compensation to ");
                sb2.append(max);
                sb2.append(" / ");
                sb2.append(f2);
                parameters.setExposureCompensation(max);
            }
        }
    }

    /* renamed from: h */
    public static void m142762h(Camera.Parameters parameters) {
        m142763i(parameters, 10, 20);
    }

    /* renamed from: i */
    public static void m142763i(Camera.Parameters parameters, int i, int i2) {
        int[] iArr;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        StringBuilder sb = new StringBuilder();
        sb.append("Supported FPS ranges: ");
        sb.append(m142772r(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iArr = null;
                    break;
                }
                iArr = it.next();
                int i3 = iArr[0];
                int i4 = iArr[1];
                if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                    break;
                }
            }
            if (iArr != null) {
                int[] iArr2 = new int[2];
                parameters.getPreviewFpsRange(iArr2);
                if (Arrays.equals(iArr2, iArr)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("FPS range already set to ");
                    sb2.append(Arrays.toString(iArr));
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Setting FPS range to ");
                sb3.append(Arrays.toString(iArr));
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
            }
        }
    }

    /* renamed from: j */
    public static void m142764j(Camera.Parameters parameters, CameraSettings.FocusMode focusMode, boolean z) {
        String str;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z || focusMode == CameraSettings.FocusMode.AUTO) {
            str = m142758d("focus mode", supportedFocusModes, "auto");
        } else if (focusMode == CameraSettings.FocusMode.CONTINUOUS) {
            str = m142758d("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else if (focusMode == CameraSettings.FocusMode.INFINITY) {
            str = m142758d("focus mode", supportedFocusModes, "infinity");
        } else if (focusMode == CameraSettings.FocusMode.MACRO) {
            str = m142758d("focus mode", supportedFocusModes, "macro");
        } else {
            str = null;
        }
        if (!z && str == null) {
            str = m142758d("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFocusMode())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Focus mode already set to ");
            sb.append(str);
            return;
        }
        parameters.setFocusMode(str);
    }

    @TargetApi(15)
    /* renamed from: k */
    public static void m142765k(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Old focus areas: ");
            sb.append(m142771q(parameters.getFocusAreas()));
            List<Camera.Area> a = m142755a(400);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting focus area to : ");
            sb2.append(m142771q(a));
            parameters.setFocusAreas(a);
        }
    }

    /* renamed from: l */
    public static void m142766l(Camera.Parameters parameters) {
        String d;
        if (!"negative".equals(parameters.getColorEffect()) && (d = m142758d("color effect", parameters.getSupportedColorEffects(), "negative")) != null) {
            parameters.setColorEffect(d);
        }
    }

    @TargetApi(15)
    /* renamed from: m */
    public static void m142767m(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Old metering areas: ");
            sb.append(parameters.getMeteringAreas());
            List<Camera.Area> a = m142755a(400);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting metering area to : ");
            sb2.append(m142771q(a));
            parameters.setMeteringAreas(a);
        }
    }

    /* renamed from: n */
    public static void m142768n(Camera.Parameters parameters, boolean z) {
        String str;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            str = m142758d("flash mode", supportedFlashModes, "torch", C12085q0.f29740d);
        } else {
            str = m142758d("flash mode", supportedFlashModes, C12085q0.f29741e);
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFlashMode())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Flash mode already set to ");
            sb.append(str);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting flash mode to ");
        sb2.append(str);
        parameters.setFlashMode(str);
    }

    @TargetApi(15)
    /* renamed from: o */
    public static void m142769o(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
            parameters.setVideoStabilization(true);
        }
    }

    /* renamed from: p */
    public static void m142770p(Camera.Parameters parameters, double d) {
        Integer e;
        if (parameters.isZoomSupported() && (e = m142759e(parameters, d)) != null) {
            if (parameters.getZoom() == e.intValue()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Zoom is already set to ");
                sb.append(e);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting zoom to ");
            sb2.append(e);
            parameters.setZoom(e.intValue());
        }
    }

    @TargetApi(15)
    /* renamed from: q */
    public static String m142771q(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area next : iterable) {
            sb.append(next.rect);
            sb.append(C12361b.f30257h);
            sb.append(next.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static String m142772r(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C12361b.f30260k);
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(C12361b.f30261l);
        return sb.toString();
    }
}
