package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0336f;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0374u0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C18196h2;
import com.airbnb.lottie.C21663t;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.utils.C21682f;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21694b;
import com.airbnb.lottie.value.C21702j;
import com.airbnb.lottie.value.C21704l;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: O0 */
    public static final String f55196O0 = "LottieAnimationView";

    /* renamed from: P0 */
    public static final C21537l<Throwable> f55197P0 = new C21431a();

    /* renamed from: E0 */
    public boolean f55198E0 = false;

    /* renamed from: F0 */
    public boolean f55199F0 = false;

    /* renamed from: G0 */
    public boolean f55200G0 = false;

    /* renamed from: H0 */
    public boolean f55201H0 = false;

    /* renamed from: I0 */
    public boolean f55202I0 = true;

    /* renamed from: J0 */
    public RenderMode f55203J0 = RenderMode.AUTOMATIC;

    /* renamed from: K0 */
    public final Set<C21592n> f55204K0 = new HashSet();

    /* renamed from: L0 */
    public int f55205L0 = 0;
    @C0363p0

    /* renamed from: M0 */
    public C21656q<C21495g> f55206M0;
    @C0363p0

    /* renamed from: N0 */
    public C21495g f55207N0;

    /* renamed from: d */
    public final C21537l<C21495g> f55208d = new C21432b();

    /* renamed from: e */
    public final C21537l<Throwable> f55209e = new C21433c();
    @C0363p0

    /* renamed from: f */
    public C21537l<Throwable> f55210f;
    @C0375v

    /* renamed from: g */
    public int f55211g = 0;

    /* renamed from: v */
    public final C21516j f55212v = new C21516j();

    /* renamed from: w */
    public boolean f55213w;

    /* renamed from: x */
    public String f55214x;
    @C0374u0

    /* renamed from: y */
    public int f55215y;

    /* renamed from: z */
    public boolean f55216z = false;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C21430a();

        /* renamed from: a */
        public String f55217a;

        /* renamed from: b */
        public int f55218b;

        /* renamed from: c */
        public float f55219c;

        /* renamed from: d */
        public boolean f55220d;

        /* renamed from: e */
        public String f55221e;

        /* renamed from: f */
        public int f55222f;

        /* renamed from: g */
        public int f55223g;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        public class C21430a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C21431a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C21431a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f55217a);
            parcel.writeFloat(this.f55219c);
            parcel.writeInt(this.f55220d ? 1 : 0);
            parcel.writeString(this.f55221e);
            parcel.writeInt(this.f55222f);
            parcel.writeInt(this.f55223g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f55217a = parcel.readString();
            this.f55219c = parcel.readFloat();
            this.f55220d = parcel.readInt() != 1 ? false : true;
            this.f55221e = parcel.readString();
            this.f55222f = parcel.readInt();
            this.f55223g = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C21431a implements C21537l<Throwable> {
        /* renamed from: a */
        public void onResult(Throwable th) {
            if (C21686j.m99810k(th)) {
                C21682f.m99761f("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public class C21432b implements C21537l<C21495g> {
        public C21432b() {
        }

        /* renamed from: a */
        public void onResult(C21495g gVar) {
            LottieAnimationView.this.setComposition(gVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    public class C21433c implements C21537l<Throwable> {
        public C21433c() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            C21537l lVar;
            if (LottieAnimationView.this.f55211g != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f55211g);
            }
            if (LottieAnimationView.this.f55210f == null) {
                lVar = LottieAnimationView.f55197P0;
            } else {
                lVar = LottieAnimationView.this.f55210f;
            }
            lVar.onResult(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    public class C21434d implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ int f55226a;

        public C21434d(int i) {
            this.f55226a = i;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            if (LottieAnimationView.this.f55202I0) {
                return C21499h.m99091u(LottieAnimationView.this.getContext(), this.f55226a);
            }
            return C21499h.m99092v(LottieAnimationView.this.getContext(), this.f55226a, (String) null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$e */
    public class C21435e implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ String f55228a;

        public C21435e(String str) {
            this.f55228a = str;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            if (LottieAnimationView.this.f55202I0) {
                return C21499h.m99077g(LottieAnimationView.this.getContext(), this.f55228a);
            }
            return C21499h.m99078h(LottieAnimationView.this.getContext(), this.f55228a, (String) null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$f */
    public class C21436f extends C21702j<T> {

        /* renamed from: d */
        public final /* synthetic */ C21704l f55230d;

        public C21436f(C21704l lVar) {
            this.f55230d = lVar;
        }

        /* renamed from: a */
        public T mo64017a(C21694b<T> bVar) {
            return this.f55230d.mo64756a(bVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$g */
    public static /* synthetic */ class C21437g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55232a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.RenderMode[] r0 = com.airbnb.lottie.RenderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55232a = r0
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55232a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55232a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.RenderMode r1 = com.airbnb.lottie.RenderMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C21437g.<clinit>():void");
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        mo64000w((AttributeSet) null, C21663t.C21665b.lottieAnimationViewStyle);
    }

    private void setCompositionTask(C21656q<C21495g> qVar) {
        mo63949o();
        mo63948n();
        this.f55206M0 = qVar.mo64639f(this.f55208d).mo64638e(this.f55209e);
    }

    @C0353k0
    /* renamed from: A */
    public void mo63913A() {
        this.f55201H0 = false;
        this.f55199F0 = false;
        this.f55198E0 = false;
        this.f55216z = false;
        this.f55212v.mo64204X();
        mo63957r();
    }

    @C0353k0
    /* renamed from: B */
    public void mo63914B() {
        if (isShown()) {
            this.f55212v.mo64205Y();
            mo63957r();
            return;
        }
        this.f55216z = true;
    }

    /* renamed from: C */
    public void mo63915C() {
        this.f55212v.mo64206Z();
    }

    /* renamed from: D */
    public void mo63916D() {
        this.f55204K0.clear();
    }

    /* renamed from: E */
    public void mo63917E() {
        this.f55212v.mo64207a0();
    }

    /* renamed from: F */
    public void mo63918F(Animator.AnimatorListener animatorListener) {
        this.f55212v.mo64208b0(animatorListener);
    }

    @C0376v0(api = 19)
    /* renamed from: G */
    public void mo63919G(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f55212v.mo64209c0(animatorPauseListener);
    }

    /* renamed from: H */
    public boolean mo63920H(@C0359n0 C21592n nVar) {
        return this.f55204K0.remove(nVar);
    }

    /* renamed from: I */
    public void mo63921I(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f55212v.mo64210d0(animatorUpdateListener);
    }

    /* renamed from: J */
    public List<C21573d> mo63922J(C21573d dVar) {
        return this.f55212v.mo64212e0(dVar);
    }

    @C0353k0
    /* renamed from: K */
    public void mo63923K() {
        if (isShown()) {
            this.f55212v.mo64214f0();
            mo63957r();
            return;
        }
        this.f55216z = false;
        this.f55198E0 = true;
    }

    /* renamed from: L */
    public void mo63924L() {
        this.f55212v.mo64216g0();
    }

    /* renamed from: M */
    public final void mo63925M() {
        boolean x = mo64001x();
        setImageDrawable((Drawable) null);
        setImageDrawable(this.f55212v);
        if (x) {
            this.f55212v.mo64214f0();
        }
    }

    @C0363p0
    /* renamed from: N */
    public Bitmap mo63926N(String str, @C0363p0 Bitmap bitmap) {
        return this.f55212v.mo64188I0(str, bitmap);
    }

    public void buildDrawingCache(boolean z) {
        C21492e.m99017a("buildDrawingCache");
        this.f55205L0++;
        super.buildDrawingCache(z);
        if (this.f55205L0 == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f55205L0--;
        C21492e.m99018b("buildDrawingCache");
    }

    /* renamed from: g */
    public void mo63928g(Animator.AnimatorListener animatorListener) {
        this.f55212v.mo64213f(animatorListener);
    }

    @C0363p0
    public C21495g getComposition() {
        return this.f55207N0;
    }

    public long getDuration() {
        C21495g gVar = this.f55207N0;
        if (gVar != null) {
            return (long) gVar.mo64121d();
        }
        return 0;
    }

    public int getFrame() {
        return this.f55212v.mo64173B();
    }

    @C0363p0
    public String getImageAssetsFolder() {
        return this.f55212v.mo64179E();
    }

    public float getMaxFrame() {
        return this.f55212v.mo64181F();
    }

    public float getMinFrame() {
        return this.f55212v.mo64185H();
    }

    @C0363p0
    public C21660s getPerformanceTracker() {
        return this.f55212v.mo64187I();
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    public float getProgress() {
        return this.f55212v.mo64189J();
    }

    public int getRepeatCount() {
        return this.f55212v.mo64191K();
    }

    public int getRepeatMode() {
        return this.f55212v.mo64192L();
    }

    public float getScale() {
        return this.f55212v.mo64193M();
    }

    public float getSpeed() {
        return this.f55212v.mo64194N();
    }

    @C0376v0(api = 19)
    /* renamed from: h */
    public void mo63941h(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f55212v.mo64215g(animatorPauseListener);
    }

    /* renamed from: i */
    public void mo63942i(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f55212v.mo64221h(animatorUpdateListener);
    }

    public void invalidateDrawable(@C0359n0 Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C21516j jVar = this.f55212v;
        if (drawable2 == jVar) {
            super.invalidateDrawable(jVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public boolean mo63944j(@C0359n0 C21592n nVar) {
        C21495g gVar = this.f55207N0;
        if (gVar != null) {
            nVar.mo64516a(gVar);
        }
        return this.f55204K0.add(nVar);
    }

    /* renamed from: k */
    public <T> void mo63945k(C21573d dVar, T t, C21702j<T> jVar) {
        this.f55212v.mo64223i(dVar, t, jVar);
    }

    /* renamed from: l */
    public <T> void mo63946l(C21573d dVar, T t, C21704l<T> lVar) {
        this.f55212v.mo64223i(dVar, t, new C21436f(lVar));
    }

    @C0353k0
    /* renamed from: m */
    public void mo63947m() {
        this.f55199F0 = false;
        this.f55198E0 = false;
        this.f55216z = false;
        this.f55212v.mo64238o();
        mo63957r();
    }

    /* renamed from: n */
    public final void mo63948n() {
        C21656q<C21495g> qVar = this.f55206M0;
        if (qVar != null) {
            qVar.mo64644k(this.f55208d);
            this.f55206M0.mo64643j(this.f55209e);
        }
    }

    /* renamed from: o */
    public final void mo63949o() {
        this.f55207N0 = null;
        this.f55212v.mo64240p();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.f55201H0 || this.f55199F0) {
            mo63914B();
            this.f55201H0 = false;
            this.f55199F0 = false;
        }
    }

    public void onDetachedFromWindow() {
        if (mo64001x()) {
            mo63947m();
            this.f55199F0 = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f55217a;
        this.f55214x = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f55214x);
        }
        int i = savedState.f55218b;
        this.f55215y = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f55219c);
        if (savedState.f55220d) {
            mo63914B();
        }
        this.f55212v.mo64237n0(savedState.f55221e);
        setRepeatMode(savedState.f55222f);
        setRepeatCount(savedState.f55223g);
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f55217a = this.f55214x;
        savedState.f55218b = this.f55215y;
        savedState.f55219c = this.f55212v.mo64189J();
        if (this.f55212v.mo64199S() || (!C18196h2.m82521O0(this) && this.f55199F0)) {
            z = true;
        } else {
            z = false;
        }
        savedState.f55220d = z;
        savedState.f55221e = this.f55212v.mo64179E();
        savedState.f55222f = this.f55212v.mo64192L();
        savedState.f55223g = this.f55212v.mo64191K();
        return savedState;
    }

    public void onVisibilityChanged(@C0359n0 View view, int i) {
        if (this.f55213w) {
            if (isShown()) {
                if (this.f55198E0) {
                    mo63923K();
                } else if (this.f55216z) {
                    mo63914B();
                }
                this.f55198E0 = false;
                this.f55216z = false;
            } else if (mo64001x()) {
                mo63913A();
                this.f55198E0 = true;
            }
        }
    }

    /* renamed from: p */
    public void mo63955p() {
        this.f55212v.mo64242q();
    }

    /* renamed from: q */
    public void mo63956q(boolean z) {
        this.f55212v.mo64258v(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r3 != false) goto L_0x0041;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63957r() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C21437g.f55232a
            com.airbnb.lottie.RenderMode r1 = r5.f55203J0
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0041
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = r2
            goto L_0x0041
        L_0x0015:
            com.airbnb.lottie.g r0 = r5.f55207N0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo64137t()
            if (r0 == 0) goto L_0x0027
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            com.airbnb.lottie.g r0 = r5.f55207N0
            if (r0 == 0) goto L_0x0033
            int r0 = r0.mo64131n()
            r4 = 4
            if (r0 <= r4) goto L_0x0033
            goto L_0x003f
        L_0x0033:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r0 == r4) goto L_0x003f
            r4 = 25
            if (r0 != r4) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r3 = r2
        L_0x003f:
            if (r3 == 0) goto L_0x0013
        L_0x0041:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x004b
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.mo63957r():void");
    }

    /* renamed from: s */
    public final C21656q<C21495g> mo63958s(String str) {
        if (isInEditMode()) {
            return new C21656q<>(new C21435e(str), true);
        }
        if (this.f55202I0) {
            return C21499h.m99075e(getContext(), str);
        }
        return C21499h.m99076f(getContext(), str, (String) null);
    }

    public void setAnimation(@C0374u0 int i) {
        this.f55215y = i;
        this.f55214x = null;
        setCompositionTask(mo63996t(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f55202I0 ? C21499h.m99093w(getContext(), str) : C21499h.m99094x(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f55212v.mo64222h0(z);
    }

    public void setCacheComposition(boolean z) {
        this.f55202I0 = z;
    }

    public void setComposition(@C0359n0 C21495g gVar) {
        if (C21492e.f55431a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(gVar);
        }
        this.f55212v.setCallback(this);
        this.f55207N0 = gVar;
        this.f55200G0 = true;
        boolean i0 = this.f55212v.mo64224i0(gVar);
        this.f55200G0 = false;
        mo63957r();
        if (getDrawable() != this.f55212v || i0) {
            if (!i0) {
                mo63925M();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (C21592n a : this.f55204K0) {
                a.mo64516a(gVar);
            }
        }
    }

    public void setFailureListener(@C0363p0 C21537l<Throwable> lVar) {
        this.f55210f = lVar;
    }

    public void setFallbackResource(@C0375v int i) {
        this.f55211g = i;
    }

    public void setFontAssetDelegate(C21490c cVar) {
        this.f55212v.mo64229j0(cVar);
    }

    public void setFrame(int i) {
        this.f55212v.mo64231k0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f55212v.mo64233l0(z);
    }

    public void setImageAssetDelegate(C21491d dVar) {
        this.f55212v.mo64235m0(dVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f55212v.mo64237n0(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        mo63948n();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        mo63948n();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        mo63948n();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f55212v.mo64239o0(i);
    }

    public void setMaxProgress(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f55212v.mo64243q0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f55212v.mo64247s0(str);
    }

    public void setMinAndMaxProgress(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
        this.f55212v.mo64256u0(f, f2);
    }

    public void setMinFrame(int i) {
        this.f55212v.mo64259v0(i);
    }

    public void setMinProgress(float f) {
        this.f55212v.mo64263x0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f55212v.mo64265y0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f55212v.mo64267z0(z);
    }

    public void setProgress(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f55212v.mo64172A0(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f55203J0 = renderMode;
        mo63957r();
    }

    public void setRepeatCount(int i) {
        this.f55212v.mo64174B0(i);
    }

    public void setRepeatMode(int i) {
        this.f55212v.mo64176C0(i);
    }

    public void setSafeMode(boolean z) {
        this.f55212v.mo64178D0(z);
    }

    public void setScale(float f) {
        this.f55212v.mo64180E0(f);
        if (getDrawable() == this.f55212v) {
            mo63925M();
        }
    }

    public void setSpeed(float f) {
        this.f55212v.mo64182F0(f);
    }

    public void setTextDelegate(C21692v vVar) {
        this.f55212v.mo64186H0(vVar);
    }

    /* renamed from: t */
    public final C21656q<C21495g> mo63996t(@C0374u0 int i) {
        if (isInEditMode()) {
            return new C21656q<>(new C21434d(i), true);
        }
        if (this.f55202I0) {
            return C21499h.m99089s(getContext(), i);
        }
        return C21499h.m99090t(getContext(), i, (String) null);
    }

    /* renamed from: u */
    public boolean mo63997u() {
        return this.f55212v.mo64197Q();
    }

    public void unscheduleDrawable(Drawable drawable) {
        C21516j jVar;
        if (!this.f55200G0 && drawable == (jVar = this.f55212v) && jVar.mo64199S()) {
            mo63913A();
        } else if (!this.f55200G0 && (drawable instanceof C21516j)) {
            C21516j jVar2 = (C21516j) drawable;
            if (jVar2.mo64199S()) {
                jVar2.mo64204X();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: v */
    public boolean mo63999v() {
        return this.f55212v.mo64198R();
    }

    /* renamed from: w */
    public final void mo64000w(@C0363p0 AttributeSet attributeSet, @C0336f int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21663t.C21675l.LottieAnimationView, i, 0);
        this.f55202I0 = obtainStyledAttributes.getBoolean(C21663t.C21675l.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = C21663t.C21675l.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C21663t.C21675l.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C21663t.C21675l.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(C21663t.C21675l.LottieAnimationView_lottie_fallbackRes, 0));
            if (obtainStyledAttributes.getBoolean(C21663t.C21675l.LottieAnimationView_lottie_autoPlay, false)) {
                this.f55199F0 = true;
                this.f55201H0 = true;
            }
            if (obtainStyledAttributes.getBoolean(C21663t.C21675l.LottieAnimationView_lottie_loop, false)) {
                this.f55212v.mo64174B0(-1);
            }
            int i5 = C21663t.C21675l.LottieAnimationView_lottie_repeatMode;
            if (obtainStyledAttributes.hasValue(i5)) {
                setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
            }
            int i6 = C21663t.C21675l.LottieAnimationView_lottie_repeatCount;
            if (obtainStyledAttributes.hasValue(i6)) {
                setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
            }
            int i7 = C21663t.C21675l.LottieAnimationView_lottie_speed;
            if (obtainStyledAttributes.hasValue(i7)) {
                setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(C21663t.C21675l.LottieAnimationView_lottie_imageAssetsFolder));
            setProgress(obtainStyledAttributes.getFloat(C21663t.C21675l.LottieAnimationView_lottie_progress, 0.0f));
            mo63956q(obtainStyledAttributes.getBoolean(C21663t.C21675l.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
            int i8 = C21663t.C21675l.LottieAnimationView_lottie_colorFilter;
            if (obtainStyledAttributes.hasValue(i8)) {
                mo63945k(new C21573d("**"), C21601o.f55876E, new C21702j(new C21676u(C0507a.m2345a(getContext(), obtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor())));
            }
            int i9 = C21663t.C21675l.LottieAnimationView_lottie_scale;
            if (obtainStyledAttributes.hasValue(i9)) {
                this.f55212v.mo64180E0(obtainStyledAttributes.getFloat(i9, 1.0f));
            }
            int i10 = C21663t.C21675l.LottieAnimationView_lottie_renderMode;
            if (obtainStyledAttributes.hasValue(i10)) {
                RenderMode renderMode = RenderMode.AUTOMATIC;
                int i11 = obtainStyledAttributes.getInt(i10, renderMode.ordinal());
                if (i11 >= RenderMode.values().length) {
                    i11 = renderMode.ordinal();
                }
                setRenderMode(RenderMode.values()[i11]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C21663t.C21675l.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
            obtainStyledAttributes.recycle();
            C21516j jVar = this.f55212v;
            if (C21686j.m99805f(getContext()) != 0.0f) {
                z = true;
            }
            jVar.mo64184G0(Boolean.valueOf(z));
            mo63957r();
            this.f55213w = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    /* renamed from: x */
    public boolean mo64001x() {
        return this.f55212v.mo64199S();
    }

    /* renamed from: y */
    public boolean mo64002y() {
        return this.f55212v.mo64202V();
    }

    @Deprecated
    /* renamed from: z */
    public void mo64003z(boolean z) {
        this.f55212v.mo64174B0(z ? -1 : 0);
    }

    public void setAnimationFromJson(String str, @C0363p0 String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f55212v.mo64241p0(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.f55212v.mo64254t0(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.f55212v.mo64261w0(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f55212v.mo64245r0(i, i2);
    }

    public void setAnimation(String str) {
        this.f55214x = str;
        this.f55215y = 0;
        setCompositionTask(mo63958s(str));
    }

    public void setAnimationFromUrl(String str, @C0363p0 String str2) {
        setCompositionTask(C21499h.m99094x(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @C0363p0 String str) {
        setCompositionTask(C21499h.m99080j(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo64000w(attributeSet, C21663t.C21665b.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo64000w(attributeSet, i);
    }
}
