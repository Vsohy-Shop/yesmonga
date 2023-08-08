package androidx.preference;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.preference.DialogPreference;

@Deprecated
/* renamed from: androidx.preference.j */
public abstract class C19930j extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: X */
    public static final String f50983X = "PreferenceDialogFragment.message";

    /* renamed from: Y */
    public static final String f50984Y = "PreferenceDialogFragment.layout";

    /* renamed from: Z */
    public static final String f50985Z = "PreferenceDialogFragment.icon";
    @Deprecated

    /* renamed from: w */
    public static final String f50986w = "key";

    /* renamed from: x */
    public static final String f50987x = "PreferenceDialogFragment.title";

    /* renamed from: y */
    public static final String f50988y = "PreferenceDialogFragment.positiveText";

    /* renamed from: z */
    public static final String f50989z = "PreferenceDialogFragment.negativeText";

    /* renamed from: a */
    public DialogPreference f50990a;

    /* renamed from: b */
    public CharSequence f50991b;

    /* renamed from: c */
    public CharSequence f50992c;

    /* renamed from: d */
    public CharSequence f50993d;

    /* renamed from: e */
    public CharSequence f50994e;
    @C0347i0

    /* renamed from: f */
    public int f50995f;

    /* renamed from: g */
    public BitmapDrawable f50996g;

    /* renamed from: v */
    public int f50997v;

    @C0376v0(30)
    /* renamed from: androidx.preference.j$a */
    public static class C19931a {
        @C0373u
        /* renamed from: a */
        public static void m92704a(@C0359n0 Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Deprecated
    /* renamed from: a */
    public DialogPreference mo59057a() {
        if (this.f50990a == null) {
            this.f50990a = (DialogPreference) ((DialogPreference.C19890a) getTargetFragment()).mo58761f0(getArguments().getString("key"));
        }
        return this.f50990a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public boolean mo59025b() {
        return false;
    }

    @Deprecated
    /* renamed from: c */
    public void mo59026c(@C0359n0 View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f50994e;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @C0363p0
    @Deprecated
    /* renamed from: d */
    public View mo59058d(@C0359n0 Context context) {
        int i = this.f50995f;
        if (i == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    @Deprecated
    /* renamed from: e */
    public abstract void mo59027e(boolean z);

    @Deprecated
    /* renamed from: f */
    public void mo59042f(@C0359n0 AlertDialog.Builder builder) {
    }

    /* renamed from: g */
    public final void mo59059g(@C0359n0 Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            C19931a.m92704a(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @Deprecated
    public void onClick(@C0359n0 DialogInterface dialogInterface, int i) {
        this.f50997v = i;
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.C19890a) {
            DialogPreference.C19890a aVar = (DialogPreference.C19890a) targetFragment;
            String string = getArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.mo58761f0(string);
                this.f50990a = dialogPreference;
                this.f50991b = dialogPreference.mo58748n3();
                this.f50992c = this.f50990a.mo58750p3();
                this.f50993d = this.f50990a.mo58749o3();
                this.f50994e = this.f50990a.mo58747m3();
                this.f50995f = this.f50990a.mo58746l3();
                Drawable k3 = this.f50990a.mo58745k3();
                if (k3 == null || (k3 instanceof BitmapDrawable)) {
                    this.f50996g = (BitmapDrawable) k3;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(k3.getIntrinsicWidth(), k3.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                k3.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                k3.draw(canvas);
                this.f50996g = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.f50991b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f50992c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f50993d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f50994e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f50995f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f50996g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @C0359n0
    public Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        Activity activity = getActivity();
        this.f50997v = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f50991b).setIcon(this.f50996g).setPositiveButton(this.f50992c, this).setNegativeButton(this.f50993d, this);
        View d = mo59058d(activity);
        if (d != null) {
            mo59026c(d);
            negativeButton.setView(d);
        } else {
            negativeButton.setMessage(this.f50994e);
        }
        mo59042f(negativeButton);
        AlertDialog create = negativeButton.create();
        if (mo59025b()) {
            mo59059g(create);
        }
        return create;
    }

    public void onDismiss(@C0359n0 DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.f50997v == -1) {
            z = true;
        } else {
            z = false;
        }
        mo59027e(z);
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f50991b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f50992c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f50993d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f50994e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f50995f);
        BitmapDrawable bitmapDrawable = this.f50996g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
