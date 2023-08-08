package com.urbanairship.android.layout.view;

import com.urbanairship.android.layout.view.WebViewView;
import java.lang.ref.WeakReference;

/* renamed from: com.urbanairship.android.layout.view.l */
public final /* synthetic */ class C35989l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f88944a;

    /* renamed from: b */
    public final /* synthetic */ WebViewView.C35969b f88945b;

    public /* synthetic */ C35989l(WeakReference weakReference, WebViewView.C35969b bVar) {
        this.f88944a = weakReference;
        this.f88945b = bVar;
    }

    public final void run() {
        WebViewView.C35969b.m148220f(this.f88944a, this.f88945b);
    }
}
