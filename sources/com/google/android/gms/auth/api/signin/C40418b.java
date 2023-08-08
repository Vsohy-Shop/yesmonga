package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.b */
public final /* synthetic */ class C40418b implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C40418b f103037a = new C40418b();

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).mo133640M().compareTo(((Scope) obj2).mo133640M());
    }
}
