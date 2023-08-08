package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.widget.C0722h1;
import androidx.core.view.C18196h2;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements C0587o.C0588a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: J0 */
    public static final String f1495J0 = "ListMenuItemView";

    /* renamed from: E0 */
    public boolean f1496E0;

    /* renamed from: F0 */
    public Drawable f1497F0;

    /* renamed from: G0 */
    public boolean f1498G0;

    /* renamed from: H0 */
    public LayoutInflater f1499H0;

    /* renamed from: I0 */
    public boolean f1500I0;

    /* renamed from: a */
    public C0573j f1501a;

    /* renamed from: b */
    public ImageView f1502b;

    /* renamed from: c */
    public RadioButton f1503c;

    /* renamed from: d */
    public TextView f1504d;

    /* renamed from: e */
    public CheckBox f1505e;

    /* renamed from: f */
    public TextView f1506f;

    /* renamed from: g */
    public ImageView f1507g;

    /* renamed from: v */
    public ImageView f1508v;

    /* renamed from: w */
    public LinearLayout f1509w;

    /* renamed from: x */
    public Drawable f1510x;

    /* renamed from: y */
    public int f1511y;

    /* renamed from: z */
    public Context f1512z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f1499H0 == null) {
            this.f1499H0 = LayoutInflater.from(getContext());
        }
        return this.f1499H0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f1507g;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo1862a(View view) {
        mo1864b(view, -1);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1508v;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1508v.getLayoutParams();
            rect.top += this.f1508v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public final void mo1864b(View view, int i) {
        LinearLayout linearLayout = this.f1509w;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    public final void mo1865c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0387a.C0397j.abc_list_menu_item_checkbox, this, false);
        this.f1505e = checkBox;
        mo1862a(checkBox);
    }

    /* renamed from: d */
    public void mo1832d(C0573j jVar, int i) {
        int i2;
        this.f1501a = jVar;
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(jVar.mo2139l(this));
        setCheckable(jVar.isCheckable());
        setShortcut(jVar.mo2114D(), jVar.mo2137j());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    /* renamed from: e */
    public boolean mo1833e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1834f() {
        return this.f1500I0;
    }

    /* renamed from: g */
    public final void mo1866g() {
        ImageView imageView = (ImageView) getInflater().inflate(C0387a.C0397j.abc_list_menu_item_icon, this, false);
        this.f1502b = imageView;
        mo1864b(imageView, 0);
    }

    public C0573j getItemData() {
        return this.f1501a;
    }

    /* renamed from: h */
    public final void mo1867h() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0387a.C0397j.abc_list_menu_item_radio, this, false);
        this.f1503c = radioButton;
        mo1862a(radioButton);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        C18196h2.m82502I1(this, this.f1510x);
        TextView textView = (TextView) findViewById(C0387a.C0394g.title);
        this.f1504d = textView;
        int i = this.f1511y;
        if (i != -1) {
            textView.setTextAppearance(this.f1512z, i);
        }
        this.f1506f = (TextView) findViewById(C0387a.C0394g.shortcut);
        ImageView imageView = (ImageView) findViewById(C0387a.C0394g.submenuarrow);
        this.f1507g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1497F0);
        }
        this.f1508v = (ImageView) findViewById(C0387a.C0394g.group_divider);
        this.f1509w = (LinearLayout) findViewById(C0387a.C0394g.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.f1502b != null && this.f1496E0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1502b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f1503c != null || this.f1505e != null) {
            if (this.f1501a.mo2143p()) {
                if (this.f1503c == null) {
                    mo1867h();
                }
                compoundButton = this.f1503c;
                view = this.f1505e;
            } else {
                if (this.f1505e == null) {
                    mo1865c();
                }
                compoundButton = this.f1505e;
                view = this.f1503c;
            }
            if (z) {
                compoundButton.setChecked(this.f1501a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1505e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1503c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1501a.mo2143p()) {
            if (this.f1503c == null) {
                mo1867h();
            }
            compoundButton = this.f1503c;
        } else {
            if (this.f1505e == null) {
                mo1865c();
            }
            compoundButton = this.f1505e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1500I0 = z;
        this.f1496E0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f1508v;
        if (imageView != null) {
            if (this.f1498G0 || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f1501a.mo2113C() || this.f1500I0) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f1496E0) {
            ImageView imageView = this.f1502b;
            if (imageView != null || drawable != null || this.f1496E0) {
                if (imageView == null) {
                    mo1866g();
                }
                if (drawable != null || this.f1496E0) {
                    ImageView imageView2 = this.f1502b;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f1502b.getVisibility() != 0) {
                        this.f1502b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1502b.setVisibility(8);
            }
        }
    }

    public void setShortcut(boolean z, char c) {
        int i;
        if (!z || !this.f1501a.mo2114D()) {
            i = 8;
        } else {
            i = 0;
        }
        if (i == 0) {
            this.f1506f.setText(this.f1501a.mo2138k());
        }
        if (this.f1506f.getVisibility() != i) {
            this.f1506f.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1504d.setText(charSequence);
            if (this.f1504d.getVisibility() != 0) {
                this.f1504d.setVisibility(0);
            }
        } else if (this.f1504d.getVisibility() != 8) {
            this.f1504d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0722h1 G = C0722h1.m3539G(getContext(), attributeSet, C0387a.C0400m.MenuView, i, 0);
        this.f1510x = G.mo3466h(C0387a.C0400m.MenuView_android_itemBackground);
        this.f1511y = G.mo3479u(C0387a.C0400m.MenuView_android_itemTextAppearance, -1);
        this.f1496E0 = G.mo3459a(C0387a.C0400m.MenuView_preserveIconSpacing, false);
        this.f1512z = context;
        this.f1497F0 = G.mo3466h(C0387a.C0400m.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0387a.C0389b.dropDownListViewStyle, 0);
        this.f1498G0 = obtainStyledAttributes.hasValue(0);
        G.mo3458I();
        obtainStyledAttributes.recycle();
    }
}
