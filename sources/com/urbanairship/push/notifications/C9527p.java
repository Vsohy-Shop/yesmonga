package com.urbanairship.push.notifications;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9684y;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.push.notifications.p */
public class C9527p {

    /* renamed from: a */
    public static final long f26030a = 7;

    /* renamed from: b */
    public static final int f26031b = 240;

    /* renamed from: c */
    public static final double f26032c = 0.75d;

    /* renamed from: com.urbanairship.push.notifications.p$a */
    public class C9528a implements Callable<Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ Context f26033a;

        /* renamed from: b */
        public final /* synthetic */ URL f26034b;

        /* renamed from: c */
        public final /* synthetic */ int f26035c;

        /* renamed from: d */
        public final /* synthetic */ int f26036d;

        public C9528a(Context context, URL url, int i, int i2) {
            this.f26033a = context;
            this.f26034b = url;
            this.f26035c = i;
            this.f26036d = i2;
        }

        @C0363p0
        /* renamed from: a */
        public Bitmap call() throws Exception {
            return C9684y.m36254h(this.f26033a, this.f26034b, this.f26035c, this.f26036d);
        }
    }

    @C0363p0
    /* renamed from: a */
    public static Bitmap m35735a(@C0359n0 Context context, @C0359n0 URL url) {
        C36059m.m148406b("Fetching notification image at URL: %s", url);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Future submit = C36044d.m148370b().submit(new C9528a(context, url, (int) (((double) Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels)) * 0.75d), (int) TypedValue.applyDimension(1, 240.0f, displayMetrics)));
        try {
            return (Bitmap) submit.get(7, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            C36059m.m148409e("Failed to create big picture style, unable to fetch image: %s", e);
            return null;
        } catch (TimeoutException unused) {
            submit.cancel(true);
            C36059m.m148409e("Big picture took longer than %s seconds to fetch.", 7L);
            return null;
        }
    }
}
