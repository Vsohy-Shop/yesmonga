package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.C0359n0;
import com.google.zxing.client.android.C34661l;

public class CaptureActivity extends Activity {

    /* renamed from: a */
    public C34943j f84856a;

    /* renamed from: b */
    public DecoratedBarcodeView f84857b;

    /* renamed from: a */
    public DecoratedBarcodeView mo103329a() {
        setContentView(C34661l.C34668g.zxing_capture);
        return (DecoratedBarcodeView) findViewById(C34661l.C34666e.zxing_barcode_scanner);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f84857b = mo103329a();
        C34943j jVar = new C34943j(this, this.f84857b);
        this.f84856a = jVar;
        jVar.mo103517q(getIntent(), bundle);
        this.f84856a.mo103513l();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f84856a.mo103519v();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f84857b.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f84856a.mo103520w();
    }

    public void onRequestPermissionsResult(int i, @C0359n0 String[] strArr, @C0359n0 int[] iArr) {
        this.f84856a.mo103521x(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.f84856a.mo103522y();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f84856a.mo103523z(bundle);
    }
}
