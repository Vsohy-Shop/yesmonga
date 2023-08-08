package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.C41114p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.j4 */
public final class C40575j4 extends Fragment implements C40587m {

    /* renamed from: d */
    public static final WeakHashMap f103467d = new WeakHashMap();

    /* renamed from: a */
    public final Map f103468a = Collections.synchronizedMap(new C1866a());

    /* renamed from: b */
    public int f103469b = 0;
    @C0363p0

    /* renamed from: c */
    public Bundle f103470c;

    /* renamed from: K0 */
    public static C40575j4 m165197K0(C19232h hVar) {
        C40575j4 j4Var;
        WeakHashMap weakHashMap = f103467d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(hVar);
        if (weakReference != null && (j4Var = (C40575j4) weakReference.get()) != null) {
            return j4Var;
        }
        try {
            C40575j4 j4Var2 = (C40575j4) hVar.mo57175g0().mo56903s0("SupportLifecycleFragmentImpl");
            if (j4Var2 == null || j4Var2.isRemoving()) {
                j4Var2 = new C40575j4();
                hVar.mo57175g0().mo56909u().mo57221k(j4Var2, "SupportLifecycleFragmentImpl").mo57053r();
            }
            weakHashMap.put(hVar, new WeakReference(j4Var2));
            return j4Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: U */
    public final boolean mo133926U() {
        return this.f103469b >= 2;
    }

    /* renamed from: b0 */
    public final boolean mo133927b0() {
        return this.f103469b > 0;
    }

    public final void dump(String str, @C0363p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @C0363p0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f103468a.values()) {
            a.mo133801a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @C0363p0
    /* renamed from: l0 */
    public final /* synthetic */ Activity mo133929l0() {
        return getActivity();
    }

    /* renamed from: o */
    public final void mo133930o(String str, @C0359n0 LifecycleCallback lifecycleCallback) {
        if (!this.f103468a.containsKey(str)) {
            this.f103468a.put(str, lifecycleCallback);
            if (this.f103469b > 0) {
                new C41114p(Looper.getMainLooper()).post(new C40569i4(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final void onActivityResult(int i, int i2, @C0363p0 Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback f : this.f103468a.values()) {
            f.mo133803f(i, i2, intent);
        }
    }

    public final void onCreate(@C0363p0 Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f103469b = 1;
        this.f103470c = bundle;
        for (Map.Entry entry : this.f103468a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo133804g(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f103469b = 5;
        for (LifecycleCallback h : this.f103468a.values()) {
            h.mo133805h();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f103469b = 3;
        for (LifecycleCallback i : this.f103468a.values()) {
            i.mo133806i();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f103468a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo133807j(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f103469b = 2;
        for (LifecycleCallback k : this.f103468a.values()) {
            k.mo133808k();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f103469b = 4;
        for (LifecycleCallback l : this.f103468a.values()) {
            l.mo87750l();
        }
    }

    @C0363p0
    /* renamed from: x */
    public final <T extends LifecycleCallback> T mo133938x(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f103468a.get(str));
    }
}
