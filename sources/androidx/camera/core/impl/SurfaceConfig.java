package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import com.google.auto.value.C32455c;

@C32455c
public abstract class SurfaceConfig {

    public enum ConfigSize {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        
        final int mId;

        /* access modifiers changed from: public */
        ConfigSize(int i) {
            this.mId = i;
        }

        /* renamed from: g */
        public int mo5178g() {
            return this.mId;
        }
    }

    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    @C0359n0
    /* renamed from: a */
    public static SurfaceConfig m6034a(@C0359n0 ConfigType configType, @C0359n0 ConfigSize configSize) {
        return new C1442d(configType, configSize);
    }

    @C0359n0
    /* renamed from: b */
    public abstract ConfigSize mo5175b();

    @C0359n0
    /* renamed from: c */
    public abstract ConfigType mo5176c();

    /* renamed from: d */
    public final boolean mo5177d(@C0359n0 SurfaceConfig surfaceConfig) {
        ConfigType c = surfaceConfig.mo5176c();
        if (surfaceConfig.mo5175b().mo5178g() > mo5175b().mo5178g() || c != mo5176c()) {
            return false;
        }
        return true;
    }
}
