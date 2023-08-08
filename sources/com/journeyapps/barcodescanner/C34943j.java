package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.C17018b;
import androidx.core.content.C17318d;
import com.google.zxing.C34762l;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.client.android.C34651e;
import com.google.zxing.client.android.C34655i;
import com.google.zxing.client.android.C34659k;
import com.google.zxing.client.android.C34661l;
import com.journeyapps.barcodescanner.CameraPreview;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.journeyapps.barcodescanner.j */
public class C34943j {

    /* renamed from: o */
    public static final String f84998o = "j";

    /* renamed from: p */
    public static int f84999p = 250;

    /* renamed from: q */
    public static final String f85000q = "SAVED_ORIENTATION_LOCK";

    /* renamed from: a */
    public Activity f85001a;

    /* renamed from: b */
    public DecoratedBarcodeView f85002b;

    /* renamed from: c */
    public int f85003c = -1;

    /* renamed from: d */
    public boolean f85004d = false;

    /* renamed from: e */
    public boolean f85005e = true;

    /* renamed from: f */
    public String f85006f = "";

    /* renamed from: g */
    public boolean f85007g = false;

    /* renamed from: h */
    public C34655i f85008h;

    /* renamed from: i */
    public C34651e f85009i;

    /* renamed from: j */
    public Handler f85010j;

    /* renamed from: k */
    public boolean f85011k = false;

    /* renamed from: l */
    public C34906a f85012l = new C34944a();

    /* renamed from: m */
    public final CameraPreview.C34902f f85013m;

    /* renamed from: n */
    public boolean f85014n;

    /* renamed from: com.journeyapps.barcodescanner.j$a */
    public class C34944a implements C34906a {
        public C34944a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m142914d(C34908c cVar) {
            C34943j.this.mo103507C(cVar);
        }

        /* renamed from: a */
        public void mo103360a(List<C34762l> list) {
        }

        /* renamed from: b */
        public void mo103361b(C34908c cVar) {
            C34943j.this.f85002b.mo103348h();
            C34943j.this.f85009i.mo102503h();
            C34943j.this.f85010j.post(new C34942i(this, cVar));
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.j$b */
    public class C34945b implements CameraPreview.C34902f {
        public C34945b() {
        }

        /* renamed from: a */
        public void mo103324a() {
        }

        /* renamed from: b */
        public void mo103325b() {
            if (C34943j.this.f85011k) {
                String unused = C34943j.f84998o;
                C34943j.this.m142894t();
            }
        }

        /* renamed from: c */
        public void mo103326c(Exception exc) {
            C34943j jVar = C34943j.this;
            jVar.mo103514m(jVar.f85001a.getString(C34661l.C34670i.zxing_msg_camera_framework_bug));
        }

        /* renamed from: d */
        public void mo103327d() {
        }

        /* renamed from: e */
        public void mo103328e() {
        }
    }

    public C34943j(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        C34945b bVar = new C34945b();
        this.f85013m = bVar;
        this.f85014n = false;
        this.f85001a = activity;
        this.f85002b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().mo103289i(bVar);
        this.f85010j = new Handler();
        this.f85008h = new C34655i(activity, new C34938e(this));
        this.f85009i = new C34651e(activity);
    }

    /* renamed from: B */
    public static Intent m142879B(C34908c cVar, String str) {
        Intent intent = new Intent(C34659k.C34660a.f83870a);
        intent.addFlags(524288);
        intent.putExtra(C34659k.C34660a.f83890u, cVar.toString());
        intent.putExtra(C34659k.C34660a.f83891v, cVar.mo103375b().toString());
        byte[] f = cVar.mo103379f();
        if (f != null && f.length > 0) {
            intent.putExtra(C34659k.C34660a.f83893x, f);
        }
        Map<ResultMetadataType, Object> h = cVar.mo103381h();
        if (h != null) {
            ResultMetadataType resultMetadataType = ResultMetadataType.UPC_EAN_EXTENSION;
            if (h.containsKey(resultMetadataType)) {
                intent.putExtra(C34659k.C34660a.f83892w, h.get(resultMetadataType).toString());
            }
            Number number = (Number) h.get(ResultMetadataType.ORIENTATION);
            if (number != null) {
                intent.putExtra(C34659k.C34660a.f83894y, number.intValue());
            }
            String str2 = (String) h.get(ResultMetadataType.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra(C34659k.C34660a.f83895z, str2);
            }
            Iterable<byte[]> iterable = (Iterable) h.get(ResultMetadataType.BYTE_SEGMENTS);
            if (iterable != null) {
                int i = 0;
                for (byte[] putExtra : iterable) {
                    intent.putExtra(C34659k.C34660a.f83864A + i, putExtra);
                    i++;
                }
            }
        }
        if (str != null) {
            intent.putExtra(C34659k.C34660a.f83865B, str);
        }
        return intent;
    }

    /* renamed from: E */
    public static void m142880E(int i) {
        f84999p = i;
    }

    /* renamed from: p */
    public static int m142891p() {
        return f84999p;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m142892r(DialogInterface dialogInterface, int i) {
        m142894t();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m142893s(DialogInterface dialogInterface) {
        m142894t();
    }

    @TargetApi(23)
    /* renamed from: A */
    public final void mo103506A() {
        if (C17318d.m79718a(this.f85001a, "android.permission.CAMERA") == 0) {
            this.f85002b.mo103350j();
        } else if (!this.f85014n) {
            C17018b.m78743J(this.f85001a, new String[]{"android.permission.CAMERA"}, f84999p);
            this.f85014n = true;
        }
    }

    /* renamed from: C */
    public void mo103507C(C34908c cVar) {
        this.f85001a.setResult(-1, m142879B(cVar, mo103516o(cVar)));
        mo103512k();
    }

    /* renamed from: D */
    public void mo103508D() {
        Intent intent = new Intent(C34659k.C34660a.f83870a);
        intent.putExtra(C34659k.C34660a.f83884o, true);
        this.f85001a.setResult(0, intent);
        mo103512k();
    }

    /* renamed from: F */
    public final void mo103509F() {
        Intent intent = new Intent(C34659k.C34660a.f83870a);
        intent.putExtra(C34659k.C34660a.f83885p, true);
        this.f85001a.setResult(0, intent);
    }

    /* renamed from: G */
    public void mo103510G(boolean z) {
        mo103511H(z, "");
    }

    /* renamed from: H */
    public void mo103511H(boolean z, String str) {
        this.f85005e = z;
        if (str == null) {
            str = "";
        }
        this.f85006f = str;
    }

    /* renamed from: k */
    public void mo103512k() {
        if (this.f85002b.getBarcodeView().mo103310t()) {
            m142894t();
        } else {
            this.f85011k = true;
        }
        this.f85002b.mo103348h();
        this.f85008h.mo102507d();
    }

    /* renamed from: l */
    public void mo103513l() {
        this.f85002b.mo103339d(this.f85012l);
    }

    /* renamed from: m */
    public void mo103514m(String str) {
        if (!this.f85001a.isFinishing() && !this.f85007g && !this.f85011k) {
            if (str.isEmpty()) {
                str = this.f85001a.getString(C34661l.C34670i.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f85001a);
            builder.setTitle(this.f85001a.getString(C34661l.C34670i.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(C34661l.C34670i.zxing_button_ok, new C34939f(this));
            builder.setOnCancelListener(new C34940g(this));
            builder.show();
        }
    }

    /* renamed from: n */
    public final void m142894t() {
        this.f85001a.finish();
    }

    /* renamed from: o */
    public final String mo103516o(C34908c cVar) {
        if (this.f85004d) {
            Bitmap c = cVar.mo103376c();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f85001a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                c.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create temporary file and store bitmap! ");
                sb.append(e);
            }
        }
        return null;
    }

    /* renamed from: q */
    public void mo103517q(Intent intent, Bundle bundle) {
        this.f85001a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f85003c = bundle.getInt(f85000q, -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra(C34659k.C34660a.f83888s, true)) {
                mo103518u();
            }
            if (C34659k.C34660a.f83870a.equals(intent.getAction())) {
                this.f85002b.mo103342g(intent);
            }
            if (!intent.getBooleanExtra(C34659k.C34660a.f83882m, true)) {
                this.f85009i.mo102504i(false);
            }
            if (intent.hasExtra(C34659k.C34660a.f83886q)) {
                mo103511H(intent.getBooleanExtra(C34659k.C34660a.f83886q, true), intent.getStringExtra(C34659k.C34660a.f83887r));
            }
            if (intent.hasExtra(C34659k.C34660a.f83884o)) {
                this.f85010j.postDelayed(new C34941h(this), intent.getLongExtra(C34659k.C34660a.f83884o, 0));
            }
            if (intent.getBooleanExtra(C34659k.C34660a.f83883n, false)) {
                this.f85004d = true;
            }
        }
    }

    /* renamed from: u */
    public void mo103518u() {
        if (this.f85003c == -1) {
            int rotation = this.f85001a.getWindowManager().getDefaultDisplay().getRotation();
            int i = this.f85001a.getResources().getConfiguration().orientation;
            int i2 = 0;
            if (i == 2) {
                if (!(rotation == 0 || rotation == 1)) {
                    i2 = 8;
                }
            } else if (i == 1) {
                i2 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f85003c = i2;
        }
        this.f85001a.setRequestedOrientation(this.f85003c);
    }

    /* renamed from: v */
    public void mo103519v() {
        this.f85007g = true;
        this.f85008h.mo102507d();
        this.f85010j.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: w */
    public void mo103520w() {
        this.f85008h.mo102507d();
        this.f85002b.mo103349i();
    }

    /* renamed from: x */
    public void mo103521x(int i, String[] strArr, int[] iArr) {
        if (i != f84999p) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            mo103509F();
            if (this.f85005e) {
                mo103514m(this.f85006f);
            } else {
                mo103512k();
            }
        } else {
            this.f85002b.mo103350j();
        }
    }

    /* renamed from: y */
    public void mo103522y() {
        mo103506A();
        this.f85008h.mo102511h();
    }

    /* renamed from: z */
    public void mo103523z(Bundle bundle) {
        bundle.putInt(f85000q, this.f85003c);
    }
}
