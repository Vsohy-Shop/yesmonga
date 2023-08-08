package com.urbanairship.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19232h;

/* renamed from: com.urbanairship.activity.b */
public abstract class C35516b extends C19232h {

    /* renamed from: S0 */
    public static Boolean f87581S0;

    /* renamed from: R0 */
    public C35515a f87582R0;

    /* renamed from: B0 */
    public static boolean m146520B0(@C0359n0 Activity activity) {
        int identifier;
        if (f87581S0 == null) {
            try {
                Class.forName("androidx.appcompat.app.i");
                f87581S0 = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f87581S0 = Boolean.FALSE;
            }
        }
        if (!f87581S0.booleanValue() || (identifier = activity.getResources().getIdentifier("colorPrimary", "attr", activity.getPackageName())) == 0) {
            return false;
        }
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{identifier});
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: A0 */
    public void mo106408A0() {
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            if (aVar.mo106396d() != null) {
                this.f87582R0.mo106396d().mo1244C();
            }
        } else if (getActionBar() != null) {
            getActionBar().hide();
        }
    }

    /* renamed from: C0 */
    public void mo106409C0(boolean z) {
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            if (aVar.mo106396d() != null) {
                this.f87582R0.mo106396d().mo1268Y(z);
                this.f87582R0.mo106396d().mo1289m0(z);
            }
        } else if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(z);
            getActionBar().setHomeButtonEnabled(z);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106394a(view, layoutParams);
        } else {
            super.addContentView(view, layoutParams);
        }
    }

    @C0359n0
    public MenuInflater getMenuInflater() {
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            return aVar.mo106395c();
        }
        return super.getMenuInflater();
    }

    public void invalidateOptionsMenu() {
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106397e();
        } else {
            super.invalidateOptionsMenu();
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106398f(configuration);
        }
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        if (m146520B0(this)) {
            this.f87582R0 = C35515a.m146505b(this);
        }
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106399g(bundle);
        }
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106400h();
        }
    }

    public void onPostCreate(@C0363p0 Bundle bundle) {
        super.onPostCreate(bundle);
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106401i(bundle);
        }
    }

    public void onPostResume() {
        super.onPostResume();
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106402j();
        }
    }

    public void onStop() {
        super.onStop();
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106403k();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106407o(charSequence);
        }
    }

    public void setContentView(@C0347i0 int i) {
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106404l(i);
        } else {
            super.setContentView(i);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void setContentView(View view) {
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106405m(view);
        } else {
            super.setContentView(view);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C35515a aVar = this.f87582R0;
        if (aVar != null) {
            aVar.mo106406n(view, layoutParams);
        } else {
            super.setContentView(view, layoutParams);
        }
    }
}
