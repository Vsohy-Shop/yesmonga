package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0716g;
import androidx.appcompat.widget.C0725i0;
import androidx.core.content.C17318d;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.text.C17897a;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18353r0;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.widget.C18496q;
import androidx.customview.view.AbsSavedState;
import androidx.transition.C20629k0;
import androidx.transition.C20633l;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31388b;
import com.google.android.material.internal.C31392d;
import com.google.android.material.internal.C31432x;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.C31500c;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {

    /* renamed from: X1 */
    public static final int f76847X1 = C31076a.C31090n.Widget_Design_TextInputLayout;

    /* renamed from: Y1 */
    public static final int f76848Y1 = 167;

    /* renamed from: Z1 */
    public static final long f76849Z1 = 87;

    /* renamed from: a2 */
    public static final long f76850a2 = 67;

    /* renamed from: b2 */
    public static final int f76851b2 = -1;

    /* renamed from: c2 */
    public static final int f76852c2 = -1;

    /* renamed from: d2 */
    public static final String f76853d2 = "TextInputLayout";

    /* renamed from: e2 */
    public static final int f76854e2 = 0;

    /* renamed from: f2 */
    public static final int f76855f2 = 1;

    /* renamed from: g2 */
    public static final int f76856g2 = 2;

    /* renamed from: h2 */
    public static final int f76857h2 = -1;

    /* renamed from: i2 */
    public static final int f76858i2 = 0;

    /* renamed from: j2 */
    public static final int f76859j2 = 1;

    /* renamed from: k2 */
    public static final int f76860k2 = 2;

    /* renamed from: l2 */
    public static final int f76861l2 = 3;

    /* renamed from: A1 */
    public View.OnLongClickListener f76862A1;

    /* renamed from: B1 */
    public View.OnLongClickListener f76863B1;
    @C0359n0

    /* renamed from: C1 */
    public final CheckableImageButton f76864C1;

    /* renamed from: D1 */
    public ColorStateList f76865D1;

    /* renamed from: E0 */
    public int f76866E0;

    /* renamed from: E1 */
    public PorterDuff.Mode f76867E1;

    /* renamed from: F0 */
    public boolean f76868F0;

    /* renamed from: F1 */
    public ColorStateList f76869F1;
    @C0363p0

    /* renamed from: G0 */
    public TextView f76870G0;

    /* renamed from: G1 */
    public ColorStateList f76871G1;

    /* renamed from: H0 */
    public int f76872H0;
    @C0354l

    /* renamed from: H1 */
    public int f76873H1;

    /* renamed from: I0 */
    public int f76874I0;
    @C0354l

    /* renamed from: I1 */
    public int f76875I1;

    /* renamed from: J0 */
    public CharSequence f76876J0;
    @C0354l

    /* renamed from: J1 */
    public int f76877J1;

    /* renamed from: K0 */
    public boolean f76878K0;

    /* renamed from: K1 */
    public ColorStateList f76879K1;

    /* renamed from: L0 */
    public TextView f76880L0;
    @C0354l

    /* renamed from: L1 */
    public int f76881L1;
    @C0363p0

    /* renamed from: M0 */
    public ColorStateList f76882M0;
    @C0354l

    /* renamed from: M1 */
    public int f76883M1;

    /* renamed from: N0 */
    public int f76884N0;
    @C0354l

    /* renamed from: N1 */
    public int f76885N1;
    @C0363p0

    /* renamed from: O0 */
    public C20633l f76886O0;
    @C0354l

    /* renamed from: O1 */
    public int f76887O1;
    @C0363p0

    /* renamed from: P0 */
    public C20633l f76888P0;
    @C0354l

    /* renamed from: P1 */
    public int f76889P1;
    @C0363p0

    /* renamed from: Q0 */
    public ColorStateList f76890Q0;

    /* renamed from: Q1 */
    public boolean f76891Q1;
    @C0363p0

    /* renamed from: R0 */
    public ColorStateList f76892R0;

    /* renamed from: R1 */
    public final C31388b f76893R1;
    @C0363p0

    /* renamed from: S0 */
    public CharSequence f76894S0;

    /* renamed from: S1 */
    public boolean f76895S1;
    @C0359n0

    /* renamed from: T0 */
    public final TextView f76896T0;

    /* renamed from: T1 */
    public boolean f76897T1;

    /* renamed from: U0 */
    public boolean f76898U0;

    /* renamed from: U1 */
    public ValueAnimator f76899U1;

    /* renamed from: V0 */
    public CharSequence f76900V0;

    /* renamed from: V1 */
    public boolean f76901V1;

    /* renamed from: W0 */
    public boolean f76902W0;

    /* renamed from: W1 */
    public boolean f76903W1;
    @C0363p0

    /* renamed from: X0 */
    public C31525j f76904X0;
    @C0363p0

    /* renamed from: Y0 */
    public C31525j f76905Y0;
    @C0363p0

    /* renamed from: Z0 */
    public C31525j f76906Z0;
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f76907a;
    @C0359n0

    /* renamed from: a1 */
    public C31534o f76908a1;
    @C0359n0

    /* renamed from: b */
    public final C31680j f76909b;

    /* renamed from: b1 */
    public boolean f76910b1;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f76911c;

    /* renamed from: c1 */
    public final int f76912c1;
    @C0359n0

    /* renamed from: d */
    public final FrameLayout f76913d;

    /* renamed from: d1 */
    public int f76914d1;

    /* renamed from: e */
    public EditText f76915e;

    /* renamed from: e1 */
    public int f76916e1;

    /* renamed from: f */
    public CharSequence f76917f;

    /* renamed from: f1 */
    public int f76918f1;

    /* renamed from: g */
    public int f76919g;

    /* renamed from: g1 */
    public int f76920g1;

    /* renamed from: h1 */
    public int f76921h1;
    @C0354l

    /* renamed from: i1 */
    public int f76922i1;
    @C0354l

    /* renamed from: j1 */
    public int f76923j1;

    /* renamed from: k1 */
    public final Rect f76924k1;

    /* renamed from: l1 */
    public final Rect f76925l1;

    /* renamed from: m1 */
    public final RectF f76926m1;

    /* renamed from: n1 */
    public Typeface f76927n1;
    @C0363p0

    /* renamed from: o1 */
    public Drawable f76928o1;

    /* renamed from: p1 */
    public int f76929p1;

    /* renamed from: q1 */
    public final LinkedHashSet<C31638h> f76930q1;

    /* renamed from: r1 */
    public int f76931r1;

    /* renamed from: s1 */
    public final SparseArray<C31668e> f76932s1;
    @C0359n0

    /* renamed from: t1 */
    public final CheckableImageButton f76933t1;

    /* renamed from: u1 */
    public final LinkedHashSet<C31639i> f76934u1;

    /* renamed from: v */
    public int f76935v;

    /* renamed from: v1 */
    public ColorStateList f76936v1;

    /* renamed from: w */
    public int f76937w;

    /* renamed from: w1 */
    public PorterDuff.Mode f76938w1;

    /* renamed from: x */
    public int f76939x;
    @C0363p0

    /* renamed from: x1 */
    public Drawable f76940x1;

    /* renamed from: y */
    public final C31670g f76941y;

    /* renamed from: y1 */
    public int f76942y1;

    /* renamed from: z */
    public boolean f76943z;

    /* renamed from: z1 */
    public Drawable f76944z1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C31630a();
        @C0363p0

        /* renamed from: c */
        public CharSequence f76945c;

        /* renamed from: d */
        public boolean f76946d;
        @C0363p0

        /* renamed from: e */
        public CharSequence f76947e;
        @C0363p0

        /* renamed from: f */
        public CharSequence f76948f;
        @C0363p0

        /* renamed from: g */
        public CharSequence f76949g;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        public class C31630a implements Parcelable.ClassLoaderCreator<SavedState> {
            @C0363p0
            /* renamed from: a */
            public SavedState createFromParcel(@C0359n0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @C0359n0
            /* renamed from: b */
            public SavedState createFromParcel(@C0359n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @C0359n0
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @C0359n0
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f76945c + " hint=" + this.f76947e + " helperText=" + this.f76948f + " placeholderText=" + this.f76949g + "}";
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f76945c, parcel, i);
            parcel.writeInt(this.f76946d ? 1 : 0);
            TextUtils.writeToParcel(this.f76947e, parcel, i);
            TextUtils.writeToParcel(this.f76948f, parcel, i);
            TextUtils.writeToParcel(this.f76949g, parcel, i);
        }

        public SavedState(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f76945c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f76946d = parcel.readInt() != 1 ? false : true;
            this.f76947e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f76948f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f76949g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C31631a implements TextWatcher {
        public C31631a() {
        }

        public void afterTextChanged(@C0359n0 Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo91494L0(!textInputLayout.f76903W1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f76943z) {
                textInputLayout2.mo91475B0(editable.length());
            }
            if (TextInputLayout.this.f76878K0) {
                TextInputLayout.this.mo91502P0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C31632b implements Runnable {
        public C31632b() {
        }

        public void run() {
            TextInputLayout.this.f76933t1.performClick();
            TextInputLayout.this.f76933t1.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C31633c implements Runnable {
        public C31633c() {
        }

        public void run() {
            TextInputLayout.this.f76915e.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C31634d implements ValueAnimator.AnimatorUpdateListener {
        public C31634d() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            TextInputLayout.this.f76893R1.mo90095z0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C31635e extends C18019a {

        /* renamed from: d */
        public final TextInputLayout f76954d;

        public C31635e(@C0359n0 TextInputLayout textInputLayout) {
            this.f76954d = textInputLayout;
        }

        /* renamed from: g */
        public void mo19938g(@C0359n0 View view, @C0359n0 C18065l0 l0Var) {
            Editable editable;
            boolean z;
            String str;
            super.mo19938g(view, l0Var);
            EditText editText = this.f76954d.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f76954d.getHint();
            CharSequence error = this.f76954d.getError();
            CharSequence placeholderText = this.f76954d.getPlaceholderText();
            int counterMaxLength = this.f76954d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f76954d.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(editable);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f76954d.mo91514X();
            boolean z5 = !TextUtils.isEmpty(error);
            if (z5 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f76954d.f76909b.mo91849w(l0Var);
            if (z2) {
                l0Var.mo52560O1(editable);
            } else if (!TextUtils.isEmpty(str)) {
                l0Var.mo52560O1(str);
                if (z4 && placeholderText != null) {
                    l0Var.mo52560O1(str + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                l0Var.mo52560O1(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    l0Var.mo52641o1(str);
                } else {
                    if (z2) {
                        str = editable + ", " + str;
                    }
                    l0Var.mo52560O1(str);
                }
                l0Var.mo52548K1(!z2);
            }
            if (editable == null || editable.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            l0Var.mo52668x1(counterMaxLength);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                l0Var.mo52630k1(error);
            }
            View t = this.f76954d.f76941y.mo91813t();
            if (t != null) {
                l0Var.mo52650r1(t);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public @interface C31636f {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public @interface C31637g {
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public interface C31638h {
        /* renamed from: a */
        void mo91725a(@C0359n0 TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$i */
    public interface C31639i {
        /* renamed from: a */
        void mo91726a(@C0359n0 TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: C0 */
    public static void m128182C0(@C0359n0 Context context, @C0359n0 TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = C31076a.C31089m.character_counter_overflowed_content_description;
        } else {
            i3 = C31076a.C31089m.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i3, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private C31668e getEndIconDelegate() {
        C31668e eVar = this.f76932s1.get(this.f76931r1);
        if (eVar != null) {
            return eVar;
        }
        return this.f76932s1.get(0);
    }

    @C0363p0
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f76864C1.getVisibility() == 0) {
            return this.f76864C1;
        }
        if (!mo91493L() || !mo91501P()) {
            return null;
        }
        return this.f76933t1;
    }

    /* renamed from: h0 */
    public static void m128189h0(@C0359n0 ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m128189h0((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: p0 */
    public static void m128190p0(@C0359n0 CheckableImageButton checkableImageButton, @C0363p0 View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean K0 = C18196h2.m82509K0(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (K0 || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(K0);
        checkableImageButton.setPressable(K0);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        C18196h2.m82531R1(checkableImageButton, i);
    }

    /* renamed from: q0 */
    public static void m128191q0(@C0359n0 CheckableImageButton checkableImageButton, @C0363p0 View.OnClickListener onClickListener, @C0363p0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m128190p0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: r0 */
    public static void m128192r0(@C0359n0 CheckableImageButton checkableImageButton, @C0363p0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m128190p0(checkableImageButton, onLongClickListener);
    }

    private void setEditText(EditText editText) {
        if (this.f76915e == null) {
            if (this.f76931r1 != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.f76915e = editText;
            int i = this.f76919g;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f76937w);
            }
            int i2 = this.f76935v;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f76939x);
            }
            mo91521d0();
            setTextInputAccessibilityDelegate(new C31635e(this));
            this.f76893R1.mo90033M0(this.f76915e.getTypeface());
            this.f76893R1.mo90089w0(this.f76915e.getTextSize());
            this.f76893R1.mo90079r0(this.f76915e.getLetterSpacing());
            int gravity = this.f76915e.getGravity();
            this.f76893R1.mo90065k0((gravity & -113) | 48);
            this.f76893R1.mo90087v0(gravity);
            this.f76915e.addTextChangedListener(new C31631a());
            if (this.f76869F1 == null) {
                this.f76869F1 = this.f76915e.getHintTextColors();
            }
            if (this.f76898U0) {
                if (TextUtils.isEmpty(this.f76900V0)) {
                    CharSequence hint = this.f76915e.getHint();
                    this.f76917f = hint;
                    setHint(hint);
                    this.f76915e.setHint((CharSequence) null);
                }
                this.f76902W0 = true;
            }
            if (this.f76870G0 != null) {
                mo91475B0(this.f76915e.getText().length());
            }
            mo91484G0();
            this.f76941y.mo91799f();
            this.f76909b.bringToFront();
            this.f76911c.bringToFront();
            this.f76913d.bringToFront();
            this.f76864C1.bringToFront();
            mo91479E();
            mo91506R0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            mo91496M0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f76900V0)) {
            this.f76900V0 = charSequence;
            this.f76893R1.mo90029K0(charSequence);
            if (!this.f76891Q1) {
                mo91526e0();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f76878K0 != z) {
            if (z) {
                mo91583i();
            } else {
                mo91594n0();
                this.f76880L0 = null;
            }
            this.f76878K0 = z;
        }
    }

    /* renamed from: A */
    public final void mo91472A(boolean z) {
        ValueAnimator valueAnimator = this.f76899U1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f76899U1.cancel();
        }
        if (!z || !this.f76897T1) {
            this.f76893R1.mo90095z0(1.0f);
        } else {
            mo91587k(1.0f);
        }
        this.f76891Q1 = false;
        if (mo91476C()) {
            mo91526e0();
        }
        mo91500O0();
        this.f76909b.mo91835j(false);
        mo91508S0();
    }

    /* renamed from: A0 */
    public final void mo91473A0() {
        int i;
        if (this.f76870G0 != null) {
            EditText editText = this.f76915e;
            if (editText == null) {
                i = 0;
            } else {
                i = editText.getText().length();
            }
            mo91475B0(i);
        }
    }

    /* renamed from: B */
    public final C20633l mo91474B() {
        C20633l lVar = new C20633l();
        lVar.mo61718L0(87);
        lVar.mo61722O0(C31093a.f74425a);
        return lVar;
    }

    /* renamed from: B0 */
    public void mo91475B0(int i) {
        boolean z;
        boolean z2 = this.f76868F0;
        int i2 = this.f76866E0;
        if (i2 == -1) {
            this.f76870G0.setText(String.valueOf(i));
            this.f76870G0.setContentDescription((CharSequence) null);
            this.f76868F0 = false;
        } else {
            if (i > i2) {
                z = true;
            } else {
                z = false;
            }
            this.f76868F0 = z;
            m128182C0(getContext(), this.f76870G0, i, this.f76866E0, this.f76868F0);
            if (z2 != this.f76868F0) {
                mo91478D0();
            }
            this.f76870G0.setText(C17897a.m81419c().mo52315q(getContext().getString(C31076a.C31089m.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f76866E0)})));
        }
        if (this.f76915e != null && z2 != this.f76868F0) {
            mo91494L0(false);
            mo91510T0();
            mo91484G0();
        }
    }

    /* renamed from: C */
    public final boolean mo91476C() {
        return this.f76898U0 && !TextUtils.isEmpty(this.f76900V0) && (this.f76904X0 instanceof C31652c);
    }

    @C0344h1
    /* renamed from: D */
    public boolean mo91477D() {
        return mo91476C() && ((C31652c) this.f76904X0).mo91744P0();
    }

    /* renamed from: D0 */
    public final void mo91478D0() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f76870G0;
        if (textView != null) {
            if (this.f76868F0) {
                i = this.f76872H0;
            } else {
                i = this.f76874I0;
            }
            mo91607s0(textView, i);
            if (!this.f76868F0 && (colorStateList2 = this.f76890Q0) != null) {
                this.f76870G0.setTextColor(colorStateList2);
            }
            if (this.f76868F0 && (colorStateList = this.f76892R0) != null) {
                this.f76870G0.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: E */
    public final void mo91479E() {
        Iterator<C31638h> it = this.f76930q1.iterator();
        while (it.hasNext()) {
            it.next().mo91725a(this);
        }
    }

    /* renamed from: E0 */
    public final void mo91480E0() {
        if (this.f76931r1 == 3 && this.f76914d1 == 2) {
            ((C31653d) this.f76932s1.get(3)).mo91761O((AutoCompleteTextView) this.f76915e);
        }
    }

    /* renamed from: F */
    public final void mo91481F(int i) {
        Iterator<C31639i> it = this.f76934u1.iterator();
        while (it.hasNext()) {
            it.next().mo91726a(this, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo91482F0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f76915e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.mo91701u0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.google.android.material.textfield.j r0 = r10.f76909b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f76915e
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f76928o1
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f76929p1
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f76928o1 = r6
            r10.f76929p1 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f76915e
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C18496q.m83734h(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f76928o1
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f76915e
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.C18496q.m83749w(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f76928o1
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f76915e
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C18496q.m83734h(r0)
            android.widget.EditText r6 = r10.f76915e
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.C18496q.m83749w(r6, r2, r7, r8, r0)
            r10.f76928o1 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.mo91699t0()
            if (r6 == 0) goto L_0x00d1
            android.widget.TextView r2 = r10.f76896T0
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f76915e
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.C18353r0.m83082c(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f76915e
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C18496q.m83734h(r6)
            android.graphics.drawable.Drawable r7 = r10.f76940x1
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f76942y1
            if (r8 == r2) goto L_0x00ad
            r10.f76942y1 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f76915e
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f76940x1
            r4 = r6[r4]
            androidx.core.widget.C18496q.m83749w(r0, r1, r2, r3, r4)
            goto L_0x00f2
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f76940x1 = r7
            r10.f76942y1 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f76940x1
            if (r2 == r3) goto L_0x00cf
            r10.f76944z1 = r2
            android.widget.EditText r0 = r10.f76915e
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            androidx.core.widget.C18496q.m83749w(r0, r1, r2, r3, r4)
            goto L_0x00f2
        L_0x00cf:
            r5 = r0
            goto L_0x00f2
        L_0x00d1:
            android.graphics.drawable.Drawable r6 = r10.f76940x1
            if (r6 == 0) goto L_0x00f3
            android.widget.EditText r6 = r10.f76915e
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C18496q.m83734h(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f76940x1
            if (r3 != r7) goto L_0x00ef
            android.widget.EditText r0 = r10.f76915e
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f76944z1
            r4 = r6[r4]
            androidx.core.widget.C18496q.m83749w(r0, r1, r3, r7, r4)
            goto L_0x00f0
        L_0x00ef:
            r5 = r0
        L_0x00f0:
            r10.f76940x1 = r2
        L_0x00f2:
            r0 = r5
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo91482F0():boolean");
    }

    /* renamed from: G */
    public final void mo91483G(Canvas canvas) {
        C31525j jVar;
        if (this.f76906Z0 != null && (jVar = this.f76905Y0) != null) {
            jVar.draw(canvas);
            if (this.f76915e.isFocused()) {
                Rect bounds = this.f76906Z0.getBounds();
                Rect bounds2 = this.f76905Y0.getBounds();
                float G = this.f76893R1.mo90020G();
                int centerX = bounds2.centerX();
                bounds.left = C31093a.m124649c(centerX, bounds2.left, G);
                bounds.right = C31093a.m124649c(centerX, bounds2.right, G);
                this.f76906Z0.draw(canvas);
            }
        }
    }

    /* renamed from: G0 */
    public void mo91484G0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f76915e;
        if (editText != null && this.f76914d1 == 0 && (background = editText.getBackground()) != null) {
            if (C0725i0.m3580a(background)) {
                background = background.mutate();
            }
            if (this.f76941y.mo91806m()) {
                background.setColorFilter(C0716g.m3507e(this.f76941y.mo91810q(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f76868F0 || (textView = this.f76870G0) == null) {
                C17549d.m80441c(background);
                this.f76915e.refreshDrawableState();
            } else {
                background.setColorFilter(C0716g.m3507e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* renamed from: H */
    public final void mo91485H(@C0359n0 Canvas canvas) {
        if (this.f76898U0) {
            this.f76893R1.mo90066l(canvas);
        }
    }

    /* renamed from: H0 */
    public final boolean mo91486H0() {
        int max;
        if (this.f76915e == null || this.f76915e.getMeasuredHeight() >= (max = Math.max(this.f76911c.getMeasuredHeight(), this.f76909b.getMeasuredHeight()))) {
            return false;
        }
        this.f76915e.setMinimumHeight(max);
        return true;
    }

    /* renamed from: I */
    public final void mo91487I(boolean z) {
        ValueAnimator valueAnimator = this.f76899U1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f76899U1.cancel();
        }
        if (!z || !this.f76897T1) {
            this.f76893R1.mo90095z0(0.0f);
        } else {
            mo91587k(0.0f);
        }
        if (mo91476C() && ((C31652c) this.f76904X0).mo91744P0()) {
            mo91710z();
        }
        this.f76891Q1 = true;
        mo91495M();
        this.f76909b.mo91835j(true);
        mo91508S0();
    }

    /* renamed from: I0 */
    public final void mo91488I0() {
        int i;
        boolean z;
        boolean z2;
        FrameLayout frameLayout = this.f76913d;
        int i2 = 8;
        if (this.f76933t1.getVisibility() != 0 || mo91505R()) {
            i = 8;
        } else {
            i = 0;
        }
        frameLayout.setVisibility(i);
        if (this.f76894S0 == null || mo91514X()) {
            z = true;
        } else {
            z = false;
        }
        if (mo91501P() || mo91505R() || !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        LinearLayout linearLayout = this.f76911c;
        if (z2) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
    }

    /* renamed from: J */
    public final int mo91489J(int i, boolean z) {
        int compoundPaddingLeft = i + this.f76915e.getCompoundPaddingLeft();
        if (getPrefixText() == null || z) {
            return compoundPaddingLeft;
        }
        return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* renamed from: J0 */
    public final void mo91490J0() {
        boolean z;
        int i = 0;
        if (getErrorIconDrawable() == null || !this.f76941y.mo91780E() || !this.f76941y.mo91806m()) {
            z = false;
        } else {
            z = true;
        }
        CheckableImageButton checkableImageButton = this.f76864C1;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        mo91488I0();
        mo91506R0();
        if (!mo91493L()) {
            mo91482F0();
        }
    }

    /* renamed from: K */
    public final int mo91491K(int i, boolean z) {
        int compoundPaddingRight = i - this.f76915e.getCompoundPaddingRight();
        if (getPrefixText() == null || !z) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* renamed from: K0 */
    public final void mo91492K0() {
        if (this.f76914d1 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f76907a.getLayoutParams();
            int u = mo91700u();
            if (u != layoutParams.topMargin) {
                layoutParams.topMargin = u;
                this.f76907a.requestLayout();
            }
        }
    }

    /* renamed from: L */
    public final boolean mo91493L() {
        return this.f76931r1 != 0;
    }

    /* renamed from: L0 */
    public void mo91494L0(boolean z) {
        mo91496M0(z, false);
    }

    /* renamed from: M */
    public final void mo91495M() {
        TextView textView = this.f76880L0;
        if (textView != null && this.f76878K0) {
            textView.setText((CharSequence) null);
            C20629k0.m95932b(this.f76907a, this.f76888P0);
            this.f76880L0.setVisibility(4);
        }
    }

    /* renamed from: M0 */
    public final void mo91496M0(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f76915e;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z3 = false;
        } else {
            z3 = true;
        }
        EditText editText2 = this.f76915e;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean m = this.f76941y.mo91806m();
        ColorStateList colorStateList2 = this.f76869F1;
        if (colorStateList2 != null) {
            this.f76893R1.mo90063j0(colorStateList2);
            this.f76893R1.mo90085u0(this.f76869F1);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f76869F1;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.f76889P1);
            } else {
                i = this.f76889P1;
            }
            this.f76893R1.mo90063j0(ColorStateList.valueOf(i));
            this.f76893R1.mo90085u0(ColorStateList.valueOf(i));
        } else if (m) {
            this.f76893R1.mo90063j0(this.f76941y.mo91811r());
        } else if (this.f76868F0 && (textView = this.f76870G0) != null) {
            this.f76893R1.mo90063j0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f76871G1) != null) {
            this.f76893R1.mo90063j0(colorStateList);
        }
        if (z3 || !this.f76895S1 || (isEnabled() && z4)) {
            if (z2 || this.f76891Q1) {
                mo91472A(z);
            }
        } else if (z2 || !this.f76891Q1) {
            mo91487I(z);
        }
    }

    /* renamed from: N */
    public boolean mo91497N() {
        return this.f76943z;
    }

    /* renamed from: N0 */
    public final void mo91498N0() {
        EditText editText;
        if (this.f76880L0 != null && (editText = this.f76915e) != null) {
            this.f76880L0.setGravity(editText.getGravity());
            this.f76880L0.setPadding(this.f76915e.getCompoundPaddingLeft(), this.f76915e.getCompoundPaddingTop(), this.f76915e.getCompoundPaddingRight(), this.f76915e.getCompoundPaddingBottom());
        }
    }

    /* renamed from: O */
    public boolean mo91499O() {
        return this.f76933t1.mo89900a();
    }

    /* renamed from: O0 */
    public final void mo91500O0() {
        EditText editText = this.f76915e;
        mo91502P0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: P */
    public boolean mo91501P() {
        return this.f76913d.getVisibility() == 0 && this.f76933t1.getVisibility() == 0;
    }

    /* renamed from: P0 */
    public final void mo91502P0(int i) {
        if (i != 0 || this.f76891Q1) {
            mo91495M();
        } else {
            mo91705w0();
        }
    }

    /* renamed from: Q */
    public boolean mo91503Q() {
        return this.f76941y.mo91780E();
    }

    /* renamed from: Q0 */
    public final void mo91504Q0(boolean z, boolean z2) {
        int defaultColor = this.f76879K1.getDefaultColor();
        int colorForState = this.f76879K1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f76879K1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f76922i1 = colorForState2;
        } else if (z2) {
            this.f76922i1 = colorForState;
        } else {
            this.f76922i1 = defaultColor;
        }
    }

    /* renamed from: R */
    public final boolean mo91505R() {
        return this.f76864C1.getVisibility() == 0;
    }

    /* renamed from: R0 */
    public final void mo91506R0() {
        int i;
        if (this.f76915e != null) {
            if (mo91501P() || mo91505R()) {
                i = 0;
            } else {
                i = C18196h2.m82593j0(this.f76915e);
            }
            C18196h2.m82571d2(this.f76896T0, getContext().getResources().getDimensionPixelSize(C31076a.C31082f.material_input_text_to_prefix_suffix_padding), this.f76915e.getPaddingTop(), i, this.f76915e.getPaddingBottom());
        }
    }

    /* renamed from: S */
    public boolean mo91507S() {
        return this.f76895S1;
    }

    /* renamed from: S0 */
    public final void mo91508S0() {
        int i;
        int visibility = this.f76896T0.getVisibility();
        boolean z = false;
        if (this.f76894S0 == null || mo91514X()) {
            i = 8;
        } else {
            i = 0;
        }
        if (visibility != i) {
            C31668e endIconDelegate = getEndIconDelegate();
            if (i == 0) {
                z = true;
            }
            endIconDelegate.mo91728c(z);
        }
        mo91488I0();
        this.f76896T0.setVisibility(i);
        mo91482F0();
    }

    @C0344h1
    /* renamed from: T */
    public final boolean mo91509T() {
        return this.f76941y.mo91817x();
    }

    /* renamed from: T0 */
    public void mo91510T0() {
        boolean z;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f76904X0 != null && this.f76914d1 != 0) {
            boolean z2 = false;
            if (isFocused() || ((editText2 = this.f76915e) != null && editText2.hasFocus())) {
                z = true;
            } else {
                z = false;
            }
            if (isHovered() || ((editText = this.f76915e) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.f76922i1 = this.f76889P1;
            } else if (this.f76941y.mo91806m()) {
                if (this.f76879K1 != null) {
                    mo91504Q0(z, z2);
                } else {
                    this.f76922i1 = this.f76941y.mo91810q();
                }
            } else if (!this.f76868F0 || (textView = this.f76870G0) == null) {
                if (z) {
                    this.f76922i1 = this.f76877J1;
                } else if (z2) {
                    this.f76922i1 = this.f76875I1;
                } else {
                    this.f76922i1 = this.f76873H1;
                }
            } else if (this.f76879K1 != null) {
                mo91504Q0(z, z2);
            } else {
                this.f76922i1 = textView.getCurrentTextColor();
            }
            mo91490J0();
            mo91586j0();
            mo91588k0();
            mo91584i0();
            if (getEndIconDelegate().mo91763d()) {
                mo91707x0(this.f76941y.mo91806m());
            }
            if (this.f76914d1 == 2) {
                int i = this.f76918f1;
                if (!z || !isEnabled()) {
                    this.f76918f1 = this.f76920g1;
                } else {
                    this.f76918f1 = this.f76921h1;
                }
                if (this.f76918f1 != i) {
                    mo91529g0();
                }
            }
            if (this.f76914d1 == 1) {
                if (!isEnabled()) {
                    this.f76923j1 = this.f76883M1;
                } else if (z2 && !z) {
                    this.f76923j1 = this.f76887O1;
                } else if (z) {
                    this.f76923j1 = this.f76885N1;
                } else {
                    this.f76923j1 = this.f76881L1;
                }
            }
            mo91589l();
        }
    }

    /* renamed from: U */
    public boolean mo91511U() {
        return this.f76941y.mo91781F();
    }

    /* renamed from: V */
    public boolean mo91512V() {
        return this.f76897T1;
    }

    /* renamed from: W */
    public boolean mo91513W() {
        return this.f76898U0;
    }

    /* renamed from: X */
    public final boolean mo91514X() {
        return this.f76891Q1;
    }

    @Deprecated
    /* renamed from: Y */
    public boolean mo91515Y() {
        return this.f76931r1 == 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: Z */
    public boolean mo91516Z() {
        return this.f76902W0;
    }

    /* renamed from: a0 */
    public final boolean mo91517a0() {
        if (this.f76914d1 != 1 || this.f76915e.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    public void addView(@C0359n0 View view, int i, @C0359n0 ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f76907a.addView(view, layoutParams2);
            this.f76907a.setLayoutParams(layoutParams);
            mo91492K0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b0 */
    public boolean mo91519b0() {
        return this.f76909b.mo91833h();
    }

    /* renamed from: c0 */
    public boolean mo91520c0() {
        return this.f76909b.mo91834i();
    }

    /* renamed from: d0 */
    public final void mo91521d0() {
        mo91595o();
        mo91596o0();
        mo91510T0();
        mo91709y0();
        mo91585j();
        if (this.f76914d1 != 0) {
            mo91492K0();
        }
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@C0359n0 ViewStructure viewStructure, int i) {
        EditText editText = this.f76915e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f76917f != null) {
            boolean z = this.f76902W0;
            this.f76902W0 = false;
            CharSequence hint = editText.getHint();
            this.f76915e.setHint(this.f76917f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f76915e.setHint(hint);
                this.f76902W0 = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f76907a.getChildCount());
            for (int i2 = 0; i2 < this.f76907a.getChildCount(); i2++) {
                View childAt = this.f76907a.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f76915e) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(@C0359n0 SparseArray<Parcelable> sparseArray) {
        this.f76903W1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f76903W1 = false;
    }

    public void draw(@C0359n0 Canvas canvas) {
        super.draw(canvas);
        mo91485H(canvas);
        mo91483G(canvas);
    }

    public void drawableStateChanged() {
        boolean z;
        if (!this.f76901V1) {
            boolean z2 = true;
            this.f76901V1 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C31388b bVar = this.f76893R1;
            if (bVar != null) {
                z = bVar.mo90027J0(drawableState) | false;
            } else {
                z = false;
            }
            if (this.f76915e != null) {
                if (!C18196h2.m82539U0(this) || !isEnabled()) {
                    z2 = false;
                }
                mo91494L0(z2);
            }
            mo91484G0();
            mo91510T0();
            if (z) {
                invalidate();
            }
            this.f76901V1 = false;
        }
    }

    /* renamed from: e0 */
    public final void mo91526e0() {
        if (mo91476C()) {
            RectF rectF = this.f76926m1;
            this.f76893R1.mo90072o(rectF, this.f76915e.getWidth(), this.f76915e.getGravity());
            mo91593n(rectF);
            rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.f76918f1));
            ((C31652c) this.f76904X0).mo91747S0(rectF);
        }
    }

    @Deprecated
    /* renamed from: f0 */
    public void mo91527f0(boolean z) {
        if (this.f76931r1 == 1) {
            this.f76933t1.performClick();
            if (z) {
                this.f76933t1.jumpDrawablesToCurrentState();
            }
        }
    }

    /* renamed from: g */
    public void mo91528g(@C0359n0 C31638h hVar) {
        this.f76930q1.add(hVar);
        if (this.f76915e != null) {
            hVar.mo91725a(this);
        }
    }

    /* renamed from: g0 */
    public final void mo91529g0() {
        if (mo91476C() && !this.f76891Q1) {
            mo91710z();
            mo91526e0();
        }
    }

    public int getBaseline() {
        EditText editText = this.f76915e;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + mo91700u();
        }
        return super.getBaseline();
    }

    @C0359n0
    public C31525j getBoxBackground() {
        int i = this.f76914d1;
        if (i == 1 || i == 2) {
            return this.f76904X0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f76923j1;
    }

    public int getBoxBackgroundMode() {
        return this.f76914d1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f76916e1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (C31432x.m127016k(this)) {
            return this.f76908a1.mo90811j().mo90693a(this.f76926m1);
        }
        return this.f76908a1.mo90813l().mo90693a(this.f76926m1);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (C31432x.m127016k(this)) {
            return this.f76908a1.mo90813l().mo90693a(this.f76926m1);
        }
        return this.f76908a1.mo90811j().mo90693a(this.f76926m1);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (C31432x.m127016k(this)) {
            return this.f76908a1.mo90818r().mo90693a(this.f76926m1);
        }
        return this.f76908a1.mo90820t().mo90693a(this.f76926m1);
    }

    public float getBoxCornerRadiusTopStart() {
        if (C31432x.m127016k(this)) {
            return this.f76908a1.mo90820t().mo90693a(this.f76926m1);
        }
        return this.f76908a1.mo90818r().mo90693a(this.f76926m1);
    }

    public int getBoxStrokeColor() {
        return this.f76877J1;
    }

    @C0363p0
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f76879K1;
    }

    public int getBoxStrokeWidth() {
        return this.f76920g1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f76921h1;
    }

    public int getCounterMaxLength() {
        return this.f76866E0;
    }

    @C0363p0
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f76943z || !this.f76868F0 || (textView = this.f76870G0) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    @C0363p0
    public ColorStateList getCounterOverflowTextColor() {
        return this.f76890Q0;
    }

    @C0363p0
    public ColorStateList getCounterTextColor() {
        return this.f76890Q0;
    }

    @C0363p0
    public ColorStateList getDefaultHintTextColor() {
        return this.f76869F1;
    }

    @C0363p0
    public EditText getEditText() {
        return this.f76915e;
    }

    @C0363p0
    public CharSequence getEndIconContentDescription() {
        return this.f76933t1.getContentDescription();
    }

    @C0363p0
    public Drawable getEndIconDrawable() {
        return this.f76933t1.getDrawable();
    }

    public int getEndIconMode() {
        return this.f76931r1;
    }

    @C0359n0
    public CheckableImageButton getEndIconView() {
        return this.f76933t1;
    }

    @C0363p0
    public CharSequence getError() {
        if (this.f76941y.mo91780E()) {
            return this.f76941y.mo91809p();
        }
        return null;
    }

    @C0363p0
    public CharSequence getErrorContentDescription() {
        return this.f76941y.mo91808o();
    }

    @C0354l
    public int getErrorCurrentTextColors() {
        return this.f76941y.mo91810q();
    }

    @C0363p0
    public Drawable getErrorIconDrawable() {
        return this.f76864C1.getDrawable();
    }

    @C0344h1
    public final int getErrorTextCurrentColor() {
        return this.f76941y.mo91810q();
    }

    @C0363p0
    public CharSequence getHelperText() {
        if (this.f76941y.mo91781F()) {
            return this.f76941y.mo91812s();
        }
        return null;
    }

    @C0354l
    public int getHelperTextCurrentTextColor() {
        return this.f76941y.mo91815v();
    }

    @C0363p0
    public CharSequence getHint() {
        if (this.f76898U0) {
            return this.f76900V0;
        }
        return null;
    }

    @C0344h1
    public final float getHintCollapsedTextHeight() {
        return this.f76893R1.mo90078r();
    }

    @C0344h1
    public final int getHintCurrentCollapsedTextColor() {
        return this.f76893R1.mo90088w();
    }

    @C0363p0
    public ColorStateList getHintTextColor() {
        return this.f76871G1;
    }

    public int getMaxEms() {
        return this.f76935v;
    }

    @C0372t0
    public int getMaxWidth() {
        return this.f76939x;
    }

    public int getMinEms() {
        return this.f76919g;
    }

    @C0372t0
    public int getMinWidth() {
        return this.f76937w;
    }

    @C0363p0
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f76933t1.getContentDescription();
    }

    @C0363p0
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f76933t1.getDrawable();
    }

    @C0363p0
    public CharSequence getPlaceholderText() {
        if (this.f76878K0) {
            return this.f76876J0;
        }
        return null;
    }

    @C0327c1
    public int getPlaceholderTextAppearance() {
        return this.f76884N0;
    }

    @C0363p0
    public ColorStateList getPlaceholderTextColor() {
        return this.f76882M0;
    }

    @C0363p0
    public CharSequence getPrefixText() {
        return this.f76909b.mo91826a();
    }

    @C0363p0
    public ColorStateList getPrefixTextColor() {
        return this.f76909b.mo91827b();
    }

    @C0359n0
    public TextView getPrefixTextView() {
        return this.f76909b.mo91828c();
    }

    @C0363p0
    public CharSequence getStartIconContentDescription() {
        return this.f76909b.mo91829d();
    }

    @C0363p0
    public Drawable getStartIconDrawable() {
        return this.f76909b.mo91830e();
    }

    @C0363p0
    public CharSequence getSuffixText() {
        return this.f76894S0;
    }

    @C0363p0
    public ColorStateList getSuffixTextColor() {
        return this.f76896T0.getTextColors();
    }

    @C0359n0
    public TextView getSuffixTextView() {
        return this.f76896T0;
    }

    @C0363p0
    public Typeface getTypeface() {
        return this.f76927n1;
    }

    /* renamed from: h */
    public void mo91582h(@C0359n0 C31639i iVar) {
        this.f76934u1.add(iVar);
    }

    /* renamed from: i */
    public final void mo91583i() {
        TextView textView = this.f76880L0;
        if (textView != null) {
            this.f76907a.addView(textView);
            this.f76880L0.setVisibility(0);
        }
    }

    /* renamed from: i0 */
    public void mo91584i0() {
        C31669f.m128356c(this, this.f76933t1, this.f76936v1);
    }

    /* renamed from: j */
    public final void mo91585j() {
        if (this.f76915e != null && this.f76914d1 == 1) {
            if (C31500c.m127372j(getContext())) {
                EditText editText = this.f76915e;
                C18196h2.m82571d2(editText, C18196h2.m82597k0(editText), getResources().getDimensionPixelSize(C31076a.C31082f.material_filled_edittext_font_2_0_padding_top), C18196h2.m82593j0(this.f76915e), getResources().getDimensionPixelSize(C31076a.C31082f.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C31500c.m127371i(getContext())) {
                EditText editText2 = this.f76915e;
                C18196h2.m82571d2(editText2, C18196h2.m82597k0(editText2), getResources().getDimensionPixelSize(C31076a.C31082f.material_filled_edittext_font_1_3_padding_top), C18196h2.m82593j0(this.f76915e), getResources().getDimensionPixelSize(C31076a.C31082f.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    /* renamed from: j0 */
    public void mo91586j0() {
        C31669f.m128356c(this, this.f76864C1, this.f76865D1);
    }

    @C0344h1
    /* renamed from: k */
    public void mo91587k(float f) {
        if (this.f76893R1.mo90020G() != f) {
            if (this.f76899U1 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f76899U1 = valueAnimator;
                valueAnimator.setInterpolator(C31093a.f74426b);
                this.f76899U1.setDuration(167);
                this.f76899U1.addUpdateListener(new C31634d());
            }
            this.f76899U1.setFloatValues(new float[]{this.f76893R1.mo90020G(), f});
            this.f76899U1.start();
        }
    }

    /* renamed from: k0 */
    public void mo91588k0() {
        this.f76909b.mo91836k();
    }

    /* renamed from: l */
    public final void mo91589l() {
        C31525j jVar = this.f76904X0;
        if (jVar != null) {
            C31534o shapeAppearanceModel = jVar.getShapeAppearanceModel();
            C31534o oVar = this.f76908a1;
            if (shapeAppearanceModel != oVar) {
                this.f76904X0.setShapeAppearanceModel(oVar);
                mo91480E0();
            }
            if (mo91702v()) {
                this.f76904X0.mo90717D0((float) this.f76918f1, this.f76922i1);
            }
            int p = mo91603p();
            this.f76923j1 = p;
            this.f76904X0.mo90777o0(ColorStateList.valueOf(p));
            if (this.f76931r1 == 3) {
                this.f76915e.getBackground().invalidateSelf();
            }
            mo91591m();
            invalidate();
        }
    }

    /* renamed from: l0 */
    public void mo91590l0(@C0359n0 C31638h hVar) {
        this.f76930q1.remove(hVar);
    }

    /* renamed from: m */
    public final void mo91591m() {
        ColorStateList colorStateList;
        if (this.f76905Y0 != null && this.f76906Z0 != null) {
            if (mo91704w()) {
                C31525j jVar = this.f76905Y0;
                if (this.f76915e.isFocused()) {
                    colorStateList = ColorStateList.valueOf(this.f76873H1);
                } else {
                    colorStateList = ColorStateList.valueOf(this.f76922i1);
                }
                jVar.mo90777o0(colorStateList);
                this.f76906Z0.mo90777o0(ColorStateList.valueOf(this.f76922i1));
            }
            invalidate();
        }
    }

    /* renamed from: m0 */
    public void mo91592m0(@C0359n0 C31639i iVar) {
        this.f76934u1.remove(iVar);
    }

    /* renamed from: n */
    public final void mo91593n(@C0359n0 RectF rectF) {
        float f = rectF.left;
        int i = this.f76912c1;
        rectF.left = f - ((float) i);
        rectF.right += (float) i;
    }

    /* renamed from: n0 */
    public final void mo91594n0() {
        TextView textView = this.f76880L0;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: o */
    public final void mo91595o() {
        int i = this.f76914d1;
        if (i == 0) {
            this.f76904X0 = null;
            this.f76905Y0 = null;
            this.f76906Z0 = null;
        } else if (i == 1) {
            this.f76904X0 = new C31525j(this.f76908a1);
            this.f76905Y0 = new C31525j();
            this.f76906Z0 = new C31525j();
        } else if (i == 2) {
            if (!this.f76898U0 || (this.f76904X0 instanceof C31652c)) {
                this.f76904X0 = new C31525j(this.f76908a1);
            } else {
                this.f76904X0 = new C31652c(this.f76908a1);
            }
            this.f76905Y0 = null;
            this.f76906Z0 = null;
        } else {
            throw new IllegalArgumentException(this.f76914d1 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: o0 */
    public final void mo91596o0() {
        if (mo91703v0()) {
            C18196h2.m82502I1(this.f76915e, this.f76904X0);
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f76893R1.mo90045Z(configuration);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f76915e;
        if (editText != null) {
            Rect rect = this.f76924k1;
            C31392d.m126855a(this, editText, rect);
            mo91711z0(rect);
            if (this.f76898U0) {
                this.f76893R1.mo90089w0(this.f76915e.getTextSize());
                int gravity = this.f76915e.getGravity();
                this.f76893R1.mo90065k0((gravity & -113) | 48);
                this.f76893R1.mo90087v0(gravity);
                this.f76893R1.mo90057g0(mo91604q(rect));
                this.f76893R1.mo90077q0(mo91698t(rect));
                this.f76893R1.mo90050c0();
                if (mo91476C() && !this.f76891Q1) {
                    mo91526e0();
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean H0 = mo91486H0();
        boolean F0 = mo91482F0();
        if (H0 || F0) {
            this.f76915e.post(new C31633c());
        }
        mo91498N0();
        mo91506R0();
    }

    public void onRestoreInstanceState(@C0363p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        setError(savedState.f76945c);
        if (savedState.f76946d) {
            this.f76933t1.post(new C31632b());
        }
        setHint(savedState.f76947e);
        setHelperText(savedState.f76948f);
        setPlaceholderText(savedState.f76949g);
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z;
        float f;
        float f2;
        super.onRtlPropertiesChanged(i);
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.f76910b1;
        if (z != z3) {
            if (z && !z3) {
                z2 = true;
            }
            float a = this.f76908a1.mo90818r().mo90693a(this.f76926m1);
            float a2 = this.f76908a1.mo90820t().mo90693a(this.f76926m1);
            float a3 = this.f76908a1.mo90811j().mo90693a(this.f76926m1);
            float a4 = this.f76908a1.mo90813l().mo90693a(this.f76926m1);
            if (z2) {
                f = a;
            } else {
                f = a2;
            }
            if (z2) {
                a = a2;
            }
            if (z2) {
                f2 = a3;
            } else {
                f2 = a4;
            }
            if (z2) {
                a3 = a4;
            }
            setBoxCornerRadii(f, a, f2, a3);
        }
    }

    @C0363p0
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f76941y.mo91806m()) {
            savedState.f76945c = getError();
        }
        if (!mo91493L() || !this.f76933t1.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        savedState.f76946d = z;
        savedState.f76947e = getHint();
        savedState.f76948f = getHelperText();
        savedState.f76949g = getPlaceholderText();
        return savedState;
    }

    /* renamed from: p */
    public final int mo91603p() {
        int i = this.f76923j1;
        if (this.f76914d1 == 1) {
            return C31266s.m125961l(C31266s.m125954e(this, C31076a.C31079c.colorSurface, 0), this.f76923j1);
        }
        return i;
    }

    @C0359n0
    /* renamed from: q */
    public final Rect mo91604q(@C0359n0 Rect rect) {
        if (this.f76915e != null) {
            Rect rect2 = this.f76925l1;
            boolean k = C31432x.m127016k(this);
            rect2.bottom = rect.bottom;
            int i = this.f76914d1;
            if (i == 1) {
                rect2.left = mo91489J(rect.left, k);
                rect2.top = rect.top + this.f76916e1;
                rect2.right = mo91491K(rect.right, k);
                return rect2;
            } else if (i != 2) {
                rect2.left = mo91489J(rect.left, k);
                rect2.top = getPaddingTop();
                rect2.right = mo91491K(rect.right, k);
                return rect2;
            } else {
                rect2.left = rect.left + this.f76915e.getPaddingLeft();
                rect2.top = rect.top - mo91700u();
                rect2.right = rect.right - this.f76915e.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    public final int mo91605r(@C0359n0 Rect rect, @C0359n0 Rect rect2, float f) {
        if (mo91517a0()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f76915e.getCompoundPaddingBottom();
    }

    /* renamed from: s */
    public final int mo91606s(@C0359n0 Rect rect, float f) {
        if (mo91517a0()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f76915e.getCompoundPaddingTop();
    }

    /* renamed from: s0 */
    public void mo91607s0(@C0359n0 TextView textView, @C0327c1 int i) {
        boolean z = true;
        try {
            C18496q.m83723E(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C18496q.m83723E(textView, C31076a.C31090n.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C17318d.m79723f(getContext(), C31076a.C31081e.design_error));
        }
    }

    public void setBoxBackgroundColor(@C0354l int i) {
        if (this.f76923j1 != i) {
            this.f76923j1 = i;
            this.f76881L1 = i;
            this.f76885N1 = i;
            this.f76887O1 = i;
            mo91589l();
        }
    }

    public void setBoxBackgroundColorResource(@C0358n int i) {
        setBoxBackgroundColor(C17318d.m79723f(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@C0359n0 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f76881L1 = defaultColor;
        this.f76923j1 = defaultColor;
        this.f76883M1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f76885N1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f76887O1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        mo91589l();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f76914d1) {
            this.f76914d1 = i;
            if (this.f76915e != null) {
                mo91521d0();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f76916e1 = i;
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        boolean k = C31432x.m127016k(this);
        this.f76910b1 = k;
        if (k) {
            f5 = f2;
        } else {
            f5 = f;
        }
        if (!k) {
            f = f2;
        }
        if (k) {
            f6 = f4;
        } else {
            f6 = f3;
        }
        if (!k) {
            f3 = f4;
        }
        C31525j jVar = this.f76904X0;
        if (jVar == null || jVar.mo90743S() != f5 || this.f76904X0.mo90744T() != f || this.f76904X0.mo90787t() != f6 || this.f76904X0.mo90789u() != f3) {
            this.f76908a1 = this.f76908a1.mo90822v().mo90836K(f5).mo90841P(f).mo90853x(f6).mo90828C(f3).mo90843m();
            mo91589l();
        }
    }

    public void setBoxCornerRadiiResources(@C0364q int i, @C0364q int i2, @C0364q int i3, @C0364q int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(@C0354l int i) {
        if (this.f76877J1 != i) {
            this.f76877J1 = i;
            mo91510T0();
        }
    }

    public void setBoxStrokeColorStateList(@C0359n0 ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f76873H1 = colorStateList.getDefaultColor();
            this.f76889P1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f76875I1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f76877J1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f76877J1 != colorStateList.getDefaultColor()) {
            this.f76877J1 = colorStateList.getDefaultColor();
        }
        mo91510T0();
    }

    public void setBoxStrokeErrorColor(@C0363p0 ColorStateList colorStateList) {
        if (this.f76879K1 != colorStateList) {
            this.f76879K1 = colorStateList;
            mo91510T0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f76920g1 = i;
        mo91510T0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f76921h1 = i;
        mo91510T0();
    }

    public void setBoxStrokeWidthFocusedResource(@C0364q int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@C0364q int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f76943z != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f76870G0 = appCompatTextView;
                appCompatTextView.setId(C31076a.C31084h.textinput_counter);
                Typeface typeface = this.f76927n1;
                if (typeface != null) {
                    this.f76870G0.setTypeface(typeface);
                }
                this.f76870G0.setMaxLines(1);
                this.f76941y.mo91798e(this.f76870G0, 2);
                C18353r0.m83087h((ViewGroup.MarginLayoutParams) this.f76870G0.getLayoutParams(), getResources().getDimensionPixelOffset(C31076a.C31082f.mtrl_textinput_counter_margin_start));
                mo91478D0();
                mo91473A0();
            } else {
                this.f76941y.mo91782G(this.f76870G0, 2);
                this.f76870G0 = null;
            }
            this.f76943z = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f76866E0 != i) {
            if (i > 0) {
                this.f76866E0 = i;
            } else {
                this.f76866E0 = -1;
            }
            if (this.f76943z) {
                mo91473A0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f76872H0 != i) {
            this.f76872H0 = i;
            mo91478D0();
        }
    }

    public void setCounterOverflowTextColor(@C0363p0 ColorStateList colorStateList) {
        if (this.f76892R0 != colorStateList) {
            this.f76892R0 = colorStateList;
            mo91478D0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f76874I0 != i) {
            this.f76874I0 = i;
            mo91478D0();
        }
    }

    public void setCounterTextColor(@C0363p0 ColorStateList colorStateList) {
        if (this.f76890Q0 != colorStateList) {
            this.f76890Q0 = colorStateList;
            mo91478D0();
        }
    }

    public void setDefaultHintTextColor(@C0363p0 ColorStateList colorStateList) {
        this.f76869F1 = colorStateList;
        this.f76871G1 = colorStateList;
        if (this.f76915e != null) {
            mo91494L0(false);
        }
    }

    public void setEnabled(boolean z) {
        m128189h0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f76933t1.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f76933t1.setCheckable(z);
    }

    public void setEndIconContentDescription(@C0324b1 int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(@C0375v int i) {
        setEndIconDrawable(i != 0 ? C0507a.m2346b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.f76931r1;
        if (i2 != i) {
            this.f76931r1 = i;
            mo91481F(i2);
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            setEndIconVisible(z);
            if (getEndIconDelegate().mo91762b(this.f76914d1)) {
                getEndIconDelegate().mo91727a();
                C31669f.m128354a(this, this.f76933t1, this.f76936v1, this.f76938w1);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f76914d1 + " is not supported by the end icon mode " + i);
        }
    }

    public void setEndIconOnClickListener(@C0363p0 View.OnClickListener onClickListener) {
        m128191q0(this.f76933t1, onClickListener, this.f76862A1);
    }

    public void setEndIconOnLongClickListener(@C0363p0 View.OnLongClickListener onLongClickListener) {
        this.f76862A1 = onLongClickListener;
        m128192r0(this.f76933t1, onLongClickListener);
    }

    public void setEndIconTintList(@C0363p0 ColorStateList colorStateList) {
        if (this.f76936v1 != colorStateList) {
            this.f76936v1 = colorStateList;
            C31669f.m128354a(this, this.f76933t1, colorStateList, this.f76938w1);
        }
    }

    public void setEndIconTintMode(@C0363p0 PorterDuff.Mode mode) {
        if (this.f76938w1 != mode) {
            this.f76938w1 = mode;
            C31669f.m128354a(this, this.f76933t1, this.f76936v1, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (mo91501P() != z) {
            CheckableImageButton checkableImageButton = this.f76933t1;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo91488I0();
            mo91506R0();
            mo91482F0();
        }
    }

    public void setError(@C0363p0 CharSequence charSequence) {
        if (!this.f76941y.mo91780E()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f76941y.mo91795T(charSequence);
        } else {
            this.f76941y.mo91819z();
        }
    }

    public void setErrorContentDescription(@C0363p0 CharSequence charSequence) {
        this.f76941y.mo91784I(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f76941y.mo91785J(z);
    }

    public void setErrorIconDrawable(@C0375v int i) {
        setErrorIconDrawable(i != 0 ? C0507a.m2346b(getContext(), i) : null);
        mo91586j0();
    }

    public void setErrorIconOnClickListener(@C0363p0 View.OnClickListener onClickListener) {
        m128191q0(this.f76864C1, onClickListener, this.f76863B1);
    }

    public void setErrorIconOnLongClickListener(@C0363p0 View.OnLongClickListener onLongClickListener) {
        this.f76863B1 = onLongClickListener;
        m128192r0(this.f76864C1, onLongClickListener);
    }

    public void setErrorIconTintList(@C0363p0 ColorStateList colorStateList) {
        if (this.f76865D1 != colorStateList) {
            this.f76865D1 = colorStateList;
            C31669f.m128354a(this, this.f76864C1, colorStateList, this.f76867E1);
        }
    }

    public void setErrorIconTintMode(@C0363p0 PorterDuff.Mode mode) {
        if (this.f76867E1 != mode) {
            this.f76867E1 = mode;
            C31669f.m128354a(this, this.f76864C1, this.f76865D1, mode);
        }
    }

    public void setErrorTextAppearance(@C0327c1 int i) {
        this.f76941y.mo91786K(i);
    }

    public void setErrorTextColor(@C0363p0 ColorStateList colorStateList) {
        this.f76941y.mo91787L(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f76895S1 != z) {
            this.f76895S1 = z;
            mo91494L0(false);
        }
    }

    public void setHelperText(@C0363p0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo91511U()) {
                setHelperTextEnabled(true);
            }
            this.f76941y.mo91796U(charSequence);
        } else if (mo91511U()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(@C0363p0 ColorStateList colorStateList) {
        this.f76941y.mo91790O(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f76941y.mo91789N(z);
    }

    public void setHelperTextTextAppearance(@C0327c1 int i) {
        this.f76941y.mo91788M(i);
    }

    public void setHint(@C0363p0 CharSequence charSequence) {
        if (this.f76898U0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f76897T1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f76898U0) {
            this.f76898U0 = z;
            if (!z) {
                this.f76902W0 = false;
                if (!TextUtils.isEmpty(this.f76900V0) && TextUtils.isEmpty(this.f76915e.getHint())) {
                    this.f76915e.setHint(this.f76900V0);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f76915e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f76900V0)) {
                        setHint(hint);
                    }
                    this.f76915e.setHint((CharSequence) null);
                }
                this.f76902W0 = true;
            }
            if (this.f76915e != null) {
                mo91492K0();
            }
        }
    }

    public void setHintTextAppearance(@C0327c1 int i) {
        this.f76893R1.mo90059h0(i);
        this.f76871G1 = this.f76893R1.mo90074p();
        if (this.f76915e != null) {
            mo91494L0(false);
            mo91492K0();
        }
    }

    public void setHintTextColor(@C0363p0 ColorStateList colorStateList) {
        if (this.f76871G1 != colorStateList) {
            if (this.f76869F1 == null) {
                this.f76893R1.mo90063j0(colorStateList);
            }
            this.f76871G1 = colorStateList;
            if (this.f76915e != null) {
                mo91494L0(false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f76935v = i;
        EditText editText = this.f76915e;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(@C0372t0 int i) {
        this.f76939x = i;
        EditText editText = this.f76915e;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(@C0364q int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f76919g = i;
        EditText editText = this.f76915e;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(@C0372t0 int i) {
        this.f76937w = i;
        EditText editText = this.f76915e;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(@C0364q int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@C0324b1 int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@C0375v int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0507a.m2346b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f76931r1 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@C0363p0 ColorStateList colorStateList) {
        this.f76936v1 = colorStateList;
        C31669f.m128354a(this, this.f76933t1, colorStateList, this.f76938w1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f76938w1 = mode;
        C31669f.m128354a(this, this.f76933t1, this.f76936v1, mode);
    }

    public void setPlaceholderText(@C0363p0 CharSequence charSequence) {
        if (this.f76880L0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f76880L0 = appCompatTextView;
            appCompatTextView.setId(C31076a.C31084h.textinput_placeholder);
            C18196h2.m82531R1(this.f76880L0, 2);
            C20633l B = mo91474B();
            this.f76886O0 = B;
            B.mo61729S0(67);
            this.f76888P0 = mo91474B();
            setPlaceholderTextAppearance(this.f76884N0);
            setPlaceholderTextColor(this.f76882M0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f76878K0) {
                setPlaceholderTextEnabled(true);
            }
            this.f76876J0 = charSequence;
        }
        mo91500O0();
    }

    public void setPlaceholderTextAppearance(@C0327c1 int i) {
        this.f76884N0 = i;
        TextView textView = this.f76880L0;
        if (textView != null) {
            C18496q.m83723E(textView, i);
        }
    }

    public void setPlaceholderTextColor(@C0363p0 ColorStateList colorStateList) {
        if (this.f76882M0 != colorStateList) {
            this.f76882M0 = colorStateList;
            TextView textView = this.f76880L0;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@C0363p0 CharSequence charSequence) {
        this.f76909b.mo91837l(charSequence);
    }

    public void setPrefixTextAppearance(@C0327c1 int i) {
        this.f76909b.mo91838m(i);
    }

    public void setPrefixTextColor(@C0359n0 ColorStateList colorStateList) {
        this.f76909b.mo91839n(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f76909b.mo91840o(z);
    }

    public void setStartIconContentDescription(@C0324b1 int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(@C0375v int i) {
        setStartIconDrawable(i != 0 ? C0507a.m2346b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(@C0363p0 View.OnClickListener onClickListener) {
        this.f76909b.mo91844r(onClickListener);
    }

    public void setStartIconOnLongClickListener(@C0363p0 View.OnLongClickListener onLongClickListener) {
        this.f76909b.mo91845s(onLongClickListener);
    }

    public void setStartIconTintList(@C0363p0 ColorStateList colorStateList) {
        this.f76909b.mo91846t(colorStateList);
    }

    public void setStartIconTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f76909b.mo91847u(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f76909b.mo91848v(z);
    }

    public void setSuffixText(@C0363p0 CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f76894S0 = charSequence2;
        this.f76896T0.setText(charSequence);
        mo91508S0();
    }

    public void setSuffixTextAppearance(@C0327c1 int i) {
        C18496q.m83723E(this.f76896T0, i);
    }

    public void setSuffixTextColor(@C0359n0 ColorStateList colorStateList) {
        this.f76896T0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@C0363p0 C31635e eVar) {
        EditText editText = this.f76915e;
        if (editText != null) {
            C18196h2.m82474B1(editText, eVar);
        }
    }

    public void setTypeface(@C0363p0 Typeface typeface) {
        if (typeface != this.f76927n1) {
            this.f76927n1 = typeface;
            this.f76893R1.mo90033M0(typeface);
            this.f76941y.mo91792Q(typeface);
            TextView textView = this.f76870G0;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    @C0359n0
    /* renamed from: t */
    public final Rect mo91698t(@C0359n0 Rect rect) {
        if (this.f76915e != null) {
            Rect rect2 = this.f76925l1;
            float D = this.f76893R1.mo90014D();
            rect2.left = rect.left + this.f76915e.getCompoundPaddingLeft();
            rect2.top = mo91606s(rect, D);
            rect2.right = rect.right - this.f76915e.getCompoundPaddingRight();
            rect2.bottom = mo91605r(rect, rect2, D);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t0 */
    public final boolean mo91699t0() {
        if ((this.f76864C1.getVisibility() == 0 || ((mo91493L() && mo91501P()) || this.f76894S0 != null)) && this.f76911c.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final int mo91700u() {
        float r;
        if (!this.f76898U0) {
            return 0;
        }
        int i = this.f76914d1;
        if (i == 0) {
            r = this.f76893R1.mo90078r();
        } else if (i != 2) {
            return 0;
        } else {
            r = this.f76893R1.mo90078r() / 2.0f;
        }
        return (int) r;
    }

    /* renamed from: u0 */
    public final boolean mo91701u0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f76909b.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo91702v() {
        return this.f76914d1 == 2 && mo91704w();
    }

    /* renamed from: v0 */
    public final boolean mo91703v0() {
        EditText editText = this.f76915e;
        if (editText == null || this.f76904X0 == null || editText.getBackground() != null || this.f76914d1 == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean mo91704w() {
        return this.f76918f1 > -1 && this.f76922i1 != 0;
    }

    /* renamed from: w0 */
    public final void mo91705w0() {
        if (this.f76880L0 != null && this.f76878K0 && !TextUtils.isEmpty(this.f76876J0)) {
            this.f76880L0.setText(this.f76876J0);
            C20629k0.m95932b(this.f76907a, this.f76886O0);
            this.f76880L0.setVisibility(0);
            this.f76880L0.bringToFront();
            announceForAccessibility(this.f76876J0);
        }
    }

    /* renamed from: x */
    public void mo91706x() {
        this.f76930q1.clear();
    }

    /* renamed from: x0 */
    public final void mo91707x0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            C31669f.m128354a(this, this.f76933t1, this.f76936v1, this.f76938w1);
            return;
        }
        Drawable mutate = C17549d.m80456r(getEndIconDrawable()).mutate();
        C17549d.m80452n(mutate, this.f76941y.mo91810q());
        this.f76933t1.setImageDrawable(mutate);
    }

    /* renamed from: y */
    public void mo91708y() {
        this.f76934u1.clear();
    }

    /* renamed from: y0 */
    public final void mo91709y0() {
        if (this.f76914d1 != 1) {
            return;
        }
        if (C31500c.m127372j(getContext())) {
            this.f76916e1 = getResources().getDimensionPixelSize(C31076a.C31082f.material_font_2_0_box_collapsed_padding_top);
        } else if (C31500c.m127371i(getContext())) {
            this.f76916e1 = getResources().getDimensionPixelSize(C31076a.C31082f.material_font_1_3_box_collapsed_padding_top);
        }
    }

    /* renamed from: z */
    public final void mo91710z() {
        if (mo91476C()) {
            ((C31652c) this.f76904X0).mo91745Q0();
        }
    }

    /* renamed from: z0 */
    public final void mo91711z0(@C0359n0 Rect rect) {
        C31525j jVar = this.f76905Y0;
        if (jVar != null) {
            int i = rect.bottom;
            jVar.setBounds(rect.left, i - this.f76920g1, rect.right, i);
        }
        C31525j jVar2 = this.f76906Z0;
        if (jVar2 != null) {
            int i2 = rect.bottom;
            jVar2.setBounds(rect.left, i2 - this.f76921h1, rect.right, i2);
        }
    }

    public TextInputLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.textInputStyle);
    }

    public void setEndIconContentDescription(@C0363p0 CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f76933t1.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@C0363p0 Drawable drawable) {
        this.f76933t1.setImageDrawable(drawable);
        if (drawable != null) {
            C31669f.m128354a(this, this.f76933t1, this.f76936v1, this.f76938w1);
            mo91584i0();
        }
    }

    public void setStartIconContentDescription(@C0363p0 CharSequence charSequence) {
        this.f76909b.mo91842p(charSequence);
    }

    public void setStartIconDrawable(@C0363p0 Drawable drawable) {
        this.f76909b.mo91843q(drawable);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(@androidx.annotation.C0359n0 android.content.Context r27, @androidx.annotation.C0363p0 android.util.AttributeSet r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r7 = r28
            r8 = r29
            int r9 = f76847X1
            r1 = r27
            android.content.Context r1 = com.google.android.material.theme.overlay.C31683a.m128455c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f76919g = r10
            r0.f76935v = r10
            r0.f76937w = r10
            r0.f76939x = r10
            com.google.android.material.textfield.g r1 = new com.google.android.material.textfield.g
            r1.<init>(r0)
            r0.f76941y = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f76924k1 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f76925l1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f76926m1 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f76930q1 = r1
            r11 = 0
            r0.f76931r1 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f76932s1 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f76934u1 = r1
            com.google.android.material.internal.b r1 = new com.google.android.material.internal.b
            r1.<init>(r0)
            r0.f76893R1 = r1
            android.content.Context r13 = r26.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r13)
            r0.f76907a = r15
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r13)
            r0.f76913d = r6
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f76911c = r5
            androidx.appcompat.widget.AppCompatTextView r4 = new androidx.appcompat.widget.AppCompatTextView
            r4.<init>(r13)
            r0.f76896T0 = r4
            r2 = 8
            r5.setVisibility(r2)
            r6.setVisibility(r2)
            r4.setVisibility(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r13)
            int r3 = com.google.android.material.C31076a.C31087k.design_text_input_end_icon
            android.view.View r16 = r2.inflate(r3, r5, r11)
            r10 = r16
            com.google.android.material.internal.CheckableImageButton r10 = (com.google.android.material.internal.CheckableImageButton) r10
            r0.f76864C1 = r10
            android.view.View r2 = r2.inflate(r3, r6, r11)
            r3 = r2
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f76933t1 = r3
            r15.setAddStatesFromChildren(r14)
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r14 = 8388613(0x800005, float:1.175495E-38)
            r11 = -2
            r17 = r3
            r3 = -1
            r2.<init>(r11, r3, r14)
            r5.setLayoutParams(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r11, r3)
            r6.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.C31093a.f74425a
            r1.mo90031L0(r2)
            r1.mo90023H0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo90065k0(r2)
            int[] r3 = com.google.android.material.C31076a.C31091o.TextInputLayout
            r1 = 5
            int[] r14 = new int[r1]
            int r2 = com.google.android.material.C31076a.C31091o.TextInputLayout_counterTextAppearance
            r1 = 0
            r14[r1] = r2
            int r1 = com.google.android.material.C31076a.C31091o.TextInputLayout_counterOverflowTextAppearance
            r16 = 1
            r14[r16] = r1
            int r11 = com.google.android.material.C31076a.C31091o.TextInputLayout_errorTextAppearance
            r18 = r15
            r15 = 2
            r14[r15] = r11
            int r15 = com.google.android.material.C31076a.C31091o.TextInputLayout_helperTextTextAppearance
            r19 = r12
            r12 = 3
            r14[r12] = r15
            int r12 = com.google.android.material.C31076a.C31091o.TextInputLayout_hintTextAppearance
            r20 = 4
            r14[r20] = r12
            r21 = r1
            r1 = r13
            r22 = r2
            r2 = r28
            r20 = r17
            r23 = r4
            r4 = r29
            r24 = r5
            r5 = r9
            r25 = r6
            r6 = r14
            androidx.appcompat.widget.h1 r1 = com.google.android.material.internal.C31422p.m126971k(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.j r2 = new com.google.android.material.textfield.j
            r2.<init>(r0, r1)
            r0.f76909b = r2
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_hintEnabled
            r4 = 1
            boolean r3 = r1.mo3459a(r3, r4)
            r0.f76898U0 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_android_hint
            java.lang.CharSequence r3 = r1.mo3482x(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_hintAnimationEnabled
            boolean r3 = r1.mo3459a(r3, r4)
            r0.f76897T1 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_expandedHintEnabled
            boolean r3 = r1.mo3459a(r3, r4)
            r0.f76895S1 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_android_minEms
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x0143
            r4 = -1
            int r3 = r1.mo3473o(r3, r4)
            r0.setMinEms(r3)
            goto L_0x0153
        L_0x0143:
            r4 = -1
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_android_minWidth
            boolean r5 = r1.mo3455C(r3)
            if (r5 == 0) goto L_0x0153
            int r3 = r1.mo3465g(r3, r4)
            r0.setMinWidth(r3)
        L_0x0153:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_android_maxEms
            boolean r5 = r1.mo3455C(r3)
            if (r5 == 0) goto L_0x0163
            int r3 = r1.mo3473o(r3, r4)
            r0.setMaxEms(r3)
            goto L_0x0172
        L_0x0163:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_android_maxWidth
            boolean r5 = r1.mo3455C(r3)
            if (r5 == 0) goto L_0x0172
            int r3 = r1.mo3465g(r3, r4)
            r0.setMaxWidth(r3)
        L_0x0172:
            com.google.android.material.shape.o$b r3 = com.google.android.material.shape.C31534o.m127565e(r13, r7, r8, r9)
            com.google.android.material.shape.o r3 = r3.mo90843m()
            r0.f76908a1 = r3
            android.content.res.Resources r3 = r13.getResources()
            int r4 = com.google.android.material.C31076a.C31082f.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f76912c1 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxCollapsedPaddingTop
            r4 = 0
            int r3 = r1.mo3464f(r3, r4)
            r0.f76916e1 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r4 = r13.getResources()
            int r5 = com.google.android.material.C31076a.C31082f.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo3465g(r3, r4)
            r0.f76920g1 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r4 = r13.getResources()
            int r5 = com.google.android.material.C31076a.C31082f.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo3465g(r3, r4)
            r0.f76921h1 = r3
            int r3 = r0.f76920g1
            r0.f76918f1 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxCornerRadiusTopStart
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.mo3463e(r3, r4)
            int r5 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxCornerRadiusTopEnd
            float r5 = r1.mo3463e(r5, r4)
            int r6 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxCornerRadiusBottomEnd
            float r6 = r1.mo3463e(r6, r4)
            int r7 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxCornerRadiusBottomStart
            float r4 = r1.mo3463e(r7, r4)
            com.google.android.material.shape.o r7 = r0.f76908a1
            com.google.android.material.shape.o$b r7 = r7.mo90822v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x01e1
            r7.mo90836K(r3)
        L_0x01e1:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x01e8
            r7.mo90841P(r5)
        L_0x01e8:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x01ef
            r7.mo90828C(r6)
        L_0x01ef:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x01f6
            r7.mo90853x(r4)
        L_0x01f6:
            com.google.android.material.shape.o r3 = r7.mo90843m()
            r0.f76908a1 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r3 = com.google.android.material.resources.C31500c.m127364b(r13, r1, r3)
            if (r3 == 0) goto L_0x025f
            int r4 = r3.getDefaultColor()
            r0.f76881L1 = r4
            r0.f76923j1 = r4
            boolean r4 = r3.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x023a
            r4 = 1
            int[] r6 = new int[r4]
            r4 = 0
            r6[r4] = r5
            r4 = -1
            int r5 = r3.getColorForState(r6, r4)
            r0.f76883M1 = r5
            r5 = 2
            int[] r6 = new int[r5]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r3.getColorForState(r6, r4)
            r0.f76885N1 = r6
            int[] r6 = new int[r5]
            r6 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r6, r4)
            r0.f76887O1 = r3
            goto L_0x026a
        L_0x023a:
            r4 = -1
            int r3 = r0.f76881L1
            r0.f76885N1 = r3
            int r3 = com.google.android.material.C31076a.C31081e.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = androidx.appcompat.content.res.C0507a.m2345a(r13, r3)
            r6 = 1
            int[] r7 = new int[r6]
            r8 = 0
            r7[r8] = r5
            int r5 = r3.getColorForState(r7, r4)
            r0.f76883M1 = r5
            int[] r5 = new int[r6]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r5[r8] = r6
            int r3 = r3.getColorForState(r5, r4)
            r0.f76887O1 = r3
            goto L_0x026a
        L_0x025f:
            r8 = 0
            r0.f76923j1 = r8
            r0.f76881L1 = r8
            r0.f76883M1 = r8
            r0.f76885N1 = r8
            r0.f76887O1 = r8
        L_0x026a:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_android_textColorHint
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x027a
            android.content.res.ColorStateList r3 = r1.mo3462d(r3)
            r0.f76871G1 = r3
            r0.f76869F1 = r3
        L_0x027a:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r4 = com.google.android.material.resources.C31500c.m127364b(r13, r1, r3)
            r5 = 0
            int r3 = r1.mo3461c(r3, r5)
            r0.f76877J1 = r3
            int r3 = com.google.android.material.C31076a.C31081e.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.C17318d.m79723f(r13, r3)
            r0.f76873H1 = r3
            int r3 = com.google.android.material.C31076a.C31081e.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.C17318d.m79723f(r13, r3)
            r0.f76889P1 = r3
            int r3 = com.google.android.material.C31076a.C31081e.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.C17318d.m79723f(r13, r3)
            r0.f76875I1 = r3
            if (r4 == 0) goto L_0x02a4
            r0.setBoxStrokeColorStateList(r4)
        L_0x02a4:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxStrokeErrorColor
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x02b3
            android.content.res.ColorStateList r3 = com.google.android.material.resources.C31500c.m127364b(r13, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x02b3:
            r3 = -1
            int r4 = r1.mo3479u(r12, r3)
            if (r4 == r3) goto L_0x02c3
            r3 = 0
            int r4 = r1.mo3479u(r12, r3)
            r0.setHintTextAppearance(r4)
            goto L_0x02c4
        L_0x02c3:
            r3 = 0
        L_0x02c4:
            int r4 = r1.mo3479u(r11, r3)
            int r5 = com.google.android.material.C31076a.C31091o.TextInputLayout_errorContentDescription
            java.lang.CharSequence r5 = r1.mo3482x(r5)
            int r6 = com.google.android.material.C31076a.C31091o.TextInputLayout_errorEnabled
            boolean r6 = r1.mo3459a(r6, r3)
            int r7 = com.google.android.material.C31076a.C31084h.text_input_error_icon
            r10.setId(r7)
            boolean r7 = com.google.android.material.resources.C31500c.m127371i(r13)
            if (r7 == 0) goto L_0x02e8
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            androidx.core.view.C18353r0.m83087h(r7, r3)
        L_0x02e8:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_errorIconTint
            boolean r7 = r1.mo3455C(r3)
            if (r7 == 0) goto L_0x02f6
            android.content.res.ColorStateList r3 = com.google.android.material.resources.C31500c.m127364b(r13, r1, r3)
            r0.f76865D1 = r3
        L_0x02f6:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_errorIconTintMode
            boolean r7 = r1.mo3455C(r3)
            r8 = 0
            if (r7 == 0) goto L_0x030a
            r7 = -1
            int r3 = r1.mo3473o(r3, r7)
            android.graphics.PorterDuff$Mode r3 = com.google.android.material.internal.C31432x.m127017l(r3, r8)
            r0.f76867E1 = r3
        L_0x030a:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_errorIconDrawable
            boolean r7 = r1.mo3455C(r3)
            if (r7 == 0) goto L_0x0319
            android.graphics.drawable.Drawable r3 = r1.mo3466h(r3)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r3)
        L_0x0319:
            android.content.res.Resources r3 = r26.getResources()
            int r7 = com.google.android.material.C31076a.C31089m.error_icon_content_description
            java.lang.CharSequence r3 = r3.getText(r7)
            r10.setContentDescription(r3)
            r3 = 2
            androidx.core.view.C18196h2.m82531R1(r10, r3)
            r3 = 0
            r10.setClickable(r3)
            r10.setPressable(r3)
            r10.setFocusable(r3)
            int r7 = r1.mo3479u(r15, r3)
            int r9 = com.google.android.material.C31076a.C31091o.TextInputLayout_helperTextEnabled
            boolean r9 = r1.mo3459a(r9, r3)
            int r11 = com.google.android.material.C31076a.C31091o.TextInputLayout_helperText
            java.lang.CharSequence r11 = r1.mo3482x(r11)
            int r12 = com.google.android.material.C31076a.C31091o.TextInputLayout_placeholderTextAppearance
            int r12 = r1.mo3479u(r12, r3)
            int r14 = com.google.android.material.C31076a.C31091o.TextInputLayout_placeholderText
            java.lang.CharSequence r14 = r1.mo3482x(r14)
            int r15 = com.google.android.material.C31076a.C31091o.TextInputLayout_suffixTextAppearance
            int r15 = r1.mo3479u(r15, r3)
            int r8 = com.google.android.material.C31076a.C31091o.TextInputLayout_suffixText
            java.lang.CharSequence r8 = r1.mo3482x(r8)
            r29 = r8
            int r8 = com.google.android.material.C31076a.C31091o.TextInputLayout_counterEnabled
            boolean r8 = r1.mo3459a(r8, r3)
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_counterMaxLength
            r17 = r11
            r11 = -1
            int r3 = r1.mo3473o(r3, r11)
            r0.setCounterMaxLength(r3)
            r3 = r22
            r11 = 0
            int r3 = r1.mo3479u(r3, r11)
            r0.f76874I0 = r3
            r3 = r21
            int r3 = r1.mo3479u(r3, r11)
            r0.f76872H0 = r3
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_boxBackgroundMode
            int r3 = r1.mo3473o(r3, r11)
            r0.setBoxBackgroundMode(r3)
            boolean r3 = com.google.android.material.resources.C31500c.m127371i(r13)
            if (r3 == 0) goto L_0x0399
            android.view.ViewGroup$LayoutParams r3 = r20.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            androidx.core.view.C18353r0.m83087h(r3, r11)
        L_0x0399:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_endIconDrawable
            int r3 = r1.mo3479u(r3, r11)
            com.google.android.material.textfield.b r11 = new com.google.android.material.textfield.b
            r11.<init>(r0, r3)
            r21 = r8
            r8 = r19
            r19 = r6
            r6 = -1
            r8.append(r6, r11)
            com.google.android.material.textfield.h r6 = new com.google.android.material.textfield.h
            r6.<init>(r0)
            r11 = 0
            r8.append(r11, r6)
            com.google.android.material.textfield.i r6 = new com.google.android.material.textfield.i
            if (r3 != 0) goto L_0x03c4
            r22 = r9
            int r9 = com.google.android.material.C31076a.C31091o.TextInputLayout_passwordToggleDrawable
            int r9 = r1.mo3479u(r9, r11)
            goto L_0x03c7
        L_0x03c4:
            r22 = r9
            r9 = r3
        L_0x03c7:
            r6.<init>(r0, r9)
            r9 = 1
            r8.append(r9, r6)
            com.google.android.material.textfield.a r6 = new com.google.android.material.textfield.a
            r6.<init>(r0, r3)
            r9 = 2
            r8.append(r9, r6)
            com.google.android.material.textfield.d r6 = new com.google.android.material.textfield.d
            r6.<init>(r0, r3)
            r3 = 3
            r8.append(r3, r6)
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.mo3455C(r3)
            if (r6 != 0) goto L_0x040a
            int r6 = com.google.android.material.C31076a.C31091o.TextInputLayout_endIconTint
            boolean r8 = r1.mo3455C(r6)
            if (r8 == 0) goto L_0x03f6
            android.content.res.ColorStateList r6 = com.google.android.material.resources.C31500c.m127364b(r13, r1, r6)
            r0.f76936v1 = r6
        L_0x03f6:
            int r6 = com.google.android.material.C31076a.C31091o.TextInputLayout_endIconTintMode
            boolean r8 = r1.mo3455C(r6)
            if (r8 == 0) goto L_0x040a
            r8 = -1
            int r6 = r1.mo3473o(r6, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C31432x.m127017l(r6, r8)
            r0.f76938w1 = r6
        L_0x040a:
            int r6 = com.google.android.material.C31076a.C31091o.TextInputLayout_endIconMode
            boolean r8 = r1.mo3455C(r6)
            if (r8 == 0) goto L_0x0434
            r8 = 0
            int r3 = r1.mo3473o(r6, r8)
            r0.setEndIconMode(r3)
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_endIconContentDescription
            boolean r6 = r1.mo3455C(r3)
            if (r6 == 0) goto L_0x0429
            java.lang.CharSequence r3 = r1.mo3482x(r3)
            r0.setEndIconContentDescription((java.lang.CharSequence) r3)
        L_0x0429:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_endIconCheckable
            r6 = 1
            boolean r3 = r1.mo3459a(r3, r6)
            r0.setEndIconCheckable(r3)
            goto L_0x046d
        L_0x0434:
            boolean r6 = r1.mo3455C(r3)
            if (r6 == 0) goto L_0x046d
            int r6 = com.google.android.material.C31076a.C31091o.TextInputLayout_passwordToggleTint
            boolean r8 = r1.mo3455C(r6)
            if (r8 == 0) goto L_0x0448
            android.content.res.ColorStateList r6 = com.google.android.material.resources.C31500c.m127364b(r13, r1, r6)
            r0.f76936v1 = r6
        L_0x0448:
            int r6 = com.google.android.material.C31076a.C31091o.TextInputLayout_passwordToggleTintMode
            boolean r8 = r1.mo3455C(r6)
            if (r8 == 0) goto L_0x045c
            r8 = -1
            int r6 = r1.mo3473o(r6, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C31432x.m127017l(r6, r8)
            r0.f76938w1 = r6
        L_0x045c:
            r6 = 0
            boolean r3 = r1.mo3459a(r3, r6)
            r0.setEndIconMode(r3)
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r3 = r1.mo3482x(r3)
            r0.setEndIconContentDescription((java.lang.CharSequence) r3)
        L_0x046d:
            int r3 = com.google.android.material.C31076a.C31084h.textinput_suffix_text
            r6 = r23
            r6.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r8 = 80
            r9 = -2
            r3.<init>(r9, r9, r8)
            r6.setLayoutParams(r3)
            r3 = 1
            androidx.core.view.C18196h2.m82482D1(r6, r3)
            r0.setErrorContentDescription(r5)
            int r3 = r0.f76872H0
            r0.setCounterOverflowTextAppearance(r3)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorTextAppearance(r4)
            int r3 = r0.f76874I0
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r14)
            r0.setPlaceholderTextAppearance(r12)
            r0.setSuffixTextAppearance(r15)
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_errorTextColor
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x04ae
            android.content.res.ColorStateList r3 = r1.mo3462d(r3)
            r0.setErrorTextColor(r3)
        L_0x04ae:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_helperTextTextColor
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x04bd
            android.content.res.ColorStateList r3 = r1.mo3462d(r3)
            r0.setHelperTextColor(r3)
        L_0x04bd:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_hintTextColor
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x04cc
            android.content.res.ColorStateList r3 = r1.mo3462d(r3)
            r0.setHintTextColor(r3)
        L_0x04cc:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_counterTextColor
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x04db
            android.content.res.ColorStateList r3 = r1.mo3462d(r3)
            r0.setCounterTextColor(r3)
        L_0x04db:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_counterOverflowTextColor
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x04ea
            android.content.res.ColorStateList r3 = r1.mo3462d(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x04ea:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_placeholderTextColor
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x04f9
            android.content.res.ColorStateList r3 = r1.mo3462d(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x04f9:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_suffixTextColor
            boolean r4 = r1.mo3455C(r3)
            if (r4 == 0) goto L_0x0508
            android.content.res.ColorStateList r3 = r1.mo3462d(r3)
            r0.setSuffixTextColor(r3)
        L_0x0508:
            int r3 = com.google.android.material.C31076a.C31091o.TextInputLayout_android_enabled
            r4 = 1
            boolean r3 = r1.mo3459a(r3, r4)
            r0.setEnabled(r3)
            r1.mo3458I()
            r1 = 2
            androidx.core.view.C18196h2.m82531R1(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x0522
            androidx.core.view.C18196h2.m82534S1(r0, r4)
        L_0x0522:
            r3 = r20
            r1 = r25
            r1.addView(r3)
            r3 = r24
            r3.addView(r6)
            r3.addView(r10)
            r3.addView(r1)
            r1 = r18
            r1.addView(r2)
            r1.addView(r3)
            r0.addView(r1)
            r1 = r22
            r0.setHelperTextEnabled(r1)
            r1 = r19
            r0.setErrorEnabled(r1)
            r1 = r21
            r0.setCounterEnabled(r1)
            r1 = r17
            r0.setHelperText(r1)
            r1 = r29
            r0.setSuffixText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setErrorIconDrawable(@C0363p0 Drawable drawable) {
        this.f76864C1.setImageDrawable(drawable);
        mo91490J0();
        C31669f.m128354a(this, this.f76864C1, this.f76865D1, this.f76867E1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@C0363p0 CharSequence charSequence) {
        this.f76933t1.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@C0363p0 Drawable drawable) {
        this.f76933t1.setImageDrawable(drawable);
    }

    public void setHint(@C0324b1 int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
