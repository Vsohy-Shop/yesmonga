package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.C16680d;
import androidx.constraintlayout.core.motion.utils.C16685g;
import androidx.constraintlayout.motion.widget.C16900s;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.z */
public class C16912z {

    /* renamed from: A */
    public static final String f43976A = "ConstraintOverride";

    /* renamed from: B */
    public static final String f43977B = "CustomAttribute";

    /* renamed from: C */
    public static final String f43978C = "CustomMethod";

    /* renamed from: D */
    public static final int f43979D = -1;

    /* renamed from: E */
    public static final int f43980E = 1;

    /* renamed from: F */
    public static final int f43981F = 2;

    /* renamed from: G */
    public static final int f43982G = 3;

    /* renamed from: H */
    public static final int f43983H = 4;

    /* renamed from: I */
    public static final int f43984I = 5;

    /* renamed from: J */
    public static final int f43985J = 0;

    /* renamed from: K */
    public static final int f43986K = 1;

    /* renamed from: L */
    public static final int f43987L = 2;

    /* renamed from: M */
    public static final int f43988M = -1;

    /* renamed from: N */
    public static final int f43989N = -2;

    /* renamed from: O */
    public static final int f43990O = 0;

    /* renamed from: P */
    public static final int f43991P = 1;

    /* renamed from: Q */
    public static final int f43992Q = 2;

    /* renamed from: R */
    public static final int f43993R = 3;

    /* renamed from: S */
    public static final int f43994S = 4;

    /* renamed from: T */
    public static final int f43995T = 5;

    /* renamed from: U */
    public static final int f43996U = 6;

    /* renamed from: x */
    public static String f43997x = "ViewTransition";

    /* renamed from: y */
    public static final String f43998y = "ViewTransition";

    /* renamed from: z */
    public static final String f43999z = "KeyFrameSet";

    /* renamed from: a */
    public C16934c f44000a;

    /* renamed from: b */
    public int f44001b;

    /* renamed from: c */
    public int f44002c = -1;

    /* renamed from: d */
    public boolean f44003d = false;

    /* renamed from: e */
    public int f44004e = 0;

    /* renamed from: f */
    public int f44005f;

    /* renamed from: g */
    public C16886i f44006g;

    /* renamed from: h */
    public C16934c.C16935a f44007h;

    /* renamed from: i */
    public int f44008i = -1;

    /* renamed from: j */
    public int f44009j = -1;

    /* renamed from: k */
    public int f44010k;

    /* renamed from: l */
    public String f44011l;

    /* renamed from: m */
    public int f44012m = 0;

    /* renamed from: n */
    public String f44013n = null;

    /* renamed from: o */
    public int f44014o = -1;

    /* renamed from: p */
    public Context f44015p;

    /* renamed from: q */
    public int f44016q = -1;

    /* renamed from: r */
    public int f44017r = -1;

    /* renamed from: s */
    public int f44018s = -1;

    /* renamed from: t */
    public int f44019t = -1;

    /* renamed from: u */
    public int f44020u = -1;

    /* renamed from: v */
    public int f44021v = -1;

    /* renamed from: w */
    public int f44022w = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.z$a */
    public class C16913a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ C16680d f44023a;

        public C16913a(C16912z zVar, C16680d dVar) {
            this.f44023a = dVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f44023a.mo48998a((double) f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.z$b */
    public static class C16914b {

        /* renamed from: a */
        public final int f44024a;

        /* renamed from: b */
        public final int f44025b;

        /* renamed from: c */
        public long f44026c;

        /* renamed from: d */
        public C16895o f44027d;

        /* renamed from: e */
        public int f44028e;

        /* renamed from: f */
        public int f44029f;

        /* renamed from: g */
        public C16685g f44030g = new C16685g();

        /* renamed from: h */
        public C16875a0 f44031h;

        /* renamed from: i */
        public Interpolator f44032i;

        /* renamed from: j */
        public boolean f44033j = false;

        /* renamed from: k */
        public float f44034k;

        /* renamed from: l */
        public float f44035l;

        /* renamed from: m */
        public long f44036m;

        /* renamed from: n */
        public Rect f44037n = new Rect();

        /* renamed from: o */
        public boolean f44038o = false;

        public C16914b(C16875a0 a0Var, C16895o oVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.f44031h = a0Var;
            this.f44027d = oVar;
            this.f44028e = i;
            this.f44029f = i2;
            long nanoTime = System.nanoTime();
            this.f44026c = nanoTime;
            this.f44036m = nanoTime;
            this.f44031h.mo50112c(this);
            this.f44032i = interpolator;
            this.f44024a = i4;
            this.f44025b = i5;
            if (i3 == 3) {
                this.f44038o = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / ((float) i);
            }
            this.f44035l = f;
            mo50489a();
        }

        /* renamed from: a */
        public void mo50489a() {
            if (this.f44033j) {
                mo50491c();
            } else {
                mo50490b();
            }
        }

        /* renamed from: b */
        public void mo50490b() {
            float f;
            long nanoTime = System.nanoTime();
            this.f44036m = nanoTime;
            float f2 = this.f44034k + (((float) (((double) (nanoTime - this.f44036m)) * 1.0E-6d)) * this.f44035l);
            this.f44034k = f2;
            if (f2 >= 1.0f) {
                this.f44034k = 1.0f;
            }
            Interpolator interpolator = this.f44032i;
            if (interpolator == null) {
                f = this.f44034k;
            } else {
                f = interpolator.getInterpolation(this.f44034k);
            }
            float f3 = f;
            C16895o oVar = this.f44027d;
            boolean L = oVar.mo50224L(oVar.f43716b, f3, nanoTime, this.f44030g);
            if (this.f44034k >= 1.0f) {
                if (this.f44024a != -1) {
                    this.f44027d.mo50222J().setTag(this.f44024a, Long.valueOf(System.nanoTime()));
                }
                if (this.f44025b != -1) {
                    this.f44027d.mo50222J().setTag(this.f44025b, (Object) null);
                }
                if (!this.f44038o) {
                    this.f44031h.mo50120k(this);
                }
            }
            if (this.f44034k < 1.0f || L) {
                this.f44031h.mo50116g();
            }
        }

        /* renamed from: c */
        public void mo50491c() {
            float f;
            long nanoTime = System.nanoTime();
            this.f44036m = nanoTime;
            float f2 = this.f44034k - (((float) (((double) (nanoTime - this.f44036m)) * 1.0E-6d)) * this.f44035l);
            this.f44034k = f2;
            if (f2 < 0.0f) {
                this.f44034k = 0.0f;
            }
            Interpolator interpolator = this.f44032i;
            if (interpolator == null) {
                f = this.f44034k;
            } else {
                f = interpolator.getInterpolation(this.f44034k);
            }
            float f3 = f;
            C16895o oVar = this.f44027d;
            boolean L = oVar.mo50224L(oVar.f43716b, f3, nanoTime, this.f44030g);
            if (this.f44034k <= 0.0f) {
                if (this.f44024a != -1) {
                    this.f44027d.mo50222J().setTag(this.f44024a, Long.valueOf(System.nanoTime()));
                }
                if (this.f44025b != -1) {
                    this.f44027d.mo50222J().setTag(this.f44025b, (Object) null);
                }
                this.f44031h.mo50120k(this);
            }
            if (this.f44034k > 0.0f || L) {
                this.f44031h.mo50116g();
            }
        }

        /* renamed from: d */
        public void mo50492d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.f44027d.mo50222J().getHitRect(this.f44037n);
                    if (!this.f44037n.contains((int) f, (int) f2) && !this.f44033j) {
                        mo50493e(true);
                    }
                }
            } else if (!this.f44033j) {
                mo50493e(true);
            }
        }

        /* renamed from: e */
        public void mo50493e(boolean z) {
            int i;
            float f;
            this.f44033j = z;
            if (z && (i = this.f44029f) != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / ((float) i);
                }
                this.f44035l = f;
            }
            this.f44031h.mo50116g();
            this.f44036m = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16912z(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f44002c = r0
            r1 = 0
            r9.f44003d = r1
            r9.f44004e = r1
            r9.f44008i = r0
            r9.f44009j = r0
            r9.f44012m = r1
            r2 = 0
            r9.f44013n = r2
            r9.f44014o = r0
            r9.f44016q = r0
            r9.f44017r = r0
            r9.f44018s = r0
            r9.f44019t = r0
            r9.f44020u = r0
            r9.f44021v = r0
            r9.f44022w = r0
            r9.f44015p = r10
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
        L_0x002a:
            r3 = 1
            if (r2 == r3) goto L_0x00d9
            java.lang.String r4 = "ViewTransition"
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L_0x0042
            if (r2 == r5) goto L_0x0037
            goto L_0x00ca
        L_0x0037:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            boolean r2 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r2 == 0) goto L_0x00ca
            return
        L_0x0042:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r8 = 4
            switch(r7) {
                case -1962203927: goto L_0x0075;
                case -1239391468: goto L_0x006b;
                case 61998586: goto L_0x0063;
                case 366511058: goto L_0x0059;
                case 1791837707: goto L_0x004f;
                default: goto L_0x004e;
            }     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
        L_0x004e:
            goto L_0x007f
        L_0x004f:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r5
            goto L_0x0080
        L_0x0059:
            java.lang.String r4 = "CustomMethod"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r8
            goto L_0x0080
        L_0x0063:
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r1
            goto L_0x0080
        L_0x006b:
            java.lang.String r4 = "KeyFrameSet"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r3
            goto L_0x0080
        L_0x0075:
            java.lang.String r4 = "ConstraintOverride"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            if (r4 == 0) goto L_0x007f
            r4 = r6
            goto L_0x0080
        L_0x007f:
            r4 = r0
        L_0x0080:
            if (r4 == 0) goto L_0x00c7
            if (r4 == r3) goto L_0x00bf
            if (r4 == r6) goto L_0x00b8
            if (r4 == r5) goto L_0x00b0
            if (r4 == r8) goto L_0x00b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.lang.String r4 = androidx.constraintlayout.motion.widget.C16878c.m77583f()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.lang.String r4 = " unknown tag "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.lang.String r3 = ".xml:"
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            int r3 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x00ca
        L_0x00b0:
            androidx.constraintlayout.widget.c$a r2 = r9.f44007h     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f44586g     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            androidx.constraintlayout.widget.ConstraintAttribute.m78206q(r10, r11, r2)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x00ca
        L_0x00b8:
            androidx.constraintlayout.widget.c$a r2 = androidx.constraintlayout.widget.C16934c.m78358w(r10, r11)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r9.f44007h = r2     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x00ca
        L_0x00bf:
            androidx.constraintlayout.motion.widget.i r2 = new androidx.constraintlayout.motion.widget.i     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            r9.f44006g = r2     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x00ca
        L_0x00c7:
            r9.mo50478n(r10, r11)     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
        L_0x00ca:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00d5, IOException -> 0x00d0 }
            goto L_0x002a
        L_0x00d0:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00d9
        L_0x00d5:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16912z.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m78142l(View[] viewArr) {
        if (this.f44016q != -1) {
            for (View tag : viewArr) {
                tag.setTag(this.f44016q, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f44017r != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(this.f44017r, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public void mo50467b(C16875a0 a0Var, MotionLayout motionLayout, View view) {
        C16895o oVar = new C16895o(view);
        oVar.mo50230R(view);
        this.f44006g.mo50174a(oVar);
        oVar.mo50240a0(motionLayout.getWidth(), motionLayout.getHeight(), (float) this.f44008i, System.nanoTime());
        C16875a0 a0Var2 = a0Var;
        C16895o oVar2 = oVar;
        new C16914b(a0Var2, oVar2, this.f44008i, this.f44009j, this.f44002c, mo50471f(motionLayout.getContext()), this.f44016q, this.f44017r);
    }

    /* renamed from: c */
    public void mo50468c(C16875a0 a0Var, MotionLayout motionLayout, int i, C16934c cVar, View... viewArr) {
        if (!this.f44003d) {
            int i2 = this.f44005f;
            if (i2 == 2) {
                mo50467b(a0Var, motionLayout, viewArr[0]);
                return;
            }
            if (i2 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i3 : constraintSetIds) {
                    if (i3 != i) {
                        C16934c n0 = motionLayout.mo50021n0(i3);
                        for (View id : viewArr) {
                            C16934c.C16935a k0 = n0.mo50882k0(id.getId());
                            C16934c.C16935a aVar = this.f44007h;
                            if (aVar != null) {
                                aVar.mo50926h(k0);
                                k0.f44586g.putAll(this.f44007h.f44586g);
                            }
                        }
                    }
                }
            }
            C16934c cVar2 = new C16934c();
            cVar2.mo50826I(cVar);
            for (View id2 : viewArr) {
                C16934c.C16935a k02 = cVar2.mo50882k0(id2.getId());
                C16934c.C16935a aVar2 = this.f44007h;
                if (aVar2 != null) {
                    aVar2.mo50926h(k02);
                    k02.f44586g.putAll(this.f44007h.f44586g);
                }
            }
            motionLayout.mo49985V0(i, cVar2);
            int i4 = C16944e.C16951g.view_transition;
            motionLayout.mo49985V0(i4, cVar);
            motionLayout.setState(i4, -1, -1);
            C16900s.C16902b bVar = new C16900s.C16902b(-1, motionLayout.f43256a, i4, i);
            for (View v : viewArr) {
                mo50487v(bVar, v);
            }
            motionLayout.setTransition(bVar);
            motionLayout.mo49974O0(new C16911y(this, viewArr));
        }
    }

    /* renamed from: d */
    public boolean mo50469d(View view) {
        boolean z;
        boolean z2;
        int i = this.f44018s;
        if (i != -1 && view.getTag(i) == null) {
            z = false;
        } else {
            z = true;
        }
        int i2 = this.f44019t;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public int mo50470e() {
        return this.f44001b;
    }

    /* renamed from: f */
    public Interpolator mo50471f(Context context) {
        int i = this.f44012m;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.f44014o);
        }
        if (i == -1) {
            return new C16913a(this, C16680d.m76169c(this.f44013n));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* renamed from: g */
    public int mo50472g() {
        return this.f44020u;
    }

    /* renamed from: h */
    public int mo50473h() {
        return this.f44022w;
    }

    /* renamed from: i */
    public int mo50474i() {
        return this.f44021v;
    }

    /* renamed from: j */
    public int mo50475j() {
        return this.f44002c;
    }

    /* renamed from: k */
    public boolean mo50476k() {
        return !this.f44003d;
    }

    /* renamed from: m */
    public boolean mo50477m(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f44010k == -1 && this.f44011l == null) || !mo50469d(view)) {
            return false;
        }
        if (view.getId() == this.f44010k) {
            return true;
        }
        if (this.f44011l != null && (view.getLayoutParams() instanceof ConstraintLayout.C16926b) && (str = ((ConstraintLayout.C16926b) view.getLayoutParams()).f44255c0) != null && str.matches(this.f44011l)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void mo50478n(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C16944e.C16957m.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C16944e.C16957m.ViewTransition_android_id) {
                this.f44001b = obtainStyledAttributes.getResourceId(index, this.f44001b);
            } else if (index == C16944e.C16957m.ViewTransition_motionTarget) {
                if (MotionLayout.f43205d2) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f44010k);
                    this.f44010k = resourceId;
                    if (resourceId == -1) {
                        this.f44011l = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f44011l = obtainStyledAttributes.getString(index);
                } else {
                    this.f44010k = obtainStyledAttributes.getResourceId(index, this.f44010k);
                }
            } else if (index == C16944e.C16957m.ViewTransition_onStateTransition) {
                this.f44002c = obtainStyledAttributes.getInt(index, this.f44002c);
            } else if (index == C16944e.C16957m.ViewTransition_transitionDisable) {
                this.f44003d = obtainStyledAttributes.getBoolean(index, this.f44003d);
            } else if (index == C16944e.C16957m.ViewTransition_pathMotionArc) {
                this.f44004e = obtainStyledAttributes.getInt(index, this.f44004e);
            } else if (index == C16944e.C16957m.ViewTransition_duration) {
                this.f44008i = obtainStyledAttributes.getInt(index, this.f44008i);
            } else if (index == C16944e.C16957m.ViewTransition_upDuration) {
                this.f44009j = obtainStyledAttributes.getInt(index, this.f44009j);
            } else if (index == C16944e.C16957m.ViewTransition_viewTransitionMode) {
                this.f44005f = obtainStyledAttributes.getInt(index, this.f44005f);
            } else if (index == C16944e.C16957m.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f44014o = resourceId2;
                    if (resourceId2 != -1) {
                        this.f44012m = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f44013n = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f44012m = -1;
                    } else {
                        this.f44014o = obtainStyledAttributes.getResourceId(index, -1);
                        this.f44012m = -2;
                    }
                } else {
                    this.f44012m = obtainStyledAttributes.getInteger(index, this.f44012m);
                }
            } else if (index == C16944e.C16957m.ViewTransition_setsTag) {
                this.f44016q = obtainStyledAttributes.getResourceId(index, this.f44016q);
            } else if (index == C16944e.C16957m.ViewTransition_clearsTag) {
                this.f44017r = obtainStyledAttributes.getResourceId(index, this.f44017r);
            } else if (index == C16944e.C16957m.ViewTransition_ifTagSet) {
                this.f44018s = obtainStyledAttributes.getResourceId(index, this.f44018s);
            } else if (index == C16944e.C16957m.ViewTransition_ifTagNotSet) {
                this.f44019t = obtainStyledAttributes.getResourceId(index, this.f44019t);
            } else if (index == C16944e.C16957m.ViewTransition_SharedValueId) {
                this.f44021v = obtainStyledAttributes.getResourceId(index, this.f44021v);
            } else if (index == C16944e.C16957m.ViewTransition_SharedValue) {
                this.f44020u = obtainStyledAttributes.getInteger(index, this.f44020u);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: o */
    public void mo50479o(boolean z) {
        this.f44003d = !z;
    }

    /* renamed from: p */
    public void mo50480p(int i) {
        this.f44001b = i;
    }

    /* renamed from: q */
    public void mo50481q(int i) {
        this.f44020u = i;
    }

    /* renamed from: r */
    public void mo50482r(int i) {
        this.f44022w = i;
    }

    /* renamed from: s */
    public void mo50483s(int i) {
        this.f44021v = i;
    }

    /* renamed from: t */
    public void mo50484t(int i) {
        this.f44002c = i;
    }

    public String toString() {
        return "ViewTransition(" + C16878c.m77586i(this.f44015p, this.f44001b) + ")";
    }

    /* renamed from: u */
    public boolean mo50486u(int i) {
        int i2 = this.f44002c;
        return i2 == 1 ? i == 0 : i2 == 2 ? i == 1 : i2 == 3 && i == 0;
    }

    /* renamed from: v */
    public final void mo50487v(C16900s.C16902b bVar, View view) {
        int i = this.f44008i;
        if (i != -1) {
            bVar.mo50371O(i);
        }
        bVar.mo50378V(this.f44004e);
        bVar.mo50374R(this.f44012m, this.f44013n, this.f44014o);
        int id = view.getId();
        C16886i iVar = this.f44006g;
        if (iVar != null) {
            ArrayList<C16881f> d = iVar.mo50177d(-1);
            C16886i iVar2 = new C16886i();
            Iterator<C16881f> it = d.iterator();
            while (it.hasNext()) {
                iVar2.mo50176c(it.next().clone().mo50167k(id));
            }
            bVar.mo50381t(iVar2);
        }
    }
}
