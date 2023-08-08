package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
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
import androidx.appcompat.app.C0467d;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;

/* renamed from: androidx.preference.k */
public abstract class C19932k extends C19215c implements DialogInterface.OnClickListener {

    /* renamed from: X */
    public static final String f50998X = "PreferenceDialogFragment.message";

    /* renamed from: Y */
    public static final String f50999Y = "PreferenceDialogFragment.layout";

    /* renamed from: Z */
    public static final String f51000Z = "PreferenceDialogFragment.icon";

    /* renamed from: w */
    public static final String f51001w = "key";

    /* renamed from: x */
    public static final String f51002x = "PreferenceDialogFragment.title";

    /* renamed from: y */
    public static final String f51003y = "PreferenceDialogFragment.positiveText";

    /* renamed from: z */
    public static final String f51004z = "PreferenceDialogFragment.negativeText";

    /* renamed from: a */
    public DialogPreference f51005a;

    /* renamed from: b */
    public CharSequence f51006b;

    /* renamed from: c */
    public CharSequence f51007c;

    /* renamed from: d */
    public CharSequence f51008d;

    /* renamed from: e */
    public CharSequence f51009e;
    @C0347i0

    /* renamed from: f */
    public int f51010f;

    /* renamed from: g */
    public BitmapDrawable f51011g;

    /* renamed from: v */
    public int f51012v;

    @C0376v0(30)
    /* renamed from: androidx.preference.k$a */
    public static class C19933a {
        @C0373u
        /* renamed from: a */
        public static void m92713a(@C0359n0 Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    /* renamed from: K0 */
    public DialogPreference mo59063K0() {
        if (this.f51005a == null) {
            this.f51005a = (DialogPreference) ((DialogPreference.C19890a) getTargetFragment()).mo58761f0(requireArguments().getString("key"));
        }
        return this.f51005a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: L0 */
    public boolean mo59031L0() {
        return false;
    }

    /* renamed from: M0 */
    public void mo59032M0(@C0359n0 View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f51009e;
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
    /* renamed from: N0 */
    public View mo59064N0(@C0359n0 Context context) {
        int i = this.f51010f;
        if (i == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i, (ViewGroup) null);
    }

    /* renamed from: O0 */
    public abstract void mo59033O0(boolean z);

    /* renamed from: P0 */
    public void mo59045P0(@C0359n0 C0467d.C0468a aVar) {
    }

    /* renamed from: Q0 */
    public final void mo59065Q0(@C0359n0 Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            C19933a.m92713a(window);
        } else {
            mo59034R0();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: R0 */
    public void mo59034R0() {
    }

    public void onClick(@C0359n0 DialogInterface dialogInterface, int i) {
        this.f51012v = i;
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.C19890a) {
            DialogPreference.C19890a aVar = (DialogPreference.C19890a) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.mo58761f0(string);
                this.f51005a = dialogPreference;
                this.f51006b = dialogPreference.mo58748n3();
                this.f51007c = this.f51005a.mo58750p3();
                this.f51008d = this.f51005a.mo58749o3();
                this.f51009e = this.f51005a.mo58747m3();
                this.f51010f = this.f51005a.mo58746l3();
                Drawable k3 = this.f51005a.mo58745k3();
                if (k3 == null || (k3 instanceof BitmapDrawable)) {
                    this.f51011g = (BitmapDrawable) k3;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(k3.getIntrinsicWidth(), k3.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                k3.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                k3.draw(canvas);
                this.f51011g = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.f51006b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f51007c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f51008d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f51009e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f51010f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f51011g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @C0359n0
    public Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        this.f51012v = -2;
        C0467d.C0468a s = new C0467d.C0468a(requireContext()).mo1398K(this.f51006b).mo1410h(this.f51011g).mo1390C(this.f51007c, this).mo1421s(this.f51008d, this);
        View N0 = mo59064N0(requireContext());
        if (N0 != null) {
            mo59032M0(N0);
            s.mo1400M(N0);
        } else {
            s.mo1416n(this.f51009e);
        }
        mo59045P0(s);
        C0467d a = s.mo1403a();
        if (mo59031L0()) {
            mo59065Q0(a);
        }
        return a;
    }

    public void onDismiss(@C0359n0 DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.f51012v == -1) {
            z = true;
        } else {
            z = false;
        }
        mo59033O0(z);
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f51006b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f51007c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f51008d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f51009e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f51010f);
        BitmapDrawable bitmapDrawable = this.f51011g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
