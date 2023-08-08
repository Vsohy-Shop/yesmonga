package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.base.C40426a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C40745d1;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: e */
    public static final int f103148e = 0;

    /* renamed from: f */
    public static final int f103149f = 1;

    /* renamed from: g */
    public static final int f103150g = 2;

    /* renamed from: v */
    public static final int f103151v = 0;

    /* renamed from: w */
    public static final int f103152w = 1;

    /* renamed from: x */
    public static final int f103153x = 2;

    /* renamed from: a */
    public int f103154a;

    /* renamed from: b */
    public int f103155b;

    /* renamed from: c */
    public View f103156c;
    @C0363p0

    /* renamed from: d */
    public View.OnClickListener f103157d;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.SignInButton$a */
    public @interface C40467a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.SignInButton$b */
    public @interface C40468b {
    }

    public SignInButton(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo133610a(Context context) {
        View view = this.f103156c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f103156c = C40745d1.m165785c(context, this.f103154a, this.f103155b);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i = this.f103154a;
            int i2 = this.f103155b;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.mo134519a(context.getResources(), i, i2);
            this.f103156c = zaaa;
        }
        addView(this.f103156c);
        this.f103156c.setEnabled(isEnabled());
        this.f103156c.setOnClickListener(this);
    }

    public void onClick(@C0359n0 View view) {
        View.OnClickListener onClickListener = this.f103157d;
        if (onClickListener != null && view == this.f103156c) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        setStyle(this.f103154a, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f103156c.setEnabled(z);
    }

    public void setOnClickListener(@C0363p0 View.OnClickListener onClickListener) {
        this.f103157d = onClickListener;
        View view = this.f103156c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@C0359n0 Scope[] scopeArr) {
        setStyle(this.f103154a, this.f103155b);
    }

    public void setSize(int i) {
        setStyle(i, this.f103155b);
    }

    public void setStyle(int i, int i2) {
        this.f103154a = i;
        this.f103155b = i2;
        mo133610a(getContext());
    }

    public SignInButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setStyle(int i, int i2, @C0359n0 Scope[] scopeArr) {
        setStyle(i, i2);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f103157d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C40426a.C40432f.SignInButton, 0, 0);
        try {
            this.f103154a = obtainStyledAttributes.getInt(C40426a.C40432f.SignInButton_buttonSize, 0);
            this.f103155b = obtainStyledAttributes.getInt(C40426a.C40432f.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            setStyle(this.f103154a, this.f103155b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
