package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.request.transition.C22598f;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.request.target.a */
public class C22564a extends C22568e<Bitmap> {

    /* renamed from: d */
    public final int[] f57900d;

    /* renamed from: e */
    public final ComponentName f57901e;

    /* renamed from: f */
    public final RemoteViews f57902f;

    /* renamed from: g */
    public final Context f57903g;

    /* renamed from: v */
    public final int f57904v;

    public C22564a(Context context, int i, int i2, int i3, RemoteViews remoteViews, int... iArr) {
        super(i, i2);
        if (iArr.length != 0) {
            this.f57903g = (Context) C22633m.m102625e(context, "Context can not be null!");
            this.f57902f = (RemoteViews) C22633m.m102625e(remoteViews, "RemoteViews object can not be null!");
            this.f57900d = (int[]) C22633m.m102625e(iArr, "WidgetIds can not be null!");
            this.f57904v = i3;
            this.f57901e = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }

    /* renamed from: e */
    public void mo65592l(@C0359n0 Bitmap bitmap, @C0363p0 C22598f<? super Bitmap> fVar) {
        mo66841f(bitmap);
    }

    /* renamed from: f */
    public final void mo66841f(@C0363p0 Bitmap bitmap) {
        this.f57902f.setImageViewBitmap(this.f57904v, bitmap);
        mo66842h();
    }

    /* renamed from: h */
    public final void mo66842h() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f57903g);
        ComponentName componentName = this.f57901e;
        if (componentName != null) {
            instance.updateAppWidget(componentName, this.f57902f);
        } else {
            instance.updateAppWidget(this.f57900d, this.f57902f);
        }
    }

    /* renamed from: k */
    public void mo65591k(@C0363p0 Drawable drawable) {
        mo66841f((Bitmap) null);
    }

    public C22564a(Context context, int i, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, iArr);
    }

    public C22564a(Context context, int i, int i2, int i3, RemoteViews remoteViews, ComponentName componentName) {
        super(i, i2);
        this.f57903g = (Context) C22633m.m102625e(context, "Context can not be null!");
        this.f57902f = (RemoteViews) C22633m.m102625e(remoteViews, "RemoteViews object can not be null!");
        this.f57901e = (ComponentName) C22633m.m102625e(componentName, "ComponentName can not be null!");
        this.f57904v = i3;
        this.f57900d = null;
    }

    public C22564a(Context context, int i, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, componentName);
    }
}
