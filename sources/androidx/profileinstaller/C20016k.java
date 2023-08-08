package androidx.profileinstaller;

import android.content.Context;

/* renamed from: androidx.profileinstaller.k */
public final /* synthetic */ class C20016k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ProfileInstallerInitializer f51249a;

    /* renamed from: b */
    public final /* synthetic */ Context f51250b;

    public /* synthetic */ C20016k(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f51249a = profileInstallerInitializer;
        this.f51250b = context;
    }

    public final void run() {
        this.f51249a.m92942h(this.f51250b);
    }
}
