package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0757o1;
import androidx.appcompat.widget.C0760p0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements C0587o.C0588a, View.OnClickListener, ActionMenuView.C0611a {

    /* renamed from: K0 */
    public static final String f1478K0 = "ActionMenuItemView";

    /* renamed from: L0 */
    public static final int f1479L0 = 32;

    /* renamed from: E0 */
    public C0554b f1480E0;

    /* renamed from: F0 */
    public boolean f1481F0;

    /* renamed from: G0 */
    public boolean f1482G0;

    /* renamed from: H0 */
    public int f1483H0;

    /* renamed from: I0 */
    public int f1484I0;

    /* renamed from: J0 */
    public int f1485J0;

    /* renamed from: v */
    public C0573j f1486v;

    /* renamed from: w */
    public CharSequence f1487w;

    /* renamed from: x */
    public Drawable f1488x;

    /* renamed from: y */
    public C0568g.C0570b f1489y;

    /* renamed from: z */
    public C0760p0 f1490z;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0553a extends C0760p0 {
        public C0553a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0590q mo1854b() {
            C0554b bVar = ActionMenuItemView.this.f1480E0;
            if (bVar != null) {
                return bVar.mo1856a();
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo1855c() {
            C0590q b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0568g.C0570b bVar = actionMenuItemView.f1489y;
            if (bVar == null || !bVar.mo1857b(actionMenuItemView.f1486v) || (b = mo1854b()) == null || !b.mo1967c()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0554b {
        /* renamed from: a */
        public abstract C0590q mo1856a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo1830a() {
        return mo1851t();
    }

    /* renamed from: c */
    public boolean mo1831c() {
        return mo1851t() && this.f1486v.getIcon() == null;
    }

    /* renamed from: d */
    public void mo1832d(C0573j jVar, int i) {
        int i2;
        this.f1486v = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo2139l(this));
        setId(jVar.getItemId());
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1490z == null) {
            this.f1490z = new C0553a();
        }
    }

    /* renamed from: e */
    public boolean mo1833e() {
        return true;
    }

    /* renamed from: f */
    public boolean mo1834f() {
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0573j getItemData() {
        return this.f1486v;
    }

    public void onClick(View view) {
        C0568g.C0570b bVar = this.f1489y;
        if (bVar != null) {
            bVar.mo1857b(this.f1486v);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1481F0 = mo1852u();
        mo1853v();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean t = mo1851t();
        if (t && (i4 = this.f1484I0) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f1483H0);
        } else {
            i3 = this.f1483H0;
        }
        if (mode != 1073741824 && this.f1483H0 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!t && this.f1488x != null) {
            super.setPadding((getMeasuredWidth() - this.f1488x.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0760p0 p0Var;
        if (!this.f1486v.hasSubMenu() || (p0Var = this.f1490z) == null || !p0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1482G0 != z) {
            this.f1482G0 = z;
            C0573j jVar = this.f1486v;
            if (jVar != null) {
                jVar.mo2116e();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1488x = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1485J0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        mo1853v();
    }

    public void setItemInvoker(C0568g.C0570b bVar) {
        this.f1489y = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1484I0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0554b bVar) {
        this.f1480E0 = bVar;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f1487w = charSequence;
        mo1853v();
    }

    /* renamed from: t */
    public boolean mo1851t() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: u */
    public final boolean mo1852u() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void mo1853v() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1487w);
        if (this.f1488x != null && (!this.f1486v.mo2115E() || (!this.f1481F0 && !this.f1482G0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.f1487w;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f1486v.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f1486v.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1486v.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence3 = this.f1486v.getTitle();
            }
            C0757o1.m3709a(this, charSequence3);
            return;
        }
        C0757o1.m3709a(this, tooltipText);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1481F0 = mo1852u();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0387a.C0400m.ActionMenuItemView, i, 0);
        this.f1483H0 = obtainStyledAttributes.getDimensionPixelSize(C0387a.C0400m.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1485J0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1484I0 = -1;
        setSaveEnabled(false);
    }
}
