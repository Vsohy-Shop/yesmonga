package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.C16564b;
import androidx.core.content.C17339i;
import androidx.core.util.C17964b;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.google.common.util.concurrent.C32487a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Deprecated
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.browser.browseractions.f */
public final class C0897f extends C17339i {

    /* renamed from: F0 */
    public static final String f2792F0 = "BrowserServiceFP";

    /* renamed from: G0 */
    public static final String f2793G0 = ".image_provider";

    /* renamed from: H0 */
    public static final String f2794H0 = "content";

    /* renamed from: I0 */
    public static final String f2795I0 = "image_provider";

    /* renamed from: J0 */
    public static final String f2796J0 = "image_provider_images/";

    /* renamed from: K0 */
    public static final String f2797K0 = ".png";

    /* renamed from: L0 */
    public static final String f2798L0 = "image_provider_uris";

    /* renamed from: M0 */
    public static final String f2799M0 = "last_cleanup_time";

    /* renamed from: N0 */
    public static Object f2800N0 = new Object();

    /* renamed from: androidx.browser.browseractions.f$a */
    public class C0898a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ContentResolver f2801a;

        /* renamed from: b */
        public final /* synthetic */ Uri f2802b;

        /* renamed from: c */
        public final /* synthetic */ C16564b f2803c;

        public C0898a(ContentResolver contentResolver, Uri uri, C16564b bVar) {
            this.f2801a = contentResolver;
            this.f2802b = uri;
            this.f2803c = bVar;
        }

        public void run() {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f2801a.openFileDescriptor(this.f2802b, C28515a1.f68703k);
                if (openFileDescriptor == null) {
                    this.f2803c.mo48107m0(new FileNotFoundException());
                    return;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
                if (decodeFileDescriptor == null) {
                    this.f2803c.mo48107m0(new IOException("File could not be decoded."));
                } else {
                    this.f2803c.mo48106j0(decodeFileDescriptor);
                }
            } catch (IOException e) {
                this.f2803c.mo48107m0(e);
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.f$b */
    public static class C0899b extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        public static final long f2804b;

        /* renamed from: c */
        public static final long f2805c;

        /* renamed from: d */
        public static final long f2806d;

        /* renamed from: a */
        public final Context f2807a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f2804b = timeUnit.toMillis(7);
            f2805c = timeUnit.toMillis(7);
            f2806d = timeUnit.toMillis(1);
        }

        public C0899b(Context context) {
            this.f2807a = context.getApplicationContext();
        }

        /* renamed from: b */
        public static boolean m4058b(File file) {
            return file.getName().endsWith("..png");
        }

        /* renamed from: c */
        public static boolean m4059c(SharedPreferences sharedPreferences) {
            if (System.currentTimeMillis() > sharedPreferences.getLong(C0897f.f2799M0, System.currentTimeMillis()) + f2805c) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            long j;
            SharedPreferences sharedPreferences = this.f2807a.getSharedPreferences(this.f2807a.getPackageName() + C0897f.f2793G0, 0);
            if (!m4059c(sharedPreferences)) {
                return null;
            }
            synchronized (C0897f.f2800N0) {
                File file = new File(this.f2807a.getFilesDir(), C0897f.f2795I0);
                if (!file.exists()) {
                    return null;
                }
                File[] listFiles = file.listFiles();
                long currentTimeMillis = System.currentTimeMillis() - f2804b;
                boolean z = true;
                for (File file2 : listFiles) {
                    if (m4058b(file2)) {
                        if (file2.lastModified() < currentTimeMillis && !file2.delete()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Fail to delete image: ");
                            sb.append(file2.getAbsoluteFile());
                            z = false;
                        }
                    }
                }
                if (z) {
                    j = System.currentTimeMillis();
                } else {
                    j = (System.currentTimeMillis() - f2805c) + f2806d;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(C0897f.f2799M0, j);
                edit.apply();
                return null;
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.f$c */
    public static class C0900c extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final Context f2808a;

        /* renamed from: b */
        public final String f2809b;

        /* renamed from: c */
        public final Bitmap f2810c;

        /* renamed from: d */
        public final Uri f2811d;

        /* renamed from: e */
        public final C16564b<Uri> f2812e;

        public C0900c(Context context, String str, Bitmap bitmap, Uri uri, C16564b<Uri> bVar) {
            this.f2808a = context.getApplicationContext();
            this.f2809b = str;
            this.f2810c = bitmap;
            this.f2811d = uri;
            this.f2812e = bVar;
        }

        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            mo3886d();
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            new C0899b(this.f2808a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        /* renamed from: c */
        public final void mo3885c(File file) {
            FileOutputStream fileOutputStream;
            C17964b bVar = new C17964b(file);
            try {
                fileOutputStream = bVar.mo52425h();
                try {
                    this.f2810c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    bVar.mo52421c(fileOutputStream);
                    this.f2812e.mo48106j0(this.f2811d);
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
                bVar.mo52420b(fileOutputStream);
                this.f2812e.mo48107m0(e);
            }
        }

        /* renamed from: d */
        public final void mo3886d() {
            File file = new File(this.f2808a.getFilesDir(), C0897f.f2795I0);
            synchronized (C0897f.f2800N0) {
                if (file.exists() || file.mkdir()) {
                    File file2 = new File(file, this.f2809b + C0897f.f2797K0);
                    if (file2.exists()) {
                        this.f2812e.mo48106j0(this.f2811d);
                    } else {
                        mo3885c(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                    return;
                }
                this.f2812e.mo48107m0(new IOException("Could not create file directory."));
            }
        }
    }

    /* renamed from: j */
    public static Uri m4054j(Context context, String str) {
        return new Uri.Builder().scheme("content").authority(context.getPackageName() + f2793G0).path(f2796J0 + str + f2797K0).build();
    }

    /* renamed from: k */
    public static void m4055k(@C0359n0 Intent intent, @C0363p0 List<Uri> list, @C0359n0 Context context) {
        if (list != null && list.size() != 0) {
            ContentResolver contentResolver = context.getContentResolver();
            intent.addFlags(1);
            ClipData newUri = ClipData.newUri(contentResolver, f2798L0, list.get(0));
            for (int i = 1; i < list.size(); i++) {
                newUri.addItem(new ClipData.Item(list.get(i)));
            }
            intent.setClipData(newUri);
        }
    }

    @C0359n0
    /* renamed from: l */
    public static C32487a<Bitmap> m4056l(@C0359n0 ContentResolver contentResolver, @C0359n0 Uri uri) {
        C16564b t0 = C16564b.m75001t0();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new C0898a(contentResolver, uri, t0));
        return t0;
    }

    @C0341g1
    @C0359n0
    /* renamed from: m */
    public static C16564b<Uri> m4057m(@C0359n0 Context context, @C0359n0 Bitmap bitmap, @C0359n0 String str, int i) {
        String str2 = str + C32920e.f79928l + Integer.toString(i);
        Uri j = m4054j(context, str2);
        C16564b<Uri> t0 = C16564b.m75001t0();
        new C0900c(context, str2, bitmap, j, t0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return t0;
    }
}
