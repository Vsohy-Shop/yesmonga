package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1886l;
import androidx.core.p027os.C17772a;
import androidx.core.view.C18325o0;
import androidx.lifecycle.C19448n0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19512y;
import androidx.lifecycle.Lifecycle;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.app.q */
public class C17204q extends Activity implements C19499w, C18325o0.C18326a {

    /* renamed from: a */
    public C1886l<Class<? extends C17205a>, C17205a> f45457a = new C1886l<>();

    /* renamed from: b */
    public C19512y f45458b = new C19512y(this);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* renamed from: androidx.core.app.q$a */
    public static class C17205a {
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: M */
    public static boolean m79499M(@C0363p0 String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    return true;
                }
                return false;
            case 1:
            case 2:
                return C17772a.m81155k();
            case 3:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: J */
    public <T extends C17205a> T mo51641J(Class<T> cls) {
        return (C17205a) this.f45457a.get(cls);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: K */
    public void mo51642K(C17205a aVar) {
        this.f45457a.put(aVar.getClass(), aVar);
    }

    /* renamed from: L */
    public final boolean mo51643L(@C0363p0 String[] strArr) {
        return !m79499M(strArr);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C18325o0.m83026d(decorView, keyEvent)) {
            return C18325o0.m83027e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C18325o0.m83026d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @C0359n0
    public Lifecycle getLifecycle() {
        return this.f45458b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: n */
    public boolean mo1520n(@C0359n0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        C19448n0.m90743g(this);
    }

    @C0346i
    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        this.f45458b.mo57707n(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
