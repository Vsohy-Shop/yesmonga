package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.C0346i;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import com.airbnb.lottie.C21492e;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.C21439a;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21447e;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21474c;
import com.airbnb.lottie.animation.keyframe.C21478g;
import com.airbnb.lottie.animation.keyframe.C21486o;
import com.airbnb.lottie.model.C21573d;
import com.airbnb.lottie.model.C21574e;
import com.airbnb.lottie.model.content.C21568h;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.C21682f;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21702j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.a */
public abstract class C21578a implements C21447e, C21466a.C21468b, C21574e {

    /* renamed from: A */
    public static final int f55789A = 16;

    /* renamed from: B */
    public static final int f55790B = 1;

    /* renamed from: C */
    public static final int f55791C = 19;

    /* renamed from: z */
    public static final int f55792z = 2;

    /* renamed from: a */
    public final Path f55793a = new Path();

    /* renamed from: b */
    public final Matrix f55794b = new Matrix();

    /* renamed from: c */
    public final Paint f55795c = new C21439a(1);

    /* renamed from: d */
    public final Paint f55796d = new C21439a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    public final Paint f55797e = new C21439a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    public final Paint f55798f;

    /* renamed from: g */
    public final Paint f55799g;

    /* renamed from: h */
    public final RectF f55800h;

    /* renamed from: i */
    public final RectF f55801i;

    /* renamed from: j */
    public final RectF f55802j;

    /* renamed from: k */
    public final RectF f55803k;

    /* renamed from: l */
    public final String f55804l;

    /* renamed from: m */
    public final Matrix f55805m;

    /* renamed from: n */
    public final C21516j f55806n;

    /* renamed from: o */
    public final Layer f55807o;
    @C0363p0

    /* renamed from: p */
    public C21478g f55808p;
    @C0363p0

    /* renamed from: q */
    public C21474c f55809q;
    @C0363p0

    /* renamed from: r */
    public C21578a f55810r;
    @C0363p0

    /* renamed from: s */
    public C21578a f55811s;

    /* renamed from: t */
    public List<C21578a> f55812t;

    /* renamed from: u */
    public final List<C21466a<?, ?>> f55813u;

    /* renamed from: v */
    public final C21486o f55814v;

    /* renamed from: w */
    public boolean f55815w;

    /* renamed from: x */
    public boolean f55816x;
    @C0363p0

    /* renamed from: y */
    public Paint f55817y;

    /* renamed from: com.airbnb.lottie.model.layer.a$a */
    public class C21579a implements C21466a.C21468b {
        public C21579a() {
        }

        /* renamed from: a */
        public void mo64019a() {
            C21578a aVar = C21578a.this;
            aVar.mo64479I(aVar.f55809q.mo64081p() == 1.0f);
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.a$b */
    public static /* synthetic */ class C21580b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55819a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f55820b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                com.airbnb.lottie.model.content.Mask$MaskMode[] r0 = com.airbnb.lottie.model.content.Mask.MaskMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55820b = r0
                r1 = 1
                com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f55820b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.Mask$MaskMode r3 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f55820b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.Mask$MaskMode r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f55820b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.Mask$MaskMode r5 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.airbnb.lottie.model.layer.Layer$LayerType[] r4 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f55819a = r4
                com.airbnb.lottie.model.layer.Layer$LayerType r5 = com.airbnb.lottie.model.layer.Layer.LayerType.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f55819a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f55819a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f55819a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f55819a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f55819a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f55819a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C21578a.C21580b.<clinit>():void");
        }
    }

    public C21578a(C21516j jVar, Layer layer) {
        C21439a aVar = new C21439a(1);
        this.f55798f = aVar;
        this.f55799g = new C21439a(PorterDuff.Mode.CLEAR);
        this.f55800h = new RectF();
        this.f55801i = new RectF();
        this.f55802j = new RectF();
        this.f55803k = new RectF();
        this.f55805m = new Matrix();
        this.f55813u = new ArrayList();
        this.f55815w = true;
        this.f55806n = jVar;
        this.f55807o = layer;
        this.f55804l = layer.mo64453g() + "#draw";
        if (layer.mo64452f() == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C21486o b = layer.mo64468u().mo64306b();
        this.f55814v = b;
        b.mo64104b(this);
        if (layer.mo64451e() != null && !layer.mo64451e().isEmpty()) {
            C21478g gVar = new C21478g(layer.mo64451e());
            this.f55808p = gVar;
            for (C21466a<C21568h, Path> a : gVar.mo64088a()) {
                a.mo64057a(this);
            }
            for (C21466a next : this.f55808p.mo64090c()) {
                mo64481i(next);
                next.mo64057a(this);
            }
        }
        mo64480J();
    }

    @C0363p0
    /* renamed from: u */
    public static C21578a m99458u(Layer layer, C21516j jVar, C21495g gVar) {
        switch (C21580b.f55819a[layer.mo64450d().ordinal()]) {
            case 1:
                return new C21585e(jVar, layer);
            case 2:
                return new C21581b(jVar, layer, gVar.mo64133p(layer.mo64457k()), gVar);
            case 3:
                return new C21586f(jVar, layer);
            case 4:
                return new C21583c(jVar, layer);
            case 5:
                return new C21584d(jVar, layer);
            case 6:
                return new C21587g(jVar, layer);
            default:
                C21682f.m99760e("Unknown layer type " + layer.mo64450d());
                return null;
        }
    }

    /* renamed from: A */
    public final void mo64471A() {
        this.f55806n.invalidateSelf();
    }

    /* renamed from: B */
    public final void mo64472B(float f) {
        this.f55806n.mo64264y().mo64132o().mo64653e(this.f55807o.mo64453g(), f);
    }

    /* renamed from: C */
    public void mo64473C(C21466a<?, ?> aVar) {
        this.f55813u.remove(aVar);
    }

    /* renamed from: D */
    public void mo64474D(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
    }

    /* renamed from: E */
    public void mo64475E(@C0363p0 C21578a aVar) {
        this.f55810r = aVar;
    }

    /* renamed from: F */
    public void mo64476F(boolean z) {
        if (z && this.f55817y == null) {
            this.f55817y = new C21439a();
        }
        this.f55816x = z;
    }

    /* renamed from: G */
    public void mo64477G(@C0363p0 C21578a aVar) {
        this.f55811s = aVar;
    }

    /* renamed from: H */
    public void mo64478H(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f55814v.mo64112j(f);
        if (this.f55808p != null) {
            for (int i = 0; i < this.f55808p.mo64088a().size(); i++) {
                this.f55808p.mo64088a().get(i).mo64069m(f);
            }
        }
        C21474c cVar = this.f55809q;
        if (cVar != null) {
            cVar.mo64069m(f);
        }
        C21578a aVar = this.f55810r;
        if (aVar != null) {
            aVar.mo64478H(f);
        }
        for (int i2 = 0; i2 < this.f55813u.size(); i2++) {
            this.f55813u.get(i2).mo64069m(f);
        }
    }

    /* renamed from: I */
    public final void mo64479I(boolean z) {
        if (z != this.f55815w) {
            this.f55815w = z;
            mo64471A();
        }
    }

    /* renamed from: J */
    public final void mo64480J() {
        boolean z = true;
        if (!this.f55807o.mo64449c().isEmpty()) {
            C21474c cVar = new C21474c(this.f55807o.mo64449c());
            this.f55809q = cVar;
            cVar.mo64068l();
            this.f55809q.mo64057a(new C21579a());
            if (((Float) this.f55809q.mo64064h()).floatValue() != 1.0f) {
                z = false;
            }
            mo64479I(z);
            mo64481i(this.f55809q);
            return;
        }
        mo64479I(true);
    }

    /* renamed from: a */
    public void mo64019a() {
        mo64471A();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
    }

    @C0346i
    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        this.f55814v.mo64105c(t, jVar);
    }

    /* renamed from: d */
    public void mo64022d(C21573d dVar, int i, List<C21573d> list, C21573d dVar2) {
        C21578a aVar = this.f55810r;
        if (aVar != null) {
            C21573d a = dVar2.mo64427a(aVar.getName());
            if (dVar.mo64429c(this.f55810r.getName(), i)) {
                list.add(a.mo64436j(this.f55810r));
            }
            if (dVar.mo64435i(getName(), i)) {
                this.f55810r.mo64474D(dVar, dVar.mo64431e(this.f55810r.getName(), i) + i, list, a);
            }
        }
        if (dVar.mo64434h(getName(), i)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.mo64427a(getName());
                if (dVar.mo64429c(getName(), i)) {
                    list.add(dVar2.mo64436j(this));
                }
            }
            if (dVar.mo64435i(getName(), i)) {
                mo64474D(dVar, i + dVar.mo64431e(getName(), i), list, dVar2);
            }
        }
    }

    @C0346i
    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        this.f55800h.set(0.0f, 0.0f, 0.0f, 0.0f);
        mo64490r();
        this.f55805m.set(matrix);
        if (z) {
            List<C21578a> list = this.f55812t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f55805m.preConcat(this.f55812t.get(size).f55814v.mo64108f());
                }
            } else {
                C21578a aVar = this.f55811s;
                if (aVar != null) {
                    this.f55805m.preConcat(aVar.f55814v.mo64108f());
                }
            }
        }
        this.f55805m.preConcat(this.f55814v.mo64108f());
    }

    /* renamed from: g */
    public void mo64025g(Canvas canvas, Matrix matrix, int i) {
        int i2;
        Paint paint;
        C21492e.m99017a(this.f55804l);
        if (!this.f55815w || this.f55807o.mo64469v()) {
            C21492e.m99018b(this.f55804l);
            return;
        }
        mo64490r();
        C21492e.m99017a("Layer#parentMatrix");
        this.f55794b.reset();
        this.f55794b.set(matrix);
        for (int size = this.f55812t.size() - 1; size >= 0; size--) {
            this.f55794b.preConcat(this.f55812t.get(size).f55814v.mo64108f());
        }
        C21492e.m99018b("Layer#parentMatrix");
        if (this.f55814v.mo64110h() == null) {
            i2 = 100;
        } else {
            i2 = this.f55814v.mo64110h().mo64064h().intValue();
        }
        int i3 = (int) ((((((float) i) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
        if (mo64495x() || mo64494w()) {
            C21492e.m99017a("Layer#computeBounds");
            mo64023e(this.f55800h, this.f55794b, false);
            mo64497z(this.f55800h, matrix);
            this.f55794b.preConcat(this.f55814v.mo64108f());
            mo64496y(this.f55800h, this.f55794b);
            if (!this.f55800h.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f55800h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C21492e.m99018b("Layer#computeBounds");
            if (this.f55800h.width() >= 1.0f && this.f55800h.height() >= 1.0f) {
                C21492e.m99017a("Layer#saveLayer");
                this.f55795c.setAlpha(255);
                C21686j.m99813n(canvas, this.f55800h, this.f55795c);
                C21492e.m99018b("Layer#saveLayer");
                mo64491s(canvas);
                C21492e.m99017a("Layer#drawLayer");
                mo64492t(canvas, this.f55794b, i3);
                C21492e.m99018b("Layer#drawLayer");
                if (mo64494w()) {
                    mo64487o(canvas, this.f55794b);
                }
                if (mo64495x()) {
                    C21492e.m99017a("Layer#drawMatte");
                    C21492e.m99017a("Layer#saveLayer");
                    C21686j.m99814o(canvas, this.f55800h, this.f55798f, 19);
                    C21492e.m99018b("Layer#saveLayer");
                    mo64491s(canvas);
                    this.f55810r.mo64025g(canvas, matrix, i3);
                    C21492e.m99017a("Layer#restoreLayer");
                    canvas.restore();
                    C21492e.m99018b("Layer#restoreLayer");
                    C21492e.m99018b("Layer#drawMatte");
                }
                C21492e.m99017a("Layer#restoreLayer");
                canvas.restore();
                C21492e.m99018b("Layer#restoreLayer");
            }
            if (this.f55816x && (paint = this.f55817y) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f55817y.setColor(-251901);
                this.f55817y.setStrokeWidth(4.0f);
                canvas.drawRect(this.f55800h, this.f55817y);
                this.f55817y.setStyle(Paint.Style.FILL);
                this.f55817y.setColor(1357638635);
                canvas.drawRect(this.f55800h, this.f55817y);
            }
            mo64472B(C21492e.m99018b(this.f55804l));
            return;
        }
        this.f55794b.preConcat(this.f55814v.mo64108f());
        C21492e.m99017a("Layer#drawLayer");
        mo64492t(canvas, this.f55794b, i3);
        C21492e.m99018b("Layer#drawLayer");
        mo64472B(C21492e.m99018b(this.f55804l));
    }

    public String getName() {
        return this.f55807o.mo64453g();
    }

    /* renamed from: i */
    public void mo64481i(@C0363p0 C21466a<?, ?> aVar) {
        if (aVar != null) {
            this.f55813u.add(aVar);
        }
    }

    /* renamed from: j */
    public final void mo64482j(Canvas canvas, Matrix matrix, Mask mask, C21466a<C21568h, Path> aVar, C21466a<Integer, Integer> aVar2) {
        this.f55793a.set(aVar.mo64064h());
        this.f55793a.transform(matrix);
        this.f55795c.setAlpha((int) (((float) aVar2.mo64064h().intValue()) * 2.55f));
        canvas.drawPath(this.f55793a, this.f55795c);
    }

    /* renamed from: k */
    public final void mo64483k(Canvas canvas, Matrix matrix, Mask mask, C21466a<C21568h, Path> aVar, C21466a<Integer, Integer> aVar2) {
        C21686j.m99813n(canvas, this.f55800h, this.f55796d);
        this.f55793a.set(aVar.mo64064h());
        this.f55793a.transform(matrix);
        this.f55795c.setAlpha((int) (((float) aVar2.mo64064h().intValue()) * 2.55f));
        canvas.drawPath(this.f55793a, this.f55795c);
        canvas.restore();
    }

    /* renamed from: l */
    public final void mo64484l(Canvas canvas, Matrix matrix, Mask mask, C21466a<C21568h, Path> aVar, C21466a<Integer, Integer> aVar2) {
        C21686j.m99813n(canvas, this.f55800h, this.f55795c);
        canvas.drawRect(this.f55800h, this.f55795c);
        this.f55793a.set(aVar.mo64064h());
        this.f55793a.transform(matrix);
        this.f55795c.setAlpha((int) (((float) aVar2.mo64064h().intValue()) * 2.55f));
        canvas.drawPath(this.f55793a, this.f55797e);
        canvas.restore();
    }

    /* renamed from: m */
    public final void mo64485m(Canvas canvas, Matrix matrix, Mask mask, C21466a<C21568h, Path> aVar, C21466a<Integer, Integer> aVar2) {
        C21686j.m99813n(canvas, this.f55800h, this.f55796d);
        canvas.drawRect(this.f55800h, this.f55795c);
        this.f55797e.setAlpha((int) (((float) aVar2.mo64064h().intValue()) * 2.55f));
        this.f55793a.set(aVar.mo64064h());
        this.f55793a.transform(matrix);
        canvas.drawPath(this.f55793a, this.f55797e);
        canvas.restore();
    }

    /* renamed from: n */
    public final void mo64486n(Canvas canvas, Matrix matrix, Mask mask, C21466a<C21568h, Path> aVar, C21466a<Integer, Integer> aVar2) {
        C21686j.m99813n(canvas, this.f55800h, this.f55797e);
        canvas.drawRect(this.f55800h, this.f55795c);
        this.f55797e.setAlpha((int) (((float) aVar2.mo64064h().intValue()) * 2.55f));
        this.f55793a.set(aVar.mo64064h());
        this.f55793a.transform(matrix);
        canvas.drawPath(this.f55793a, this.f55797e);
        canvas.restore();
    }

    /* renamed from: o */
    public final void mo64487o(Canvas canvas, Matrix matrix) {
        C21492e.m99017a("Layer#saveLayer");
        C21686j.m99814o(canvas, this.f55800h, this.f55796d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            mo64491s(canvas);
        }
        C21492e.m99018b("Layer#saveLayer");
        for (int i = 0; i < this.f55808p.mo64089b().size(); i++) {
            Mask mask = this.f55808p.mo64089b().get(i);
            C21466a aVar = this.f55808p.mo64088a().get(i);
            C21466a aVar2 = this.f55808p.mo64090c().get(i);
            int i2 = C21580b.f55820b[mask.mo64327a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f55795c.setColor(-16777216);
                        this.f55795c.setAlpha(255);
                        canvas.drawRect(this.f55800h, this.f55795c);
                    }
                    if (mask.mo64330d()) {
                        mo64486n(canvas, matrix, mask, aVar, aVar2);
                    } else {
                        mo64488p(canvas, matrix, mask, aVar, aVar2);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.mo64330d()) {
                            mo64484l(canvas, matrix, mask, aVar, aVar2);
                        } else {
                            mo64482j(canvas, matrix, mask, aVar, aVar2);
                        }
                    }
                } else if (mask.mo64330d()) {
                    mo64485m(canvas, matrix, mask, aVar, aVar2);
                } else {
                    mo64483k(canvas, matrix, mask, aVar, aVar2);
                }
            } else if (mo64489q()) {
                this.f55795c.setAlpha(255);
                canvas.drawRect(this.f55800h, this.f55795c);
            }
        }
        C21492e.m99017a("Layer#restoreLayer");
        canvas.restore();
        C21492e.m99018b("Layer#restoreLayer");
    }

    /* renamed from: p */
    public final void mo64488p(Canvas canvas, Matrix matrix, Mask mask, C21466a<C21568h, Path> aVar, C21466a<Integer, Integer> aVar2) {
        this.f55793a.set(aVar.mo64064h());
        this.f55793a.transform(matrix);
        canvas.drawPath(this.f55793a, this.f55797e);
    }

    /* renamed from: q */
    public final boolean mo64489q() {
        if (this.f55808p.mo64088a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f55808p.mo64089b().size(); i++) {
            if (this.f55808p.mo64089b().get(i).mo64327a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final void mo64490r() {
        if (this.f55812t == null) {
            if (this.f55811s == null) {
                this.f55812t = Collections.emptyList();
                return;
            }
            this.f55812t = new ArrayList();
            for (C21578a aVar = this.f55811s; aVar != null; aVar = aVar.f55811s) {
                this.f55812t.add(aVar);
            }
        }
    }

    /* renamed from: s */
    public final void mo64491s(Canvas canvas) {
        C21492e.m99017a("Layer#clearLayer");
        RectF rectF = this.f55800h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f55799g);
        C21492e.m99018b("Layer#clearLayer");
    }

    /* renamed from: t */
    public abstract void mo64492t(Canvas canvas, Matrix matrix, int i);

    /* renamed from: v */
    public Layer mo64493v() {
        return this.f55807o;
    }

    /* renamed from: w */
    public boolean mo64494w() {
        C21478g gVar = this.f55808p;
        return gVar != null && !gVar.mo64088a().isEmpty();
    }

    /* renamed from: x */
    public boolean mo64495x() {
        return this.f55810r != null;
    }

    /* renamed from: y */
    public final void mo64496y(RectF rectF, Matrix matrix) {
        this.f55801i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (mo64494w()) {
            int size = this.f55808p.mo64089b().size();
            int i = 0;
            while (i < size) {
                Mask mask = this.f55808p.mo64089b().get(i);
                this.f55793a.set((Path) this.f55808p.mo64088a().get(i).mo64064h());
                this.f55793a.transform(matrix);
                int i2 = C21580b.f55820b[mask.mo64327a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 != 3 && i2 != 4) || !mask.mo64330d()) {
                        this.f55793a.computeBounds(this.f55803k, false);
                        if (i == 0) {
                            this.f55801i.set(this.f55803k);
                        } else {
                            RectF rectF2 = this.f55801i;
                            rectF2.set(Math.min(rectF2.left, this.f55803k.left), Math.min(this.f55801i.top, this.f55803k.top), Math.max(this.f55801i.right, this.f55803k.right), Math.max(this.f55801i.bottom, this.f55803k.bottom));
                        }
                        i++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.f55801i)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: z */
    public final void mo64497z(RectF rectF, Matrix matrix) {
        if (mo64495x() && this.f55807o.mo64452f() != Layer.MatteType.INVERT) {
            this.f55802j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f55810r.mo64023e(this.f55802j, matrix, true);
            if (!rectF.intersect(this.f55802j)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }
}
