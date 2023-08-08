package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.request.transition.C22598f;
import com.bumptech.glide.util.C22633m;
import com.google.firebase.messaging.C33202j0;

/* renamed from: com.bumptech.glide.request.target.l */
public class C22579l extends C22568e<Bitmap> {

    /* renamed from: d */
    public final RemoteViews f57934d;

    /* renamed from: e */
    public final Context f57935e;

    /* renamed from: f */
    public final int f57936f;

    /* renamed from: g */
    public final String f57937g;

    /* renamed from: v */
    public final Notification f57938v;

    /* renamed from: w */
    public final int f57939w;

    public C22579l(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, (String) null);
    }

    /* renamed from: e */
    public void mo65592l(@C0359n0 Bitmap bitmap, @C0363p0 C22598f<? super Bitmap> fVar) {
        mo66910f(bitmap);
    }

    /* renamed from: f */
    public final void mo66910f(@C0363p0 Bitmap bitmap) {
        this.f57934d.setImageViewBitmap(this.f57939w, bitmap);
        mo66911h();
    }

    /* renamed from: h */
    public final void mo66911h() {
        ((NotificationManager) C22633m.m102624d((NotificationManager) this.f57935e.getSystemService(C33202j0.f80718b))).notify(this.f57937g, this.f57936f, this.f57938v);
    }

    /* renamed from: k */
    public void mo65591k(@C0363p0 Drawable drawable) {
        mo66910f((Bitmap) null);
    }

    public C22579l(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    public C22579l(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.f57935e = (Context) C22633m.m102625e(context, "Context must not be null!");
        this.f57938v = (Notification) C22633m.m102625e(notification, "Notification object can not be null!");
        this.f57934d = (RemoteViews) C22633m.m102625e(remoteViews, "RemoteViews object can not be null!");
        this.f57939w = i3;
        this.f57936f = i4;
        this.f57937g = str;
    }
}
