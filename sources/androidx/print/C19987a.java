package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.io.FileNotFoundException;

/* renamed from: androidx.print.a */
public final class C19987a {

    /* renamed from: g */
    public static final String f51124g = "PrintHelper";

    /* renamed from: h */
    public static final int f51125h = 3500;

    /* renamed from: i */
    public static final boolean f51126i = true;

    /* renamed from: j */
    public static final boolean f51127j = true;

    /* renamed from: k */
    public static final int f51128k = 1;

    /* renamed from: l */
    public static final int f51129l = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: m */
    public static final int f51130m = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: n */
    public static final int f51131n = 2;

    /* renamed from: o */
    public static final int f51132o = 1;

    /* renamed from: p */
    public static final int f51133p = 2;

    /* renamed from: a */
    public final Context f51134a;

    /* renamed from: b */
    public BitmapFactory.Options f51135b = null;

    /* renamed from: c */
    public final Object f51136c = new Object();

    /* renamed from: d */
    public int f51137d = 2;

    /* renamed from: e */
    public int f51138e = 2;

    /* renamed from: f */
    public int f51139f = 1;

    /* renamed from: androidx.print.a$a */
    public class C19988a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a */
        public final /* synthetic */ CancellationSignal f51140a;

        /* renamed from: b */
        public final /* synthetic */ PrintAttributes f51141b;

        /* renamed from: c */
        public final /* synthetic */ Bitmap f51142c;

        /* renamed from: d */
        public final /* synthetic */ PrintAttributes f51143d;

        /* renamed from: e */
        public final /* synthetic */ int f51144e;

        /* renamed from: f */
        public final /* synthetic */ ParcelFileDescriptor f51145f;

        /* renamed from: g */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f51146g;

        public C19988a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f51140a = cancellationSignal;
            this.f51141b = printAttributes;
            this.f51142c = bitmap;
            this.f51143d = printAttributes2;
            this.f51144e = i;
            this.f51145f = parcelFileDescriptor;
            this.f51146g = writeResultCallback;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d2 */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Throwable doInBackground(java.lang.Void... r9) {
            /*
                r8 = this;
                android.os.CancellationSignal r9 = r8.f51140a     // Catch:{ all -> 0x00da }
                boolean r9 = r9.isCanceled()     // Catch:{ all -> 0x00da }
                r0 = 0
                if (r9 == 0) goto L_0x000a
                return r0
            L_0x000a:
                android.print.pdf.PrintedPdfDocument r9 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00da }
                androidx.print.a r1 = androidx.print.C19987a.this     // Catch:{ all -> 0x00da }
                android.content.Context r1 = r1.f51134a     // Catch:{ all -> 0x00da }
                android.print.PrintAttributes r2 = r8.f51141b     // Catch:{ all -> 0x00da }
                r9.<init>(r1, r2)     // Catch:{ all -> 0x00da }
                android.graphics.Bitmap r1 = r8.f51142c     // Catch:{ all -> 0x00da }
                android.print.PrintAttributes r2 = r8.f51141b     // Catch:{ all -> 0x00da }
                int r2 = r2.getColorMode()     // Catch:{ all -> 0x00da }
                android.graphics.Bitmap r1 = androidx.print.C19987a.m92908a(r1, r2)     // Catch:{ all -> 0x00da }
                android.os.CancellationSignal r2 = r8.f51140a     // Catch:{ all -> 0x00da }
                boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00da }
                if (r2 == 0) goto L_0x002a
                return r0
            L_0x002a:
                r2 = 1
                android.graphics.pdf.PdfDocument$Page r3 = r9.startPage(r2)     // Catch:{ all -> 0x00c7 }
                boolean r4 = androidx.print.C19987a.f51127j     // Catch:{ all -> 0x00c7 }
                if (r4 == 0) goto L_0x0041
                android.graphics.RectF r2 = new android.graphics.RectF     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$PageInfo r5 = r3.getInfo()     // Catch:{ all -> 0x00c7 }
                android.graphics.Rect r5 = r5.getContentRect()     // Catch:{ all -> 0x00c7 }
                r2.<init>(r5)     // Catch:{ all -> 0x00c7 }
                goto L_0x0064
            L_0x0041:
                android.print.pdf.PrintedPdfDocument r5 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00c7 }
                androidx.print.a r6 = androidx.print.C19987a.this     // Catch:{ all -> 0x00c7 }
                android.content.Context r6 = r6.f51134a     // Catch:{ all -> 0x00c7 }
                android.print.PrintAttributes r7 = r8.f51143d     // Catch:{ all -> 0x00c7 }
                r5.<init>(r6, r7)     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$Page r2 = r5.startPage(r2)     // Catch:{ all -> 0x00c7 }
                android.graphics.RectF r6 = new android.graphics.RectF     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$PageInfo r7 = r2.getInfo()     // Catch:{ all -> 0x00c7 }
                android.graphics.Rect r7 = r7.getContentRect()     // Catch:{ all -> 0x00c7 }
                r6.<init>(r7)     // Catch:{ all -> 0x00c7 }
                r5.finishPage(r2)     // Catch:{ all -> 0x00c7 }
                r5.close()     // Catch:{ all -> 0x00c7 }
                r2 = r6
            L_0x0064:
                int r5 = r1.getWidth()     // Catch:{ all -> 0x00c7 }
                int r6 = r1.getHeight()     // Catch:{ all -> 0x00c7 }
                int r7 = r8.f51144e     // Catch:{ all -> 0x00c7 }
                android.graphics.Matrix r5 = androidx.print.C19987a.m92910d(r5, r6, r2, r7)     // Catch:{ all -> 0x00c7 }
                if (r4 == 0) goto L_0x0075
                goto L_0x0083
            L_0x0075:
                float r4 = r2.left     // Catch:{ all -> 0x00c7 }
                float r6 = r2.top     // Catch:{ all -> 0x00c7 }
                r5.postTranslate(r4, r6)     // Catch:{ all -> 0x00c7 }
                android.graphics.Canvas r4 = r3.getCanvas()     // Catch:{ all -> 0x00c7 }
                r4.clipRect(r2)     // Catch:{ all -> 0x00c7 }
            L_0x0083:
                android.graphics.Canvas r2 = r3.getCanvas()     // Catch:{ all -> 0x00c7 }
                r2.drawBitmap(r1, r5, r0)     // Catch:{ all -> 0x00c7 }
                r9.finishPage(r3)     // Catch:{ all -> 0x00c7 }
                android.os.CancellationSignal r2 = r8.f51140a     // Catch:{ all -> 0x00c7 }
                boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00c7 }
                if (r2 == 0) goto L_0x00a7
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f51145f     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x009f
                r9.close()     // Catch:{ IOException -> 0x009f }
            L_0x009f:
                android.graphics.Bitmap r9 = r8.f51142c     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00a6
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00a6:
                return r0
            L_0x00a7:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c7 }
                android.os.ParcelFileDescriptor r3 = r8.f51145f     // Catch:{ all -> 0x00c7 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x00c7 }
                r2.<init>(r3)     // Catch:{ all -> 0x00c7 }
                r9.writeTo(r2)     // Catch:{ all -> 0x00c7 }
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f51145f     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x00bf
                r9.close()     // Catch:{ IOException -> 0x00bf }
            L_0x00bf:
                android.graphics.Bitmap r9 = r8.f51142c     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00c6
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00c6:
                return r0
            L_0x00c7:
                r0 = move-exception
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f51145f     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x00d2
                r9.close()     // Catch:{ IOException -> 0x00d2 }
            L_0x00d2:
                android.graphics.Bitmap r9 = r8.f51142c     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00d9
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00d9:
                throw r0     // Catch:{ all -> 0x00da }
            L_0x00da:
                r9 = move-exception
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.print.C19987a.C19988a.doInBackground(java.lang.Void[]):java.lang.Throwable");
        }

        /* renamed from: b */
        public void onPostExecute(Throwable th) {
            if (this.f51140a.isCanceled()) {
                this.f51146g.onWriteCancelled();
            } else if (th == null) {
                this.f51146g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f51146g.onWriteFailed((CharSequence) null);
            }
        }
    }

    /* renamed from: androidx.print.a$b */
    public interface C19989b {
        /* renamed from: a */
        void mo59237a();
    }

    @C0376v0(19)
    /* renamed from: androidx.print.a$c */
    public class C19990c extends PrintDocumentAdapter {

        /* renamed from: a */
        public final String f51148a;

        /* renamed from: b */
        public final int f51149b;

        /* renamed from: c */
        public final Bitmap f51150c;

        /* renamed from: d */
        public final C19989b f51151d;

        /* renamed from: e */
        public PrintAttributes f51152e;

        public C19990c(String str, int i, Bitmap bitmap, C19989b bVar) {
            this.f51148a = str;
            this.f51149b = i;
            this.f51150c = bitmap;
            this.f51151d = bVar;
        }

        public void onFinish() {
            C19989b bVar = this.f51151d;
            if (bVar != null) {
                bVar.mo59237a();
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f51152e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f51148a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C19987a.this.mo59232r(this.f51152e, this.f51149b, this.f51150c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.print.a$d */
    public class C19991d extends PrintDocumentAdapter {

        /* renamed from: a */
        public final String f51154a;

        /* renamed from: b */
        public final Uri f51155b;

        /* renamed from: c */
        public final C19989b f51156c;

        /* renamed from: d */
        public final int f51157d;

        /* renamed from: e */
        public PrintAttributes f51158e;

        /* renamed from: f */
        public AsyncTask<Uri, Boolean, Bitmap> f51159f;

        /* renamed from: g */
        public Bitmap f51160g = null;

        /* renamed from: androidx.print.a$d$a */
        public class C19992a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a */
            public final /* synthetic */ CancellationSignal f51162a;

            /* renamed from: b */
            public final /* synthetic */ PrintAttributes f51163b;

            /* renamed from: c */
            public final /* synthetic */ PrintAttributes f51164c;

            /* renamed from: d */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f51165d;

            /* renamed from: androidx.print.a$d$a$a */
            public class C19993a implements CancellationSignal.OnCancelListener {
                public C19993a() {
                }

                public void onCancel() {
                    C19991d.this.mo59241a();
                    C19992a.this.cancel(false);
                }
            }

            public C19992a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f51162a = cancellationSignal;
                this.f51163b = printAttributes;
                this.f51164c = printAttributes2;
                this.f51165d = layoutResultCallback;
            }

            /* renamed from: a */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    C19991d dVar = C19991d.this;
                    return C19987a.this.mo59224i(dVar.f51155b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* renamed from: b */
            public void onCancelled(Bitmap bitmap) {
                this.f51165d.onLayoutCancelled();
                C19991d.this.f51159f = null;
            }

            /* renamed from: c */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!C19987a.f51126i || C19987a.this.f51139f == 0)) {
                    synchronized (this) {
                        mediaSize = C19991d.this.f51158e.getMediaSize();
                    }
                    if (!(mediaSize == null || mediaSize.isPortrait() == C19987a.m92911g(bitmap))) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                C19991d.this.f51160g = bitmap;
                if (bitmap != null) {
                    this.f51165d.onLayoutFinished(new PrintDocumentInfo.Builder(C19991d.this.f51154a).setContentType(1).setPageCount(1).build(), true ^ this.f51163b.equals(this.f51164c));
                } else {
                    this.f51165d.onLayoutFailed((CharSequence) null);
                }
                C19991d.this.f51159f = null;
            }

            public void onPreExecute() {
                this.f51162a.setOnCancelListener(new C19993a());
            }
        }

        public C19991d(String str, Uri uri, C19989b bVar, int i) {
            this.f51154a = str;
            this.f51155b = uri;
            this.f51156c = bVar;
            this.f51157d = i;
        }

        /* renamed from: a */
        public void mo59241a() {
            synchronized (C19987a.this.f51136c) {
                C19987a aVar = C19987a.this;
                if (aVar.f51135b != null) {
                    aVar.f51135b = null;
                }
            }
        }

        public void onFinish() {
            super.onFinish();
            mo59241a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f51159f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            C19989b bVar = this.f51156c;
            if (bVar != null) {
                bVar.mo59237a();
            }
            Bitmap bitmap = this.f51160g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f51160g = null;
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f51158e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f51160g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f51154a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f51159f = new C19992a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C19987a.this.mo59232r(this.f51158e, this.f51157d, this.f51160g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public C19987a(@C0359n0 Context context) {
        this.f51134a = context;
    }

    /* renamed from: a */
    public static Bitmap m92908a(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    @C0376v0(19)
    /* renamed from: b */
    public static PrintAttributes.Builder m92909b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    /* renamed from: d */
    public static Matrix m92910d(int i, int i2, RectF rectF, int i3) {
        float f;
        Matrix matrix = new Matrix();
        float f2 = (float) i;
        float width = rectF.width() / f2;
        if (i3 == 2) {
            f = Math.max(width, rectF.height() / ((float) i2));
        } else {
            f = Math.min(width, rectF.height() / ((float) i2));
        }
        matrix.postScale(f, f);
        matrix.postTranslate((rectF.width() - (f2 * f)) / 2.0f, (rectF.height() - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    /* renamed from: g */
    public static boolean m92911g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    /* renamed from: q */
    public static boolean m92912q() {
        return true;
    }

    /* renamed from: c */
    public int mo59220c() {
        return this.f51138e;
    }

    /* renamed from: e */
    public int mo59221e() {
        int i = this.f51139f;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: f */
    public int mo59222f() {
        return this.f51137d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC, Splitter:B:17:0x001f] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo59223h(android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0023
            android.content.Context r0 = r2.f51134a
            if (r0 == 0) goto L_0x0023
            r1 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x001c }
            java.io.InputStream r3 = r0.openInputStream(r3)     // Catch:{ all -> 0x001c }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0018
            r3.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r4
        L_0x0019:
            r4 = move-exception
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r4 = move-exception
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            throw r4
        L_0x0023:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bad argument to loadBitmap"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.print.C19987a.mo59223h(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: i */
    public Bitmap mo59224i(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri == null || this.f51134a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        mo59223h(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int max = Math.max(i, i2);
            int i3 = 1;
            while (max > 3500) {
                max >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.f51136c) {
                    options = new BitmapFactory.Options();
                    this.f51135b = options;
                    options.inMutable = true;
                    options.inSampleSize = i3;
                }
                try {
                    Bitmap h = mo59223h(uri, options);
                    synchronized (this.f51136c) {
                        this.f51135b = null;
                    }
                    return h;
                } catch (Throwable th) {
                    synchronized (this.f51136c) {
                        this.f51135b = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo59225j(@C0359n0 String str, @C0359n0 Bitmap bitmap) {
        mo59226k(str, bitmap, (C19989b) null);
    }

    /* renamed from: k */
    public void mo59226k(@C0359n0 String str, @C0359n0 Bitmap bitmap, @C0363p0 C19989b bVar) {
        PrintAttributes.MediaSize mediaSize;
        if (bitmap != null) {
            PrintManager printManager = (PrintManager) this.f51134a.getSystemService("print");
            if (m92911g(bitmap)) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
            } else {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
            }
            printManager.print(str, new C19990c(str, this.f51137d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.f51138e).build());
        }
    }

    /* renamed from: l */
    public void mo59227l(@C0359n0 String str, @C0359n0 Uri uri) throws FileNotFoundException {
        mo59228m(str, uri, (C19989b) null);
    }

    /* renamed from: m */
    public void mo59228m(@C0359n0 String str, @C0359n0 Uri uri, @C0363p0 C19989b bVar) throws FileNotFoundException {
        C19991d dVar = new C19991d(str, uri, bVar, this.f51137d);
        PrintManager printManager = (PrintManager) this.f51134a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f51138e);
        int i = this.f51139f;
        if (i == 1 || i == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    /* renamed from: n */
    public void mo59229n(int i) {
        this.f51138e = i;
    }

    /* renamed from: o */
    public void mo59230o(int i) {
        this.f51139f = i;
    }

    /* renamed from: p */
    public void mo59231p(int i) {
        this.f51137d = i;
    }

    @C0376v0(19)
    /* renamed from: r */
    public void mo59232r(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PrintAttributes printAttributes2;
        if (f51127j) {
            printAttributes2 = printAttributes;
        } else {
            printAttributes2 = m92909b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
        }
        new C19988a(cancellationSignal, printAttributes2, bitmap, printAttributes, i, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
