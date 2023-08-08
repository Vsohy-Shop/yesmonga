package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34753f;
import com.google.zxing.C34762l;
import com.google.zxing.DecodeHintType;
import com.google.zxing.client.android.C34653g;
import com.google.zxing.client.android.C34654h;
import com.google.zxing.client.android.C34659k;
import com.google.zxing.client.android.C34661l;
import com.journeyapps.barcodescanner.camera.C34925j;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a */
    public BarcodeView f84858a;

    /* renamed from: b */
    public ViewfinderView f84859b;

    /* renamed from: c */
    public TextView f84860c;

    /* renamed from: d */
    public C34903a f84861d;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    public interface C34903a {
        /* renamed from: a */
        void mo103358a();

        /* renamed from: b */
        void mo103359b();
    }

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    public class C34904b implements C34906a {

        /* renamed from: a */
        public C34906a f84862a;

        public C34904b(C34906a aVar) {
            this.f84862a = aVar;
        }

        /* renamed from: a */
        public void mo103360a(List<C34762l> list) {
            for (C34762l a : list) {
                DecoratedBarcodeView.this.f84859b.mo103362a(a);
            }
            this.f84862a.mo103360a(list);
        }

        /* renamed from: b */
        public void mo103361b(C34908c cVar) {
            this.f84862a.mo103361b(cVar);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        mo103340e();
    }

    /* renamed from: b */
    public void mo103337b(C34925j jVar) {
        this.f84858a.mo103293m(jVar);
    }

    /* renamed from: c */
    public void mo103338c(C34906a aVar) {
        this.f84858a.mo103264K(new C34904b(aVar));
    }

    /* renamed from: d */
    public void mo103339d(C34906a aVar) {
        this.f84858a.mo103265L(new C34904b(aVar));
    }

    /* renamed from: e */
    public final void mo103340e() {
        mo103341f((AttributeSet) null);
    }

    /* renamed from: f */
    public final void mo103341f(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34661l.C34672k.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(C34661l.C34672k.zxing_view_zxing_scanner_layout, C34661l.C34668g.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(C34661l.C34666e.zxing_barcode_surface);
        this.f84858a = barcodeView;
        if (barcodeView != null) {
            barcodeView.mo103302r(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(C34661l.C34666e.zxing_viewfinder_view);
            this.f84859b = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f84858a);
                this.f84860c = (TextView) findViewById(C34661l.C34666e.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    /* renamed from: g */
    public void mo103342g(Intent intent) {
        int intExtra;
        Set<BarcodeFormat> a = C34653g.m141350a(intent);
        Map<DecodeHintType, Object> a2 = C34654h.m141352a(intent);
        CameraSettings cameraSettings = new CameraSettings();
        if (intent.hasExtra(C34659k.C34660a.f83879j) && (intExtra = intent.getIntExtra(C34659k.C34660a.f83879j, -1)) >= 0) {
            cameraSettings.mo103403q(intExtra);
        }
        if (intent.hasExtra(C34659k.C34660a.f83880k) && intent.getBooleanExtra(C34659k.C34660a.f83880k, false)) {
            setTorchOn();
        }
        String stringExtra = intent.getStringExtra(C34659k.C34660a.f83889t);
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra(C34659k.C34660a.f83866C, 0);
        String stringExtra2 = intent.getStringExtra(C34659k.C34660a.f83881l);
        new C34753f().mo102838e(a2);
        this.f84858a.setCameraSettings(cameraSettings);
        this.f84858a.setDecoderFactory(new C34952o(a, a2, stringExtra2, intExtra2));
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(C34661l.C34666e.zxing_barcode_surface);
    }

    public CameraSettings getCameraSettings() {
        return this.f84858a.getCameraSettings();
    }

    public C34947l getDecoderFactory() {
        return this.f84858a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f84860c;
    }

    public ViewfinderView getViewFinder() {
        return this.f84859b;
    }

    /* renamed from: h */
    public void mo103348h() {
        this.f84858a.mo103272w();
    }

    /* renamed from: i */
    public void mo103349i() {
        this.f84858a.mo103313x();
    }

    /* renamed from: j */
    public void mo103350j() {
        this.f84858a.mo103275A();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            setTorchOn();
            return true;
        } else if (i == 25) {
            setTorchOff();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.f84858a.setCameraSettings(cameraSettings);
    }

    public void setDecoderFactory(C34947l lVar) {
        this.f84858a.setDecoderFactory(lVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f84860c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(C34903a aVar) {
        this.f84861d = aVar;
    }

    public void setTorchOff() {
        this.f84858a.setTorch(false);
        C34903a aVar = this.f84861d;
        if (aVar != null) {
            aVar.mo103358a();
        }
    }

    public void setTorchOn() {
        this.f84858a.setTorch(true);
        C34903a aVar = this.f84861d;
        if (aVar != null) {
            aVar.mo103359b();
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo103341f(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo103341f(attributeSet);
    }
}
