package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.customview.view.AbsSavedState;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g */
    public static final int[] f75745g = {16842912};

    /* renamed from: d */
    public boolean f75746d;

    /* renamed from: e */
    public boolean f75747e;

    /* renamed from: f */
    public boolean f75748f;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C31378a();

        /* renamed from: c */
        public boolean f75749c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        public class C31378a implements Parcelable.ClassLoaderCreator<SavedState> {
            @C0359n0
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

        /* renamed from: b */
        public final void mo89911b(@C0359n0 Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f75749c = z;
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f75749c ? 1 : 0);
        }

        public SavedState(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo89911b(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C31379a extends C18019a {
        public C31379a() {
        }

        /* renamed from: f */
        public void mo52492f(View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
            super.mo52492f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52586X0(CheckableImageButton.this.mo89900a());
            l0Var.mo52589Y0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo89900a() {
        return this.f75747e;
    }

    /* renamed from: b */
    public boolean mo89901b() {
        return this.f75748f;
    }

    public boolean isChecked() {
        return this.f75746d;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f75746d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f75745g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        setChecked(savedState.f75749c);
    }

    @C0359n0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f75749c = this.f75746d;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f75747e != z) {
            this.f75747e = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f75747e && this.f75746d != z) {
            this.f75746d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f75748f = z;
    }

    public void setPressed(boolean z) {
        if (this.f75748f) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f75746d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75747e = true;
        this.f75748f = true;
        C18196h2.m82474B1(this, new C31379a());
    }
}
