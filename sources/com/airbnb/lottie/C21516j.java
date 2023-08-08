package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.C0337f0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.manager.C21539a;
import com.airbnb.lottie.manager.C21540b;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.C21576g;
import com.airbnb.lottie.model.layer.C21581b;
import com.airbnb.lottie.parser.C21647s;
import com.airbnb.lottie.utils.C21682f;
import com.airbnb.lottie.utils.C21683g;
import com.airbnb.lottie.utils.C21685i;
import com.airbnb.lottie.value.C21694b;
import com.airbnb.lottie.value.C21702j;
import com.airbnb.lottie.value.C21704l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.airbnb.lottie.j */
public class C21516j extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: M0 */
    public static final int f55496M0 = 1;

    /* renamed from: N0 */
    public static final int f55497N0 = 2;

    /* renamed from: O0 */
    public static final int f55498O0 = -1;

    /* renamed from: E0 */
    public boolean f55499E0;
    @C0363p0

    /* renamed from: F0 */
    public C21581b f55500F0;

    /* renamed from: G0 */
    public int f55501G0;

    /* renamed from: H0 */
    public boolean f55502H0;

    /* renamed from: I0 */
    public boolean f55503I0;

    /* renamed from: J0 */
    public boolean f55504J0;

    /* renamed from: K0 */
    public boolean f55505K0;

    /* renamed from: L0 */
    public boolean f55506L0;
    @C0363p0

    /* renamed from: X */
    public C21539a f55507X;
    @C0363p0

    /* renamed from: Y */
    public C21490c f55508Y;
    @C0363p0

    /* renamed from: Z */
    public C21692v f55509Z;

    /* renamed from: a */
    public final Matrix f55510a = new Matrix();

    /* renamed from: b */
    public C21495g f55511b;

    /* renamed from: c */
    public final C21683g f55512c;

    /* renamed from: d */
    public float f55513d;

    /* renamed from: e */
    public boolean f55514e;

    /* renamed from: f */
    public boolean f55515f;

    /* renamed from: g */
    public boolean f55516g;

    /* renamed from: v */
    public final ArrayList<C21534r> f55517v;

    /* renamed from: w */
    public final ValueAnimator.AnimatorUpdateListener f55518w;
    @C0363p0

    /* renamed from: x */
    public C21540b f55519x;
    @C0363p0

    /* renamed from: y */
    public String f55520y;
    @C0363p0

    /* renamed from: z */
    public C21491d f55521z;

    /* renamed from: com.airbnb.lottie.j$a */
    public class C21517a implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ String f55522a;

        public C21517a(String str) {
            this.f55522a = str;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64247s0(this.f55522a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$b */
    public class C21518b implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ String f55524a;

        /* renamed from: b */
        public final /* synthetic */ String f55525b;

        /* renamed from: c */
        public final /* synthetic */ boolean f55526c;

        public C21518b(String str, String str2, boolean z) {
            this.f55524a = str;
            this.f55525b = str2;
            this.f55526c = z;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64254t0(this.f55524a, this.f55525b, this.f55526c);
        }
    }

    /* renamed from: com.airbnb.lottie.j$c */
    public class C21519c implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ int f55528a;

        /* renamed from: b */
        public final /* synthetic */ int f55529b;

        public C21519c(int i, int i2) {
            this.f55528a = i;
            this.f55529b = i2;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64245r0(this.f55528a, this.f55529b);
        }
    }

    /* renamed from: com.airbnb.lottie.j$d */
    public class C21520d implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ float f55531a;

        /* renamed from: b */
        public final /* synthetic */ float f55532b;

        public C21520d(float f, float f2) {
            this.f55531a = f;
            this.f55532b = f2;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64256u0(this.f55531a, this.f55532b);
        }
    }

    /* renamed from: com.airbnb.lottie.j$e */
    public class C21521e implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ int f55534a;

        public C21521e(int i) {
            this.f55534a = i;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64231k0(this.f55534a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$f */
    public class C21522f implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ float f55536a;

        public C21522f(float f) {
            this.f55536a = f;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64172A0(this.f55536a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$g */
    public class C21523g implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ C21573d f55538a;

        /* renamed from: b */
        public final /* synthetic */ Object f55539b;

        /* renamed from: c */
        public final /* synthetic */ C21702j f55540c;

        public C21523g(C21573d dVar, Object obj, C21702j jVar) {
            this.f55538a = dVar;
            this.f55539b = obj;
            this.f55540c = jVar;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64223i(this.f55538a, this.f55539b, this.f55540c);
        }
    }

    /* renamed from: com.airbnb.lottie.j$h */
    public class C21524h extends C21702j<T> {

        /* renamed from: d */
        public final /* synthetic */ C21704l f55542d;

        public C21524h(C21704l lVar) {
            this.f55542d = lVar;
        }

        /* renamed from: a */
        public T mo64017a(C21694b<T> bVar) {
            return this.f55542d.mo64756a(bVar);
        }
    }

    /* renamed from: com.airbnb.lottie.j$i */
    public class C21525i implements ValueAnimator.AnimatorUpdateListener {
        public C21525i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C21516j.this.f55500F0 != null) {
                C21516j.this.f55500F0.mo64478H(C21516j.this.f55512c.mo64693k());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.j$j */
    public class C21526j implements C21534r {
        public C21526j() {
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64205Y();
        }
    }

    /* renamed from: com.airbnb.lottie.j$k */
    public class C21527k implements C21534r {
        public C21527k() {
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64214f0();
        }
    }

    /* renamed from: com.airbnb.lottie.j$l */
    public class C21528l implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ int f55547a;

        public C21528l(int i) {
            this.f55547a = i;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64259v0(this.f55547a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$m */
    public class C21529m implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ float f55549a;

        public C21529m(float f) {
            this.f55549a = f;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64263x0(this.f55549a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$n */
    public class C21530n implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ int f55551a;

        public C21530n(int i) {
            this.f55551a = i;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64239o0(this.f55551a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$o */
    public class C21531o implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ float f55553a;

        public C21531o(float f) {
            this.f55553a = f;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64243q0(this.f55553a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$p */
    public class C21532p implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ String f55555a;

        public C21532p(String str) {
            this.f55555a = str;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64261w0(this.f55555a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$q */
    public class C21533q implements C21534r {

        /* renamed from: a */
        public final /* synthetic */ String f55557a;

        public C21533q(String str) {
            this.f55557a = str;
        }

        /* renamed from: a */
        public void mo64268a(C21495g gVar) {
            C21516j.this.mo64241p0(this.f55557a);
        }
    }

    /* renamed from: com.airbnb.lottie.j$r */
    public interface C21534r {
        /* renamed from: a */
        void mo64268a(C21495g gVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.airbnb.lottie.j$s */
    public @interface C21535s {
    }

    public C21516j() {
        C21683g gVar = new C21683g();
        this.f55512c = gVar;
        this.f55513d = 1.0f;
        this.f55514e = true;
        this.f55515f = false;
        this.f55516g = false;
        this.f55517v = new ArrayList<>();
        C21525i iVar = new C21525i();
        this.f55518w = iVar;
        this.f55501G0 = 255;
        this.f55505K0 = true;
        this.f55506L0 = false;
        gVar.addUpdateListener(iVar);
    }

    /* renamed from: A */
    public final C21539a mo64171A() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f55507X == null) {
            this.f55507X = new C21539a(getCallback(), this.f55508Y);
        }
        return this.f55507X;
    }

    /* renamed from: A0 */
    public void mo64172A0(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        if (this.f55511b == null) {
            this.f55517v.add(new C21522f(f));
            return;
        }
        C21492e.m99017a("Drawable#setProgress");
        this.f55512c.mo64679F(this.f55511b.mo64125h(f));
        C21492e.m99018b("Drawable#setProgress");
    }

    /* renamed from: B */
    public int mo64173B() {
        return (int) this.f55512c.mo64694l();
    }

    /* renamed from: B0 */
    public void mo64174B0(int i) {
        this.f55512c.setRepeatCount(i);
    }

    @C0363p0
    /* renamed from: C */
    public Bitmap mo64175C(String str) {
        C21536k kVar;
        C21540b D = mo64177D();
        if (D != null) {
            return D.mo64288a(str);
        }
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            kVar = null;
        } else {
            kVar = gVar.mo64127j().get(str);
        }
        if (kVar != null) {
            return kVar.mo64270a();
        }
        return null;
    }

    /* renamed from: C0 */
    public void mo64176C0(int i) {
        this.f55512c.setRepeatMode(i);
    }

    /* renamed from: D */
    public final C21540b mo64177D() {
        if (getCallback() == null) {
            return null;
        }
        C21540b bVar = this.f55519x;
        if (bVar != null && !bVar.mo64289b(mo64266z())) {
            this.f55519x = null;
        }
        if (this.f55519x == null) {
            this.f55519x = new C21540b(getCallback(), this.f55520y, this.f55521z, this.f55511b.mo64127j());
        }
        return this.f55519x;
    }

    /* renamed from: D0 */
    public void mo64178D0(boolean z) {
        this.f55516g = z;
    }

    @C0363p0
    /* renamed from: E */
    public String mo64179E() {
        return this.f55520y;
    }

    /* renamed from: E0 */
    public void mo64180E0(float f) {
        this.f55513d = f;
    }

    /* renamed from: F */
    public float mo64181F() {
        return this.f55512c.mo64696n();
    }

    /* renamed from: F0 */
    public void mo64182F0(float f) {
        this.f55512c.mo64683J(f);
    }

    /* renamed from: G */
    public final float mo64183G(@C0359n0 Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f55511b.mo64119b().width()), ((float) canvas.getHeight()) / ((float) this.f55511b.mo64119b().height()));
    }

    /* renamed from: G0 */
    public void mo64184G0(Boolean bool) {
        this.f55514e = bool.booleanValue();
    }

    /* renamed from: H */
    public float mo64185H() {
        return this.f55512c.mo64697o();
    }

    /* renamed from: H0 */
    public void mo64186H0(C21692v vVar) {
        this.f55509Z = vVar;
    }

    @C0363p0
    /* renamed from: I */
    public C21660s mo64187I() {
        C21495g gVar = this.f55511b;
        if (gVar != null) {
            return gVar.mo64132o();
        }
        return null;
    }

    @C0363p0
    /* renamed from: I0 */
    public Bitmap mo64188I0(String str, @C0363p0 Bitmap bitmap) {
        C21540b D = mo64177D();
        if (D == null) {
            C21682f.m99760e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap e = D.mo64292e(str, bitmap);
        invalidateSelf();
        return e;
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: J */
    public float mo64189J() {
        return this.f55512c.mo64693k();
    }

    /* renamed from: J0 */
    public boolean mo64190J0() {
        return this.f55509Z == null && this.f55511b.mo64120c().mo6353G() > 0;
    }

    /* renamed from: K */
    public int mo64191K() {
        return this.f55512c.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: L */
    public int mo64192L() {
        return this.f55512c.getRepeatMode();
    }

    /* renamed from: M */
    public float mo64193M() {
        return this.f55513d;
    }

    /* renamed from: N */
    public float mo64194N() {
        return this.f55512c.mo64698s();
    }

    @C0363p0
    /* renamed from: O */
    public C21692v mo64195O() {
        return this.f55509Z;
    }

    @C0363p0
    /* renamed from: P */
    public Typeface mo64196P(String str, String str2) {
        C21539a A = mo64171A();
        if (A != null) {
            return A.mo64284b(str, str2);
        }
        return null;
    }

    /* renamed from: Q */
    public boolean mo64197Q() {
        C21581b bVar = this.f55500F0;
        return bVar != null && bVar.mo64498K();
    }

    /* renamed from: R */
    public boolean mo64198R() {
        C21581b bVar = this.f55500F0;
        return bVar != null && bVar.mo64499L();
    }

    /* renamed from: S */
    public boolean mo64199S() {
        C21683g gVar = this.f55512c;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    /* renamed from: T */
    public boolean mo64200T() {
        return this.f55504J0;
    }

    /* renamed from: U */
    public boolean mo64201U() {
        return this.f55512c.getRepeatCount() == -1;
    }

    /* renamed from: V */
    public boolean mo64202V() {
        return this.f55499E0;
    }

    @Deprecated
    /* renamed from: W */
    public void mo64203W(boolean z) {
        this.f55512c.setRepeatCount(z ? -1 : 0);
    }

    /* renamed from: X */
    public void mo64204X() {
        this.f55517v.clear();
        this.f55512c.mo64701u();
    }

    @C0353k0
    /* renamed from: Y */
    public void mo64205Y() {
        float f;
        if (this.f55500F0 == null) {
            this.f55517v.add(new C21526j());
            return;
        }
        if (mo64230k() || mo64191K() == 0) {
            this.f55512c.mo64702v();
        }
        if (!mo64230k()) {
            if (mo64194N() < 0.0f) {
                f = mo64185H();
            } else {
                f = mo64181F();
            }
            mo64231k0((int) f);
            this.f55512c.mo64692j();
        }
    }

    /* renamed from: Z */
    public void mo64206Z() {
        this.f55512c.removeAllListeners();
    }

    /* renamed from: a0 */
    public void mo64207a0() {
        this.f55512c.removeAllUpdateListeners();
        this.f55512c.addUpdateListener(this.f55518w);
    }

    /* renamed from: b0 */
    public void mo64208b0(Animator.AnimatorListener animatorListener) {
        this.f55512c.removeListener(animatorListener);
    }

    @C0376v0(api = 19)
    /* renamed from: c0 */
    public void mo64209c0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f55512c.removePauseListener(animatorPauseListener);
    }

    /* renamed from: d0 */
    public void mo64210d0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f55512c.removeUpdateListener(animatorUpdateListener);
    }

    public void draw(@C0359n0 Canvas canvas) {
        this.f55506L0 = false;
        C21492e.m99017a("Drawable#draw");
        if (this.f55516g) {
            try {
                mo64246s(canvas);
            } catch (Throwable th) {
                C21682f.m99758c("Lottie crashed in draw!", th);
            }
        } else {
            mo64246s(canvas);
        }
        C21492e.m99018b("Drawable#draw");
    }

    /* renamed from: e0 */
    public List<C21573d> mo64212e0(C21573d dVar) {
        if (this.f55500F0 == null) {
            C21682f.m99760e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f55500F0.mo64022d(dVar, 0, arrayList, new C21573d(new String[0]));
        return arrayList;
    }

    /* renamed from: f */
    public void mo64213f(Animator.AnimatorListener animatorListener) {
        this.f55512c.addListener(animatorListener);
    }

    @C0353k0
    /* renamed from: f0 */
    public void mo64214f0() {
        float f;
        if (this.f55500F0 == null) {
            this.f55517v.add(new C21527k());
            return;
        }
        if (mo64230k() || mo64191K() == 0) {
            this.f55512c.mo64676C();
        }
        if (!mo64230k()) {
            if (mo64194N() < 0.0f) {
                f = mo64185H();
            } else {
                f = mo64181F();
            }
            mo64231k0((int) f);
            this.f55512c.mo64692j();
        }
    }

    @C0376v0(api = 19)
    /* renamed from: g */
    public void mo64215g(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f55512c.addPauseListener(animatorPauseListener);
    }

    /* renamed from: g0 */
    public void mo64216g0() {
        this.f55512c.mo64677D();
    }

    public int getAlpha() {
        return this.f55501G0;
    }

    public int getIntrinsicHeight() {
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            return -1;
        }
        return (int) (((float) gVar.mo64119b().height()) * mo64193M());
    }

    public int getIntrinsicWidth() {
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            return -1;
        }
        return (int) (((float) gVar.mo64119b().width()) * mo64193M());
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void mo64221h(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f55512c.addUpdateListener(animatorUpdateListener);
    }

    /* renamed from: h0 */
    public void mo64222h0(boolean z) {
        this.f55504J0 = z;
    }

    /* renamed from: i */
    public <T> void mo64223i(C21573d dVar, T t, @C0363p0 C21702j<T> jVar) {
        C21581b bVar = this.f55500F0;
        if (bVar == null) {
            this.f55517v.add(new C21523g(dVar, t, jVar));
            return;
        }
        boolean z = true;
        if (dVar == C21573d.f55741c) {
            bVar.mo64021c(t, jVar);
        } else if (dVar.mo64430d() != null) {
            dVar.mo64430d().mo64021c(t, jVar);
        } else {
            List<C21573d> e0 = mo64212e0(dVar);
            for (int i = 0; i < e0.size(); i++) {
                e0.get(i).mo64430d().mo64021c(t, jVar);
            }
            z = true ^ e0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == C21601o.f55874C) {
                mo64172A0(mo64189J());
            }
        }
    }

    /* renamed from: i0 */
    public boolean mo64224i0(C21495g gVar) {
        if (this.f55511b == gVar) {
            return false;
        }
        this.f55506L0 = false;
        mo64240p();
        this.f55511b = gVar;
        mo64236n();
        this.f55512c.mo64678E(gVar);
        mo64172A0(this.f55512c.getAnimatedFraction());
        mo64180E0(this.f55513d);
        Iterator it = new ArrayList(this.f55517v).iterator();
        while (it.hasNext()) {
            C21534r rVar = (C21534r) it.next();
            if (rVar != null) {
                rVar.mo64268a(gVar);
            }
            it.remove();
        }
        this.f55517v.clear();
        gVar.mo64144z(this.f55502H0);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable((Drawable) null);
        imageView.setImageDrawable(this);
        return true;
    }

    public void invalidateDrawable(@C0359n0 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.f55506L0) {
            this.f55506L0 = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return mo64199S();
    }

    /* renamed from: j */
    public <T> void mo64228j(C21573d dVar, T t, C21704l<T> lVar) {
        mo64223i(dVar, t, new C21524h(lVar));
    }

    /* renamed from: j0 */
    public void mo64229j0(C21490c cVar) {
        this.f55508Y = cVar;
        C21539a aVar = this.f55507X;
        if (aVar != null) {
            aVar.mo64286d(cVar);
        }
    }

    /* renamed from: k */
    public final boolean mo64230k() {
        return this.f55514e || this.f55515f;
    }

    /* renamed from: k0 */
    public void mo64231k0(int i) {
        if (this.f55511b == null) {
            this.f55517v.add(new C21521e(i));
        } else {
            this.f55512c.mo64679F((float) i);
        }
    }

    /* renamed from: l */
    public final float mo64232l(Rect rect) {
        return ((float) rect.width()) / ((float) rect.height());
    }

    /* renamed from: l0 */
    public void mo64233l0(boolean z) {
        this.f55515f = z;
    }

    /* renamed from: m */
    public final boolean mo64234m() {
        C21495g gVar = this.f55511b;
        if (gVar == null || getBounds().isEmpty() || mo64232l(getBounds()) == mo64232l(gVar.mo64119b())) {
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    public void mo64235m0(C21491d dVar) {
        this.f55521z = dVar;
        C21540b bVar = this.f55519x;
        if (bVar != null) {
            bVar.mo64291d(dVar);
        }
    }

    /* renamed from: n */
    public final void mo64236n() {
        C21581b bVar = new C21581b(this, C21647s.m99702a(this.f55511b), this.f55511b.mo64128k(), this.f55511b);
        this.f55500F0 = bVar;
        if (this.f55503I0) {
            bVar.mo64476F(true);
        }
    }

    /* renamed from: n0 */
    public void mo64237n0(@C0363p0 String str) {
        this.f55520y = str;
    }

    /* renamed from: o */
    public void mo64238o() {
        this.f55517v.clear();
        this.f55512c.cancel();
    }

    /* renamed from: o0 */
    public void mo64239o0(int i) {
        if (this.f55511b == null) {
            this.f55517v.add(new C21530n(i));
        } else {
            this.f55512c.mo64680G(((float) i) + 0.99f);
        }
    }

    /* renamed from: p */
    public void mo64240p() {
        if (this.f55512c.isRunning()) {
            this.f55512c.cancel();
        }
        this.f55511b = null;
        this.f55500F0 = null;
        this.f55519x = null;
        this.f55512c.mo64690i();
        invalidateSelf();
    }

    /* renamed from: p0 */
    public void mo64241p0(String str) {
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            this.f55517v.add(new C21533q(str));
            return;
        }
        C21576g l = gVar.mo64129l(str);
        if (l != null) {
            mo64239o0((int) (l.f55748b + l.f55749c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: q */
    public void mo64242q() {
        this.f55505K0 = false;
    }

    /* renamed from: q0 */
    public void mo64243q0(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            this.f55517v.add(new C21531o(f));
        } else {
            mo64239o0((int) C21685i.m99797k(gVar.mo64135r(), this.f55511b.mo64123f(), f));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public void mo64244r(Canvas canvas, Matrix matrix) {
        C21581b bVar = this.f55500F0;
        if (bVar != null) {
            bVar.mo64025g(canvas, matrix, this.f55501G0);
        }
    }

    /* renamed from: r0 */
    public void mo64245r0(int i, int i2) {
        if (this.f55511b == null) {
            this.f55517v.add(new C21519c(i, i2));
        } else {
            this.f55512c.mo64681H((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: s */
    public final void mo64246s(@C0359n0 Canvas canvas) {
        if (!mo64234m()) {
            mo64253t(canvas);
        } else {
            mo64255u(canvas);
        }
    }

    /* renamed from: s0 */
    public void mo64247s0(String str) {
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            this.f55517v.add(new C21517a(str));
            return;
        }
        C21576g l = gVar.mo64129l(str);
        if (l != null) {
            int i = (int) l.f55748b;
            mo64245r0(i, ((int) l.f55749c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void scheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(@C0337f0(from = 0, mo995to = 255) int i) {
        this.f55501G0 = i;
        invalidateSelf();
    }

    public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
        C21682f.m99760e("Use addColorFilter instead.");
    }

    @C0353k0
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            mo64205Y();
        }
    }

    @C0353k0
    public void stop() {
        mo64262x();
    }

    /* renamed from: t */
    public final void mo64253t(Canvas canvas) {
        float f;
        if (this.f55500F0 != null) {
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f55511b.mo64119b().width());
            float height = ((float) bounds.height()) / ((float) this.f55511b.mo64119b().height());
            int i = -1;
            if (this.f55505K0) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.f55510a.reset();
            this.f55510a.preScale(width, height);
            this.f55500F0.mo64025g(canvas, this.f55510a, this.f55501G0);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: t0 */
    public void mo64254t0(String str, String str2, boolean z) {
        float f;
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            this.f55517v.add(new C21518b(str, str2, z));
            return;
        }
        C21576g l = gVar.mo64129l(str);
        if (l != null) {
            int i = (int) l.f55748b;
            C21576g l2 = this.f55511b.mo64129l(str2);
            if (l2 != null) {
                float f2 = l2.f55748b;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                mo64245r0(i, (int) (f2 + f));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: u */
    public final void mo64255u(Canvas canvas) {
        float f;
        int i;
        if (this.f55500F0 != null) {
            float f2 = this.f55513d;
            float G = mo64183G(canvas);
            if (f2 > G) {
                f = this.f55513d / G;
            } else {
                G = f2;
                f = 1.0f;
            }
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f55511b.mo64119b().width()) / 2.0f;
                float height = ((float) this.f55511b.mo64119b().height()) / 2.0f;
                float f3 = width * G;
                float f4 = height * G;
                canvas.translate((mo64193M() * width) - f3, (mo64193M() * height) - f4);
                canvas.scale(f, f, f3, f4);
            } else {
                i = -1;
            }
            this.f55510a.reset();
            this.f55510a.preScale(G, G);
            this.f55500F0.mo64025g(canvas, this.f55510a, this.f55501G0);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: u0 */
    public void mo64256u0(@C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0379x(from = 0.0d, mo1016to = 1.0d) float f2) {
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            this.f55517v.add(new C21520d(f, f2));
        } else {
            mo64245r0((int) C21685i.m99797k(gVar.mo64135r(), this.f55511b.mo64123f(), f), (int) C21685i.m99797k(this.f55511b.mo64135r(), this.f55511b.mo64123f(), f2));
        }
    }

    public void unscheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public void mo64258v(boolean z) {
        if (this.f55499E0 != z) {
            this.f55499E0 = z;
            if (this.f55511b != null) {
                mo64236n();
            }
        }
    }

    /* renamed from: v0 */
    public void mo64259v0(int i) {
        if (this.f55511b == null) {
            this.f55517v.add(new C21528l(i));
        } else {
            this.f55512c.mo64682I(i);
        }
    }

    /* renamed from: w */
    public boolean mo64260w() {
        return this.f55499E0;
    }

    /* renamed from: w0 */
    public void mo64261w0(String str) {
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            this.f55517v.add(new C21532p(str));
            return;
        }
        C21576g l = gVar.mo64129l(str);
        if (l != null) {
            mo64259v0((int) l.f55748b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @C0353k0
    /* renamed from: x */
    public void mo64262x() {
        this.f55517v.clear();
        this.f55512c.mo64692j();
    }

    /* renamed from: x0 */
    public void mo64263x0(float f) {
        C21495g gVar = this.f55511b;
        if (gVar == null) {
            this.f55517v.add(new C21529m(f));
        } else {
            mo64259v0((int) C21685i.m99797k(gVar.mo64135r(), this.f55511b.mo64123f(), f));
        }
    }

    /* renamed from: y */
    public C21495g mo64264y() {
        return this.f55511b;
    }

    /* renamed from: y0 */
    public void mo64265y0(boolean z) {
        if (this.f55503I0 != z) {
            this.f55503I0 = z;
            C21581b bVar = this.f55500F0;
            if (bVar != null) {
                bVar.mo64476F(z);
            }
        }
    }

    @C0363p0
    /* renamed from: z */
    public final Context mo64266z() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: z0 */
    public void mo64267z0(boolean z) {
        this.f55502H0 = z;
        C21495g gVar = this.f55511b;
        if (gVar != null) {
            gVar.mo64144z(z);
        }
    }
}
