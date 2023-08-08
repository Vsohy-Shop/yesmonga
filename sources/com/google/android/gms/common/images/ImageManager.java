package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C40743d;
import com.google.android.gms.common.internal.C40761g;
import com.google.android.gms.internal.base.C41075l;
import com.google.android.gms.internal.base.C41083t;
import com.google.android.gms.internal.base.C41084u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {

    /* renamed from: h */
    public static final Object f103705h = new Object();

    /* renamed from: i */
    public static HashSet f103706i = new HashSet();

    /* renamed from: j */
    public static ImageManager f103707j;

    /* renamed from: a */
    public final Context f103708a;

    /* renamed from: b */
    public final Handler f103709b = new C41084u(Looper.getMainLooper());

    /* renamed from: c */
    public final ExecutorService f103710c = C41083t.m166953a().mo134899b(4, 2);

    /* renamed from: d */
    public final C41075l f103711d = new C41075l();

    /* renamed from: e */
    public final Map f103712e = new HashMap();

    /* renamed from: f */
    public final Map f103713f = new HashMap();

    /* renamed from: g */
    public final Map f103714g = new HashMap();

    @KeepName
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        public final Uri f103715a;

        /* renamed from: b */
        public final ArrayList f103716b = new ArrayList();

        public ImageReceiver(Uri uri) {
            super(new C41084u(Looper.getMainLooper()));
            this.f103715a = uri;
        }

        /* renamed from: b */
        public final void mo134234b(C40727h hVar) {
            C40743d.m165777a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f103716b.add(hVar);
        }

        /* renamed from: c */
        public final void mo134235c(C40727h hVar) {
            C40743d.m165777a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f103716b.remove(hVar);
        }

        /* renamed from: d */
        public final void mo134236d() {
            Intent intent = new Intent(C40761g.f103870c);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(C40761g.f103871d, this.f103715a);
            intent.putExtra(C40761g.f103872e, this);
            intent.putExtra(C40761g.f103873f, 3);
            ImageManager.this.f103708a.sendBroadcast(intent);
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = ImageManager.this;
            imageManager.f103710c.execute(new C40721b(imageManager, this.f103715a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    public interface C40719a {
        /* renamed from: a */
        void mo134238a(@C0359n0 Uri uri, @C0363p0 Drawable drawable, boolean z);
    }

    public ImageManager(Context context, boolean z) {
        this.f103708a = context.getApplicationContext();
    }

    @C0359n0
    /* renamed from: a */
    public static ImageManager m165701a(@C0359n0 Context context) {
        if (f103707j == null) {
            f103707j = new ImageManager(context, false);
        }
        return f103707j;
    }

    /* renamed from: b */
    public void mo134228b(@C0359n0 ImageView imageView, int i) {
        mo134233p(new C40725f(imageView, i));
    }

    /* renamed from: c */
    public void mo134229c(@C0359n0 ImageView imageView, @C0359n0 Uri uri) {
        mo134233p(new C40725f(imageView, uri));
    }

    /* renamed from: d */
    public void mo134230d(@C0359n0 ImageView imageView, @C0359n0 Uri uri, int i) {
        C40725f fVar = new C40725f(imageView, uri);
        fVar.f103737b = i;
        mo134233p(fVar);
    }

    /* renamed from: e */
    public void mo134231e(@C0359n0 C40719a aVar, @C0359n0 Uri uri) {
        mo134233p(new C40726g(aVar, uri));
    }

    /* renamed from: f */
    public void mo134232f(@C0359n0 C40719a aVar, @C0359n0 Uri uri, int i) {
        C40726g gVar = new C40726g(aVar, uri);
        gVar.f103737b = i;
        mo134233p(gVar);
    }

    /* renamed from: p */
    public final void mo134233p(C40727h hVar) {
        C40743d.m165777a("ImageManager.loadImage() must be called in the main thread");
        new C40722c(this, hVar).run();
    }
}
