package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import com.usabilla.sdk.ubform.sdk.banner.BannerFragment;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.s1 */
public class C0783s1 {

    /* renamed from: h */
    public static final String f2556h = "TooltipPopup";

    /* renamed from: a */
    public final Context f2557a;

    /* renamed from: b */
    public final View f2558b;

    /* renamed from: c */
    public final TextView f2559c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f2560d;

    /* renamed from: e */
    public final Rect f2561e = new Rect();

    /* renamed from: f */
    public final int[] f2562f = new int[2];

    /* renamed from: g */
    public final int[] f2563g = new int[2];

    public C0783s1(@C0359n0 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2560d = layoutParams;
        this.f2557a = context;
        View inflate = LayoutInflater.from(context).inflate(C0387a.C0397j.abc_tooltip, (ViewGroup) null);
        this.f2558b = inflate;
        this.f2559c = (TextView) inflate.findViewById(C0387a.C0394g.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0387a.C0399l.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m3804b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void mo3644a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        int i5;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2557a.getResources().getDimensionPixelOffset(C0387a.C0392e.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2557a.getResources().getDimensionPixelOffset(C0387a.C0392e.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f2557a.getResources();
        if (z) {
            i5 = C0387a.C0392e.tooltip_y_offset_touch;
        } else {
            i5 = C0387a.C0392e.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View b = m3804b(view);
        if (b != null) {
            b.getWindowVisibleDisplayFrame(this.f2561e);
            Rect rect = this.f2561e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = this.f2557a.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", BannerFragment.f27308Y, "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                this.f2561e.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            b.getLocationOnScreen(this.f2563g);
            view.getLocationOnScreen(this.f2562f);
            int[] iArr = this.f2562f;
            int i7 = iArr[0];
            int[] iArr2 = this.f2563g;
            int i8 = i7 - iArr2[0];
            iArr[0] = i8;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i8 + i) - (b.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f2558b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f2558b.getMeasuredHeight();
            int i9 = this.f2562f[1];
            int i10 = ((i3 + i9) - dimensionPixelOffset3) - measuredHeight;
            int i11 = i9 + i4 + dimensionPixelOffset3;
            if (z) {
                if (i10 >= 0) {
                    layoutParams.y = i10;
                } else {
                    layoutParams.y = i11;
                }
            } else if (measuredHeight + i11 <= this.f2561e.height()) {
                layoutParams.y = i11;
            } else {
                layoutParams.y = i10;
            }
        }
    }

    /* renamed from: c */
    public void mo3645c() {
        if (mo3646d()) {
            ((WindowManager) this.f2557a.getSystemService("window")).removeView(this.f2558b);
        }
    }

    /* renamed from: d */
    public boolean mo3646d() {
        return this.f2558b.getParent() != null;
    }

    /* renamed from: e */
    public void mo3647e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo3646d()) {
            mo3645c();
        }
        this.f2559c.setText(charSequence);
        mo3644a(view, i, i2, z, this.f2560d);
        ((WindowManager) this.f2557a.getSystemService("window")).addView(this.f2558b, this.f2560d);
    }
}
