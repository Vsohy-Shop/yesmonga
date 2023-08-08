package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.app.h5 */
public final class C17124h5 {

    /* renamed from: a */
    public final boolean f45374a;

    /* renamed from: b */
    public final Configuration f45375b;

    public C17124h5(boolean z) {
        this.f45374a = z;
        this.f45375b = null;
    }

    @C0359n0
    @C0376v0(26)
    /* renamed from: a */
    public Configuration mo51569a() {
        Configuration configuration = this.f45375b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    /* renamed from: b */
    public boolean mo51570b() {
        return this.f45374a;
    }

    @C0376v0(26)
    public C17124h5(boolean z, @C0359n0 Configuration configuration) {
        this.f45374a = z;
        this.f45375b = configuration;
    }
}
