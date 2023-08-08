package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import androidx.annotation.C0359n0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.C1472k1;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.utils.ExifData;

/* renamed from: androidx.camera.camera2.internal.f */
public class C1176f implements C1456h {

    /* renamed from: c */
    public static final String f3389c = "C2CameraCaptureResult";

    /* renamed from: a */
    public final C1472k1 f3390a;

    /* renamed from: b */
    public final CaptureResult f3391b;

    public C1176f(@C0359n0 C1472k1 k1Var, @C0359n0 CaptureResult captureResult) {
        this.f3390a = k1Var;
        this.f3391b = captureResult;
    }

    /* renamed from: a */
    public void mo4459a(@C0359n0 ExifData.C1509b bVar) {
        super.mo4459a(bVar);
        Rect rect = (Rect) this.f3391b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.mo5348k(rect.width()).mo5347j(rect.height());
        }
        Integer num = (Integer) this.f3391b.get(CaptureResult.JPEG_ORIENTATION);
        if (num != null) {
            bVar.mo5351n(num.intValue());
        }
        Long l = (Long) this.f3391b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            bVar.mo5344g(l.longValue());
        }
        Float f = (Float) this.f3391b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bVar.mo5350m(f.floatValue());
        }
        Integer num2 = (Integer) this.f3391b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            Integer num3 = (Integer) this.f3391b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (((float) num3.intValue()) / 100.0f)));
            }
            bVar.mo5349l(num2.intValue());
        }
        Float f2 = (Float) this.f3391b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bVar.mo5346i(f2.floatValue());
        }
        Integer num4 = (Integer) this.f3391b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (num4.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            bVar.mo5352o(whiteBalanceMode);
        }
    }

    @C0359n0
    /* renamed from: b */
    public C1472k1 mo4460b() {
        return this.f3390a;
    }

    @C0359n0
    /* renamed from: c */
    public CameraCaptureMetaData.FlashState mo4461c() {
        Integer num = (Integer) this.f3391b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData.FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return CameraCaptureMetaData.FlashState.NONE;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData.FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return CameraCaptureMetaData.FlashState.FIRED;
        }
        C1417i2.m5913c(f3389c, "Undefined flash state: " + num);
        return CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @C0359n0
    /* renamed from: d */
    public CameraCaptureMetaData.AfState mo4462d() {
        Integer num = (Integer) this.f3391b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return CameraCaptureMetaData.AfState.INACTIVE;
            case 1:
            case 3:
                return CameraCaptureMetaData.AfState.SCANNING;
            case 2:
                return CameraCaptureMetaData.AfState.PASSIVE_FOCUSED;
            case 4:
                return CameraCaptureMetaData.AfState.LOCKED_FOCUSED;
            case 5:
                return CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED;
            case 6:
                return CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED;
            default:
                C1417i2.m5913c(f3389c, "Undefined af state: " + num);
                return CameraCaptureMetaData.AfState.UNKNOWN;
        }
    }

    @C0359n0
    /* renamed from: e */
    public CameraCaptureMetaData.AwbState mo4463e() {
        Integer num = (Integer) this.f3391b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData.AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return CameraCaptureMetaData.AwbState.METERING;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData.AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return CameraCaptureMetaData.AwbState.LOCKED;
        }
        C1417i2.m5913c(f3389c, "Undefined awb state: " + num);
        return CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @C0359n0
    /* renamed from: f */
    public CameraCaptureMetaData.AfMode mo4464f() {
        Integer num = (Integer) this.f3391b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return CameraCaptureMetaData.AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C1417i2.m5913c(f3389c, "Undefined af mode: " + num);
                return CameraCaptureMetaData.AfMode.UNKNOWN;
            }
        }
        return CameraCaptureMetaData.AfMode.OFF;
    }

    @C0359n0
    /* renamed from: g */
    public CameraCaptureMetaData.AeState mo4465g() {
        Integer num = (Integer) this.f3391b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData.AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return CameraCaptureMetaData.AeState.CONVERGED;
            }
            if (intValue == 3) {
                return CameraCaptureMetaData.AeState.LOCKED;
            }
            if (intValue == 4) {
                return CameraCaptureMetaData.AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                C1417i2.m5913c(f3389c, "Undefined ae state: " + num);
                return CameraCaptureMetaData.AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData.AeState.SEARCHING;
    }

    public long getTimestamp() {
        Long l = (Long) this.f3391b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    @C0359n0
    /* renamed from: h */
    public CaptureResult mo4467h() {
        return this.f3391b;
    }
}
