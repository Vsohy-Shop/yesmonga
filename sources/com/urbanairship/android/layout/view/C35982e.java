package com.urbanairship.android.layout.view;

import com.urbanairship.android.layout.model.MediaModel;
import java.lang.ref.WeakReference;

/* renamed from: com.urbanairship.android.layout.view.e */
public final /* synthetic */ class C35982e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f88935a;

    /* renamed from: b */
    public final /* synthetic */ MediaModel f88936b;

    public /* synthetic */ C35982e(WeakReference weakReference, MediaModel mediaModel) {
        this.f88935a = weakReference;
        this.f88936b = mediaModel;
    }

    public final void run() {
        MediaView.m148164j(this.f88935a, this.f88936b);
    }
}
