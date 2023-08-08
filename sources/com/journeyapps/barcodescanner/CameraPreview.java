package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.zxing.client.android.C34661l;
import com.journeyapps.barcodescanner.camera.C34918h;
import com.journeyapps.barcodescanner.camera.C34925j;
import com.journeyapps.barcodescanner.camera.C34926k;
import com.journeyapps.barcodescanner.camera.C34928m;
import com.journeyapps.barcodescanner.camera.C34929n;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.journeyapps.barcodescanner.camera.C34931p;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.ArrayList;
import java.util.List;

public class CameraPreview extends ViewGroup {

    /* renamed from: S0 */
    public static final String f84823S0 = "CameraPreview";

    /* renamed from: T0 */
    public static final int f84824T0 = 250;

    /* renamed from: E0 */
    public C34959u f84825E0;

    /* renamed from: F0 */
    public C34959u f84826F0;

    /* renamed from: G0 */
    public Rect f84827G0;

    /* renamed from: H0 */
    public C34959u f84828H0;

    /* renamed from: I0 */
    public Rect f84829I0 = null;

    /* renamed from: J0 */
    public Rect f84830J0 = null;

    /* renamed from: K0 */
    public C34959u f84831K0 = null;

    /* renamed from: L0 */
    public double f84832L0 = 0.1d;

    /* renamed from: M0 */
    public C34935s f84833M0 = null;

    /* renamed from: N0 */
    public boolean f84834N0 = false;

    /* renamed from: O0 */
    public final SurfaceHolder.Callback f84835O0 = new C34898b();

    /* renamed from: P0 */
    public final Handler.Callback f84836P0 = new C34899c();

    /* renamed from: Q0 */
    public C34956s f84837Q0 = new C34900d();

    /* renamed from: R0 */
    public final C34902f f84838R0 = new C34901e();

    /* renamed from: a */
    public C34918h f84839a;

    /* renamed from: b */
    public WindowManager f84840b;

    /* renamed from: c */
    public Handler f84841c;

    /* renamed from: d */
    public boolean f84842d = false;

    /* renamed from: e */
    public SurfaceView f84843e;

    /* renamed from: f */
    public TextureView f84844f;

    /* renamed from: g */
    public boolean f84845g = false;

    /* renamed from: v */
    public C34957t f84846v;

    /* renamed from: w */
    public int f84847w = -1;

    /* renamed from: x */
    public List<C34902f> f84848x = new ArrayList();

    /* renamed from: y */
    public C34929n f84849y;

    /* renamed from: z */
    public CameraSettings f84850z = new CameraSettings();

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$a */
    public class C34897a implements TextureView.SurfaceTextureListener {
        public C34897a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C34959u unused = CameraPreview.this.f84828H0 = new C34959u(i, i2);
            CameraPreview.this.mo103279E();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$b */
    public class C34898b implements SurfaceHolder.Callback {
        public C34898b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                String unused = CameraPreview.f84823S0;
                return;
            }
            C34959u unused2 = CameraPreview.this.f84828H0 = new C34959u(i2, i3);
            CameraPreview.this.mo103279E();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C34959u unused = CameraPreview.this.f84828H0 = null;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$c */
    public class C34899c implements Handler.Callback {
        public C34899c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C34661l.C34666e.zxing_prewiew_size_ready) {
                CameraPreview.this.mo103314y((C34959u) message.obj);
                return true;
            } else if (i == C34661l.C34666e.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (!CameraPreview.this.mo103303s()) {
                    return false;
                }
                CameraPreview.this.mo103272w();
                CameraPreview.this.f84838R0.mo103326c(exc);
                return false;
            } else if (i != C34661l.C34666e.zxing_camera_closed) {
                return false;
            } else {
                CameraPreview.this.f84838R0.mo103325b();
                return false;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$d */
    public class C34900d implements C34956s {
        public C34900d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m142669c() {
            CameraPreview.this.mo103276B();
        }

        /* renamed from: a */
        public void mo103323a(int i) {
            CameraPreview.this.f84841c.postDelayed(new C34937d(this), 250);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$e */
    public class C34901e implements C34902f {
        public C34901e() {
        }

        /* renamed from: a */
        public void mo103324a() {
            for (C34902f a : CameraPreview.this.f84848x) {
                a.mo103324a();
            }
        }

        /* renamed from: b */
        public void mo103325b() {
            for (C34902f b : CameraPreview.this.f84848x) {
                b.mo103325b();
            }
        }

        /* renamed from: c */
        public void mo103326c(Exception exc) {
            for (C34902f c : CameraPreview.this.f84848x) {
                c.mo103326c(exc);
            }
        }

        /* renamed from: d */
        public void mo103327d() {
            for (C34902f d : CameraPreview.this.f84848x) {
                d.mo103327d();
            }
        }

        /* renamed from: e */
        public void mo103328e() {
            for (C34902f e : CameraPreview.this.f84848x) {
                e.mo103328e();
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.CameraPreview$f */
    public interface C34902f {
        /* renamed from: a */
        void mo103324a();

        /* renamed from: b */
        void mo103325b();

        /* renamed from: c */
        void mo103326c(Exception exc);

        /* renamed from: d */
        void mo103327d();

        /* renamed from: e */
        void mo103328e();
    }

    public CameraPreview(Context context) {
        super(context);
        mo103301q(context, (AttributeSet) null, 0, 0);
    }

    private int getDisplayRotation() {
        return this.f84840b.getDefaultDisplay().getRotation();
    }

    /* renamed from: A */
    public void mo103275A() {
        C34961w.m142988a();
        mo103300p();
        if (this.f84828H0 != null) {
            mo103279E();
        } else {
            SurfaceView surfaceView = this.f84843e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f84835O0);
            } else {
                TextureView textureView = this.f84844f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        mo103280F().onSurfaceTextureAvailable(this.f84844f.getSurfaceTexture(), this.f84844f.getWidth(), this.f84844f.getHeight());
                    } else {
                        this.f84844f.setSurfaceTextureListener(mo103280F());
                    }
                }
            }
        }
        requestLayout();
        this.f84846v.mo103547e(getContext(), this.f84837Q0);
    }

    /* renamed from: B */
    public final void mo103276B() {
        if (mo103303s() && getDisplayRotation() != this.f84847w) {
            mo103272w();
            mo103275A();
        }
    }

    /* renamed from: C */
    public final void mo103277C() {
        if (this.f84842d) {
            TextureView textureView = new TextureView(getContext());
            this.f84844f = textureView;
            textureView.setSurfaceTextureListener(mo103280F());
            addView(this.f84844f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f84843e = surfaceView;
        surfaceView.getHolder().addCallback(this.f84835O0);
        addView(this.f84843e);
    }

    /* renamed from: D */
    public final void mo103278D(C34926k kVar) {
        if (!this.f84845g && this.f84839a != null) {
            this.f84839a.mo103423I(kVar);
            this.f84839a.mo103426L();
            this.f84845g = true;
            mo103273z();
            this.f84838R0.mo103328e();
        }
    }

    /* renamed from: E */
    public final void mo103279E() {
        Rect rect;
        C34959u uVar = this.f84828H0;
        if (uVar != null && this.f84826F0 != null && (rect = this.f84827G0) != null) {
            if (this.f84843e == null || !uVar.equals(new C34959u(rect.width(), this.f84827G0.height()))) {
                TextureView textureView = this.f84844f;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f84826F0 != null) {
                        this.f84844f.setTransform(mo103292l(new C34959u(this.f84844f.getWidth(), this.f84844f.getHeight()), this.f84826F0));
                    }
                    mo103278D(new C34926k(this.f84844f.getSurfaceTexture()));
                    return;
                }
                return;
            }
            mo103278D(new C34926k(this.f84843e.getHolder()));
        }
    }

    @TargetApi(14)
    /* renamed from: F */
    public final TextureView.SurfaceTextureListener mo103280F() {
        return new C34897a();
    }

    public C34918h getCameraInstance() {
        return this.f84839a;
    }

    public CameraSettings getCameraSettings() {
        return this.f84850z;
    }

    public Rect getFramingRect() {
        return this.f84829I0;
    }

    public C34959u getFramingRectSize() {
        return this.f84831K0;
    }

    public double getMarginFraction() {
        return this.f84832L0;
    }

    public Rect getPreviewFramingRect() {
        return this.f84830J0;
    }

    public C34935s getPreviewScalingStrategy() {
        C34935s sVar = this.f84833M0;
        if (sVar != null) {
            return sVar;
        }
        if (this.f84844f != null) {
            return new C34928m();
        }
        return new C34930o();
    }

    public C34959u getPreviewSize() {
        return this.f84826F0;
    }

    /* renamed from: i */
    public void mo103289i(C34902f fVar) {
        this.f84848x.add(fVar);
    }

    /* renamed from: j */
    public final void mo103290j() {
        C34959u uVar;
        C34929n nVar;
        C34959u uVar2 = this.f84825E0;
        if (uVar2 == null || (uVar = this.f84826F0) == null || (nVar = this.f84849y) == null) {
            this.f84830J0 = null;
            this.f84829I0 = null;
            this.f84827G0 = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = uVar.f85046a;
        int i2 = uVar.f85047b;
        int i3 = uVar2.f85046a;
        int i4 = uVar2.f85047b;
        Rect f = nVar.mo103490f(uVar);
        if (f.width() > 0 && f.height() > 0) {
            this.f84827G0 = f;
            this.f84829I0 = mo103291k(new Rect(0, 0, i3, i4), this.f84827G0);
            Rect rect = new Rect(this.f84829I0);
            Rect rect2 = this.f84827G0;
            rect.offset(-rect2.left, -rect2.top);
            Rect rect3 = new Rect((rect.left * i) / this.f84827G0.width(), (rect.top * i2) / this.f84827G0.height(), (rect.right * i) / this.f84827G0.width(), (rect.bottom * i2) / this.f84827G0.height());
            this.f84830J0 = rect3;
            if (rect3.width() <= 0 || this.f84830J0.height() <= 0) {
                this.f84830J0 = null;
                this.f84829I0 = null;
                return;
            }
            this.f84838R0.mo103324a();
        }
    }

    /* renamed from: k */
    public Rect mo103291k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f84831K0 != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f84831K0.f85046a) / 2), Math.max(0, (rect3.height() - this.f84831K0.f85047b) / 2));
            return rect3;
        }
        int min = (int) Math.min(((double) rect3.width()) * this.f84832L0, ((double) rect3.height()) * this.f84832L0);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* renamed from: l */
    public Matrix mo103292l(C34959u uVar, C34959u uVar2) {
        float f;
        float f2 = ((float) uVar.f85046a) / ((float) uVar.f85047b);
        float f3 = ((float) uVar2.f85046a) / ((float) uVar2.f85047b);
        float f4 = 1.0f;
        if (f2 < f3) {
            float f5 = f3 / f2;
            f = 1.0f;
            f4 = f5;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        int i = uVar.f85046a;
        int i2 = uVar.f85047b;
        matrix.postTranslate((((float) i) - (((float) i) * f4)) / 2.0f, (((float) i2) - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    /* renamed from: m */
    public void mo103293m(C34925j jVar) {
        C34918h hVar = this.f84839a;
        if (hVar != null) {
            hVar.mo103428m(jVar);
        }
    }

    /* renamed from: n */
    public final void mo103294n(C34959u uVar) {
        this.f84825E0 = uVar;
        C34918h hVar = this.f84839a;
        if (hVar != null && hVar.mo103435t() == null) {
            C34929n nVar = new C34929n(getDisplayRotation(), uVar);
            this.f84849y = nVar;
            nVar.mo103491g(getPreviewScalingStrategy());
            this.f84839a.mo103421G(this.f84849y);
            this.f84839a.mo103430o();
            boolean z = this.f84834N0;
            if (z) {
                this.f84839a.mo103425K(z);
            }
        }
    }

    /* renamed from: o */
    public C34918h mo103295o() {
        C34918h hVar = new C34918h(getContext());
        hVar.mo103420F(this.f84850z);
        return hVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo103277C();
    }

    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo103294n(new C34959u(i3 - i, i4 - i2));
        SurfaceView surfaceView = this.f84843e;
        if (surfaceView != null) {
            Rect rect = this.f84827G0;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f84844f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f84834N0);
        return bundle;
    }

    /* renamed from: p */
    public final void mo103300p() {
        if (this.f84839a == null) {
            C34918h o = mo103295o();
            this.f84839a = o;
            o.mo103422H(this.f84841c);
            this.f84839a.mo103418D();
            this.f84847w = getDisplayRotation();
        }
    }

    /* renamed from: q */
    public final void mo103301q(Context context, AttributeSet attributeSet, int i, int i2) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        mo103302r(attributeSet);
        this.f84840b = (WindowManager) context.getSystemService("window");
        this.f84841c = new Handler(this.f84836P0);
        this.f84846v = new C34957t();
    }

    /* renamed from: r */
    public void mo103302r(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34661l.C34672k.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(C34661l.C34672k.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C34661l.C34672k.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f84831K0 = new C34959u(dimension, dimension2);
        }
        this.f84842d = obtainStyledAttributes.getBoolean(C34661l.C34672k.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(C34661l.C34672k.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.f84833M0 = new C34928m();
        } else if (integer == 2) {
            this.f84833M0 = new C34930o();
        } else if (integer == 3) {
            this.f84833M0 = new C34931p();
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: s */
    public boolean mo103303s() {
        return this.f84839a != null;
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.f84850z = cameraSettings;
    }

    public void setFramingRectSize(C34959u uVar) {
        this.f84831K0 = uVar;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f84832L0 = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(C34935s sVar) {
        this.f84833M0 = sVar;
    }

    public void setTorch(boolean z) {
        this.f84834N0 = z;
        C34918h hVar = this.f84839a;
        if (hVar != null) {
            hVar.mo103425K(z);
        }
    }

    public void setUseTextureView(boolean z) {
        this.f84842d = z;
    }

    /* renamed from: t */
    public boolean mo103310t() {
        C34918h hVar = this.f84839a;
        return hVar == null || hVar.mo103438w();
    }

    /* renamed from: u */
    public boolean mo103311u() {
        return this.f84845g;
    }

    /* renamed from: v */
    public boolean mo103312v() {
        return this.f84842d;
    }

    /* renamed from: w */
    public void mo103272w() {
        TextureView textureView;
        SurfaceView surfaceView;
        C34961w.m142988a();
        this.f84847w = -1;
        C34918h hVar = this.f84839a;
        if (hVar != null) {
            hVar.mo103429n();
            this.f84839a = null;
            this.f84845g = false;
        } else {
            this.f84841c.sendEmptyMessage(C34661l.C34666e.zxing_camera_closed);
        }
        if (this.f84828H0 == null && (surfaceView = this.f84843e) != null) {
            surfaceView.getHolder().removeCallback(this.f84835O0);
        }
        if (this.f84828H0 == null && (textureView = this.f84844f) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f84825E0 = null;
        this.f84826F0 = null;
        this.f84830J0 = null;
        this.f84846v.mo103548f();
        this.f84838R0.mo103327d();
    }

    /* renamed from: x */
    public void mo103313x() {
        C34918h cameraInstance = getCameraInstance();
        mo103272w();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.mo103438w() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* renamed from: y */
    public final void mo103314y(C34959u uVar) {
        this.f84826F0 = uVar;
        if (this.f84825E0 != null) {
            mo103290j();
            requestLayout();
            mo103279E();
        }
    }

    /* renamed from: z */
    public void mo103273z() {
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo103301q(context, attributeSet, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo103301q(context, attributeSet, i, 0);
    }
}
