package com.carrefour.fid.android.shared.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.C0375v;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.load.model.C22309g;
import com.bumptech.glide.load.model.C22310h;
import com.bumptech.glide.load.model.C22313j;
import com.bumptech.glide.request.C22553a;
import com.bumptech.glide.request.C22561h;
import com.bumptech.glide.request.target.C22568e;
import com.bumptech.glide.request.transition.C22598f;
import com.carrefour.fid.android.shared.C28444b;
import com.google.android.gms.maps.model.C30573a;
import com.google.android.gms.maps.model.C30575b;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class ImageUtils {
    @C12579k

    /* renamed from: a */
    public static final ImageUtils f70796a = new ImageUtils();
    @C12579k

    /* renamed from: b */
    public static final String f70797b = "Carrefour";
    @C12579k

    /* renamed from: c */
    public static final C11677z f70798c = C10864b0.m38748c(ImageUtils$userAgentHeader$2.f70801f);

    /* renamed from: d */
    public static final int f70799d = 8;

    /* renamed from: com.carrefour.fid.android.shared.util.ImageUtils$a */
    public static final class C28902a extends C22568e<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ C11300l<Drawable, C11079d2> f70800d;

        public C28902a(C11300l<? super Drawable, C11079d2> lVar) {
            this.f70800d = lVar;
        }

        /* renamed from: e */
        public void mo65592l(@C12579k Drawable drawable, @C12580l C22598f<? super Drawable> fVar) {
            Intrinsics.checkNotNullParameter(drawable, "resource");
            this.f70800d.invoke(drawable);
        }

        /* renamed from: k */
        public void mo65591k(@C12580l Drawable drawable) {
        }

        /* renamed from: o */
        public void mo65594o(@C12580l Drawable drawable) {
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m119496k(ImageUtils imageUtils, Context context, String str, C22234h hVar, C11300l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            hVar = C22234h.f57127e;
            Intrinsics.checkNotNullExpressionValue(hVar, "AUTOMATIC");
        }
        imageUtils.mo84102f(context, str, hVar, lVar);
    }

    /* renamed from: o */
    public static /* synthetic */ String m119497o(ImageUtils imageUtils, Context context, Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        if ((i2 & 16) != 0) {
            i = 95;
        }
        return imageUtils.mo84109n(context, bitmap, str, compressFormat2, i);
    }

    @C12579k
    /* renamed from: a */
    public final Bitmap mo84097a(@C12579k byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "imageByteArray");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i);
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray.getWidth(), decodeByteArray.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, paint);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "bmpGrayscale");
        return createBitmap;
    }

    /* renamed from: b */
    public final C22313j mo84098b() {
        Object value = f70798c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-userAgentHeader>(...)");
        return (C22313j) value;
    }

    /* renamed from: c */
    public final void mo84099c(@C12579k String str, @C12579k ImageView imageView) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ((C22090i) C22038b.m100350E(imageView.getContext()).mo65603s(mo84110p(str)).mo66796k()).mo65675K1(imageView);
    }

    /* renamed from: d */
    public final void mo84100d(@C12579k Context context, int i, @C12579k ImageView imageView, @C0375v int i2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C22038b.m100350E(context).mo65604t(Integer.valueOf(i)).mo65688b(new C22561h().mo66763S0(i2)).mo65675K1(imageView);
    }

    /* renamed from: e */
    public final void mo84101e(@C12579k Context context, @C12579k String str, @C12579k ImageView imageView, @C0375v int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C22038b.m100350E(context).mo65603s(mo84110p(str)).mo65688b(new C22561h().mo66763S0(i)).mo65675K1(imageView);
    }

    /* renamed from: f */
    public final void mo84102f(@C12579k Context context, @C12579k String str, @C12579k C22234h hVar, @C12579k C11300l<? super Drawable, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(hVar, "diskCacheStrategy");
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        ((C22090i) C22038b.m100350E(context).mo65603s(mo84110p(str)).mo66732A(hVar)).mo65672H1(new C28902a(lVar));
    }

    /* renamed from: g */
    public final void mo84103g(@C12579k Fragment fragment, @C12579k String str, @C12579k ImageView imageView) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C22038b.m100352G(fragment).mo65603s(mo84110p(str)).mo65675K1(imageView);
    }

    /* renamed from: h */
    public final void mo84104h(@C12579k Fragment fragment, @C12579k String str, @C12579k ImageView imageView, @C0375v int i) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C22038b.m100352G(fragment).mo65603s(mo84110p(str)).mo65688b(new C22561h().mo66742G(i)).mo65675K1(imageView);
    }

    /* renamed from: i */
    public final void mo84105i(@C12579k String str, @C12579k ImageView imageView) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C22038b.m100350E(imageView.getContext()).mo65603s(mo84110p(str)).mo65675K1(imageView);
    }

    /* renamed from: j */
    public final void mo84106j(@C12579k String str, @C12579k ImageView imageView, @C0375v int i) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C22038b.m100351F(imageView).mo65603s(mo84110p(str)).mo65688b(new C22561h().mo66763S0(i)).mo65675K1(imageView);
    }

    @C12579k
    /* renamed from: l */
    public final C22561h mo84107l(int i) {
        C22553a K = ((C22561h) ((C22561h) new C22561h().mo66759Q0(i)).mo66732A(C22234h.f57123a)).mo66750K();
        Intrinsics.checkNotNullExpressionValue(K, "RequestOptions().overrid…Strategy.ALL).fitCenter()");
        return (C22561h) K;
    }

    @C12579k
    /* renamed from: m */
    public final Bitmap mo84108m(@C12579k Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitmap, width, height, false)");
        return createScaledBitmap;
    }

    @C12579k
    /* renamed from: n */
    public final String mo84109n(@C12579k Context context, @C12579k Bitmap bitmap, @C12579k String str, @C12579k Bitmap.CompressFormat compressFormat, int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(str, "imageName");
        Intrinsics.checkNotNullParameter(compressFormat, "formatCompression");
        String str2 = "";
        try {
            File filesDir = context.getFilesDir();
            String str3 = File.separator;
            File file = new File(filesDir, "OneApp" + str3 + "Images");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str + C32920e.f79928l + i + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(compressFormat, i, fileOutputStream);
            String path = file2.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "outFile.path");
            try {
                fileOutputStream.close();
                return path;
            } catch (FileNotFoundException | IOException unused) {
                str2 = path;
            }
        } catch (FileNotFoundException | IOException unused2) {
            return str2;
        }
    }

    /* renamed from: p */
    public final C22309g mo84110p(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C22309g(str, (C22310h) mo84098b());
        }
        return null;
    }

    @C12579k
    /* renamed from: q */
    public final C30573a mo84111q(@C12579k Context context, @C0375v int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Drawable b = C0507a.m2346b(context, i);
        Intrinsics.checkNotNull(b);
        Resources resources = context.getResources();
        int i2 = C28444b.C28451g.width_marker;
        Resources resources2 = context.getResources();
        int i3 = C28444b.C28451g.height_marker;
        b.setBounds(0, 0, (int) resources.getDimension(i2), (int) resources2.getDimension(i3));
        Bitmap createBitmap = Bitmap.createBitmap((int) context.getResources().getDimension(i2), (int) context.getResources().getDimension(i3), Bitmap.Config.ARGB_8888);
        b.draw(new Canvas(createBitmap));
        C30573a d = C30575b.m123158d(createBitmap);
        Intrinsics.checkNotNullExpressionValue(d, "fromBitmap(bitmap)");
        return d;
    }

    @C12579k
    /* renamed from: r */
    public final C30573a mo84112r(@C12579k Context context, @C0375v int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Drawable b = C0507a.m2346b(context, i);
        Intrinsics.checkNotNull(b);
        b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
        Bitmap createBitmap = Bitmap.createBitmap(b.getIntrinsicWidth(), b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        b.draw(new Canvas(createBitmap));
        C30573a d = C30575b.m123158d(createBitmap);
        Intrinsics.checkNotNullExpressionValue(d, "fromBitmap(bitmap)");
        return d;
    }
}
