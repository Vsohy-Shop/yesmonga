package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.C0328d;
import androidx.annotation.C0341g1;
import androidx.annotation.C0344h1;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.camera.core.C1394e4;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1631k0;
import androidx.camera.core.C1641m;
import androidx.camera.core.C1654n2;
import androidx.camera.core.C1677r2;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.C1496q;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.C1566j;
import androidx.camera.view.C1840w;
import androidx.camera.view.internal.compat.quirk.C1796a;
import androidx.camera.view.internal.compat.quirk.C1799d;
import androidx.camera.view.transform.C1821d;
import androidx.core.content.C17318d;
import androidx.core.view.C18196h2;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicReference;

public final class PreviewView extends FrameLayout {
    @C0358n

    /* renamed from: E0 */
    public static final int f4830E0 = 17170444;

    /* renamed from: F0 */
    public static final ImplementationMode f4831F0 = ImplementationMode.PERFORMANCE;

    /* renamed from: z */
    public static final String f4832z = "PreviewView";
    @C0359n0

    /* renamed from: a */
    public ImplementationMode f4833a;
    @C0363p0
    @C0344h1

    /* renamed from: b */
    public C1822u f4834b;
    @C0359n0

    /* renamed from: c */
    public final C1811o f4835c;
    @C0359n0

    /* renamed from: d */
    public final C19423g0<StreamState> f4836d;
    @C0363p0

    /* renamed from: e */
    public final AtomicReference<C1808n> f4837e;

    /* renamed from: f */
    public C1773d f4838f;
    @C0359n0

    /* renamed from: g */
    public C1824v f4839g;
    @C0359n0

    /* renamed from: v */
    public final ScaleGestureDetector f4840v;
    @C0363p0

    /* renamed from: w */
    public MotionEvent f4841w;

    /* renamed from: x */
    public final View.OnLayoutChangeListener f4842x;

    /* renamed from: y */
    public final C1677r2.C1681d f4843y;

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);
        
        private final int mId;

        /* access modifiers changed from: public */
        ImplementationMode(int i) {
            this.mId = i;
        }

        /* renamed from: b */
        public static ImplementationMode m7034b(int i) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i);
        }

        /* renamed from: g */
        public int mo5838g() {
            return this.mId;
        }
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        
        private final int mId;

        /* access modifiers changed from: public */
        ScaleType(int i) {
            this.mId = i;
        }

        /* renamed from: b */
        public static ScaleType m7036b(int i) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i);
        }

        /* renamed from: g */
        public int mo5839g() {
            return this.mId;
        }
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    /* renamed from: androidx.camera.view.PreviewView$a */
    public class C1762a implements C1677r2.C1681d {
        public C1762a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m7041e(SurfaceRequest surfaceRequest) {
            PreviewView.this.f4843y.mo5699a(surfaceRequest);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m7042f(CameraInternal cameraInternal, SurfaceRequest surfaceRequest, SurfaceRequest.C1342f fVar) {
            boolean z;
            C1417i2.m5911a(PreviewView.f4832z, "Preview transformation info updated. " + fVar);
            if (cameraInternal.mo4139l().mo4594d().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            PreviewView.this.f4835c.mo5974p(fVar, surfaceRequest.mo4928m(), z);
            PreviewView.this.mo5821e();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m7043g(C1808n nVar, CameraInternal cameraInternal) {
            if (C1814q.m7242a(PreviewView.this.f4837e, nVar, (Object) null)) {
                nVar.mo5958l(StreamState.IDLE);
            }
            nVar.mo5955f();
            cameraInternal.mo4141m().mo5188c(nVar);
        }

        @C0328d
        @C0368r0(markerClass = {C1631k0.class})
        /* renamed from: a */
        public void mo5699a(@C0359n0 SurfaceRequest surfaceRequest) {
            C1822u uVar;
            if (!C1566j.m6508d()) {
                C17318d.m79729l(PreviewView.this.getContext()).execute(new C1815r(this, surfaceRequest));
                return;
            }
            C1417i2.m5911a(PreviewView.f4832z, "Surface requested by Preview.");
            CameraInternal k = surfaceRequest.mo4926k();
            surfaceRequest.mo4931x(C17318d.m79729l(PreviewView.this.getContext()), new C1816s(this, k, surfaceRequest));
            PreviewView previewView = PreviewView.this;
            if (PreviewView.m7030f(surfaceRequest, previewView.f4833a)) {
                PreviewView previewView2 = PreviewView.this;
                uVar = new C1793i0(previewView2, previewView2.f4835c);
            } else {
                PreviewView previewView3 = PreviewView.this;
                uVar = new C1768b0(previewView3, previewView3.f4835c);
            }
            previewView.f4834b = uVar;
            C1496q l = k.mo4139l();
            PreviewView previewView4 = PreviewView.this;
            C1808n nVar = new C1808n(l, previewView4.f4836d, previewView4.f4834b);
            PreviewView.this.f4837e.set(nVar);
            k.mo4141m().mo5187b(C17318d.m79729l(PreviewView.this.getContext()), nVar);
            PreviewView.this.f4834b.mo5848h(surfaceRequest, new C1817t(this, nVar, k));
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$b */
    public static /* synthetic */ class C1763b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4858a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4859b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        static {
            /*
                androidx.camera.view.PreviewView$ImplementationMode[] r0 = androidx.camera.view.PreviewView.ImplementationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4859b = r0
                r1 = 1
                androidx.camera.view.PreviewView$ImplementationMode r2 = androidx.camera.view.PreviewView.ImplementationMode.COMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4859b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.view.PreviewView$ImplementationMode r3 = androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                androidx.camera.view.PreviewView$ScaleType[] r2 = androidx.camera.view.PreviewView.ScaleType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f4858a = r2
                androidx.camera.view.PreviewView$ScaleType r3 = androidx.camera.view.PreviewView.ScaleType.FILL_END     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f4858a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.camera.view.PreviewView$ScaleType r2 = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f4858a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_START     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f4858a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f4858a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f4858a     // Catch:{ NoSuchFieldError -> 0x0064 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.C1763b.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.view.PreviewView$c */
    public class C1764c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C1764c() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C1773d dVar = PreviewView.this.f4838f;
            if (dVar == null) {
                return true;
            }
            dVar.mo5874Q(scaleGestureDetector.getScaleFactor());
            return true;
        }
    }

    @C0341g1
    public PreviewView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m7029d(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo5821e();
            mo5819b(true);
        }
    }

    /* renamed from: f */
    public static boolean m7030f(@C0359n0 SurfaceRequest surfaceRequest, @C0359n0 ImplementationMode implementationMode) {
        boolean z;
        int i;
        boolean equals = surfaceRequest.mo4926k().mo4139l().mo4600j().equals(C1641m.f4592c);
        if (C1796a.m7182a(C1799d.class) != null) {
            z = true;
        } else {
            z = false;
        }
        if (surfaceRequest.mo4929n() || Build.VERSION.SDK_INT <= 24 || equals || z || (i = C1763b.f4859b[implementationMode.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    private int getViewPortScaleType() {
        switch (C1763b.f4858a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    @C0368r0(markerClass = {C1631k0.class})
    /* renamed from: b */
    public final void mo5819b(boolean z) {
        Display display = getDisplay();
        C1394e4 viewPort = getViewPort();
        if (this.f4838f != null && viewPort != null && isAttachedToWindow() && display != null) {
            try {
                this.f4838f.mo5887d(getSurfaceProvider(), viewPort, display);
            } catch (IllegalStateException e) {
                if (z) {
                    C1417i2.m5914d(f4832z, e.getMessage(), e);
                    return;
                }
                throw e;
            }
        }
    }

    @C0363p0
    @SuppressLint({"WrongConstant"})
    @C0368r0(markerClass = {C1631k0.class})
    @C0341g1
    /* renamed from: c */
    public C1394e4 mo5820c(int i) {
        C1566j.m6506b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new C1394e4.C1395a(new Rational(getWidth(), getHeight()), i).mo5096c(getViewPortScaleType()).mo5095b(getLayoutDirection()).mo5094a();
    }

    /* renamed from: e */
    public void mo5821e() {
        C1822u uVar = this.f4834b;
        if (uVar != null) {
            uVar.mo5999i();
        }
        this.f4839g.mo6000e(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    @C0363p0
    @C0341g1
    public Bitmap getBitmap() {
        C1566j.m6506b();
        C1822u uVar = this.f4834b;
        if (uVar == null) {
            return null;
        }
        return uVar.mo5997a();
    }

    @C0363p0
    @C0341g1
    public C1773d getController() {
        C1566j.m6506b();
        return this.f4838f;
    }

    @C0341g1
    @C0359n0
    public ImplementationMode getImplementationMode() {
        C1566j.m6506b();
        return this.f4833a;
    }

    @C0341g1
    @C0359n0
    public C1654n2 getMeteringPointFactory() {
        C1566j.m6506b();
        return this.f4839g;
    }

    @C0363p0
    @C1803j0
    public C1821d getOutputTransform() {
        Matrix matrix;
        C1566j.m6506b();
        try {
            matrix = this.f4835c.mo5968i(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect h = this.f4835c.mo5967h();
        if (matrix == null || h == null) {
            C1417i2.m5911a(f4832z, "Transform info is not ready");
            return null;
        }
        matrix.preConcat(C1805k0.m7195b(h));
        if (this.f4834b instanceof C1793i0) {
            matrix.postConcat(getMatrix());
        } else {
            C1417i2.m5924n(f4832z, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C1821d(matrix, new Size(h.width(), h.height()));
    }

    @C0359n0
    public LiveData<StreamState> getPreviewStreamState() {
        return this.f4836d;
    }

    @C0341g1
    @C0359n0
    public ScaleType getScaleType() {
        C1566j.m6506b();
        return this.f4835c.mo5966g();
    }

    @C0341g1
    @C0359n0
    @C0368r0(markerClass = {C1631k0.class})
    public C1677r2.C1681d getSurfaceProvider() {
        C1566j.m6506b();
        return this.f4843y;
    }

    @C0363p0
    @C0341g1
    public C1394e4 getViewPort() {
        C1566j.m6506b();
        if (getDisplay() == null) {
            return null;
        }
        return mo5820c(getDisplay().getRotation());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.f4842x);
        C1822u uVar = this.f4834b;
        if (uVar != null) {
            uVar.mo5846e();
        }
        mo5819b(true);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f4842x);
        C1822u uVar = this.f4834b;
        if (uVar != null) {
            uVar.mo5847f();
        }
        C1773d dVar = this.f4838f;
        if (dVar != null) {
            dVar.mo5891f();
        }
    }

    public boolean onTouchEvent(@C0359n0 MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f4838f == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            this.f4841w = motionEvent;
            performClick();
            return true;
        } else if (this.f4840v.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean performClick() {
        float f;
        float f2;
        if (this.f4838f != null) {
            MotionEvent motionEvent = this.f4841w;
            if (motionEvent != null) {
                f = motionEvent.getX();
            } else {
                f = ((float) getWidth()) / 2.0f;
            }
            MotionEvent motionEvent2 = this.f4841w;
            if (motionEvent2 != null) {
                f2 = motionEvent2.getY();
            } else {
                f2 = ((float) getHeight()) / 2.0f;
            }
            this.f4838f.mo5875R(this.f4839g, f, f2);
        }
        this.f4841w = null;
        return super.performClick();
    }

    @C0341g1
    public void setController(@C0363p0 C1773d dVar) {
        C1566j.m6506b();
        C1773d dVar2 = this.f4838f;
        if (!(dVar2 == null || dVar2 == dVar)) {
            dVar2.mo5891f();
        }
        this.f4838f = dVar;
        mo5819b(false);
    }

    @C0341g1
    public void setImplementationMode(@C0359n0 ImplementationMode implementationMode) {
        C1566j.m6506b();
        this.f4833a = implementationMode;
    }

    @C0341g1
    public void setScaleType(@C0359n0 ScaleType scaleType) {
        C1566j.m6506b();
        this.f4835c.mo5973o(scaleType);
        mo5821e();
        mo5819b(false);
    }

    @C0341g1
    public PreviewView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @C0341g1
    public PreviewView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX INFO: finally extract failed */
    @C0341g1
    public PreviewView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ImplementationMode implementationMode = f4831F0;
        this.f4833a = implementationMode;
        C1811o oVar = new C1811o();
        this.f4835c = oVar;
        this.f4836d = new C19423g0<>(StreamState.IDLE);
        this.f4837e = new AtomicReference<>();
        this.f4839g = new C1824v(oVar);
        this.f4842x = new C1813p(this);
        this.f4843y = new C1762a();
        C1566j.m6506b();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C1840w.C1843c.PreviewView;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        C18196h2.m82658z1(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(ScaleType.m7036b(obtainStyledAttributes.getInteger(C1840w.C1843c.PreviewView_scaleType, oVar.mo5966g().mo5839g())));
            setImplementationMode(ImplementationMode.m7034b(obtainStyledAttributes.getInteger(C1840w.C1843c.PreviewView_implementationMode, implementationMode.mo5838g())));
            obtainStyledAttributes.recycle();
            this.f4840v = new ScaleGestureDetector(context, new C1764c());
            if (getBackground() == null) {
                setBackgroundColor(C17318d.m79723f(getContext(), f4830E0));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
