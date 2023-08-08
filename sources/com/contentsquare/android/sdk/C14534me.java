package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.Window;
import com.contentsquare.android.sdk.C14274db;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.me */
public class C14534me {

    /* renamed from: a */
    public final C14494l5 f35957a;

    /* renamed from: b */
    public List<WeakReference<C14552nd>> f35958b = new ArrayList();

    /* renamed from: c */
    public final C14274db.C14276b f35959c;

    public C14534me() {
        C14274db.C14276b bVar = new C14274db.C14276b();
        this.f35959c = bVar;
        this.f35957a = new C14494l5(bVar);
    }

    /* renamed from: a */
    public void mo35925a(Activity activity) {
        this.f35957a.mo35805b(this.f35958b);
        this.f35957a.mo35806c(activity);
        Window window = activity.getWindow();
        if (window != null) {
            this.f35959c.mo34969b(window, C14274db.f35235d);
        }
    }

    /* renamed from: b */
    public void mo35926b(C14552nd ndVar) {
        this.f35958b.add(new WeakReference(ndVar));
    }

    /* renamed from: c */
    public void mo35927c(Activity activity) {
        this.f35957a.mo35805b(new ArrayList());
        this.f35957a.mo35807d(activity);
        Window window = activity.getWindow();
        if (window != null) {
            this.f35959c.mo34968a(window);
        }
    }

    /* renamed from: d */
    public void mo35928d(C14552nd ndVar) {
        Iterator<WeakReference<C14552nd>> it = this.f35958b.iterator();
        while (it.hasNext()) {
            if (ndVar.equals(it.next().get())) {
                it.remove();
            }
        }
    }
}
