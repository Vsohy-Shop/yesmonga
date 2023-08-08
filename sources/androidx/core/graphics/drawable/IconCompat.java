package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0329d0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0696c;
import androidx.core.content.C17318d;
import androidx.core.content.res.C17465i;
import androidx.core.util.C17992m;
import androidx.core.util.C18001r;
import androidx.swiperefreshlayout.widget.C20522a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.installations.C33124s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    @C0344h1

    /* renamed from: A */
    public static final String f45868A = "obj";
    @C0344h1

    /* renamed from: B */
    public static final String f45869B = "int1";
    @C0344h1

    /* renamed from: C */
    public static final String f45870C = "int2";
    @C0344h1

    /* renamed from: D */
    public static final String f45871D = "tint_list";
    @C0344h1

    /* renamed from: E */
    public static final String f45872E = "tint_mode";
    @C0344h1

    /* renamed from: F */
    public static final String f45873F = "string1";

    /* renamed from: G */
    public static final PorterDuff.Mode f45874G = PorterDuff.Mode.SRC_IN;

    /* renamed from: k */
    public static final String f45875k = "IconCompat";

    /* renamed from: l */
    public static final int f45876l = -1;

    /* renamed from: m */
    public static final int f45877m = 1;

    /* renamed from: n */
    public static final int f45878n = 2;

    /* renamed from: o */
    public static final int f45879o = 3;

    /* renamed from: p */
    public static final int f45880p = 4;

    /* renamed from: q */
    public static final int f45881q = 5;

    /* renamed from: r */
    public static final int f45882r = 6;

    /* renamed from: s */
    public static final float f45883s = 0.25f;

    /* renamed from: t */
    public static final float f45884t = 0.6666667f;

    /* renamed from: u */
    public static final float f45885u = 0.9166667f;

    /* renamed from: v */
    public static final float f45886v = 0.010416667f;

    /* renamed from: w */
    public static final float f45887w = 0.020833334f;

    /* renamed from: x */
    public static final int f45888x = 61;

    /* renamed from: y */
    public static final int f45889y = 30;
    @C0344h1

    /* renamed from: z */
    public static final String f45890z = "type";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public int f45891a;

    /* renamed from: b */
    public Object f45892b;
    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: c */
    public byte[] f45893c;
    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: d */
    public Parcelable f45894d;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: e */
    public int f45895e;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: f */
    public int f45896f;
    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: g */
    public ColorStateList f45897g;

    /* renamed from: h */
    public PorterDuff.Mode f45898h;
    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: i */
    public String f45899i;
    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: j */
    public String f45900j;

    @C0376v0(23)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C17541a {
        @C0363p0
        /* renamed from: a */
        public static IconCompat m80420a(@C0359n0 Context context, @C0359n0 Icon icon) {
            int e = m80424e(icon);
            if (e == 2) {
                String d = m80423d(icon);
                try {
                    return IconCompat.m80401w(IconCompat.m80386A(context, d), d, m80422c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else if (e == 4) {
                return IconCompat.m80397s(m80425f(icon));
            } else {
                if (e == 6) {
                    return IconCompat.m80394p(m80425f(icon));
                }
                IconCompat iconCompat = new IconCompat(-1);
                iconCompat.f45892b = icon;
                return iconCompat;
            }
        }

        /* renamed from: b */
        public static IconCompat m80421b(@C0359n0 Object obj) {
            C18001r.m81775l(obj);
            int e = m80424e(obj);
            if (e == 2) {
                return IconCompat.m80401w((Resources) null, m80423d(obj), m80422c(obj));
            }
            if (e == 4) {
                return IconCompat.m80397s(m80425f(obj));
            }
            if (e == 6) {
                return IconCompat.m80394p(m80425f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f45892b = obj;
            return iconCompat;
        }

        @C0329d0
        @C0375v
        /* renamed from: c */
        public static int m80422c(@C0359n0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C17543c.m80430a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        @C0363p0
        /* renamed from: d */
        public static String m80423d(@C0359n0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C17543c.m80431b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: e */
        public static int m80424e(@C0359n0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C17543c.m80432c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                return -1;
            } catch (InvocationTargetException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                return -1;
            } catch (NoSuchMethodException unused3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to get icon type ");
                sb3.append(obj);
                return -1;
            }
        }

        @C0363p0
        @C0373u
        /* renamed from: f */
        public static Uri m80425f(@C0359n0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C17543c.m80433d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        @C0373u
        /* renamed from: g */
        public static Drawable m80426g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @C0373u
        /* renamed from: h */
        public static Icon m80427h(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f45891a) {
                case -1:
                    return (Icon) iconCompat.f45892b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f45892b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.mo51948z(), iconCompat.f45895e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f45892b, iconCompat.f45895e, iconCompat.f45896f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f45892b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.m80392n((Bitmap) iconCompat.f45892b, false));
                        break;
                    } else {
                        icon = C17542b.m80429b((Bitmap) iconCompat.f45892b);
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        icon = C17544d.m80434a(iconCompat.mo51931D());
                        break;
                    } else if (context != null) {
                        InputStream E = iconCompat.mo51932E(context);
                        if (E != null) {
                            if (i < 26) {
                                icon = Icon.createWithBitmap(IconCompat.m80392n(BitmapFactory.decodeStream(E), false));
                                break;
                            } else {
                                icon = C17542b.m80429b(BitmapFactory.decodeStream(E));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.mo51931D());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.mo51931D());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f45897g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f45898h;
            if (mode != IconCompat.f45874G) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    public static class C17542b {
        @C0373u
        /* renamed from: a */
        public static Drawable m80428a(Drawable drawable, Drawable drawable2) {
            C17556h.m80481a();
            return C17555g.m80480a(drawable, drawable2);
        }

        @C0373u
        /* renamed from: b */
        public static Icon m80429b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    public static class C17543c {
        @C0373u
        /* renamed from: a */
        public static int m80430a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @C0373u
        /* renamed from: b */
        public static String m80431b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @C0373u
        /* renamed from: c */
        public static int m80432c(Object obj) {
            return ((Icon) obj).getType();
        }

        @C0373u
        /* renamed from: d */
        public static Uri m80433d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    public static class C17544d {
        @C0373u
        /* renamed from: a */
        public static Icon m80434a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.graphics.drawable.IconCompat$e */
    public @interface C17545e {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.f45891a = -1;
        this.f45893c = null;
        this.f45894d = null;
        this.f45895e = 0;
        this.f45896f = 0;
        this.f45897g = null;
        this.f45898h = f45874G;
        this.f45899i = null;
    }

    /* renamed from: A */
    public static Resources m80386A(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", new Object[]{str});
            return null;
        }
    }

    /* renamed from: M */
    public static String m80387M(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @C0363p0
    /* renamed from: j */
    public static IconCompat m80388j(@C0359n0 Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f45895e = bundle.getInt(f45869B);
        iconCompat.f45896f = bundle.getInt(f45870C);
        iconCompat.f45900j = bundle.getString(f45873F);
        if (bundle.containsKey(f45871D)) {
            iconCompat.f45897g = (ColorStateList) bundle.getParcelable(f45871D);
        }
        if (bundle.containsKey(f45872E)) {
            iconCompat.f45898h = PorterDuff.Mode.valueOf(bundle.getString(f45872E));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.f45892b = bundle.getParcelable(f45868A);
                break;
            case 2:
            case 4:
            case 6:
                iconCompat.f45892b = bundle.getString(f45868A);
                break;
            case 3:
                iconCompat.f45892b = bundle.getByteArray(f45868A);
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown type ");
                sb.append(i);
                return null;
        }
        return iconCompat;
    }

    @C0363p0
    @C0376v0(23)
    /* renamed from: k */
    public static IconCompat m80389k(@C0359n0 Context context, @C0359n0 Icon icon) {
        C18001r.m81775l(icon);
        return C17541a.m80420a(context, icon);
    }

    @C0363p0
    @C0376v0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public static IconCompat m80390l(@C0359n0 Icon icon) {
        return C17541a.m80421b(icon);
    }

    @C0363p0
    @C0376v0(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public static IconCompat m80391m(@C0359n0 Icon icon) {
        if (C17541a.m80424e(icon) == 2 && C17541a.m80422c(icon) == 0) {
            return null;
        }
        return C17541a.m80421b(icon);
    }

    @C0344h1
    /* renamed from: n */
    public static Bitmap m80392n(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, C20522a.f52909e);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, C20522a.f52910f);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    @C0359n0
    /* renamed from: o */
    public static IconCompat m80393o(@C0359n0 Bitmap bitmap) {
        C17992m.m81743d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f45892b = bitmap;
        return iconCompat;
    }

    @C0359n0
    /* renamed from: p */
    public static IconCompat m80394p(@C0359n0 Uri uri) {
        C17992m.m81743d(uri);
        return m80395q(uri.toString());
    }

    @C0359n0
    /* renamed from: q */
    public static IconCompat m80395q(@C0359n0 String str) {
        C17992m.m81743d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f45892b = str;
        return iconCompat;
    }

    @C0359n0
    /* renamed from: r */
    public static IconCompat m80396r(@C0359n0 Bitmap bitmap) {
        C17992m.m81743d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f45892b = bitmap;
        return iconCompat;
    }

    @C0359n0
    /* renamed from: s */
    public static IconCompat m80397s(@C0359n0 Uri uri) {
        C17992m.m81743d(uri);
        return m80398t(uri.toString());
    }

    @C0359n0
    /* renamed from: t */
    public static IconCompat m80398t(@C0359n0 String str) {
        C17992m.m81743d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f45892b = str;
        return iconCompat;
    }

    @C0359n0
    /* renamed from: u */
    public static IconCompat m80399u(@C0359n0 byte[] bArr, int i, int i2) {
        C17992m.m81743d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f45892b = bArr;
        iconCompat.f45895e = i;
        iconCompat.f45896f = i2;
        return iconCompat;
    }

    @C0359n0
    /* renamed from: v */
    public static IconCompat m80400v(@C0359n0 Context context, @C0375v int i) {
        C17992m.m81743d(context);
        return m80401w(context.getResources(), context.getPackageName(), i);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: w */
    public static IconCompat m80401w(@C0363p0 Resources resources, @C0359n0 String str, @C0375v int i) {
        C17992m.m81743d(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f45895e = i;
            if (resources != null) {
                try {
                    iconCompat.f45892b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f45892b = str;
            }
            iconCompat.f45900j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: B */
    public int mo51930B() {
        int i = this.f45891a;
        if (i == -1) {
            return C17541a.m80424e(this.f45892b);
        }
        return i;
    }

    @C0359n0
    /* renamed from: D */
    public Uri mo51931D() {
        int i = this.f45891a;
        if (i == -1) {
            return C17541a.m80425f(this.f45892b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f45892b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: E */
    public InputStream mo51932E(@C0359n0 Context context) {
        Uri D = mo51931D();
        String scheme = D.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(D);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to load image from URI: ");
                sb.append(D);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f45892b));
            } catch (FileNotFoundException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to load image from path: ");
                sb2.append(D);
                return null;
            }
        }
    }

    @C0363p0
    /* renamed from: F */
    public Drawable mo51933F(@C0359n0 Context context) {
        mo51944i(context);
        return C17541a.m80426g(mo51939L(context), context);
    }

    /* renamed from: G */
    public final Drawable mo51934G(Context context) {
        switch (this.f45891a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f45892b);
            case 2:
                String z = mo51948z();
                if (TextUtils.isEmpty(z)) {
                    z = context.getPackageName();
                }
                try {
                    return C17465i.m80175g(m80386A(context, z), this.f45895e, context.getTheme());
                } catch (RuntimeException unused) {
                    String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f45895e), this.f45892b});
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f45892b, this.f45895e, this.f45896f));
            case 4:
                InputStream E = mo51932E(context);
                if (E != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(E));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), m80392n((Bitmap) this.f45892b, false));
            case 6:
                InputStream E2 = mo51932E(context);
                if (E2 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return C17542b.m80428a((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(E2)));
                    }
                    return new BitmapDrawable(context.getResources(), m80392n(BitmapFactory.decodeStream(E2), false));
                }
                break;
        }
        return null;
    }

    @C0359n0
    /* renamed from: H */
    public IconCompat mo51935H(@C0354l int i) {
        return mo51936I(ColorStateList.valueOf(i));
    }

    @C0359n0
    /* renamed from: I */
    public IconCompat mo51936I(@C0363p0 ColorStateList colorStateList) {
        this.f45897g = colorStateList;
        return this;
    }

    @C0359n0
    /* renamed from: J */
    public IconCompat mo51937J(@C0363p0 PorterDuff.Mode mode) {
        this.f45898h = mode;
        return this;
    }

    @C0359n0
    @C0376v0(23)
    @Deprecated
    /* renamed from: K */
    public Icon mo51938K() {
        return mo51939L((Context) null);
    }

    @C0359n0
    @C0376v0(23)
    /* renamed from: L */
    public Icon mo51939L(@C0363p0 Context context) {
        return C17541a.m80427h(this, context);
    }

    @C0359n0
    /* renamed from: a */
    public Bundle mo51940a() {
        Bundle bundle = new Bundle();
        switch (this.f45891a) {
            case -1:
                bundle.putParcelable(f45868A, (Parcelable) this.f45892b);
                break;
            case 1:
            case 5:
                bundle.putParcelable(f45868A, (Bitmap) this.f45892b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(f45868A, (String) this.f45892b);
                break;
            case 3:
                bundle.putByteArray(f45868A, (byte[]) this.f45892b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putInt("type", this.f45891a);
        bundle.putInt(f45869B, this.f45895e);
        bundle.putInt(f45870C, this.f45896f);
        bundle.putString(f45873F, this.f45900j);
        ColorStateList colorStateList = this.f45897g;
        if (colorStateList != null) {
            bundle.putParcelable(f45871D, colorStateList);
        }
        PorterDuff.Mode mode = this.f45898h;
        if (mode != f45874G) {
            bundle.putString(f45872E, mode.name());
        }
        return bundle;
    }

    /* renamed from: f */
    public void mo51941f() {
        this.f45898h = PorterDuff.Mode.valueOf(this.f45899i);
        switch (this.f45891a) {
            case -1:
                Parcelable parcelable = this.f45894d;
                if (parcelable != null) {
                    this.f45892b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f45894d;
                if (parcelable2 != null) {
                    this.f45892b = parcelable2;
                    return;
                }
                byte[] bArr = this.f45893c;
                this.f45892b = bArr;
                this.f45891a = 3;
                this.f45895e = 0;
                this.f45896f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f45893c, Charset.forName("UTF-16"));
                this.f45892b = str;
                if (this.f45891a == 2 && this.f45900j == null) {
                    this.f45900j = str.split(C33124s.f80355c, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f45892b = this.f45893c;
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public void mo51942g(boolean z) {
        this.f45899i = this.f45898h.name();
        switch (this.f45891a) {
            case -1:
                if (!z) {
                    this.f45894d = (Parcelable) this.f45892b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f45892b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f45893c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f45894d = (Parcelable) this.f45892b;
                return;
            case 2:
                this.f45893c = ((String) this.f45892b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f45893c = (byte[]) this.f45892b;
                return;
            case 4:
            case 6:
                this.f45893c = this.f45892b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public void mo51943h(@C0359n0 Intent intent, @C0363p0 Drawable drawable, @C0359n0 Context context) {
        Bitmap bitmap;
        mo51944i(context);
        int i = this.f45891a;
        if (i == 1) {
            bitmap = (Bitmap) this.f45892b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context createPackageContext = context.createPackageContext(mo51948z(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f45895e));
                    return;
                }
                Drawable i2 = C17318d.m79726i(createPackageContext, this.f45895e);
                if (i2.getIntrinsicWidth() > 0) {
                    if (i2.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(i2.getIntrinsicWidth(), i2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        i2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        i2.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService(C0696c.f2306r)).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                i2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                i2.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f45892b, e);
            }
        } else if (i == 5) {
            bitmap = m80392n((Bitmap) this.f45892b, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: i */
    public void mo51944i(@C0359n0 Context context) {
        Object obj;
        if (this.f45891a == 2 && (obj = this.f45892b) != null) {
            String str = (String) obj;
            if (str.contains(C33124s.f80355c)) {
                String str2 = str.split(C33124s.f80355c, -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(C33124s.f80355c, -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String z = mo51948z();
                    int identifier = m80386A(context, z).getIdentifier(str4, str3, str5);
                    if (this.f45895e != identifier) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Id has changed for ");
                        sb.append(z);
                        sb.append(" ");
                        sb.append(str);
                        this.f45895e = identifier;
                    }
                }
            }
        }
    }

    @C0359n0
    public String toString() {
        if (this.f45891a == -1) {
            return String.valueOf(this.f45892b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m80387M(this.f45891a));
        switch (this.f45891a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f45892b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f45892b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f45900j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo51947y())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f45895e);
                if (this.f45896f != 0) {
                    sb.append(" off=");
                    sb.append(this.f45896f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f45892b);
                break;
        }
        if (this.f45897g != null) {
            sb.append(" tint=");
            sb.append(this.f45897g);
        }
        if (this.f45898h != f45874G) {
            sb.append(" mode=");
            sb.append(this.f45898h);
        }
        sb.append(")");
        return sb.toString();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: x */
    public Bitmap mo51946x() {
        int i = this.f45891a;
        if (i == -1) {
            Object obj = this.f45892b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f45892b;
        } else {
            if (i == 5) {
                return m80392n((Bitmap) this.f45892b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    @C0375v
    /* renamed from: y */
    public int mo51947y() {
        int i = this.f45891a;
        if (i == -1) {
            return C17541a.m80422c(this.f45892b);
        }
        if (i == 2) {
            return this.f45895e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @C0359n0
    /* renamed from: z */
    public String mo51948z() {
        int i = this.f45891a;
        if (i == -1) {
            return C17541a.m80423d(this.f45892b);
        }
        if (i == 2) {
            String str = this.f45900j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f45892b).split(C33124s.f80355c, -1)[0];
            }
            return this.f45900j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public IconCompat(int i) {
        this.f45893c = null;
        this.f45894d = null;
        this.f45895e = 0;
        this.f45896f = 0;
        this.f45897g = null;
        this.f45898h = f45874G;
        this.f45899i = null;
        this.f45891a = i;
    }
}
