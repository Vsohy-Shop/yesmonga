package androidx.browser.customtabs;

import android.os.IBinder;
import androidx.browser.customtabs.C0917f;

/* renamed from: androidx.browser.customtabs.e */
public final /* synthetic */ class C0916e implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ C0917f.C0918a f2904a;

    /* renamed from: b */
    public final /* synthetic */ C0927i f2905b;

    public /* synthetic */ C0916e(C0917f.C0918a aVar, C0927i iVar) {
        this.f2904a = aVar;
        this.f2905b = iVar;
    }

    public final void binderDied() {
        this.f2904a.m4141F8(this.f2905b);
    }
}
