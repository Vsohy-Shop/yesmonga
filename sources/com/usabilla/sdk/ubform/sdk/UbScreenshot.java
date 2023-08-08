package com.usabilla.sdk.ubform.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.view.Display;
import android.view.WindowManager;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.field.UbScreenshotType;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0011\u0018\u0000 \u00072\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\"\u0012\b\b\u0002\u0010)\u001a\u00020%¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bHÖ\u0001J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/UbScreenshot;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "", "c", "Landroid/graphics/Bitmap;", "d", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "e", "Landroid/net/Uri;", "imageUri", "b", "Landroid/graphics/Point;", "g", "Landroid/graphics/BitmapFactory$Options;", "options", "point", "h", "image", "newWidth", "j", "bitmap", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "imageSource", "Lcom/usabilla/sdk/ubform/sdk/field/UbScreenshotType;", "Lcom/usabilla/sdk/ubform/sdk/field/UbScreenshotType;", "type", "", "Z", "i", "()Z", "isDefaultImageSource", "<init>", "(Ljava/lang/String;Lcom/usabilla/sdk/ubform/sdk/field/UbScreenshotType;Z)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public class UbScreenshot implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<UbScreenshot> CREATOR = new C9909b();
    @C12579k

    /* renamed from: d */
    public static final C9908a f27221d = new C9908a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String f27222e = "usabilla_screenshot.jpg";

    /* renamed from: f */
    public static final float f27223f = 20.0f;

    /* renamed from: g */
    public static final double f27224g = 2.0d;

    /* renamed from: v */
    public static final double f27225v = 0.5d;
    @C12579k

    /* renamed from: a */
    public final String f27226a;
    @C12579k

    /* renamed from: b */
    public final UbScreenshotType f27227b;

    /* renamed from: c */
    public final boolean f27228c;

    /* renamed from: com.usabilla.sdk.ubform.sdk.UbScreenshot$a */
    public static final class C9908a {
        public /* synthetic */ C9908a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9908a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.UbScreenshot$b */
    public static final class C9909b implements Parcelable.Creator<UbScreenshot> {
        @C12579k
        /* renamed from: a */
        public final UbScreenshot createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UbScreenshot(parcel.readString(), UbScreenshotType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final UbScreenshot[] newArray(int i) {
            return new UbScreenshot[i];
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.UbScreenshot$c */
    public /* synthetic */ class C9910c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UbScreenshotType.values().length];
            iArr[UbScreenshotType.BASE64.ordinal()] = 1;
            iArr[UbScreenshotType.URI.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UbScreenshot(@C12579k String str, @C12579k UbScreenshotType ubScreenshotType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "imageSource");
        Intrinsics.checkNotNullParameter(ubScreenshotType, "type");
        this.f27226a = str;
        this.f27227b = ubScreenshotType;
        this.f27228c = z;
    }

    /* renamed from: a */
    public final Bitmap mo20541a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, 20.0f, 20.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "output");
        return createBitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        kotlin.p010io.C11133b.m42950a(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r0 = r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x005e, B:18:0x006d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo20542b(android.content.Context r10, android.net.Uri r11) {
        /*
            r9 = this;
            r0 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ Exception -> 0x007d }
            java.io.InputStream r1 = r1.openInputStream(r11)     // Catch:{ Exception -> 0x007d }
            android.graphics.Point r2 = r9.mo20548g(r10)     // Catch:{ all -> 0x0076 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0076 }
            r3.<init>()     // Catch:{ all -> 0x0076 }
            r4 = 1
            r3.inJustDecodeBounds = r4     // Catch:{ all -> 0x0076 }
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0076 }
            r3.inPreferredConfig = r5     // Catch:{ all -> 0x0076 }
            android.graphics.BitmapFactory.decodeStream(r1, r0, r3)     // Catch:{ all -> 0x0076 }
            int r5 = r9.mo20549h(r3, r2)     // Catch:{ all -> 0x0076 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0076 }
            r6.<init>()     // Catch:{ all -> 0x0076 }
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0076 }
            r6.inPreferredConfig = r7     // Catch:{ all -> 0x0076 }
            r6.inSampleSize = r5     // Catch:{ all -> 0x0076 }
            r6.inScaled = r4     // Catch:{ all -> 0x0076 }
            int r4 = r3.outWidth     // Catch:{ all -> 0x0076 }
            int r3 = r3.outHeight     // Catch:{ all -> 0x0076 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0076 }
            r6.inDensity = r3     // Catch:{ all -> 0x0076 }
            int r3 = r2.x     // Catch:{ all -> 0x0076 }
            int r4 = r2.y     // Catch:{ all -> 0x0076 }
            int r3 = java.lang.Math.min(r3, r4)     // Catch:{ all -> 0x0076 }
            r6.inTargetDensity = r3     // Catch:{ all -> 0x0076 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x0076 }
            java.io.InputStream r10 = r10.openInputStream(r11)     // Catch:{ all -> 0x0076 }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r10, r0, r6)     // Catch:{ all -> 0x0069 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)     // Catch:{ all -> 0x0067 }
            int r3 = r2.x     // Catch:{ all -> 0x0067 }
            int r2 = r2.y     // Catch:{ all -> 0x0067 }
            int r2 = java.lang.Math.min(r3, r2)     // Catch:{ all -> 0x0067 }
            android.graphics.Bitmap r11 = r9.mo20551j(r11, r2)     // Catch:{ all -> 0x0067 }
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0067 }
            kotlin.p010io.C11133b.m42950a(r10, r0)     // Catch:{ all -> 0x0073 }
            kotlin.p010io.C11133b.m42950a(r1, r0)     // Catch:{ Exception -> 0x0065 }
            goto L_0x007e
        L_0x0065:
            r0 = r11
            goto L_0x007d
        L_0x0067:
            r0 = move-exception
            goto L_0x006d
        L_0x0069:
            r11 = move-exception
            r8 = r0
            r0 = r11
            r11 = r8
        L_0x006d:
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r10, r0)     // Catch:{ all -> 0x0073 }
            throw r2     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r10 = move-exception
            r0 = r11
            goto L_0x0077
        L_0x0076:
            r10 = move-exception
        L_0x0077:
            throw r10     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r10)     // Catch:{ Exception -> 0x007d }
            throw r11     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            r11 = r0
        L_0x007e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.UbScreenshot.mo20542b(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    @C12580l
    /* renamed from: c */
    public final String mo20543c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        int i = C9910c.$EnumSwitchMapping$0[this.f27227b.ordinal()];
        if (i == 1) {
            return this.f27226a;
        }
        if (i == 2) {
            return mo20546e(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12580l
    /* renamed from: d */
    public final Bitmap mo20544d(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        int i = C9910c.$EnumSwitchMapping$0[this.f27227b.ordinal()];
        if (i == 1) {
            byte[] decode = Base64.decode(this.f27226a, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } else if (i == 2) {
            Uri parse = Uri.parse(this.f27226a);
            Intrinsics.checkNotNullExpressionValue(parse, "uri");
            return mo20542b(context, parse);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        kotlin.p010io.C11133b.m42950a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        throw r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo20546e(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0038 }
            r1.<init>()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r2 = r4.mo20547f()     // Catch:{ all -> 0x0031 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ all -> 0x0031 }
            android.graphics.Bitmap r5 = r4.mo20542b(r5, r2)     // Catch:{ all -> 0x0031 }
            if (r5 != 0) goto L_0x001d
            kotlin.p010io.C11133b.m42950a(r1, r0)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0038
        L_0x001d:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0031 }
            r3 = 100
            r5.compress(r2, r3, r1)     // Catch:{ all -> 0x0031 }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x0031 }
            r2 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch:{ all -> 0x0031 }
            kotlin.p010io.C11133b.m42950a(r1, r0)     // Catch:{ Exception -> 0x0038 }
            return r5
        L_0x0031:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r5)     // Catch:{ Exception -> 0x0038 }
            throw r2     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.UbScreenshot.mo20546e(android.content.Context):java.lang.String");
    }

    @C12579k
    /* renamed from: f */
    public final String mo20547f() {
        return this.f27226a;
    }

    /* renamed from: g */
    public final Point mo20548g(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return point;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: h */
    public final int mo20549h(BitmapFactory.Options options, Point point) {
        int i = options.outHeight;
        int i2 = point.y;
        if (i > i2 || options.outWidth > i2) {
            return (int) Math.pow(2.0d, Math.ceil(Math.log(((double) i2) / ((double) Math.max(i, options.outWidth))) / ((double) ((int) Math.log(0.5d)))));
        }
        return 1;
    }

    /* renamed from: i */
    public final boolean mo20550i() {
        return this.f27228c;
    }

    /* renamed from: j */
    public final Bitmap mo20551j(Bitmap bitmap, int i) {
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i, (bitmap.getHeight() * i) / bitmap.getWidth());
        Intrinsics.checkNotNullExpressionValue(extractThumbnail, "extractThumbnail(image, newWidth, newHeight)");
        return mo20541a(extractThumbnail);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f27226a);
        parcel.writeString(this.f27227b.name());
        parcel.writeInt(this.f27228c ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UbScreenshot(String str, UbScreenshotType ubScreenshotType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ubScreenshotType, (i & 4) != 0 ? ubScreenshotType == UbScreenshotType.BASE64 : z);
    }
}
