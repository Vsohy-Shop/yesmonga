package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.app.d0 */
public final class C17055d0 {

    /* renamed from: a */
    public final boolean f45018a;

    /* renamed from: b */
    public final Configuration f45019b;

    public C17055d0(boolean z) {
        this.f45018a = z;
        this.f45019b = null;
    }

    @C0359n0
    @C0376v0(26)
    /* renamed from: a */
    public Configuration mo51252a() {
        Configuration configuration = this.f45019b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    /* renamed from: b */
    public boolean mo51253b() {
        return this.f45018a;
    }

    @C0376v0(26)
    public C17055d0(boolean z, @C0359n0 Configuration configuration) {
        this.f45018a = z;
        this.f45019b = configuration;
    }
}
