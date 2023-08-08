package com.urbanairship.iam.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17586h0;
import androidx.core.view.C18196h2;
import com.urbanairship.C36058l;
import com.urbanairship.iam.C9127a0;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.assets.Assets;
import com.urbanairship.util.C9669o0;
import java.lang.ref.WeakReference;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.iam.view.e */
public class C9254e {

    /* renamed from: a */
    public static final float f25221a = 0.2f;

    /* renamed from: b */
    public static final int f25222b = 2;

    /* renamed from: c */
    public static final float f25223c = 0.0f;

    /* renamed from: com.urbanairship.iam.view.e$a */
    public class C9255a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f25224a;

        /* renamed from: b */
        public final /* synthetic */ C9127a0 f25225b;

        /* renamed from: c */
        public final /* synthetic */ Assets f25226c;

        public C9255a(WeakReference weakReference, C9127a0 a0Var, Assets assets) {
            this.f25224a = weakReference;
            this.f25225b = a0Var;
            this.f25226c = assets;
        }

        public boolean onPreDraw() {
            MediaView mediaView = (MediaView) this.f25224a.get();
            if (mediaView == null) {
                return false;
            }
            C9254e.m34753g(mediaView, this.f25225b, this.f25226c);
            mediaView.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    /* renamed from: com.urbanairship.iam.view.e$b */
    public static class C9256b extends ImageSpan {
        public C9256b(Drawable drawable) {
            super(drawable);
        }

        public void draw(@C0359n0 Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @C0359n0 Paint paint) {
            canvas.save();
            Drawable drawable = getDrawable();
            canvas.translate(f, (float) ((i5 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent / 2)));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: com.urbanairship.iam.view.e$c */
    public static class C9257c extends CharacterStyle {
        public C9257c() {
        }

        public void updateDrawState(@C0359n0 TextPaint textPaint) {
            textPaint.setUnderlineText(false);
        }

        public /* synthetic */ C9257c(C9255a aVar) {
            this();
        }
    }

    /* renamed from: a */
    public static void m34747a(@C0359n0 Button button, @C0359n0 C9139b bVar, int i) {
        int i2;
        int i3;
        int i4;
        float f;
        m34748b(button, bVar.mo18264p());
        if (bVar.mo18264p().mo18385j() == null) {
            i2 = button.getCurrentTextColor();
        } else {
            i2 = bVar.mo18264p().mo18385j().intValue();
        }
        if (bVar.mo18259k() == null) {
            i3 = 0;
        } else {
            i3 = bVar.mo18259k().intValue();
        }
        int B = C17586h0.m80563B(i2, Math.round(((float) Color.alpha(i2)) * 0.2f));
        if (bVar.mo18261m() == null) {
            i4 = i3;
        } else {
            i4 = bVar.mo18261m().intValue();
        }
        if (bVar.mo18262n() == null) {
            f = 0.0f;
        } else {
            f = bVar.mo18262n().floatValue();
        }
        C18196h2.m82502I1(button, C9247a.m34735b(button.getContext()).mo18600c(i3).mo18601d(f, i).mo18602e(B).mo18603f(i4).mo18604g(2).mo18599a());
    }

    /* renamed from: b */
    public static void m34748b(@C0359n0 TextView textView, @C0359n0 C9168d0 d0Var) {
        m34750d(textView, d0Var, 17);
    }

    /* renamed from: c */
    public static void m34749c(@C0359n0 TextView textView, @C0359n0 C9168d0 d0Var) {
        m34750d(textView, d0Var, 1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0166, code lost:
        if (r5.equals(com.urbanairship.iam.C9168d0.f24881F0) == false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0134 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34750d(@androidx.annotation.C0359n0 android.widget.TextView r9, @androidx.annotation.C0359n0 com.urbanairship.iam.C9168d0 r10, int r11) {
        /*
            java.lang.Float r0 = r10.mo18388m()
            if (r0 == 0) goto L_0x0011
            java.lang.Float r0 = r10.mo18388m()
            float r0 = r0.floatValue()
            r9.setTextSize(r0)
        L_0x0011:
            java.lang.Integer r0 = r10.mo18385j()
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r10.mo18385j()
            int r0 = r0.intValue()
            r9.setTextColor(r0)
        L_0x0022:
            android.content.Context r0 = r9.getContext()
            int r0 = r10.mo18386k(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0052
            android.content.Context r3 = r9.getContext()     // Catch:{ NotFoundException -> 0x0037 }
            android.graphics.drawable.Drawable r0 = androidx.core.content.C17318d.m79726i(r3, r0)     // Catch:{ NotFoundException -> 0x0037 }
            goto L_0x0053
        L_0x0037:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Drawable "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " no longer exists."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.urbanairship.C36059m.m148406b(r0, r3)
        L_0x0052:
            r0 = r1
        L_0x0053:
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00c9
            float r5 = r9.getTextSize()
            int r5 = java.lang.Math.round(r5)
            int r6 = r9.getCurrentTextColor()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.C17549d.m80456r(r0)     // Catch:{ NotFoundException -> 0x00b9 }
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch:{ NotFoundException -> 0x00b9 }
            r0.setBounds(r2, r2, r5, r5)     // Catch:{ NotFoundException -> 0x00b9 }
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter     // Catch:{ NotFoundException -> 0x00b9 }
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ NotFoundException -> 0x00b9 }
            r5.<init>(r6, r7)     // Catch:{ NotFoundException -> 0x00b9 }
            r0.setColorFilter(r5)     // Catch:{ NotFoundException -> 0x00b9 }
            com.urbanairship.iam.view.e$b r5 = new com.urbanairship.iam.view.e$b     // Catch:{ NotFoundException -> 0x00b9 }
            r5.<init>(r0)     // Catch:{ NotFoundException -> 0x00b9 }
            java.lang.String r0 = r10.mo18390o()     // Catch:{ NotFoundException -> 0x00b9 }
            r6 = 33
            if (r0 != 0) goto L_0x0090
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ NotFoundException -> 0x00b9 }
            java.lang.String r1 = " "
            r0.<init>(r1)     // Catch:{ NotFoundException -> 0x00b9 }
            r0.setSpan(r5, r2, r4, r6)     // Catch:{ NotFoundException -> 0x00b9 }
            goto L_0x00b5
        L_0x0090:
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ NotFoundException -> 0x00b9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x00b9 }
            r7.<init>()     // Catch:{ NotFoundException -> 0x00b9 }
            java.lang.String r8 = "  "
            r7.append(r8)     // Catch:{ NotFoundException -> 0x00b9 }
            java.lang.String r8 = r10.mo18390o()     // Catch:{ NotFoundException -> 0x00b9 }
            r7.append(r8)     // Catch:{ NotFoundException -> 0x00b9 }
            java.lang.String r7 = r7.toString()     // Catch:{ NotFoundException -> 0x00b9 }
            r0.<init>(r7)     // Catch:{ NotFoundException -> 0x00b9 }
            r0.setSpan(r5, r2, r4, r6)     // Catch:{ NotFoundException -> 0x00b9 }
            com.urbanairship.iam.view.e$c r5 = new com.urbanairship.iam.view.e$c     // Catch:{ NotFoundException -> 0x00b9 }
            r5.<init>(r1)     // Catch:{ NotFoundException -> 0x00b9 }
            r0.setSpan(r5, r4, r3, r6)     // Catch:{ NotFoundException -> 0x00b9 }
        L_0x00b5:
            r9.setText(r0)     // Catch:{ NotFoundException -> 0x00b9 }
            goto L_0x00d0
        L_0x00b9:
            r0 = move-exception
            java.lang.String r1 = "Unable to find button drawable."
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.urbanairship.C36059m.m148411g(r0, r1, r5)
            java.lang.String r0 = r10.mo18390o()
            r9.setText(r0)
            goto L_0x00d0
        L_0x00c9:
            java.lang.String r0 = r10.mo18390o()
            r9.setText(r0)
        L_0x00d0:
            android.graphics.Typeface r0 = r9.getTypeface()
            if (r0 != 0) goto L_0x00d8
            r0 = r2
            goto L_0x00e0
        L_0x00d8:
            android.graphics.Typeface r0 = r9.getTypeface()
            int r0 = r0.getStyle()
        L_0x00e0:
            int r1 = r9.getPaintFlags()
            r1 = r1 | r4
            r1 = r1 | 128(0x80, float:1.794E-43)
            java.util.List r5 = r10.mo18389n()
            java.util.Iterator r5 = r5.iterator()
        L_0x00ef:
            boolean r6 = r5.hasNext()
            r7 = -1
            if (r6 == 0) goto L_0x0134
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.hashCode()
            int r8 = r6.hashCode()
            switch(r8) {
                case -1178781136: goto L_0x011d;
                case -1026963764: goto L_0x0112;
                case 3029637: goto L_0x0107;
                default: goto L_0x0106;
            }
        L_0x0106:
            goto L_0x0127
        L_0x0107:
            java.lang.String r8 = "bold"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0110
            goto L_0x0127
        L_0x0110:
            r7 = r3
            goto L_0x0127
        L_0x0112:
            java.lang.String r8 = "underline"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x011b
            goto L_0x0127
        L_0x011b:
            r7 = r4
            goto L_0x0127
        L_0x011d:
            java.lang.String r8 = "italic"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r7 = r2
        L_0x0127:
            switch(r7) {
                case 0: goto L_0x0131;
                case 1: goto L_0x012e;
                case 2: goto L_0x012b;
                default: goto L_0x012a;
            }
        L_0x012a:
            goto L_0x00ef
        L_0x012b:
            r0 = r0 | 1
            goto L_0x00ef
        L_0x012e:
            r1 = r1 | 8
            goto L_0x00ef
        L_0x0131:
            r0 = r0 | 2
            goto L_0x00ef
        L_0x0134:
            java.lang.String r5 = r10.mo18384i()
            if (r5 == 0) goto L_0x017e
            java.lang.String r5 = r10.mo18384i()
            r5.hashCode()
            int r6 = r5.hashCode()
            switch(r6) {
                case -1364013995: goto L_0x0160;
                case 3317767: goto L_0x0155;
                case 108511772: goto L_0x014a;
                default: goto L_0x0148;
            }
        L_0x0148:
            r2 = r7
            goto L_0x0169
        L_0x014a:
            java.lang.String r2 = "right"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0153
            goto L_0x0148
        L_0x0153:
            r2 = r3
            goto L_0x0169
        L_0x0155:
            java.lang.String r2 = "left"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x015e
            goto L_0x0148
        L_0x015e:
            r2 = r4
            goto L_0x0169
        L_0x0160:
            java.lang.String r3 = "center"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0169
            goto L_0x0148
        L_0x0169:
            switch(r2) {
                case 0: goto L_0x017b;
                case 1: goto L_0x0174;
                case 2: goto L_0x016d;
                default: goto L_0x016c;
            }
        L_0x016c:
            goto L_0x017e
        L_0x016d:
            r11 = 8388613(0x800005, float:1.175495E-38)
            r9.setGravity(r11)
            goto L_0x017e
        L_0x0174:
            r11 = 8388611(0x800003, float:1.1754948E-38)
            r9.setGravity(r11)
            goto L_0x017e
        L_0x017b:
            r9.setGravity(r11)
        L_0x017e:
            android.content.Context r11 = r9.getContext()
            java.util.List r10 = r10.mo18387l()
            android.graphics.Typeface r10 = m34752f(r11, r10)
            if (r10 != 0) goto L_0x0190
            android.graphics.Typeface r10 = r9.getTypeface()
        L_0x0190:
            r9.setTypeface(r10, r0)
            r9.setPaintFlags(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.view.C9254e.m34750d(android.widget.TextView, com.urbanairship.iam.d0, int):void");
    }

    @C0376v0(api = 21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public static float m34751e(@C0359n0 ViewGroup viewGroup) {
        float f = 0.0f;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            f = Math.max(viewGroup.getChildAt(0).getZ(), f);
        }
        return f;
    }

    @C0363p0
    /* renamed from: f */
    public static Typeface m34752f(@C0359n0 Context context, @C0359n0 List<String> list) {
        Typeface b;
        for (String next : list) {
            if (!C9669o0.m36224e(next) && (b = C36058l.m148401d(context).mo107814b(next)) != null) {
                return b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34753g(@androidx.annotation.C0359n0 com.urbanairship.iam.view.MediaView r5, @androidx.annotation.C0359n0 com.urbanairship.iam.C9127a0 r6, @androidx.annotation.C0363p0 com.urbanairship.iam.assets.Assets r7) {
        /*
            int r0 = r5.getWidth()
            if (r0 != 0) goto L_0x0018
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            com.urbanairship.iam.view.e$a r1 = new com.urbanairship.iam.view.e$a
            r1.<init>(r0, r6, r7)
            r5.addOnPreDrawListener(r1)
            return
        L_0x0018:
            r0 = 16
            r1 = 9
            if (r7 == 0) goto L_0x0055
            java.lang.String r2 = r6.mo18215g()
            java.io.File r2 = r7.mo18229e(r2)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = r6.mo18215g()
            com.urbanairship.json.JsonValue r7 = r7.mo18230f(r3)
            com.urbanairship.json.b r7 = r7.mo18749A()
            java.lang.String r3 = "width"
            com.urbanairship.json.JsonValue r3 = r7.mo18801A(r3)
            int r0 = r3.mo18762f(r0)
            java.lang.String r3 = "height"
            com.urbanairship.json.JsonValue r7 = r7.mo18801A(r3)
            int r1 = r7.mo18762f(r1)
            android.net.Uri r7 = android.net.Uri.fromFile(r2)
            java.lang.String r7 = r7.toString()
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            int r3 = r2.height
            r4 = -2
            if (r3 != r4) goto L_0x006f
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = (float) r1
            float r3 = r3 * r0
            int r0 = java.lang.Math.round(r3)
            r2.height = r0
            goto L_0x009a
        L_0x006f:
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r5.getWidth()
            float r1 = (float) r1
            int r3 = r5.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x008e
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r0
            int r0 = java.lang.Math.round(r1)
            r2.height = r0
            goto L_0x009a
        L_0x008e:
            int r1 = r5.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            r2.width = r0
        L_0x009a:
            r5.setLayoutParams(r2)
            r5.setMediaInfo(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.view.C9254e.m34753g(com.urbanairship.iam.view.MediaView, com.urbanairship.iam.a0, com.urbanairship.iam.assets.Assets):void");
    }
}
