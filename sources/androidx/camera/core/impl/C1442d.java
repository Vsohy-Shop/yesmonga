package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.camera.core.impl.SurfaceConfig;

/* renamed from: androidx.camera.core.impl.d */
public final class C1442d extends SurfaceConfig {

    /* renamed from: a */
    public final SurfaceConfig.ConfigType f4190a;

    /* renamed from: b */
    public final SurfaceConfig.ConfigSize f4191b;

    public C1442d(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize) {
        if (configType != null) {
            this.f4190a = configType;
            if (configSize != null) {
                this.f4191b = configSize;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    @C0359n0
    /* renamed from: b */
    public SurfaceConfig.ConfigSize mo5175b() {
        return this.f4191b;
    }

    @C0359n0
    /* renamed from: c */
    public SurfaceConfig.ConfigType mo5176c() {
        return this.f4190a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        if (!this.f4190a.equals(surfaceConfig.mo5176c()) || !this.f4191b.equals(surfaceConfig.mo5175b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f4190a.hashCode() ^ 1000003) * 1000003) ^ this.f4191b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f4190a + ", configSize=" + this.f4191b + "}";
    }
}
