package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.C0363p0;
import androidx.collection.C1875h;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.C21601o;
import com.airbnb.lottie.animation.content.C21446d;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.animation.keyframe.C21485n;
import com.airbnb.lottie.animation.keyframe.C21487p;
import com.airbnb.lottie.model.C21558b;
import com.airbnb.lottie.model.C21559c;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.animatable.C21543a;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21553k;
import com.airbnb.lottie.model.content.C21570j;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21702j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.model.layer.g */
public class C21587g extends C21578a {

    /* renamed from: D */
    public final StringBuilder f55841D = new StringBuilder(2);

    /* renamed from: E */
    public final RectF f55842E = new RectF();

    /* renamed from: F */
    public final Matrix f55843F = new Matrix();

    /* renamed from: G */
    public final Paint f55844G = new C21588a(1);

    /* renamed from: H */
    public final Paint f55845H = new C21589b(1);

    /* renamed from: I */
    public final Map<C21559c, List<C21446d>> f55846I = new HashMap();

    /* renamed from: J */
    public final C1875h<String> f55847J = new C1875h<>();

    /* renamed from: K */
    public final C21485n f55848K;

    /* renamed from: L */
    public final C21516j f55849L;

    /* renamed from: M */
    public final C21495g f55850M;
    @C0363p0

    /* renamed from: N */
    public C21466a<Integer, Integer> f55851N;
    @C0363p0

    /* renamed from: O */
    public C21466a<Integer, Integer> f55852O;
    @C0363p0

    /* renamed from: P */
    public C21466a<Integer, Integer> f55853P;
    @C0363p0

    /* renamed from: Q */
    public C21466a<Integer, Integer> f55854Q;
    @C0363p0

    /* renamed from: R */
    public C21466a<Float, Float> f55855R;
    @C0363p0

    /* renamed from: S */
    public C21466a<Float, Float> f55856S;
    @C0363p0

    /* renamed from: T */
    public C21466a<Float, Float> f55857T;
    @C0363p0

    /* renamed from: U */
    public C21466a<Float, Float> f55858U;
    @C0363p0

    /* renamed from: V */
    public C21466a<Float, Float> f55859V;
    @C0363p0

    /* renamed from: W */
    public C21466a<Float, Float> f55860W;
    @C0363p0

    /* renamed from: X */
    public C21466a<Typeface, Typeface> f55861X;

    /* renamed from: com.airbnb.lottie.model.layer.g$a */
    public class C21588a extends Paint {
        public C21588a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.g$b */
    public class C21589b extends Paint {
        public C21589b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.g$c */
    public static /* synthetic */ class C21590c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55864a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.model.DocumentData$Justification[] r0 = com.airbnb.lottie.model.DocumentData.Justification.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55864a = r0
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f55864a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f55864a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C21587g.C21590c.<clinit>():void");
        }
    }

    public C21587g(C21516j jVar, Layer layer) {
        super(jVar, layer);
        C21544b bVar;
        C21544b bVar2;
        C21543a aVar;
        C21543a aVar2;
        this.f55849L = jVar;
        this.f55850M = layer.mo64447a();
        C21485n d = layer.mo64463q().mo64300a();
        this.f55848K = d;
        d.mo64057a(this);
        mo64481i(d);
        C21553k r = layer.mo64464r();
        if (!(r == null || (aVar2 = r.f55597a) == null)) {
            C21466a<Integer, Integer> a = aVar2.mo64300a();
            this.f55851N = a;
            a.mo64057a(this);
            mo64481i(this.f55851N);
        }
        if (!(r == null || (aVar = r.f55598b) == null)) {
            C21466a<Integer, Integer> a2 = aVar.mo64300a();
            this.f55853P = a2;
            a2.mo64057a(this);
            mo64481i(this.f55853P);
        }
        if (!(r == null || (bVar2 = r.f55599c) == null)) {
            C21466a<Float, Float> a3 = bVar2.mo64300a();
            this.f55855R = a3;
            a3.mo64057a(this);
            mo64481i(this.f55855R);
        }
        if (r != null && (bVar = r.f55600d) != null) {
            C21466a<Float, Float> a4 = bVar.mo64300a();
            this.f55857T = a4;
            a4.mo64057a(this);
            mo64481i(this.f55857T);
        }
    }

    /* renamed from: K */
    public final void mo64501K(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = C21590c.f55864a[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: L */
    public final String mo64502L(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!mo64515Y(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f55847J.mo6219f(j)) {
            return this.f55847J.mo6223k(j);
        }
        this.f55841D.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f55841D.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f55841D.toString();
        this.f55847J.mo6229t(j, sb);
        return sb;
    }

    /* renamed from: M */
    public final void mo64503M(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: N */
    public final void mo64504N(C21559c cVar, Matrix matrix, float f, DocumentData documentData, Canvas canvas) {
        List<C21446d> U = mo64511U(cVar);
        for (int i = 0; i < U.size(); i++) {
            Path path = U.get(i).getPath();
            path.computeBounds(this.f55842E, false);
            this.f55843F.set(matrix);
            this.f55843F.preTranslate(0.0f, (-documentData.f55582g) * C21686j.m99804e());
            this.f55843F.preScale(f, f);
            path.transform(this.f55843F);
            if (documentData.f55586k) {
                mo64507Q(path, this.f55844G, canvas);
                mo64507Q(path, this.f55845H, canvas);
            } else {
                mo64507Q(path, this.f55845H, canvas);
                mo64507Q(path, this.f55844G, canvas);
            }
        }
    }

    /* renamed from: O */
    public final void mo64505O(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f55586k) {
            mo64503M(str, this.f55844G, canvas);
            mo64503M(str, this.f55845H, canvas);
            return;
        }
        mo64503M(str, this.f55845H, canvas);
        mo64503M(str, this.f55844G, canvas);
    }

    /* renamed from: P */
    public final void mo64506P(String str, DocumentData documentData, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String L = mo64502L(str, i);
            i += L.length();
            mo64505O(L, documentData, canvas);
            canvas.translate(this.f55844G.measureText(L) + f, 0.0f);
        }
    }

    /* renamed from: Q */
    public final void mo64507Q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: R */
    public final void mo64508R(String str, DocumentData documentData, Matrix matrix, C21558b bVar, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            C21559c k = this.f55850M.mo64120c().mo6363k(C21559c.m99299e(str.charAt(i), bVar.mo64317b(), bVar.mo64319d()));
            if (k != null) {
                mo64504N(k, matrix, f2, documentData, canvas);
                float d = ((float) k.mo64325d()) * f2 * C21686j.m99804e() * f;
                float f3 = ((float) documentData.f55580e) / 10.0f;
                C21466a<Float, Float> aVar = this.f55858U;
                if (aVar != null) {
                    floatValue = aVar.mo64064h().floatValue();
                } else {
                    C21466a<Float, Float> aVar2 = this.f55857T;
                    if (aVar2 != null) {
                        floatValue = aVar2.mo64064h().floatValue();
                    }
                    canvas.translate(d + (f3 * f), 0.0f);
                }
                f3 += floatValue;
                canvas.translate(d + (f3 * f), 0.0f);
            }
        }
    }

    /* renamed from: S */
    public final void mo64509S(DocumentData documentData, Matrix matrix, C21558b bVar, Canvas canvas) {
        float f;
        DocumentData documentData2 = documentData;
        Canvas canvas2 = canvas;
        C21466a<Float, Float> aVar = this.f55860W;
        if (aVar != null) {
            f = aVar.mo64064h().floatValue();
        } else {
            C21466a<Float, Float> aVar2 = this.f55859V;
            if (aVar2 != null) {
                f = aVar2.mo64064h().floatValue();
            } else {
                f = documentData2.f55578c;
            }
        }
        float f2 = f / 100.0f;
        float g = C21686j.m99806g(matrix);
        String str = documentData2.f55576a;
        float e = documentData2.f55581f * C21686j.m99804e();
        List<String> W = mo64513W(str);
        int size = W.size();
        for (int i = 0; i < size; i++) {
            String str2 = W.get(i);
            float V = mo64512V(str2, bVar, f2, g);
            canvas.save();
            mo64501K(documentData2.f55579d, canvas2, V);
            canvas2.translate(0.0f, (((float) i) * e) - ((((float) (size - 1)) * e) / 2.0f));
            mo64508R(str2, documentData, matrix, bVar, canvas, g, f2);
            canvas.restore();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a A[LOOP:0: B:21:0x0098->B:22:0x009a, LOOP_END] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64510T(com.airbnb.lottie.model.DocumentData r7, com.airbnb.lottie.model.C21558b r8, android.graphics.Matrix r9, android.graphics.Canvas r10) {
        /*
            r6 = this;
            android.graphics.Typeface r8 = r6.mo64514X(r8)
            if (r8 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r9 = r7.f55576a
            com.airbnb.lottie.j r0 = r6.f55849L
            com.airbnb.lottie.v r0 = r0.mo64195O()
            if (r0 == 0) goto L_0x0015
            java.lang.String r9 = r0.mo64715b(r9)
        L_0x0015:
            android.graphics.Paint r0 = r6.f55844G
            r0.setTypeface(r8)
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r8 = r6.f55860W
            if (r8 == 0) goto L_0x0029
            java.lang.Object r8 = r8.mo64064h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x003a
        L_0x0029:
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r8 = r6.f55859V
            if (r8 == 0) goto L_0x0038
            java.lang.Object r8 = r8.mo64064h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x003a
        L_0x0038:
            float r8 = r7.f55578c
        L_0x003a:
            android.graphics.Paint r0 = r6.f55844G
            float r1 = com.airbnb.lottie.utils.C21686j.m99804e()
            float r1 = r1 * r8
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.f55845H
            android.graphics.Paint r1 = r6.f55844G
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r6.f55845H
            android.graphics.Paint r1 = r6.f55844G
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            float r0 = r7.f55581f
            float r1 = com.airbnb.lottie.utils.C21686j.m99804e()
            float r0 = r0 * r1
            int r1 = r7.f55580e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r2 = r6.f55858U
            if (r2 == 0) goto L_0x0077
            java.lang.Object r2 = r2.mo64064h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L_0x0075:
            float r1 = r1 + r2
            goto L_0x0086
        L_0x0077:
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r2 = r6.f55857T
            if (r2 == 0) goto L_0x0086
            java.lang.Object r2 = r2.mo64064h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L_0x0075
        L_0x0086:
            float r2 = com.airbnb.lottie.utils.C21686j.m99804e()
            float r1 = r1 * r2
            float r1 = r1 * r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r8
            java.util.List r8 = r6.mo64513W(r9)
            int r9 = r8.size()
            r2 = 0
        L_0x0098:
            if (r2 >= r9) goto L_0x00ce
            java.lang.Object r3 = r8.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            android.graphics.Paint r4 = r6.f55845H
            float r4 = r4.measureText(r3)
            int r5 = r3.length()
            int r5 = r5 + -1
            float r5 = (float) r5
            float r5 = r5 * r1
            float r4 = r4 + r5
            r10.save()
            com.airbnb.lottie.model.DocumentData$Justification r5 = r7.f55579d
            r6.mo64501K(r5, r10, r4)
            int r4 = r9 + -1
            float r4 = (float) r4
            float r4 = r4 * r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r5 = (float) r2
            float r5 = r5 * r0
            float r5 = r5 - r4
            r4 = 0
            r10.translate(r4, r5)
            r6.mo64506P(r3, r7, r10, r1)
            r10.restore()
            int r2 = r2 + 1
            goto L_0x0098
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C21587g.mo64510T(com.airbnb.lottie.model.DocumentData, com.airbnb.lottie.model.b, android.graphics.Matrix, android.graphics.Canvas):void");
    }

    /* renamed from: U */
    public final List<C21446d> mo64511U(C21559c cVar) {
        if (this.f55846I.containsKey(cVar)) {
            return this.f55846I.get(cVar);
        }
        List<C21570j> a = cVar.mo64322a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C21446d(this.f55849L, this, a.get(i)));
        }
        this.f55846I.put(cVar, arrayList);
        return arrayList;
    }

    /* renamed from: V */
    public final float mo64512V(String str, C21558b bVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C21559c k = this.f55850M.mo64120c().mo6363k(C21559c.m99299e(str.charAt(i), bVar.mo64317b(), bVar.mo64319d()));
            if (k != null) {
                f3 = (float) (((double) f3) + (k.mo64325d() * ((double) f) * ((double) C21686j.m99804e()) * ((double) f2)));
            }
        }
        return f3;
    }

    /* renamed from: W */
    public final List<String> mo64513W(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @C0363p0
    /* renamed from: X */
    public final Typeface mo64514X(C21558b bVar) {
        Typeface h;
        C21466a<Typeface, Typeface> aVar = this.f55861X;
        if (aVar != null && (h = aVar.mo64064h()) != null) {
            return h;
        }
        Typeface P = this.f55849L.mo64196P(bVar.mo64317b(), bVar.mo64319d());
        if (P != null) {
            return P;
        }
        return bVar.mo64320e();
    }

    /* renamed from: Y */
    public final boolean mo64515Y(int i) {
        if (Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public <T> void mo64021c(T t, @C0363p0 C21702j<T> jVar) {
        super.mo64021c(t, jVar);
        if (t == C21601o.f55880a) {
            C21466a<Integer, Integer> aVar = this.f55852O;
            if (aVar != null) {
                mo64473C(aVar);
            }
            if (jVar == null) {
                this.f55852O = null;
                return;
            }
            C21487p pVar = new C21487p(jVar);
            this.f55852O = pVar;
            pVar.mo64057a(this);
            mo64481i(this.f55852O);
        } else if (t == C21601o.f55881b) {
            C21466a<Integer, Integer> aVar2 = this.f55854Q;
            if (aVar2 != null) {
                mo64473C(aVar2);
            }
            if (jVar == null) {
                this.f55854Q = null;
                return;
            }
            C21487p pVar2 = new C21487p(jVar);
            this.f55854Q = pVar2;
            pVar2.mo64057a(this);
            mo64481i(this.f55854Q);
        } else if (t == C21601o.f55896q) {
            C21466a<Float, Float> aVar3 = this.f55856S;
            if (aVar3 != null) {
                mo64473C(aVar3);
            }
            if (jVar == null) {
                this.f55856S = null;
                return;
            }
            C21487p pVar3 = new C21487p(jVar);
            this.f55856S = pVar3;
            pVar3.mo64057a(this);
            mo64481i(this.f55856S);
        } else if (t == C21601o.f55897r) {
            C21466a<Float, Float> aVar4 = this.f55858U;
            if (aVar4 != null) {
                mo64473C(aVar4);
            }
            if (jVar == null) {
                this.f55858U = null;
                return;
            }
            C21487p pVar4 = new C21487p(jVar);
            this.f55858U = pVar4;
            pVar4.mo64057a(this);
            mo64481i(this.f55858U);
        } else if (t == C21601o.f55875D) {
            C21466a<Float, Float> aVar5 = this.f55860W;
            if (aVar5 != null) {
                mo64473C(aVar5);
            }
            if (jVar == null) {
                this.f55860W = null;
                return;
            }
            C21487p pVar5 = new C21487p(jVar);
            this.f55860W = pVar5;
            pVar5.mo64057a(this);
            mo64481i(this.f55860W);
        } else if (t == C21601o.f55878G) {
            C21466a<Typeface, Typeface> aVar6 = this.f55861X;
            if (aVar6 != null) {
                mo64473C(aVar6);
            }
            if (jVar == null) {
                this.f55861X = null;
                return;
            }
            C21487p pVar6 = new C21487p(jVar);
            this.f55861X = pVar6;
            pVar6.mo64057a(this);
            mo64481i(this.f55861X);
        }
    }

    /* renamed from: e */
    public void mo64023e(RectF rectF, Matrix matrix, boolean z) {
        super.mo64023e(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f55850M.mo64119b().width(), (float) this.f55850M.mo64119b().height());
    }

    /* renamed from: t */
    public void mo64492t(Canvas canvas, Matrix matrix, int i) {
        int i2;
        canvas.save();
        if (!this.f55849L.mo64190J0()) {
            canvas.concat(matrix);
        }
        DocumentData documentData = (DocumentData) this.f55848K.mo64064h();
        C21558b bVar = this.f55850M.mo64124g().get(documentData.f55577b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        C21466a<Integer, Integer> aVar = this.f55852O;
        if (aVar != null) {
            this.f55844G.setColor(aVar.mo64064h().intValue());
        } else {
            C21466a<Integer, Integer> aVar2 = this.f55851N;
            if (aVar2 != null) {
                this.f55844G.setColor(aVar2.mo64064h().intValue());
            } else {
                this.f55844G.setColor(documentData.f55583h);
            }
        }
        C21466a<Integer, Integer> aVar3 = this.f55854Q;
        if (aVar3 != null) {
            this.f55845H.setColor(aVar3.mo64064h().intValue());
        } else {
            C21466a<Integer, Integer> aVar4 = this.f55853P;
            if (aVar4 != null) {
                this.f55845H.setColor(aVar4.mo64064h().intValue());
            } else {
                this.f55845H.setColor(documentData.f55584i);
            }
        }
        if (this.f55814v.mo64110h() == null) {
            i2 = 100;
        } else {
            i2 = this.f55814v.mo64110h().mo64064h().intValue();
        }
        int i3 = (i2 * 255) / 100;
        this.f55844G.setAlpha(i3);
        this.f55845H.setAlpha(i3);
        C21466a<Float, Float> aVar5 = this.f55856S;
        if (aVar5 != null) {
            this.f55845H.setStrokeWidth(aVar5.mo64064h().floatValue());
        } else {
            C21466a<Float, Float> aVar6 = this.f55855R;
            if (aVar6 != null) {
                this.f55845H.setStrokeWidth(aVar6.mo64064h().floatValue());
            } else {
                this.f55845H.setStrokeWidth(documentData.f55585j * C21686j.m99804e() * C21686j.m99806g(matrix));
            }
        }
        if (this.f55849L.mo64190J0()) {
            mo64509S(documentData, matrix, bVar, canvas);
        } else {
            mo64510T(documentData, bVar, matrix, canvas);
        }
        canvas.restore();
    }
}
