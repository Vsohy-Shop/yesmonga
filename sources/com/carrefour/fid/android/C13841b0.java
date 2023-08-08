package com.carrefour.fid.android;

import androidx.annotation.C0346i;
import com.google.android.play.core.splitcompat.C32134b;
import dagger.hilt.android.internal.managers.C10226d;
import dagger.hilt.android.internal.managers.C10228f;
import dagger.hilt.android.internal.modules.C10240c;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.b0 */
public abstract class C13841b0 extends C32134b implements C10276d {

    /* renamed from: a */
    public boolean f33763a = false;

    /* renamed from: b */
    public final C10226d f33764b = new C10226d(new C13842a());

    /* renamed from: com.carrefour.fid.android.b0$a */
    public class C13842a implements C10228f {
        public C13842a() {
        }

        public Object get() {
            return C13984i.m59226a().mo33462c(new C10240c(C13841b0.this)).mo33466g();
        }
    }

    /* renamed from: a */
    public final C10226d componentManager() {
        return this.f33764b;
    }

    /* renamed from: b */
    public void mo32781b() {
        if (!this.f33763a) {
            this.f33763a = true;
            ((C14004i0) generatedComponent()).mo33954c((OneAppApplication) C10284i.m38510a(this));
        }
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @C0346i
    public void onCreate() {
        mo32781b();
        super.onCreate();
    }
}
